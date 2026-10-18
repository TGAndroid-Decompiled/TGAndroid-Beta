package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jg1 implements TextWatcher {
    public final UsersSelectActivity f38138a;

    public jg1(UsersSelectActivity usersSelectActivity) {
        this.f38138a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f38138a;
        if (usersSelectActivity.f33943c.length() != 0) {
            mg1 mg1Var = usersSelectActivity.h;
            boolean z10 = mg1Var.f39168n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    mg1Var.f39168n = true;
                    mg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f33944f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f33944f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f33943c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        mg1 mg1Var2 = usersSelectActivity.h;
        if (mg1Var2.f39168n) {
            mg1Var2.f39168n = false;
            mg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f33944f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
