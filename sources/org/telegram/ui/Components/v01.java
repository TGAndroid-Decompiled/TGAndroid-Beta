package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class v01 extends jl0 {
    public final ThemeEditorView.EditorAlert T2;

    public v01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override
    public final boolean E0(float f9) {
        if (f9 >= AndroidUtilities.dp(48.0f) + this.T2.A + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
