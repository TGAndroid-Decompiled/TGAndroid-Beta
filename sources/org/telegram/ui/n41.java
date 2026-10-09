package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n41 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f40070c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.qm0 f40071a;
    public m41 f40072b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, a80 a80Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20374a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, a80Var));
        showDialog(alertDialog$Builder.f20374a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f40071a = qm0Var;
        qm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40071a);
        this.f40071a.setLayoutManager(new s4.d0());
        this.f40071a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f40071a;
        m41 m41Var = new m41(context);
        this.f40072b = m41Var;
        qm0Var2.setAdapter(m41Var);
        this.f40071a.setOnItemClickListener(new z21(this, 3));
        frameLayout.addView(this.f40071a, w7.x5.d(-1.0f, -1));
        return this.fragmentView;
    }
}
