package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class n21 extends nm0 {
    public final ThemeEditorView.EditorAlert f30727f3;

    public n21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f30727f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.f30727f3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
