package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class c6 extends org.telegram.ui.ActionBar.r2 {
    public a6 f38178a;
    public org.telegram.ui.Components.nm0 f38179b;
    public final ArrayList f38180c;
    public ArrayList d;
    public int e;

    public c6(Bundle bundle) {
        super(bundle);
        this.f38180c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void V() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f38180c;
        if (!z10 && this.f38178a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new b6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new b6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new b6(3, null));
            arrayList2.add(new b6(4, null));
        }
        arrayList2.add(new b6(3, null));
        a6 a6Var = this.f38178a;
        if (a6Var != null) {
            if (arrayList != null) {
                a6Var.E(arrayList, arrayList2);
            } else {
                a6Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 24));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f38179b = nm0Var;
        nm0Var.u1();
        this.f38179b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.f47798m = false;
        this.f38179b.setItemAnimator(lVar);
        this.f38179b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f38179b;
        a6 a6Var = new a6(this);
        this.f38178a = a6Var;
        nm0Var2.setAdapter(a6Var);
        this.f38179b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.f38179b);
        V();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f38179b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt("type");
        V();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
