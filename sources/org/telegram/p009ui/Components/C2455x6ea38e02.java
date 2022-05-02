package org.telegram.p009ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.p009ui.Components.ThemeEditorView;

public final class C2455x6ea38e02 implements TextView.OnEditorActionListener {
    public static final C2455x6ea38e02 INSTANCE = new C2455x6ea38e02();

    private C2455x6ea38e02() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean lambda$new$0;
        lambda$new$0 = ThemeEditorView.EditorAlert.ColorPicker.lambda$new$0(textView, i, keyEvent);
        return lambda$new$0;
    }
}
