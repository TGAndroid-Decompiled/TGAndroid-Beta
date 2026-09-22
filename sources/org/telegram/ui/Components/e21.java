package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class e21 implements TextWatcher {
    public final f21 f23842a;

    public e21(f21 f21Var) {
        this.f23842a = f21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f23842a.f24087b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f23842a.f24086a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f23842a.f24086a.animate();
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
        String obj = this.f23842a.f24087b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.f23842a.f24088c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.f23842a.f24088c.f22457c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f23842a.f24088c;
            if (adapter != editorAlert.f22459n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f23842a.f24088c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f23842a.f24088c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f23842a.f24088c;
                editorAlert2.f22457c.setAdapter(editorAlert2.f22459n);
                this.f23842a.f24088c.f22459n.l();
                if (J > 0) {
                    this.f23842a.f24088c.h.h1(0, -J);
                }
            }
        }
        b21 b21Var = this.f23842a.f24088c.f22460r;
        if (b21Var != null && !obj.equals(b21Var.f22818n)) {
            b21Var.f22818n = obj;
            if (b21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(b21Var.h);
                b21Var.h = null;
            }
            if (obj.length() == 0) {
                b21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = b21Var.f22819r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                b21Var.d = -1;
                b21Var.l();
                return;
            }
            int i10 = b21Var.d + 1;
            b21Var.d = i10;
            b21Var.h = new wm(b21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(b21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
