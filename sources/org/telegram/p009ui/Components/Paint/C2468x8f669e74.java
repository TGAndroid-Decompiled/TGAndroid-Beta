package org.telegram.p009ui.Components.Paint;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.p009ui.Components.Paint.ColorPickerBottomSheet;

public final class C2468x8f669e74 implements TextView.OnEditorActionListener {
    public static final C2468x8f669e74 INSTANCE = new C2468x8f669e74();

    private C2468x8f669e74() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean lambda$new$1;
        lambda$new$1 = ColorPickerBottomSheet.SlidersPickerView.lambda$new$1(textView, i, keyEvent);
        return lambda$new$1;
    }
}
