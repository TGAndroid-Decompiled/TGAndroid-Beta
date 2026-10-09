package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class t21 implements TextWatcher {
    public final u21 f30979a;

    public t21(u21 u21Var) {
        this.f30979a = u21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f30979a.f31348b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f30979a.f31347a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f30979a.f31347a.animate();
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
        String obj = this.f30979a.f31348b.getText().toString();
        if (obj.length() != 0) {
            c00 c00Var = this.f30979a.f31349c.f24362e;
            if (c00Var != null) {
                c00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f30979a.f31349c.f24361c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f30979a.f31349c;
            if (adapter != editorAlert.f24364n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f30979a.f31349c.f24362e.setText(LocaleController.getString(R.string.NoChats));
                this.f30979a.f31349c.f24362e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f30979a.f31349c;
                editorAlert2.f24361c.setAdapter(editorAlert2.f24364n);
                this.f30979a.f31349c.f24364n.l();
                if (K > 0) {
                    this.f30979a.f31349c.h.h1(0, -K);
                }
            }
        }
        q21 q21Var = this.f30979a.f31349c.f24365r;
        if (q21Var != null && !obj.equals(q21Var.f30005n)) {
            q21Var.f30005n = obj;
            if (q21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(q21Var.h);
                q21Var.h = null;
            }
            if (obj.length() == 0) {
                q21Var.f30003e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = q21Var.f30006r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                q21Var.d = -1;
                q21Var.l();
                return;
            }
            int i10 = q21Var.d + 1;
            q21Var.d = i10;
            q21Var.h = new zk(q21Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(q21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
