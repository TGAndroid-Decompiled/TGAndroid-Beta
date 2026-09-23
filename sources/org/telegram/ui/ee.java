package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ee extends org.telegram.ui.Components.z71 {
    public final Context f32901a;
    public final int f32902b;
    public final int f32903c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final fe f32904f;

    public ee(fe feVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f32904f = feVar;
        this.f32901a = context;
        this.f32902b = i10;
        this.f32903c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new de(this.f32904f, this.f32901a, i10, this.f32902b, this.f32903c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.e.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return LocaleController.getString(R.string.MonetizationTransactionsTON);
        }
        return LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.h51) arrayList.get(i10)).f24520z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        fe feVar = this.f32904f;
        if (!feVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(1));
        }
        if (!feVar.f33295n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
