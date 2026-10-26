package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class x21 implements TextWatcher {
    public final y21 f34599a;

    public x21(y21 y21Var) {
        this.f34599a = y21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f34599a.f34915b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f34599a.f34914a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f34599a.f34914a.animate();
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
        String obj = this.f34599a.f34915b.getText().toString();
        if (obj.length() != 0) {
            uz uzVar = this.f34599a.f34916c.e;
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f34599a.f34916c.f26339c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f34599a.f34916c;
            if (adapter != editorAlert.f26341n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f34599a.f34916c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f34599a.f34916c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f34599a.f34916c;
                editorAlert2.f26339c.setAdapter(editorAlert2.f26341n);
                this.f34599a.f34916c.f26341n.l();
                if (J > 0) {
                    this.f34599a.f34916c.h.h1(0, -J);
                }
            }
        }
        u21 u21Var = this.f34599a.f34916c.f26342r;
        if (u21Var != null && !obj.equals(u21Var.f33232n)) {
            u21Var.f33232n = obj;
            if (u21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(u21Var.h);
                u21Var.h = null;
            }
            if (obj.length() == 0) {
                u21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = u21Var.f33233r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                u21Var.d = -1;
                u21Var.l();
                return;
            }
            int i10 = u21Var.d + 1;
            u21Var.d = i10;
            u21Var.h = new org.telegram.ui.g4(u21Var, obj, i10, 26);
            Utilities.searchQueue.postRunnable(u21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
