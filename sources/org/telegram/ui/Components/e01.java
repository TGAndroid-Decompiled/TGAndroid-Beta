package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class e01 implements TextWatcher {
    public final f01 f34523a;

    public e01(f01 f01Var) {
        this.f34523a = f01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f34523a.f34938b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f34523a.f34937a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f34523a.f34937a.animate();
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
        String obj = this.f34523a.f34938b.getText().toString();
        if (obj.length() != 0) {
            sy syVar = this.f34523a.f34939c.f33260p1;
            if (syVar != null) {
                syVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
            }
        } else {
            v4.i0 adapter = this.f34523a.f34939c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f34523a.f34939c;
            if (adapter != editorAlert.f33263s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.f34523a.f34939c.f33260p1.setText(org.telegram.messenger.gd.N0(2131748037, null));
                this.f34523a.f34939c.f33260p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f34523a.f34939c;
                editorAlert2.n1.setAdapter(editorAlert2.f33263s1);
                this.f34523a.f34939c.f33263s1.f();
                if (K0 > 0) {
                    this.f34523a.f34939c.f33262r1.h1(0, -K0);
                }
            }
        }
        b01 b01Var = this.f34523a.f34939c.f33264t1;
        if (b01Var != null && !obj.equals(b01Var.f33594n)) {
            b01Var.f33594n = obj;
            if (b01Var.h != null) {
                Utilities.f22879g.a(b01Var.h);
                b01Var.h = null;
            }
            if (obj.length() == 0) {
                b01Var.f33592e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = b01Var.f33595r;
                editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
                b01Var.d = -1;
                b01Var.f();
                return;
            }
            int i7 = b01Var.d + 1;
            b01Var.d = i7;
            b01Var.h = new org.telegram.ui.f0(b01Var, obj, i7, 28);
            Utilities.f22879g.d(b01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
