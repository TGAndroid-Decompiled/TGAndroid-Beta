package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class w21 implements TextWatcher {
    public final x21 f32560a;

    public w21(x21 x21Var) {
        this.f32560a = x21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f32560a.f32810b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f32560a.f32809a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f32560a.f32809a.animate();
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
        String obj = this.f32560a.f32810b.getText().toString();
        if (obj.length() != 0) {
            d00 d00Var = this.f32560a.f32811c.f24354e;
            if (d00Var != null) {
                d00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f32560a.f32811c.f24353c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f32560a.f32811c;
            if (adapter != editorAlert.f24356n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f32560a.f32811c.f24354e.setText(LocaleController.getString(R.string.NoChats));
                this.f32560a.f32811c.f24354e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f32560a.f32811c;
                editorAlert2.f24353c.setAdapter(editorAlert2.f24356n);
                this.f32560a.f32811c.f24356n.l();
                if (K > 0) {
                    this.f32560a.f32811c.h.h1(0, -K);
                }
            }
        }
        t21 t21Var = this.f32560a.f32811c.f24357r;
        if (t21Var != null && !obj.equals(t21Var.f30972n)) {
            t21Var.f30972n = obj;
            if (t21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(t21Var.h);
                t21Var.h = null;
            }
            if (obj.length() == 0) {
                t21Var.f30970e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = t21Var.f30973r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                t21Var.d = -1;
                t21Var.l();
                return;
            }
            int i10 = t21Var.d + 1;
            t21Var.d = i10;
            t21Var.h = new zk(t21Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(t21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
