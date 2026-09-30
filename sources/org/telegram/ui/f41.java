package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f41 extends org.telegram.ui.ActionBar.m2 {
    public static final int[] f33628c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.zl0 f33629a;
    public e41 f33630b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.e1 e1Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f18678a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, e1Var));
        showDialog(alertDialog$Builder.f18678a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19020a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f33629a = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f33629a);
        this.f33629a.setLayoutManager(new s4.c0());
        this.f33629a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f33629a;
        e41 e41Var = new e41(context);
        this.f33630b = e41Var;
        zl0Var2.setAdapter(e41Var);
        this.f33629a.setOnItemClickListener(new r21(this, 3));
        frameLayout.addView(this.f33629a, w7.y5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
