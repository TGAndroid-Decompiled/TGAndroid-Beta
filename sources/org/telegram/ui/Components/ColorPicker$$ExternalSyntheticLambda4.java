package org.telegram.ui.Components;

import android.view.View;

public final class ColorPicker$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;

    public ColorPicker$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ColorPicker.lambda$new$4(view);
                break;
            case 1:
                AudioPlayerAlert.lambda$new$7(view);
                break;
            case 2:
                CustomPhoneKeyboardView.lambda$new$3(view);
                break;
            case 3:
                FragmentContextView.lambda$checkCreateView$2(view);
                break;
            default:
                PipVideoOverlay.dismissAndDestroy();
                break;
        }
    }
}
