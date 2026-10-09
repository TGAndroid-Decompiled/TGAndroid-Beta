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
    public y5 f35839a;
    public org.telegram.ui.Components.qm0 f35840b;
    public final ArrayList f35841c;
    public ArrayList d;
    public int f35842e;

    public a6(Bundle bundle) {
        super(bundle);
        this.f35841c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f35841c;
        if (!z10 && this.f35839a != null) {
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
        y5 y5Var = this.f35839a;
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
        this.f35840b = new org.telegram.ui.Components.qm0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47698m = false;
        this.f35840b.setItemAnimator(jVar);
        this.f35840b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.qm0 qm0Var = this.f35840b;
        y5 y5Var = new y5(this);
        this.f35839a = y5Var;
        qm0Var.setAdapter(y5Var);
        this.f35840b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f35840b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35842e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
