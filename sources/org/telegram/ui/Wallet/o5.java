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
import org.telegram.ui.Components.y61;
public final class o5 extends y61 {
    public final ArrayList f44702a;
    public final Context f44703b;
    public final org.telegram.ui.ActionBar.i6 f44704c;
    public final Rect d;
    public final int f44705e;
    public final e3[] f44706f;

    public o5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.i6 i6Var, Rect rect, int i7, e3[] e3VarArr) {
        this.f44702a = arrayList;
        this.f44703b = context;
        this.f44704c = i6Var;
        this.d = rect;
        this.f44705e = i7;
        this.f44706f = e3VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        e3[] e3VarArr = this.f44706f;
        frameLayout.addView(n6.u0(this.f44703b, this.f44705e, (TL_wallet.walletTransaction) this.f44702a.get(i7), null, null, null, null, this.f44704c, e3VarArr, true), c8.ma.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f44703b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f44704c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L, 0, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.u6.j(frameLayout, insetDrawable, M, null, i6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f44702a.size();
    }
}
