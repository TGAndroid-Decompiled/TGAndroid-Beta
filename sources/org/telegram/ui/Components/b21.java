package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class b21 implements TextWatcher {
    public final c21 f22846a;

    public b21(c21 c21Var) {
        this.f22846a = c21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f22846a.f23137b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f22846a.f23136a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f22846a.f23136a.animate();
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
        String obj = this.f22846a.f23137b.getText().toString();
        if (obj.length() != 0) {
            nz nzVar = this.f22846a.f23138c.e;
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f22846a.f23138c.f22428c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f22846a.f23138c;
            if (adapter != editorAlert.f22430n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f22846a.f23138c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f22846a.f23138c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f22846a.f23138c;
                editorAlert2.f22428c.setAdapter(editorAlert2.f22430n);
                this.f22846a.f23138c.f22430n.l();
                if (J > 0) {
                    this.f22846a.f23138c.h.h1(0, -J);
                }
            }
        }
        y11 y11Var = this.f22846a.f23138c.f22431r;
        if (y11Var != null && !obj.equals(y11Var.f30466n)) {
            y11Var.f30466n = obj;
            if (y11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(y11Var.h);
                y11Var.h = null;
            }
            if (obj.length() == 0) {
                y11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = y11Var.f30467r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                y11Var.d = -1;
                y11Var.l();
                return;
            }
            int i10 = y11Var.d + 1;
            y11Var.d = i10;
            y11Var.h = new xm(y11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(y11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
