package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nj implements TextWatcher {
    public final zj f27364a;

    public nj(zj zjVar) {
        this.f27364a = zjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            yz yzVar = this.f27364a.G;
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f27364a.f31579s.getAdapter();
            zj zjVar = this.f27364a;
            if (adapter != zjVar.E) {
                currentTop = zjVar.getCurrentTop();
                this.f27364a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f27364a.G.c();
                zj zjVar2 = this.f27364a;
                zjVar2.f31579s.setAdapter(zjVar2.E);
                this.f27364a.E.l();
                if (currentTop > 0) {
                    this.f27364a.v.h1(0, -currentTop);
                }
            }
        }
        vj vjVar = this.f27364a.F;
        if (vjVar != null) {
            if (vjVar.f29741f != null) {
                Utilities.searchQueue.cancelRunnable(vjVar.f29741f);
                vjVar.f29741f = null;
            }
            int i10 = vjVar.h + 1;
            vjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            uj ujVar = new uj(vjVar, obj, i10, 0);
            vjVar.f29741f = ujVar;
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
