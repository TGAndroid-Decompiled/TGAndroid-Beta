package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class wu extends Dialog {
    public final ai.z3 f32677a;

    public wu(ai.z3 z3Var, Context context) {
        super(context);
        this.f32677a = z3Var;
    }

    @Override
    public final void dismiss() {
        xu xuVar = (xu) this.f32677a.f2003b;
        xuVar.f33009a.k(false);
        xuVar.f33009a.e();
    }
}
