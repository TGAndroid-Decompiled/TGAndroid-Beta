package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ei extends z4.a {
    public final int f33414c;
    public final SparseArray d;
    public final boolean e;
    public final List f33415f;
    public final MessageObject f33416g;
    public final org.telegram.ui.Components.qj0 h;
    public final MessageObject f33417i;
    public final SparseIntArray f33418j;
    public final int f33419k;
    public final z4.g f33420l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33421m;
    public final int[] f33422n;
    public final int f33423o;
    public final wn f33424p;

    public ei(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.qj0 qj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33424p = wnVar;
        this.f33414c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33415f = list;
        this.f33416g = messageObject;
        this.h = qj0Var;
        this.f33417i = messageObject2;
        this.f33418j = sparseIntArray;
        this.f33419k = i11;
        this.f33420l = gVar;
        this.f33421m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33422n = iArr;
        this.f33423o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33414c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33415f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        wn wnVar = this.f33424p;
        un unVar = wnVar.f39469ea;
        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context, unVar, i12, this.f33416g, reactionCount2, true);
        org.telegram.ui.Components.qj0 qj0Var = this.h;
        ak0Var.h(qj0Var.getSeenUsers());
        ak0Var.G = new z0(this, 16);
        ak0Var.E = new o(11, this, this.f33417i);
        ak0Var.f22722y = new ei.u4(this.f33418j, i10, this.f33419k, this.f33420l, this.f33421m, this.f33422n);
        if (i11 < 0) {
            ak0Var.setPredictiveCount(this.f33423o);
            qj0Var.setSeenCallback(new h3(ak0Var, 1));
        }
        gVar.addView(ak0Var);
        sparseArray.put(i10, ak0Var);
        return ak0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
