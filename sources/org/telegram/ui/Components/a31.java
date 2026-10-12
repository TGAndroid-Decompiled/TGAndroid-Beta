package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class a31 implements TextWatcher {
    public final b31 f24228a;

    public a31(b31 b31Var) {
        this.f24228a = b31Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f24228a.f24551b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f24228a.f24550a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f24228a.f24550a.animate();
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
        String obj = this.f24228a.f24551b.getText().toString();
        if (obj.length() != 0) {
            f00 f00Var = this.f24228a.f24552c.f24140e;
            if (f00Var != null) {
                f00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f24228a.f24552c.f24139c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f24228a.f24552c;
            if (adapter != editorAlert.f24142n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f24228a.f24552c.f24140e.setText(LocaleController.getString(R.string.NoChats));
                this.f24228a.f24552c.f24140e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f24228a.f24552c;
                editorAlert2.f24139c.setAdapter(editorAlert2.f24142n);
                this.f24228a.f24552c.f24142n.l();
                if (K > 0) {
                    this.f24228a.f24552c.h.h1(0, -K);
                }
            }
        }
        x21 x21Var = this.f24228a.f24552c.f24143r;
        if (x21Var != null && !obj.equals(x21Var.f32626n)) {
            x21Var.f32626n = obj;
            if (x21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(x21Var.h);
                x21Var.h = null;
            }
            if (obj.length() == 0) {
                x21Var.f32624e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = x21Var.f32627r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                x21Var.d = -1;
                x21Var.l();
                return;
            }
            int i10 = x21Var.d + 1;
            x21Var.d = i10;
            x21Var.h = new bl(x21Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(x21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
