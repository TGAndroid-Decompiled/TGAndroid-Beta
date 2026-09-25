package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class a6 extends org.telegram.ui.ActionBar.m2 {
    public y5 f31991a;
    public org.telegram.ui.Components.wl0 f31992b;
    public final ArrayList f31993c;
    public ArrayList d;
    public int e;

    public a6(Bundle bundle) {
        super(bundle);
        this.f31993c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f31993c;
        if (!z10 && this.f31991a != null) {
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
        y5 y5Var = this.f31991a;
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
        hg.c.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f31992b = new org.telegram.ui.Components.wl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42996m = false;
        this.f31992b.setItemAnimator(jVar);
        this.f31992b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.wl0 wl0Var = this.f31992b;
        y5 y5Var = new y5(this);
        this.f31991a = y5Var;
        wl0Var.setAdapter(y5Var);
        this.f31992b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f31992b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
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
