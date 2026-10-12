package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class q21 implements TextWatcher {
    public final r21 f28490a;

    public q21(r21 r21Var) {
        this.f28490a = r21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28490a.f28722b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28490a.f28721a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28490a.f28721a.animate();
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
        String obj = this.f28490a.f28722b.getText().toString();
        if (obj.length() != 0) {
            yz yzVar = this.f28490a.f28723c.e;
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28490a.f28723c.f23339c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28490a.f28723c;
            if (adapter != editorAlert.f23341n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f28490a.f28723c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28490a.f28723c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28490a.f28723c;
                editorAlert2.f23339c.setAdapter(editorAlert2.f23341n);
                this.f28490a.f28723c.f23341n.l();
                if (K > 0) {
                    this.f28490a.f28723c.h.h1(0, -K);
                }
            }
        }
        n21 n21Var = this.f28490a.f28723c.f23342r;
        if (n21Var != null && !obj.equals(n21Var.f27570n)) {
            n21Var.f27570n = obj;
            if (n21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(n21Var.h);
                n21Var.h = null;
            }
            if (obj.length() == 0) {
                n21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = n21Var.f27571r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                n21Var.d = -1;
                n21Var.l();
                return;
            }
            int i10 = n21Var.d + 1;
            n21Var.d = i10;
            n21Var.h = new org.telegram.ui.gm(n21Var, obj, i10, 24);
            Utilities.searchQueue.postRunnable(n21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
