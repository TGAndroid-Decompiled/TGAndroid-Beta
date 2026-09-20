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
    public final int f33893c;
    public final SparseArray d;
    public final boolean e;
    public final List f33894f;
    public final MessageObject f33895g;
    public final org.telegram.ui.Components.pj0 h;
    public final MessageObject f33896i;
    public final SparseIntArray f33897j;
    public final int f33898k;
    public final z4.g f33899l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33900m;
    public final int[] f33901n;
    public final int f33902o;
    public final zn f33903p;

    public gi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.pj0 pj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33903p = znVar;
        this.f33893c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33894f = list;
        this.f33895g = messageObject;
        this.h = pj0Var;
        this.f33896i = messageObject2;
        this.f33897j = sparseIntArray;
        this.f33898k = i11;
        this.f33899l = gVar;
        this.f33900m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33901n = iArr;
        this.f33902o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33893c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33894f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f33903p;
        xn xnVar = znVar.f40303ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.zj0 zj0Var = new org.telegram.ui.Components.zj0(context, xnVar, i12, this.f33895g, reactionCount2, true);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        zj0Var.h(pj0Var.getSeenUsers());
        zj0Var.G = new y0(this, 17);
        zj0Var.E = new l4(9, this, this.f33896i);
        zj0Var.f30849y = new ei.u4(this.f33897j, i10, this.f33898k, this.f33899l, this.f33900m, this.f33901n);
        if (i11 < 0) {
            zj0Var.setPredictiveCount(this.f33902o);
            pj0Var.setSeenCallback(new g3(zj0Var, 1));
        }
        gVar.addView(zj0Var);
        sparseArray.put(i10, zj0Var);
        return zj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
