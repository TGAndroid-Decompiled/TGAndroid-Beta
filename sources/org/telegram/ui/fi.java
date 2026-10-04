package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fi extends z4.a {
    public final int f36322c;
    public final SparseArray d;
    public final boolean f36323e;
    public final List f36324f;
    public final MessageObject f36325g;
    public final org.telegram.ui.Components.sj0 h;
    public final MessageObject f36326i;
    public final SparseIntArray f36327j;
    public final int f36328k;
    public final z4.g f36329l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36330m;
    public final int[] f36331n;
    public final int f36332o;
    public final yn f36333p;

    public fi(yn ynVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.sj0 sj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f36333p = ynVar;
        this.f36322c = i10;
        this.d = sparseArray;
        this.f36323e = z10;
        this.f36324f = list;
        this.f36325g = messageObject;
        this.h = sj0Var;
        this.f36326i = messageObject2;
        this.f36327j = sparseIntArray;
        this.f36328k = i11;
        this.f36329l = gVar;
        this.f36330m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36331n = iArr;
        this.f36332o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f36322c;
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
        if (this.f36323e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f36324f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        yn ynVar = this.f36333p;
        wn wnVar = ynVar.f43300ca;
        i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, wnVar, i12, this.f36325g, reactionCount2, true);
        org.telegram.ui.Components.sj0 sj0Var = this.h;
        ck0Var.h(sj0Var.getSeenUsers());
        ck0Var.G = new z0(this, 18);
        ck0Var.E = new o(12, this, this.f36326i);
        ck0Var.f25411y = new ei.v4(this.f36327j, i10, this.f36328k, this.f36329l, this.f36330m, this.f36331n);
        if (i11 < 0) {
            ck0Var.setPredictiveCount(this.f36332o);
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
