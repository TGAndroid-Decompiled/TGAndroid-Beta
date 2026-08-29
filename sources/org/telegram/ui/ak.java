package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ak extends org.telegram.ui.Components.q71 {
    public final Context f36563a;
    public final tn f36564b;

    public ak(tn tnVar, Context context) {
        this.f36564b = tnVar;
        this.f36563a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof vn) {
            ((vn) view).f43683a.Jc(this.f36564b.f42940q3);
        }
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36563a;
        tn tnVar = this.f36564b;
        if (i10 == 0) {
            return new hn(tnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", tnVar.f42940q3);
        zj zjVar = new zj(context, tnVar.getParentLayout(), bundle, 0);
        zjVar.h = false;
        un unVar = zjVar.f43683a;
        unVar.H.f46676a = tnVar.H;
        unVar.Y9 = tnVar.f42746aa;
        unVar.Z9 = tnVar;
        unVar.R8 = new h(this, 13);
        return zjVar;
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
