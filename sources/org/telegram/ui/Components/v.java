package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ThemeEditorView;
public final class v extends i49 {
    public final ThemeEditorView.EditorAlert a;

    public v(ThemeEditorView.EditorAlert editorAlert) {
        this.a = editorAlert;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = ThemeEditorView.EditorAlert.G1;
        this.a.G0();
    }
}
