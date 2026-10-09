package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i21 extends qm0 {
    public final ThemeEditorView.EditorAlert V2;

    public i21(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
