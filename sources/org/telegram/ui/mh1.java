package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mh1 implements TextWatcher {
    public final UsersSelectActivity f38598a;

    public mh1(UsersSelectActivity usersSelectActivity) {
        this.f38598a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f38598a;
        if (usersSelectActivity.f34585c.length() != 0) {
            ph1 ph1Var = usersSelectActivity.h;
            boolean z10 = ph1Var.f39492n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    ph1Var.f39492n = true;
                    ph1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34587f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34587f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34585c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        ph1 ph1Var2 = usersSelectActivity.h;
        if (ph1Var2.f39492n) {
            ph1Var2.f39492n = false;
            ph1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34587f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
