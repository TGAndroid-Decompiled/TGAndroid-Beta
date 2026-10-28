package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class y21 implements TextWatcher {
    public final z21 f34951a;

    public y21(z21 z21Var) {
        this.f34951a = z21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f34951a.f35225b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f34951a.f35224a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f34951a.f35224a.animate();
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
        String obj = this.f34951a.f35225b.getText().toString();
        if (obj.length() != 0) {
            uz uzVar = this.f34951a.f35226c.e;
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f34951a.f35226c.f26341c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f34951a.f35226c;
            if (adapter != editorAlert.f26343n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f34951a.f35226c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f34951a.f35226c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f34951a.f35226c;
                editorAlert2.f26341c.setAdapter(editorAlert2.f26343n);
                this.f34951a.f35226c.f26343n.l();
                if (J > 0) {
                    this.f34951a.f35226c.h.h1(0, -J);
                }
            }
        }
        v21 v21Var = this.f34951a.f35226c.f26344r;
        if (v21Var != null && !obj.equals(v21Var.f33545n)) {
            v21Var.f33545n = obj;
            if (v21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(v21Var.h);
                v21Var.h = null;
            }
            if (obj.length() == 0) {
                v21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = v21Var.f33546r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                v21Var.d = -1;
                v21Var.l();
                return;
            }
            int i10 = v21Var.d + 1;
            v21Var.d = i10;
            v21Var.h = new org.telegram.ui.g4(v21Var, obj, i10, 26);
            Utilities.searchQueue.postRunnable(v21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
