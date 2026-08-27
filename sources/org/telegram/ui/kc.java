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

public final class kc extends FrameLayout {

    public org.telegram.ui.ActionBar.h5 f39690a;

    public org.telegram.ui.Components.pz0 f39691b;

    public org.telegram.ui.Components.i5 f39692c;
    public org.telegram.ui.ActionBar.c6 d;

    public boolean f39693e;

    public int f39694f;

    public final void a(int i10, int i11, boolean z10) {
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f39694f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23303r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            MessagesController.PeerColors peerColors = z10 ? messagesController.peerColors : messagesController.profilePeerColors;
            b(peerColors != null ? peerColors.getColor(i11) : null);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (peerColor != null) {
            this.f39694f = peerColor.getColor(0, c6Var);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.8f) {
            this.f39694f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var);
        } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) < 0.2f) {
            this.f39694f = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        } else {
            this.f39694f = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var), org.telegram.ui.ActionBar.g6.l1(0.7f, ap0.u0(org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
        }
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.i5 i5Var = this.f39692c;
        if (j10 == 0) {
            i5Var.g(null, z11);
            if (this.f39691b == null) {
                this.f39691b = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.j(j10, z11);
            this.f39691b = null;
        }
        i5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.i5 i5Var = this.f39692c;
        if (document == null) {
            i5Var.g(null, false);
            if (this.f39691b == null) {
                this.f39691b = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.i(document, false);
            this.f39691b = null;
        }
        i5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.i5 i5Var = this.f39692c;
        i5Var.k(Integer.valueOf(this.f39694f));
        org.telegram.ui.Components.pz0 pz0Var = this.f39691b;
        if (pz0Var != null) {
            canvas2 = canvas;
            pz0Var.c((getMeasuredWidth() - this.f39691b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var), canvas2);
        } else {
            canvas2 = canvas;
            i5Var.draw(canvas2);
        }
        if (this.f39693e) {
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : org.telegram.ui.ActionBar.g6.f23175k0;
            if (paintN != null) {
                canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, paintN);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f39690a;
        if (i10 <= 0) {
            h5Var.i(null);
        } else {
            h5Var.i(new mo0(i10, getContext(), this.d, false));
            h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.i5 i5Var = this.f39692c;
        i5Var.setBounds((getWidth() - i5Var.f29232s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.f29232s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.f29232s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39692c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39692c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
