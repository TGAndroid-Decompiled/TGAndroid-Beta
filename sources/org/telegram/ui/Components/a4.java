package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class a4 implements TextWatcher {
    public boolean f26423a;
    public final int f26424b;
    public final f5 f26425c;

    public a4(int i10, f5 f5Var) {
        this.f26424b = i10;
        this.f26425c = f5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f26423a) {
            int length = editable.length();
            int i10 = this.f26424b;
            if (length > i10) {
                this.f26423a = true;
                editable.delete(i10, editable.length());
                f5 f5Var = this.f26425c;
                AndroidUtilities.shakeView(f5Var);
                try {
                    f5Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f26423a = false;
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
