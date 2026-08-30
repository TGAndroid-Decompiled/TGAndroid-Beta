package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class cj implements TextWatcher {
    public final qj f24011a;

    public cj(qj qjVar) {
        this.f24011a = qjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            mz mzVar = this.f24011a.D;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.o0 adapter = this.f24011a.f28142s.getAdapter();
            qj qjVar = this.f24011a;
            if (adapter != qjVar.B) {
                currentTop = qjVar.getCurrentTop();
                this.f24011a.D.setText(LocaleController.getString(R.string.NoContacts));
                this.f24011a.D.c();
                qj qjVar2 = this.f24011a;
                qjVar2.f28142s.setAdapter(qjVar2.B);
                this.f24011a.B.l();
                if (currentTop > 0) {
                    this.f24011a.v.h1(0, -currentTop);
                }
            }
        }
        mj mjVar = this.f24011a.C;
        if (mjVar != null) {
            if (mjVar.f27039f != null) {
                Utilities.searchQueue.cancelRunnable(mjVar.f27039f);
                mjVar.f27039f = null;
            }
            int i10 = mjVar.h + 1;
            mjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kj kjVar = new kj(mjVar, obj, i10, 0);
            mjVar.f27039f = kjVar;
            dispatchQueue.postRunnable(kjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
