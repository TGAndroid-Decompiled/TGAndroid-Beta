package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c31 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f35803c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.im0 f35804a;
    public b31 f35805b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, hk0 hk0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20601a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, hk0Var));
        showDialog(alertDialog$Builder.f20601a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f35804a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35804a);
        this.f35804a.setLayoutManager(new s4.b0());
        this.f35804a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.im0 im0Var2 = this.f35804a;
        b31 b31Var = new b31(context);
        this.f35805b = b31Var;
        im0Var2.setAdapter(b31Var);
        this.f35804a.setOnItemClickListener(new h11(this, 3));
        frameLayout.addView(this.f35804a, w7.z5.d(-1.0f, -1));
        return this.fragmentView;
    }
}
