package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends org.telegram.ui.Components.l91 {
    public final Context f40739a;
    public final eo f40740b;

    public ok(eo eoVar, Context context) {
        this.f40740b = eoVar;
        this.f40739a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof go) {
            ((go) view).f38109a.Nc(this.f40740b.f37446u3);
        }
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f40739a;
        eo eoVar = this.f40740b;
        if (i10 == 0) {
            return new rn(eoVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", eoVar.f37446u3);
        nk nkVar = new nk(context, eoVar.getParentLayout(), bundle, 0);
        nkVar.h = false;
        fo foVar = nkVar.f38109a;
        foVar.L.f9940a = eoVar.L;
        foVar.f37231ca = eoVar.f37256ea;
        foVar.f37243da = eoVar;
        foVar.V8 = new g(this, 13);
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
