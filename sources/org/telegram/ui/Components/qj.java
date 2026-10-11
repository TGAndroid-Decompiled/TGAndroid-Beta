package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qj implements TextWatcher {
    public final ck f30252a;

    public qj(ck ckVar) {
        this.f30252a = ckVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            d00 d00Var = this.f30252a.G;
            if (d00Var != null) {
                d00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f30252a.f25375s.getAdapter();
            ck ckVar = this.f30252a;
            if (adapter != ckVar.E) {
                currentTop = ckVar.getCurrentTop();
                this.f30252a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f30252a.G.c();
                ck ckVar2 = this.f30252a;
                ckVar2.f25375s.setAdapter(ckVar2.E);
                this.f30252a.E.l();
                if (currentTop > 0) {
                    this.f30252a.v.h1(0, -currentTop);
                }
            }
        }
        yj yjVar = this.f30252a.F;
        if (yjVar != null) {
            if (yjVar.f33364f != null) {
                Utilities.searchQueue.cancelRunnable(yjVar.f33364f);
                yjVar.f33364f = null;
            }
            int i10 = yjVar.h + 1;
            yjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xj xjVar = new xj(yjVar, obj, i10, 0);
            yjVar.f33364f = xjVar;
            dispatchQueue.postRunnable(xjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
