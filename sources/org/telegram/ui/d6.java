package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class d6 extends org.telegram.ui.ActionBar.p2 {
    public b6 f33520a;
    public org.telegram.ui.Components.sl0 f33521b;
    public final ArrayList f33522c;
    public ArrayList d;
    public int e;

    public d6(Bundle bundle) {
        super(bundle);
        this.f33522c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z4 = this.isPaused;
        ArrayList arrayList2 = this.f33522c;
        if (!z4 && this.f33520a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new c6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new c6(2, (CacheByChatsController.KeepMediaException) obj));
            z10 = true;
        }
        if (z10) {
            arrayList2.add(new c6(3, null));
            arrayList2.add(new c6(4, null));
        }
        arrayList2.add(new c6(3, null));
        b6 b6Var = this.f33520a;
        if (b6Var != null) {
            if (arrayList != null) {
                b6Var.E(arrayList, arrayList2);
            } else {
                b6Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f33521b = new org.telegram.ui.Components.sl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5818m = false;
        this.f33521b.setItemAnimator(lVar);
        this.f33521b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var = this.f33521b;
        b6 b6Var = new b6(this);
        this.f33520a = b6Var;
        sl0Var.setAdapter(b6Var);
        this.f33521b.setOnItemClickListener(new a1(this, 7));
        frameLayout.addView(this.f33521b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
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
