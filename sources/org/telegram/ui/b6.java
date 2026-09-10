package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class b6 extends org.telegram.ui.ActionBar.p2 {
    public z5 f31164a;
    public org.telegram.ui.Components.vl0 f31165b;
    public final ArrayList f31166c;
    public ArrayList d;
    public int e;

    public b6(Bundle bundle) {
        super(bundle);
        this.f31166c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f31166c;
        if (!z10 && this.f31164a != null) {
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
        z5 z5Var = this.f31164a;
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
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f31165b = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f41645m = false;
        this.f31165b.setItemAnimator(jVar);
        this.f31165b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var = this.f31165b;
        z5 z5Var = new z5(this);
        this.f31164a = z5Var;
        vl0Var.setAdapter(z5Var);
        this.f31165b.setOnItemClickListener(new a1(this, 7));
        frameLayout.addView(this.f31165b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
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
