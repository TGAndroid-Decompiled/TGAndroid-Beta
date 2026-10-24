package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x3 implements TextWatcher {
    public boolean f32499a;
    public final int f32500b;
    public final c5 f32501c;

    public x3(int i10, c5 c5Var) {
        this.f32500b = i10;
        this.f32501c = c5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f32499a) {
            int length = editable.length();
            int i10 = this.f32500b;
            if (length > i10) {
                this.f32499a = true;
                editable.delete(i10, editable.length());
                c5 c5Var = this.f32501c;
                AndroidUtilities.shakeView(c5Var);
                try {
                    c5Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f32499a = false;
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
