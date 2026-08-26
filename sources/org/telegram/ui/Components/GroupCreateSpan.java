package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class GroupCreateSpan extends View {
    private AvatarDrawable avatarDrawable;
    private int[] colors;
    private String countryIso2;
    private ContactsController.Contact currentContact;
    private Drawable deleteDrawable;
    private boolean deleting;
    private boolean drawAvatarBackground;
    private ImageReceiver imageReceiver;
    public boolean isFlag;
    private String key;
    private long lastUpdateTime;
    private StaticLayout nameLayout;
    private float progress;
    private RectF rect;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean small;
    private int textWidth;
    private float textX;
    private long uid;
    private static TextPaint textPaint = new TextPaint(1);
    private static Paint backPaint = new Paint(1);

    public GroupCreateSpan(Context context, Object obj) {
        this(context, obj, null);
    }

    public void cancelDeleteAnimation() {
        if (this.deleting) {
            this.deleting = false;
            this.lastUpdateTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public ContactsController.Contact getContact() {
        return this.currentContact;
    }

    public String getCountryIso2() {
        return this.countryIso2;
    }

    public String getKey() {
        return this.key;
    }

    public long getUid() {
        return this.uid;
    }

    public boolean isDeleting() {
        return this.deleting;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z = this.deleting;
        if ((z && this.progress != 1.0f) || (!z && this.progress != 0.0f)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 17) {
                jCurrentTimeMillis = 17;
            }
            if (this.deleting) {
                float f = (jCurrentTimeMillis / 120.0f) + this.progress;
                this.progress = f;
                if (f >= 1.0f) {
                    this.progress = 1.0f;
                }
            } else {
                float f2 = this.progress - (jCurrentTimeMillis / 120.0f);
                this.progress = f2;
                if (f2 < 0.0f) {
                    this.progress = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(this.small ? 28.0f : 32.0f));
        Paint paint = backPaint;
        int[] iArr = this.colors;
        int i = iArr[6];
        float f3 = iArr[7] - i;
        float f4 = this.progress;
        int i2 = i + ((int) (f3 * f4));
        int i3 = iArr[0];
        int i4 = i3 + ((int) ((iArr[1] - i3) * f4));
        int i5 = iArr[2];
        int i6 = i5 + ((int) ((iArr[3] - i5) * f4));
        int i7 = iArr[4];
        paint.setColor(Color.argb(i2, i4, i6, i7 + ((int) ((iArr[5] - i7) * f4))));
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(this.small ? 14.0f : 16.0f), AndroidUtilities.dp(this.small ? 14.0f : 16.0f), backPaint);
        if (this.progress != 1.0f) {
            this.imageReceiver.draw(canvas);
        }
        if (this.progress != 0.0f) {
            int color = this.avatarDrawable.getColor();
            float fAlpha = Color.alpha(color) / 255.0f;
            backPaint.setColor(color);
            backPaint.setAlpha((int) (this.progress * 255.0f * fAlpha));
            canvas.drawCircle(AndroidUtilities.dp(this.small ? 14.0f : 16.0f), AndroidUtilities.dp(this.small ? 14.0f : 16.0f), AndroidUtilities.dp(this.small ? 14.0f : 16.0f), backPaint);
            canvas.save();
            canvas.rotate((1.0f - this.progress) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.deleteDrawable.setBounds(AndroidUtilities.dp(this.small ? 9.0f : 11.0f), AndroidUtilities.dp(this.small ? 9.0f : 11.0f), AndroidUtilities.dp(this.small ? 19.0f : 21.0f), AndroidUtilities.dp(this.small ? 19.0f : 21.0f));
            this.deleteDrawable.setAlpha((int) (this.progress * 255.0f));
            this.deleteDrawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.textX + AndroidUtilities.dp((this.small ? 26 : 32) + 9), AndroidUtilities.dp(this.small ? 6.0f : 8.0f));
        textPaint.setColor(ColorUtils.blendARGB(this.progress, Theme.getColor(Theme.key_groupcreate_spanText, this.resourcesProvider), Theme.getColor(Theme.key_avatar_text, this.resourcesProvider)));
        this.nameLayout.draw(canvas);
        canvas.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.nameLayout.getText());
        if (isDeleting()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp((this.small ? 20 : 32) + 25) + this.textWidth, AndroidUtilities.dp(this.small ? 28.0f : 32.0f));
    }

    public void startDeleteAnimation() {
        if (this.deleting) {
            return;
        }
        this.deleting = true;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public void updateColors() {
        int color = this.avatarDrawable.getColor();
        int iMultAlpha = Theme.multAlpha(0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        int color2 = Theme.getColor(Theme.key_groupcreate_spanDelete, this.resourcesProvider);
        this.colors[0] = Color.red(iMultAlpha);
        this.colors[1] = Color.red(color);
        this.colors[2] = Color.green(iMultAlpha);
        this.colors[3] = Color.green(color);
        this.colors[4] = Color.blue(iMultAlpha);
        this.colors[5] = Color.blue(color);
        this.colors[6] = Color.alpha(iMultAlpha);
        this.colors[7] = Color.alpha(color);
        this.deleteDrawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
        backPaint.setColor(iMultAlpha);
    }

    public GroupCreateSpan(Context context, ContactsController.Contact contact) {
        this(context, null, contact);
    }

    public GroupCreateSpan(Context context, Object obj, ContactsController.Contact contact) {
        this(context, obj, contact, null);
    }

    public GroupCreateSpan(Context context, Object obj, ContactsController.Contact contact, Theme.ResourcesProvider resourcesProvider) {
        this(context, obj, contact, false, resourcesProvider);
    }

    public GroupCreateSpan(Context context, Object obj, ContactsController.Contact contact, boolean z, Theme.ResourcesProvider resourcesProvider) {
        String string;
        String firstName;
        ImageLocation forUserOrChat;
        Object obj2;
        Object obj3;
        ImageLocation imageLocation;
        float fDp;
        float f;
        int iM$2;
        StaticLayout staticLayout;
        super(context);
        this.rect = new RectF();
        this.colors = new int[8];
        this.drawAvatarBackground = true;
        this.resourcesProvider = resourcesProvider;
        this.small = z;
        this.isFlag = false;
        this.currentContact = contact;
        this.deleteDrawable = getResources().getDrawable(R.drawable.delete);
        textPaint.setTextSize(AndroidUtilities.dp(z ? 13.0f : 14.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.dp(20.0f));
        boolean z2 = obj instanceof String;
        if (z2) {
            String str = (String) obj;
            this.avatarDrawable.setScaleSize(0.8f);
            switch (str) {
                case "contacts":
                    this.avatarDrawable.setAvatarType(4);
                    this.uid = Long.MIN_VALUE;
                    string = LocaleController.getString(R.string.FilterContacts);
                    break;
                case "non_contacts":
                    this.avatarDrawable.setAvatarType(5);
                    this.uid = -9223372036854775807L;
                    string = LocaleController.getString(R.string.FilterNonContacts);
                    break;
                case "groups":
                    this.avatarDrawable.setAvatarType(6);
                    this.uid = -9223372036854775806L;
                    string = LocaleController.getString(R.string.FilterGroups);
                    break;
                case "channels":
                    this.avatarDrawable.setAvatarType(7);
                    this.uid = -9223372036854775805L;
                    string = LocaleController.getString(R.string.FilterChannels);
                    break;
                case "bots":
                    this.avatarDrawable.setAvatarType(8);
                    this.uid = -9223372036854775804L;
                    string = LocaleController.getString(R.string.FilterBots);
                    break;
                case "muted":
                    this.avatarDrawable.setAvatarType(9);
                    this.uid = -9223372036854775803L;
                    string = LocaleController.getString(R.string.FilterMuted);
                    break;
                case "read":
                    this.avatarDrawable.setAvatarType(10);
                    this.uid = -9223372036854775802L;
                    string = LocaleController.getString(R.string.FilterRead);
                    break;
                case "existing_chats":
                    this.avatarDrawable.setAvatarType(23);
                    this.uid = -9223372036854775800L;
                    string = LocaleController.getString(R.string.FilterExistingChats);
                    break;
                case "new_chats":
                    this.avatarDrawable.setAvatarType(24);
                    this.uid = -9223372036854775799L;
                    string = LocaleController.getString(R.string.FilterNewChats);
                    break;
                case "premium":
                    this.isFlag = true;
                    this.avatarDrawable.setColor(Theme.getColor(Theme.key_premiumGradientBackground2, resourcesProvider));
                    string = LocaleController.getString(R.string.PrivacyPremium);
                    break;
                case "miniapps":
                    this.isFlag = true;
                    this.avatarDrawable.setColor(Theme.getColor(Theme.key_avatar_backgroundBlue, resourcesProvider), Theme.getColor(Theme.key_avatar_background2Blue, resourcesProvider));
                    string = LocaleController.getString(R.string.PrivacyMiniapps);
                    break;
                case "archived":
                default:
                    this.avatarDrawable.setAvatarType(11);
                    this.uid = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                    break;
            }
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.uid = user.id;
                if (UserObject.isReplyUser(user)) {
                    string = LocaleController.getString(R.string.RepliesTitle);
                    this.avatarDrawable.setScaleSize(0.8f);
                    this.avatarDrawable.setAvatarType(12);
                } else if (UserObject.isUserSelf(user)) {
                    string = LocaleController.getString(R.string.SavedMessages);
                    this.avatarDrawable.setScaleSize(0.8f);
                    this.avatarDrawable.setAvatarType(1);
                } else {
                    this.avatarDrawable.setInfo(user);
                    firstName = UserObject.getFirstName(user);
                    int iIndexOf = firstName.indexOf(32);
                    firstName = iIndexOf >= 0 ? firstName.substring(0, iIndexOf) : firstName;
                    forUserOrChat = ImageLocation.getForUserOrChat(user, 1);
                    obj2 = user;
                    obj3 = obj2;
                    string = firstName;
                    imageLocation = forUserOrChat;
                }
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                this.avatarDrawable.setInfo(chat);
                this.uid = -chat.id;
                firstName = chat.title;
                forUserOrChat = ImageLocation.getForUserOrChat(chat, 1);
                obj2 = chat;
                obj3 = obj2;
                string = firstName;
                imageLocation = forUserOrChat;
            } else if (obj instanceof TLRPC.TL_help_country) {
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                String languageFlag = LocaleController.getLanguageFlag(tL_help_country.iso2);
                String str2 = tL_help_country.default_name;
                this.avatarDrawable.setAvatarType(17);
                this.avatarDrawable.setTextSize(AndroidUtilities.dp(24.0f));
                this.avatarDrawable.setInfo(0L, languageFlag, null, null);
                this.avatarDrawable.setColor(Theme.multAlpha(0.7f, Theme.getColor(Theme.key_text_RedRegular, resourcesProvider)));
                AvatarDrawable avatarDrawable2 = this.avatarDrawable;
                this.drawAvatarBackground = false;
                avatarDrawable2.setDrawAvatarBackground(false);
                this.uid = tL_help_country.default_name.hashCode();
                this.countryIso2 = tL_help_country.iso2;
                string = str2;
            } else {
                this.avatarDrawable.setInfo(contact.contact_id, contact.first_name, contact.last_name);
                this.uid = contact.contact_id;
                this.key = contact.key;
                if (!TextUtils.isEmpty(contact.first_name)) {
                    string = contact.first_name;
                } else {
                    string = contact.last_name;
                }
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            this.imageReceiver.setParentView(this);
            ImageReceiver imageReceiver2 = this.imageReceiver;
            if (this.drawAvatarBackground) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(4.0f);
            }
            if (z) {
                f = 28.0f;
            } else {
                f = 32.0f;
            }
            imageReceiver2.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(z ? 28.0f : 32.0f));
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(398 - (z ? 28 : 32)) / 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2((z ? 28 : 32) + 132, Math.min(point.x, point.y), 2);
            }
            staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, iM$2, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.nameLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.textWidth = (int) Math.ceil(this.nameLayout.getLineWidth(0));
                this.textX = -this.nameLayout.getLineLeft(0);
            }
            if (z2 && "premium".equals((String) obj)) {
                ImageReceiver imageReceiver3 = this.imageReceiver;
                Context context2 = getContext();
                int i = GroupCreateUserCell.$r8$clinit;
                CombinedDrawable combinedDrawable = new CombinedDrawable(new TextCell.AnonymousClass2(new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient2, Theme.key_premiumGradient1, -1, -1, null), 3), context2.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
                combinedDrawable.setIconSize(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                imageReceiver3.setImageBitmap(combinedDrawable);
            } else if (!z2 && "miniapps".equals((String) obj)) {
                ImageReceiver imageReceiver4 = this.imageReceiver;
                getContext();
                int i2 = GroupCreateUserCell.$r8$clinit;
                AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                avatarDrawable3.setAvatarType(8);
                avatarDrawable3.setScaleSize(0.8f);
                avatarDrawable3.setColor(Theme.getColor(null, Theme.key_avatar_backgroundBlue, false), Theme.getColor(null, Theme.key_avatar_background2Blue, false));
                imageReceiver4.setImageBitmap(avatarDrawable3);
            } else {
                this.imageReceiver.setImage(imageLocation, "50_50", this.avatarDrawable, 0L, (String) null, obj3, 1);
            }
            updateColors();
            NotificationCenter.listenEmojiLoading(this);
        }
        imageLocation = null;
        obj3 = null;
        ImageReceiver imageReceiver5 = new ImageReceiver();
        this.imageReceiver = imageReceiver5;
        imageReceiver5.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.imageReceiver.setParentView(this);
        ImageReceiver imageReceiver6 = this.imageReceiver;
        if (this.drawAvatarBackground) {
            fDp = 0.0f;
        } else {
            fDp = AndroidUtilities.dp(4.0f);
        }
        if (z) {
            f = 28.0f;
        } else {
            f = 32.0f;
        }
        imageReceiver6.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(z ? 28.0f : 32.0f));
        if (AndroidUtilities.isTablet()) {
            iM$2 = AndroidUtilities.dp(398 - (z ? 28 : 32)) / 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            iM$2 = OKLCH.m$2((z ? 28 : 32) + 132, Math.min(point2.x, point2.y), 2);
        }
        staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, iM$2, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.nameLayout = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.textWidth = (int) Math.ceil(this.nameLayout.getLineWidth(0));
            this.textX = -this.nameLayout.getLineLeft(0);
        }
        if (z2) {
            if (!z2) {
                this.imageReceiver.setImage(imageLocation, "50_50", this.avatarDrawable, 0L, (String) null, obj3, 1);
            } else {
                this.imageReceiver.setImage(imageLocation, "50_50", this.avatarDrawable, 0L, (String) null, obj3, 1);
            }
        } else if (!z2) {
            this.imageReceiver.setImage(imageLocation, "50_50", this.avatarDrawable, 0L, (String) null, obj3, 1);
        } else {
            this.imageReceiver.setImage(imageLocation, "50_50", this.avatarDrawable, 0L, (String) null, obj3, 1);
        }
        updateColors();
        NotificationCenter.listenEmojiLoading(this);
    }
}
