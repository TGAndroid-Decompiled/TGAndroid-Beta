package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 implements TextWatcher {
    public final n21 f28514a;

    public m21(n21 n21Var) {
        this.f28514a = n21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28514a.f28850b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28514a.f28849a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28514a.f28849a.animate();
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
        String obj = this.f28514a.f28850b.getText().toString();
        if (obj.length() != 0) {
            pz pzVar = this.f28514a.f28851c.f24364e;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f28514a.f28851c.f24363c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28514a.f28851c;
            if (adapter != editorAlert.f24366n) {
                int H = ThemeEditorView.EditorAlert.H(editorAlert);
                this.f28514a.f28851c.f24364e.setText(LocaleController.getString(R.string.NoChats));
                this.f28514a.f28851c.f24364e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28514a.f28851c;
                editorAlert2.f24363c.setAdapter(editorAlert2.f24366n);
                this.f28514a.f28851c.f24366n.l();
                if (H > 0) {
                    this.f28514a.f28851c.h.h1(0, -H);
                }
            }
        }
        j21 j21Var = this.f28514a.f28851c.f24367r;
        if (j21Var != null && !obj.equals(j21Var.f27571n)) {
            j21Var.f27571n = obj;
            if (j21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(j21Var.h);
                j21Var.h = null;
            }
            if (obj.length() == 0) {
                j21Var.f27569e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = j21Var.f27572r;
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
