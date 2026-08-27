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

    public y5 f36379a;

    public org.telegram.ui.Components.zk0 f36380b;

    public final ArrayList f36381c;
    public ArrayList d;

    public int f36382e;

    public a6(Bundle bundle) {
        super(bundle);
        this.f36381c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f36381c;
        if (z10 || this.f36379a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
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
        y5 y5Var = this.f36379a;
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
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 17));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36380b = new org.telegram.ui.Components.zk0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5819m = false;
        this.f36380b.setItemAnimator(lVar);
        this.f36380b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var = this.f36380b;
        y5 y5Var = new y5(this);
        this.f36379a = y5Var;
        zk0Var.setAdapter(y5Var);
        this.f36380b.setOnItemClickListener(new c1(this, 7));
        frameLayout.addView(this.f36380b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36382e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
