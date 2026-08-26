package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.PhotoBubbleClip;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Text;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.Stories.StoriesUtilities;

public final class ProfileSearchCell extends BaseCell implements NotificationCenter.NotificationCenterDelegate, Theme.Colorable {
    public CanvasButton actionButton;
    public StaticLayout actionLayout;
    public int actionLeft;
    public TLRPC.TL_sponsoredPeer ad;
    public Paint adBackgroundPaint;
    public final ButtonBounce adBounce;
    public final RectF adBounds;
    public Text adText;
    public boolean allowBotOpenButton;
    public boolean allowEmojiStatus;
    public final AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImage;
    public final StoriesUtilities.AvatarStoryParams avatarStoryParams;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationDrawable;
    public PhotoBubbleClip bubbleClip;
    public boolean callCellStyle;
    public TLRPC.Chat chat;
    public final CheckBox2 checkBox;
    public ContactsController.Contact contact;
    public StaticLayout countLayout;
    public int countLeft;
    public final int countTop;
    public int countWidth;
    public final int currentAccount;
    public CharSequence currentName;
    public boolean customPaints;
    public long dialog_id;
    public boolean dontDrawAvatar;
    public boolean drawCheck;
    public boolean drawCount;
    public boolean drawNameLock;
    public TLRPC.EncryptedChat encryptedChat;
    public boolean[] isOnline;
    public TLRPC.FileLocation lastAvatar;
    public String lastName;
    public int lastStatus;
    public int lastUnreadCount;
    public Drawable lockDrawable;
    public StaticLayout nameLayout;
    public int nameLeft;
    public int nameLockLeft;
    public int nameLockTop;
    public TextPaint namePaint;
    public int nameTop;
    public int nameWidth;
    public Utilities.Callback onOpenButtonClick;
    public Utilities.Callback2 onSponsoredOptionsClick;
    public boolean openBot;
    public final Paint openButtonBackgroundPaint;
    public final ButtonBounce openButtonBounce;
    public final RectF openButtonRect;
    public Text openButtonText;
    public boolean premiumBlocked;
    public final AnimatedFloat premiumBlockedT;
    public PremiumGradient.PremiumGradientTools premiumGradient;
    public final RectF rect;
    public boolean rectangularAvatar;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean savedMessages;
    public boolean showPremiumBlocked;
    public long starsPriceBlocked;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    public StaticLayout statusLayout;
    public int statusLeft;
    public TextPaint statusPaint;
    public CharSequence subLabel;
    public int sublabelOffsetX;
    public int sublabelOffsetY;
    public boolean useSeparator;
    public TLRPC.User user;

