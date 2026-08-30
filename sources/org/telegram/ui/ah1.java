package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ah1 implements TextWatcher {
    public final UsersSelectActivity f32592a;

    public ah1(UsersSelectActivity usersSelectActivity) {
        this.f32592a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f32592a;
        if (usersSelectActivity.f32389c.length() != 0) {
            dh1 dh1Var = usersSelectActivity.h;
            boolean z4 = dh1Var.f33645n;
            if (!z4) {
                usersSelectActivity.J = true;
                usersSelectActivity.I = true;
                if (!z4) {
                    dh1Var.f33645n = true;
                    dh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f32390f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f32390f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f32389c.getText().toString());
            return;
        }
        usersSelectActivity.J = false;
        usersSelectActivity.I = false;
        dh1 dh1Var2 = usersSelectActivity.h;
        if (dh1Var2.f33645n) {
            dh1Var2.f33645n = false;
            dh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f32390f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
