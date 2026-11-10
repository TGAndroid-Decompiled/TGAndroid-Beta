package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class uz0 implements TextWatcher {
    public final vz0 f38786a;

    public uz0(vz0 vz0Var) {
        this.f38786a = vz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        float f10;
        if (this.f38786a.f39847b.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (this.f38786a.f39846a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            ViewPropertyAnimator animate = this.f38786a.f39846a.animate();
            float f12 = 1.0f;
            if (z9) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f10);
            if (!z9) {
                f12 = 0.1f;
            }
            scaleX.scaleY(f12).start();
        }
        String obj = this.f38786a.f39847b.getText().toString();
        if (obj.length() != 0) {
            iy iyVar = this.f38786a.f39848c.f31597o1;
            if (iyVar != null) {
                iyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
            }
        } else {
            v4.g0 adapter = this.f38786a.f39848c.f31596m1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f38786a.f39848c;
            if (adapter != editorAlert.f31600r1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f38786a.f39848c.f31597o1.setText(org.telegram.messenger.id.M0(2131748230, null));
                this.f38786a.f39848c.f31597o1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f38786a.f39848c;
                editorAlert2.f31596m1.setAdapter(editorAlert2.f31600r1);
                this.f38786a.f39848c.f31600r1.f();
                if (J0 > 0) {
                    this.f38786a.f39848c.f31599q1.h1(0, -J0);
                }
            }
        }
        rz0 rz0Var = this.f38786a.f39848c.f31601s1;
        if (rz0Var != null && !obj.equals(rz0Var.f37785n)) {
            rz0Var.f37785n = obj;
            if (rz0Var.h != null) {
                Utilities.f21343g.a(rz0Var.h);
                rz0Var.h = null;
            }
            if (obj.length() == 0) {
                rz0Var.f37783e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = rz0Var.f37786r;
                editorAlert3.f31608z1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                rz0Var.d = -1;
                rz0Var.f();
                return;
            }
            int i7 = rz0Var.d + 1;
            rz0Var.d = i7;
            rz0Var.h = new org.telegram.ui.q8((Object) rz0Var, obj, i7, 25);
            Utilities.f21343g.d(rz0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
