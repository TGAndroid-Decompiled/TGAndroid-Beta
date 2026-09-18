package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class mj implements TextWatcher {
    public final yj f26422a;

    public mj(yj yjVar) {
        this.f26422a = yjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            mz mzVar = this.f26422a.G;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26422a.f30603s.getAdapter();
            yj yjVar = this.f26422a;
            if (adapter != yjVar.E) {
                currentTop = yjVar.getCurrentTop();
                this.f26422a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f26422a.G.c();
                yj yjVar2 = this.f26422a;
                yjVar2.f30603s.setAdapter(yjVar2.E);
                this.f26422a.E.l();
                if (currentTop > 0) {
                    this.f26422a.v.h1(0, -currentTop);
                }
            }
        }
        uj ujVar = this.f26422a.F;
        if (ujVar != null) {
            if (ujVar.f28718f != null) {
                Utilities.searchQueue.cancelRunnable(ujVar.f28718f);
                ujVar.f28718f = null;
            }
            int i10 = ujVar.h + 1;
            ujVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            tj tjVar = new tj(ujVar, obj, i10, 0);
            ujVar.f28718f = tjVar;
            dispatchQueue.postRunnable(tjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
