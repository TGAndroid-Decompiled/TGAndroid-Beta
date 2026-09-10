package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk extends org.telegram.ui.Components.n81 {
    public final Context f34733a;
    public final eo f34734b;

    public lk(eo eoVar, Context context) {
        this.f34734b = eoVar;
        this.f34733a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof go) {
            ((go) view).f33142a.Jc(this.f34734b.f32506u3);
        }
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34733a;
        eo eoVar = this.f34734b;
        if (i10 == 0) {
            return new rn(eoVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", eoVar.f32506u3);
        kk kkVar = new kk(context, eoVar.getParentLayout(), bundle, 0);
        kkVar.h = false;
        fo foVar = kkVar.f33142a;
        foVar.L.f7525a = eoVar.L;
        foVar.f32292ca = eoVar.f32316ea;
        foVar.f32304da = eoVar;
        foVar.V8 = new g(this, 13);
        return kkVar;
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
