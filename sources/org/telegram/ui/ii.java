package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ii extends z4.a {
    public final int f34596c;
    public final SparseArray d;
    public final boolean e;
    public final List f34597f;
    public final MessageObject f34598g;
    public final org.telegram.ui.Components.gj0 h;
    public final MessageObject f34599i;
    public final SparseIntArray f34600j;
    public final int f34601k;
    public final z4.g f34602l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34603m;
    public final int[] f34604n;
    public final int f34605o;
    public final bo f34606p;

    public ii(bo boVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.gj0 gj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f34606p = boVar;
        this.f34596c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f34597f = list;
        this.f34598g = messageObject;
        this.h = gj0Var;
        this.f34599i = messageObject2;
        this.f34600j = sparseIntArray;
        this.f34601k = i11;
        this.f34602l = gVar;
        this.f34603m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34604n = iArr;
        this.f34605o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34596c;
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
            reactionCount = (TLRPC.ReactionCount) this.f34597f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        bo boVar = this.f34606p;
        zn znVar = boVar.f32279ea;
        i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, znVar, i12, this.f34598g, reactionCount2, true);
        org.telegram.ui.Components.gj0 gj0Var = this.h;
        qj0Var.h(gj0Var.getSeenUsers());
        qj0Var.G = new y0(this, 17);
        qj0Var.E = new x5(8, this, this.f34599i);
        qj0Var.f27336y = new ei.u4(this.f34600j, i10, this.f34601k, this.f34602l, this.f34603m, this.f34604n);
        if (i11 < 0) {
            qj0Var.setPredictiveCount(this.f34605o);
            gj0Var.setSeenCallback(new g3(qj0Var, 1));
        }
        gVar.addView(qj0Var);
        sparseArray.put(i10, qj0Var);
        return qj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
