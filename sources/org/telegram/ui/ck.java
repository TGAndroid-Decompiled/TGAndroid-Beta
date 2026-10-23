package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ck extends org.telegram.ui.Components.d91 {
    public final Context f36382a;
    public final sn f36383b;

    public ck(sn snVar, Context context) {
        this.f36383b = snVar;
        this.f36382a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof un) {
            ((un) view).f42477a.Qc(this.f36383b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36382a;
        sn snVar = this.f36383b;
        if (i10 == 0) {
            return new fn(snVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", snVar.G3);
        bk bkVar = new bk(context, snVar.getParentLayout(), bundle, 0);
        bkVar.h = false;
        tn tnVar = bkVar.f42477a;
        tnVar.L.f11082a = snVar.L;
        tnVar.f41633oa = snVar.f41654qa;
        tnVar.f41642pa = snVar;
        tnVar.f41546h9 = new f(this, 13);
        return bkVar;
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
