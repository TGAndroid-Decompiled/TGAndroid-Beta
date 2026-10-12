package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class sj implements TextWatcher {
    public final ek f30578a;

    public sj(ek ekVar) {
        this.f30578a = ekVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            f00 f00Var = this.f30578a.G;
            if (f00Var != null) {
                f00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f30578a.f25718s.getAdapter();
            ek ekVar = this.f30578a;
            if (adapter != ekVar.E) {
                currentTop = ekVar.getCurrentTop();
                this.f30578a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f30578a.G.c();
                ek ekVar2 = this.f30578a;
                ekVar2.f25718s.setAdapter(ekVar2.E);
                this.f30578a.E.l();
                if (currentTop > 0) {
                    this.f30578a.v.h1(0, -currentTop);
                }
            }
        }
        ak akVar = this.f30578a.F;
        if (akVar != null) {
            if (akVar.f24416f != null) {
                Utilities.searchQueue.cancelRunnable(akVar.f24416f);
                akVar.f24416f = null;
            }
            int i10 = akVar.h + 1;
            akVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zj zjVar = new zj(akVar, obj, i10, 0);
            akVar.f24416f = zjVar;
            dispatchQueue.postRunnable(zjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
