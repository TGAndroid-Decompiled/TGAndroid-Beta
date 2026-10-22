package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 implements TextWatcher {
    public final n21 f28361a;

    public m21(n21 n21Var) {
        this.f28361a = n21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28361a.f28670b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28361a.f28669a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28361a.f28669a.animate();
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
        String obj = this.f28361a.f28670b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.f28361a.f28671c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28361a.f28671c.f24401c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28361a.f28671c;
            if (adapter != editorAlert.f24403n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f28361a.f28671c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28361a.f28671c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28361a.f28671c;
                editorAlert2.f24401c.setAdapter(editorAlert2.f24403n);
                this.f28361a.f28671c.f24403n.l();
                if (K > 0) {
                    this.f28361a.f28671c.h.h1(0, -K);
                }
            }
        }
        j21 j21Var = this.f28361a.f28671c.f24404r;
        if (j21Var != null && !obj.equals(j21Var.f27390n)) {
            j21Var.f27390n = obj;
            if (j21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(j21Var.h);
                j21Var.h = null;
            }
            if (obj.length() == 0) {
                j21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = j21Var.f27391r;
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
