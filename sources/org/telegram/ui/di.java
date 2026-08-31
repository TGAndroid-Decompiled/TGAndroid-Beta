package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class di extends m2.a {
    public final int f36232c;
    public final SparseArray d;
    public final boolean f36233e;
    public final List f36234f;
    public final MessageObject f36235g;
    public final org.telegram.ui.Components.qj0 h;
    public final MessageObject f36236i;
    public final SparseIntArray f36237j;
    public final int f36238k;
    public final m2.h f36239l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36240m;
    public final int[] f36241n;
    public final int f36242o;
    public final xn f36243p;

    public di(xn xnVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.qj0 qj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f36243p = xnVar;
        this.f36232c = i10;
        this.d = sparseArray;
        this.f36233e = z4;
        this.f36234f = list;
        this.f36235g = messageObject;
        this.h = qj0Var;
        this.f36236i = messageObject2;
        this.f36237j = sparseIntArray;
        this.f36238k = i11;
        this.f36239l = hVar;
        this.f36240m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36241n = iArr;
        this.f36242o = i12;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f36232c;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            hVar.addView(view);
            return view;
        }
        if (this.f36233e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f36234f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        xn xnVar = this.f36243p;
        vn vnVar = xnVar.f43136ba;
        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context, vnVar, i12, this.f36235g, reactionCount2, true);
        org.telegram.ui.Components.qj0 qj0Var = this.h;
        ak0Var.h(qj0Var.getSeenUsers());
        ak0Var.D = new a1(this, 16);
        ak0Var.B = new ng.w(17, this, this.f36236i);
        ak0Var.f25281y = new hg.d(this.f36237j, i10, this.f36238k, this.f36239l, this.f36240m, this.f36241n);
        if (i11 < 0) {
            ak0Var.setPredictiveCount(this.f36242o);
            qj0Var.setSeenCallback(new j3(ak0Var, 1));
        }
        hVar.addView(ak0Var);
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
