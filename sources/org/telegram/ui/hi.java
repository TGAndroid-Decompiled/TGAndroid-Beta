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
    public final int f37050c;
    public final SparseArray d;
    public final boolean f37051e;
    public final List f37052f;
    public final MessageObject f37053g;
    public final org.telegram.ui.Components.fj0 h;
    public final MessageObject f37054i;
    public final SparseIntArray f37055j;
    public final int f37056k;
    public final z4.g f37057l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37058m;
    public final int[] f37059n;
    public final int f37060o;
    public final co f37061p;

    public hi(co coVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fj0 fj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f37061p = coVar;
        this.f37050c = i10;
        this.d = sparseArray;
        this.f37051e = z10;
        this.f37052f = list;
        this.f37053g = messageObject;
        this.h = fj0Var;
        this.f37054i = messageObject2;
        this.f37055j = sparseIntArray;
        this.f37056k = i11;
        this.f37057l = gVar;
        this.f37058m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37059n = iArr;
        this.f37060o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f37050c;
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
        if (this.f37051e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f37052f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        co coVar = this.f37061p;
        ao aoVar = coVar.f35274ea;
        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, aoVar, i12, this.f37053g, reactionCount2, true);
        org.telegram.ui.Components.fj0 fj0Var = this.h;
        pj0Var.h(fj0Var.getSeenUsers());
        pj0Var.G = new z0(this, 16);
        pj0Var.E = new m4(9, this, this.f37054i);
        pj0Var.f29434y = new fi.v4(this.f37055j, i10, this.f37056k, this.f37057l, this.f37058m, this.f37059n);
        if (i11 < 0) {
            pj0Var.setPredictiveCount(this.f37060o);
            fj0Var.setSeenCallback(new h3(pj0Var, 1));
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
