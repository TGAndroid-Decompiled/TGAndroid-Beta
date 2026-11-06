package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class iz0 extends pj0 {
    public final ThemeEditorView.EditorAlert f34837e3;

    public iz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f34837e3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f34837e3.f31586v1 + org.telegram.messenger.g0.f22531m) {
            return true;
        }
        return false;
    }
}
