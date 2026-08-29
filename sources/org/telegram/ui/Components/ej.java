package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ej implements TextWatcher {
    public final sj f28092a;

    public ej(sj sjVar) {
        this.f28092a = sjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            hz hzVar = this.f28092a.C;
            if (hzVar != null) {
                hzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.f28092a.f32656s.getAdapter();
            sj sjVar = this.f28092a;
            if (adapter != sjVar.A) {
                currentTop = sjVar.getCurrentTop();
                this.f28092a.C.setText(LocaleController.getString(R.string.NoContacts));
                this.f28092a.C.c();
                sj sjVar2 = this.f28092a;
                sjVar2.f32656s.setAdapter(sjVar2.A);
                this.f28092a.A.l();
                if (currentTop > 0) {
                    this.f28092a.v.h1(0, -currentTop);
                }
            }
        }
        oj ojVar = this.f28092a.B;
        if (ojVar != null) {
            if (ojVar.f31375f != null) {
                Utilities.searchQueue.cancelRunnable(ojVar.f31375f);
                ojVar.f31375f = null;
            }
            int i10 = ojVar.h + 1;
            ojVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mj mjVar = new mj(ojVar, obj, i10, 0);
            ojVar.f31375f = mjVar;
            dispatchQueue.postRunnable(mjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
