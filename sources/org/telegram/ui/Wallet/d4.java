package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h91;
public final class d4 extends h91 {
    public final ArrayList f34806a;
    public final Context f34807b;
    public final org.telegram.ui.ActionBar.d6 f34808c;
    public final Rect d;
    public final int f34809e;
    public final k2[] f34810f;

    public d4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.d6 d6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34806a = arrayList;
        this.f34807b = context;
        this.f34808c = d6Var;
        this.d = rect;
        this.f34809e = i10;
        this.f34810f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.d6 d6Var = this.f34808c;
        k2[] k2VarArr = this.f34810f;
        frameLayout.addView(c5.i0(this.f34807b, this.f34809e, (TL_wallet.walletTransaction) this.f34806a.get(i10), null, null, null, null, d6Var, k2VarArr), w7.x5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34807b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, this.f34808c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34806a.size();
    }
}
