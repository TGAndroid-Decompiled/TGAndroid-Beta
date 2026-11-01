package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class o01 extends uk0 {
    public final ThemeEditorView.EditorAlert f28996e3;

    public o01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f28996e3 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= org.telegram.messenger.i0.L(48.0f) + this.f28996e3.f24233v1 + org.telegram.messenger.i0.f16166m) {
            return true;
        }
        return false;
    }
}
