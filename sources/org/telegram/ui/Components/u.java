package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class u extends o39 {
    public final ThemeEditorView.EditorAlert f3;

    public u(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f3 = editorAlert;
    }

    @Override
    public final boolean F0(float f) {
        if (f >= gl.L(48.0f) + this.f3.y1 + gl.m) {
            return true;
        }
        return false;
    }
}
