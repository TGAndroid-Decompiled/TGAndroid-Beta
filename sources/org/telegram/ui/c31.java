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
public final class c31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.dk0 E;
    public final a31 F;
    public s4.d0 G;
    public final View H;
    public final View I;
    public n21 J;
    public org.telegram.ui.Components.bq K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final d31 S;
    public final org.telegram.ui.Components.aq f36570b;
    public final z21 f36571c;
    public final d31 d;
    public final Window f36572e;
    public final Drawable f36573f;
    public final ci.m6 h;
    public final TextView f36574n;
    public final org.telegram.ui.Components.k10 f36575r;
    public final TextView f36576s;
    public final LinearLayout v;
    public final TextView f36577w;
    public final ImageView f36578x;
    public final org.telegram.ui.Components.rm0 f36579y;
    public final Paint f36569a = new Paint(1);
    public int L = -1;

    public c31(d31 d31Var, d31 d31Var2, Window window) {
        int i10;
        s4.d0 sVar;
        int i11;
        this.S = d31Var;
        this.d = d31Var2;
        this.f36572e = window;
        Activity parentActivity = d31Var2.getParentActivity();
        this.f36571c = new s4.e0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f36573f = mutate;
        int themedColor = d31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, d31Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f36574n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(d31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = d31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(R.raw.sun_outline, dp, dp, false, null);
        this.E = dk0Var;
        this.M = !org.telegram.ui.ActionBar.h6.I.q();
        a(org.telegram.ui.ActionBar.h6.I.q(), false);
        dk0Var.h = true;
        dk0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        a31 a31Var = new a31(this, parentActivity);
        this.F = a31Var;
        a31Var.setAnimation(dk0Var);
        a31Var.setScaleType(ImageView.ScaleType.CENTER);
        a31Var.setOnClickListener(new m60(this, 26));
        a31Var.setAlpha(0.0f);
        a31Var.setVisibility(4);
        m6Var.addView(a31Var, w7.x5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(parentActivity, d31Var2.f36916a);
        this.f36575r = k10Var;
        k10Var.setVisibility(0);
        m6Var.addView(k10Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        this.R = true;
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(parentActivity, null);
        this.f36579y = rm0Var;
        i10 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(i10, 2, d31Var.f36916a);
        this.f36570b = aqVar;
        rm0Var.setAdapter(aqVar);
        rm0Var.setClipChildren(false);
        rm0Var.setClipToPadding(false);
        rm0Var.setItemAnimator(null);
        rm0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            d31Var2.getParentActivity();
            sVar = new s4.d0(0, false);
        } else {
            d31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        rm0Var.setLayoutManager(sVar);
        rm0Var.setOnItemClickListener(new y21(this, 0));
        rm0Var.setOnScrollListener(new org.telegram.ui.Components.u51(this));
        m6Var.addView(rm0Var);
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
        this.f36576s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, d31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(d31Var2.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == d31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(d31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f36578x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(d31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f36577w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(d31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f36578x = null;
        this.f36577w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.dk0 dk0Var = this.E;
            if (z10) {
                i10 = dk0Var.f25810e[0] - 1;
            } else {
                i10 = 0;
            }
            a31 a31Var = this.F;
            if (z11) {
                dk0Var.P(i10);
                if (a31Var != null) {
                    a31Var.d();
                    return;
                }
                return;
            }
            dk0Var.P(i10);
            dk0Var.N(i10, false, true);
            if (a31Var != null) {
                a31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.aq aqVar = this.f36570b;
        aqVar.E(i10);
        if (i10 > 0 && i10 < aqVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, aqVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f36570b.l();
        }
    }
}
