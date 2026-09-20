package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o41 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f36188c = {750000, 1000000, 1500000, 2000000};
    public org.telegram.ui.Components.vl0 f36189a;
    public n41 f36190b;

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
        alertDialog$Builder.f18654a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, ja0Var));
        showDialog(alertDialog$Builder.f18654a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f36189a = vl0Var;
        vl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f36189a);
        this.f36189a.setLayoutManager(new s4.c0());
        this.f36189a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f36189a;
        n41 n41Var = new n41(context);
        this.f36190b = n41Var;
        vl0Var2.setAdapter(n41Var);
        this.f36189a.setOnItemClickListener(new a31(this, 3));
        frameLayout.addView(this.f36189a, w7.y5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
