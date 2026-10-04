package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 implements TextWatcher {
    public final n21 f28509a;

    public m21(n21 n21Var) {
        this.f28509a = n21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28509a.f28845b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28509a.f28844a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28509a.f28844a.animate();
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
        String obj = this.f28509a.f28845b.getText().toString();
        if (obj.length() != 0) {
            pz pzVar = this.f28509a.f28846c.f24360e;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f28509a.f28846c.f24359c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28509a.f28846c;
            if (adapter != editorAlert.f24362n) {
                int H = ThemeEditorView.EditorAlert.H(editorAlert);
                this.f28509a.f28846c.f24360e.setText(LocaleController.getString(R.string.NoChats));
                this.f28509a.f28846c.f24360e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28509a.f28846c;
                editorAlert2.f24359c.setAdapter(editorAlert2.f24362n);
                this.f28509a.f28846c.f24362n.l();
                if (H > 0) {
                    this.f28509a.f28846c.h.h1(0, -H);
                }
            }
        }
        j21 j21Var = this.f28509a.f28846c.f24363r;
        if (j21Var != null && !obj.equals(j21Var.f27566n)) {
            j21Var.f27566n = obj;
            if (j21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(j21Var.h);
                j21Var.h = null;
            }
            if (obj.length() == 0) {
                j21Var.f27564e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = j21Var.f27567r;
                editorAlert3.F = ThemeEditorView.EditorAlert.H(editorAlert3);
                j21Var.d = -1;
                j21Var.l();
                return;
            }
            int i10 = j21Var.d + 1;
            j21Var.d = i10;
            j21Var.h = new zm(j21Var, obj, i10, 22);
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
