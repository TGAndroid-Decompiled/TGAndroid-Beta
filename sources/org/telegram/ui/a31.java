package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a31 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f35266c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.jm0 f35267a;
    public z21 f35268b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, fk0 fk0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20608a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, fk0Var));
        showDialog(alertDialog$Builder.f20608a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f35267a = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35267a);
        this.f35267a.setLayoutManager(new s4.b0());
        this.f35267a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f35267a;
        z21 z21Var = new z21(context);
        this.f35268b = z21Var;
        jm0Var2.setAdapter(z21Var);
        this.f35267a.setOnItemClickListener(new f11(this, 3));
        frameLayout.addView(this.f35267a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
