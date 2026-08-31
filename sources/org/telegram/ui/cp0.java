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
public final class cp0 extends FrameLayout {
    public final TextView f35887a;
    public org.telegram.ui.Components.l01 f35888b;
    public final org.telegram.ui.Components.j5 f35889c;
    public final dp0 d;

    public cp0(dp0 dp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = dp0Var;
        ip0 ip0Var = dp0Var.f36282g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        TextView textView = new TextView(context);
        this.f35887a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z4 = ip0Var.f37904a;
        textView.setTextColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        if (dp0Var.f36277d0 == 1) {
            if (z4) {
                i11 = R.string.ChannelReplyIcon;
            } else {
                i11 = R.string.UserReplyIcon;
            }
            textView.setText(LocaleController.getString(i11));
        } else {
            if (z4) {
                i10 = R.string.ChannelProfileIcon;
            } else {
                i10 = R.string.UserProfileIcon;
            }
            textView.setText(LocaleController.getString(i10));
        }
        addView(textView, k7.c6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f35889c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        dp0 dp0Var = this.d;
        ip0 ip0Var = dp0Var.f36282g0;
        int i12 = dp0Var.f36283n;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.k6.f21930s8;
            if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.k6.f21839n6;
                g6Var4 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.v0(i14, g6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.k6.A8;
                g6Var3 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.v0(i15, g6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.k6.f21659d6;
                g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i16, g6Var);
                g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.v(v02, org.telegram.ui.ActionBar.k6.l1(0.7f, ip0.u0(org.telegram.ui.ActionBar.k6.v0(i13, g6Var2))));
            }
        } else if (i12 < 7) {
            return ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21914r8[i12]);
        } else {
            if (dp0Var.f36277d0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(dp0Var.f36283n)) != null) {
                return color.getColor1();
            }
            return ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21914r8[0]);
        }
    }

    public final void b(boolean z4) {
        int i10;
        dp0 dp0Var = this.d;
        long j10 = dp0Var.f36284r;
        org.telegram.ui.Components.j5 j5Var = this.f35889c;
        if (j10 != 0) {
            j5Var.j(j10, z4);
            this.f35888b = null;
            return;
        }
        j5Var.g(null, z4);
        if (this.f35888b == null) {
            if (dp0Var.f36282g0.f37904a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f35888b = new org.telegram.ui.Components.l01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z4 = LocaleController.isRTL;
        org.telegram.ui.Components.j5 j5Var = this.f35889c;
        if (z4) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - j5Var.f28001s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - j5Var.f28001s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + j5Var.f28001s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        j5Var.setBounds(width, height, width2, (getHeight() + j5Var.f28001s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.j5 j5Var = this.f35889c;
        j5Var.k(valueOf);
        org.telegram.ui.Components.l01 l01Var = this.f35888b;
        if (l01Var != null) {
            l01Var.c((getMeasuredWidth() - this.f35888b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f36282g0.getThemedColor(org.telegram.ui.ActionBar.k6.f21894q6), canvas);
        } else {
            j5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35889c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35889c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
