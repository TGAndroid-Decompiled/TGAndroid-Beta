package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.PhoneFormat.C0832PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;

public class ProfileSearchCell extends BaseCell {
    private ImageReceiver avatarImage;
    private TLRPC$Chat chat;
    CheckBox2 checkBox;
    private StaticLayout countLayout;
    private int countLeft;
    private int countWidth;
    private CharSequence currentName;
    private long dialog_id;
    private boolean drawCheck;
    private boolean drawCount;
    private boolean drawNameBot;
    private boolean drawNameBroadcast;
    private boolean drawNameGroup;
    private boolean drawNameLock;
    private TLRPC$EncryptedChat encryptedChat;
    private TLRPC$FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private int lastUnreadCount;
    private StaticLayout nameLayout;
    private int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameTop;
    private int nameWidth;
    private boolean savedMessages;
    private StaticLayout statusLayout;
    private int statusLeft;
    private CharSequence subLabel;
    private int sublabelOffsetX;
    private int sublabelOffsetY;
    public boolean useSeparator;
    private TLRPC$User user;
    private int currentAccount = UserConfig.selectedAccount;
    private int countTop = AndroidUtilities.m34dp(19.0f);
    private RectF rect = new RectF();
    private AvatarDrawable avatarDrawable = new AvatarDrawable();

    public ProfileSearchCell(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.m34dp(23.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21);
        this.checkBox = checkBox2;
        checkBox2.setColor(null, "windowBackgroundWhite", "checkboxCheck");
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(3);
        addView(this.checkBox);
    }

