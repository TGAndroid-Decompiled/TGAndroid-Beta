package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o41 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f36206c = {750000, 1000000, 1500000, 2000000};
    public org.telegram.ui.Components.yl0 f36207a;
    public n41 f36208b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, ja0 ja0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f18669a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, ja0Var));
        showDialog(alertDialog$Builder.f18669a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f36207a = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f36207a);
        this.f36207a.setLayoutManager(new s4.c0());
        this.f36207a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.yl0 yl0Var2 = this.f36207a;
        n41 n41Var = new n41(context);
        this.f36208b = n41Var;
        yl0Var2.setAdapter(n41Var);
        this.f36207a.setOnItemClickListener(new a31(this, 3));
        frameLayout.addView(this.f36207a, w7.y5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
