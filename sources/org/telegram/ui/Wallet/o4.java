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
import org.telegram.ui.Components.v81;
public final class o4 extends v81 {
    public final ArrayList f34629a;
    public final Context f34630b;
    public final org.telegram.ui.ActionBar.d6 f34631c;
    public final Rect d;
    public final int e;
    public final k2[] f34632f;

    public o4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.d6 d6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34629a = arrayList;
        this.f34630b = context;
        this.f34631c = d6Var;
        this.d = rect;
        this.e = i10;
        this.f34632f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        k2[] k2VarArr = this.f34632f;
        frameLayout.addView(o5.o0(this.f34630b, this.e, (TL_wallet.walletTransaction) this.f34629a.get(i10), null, null, null, null, this.f34631c, k2VarArr, true), w7.z5.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34630b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, this.f34631c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34629a.size();
    }
}
