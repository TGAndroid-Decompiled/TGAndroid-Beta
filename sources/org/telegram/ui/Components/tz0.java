package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class tz0 implements TextWatcher {
    public final uz0 f38585a;

    public tz0(uz0 uz0Var) {
        this.f38585a = uz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f38585a.f38914b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f38585a.f38913a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f38585a.f38913a.animate();
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
        String obj = this.f38585a.f38914b.getText().toString();
        if (obj.length() != 0) {
            gy gyVar = this.f38585a.f38915c.m1;
            if (gyVar != null) {
                gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
            }
        } else {
            u4.h0 adapter = this.f38585a.f38915c.k1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f38585a.f38915c;
            if (adapter != editorAlert.f31658p1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f38585a.f38915c.m1.setText(org.telegram.messenger.bd.M0(2131748238, null));
                this.f38585a.f38915c.m1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f38585a.f38915c;
                editorAlert2.k1.setAdapter(editorAlert2.f31658p1);
                this.f38585a.f38915c.f31658p1.f();
                if (J0 > 0) {
                    this.f38585a.f38915c.f31657o1.h1(0, -J0);
                }
            }
        }
        qz0 qz0Var = this.f38585a.f38915c.f31659q1;
        if (qz0Var != null && !obj.equals(qz0Var.f37576n)) {
            qz0Var.f37576n = obj;
            if (qz0Var.h != null) {
                Utilities.f21389g.a(qz0Var.h);
                qz0Var.h = null;
            }
            if (obj.length() == 0) {
                qz0Var.f37574e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = qz0Var.f37577r;
                editorAlert3.f31666x1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                qz0Var.d = -1;
                qz0Var.f();
                return;
            }
            int i3 = qz0Var.d + 1;
            qz0Var.d = i3;
            qz0Var.h = new org.telegram.ui.f4(qz0Var, obj, i3, 26);
            Utilities.f21389g.e(qz0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
