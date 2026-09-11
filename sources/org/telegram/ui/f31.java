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
    public final org.telegram.ui.Components.xi0 E;
    public final d31 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public r21 J;
    public org.telegram.ui.Components.kp K;
    public boolean M;
    public ValueAnimator N;
    public di.xb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final g31 S;
    public final org.telegram.ui.Components.jp f36251b;
    public final c31 f36252c;
    public final g31 d;
    public final Window f36253e;
    public final Drawable f36254f;
    public final ah.w h;
    public final TextView f36255n;
    public final org.telegram.ui.Components.t00 f36256r;
    public final TextView f36257s;
    public final LinearLayout v;
    public final TextView f36258w;
    public final ImageView f36259x;
    public final org.telegram.ui.Components.ll0 f36260y;
    public final Paint f36250a = new Paint(1);
    public int L = -1;

    public f31(g31 g31Var, g31 g31Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = g31Var;
        this.d = g31Var2;
        this.f36253e = window;
        Activity parentActivity = g31Var2.getParentActivity();
        this.f36252c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f36254f = mutate;
        int themedColor = g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ah.w wVar = new ah.w(this, parentActivity, g31Var2);
        this.h = wVar;
        TextView textView = new TextView(parentActivity);
        this.f36255n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20770j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        wVar.addView(textView, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = g31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, dp, dp, false, null);
        this.E = xi0Var;
        this.M = !org.telegram.ui.ActionBar.j6.I.q();
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        xi0Var.h = true;
        xi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        d31 d31Var = new d31(this, parentActivity);
        this.F = d31Var;
        d31Var.setAnimation(xi0Var);
        d31Var.setScaleType(ImageView.ScaleType.CENTER);
        d31Var.setOnClickListener(new l60(this, 27));
        d31Var.setAlpha(0.0f);
        d31Var.setVisibility(4);
        wVar.addView(d31Var, w7.x5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity, g31Var2.f36538a);
        this.f36256r = t00Var;
        t00Var.setVisibility(0);
        wVar.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(parentActivity, null);
        this.f36260y = ll0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) g31Var).currentAccount;
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(i10, 2, g31Var.f36538a);
        this.f36251b = jpVar;
        ll0Var.setAdapter(jpVar);
        ll0Var.setClipChildren(false);
        ll0Var.setClipToPadding(false);
        ll0Var.setItemAnimator(null);
        ll0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            g31Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            g31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        ll0Var.setLayoutManager(sVar);
        ll0Var.setOnItemClickListener(new b31(this, 0));
        ll0Var.setOnScrollListener(new org.telegram.ui.Components.m41(this));
        wVar.addView(ll0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        wVar.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        wVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f36257s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, g31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        wVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) g31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == g31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(g31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f36259x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(g31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f36258w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(g31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            wVar.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f36259x = null;
        this.f36258w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.xi0 xi0Var = this.E;
            if (z10) {
                i10 = xi0Var.f32557e[0] - 1;
            } else {
                i10 = 0;
            }
            d31 d31Var = this.F;
            if (z11) {
                xi0Var.N(i10);
                if (d31Var != null) {
                    d31Var.d();
                    return;
                }
                return;
            }
            xi0Var.N(i10);
            xi0Var.L(i10, false, true);
            if (d31Var != null) {
                d31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.jp jpVar = this.f36251b;
        jpVar.E(i10);
        if (i10 > 0 && i10 < jpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, jpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f36251b.l();
        }
    }
}
