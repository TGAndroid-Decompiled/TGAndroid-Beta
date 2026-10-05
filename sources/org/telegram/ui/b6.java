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
    public z5 f35055a;
    public org.telegram.ui.Components.zl0 f35056b;
    public final ArrayList f35057c;
    public ArrayList d;
    public int f35058e;

    public b6(Bundle bundle) {
        super(bundle);
        this.f35057c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void S() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f35057c;
        if (!z10 && this.f35055a != null) {
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
        z5 z5Var = this.f35055a;
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
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35056b = new org.telegram.ui.Components.zl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f46577m = false;
        this.f35056b.setItemAnimator(jVar);
        this.f35056b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var = this.f35056b;
        z5 z5Var = new z5(this);
        this.f35055a = z5Var;
        zl0Var.setAdapter(z5Var);
        this.f35056b.setOnItemClickListener(new z0(this, 7));
        frameLayout.addView(this.f35056b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        S();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35058e = getArguments().getInt("type");
        S();
        return super.onFragmentCreate();
    }
}
