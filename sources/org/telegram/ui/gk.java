package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends org.telegram.ui.Components.o81 {
    public final Context f33954a;
    public final wn f33955b;

    public gk(wn wnVar, Context context) {
        this.f33955b = wnVar;
        this.f33954a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof yn) {
            ((yn) view).f40192a.Jc(this.f33955b.f39658u3);
        }
        WeakHashMap weakHashMap = r0.i0.f42127a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f33954a;
        wn wnVar = this.f33955b;
        if (i10 == 0) {
            return new kn(wnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", wnVar.f39658u3);
        fk fkVar = new fk(context, wnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        xn xnVar = fkVar.f40192a;
        xnVar.L.f9063a = wnVar.L;
        xnVar.f39444ca = wnVar.f39468ea;
        xnVar.f39456da = wnVar;
        xnVar.V8 = new g(this, 13);
        return fkVar;
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
