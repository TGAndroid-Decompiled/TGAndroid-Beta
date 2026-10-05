package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends zl0 {
    public final ThemeEditorView.EditorAlert f25238e3;

    public c21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f25238e3 = editorAlert;
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.f25238e3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
