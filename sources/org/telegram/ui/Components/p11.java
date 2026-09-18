package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class p11 implements TextWatcher {
    public final q11 f26914a;

    public p11(q11 q11Var) {
        this.f26914a = q11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f26914a.f27194b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f26914a.f27193a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f26914a.f27193a.animate();
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
        String obj = this.f26914a.f27194b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f26914a.f27195c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26914a.f27195c.f22233c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f26914a.f27195c;
            if (adapter != editorAlert.f22235n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f26914a.f27195c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f26914a.f27195c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f26914a.f27195c;
                editorAlert2.f22233c.setAdapter(editorAlert2.f22235n);
                this.f26914a.f27195c.f22235n.l();
                if (J > 0) {
                    this.f26914a.f27195c.h.h1(0, -J);
                }
            }
        }
        m11 m11Var = this.f26914a.f27195c.f22236r;
        if (m11Var != null && !obj.equals(m11Var.f26011n)) {
            m11Var.f26011n = obj;
            if (m11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(m11Var.h);
                m11Var.h = null;
            }
            if (obj.length() == 0) {
                m11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = m11Var.f26012r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                m11Var.d = -1;
                m11Var.l();
                return;
            }
            int i10 = m11Var.d + 1;
            m11Var.d = i10;
            m11Var.h = new wm(m11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(m11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
