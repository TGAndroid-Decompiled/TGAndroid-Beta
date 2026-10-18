package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class k21 implements TextWatcher {
    public final l21 f27717a;

    public k21(l21 l21Var) {
        this.f27717a = l21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f27717a.f28055b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f27717a.f28054a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f27717a.f28054a.animate();
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
        String obj = this.f27717a.f28055b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.f27717a.f28056c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f27717a.f28056c.f24394c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f27717a.f28056c;
            if (adapter != editorAlert.f24396n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f27717a.f28056c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f27717a.f28056c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f27717a.f28056c;
                editorAlert2.f24394c.setAdapter(editorAlert2.f24396n);
                this.f27717a.f28056c.f24396n.l();
                if (K > 0) {
                    this.f27717a.f28056c.h.h1(0, -K);
                }
            }
        }
        h21 h21Var = this.f27717a.f28056c.f24397r;
        if (h21Var != null && !obj.equals(h21Var.f26745n)) {
            h21Var.f26745n = obj;
            if (h21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(h21Var.h);
                h21Var.h = null;
            }
            if (obj.length() == 0) {
                h21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = h21Var.f26746r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                h21Var.d = -1;
                h21Var.l();
                return;
            }
            int i10 = h21Var.d + 1;
            h21Var.d = i10;
            h21Var.h = new org.telegram.ui.i4(h21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(h21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
