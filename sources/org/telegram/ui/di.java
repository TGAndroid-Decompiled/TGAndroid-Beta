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
    public final int f33648c;
    public final SparseArray d;
    public final boolean e;
    public final List f33649f;
    public final MessageObject f33650g;
    public final org.telegram.ui.Components.oj0 h;
    public final MessageObject f33651i;
    public final SparseIntArray f33652j;
    public final int f33653k;
    public final m2.h f33654l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33655m;
    public final int[] f33656n;
    public final int f33657o;
    public final xn f33658p;

    public di(xn xnVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.oj0 oj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33658p = xnVar;
        this.f33648c = i10;
        this.d = sparseArray;
        this.e = z4;
        this.f33649f = list;
        this.f33650g = messageObject;
        this.h = oj0Var;
        this.f33651i = messageObject2;
        this.f33652j = sparseIntArray;
        this.f33653k = i11;
        this.f33654l = hVar;
        this.f33655m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33656n = iArr;
        this.f33657o = i12;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33648c;
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
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f33649f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        xn xnVar = this.f33658p;
        vn vnVar = xnVar.f39968ba;
        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(context, vnVar, i12, this.f33650g, reactionCount2, true);
        org.telegram.ui.Components.oj0 oj0Var = this.h;
        yj0Var.h(oj0Var.getSeenUsers());
        yj0Var.D = new a1(this, 16);
        yj0Var.B = new mg.w(17, this, this.f33651i);
        yj0Var.f31037y = new gg.d(this.f33652j, i10, this.f33653k, this.f33654l, this.f33655m, this.f33656n);
        if (i11 < 0) {
            yj0Var.setPredictiveCount(this.f33657o);
            oj0Var.setSeenCallback(new j3(yj0Var, 1));
        }
        hVar.addView(yj0Var);
        sparseArray.put(i10, yj0Var);
        return yj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
