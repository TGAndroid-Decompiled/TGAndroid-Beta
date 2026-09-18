package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gi extends z4.a {
    public final int f33866c;
    public final SparseArray d;
    public final boolean e;
    public final List f33867f;
    public final MessageObject f33868g;
    public final org.telegram.ui.Components.qj0 h;
    public final MessageObject f33869i;
    public final SparseIntArray f33870j;
    public final int f33871k;
    public final z4.g f33872l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33873m;
    public final int[] f33874n;
    public final int f33875o;
    public final zn f33876p;

    public gi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.qj0 qj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33876p = znVar;
        this.f33866c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33867f = list;
        this.f33868g = messageObject;
        this.h = qj0Var;
        this.f33869i = messageObject2;
        this.f33870j = sparseIntArray;
        this.f33871k = i11;
        this.f33872l = gVar;
        this.f33873m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33874n = iArr;
        this.f33875o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33866c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33867f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f33876p;
        xn xnVar = znVar.f40261ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context, xnVar, i12, this.f33868g, reactionCount2, true);
        org.telegram.ui.Components.qj0 qj0Var = this.h;
        ak0Var.h(qj0Var.getSeenUsers());
        ak0Var.G = new y0(this, 17);
        ak0Var.E = new l4(9, this, this.f33869i);
        ak0Var.f22647y = new ei.u4(this.f33870j, i10, this.f33871k, this.f33872l, this.f33873m, this.f33874n);
        if (i11 < 0) {
            ak0Var.setPredictiveCount(this.f33875o);
            qj0Var.setSeenCallback(new g3(ak0Var, 1));
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
