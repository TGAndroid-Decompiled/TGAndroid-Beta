package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g31 extends org.telegram.ui.ActionBar.r2 {
    public static final int[] f39532c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.mm0 f39533a;
    public f31 f39534b;

    public static String V(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void W(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.c1 c1Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22366a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new ng.j(11, this, c1Var));
        showDialog(alertDialog$Builder.f22366a);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39533a = mm0Var;
        mm0Var.u1();
        this.f39533a.setSectionsDrawBackground(true);
        this.f39533a.setLayoutManager(new s4.c0());
        this.f39533a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39533a;
        f31 f31Var = new f31(context);
        this.f39534b = f31Var;
        mm0Var2.setAdapter(f31Var);
        this.f39533a.setOnItemClickListener(new m11(this, 3));
        frameLayout.addView(this.f39533a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f39533a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
