package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
public final class x4 extends f61 {
    public final ArrayList f43394a;
    public final Context f43395b;
    public final org.telegram.ui.ActionBar.e6 f43396c;
    public final Rect d;
    public final int f43397e;
    public final y2[] f43398f;

    public x4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.e6 e6Var, Rect rect, int i3, y2[] y2VarArr) {
        this.f43394a = arrayList;
        this.f43395b = context;
        this.f43396c = e6Var;
        this.d = rect;
        this.f43397e = i3;
        this.f43398f = y2VarArr;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        y2[] y2VarArr = this.f43398f;
        frameLayout.addView(w5.t0(this.f43395b, this.f43397e, (TL_wallet.walletTransaction) this.f43394a.get(i3), null, null, null, null, this.f43396c, y2VarArr, true), mf.c(-2.0f, -1));
    }

    @Override
    public final View d(int i3) {
        FrameLayout frameLayout = new FrameLayout(this.f43395b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f43396c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, 0, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, N, null, e6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f43394a.size();
    }
}
