package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class lj implements TextWatcher {
    public final xj f30257a;

    public lj(xj xjVar) {
        this.f30257a = xjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            uz uzVar = this.f30257a.G;
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f30257a.f34784s.getAdapter();
            xj xjVar = this.f30257a;
            if (adapter != xjVar.E) {
                currentTop = xjVar.getCurrentTop();
                this.f30257a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f30257a.G.c();
                xj xjVar2 = this.f30257a;
                xjVar2.f34784s.setAdapter(xjVar2.E);
                this.f30257a.E.l();
                if (currentTop > 0) {
                    this.f30257a.v.h1(0, -currentTop);
                }
            }
        }
        tj tjVar = this.f30257a.F;
        if (tjVar != null) {
            if (tjVar.f33062f != null) {
                Utilities.searchQueue.cancelRunnable(tjVar.f33062f);
                tjVar.f33062f = null;
            }
            int i10 = tjVar.h + 1;
            tjVar.h = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            sj sjVar = new sj(tjVar, obj, i10, 0);
            tjVar.f33062f = sjVar;
            dispatchQueue2.postRunnable(sjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
