package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class r11 implements TextWatcher {
    public final s11 f28378a;

    public r11(s11 s11Var) {
        this.f28378a = s11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        float f10;
        if (this.f28378a.f28640b.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (this.f28378a.f28639a.getAlpha() != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 != z10) {
            ViewPropertyAnimator animate = this.f28378a.f28639a.animate();
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
        String obj = this.f28378a.f28640b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f28378a.f28641c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.o0 adapter = this.f28378a.f28641c.f23177c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28378a.f28641c;
            if (adapter != editorAlert.f23179n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.f28378a.f28641c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28378a.f28641c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28378a.f28641c;
                editorAlert2.f23177c.setAdapter(editorAlert2.f23179n);
                this.f28378a.f28641c.f23179n.l();
                if (I > 0) {
                    this.f28378a.f28641c.h.h1(0, -I);
                }
            }
        }
        o11 o11Var = this.f28378a.f28641c.f23180r;
        if (o11Var != null && !obj.equals(o11Var.f27432n)) {
            o11Var.f27432n = obj;
            if (o11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(o11Var.h);
                o11Var.h = null;
            }
            if (obj.length() == 0) {
                o11Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = o11Var.f27433r;
                editorAlert3.C = ThemeEditorView.EditorAlert.I(editorAlert3);
                o11Var.d = -1;
                o11Var.l();
                return;
            }
            int i10 = o11Var.d + 1;
            o11Var.d = i10;
            o11Var.h = new ey(o11Var, obj, i10, 20);
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
