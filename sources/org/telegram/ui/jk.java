package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk extends org.telegram.ui.Components.a81 {
    public final Context f37795a;
    public final co f37796b;

    public jk(co coVar, Context context) {
        this.f37796b = coVar;
        this.f37795a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof fo) {
            ((fo) view).f36437a.Jc(this.f37796b.f35437u3);
        }
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f37795a;
        co coVar = this.f37796b;
        if (i10 == 0) {
            return new qn(coVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", coVar.f35437u3);
        ik ikVar = new ik(context, coVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        eo eoVar = ikVar.f36437a;
        eoVar.L.f10661a = coVar.L;
        eoVar.f35222ca = coVar.f35247ea;
        eoVar.f35234da = coVar;
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
