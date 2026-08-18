package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;

public class DialogMeUrlCell extends BaseCell {
    private AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImage;
    private int avatarTop;
    private int currentAccount;
    private boolean drawNameLock;
    private boolean drawVerified;
    private boolean isSelected;
    private StaticLayout messageLayout;
    private int messageLeft;
    private int messageTop;
    private StaticLayout nameLayout;
    private int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameMuteLeft;
    private TLRPC.RecentMeUrl recentMeUrl;
    public boolean useSeparator;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public DialogMeUrlCell(Context context) {
        super(context);
        this.avatarImage = new ImageReceiver(this);
        this.avatarDrawable = new AvatarDrawable();
        this.messageTop = AndroidUtilities.dp(40.0f);
        this.avatarTop = AndroidUtilities.dp(10.0f);
        this.currentAccount = UserConfig.selectedAccount;
        Theme.createDialogsResources(context);
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.recentMeUrl = recentMeUrl;
        requestLayout();
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(72.0f) + (this.useSeparator ? 1 : 0));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            buildLayout();
        }
    }

    public void buildLayout() {
        String userName;
        int measuredWidth;
        int iDp;
        int measuredWidth2;
        TextPaint textPaint = Theme.dialogs_namePaint[0];
        TextPaint textPaint2 = Theme.dialogs_messagePaint[0];
        this.drawNameLock = false;
        this.drawVerified = false;
        TLRPC.RecentMeUrl recentMeUrl = this.recentMeUrl;
        if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.recentMeUrl.chat_id));
            this.drawVerified = chat.verified;
            if (!LocaleController.isRTL) {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            userName = chat.title;
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.avatarImage.setForUserOrChat(chat, this.avatarDrawable, this.recentMeUrl);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUser) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.recentMeUrl.user_id));
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            if (user != null) {
                if (user.bot) {
                    this.nameLockTop = AndroidUtilities.dp(16.5f);
                    if (!LocaleController.isRTL) {
                        this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                        this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                    } else {
                        this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                        this.nameLeft = AndroidUtilities.dp(14.0f);
                    }
                }
                this.drawVerified = user.verified;
            }
            userName = UserObject.getUserName(user);
            this.avatarDrawable.setInfo(this.currentAccount, user);
            this.avatarImage.setForUserOrChat(user, this.avatarDrawable, this.recentMeUrl);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            userName = this.recentMeUrl.set.set.title;
            this.avatarDrawable.setInfo(5L, userName, null);
            this.avatarImage.setImage(ImageLocation.getForDocument(this.recentMeUrl.set.cover), null, this.avatarDrawable, null, this.recentMeUrl, 0);
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            TLRPC.ChatInvite chatInvite = this.recentMeUrl.chat_invite;
            TLRPC.Chat chat2 = chatInvite.chat;
            if (chat2 != null) {
                this.avatarDrawable.setInfo(this.currentAccount, chat2);
                TLRPC.RecentMeUrl recentMeUrl2 = this.recentMeUrl;
                TLRPC.Chat chat3 = recentMeUrl2.chat_invite.chat;
                String str = chat3.title;
                this.drawVerified = chat3.verified;
                this.avatarImage.setForUserOrChat(chat3, this.avatarDrawable, recentMeUrl2);
                userName = str;
            } else {
                String str2 = chatInvite.title;
                this.avatarDrawable.setInfo(5L, str2, null);
                this.avatarImage.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(this.recentMeUrl.chat_invite.photo.sizes, 50), this.recentMeUrl.chat_invite.photo), "50_50", this.avatarDrawable, null, this.recentMeUrl, 0);
                userName = str2;
            }
            if (!LocaleController.isRTL) {
                this.nameLockLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.nameLockLeft = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
        } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
            if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                this.nameLeft = AndroidUtilities.dp(14.0f);
            }
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.recentMeUrl, 0);
            userName = "Url";
        } else {
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, recentMeUrl, 0);
            userName = "";
        }
        String str3 = MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + this.recentMeUrl.url;
        if (TextUtils.isEmpty(userName)) {
            userName = LocaleController.getString(R.string.HiddenName);
        }
        if (!LocaleController.isRTL) {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            iDp = AndroidUtilities.dp(14.0f);
        } else {
            measuredWidth = getMeasuredWidth() - this.nameLeft;
            iDp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        int iDp2 = measuredWidth - iDp;
        if (this.drawNameLock) {
            iDp2 -= AndroidUtilities.dp(4.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (this.drawVerified) {
            int iDp3 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            iDp2 -= iDp3;
            if (LocaleController.isRTL) {
                this.nameLeft += iDp3;
            }
        }
        int iMax = Math.max(AndroidUtilities.dp(12.0f), iDp2);
        try {
            this.nameLayout = new StaticLayout(TextUtils.ellipsize(userName.replace('\n', ' '), textPaint, iMax - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, iMax, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } catch (Exception e) {
            FileLog.e(e);
        }
        int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
        if (!LocaleController.isRTL) {
            this.messageLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            measuredWidth2 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 13.0f : 9.0f);
        } else {
            this.messageLeft = AndroidUtilities.dp(16.0f);
            measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 65.0f : 61.0f);
        }
        this.avatarImage.setImageCoords(measuredWidth2, this.avatarTop, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
        int iMax2 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth3);
        try {
            this.messageLayout = new StaticLayout(TextUtils.ellipsize(str3, textPaint2, iMax2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint2, iMax2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        if (LocaleController.isRTL) {
            StaticLayout staticLayout = this.nameLayout;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                float lineLeft = this.nameLayout.getLineLeft(0);
                double dCeil = Math.ceil(this.nameLayout.getLineWidth(0));
                if (this.drawVerified) {
                    this.nameMuteLeft = (int) (((((double) this.nameLeft) + (((double) iMax) - dCeil)) - ((double) AndroidUtilities.dp(6.0f))) - ((double) Theme.dialogs_verifiedDrawable.getIntrinsicWidth()));
                }
                if (lineLeft == 0.0f) {
                    double d = iMax;
                    if (dCeil < d) {
                        this.nameLeft = (int) (((double) this.nameLeft) + (d - dCeil));
                    }
                }
            }
            StaticLayout staticLayout2 = this.messageLayout;
            if (staticLayout2 == null || staticLayout2.getLineCount() <= 0 || this.messageLayout.getLineLeft(0) != 0.0f) {
                return;
            }
            double dCeil2 = Math.ceil(this.messageLayout.getLineWidth(0));
            double d2 = iMax2;
            if (dCeil2 < d2) {
                this.messageLeft = (int) (((double) this.messageLeft) + (d2 - dCeil2));
                return;
            }
            return;
        }
        StaticLayout staticLayout3 = this.nameLayout;
        if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
            float lineRight = this.nameLayout.getLineRight(0);
            if (lineRight == iMax) {
                double dCeil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                double d3 = iMax;
                if (dCeil3 < d3) {
                    this.nameLeft = (int) (((double) this.nameLeft) - (d3 - dCeil3));
                }
            }
            if (this.drawVerified) {
                this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
            }
        }
        StaticLayout staticLayout4 = this.messageLayout;
        if (staticLayout4 == null || staticLayout4.getLineCount() <= 0 || this.messageLayout.getLineRight(0) != iMax2) {
            return;
        }
        double dCeil4 = Math.ceil(this.messageLayout.getLineWidth(0));
        double d4 = iMax2;
        if (dCeil4 < d4) {
            this.messageLeft = (int) (((double) this.messageLeft) - (d4 - dCeil4));
        }
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.isSelected) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_tabletSeletedPaint);
        }
        if (this.drawNameLock) {
            BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
            Theme.dialogs_lockDrawable.draw(canvas);
        }
        if (this.nameLayout != null) {
            canvas.save();
            canvas.translate(this.nameLeft, AndroidUtilities.dp(13.0f));
            this.nameLayout.draw(canvas);
            canvas.restore();
        }
        if (this.messageLayout != null) {
            canvas.save();
            canvas.translate(this.messageLeft, this.messageTop);
            try {
                this.messageLayout.draw(canvas);
            } catch (Exception e) {
                FileLog.e(e);
            }
            canvas.restore();
        }
        if (this.drawVerified) {
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            Theme.dialogs_verifiedDrawable.draw(canvas);
            Theme.dialogs_verifiedCheckDrawable.draw(canvas);
        }
        if (this.useSeparator) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
        this.avatarImage.draw(canvas);
    }
}
