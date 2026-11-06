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
public final class qc0 extends org.telegram.ui.Components.wt0 {
    public Boolean D;
    public int E;
    public int F;
    public final ce0 G;
    public final org.telegram.ui.Components.ch0 f49189a;
    public final TextView f49190b;
    public final TextView f49191c;
    public final TextView d;
    public final TextView f49192e;
    public final TextView f49193f;
    public m4 h;
    public Bundle f49194n;
    public String f49195r;
    public String f49196s;
    public String f49197w;
    public int f49198x;
    public int f49199y;

    public qc0(ce0 ce0Var, Context context) {
        super(context);
        int i7;
        this.G = ce0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f49189a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624189, 120, 120, null);
        frameLayout.addView((View) imageView, c8.ha.e(120, 120, 1));
        Point point = org.telegram.messenger.g0.f22544q;
        if (point.x > point.y && !org.telegram.messenger.g0.Q1()) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        frameLayout.setVisibility(i7);
        linearLayout.addView(frameLayout, c8.ha.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f49190b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131746118, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f49191c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, c8.ha.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f49193f = textView3;
        org.telegram.messenger.k5.m(textView3, 1, "ResetAccountStatus", 2131746114);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, c8.ha.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.f49192e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView4, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(org.telegram.messenger.hd.M0(2131746118, null));
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView5.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, c8.ha.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new g40(this, 7));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        this.G.C1(true, true);
        org.telegram.messenger.g0.r(this.h);
        this.h = null;
        this.f49194n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131746118, "ResetAccount");
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f49194n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f49194n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        this.f49194n = bundle;
        this.f49195r = bundle.getString("phoneFormated");
        this.f49196s = bundle.getString("phoneHash");
        this.f49197w = bundle.getString("code");
        this.f49198x = bundle.getInt("startTime");
        this.f49199y = bundle.getInt("waitTime");
        pf.b c10 = pf.b.c();
        org.telegram.messenger.k5.r("ResetAccountInfo", null, 2131746115, new Object[]{org.telegram.messenger.hd.a(c10.b("+" + this.f49195r))}, this.f49191c);
        n();
        m4 m4Var = new m4(this, 11);
        this.h = m4Var;
        org.telegram.messenger.g0.i3(m4Var, 1000L);
    }

    public final void n() {
        int i7;
        boolean z9;
        int i10;
        int i11;
        int i12 = this.f49199y;
        i7 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
        int currentTime = i12 - (ConnectionsManager.getInstance(i7).getCurrentTime() - this.f49198x);
        int i13 = 0;
        int max = Math.max(0, currentTime);
        int i14 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i15 = max / 3600;
        int i16 = (max / 60) % 60;
        int i17 = max % 60;
        TextView textView = this.f49192e;
        if (i14 >= 2) {
            textView.setText(org.telegram.messenger.hd.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)));
        }
        if (max == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        org.telegram.ui.Components.ch0 ch0Var = this.f49189a;
        if (!z9) {
            ch0Var.setAutoRepeat(true);
            if (!ch0Var.b()) {
                ch0Var.d();
            }
        } else {
            ch0Var.getAnimatedDrawable().K(0);
        }
        if (z9) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (z9) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f49193f.setVisibility(i11);
        if (!z9) {
            i13 = 4;
        }
        this.d.setVisibility(i13);
        this.D = Boolean.valueOf(z9);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.f49190b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49191c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49193f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49192e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ki, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = org.telegram.messenger.g0.L(6.0f);
            textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03));
        } else if (x02 != this.E || x03 != this.F) {
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x03, true);
        }
        this.E = x02;
        this.F = x03;
    }
}
