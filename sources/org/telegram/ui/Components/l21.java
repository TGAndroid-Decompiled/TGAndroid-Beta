package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class l21 implements TextWatcher {
    public final m21 f28060a;

    public l21(m21 m21Var) {
        this.f28060a = m21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f28060a.f28367b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28060a.f28366a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28060a.f28366a.animate();
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
        String obj = this.f28060a.f28367b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.f28060a.f28368c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f28060a.f28368c.f24395c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28060a.f28368c;
            if (adapter != editorAlert.f24397n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.f28060a.f28368c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f28060a.f28368c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28060a.f28368c;
                editorAlert2.f24395c.setAdapter(editorAlert2.f24397n);
                this.f28060a.f28368c.f24397n.l();
                if (K > 0) {
                    this.f28060a.f28368c.h.h1(0, -K);
                }
            }
        }
        i21 i21Var = this.f28060a.f28368c.f24398r;
        if (i21Var != null && !obj.equals(i21Var.f27046n)) {
            i21Var.f27046n = obj;
            if (i21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(i21Var.h);
                i21Var.h = null;
            }
            if (obj.length() == 0) {
                i21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = i21Var.f27047r;
                editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
                i21Var.d = -1;
                i21Var.l();
                return;
            }
            int i10 = i21Var.d + 1;
            i21Var.d = i10;
            i21Var.h = new org.telegram.ui.i4(i21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(i21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
