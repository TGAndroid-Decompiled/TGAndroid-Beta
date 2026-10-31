package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class n01 extends tk0 {
    public final ThemeEditorView.EditorAlert f28650e3;

    public n01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f28650e3 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= org.telegram.messenger.i0.L(48.0f) + this.f28650e3.f24232v1 + org.telegram.messenger.i0.f16020m) {
            return true;
        }
        return false;
    }
}
