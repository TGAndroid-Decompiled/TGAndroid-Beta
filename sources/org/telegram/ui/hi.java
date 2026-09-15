package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hi extends z4.a {
    public final int f34283c;
    public final SparseArray d;
    public final boolean e;
    public final List f34284f;
    public final MessageObject f34285g;
    public final org.telegram.ui.Components.fj0 h;
    public final MessageObject f34286i;
    public final SparseIntArray f34287j;
    public final int f34288k;
    public final z4.g f34289l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34290m;
    public final int[] f34291n;
    public final int f34292o;
    public final bo f34293p;

    public hi(bo boVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fj0 fj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f34293p = boVar;
        this.f34283c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f34284f = list;
        this.f34285g = messageObject;
        this.h = fj0Var;
        this.f34286i = messageObject2;
        this.f34287j = sparseIntArray;
        this.f34288k = i11;
        this.f34289l = gVar;
        this.f34290m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34291n = iArr;
        this.f34292o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34283c;
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
            reactionCount = (TLRPC.ReactionCount) this.f34284f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        bo boVar = this.f34293p;
        zn znVar = boVar.f32297ea;
        i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, znVar, i12, this.f34285g, reactionCount2, true);
        org.telegram.ui.Components.fj0 fj0Var = this.h;
        pj0Var.h(fj0Var.getSeenUsers());
        pj0Var.G = new y0(this, 16);
        pj0Var.E = new x5(8, this, this.f34286i);
        pj0Var.f27068y = new ei.u4(this.f34287j, i10, this.f34288k, this.f34289l, this.f34290m, this.f34291n);
        if (i11 < 0) {
            pj0Var.setPredictiveCount(this.f34292o);
            fj0Var.setSeenCallback(new g3(pj0Var, 1));
        }
        gVar.addView(pj0Var);
        sparseArray.put(i10, pj0Var);
        return pj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
