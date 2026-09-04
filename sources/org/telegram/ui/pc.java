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
public final class pc extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f39468a;
    public org.telegram.ui.Components.f01 f39469b;
    public org.telegram.ui.Components.o5 f39470c;
    public org.telegram.ui.ActionBar.f6 d;
    public boolean f39471e;
    public int f39472f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f39472f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20918r8[i11], this.d);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.8f) {
                this.f39472f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) < 0.2f) {
                this.f39472f = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                return;
            } else {
                this.f39472f = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var), org.telegram.ui.ActionBar.j6.l1(0.7f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i10, f6Var))));
                return;
            }
        }
        this.f39472f = peerColor.getColor(0, f6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.o5 o5Var = this.f39470c;
        if (j3 == 0) {
            o5Var.g(null, z11);
            if (this.f39469b == null) {
                this.f39469b = new org.telegram.ui.Components.f01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            o5Var.j(j3, z11);
            this.f39469b = null;
        }
        o5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.o5 o5Var = this.f39470c;
        if (document == null) {
            o5Var.g(null, false);
            if (this.f39469b == null) {
                this.f39469b = new org.telegram.ui.Components.f01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            o5Var.i(document, false);
            this.f39469b = null;
        }
        o5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.o5 o5Var = this.f39470c;
        o5Var.k(Integer.valueOf(this.f39472f));
        org.telegram.ui.Components.f01 f01Var = this.f39469b;
        if (f01Var != null) {
            canvas2 = canvas;
            f01Var.c((getMeasuredWidth() - this.f39469b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var), canvas2);
        } else {
            canvas2 = canvas;
            o5Var.draw(canvas2);
        }
        if (this.f39471e) {
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f39468a;
        if (i10 <= 0) {
            j5Var.i(null);
            return;
        }
        j5Var.i(new kp0(i10, getContext(), this.d, false));
        j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.o5 o5Var = this.f39470c;
        o5Var.setBounds((getWidth() - o5Var.f28964s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f28964s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f28964s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39470c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39470c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
