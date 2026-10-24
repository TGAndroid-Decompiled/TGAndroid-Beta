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
public final class dp0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f36660a;
    public org.telegram.ui.Components.h11 f36661b;
    public final org.telegram.ui.Components.n5 f36662c;
    public final ep0 d;

    public dp0(ep0 ep0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = ep0Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21184d6;
        kp0 kp0Var = ep0Var.f36983p0;
        org.telegram.ui.ActionBar.r6.i(i12, this, kp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f36660a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        boolean z10 = kp0Var.f38998a;
        org.telegram.ui.ActionBar.r6.W(textView, i13, kp0Var.getResourceProvider());
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
        this.f36662c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        ep0 ep0Var = this.d;
        kp0 kp0Var = ep0Var.f36983p0;
        int i12 = ep0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.k6.f21463s8;
            if (AndroidUtilities.computePerceivedBrightness(kp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.k6.f21367n6;
                g6Var4 = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w0(i14, g6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(kp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.k6.A8;
                g6Var3 = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(i15, g6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.k6.f21184d6;
                g6Var = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
                g6Var2 = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.v(w02, org.telegram.ui.ActionBar.k6.o1(0.7f, kp0.w0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var2))));
            }
        } else if (i12 < 7) {
            return kp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21443r8[i12]);
        } else {
            if (ep0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.o2) kp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.o2) kp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(ep0Var.h)) != null) {
                return color.getColor1();
            }
            return kp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21443r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        ep0 ep0Var = this.d;
        long j10 = ep0Var.f36980n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var = this.f36662c;
        if (i11 != 0) {
            n5Var.j(j10, z10);
            this.f36661b = null;
            return;
        }
        n5Var.g(null, z10);
        if (this.f36661b == null) {
            if (ep0Var.f36983p0.f38998a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f36661b = new org.telegram.ui.Components.h11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f36662c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - n5Var.f28785s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - n5Var.f28785s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + n5Var.f28785s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        n5Var.setBounds(width, height, width2, (getHeight() + n5Var.f28785s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.n5 n5Var = this.f36662c;
        n5Var.k(valueOf);
        org.telegram.ui.Components.h11 h11Var = this.f36661b;
        if (h11Var != null) {
            h11Var.c((getMeasuredWidth() - this.f36661b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f36983p0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
        } else {
            n5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36662c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36662c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        ep0 ep0Var = this.d;
        setBackgroundColor(ep0Var.f36983p0.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        this.f36660a.setTextColor(ep0Var.f36983p0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
