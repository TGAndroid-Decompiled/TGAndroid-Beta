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
import org.telegram.ui.Components.f91;
public final class a4 extends f91 {
    public final ArrayList f34613a;
    public final Context f34614b;
    public final org.telegram.ui.ActionBar.e6 f34615c;
    public final Rect d;
    public final int f34616e;
    public final i2[] f34617f;

    public a4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.e6 e6Var, Rect rect, int i10, i2[] i2VarArr) {
        this.f34613a = arrayList;
        this.f34614b = context;
        this.f34615c = e6Var;
        this.d = rect;
        this.f34616e = i10;
        this.f34617f = i2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.e6 e6Var = this.f34615c;
        i2[] i2VarArr = this.f34617f;
        frameLayout.addView(z4.i0(this.f34614b, this.f34616e, (TL_wallet.walletTransaction) this.f34613a.get(i10), null, null, null, null, e6Var, i2VarArr), w7.x5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34614b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f34615c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34613a.size();
    }
}
