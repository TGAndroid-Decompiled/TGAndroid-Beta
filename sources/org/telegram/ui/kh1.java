package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kh1 implements TextWatcher {
    public final UsersSelectActivity f35038a;

    public kh1(UsersSelectActivity usersSelectActivity) {
        this.f35038a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f35038a;
        if (usersSelectActivity.f31898c.length() != 0) {
            nh1 nh1Var = usersSelectActivity.h;
            boolean z10 = nh1Var.f35998n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    nh1Var.f35998n = true;
                    nh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f31899f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f31899f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f31898c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        nh1 nh1Var2 = usersSelectActivity.h;
        if (nh1Var2.f35998n) {
            nh1Var2.f35998n = false;
            nh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f31899f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
