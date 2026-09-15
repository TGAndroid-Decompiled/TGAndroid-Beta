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
public final class d31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.xi0 E;
    public final b31 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public p21 J;
    public org.telegram.ui.Components.lp K;
    public boolean M;
    public ValueAnimator N;
    public ci.wb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final e31 S;
    public final org.telegram.ui.Components.kp f32906b;
    public final a31 f32907c;
    public final e31 d;
    public final Window e;
    public final Drawable f32908f;
    public final ci.n6 h;
    public final TextView f32909n;
    public final org.telegram.ui.Components.t00 f32910r;
    public final TextView f32911s;
    public final LinearLayout v;
    public final TextView f32912w;
    public final ImageView f32913x;
    public final org.telegram.ui.Components.ll0 f32914y;
    public final Paint f32905a = new Paint(1);
    public int L = -1;

    public d31(e31 e31Var, e31 e31Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = e31Var;
        this.d = e31Var2;
        this.e = window;
        Activity parentActivity = e31Var2.getParentActivity();
        this.f32907c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f32908f = mutate;
        int themedColor = e31Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f18907h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.n6 n6Var = new ci.n6(this, parentActivity, e31Var2);
        this.h = n6Var;
        TextView textView = new TextView(parentActivity);
        this.f32909n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(e31Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f18943j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        n6Var.addView(textView, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int themedColor2 = e31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, dp, dp, false, null);
        this.E = xi0Var;
        this.M = !org.telegram.ui.ActionBar.i6.I.q();
        a(org.telegram.ui.ActionBar.i6.I.q(), false);
        xi0Var.h = true;
        xi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        b31 b31Var = new b31(this, parentActivity);
        this.F = b31Var;
        b31Var.setAnimation(xi0Var);
        b31Var.setScaleType(ImageView.ScaleType.CENTER);
        b31Var.setOnClickListener(new k60(this, 27));
        b31Var.setAlpha(0.0f);
        b31Var.setVisibility(4);
        n6Var.addView(b31Var, w7.x5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity, e31Var2.f33199a);
        this.f32910r = t00Var;
        t00Var.setVisibility(0);
        n6Var.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(parentActivity, null);
        this.f32914y = ll0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(i10, 2, e31Var.f33199a);
        this.f32906b = kpVar;
        ll0Var.setAdapter(kpVar);
        ll0Var.setClipChildren(false);
        ll0Var.setClipToPadding(false);
        ll0Var.setItemAnimator(null);
        ll0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            e31Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            e31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        ll0Var.setLayoutManager(sVar);
        ll0Var.setOnItemClickListener(new z21(this, 0));
        ll0Var.setOnScrollListener(new org.telegram.ui.Components.n41(this));
        n6Var.addView(ll0Var);
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
        this.f32911s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, e31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(e31Var2.getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        n6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == e31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(e31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f32913x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(e31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f32912w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(e31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            n6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f32913x = null;
        this.f32912w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.xi0 xi0Var = this.E;
            if (z10) {
                i10 = xi0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            b31 b31Var = this.F;
            if (z11) {
                xi0Var.P(i10);
                if (b31Var != null) {
                    b31Var.d();
                    return;
                }
                return;
            }
            xi0Var.P(i10);
            xi0Var.N(i10, false, true);
            if (b31Var != null) {
                b31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.kp kpVar = this.f32906b;
        kpVar.E(i10);
        if (i10 > 0 && i10 < kpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, kpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f32906b.l();
        }
    }
}
