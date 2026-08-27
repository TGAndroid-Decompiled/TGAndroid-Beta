package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class w01 implements TextWatcher {

    public final x01 f34087a;

    public w01(x01 x01Var) {
        this.f34087a = x01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.f34087a.f34413b.length() > 0;
        if (z10 != (this.f34087a.f34412a.getAlpha() != 0.0f)) {
            this.f34087a.f34412a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String string = this.f34087a.f34413b.getText().toString();
        if (string.length() != 0) {
            az azVar = this.f34087a.f34414c.f26563e;
            if (azVar != null) {
                azVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.q0 adapter = this.f34087a.f34414c.f26562c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.f34087a.f34414c;
            if (adapter != editorAlert.f26565n) {
                int iJ = ThemeEditorView.EditorAlert.J(editorAlert);
                this.f34087a.f34414c.f26563e.setText(LocaleController.getString(R.string.NoChats));
                this.f34087a.f34414c.f26563e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.f34087a.f34414c;
                editorAlert2.f26562c.setAdapter(editorAlert2.f26565n);
                this.f34087a.f34414c.f26565n.l();
                if (iJ > 0) {
                    this.f34087a.f34414c.h.h1(0, -iJ);
                }
            }
        }
        t01 t01Var = this.f34087a.f34414c.f26566r;
        if (t01Var == null || string.equals(t01Var.f32610n)) {
            return;
        }
        t01Var.f32610n = string;
        if (t01Var.h != null) {
            Utilities.searchQueue.cancelRunnable(t01Var.h);
            t01Var.h = null;
        }
        if (string.length() != 0) {
            int i10 = t01Var.d + 1;
            t01Var.d = i10;
            t01Var.h = new km(t01Var, string, i10, 22);
            Utilities.searchQueue.postRunnable(t01Var.h, 300L);
            return;
        }
        t01Var.f32608e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = t01Var.f32611r;
        editorAlert3.B = ThemeEditorView.EditorAlert.J(editorAlert3);
        t01Var.d = -1;
        t01Var.l();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
