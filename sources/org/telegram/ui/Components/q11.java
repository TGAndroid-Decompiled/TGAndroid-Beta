package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class q11 extends vl0 {
    public final ThemeEditorView.EditorAlert X2;

    public q11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.X2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
