package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class s11 extends wl0 {
    public final ThemeEditorView.EditorAlert X2;

    public s11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.X2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
