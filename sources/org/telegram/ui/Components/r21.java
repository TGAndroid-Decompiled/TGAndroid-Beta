package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class r21 implements TextWatcher {
    public final s21 f28411a;

    public r21(s21 s21Var) {
        this.f28411a = s21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28411a.f28709b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28411a.f28708a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28411a.f28708a.animate();
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
        String obj = this.f28411a.f28709b.getText().toString();
        if (obj.length() != 0) {
            yz yzVar = this.f28411a.f28710c.e;
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28411a.f28710c.f23039c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28411a.f28710c;
            if (adapter != editorAlert.f23041n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f28411a.f28710c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28411a.f28710c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28411a.f28710c;
                editorAlert2.f23039c.setAdapter(editorAlert2.f23041n);
                this.f28411a.f28710c.f23041n.l();
                if (K > 0) {
                    this.f28411a.f28710c.h.h1(0, -K);
                }
            }
        }
        o21 o21Var = this.f28411a.f28710c.f23042r;
        if (o21Var != null && !obj.equals(o21Var.f27517n)) {
            o21Var.f27517n = obj;
            if (o21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(o21Var.h);
                o21Var.h = null;
            }
            if (obj.length() == 0) {
                o21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = o21Var.f27518r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                o21Var.d = -1;
                o21Var.l();
                return;
            }
            int i10 = o21Var.d + 1;
            o21Var.d = i10;
            o21Var.h = new org.telegram.ui.gm(o21Var, obj, i10, 24);
            Utilities.searchQueue.postRunnable(o21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
