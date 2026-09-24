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
public final class nc extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f35832a;
    public org.telegram.ui.Components.t01 f35833b;
    public org.telegram.ui.Components.o5 f35834c;
    public org.telegram.ui.ActionBar.d6 d;
    public boolean e;
    public int f35835f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f35835f = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19304r8[i11], this.d);
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
            int i10 = org.telegram.ui.ActionBar.h6.f19323s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) > 0.8f) {
                this.f35835f = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19229n6, d6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) < 0.2f) {
                this.f35835f = org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
                return;
            } else {
                this.f35835f = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, d6Var), org.telegram.ui.ActionBar.h6.l1(0.7f, tp0.w0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var))));
                return;
            }
        }
        this.f35835f = peerColor.getColor(0, d6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.o5 o5Var = this.f35834c;
        if (j3 == 0) {
            o5Var.g(null, z11);
            if (this.f35833b == null) {
                this.f35833b = new org.telegram.ui.Components.t01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            o5Var.j(j3, z11);
            this.f35833b = null;
        }
        o5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.o5 o5Var = this.f35834c;
        if (document == null) {
            o5Var.g(null, false);
            if (this.f35833b == null) {
                this.f35833b = new org.telegram.ui.Components.t01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            o5Var.i(document, false);
            this.f35833b = null;
        }
        o5Var.m(false, false);
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
        org.telegram.ui.Components.o5 o5Var = this.f35834c;
        o5Var.k(Integer.valueOf(this.f35835f));
        org.telegram.ui.Components.t01 t01Var = this.f35833b;
        if (t01Var != null) {
            canvas2 = canvas;
            t01Var.c((getMeasuredWidth() - this.f35833b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q6, d6Var), canvas2);
        } else {
            canvas2 = canvas;
            o5Var.draw(canvas2);
        }
        if (this.e) {
            if (d6Var != null) {
                paint = d6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.h6.f19166k0;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f35832a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new cp0(i10, getContext(), this.d, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.o5 o5Var = this.f35834c;
        o5Var.setBounds((getWidth() - o5Var.f26919s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f26919s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f26919s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35834c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35834c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
