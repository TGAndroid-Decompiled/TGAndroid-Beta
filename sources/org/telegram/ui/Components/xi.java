package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class xi implements TextWatcher {

    public final lj f34619a;

    public xi(lj ljVar) {
        this.f34619a = ljVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        if (string.isEmpty()) {
            f2.q0 adapter = this.f34619a.f30397s.getAdapter();
            lj ljVar = this.f34619a;
            if (adapter != ljVar.A) {
                int currentTop = ljVar.getCurrentTop();
                this.f34619a.C.setText(LocaleController.getString(R.string.NoContacts));
                this.f34619a.C.c();
                lj ljVar2 = this.f34619a;
                ljVar2.f30397s.setAdapter(ljVar2.A);
                this.f34619a.A.l();
                if (currentTop > 0) {
                    this.f34619a.v.h1(0, -currentTop);
                }
            }
        } else {
            az azVar = this.f34619a.C;
            if (azVar != null) {
                azVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        hj hjVar = this.f34619a.B;
        if (hjVar != null) {
            if (hjVar.f29039f != null) {
                Utilities.searchQueue.cancelRunnable(hjVar.f29039f);
                hjVar.f29039f = null;
            }
            int i10 = hjVar.h + 1;
            hjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fj fjVar = new fj(hjVar, string, i10, 0);
            hjVar.f29039f = fjVar;
            dispatchQueue.postRunnable(fjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
