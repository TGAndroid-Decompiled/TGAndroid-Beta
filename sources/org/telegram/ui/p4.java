package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.mm0 f42346a;
    public o4 f42347b;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f42346a = mm0Var;
        mm0Var.setSectionsDrawBackground(true);
        this.f42346a.u1();
        this.f42346a.setLayoutManager(new s4.c0());
        this.f42346a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f42346a;
        o4 o4Var = new o4(context);
        this.f42347b = o4Var;
        mm0Var2.setAdapter(o4Var);
        this.f42346a.setOnItemClickListener(new h(this, 2));
        frameLayout.addView(this.f42346a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f42346a;
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
