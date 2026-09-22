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
    public final int f34225c;
    public final SparseArray d;
    public final boolean e;
    public final List f34226f;
    public final MessageObject f34227g;
    public final org.telegram.ui.Components.sj0 h;
    public final MessageObject f34228i;
    public final SparseIntArray f34229j;
    public final int f34230k;
    public final z4.g f34231l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34232m;
    public final int[] f34233n;
    public final int f34234o;
    public final zn f34235p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.sj0 sj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f34235p = znVar;
        this.f34225c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f34226f = list;
        this.f34227g = messageObject;
        this.h = sj0Var;
        this.f34228i = messageObject2;
        this.f34229j = sparseIntArray;
        this.f34230k = i11;
        this.f34231l = gVar;
        this.f34232m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34233n = iArr;
        this.f34234o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34225c;
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
            reactionCount = (TLRPC.ReactionCount) this.f34226f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f34235p;
        xn xnVar = znVar.f40324ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, xnVar, i12, this.f34227g, reactionCount2, true);
        org.telegram.ui.Components.sj0 sj0Var = this.h;
        ck0Var.h(sj0Var.getSeenUsers());
        ck0Var.G = new y0(this, 17);
        ck0Var.E = new l4(9, this, this.f34228i);
        ck0Var.f23395y = new ei.u4(this.f34229j, i10, this.f34230k, this.f34231l, this.f34232m, this.f34233n);
        if (i11 < 0) {
            ck0Var.setPredictiveCount(this.f34234o);
            sj0Var.setSeenCallback(new g3(ck0Var, 1));
        }
        gVar.addView(ck0Var);
        sparseArray.put(i10, ck0Var);
        return ck0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
