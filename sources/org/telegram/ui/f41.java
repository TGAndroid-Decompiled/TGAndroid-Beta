package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f41 extends org.telegram.ui.ActionBar.m2 {
    public static final int[] f33528c = {750000, 1000000, 1150000, 2000000};
    public org.telegram.ui.Components.wl0 f33529a;
    public e41 f33530b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.2f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.e1 e1Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f18647a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, e1Var));
        showDialog(alertDialog$Builder.f18647a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18989a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f33529a = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33529a);
        this.f33529a.setLayoutManager(new s4.c0());
        this.f33529a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wl0 wl0Var2 = this.f33529a;
        e41 e41Var = new e41(context);
        this.f33530b = e41Var;
        wl0Var2.setAdapter(e41Var);
        this.f33529a.setOnItemClickListener(new r21(this, 3));
        frameLayout.addView(this.f33529a, w7.y5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
