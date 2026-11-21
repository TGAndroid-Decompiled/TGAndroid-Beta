package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f01 implements TextWatcher {
    public final g01 f35051a;

    public f01(g01 g01Var) {
        this.f35051a = g01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f35051a.f35356b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f35051a.f35355a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f35051a.f35355a.animate();
            float f12 = 1.0f;
            if (z10) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f10);
            if (!z10) {
                f12 = 0.1f;
            }
            scaleX.scaleY(f12).start();
        }
        String obj = this.f35051a.f35356b.getText().toString();
        if (obj.length() != 0) {
            vy vyVar = this.f35051a.f35357c.f33193p1;
            if (vyVar != null) {
                vyVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
            }
        } else {
            v4.i0 adapter = this.f35051a.f35357c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f35051a.f35357c;
            if (adapter != editorAlert.f33196s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.f35051a.f35357c.f33193p1.setText(org.telegram.messenger.gd.N0(2131748037, null));
                this.f35051a.f35357c.f33193p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f35051a.f35357c;
                editorAlert2.n1.setAdapter(editorAlert2.f33196s1);
                this.f35051a.f35357c.f33196s1.f();
                if (K0 > 0) {
                    this.f35051a.f35357c.f33195r1.h1(0, -K0);
                }
            }
        }
        c01 c01Var = this.f35051a.f35357c.f33197t1;
        if (c01Var != null && !obj.equals(c01Var.f33964n)) {
            c01Var.f33964n = obj;
            if (c01Var.h != null) {
                Utilities.f22809g.a(c01Var.h);
                c01Var.h = null;
            }
            if (obj.length() == 0) {
                c01Var.f33962e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = c01Var.f33965r;
                editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
                c01Var.d = -1;
                c01Var.f();
                return;
            }
            int i7 = c01Var.d + 1;
            c01Var.d = i7;
            c01Var.h = new org.telegram.ui.b0(c01Var, obj, i7, 29);
            Utilities.f22809g.d(c01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
