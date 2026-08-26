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

public final class DialogMeUrlCell extends BaseCell {
    public final AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImage;
    public final int avatarTop;
    public final int currentAccount;
    public boolean drawVerified;
    public boolean isSelected;
    public StaticLayout messageLayout;
    public int messageLeft;
    public final int messageTop;
    public StaticLayout nameLayout;
    public int nameLeft;
    public int nameMuteLeft;
    public TLRPC.RecentMeUrl recentMeUrl;

    public DialogMeUrlCell(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        this.avatarDrawable = new AvatarDrawable();
        this.messageTop = AndroidUtilities.dp(40.0f);
        this.avatarTop = AndroidUtilities.dp(10.0f);
        this.currentAccount = UserConfig.selectedAccount;
        Theme.createDialogsResources(context);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.isSelected) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_tabletSeletedPaint);
        } else {
            canvas2 = canvas;
        }
        if (this.nameLayout != null) {
            canvas2.save();
            canvas2.translate(this.nameLeft, AndroidUtilities.dp(13.0f));
            this.nameLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.messageLayout != null) {
            canvas2.save();
            canvas2.translate(this.messageLeft, this.messageTop);
            try {
                this.messageLayout.draw(canvas2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            canvas2.restore();
        }
        if (this.drawVerified) {
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft, AndroidUtilities.dp(16.5f));
            Theme.dialogs_verifiedDrawable.draw(canvas2);
            Theme.dialogs_verifiedCheckDrawable.draw(canvas2);
        }
        this.avatarImage.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String userName;
        int measuredWidth;
        int iDp;
        int i5;
        int measuredWidth2;
        if (z) {
            TextPaint textPaint = Theme.dialogs_namePaint[0];
            TextPaint textPaint2 = Theme.dialogs_messagePaint[0];
            this.drawVerified = false;
            TLRPC.RecentMeUrl recentMeUrl = this.recentMeUrl;
            boolean z2 = recentMeUrl instanceof TLRPC.TL_recentMeUrlChat;
            int i6 = this.currentAccount;
            ImageReceiver imageReceiver = this.avatarImage;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            if (z2) {
                TLRPC.Chat chat = MessagesController.getInstance(i6).getChat(Long.valueOf(this.recentMeUrl.chat_id));
                this.drawVerified = chat.verified;
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
                userName = chat.title;
                avatarDrawable.setInfo(i6, chat);
                imageReceiver.setForUserOrChat(chat, avatarDrawable, this.recentMeUrl);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUser) {
                TLRPC.User user = MessagesController.getInstance(i6).getUser(Long.valueOf(this.recentMeUrl.user_id));
                if (LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                if (user != null) {
                    if (user.bot) {
                        AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            getMeasuredWidth();
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.nameLeft = AndroidUtilities.dp(14.0f);
                        } else {
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                        }
                    }
                    this.drawVerified = user.verified;
                }
                userName = UserObject.getUserName(user);
                avatarDrawable.setInfo(i6, user);
                imageReceiver.setForUserOrChat(user, avatarDrawable, this.recentMeUrl);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
                if (LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                userName = this.recentMeUrl.set.set.title;
                avatarDrawable.setInfo(5L, userName, null);
                imageReceiver.setImage(ImageLocation.getForDocument(this.recentMeUrl.set.cover), null, avatarDrawable, null, this.recentMeUrl, 0);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
                if (LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                TLRPC.ChatInvite chatInvite = this.recentMeUrl.chat_invite;
                TLRPC.Chat chat2 = chatInvite.chat;
                if (chat2 != null) {
                    avatarDrawable.setInfo(i6, chat2);
                    TLRPC.RecentMeUrl recentMeUrl2 = this.recentMeUrl;
                    TLRPC.Chat chat3 = recentMeUrl2.chat_invite.chat;
                    String str = chat3.title;
                    this.drawVerified = chat3.verified;
                    imageReceiver.setForUserOrChat(chat3, avatarDrawable, recentMeUrl2);
                    userName = str;
                } else {
                    String str2 = chatInvite.title;
                    avatarDrawable.setInfo(5L, str2, null);
                    imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(this.recentMeUrl.chat_invite.photo.sizes, 50), this.recentMeUrl.chat_invite.photo), "50_50", avatarDrawable, null, this.recentMeUrl, 0);
                    userName = str2;
                }
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
                if (LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(14.0f);
                } else {
                    this.nameLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                imageReceiver.setImage(null, null, avatarDrawable, null, this.recentMeUrl, 0);
                userName = "Url";
            } else {
                imageReceiver.setImage(null, null, avatarDrawable, null, recentMeUrl, 0);
                userName = "";
            }
            String str3 = MessagesController.getInstance(i6).linkPrefix + "/" + this.recentMeUrl.url;
            if (TextUtils.isEmpty(userName)) {
                userName = LocaleController.getString(R.string.HiddenName);
            }
            if (LocaleController.isRTL) {
                measuredWidth = getMeasuredWidth() - this.nameLeft;
                iDp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                measuredWidth = getMeasuredWidth() - this.nameLeft;
                iDp = AndroidUtilities.dp(14.0f);
            }
            int i7 = measuredWidth - iDp;
            if (this.drawVerified) {
                int intrinsicWidth = Theme.dialogs_verifiedDrawable.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                i7 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.nameLeft += intrinsicWidth;
                }
            }
            int iMax = Math.max(AndroidUtilities.dp(12.0f), i7);
            try {
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(userName.replace('\n', ' '), textPaint, iMax - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, iMax, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                i5 = iMax;
                try {
                    this.nameLayout = staticLayout;
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                }
            } catch (Exception e2) {
                e = e2;
                i5 = iMax;
            }
            int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
            if (LocaleController.isRTL) {
                this.messageLeft = AndroidUtilities.dp(16.0f);
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 65.0f : 61.0f);
            } else {
                this.messageLeft = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                measuredWidth2 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 13.0f : 9.0f);
            }
            imageReceiver.setImageCoords(measuredWidth2, this.avatarTop, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
            int iMax2 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth3);
            try {
                this.messageLayout = new StaticLayout(TextUtils.ellipsize(str3, textPaint2, iMax2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint2, iMax2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.nameLayout;
                if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                    float lineLeft = this.nameLayout.getLineLeft(0);
                    double dCeil = Math.ceil(this.nameLayout.getLineWidth(0));
                    if (this.drawVerified) {
                        this.nameMuteLeft = (int) ((((((double) i5) - dCeil) + ((double) this.nameLeft)) - ((double) AndroidUtilities.dp(6.0f))) - ((double) Theme.dialogs_verifiedDrawable.getIntrinsicWidth()));
                    }
                    if (lineLeft == 0.0f) {
                        double d = i5;
                        if (dCeil < d) {
                            this.nameLeft = (int) ((d - dCeil) + ((double) this.nameLeft));
                        }
                    }
                }
                StaticLayout staticLayout3 = this.messageLayout;
                if (staticLayout3 == null || staticLayout3.getLineCount() <= 0 || this.messageLayout.getLineLeft(0) != 0.0f) {
                    return;
                }
                double dCeil2 = Math.ceil(this.messageLayout.getLineWidth(0));
                double d2 = iMax2;
                if (dCeil2 < d2) {
                    this.messageLeft = (int) ((d2 - dCeil2) + ((double) this.messageLeft));
                    return;
                }
                return;
            }
            StaticLayout staticLayout4 = this.nameLayout;
            if (staticLayout4 != null && staticLayout4.getLineCount() > 0) {
                float lineRight = this.nameLayout.getLineRight(0);
                if (lineRight == i5) {
                    double dCeil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                    double d3 = i5;
                    if (dCeil3 < d3) {
                        this.nameLeft = (int) (((double) this.nameLeft) - (d3 - dCeil3));
                    }
                }
                if (this.drawVerified) {
                    this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                }
            }
            StaticLayout staticLayout5 = this.messageLayout;
            if (staticLayout5 == null || staticLayout5.getLineCount() <= 0 || this.messageLayout.getLineRight(0) != iMax2) {
                return;
            }
            double dCeil4 = Math.ceil(this.messageLayout.getLineWidth(0));
            double d4 = iMax2;
            if (dCeil4 < d4) {
                this.messageLeft = (int) (((double) this.messageLeft) - (d4 - dCeil4));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.recentMeUrl = recentMeUrl;
        requestLayout();
    }
}
