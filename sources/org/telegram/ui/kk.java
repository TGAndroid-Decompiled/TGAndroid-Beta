package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk extends org.telegram.ui.Components.b81 {
    public final Context f35302a;
    public final bo f35303b;

    public kk(bo boVar, Context context) {
        this.f35303b = boVar;
        this.f35302a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof eo) {
            ((eo) view).f33448a.Jc(this.f35303b.f32470u3);
        }
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f35302a;
        bo boVar = this.f35303b;
        if (i10 == 0) {
            return new pn(boVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", boVar.f32470u3);
        jk jkVar = new jk(context, boVar.getParentLayout(), bundle, 0);
        jkVar.h = false;
        co coVar = jkVar.f33448a;
        coVar.L.f9081a = boVar.L;
        coVar.f32255ca = boVar.f32279ea;
        coVar.f32267da = boVar;
        coVar.V8 = new g(this, 13);
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
