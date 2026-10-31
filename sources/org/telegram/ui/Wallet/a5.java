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
import org.telegram.ui.Components.o71;
public final class a5 extends o71 {
    public final ArrayList f34185a;
    public final Context f34186b;
    public final org.telegram.ui.ActionBar.p6 f34187c;
    public final Rect d;
    public final int e;
    public final z2[] f34188f;

    public a5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.p6 p6Var, Rect rect, int i10, z2[] z2VarArr) {
        this.f34185a = arrayList;
        this.f34186b = context;
        this.f34187c = p6Var;
        this.d = rect;
        this.e = i10;
        this.f34188f = z2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        z2[] z2VarArr = this.f34188f;
        frameLayout.addView(b6.s0(this.f34186b, this.e, (TL_wallet.walletTransaction) this.f34185a.get(i10), null, null, null, null, this.f34187c, z2VarArr, true), w7.b6.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34186b);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f34187c;
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
        return this.f34185a.size();
    }
}
