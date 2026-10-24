package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class jj implements TextWatcher {
    public final vj f27710a;

    public jj(vj vjVar) {
        this.f27710a = vjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            tz tzVar = this.f27710a.G;
            if (tzVar != null) {
                tzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f27710a.f31466s.getAdapter();
            vj vjVar = this.f27710a;
            if (adapter != vjVar.E) {
                currentTop = vjVar.getCurrentTop();
                this.f27710a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f27710a.G.c();
                vj vjVar2 = this.f27710a;
                vjVar2.f31466s.setAdapter(vjVar2.E);
                this.f27710a.E.l();
                if (currentTop > 0) {
                    this.f27710a.v.h1(0, -currentTop);
                }
            }
        }
        rj rjVar = this.f27710a.F;
        if (rjVar != null) {
            if (rjVar.f30219f != null) {
                Utilities.searchQueue.cancelRunnable(rjVar.f30219f);
                rjVar.f30219f = null;
            }
            int i10 = rjVar.h + 1;
            rjVar.h = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            qj qjVar = new qj(rjVar, obj, i10, 0);
            rjVar.f30219f = qjVar;
            dispatchQueue2.postRunnable(qjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
