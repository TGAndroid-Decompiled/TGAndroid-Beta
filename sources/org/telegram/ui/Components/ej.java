package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ej implements TextWatcher {
    public final sj f26561a;

    public ej(sj sjVar) {
        this.f26561a = sjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            oz ozVar = this.f26561a.D;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.f26561a.f31069s.getAdapter();
            sj sjVar = this.f26561a;
            if (adapter != sjVar.B) {
                currentTop = sjVar.getCurrentTop();
                this.f26561a.D.setText(LocaleController.getString(R.string.NoContacts));
                this.f26561a.D.c();
                sj sjVar2 = this.f26561a;
                sjVar2.f31069s.setAdapter(sjVar2.B);
                this.f26561a.B.l();
                if (currentTop > 0) {
                    this.f26561a.v.h1(0, -currentTop);
                }
            }
        }
        oj ojVar = this.f26561a.C;
        if (ojVar != null) {
            if (ojVar.f29782f != null) {
                Utilities.searchQueue.cancelRunnable(ojVar.f29782f);
                ojVar.f29782f = null;
            }
            int i10 = ojVar.h + 1;
            ojVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mj mjVar = new mj(ojVar, obj, i10, 0);
            ojVar.f29782f = mjVar;
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
