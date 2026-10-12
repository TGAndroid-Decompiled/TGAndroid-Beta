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
public final class k31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.yj0 E;
    public final i31 F;
    public s4.b0 G;
    public final View H;
    public final View I;
    public w21 J;
    public org.telegram.ui.Components.yp K;
    public boolean M;
    public ValueAnimator N;
    public di.sb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final l31 S;
    public final org.telegram.ui.Components.xp f37504b;
    public final h31 f37505c;
    public final l31 d;
    public final Window e;
    public final Drawable f37506f;
    public final ah.v h;
    public final TextView f37507n;
    public final org.telegram.ui.Components.f10 f37508r;
    public final TextView f37509s;
    public final LinearLayout v;
    public final TextView f37510w;
    public final ImageView f37511x;
    public final org.telegram.ui.Components.mm0 f37512y;
    public final Paint f37503a = new Paint(1);
    public int L = -1;

    public k31(l31 l31Var, l31 l31Var2, Window window) {
        int i10;
        s4.b0 sVar;
        int i11;
        this.S = l31Var;
        this.d = l31Var2;
        this.e = window;
        Activity parentActivity = l31Var2.getParentActivity();
        this.f37505c = new s4.c0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f37506f = mutate;
        int themedColor = l31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ah.v vVar = new ah.v(this, parentActivity, l31Var2);
        this.h = vVar;
        TextView textView = new TextView(parentActivity);
        this.f37507n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(l31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        vVar.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = l31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, dp, dp, false, null);
        this.E = yj0Var;
        this.M = !org.telegram.ui.ActionBar.g6.I.q();
        a(org.telegram.ui.ActionBar.g6.I.q(), false);
        yj0Var.h = true;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        i31 i31Var = new i31(this, parentActivity);
        this.F = i31Var;
        i31Var.setAnimation(yj0Var);
        i31Var.setScaleType(ImageView.ScaleType.CENTER);
        i31Var.setOnClickListener(new t60(this, 26));
        i31Var.setAlpha(0.0f);
        i31Var.setVisibility(4);
        vVar.addView(i31Var, w7.a6.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(parentActivity, l31Var2.f37826a);
        this.f37508r = f10Var;
        f10Var.setVisibility(0);
        vVar.addView(f10Var, w7.a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        this.R = true;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(parentActivity, null);
        this.f37512y = mm0Var;
        i10 = ((org.telegram.ui.ActionBar.m2) l31Var).currentAccount;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(i10, 2, l31Var.f37826a);
        this.f37504b = xpVar;
        mm0Var.setAdapter(xpVar);
        mm0Var.setClipChildren(false);
        mm0Var.setClipToPadding(false);
        mm0Var.setItemAnimator(null);
        mm0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            l31Var2.getParentActivity();
            sVar = new s4.b0(0, false);
        } else {
            l31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        mm0Var.setLayoutManager(sVar);
        mm0Var.setOnItemClickListener(new i21(this, 1));
        mm0Var.setOnScrollListener(new org.telegram.ui.Components.p51(this));
        vVar.addView(mm0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        vVar.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        vVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f37509s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, l31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(l31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        vVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.m2) l31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == l31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(l31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f37511x = imageView;
            imageView.setLayoutParams(w7.a6.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(l31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f37510w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(l31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            vVar.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f37511x = null;
        this.f37510w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.yj0 yj0Var = this.E;
            if (z10) {
                i10 = yj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            i31 i31Var = this.F;
            if (z11) {
                yj0Var.P(i10);
                if (i31Var != null) {
                    i31Var.d();
                    return;
                }
                return;
            }
            yj0Var.P(i10);
            yj0Var.N(i10, false, true);
            if (i31Var != null) {
                i31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.xp xpVar = this.f37504b;
        xpVar.E(i10);
        if (i10 > 0 && i10 < xpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, xpVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f37504b.l();
        }
    }
}
