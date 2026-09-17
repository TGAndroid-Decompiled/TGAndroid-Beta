package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class f31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.yi0 E;
    public final d31 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public r21 J;
    public org.telegram.ui.Components.lp K;
    public boolean M;
    public ValueAnimator N;
    public ci.wb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final g31 S;
    public final org.telegram.ui.Components.kp f33528b;
    public final c31 f33529c;
    public final g31 d;
    public final Window e;
    public final Drawable f33530f;
    public final ci.n6 h;
    public final TextView f33531n;
    public final org.telegram.ui.Components.t00 f33532r;
    public final TextView f33533s;
    public final LinearLayout v;
    public final TextView f33534w;
    public final ImageView f33535x;
    public final org.telegram.ui.Components.ml0 f33536y;
    public final Paint f33527a = new Paint(1);
    public int L = -1;

    public f31(g31 g31Var, g31 g31Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = g31Var;
        this.d = g31Var2;
        this.e = window;
        Activity parentActivity = g31Var2.getParentActivity();
        this.f33529c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f33530f = mutate;
        int themedColor = g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.n6 n6Var = new ci.n6(this, parentActivity, g31Var2);
        this.h = n6Var;
        TextView textView = new TextView(parentActivity);
        this.f33531n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18969j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        n6Var.addView(textView, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = g31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.sun_outline, dp, dp, false, null);
        this.E = yi0Var;
        this.M = !org.telegram.ui.ActionBar.j6.I.q();
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        yi0Var.h = true;
        yi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        d31 d31Var = new d31(this, parentActivity);
        this.F = d31Var;
        d31Var.setAnimation(yi0Var);
        d31Var.setScaleType(ImageView.ScaleType.CENTER);
        d31Var.setOnClickListener(new m60(this, 27));
        d31Var.setAlpha(0.0f);
        d31Var.setVisibility(4);
        n6Var.addView(d31Var, w7.x5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity, g31Var2.f33828a);
        this.f33532r = t00Var;
        t00Var.setVisibility(0);
        n6Var.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(parentActivity, null);
        this.f33536y = ml0Var;
        i10 = ((org.telegram.ui.ActionBar.o2) g31Var).currentAccount;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(i10, 2, g31Var.f33828a);
        this.f33528b = kpVar;
        ml0Var.setAdapter(kpVar);
        ml0Var.setClipChildren(false);
        ml0Var.setClipToPadding(false);
        ml0Var.setItemAnimator(null);
        ml0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            g31Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            g31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        ml0Var.setLayoutManager(sVar);
        ml0Var.setOnItemClickListener(new b31(this, 0));
        ml0Var.setOnScrollListener(new org.telegram.ui.Components.o41(this));
        n6Var.addView(ml0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        n6Var.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        n6Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f33533s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, g31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        n6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.o2) g31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == g31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(g31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f33535x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(g31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f33534w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(g31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            n6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f33535x = null;
        this.f33534w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.yi0 yi0Var = this.E;
            if (z10) {
                i10 = yi0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            d31 d31Var = this.F;
            if (z11) {
                yi0Var.P(i10);
                if (d31Var != null) {
                    d31Var.d();
                    return;
                }
                return;
            }
            yi0Var.P(i10);
            yi0Var.N(i10, false, true);
            if (d31Var != null) {
                d31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.kp kpVar = this.f33528b;
        kpVar.E(i10);
        if (i10 > 0 && i10 < kpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, kpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f33528b.l();
        }
    }
}
