package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends org.telegram.ui.Components.d91 {
    public final Context f38697a;
    public final fo f38698b;

    public ok(fo foVar, Context context) {
        this.f38698b = foVar;
        this.f38697a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof ho) {
            ((ho) view).f36617a.Nc(this.f38698b.f35825u3);
        }
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f38697a;
        fo foVar = this.f38698b;
        if (i10 == 0) {
            return new sn(foVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", foVar.f35825u3);
        nk nkVar = new nk(context, foVar.getParentLayout(), bundle, 0);
        nkVar.h = false;
        go goVar = nkVar.f36617a;
        goVar.L.f10160a = foVar.L;
        goVar.f35609ca = foVar.f35633ea;
        goVar.f35622da = foVar;
        goVar.V8 = new g(this, 13);
        return nkVar;
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
