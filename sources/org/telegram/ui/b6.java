package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class b6 extends org.telegram.ui.ActionBar.n2 {
    public z5 f31969a;
    public org.telegram.ui.Components.ml0 f31970b;
    public final ArrayList f31971c;
    public ArrayList d;
    public int e;

    public b6(Bundle bundle) {
        super(bundle);
        this.f31971c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f31971c;
        if (!z10 && this.f31969a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new a6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new a6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new a6(3, null));
            arrayList2.add(new a6(4, null));
        }
        arrayList2.add(new a6(3, null));
        z5 z5Var = this.f31969a;
        if (z5Var != null) {
            if (arrayList != null) {
                z5Var.E(arrayList, arrayList2);
            } else {
                z5Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f31970b = new org.telegram.ui.Components.ml0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42662m = false;
        this.f31970b.setItemAnimator(jVar);
        this.f31970b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ml0 ml0Var = this.f31970b;
        z5 z5Var = new z5(this);
        this.f31969a = z5Var;
        ml0Var.setAdapter(z5Var);
        this.f31970b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f31970b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
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
