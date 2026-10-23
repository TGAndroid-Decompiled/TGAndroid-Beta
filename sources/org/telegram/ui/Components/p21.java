package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class p21 implements TextWatcher {
    public final q21 f29407a;

    public p21(q21 q21Var) {
        this.f29407a = q21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f29407a.f29762b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f29407a.f29761a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f29407a.f29761a.animate();
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
        String obj = this.f29407a.f29762b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.f29407a.f29763c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f29407a.f29763c.f24546c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f29407a.f29763c;
            if (adapter != editorAlert.f24548n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f29407a.f29763c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f29407a.f29763c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f29407a.f29763c;
                editorAlert2.f24546c.setAdapter(editorAlert2.f24548n);
                this.f29407a.f29763c.f24548n.l();
                if (J > 0) {
                    this.f29407a.f29763c.h.h1(0, -J);
                }
            }
        }
        m21 m21Var = this.f29407a.f29763c.f24549r;
        if (m21Var != null && !obj.equals(m21Var.f28484n)) {
            m21Var.f28484n = obj;
            if (m21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(m21Var.h);
                m21Var.h = null;
            }
            if (obj.length() == 0) {
                m21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = m21Var.f28485r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                m21Var.d = -1;
                m21Var.l();
                return;
            }
            int i10 = m21Var.d + 1;
            m21Var.d = i10;
            m21Var.h = new org.telegram.ui.h4(m21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(m21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
