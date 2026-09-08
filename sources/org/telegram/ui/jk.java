package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk extends org.telegram.ui.Components.a81 {
    public final Context f37822a;
    public final co f37823b;

    public jk(co coVar, Context context) {
        this.f37823b = coVar;
        this.f37822a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof fo) {
            ((fo) view).f36464a.Jc(this.f37823b.f35464u3);
        }
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f37822a;
        co coVar = this.f37823b;
        if (i10 == 0) {
            return new qn(coVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", coVar.f35464u3);
        ik ikVar = new ik(context, coVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        eo eoVar = ikVar.f36464a;
        eoVar.L.f10689a = coVar.L;
        eoVar.f35249ca = coVar.f35274ea;
        eoVar.f35261da = coVar;
        eoVar.V8 = new g(this, 13);
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
