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
public final class pp0 extends FrameLayout {
    public final TextView f36514a;
    public org.telegram.ui.Components.v01 f36515b;
    public final org.telegram.ui.Components.o5 f36516c;
    public final qp0 d;

    public pp0(qp0 qp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = qp0Var;
        wp0 wp0Var = qp0Var.f36807p0;
        setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        TextView textView = new TextView(context);
        this.f36514a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = wp0Var.f39388a;
        textView.setTextColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        if (qp0Var.m0 == 1) {
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
        addView(textView, w7.y5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f36516c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        qp0 qp0Var = this.d;
        wp0 wp0Var = qp0Var.f36807p0;
        int i12 = qp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.i6.f19337s8;
            if (AndroidUtilities.computePerceivedBrightness(wp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.i6.f19242n6;
                e6Var4 = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.v0(i14, e6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(wp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.i6.A8;
                e6Var3 = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i15, e6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.i6.f19057d6;
                e6Var = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i16, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.v(v02, org.telegram.ui.ActionBar.i6.l1(0.7f, wp0.w0(org.telegram.ui.ActionBar.i6.v0(i13, e6Var2))));
            }
        } else if (i12 < 7) {
            return wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19318r8[i12]);
        } else {
            if (qp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.o2) wp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.o2) wp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(qp0Var.h)) != null) {
                return color.getColor1();
            }
            return wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19318r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        qp0 qp0Var = this.d;
        long j3 = qp0Var.f36804n;
        org.telegram.ui.Components.o5 o5Var = this.f36516c;
        if (j3 != 0) {
            o5Var.j(j3, z10);
            this.f36515b = null;
            return;
        }
        o5Var.g(null, z10);
        if (this.f36515b == null) {
            if (qp0Var.f36807p0.f39388a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f36515b = new org.telegram.ui.Components.v01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.f36516c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - o5Var.f26974s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - o5Var.f26974s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + o5Var.f26974s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        o5Var.setBounds(width, height, width2, (getHeight() + o5Var.f26974s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.o5 o5Var = this.f36516c;
        o5Var.k(valueOf);
        org.telegram.ui.Components.v01 v01Var = this.f36515b;
        if (v01Var != null) {
            v01Var.c((getMeasuredWidth() - this.f36515b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f36807p0.getThemedColor(org.telegram.ui.ActionBar.i6.q6), canvas);
        } else {
            o5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36516c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36516c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
