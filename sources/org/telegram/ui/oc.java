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
public final class oc extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 f36869a;
    public org.telegram.ui.Components.k01 f36870b;
    public org.telegram.ui.Components.j5 f36871c;
    public org.telegram.ui.ActionBar.f6 d;
    public boolean e;
    public int f36872f;

    public final void a(int i10, int i11, boolean z4) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f36872f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20160r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            if (z4) {
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
            int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.8f) {
                this.f36872f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) < 0.2f) {
                this.f36872f = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                return;
            } else {
                this.f36872f = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var), org.telegram.ui.ActionBar.j6.l1(0.7f, gp0.u0(org.telegram.ui.ActionBar.j6.v0(i10, f6Var))));
                return;
            }
        }
        this.f36872f = peerColor.getColor(0, f6Var);
    }

    public final void c(long j10, boolean z4, boolean z10) {
        org.telegram.ui.Components.j5 j5Var = this.f36871c;
        if (j10 == 0) {
            j5Var.g(null, z10);
            if (this.f36870b == null) {
                this.f36870b = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            j5Var.j(j10, z10);
            this.f36870b = null;
        }
        j5Var.m(z4, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.j5 j5Var = this.f36871c;
        if (document == null) {
            j5Var.g(null, false);
            if (this.f36870b == null) {
                this.f36870b = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            j5Var.i(document, false);
            this.f36870b = null;
        }
        j5Var.m(false, false);
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
        org.telegram.ui.Components.j5 j5Var = this.f36871c;
        j5Var.k(Integer.valueOf(this.f36872f));
        org.telegram.ui.Components.k01 k01Var = this.f36870b;
        if (k01Var != null) {
            canvas2 = canvas;
            k01Var.c((getMeasuredWidth() - this.f36870b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20140q6, f6Var), canvas2);
        } else {
            canvas2 = canvas;
            j5Var.draw(canvas2);
        }
        if (this.e) {
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20025k0;
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f36869a;
        if (i10 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new so0(i10, getContext(), this.d, false));
        k5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.j5 j5Var = this.f36871c;
        j5Var.setBounds((getWidth() - j5Var.f25878s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.f25878s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.f25878s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36871c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36871c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
