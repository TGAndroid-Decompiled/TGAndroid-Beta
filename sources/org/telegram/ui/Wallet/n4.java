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
import org.telegram.ui.Components.u81;
public final class n4 extends u81 {
    public final ArrayList f34575a;
    public final Context f34576b;
    public final org.telegram.ui.ActionBar.d6 f34577c;
    public final Rect d;
    public final int e;
    public final k2[] f34578f;

    public n4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.d6 d6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34575a = arrayList;
        this.f34576b = context;
        this.f34577c = d6Var;
        this.d = rect;
        this.e = i10;
        this.f34578f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.d6 d6Var = this.f34577c;
        k2[] k2VarArr = this.f34578f;
        frameLayout.addView(n5.p0(this.f34576b, this.e, (TL_wallet.walletTransaction) this.f34575a.get(i10), null, null, null, null, d6Var, k2VarArr), w7.z5.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34576b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.f34577c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34575a.size();
    }
}
