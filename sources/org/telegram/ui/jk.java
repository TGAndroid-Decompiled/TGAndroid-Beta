package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk extends org.telegram.ui.Components.a81 {
    public final Context f34932a;
    public final bo f34933b;

    public jk(bo boVar, Context context) {
        this.f34933b = boVar;
        this.f34932a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof eo) {
            ((eo) view).f33375a.Jc(this.f34933b.f32488u3);
        }
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34932a;
        bo boVar = this.f34933b;
        if (i10 == 0) {
            return new pn(boVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", boVar.f32488u3);
        ik ikVar = new ik(context, boVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        co coVar = ikVar.f33375a;
        coVar.L.f9076a = boVar.L;
        coVar.f32273ca = boVar.f32297ea;
        coVar.f32285da = boVar;
        coVar.V8 = new g(this, 13);
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
