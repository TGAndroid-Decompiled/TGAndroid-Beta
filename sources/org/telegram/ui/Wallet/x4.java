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
import org.telegram.ui.Components.n61;
public final class x4 extends n61 {
    public final ArrayList f43309a;
    public final Context f43310b;
    public final org.telegram.ui.ActionBar.g6 f43311c;
    public final Rect d;
    public final int f43312e;
    public final y2[] f43313f;

    public x4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.g6 g6Var, Rect rect, int i7, y2[] y2VarArr) {
        this.f43309a = arrayList;
        this.f43310b = context;
        this.f43311c = g6Var;
        this.d = rect;
        this.f43312e = i7;
        this.f43313f = y2VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        y2[] y2VarArr = this.f43313f;
        frameLayout.addView(w5.t0(this.f43310b, this.f43312e, (TL_wallet.walletTransaction) this.f43309a.get(i7), null, null, null, null, this.f43311c, y2VarArr, true), c8.ha.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f43310b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f43311c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.l6.e0(L, 0, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.s6.j(frameLayout, insetDrawable, M, null, g6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f43309a.size();
    }
}
