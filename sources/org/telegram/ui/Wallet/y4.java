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
import org.telegram.ui.Components.m61;
public final class y4 extends m61 {
    public final ArrayList f43391a;
    public final Context f43392b;
    public final org.telegram.ui.ActionBar.f6 f43393c;
    public final Rect d;
    public final int f43394e;
    public final z2[] f43395f;

    public y4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.f6 f6Var, Rect rect, int i7, z2[] z2VarArr) {
        this.f43391a = arrayList;
        this.f43392b = context;
        this.f43393c = f6Var;
        this.d = rect;
        this.f43394e = i7;
        this.f43395f = z2VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        z2[] z2VarArr = this.f43395f;
        frameLayout.addView(x5.t0(this.f43392b, this.f43394e, (TL_wallet.walletTransaction) this.f43391a.get(i7), null, null, null, null, this.f43393c, z2VarArr, true), c8.ha.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f43392b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f43393c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, 0, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, N, null, f6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f43391a.size();
    }
}
