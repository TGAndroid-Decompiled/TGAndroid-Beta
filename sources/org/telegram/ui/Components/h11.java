package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends f2.a1 {
    public final ThemeEditorView.EditorAlert f27330a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f27330a = editorAlert;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ThemeEditorView.EditorAlert.s(this.f27330a);
    }
}
