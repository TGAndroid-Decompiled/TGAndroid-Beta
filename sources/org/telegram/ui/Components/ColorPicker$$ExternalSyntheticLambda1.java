package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;

public final class ColorPicker$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    public final int $r8$classId;

    public ColorPicker$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ColorPicker.lambda$new$1(textView, i, keyEvent);
            case 1:
                return ThemeEditorView.EditorAlert.ColorPicker.lambda$new$0(textView, i, keyEvent);
            default:
                return AlertsCreator.lambda$createThemeCreateDialog$238(textView, i, keyEvent);
        }
    }
}
