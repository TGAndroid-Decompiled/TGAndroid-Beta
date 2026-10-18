package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class lj implements TextWatcher {
    public final xj f28254a;

    public lj(xj xjVar) {
        this.f28254a = xjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            vz vzVar = this.f28254a.G;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28254a.f32410s.getAdapter();
            xj xjVar = this.f28254a;
            if (adapter != xjVar.E) {
                currentTop = xjVar.getCurrentTop();
                this.f28254a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f28254a.G.c();
                xj xjVar2 = this.f28254a;
                xjVar2.f32410s.setAdapter(xjVar2.E);
                this.f28254a.E.l();
                if (currentTop > 0) {
                    this.f28254a.v.h1(0, -currentTop);
                }
            }
        }
        tj tjVar = this.f28254a.F;
        if (tjVar != null) {
            if (tjVar.f30653f != null) {
                Utilities.searchQueue.cancelRunnable(tjVar.f30653f);
                tjVar.f30653f = null;
            }
            int i10 = tjVar.h + 1;
            tjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            sj sjVar = new sj(tjVar, obj, i10, 0);
            tjVar.f30653f = sjVar;
            dispatchQueue.postRunnable(sjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
