package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class kz0 extends qj0 {
    public final ThemeEditorView.EditorAlert f35527e3;

    public kz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f35527e3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f35527e3.f31596v1 + org.telegram.messenger.g0.f22557m) {
            return true;
        }
        return false;
    }
}
