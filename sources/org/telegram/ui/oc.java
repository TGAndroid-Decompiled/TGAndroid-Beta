package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.n5 f40129a;
    public org.telegram.ui.Components.i11 f40130b;
    public org.telegram.ui.Components.p5 f40131c;
    public org.telegram.ui.ActionBar.g6 d;
    public boolean e;
    public int f40132f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f40132f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21442r8[i11], this.d);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.k6.f21462s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) > 0.8f) {
                this.f40132f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) < 0.2f) {
                this.f40132f = org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
                return;
            } else {
                this.f40132f = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var), org.telegram.ui.ActionBar.k6.o1(0.7f, lp0.w0(org.telegram.ui.ActionBar.k6.w0(i10, g6Var))));
                return;
            }
        }
        this.f40132f = peerColor.getColor(0, g6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.p5 p5Var = this.f40131c;
        if (j10 == 0) {
            p5Var.g(null, z11);
            if (this.f40130b == null) {
                this.f40130b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.j(j10, z11);
            this.f40130b = null;
        }
        p5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.p5 p5Var = this.f40131c;
        if (document == null) {
            p5Var.g(null, false);
            if (this.f40130b == null) {
                this.f40130b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.i(document, false);
            this.f40130b = null;
        }
        p5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.p5 p5Var = this.f40131c;
        p5Var.k(Integer.valueOf(this.f40132f));
        org.telegram.ui.Components.i11 i11Var = this.f40130b;
        if (i11Var != null) {
            canvas2 = canvas;
            i11Var.c((getMeasuredWidth() - this.f40130b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q6, g6Var), canvas2);
        } else {
            canvas2 = canvas;
            p5Var.draw(canvas2);
        }
        if (this.e) {
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f21304k0;
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f40129a;
        if (i10 <= 0) {
            n5Var.i(null);
            return;
        }
        n5Var.i(new uo0(i10, getContext(), this.d, false));
        n5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.p5 p5Var = this.f40131c;
        p5Var.setBounds((getWidth() - p5Var.f29419s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.f29419s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.f29419s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40131c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40131c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.n5 n5Var = this.f40129a;
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
