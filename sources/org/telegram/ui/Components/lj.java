package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class lj implements TextWatcher {
    public final xj f28247a;

    public lj(xj xjVar) {
        this.f28247a = xjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            vz vzVar = this.f28247a.G;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28247a.f32403s.getAdapter();
            xj xjVar = this.f28247a;
            if (adapter != xjVar.E) {
                currentTop = xjVar.getCurrentTop();
                this.f28247a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f28247a.G.c();
                xj xjVar2 = this.f28247a;
                xjVar2.f32403s.setAdapter(xjVar2.E);
                this.f28247a.E.l();
                if (currentTop > 0) {
                    this.f28247a.v.h1(0, -currentTop);
                }
            }
        }
        tj tjVar = this.f28247a.F;
        if (tjVar != null) {
            if (tjVar.f30646f != null) {
                Utilities.searchQueue.cancelRunnable(tjVar.f30646f);
                tjVar.f30646f = null;
            }
            int i10 = tjVar.h + 1;
            tjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            sj sjVar = new sj(tjVar, obj, i10, 0);
            tjVar.f30646f = sjVar;
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
