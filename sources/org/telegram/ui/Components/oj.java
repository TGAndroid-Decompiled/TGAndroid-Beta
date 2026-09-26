package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class oj implements TextWatcher {
    public final ak f27046a;

    public oj(ak akVar) {
        this.f27046a = akVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            oz ozVar = this.f27046a.G;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f27046a.f22679s.getAdapter();
            ak akVar = this.f27046a;
            if (adapter != akVar.E) {
                currentTop = akVar.getCurrentTop();
                this.f27046a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f27046a.G.c();
                ak akVar2 = this.f27046a;
                akVar2.f22679s.setAdapter(akVar2.E);
                this.f27046a.E.l();
                if (currentTop > 0) {
                    this.f27046a.v.h1(0, -currentTop);
                }
            }
        }
        wj wjVar = this.f27046a.F;
        if (wjVar != null) {
            if (wjVar.f30093f != null) {
                Utilities.searchQueue.cancelRunnable(wjVar.f30093f);
                wjVar.f30093f = null;
            }
            int i10 = wjVar.h + 1;
            wjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            vj vjVar = new vj(wjVar, obj, i10, 0);
            wjVar.f30093f = vjVar;
            dispatchQueue.postRunnable(vjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
