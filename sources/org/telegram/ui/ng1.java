package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ng1 implements TextWatcher {
    public final UsersSelectActivity f39871a;

    public ng1(UsersSelectActivity usersSelectActivity) {
        this.f39871a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f39871a;
        if (usersSelectActivity.f34259c.length() != 0) {
            qg1 qg1Var = usersSelectActivity.h;
            boolean z10 = qg1Var.f40807n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    qg1Var.f40807n = true;
                    qg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34260f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34260f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34259c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        qg1 qg1Var2 = usersSelectActivity.h;
        if (qg1Var2.f40807n) {
            qg1Var2.f40807n = false;
            qg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34260f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
