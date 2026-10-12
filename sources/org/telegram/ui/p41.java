package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p41 extends org.telegram.ui.ActionBar.m2 {
    public static final int[] f40847c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.wm0 f40848a;
    public o41 f40849b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, c80 c80Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20142a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, c80Var));
        showDialog(alertDialog$Builder.f20142a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f40848a = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40848a);
        this.f40848a.setLayoutManager(new s4.d0());
        this.f40848a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f40848a;
        o41 o41Var = new o41(context);
        this.f40849b = o41Var;
        wm0Var2.setAdapter(o41Var);
        this.f40848a.setOnItemClickListener(new d21(this, 4));
        frameLayout.addView(this.f40848a, w7.w5.d(-1.0f, -1));
        return this.fragmentView;
    }
}
