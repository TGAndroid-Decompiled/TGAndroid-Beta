package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;
public final class lz0 extends uj0 {
    public final ThemeEditorView.EditorAlert f37018f3;

    public lz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f37018f3 = editorAlert;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(48.0f) + this.f37018f3.f32773z1 + org.telegram.messenger.g0.f23605m) {
            return true;
        }
        return false;
    }
}
