package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class v21 implements TextWatcher {
    public final w21 f31712a;

    public v21(w21 w21Var) {
        this.f31712a = w21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f31712a.f32577b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f31712a.f32576a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f31712a.f32576a.animate();
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
        String obj = this.f31712a.f32577b.getText().toString();
        if (obj.length() != 0) {
            d00 d00Var = this.f31712a.f32578c.f24366e;
            if (d00Var != null) {
                d00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f31712a.f32578c.f24365c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f31712a.f32578c;
            if (adapter != editorAlert.f24368n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f31712a.f32578c.f24366e.setText(LocaleController.getString(R.string.NoChats));
                this.f31712a.f32578c.f24366e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f31712a.f32578c;
                editorAlert2.f24365c.setAdapter(editorAlert2.f24368n);
                this.f31712a.f32578c.f24368n.l();
                if (K > 0) {
                    this.f31712a.f32578c.h.h1(0, -K);
                }
            }
        }
        s21 s21Var = this.f31712a.f32578c.f24369r;
        if (s21Var != null && !obj.equals(s21Var.f30653n)) {
            s21Var.f30653n = obj;
            if (s21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(s21Var.h);
                s21Var.h = null;
            }
            if (obj.length() == 0) {
                s21Var.f30651e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = s21Var.f30654r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                s21Var.d = -1;
                s21Var.l();
                return;
            }
            int i10 = s21Var.d + 1;
            s21Var.d = i10;
            s21Var.h = new zk(s21Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(s21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
