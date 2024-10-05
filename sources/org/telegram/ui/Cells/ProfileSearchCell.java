package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Locale;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.StoriesUtilities;

public class ProfileSearchCell extends BaseCell implements NotificationCenter.NotificationCenterDelegate, Theme.Colorable {
    CanvasButton actionButton;
    private StaticLayout actionLayout;
    private int actionLeft;
    private AvatarDrawable avatarDrawable;
    public ImageReceiver avatarImage;
    public StoriesUtilities.AvatarStoryParams avatarStoryParams;
    private TLRPC$Chat chat;
    CheckBox2 checkBox;
    private ContactsController.Contact contact;
    private StaticLayout countLayout;
    private int countLeft;
    private int countTop;
    private int countWidth;
    private int currentAccount;
    private CharSequence currentName;
    private boolean customPaints;
    private long dialog_id;
    private boolean drawCheck;
    private boolean drawCount;
    private boolean drawNameLock;
    private boolean drawPremium;
    private TLRPC$EncryptedChat encryptedChat;
    private boolean[] isOnline;
    private TLRPC$FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private int lastUnreadCount;
    private Drawable lockDrawable;
    private StaticLayout nameLayout;
    private int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private TextPaint namePaint;
    private int nameTop;
    private int nameWidth;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private RectF rect;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean savedMessages;
    private boolean showPremiumBlocked;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private StaticLayout statusLayout;
    private int statusLeft;
    private TextPaint statusPaint;
    private CharSequence subLabel;
    private int sublabelOffsetX;
    private int sublabelOffsetY;
    public boolean useSeparator;
    private TLRPC$User user;

    public ProfileSearchCell(Context context) {
        this(context, null);
    }

