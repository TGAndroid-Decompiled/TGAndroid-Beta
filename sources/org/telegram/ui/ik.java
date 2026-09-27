package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends org.telegram.ui.Components.p81 {
    public final Context f34498a;
    public final xn f34499b;

    public ik(xn xnVar, Context context) {
        this.f34499b = xnVar;
        this.f34498a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof zn) {
            ((zn) view).f40556a.Jc(this.f34499b.f39941u3);
        }
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f34498a;
        xn xnVar = this.f34499b;
        if (i10 == 0) {
            return new ln(xnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", xnVar.f39941u3);
        hk hkVar = new hk(context, xnVar.getParentLayout(), bundle, 0);
        hkVar.h = false;
        yn ynVar = hkVar.f40556a;
        ynVar.L.f9068a = xnVar.L;
        ynVar.f39726ca = xnVar.f39750ea;
        ynVar.f39738da = xnVar;
        ynVar.V8 = new g(this, 13);
        return hkVar;
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
