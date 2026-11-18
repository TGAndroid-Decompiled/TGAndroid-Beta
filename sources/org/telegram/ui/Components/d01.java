package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d01 implements TextWatcher {
    public final e01 f34236a;

    public d01(e01 e01Var) {
        this.f34236a = e01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f34236a.f34556b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f34236a.f34555a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f34236a.f34555a.animate();
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
        String obj = this.f34236a.f34556b.getText().toString();
        if (obj.length() != 0) {
            ty tyVar = this.f34236a.f34557c.f33160p1;
            if (tyVar != null) {
                tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
            }
        } else {
            v4.i0 adapter = this.f34236a.f34557c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f34236a.f34557c;
            if (adapter != editorAlert.f33163s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.f34236a.f34557c.f33160p1.setText(org.telegram.messenger.gd.M0(2131748038, null));
                this.f34236a.f34557c.f33160p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f34236a.f34557c;
                editorAlert2.n1.setAdapter(editorAlert2.f33163s1);
                this.f34236a.f34557c.f33163s1.f();
                if (K0 > 0) {
                    this.f34236a.f34557c.f33162r1.h1(0, -K0);
                }
            }
        }
        a01 a01Var = this.f34236a.f34557c.f33164t1;
        if (a01Var != null && !obj.equals(a01Var.f33202n)) {
            a01Var.f33202n = obj;
            if (a01Var.h != null) {
                Utilities.f22784g.a(a01Var.h);
                a01Var.h = null;
            }
            if (obj.length() == 0) {
                a01Var.f33200e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = a01Var.f33203r;
                editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
                a01Var.d = -1;
                a01Var.f();
                return;
            }
            int i7 = a01Var.d + 1;
            a01Var.d = i7;
            a01Var.h = new org.telegram.ui.b0(a01Var, obj, i7, 29);
            Utilities.f22784g.d(a01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
