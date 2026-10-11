package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class k21 extends sm0 {
    public final ThemeEditorView.EditorAlert V2;

    public k21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.V2 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.V2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
