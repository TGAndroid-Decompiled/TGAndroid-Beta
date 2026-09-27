package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 implements TextWatcher {
    public final e21 f23493a;

    public d21(e21 e21Var) {
        this.f23493a = e21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f23493a.f23856b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f23493a.f23855a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f23493a.f23855a.animate();
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
        String obj = this.f23493a.f23856b.getText().toString();
        if (obj.length() != 0) {
            oz ozVar = this.f23493a.f23857c.e;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f23493a.f23857c.f22445c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f23493a.f23857c;
            if (adapter != editorAlert.f22447n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f23493a.f23857c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f23493a.f23857c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f23493a.f23857c;
                editorAlert2.f22445c.setAdapter(editorAlert2.f22447n);
                this.f23493a.f23857c.f22447n.l();
                if (J > 0) {
                    this.f23493a.f23857c.h.h1(0, -J);
                }
            }
        }
        a21 a21Var = this.f23493a.f23857c.f22448r;
        if (a21Var != null && !obj.equals(a21Var.f22523n)) {
            a21Var.f22523n = obj;
            if (a21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(a21Var.h);
                a21Var.h = null;
            }
            if (obj.length() == 0) {
                a21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = a21Var.f22524r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                a21Var.d = -1;
                a21Var.l();
                return;
            }
            int i10 = a21Var.d + 1;
            a21Var.d = i10;
            a21Var.h = new ym(a21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(a21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
