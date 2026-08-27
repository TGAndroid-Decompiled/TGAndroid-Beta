package org.telegram.ui.Cells;

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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class q2 extends a0 {
    public boolean A;
    public int B;
    public boolean C;
    public int D;

    public TLRPC.RecentMeUrl f25040f;
    public ImageReceiver h;

    public org.telegram.ui.Components.y8 f25041n;

    public int f25042r;

    public StaticLayout f25043s;
    public int v;

    public int f25044w;

    public int f25045x;

    public StaticLayout f25046y;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.C) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23351u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f25043s != null) {
            canvas2.save();
            canvas2.translate(this.f25042r, AndroidUtilities.dp(13.0f));
            this.f25043s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f25046y != null) {
            canvas2.save();
            canvas2.translate(this.f25045x, this.f25044w);
            try {
                this.f25046y.draw(canvas2);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            canvas2.restore();
        }
        if (this.A) {
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.g6.f23085f1);
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.g6.f23139i1);
            org.telegram.ui.ActionBar.g6.f23085f1.draw(canvas2);
            org.telegram.ui.ActionBar.g6.f23139i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        String userName;
        int measuredWidth;
        int iDp;
        int i14;
        TextPaint textPaint;
        int measuredWidth2;
        int i15;
        if (z10) {
            int i16 = this.D;
            ImageReceiver imageReceiver = this.h;
            org.telegram.ui.Components.y8 y8Var = this.f25041n;
            TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.B0[0];
            TextPaint textPaint3 = org.telegram.ui.ActionBar.g6.F0[0];
            this.A = false;
            TLRPC.RecentMeUrl recentMeUrl = this.f25040f;
            if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
                TLRPC.Chat chat = MessagesController.getInstance(i16).getChat(Long.valueOf(this.f25040f.chat_id));
                this.A = chat.verified;
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
                userName = chat.title;
                y8Var.k(i16, chat);
                imageReceiver.setForUserOrChat(chat, y8Var, this.f25040f);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUser) {
                TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(this.f25040f.user_id));
                if (LocaleController.isRTL) {
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                if (user != null) {
                    if (user.bot) {
                        AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            getMeasuredWidth();
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.f25042r = AndroidUtilities.dp(14.0f);
                        } else {
                            AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                            this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                        }
                    }
                    this.A = user.verified;
                }
                userName = UserObject.getUserName(user);
                y8Var.m(i16, user);
                imageReceiver.setForUserOrChat(user, y8Var, this.f25040f);
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
                if (LocaleController.isRTL) {
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                String str = this.f25040f.set.set.title;
                y8Var.n(5L, str, null);
                imageReceiver.setImage(ImageLocation.getForDocument(this.f25040f.set.cover), null, y8Var, null, this.f25040f, 0);
                userName = str;
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
                if (LocaleController.isRTL) {
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                TLRPC.ChatInvite chatInvite = this.f25040f.chat_invite;
                TLRPC.Chat chat2 = chatInvite.chat;
                if (chat2 != null) {
                    y8Var.k(i16, chat2);
                    TLRPC.RecentMeUrl recentMeUrl2 = this.f25040f;
                    TLRPC.Chat chat3 = recentMeUrl2.chat_invite.chat;
                    String str2 = chat3.title;
                    this.A = chat3.verified;
                    imageReceiver.setForUserOrChat(chat3, y8Var, recentMeUrl2);
                    userName = str2;
                } else {
                    String str3 = chatInvite.title;
                    y8Var.n(5L, str3, null);
                    imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(this.f25040f.chat_invite.photo.sizes, 50), this.f25040f.chat_invite.photo), "50_50", y8Var, null, this.f25040f, 0);
                    userName = str3;
                }
                if (LocaleController.isRTL) {
                    getMeasuredWidth();
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
                }
            } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
                if (LocaleController.isRTL) {
                    this.f25042r = AndroidUtilities.dp(14.0f);
                } else {
                    this.f25042r = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                imageReceiver.setImage(null, null, y8Var, null, this.f25040f, 0);
                userName = "Url";
            } else {
                imageReceiver.setImage(null, null, y8Var, null, recentMeUrl, 0);
                userName = "";
            }
            String str4 = MessagesController.getInstance(i16).linkPrefix + "/" + this.f25040f.url;
            if (TextUtils.isEmpty(userName)) {
                userName = LocaleController.getString(R.string.HiddenName);
            }
            if (LocaleController.isRTL) {
                measuredWidth = getMeasuredWidth() - this.f25042r;
                iDp = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            } else {
                measuredWidth = getMeasuredWidth() - this.f25042r;
                iDp = AndroidUtilities.dp(14.0f);
            }
            int i17 = measuredWidth - iDp;
            if (this.A) {
                int intrinsicWidth = org.telegram.ui.ActionBar.g6.f23085f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                i17 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.f25042r += intrinsicWidth;
                }
            }
            int iMax = Math.max(AndroidUtilities.dp(12.0f), i17);
            try {
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(userName.replace('\n', ' '), textPaint2, iMax - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                textPaint = textPaint3;
                try {
                    i14 = iMax;
                    try {
                        this.f25043s = new StaticLayout(charSequenceEllipsize, textPaint2, iMax, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                    }
                } catch (Exception e10) {
                    e = e10;
                    i14 = iMax;
                }
            } catch (Exception e11) {
                e = e11;
                i14 = iMax;
                textPaint = textPaint3;
            }
            int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 16);
            if (LocaleController.isRTL) {
                this.f25045x = AndroidUtilities.dp(16.0f);
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 65.0f : 61.0f);
            } else {
                this.f25045x = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                measuredWidth2 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 13.0f : 9.0f);
            }
            imageReceiver.setImageCoords(measuredWidth2, this.B, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(52.0f));
            int iMax2 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth3);
            try {
                i15 = iMax2;
                try {
                    this.f25046y = new StaticLayout(TextUtils.ellipsize(str4, textPaint, iMax2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), textPaint, iMax2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e12) {
                    e = e12;
                    FileLog.e(e);
                }
            } catch (Exception e13) {
                e = e13;
                i15 = iMax2;
            }
            if (LocaleController.isRTL) {
                StaticLayout staticLayout = this.f25043s;
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    float lineLeft = this.f25043s.getLineLeft(0);
                    double dCeil = Math.ceil(this.f25043s.getLineWidth(0));
                    if (this.A) {
                        this.v = (int) ((((((double) i14) - dCeil) + ((double) this.f25042r)) - ((double) AndroidUtilities.dp(6.0f))) - ((double) org.telegram.ui.ActionBar.g6.f23085f1.getIntrinsicWidth()));
                    }
                    if (lineLeft == 0.0f) {
                        double d = i14;
                        if (dCeil < d) {
                            this.f25042r = (int) ((d - dCeil) + ((double) this.f25042r));
                        }
                    }
                }
                StaticLayout staticLayout2 = this.f25046y;
                if (staticLayout2 == null || staticLayout2.getLineCount() <= 0 || this.f25046y.getLineLeft(0) != 0.0f) {
                    return;
                }
                double dCeil2 = Math.ceil(this.f25046y.getLineWidth(0));
                double d10 = i15;
                if (dCeil2 < d10) {
                    this.f25045x = (int) ((d10 - dCeil2) + ((double) this.f25045x));
                    return;
                }
                return;
            }
            StaticLayout staticLayout3 = this.f25043s;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                float lineRight = this.f25043s.getLineRight(0);
                if (lineRight == i14) {
                    double dCeil3 = Math.ceil(this.f25043s.getLineWidth(0));
                    double d11 = i14;
                    if (dCeil3 < d11) {
                        this.f25042r = (int) (((double) this.f25042r) - (d11 - dCeil3));
                    }
                }
                if (this.A) {
                    this.v = (int) (this.f25042r + lineRight + AndroidUtilities.dp(6.0f));
                }
            }
            StaticLayout staticLayout4 = this.f25046y;
            if (staticLayout4 == null || staticLayout4.getLineCount() <= 0 || this.f25046y.getLineRight(0) != i15) {
                return;
            }
            double dCeil4 = Math.ceil(this.f25046y.getLineWidth(0));
            double d12 = i15;
            if (dCeil4 < d12) {
                this.f25045x = (int) (((double) this.f25045x) - (d12 - dCeil4));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.C != z10) {
            invalidate();
        }
        this.C = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f25040f = recentMeUrl;
        requestLayout();
    }
}
