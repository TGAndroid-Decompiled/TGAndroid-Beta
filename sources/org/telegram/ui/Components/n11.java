package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n11 implements TextWatcher {
    public final o11 f26323a;

    public n11(o11 o11Var) {
        this.f26323a = o11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f26323a.f26571b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f26323a.f26570a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f26323a.f26570a.animate();
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
        String obj = this.f26323a.f26571b.getText().toString();
        if (obj.length() != 0) {
            nz nzVar = this.f26323a.f26572c.e;
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f26323a.f26572c.f22191c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f26323a.f26572c;
            if (adapter != editorAlert.f22193n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f26323a.f26572c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f26323a.f26572c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f26323a.f26572c;
                editorAlert2.f22191c.setAdapter(editorAlert2.f22193n);
                this.f26323a.f26572c.f22193n.l();
                if (J > 0) {
                    this.f26323a.f26572c.h.h1(0, -J);
                }
            }
        }
        k11 k11Var = this.f26323a.f26572c.f22194r;
        if (k11Var != null && !obj.equals(k11Var.f25461n)) {
            k11Var.f25461n = obj;
            if (k11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(k11Var.h);
                k11Var.h = null;
            }
            if (obj.length() == 0) {
                k11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = k11Var.f25462r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                k11Var.d = -1;
                k11Var.l();
                return;
            }
            int i10 = k11Var.d + 1;
            k11Var.d = i10;
            k11Var.h = new xm(k11Var, obj, i10, 22);
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
