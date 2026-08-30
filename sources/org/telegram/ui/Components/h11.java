package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ThemeEditorView;
public final class h11 extends f2.z0 {
    public final ThemeEditorView.EditorAlert f25312a;

    public h11(ThemeEditorView.EditorAlert editorAlert) {
        this.f25312a = editorAlert;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ThemeEditorView.EditorAlert.s(this.f25312a);
    }
}
