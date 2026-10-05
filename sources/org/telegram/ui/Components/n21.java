package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n21 implements TextWatcher {
    public final o21 f28954a;

    public n21(o21 o21Var) {
        this.f28954a = o21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28954a.f29323b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28954a.f29322a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28954a.f29322a.animate();
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
        String obj = this.f28954a.f29323b.getText().toString();
        if (obj.length() != 0) {
            pz pzVar = this.f28954a.f29324c.f24367e;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f28954a.f29324c.f24366c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28954a.f29324c;
            if (adapter != editorAlert.f24369n) {
                int H = ThemeEditorView.EditorAlert.H(editorAlert);
                this.f28954a.f29324c.f24367e.setText(LocaleController.getString(R.string.NoChats));
                this.f28954a.f29324c.f24367e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28954a.f29324c;
                editorAlert2.f24366c.setAdapter(editorAlert2.f24369n);
                this.f28954a.f29324c.f24369n.l();
                if (H > 0) {
                    this.f28954a.f29324c.h.h1(0, -H);
                }
            }
        }
        k21 k21Var = this.f28954a.f29324c.f24370r;
        if (k21Var != null && !obj.equals(k21Var.f28038n)) {
            k21Var.f28038n = obj;
            if (k21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(k21Var.h);
                k21Var.h = null;
            }
            if (obj.length() == 0) {
                k21Var.f28036e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = k21Var.f28039r;
                editorAlert3.F = ThemeEditorView.EditorAlert.H(editorAlert3);
                k21Var.d = -1;
                k21Var.l();
                return;
            }
            int i10 = k21Var.d + 1;
            k21Var.d = i10;
            k21Var.h = new zm(k21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(k21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
