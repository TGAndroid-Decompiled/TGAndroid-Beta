package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class j01 extends wk0 {
    public final ThemeEditorView.EditorAlert T2;

    public j01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= AndroidUtilities.dp(48.0f) + this.T2.A + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
