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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.Premium.PremiumGradient;

public final class GroupCreateSpan extends View {
    public final AvatarDrawable avatarDrawable;
    public final int[] colors;
    public final String countryIso2;
    public final ContactsController.Contact currentContact;
    public final Drawable deleteDrawable;
    public boolean deleting;
    public final boolean drawAvatarBackground;
    public final ImageReceiver imageReceiver;
    public final boolean isFlag;
    public final String key;
    public long lastUpdateTime;
    public final StaticLayout nameLayout;
    public float progress;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final boolean small;
    public final int textWidth;
    public final float textX;
    public final long uid;
    public static final TextPaint textPaint = new TextPaint(1);
    public static final Paint backPaint = new Paint(1);

    public GroupCreateSpan(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void cancelDeleteAnimation() {
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

    @Override
    public final void onDraw(Canvas canvas) {
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
        RectF rectF = this.rect;
        float measuredWidth = getMeasuredWidth();
        boolean z2 = this.small;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(z2 ? 28.0f : 32.0f));
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
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(z2 ? 14.0f : 16.0f), AndroidUtilities.dp(z2 ? 14.0f : 16.0f), paint);
        if (this.progress != 1.0f) {
            this.imageReceiver.draw(canvas);
        }
        if (this.progress != 0.0f) {
            int color = this.avatarDrawable.getColor();
            float fAlpha = Color.alpha(color) / 255.0f;
            paint.setColor(color);
            paint.setAlpha((int) (this.progress * 255.0f * fAlpha));
            canvas.drawCircle(AndroidUtilities.dp(z2 ? 14.0f : 16.0f), AndroidUtilities.dp(z2 ? 14.0f : 16.0f), AndroidUtilities.dp(z2 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.progress) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            int iDp = AndroidUtilities.dp(z2 ? 9.0f : 11.0f);
            int iDp2 = AndroidUtilities.dp(z2 ? 9.0f : 11.0f);
            int iDp3 = AndroidUtilities.dp(z2 ? 19.0f : 21.0f);
            int iDp4 = AndroidUtilities.dp(z2 ? 19.0f : 21.0f);
            Drawable drawable = this.deleteDrawable;
            drawable.setBounds(iDp, iDp2, iDp3, iDp4);
            drawable.setAlpha((int) (this.progress * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.textX + AndroidUtilities.dp((z2 ? 26 : 32) + 9), AndroidUtilities.dp(z2 ? 6.0f : 8.0f));
        int i8 = Theme.key_groupcreate_spanText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textPaint.setColor(ColorUtils.blendARGB(this.progress, Theme.getColor(i8, resourcesProvider), Theme.getColor(Theme.key_avatar_text, resourcesProvider)));
        this.nameLayout.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.nameLayout.getText());
        if (this.deleting) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.small;
        setMeasuredDimension(AndroidUtilities.dp((z ? 20 : 32) + 25) + this.textWidth, AndroidUtilities.dp(z ? 28.0f : 32.0f));
    }

    public final void startDeleteAnimation() {
        if (this.deleting) {
            return;
        }
        this.deleting = true;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public final void updateColors() {
        int color = this.avatarDrawable.getColor();
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iMultAlpha = Theme.multAlpha(0.05f, Theme.getColor(i, resourcesProvider));
        int color2 = Theme.getColor(Theme.key_groupcreate_spanDelete, resourcesProvider);
        int iRed = Color.red(iMultAlpha);
        int[] iArr = this.colors;
        iArr[0] = iRed;
        iArr[1] = Color.red(color);
        iArr[2] = Color.green(iMultAlpha);
        iArr[3] = Color.green(color);
        iArr[4] = Color.blue(iMultAlpha);
        iArr[5] = Color.blue(color);
        iArr[6] = Color.alpha(iMultAlpha);
        iArr[7] = Color.alpha(color);
        this.deleteDrawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
        backPaint.setColor(iMultAlpha);
    }

    public GroupCreateSpan(Context context, Object obj, ContactsController.Contact contact, boolean z, Theme.ResourcesProvider resourcesProvider) {
        boolean z2;
        String str;
        String str2;
        AvatarDrawable avatarDrawable;
        String string;
        ImageLocation forUserOrChat;
        TLRPC.User user;
        ImageReceiver imageReceiver;
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
        TextPaint textPaint2 = textPaint;
        textPaint2.setTextSize(AndroidUtilities.dp(z ? 13.0f : 14.0f));
        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.avatarDrawable = avatarDrawable2;
        int iDp = AndroidUtilities.dp(20.0f);
        TextPaint textPaint3 = avatarDrawable2.namePaint;
        textPaint3.setTextSize(iDp);
        boolean z3 = obj instanceof String;
        if (!z3) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) obj;
                z2 = z3;
                this.uid = user2.id;
                if (UserObject.isReplyUser(user2)) {
                    string = LocaleController.getString(R.string.RepliesTitle);
                    avatarDrawable2.scaleSize = 0.8f;
                    avatarDrawable2.setAvatarType(12);
                } else if (UserObject.isUserSelf(user2)) {
                    string = LocaleController.getString(R.string.SavedMessages);
                    avatarDrawable2.scaleSize = 0.8f;
                    avatarDrawable2.setAvatarType(1);
                } else {
                    avatarDrawable2.setInfo(UserConfig.selectedAccount, user2);
                    String firstName = UserObject.getFirstName(user2);
                    int iIndexOf = firstName.indexOf(32);
                    firstName = iIndexOf >= 0 ? firstName.substring(0, iIndexOf) : firstName;
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user2, 1);
                    user = user2;
                    string = firstName;
                    forUserOrChat = forUserOrChat2;
                }
            } else {
                z2 = z3;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String languageFlag = LocaleController.getLanguageFlag(tL_help_country.iso2);
                        String str3 = tL_help_country.default_name;
                        avatarDrawable2.setAvatarType(17);
                        textPaint3.setTextSize(AndroidUtilities.dp(24.0f));
                        str = "miniapps";
                        str2 = "premium";
                        avatarDrawable2.setInfo(0L, languageFlag, null, null, null);
                        int iMultAlpha = Theme.multAlpha(0.7f, Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
                        avatarDrawable2.hasGradient = false;
                        avatarDrawable2.hasAdvancedGradient = false;
                        avatarDrawable2.color2 = iMultAlpha;
                        avatarDrawable2.color = iMultAlpha;
                        avatarDrawable2.needApplyColorAccent = false;
                        this.drawAvatarBackground = false;
                        avatarDrawable2.drawAvatarBackground = false;
                        this.uid = tL_help_country.default_name.hashCode();
                        this.countryIso2 = tL_help_country.iso2;
                        string = str3;
                        avatarDrawable = avatarDrawable2;
                    } else {
                        str = "miniapps";
                        str2 = "premium";
                        avatarDrawable2.setInfo(contact.contact_id, contact.first_name, contact.last_name, null, null);
                        avatarDrawable = avatarDrawable2;
                        this.uid = contact.contact_id;
                        this.key = contact.key;
                        string = !TextUtils.isEmpty(contact.first_name) ? contact.first_name : contact.last_name;
                    }
                    forUserOrChat = null;
                    user = null;
                    imageReceiver = new ImageReceiver();
                    this.imageReceiver = imageReceiver;
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
                    imageReceiver.setParentView(this);
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
                    imageReceiver.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(z ? 28.0f : 32.0f));
                    if (AndroidUtilities.isTablet()) {
                        iM$2 = AndroidUtilities.dp(398 - (z ? 28 : 32)) / 2;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        iM$2 = OKLCH.m$2((z ? 28 : 32) + 132, Math.min(point.x, point.y), 2);
                    }
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint2.getFontMetricsInt(), false), textPaint2, iM$2, TextUtils.TruncateAt.END);
                    String str4 = str2;
                    staticLayout = new StaticLayout(charSequenceEllipsize, textPaint2, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.nameLayout = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.textWidth = (int) Math.ceil(staticLayout.getLineWidth(0));
                        this.textX = -staticLayout.getLineLeft(0);
                    }
                    if (!z2 && str4.equals((String) obj)) {
                        Context context2 = getContext();
                        int i = GroupCreateUserCell.$r8$clinit;
                        CombinedDrawable combinedDrawable = new CombinedDrawable(new TextCell.AnonymousClass2(new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient2, Theme.key_premiumGradient1, -1, -1, null), 2), context2.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
                        int iDp2 = AndroidUtilities.dp(18.0f);
                        int iDp3 = AndroidUtilities.dp(18.0f);
                        combinedDrawable.iconWidth = iDp2;
                        combinedDrawable.iconHeight = iDp3;
                        imageReceiver.setImageBitmap(combinedDrawable);
                    } else if (z2 || !str.equals((String) obj)) {
                        imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
                    } else {
                        getContext();
                        imageReceiver.setImageBitmap(GroupCreateUserCell.makeMiniAppsDrawable(true));
                    }
                    updateColors();
                    NotificationCenter.listenEmojiLoading(this);
                }
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                avatarDrawable2.setInfo(UserConfig.selectedAccount, chat);
                this.uid = -chat.id;
                string = chat.title;
                forUserOrChat = ImageLocation.getForUserOrChat(chat, 1);
                user = chat;
            }
            avatarDrawable = avatarDrawable2;
            str = "miniapps";
            str2 = "premium";
            imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            imageReceiver.setParentView(this);
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
            imageReceiver.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(z ? 28.0f : 32.0f));
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(398 - (z ? 28 : 32)) / 2;
            } else {
                Point point2 = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2((z ? 28 : 32) + 132, Math.min(point2.x, point2.y), 2);
            }
            CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint2.getFontMetricsInt(), false), textPaint2, iM$2, TextUtils.TruncateAt.END);
            String str5 = str2;
            staticLayout = new StaticLayout(charSequenceEllipsize2, textPaint2, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.nameLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.textWidth = (int) Math.ceil(staticLayout.getLineWidth(0));
                this.textX = -staticLayout.getLineLeft(0);
            }
            if (!z2) {
                if (z2) {
                    imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
                } else {
                    imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
                }
            } else if (z2) {
                imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
            } else {
                imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
            }
            updateColors();
            NotificationCenter.listenEmojiLoading(this);
        }
        String str6 = (String) obj;
        avatarDrawable2.scaleSize = 0.8f;
        switch (str6) {
            case "contacts":
                avatarDrawable2.setAvatarType(4);
                this.uid = Long.MIN_VALUE;
                string = LocaleController.getString(R.string.FilterContacts);
                break;
            case "non_contacts":
                avatarDrawable2.setAvatarType(5);
                this.uid = -9223372036854775807L;
                string = LocaleController.getString(R.string.FilterNonContacts);
                break;
            case "groups":
                avatarDrawable2.setAvatarType(6);
                this.uid = -9223372036854775806L;
                string = LocaleController.getString(R.string.FilterGroups);
                break;
            case "channels":
                avatarDrawable2.setAvatarType(7);
                this.uid = -9223372036854775805L;
                string = LocaleController.getString(R.string.FilterChannels);
                break;
            case "bots":
                avatarDrawable2.setAvatarType(8);
                this.uid = -9223372036854775804L;
                string = LocaleController.getString(R.string.FilterBots);
                break;
            case "muted":
                avatarDrawable2.setAvatarType(9);
                this.uid = -9223372036854775803L;
                string = LocaleController.getString(R.string.FilterMuted);
                break;
            case "read":
                avatarDrawable2.setAvatarType(10);
                this.uid = -9223372036854775802L;
                string = LocaleController.getString(R.string.FilterRead);
                break;
            case "existing_chats":
                avatarDrawable2.setAvatarType(23);
                this.uid = -9223372036854775800L;
                string = LocaleController.getString(R.string.FilterExistingChats);
                break;
            case "new_chats":
                avatarDrawable2.setAvatarType(24);
                this.uid = -9223372036854775799L;
                string = LocaleController.getString(R.string.FilterNewChats);
                break;
            case "premium":
                this.isFlag = true;
                int color = Theme.getColor(Theme.key_premiumGradientBackground2, resourcesProvider);
                avatarDrawable2.hasGradient = false;
                avatarDrawable2.hasAdvancedGradient = false;
                avatarDrawable2.color2 = color;
                avatarDrawable2.color = color;
                avatarDrawable2.needApplyColorAccent = false;
                string = LocaleController.getString(R.string.PrivacyPremium);
                break;
            case "miniapps":
                this.isFlag = true;
                avatarDrawable2.setColor(Theme.getColor(Theme.key_avatar_backgroundBlue, resourcesProvider), Theme.getColor(Theme.key_avatar_background2Blue, resourcesProvider));
                string = LocaleController.getString(R.string.PrivacyMiniapps);
                break;
            case "archived":
            default:
                avatarDrawable2.setAvatarType(11);
                this.uid = -9223372036854775801L;
                string = LocaleController.getString(R.string.FilterArchived);
                break;
        }
        z2 = z3;
        avatarDrawable = avatarDrawable2;
        str = "miniapps";
        str2 = "premium";
        forUserOrChat = null;
        user = null;
        imageReceiver = new ImageReceiver();
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver.setParentView(this);
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
        imageReceiver.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(z ? 28.0f : 32.0f));
        if (AndroidUtilities.isTablet()) {
            iM$2 = AndroidUtilities.dp(398 - (z ? 28 : 32)) / 2;
        } else {
            Point point3 = AndroidUtilities.displaySize;
            iM$2 = OKLCH.m$2((z ? 28 : 32) + 132, Math.min(point3.x, point3.y), 2);
        }
        CharSequence charSequenceEllipsize3 = TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint2.getFontMetricsInt(), false), textPaint2, iM$2, TextUtils.TruncateAt.END);
        String str7 = str2;
        staticLayout = new StaticLayout(charSequenceEllipsize3, textPaint2, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.nameLayout = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.textWidth = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.textX = -staticLayout.getLineLeft(0);
        }
        if (!z2) {
            if (z2) {
                imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
            } else {
                imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
            }
        } else if (z2) {
            imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
        } else {
            imageReceiver.setImage(forUserOrChat, "50_50", avatarDrawable, 0L, (String) null, user, 1);
        }
        updateColors();
        NotificationCenter.listenEmojiLoading(this);
    }
}
