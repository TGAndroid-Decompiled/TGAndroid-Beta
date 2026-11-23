package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f01 implements TextWatcher {
    public final g01 f35024a;

    public f01(g01 g01Var) {
        this.f35024a = g01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f35024a.f35320b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f35024a.f35319a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f35024a.f35319a.animate();
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
        String obj = this.f35024a.f35320b.getText().toString();
        if (obj.length() != 0) {
            vy vyVar = this.f35024a.f35321c.f33162p1;
            if (vyVar != null) {
                vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
            }
        } else {
            v4.h0 adapter = this.f35024a.f35321c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f35024a.f35321c;
            if (adapter != editorAlert.f33165s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.f35024a.f35321c.f33162p1.setText(org.telegram.messenger.hd.N0(2131748037, null));
                this.f35024a.f35321c.f33162p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f35024a.f35321c;
                editorAlert2.n1.setAdapter(editorAlert2.f33165s1);
                this.f35024a.f35321c.f33165s1.f();
                if (K0 > 0) {
                    this.f35024a.f35321c.f33164r1.h1(0, -K0);
                }
            }
        }
        c01 c01Var = this.f35024a.f35321c.f33166t1;
        if (c01Var != null && !obj.equals(c01Var.f33921n)) {
            c01Var.f33921n = obj;
            if (c01Var.h != null) {
                Utilities.f22776g.a(c01Var.h);
                c01Var.h = null;
            }
            if (obj.length() == 0) {
                c01Var.f33919e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = c01Var.f33922r;
                editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
                c01Var.d = -1;
                c01Var.f();
                return;
            }
            int i7 = c01Var.d + 1;
            c01Var.d = i7;
            c01Var.h = new org.telegram.ui.f0(c01Var, obj, i7, 28);
            Utilities.f22776g.d(c01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
