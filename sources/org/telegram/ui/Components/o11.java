package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class o11 implements TextWatcher {
    public final p11 f26654a;

    public o11(p11 p11Var) {
        this.f26654a = p11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f26654a.f26928b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f26654a.f26927a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f26654a.f26927a.animate();
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
        String obj = this.f26654a.f26928b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f26654a.f26929c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26654a.f26929c.f22220c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f26654a.f26929c;
            if (adapter != editorAlert.f22222n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f26654a.f26929c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f26654a.f26929c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f26654a.f26929c;
                editorAlert2.f22220c.setAdapter(editorAlert2.f22222n);
                this.f26654a.f26929c.f22222n.l();
                if (J > 0) {
                    this.f26654a.f26929c.h.h1(0, -J);
                }
            }
        }
        l11 l11Var = this.f26654a.f26929c.f22223r;
        if (l11Var != null && !obj.equals(l11Var.f25804n)) {
            l11Var.f25804n = obj;
            if (l11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(l11Var.h);
                l11Var.h = null;
            }
            if (obj.length() == 0) {
                l11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = l11Var.f25805r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                l11Var.d = -1;
                l11Var.l();
                return;
            }
            int i10 = l11Var.d + 1;
            l11Var.d = i10;
            l11Var.h = new wm(l11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(l11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
