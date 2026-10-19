package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class e6 extends org.telegram.ui.ActionBar.n2 {
    public c6 f36546a;
    public org.telegram.ui.Components.im0 f36547b;
    public final ArrayList f36548c;
    public ArrayList d;
    public int e;

    public e6(Bundle bundle) {
        super(bundle);
        this.f36548c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f36548c;
        if (!z10 && this.f36546a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new d6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new d6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new d6(3, null));
            arrayList2.add(new d6(4, null));
        }
        arrayList2.add(new d6(3, null));
        c6 c6Var = this.f36546a;
        if (c6Var != null) {
            if (arrayList != null) {
                c6Var.E(arrayList, arrayList2);
            } else {
                c6Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.e.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 24));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36547b = new org.telegram.ui.Components.im0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f45946m = false;
        this.f36547b.setItemAnimator(kVar);
        this.f36547b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.im0 im0Var = this.f36547b;
        c6 c6Var = new c6(this);
        this.f36546a = c6Var;
        im0Var.setAdapter(c6Var);
        this.f36547b.setOnItemClickListener(new b1(this, 7));
        frameLayout.addView(this.f36547b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20929a7, false));
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
