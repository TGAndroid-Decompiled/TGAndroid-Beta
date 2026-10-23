package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements TextWatcher {
    public boolean f32796a;
    public final int f32797b;
    public final e5 f32798c;

    public y3(int i10, e5 e5Var) {
        this.f32797b = i10;
        this.f32798c = e5Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f32796a) {
            int length = editable.length();
            int i10 = this.f32797b;
            if (length > i10) {
                this.f32796a = true;
                editable.delete(i10, editable.length());
                e5 e5Var = this.f32798c;
                AndroidUtilities.shakeView(e5Var);
                try {
                    e5Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f32796a = false;
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
