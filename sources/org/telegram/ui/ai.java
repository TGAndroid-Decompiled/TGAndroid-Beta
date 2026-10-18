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
    public final int f35458c;
    public final SparseArray d;
    public final boolean e;
    public final List f35459f;
    public final MessageObject f35460g;
    public final org.telegram.ui.Components.ck0 h;
    public final MessageObject f35461i;
    public final SparseIntArray f35462j;
    public final int f35463k;
    public final z4.g f35464l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f35465m;
    public final int[] f35466n;
    public final int f35467o;
    public final sn f35468p;

    public ai(sn snVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.ck0 ck0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f35468p = snVar;
        this.f35458c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f35459f = list;
        this.f35460g = messageObject;
        this.h = ck0Var;
        this.f35461i = messageObject2;
        this.f35462j = sparseIntArray;
        this.f35463k = i11;
        this.f35464l = gVar;
        this.f35465m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f35466n = iArr;
        this.f35467o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f35458c;
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
            reactionCount = (TLRPC.ReactionCount) this.f35459f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        sn snVar = this.f35468p;
        qn qnVar = snVar.f41226ea;
        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        org.telegram.ui.Components.mk0 mk0Var = new org.telegram.ui.Components.mk0(context, qnVar, i12, this.f35460g, reactionCount2, true);
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        mk0Var.h(ck0Var.getSeenUsers());
        mk0Var.G = new b1(this, 16);
        mk0Var.E = new m4.w0(15, this, this.f35461i);
        mk0Var.f28553y = new gi.j4(this.f35462j, i10, this.f35463k, this.f35464l, this.f35465m, this.f35466n);
        if (i11 < 0) {
            mk0Var.setPredictiveCount(this.f35467o);
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
