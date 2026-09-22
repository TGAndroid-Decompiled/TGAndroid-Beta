package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk extends org.telegram.ui.Components.q81 {
    public final Context f34964a;
    public final zn f34965b;

    public jk(zn znVar, Context context) {
        this.f34965b = znVar;
        this.f34964a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).f32521a.Jc(this.f34965b.f40515u3);
        }
        WeakHashMap weakHashMap = r0.i0.f42163a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34964a;
        zn znVar = this.f34965b;
        if (i10 == 0) {
            return new nn(znVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", znVar.f40515u3);
        ik ikVar = new ik(context, znVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        ao aoVar = ikVar.f32521a;
        aoVar.L.f9081a = znVar.L;
        aoVar.f40300ca = znVar.f40324ea;
        aoVar.f40312da = znVar;
        aoVar.V8 = new g(this, 13);
        return ikVar;
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
