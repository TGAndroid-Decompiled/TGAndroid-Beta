package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 implements TextWatcher {
    public final e21 f23404a;

    public d21(e21 e21Var) {
        this.f23404a = e21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f23404a.f23767b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f23404a.f23766a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f23404a.f23766a.animate();
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
        String obj = this.f23404a.f23767b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f23404a.f23768c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f23404a.f23768c.f22406c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f23404a.f23768c;
            if (adapter != editorAlert.f22408n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f23404a.f23768c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f23404a.f23768c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f23404a.f23768c;
                editorAlert2.f22406c.setAdapter(editorAlert2.f22408n);
                this.f23404a.f23768c.f22408n.l();
                if (J > 0) {
                    this.f23404a.f23768c.h.h1(0, -J);
                }
            }
        }
        a21 a21Var = this.f23404a.f23768c.f22409r;
        if (a21Var != null && !obj.equals(a21Var.f22471n)) {
            a21Var.f22471n = obj;
            if (a21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(a21Var.h);
                a21Var.h = null;
            }
            if (obj.length() == 0) {
                a21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = a21Var.f22472r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                a21Var.d = -1;
                a21Var.l();
                return;
            }
            int i10 = a21Var.d + 1;
            a21Var.d = i10;
            a21Var.h = new wm(a21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(a21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
