package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk extends org.telegram.ui.Components.f91 {
    public final Context f39309a;
    public final zn f39310b;

    public kk(zn znVar, Context context) {
        this.f39310b = znVar;
        this.f39309a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).f36357a.Nc(this.f39310b.f44951u3);
        }
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f39309a;
        zn znVar = this.f39310b;
        if (i10 == 0) {
            return new nn(znVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", znVar.f44951u3);
        jk jkVar = new jk(context, znVar.getParentLayout(), bundle, 0);
        jkVar.h = false;
        ao aoVar = jkVar.f36357a;
        aoVar.L.f9942a = znVar.L;
        aoVar.f44736ca = znVar.f44761ea;
        aoVar.f44748da = znVar;
        aoVar.V8 = new g(this, 13);
        return jkVar;
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
