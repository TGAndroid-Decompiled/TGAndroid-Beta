package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ck extends org.telegram.ui.Components.d91 {
    public final Context f36365a;
    public final sn f36366b;

    public ck(sn snVar, Context context) {
        this.f36366b = snVar;
        this.f36365a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if (view instanceof un) {
            ((un) view).f42454a.Qc(this.f36366b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.y.c(view);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36365a;
        sn snVar = this.f36366b;
        if (i10 == 0) {
            return new fn(snVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", snVar.G3);
        bk bkVar = new bk(context, snVar.getParentLayout(), bundle, 0);
        bkVar.h = false;
        tn tnVar = bkVar.f42454a;
        tnVar.L.f11082a = snVar.L;
        tnVar.f41630oa = snVar.f41651qa;
        tnVar.f41639pa = snVar;
        tnVar.f41543h9 = new f(this, 13);
        return bkVar;
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
