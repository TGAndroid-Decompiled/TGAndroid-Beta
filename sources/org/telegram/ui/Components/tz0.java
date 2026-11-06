package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class tz0 implements TextWatcher {
    public final uz0 f38457a;

    public tz0(uz0 uz0Var) {
        this.f38457a = uz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        float f10;
        if (this.f38457a.f38775b.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (this.f38457a.f38774a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            ViewPropertyAnimator animate = this.f38457a.f38774a.animate();
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
        String obj = this.f38457a.f38775b.getText().toString();
        if (obj.length() != 0) {
            iy iyVar = this.f38457a.f38776c.l1;
            if (iyVar != null) {
                iyVar.setText(org.telegram.messenger.hd.M0(2131748166, null));
            }
        } else {
            v4.g0 adapter = this.f38457a.f38776c.f31576j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f38457a.f38776c;
            if (adapter != editorAlert.f31579o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f38457a.f38776c.l1.setText(org.telegram.messenger.hd.M0(2131748229, null));
                this.f38457a.f38776c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f38457a.f38776c;
                editorAlert2.f31576j1.setAdapter(editorAlert2.f31579o1);
                this.f38457a.f38776c.f31579o1.f();
                if (J0 > 0) {
                    this.f38457a.f38776c.n1.h1(0, -J0);
                }
            }
        }
        qz0 qz0Var = this.f38457a.f38776c.f31580p1;
        if (qz0Var != null && !obj.equals(qz0Var.f37543n)) {
            qz0Var.f37543n = obj;
            if (qz0Var.h != null) {
                Utilities.f21335g.a(qz0Var.h);
                qz0Var.h = null;
            }
            if (obj.length() == 0) {
                qz0Var.f37541e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = qz0Var.f37544r;
                editorAlert3.f31587w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                qz0Var.d = -1;
                qz0Var.f();
                return;
            }
            int i7 = qz0Var.d + 1;
            qz0Var.d = i7;
            qz0Var.h = new org.telegram.ui.q8((Object) qz0Var, obj, i7, 25);
            Utilities.f21335g.d(qz0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
