package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class kp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView f40995a;
    public org.telegram.ui.Components.q11 f40996b;
    public final org.telegram.ui.Components.r5 f40997c;
    public final lp0 d;

    public kp0(lp0 lp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = lp0Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23354d6;
        rp0 rp0Var = lp0Var.f41330p0;
        org.telegram.ui.ActionBar.f7.i(i12, this, rp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f40995a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        boolean z10 = rp0Var.f43222a;
        org.telegram.ui.ActionBar.f7.V(textView, i13, rp0Var.getResourceProvider());
        if (lp0Var.m0 == 1) {
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
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f40997c = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        lp0 lp0Var = this.d;
        rp0 rp0Var = lp0Var.f41330p0;
        int i12 = lp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.y6.f23634s8;
            if (AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.y6.f23538n6;
                u6Var4 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.w0(i14, u6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.y6.A8;
                u6Var3 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i15, u6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.y6.f23354d6;
                u6Var = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
                u6Var2 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.v(w02, org.telegram.ui.ActionBar.y6.o1(0.7f, rp0.x0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var2))));
            }
        } else if (i12 < 7) {
            return rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23614r8[i12]);
        } else {
            if (lp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(lp0Var.h)) != null) {
                return color.getColor1();
            }
            return rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23614r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        lp0 lp0Var = this.d;
        long j10 = lp0Var.f41327n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.r5 r5Var = this.f40997c;
        if (i11 != 0) {
            r5Var.j(j10, z10);
            this.f40996b = null;
            return;
        }
        r5Var.g(null, z10);
        if (this.f40996b == null) {
            if (lp0Var.f41330p0.f43222a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f40996b = new org.telegram.ui.Components.q11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.r5 r5Var = this.f40997c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - r5Var.f32097s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - r5Var.f32097s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + r5Var.f32097s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        r5Var.setBounds(width, height, width2, (getHeight() + r5Var.f32097s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.r5 r5Var = this.f40997c;
        r5Var.k(valueOf);
        org.telegram.ui.Components.q11 q11Var = this.f40996b;
        if (q11Var != null) {
            q11Var.c((getMeasuredWidth() - this.f40996b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f41330p0.getThemedColor(org.telegram.ui.ActionBar.y6.f23595q6), canvas);
        } else {
            r5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40997c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40997c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        lp0 lp0Var = this.d;
        setBackgroundColor(lp0Var.f41330p0.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
        this.f40995a.setTextColor(lp0Var.f41330p0.getThemedColor(org.telegram.ui.ActionBar.y6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
