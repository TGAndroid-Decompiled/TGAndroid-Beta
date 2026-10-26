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
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.b6 f42424a;
    public org.telegram.ui.Components.q11 f42425b;
    public org.telegram.ui.Components.r5 f42426c;
    public org.telegram.ui.ActionBar.u6 d;
    public boolean e;
    public int f42427f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f42427f = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23616r8[i11], this.d);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.y6.f23636s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) > 0.8f) {
                this.f42427f = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23540n6, u6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) < 0.2f) {
                this.f42427f = org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
                return;
            } else {
                this.f42427f = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var), org.telegram.ui.ActionBar.y6.o1(0.7f, rp0.x0(org.telegram.ui.ActionBar.y6.w0(i10, u6Var))));
                return;
            }
        }
        this.f42427f = peerColor.getColor(0, u6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.r5 r5Var = this.f42426c;
        if (j10 == 0) {
            r5Var.g(null, z11);
            if (this.f42425b == null) {
                this.f42425b = new org.telegram.ui.Components.q11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            r5Var.j(j10, z11);
            this.f42425b = null;
        }
        r5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.r5 r5Var = this.f42426c;
        if (document == null) {
            r5Var.g(null, false);
            if (this.f42425b == null) {
                this.f42425b = new org.telegram.ui.Components.q11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            r5Var.i(document, false);
            this.f42425b = null;
        }
        r5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.r5 r5Var = this.f42426c;
        r5Var.k(Integer.valueOf(this.f42427f));
        org.telegram.ui.Components.q11 q11Var = this.f42425b;
        if (q11Var != null) {
            canvas2 = canvas;
            q11Var.c((getMeasuredWidth() - this.f42425b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23597q6, u6Var), canvas2);
        } else {
            canvas2 = canvas;
            r5Var.draw(canvas2);
        }
        if (this.e) {
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.y6.f23478k0;
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
        org.telegram.ui.ActionBar.b6 b6Var = this.f42424a;
        if (i10 <= 0) {
            b6Var.i(null);
            return;
        }
        b6Var.i(new ap0(i10, getContext(), this.d, false));
        b6Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.r5 r5Var = this.f42426c;
        r5Var.setBounds((getWidth() - r5Var.f32099s) - AndroidUtilities.dp(21.0f), (getHeight() - r5Var.f32099s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + r5Var.f32099s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42426c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42426c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.b6 b6Var = this.f42424a;
        if (b6Var != null) {
            b6Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
