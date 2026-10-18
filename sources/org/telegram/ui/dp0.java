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
public final class dp0 extends FrameLayout {
    public final TextView f36226a;
    public org.telegram.ui.Components.d11 f36227b;
    public final org.telegram.ui.Components.p5 f36228c;
    public final ep0 d;

    public dp0(ep0 ep0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = ep0Var;
        kp0 kp0Var = ep0Var.f36583p0;
        setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        TextView textView = new TextView(context);
        this.f36226a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = kp0Var.f38593a;
        textView.setTextColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        if (ep0Var.m0 == 1) {
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
        addView(textView, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f36228c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        ep0 ep0Var = this.d;
        kp0 kp0Var = ep0Var.f36583p0;
        int i12 = ep0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.h6.f21265s8;
            if (AndroidUtilities.computePerceivedBrightness(kp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.h6.f21169n6;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.w0(i14, d6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(kp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.h6.A8;
                d6Var3 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i15, d6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.h6.f20986d6;
                d6Var = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i16, d6Var);
                d6Var2 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v(w02, org.telegram.ui.ActionBar.h6.m1(0.7f, kp0.w0(org.telegram.ui.ActionBar.h6.w0(i13, d6Var2))));
            }
        } else if (i12 < 7) {
            return kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21245r8[i12]);
        } else {
            if (ep0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(ep0Var.h)) != null) {
                return color.getColor1();
            }
            return kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21245r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        ep0 ep0Var = this.d;
        long j10 = ep0Var.f36580n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.p5 p5Var = this.f36228c;
        if (i11 != 0) {
            p5Var.j(j10, z10);
            this.f36227b = null;
            return;
        }
        p5Var.g(null, z10);
        if (this.f36227b == null) {
            if (ep0Var.f36583p0.f38593a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f36227b = new org.telegram.ui.Components.d11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.p5 p5Var = this.f36228c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - p5Var.f29181s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - p5Var.f29181s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + p5Var.f29181s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        p5Var.setBounds(width, height, width2, (getHeight() + p5Var.f29181s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.p5 p5Var = this.f36228c;
        p5Var.k(valueOf);
        org.telegram.ui.Components.d11 d11Var = this.f36227b;
        if (d11Var != null) {
            d11Var.c((getMeasuredWidth() - this.f36227b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f36583p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            p5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36228c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36228c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
