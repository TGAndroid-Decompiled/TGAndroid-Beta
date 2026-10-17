package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk extends org.telegram.ui.Components.u81 {
    public final Context f36229a;
    public final sn f36230b;

    public dk(sn snVar, Context context) {
        this.f36230b = snVar;
        this.f36229a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof un) {
            ((un) view).f42016a.Nc(this.f36230b.f41397u3);
        }
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36229a;
        sn snVar = this.f36230b;
        if (i10 == 0) {
            return new gn(snVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", snVar.f41397u3);
        ck ckVar = new ck(context, snVar.getParentLayout(), bundle, 0);
        ckVar.h = false;
        tn tnVar = ckVar.f42016a;
        tnVar.L.f11064a = snVar.L;
        tnVar.f41181ca = snVar.f41205ea;
        tnVar.f41194da = snVar;
        tnVar.V8 = new g(this, 13);
        return ckVar;
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
