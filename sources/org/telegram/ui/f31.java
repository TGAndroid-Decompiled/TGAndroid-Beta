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
    public final org.telegram.ui.Components.fk0 E;
    public final d31 F;
    public s4.d0 G;
    public final View H;
    public final View I;
    public r21 J;
    public org.telegram.ui.Components.dq K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final g31 S;
    public final org.telegram.ui.Components.cq f37611b;
    public final c31 f37612c;
    public final g31 d;
    public final Window f37613e;
    public final Drawable f37614f;
    public final ci.m6 h;
    public final TextView f37615n;
    public final org.telegram.ui.Components.m10 f37616r;
    public final TextView f37617s;
    public final LinearLayout v;
    public final TextView f37618w;
    public final ImageView f37619x;
    public final org.telegram.ui.Components.wm0 f37620y;
    public final Paint f37610a = new Paint(1);
    public int L = -1;

    public f31(g31 g31Var, g31 g31Var2, Window window) {
        int i10;
        s4.d0 sVar;
        int i11;
        this.S = g31Var;
        this.d = g31Var2;
        this.f37613e = window;
        Activity parentActivity = g31Var2.getParentActivity();
        this.f37612c = new s4.e0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f37614f = mutate;
        int themedColor = g31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20630h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, g31Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f37615n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20667j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.w5.a(-2.0f, 0.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = g31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.sun_outline, dp, dp, false, null);
        this.E = fk0Var;
        this.M = !org.telegram.ui.ActionBar.h6.I.q();
        a(org.telegram.ui.ActionBar.h6.I.q(), false);
        fk0Var.h = true;
        fk0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        d31 d31Var = new d31(this, parentActivity);
        this.F = d31Var;
        d31Var.setAnimation(fk0Var);
        d31Var.setScaleType(ImageView.ScaleType.CENTER);
        d31Var.setOnClickListener(new o60(this, 26));
        d31Var.setAlpha(0.0f);
        d31Var.setVisibility(4);
        m6Var.addView(d31Var, w7.w5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(parentActivity, g31Var2.f37906a);
        this.f37616r = m10Var;
        m10Var.setVisibility(0);
        m6Var.addView(m10Var, w7.w5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        this.R = true;
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(parentActivity, null);
        this.f37620y = wm0Var;
        i10 = ((org.telegram.ui.ActionBar.m2) g31Var).currentAccount;
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(i10, 2, g31Var.f37906a);
        this.f37611b = cqVar;
        wm0Var.setAdapter(cqVar);
        wm0Var.setClipChildren(false);
        wm0Var.setClipToPadding(false);
        wm0Var.setItemAnimator(null);
        wm0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            g31Var2.getParentActivity();
            sVar = new s4.d0(0, false);
        } else {
            g31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        wm0Var.setLayoutManager(sVar);
        wm0Var.setOnItemClickListener(new d21(this, 1));
        wm0Var.setOnScrollListener(new org.telegram.ui.Components.y51(this));
        m6Var.addView(wm0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        m6Var.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        m6Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f37617s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, g31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(g31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.m2) g31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == g31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(g31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f37619x = imageView;
            imageView.setLayoutParams(w7.w5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(g31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f37618w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(g31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f37619x = null;
        this.f37618w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.fk0 fk0Var = this.E;
            if (z10) {
                i10 = fk0Var.f26107e[0] - 1;
            } else {
                i10 = 0;
            }
            d31 d31Var = this.F;
            if (z11) {
                fk0Var.P(i10);
                if (d31Var != null) {
                    d31Var.d();
                    return;
                }
                return;
            }
            fk0Var.P(i10);
            fk0Var.N(i10, false, true);
            if (d31Var != null) {
                d31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.cq cqVar = this.f37611b;
        cqVar.E(i10);
        if (i10 > 0 && i10 < cqVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, cqVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f37611b.l();
        }
    }
}
