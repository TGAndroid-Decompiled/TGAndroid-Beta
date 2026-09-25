package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nj implements TextWatcher {
    public final zj f26732a;

    public nj(zj zjVar) {
        this.f26732a = zjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            nz nzVar = this.f26732a.G;
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26732a.f30909s.getAdapter();
            zj zjVar = this.f26732a;
            if (adapter != zjVar.E) {
                currentTop = zjVar.getCurrentTop();
                this.f26732a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f26732a.G.c();
                zj zjVar2 = this.f26732a;
                zjVar2.f30909s.setAdapter(zjVar2.E);
                this.f26732a.E.l();
                if (currentTop > 0) {
                    this.f26732a.v.h1(0, -currentTop);
                }
            }
        }
        vj vjVar = this.f26732a.F;
        if (vjVar != null) {
            if (vjVar.f29171f != null) {
                Utilities.searchQueue.cancelRunnable(vjVar.f29171f);
                vjVar.f29171f = null;
            }
            int i10 = vjVar.h + 1;
            vjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            uj ujVar = new uj(vjVar, obj, i10, 0);
            vjVar.f29171f = ujVar;
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
