package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nj implements TextWatcher {
    public final zj f27675a;

    public nj(zj zjVar) {
        this.f27675a = zjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            yz yzVar = this.f27675a.G;
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f27675a.f31885s.getAdapter();
            zj zjVar = this.f27675a;
            if (adapter != zjVar.E) {
                currentTop = zjVar.getCurrentTop();
                this.f27675a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f27675a.G.c();
                zj zjVar2 = this.f27675a;
                zjVar2.f31885s.setAdapter(zjVar2.E);
                this.f27675a.E.l();
                if (currentTop > 0) {
                    this.f27675a.v.h1(0, -currentTop);
                }
            }
        }
        vj vjVar = this.f27675a.F;
        if (vjVar != null) {
            if (vjVar.f30070f != null) {
                Utilities.searchQueue.cancelRunnable(vjVar.f30070f);
                vjVar.f30070f = null;
            }
            int i10 = vjVar.h + 1;
            vjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            uj ujVar = new uj(vjVar, obj, i10, 0);
            vjVar.f30070f = ujVar;
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
