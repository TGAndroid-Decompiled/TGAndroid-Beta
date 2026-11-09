package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class vz0 implements TextWatcher {
    public final wz0 f39845a;

    public vz0(wz0 wz0Var) {
        this.f39845a = wz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        float f10;
        if (this.f39845a.f40263b.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (this.f39845a.f40262a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            ViewPropertyAnimator animate = this.f39845a.f40262a.animate();
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
        String obj = this.f39845a.f40263b.getText().toString();
        if (obj.length() != 0) {
            jy jyVar = this.f39845a.f40264c.l1;
            if (jyVar != null) {
                jyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
            }
        } else {
            v4.g0 adapter = this.f39845a.f40264c.f31586j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f39845a.f40264c;
            if (adapter != editorAlert.f31589o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f39845a.f40264c.l1.setText(org.telegram.messenger.id.M0(2131748230, null));
                this.f39845a.f40264c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f39845a.f40264c;
                editorAlert2.f31586j1.setAdapter(editorAlert2.f31589o1);
                this.f39845a.f40264c.f31589o1.f();
                if (J0 > 0) {
                    this.f39845a.f40264c.n1.h1(0, -J0);
                }
            }
        }
        sz0 sz0Var = this.f39845a.f40264c.f31590p1;
        if (sz0Var != null && !obj.equals(sz0Var.f38201n)) {
            sz0Var.f38201n = obj;
            if (sz0Var.h != null) {
                Utilities.f21338g.a(sz0Var.h);
                sz0Var.h = null;
            }
            if (obj.length() == 0) {
                sz0Var.f38199e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = sz0Var.f38202r;
                editorAlert3.f31597w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                sz0Var.d = -1;
                sz0Var.f();
                return;
            }
            int i7 = sz0Var.d + 1;
            sz0Var.d = i7;
            sz0Var.h = new org.telegram.ui.q8((Object) sz0Var, obj, i7, 25);
            Utilities.f21338g.d(sz0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
