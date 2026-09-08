package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n11 implements TextWatcher {
    public final o11 f28626a;

    public n11(o11 o11Var) {
        this.f28626a = o11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28626a.f28950b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28626a.f28949a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28626a.f28949a.animate();
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
        String obj = this.f28626a.f28950b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f28626a.f28951c.f24200e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f28626a.f28951c.f24199c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28626a.f28951c;
            if (adapter != editorAlert.f24202n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f28626a.f28951c.f24200e.setText(LocaleController.getString(R.string.NoChats));
                this.f28626a.f28951c.f24200e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28626a.f28951c;
                editorAlert2.f24199c.setAdapter(editorAlert2.f24202n);
                this.f28626a.f28951c.f24202n.l();
                if (J > 0) {
                    this.f28626a.f28951c.h.h1(0, -J);
                }
            }
        }
        k11 k11Var = this.f28626a.f28951c.f24203r;
        if (k11Var != null && !obj.equals(k11Var.f27674n)) {
            k11Var.f27674n = obj;
            if (k11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(k11Var.h);
                k11Var.h = null;
            }
            if (obj.length() == 0) {
                k11Var.f27672e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = k11Var.f27675r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                k11Var.d = -1;
                k11Var.l();
                return;
            }
            int i10 = k11Var.d + 1;
            k11Var.d = i10;
            k11Var.h = new org.telegram.ui.dm(k11Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(k11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
