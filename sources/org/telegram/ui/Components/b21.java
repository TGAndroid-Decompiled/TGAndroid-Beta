package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class b21 extends zl0 {
    public final ThemeEditorView.EditorAlert f24776e3;

    public b21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f24776e3 = editorAlert;
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= AndroidUtilities.dp(48.0f) + this.f24776e3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }
}
