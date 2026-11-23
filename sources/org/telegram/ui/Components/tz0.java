package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class tz0 extends ek0 {
    public final ThemeEditorView.EditorAlert f40201f3;

    public tz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f40201f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f40201f3.f33270z1 + org.telegram.messenger.g0.f24220m) {
            return true;
        }
        return false;
    }
}