    public ProfileSearchCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.countTop = AndroidUtilities.dp(19.0f);
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false);
        this.rect = new RectF();
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.avatarDrawable = new AvatarDrawable();
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(3);
        addView(this.checkBox);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(20.0f));
        this.statusDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.setCallback(this);
    }

    public void lambda$buildLayout$0() {
        if (!(getParent() instanceof RecyclerListView)) {
            callOnClick();
        } else {
            RecyclerListView recyclerListView = (RecyclerListView) getParent();
            recyclerListView.getOnItemClickListener().onItemClick(this, recyclerListView.getChildAdapterPosition(this));
        }
    }

    public void buildLayout() {
        TextPaint textPaint;
        int measuredWidth;
        float f;
        CharSequence charSequence;
        int i;
        TLRPC$UserStatus tLRPC$UserStatus;
        int i2;
        double d;
        TextPaint textPaint2;
        int i3;
        int i4;
        int i5;
        String str;
        int dialogUnreadCount;
        TextPaint textPaint3;
        int i6;
        String str2;
        String str3;
        String userName;
        int dp;
        this.drawNameLock = false;
        this.drawCheck = false;
        this.drawPremium = false;
        if (this.encryptedChat != null) {
            this.drawNameLock = true;
            this.dialog_id = DialogObject.makeEncryptedDialogId(r2.id);
            if (LocaleController.isRTL) {
                this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                dp = AndroidUtilities.dp(11.0f);
            } else {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                dp = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
            }
            this.nameLeft = dp;
            this.nameLockTop = AndroidUtilities.dp(22.0f);
            updateStatus(false, null, null, false);
        } else {
            TLRPC$Chat tLRPC$Chat = this.chat;
            if (tLRPC$Chat != null) {
                this.dialog_id = -tLRPC$Chat.id;
                this.drawCheck = tLRPC$Chat.verified;
                this.nameLeft = !LocaleController.isRTL ? AndroidUtilities.dp(AndroidUtilities.leftBaseline) : AndroidUtilities.dp(11.0f);
                updateStatus(this.drawCheck, null, this.chat, false);
            } else {
                TLRPC$User tLRPC$User = this.user;
                if (tLRPC$User != null) {
                    this.dialog_id = tLRPC$User.id;
                    this.nameLeft = !LocaleController.isRTL ? AndroidUtilities.dp(AndroidUtilities.leftBaseline) : AndroidUtilities.dp(11.0f);
                    this.nameLockTop = AndroidUtilities.dp(21.0f);
                    this.drawCheck = this.user.verified;
                    this.drawPremium = !this.savedMessages && MessagesController.getInstance(this.currentAccount).isPremiumUser(this.user);
                    updateStatus(this.drawCheck, this.user, null, false);
                } else if (this.contact != null) {
                    this.dialog_id = 0L;
                    this.nameLeft = !LocaleController.isRTL ? AndroidUtilities.dp(AndroidUtilities.leftBaseline) : AndroidUtilities.dp(11.0f);
                    if (this.actionButton == null) {
                        CanvasButton canvasButton = new CanvasButton(this);
                        this.actionButton = canvasButton;
                        canvasButton.setDelegate(new Runnable() {
                            @Override
                            public final void run() {
                                ProfileSearchCell.this.lambda$buildLayout$0();
                            }
                        });
                    }
                }
            }
        }
        this.statusLeft = !LocaleController.isRTL ? AndroidUtilities.dp(AndroidUtilities.leftBaseline) : AndroidUtilities.dp(11.0f);
        CharSequence charSequence2 = this.currentName;
        if (charSequence2 == null) {
            TLRPC$Chat tLRPC$Chat2 = this.chat;
            if (tLRPC$Chat2 != null) {
                userName = tLRPC$Chat2.title;
            } else {
                TLRPC$User tLRPC$User2 = this.user;
                if (tLRPC$User2 != null) {
                    userName = UserObject.getUserName(tLRPC$User2);
                } else {
                    str3 = "";
                    charSequence2 = str3.replace('\n', ' ');
                }
            }
            str3 = AndroidUtilities.removeDiacritics(userName);
            charSequence2 = str3.replace('\n', ' ');
        }
        if (charSequence2.length() == 0) {
            TLRPC$User tLRPC$User3 = this.user;
            if (tLRPC$User3 == null || (str2 = tLRPC$User3.phone) == null || str2.length() == 0) {
                charSequence2 = LocaleController.getString(R.string.HiddenName);
            } else {
                charSequence2 = PhoneFormat.getInstance().format("+" + this.user.phone);
            }
        }
        if (this.customPaints) {
            if (this.namePaint == null) {
                TextPaint textPaint4 = new TextPaint(1);
                this.namePaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.bold());
            }
            this.namePaint.setTextSize(AndroidUtilities.dp(16.0f));
            if (this.encryptedChat != null) {
                textPaint3 = this.namePaint;
                i6 = Theme.key_chats_secretName;
            } else {
                textPaint3 = this.namePaint;
                i6 = Theme.key_chats_name;
            }
            textPaint3.setColor(Theme.getColor(i6, this.resourcesProvider));
            textPaint = this.namePaint;
        } else {
            textPaint = this.encryptedChat != null ? Theme.dialogs_searchNameEncryptedPaint : Theme.dialogs_searchNamePaint;
        }
        TextPaint textPaint5 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            f = AndroidUtilities.leftBaseline;
        } else {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            f = 14.0f;
        }
        int dp2 = measuredWidth - AndroidUtilities.dp(f);
        this.nameWidth = dp2;
        if (this.drawNameLock) {
            this.nameWidth -= AndroidUtilities.dp(6.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (this.contact != null) {
            TextPaint textPaint6 = Theme.dialogs_countTextPaint;
            int i7 = R.string.Invite;
            int measureText = (int) (textPaint6.measureText(LocaleController.getString(i7)) + 1.0f);
            this.actionLayout = new StaticLayout(LocaleController.getString(i7), Theme.dialogs_countTextPaint, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.actionLeft = AndroidUtilities.dp(19.0f) + AndroidUtilities.dp(16.0f);
                this.nameLeft += measureText;
                this.statusLeft += measureText;
            } else {
                this.actionLeft = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.nameWidth -= AndroidUtilities.dp(32.0f) + measureText;
        }
        this.nameWidth -= getPaddingLeft() + getPaddingRight();
        int paddingLeft = dp2 - (getPaddingLeft() + getPaddingRight());
        if (!this.drawCount || (dialogUnreadCount = MessagesController.getInstance(this.currentAccount).getDialogUnreadCount((TLRPC$Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialog_id))) == 0) {
            this.lastUnreadCount = 0;
            this.countLayout = null;
        } else {
            this.lastUnreadCount = dialogUnreadCount;
            String format = String.format(Locale.US, "%d", Integer.valueOf(dialogUnreadCount));
            this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format)));
            this.countLayout = new StaticLayout(format, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            int dp3 = this.countWidth + AndroidUtilities.dp(18.0f);
            this.nameWidth -= dp3;
            paddingLeft -= dp3;
            if (LocaleController.isRTL) {
                this.countLeft = AndroidUtilities.dp(19.0f);
                this.nameLeft += dp3;
                this.statusLeft += dp3;
            } else {
                this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.dp(19.0f);
            }
        }
        if (this.nameWidth < 0) {
            this.nameWidth = 0;
        }
        float dp4 = this.nameWidth - AndroidUtilities.dp(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textPaint5, dp4, truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint5.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
        }
        int i8 = this.nameWidth;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.nameLayout = new StaticLayout(ellipsize, textPaint5, i8, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint7 = Theme.dialogs_offlinePaint;
        TLRPC$Chat tLRPC$Chat3 = this.chat;
        if (tLRPC$Chat3 == null || this.subLabel != null) {
            charSequence = this.subLabel;
            if (charSequence == null) {
                TLRPC$User tLRPC$User4 = this.user;
                if (tLRPC$User4 != null) {
                    if (MessagesController.isSupportUser(tLRPC$User4)) {
                        i = R.string.SupportStatus;
                    } else {
                        TLRPC$User tLRPC$User5 = this.user;
                        boolean z = tLRPC$User5.bot;
                        if (z && (i2 = tLRPC$User5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsers", i2);
                        } else if (z) {
                            i = R.string.Bot;
                        } else if (UserObject.isService(tLRPC$User5.id)) {
                            i = R.string.ServiceNotifications;
                        } else {
                            if (this.isOnline == null) {
                                this.isOnline = new boolean[1];
                            }
                            boolean[] zArr = this.isOnline;
                            zArr[0] = false;
                            charSequence = LocaleController.formatUserStatus(this.currentAccount, this.user, zArr);
                            if (this.isOnline[0]) {
                                textPaint7 = Theme.dialogs_onlinePaint;
                            }
                            TLRPC$User tLRPC$User6 = this.user;
                            if (tLRPC$User6 != null && (tLRPC$User6.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || ((tLRPC$UserStatus = this.user.status) != null && tLRPC$UserStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()))) {
                                textPaint7 = Theme.dialogs_onlinePaint;
                                i = R.string.Online;
                            }
                        }
                    }
                    charSequence = LocaleController.getString(i);
                } else {
                    charSequence = null;
                }
            }
            if (this.savedMessages || UserObject.isReplyUser(this.user)) {
                this.nameTop = AndroidUtilities.dp(20.0f);
                charSequence = null;
            }
        } else {
            if (ChatObject.isChannel(tLRPC$Chat3)) {
                TLRPC$Chat tLRPC$Chat4 = this.chat;
                if (!tLRPC$Chat4.megagroup) {
                    i4 = tLRPC$Chat4.participants_count;
                    if (i4 != 0) {
                        str = "Subscribers";
                        charSequence = LocaleController.formatPluralStringComma(str, i4);
                        this.nameTop = AndroidUtilities.dp(19.0f);
                    } else {
                        i5 = !ChatObject.isPublic(tLRPC$Chat4) ? R.string.ChannelPrivate : R.string.ChannelPublic;
                        charSequence = LocaleController.getString(i5).toLowerCase();
                        this.nameTop = AndroidUtilities.dp(19.0f);
                    }
                }
            }
            TLRPC$Chat tLRPC$Chat5 = this.chat;
            i4 = tLRPC$Chat5.participants_count;
            if (i4 != 0) {
                str = "Members";
                charSequence = LocaleController.formatPluralStringComma(str, i4);
                this.nameTop = AndroidUtilities.dp(19.0f);
            } else if (tLRPC$Chat5.has_geo) {
                charSequence = LocaleController.getString(R.string.MegaLocation);
                this.nameTop = AndroidUtilities.dp(19.0f);
            } else {
                i5 = !ChatObject.isPublic(tLRPC$Chat5) ? R.string.MegaPrivate : R.string.MegaPublic;
                charSequence = LocaleController.getString(i5).toLowerCase();
                this.nameTop = AndroidUtilities.dp(19.0f);
            }
        }
        if (this.customPaints) {
            if (this.statusPaint == null) {
                this.statusPaint = new TextPaint(1);
            }
            this.statusPaint.setTextSize(AndroidUtilities.dp(15.0f));
            if (textPaint7 == Theme.dialogs_offlinePaint) {
                textPaint2 = this.statusPaint;
                i3 = Theme.key_windowBackgroundWhiteGrayText3;
            } else {
                if (textPaint7 == Theme.dialogs_onlinePaint) {
                    textPaint2 = this.statusPaint;
                    i3 = Theme.key_windowBackgroundWhiteBlueText3;
                }
                textPaint7 = this.statusPaint;
            }
            textPaint2.setColor(Theme.getColor(i3, this.resourcesProvider));
            textPaint7 = this.statusPaint;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.nameTop = AndroidUtilities.dp(20.0f);
            this.statusLayout = null;
        } else {
            this.statusLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint7, paddingLeft - AndroidUtilities.dp(12.0f), truncateAt), textPaint7, paddingLeft, alignment, 1.0f, 0.0f, false);
            this.nameTop = AndroidUtilities.dp(9.0f);
            this.nameLockTop -= AndroidUtilities.dp(10.0f);
        }
        this.avatarStoryParams.originalAvatarRect.set(LocaleController.isRTL ? (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight() : AndroidUtilities.dp(11.0f) + getPaddingLeft(), AndroidUtilities.dp(7.0f), r2 + AndroidUtilities.dp(46.0f), AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(46.0f));
        if (LocaleController.isRTL) {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.nameLayout.getLineWidth(0));
                double d2 = this.nameWidth;
                if (ceil < d2) {
                    double d3 = this.nameLeft;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    this.nameLeft = (int) (d3 + (d2 - ceil));
                }
            }
            StaticLayout staticLayout = this.statusLayout;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.statusLayout.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d4 = paddingLeft;
                if (ceil2 < d4) {
                    double d5 = this.statusLeft;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    d = d5 + (d4 - ceil2);
                    this.statusLeft = (int) d;
                }
            }
        } else {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineRight(0) == this.nameWidth) {
                double ceil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                double d6 = this.nameWidth;
                if (ceil3 < d6) {
                    double d7 = this.nameLeft;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    this.nameLeft = (int) (d7 - (d6 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.statusLayout;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.statusLayout.getLineRight(0) == paddingLeft) {
                double ceil4 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d8 = paddingLeft;
                if (ceil4 < d8) {
                    double d9 = this.statusLeft;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    d = d9 - (d8 - ceil4);
                    this.statusLeft = (int) d;
                }
            }
        }
        this.nameLeft += getPaddingLeft();
        this.statusLeft += getPaddingLeft();
        this.nameLockLeft += getPaddingLeft();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ContactsController.Contact contact;
        if (i != NotificationCenter.emojiLoaded) {
            if (i != NotificationCenter.userIsPremiumBlockedUpadted) {
                return;
            }
            boolean z = this.premiumBlocked;
            boolean z2 = this.showPremiumBlocked && ((this.user != null && MessagesController.getInstance(this.currentAccount).isUserPremiumBlocked(this.user.id)) || !((contact = this.contact) == null || contact.user == null || !MessagesController.getInstance(this.currentAccount).isUserPremiumBlocked(this.contact.user.id)));
            this.premiumBlocked = z2;
            if (z2 == z) {
                return;
            }
        }
        invalidate();
    }

    public TLRPC$Chat getChat() {
        return this.chat;
    }

    public long getDialogId() {
        return this.dialog_id;
    }

    public TLRPC$User getUser() {
        return this.user;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.showPremiumBlocked) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.statusDrawable.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.showPremiumBlocked) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.statusDrawable.detach();
    }

    @Override
    protected void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ProfileSearchCell.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.nameLayout;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.drawCheck) {
            sb.append(", ");
            sb.append(LocaleController.getString(R.string.AccDescrVerified));
            sb.append("\n");
        }
        if (this.statusLayout != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.statusLayout.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.user == null && this.chat == null && this.encryptedChat == null && this.contact == null) {
            return;
        }
        if (this.checkBox != null) {
            int dp = LocaleController.isRTL ? (i3 - i) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(36.0f);
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.layout(dp, dp2, checkBox2.getMeasuredWidth() + dp, this.checkBox.getMeasuredHeight() + dp2);
        }
        if (z) {
            buildLayout();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(60.0f) + (this.useSeparator ? 1 : 0));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.user == null && this.chat == null) && this.avatarStoryParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        CanvasButton canvasButton = this.actionButton;
        if (canvasButton == null || !canvasButton.checkTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        checkBox2.setChecked(z, z2);
    }

    public void setData(java.lang.Object r4, org.telegram.tgnet.TLRPC$EncryptedChat r5, java.lang.CharSequence r6, java.lang.CharSequence r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ProfileSearchCell.setData(java.lang.Object, org.telegram.tgnet.TLRPC$EncryptedChat, java.lang.CharSequence, java.lang.CharSequence, boolean, boolean):void");
    }

    public void setSublabelOffset(int i, int i2) {
        this.sublabelOffsetX = i;
        this.sublabelOffsetY = i2;
    }

    public ProfileSearchCell showPremiumBlock(boolean z) {
        this.showPremiumBlocked = z;
        return this;
    }

    public void update(int i) {
        Drawable drawable;
        String str;
        TLRPC$Dialog tLRPC$Dialog;
        String str2;
        TLRPC$User tLRPC$User;
        TLRPC$User tLRPC$User2;
        TLRPC$FileLocation tLRPC$FileLocation;
        Drawable drawable2;
        TLRPC$User tLRPC$User3 = this.user;
        TLRPC$FileLocation tLRPC$FileLocation2 = null;
        if (tLRPC$User3 != null) {
            this.avatarDrawable.setInfo(this.currentAccount, tLRPC$User3);
            if (UserObject.isReplyUser(this.user)) {
                this.avatarDrawable.setAvatarType(12);
            } else if (this.savedMessages) {
                this.avatarDrawable.setAvatarType(1);
            } else {
                Drawable drawable3 = this.avatarDrawable;
                TLRPC$User tLRPC$User4 = this.user;
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User4.photo;
                if (tLRPC$UserProfilePhoto != null) {
                    tLRPC$FileLocation2 = tLRPC$UserProfilePhoto.photo_small;
                    Drawable drawable4 = tLRPC$UserProfilePhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable2 = drawable4;
                        this.avatarImage.setImage(ImageLocation.getForUserOrChat(tLRPC$User4, 1), "50_50", ImageLocation.getForUserOrChat(this.user, 2), "50_50", drawable2, this.user, 0);
                    }
                }
                drawable2 = drawable3;
                this.avatarImage.setImage(ImageLocation.getForUserOrChat(tLRPC$User4, 1), "50_50", ImageLocation.getForUserOrChat(this.user, 2), "50_50", drawable2, this.user, 0);
            }
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
        } else {
            TLRPC$Chat tLRPC$Chat = this.chat;
            if (tLRPC$Chat != null) {
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                TLRPC$ChatPhoto tLRPC$ChatPhoto = tLRPC$Chat.photo;
                if (tLRPC$ChatPhoto != null) {
                    tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_small;
                    Drawable drawable5 = tLRPC$ChatPhoto.strippedBitmap;
                    if (drawable5 != null) {
                        drawable = drawable5;
                        avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
                        this.avatarImage.setImage(ImageLocation.getForUserOrChat(this.chat, 1), "50_50", ImageLocation.getForUserOrChat(this.chat, 2), "50_50", drawable, this.chat, 0);
                    }
                }
                drawable = avatarDrawable;
                avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
                this.avatarImage.setImage(ImageLocation.getForUserOrChat(this.chat, 1), "50_50", ImageLocation.getForUserOrChat(this.chat, 2), "50_50", drawable, this.chat, 0);
            } else {
                ContactsController.Contact contact = this.contact;
                if (contact != null) {
                    this.avatarDrawable.setInfo(0L, contact.first_name, contact.last_name);
                } else {
                    this.avatarDrawable.setInfo(0L, null, null);
                }
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
            }
        }
        ImageReceiver imageReceiver = this.avatarImage;
        TLRPC$Chat tLRPC$Chat2 = this.chat;
        imageReceiver.setRoundRadius(AndroidUtilities.dp((tLRPC$Chat2 == null || !tLRPC$Chat2.forum) ? 23.0f : 16.0f));
        if (i != 0) {
            boolean z = !(((MessagesController.UPDATE_MASK_AVATAR & i) == 0 || this.user == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i) == 0 || this.chat == null)) && (((tLRPC$FileLocation = this.lastAvatar) != null && tLRPC$FileLocation2 == null) || ((tLRPC$FileLocation == null && tLRPC$FileLocation2 != null) || !(tLRPC$FileLocation == null || (tLRPC$FileLocation.volume_id == tLRPC$FileLocation2.volume_id && tLRPC$FileLocation.local_id == tLRPC$FileLocation2.local_id))));
            if (!z && (MessagesController.UPDATE_MASK_STATUS & i) != 0 && (tLRPC$User2 = this.user) != null) {
                TLRPC$UserStatus tLRPC$UserStatus = tLRPC$User2.status;
                if ((tLRPC$UserStatus != null ? tLRPC$UserStatus.expires : 0) != this.lastStatus) {
                    z = true;
                }
            }
            if (!z && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i) != 0 && ((tLRPC$User = this.user) != null || this.chat != null)) {
                updateStatus(tLRPC$User != null ? tLRPC$User.verified : this.chat.verified, tLRPC$User, this.chat, true);
            }
            if ((!z && (MessagesController.UPDATE_MASK_NAME & i) != 0 && this.user != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i) != 0 && this.chat != null)) {
                if (this.user != null) {
                    str2 = this.user.first_name + this.user.last_name;
                } else {
                    str2 = this.chat.title;
                }
                if (!str2.equals(this.lastName)) {
                    z = true;
                }
            }
            if (!((z || !this.drawCount || (i & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (tLRPC$Dialog = (TLRPC$Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialog_id)) == null || MessagesController.getInstance(this.currentAccount).getDialogUnreadCount(tLRPC$Dialog) == this.lastUnreadCount) ? z : true)) {
                return;
            }
        }
        TLRPC$User tLRPC$User5 = this.user;
        if (tLRPC$User5 == null) {
            TLRPC$Chat tLRPC$Chat3 = this.chat;
            if (tLRPC$Chat3 != null) {
                str = tLRPC$Chat3.title;
            }
            this.lastAvatar = tLRPC$FileLocation2;
            if (getMeasuredWidth() == 0 || getMeasuredHeight() != 0) {
                buildLayout();
            } else {
                requestLayout();
            }
            postInvalidate();
        }
        TLRPC$UserStatus tLRPC$UserStatus2 = tLRPC$User5.status;
        if (tLRPC$UserStatus2 != null) {
            this.lastStatus = tLRPC$UserStatus2.expires;
        } else {
            this.lastStatus = 0;
        }
        str = this.user.first_name + this.user.last_name;
        this.lastName = str;
        this.lastAvatar = tLRPC$FileLocation2;
        if (getMeasuredWidth() == 0) {
        }
        buildLayout();
        postInvalidate();
    }

    @Override
    public void updateColors() {
        if (this.nameLayout == null || getMeasuredWidth() <= 0) {
            return;
        }
        buildLayout();
    }

    public void updateStatus(boolean z, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z2) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        TLRPC$EmojiStatus tLRPC$EmojiStatus;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
        swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
        if (z) {
            swapAnimatedEmojiDrawable2.set(new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable, 0, 0), z2);
            this.statusDrawable.setColor(null);
            return;
        }
        if (tLRPC$User != null && !this.savedMessages && DialogObject.getEmojiStatusDocumentId(tLRPC$User.emoji_status) != 0) {
            swapAnimatedEmojiDrawable = this.statusDrawable;
            tLRPC$EmojiStatus = tLRPC$User.emoji_status;
        } else {
            if (tLRPC$Chat == null || this.savedMessages || DialogObject.getEmojiStatusDocumentId(tLRPC$Chat.emoji_status) == 0) {
                if (tLRPC$User == null || this.savedMessages || !MessagesController.getInstance(this.currentAccount).isPremiumUser(tLRPC$User)) {
                    this.statusDrawable.set((Drawable) null, z2);
                } else {
                    this.statusDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z2);
                }
                this.statusDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
            }
            swapAnimatedEmojiDrawable = this.statusDrawable;
            tLRPC$EmojiStatus = tLRPC$Chat.emoji_status;
        }
        swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(tLRPC$EmojiStatus), z2);
        this.statusDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
    }

    public ProfileSearchCell useCustomPaints() {
        this.customPaints = true;
        return this;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.statusDrawable == drawable || super.verifyDrawable(drawable);
    }
}
