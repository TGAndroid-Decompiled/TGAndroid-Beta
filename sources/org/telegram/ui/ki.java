package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ki extends z4.a {
    public final int f38885c;
    public final SparseArray d;
    public final boolean e;
    public final List f38886f;
    public final org.telegram.messenger.kj f38887g;
    public final org.telegram.ui.Components.mi0 h;
    public final org.telegram.messenger.kj f38888i;
    public final SparseIntArray f38889j;
    public final int f38890k;
    public final z4.g f38891l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38892m;
    public final int[] f38893n;
    public final int f38894o;
    public final un f38895p;

    public ki(un unVar, int i10, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.kj kjVar, org.telegram.ui.Components.mi0 mi0Var, org.telegram.messenger.kj kjVar2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38895p = unVar;
        this.f38885c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f38886f = list;
        this.f38887g = kjVar;
        this.h = mi0Var;
        this.f38888i = kjVar2;
        this.f38889j = sparseIntArray;
        this.f38890k = i11;
        this.f38891l = gVar;
        this.f38892m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38893n = iArr;
        this.f38894o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38885c;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38886f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        un unVar = this.f38895p;
        sn snVar = unVar.f42288xa;
        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(context, snVar, i12, this.f38887g, reactionCount2, true);
        org.telegram.ui.Components.mi0 mi0Var = this.h;
        wi0Var.h(mi0Var.getSeenUsers());
        wi0Var.G = new y0(this, 18);
        wi0Var.E = new ng.d(13, this, this.f38888i);
        wi0Var.D = new mg.e(this.f38889j, i10, this.f38890k, this.f38891l, this.f38892m, this.f38893n);
        if (i11 < 0) {
            wi0Var.setPredictiveCount(this.f38894o);
            mi0Var.setSeenCallback(new f3(wi0Var, 1));
        }
        gVar.addView(wi0Var);
        sparseArray.put(i10, wi0Var);
        return wi0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
