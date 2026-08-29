package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class g11 implements TextWatcher {
    public final h11 f28710a;

    public g11(h11 h11Var) {
        this.f28710a = h11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f9;
        if (this.f28710a.f29033b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f28710a.f29032a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f28710a.f29032a.animate();
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.1f;
            }
            ViewPropertyAnimator scaleX = duration.scaleX(f9);
            if (!z10) {
                f11 = 0.1f;
            }
            scaleX.scaleY(f11).start();
        }
        String obj = this.f28710a.f29033b.getText().toString();
        if (obj.length() != 0) {
            hz hzVar = this.f28710a.f29034c.f26578e;
            if (hzVar != null) {
                hzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.f28710a.f29034c.f26577c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f28710a.f29034c;
            if (adapter != editorAlert.f26580n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.f28710a.f29034c.f26578e.setText(LocaleController.getString(R.string.NoChats));
                this.f28710a.f29034c.f26578e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f28710a.f29034c;
                editorAlert2.f26577c.setAdapter(editorAlert2.f26580n);
                this.f28710a.f29034c.f26580n.l();
                if (I > 0) {
                    this.f28710a.f29034c.h.h1(0, -I);
                }
            }
        }
        d11 d11Var = this.f28710a.f29034c.f26581r;
        if (d11Var != null && !obj.equals(d11Var.f27637n)) {
            d11Var.f27637n = obj;
            if (d11Var.h != null) {
                Utilities.searchQueue.cancelRunnable(d11Var.h);
                d11Var.h = null;
            }
            if (obj.length() == 0) {
                d11Var.f27635e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = d11Var.f27638r;
                editorAlert3.B = ThemeEditorView.EditorAlert.I(editorAlert3);
                d11Var.d = -1;
                d11Var.l();
                return;
            }
            int i10 = d11Var.d + 1;
            d11Var.d = i10;
            d11Var.h = new rm(d11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(d11Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
