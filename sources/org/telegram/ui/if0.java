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
public final class if0 extends org.telegram.ui.Components.fw0 {
    public final xg0 E;
    public final org.telegram.ui.Components.kj0 f33662a;
    public final TextView f33663b;
    public final TextView f33664c;
    public final TextView d;
    public final TextView e;
    public final TextView f33665f;
    public x5 h;
    public Bundle f33666n;
    public String f33667r;
    public String f33668s;
    public String v;
    public int f33669w;
    public int f33670x;
    public Boolean f33671y;

    public if0(xg0 xg0Var, Context context) {
        super(context);
        int i10;
        this.E = xg0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f33662a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView((View) imageView, w7.a6.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y && !AndroidUtilities.isTablet()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        linearLayout.addView(frameLayout, w7.a6.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f33663b = textView;
        com.google.android.gms.internal.vision.e2.k(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.a6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f33664c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, w7.a6.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f33665f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, w7.a6.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, w7.a6.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, w7.a6.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new l60(this, 7));
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
        this.f33666n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f33666n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f33666n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f33666n = bundle;
        this.f33667r = bundle.getString("phoneFormated");
        this.f33668s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.f33669w = bundle.getInt("startTime");
        this.f33670x = bundle.getInt("waitTime");
        int i10 = R.string.ResetAccountInfo;
        gf.b c10 = gf.b.c();
        this.f33664c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", i10, LocaleController.addNbsp(c10.b("+" + this.f33667r)))));
        o();
        x5 x5Var = new x5(this, 9);
        this.h = x5Var;
        AndroidUtilities.runOnUIThread(x5Var, 1000L);
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f33663b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f33664c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f33665f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int dp = AndroidUtilities.dp(6.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wh, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
    }

    public final void o() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = this.f33670x;
        i10 = ((org.telegram.ui.ActionBar.p2) this.E).currentAccount;
        int currentTime = i13 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.f33669w);
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
        Boolean bool = this.f33671y;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.kj0 kj0Var = this.f33662a;
        if (!z10) {
            kj0Var.setAutoRepeat(true);
            if (!kj0Var.b()) {
                kj0Var.d();
            }
        } else {
            kj0Var.getAnimatedDrawable().K(0);
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
        this.f33665f.setVisibility(i12);
        if (!z10) {
            i14 = 4;
        }
        this.d.setVisibility(i14);
        this.f33671y = Boolean.valueOf(z10);
    }
}
