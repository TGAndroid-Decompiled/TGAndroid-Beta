package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.p71;
public final class a5 extends p71 {
    public final ArrayList f34184a;
    public final Context f34185b;
    public final org.telegram.ui.ActionBar.p6 f34186c;
    public final Rect d;
    public final int e;
    public final a3[] f34187f;

    public a5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.p6 p6Var, Rect rect, int i10, a3[] a3VarArr) {
        this.f34184a = arrayList;
        this.f34185b = context;
        this.f34186c = p6Var;
        this.d = rect;
        this.e = i10;
        this.f34187f = a3VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        a3[] a3VarArr = this.f34187f;
        frameLayout.addView(b6.t0(this.f34185b, this.e, (TL_wallet.walletTransaction) this.f34184a.get(i10), null, null, null, null, this.f34186c, a3VarArr, true), w7.b6.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34185b);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f34186c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L, 0, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.a7.k(frameLayout, insetDrawable, N, null, p6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34184a.size();
    }
}
