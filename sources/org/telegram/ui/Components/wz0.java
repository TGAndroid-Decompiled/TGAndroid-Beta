package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class wz0 implements TextWatcher {
    public final xz0 f41490a;

    public wz0(xz0 xz0Var) {
        this.f41490a = xz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f41490a.f41816b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f41490a.f41815a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f41490a.f41815a.animate();
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
        String obj = this.f41490a.f41816b.getText().toString();
        if (obj.length() != 0) {
            ny nyVar = this.f41490a.f41817c.f32763p1;
            if (nyVar != null) {
                nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
            }
        } else {
            v4.h0 adapter = this.f41490a.f41817c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f41490a.f41817c;
            if (adapter != editorAlert.f32766s1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.f41490a.f41817c.f32763p1.setText(org.telegram.messenger.hd.M0(2131748230, null));
                this.f41490a.f41817c.f32763p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f41490a.f41817c;
                editorAlert2.n1.setAdapter(editorAlert2.f32766s1);
                this.f41490a.f41817c.f32766s1.f();
                if (J0 > 0) {
                    this.f41490a.f41817c.f32765r1.h1(0, -J0);
                }
            }
        }
        tz0 tz0Var = this.f41490a.f41817c.f32767t1;
        if (tz0Var != null && !obj.equals(tz0Var.f39842n)) {
            tz0Var.f39842n = obj;
            if (tz0Var.h != null) {
                Utilities.f22418g.a(tz0Var.h);
                tz0Var.h = null;
            }
            if (obj.length() == 0) {
                tz0Var.f39840e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = tz0Var.f39843r;
                editorAlert3.A1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
                tz0Var.d = -1;
                tz0Var.f();
                return;
            }
            int i7 = tz0Var.d + 1;
            tz0Var.d = i7;
            tz0Var.h = new org.telegram.ui.f0(tz0Var, obj, i7, 28);
            Utilities.f22418g.d(tz0Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
