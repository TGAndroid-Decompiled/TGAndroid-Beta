package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ai extends z4.a {
    public final int f35438c;
    public final SparseArray d;
    public final boolean e;
    public final List f35439f;
    public final MessageObject f35440g;
    public final org.telegram.ui.Components.ck0 h;
    public final MessageObject f35441i;
    public final SparseIntArray f35442j;
    public final int f35443k;
    public final z4.g f35444l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f35445m;
    public final int[] f35446n;
    public final int f35447o;
    public final sn f35448p;

    public ai(sn snVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.ck0 ck0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f35448p = snVar;
        this.f35438c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f35439f = list;
        this.f35440g = messageObject;
        this.h = ck0Var;
        this.f35441i = messageObject2;
        this.f35442j = sparseIntArray;
        this.f35443k = i11;
        this.f35444l = gVar;
        this.f35445m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f35446n = iArr;
        this.f35447o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f35438c;
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
            reactionCount = (TLRPC.ReactionCount) this.f35439f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        sn snVar = this.f35448p;
        qn qnVar = snVar.f41205ea;
        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        org.telegram.ui.Components.mk0 mk0Var = new org.telegram.ui.Components.mk0(context, qnVar, i12, this.f35440g, reactionCount2, true);
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        mk0Var.h(ck0Var.getSeenUsers());
        mk0Var.G = new b1(this, 16);
        mk0Var.E = new m4.y0(14, this, this.f35441i);
        mk0Var.f28546y = new gi.j4(this.f35442j, i10, this.f35443k, this.f35444l, this.f35445m, this.f35446n);
        if (i11 < 0) {
            mk0Var.setPredictiveCount(this.f35447o);
            ck0Var.setSeenCallback(new j3(mk0Var, 1));
        }
        gVar.addView(mk0Var);
        sparseArray.put(i10, mk0Var);
        return mk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
