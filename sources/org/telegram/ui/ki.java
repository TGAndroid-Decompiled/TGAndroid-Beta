package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ki extends z4.a {
    public final int f38862c;
    public final SparseArray d;
    public final boolean e;
    public final List f38863f;
    public final org.telegram.messenger.jj f38864g;
    public final org.telegram.ui.Components.li0 h;
    public final org.telegram.messenger.jj f38865i;
    public final SparseIntArray f38866j;
    public final int f38867k;
    public final z4.g f38868l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38869m;
    public final int[] f38870n;
    public final int f38871o;
    public final un f38872p;

    public ki(un unVar, int i10, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.jj jjVar, org.telegram.ui.Components.li0 li0Var, org.telegram.messenger.jj jjVar2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38872p = unVar;
        this.f38862c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f38863f = list;
        this.f38864g = jjVar;
        this.h = li0Var;
        this.f38865i = jjVar2;
        this.f38866j = sparseIntArray;
        this.f38867k = i11;
        this.f38868l = gVar;
        this.f38869m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38870n = iArr;
        this.f38871o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38862c;
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
            reactionCount = (TLRPC.ReactionCount) this.f38863f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        un unVar = this.f38872p;
        sn snVar = unVar.f42477xa;
        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(context, snVar, i12, this.f38864g, reactionCount2, true);
        org.telegram.ui.Components.li0 li0Var = this.h;
        vi0Var.h(li0Var.getSeenUsers());
        vi0Var.G = new y0(this, 18);
        vi0Var.E = new ng.d(13, this, this.f38865i);
        vi0Var.D = new mg.e(this.f38866j, i10, this.f38867k, this.f38868l, this.f38869m, this.f38870n);
        if (i11 < 0) {
            vi0Var.setPredictiveCount(this.f38871o);
            li0Var.setSeenCallback(new f3(vi0Var, 1));
        }
        gVar.addView(vi0Var);
        sparseArray.put(i10, vi0Var);
        return vi0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
