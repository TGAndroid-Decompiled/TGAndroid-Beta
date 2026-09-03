package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class r11 implements TextWatcher {
    public final s11 f30617a;

    public r11(s11 s11Var) {
        this.f30617a = s11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        float f10;
        if (this.f30617a.f30959b.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (this.f30617a.f30958a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 != z10) {
            ViewPropertyAnimator animate = this.f30617a.f30958a.animate();
            float f12 = 1.0f;
            if (z4) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f10);
            if (!z4) {
                f12 = 0.1f;
            }
            scaleX.scaleY(f12).start();
        }
        String obj = this.f30617a.f30959b.getText().toString();
        if (obj.length() != 0) {
            oz ozVar = this.f30617a.f30960c.f25068e;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.f30617a.f30960c.f25067c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f30617a.f30960c;
            if (adapter != editorAlert.f25070n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.f30617a.f30960c.f25068e.setText(LocaleController.getString(R.string.NoChats));
                this.f30617a.f30960c.f25068e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f30617a.f30960c;
                editorAlert2.f25067c.setAdapter(editorAlert2.f25070n);
                this.f30617a.f30960c.f25070n.l();
                if (I > 0) {
                    this.f30617a.f30960c.h.h1(0, -I);
                }
            }
        }
        o11 o11Var = this.f30617a.f30960c.f25071r;
        if (o11Var != null && !obj.equals(o11Var.f29639n)) {
            o11Var.f29639n = obj;
            if (o11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(o11Var.h);
                o11Var.h = null;
            }
            if (obj.length() == 0) {
                o11Var.f29637e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = o11Var.f29640r;
                editorAlert3.C = ThemeEditorView.EditorAlert.I(editorAlert3);
                o11Var.d = -1;
                o11Var.l();
                return;
            }
            int i10 = o11Var.d + 1;
            o11Var.d = i10;
            o11Var.h = new gy(o11Var, obj, i10, 20);
            Utilities.searchQueue.postRunnable(o11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
