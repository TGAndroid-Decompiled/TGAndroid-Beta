package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.PhotoBubbleClip;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.Stories.StoriesUtilities;

public class ProfileSearchCell extends BaseCell implements NotificationCenter.NotificationCenterDelegate, Theme.Colorable {
    CanvasButton actionButton;
    private StaticLayout actionLayout;
    private int actionLeft;
    private TLRPC.TL_sponsoredPeer ad;
    private Paint adBackgroundPaint;
    private final ButtonBounce adBounce;
    private final RectF adBounds;
    private Text adText;
    private boolean allowBotOpenButton;
    private boolean allowEmojiStatus;
    private AvatarDrawable avatarDrawable;
    public ImageReceiver avatarImage;
    public StoriesUtilities.AvatarStoryParams avatarStoryParams;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationDrawable;
    private PhotoBubbleClip bubbleClip;
    private TLRPC.Chat chat;
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
    public boolean dontDrawAvatar;
    private boolean drawCheck;
    private boolean drawCount;
    private boolean drawNameLock;
    private boolean drawPremium;
    private TLRPC.EncryptedChat encryptedChat;
    private boolean[] isOnline;
    private TLRPC.FileLocation lastAvatar;
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
    private Utilities.Callback onOpenButtonClick;
    private Utilities.Callback2 onSponsoredOptionsClick;
    private boolean openBot;
    private final Paint openButtonBackgroundPaint;
    private final ButtonBounce openButtonBounce;
    private final RectF openButtonRect;
    private Text openButtonText;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private RectF rect;
    private boolean rectangularAvatar;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean savedMessages;
    private boolean showPremiumBlocked;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private StaticLayout statusLayout;
    private int statusLeft;
    private TextPaint statusPaint;
    private CharSequence subLabel;
    private int sublabelOffsetX;
    private int sublabelOffsetY;
    public boolean useSeparator;
    private TLRPC.User user;

    public ProfileSearchCell(Context context) {
        this(context, null);
    }

