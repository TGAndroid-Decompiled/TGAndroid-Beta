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
public final class jc extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f39431a;
    public org.telegram.ui.Components.nz0 f39432b;
    public org.telegram.ui.Components.i5 f39433c;
    public org.telegram.ui.ActionBar.b6 d;
    public boolean f39434e;
    public int f39435f;

    public final void a(int i9, int i10, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f39435f = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23250r8[i10], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i9);
            if (z10) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = messagesController.profilePeerColors;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i10);
            }
            b(peerColor);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (peerColor == null) {
            int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) > 0.8f) {
                this.f39435f = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) < 0.2f) {
                this.f39435f = org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
                return;
            } else {
                this.f39435f = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var), org.telegram.ui.ActionBar.f6.l1(0.7f, zo0.t0(org.telegram.ui.ActionBar.f6.v0(i9, b6Var))));
                return;
            }
        }
        this.f39435f = peerColor.getColor(0, b6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.i5 i5Var = this.f39433c;
        if (j10 == 0) {
            i5Var.g(null, z11);
            if (this.f39432b == null) {
                this.f39432b = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.j(j10, z11);
            this.f39432b = null;
        }
        i5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.i5 i5Var = this.f39433c;
        if (document == null) {
            i5Var.g(null, false);
            if (this.f39432b == null) {
                this.f39432b = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.i(document, false);
            this.f39432b = null;
        }
        i5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.i5 i5Var = this.f39433c;
        i5Var.k(Integer.valueOf(this.f39435f));
        org.telegram.ui.Components.nz0 nz0Var = this.f39432b;
        if (nz0Var != null) {
            canvas2 = canvas;
            nz0Var.c((getMeasuredWidth() - this.f39432b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, b6Var), canvas2);
        } else {
            canvas2 = canvas;
            i5Var.draw(canvas2);
        }
        if (this.f39434e) {
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
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
                    i9 = AndroidUtilities.dp(23.0f);
                } else {
                    i9 = 0;
                }
                canvas2.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i9) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f39431a;
        if (i9 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new lo0(i9, getContext(), this.d, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.i5 i5Var = this.f39433c;
        i5Var.setBounds((getWidth() - i5Var.f29322s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.f29322s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.f29322s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39433c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39433c.b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
