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
public final class ep0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f37007a;
    public org.telegram.ui.Components.i11 f37008b;
    public final org.telegram.ui.Components.p5 f37009c;
    public final fp0 d;

    public ep0(fp0 fp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = fp0Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
        lp0 lp0Var = fp0Var.f37402p0;
        org.telegram.ui.ActionBar.r6.i(i12, this, lp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f37007a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        boolean z10 = lp0Var.f39290a;
        org.telegram.ui.ActionBar.r6.W(textView, i13, lp0Var.getResourceProvider());
        if (fp0Var.m0 == 1) {
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
        this.f37009c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        fp0 fp0Var = this.d;
        lp0 lp0Var = fp0Var.f37402p0;
        int i12 = fp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.k6.f21462s8;
            if (AndroidUtilities.computePerceivedBrightness(lp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.k6.f21366n6;
                g6Var4 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w0(i14, g6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(lp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.k6.A8;
                g6Var3 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(i15, g6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.k6.f21183d6;
                g6Var = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
                g6Var2 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.v(w02, org.telegram.ui.ActionBar.k6.o1(0.7f, lp0.w0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var2))));
            }
        } else if (i12 < 7) {
            return lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21442r8[i12]);
        } else {
            if (fp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(fp0Var.h)) != null) {
                return color.getColor1();
            }
            return lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21442r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        fp0 fp0Var = this.d;
        long j10 = fp0Var.f37399n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.p5 p5Var = this.f37009c;
        if (i11 != 0) {
            p5Var.j(j10, z10);
            this.f37008b = null;
            return;
        }
        p5Var.g(null, z10);
        if (this.f37008b == null) {
            if (fp0Var.f37402p0.f39290a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f37008b = new org.telegram.ui.Components.i11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.p5 p5Var = this.f37009c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - p5Var.f29419s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - p5Var.f29419s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + p5Var.f29419s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        p5Var.setBounds(width, height, width2, (getHeight() + p5Var.f29419s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.p5 p5Var = this.f37009c;
        p5Var.k(valueOf);
        org.telegram.ui.Components.i11 i11Var = this.f37008b;
        if (i11Var != null) {
            i11Var.c((getMeasuredWidth() - this.f37008b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f37402p0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
        } else {
            p5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37009c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37009c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        fp0 fp0Var = this.d;
        setBackgroundColor(fp0Var.f37402p0.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        this.f37007a.setTextColor(fp0Var.f37402p0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
