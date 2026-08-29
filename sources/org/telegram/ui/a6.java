package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class a6 extends org.telegram.ui.ActionBar.o2 {
    public y5 f36436a;
    public org.telegram.ui.Components.jl0 f36437b;
    public final ArrayList f36438c;
    public ArrayList d;
    public int f36439e;

    public a6(Bundle bundle) {
        super(bundle);
        this.f36438c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f36438c;
        if (!z10 && this.f36436a != null) {
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
        y5 y5Var = this.f36436a;
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
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36437b = new org.telegram.ui.Components.jl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f6463m = false;
        this.f36437b.setItemAnimator(lVar);
        this.f36437b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var = this.f36437b;
        y5 y5Var = new y5(this);
        this.f36436a = y5Var;
        jl0Var.setAdapter(y5Var);
        this.f36437b.setOnItemClickListener(new c1(this, 7));
        frameLayout.addView(this.f36437b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36439e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
