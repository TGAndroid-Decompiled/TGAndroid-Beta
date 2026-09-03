package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class cj implements TextWatcher {
    public final qj f23950a;

    public cj(qj qjVar) {
        this.f23950a = qjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            mz mzVar = this.f23950a.D;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.o0 adapter = this.f23950a.f28194s.getAdapter();
            qj qjVar = this.f23950a;
            if (adapter != qjVar.B) {
                currentTop = qjVar.getCurrentTop();
                this.f23950a.D.setText(LocaleController.getString(R.string.NoContacts));
                this.f23950a.D.c();
                qj qjVar2 = this.f23950a;
                qjVar2.f28194s.setAdapter(qjVar2.B);
                this.f23950a.B.l();
                if (currentTop > 0) {
                    this.f23950a.v.h1(0, -currentTop);
                }
            }
        }
        mj mjVar = this.f23950a.C;
        if (mjVar != null) {
            if (mjVar.f27074f != null) {
                Utilities.searchQueue.cancelRunnable(mjVar.f27074f);
                mjVar.f27074f = null;
            }
            int i10 = mjVar.h + 1;
            mjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kj kjVar = new kj(mjVar, obj, i10, 0);
            mjVar.f27074f = kjVar;
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
