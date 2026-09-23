package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nj implements TextWatcher {
    public final zj f26432a;

    public nj(zj zjVar) {
        this.f26432a = zjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            nz nzVar = this.f26432a.G;
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26432a.f30609s.getAdapter();
            zj zjVar = this.f26432a;
            if (adapter != zjVar.E) {
                currentTop = zjVar.getCurrentTop();
                this.f26432a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f26432a.G.c();
                zj zjVar2 = this.f26432a;
                zjVar2.f30609s.setAdapter(zjVar2.E);
                this.f26432a.E.l();
                if (currentTop > 0) {
                    this.f26432a.v.h1(0, -currentTop);
                }
            }
        }
        vj vjVar = this.f26432a.F;
        if (vjVar != null) {
            if (vjVar.f28759f != null) {
                Utilities.searchQueue.cancelRunnable(vjVar.f28759f);
                vjVar.f28759f = null;
            }
            int i10 = vjVar.h + 1;
            vjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            uj ujVar = new uj(vjVar, obj, i10, 0);
            vjVar.f28759f = ujVar;
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