    public ProfileSearchCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.countTop = AndroidUtilities.dp(19.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false);
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
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(3);
        addView(this.checkBox);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(20.0f));
        this.botVerificationDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.setCallback(this);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(20.0f));
        this.statusDrawable = swapAnimatedEmojiDrawable2;
        swapAnimatedEmojiDrawable2.setCallback(this);
    }

    public void lambda$buildLayout$0() {
        if (!(getParent() instanceof RecyclerListView)) {
            callOnClick();
        } else {
            RecyclerListView recyclerListView = (RecyclerListView) getParent();
            recyclerListView.getOnItemClickListener().onItemClick(this, recyclerListView.getChildAdapterPosition(this));
        }
    }

    public ProfileSearchCell allowBotOpenButton(boolean z, Utilities.Callback callback) {
        this.allowBotOpenButton = z;
        this.onOpenButtonClick = callback;
        return this;
    }

    public void buildLayout() {
        TLRPC.Chat chat;
        String userName;
        TextPaint textPaint;
        int measuredWidth;
        float f;
        CharSequence charSequence;
        int i;
        TLRPC.UserStatus userStatus;
        int i2;
        int dp;
        double d;
        TextPaint textPaint2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int dialogUnreadCount;
        TextPaint textPaint3;
        int i7;
        String str2;
        int dp2;
        this.drawNameLock = false;
        this.drawCheck = false;
        this.drawPremium = false;
        if (this.encryptedChat != null) {
            this.drawNameLock = true;
            this.dialog_id = DialogObject.makeEncryptedDialogId(r2.id);
            if (LocaleController.isRTL) {
                this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                dp2 = AndroidUtilities.dp(11.0f);
            } else {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                dp2 = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
            }
            this.nameLeft = dp2;
            this.nameLockTop = AndroidUtilities.dp(22.0f);
            updateStatus(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.chat;
            if (chat2 != null) {
                this.dialog_id = -chat2.id;
                this.drawCheck = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id))) != null) {
                    this.drawCheck = chat.verified;
                }
                this.nameLeft = !LocaleController.isRTL ? AndroidUtilities.dp(AndroidUtilities.leftBaseline) : AndroidUtilities.dp(11.0f);
                updateStatus(this.drawCheck, null, this.chat, false);
            } else {
                TLRPC.User user = this.user;
                if (user != null) {
                    this.dialog_id = user.id;
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
        if (this.ad != null) {
            if (this.adText == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ic_ab_other);
                coloredImageSpan.setScale(0.55f, 0.55f);
                coloredImageSpan.spaceScaleX = 0.7f;
                coloredImageSpan.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(coloredImageSpan, append.length() - 1, append.length(), 33);
                this.adText = new Text(append, 12.0f);
            }
            if (this.adBackgroundPaint == null) {
                this.adBackgroundPaint = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.currentName;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.chat;
        CharSequence charSequence4 = charSequence3;
        if (chat3 != null) {
            charSequence4 = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    int i8 = R.string.MonoforumSpan;
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(i8));
                    spannableStringBuilder.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i8), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    userName = this.chat.title;
                    charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(userName));
                }
            } else if (charSequence3 == null) {
                userName = chat3.title;
                charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(userName));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.user;
            charSequence4 = charSequence3;
            if (user2 != null) {
                userName = UserObject.getUserName(user2);
                charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(userName));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(charSequence4);
        if (replaceNewLines.length() == 0) {
            TLRPC.User user3 = this.user;
            if (user3 == null || (str2 = user3.phone) == null || str2.length() == 0) {
                replaceNewLines = LocaleController.getString(R.string.HiddenName);
            } else {
                replaceNewLines = PhoneFormat.getInstance().format("+" + this.user.phone);
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
                i7 = Theme.key_chats_secretName;
            } else {
                textPaint3 = this.namePaint;
                i7 = Theme.key_chats_name;
            }
            textPaint3.setColor(Theme.getColor(i7, this.resourcesProvider));
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
        int dp3 = measuredWidth - AndroidUtilities.dp(f);
        this.nameWidth = dp3;
        if (this.drawNameLock) {
            this.nameWidth -= AndroidUtilities.dp(6.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (this.ad != null) {
            int currentWidth = ((int) this.adText.getCurrentWidth()) + AndroidUtilities.dp(20.66f);
            this.nameWidth -= currentWidth;
            if (LocaleController.isRTL) {
                this.nameLeft += currentWidth;
            }
        }
        if (this.contact != null) {
            TextPaint textPaint6 = Theme.dialogs_countTextPaint;
            int i9 = R.string.Invite;
            int measureText = (int) (textPaint6.measureText(LocaleController.getString(i9)) + 1.0f);
            this.actionLayout = new StaticLayout(LocaleController.getString(i9), Theme.dialogs_countTextPaint, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        int paddingLeft = dp3 - (getPaddingLeft() + getPaddingRight());
        if (!this.drawCount || (dialogUnreadCount = MessagesController.getInstance(this.currentAccount).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialog_id))) == 0) {
            this.lastUnreadCount = 0;
            this.countLayout = null;
        } else {
            this.lastUnreadCount = dialogUnreadCount;
            String format = String.format(Locale.US, "%d", Integer.valueOf(dialogUnreadCount));
            this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format)));
            this.countLayout = new StaticLayout(format, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            int dp4 = this.countWidth + AndroidUtilities.dp(18.0f);
            this.nameWidth -= dp4;
            paddingLeft -= dp4;
            if (LocaleController.isRTL) {
                this.countLeft = AndroidUtilities.dp(19.0f);
                this.nameLeft += dp4;
                this.statusLeft += dp4;
            } else {
                this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.dp(19.0f);
            }
        }
        if (!this.botVerificationDrawable.isEmpty()) {
            if (LocaleController.isRTL) {
                this.nameWidth -= this.botVerificationDrawable.getIntrinsicWidth();
            } else {
                this.nameLeft += this.botVerificationDrawable.getIntrinsicWidth();
            }
        }
        if (!this.statusDrawable.isEmpty()) {
            if (LocaleController.isRTL) {
                this.nameLeft += this.statusDrawable.getIntrinsicWidth();
            } else {
                this.nameWidth -= this.statusDrawable.getIntrinsicWidth();
            }
        }
        if (this.nameWidth < 0) {
            this.nameWidth = 0;
        }
        float dp5 = this.nameWidth - AndroidUtilities.dp(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint5, dp5, truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint5.getFontMetricsInt(), false);
        }
        int i10 = this.nameWidth;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.nameLayout = new StaticLayout(ellipsize, textPaint5, i10, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint7 = Theme.dialogs_offlinePaint;
        TLRPC.Chat chat5 = this.chat;
        if (chat5 == null || this.subLabel != null) {
            charSequence = this.subLabel;
            if (charSequence == null) {
                TLRPC.User user4 = this.user;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        i = R.string.SupportStatus;
                    } else {
                        TLRPC.User user5 = this.user;
                        boolean z = user5.bot;
                        if (z && (i2 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i2);
                        } else if (z) {
                            i = R.string.Bot;
                        } else {
                            long j = user5.id;
                            if (j == 489000) {
                                i = R.string.VerifyCodesNotifications;
                            } else if (UserObject.isService(j)) {
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
                                TLRPC.User user6 = this.user;
                                if (user6 != null && (user6.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || ((userStatus = this.user.status) != null && userStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()))) {
                                    textPaint7 = Theme.dialogs_onlinePaint;
                                    i = R.string.Online;
                                }
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
            if (ChatObject.isChannel(chat5)) {
                TLRPC.Chat chat6 = this.chat;
                if (!chat6.megagroup) {
                    i4 = chat6.participants_count;
                    if (i4 != 0) {
                        str = "Subscribers";
                        charSequence = LocaleController.formatPluralStringComma(str, i4);
                        this.nameTop = AndroidUtilities.dp(19.0f);
                    } else {
                        i5 = !ChatObject.isPublic(chat6) ? R.string.ChannelPrivate : R.string.ChannelPublic;
                        charSequence = LocaleController.getString(i5).toLowerCase();
                        this.nameTop = AndroidUtilities.dp(19.0f);
                    }
                }
            }
            TLRPC.Chat chat7 = this.chat;
            i4 = chat7.participants_count;
            if (i4 != 0) {
                str = "Members";
                charSequence = LocaleController.formatPluralStringComma(str, i4);
                this.nameTop = AndroidUtilities.dp(19.0f);
            } else {
                if (chat7.has_geo) {
                    i6 = R.string.MegaLocation;
                } else if (ChatObject.isMonoForum(chat7)) {
                    i6 = R.string.MonoforumMessages;
                } else {
                    i5 = !ChatObject.isPublic(this.chat) ? R.string.MegaPrivate : R.string.MegaPublic;
                    charSequence = LocaleController.getString(i5).toLowerCase();
                    this.nameTop = AndroidUtilities.dp(19.0f);
                }
                charSequence = LocaleController.getString(i6);
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
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            dp = AndroidUtilities.dp(this.rectangularAvatar ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.avatarStoryParams.originalAvatarRect.set(dp, AndroidUtilities.dp(7.0f), dp + AndroidUtilities.dp(this.rectangularAvatar ? 42.0f : 46.0f), AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(46.0f));
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
        MessagesController messagesController;
        TLRPC.User user;
        TL_account.RequirementToContact requirementToContact;
        if (i != NotificationCenter.emojiLoaded) {
            if (i != NotificationCenter.userIsPremiumBlockedUpadted) {
                return;
            }
            if (this.user != null) {
                if (this.showPremiumBlocked) {
                    messagesController = MessagesController.getInstance(this.currentAccount);
                    user = this.user;
                    requirementToContact = messagesController.isUserContactBlocked(user.id);
                }
                requirementToContact = null;
            } else {
                TLRPC.Chat chat = this.chat;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.contact;
                    if (contact == null) {
                        return;
                    }
                    if (this.showPremiumBlocked && contact.user != null) {
                        messagesController = MessagesController.getInstance(this.currentAccount);
                        user = this.contact.user;
                        requirementToContact = messagesController.isUserContactBlocked(user.id);
                    }
                    requirementToContact = null;
                }
            }
            if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContact) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContact)) {
                return;
            }
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContact);
        }
        invalidate();
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public long getDialogId() {
        return this.dialog_id;
    }

    public TLRPC.User getUser() {
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
        this.botVerificationDrawable.attach();
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
        this.botVerificationDrawable.detach();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        long j;
        int i;
        int lineRight;
        float dp;
        float measuredHeight;
        float measuredWidth;
        float measuredHeight2;
        Theme.ResourcesProvider resourcesProvider;
        if (this.user == null && this.chat == null && this.encryptedChat == null && this.contact == null) {
            return;
        }
        if (this.useSeparator) {
            Paint paint = (!this.customPaints || (resourcesProvider = this.resourcesProvider) == null) ? null : resourcesProvider.getPaint("paintDivider");
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                measuredHeight = getMeasuredHeight() - 1;
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                measuredHeight2 = getMeasuredHeight() - 1;
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                measuredHeight = getMeasuredHeight() - 1;
                measuredWidth = getMeasuredWidth();
                measuredHeight2 = getMeasuredHeight() - 1;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth, measuredHeight2, paint2);
        }
        if (this.drawNameLock) {
            BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
            Theme.dialogs_lockDrawable.draw(canvas);
        }
        StaticLayout staticLayout = this.nameLayout;
        if (staticLayout != null) {
            if (LocaleController.isRTL) {
                i = (int) (this.nameLeft + staticLayout.getLineRight(0) + AndroidUtilities.dp(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                i = (this.nameLeft - AndroidUtilities.dp(3.0f)) - this.botVerificationDrawable.getIntrinsicWidth();
            } else {
                float lineWidth = this.nameLayout.getLineWidth(0);
                double d = this.nameLeft + this.nameWidth;
                double ceil = Math.ceil(lineWidth);
                Double.isNaN(d);
                double d2 = d - ceil;
                double dp2 = AndroidUtilities.dp(3.0f);
                Double.isNaN(dp2);
                double d3 = d2 - dp2;
                double intrinsicWidth = this.botVerificationDrawable.getIntrinsicWidth();
                Double.isNaN(intrinsicWidth);
                i = (int) (d3 - intrinsicWidth);
            }
            BaseCell.setDrawableBounds(this.botVerificationDrawable, i, this.nameTop + ((this.nameLayout.getHeight() - this.botVerificationDrawable.getIntrinsicHeight()) / 2.0f));
            this.botVerificationDrawable.draw(canvas);
            canvas.save();
            canvas.translate(this.nameLeft, this.nameTop);
            this.nameLayout.draw(canvas);
            canvas.restore();
            if (!LocaleController.isRTL) {
                lineRight = (int) (this.nameLeft + this.nameLayout.getLineRight(0) + AndroidUtilities.dp(6.0f));
            } else if (this.nameLayout.getLineLeft(0) == 0.0f) {
                lineRight = (this.nameLeft - AndroidUtilities.dp(3.0f)) - this.statusDrawable.getIntrinsicWidth();
            } else {
                float lineWidth2 = this.nameLayout.getLineWidth(0);
                double d4 = this.nameLeft + this.nameWidth;
                double ceil2 = Math.ceil(lineWidth2);
                Double.isNaN(d4);
                double dp3 = AndroidUtilities.dp(3.0f);
                Double.isNaN(dp3);
                double d5 = (d4 - ceil2) - dp3;
                double intrinsicWidth2 = this.statusDrawable.getIntrinsicWidth();
                Double.isNaN(intrinsicWidth2);
                lineRight = (int) (d5 - intrinsicWidth2);
            }
            BaseCell.setDrawableBounds(this.statusDrawable, lineRight, this.nameTop + ((this.nameLayout.getHeight() - this.statusDrawable.getIntrinsicHeight()) / 2.0f));
            this.statusDrawable.draw(canvas);
        }
        if (this.ad != null && this.adText != null && this.adBackgroundPaint != null) {
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
            this.adBackgroundPaint.setColor(Theme.multAlpha(color, 0.1f));
            int width = ((int) this.adText.getWidth()) + AndroidUtilities.dp(12.66f);
            int dp4 = AndroidUtilities.dp(17.33f);
            int dp5 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : (getWidth() - AndroidUtilities.dp(12.0f)) - width;
            float f = dp5;
            this.adBounds.set(f, this.nameTop, dp5 + width, r13 + dp4);
            this.adBounds.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            float scale = this.adBounce.getScale(0.1f);
            canvas.scale(scale, scale, this.adBounds.centerX(), this.adBounds.centerY());
            canvas.translate(f, this.nameTop);
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp4;
            rectF.set(0.0f, 0.0f, width, f2);
            float f3 = f2 / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, this.adBackgroundPaint);
            this.adText.draw(canvas, AndroidUtilities.dp(6.33f), f3, color, 1.0f);
            canvas.restore();
        }
        if (this.statusLayout != null) {
            canvas.save();
            canvas.translate(this.statusLeft + this.sublabelOffsetX, AndroidUtilities.dp(33.0f) + this.sublabelOffsetY);
            this.statusLayout.draw(canvas);
            canvas.restore();
        }
        if (this.countLayout != null) {
            this.rect.set(this.countLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + this.countWidth + AndroidUtilities.dp(11.0f), this.countTop + AndroidUtilities.dp(23.0f));
            RectF rectF2 = this.rect;
            float f4 = AndroidUtilities.density * 11.5f;
            canvas.drawRoundRect(rectF2, f4, f4, MessagesController.getInstance(this.currentAccount).isDialogMuted(this.dialog_id, 0L) ? Theme.dialogs_countGrayPaint : Theme.dialogs_countPaint);
            canvas.save();
            canvas.translate(this.countLeft, this.countTop + AndroidUtilities.dp(4.0f));
            this.countLayout.draw(canvas);
            canvas.restore();
        }
        if (this.actionLayout != null) {
            this.actionButton.setColor(Theme.getColor(Theme.key_chats_unreadCounter), Theme.getColor(Theme.key_chats_unreadCounterText));
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(this.actionLeft, this.countTop, r5 + this.actionLayout.getWidth(), this.countTop + AndroidUtilities.dp(23.0f));
            rectF3.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(4.0f));
            this.actionButton.setRect(rectF3);
            this.actionButton.setRounded(true);
            this.actionButton.draw(canvas);
            canvas.save();
            canvas.translate(this.actionLeft, this.countTop + AndroidUtilities.dp(4.0f));
            this.actionLayout.draw(canvas);
            canvas.restore();
        }
        if (!this.dontDrawAvatar) {
            TLRPC.Chat chat = this.chat;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.user;
                if (user != null) {
                    j = user.id;
                } else if (chat != null) {
                    j = -chat.id;
                } else {
                    this.avatarImage.setImageCoords(this.avatarStoryParams.originalAvatarRect);
                    this.avatarImage.draw(canvas);
                }
                StoriesUtilities.drawAvatarWithStory(j, canvas, this.avatarImage, this.avatarStoryParams);
            } else {
                if (this.bubbleClip == null) {
                    this.bubbleClip = new PhotoBubbleClip();
                }
                this.bubbleClip.setBounds((int) this.avatarStoryParams.originalAvatarRect.centerX(), (int) this.avatarStoryParams.originalAvatarRect.centerY(), (int) (this.avatarStoryParams.originalAvatarRect.width() / 2.0f));
                canvas.save();
                canvas.clipPath(this.bubbleClip);
                this.avatarImage.setImageCoords(this.avatarStoryParams.originalAvatarRect);
                this.avatarImage.draw(canvas);
                canvas.restore();
            }
        }
        float f5 = this.premiumBlockedT.set(this.premiumBlocked);
        if (f5 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f5, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f5, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.lockDrawable.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * f5)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f5)), (int) (centerX + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f5)), (int) (centerY + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f5)));
            this.lockDrawable.setAlpha((int) (f5 * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
        }
        if (!this.openBot || this.openButtonText == null) {
            return;
        }
        float dp6 = AndroidUtilities.dp(28.0f) + this.openButtonText.getCurrentWidth();
        float dp7 = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - dp6) - AndroidUtilities.dp(15.0f);
        float dp8 = AndroidUtilities.dp(28.0f);
        this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton));
        this.openButtonRect.set(dp7, (getHeight() - dp8) / 2.0f, dp6 + dp7, (getHeight() + dp8) / 2.0f);
        canvas.save();
        float scale2 = this.openButtonBounce.getScale(0.06f);
        canvas.scale(scale2, scale2, this.openButtonRect.centerX(), this.openButtonRect.centerY());
        RectF rectF4 = this.openButtonRect;
        canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
        this.openButtonText.draw(canvas, dp7 + AndroidUtilities.dp(14.0f), getHeight() / 2.0f, -1, 1.0f);
        canvas.restore();
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
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ProfileSearchCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.ad = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.allowEmojiStatus = z;
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        checkBox2.setChecked(z, z2);
    }

    public void setData(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        long messagesStarsPrice;
        this.currentName = charSequence;
        TL_account.RequirementToContact requirementToContact = null;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            this.user = user;
            this.chat = null;
            this.contact = null;
            if (this.showPremiumBlocked && user != null) {
                requirementToContact = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.user.id);
            }
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(this.allowBotOpenButton && this.user.bot_has_main_app);
        } else {
            if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                this.chat = chat;
                this.user = null;
                this.contact = null;
                TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
                this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContact2);
                messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact2);
            } else {
                if (obj instanceof ContactsController.Contact) {
                    ContactsController.Contact contact = (ContactsController.Contact) obj;
                    this.contact = contact;
                    this.chat = null;
                    this.user = null;
                    if (this.showPremiumBlocked && contact != null && contact.user != null) {
                        requirementToContact = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.contact.user.id);
                    }
                    this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
                    messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact);
                }
                setOpenBotButton(false);
            }
            this.starsPriceBlocked = messagesStarsPrice;
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
        if (this.openBot == z) {
            return;
        }
        if (this.openButtonText == null) {
            this.openButtonText = new Text(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        int currentWidth = z ? ((int) this.openButtonText.getCurrentWidth()) + AndroidUtilities.dp(30.0f) : 0;
        boolean z2 = LocaleController.isRTL;
        int i = z2 ? currentWidth : 0;
        if (z2) {
            currentWidth = 0;
        }
        setPadding(i, 0, currentWidth, 0);
        this.openBot = z;
        this.openButtonBounce.setPressed(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.rectangularAvatar = z;
    }

    public void setSublabelOffset(int i, int i2) {
        this.sublabelOffsetX = i;
        this.sublabelOffsetY = i2;
    }

    public ProfileSearchCell showPremiumBlock(boolean z) {
        this.showPremiumBlocked = z;
        return this;
    }

    public void update(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ProfileSearchCell.update(int):void");
    }

    @Override
    public void updateColors() {
        if (this.nameLayout == null || getMeasuredWidth() <= 0) {
            return;
        }
        buildLayout();
    }

    public void updateStatus(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        TLRPC.EmojiStatus emojiStatus;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
        swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
        boolean z3 = this.allowEmojiStatus;
        if (z3 && z) {
            swapAnimatedEmojiDrawable2.set(new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable, 0, 0), z2);
            this.statusDrawable.setColor(null);
        } else {
            if (z3 && user != null && !this.savedMessages && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                swapAnimatedEmojiDrawable = this.statusDrawable;
                emojiStatus = user.emoji_status;
            } else if (!this.allowEmojiStatus || chat == null || this.savedMessages || DialogObject.getEmojiStatusDocumentId(chat.emoji_status) == 0) {
                if (!this.allowEmojiStatus || user == null || this.savedMessages || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                    this.statusDrawable.set((Drawable) null, z2);
                } else {
                    this.statusDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z2);
                }
                this.statusDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
            } else {
                swapAnimatedEmojiDrawable = this.statusDrawable;
                emojiStatus = chat.emoji_status;
            }
            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(emojiStatus), z2);
            this.statusDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
        }
        long botVerificationIcon = user != null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        if (botVerificationIcon == 0 || this.savedMessages) {
            this.botVerificationDrawable.set((Drawable) null, z2);
        } else {
            this.botVerificationDrawable.set(botVerificationIcon, z2);
        }
        this.botVerificationDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
    }

    public ProfileSearchCell useCustomPaints() {
        this.customPaints = true;
        return this;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.statusDrawable == drawable || this.botVerificationDrawable == drawable || super.verifyDrawable(drawable);
    }
}
