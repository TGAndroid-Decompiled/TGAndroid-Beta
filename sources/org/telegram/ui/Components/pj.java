package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class pj implements TextWatcher {
    public final bk f29647a;

    public pj(bk bkVar) {
        this.f29647a = bkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            pz pzVar = this.f29647a.G;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f29647a.f24989s.getAdapter();
            bk bkVar = this.f29647a;
            if (adapter != bkVar.E) {
                currentTop = bkVar.getCurrentTop();
                this.f29647a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f29647a.G.c();
                bk bkVar2 = this.f29647a;
                bkVar2.f24989s.setAdapter(bkVar2.E);
                this.f29647a.E.l();
                if (currentTop > 0) {
                    this.f29647a.v.h1(0, -currentTop);
                }
            }
        }
        xj xjVar = this.f29647a.F;
        if (xjVar != null) {
            if (xjVar.f32888f != null) {
                Utilities.searchQueue.cancelRunnable(xjVar.f32888f);
                xjVar.f32888f = null;
            }
            int i10 = xjVar.h + 1;
            xjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wj wjVar = new wj(xjVar, obj, i10, 0);
            xjVar.f32888f = wjVar;
            dispatchQueue.postRunnable(wjVar, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
