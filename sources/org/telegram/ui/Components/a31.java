package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class a31 implements TextWatcher {
    public final b31 f24227a;

    public a31(b31 b31Var) {
        this.f24227a = b31Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f24227a.f24563b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f24227a.f24562a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f24227a.f24562a.animate();
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
        String obj = this.f24227a.f24563b.getText().toString();
        if (obj.length() != 0) {
            f00 f00Var = this.f24227a.f24564c.f24139e;
            if (f00Var != null) {
                f00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.f24227a.f24564c.f24138c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f24227a.f24564c;
            if (adapter != editorAlert.f24141n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f24227a.f24564c.f24139e.setText(LocaleController.getString(R.string.NoChats));
                this.f24227a.f24564c.f24139e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f24227a.f24564c;
                editorAlert2.f24138c.setAdapter(editorAlert2.f24141n);
                this.f24227a.f24564c.f24141n.l();
                if (K > 0) {
                    this.f24227a.f24564c.h.h1(0, -K);
                }
            }
        }
        x21 x21Var = this.f24227a.f24564c.f24142r;
        if (x21Var != null && !obj.equals(x21Var.f32627n)) {
            x21Var.f32627n = obj;
            if (x21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(x21Var.h);
                x21Var.h = null;
            }
            if (obj.length() == 0) {
                x21Var.f32625e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = x21Var.f32628r;
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
