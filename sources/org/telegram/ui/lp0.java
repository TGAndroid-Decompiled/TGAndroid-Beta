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
public final class lp0 extends FrameLayout {
    public final TextView f35485a;
    public org.telegram.ui.Components.w01 f35486b;
    public final org.telegram.ui.Components.o5 f35487c;
    public final mp0 d;

    public lp0(mp0 mp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = mp0Var;
        sp0 sp0Var = mp0Var.f35751p0;
        setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
        TextView textView = new TextView(context);
        this.f35485a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = sp0Var.f37935a;
        textView.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        if (mp0Var.m0 == 1) {
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
        this.f35487c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        mp0 mp0Var = this.d;
        sp0 sp0Var = mp0Var.f35751p0;
        int i12 = mp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.h6.f19354s8;
            if (AndroidUtilities.computePerceivedBrightness(sp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.h6.f19260n6;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v0(i14, d6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(sp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.h6.A8;
                d6Var3 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(i15, d6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.h6.f19076d6;
                d6Var = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i16, d6Var);
                d6Var2 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v(v02, org.telegram.ui.ActionBar.h6.l1(0.7f, sp0.w0(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2))));
            }
        } else if (i12 < 7) {
            return sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19335r8[i12]);
        } else {
            if (mp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(mp0Var.h)) != null) {
                return color.getColor1();
            }
            return sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19335r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        mp0 mp0Var = this.d;
        long j3 = mp0Var.f35748n;
        org.telegram.ui.Components.o5 o5Var = this.f35487c;
        if (j3 != 0) {
            o5Var.j(j3, z10);
            this.f35486b = null;
            return;
        }
        o5Var.g(null, z10);
        if (this.f35486b == null) {
            if (mp0Var.f35751p0.f37935a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f35486b = new org.telegram.ui.Components.w01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.f35487c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - o5Var.f26983s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - o5Var.f26983s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + o5Var.f26983s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        o5Var.setBounds(width, height, width2, (getHeight() + o5Var.f26983s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.o5 o5Var = this.f35487c;
        o5Var.k(valueOf);
        org.telegram.ui.Components.w01 w01Var = this.f35486b;
        if (w01Var != null) {
            w01Var.c((getMeasuredWidth() - this.f35486b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f35751p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            o5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35487c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35487c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