    public ProfileSearchCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.countTop = AndroidUtilities.dp(19.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false, null);
        this.adBounds = new RectF();
        this.adBounce = new ButtonBounce(this);
        this.rect = new RectF();
        this.allowEmojiStatus = true;
        this.openButtonBounce = new ButtonBounce(this);
        this.openButtonBackgroundPaint = new Paint(1);
        this.openButtonRect = new RectF();
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.avatarDrawable = new AvatarDrawable();
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(3);
        addView(checkBox2);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(20.0f));
        this.botVerificationDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.setCallback(this);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(20.0f));
        this.statusDrawable = swapAnimatedEmojiDrawable2;
        swapAnimatedEmojiDrawable2.setCallback(this);
    }

    public final void buildLayout() {
        TLRPC.Chat chat;
        TLRPC.User user;
        TextPaint textPaint;
        int measuredWidth;
        CharSequence userStatus;
        TLRPC.UserStatus userStatus2;
        int i;
        float f;
        int iDp;
        float f2;
        this.drawNameLock = false;
        this.drawCheck = false;
        TLRPC.EncryptedChat encryptedChat = this.encryptedChat;
        int i2 = this.currentAccount;
        if (encryptedChat != null) {
            this.drawNameLock = true;
            this.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            if (LocaleController.isRTL) {
                this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                this.nameLeft = AndroidUtilities.dp(11.0f);
            } else {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = Theme.dialogs_lockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            }
            this.nameLockTop = AndroidUtilities.dp(22.0f);
            updateStatus(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.chat;
            if (chat2 != null) {
                this.dialog_id = -chat2.id;
                this.drawCheck = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i2).getChat(Long.valueOf(this.chat.linked_monoforum_id))) != null) {
                    this.drawCheck = chat.verified;
                }
                if (LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(11.0f);
                } else {
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                updateStatus(this.drawCheck, null, this.chat, false);
            } else {
                TLRPC.User user2 = this.user;
                if (user2 != null) {
                    this.dialog_id = user2.id;
                    if (LocaleController.isRTL) {
                        this.nameLeft = AndroidUtilities.dp(11.0f);
                    } else {
                        this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    this.nameLockTop = AndroidUtilities.dp(21.0f);
                    this.drawCheck = this.user.verified;
                    if (!this.savedMessages) {
                        MessagesController.getInstance(i2).isPremiumUser(this.user);
                    }
                    updateStatus(this.drawCheck, this.user, null, false);
                } else if (this.contact != null) {
                    this.dialog_id = 0L;
                    if (LocaleController.isRTL) {
                        this.nameLeft = AndroidUtilities.dp(11.0f);
                    } else {
                        this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    if (this.actionButton == null) {
                        CanvasButton canvasButton = new CanvasButton(this);
                        this.actionButton = canvasButton;
                        canvasButton.setDelegate(new ChatbotSheet$$ExternalSyntheticLambda0(this, 10));
                    }
                }
            }
        }
        if (LocaleController.isRTL) {
            this.statusLeft = AndroidUtilities.dp(11.0f);
        } else {
            this.statusLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        if (this.ad != null) {
            if (this.adText == null) {
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ic_ab_other);
                coloredImageSpan.setScale(0.55f, 0.55f);
                coloredImageSpan.spaceScaleX = 0.7f;
                coloredImageSpan.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                spannableStringBuilderAppend.setSpan(coloredImageSpan, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
                this.adText = new Text(spannableStringBuilderAppend, 12.0f);
            }
            if (this.adBackgroundPaint == null) {
                this.adBackgroundPaint = new Paint(1);
            }
        }
        CharSequence charSequence = this.currentName;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        }
        TLRPC.Chat chat3 = this.chat;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CharSequence charSequenceRemoveRTL = charSequence2;
        if (chat3 != null) {
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i2).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                if (chat4 != null) {
                    charSequenceRemoveRTL = charSequence2;
                    charSequenceRemoveRTL = charSequence2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    int i3 = R.string.MonoforumSpan;
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(i3));
                    spannableStringBuilder.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i3), 9.33f, Theme.key_windowBackgroundWhiteGrayText, resourcesProvider), length, spannableStringBuilder.length(), 33);
                    charSequenceRemoveRTL = spannableStringBuilder;
                } else if (charSequence2 == null) {
                    charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.chat.title));
                }
            } else if (charSequence2 == null) {
                charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence2 == null && (user = this.user) != null) {
            charSequenceRemoveRTL = charSequence2;
            charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
        }
        charSequenceRemoveRTL = charSequence2;
        CharSequence charSequenceReplaceNewLines = AndroidUtilities.replaceNewLines(charSequenceRemoveRTL);
        if (TextUtils.isEmpty(charSequenceReplaceNewLines)) {
            TLRPC.User user3 = this.user;
            charSequenceReplaceNewLines = (user3 == null || TextUtils.isEmpty(user3.phone)) ? LocaleController.getString(R.string.HiddenName) : UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.user.phone, PhoneFormat.getInstance());
        }
        if (this.customPaints) {
            if (this.namePaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.namePaint = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            this.namePaint.setTextSize(AndroidUtilities.dp(this.callCellStyle ? 15.0f : 16.0f));
            if (this.encryptedChat != null) {
                this.namePaint.setColor(Theme.getColor(Theme.key_chats_secretName, resourcesProvider));
            } else {
                this.namePaint.setColor(Theme.getColor(Theme.key_chats_name, resourcesProvider));
            }
            textPaint = this.namePaint;
        } else {
            textPaint = this.encryptedChat != null ? Theme.dialogs_searchNameEncryptedPaint : Theme.dialogs_searchNamePaint;
        }
        TextPaint textPaint3 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.nameWidth = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(14.0f);
            this.nameWidth = measuredWidth;
        }
        if (this.drawNameLock) {
            this.nameWidth -= Theme.dialogs_lockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.ad != null) {
            int iDp2 = AndroidUtilities.dp(20.66f) + ((int) this.adText.getCurrentWidth());
            this.nameWidth -= iDp2;
            if (LocaleController.isRTL) {
                this.nameLeft += iDp2;
            }
        }
        if (this.contact != null) {
            TextPaint textPaint4 = Theme.dialogs_countTextPaint;
            int i4 = R.string.Invite;
            int iMeasureText = (int) (textPaint4.measureText(LocaleController.getString(i4)) + 1.0f);
            this.actionLayout = new StaticLayout(LocaleController.getString(i4), Theme.dialogs_countTextPaint, iMeasureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.actionLeft = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.nameLeft += iMeasureText;
                this.statusLeft += iMeasureText;
            } else {
                this.actionLeft = ((getMeasuredWidth() - iMeasureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.nameWidth = OKLCH.m$1(32.0f, iMeasureText, this.nameWidth);
        }
        this.nameWidth -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.drawCount) {
            int dialogUnreadCount = MessagesController.getInstance(i2).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i2).dialogs_dict.get(this.dialog_id));
            if (dialogUnreadCount != 0) {
                this.lastUnreadCount = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder();
                sb.append(dialogUnreadCount);
                String string = sb.toString();
                this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(string)));
                this.countLayout = new StaticLayout(string, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int iDp3 = AndroidUtilities.dp(18.0f) + this.countWidth;
                this.nameWidth -= iDp3;
                paddingRight -= iDp3;
                if (LocaleController.isRTL) {
                    this.countLeft = AndroidUtilities.dp(19.0f);
                    this.nameLeft += iDp3;
                    this.statusLeft += iDp3;
                } else {
                    this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.dp(19.0f);
                }
            } else {
                this.lastUnreadCount = 0;
                this.countLayout = null;
            }
        } else {
            this.lastUnreadCount = 0;
            this.countLayout = null;
        }
        int i5 = paddingRight;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botVerificationDrawable;
        if (!swapAnimatedEmojiDrawable.isEmpty()) {
            if (LocaleController.isRTL) {
                this.nameWidth -= swapAnimatedEmojiDrawable.getIntrinsicWidth();
            } else {
                this.nameLeft = swapAnimatedEmojiDrawable.getIntrinsicWidth() + this.nameLeft;
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
        if (!swapAnimatedEmojiDrawable2.isEmpty() && !LocaleController.isRTL) {
            this.nameWidth -= swapAnimatedEmojiDrawable2.getIntrinsicWidth();
        }
        if (this.nameWidth < 0) {
            this.nameWidth = 0;
        }
        float fDp = this.nameWidth - AndroidUtilities.dp(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceReplaceNewLines, textPaint3, fDp, truncateAt);
        if (charSequenceEllipsize != null) {
            charSequenceEllipsize = Emoji.replaceEmoji(charSequenceEllipsize, textPaint3.getFontMetricsInt(), false);
        }
        CharSequence charSequence3 = charSequenceEllipsize;
        int i6 = this.nameWidth;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.nameLayout = new StaticLayout(charSequence3, textPaint3, i6, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = Theme.dialogs_offlinePaint;
        TLRPC.Chat chat5 = this.chat;
        if (chat5 == null || this.subLabel != null) {
            userStatus = this.subLabel;
            if (userStatus == null) {
                TLRPC.User user4 = this.user;
                if (user4 == null) {
                    userStatus = null;
                } else if (MessagesController.isSupportUser(user4)) {
                    userStatus = LocaleController.getString(R.string.SupportStatus);
                } else {
                    TLRPC.User user5 = this.user;
                    boolean z = user5.bot;
                    if (z && (i = user5.bot_active_users) != 0) {
                        userStatus = LocaleController.formatPluralStringSpaced("BotUsersShort", i);
                    } else if (z) {
                        userStatus = LocaleController.getString(R.string.Bot);
                    } else {
                        long j = user5.id;
                        if (j == 489000) {
                            userStatus = LocaleController.getString(R.string.VerifyCodesNotifications);
                        } else if (UserObject.isService(j)) {
                            userStatus = LocaleController.getString(R.string.ServiceNotifications);
                        } else {
                            if (this.isOnline == null) {
                                this.isOnline = new boolean[1];
                            }
                            boolean[] zArr = this.isOnline;
                            zArr[0] = false;
                            userStatus = LocaleController.formatUserStatus(i2, this.user, zArr);
                            if (this.isOnline[0]) {
                                textPaint5 = Theme.dialogs_onlinePaint;
                            }
                            TLRPC.User user6 = this.user;
                            if (user6 != null && (user6.id == UserConfig.getInstance(i2).getClientUserId() || ((userStatus2 = this.user.status) != null && userStatus2.expires > ConnectionsManager.getInstance(i2).getCurrentTime()))) {
                                textPaint5 = Theme.dialogs_onlinePaint;
                                userStatus = LocaleController.getString(R.string.Online);
                            }
                        }
                    }
                }
            }
            if (this.savedMessages || UserObject.isReplyUser(this.user)) {
                this.nameTop = AndroidUtilities.dp(20.0f);
                userStatus = null;
            }
        } else {
            if (ChatObject.isCommunity(chat5)) {
                userStatus = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.chat)) {
                TLRPC.Chat chat6 = this.chat;
                int i7 = chat6.participants_count;
                if (i7 != 0) {
                    userStatus = LocaleController.formatPluralStringComma("Subscribers", i7);
                } else {
                    userStatus = !ChatObject.isPublic(chat6) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.chat;
                int i8 = chat7.participants_count;
                if (i8 != 0) {
                    userStatus = LocaleController.formatPluralStringComma("Members", i8);
                } else if (chat7.has_geo) {
                    userStatus = LocaleController.getString(R.string.MegaLocation);
                } else if (ChatObject.isMonoForum(chat7)) {
                    userStatus = LocaleController.getString(R.string.MonoforumMessages);
                } else {
                    userStatus = !ChatObject.isPublic(this.chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            }
            this.nameTop = AndroidUtilities.dp(19.0f);
        }
        if (this.customPaints) {
            if (this.statusPaint == null) {
                this.statusPaint = new TextPaint(1);
            }
            this.statusPaint.setTextSize(AndroidUtilities.dp(this.callCellStyle ? 13.0f : 15.0f));
            if (textPaint5 == Theme.dialogs_offlinePaint) {
                this.statusPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
            } else if (textPaint5 == Theme.dialogs_onlinePaint) {
                this.statusPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText3, resourcesProvider));
            }
            textPaint5 = this.statusPaint;
        }
        if (TextUtils.isEmpty(userStatus)) {
            this.nameTop = AndroidUtilities.dp(20.0f);
            this.statusLayout = null;
        } else {
            this.statusLayout = new StaticLayout(TextUtils.ellipsize(userStatus, textPaint5, i5 - AndroidUtilities.dp(12.0f), truncateAt), textPaint5, i5, alignment, 1.0f, 0.0f, false);
            this.nameTop = AndroidUtilities.dp(9.0f);
            this.nameLockTop -= AndroidUtilities.dp(10.0f);
        }
        if (LocaleController.isRTL) {
            iDp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.callCellStyle) {
                f = 14.0f;
            } else {
                f = this.rectangularAvatar ? 15.0f : 11.0f;
            }
            iDp = AndroidUtilities.dp(f) + getPaddingLeft();
        }
        RectF rectF = this.avatarStoryParams.originalAvatarRect;
        float f3 = iDp;
        float fDp2 = AndroidUtilities.dp(this.callCellStyle ? 6.0f : 7.0f);
        if (this.callCellStyle) {
            f2 = 44.0f;
        } else {
            f2 = this.rectangularAvatar ? 42.0f : 46.0f;
        }
        rectF.set(f3, fDp2, AndroidUtilities.dp(f2) + iDp, AndroidUtilities.dp(this.callCellStyle ? 44.0f : 46.0f) + AndroidUtilities.dp(this.callCellStyle ? 6.0f : 7.0f));
        if (LocaleController.isRTL) {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineLeft(0) == 0.0f) {
                double dCeil = Math.ceil(this.nameLayout.getLineWidth(0));
                double d = this.nameWidth;
                if (dCeil < d) {
                    this.nameLeft = (int) ((d - dCeil) + ((double) this.nameLeft));
                }
            }
            StaticLayout staticLayout = this.statusLayout;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.statusLayout.getLineLeft(0) == 0.0f) {
                double dCeil2 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d2 = i5;
                if (dCeil2 < d2) {
                    this.statusLeft = (int) ((d2 - dCeil2) + ((double) this.statusLeft));
                }
            }
        } else {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineRight(0) == this.nameWidth) {
                double dCeil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                double d3 = this.nameWidth;
                if (dCeil3 < d3) {
                    this.nameLeft = (int) (((double) this.nameLeft) - (d3 - dCeil3));
                }
            }
            StaticLayout staticLayout2 = this.statusLayout;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.statusLayout.getLineRight(0) == i5) {
                double dCeil4 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d4 = i5;
                if (dCeil4 < d4) {
                    this.statusLeft = (int) (((double) this.statusLeft) - (d4 - dCeil4));
                }
            }
        }
        this.nameLeft = getPaddingLeft() + this.nameLeft;
        this.statusLeft = getPaddingLeft() + this.statusLeft;
        this.nameLockLeft = getPaddingLeft() + this.nameLockLeft;
        if (this.callCellStyle) {
            this.nameLeft = AndroidUtilities.dp(1.0f) + this.nameLeft;
            this.nameTop = AndroidUtilities.dp(1.0f) + this.nameTop;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked;
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.user;
            int i3 = this.currentAccount;
            if (user == null) {
                TLRPC.Chat chat = this.chat;
                if (chat != null) {
                    requirementToContactIsUserContactBlocked = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.contact;
                    if (contact == null) {
                        return;
                    }
                    if (!this.showPremiumBlocked || contact.user == null) {
                        requirementToContactIsUserContactBlocked = null;
                    } else {
                        requirementToContactIsUserContactBlocked = MessagesController.getInstance(i3).isUserContactBlocked(this.contact.user.id);
                    }
                }
            } else if (this.showPremiumBlocked) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(i3).isUserContactBlocked(this.user.id);
            } else {
                requirementToContactIsUserContactBlocked = null;
            }
            if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
                return;
            }
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.dialog_id;
    }

    public TLRPC.User getUser() {
        return this.user;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.showPremiumBlocked) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.statusDrawable.attach();
        this.botVerificationDrawable.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.showPremiumBlocked) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.statusDrawable.detach();
        this.botVerificationDrawable.detach();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        int iCeil;
        boolean z;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int lineRight;
        if (this.user == null && this.chat == null && this.encryptedChat == null && this.contact == null) {
            return;
        }
        boolean z2 = this.useSeparator;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z2) {
            Paint paint = (!this.customPaints || resourcesProvider == null) ? null : resourcesProvider.getPaint("paintDivider");
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint2);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.drawNameLock) {
            BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
            Theme.dialogs_lockDrawable.draw(canvas2);
        }
        StaticLayout staticLayout = this.nameLayout;
        if (staticLayout != null) {
            boolean z3 = LocaleController.isRTL;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerificationDrawable;
            if (z3) {
                iCeil = (int) (staticLayout.getLineRight(0) + this.nameLeft + AndroidUtilities.dp(6.0f));
            } else {
                if (staticLayout.getLineLeft(0) == 0.0f) {
                    iCeil = (this.nameLeft - AndroidUtilities.dp(3.0f)) - swapAnimatedEmojiDrawable2.getIntrinsicWidth();
                } else {
                    f4 = 6.0f;
                    iCeil = (int) (((((double) (this.nameLeft + this.nameWidth)) - Math.ceil(this.nameLayout.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) swapAnimatedEmojiDrawable2.getIntrinsicWidth()));
                }
                BaseCell.setDrawableBounds(swapAnimatedEmojiDrawable2, iCeil, ((this.nameLayout.getHeight() - swapAnimatedEmojiDrawable2.getIntrinsicHeight()) / 2.0f) + this.nameTop);
                swapAnimatedEmojiDrawable2.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.nameLeft, this.nameTop);
                this.nameLayout.draw(canvas2);
                canvas2.restore();
                z = LocaleController.isRTL;
                swapAnimatedEmojiDrawable = this.statusDrawable;
                if (z) {
                    lineRight = (int) (this.nameLayout.getLineRight(0) + this.nameLeft + AndroidUtilities.dp(f4));
                } else if (this.nameLayout.getLineLeft(0) == 0.0f) {
                    lineRight = (this.nameLeft - AndroidUtilities.dp(3.0f)) - swapAnimatedEmojiDrawable.getIntrinsicWidth();
                } else {
                    lineRight = (int) (((((double) (this.nameLeft + this.nameWidth)) - Math.ceil(this.nameLayout.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) swapAnimatedEmojiDrawable.getIntrinsicWidth()));
                }
                BaseCell.setDrawableBounds(swapAnimatedEmojiDrawable, lineRight, ((this.nameLayout.getHeight() - swapAnimatedEmojiDrawable.getIntrinsicHeight()) / 2.0f) + this.nameTop);
                swapAnimatedEmojiDrawable.draw(canvas2);
            }
            f4 = 6.0f;
            BaseCell.setDrawableBounds(swapAnimatedEmojiDrawable2, iCeil, ((this.nameLayout.getHeight() - swapAnimatedEmojiDrawable2.getIntrinsicHeight()) / 2.0f) + this.nameTop);
            swapAnimatedEmojiDrawable2.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.nameLeft, this.nameTop);
            this.nameLayout.draw(canvas2);
            canvas2.restore();
            z = LocaleController.isRTL;
            swapAnimatedEmojiDrawable = this.statusDrawable;
            if (z) {
                lineRight = (int) (this.nameLayout.getLineRight(0) + this.nameLeft + AndroidUtilities.dp(f4));
            } else if (this.nameLayout.getLineLeft(0) == 0.0f) {
                lineRight = (this.nameLeft - AndroidUtilities.dp(3.0f)) - swapAnimatedEmojiDrawable.getIntrinsicWidth();
            } else {
                lineRight = (int) (((((double) (this.nameLeft + this.nameWidth)) - Math.ceil(this.nameLayout.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) swapAnimatedEmojiDrawable.getIntrinsicWidth()));
            }
            BaseCell.setDrawableBounds(swapAnimatedEmojiDrawable, lineRight, ((this.nameLayout.getHeight() - swapAnimatedEmojiDrawable.getIntrinsicHeight()) / 2.0f) + this.nameTop);
            swapAnimatedEmojiDrawable.draw(canvas2);
        }
        if (this.ad == null || this.adText == null || this.adBackgroundPaint == null) {
            f = 2.0f;
        } else {
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            this.adBackgroundPaint.setColor(Theme.multAlpha(0.1f, color));
            int iDp = AndroidUtilities.dp(12.66f) + ((int) this.adText.getWidth());
            int iDp2 = AndroidUtilities.dp(17.33f);
            int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : RichMessageLayout$$ExternalSyntheticOutline1.m(12.0f, getWidth(), iDp);
            RectF rectF = this.adBounds;
            float f5 = iDp3;
            f = 2.0f;
            int i = this.nameTop;
            rectF.set(f5, i, iDp3 + iDp, i + iDp2);
            rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas2.save();
            float scale = this.adBounce.getScale(0.1f);
            canvas2.scale(scale, scale, rectF.centerX(), rectF.centerY());
            canvas2.translate(f5, this.nameTop);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f6 = iDp2;
            rectF2.set(0.0f, 0.0f, iDp, f6);
            float f7 = f6 / 2.0f;
            canvas2.drawRoundRect(rectF2, f7, f7, this.adBackgroundPaint);
            this.adText.draw(canvas, AndroidUtilities.dp(6.33f), f7, color, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.statusLayout != null) {
            canvas2.save();
            canvas2.translate(this.statusLeft + this.sublabelOffsetX, AndroidUtilities.dp(this.callCellStyle ? 35.0f : 33.0f) + this.sublabelOffsetY);
            this.statusLayout.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.countLayout;
        int i2 = this.countTop;
        if (staticLayout2 != null) {
            int iDp4 = this.countLeft - AndroidUtilities.dp(5.5f);
            RectF rectF3 = this.rect;
            rectF3.set(iDp4, i2, AndroidUtilities.dp(11.0f) + iDp4 + this.countWidth, AndroidUtilities.dp(23.0f) + i2);
            float f8 = AndroidUtilities.density * 11.5f;
            f2 = 23.0f;
            f3 = 4.0f;
            canvas2.drawRoundRect(rectF3, f8, f8, MessagesController.getInstance(this.currentAccount).isDialogMuted(this.dialog_id, 0L) ? Theme.dialogs_countGrayPaint : Theme.dialogs_countPaint);
            canvas2.save();
            canvas2.translate(this.countLeft, AndroidUtilities.dp(4.0f) + i2);
            this.countLayout.draw(canvas2);
            canvas2.restore();
        } else {
            f2 = 23.0f;
            f3 = 4.0f;
        }
        if (this.actionLayout != null) {
            this.actionButton.setColor(Theme.getColor(null, Theme.key_chats_unreadCounter, false), Theme.getColor(null, Theme.key_chats_unreadCounterText, false));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i3 = this.actionLeft;
            rectF4.set(i3, i2, this.actionLayout.getWidth() + i3, AndroidUtilities.dp(f2) + i2);
            rectF4.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(f3));
            this.actionButton.setRect(rectF4);
            this.actionButton.setRounded(true);
            this.actionButton.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.actionLeft, AndroidUtilities.dp(f3) + i2);
            this.actionLayout.draw(canvas2);
            canvas2.restore();
        }
        boolean z4 = this.dontDrawAvatar;
        ImageReceiver imageReceiver = this.avatarImage;
        if (!z4) {
            TLRPC.Chat chat = this.chat;
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.user;
                if (user != null) {
                    StoriesUtilities.drawAvatarWithStory(user.id, canvas2, imageReceiver, avatarStoryParams);
                } else if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        DrawableUtils.drawCommunityCardDrawable(canvas2, Theme.dialogs_communityCardsDrawable, avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY(), avatarStoryParams.originalAvatarRect.width());
                    }
                    StoriesUtilities.drawAvatarWithStory(-this.chat.id, canvas2, imageReceiver, avatarStoryParams);
                } else {
                    imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
                    imageReceiver.draw(canvas2);
                }
            } else {
                if (this.bubbleClip == null) {
                    this.bubbleClip = new PhotoBubbleClip();
                }
                this.bubbleClip.setBounds((int) avatarStoryParams.originalAvatarRect.centerX(), (int) avatarStoryParams.originalAvatarRect.centerY(), (int) (avatarStoryParams.originalAvatarRect.width() / f));
                canvas2.save();
                canvas2.clipPath(this.bubbleClip);
                imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
                imageReceiver.draw(canvas2);
                canvas2.restore();
            }
        }
        float f9 = this.premiumBlockedT.set(this.premiumBlocked);
        if (f9 > 0.0f) {
            float centerY = imageReceiver.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = imageReceiver.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas2.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f9, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f9, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.lockDrawable;
            drawable.setBounds((int) (centerX - (((drawable.getIntrinsicWidth() / f) * 0.875f) * f9)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / f) * 0.875f) * f9)), (int) (((this.lockDrawable.getIntrinsicWidth() / f) * 0.875f * f9) + centerX), (int) (((this.lockDrawable.getIntrinsicHeight() / f) * 0.875f * f9) + centerY));
            this.lockDrawable.setAlpha((int) (f9 * 255.0f));
            this.lockDrawable.draw(canvas2);
            canvas2.restore();
        }
        if (!this.openBot || this.openButtonText == null) {
            return;
        }
        float currentWidth = this.openButtonText.getCurrentWidth() + AndroidUtilities.dp(28.0f);
        float fDp = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - currentWidth) - AndroidUtilities.dp(15.0f);
        float fDp2 = AndroidUtilities.dp(28.0f);
        Paint paint3 = this.openButtonBackgroundPaint;
        paint3.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
        RectF rectF5 = this.openButtonRect;
        rectF5.set(fDp, (getHeight() - fDp2) / f, currentWidth + fDp, (getHeight() + fDp2) / f);
        canvas2.save();
        float scale2 = this.openButtonBounce.getScale(0.06f);
        canvas2.scale(scale2, scale2, rectF5.centerX(), rectF5.centerY());
        canvas2.drawRoundRect(rectF5, rectF5.height() / f, rectF5.height() / f, paint3);
        this.openButtonText.draw(canvas, fDp + AndroidUtilities.dp(14.0f), getHeight() / f, -1, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.isChecked()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBox2.isChecked());
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.user == null && this.chat == null && this.encryptedChat == null && this.contact == null) {
            return;
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            int iDp = LocaleController.isRTL ? (i3 - i) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int iDp2 = AndroidUtilities.dp(36.0f);
            checkBox2.layout(iDp, iDp2, checkBox2.getMeasuredWidth() + iDp, checkBox2.getMeasuredHeight() + iDp2);
        }
        if (z) {
            buildLayout();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.callCellStyle ? AndroidUtilities.dp(56.0f) : AndroidUtilities.dp(60.0f) + (this.useSeparator ? 1 : 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.openBot && this.onOpenButtonClick != null && this.user != null) {
            boolean zContains = this.openButtonRect.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = this.openButtonBounce;
            if (action == 0 || motionEvent.getAction() == 2) {
                buttonBounce.setPressed(zContains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (buttonBounce.isPressed()) {
                        this.onOpenButtonClick.run(this.user);
                    }
                    buttonBounce.setPressed(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    buttonBounce.setPressed(false);
                    return true;
                }
            }
            if (zContains || buttonBounce.isPressed()) {
                return true;
            }
        } else if (this.ad != null && this.onSponsoredOptionsClick != null) {
            boolean zContains2 = this.adBounds.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            ButtonBounce buttonBounce2 = this.adBounce;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                buttonBounce2.setPressed(zContains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (buttonBounce2.isPressed()) {
                        this.onSponsoredOptionsClick.run(this, this.ad);
                    }
                    buttonBounce2.setPressed(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    buttonBounce2.setPressed(false);
                    return true;
                }
            }
            if (zContains2 || buttonBounce2.isPressed()) {
                return true;
            }
        }
        if (!(this.user == null && this.chat == null) && this.avatarStoryParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        CanvasButton canvasButton = this.actionButton;
        if (canvasButton == null || !canvasButton.checkTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.ad = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.allowEmojiStatus = z;
    }

    public final void setData(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.currentName = charSequence;
        boolean z3 = obj instanceof TLRPC.User;
        int i = this.currentAccount;
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = null;
        if (z3) {
            TLRPC.User user = (TLRPC.User) obj;
            this.user = user;
            this.chat = null;
            this.contact = null;
            if (this.showPremiumBlocked && user != null) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(i).isUserContactBlocked(this.user.id);
            }
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            setOpenBotButton(this.allowBotOpenButton && this.user.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.chat = chat;
            this.user = null;
            this.contact = null;
            TL_account.RequirementToContact requirementToContact = ChatObject.getRequirementToContact(chat);
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.contact = contact;
            this.chat = null;
            this.user = null;
            if (this.showPremiumBlocked && contact != null && contact.user != null) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(i).isUserContactBlocked(this.contact.user.id);
            }
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.encryptedChat = encryptedChat;
        this.subLabel = charSequence2;
        this.drawCount = z;
        this.savedMessages = z2;
        update(0);
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<ProfileSearchCell, TLRPC.TL_sponsoredPeer> callback2) {
        this.onSponsoredOptionsClick = callback2;
    }

    public void setOpenBotButton(boolean z) {
        int iDp;
        if (this.openBot == z) {
            return;
        }
        if (this.openButtonText == null) {
            this.openButtonText = new Text(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z) {
            iDp = AndroidUtilities.dp(30.0f) + ((int) this.openButtonText.getCurrentWidth());
        } else {
            iDp = 0;
        }
        boolean z2 = LocaleController.isRTL;
        int i = z2 ? iDp : 0;
        if (z2) {
            iDp = 0;
        }
        setPadding(i, 0, iDp, 0);
        this.openBot = z;
        this.openButtonBounce.setPressed(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.rectangularAvatar = z;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.subLabel = charSequence;
        update(0);
    }

    public final void update(int i) {
        TLRPC.FileLocation fileLocation;
        Drawable drawable;
        TLRPC.FileLocation fileLocation2;
        TLRPC.Chat chat;
        float f;
        int iDp;
        TLRPC.Dialog dialog;
        String monoForumTitle;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation3;
        Drawable drawable2;
        TLRPC.User user3 = this.user;
        ImageReceiver imageReceiver = this.avatarImage;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        int i2 = this.currentAccount;
        TLRPC.FileLocation fileLocation4 = null;
        fileLocation4 = null;
        fileLocation4 = null;
        TLRPC.FileLocation fileLocation5 = null;
        fileLocation4 = null;
        if (user3 != null) {
            avatarDrawable.setInfo(i2, user3);
            if (UserObject.isReplyUser(this.user)) {
                avatarDrawable.setAvatarType(12);
                imageReceiver.setImage(null, null, avatarDrawable, null, null, 0);
            } else if (this.savedMessages) {
                avatarDrawable.setAvatarType(1);
                imageReceiver.setImage(null, null, avatarDrawable, null, null, 0);
            } else {
                TLRPC.User user4 = this.user;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation5 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                    } else {
                        drawable2 = avatarDrawable;
                    }
                } else {
                    drawable2 = avatarDrawable;
                }
                fileLocation2 = fileLocation5;
                imageReceiver.setImage(ImageLocation.getForUserOrChat(i2, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.user, 2), "50_50", drawable2, this.user, 0);
                fileLocation4 = fileLocation2;
            }
        } else {
            TLRPC.Chat chat2 = this.chat;
            if (chat2 != null) {
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                if (chatPhoto != null) {
                    fileLocation = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                    }
                    fileLocation2 = fileLocation;
                    if (chat2.monoforum) {
                        int i3 = ForumUtilities.$r8$clinit;
                        chat = ChatObject.isMonoForum(chat2) ? MessagesController.getInstance(i2).getChat(Long.valueOf(chat2.linked_monoforum_id)) : null;
                        if (chat != null) {
                            chat2 = chat;
                        }
                        avatarDrawable.setInfo(i2, chat2);
                        imageReceiver.setForUserOrChat(chat, avatarDrawable);
                    } else {
                        avatarDrawable.setInfo(i2, chat2);
                        imageReceiver.setImage(ImageLocation.getForUserOrChat(i2, this.chat, 1), "50_50", ImageLocation.getForUserOrChat(this.chat, 2), "50_50", drawable, this.chat, 0);
                    }
                    fileLocation4 = fileLocation2;
                } else {
                    fileLocation = null;
                }
                drawable = avatarDrawable;
                fileLocation2 = fileLocation;
                if (chat2.monoforum) {
                    int i4 = ForumUtilities.$r8$clinit;
                    if (ChatObject.isMonoForum(chat2)) {
                    }
                    if (chat != null) {
                        chat2 = chat;
                    }
                    avatarDrawable.setInfo(i2, chat2);
                    imageReceiver.setForUserOrChat(chat, avatarDrawable);
                } else {
                    avatarDrawable.setInfo(i2, chat2);
                    imageReceiver.setImage(ImageLocation.getForUserOrChat(i2, this.chat, 1), "50_50", ImageLocation.getForUserOrChat(this.chat, 2), "50_50", drawable, this.chat, 0);
                }
                fileLocation4 = fileLocation2;
            } else {
                ContactsController.Contact contact = this.contact;
                if (contact != null) {
                    avatarDrawable.setInfo(0L, contact.first_name, contact.last_name);
                    imageReceiver.setImage(null, null, avatarDrawable, null, null, 0);
                } else {
                    avatarDrawable.setInfo(0L, null, null);
                    imageReceiver.setImage(null, null, avatarDrawable, null, null, 0);
                }
            }
        }
        if (ChatObject.isCommunity(this.chat)) {
            int iDp2 = AndroidUtilities.dp(46.0f);
            Rect rect = DrawableUtils.tmpRect;
            iDp = (iDp2 * 20) / 72;
        } else {
            TLRPC.Chat chat3 = this.chat;
            if (chat3 == null || !chat3.monoforum) {
                if (this.rectangularAvatar) {
                    f = 10.0f;
                } else {
                    f = (chat3 == null || !chat3.forum) ? 23.0f : 16.0f;
                }
                iDp = AndroidUtilities.dp(f);
            } else {
                iDp = 0;
            }
        }
        imageReceiver.setRoundRadius(iDp);
        if (i != 0) {
            boolean z = !(((MessagesController.UPDATE_MASK_AVATAR & i) == 0 || this.user == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i) == 0 || this.chat == null)) && (((fileLocation3 = this.lastAvatar) != null && fileLocation4 == null) || ((fileLocation3 == null && fileLocation4 != null) || !(fileLocation3 == null || (fileLocation3.volume_id == fileLocation4.volume_id && fileLocation3.local_id == fileLocation4.local_id))));
            if (!z && (MessagesController.UPDATE_MASK_STATUS & i) != 0 && (user2 = this.user) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.lastStatus) {
                    z = true;
                }
            }
            if (!z && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i) != 0 && ((user = this.user) != null || this.chat != null)) {
                updateStatus(user != null ? user.verified : this.chat.verified, user, this.chat, true);
            }
            if ((!z && (MessagesController.UPDATE_MASK_NAME & i) != 0 && this.user != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i) != 0 && this.chat != null)) {
                if (this.user != null) {
                    monoForumTitle = this.user.first_name + this.user.last_name;
                } else {
                    TLRPC.Chat chat4 = this.chat;
                    monoForumTitle = chat4.monoforum ? ForumUtilities.getMonoForumTitle(chat4, i2, false) : chat4.title;
                }
                if (!monoForumTitle.equals(this.lastName)) {
                    z = true;
                }
            }
            if (!((z || !this.drawCount || (i & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(i2).dialogs_dict.get(this.dialog_id)) == null || MessagesController.getInstance(i2).getDialogUnreadCount(dialog) == this.lastUnreadCount) ? z : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.user;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.lastStatus = userStatus2.expires;
            } else {
                this.lastStatus = 0;
            }
            this.lastName = this.user.first_name + this.user.last_name;
        } else {
            TLRPC.Chat chat5 = this.chat;
            if (chat5 != null) {
                this.lastName = chat5.monoforum ? ForumUtilities.getMonoForumTitle(chat5, i2, false) : chat5.title;
            }
        }
        this.lastAvatar = fileLocation4;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            buildLayout();
        }
        postInvalidate();
    }

    @Override
    public final void updateColors() {
        if (this.nameLayout == null || getMeasuredWidth() <= 0) {
            return;
        }
        buildLayout();
    }

    public final void updateStatus(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        long botVerificationIcon;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusDrawable;
        swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
        boolean z3 = this.allowEmojiStatus;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z3 && z) {
            swapAnimatedEmojiDrawable.set(new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable, 0, 0), z2);
            swapAnimatedEmojiDrawable.setColor(null);
        } else if (z3 && user != null && !this.savedMessages && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z2);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider)));
        } else if (this.allowEmojiStatus && chat != null && !this.savedMessages && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z2);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider)));
        } else if (!this.allowEmojiStatus || user == null || this.savedMessages || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            swapAnimatedEmojiDrawable.set((Drawable) null, z2);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider)));
        } else {
            swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z2);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider)));
        }
        if (user != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(user);
        } else {
            botVerificationIcon = chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerificationDrawable;
        if (botVerificationIcon == 0 || this.savedMessages) {
            swapAnimatedEmojiDrawable2.set((Drawable) null, z2);
        } else {
            swapAnimatedEmojiDrawable2.set(botVerificationIcon, z2);
        }
        swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.statusDrawable == drawable || this.botVerificationDrawable == drawable || super.verifyDrawable(drawable);
    }
}
