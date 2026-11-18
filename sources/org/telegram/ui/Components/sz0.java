package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class sz0 extends ck0 {
    public final ThemeEditorView.EditorAlert f39869f3;

    public sz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f39869f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f39869f3.f33170z1 + org.telegram.messenger.g0.f24115m) {
            return true;
        }
        return false;
    }
}
