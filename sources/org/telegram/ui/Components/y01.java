package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class y01 implements TextWatcher {
    public final z01 f32592a;

    public y01(z01 z01Var) {
        this.f32592a = z01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f32592a.f32863b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f32592a.f32862a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f32592a.f32862a.animate();
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
        String obj = this.f32592a.f32863b.getText().toString();
        if (obj.length() != 0) {
            xy xyVar = this.f32592a.f32864c.l1;
            if (xyVar != null) {
                xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
            }
        } else {
            s4.g0 adapter = this.f32592a.f32864c.f24221j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f32592a.f32864c;
            if (adapter != editorAlert.f24225o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f32592a.f32864c.l1.setText(org.telegram.messenger.cd.L0(2131748247, null));
                this.f32592a.f32864c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f32592a.f32864c;
                editorAlert2.f24221j1.setAdapter(editorAlert2.f24225o1);
                this.f32592a.f32864c.f24225o1.f();
                if (J0 > 0) {
                    this.f32592a.f32864c.f24224n1.h1(0, -J0);
                }
            }
        }
        v01 v01Var = this.f32592a.f32864c.f24226p1;
        if (v01Var != null && !obj.equals(v01Var.f31110n)) {
            v01Var.f31110n = obj;
            if (v01Var.h != null) {
                Utilities.f14522g.a(v01Var.h);
                v01Var.h = null;
            }
            if (obj.length() == 0) {
                v01Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = v01Var.f31111r;
                editorAlert3.f24233w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                v01Var.d = -1;
                v01Var.f();
                return;
            }
            int i10 = v01Var.d + 1;
            v01Var.d = i10;
            v01Var.h = new ji0(v01Var, obj, i10, 12);
            Utilities.f14522g.d(v01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
