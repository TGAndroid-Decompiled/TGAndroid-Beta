package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class c6 extends org.telegram.ui.ActionBar.o2 {
    public a6 f32527a;
    public org.telegram.ui.Components.yl0 f32528b;
    public final ArrayList f32529c;
    public ArrayList d;
    public int e;

    public c6(Bundle bundle) {
        super(bundle);
        this.f32529c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f32529c;
        if (!z10 && this.f32527a != null) {
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
        a6 a6Var = this.f32527a;
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
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f32528b = new org.telegram.ui.Components.yl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f43040m = false;
        this.f32528b.setItemAnimator(jVar);
        this.f32528b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.yl0 yl0Var = this.f32528b;
        a6 a6Var = new a6(this);
        this.f32527a = a6Var;
        yl0Var.setAdapter(a6Var);
        this.f32528b.setOnItemClickListener(new a1(this, 7));
        frameLayout.addView(this.f32528b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
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
