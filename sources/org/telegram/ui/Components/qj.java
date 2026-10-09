package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qj implements TextWatcher {
    public final ck f30177a;

    public qj(ck ckVar) {
        this.f30177a = ckVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            c00 c00Var = this.f30177a.G;
            if (c00Var != null) {
                c00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f30177a.f25390s.getAdapter();
            ck ckVar = this.f30177a;
            if (adapter != ckVar.E) {
                currentTop = ckVar.getCurrentTop();
                this.f30177a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f30177a.G.c();
                ck ckVar2 = this.f30177a;
                ckVar2.f25390s.setAdapter(ckVar2.E);
                this.f30177a.E.l();
                if (currentTop > 0) {
                    this.f30177a.v.h1(0, -currentTop);
                }
            }
        }
        yj yjVar = this.f30177a.F;
        if (yjVar != null) {
            if (yjVar.f33302f != null) {
                Utilities.searchQueue.cancelRunnable(yjVar.f33302f);
                yjVar.f33302f = null;
            }
            int i10 = yjVar.h + 1;
            yjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xj xjVar = new xj(yjVar, obj, i10, 0);
            yjVar.f33302f = xjVar;
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
