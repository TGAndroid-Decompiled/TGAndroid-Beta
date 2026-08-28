package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mg1 implements TextWatcher {
    public final UsersSelectActivity f40421a;

    public mg1(UsersSelectActivity usersSelectActivity) {
        this.f40421a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f40421a;
        if (usersSelectActivity.f36287c.length() != 0) {
            pg1 pg1Var = usersSelectActivity.h;
            boolean z10 = pg1Var.f41519n;
            if (!z10) {
                usersSelectActivity.I = true;
                usersSelectActivity.H = true;
                if (!z10) {
                    pg1Var.f41519n = true;
                    pg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f36289f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f36289f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f36287c.getText().toString());
            return;
        }
        usersSelectActivity.I = false;
        usersSelectActivity.H = false;
        pg1 pg1Var2 = usersSelectActivity.h;
        if (pg1Var2.f41519n) {
            pg1Var2.f41519n = false;
            pg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f36289f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
