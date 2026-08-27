package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class l01 extends zk0 {
    public final ThemeEditorView.EditorAlert T2;

    public l01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.T2.A) + AndroidUtilities.statusBarHeight));
    }
}
