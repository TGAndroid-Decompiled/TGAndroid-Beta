package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class s11 implements TextWatcher {
    public final t11 f30943a;

    public s11(t11 t11Var) {
        this.f30943a = t11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        float f10;
        if (this.f30943a.f31235b.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (this.f30943a.f31234a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 != z10) {
            ViewPropertyAnimator animate = this.f30943a.f31234a.animate();
            float f12 = 1.0f;
            if (z4) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f10);
            if (!z4) {
                f12 = 0.1f;
            }
            scaleX.scaleY(f12).start();
        }
        String obj = this.f30943a.f31235b.getText().toString();
        if (obj.length() != 0) {
            oz ozVar = this.f30943a.f31236c.f25066e;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.f30943a.f31236c.f25065c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f30943a.f31236c;
            if (adapter != editorAlert.f25068n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.f30943a.f31236c.f25066e.setText(LocaleController.getString(R.string.NoChats));
                this.f30943a.f31236c.f25066e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f30943a.f31236c;
                editorAlert2.f25065c.setAdapter(editorAlert2.f25068n);
                this.f30943a.f31236c.f25068n.l();
                if (I > 0) {
                    this.f30943a.f31236c.h.h1(0, -I);
                }
            }
        }
        p11 p11Var = this.f30943a.f31236c.f25069r;
        if (p11Var != null && !obj.equals(p11Var.f29929n)) {
            p11Var.f29929n = obj;
            if (p11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(p11Var.h);
                p11Var.h = null;
            }
            if (obj.length() == 0) {
                p11Var.f29927e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = p11Var.f29930r;
                editorAlert3.C = ThemeEditorView.EditorAlert.I(editorAlert3);
                p11Var.d = -1;
                p11Var.l();
                return;
            }
            int i10 = p11Var.d + 1;
            p11Var.d = i10;
            p11Var.h = new gy(p11Var, obj, i10, 20);
            Utilities.searchQueue.postRunnable(p11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
