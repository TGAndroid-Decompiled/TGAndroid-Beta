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
    public b6 f36007a;
    public org.telegram.ui.Components.tl0 f36008b;
    public final ArrayList f36009c;
    public ArrayList d;
    public int f36010e;

    public d6(Bundle bundle) {
        super(bundle);
        this.f36009c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z4 = this.isPaused;
        ArrayList arrayList2 = this.f36009c;
        if (!z4 && this.f36007a != null) {
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
        b6 b6Var = this.f36007a;
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
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36008b = new org.telegram.ui.Components.tl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5910m = false;
        this.f36008b.setItemAnimator(lVar);
        this.f36008b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var = this.f36008b;
        b6 b6Var = new b6(this);
        this.f36007a = b6Var;
        tl0Var.setAdapter(b6Var);
        this.f36008b.setOnItemClickListener(new a1(this, 7));
        frameLayout.addView(this.f36008b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36010e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
