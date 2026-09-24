package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nj implements TextWatcher {
    public final zj f26724a;

    public nj(zj zjVar) {
        this.f26724a = zjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            nz nzVar = this.f26724a.G;
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26724a.f30904s.getAdapter();
            zj zjVar = this.f26724a;
            if (adapter != zjVar.E) {
                currentTop = zjVar.getCurrentTop();
                this.f26724a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f26724a.G.c();
                zj zjVar2 = this.f26724a;
                zjVar2.f30904s.setAdapter(zjVar2.E);
                this.f26724a.E.l();
                if (currentTop > 0) {
                    this.f26724a.v.h1(0, -currentTop);
                }
            }
        }
        vj vjVar = this.f26724a.F;
        if (vjVar != null) {
            if (vjVar.f29161f != null) {
                Utilities.searchQueue.cancelRunnable(vjVar.f29161f);
                vjVar.f29161f = null;
            }
            int i10 = vjVar.h + 1;
            vjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            uj ujVar = new uj(vjVar, obj, i10, 0);
            vjVar.f29161f = ujVar;
            dispatchQueue.postRunnable(ujVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
