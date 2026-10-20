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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class oe0 extends org.telegram.ui.Components.qw0 {
    public final dg0 E;
    public final org.telegram.ui.Components.yj0 f39853a;
    public final TextView f39854b;
    public final TextView f39855c;
    public final TextView d;
    public final TextView e;
    public final TextView f39856f;
    public a6 h;
    public Bundle f39857n;
    public String f39858r;
    public String f39859s;
    public String v;
    public int f39860w;
    public int f39861x;
    public Boolean f39862y;

    public oe0(dg0 dg0Var, Context context) {
        super(context);
        int i10;
        this.E = dg0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f39853a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView((View) imageView, w7.z5.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y && !AndroidUtilities.isTablet()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        linearLayout.addView(frameLayout, w7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f39854b = textView;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f39855c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, w7.z5.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f39856f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, w7.z5.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, w7.z5.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new s50(this, 7));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.E.k1(true, true);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.h = null;
        this.f39857n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f39857n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f39857n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f39857n = bundle;
        this.f39858r = bundle.getString("phoneFormated");
        this.f39859s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.f39860w = bundle.getInt("startTime");
        this.f39861x = bundle.getInt("waitTime");
        int i10 = R.string.ResetAccountInfo;
        jf.b c10 = jf.b.c();
        this.f39855c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", i10, LocaleController.addNbsp(c10.b("+" + this.f39858r)))));
        o();
        a6 a6Var = new a6(this, 9);
        this.h = a6Var;
        AndroidUtilities.runOnUIThread(a6Var, 1000L);
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f39854b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39855c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39856f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int dp = AndroidUtilities.dp(6.0f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wh, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, x03, x03));
    }

    public final void o() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = this.f39861x;
        i10 = ((org.telegram.ui.ActionBar.n2) this.E).currentAccount;
        int currentTime = i13 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.f39860w);
        int i14 = 0;
        int max = Math.max(0, currentTime);
        int i15 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i16 = max / 3600;
        int i17 = (max / 60) % 60;
        int i18 = max % 60;
        TextView textView = this.e;
        if (i15 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18)));
        }
        if (max == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f39862y;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.yj0 yj0Var = this.f39853a;
        if (!z10) {
            yj0Var.setAutoRepeat(true);
            if (!yj0Var.b()) {
                yj0Var.d();
            }
        } else {
            yj0Var.getAnimatedDrawable().K(0);
        }
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (z10) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        this.f39856f.setVisibility(i12);
        if (!z10) {
            i14 = 4;
        }
        this.d.setVisibility(i14);
        this.f39862y = Boolean.valueOf(z10);
    }
}
