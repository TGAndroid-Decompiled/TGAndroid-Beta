package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class iz0 extends tj0 {
    public final ThemeEditorView.EditorAlert f34871f3;

    public iz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f34871f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f34871f3.f31665w1 + org.telegram.messenger.g0.f22602m) {
            return true;
        }
        return false;
    }
}
