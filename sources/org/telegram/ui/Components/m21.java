package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 implements TextWatcher {
    public final n21 f28358a;

    public m21(n21 n21Var) {
        this.f28358a = n21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28358a.f28666b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28358a.f28665a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28358a.f28665a.animate();
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
        String obj = this.f28358a.f28666b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.f28358a.f28667c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28358a.f28667c.f24398c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28358a.f28667c;
            if (adapter != editorAlert.f24400n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f28358a.f28667c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28358a.f28667c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28358a.f28667c;
                editorAlert2.f24398c.setAdapter(editorAlert2.f24400n);
                this.f28358a.f28667c.f24400n.l();
                if (K > 0) {
                    this.f28358a.f28667c.h.h1(0, -K);
                }
            }
        }
        j21 j21Var = this.f28358a.f28667c.f24401r;
        if (j21Var != null && !obj.equals(j21Var.f27387n)) {
            j21Var.f27387n = obj;
            if (j21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(j21Var.h);
                j21Var.h = null;
            }
            if (obj.length() == 0) {
                j21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = j21Var.f27388r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                j21Var.d = -1;
                j21Var.l();
                return;
            }
            int i10 = j21Var.d + 1;
            j21Var.d = i10;
            j21Var.h = new org.telegram.ui.i4(j21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(j21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
