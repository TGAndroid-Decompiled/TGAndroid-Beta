package org.telegram.p009ui.Components.Paint;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.p009ui.Components.Paint.ColorPickerBottomSheet;

public final class ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    public static final ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1 INSTANCE = new ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1();

    private ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean lambda$new$1;
        lambda$new$1 = ColorPickerBottomSheet.SliderCell.lambda$new$1(textView, i, keyEvent);
        return lambda$new$1;
    }
}
