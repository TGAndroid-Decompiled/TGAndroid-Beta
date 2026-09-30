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
    public final int f33402c;
    public final SparseArray d;
    public final boolean e;
    public final List f33403f;
    public final MessageObject f33404g;
    public final org.telegram.ui.Components.sj0 h;
    public final MessageObject f33405i;
    public final SparseIntArray f33406j;
    public final int f33407k;
    public final z4.g f33408l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33409m;
    public final int[] f33410n;
    public final int f33411o;
    public final wn f33412p;

    public ei(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.sj0 sj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33412p = wnVar;
        this.f33402c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33403f = list;
        this.f33404g = messageObject;
        this.h = sj0Var;
        this.f33405i = messageObject2;
        this.f33406j = sparseIntArray;
        this.f33407k = i11;
        this.f33408l = gVar;
        this.f33409m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33410n = iArr;
        this.f33411o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33402c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33403f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        wn wnVar = this.f33412p;
        un unVar = wnVar.f39469ea;
        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, unVar, i12, this.f33404g, reactionCount2, true);
        org.telegram.ui.Components.sj0 sj0Var = this.h;
        ck0Var.h(sj0Var.getSeenUsers());
        ck0Var.G = new z0(this, 16);
        ck0Var.E = new o(11, this, this.f33405i);
        ck0Var.f23336y = new ei.u4(this.f33406j, i10, this.f33407k, this.f33408l, this.f33409m, this.f33410n);
        if (i11 < 0) {
            ck0Var.setPredictiveCount(this.f33411o);
            sj0Var.setSeenCallback(new h3(ck0Var, 1));
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
