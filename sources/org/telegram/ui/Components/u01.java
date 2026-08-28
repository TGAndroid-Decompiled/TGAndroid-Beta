package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class u01 implements TextWatcher {
    public final v01 f32873a;

    public u01(v01 v01Var) {
        this.f32873a = v01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f32873a.f33196b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (this.f32873a.f33195a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f32873a.f33195a.animate();
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
        String obj = this.f32873a.f33196b.getText().toString();
        if (obj.length() != 0) {
            yy yyVar = this.f32873a.f33197c.f26567e;
            if (yyVar != null) {
                yyVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.r0 adapter = this.f32873a.f33197c.f26566c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f32873a.f33197c;
            if (adapter != editorAlert.f26569n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.f32873a.f33197c.f26567e.setText(LocaleController.getString(R.string.NoChats));
                this.f32873a.f33197c.f26567e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f32873a.f33197c;
                editorAlert2.f26566c.setAdapter(editorAlert2.f26569n);
                this.f32873a.f33197c.f26569n.l();
                if (I > 0) {
                    this.f32873a.f33197c.h.h1(0, -I);
                }
            }
        }
        r01 r01Var = this.f32873a.f33197c.f26570r;
        if (r01Var != null && !obj.equals(r01Var.f32049n)) {
            r01Var.f32049n = obj;
            if (r01Var.h != null) {
                Utilities.searchQueue.cancelRunnable(r01Var.h);
                r01Var.h = null;
            }
            if (obj.length() == 0) {
                r01Var.f32047e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = r01Var.f32050r;
                editorAlert3.B = ThemeEditorView.EditorAlert.I(editorAlert3);
                r01Var.d = -1;
                r01Var.l();
                return;
            }
            int i9 = r01Var.d + 1;
            r01Var.d = i9;
            r01Var.h = new org.telegram.ui.rl(r01Var, obj, i9, 23);
            Utilities.searchQueue.postRunnable(r01Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
