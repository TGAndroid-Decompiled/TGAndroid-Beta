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
import org.telegram.ui.Components.w81;
public final class o4 extends w81 {
    public final ArrayList f34638a;
    public final Context f34639b;
    public final org.telegram.ui.ActionBar.d6 f34640c;
    public final Rect d;
    public final int e;
    public final k2[] f34641f;

    public o4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.d6 d6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34638a = arrayList;
        this.f34639b = context;
        this.f34640c = d6Var;
        this.d = rect;
        this.e = i10;
        this.f34641f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        k2[] k2VarArr = this.f34641f;
        frameLayout.addView(o5.o0(this.f34639b, this.e, (TL_wallet.walletTransaction) this.f34638a.get(i10), null, null, null, null, this.f34640c, k2VarArr, true), w7.z5.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34639b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, this.f34640c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34638a.size();
    }
}
