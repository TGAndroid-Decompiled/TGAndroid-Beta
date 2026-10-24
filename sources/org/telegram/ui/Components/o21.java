package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class o21 implements TextWatcher {
    public final p21 f29137a;

    public o21(p21 p21Var) {
        this.f29137a = p21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        float f7;
        if (this.f29137a.f29456b.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (this.f29137a.f29455a.getAlpha() != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ViewPropertyAnimator animate = this.f29137a.f29455a.animate();
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
        String obj = this.f29137a.f29456b.getText().toString();
        if (obj.length() != 0) {
            tz tzVar = this.f29137a.f29457c.e;
            if (tzVar != null) {
                tzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.f29137a.f29457c.f24547c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f29137a.f29457c;
            if (adapter != editorAlert.f24549n) {
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f29137a.f29457c.e.setText(LocaleController.getString(R.string.NoChats));
                this.f29137a.f29457c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f29137a.f29457c;
                editorAlert2.f24547c.setAdapter(editorAlert2.f24549n);
                this.f29137a.f29457c.f24549n.l();
                if (J > 0) {
                    this.f29137a.f29457c.h.h1(0, -J);
                }
            }
        }
        l21 l21Var = this.f29137a.f29457c.f24550r;
        if (l21Var != null && !obj.equals(l21Var.f28147n)) {
            l21Var.f28147n = obj;
            if (l21Var.h != null) {
                Utilities.searchQueue.cancelRunnable(l21Var.h);
                l21Var.h = null;
            }
            if (obj.length() == 0) {
                l21Var.e.clear();
                ThemeEditorView.EditorAlert editorAlert3 = l21Var.f28148r;
                editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
                l21Var.d = -1;
                l21Var.l();
                return;
            }
            int i10 = l21Var.d + 1;
            l21Var.d = i10;
            l21Var.h = new org.telegram.ui.h4(l21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(l21Var.h, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
