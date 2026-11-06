package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class jz0 extends pj0 {
    public final ThemeEditorView.EditorAlert f35118e3;

    public jz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f35118e3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f35118e3.f31587v1 + org.telegram.messenger.g0.f22538m) {
            return true;
        }
        return false;
    }
}
