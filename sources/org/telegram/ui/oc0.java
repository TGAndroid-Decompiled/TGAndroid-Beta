package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
public final class oc0 extends org.telegram.ui.Components.vt0 {
    public Boolean E;
    public int F;
    public int G;
    public final xd0 H;
    public final org.telegram.ui.Components.fh0 f48257a;
    public final TextView f48258b;
    public final TextView f48259c;
    public final TextView d;
    public final TextView f48260e;
    public final TextView f48261f;
    public o4 h;
    public Bundle f48262n;
    public String f48263r;
    public String f48264s;
    public String f48265w;
    public int f48266x;
    public int f48267y;

    public oc0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        this.H = xd0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f48257a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624189, 120, 120, null);
        frameLayout.addView((View) imageView, b8.mf.e(120, 120, 1));
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y && !org.telegram.messenger.g0.Q1()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
        linearLayout.addView(frameLayout, b8.mf.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f48258b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131746127, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f48259c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, b8.mf.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f48261f = textView3;
        org.telegram.messenger.k5.m(textView3, 1, "ResetAccountStatus", 2131746123);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, b8.mf.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.f48260e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView4, b8.mf.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(org.telegram.messenger.bd.M0(2131746127, null));
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView5.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, b8.mf.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new b40(this, 7));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.H.t1(true, true);
        org.telegram.messenger.g0.r(this.h);
        this.h = null;
        this.f48262n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131746127, "ResetAccount");
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f48262n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f48262n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f48262n = bundle;
        this.f48263r = bundle.getString("phoneFormated");
        this.f48264s = bundle.getString("phoneHash");
        this.f48265w = bundle.getString("code");
        this.f48266x = bundle.getInt("startTime");
        this.f48267y = bundle.getInt("waitTime");
        mf.b c2 = mf.b.c();
        org.telegram.messenger.k5.r("ResetAccountInfo", null, 2131746124, new Object[]{org.telegram.messenger.bd.a(c2.b("+" + this.f48263r))}, this.f48259c);
        n();
        o4 o4Var = new o4(this, 11);
        this.h = o4Var;
        org.telegram.messenger.g0.i3(o4Var, 1000L);
    }

    public final void n() {
        int i3;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f48267y;
        i3 = ((org.telegram.ui.ActionBar.d2) this.H).currentAccount;
        int currentTime = i12 - (ConnectionsManager.getInstance(i3).getCurrentTime() - this.f48266x);
        int i13 = 0;
        int max = Math.max(0, currentTime);
        int i14 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i15 = max / 3600;
        int i16 = (max / 60) % 60;
        int i17 = max % 60;
        TextView textView = this.f48260e;
        if (i14 >= 2) {
            textView.setText(org.telegram.messenger.bd.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)));
        }
        if (max == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.E;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.fh0 fh0Var = this.f48257a;
        if (!z10) {
            fh0Var.setAutoRepeat(true);
            if (!fh0Var.b()) {
                fh0Var.d();
            }
        } else {
            fh0Var.getAnimatedDrawable().K(0);
        }
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f48261f.setVisibility(i11);
        if (!z10) {
            i13 = 4;
        }
        this.d.setVisibility(i13);
        this.E = Boolean.valueOf(z10);
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.f48258b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f48259c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f48261f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f48260e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ki, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = org.telegram.messenger.g0.L(6.0f);
            textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03));
        } else if (x02 != this.F || x03 != this.G) {
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x03, true);
        }
        this.F = x02;
        this.G = x03;
    }
}
