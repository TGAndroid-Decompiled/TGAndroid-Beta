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
    public final org.telegram.ui.Components.ck0 E;
    public final b31 F;
    public s4.d0 G;
    public final View H;
    public final View I;
    public o21 J;
    public org.telegram.ui.Components.bq K;
    public boolean M;
    public ValueAnimator N;
    public ci.tb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final e31 S;
    public final org.telegram.ui.Components.aq f36823b;
    public final a31 f36824c;
    public final e31 d;
    public final Window f36825e;
    public final Drawable f36826f;
    public final ci.m6 h;
    public final TextView f36827n;
    public final org.telegram.ui.Components.j10 f36828r;
    public final TextView f36829s;
    public final LinearLayout v;
    public final TextView f36830w;
    public final ImageView f36831x;
    public final org.telegram.ui.Components.qm0 f36832y;
    public final Paint f36822a = new Paint(1);
    public int L = -1;

    public d31(e31 e31Var, e31 e31Var2, Window window) {
        int i10;
        s4.d0 sVar;
        int i11;
        this.S = e31Var;
        this.d = e31Var2;
        this.f36825e = window;
        Activity parentActivity = e31Var2.getParentActivity();
        this.f36824c = new s4.e0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f36826f = mutate;
        int themedColor = e31Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.m6 m6Var = new ci.m6(this, parentActivity, e31Var2);
        this.h = m6Var;
        TextView textView = new TextView(parentActivity);
        this.f36827n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(e31Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20905j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        m6Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int themedColor2 = e31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.sun_outline, dp, dp, false, null);
        this.E = ck0Var;
        this.M = !org.telegram.ui.ActionBar.i6.I.q();
        a(org.telegram.ui.ActionBar.i6.I.q(), false);
        ck0Var.h = true;
        ck0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        b31 b31Var = new b31(this, parentActivity);
        this.F = b31Var;
        b31Var.setAnimation(ck0Var);
        b31Var.setScaleType(ImageView.ScaleType.CENTER);
        b31Var.setOnClickListener(new m60(this, 26));
        b31Var.setAlpha(0.0f);
        b31Var.setVisibility(4);
        m6Var.addView(b31Var, w7.x5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(parentActivity, e31Var2.f37135a);
        this.f36828r = j10Var;
        j10Var.setVisibility(0);
        m6Var.addView(j10Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        this.R = true;
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(parentActivity, null);
        this.f36832y = qm0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(i10, 2, e31Var.f37135a);
        this.f36823b = aqVar;
        qm0Var.setAdapter(aqVar);
        qm0Var.setClipChildren(false);
        qm0Var.setClipToPadding(false);
        qm0Var.setItemAnimator(null);
        qm0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            e31Var2.getParentActivity();
            sVar = new s4.d0(0, false);
        } else {
            e31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        qm0Var.setLayoutManager(sVar);
        qm0Var.setOnItemClickListener(new z21(this, 0));
        qm0Var.setOnScrollListener(new org.telegram.ui.Components.t51(this));
        m6Var.addView(qm0Var);
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
        this.f36829s = textView2;
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
        m6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == e31Var.L) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(e31Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f36831x = imageView;
            imageView.setLayoutParams(w7.x5.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(e31Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f36830w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(e31Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            m6Var.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f36831x = null;
        this.f36830w = null;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            org.telegram.ui.Components.ck0 ck0Var = this.E;
            if (z10) {
                i10 = ck0Var.f25401e[0] - 1;
            } else {
                i10 = 0;
            }
            b31 b31Var = this.F;
            if (z11) {
                ck0Var.P(i10);
                if (b31Var != null) {
                    b31Var.d();
                    return;
                }
                return;
            }
            ck0Var.P(i10);
            ck0Var.N(i10, false, true);
            if (b31Var != null) {
                b31Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.aq aqVar = this.f36823b;
        aqVar.E(i10);
        if (i10 > 0 && i10 < aqVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, aqVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f36823b.l();
        }
    }
}
