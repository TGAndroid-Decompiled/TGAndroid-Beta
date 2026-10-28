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
public final class mp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView f41496a;
    public org.telegram.ui.Components.r11 f41497b;
    public final org.telegram.ui.Components.r5 f41498c;
    public final np0 d;

    public mp0(np0 np0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = np0Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23357d6;
        tp0 tp0Var = np0Var.f41856p0;
        org.telegram.ui.ActionBar.f7.i(i12, this, tp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f41496a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        boolean z10 = tp0Var.f43711a;
        org.telegram.ui.ActionBar.f7.V(textView, i13, tp0Var.getResourceProvider());
        if (np0Var.m0 == 1) {
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
        addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f41498c = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        np0 np0Var = this.d;
        tp0 tp0Var = np0Var.f41856p0;
        int i12 = np0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.y6.f23637s8;
            if (AndroidUtilities.computePerceivedBrightness(tp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.y6.f23541n6;
                u6Var4 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.w0(i14, u6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(tp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.y6.A8;
                u6Var3 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i15, u6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.y6.f23357d6;
                u6Var = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
                u6Var2 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.y6.v(w02, org.telegram.ui.ActionBar.y6.o1(0.7f, tp0.x0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var2))));
            }
        } else if (i12 < 7) {
            return tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23617r8[i12]);
        } else {
            if (np0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(np0Var.h)) != null) {
                return color.getColor1();
            }
            return tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23617r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        np0 np0Var = this.d;
        long j10 = np0Var.f41853n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.r5 r5Var = this.f41498c;
        if (i11 != 0) {
            r5Var.j(j10, z10);
            this.f41497b = null;
            return;
        }
        r5Var.g(null, z10);
        if (this.f41497b == null) {
            if (np0Var.f41856p0.f43711a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f41497b = new org.telegram.ui.Components.r11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.r5 r5Var = this.f41498c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - r5Var.f32126s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - r5Var.f32126s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + r5Var.f32126s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        r5Var.setBounds(width, height, width2, (getHeight() + r5Var.f32126s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.r5 r5Var = this.f41498c;
        r5Var.k(valueOf);
        org.telegram.ui.Components.r11 r11Var = this.f41497b;
        if (r11Var != null) {
            r11Var.c((getMeasuredWidth() - this.f41497b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f41856p0.getThemedColor(org.telegram.ui.ActionBar.y6.f23598q6), canvas);
        } else {
            r5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41498c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41498c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        np0 np0Var = this.d;
        setBackgroundColor(np0Var.f41856p0.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
        this.f41496a.setTextColor(np0Var.f41856p0.getThemedColor(org.telegram.ui.ActionBar.y6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
