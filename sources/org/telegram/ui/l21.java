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
public final class l21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.gj0 B;
    public final j21 C;
    public f2.i0 D;
    public final View E;
    public final View F;
    public x11 G;
    public org.telegram.ui.Components.jp H;
    public boolean J;
    public ValueAnimator K;
    public org.telegram.ui.Components.uo L;
    public float M;
    public boolean N;
    public boolean O;
    public final m21 P;
    public final org.telegram.ui.Components.ip f35890b;
    public final i21 f35891c;
    public final m21 d;
    public final Window e;
    public final Drawable f35892f;
    public final ah.d h;
    public final TextView f35893n;
    public final org.telegram.ui.Components.t00 f35894r;
    public final TextView f35895s;
    public final LinearLayout v;
    public final TextView f35896w;
    public final ImageView f35897x;
    public final org.telegram.ui.Components.sl0 f35898y;
    public final Paint f35889a = new Paint(1);
    public int I = -1;

    public l21(m21 m21Var, m21 m21Var2, Window window) {
        int i10;
        f2.i0 wVar;
        int i11;
        this.P = m21Var;
        this.d = m21Var2;
        this.e = window;
        Activity parentActivity = m21Var2.getParentActivity();
        this.f35891c = new f2.j0(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f35892f = mutate;
        int themedColor = m21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ah.d dVar = new ah.d(this, parentActivity, m21Var2);
        this.h = dVar;
        TextView textView = new TextView(parentActivity);
        this.f35893n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(m21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        dVar.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = m21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        int i13 = R.raw.sun_outline;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i13, "" + R.raw.sun_outline, dp, dp, false, null);
        this.B = gj0Var;
        this.J = org.telegram.ui.ActionBar.j6.I.q() ^ true;
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        j21 j21Var = new j21(this, parentActivity);
        this.C = j21Var;
        j21Var.setAnimation(gj0Var);
        j21Var.setScaleType(ImageView.ScaleType.CENTER);
        j21Var.setOnClickListener(new e60(this, 28));
        j21Var.setAlpha(0.0f);
        j21Var.setVisibility(4);
        dVar.addView(j21Var, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity, m21Var2.f36169a);
        this.f35894r = t00Var;
        t00Var.setVisibility(0);
        dVar.addView(t00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.O = true;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(parentActivity, null);
        this.f35898y = sl0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) m21Var).currentAccount;
        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(i10, 2, m21Var.f36169a);
        this.f35890b = ipVar;
        sl0Var.setAdapter(ipVar);
        sl0Var.setClipChildren(false);
        sl0Var.setClipToPadding(false);
        sl0Var.setItemAnimator(null);
        sl0Var.setNestedScrollingEnabled(false);
        if (this.O) {
            m21Var2.getParentActivity();
            wVar = new f2.i0(0, false);
        } else {
            m21Var2.getParentActivity();
            wVar = new f2.w(3, false);
        }
        this.D = wVar;
        sl0Var.setLayoutManager(wVar);
        sl0Var.setOnItemClickListener(new j(this, 29));
        sl0Var.setOnScrollListener(new org.telegram.ui.Components.n41(this));
        dVar.addView(sl0Var);
        View view = new View(parentActivity);
        this.E = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        dVar.addView(view);
        View view2 = new View(parentActivity);
        this.F = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        dVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.f35895s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, m21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(m21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        dVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.p2) m21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() == m21Var.I) {
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.v = linearLayout;
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(m21Var2.getThemedColor(i12)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.f35897x = imageView;
            imageView.setLayoutParams(k7.b6.t(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(m21Var2.getThemedColor(i12), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.f35896w = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(m21Var2.getThemedColor(i12));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            dVar.addView(linearLayout);
            return;
        }
        this.v = null;
        this.f35897x = null;
        this.f35896w = null;
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        if (this.J != z4) {
            this.J = z4;
            org.telegram.ui.Components.gj0 gj0Var = this.B;
            if (z4) {
                i10 = gj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            j21 j21Var = this.C;
            if (z10) {
                gj0Var.N(i10);
                if (j21Var != null) {
                    j21Var.d();
                    return;
                }
                return;
            }
            gj0Var.N(i10);
            gj0Var.L(i10, false, true);
            if (j21Var != null) {
                j21Var.invalidate();
            }
        }
    }

    public final void b(int i10) {
        this.I = i10;
        org.telegram.ui.Components.ip ipVar = this.f35890b;
        ipVar.E(i10);
        if (i10 > 0 && i10 < ipVar.d.size() / 2) {
            i10--;
        }
        this.D.h1(Math.min(i10, ipVar.d.size() - 1), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f35890b.l();
        }
    }
}
