package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class np0 extends FrameLayout {
    public final TextView f35574a;
    public org.telegram.ui.Components.f01 f35575b;
    public final org.telegram.ui.Components.o5 f35576c;
    public final op0 d;

    public np0(op0 op0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = op0Var;
        up0 up0Var = op0Var.f35938p0;
        setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        TextView textView = new TextView(context);
        this.f35574a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = up0Var.f38143a;
        textView.setTextColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        if (op0Var.m0 == 1) {
            if (z10) {
                i11 = R.string.ChannelReplyIcon;
            } else {
                i11 = R.string.UserReplyIcon;
            }
            textView.setText(LocaleController.getString(i11));
        } else {
            if (z10) {
                i10 = R.string.ChannelProfileIcon;
            } else {
                i10 = R.string.UserProfileIcon;
            }
            textView.setText(LocaleController.getString(i10));
        }
        addView(textView, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f35576c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        op0 op0Var = this.d;
        up0 up0Var = op0Var.f35938p0;
        int i12 = op0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.h6.f19065s8;
            if (AndroidUtilities.computePerceivedBrightness(up0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.h6.f18973n6;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v0(i14, d6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(up0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.h6.A8;
                d6Var3 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(i15, d6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.h6.f18789d6;
                d6Var = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i16, d6Var);
                d6Var2 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v(v02, org.telegram.ui.ActionBar.h6.l1(0.7f, up0.w0(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2))));
            }
        } else if (i12 < 7) {
            return up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19046r8[i12]);
        } else {
            if (op0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(op0Var.h)) != null) {
                return color.getColor1();
            }
            return up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19046r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        op0 op0Var = this.d;
        long j3 = op0Var.f35935n;
        org.telegram.ui.Components.o5 o5Var = this.f35576c;
        if (j3 != 0) {
            o5Var.j(j3, z10);
            this.f35575b = null;
            return;
        }
        o5Var.g(null, z10);
        if (this.f35575b == null) {
            if (op0Var.f35938p0.f38143a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f35575b = new org.telegram.ui.Components.f01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.f35576c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - o5Var.f26598s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - o5Var.f26598s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + o5Var.f26598s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        o5Var.setBounds(width, height, width2, (getHeight() + o5Var.f26598s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.o5 o5Var = this.f35576c;
        o5Var.k(valueOf);
        org.telegram.ui.Components.f01 f01Var = this.f35575b;
        if (f01Var != null) {
            f01Var.c((getMeasuredWidth() - this.f35575b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f35938p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            o5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35576c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35576c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
