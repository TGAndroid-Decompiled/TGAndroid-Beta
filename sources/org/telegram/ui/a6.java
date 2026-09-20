package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class a6 extends org.telegram.ui.ActionBar.n2 {
    public y5 f31995a;
    public org.telegram.ui.Components.vl0 f31996b;
    public final ArrayList f31997c;
    public ArrayList d;
    public int e;

    public a6(Bundle bundle) {
        super(bundle);
        this.f31997c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f31997c;
        if (!z10 && this.f31995a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new z5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new z5(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new z5(3, null));
            arrayList2.add(new z5(4, null));
        }
        arrayList2.add(new z5(3, null));
        y5 y5Var = this.f31995a;
        if (y5Var != null) {
            if (arrayList != null) {
                y5Var.E(arrayList, arrayList2);
            } else {
                y5Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f31996b = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f43009m = false;
        this.f31996b.setItemAnimator(jVar);
        this.f31996b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var = this.f31996b;
        y5 y5Var = new y5(this);
        this.f31995a = y5Var;
        vl0Var.setAdapter(y5Var);
        this.f31996b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.f31996b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
