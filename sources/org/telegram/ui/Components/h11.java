package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends tl0 {
    public final ThemeEditorView.EditorAlert U2;

    public h11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.U2 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= AndroidUtilities.dp(48.0f) + this.U2.B + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
