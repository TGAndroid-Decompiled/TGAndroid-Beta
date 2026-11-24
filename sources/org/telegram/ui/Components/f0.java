package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f0 implements TextWatcher {
    public final g0 a;

    public f0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        float f;
        if (this.a.b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        float f2 = 0.0f;
        if (this.a.a.getAlpha() != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            ViewPropertyAnimator animate = this.a.a.animate();
            float f3 = 1.0f;
            if (z) {
                f2 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f2).setDuration(150L);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f);
            if (!z) {
                f3 = 0.1f;
            }
            scaleX.scaleY(f3).start();
        }
        String obj = this.a.b.getText().toString();
        int length = obj.length();
        ThemeEditorView.EditorAlert editorAlert = this.a.c;
        if (length != 0) {
            r34 r34Var = editorAlert.o1;
            if (r34Var != null) {
                r34Var.setText(jb6.M0(2131747901, null));
            }
        } else {
            y59 adapter = editorAlert.m1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
            if (adapter != editorAlert2.r1) {
                int D0 = editorAlert2.D0();
                this.a.c.o1.setText(jb6.M0(2131747964, null));
                this.a.c.o1.c();
                ThemeEditorView.EditorAlert editorAlert3 = this.a.c;
                editorAlert3.m1.setAdapter(editorAlert3.r1);
                this.a.c.r1.f();
                if (D0 > 0) {
                    this.a.c.q1.g1(0, -D0);
                }
            }
        }
        c0 c0Var = this.a.c.s1;
        if (c0Var != null && !obj.equals(c0Var.n)) {
            c0Var.n = obj;
            if (c0Var.h != null) {
                Utilities.g.a(c0Var.h);
                c0Var.h = null;
            }
            if (obj.length() == 0) {
                c0Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert4 = c0Var.r;
                int i = ThemeEditorView.EditorAlert.G1;
                editorAlert4.z1 = editorAlert4.D0();
                c0Var.d = -1;
                c0Var.f();
                return;
            }
            int i2 = c0Var.d + 1;
            c0Var.d = i2;
            c0Var.h = new v99(c0Var, obj, i2, (byte) 23);
            Utilities.g.d(c0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
