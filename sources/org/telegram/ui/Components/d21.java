package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends lm0 {
    public final ThemeEditorView.EditorAlert Y2;

    public d21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.Y2 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.Y2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
