package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 implements TextWatcher {
    public final n21 f28508a;

    public m21(n21 n21Var) {
        this.f28508a = n21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28508a.f28844b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28508a.f28843a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28508a.f28843a.animate();
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
        String obj = this.f28508a.f28844b.getText().toString();
        if (obj.length() != 0) {
            pz pzVar = this.f28508a.f28845c.f24359e;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f28508a.f28845c.f24358c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28508a.f28845c;
            if (adapter != editorAlert.f24361n) {
                int H = ThemeEditorView.EditorAlert.H(editorAlert);
                this.f28508a.f28845c.f24359e.setText(LocaleController.getString(R.string.NoChats));
                this.f28508a.f28845c.f24359e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28508a.f28845c;
                editorAlert2.f24358c.setAdapter(editorAlert2.f24361n);
                this.f28508a.f28845c.f24361n.l();
                if (H > 0) {
                    this.f28508a.f28845c.h.h1(0, -H);
                }
            }
        }
        j21 j21Var = this.f28508a.f28845c.f24362r;
        if (j21Var != null && !obj.equals(j21Var.f27565n)) {
            j21Var.f27565n = obj;
            if (j21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(j21Var.h);
                j21Var.h = null;
            }
            if (obj.length() == 0) {
                j21Var.f27563e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = j21Var.f27566r;
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
