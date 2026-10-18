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
public final class m4 extends u81 {
    public final ArrayList f34563a;
    public final Context f34564b;
    public final org.telegram.ui.ActionBar.d6 f34565c;
    public final Rect d;
    public final int e;
    public final k2[] f34566f;

    public m4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.d6 d6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34563a = arrayList;
        this.f34564b = context;
        this.f34565c = d6Var;
        this.d = rect;
        this.e = i10;
        this.f34566f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.d6 d6Var = this.f34565c;
        k2[] k2VarArr = this.f34566f;
        frameLayout.addView(m5.o0(this.f34564b, this.e, (TL_wallet.walletTransaction) this.f34563a.get(i10), null, null, null, null, d6Var, k2VarArr), w7.z5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34564b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, this.f34565c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34563a.size();
    }
}
