package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class d6 extends org.telegram.ui.ActionBar.m2 {
    public b6 f36652a;
    public org.telegram.ui.Components.wm0 f36653b;
    public final ArrayList f36654c;
    public ArrayList d;
    public int f36655e;

    public d6(Bundle bundle) {
        super(bundle);
        this.f36654c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f36654c;
        if (!z10 && this.f36652a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new c6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new c6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new c6(3, null));
            arrayList2.add(new c6(4, null));
        }
        arrayList2.add(new c6(3, null));
        b6 b6Var = this.f36652a;
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
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36653b = new org.telegram.ui.Components.wm0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47929m = false;
        this.f36653b.setItemAnimator(jVar);
        this.f36653b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var = this.f36653b;
        b6 b6Var = new b6(this);
        this.f36652a = b6Var;
        wm0Var.setAdapter(b6Var);
        this.f36653b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f36653b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36655e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
