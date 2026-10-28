package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fk extends org.telegram.ui.Components.n91 {
    public final Context f39391a;
    public final wn f39392b;

    public fk(wn wnVar, Context context) {
        this.f39392b = wnVar;
        this.f39391a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof yn) {
            ((yn) view).f46049a.ad(this.f39392b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f39391a;
        wn wnVar = this.f39392b;
        if (i10 == 0) {
            return new jn(wnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", wnVar.G3);
        ek ekVar = new ek(context, wnVar.getParentLayout(), bundle, 0);
        ekVar.h = false;
        xn xnVar = ekVar.f46049a;
        xnVar.L.f12844a = wnVar.L;
        xnVar.f45283sa = wnVar.f45309ua;
        xnVar.f45296ta = wnVar;
        xnVar.f45194l9 = new f(this, 13);
        return ekVar;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return LocaleController.getString(R.string.SearchThisChat);
            }
            return LocaleController.getString(R.string.SearchPublicPosts);
        }
        return LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
