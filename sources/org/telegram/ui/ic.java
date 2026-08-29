package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ic extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f39200a;
    public org.telegram.ui.Components.zz0 f39201b;
    public org.telegram.ui.Components.n5 f39202c;
    public org.telegram.ui.ActionBar.c6 d;
    public boolean f39203e;
    public int f39204f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f39204f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23312r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            if (z10) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = messagesController.profilePeerColors;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i11);
            }
            b(peerColor);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.8f) {
                this.f39204f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) < 0.2f) {
                this.f39204f = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
                return;
            } else {
                this.f39204f = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var), org.telegram.ui.ActionBar.g6.l1(0.7f, yo0.u0(org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
                return;
            }
        }
        this.f39204f = peerColor.getColor(0, c6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.n5 n5Var = this.f39202c;
        if (j10 == 0) {
            n5Var.g(null, z11);
            if (this.f39201b == null) {
                this.f39201b = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            n5Var.j(j10, z11);
            this.f39201b = null;
        }
        n5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.n5 n5Var = this.f39202c;
        if (document == null) {
            n5Var.g(null, false);
            if (this.f39201b == null) {
                this.f39201b = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            n5Var.i(document, false);
            this.f39201b = null;
        }
        n5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.n5 n5Var = this.f39202c;
        n5Var.k(Integer.valueOf(this.f39204f));
        org.telegram.ui.Components.zz0 zz0Var = this.f39201b;
        if (zz0Var != null) {
            canvas2 = canvas;
            zz0Var.c((getMeasuredWidth() - this.f39201b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var), canvas2);
        } else {
            canvas2 = canvas;
            n5Var.draw(canvas2);
        }
        if (this.f39203e) {
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(23.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(23.0f);
                } else {
                    i10 = 0;
                }
                canvas2.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f39200a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new ko0(i10, getContext(), this.d, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.n5 n5Var = this.f39202c;
        n5Var.setBounds((getWidth() - n5Var.f30852s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.f30852s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.f30852s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39202c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39202c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