    public void setData(TLObject tLObject, TLRPC$EncryptedChat tLRPC$EncryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.currentName = charSequence;
        if (tLObject instanceof TLRPC$User) {
            this.user = (TLRPC$User) tLObject;
            this.chat = null;
        } else if (tLObject instanceof TLRPC$Chat) {
            this.chat = (TLRPC$Chat) tLObject;
            this.user = null;
        }
        this.encryptedChat = tLRPC$EncryptedChat;
        this.subLabel = charSequence2;
        this.drawCount = z;
        this.savedMessages = z2;
        update(0);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(24.0f), 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m34dp(60.0f) + (this.useSeparator ? 1 : 0));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.user != null || this.chat != null || this.encryptedChat != null) {
            if (this.checkBox != null) {
                int dp = LocaleController.isRTL ? (i3 - i) - AndroidUtilities.m34dp(42.0f) : AndroidUtilities.m34dp(42.0f);
                int dp2 = AndroidUtilities.m34dp(36.0f);
                CheckBox2 checkBox2 = this.checkBox;
                checkBox2.layout(dp, dp2, checkBox2.getMeasuredWidth() + dp, this.checkBox.getMeasuredHeight() + dp2);
            }
            if (z) {
                buildLayout();
            }
        }
    }

    public TLRPC$User getUser() {
        return this.user;
    }

    public TLRPC$Chat getChat() {
        return this.chat;
    }

    public void setSublabelOffset(int i, int i2) {
        this.sublabelOffsetX = i;
        this.sublabelOffsetY = i2;
    }

    public void buildLayout() {
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        TextPaint textPaint;
        int i;
        String str;
        int i2;
        TLRPC$UserStatus tLRPC$UserStatus;
        String str2;
        int i3;
        String str3;
        String str4;
        this.drawNameBroadcast = false;
        this.drawNameLock = false;
        this.drawNameGroup = false;
        this.drawCheck = false;
        this.drawNameBot = false;
        if (this.encryptedChat != null) {
            this.drawNameLock = true;
            this.dialog_id = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.f854id);
            if (!LocaleController.isRTL) {
                this.nameLockLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 4) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
            } else {
                this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 2)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                this.nameLeft = AndroidUtilities.m34dp(11.0f);
            }
            this.nameLockTop = AndroidUtilities.m34dp(22.0f);
        } else {
            TLRPC$Chat tLRPC$Chat = this.chat;
            if (tLRPC$Chat != null) {
                this.dialog_id = -tLRPC$Chat.f843id;
                if (SharedConfig.drawDialogIcons) {
                    if (!ChatObject.isChannel(tLRPC$Chat) || this.chat.megagroup) {
                        this.drawNameGroup = true;
                        this.nameLockTop = AndroidUtilities.m34dp(24.0f);
                    } else {
                        this.drawNameBroadcast = true;
                        this.nameLockTop = AndroidUtilities.m34dp(22.5f);
                    }
                }
                this.drawCheck = this.chat.verified;
                if (SharedConfig.drawDialogIcons) {
                    if (!LocaleController.isRTL) {
                        this.nameLockLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
                        this.nameLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 4) + (this.drawNameGroup ? Theme.dialogs_groupDrawable : Theme.dialogs_broadcastDrawable).getIntrinsicWidth();
                    } else {
                        this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 2)) - (this.drawNameGroup ? Theme.dialogs_groupDrawable : Theme.dialogs_broadcastDrawable).getIntrinsicWidth();
                        this.nameLeft = AndroidUtilities.m34dp(11.0f);
                    }
                } else if (!LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
                } else {
                    this.nameLeft = AndroidUtilities.m34dp(11.0f);
                }
            } else {
                TLRPC$User tLRPC$User = this.user;
                if (tLRPC$User != null) {
                    this.dialog_id = tLRPC$User.f974id;
                    if (!LocaleController.isRTL) {
                        this.nameLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.nameLeft = AndroidUtilities.m34dp(11.0f);
                    }
                    if (SharedConfig.drawDialogIcons) {
                        TLRPC$User tLRPC$User2 = this.user;
                        if (tLRPC$User2.bot && !MessagesController.isSupportUser(tLRPC$User2)) {
                            this.drawNameBot = true;
                            if (!LocaleController.isRTL) {
                                this.nameLockLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
                                this.nameLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 4) + Theme.dialogs_botDrawable.getIntrinsicWidth();
                            } else {
                                this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.m34dp(AndroidUtilities.leftBaseline + 2)) - Theme.dialogs_botDrawable.getIntrinsicWidth();
                                this.nameLeft = AndroidUtilities.m34dp(11.0f);
                            }
                            this.nameLockTop = AndroidUtilities.m34dp(20.5f);
                            this.drawCheck = this.user.verified;
                        }
                    }
                    this.nameLockTop = AndroidUtilities.m34dp(21.0f);
                    this.drawCheck = this.user.verified;
                }
            }
        }
        String str5 = this.currentName;
        if (str5 == null) {
            TLRPC$Chat tLRPC$Chat2 = this.chat;
            if (tLRPC$Chat2 != null) {
                str4 = tLRPC$Chat2.title;
            } else {
                TLRPC$User tLRPC$User3 = this.user;
                str4 = tLRPC$User3 != null ? UserObject.getUserName(tLRPC$User3) : "";
            }
            str5 = str4.replace('\n', ' ');
        }
        if (str5.length() == 0) {
            TLRPC$User tLRPC$User4 = this.user;
            if (tLRPC$User4 == null || (str3 = tLRPC$User4.phone) == null || str3.length() == 0) {
                str5 = LocaleController.getString("HiddenName", C0890R.string.HiddenName);
            } else {
                str5 = C0832PhoneFormat.getInstance().format("+" + this.user.phone);
            }
        }
        if (this.encryptedChat != null) {
            textPaint = Theme.dialogs_searchNameEncryptedPaint;
        } else {
            textPaint = Theme.dialogs_searchNamePaint;
        }
        TextPaint textPaint2 = textPaint;
        if (!LocaleController.isRTL) {
            i = (getMeasuredWidth() - this.nameLeft) - AndroidUtilities.m34dp(14.0f);
            this.nameWidth = i;
        } else {
            i = (getMeasuredWidth() - this.nameLeft) - AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
            this.nameWidth = i;
        }
        if (this.drawNameLock) {
            this.nameWidth -= AndroidUtilities.m34dp(6.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        } else if (this.drawNameBroadcast) {
            this.nameWidth -= AndroidUtilities.m34dp(6.0f) + Theme.dialogs_broadcastDrawable.getIntrinsicWidth();
        } else if (this.drawNameGroup) {
            this.nameWidth -= AndroidUtilities.m34dp(6.0f) + Theme.dialogs_groupDrawable.getIntrinsicWidth();
        } else if (this.drawNameBot) {
            this.nameWidth -= AndroidUtilities.m34dp(6.0f) + Theme.dialogs_botDrawable.getIntrinsicWidth();
        }
        this.nameWidth -= getPaddingLeft() + getPaddingRight();
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        if (this.drawCount) {
            TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialog_id);
            if (tLRPC$Dialog == null || (i3 = tLRPC$Dialog.unread_count) == 0) {
                this.lastUnreadCount = 0;
                this.countLayout = null;
            } else {
                this.lastUnreadCount = i3;
                String format = String.format("%d", Integer.valueOf(i3));
                this.countWidth = Math.max(AndroidUtilities.m34dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format)));
                this.countLayout = new StaticLayout(format, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp = this.countWidth + AndroidUtilities.m34dp(18.0f);
                this.nameWidth -= dp;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.m34dp(19.0f);
                } else {
                    this.countLeft = AndroidUtilities.m34dp(19.0f);
                    this.nameLeft += dp;
                }
            }
        } else {
            this.lastUnreadCount = 0;
            this.countLayout = null;
        }
        if (this.nameWidth < 0) {
            this.nameWidth = 0;
        }
        this.nameLayout = new StaticLayout(TextUtils.ellipsize(str5, textPaint2, this.nameWidth - AndroidUtilities.m34dp(12.0f), TextUtils.TruncateAt.END), textPaint2, this.nameWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        TextPaint textPaint3 = Theme.dialogs_offlinePaint;
        if (!LocaleController.isRTL) {
            this.statusLeft = AndroidUtilities.m34dp(AndroidUtilities.leftBaseline);
        } else {
            this.statusLeft = AndroidUtilities.m34dp(11.0f);
        }
        TLRPC$Chat tLRPC$Chat3 = this.chat;
        if (tLRPC$Chat3 == null || this.subLabel != null) {
            str = this.subLabel;
            if (str == null) {
                TLRPC$User tLRPC$User5 = this.user;
                if (tLRPC$User5 == null) {
                    str = null;
                } else if (MessagesController.isSupportUser(tLRPC$User5)) {
                    str = LocaleController.getString("SupportStatus", C0890R.string.SupportStatus);
                } else {
                    TLRPC$User tLRPC$User6 = this.user;
                    if (tLRPC$User6.bot) {
                        str = LocaleController.getString("Bot", C0890R.string.Bot);
                    } else {
                        long j = tLRPC$User6.f974id;
                        if (j == 333000 || j == 777000) {
                            str = LocaleController.getString("ServiceNotifications", C0890R.string.ServiceNotifications);
                        } else {
                            str = LocaleController.formatUserStatus(this.currentAccount, tLRPC$User6);
                            TLRPC$User tLRPC$User7 = this.user;
                            if (tLRPC$User7 != null && (tLRPC$User7.f974id == UserConfig.getInstance(this.currentAccount).getClientUserId() || ((tLRPC$UserStatus = this.user.status) != null && tLRPC$UserStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()))) {
                                textPaint3 = Theme.dialogs_onlinePaint;
                                str = LocaleController.getString("Online", C0890R.string.Online);
                            }
                        }
                    }
                }
            }
            if (this.savedMessages || UserObject.isReplyUser(this.user)) {
                this.nameTop = AndroidUtilities.m34dp(20.0f);
                str = null;
            }
        } else {
            if (ChatObject.isChannel(tLRPC$Chat3)) {
                TLRPC$Chat tLRPC$Chat4 = this.chat;
                if (!tLRPC$Chat4.megagroup) {
                    int i4 = tLRPC$Chat4.participants_count;
                    if (i4 != 0) {
                        str2 = LocaleController.formatPluralString("Subscribers", i4);
                    } else if (TextUtils.isEmpty(tLRPC$Chat4.username)) {
                        str2 = LocaleController.getString("ChannelPrivate", C0890R.string.ChannelPrivate).toLowerCase();
                    } else {
                        str2 = LocaleController.getString("ChannelPublic", C0890R.string.ChannelPublic).toLowerCase();
                    }
                    str = str2;
                    this.nameTop = AndroidUtilities.m34dp(19.0f);
                }
            }
            TLRPC$Chat tLRPC$Chat5 = this.chat;
            int i5 = tLRPC$Chat5.participants_count;
            if (i5 != 0) {
                str2 = LocaleController.formatPluralString("Members", i5);
            } else if (tLRPC$Chat5.has_geo) {
                str2 = LocaleController.getString("MegaLocation", C0890R.string.MegaLocation);
            } else if (TextUtils.isEmpty(tLRPC$Chat5.username)) {
                str2 = LocaleController.getString("MegaPrivate", C0890R.string.MegaPrivate).toLowerCase();
            } else {
                str2 = LocaleController.getString("MegaPublic", C0890R.string.MegaPublic).toLowerCase();
            }
            str = str2;
            this.nameTop = AndroidUtilities.m34dp(19.0f);
        }
        TextPaint textPaint4 = textPaint3;
        if (!TextUtils.isEmpty(str)) {
            this.statusLayout = new StaticLayout(TextUtils.ellipsize(str, textPaint4, paddingLeft - AndroidUtilities.m34dp(12.0f), TextUtils.TruncateAt.END), textPaint4, paddingLeft, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.nameTop = AndroidUtilities.m34dp(9.0f);
            this.nameLockTop -= AndroidUtilities.m34dp(10.0f);
        } else {
            this.nameTop = AndroidUtilities.m34dp(20.0f);
            this.statusLayout = null;
        }
        if (LocaleController.isRTL) {
            i2 = (getMeasuredWidth() - AndroidUtilities.m34dp(57.0f)) - getPaddingRight();
        } else {
            i2 = AndroidUtilities.m34dp(11.0f) + getPaddingLeft();
        }
        this.avatarImage.setImageCoords(i2, AndroidUtilities.m34dp(7.0f), AndroidUtilities.m34dp(46.0f), AndroidUtilities.m34dp(46.0f));
        if (LocaleController.isRTL) {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.nameLayout.getLineWidth(0));
                int i6 = this.nameWidth;
                if (ceil < i6) {
                    double d = this.nameLeft;
                    double d2 = i6;
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    this.nameLeft = (int) (d + (d2 - ceil));
                }
            }
            StaticLayout staticLayout = this.statusLayout;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.statusLayout.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d3 = paddingLeft;
                if (ceil2 < d3) {
                    double d4 = this.statusLeft;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    this.statusLeft = (int) (d4 + (d3 - ceil2));
                }
            }
        } else {
            if (this.nameLayout.getLineCount() > 0 && this.nameLayout.getLineRight(0) == this.nameWidth) {
                double ceil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                int i7 = this.nameWidth;
                if (ceil3 < i7) {
                    double d5 = this.nameLeft;
                    double d6 = i7;
                    Double.isNaN(d6);
                    Double.isNaN(d5);
                    this.nameLeft = (int) (d5 - (d6 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.statusLayout;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.statusLayout.getLineRight(0) == paddingLeft) {
                double ceil4 = Math.ceil(this.statusLayout.getLineWidth(0));
                double d7 = paddingLeft;
                if (ceil4 < d7) {
                    double d8 = this.statusLeft;
                    Double.isNaN(d7);
                    Double.isNaN(d8);
                    this.statusLeft = (int) (d8 - (d7 - ceil4));
                }
            }
        }
        this.nameLeft += getPaddingLeft();
        this.statusLeft += getPaddingLeft();
        this.nameLockLeft += getPaddingLeft();
    }

    public void update(int i) {
        TLRPC$Dialog tLRPC$Dialog;
        String str;
        TLRPC$User tLRPC$User;
        TLRPC$FileLocation tLRPC$FileLocation;
        TLRPC$User tLRPC$User2 = this.user;
        TLRPC$FileLocation tLRPC$FileLocation2 = null;
        boolean z = true;
        if (tLRPC$User2 != null) {
            this.avatarDrawable.setInfo(tLRPC$User2);
            if (UserObject.isReplyUser(this.user)) {
                this.avatarDrawable.setAvatarType(12);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
            } else if (this.savedMessages) {
                this.avatarDrawable.setAvatarType(1);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
            } else {
                TLRPC$User tLRPC$User3 = this.user;
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User3.photo;
                if (tLRPC$UserProfilePhoto != null) {
                    tLRPC$FileLocation2 = tLRPC$UserProfilePhoto.photo_small;
                }
                this.avatarImage.setImage(ImageLocation.getForUserOrChat(tLRPC$User3, 1), "50_50", ImageLocation.getForUserOrChat(this.user, 2), "50_50", this.avatarDrawable, this.user, 0);
            }
        } else {
            TLRPC$Chat tLRPC$Chat = this.chat;
            if (tLRPC$Chat != null) {
                TLRPC$ChatPhoto tLRPC$ChatPhoto = tLRPC$Chat.photo;
                if (tLRPC$ChatPhoto != null) {
                    tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_small;
                }
                this.avatarDrawable.setInfo(tLRPC$Chat);
                this.avatarImage.setImage(ImageLocation.getForUserOrChat(this.chat, 1), "50_50", ImageLocation.getForUserOrChat(this.chat, 2), "50_50", this.avatarDrawable, this.chat, 0);
            } else {
                this.avatarDrawable.setInfo(0L, null, null);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
            }
        }
        if (i != 0) {
            boolean z2 = !(((MessagesController.UPDATE_MASK_AVATAR & i) == 0 || this.user == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i) == 0 || this.chat == null)) && (((tLRPC$FileLocation = this.lastAvatar) != null && tLRPC$FileLocation2 == null) || ((tLRPC$FileLocation == null && tLRPC$FileLocation2 != null) || !(tLRPC$FileLocation == null || (tLRPC$FileLocation.volume_id == tLRPC$FileLocation2.volume_id && tLRPC$FileLocation.local_id == tLRPC$FileLocation2.local_id))));
            if (!(z2 || (MessagesController.UPDATE_MASK_STATUS & i) == 0 || (tLRPC$User = this.user) == null)) {
                TLRPC$UserStatus tLRPC$UserStatus = tLRPC$User.status;
                if ((tLRPC$UserStatus != null ? tLRPC$UserStatus.expires : 0) != this.lastStatus) {
                    z2 = true;
                }
            }
            if (!((z2 || (MessagesController.UPDATE_MASK_NAME & i) == 0 || this.user == null) && ((MessagesController.UPDATE_MASK_CHAT_NAME & i) == 0 || this.chat == null))) {
                if (this.user != null) {
                    str = this.user.first_name + this.user.last_name;
                } else {
                    str = this.chat.title;
                }
                if (!str.equals(this.lastName)) {
                    z2 = true;
                }
            }
            if (z2 || !this.drawCount || (i & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialog_id)) == null || tLRPC$Dialog.unread_count == this.lastUnreadCount) {
                z = z2;
            }
            if (!z) {
                return;
            }
        }
        TLRPC$User tLRPC$User4 = this.user;
        if (tLRPC$User4 != null) {
            TLRPC$UserStatus tLRPC$UserStatus2 = tLRPC$User4.status;
            if (tLRPC$UserStatus2 != null) {
                this.lastStatus = tLRPC$UserStatus2.expires;
            } else {
                this.lastStatus = 0;
            }
            this.lastName = this.user.first_name + this.user.last_name;
        } else {
            TLRPC$Chat tLRPC$Chat2 = this.chat;
            if (tLRPC$Chat2 != null) {
                this.lastName = tLRPC$Chat2.title;
            }
        }
        this.lastAvatar = tLRPC$FileLocation2;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            buildLayout();
        }
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int dp;
        int i;
        if (this.user != null || this.chat != null || this.encryptedChat != null) {
            if (this.useSeparator) {
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.m34dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
                } else {
                    canvas.drawLine(AndroidUtilities.m34dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            }
            if (this.drawNameLock) {
                BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_lockDrawable.draw(canvas);
            } else if (this.drawNameGroup) {
                BaseCell.setDrawableBounds(Theme.dialogs_groupDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_groupDrawable.draw(canvas);
            } else if (this.drawNameBroadcast) {
                BaseCell.setDrawableBounds(Theme.dialogs_broadcastDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_broadcastDrawable.draw(canvas);
            } else if (this.drawNameBot) {
                BaseCell.setDrawableBounds(Theme.dialogs_botDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_botDrawable.draw(canvas);
            }
            if (this.nameLayout != null) {
                canvas.save();
                canvas.translate(this.nameLeft, this.nameTop);
                this.nameLayout.draw(canvas);
                canvas.restore();
                if (this.drawCheck) {
                    if (!LocaleController.isRTL) {
                        i = (int) (this.nameLeft + this.nameLayout.getLineRight(0) + AndroidUtilities.m34dp(6.0f));
                    } else if (this.nameLayout.getLineLeft(0) == 0.0f) {
                        i = (this.nameLeft - AndroidUtilities.m34dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
                    } else {
                        float lineWidth = this.nameLayout.getLineWidth(0);
                        double d = this.nameLeft + this.nameWidth;
                        double ceil = Math.ceil(lineWidth);
                        Double.isNaN(d);
                        double dp2 = AndroidUtilities.m34dp(6.0f);
                        Double.isNaN(dp2);
                        double d2 = (d - ceil) - dp2;
                        double intrinsicWidth = Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
                        Double.isNaN(intrinsicWidth);
                        i = (int) (d2 - intrinsicWidth);
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, i, this.nameTop + AndroidUtilities.m34dp(3.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, i, this.nameTop + AndroidUtilities.m34dp(3.0f));
                    Theme.dialogs_verifiedDrawable.draw(canvas);
                    Theme.dialogs_verifiedCheckDrawable.draw(canvas);
                }
            }
            if (this.statusLayout != null) {
                canvas.save();
                canvas.translate(this.statusLeft + this.sublabelOffsetX, AndroidUtilities.m34dp(33.0f) + this.sublabelOffsetY);
                this.statusLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countLayout != null) {
                this.rect.set(this.countLeft - AndroidUtilities.m34dp(5.5f), this.countTop, dp + this.countWidth + AndroidUtilities.m34dp(11.0f), this.countTop + AndroidUtilities.m34dp(23.0f));
                RectF rectF = this.rect;
                float f = AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f * 11.5f, f * 11.5f, MessagesController.getInstance(this.currentAccount).isDialogMuted(this.dialog_id) ? Theme.dialogs_countGrayPaint : Theme.dialogs_countPaint);
                canvas.save();
                canvas.translate(this.countLeft, this.countTop + AndroidUtilities.m34dp(4.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            this.avatarImage.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.nameLayout;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.statusLayout != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.statusLayout.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    public long getDialogId() {
        return this.dialog_id;
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, z2);
        }
    }
}
