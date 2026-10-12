package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends org.telegram.ui.Components.l91 {
    public final Context f40737a;
    public final eo f40738b;

    public ok(eo eoVar, Context context) {
        this.f40738b = eoVar;
        this.f40737a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof go) {
            ((go) view).f38105a.Nc(this.f40738b.f37441u3);
        }
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f40737a;
        eo eoVar = this.f40738b;
        if (i10 == 0) {
            return new rn(eoVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", eoVar.f37441u3);
        nk nkVar = new nk(context, eoVar.getParentLayout(), bundle, 0);
        nkVar.h = false;
        fo foVar = nkVar.f38105a;
        foVar.L.f9940a = eoVar.L;
        foVar.f37226ca = eoVar.f37251ea;
        foVar.f37238da = eoVar;
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
