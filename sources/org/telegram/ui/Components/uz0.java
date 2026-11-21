package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class uz0 extends ek0 {
    public final ThemeEditorView.EditorAlert f40619f3;

    public uz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f40619f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f40619f3.f33203z1 + org.telegram.messenger.g0.f24140m) {
            return true;
        }
        return false;
    }
}
