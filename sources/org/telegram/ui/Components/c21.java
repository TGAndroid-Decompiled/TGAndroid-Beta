package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 implements TextWatcher {
    public final d21 f23132a;

    public c21(d21 d21Var) {
        this.f23132a = d21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f23132a.f23471b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f23132a.f23470a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f23132a.f23470a.animate();
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
        String obj = this.f23132a.f23471b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f23132a.f23472c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f23132a.f23472c.f22441c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f23132a.f23472c;
            if (adapter != editorAlert.f22443n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f23132a.f23472c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f23132a.f23472c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f23132a.f23472c;
                editorAlert2.f22441c.setAdapter(editorAlert2.f22443n);
                this.f23132a.f23472c.f22443n.l();
                if (J > 0) {
                    this.f23132a.f23472c.h.h1(0, -J);
                }
            }
        }
        z11 z11Var = this.f23132a.f23472c.f22444r;
        if (z11Var != null && !obj.equals(z11Var.f30668n)) {
            z11Var.f30668n = obj;
            if (z11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(z11Var.h);
                z11Var.h = null;
            }
            if (obj.length() == 0) {
                z11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = z11Var.f30669r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                z11Var.d = -1;
                z11Var.l();
                return;
            }
            int i10 = z11Var.d + 1;
            z11Var.d = i10;
            z11Var.h = new wm(z11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(z11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
