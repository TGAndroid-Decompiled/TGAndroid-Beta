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
public final class qc extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f40332a;
    public org.telegram.ui.Components.d11 f40333b;
    public org.telegram.ui.Components.p5 f40334c;
    public org.telegram.ui.ActionBar.d6 d;
    public boolean e;
    public int f40335f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f40335f = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21245r8[i11], this.d);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.h6.f21265s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) > 0.8f) {
                this.f40335f = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21169n6, d6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) < 0.2f) {
                this.f40335f = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
                return;
            } else {
                this.f40335f = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var), org.telegram.ui.ActionBar.h6.m1(0.7f, kp0.w0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var))));
                return;
            }
        }
        this.f40335f = peerColor.getColor(0, d6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.p5 p5Var = this.f40334c;
        if (j10 == 0) {
            p5Var.g(null, z11);
            if (this.f40333b == null) {
                this.f40333b = new org.telegram.ui.Components.d11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.j(j10, z11);
            this.f40333b = null;
        }
        p5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.p5 p5Var = this.f40334c;
        if (document == null) {
            p5Var.g(null, false);
            if (this.f40333b == null) {
                this.f40333b = new org.telegram.ui.Components.d11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.i(document, false);
            this.f40333b = null;
        }
        p5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.p5 p5Var = this.f40334c;
        p5Var.k(Integer.valueOf(this.f40335f));
        org.telegram.ui.Components.d11 d11Var = this.f40333b;
        if (d11Var != null) {
            canvas2 = canvas;
            d11Var.c((getMeasuredWidth() - this.f40333b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q6, d6Var), canvas2);
        } else {
            canvas2 = canvas;
            p5Var.draw(canvas2);
        }
        if (this.e) {
            if (d6Var != null) {
                paint = d6Var.n("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.h6.f21107k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(23.0f);
                }
                float f7 = dp;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(23.0f);
                } else {
                    i10 = 0;
                }
                canvas2.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f40332a;
        if (i10 <= 0) {
            j5Var.i(null);
            return;
        }
        j5Var.i(new to0(i10, getContext(), this.d, false));
        j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.p5 p5Var = this.f40334c;
        p5Var.setBounds((getWidth() - p5Var.f29181s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.f29181s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.f29181s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40334c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40334c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
