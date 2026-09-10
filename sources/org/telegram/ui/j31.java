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
public final class j31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.hj0 E;
    public final h31 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public v21 J;
    public org.telegram.ui.Components.rp K;
    public boolean M;
    public ValueAnimator N;
    public bi.gd O;
    public float P;
    public boolean Q;
    public boolean R;
    public final k31 S;
    public final org.telegram.ui.Components.qp f33867b;
    public final g31 f33868c;
    public final k31 d;
    public final Window e;
    public final Drawable f33869f;
    public final bi.n7 h;
    public final TextView f33870n;
    public final org.telegram.ui.Components.a10 f33871r;
    public final TextView f33872s;
    public final LinearLayout v;
    public final TextView f33873w;
    public final ImageView f33874x;
    public final org.telegram.ui.Components.vl0 f33875y;
    public final Paint f33866a = new Paint(1);
    public int L = -1;

    public j31(k31 k31Var, k31 k31Var2, Window window) {
        s4.c0 sVar;
        this.S = k31Var;
        this.d = k31Var2;
        this.e = window;
        Activity parentActivity = k31Var2.getParentActivity();
        this.f33868c = new s4.d0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f33869f = mutate;
        int themedColor = k31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        bi.n7 n7Var = new bi.n7(this, parentActivity, k31Var2);
        this.h = n7Var;
        TextView textView = new TextView(parentActivity);
        this.f33870n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(k31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        n7Var.addView(textView, w7.a6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = k31Var2.getThemedColor(i10);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, dp, dp, false, null);
        this.E = hj0Var;
        this.M = !org.telegram.ui.ActionBar.j6.I.q();
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        hj0Var.h = true;
        hj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        h31 h31Var = new h31(this, parentActivity);
        this.F = h31Var;
        h31Var.setAnimation(hj0Var);
        h31Var.setScaleType(ImageView.ScaleType.CENTER);
        h31Var.setOnClickListener(new l60(this, 27));
        h31Var.setAlpha(0.0f);
        h31Var.setVisibility(4);
        n7Var.addView(h31Var, w7.a6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(parentActivity, k31Var2.f34209a);
        this.f33871r = a10Var;
        a10Var.setVisibility(0);
        n7Var.addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(parentActivity, null);
        this.f33875y = vl0Var;
        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(k31.Z(k31Var), 2, k31Var.f34209a);
        this.f33867b = qpVar;
        vl0Var.setAdapter(qpVar);
        vl0Var.setClipChildren(false);
        vl0Var.setClipToPadding(false);
        vl0Var.setItemAnimator(null);
        vl0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            k31Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            k31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        vl0Var.setLayoutManager(sVar);
        vl0Var.setOnItemClickListener(new f31(this, 0));
        vl0Var.setOnScrollListener(new org.telegram.ui.Components.a51(this));
        n7Var.addView(vl0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        n7Var.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        n7Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f33872s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, k31Var2.getThemedColor(i10)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(k31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        n7Var.addView(textView2);
        if (UserConfig.getInstance(k31.a0(k31Var)).getClientUserId() == k31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(k31Var2.getThemedColor(i10)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f33874x = imageView;
            imageView.setLayoutParams(w7.a6.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(k31Var2.getThemedColor(i10), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f33873w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(k31Var2.getThemedColor(i10));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            n7Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f33874x = null;
        this.f33873w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.hj0 hj0Var = this.E;
            if (z10) {
                i10 = hj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            h31 h31Var = this.F;
            if (z11) {
                hj0Var.P(i10);
                if (h31Var != null) {
                    h31Var.d();
                    return;
                }
                return;
            }
            hj0Var.P(i10);
            hj0Var.N(i10, false, true);
            if (h31Var != null) {
                h31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.qp qpVar = this.f33867b;
        qpVar.E(i10);
        if (i10 > 0 && i10 < qpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, qpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f33867b.l();
        }
    }
}
