package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends org.telegram.ui.Components.c91 {
    public final Context f38990a;
    public final fo f38991b;

    public ok(fo foVar, Context context) {
        this.f38991b = foVar;
        this.f38990a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof ho) {
            ((ho) view).f36887a.Nc(this.f38991b.f36124u3);
        }
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.z.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f38990a;
        fo foVar = this.f38991b;
        if (i10 == 0) {
            return new sn(foVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", foVar.f36124u3);
        nk nkVar = new nk(context, foVar.getParentLayout(), bundle, 0);
        nkVar.h = false;
        go goVar = nkVar.f36887a;
        goVar.L.f10156a = foVar.L;
        goVar.f35908ca = foVar.f35932ea;
        goVar.f35921da = foVar;
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
