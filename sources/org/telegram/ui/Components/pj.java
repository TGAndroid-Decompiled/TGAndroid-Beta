package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class pj implements TextWatcher {
    public final bk f26142a;

    public pj(bk bkVar) {
        this.f26142a = bkVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            tz tzVar = this.f26142a.G;
            if (tzVar != null) {
                tzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26142a.f21845s.getAdapter();
            bk bkVar = this.f26142a;
            if (adapter != bkVar.E) {
                currentTop = bkVar.getCurrentTop();
                this.f26142a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.f26142a.G.c();
                bk bkVar2 = this.f26142a;
                bkVar2.f21845s.setAdapter(bkVar2.E);
                this.f26142a.E.l();
                if (currentTop > 0) {
                    this.f26142a.v.h1(0, -currentTop);
                }
            }
        }
        xj xjVar = this.f26142a.F;
        if (xjVar != null) {
            if (xjVar.f29065f != null) {
                Utilities.searchQueue.cancelRunnable(xjVar.f29065f);
                xjVar.f29065f = null;
            }
            int i10 = xjVar.h + 1;
            xjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wj wjVar = new wj(xjVar, obj, i10, 0);
            xjVar.f29065f = wjVar;
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
