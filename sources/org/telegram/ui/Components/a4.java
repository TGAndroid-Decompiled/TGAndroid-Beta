package org.telegram.ui.Components;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public final class a4 extends EditTextBoldCursor {
    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }
}
