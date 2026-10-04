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
    public z5 f34997a;
    public org.telegram.ui.Components.zl0 f34998b;
    public final ArrayList f34999c;
    public ArrayList d;
    public int f35000e;

    public b6(Bundle bundle) {
        super(bundle);
        this.f34999c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void S() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f34999c;
        if (!z10 && this.f34997a != null) {
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
        z5 z5Var = this.f34997a;
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
        hg.k0.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f34998b = new org.telegram.ui.Components.zl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f46563m = false;
        this.f34998b.setItemAnimator(jVar);
        this.f34998b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var = this.f34998b;
        z5 z5Var = new z5(this);
        this.f34997a = z5Var;
        zl0Var.setAdapter(z5Var);
        this.f34998b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f34998b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false));
        S();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35000e = getArguments().getInt("type");
        S();
        return super.onFragmentCreate();
    }
}
