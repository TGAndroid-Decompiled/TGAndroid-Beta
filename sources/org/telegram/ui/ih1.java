package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ih1 implements TextWatcher {
    public final UsersSelectActivity f34941a;

    public ih1(UsersSelectActivity usersSelectActivity) {
        this.f34941a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f34941a;
        if (usersSelectActivity.f32363c.length() != 0) {
            lh1 lh1Var = usersSelectActivity.h;
            boolean z4 = lh1Var.f35771n;
            if (!z4) {
                usersSelectActivity.J = true;
                usersSelectActivity.I = true;
                if (!z4) {
                    lh1Var.f35771n = true;
                    lh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f32364f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f32364f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f32363c.getText().toString());
            return;
        }
        usersSelectActivity.J = false;
        usersSelectActivity.I = false;
        lh1 lh1Var2 = usersSelectActivity.h;
        if (lh1Var2.f35771n) {
            lh1Var2.f35771n = false;
            lh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f32364f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
