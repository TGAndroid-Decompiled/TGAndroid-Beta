package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class z01 implements TextWatcher {
    public final a11 f32957a;

    public z01(a11 a11Var) {
        this.f32957a = a11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f32957a.f24267b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f32957a.f24266a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f32957a.f24266a.animate();
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f7);
            if (!z10) {
                f11 = 0.1f;
            }
            scaleX.scaleY(f11).start();
        }
        String obj = this.f32957a.f24267b.getText().toString();
        if (obj.length() != 0) {
            xy xyVar = this.f32957a.f24268c.l1;
            if (xyVar != null) {
                xyVar.setText(org.telegram.messenger.dd.L0(2131748183, null));
            }
        } else {
            s4.g0 adapter = this.f32957a.f24268c.f24222j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f32957a.f24268c;
            if (adapter != editorAlert.f24226o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f32957a.f24268c.l1.setText(org.telegram.messenger.dd.L0(2131748247, null));
                this.f32957a.f24268c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f32957a.f24268c;
                editorAlert2.f24222j1.setAdapter(editorAlert2.f24226o1);
                this.f32957a.f24268c.f24226o1.f();
                if (J0 > 0) {
                    this.f32957a.f24268c.f24225n1.h1(0, -J0);
                }
            }
        }
        w01 w01Var = this.f32957a.f24268c.f24227p1;
        if (w01Var != null && !obj.equals(w01Var.f32036n)) {
            w01Var.f32036n = obj;
            if (w01Var.h != null) {
                Utilities.f14523g.a(w01Var.h);
                w01Var.h = null;
            }
            if (obj.length() == 0) {
                w01Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = w01Var.f32037r;
                editorAlert3.f24234w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                w01Var.d = -1;
                w01Var.f();
                return;
            }
            int i10 = w01Var.d + 1;
            w01Var.d = i10;
            w01Var.h = new ki0(w01Var, obj, i10, 12);
            Utilities.f14523g.d(w01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
