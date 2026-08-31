package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ch1 implements TextWatcher {
    public final UsersSelectActivity f35815a;

    public ch1(UsersSelectActivity usersSelectActivity) {
        this.f35815a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f35815a;
        if (usersSelectActivity.f34932c.length() != 0) {
            fh1 fh1Var = usersSelectActivity.h;
            boolean z4 = fh1Var.f36889n;
            if (!z4) {
                usersSelectActivity.J = true;
                usersSelectActivity.I = true;
                if (!z4) {
                    fh1Var.f36889n = true;
                    fh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34934f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34934f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34932c.getText().toString());
            return;
        }
        usersSelectActivity.J = false;
        usersSelectActivity.I = false;
        fh1 fh1Var2 = usersSelectActivity.h;
        if (fh1Var2.f36889n) {
            fh1Var2.f36889n = false;
            fh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34934f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
