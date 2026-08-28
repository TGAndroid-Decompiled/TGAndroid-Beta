package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class bj implements TextWatcher {
    public final pj f27222a;

    public bj(pj pjVar) {
        this.f27222a = pjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            yy yyVar = this.f27222a.C;
            if (yyVar != null) {
                yyVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.r0 adapter = this.f27222a.f31679s.getAdapter();
            pj pjVar = this.f27222a;
            if (adapter != pjVar.A) {
                currentTop = pjVar.getCurrentTop();
                this.f27222a.C.setText(LocaleController.getString(R.string.NoContacts));
                this.f27222a.C.c();
                pj pjVar2 = this.f27222a;
                pjVar2.f31679s.setAdapter(pjVar2.A);
                this.f27222a.A.l();
                if (currentTop > 0) {
                    this.f27222a.v.h1(0, -currentTop);
                }
            }
        }
        lj ljVar = this.f27222a.B;
        if (ljVar != null) {
            if (ljVar.f30464f != null) {
                Utilities.searchQueue.cancelRunnable(ljVar.f30464f);
                ljVar.f30464f = null;
            }
            int i9 = ljVar.h + 1;
            ljVar.h = i9;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            jj jjVar = new jj(ljVar, obj, i9, 0);
            ljVar.f30464f = jjVar;
            dispatchQueue.postRunnable(jjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
