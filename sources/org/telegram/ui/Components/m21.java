package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class m21 extends mm0 {
    public final ThemeEditorView.EditorAlert f30372f3;

    public m21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f30372f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.f30372f3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
