package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public final class CustomPhoneKeyboardView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CustomPhoneKeyboardView f$0;

    public CustomPhoneKeyboardView$$ExternalSyntheticLambda0(CustomPhoneKeyboardView customPhoneKeyboardView, int i) {
        this.$r8$classId = i;
        this.f$0 = customPhoneKeyboardView;
    }

    @Override
    public final void run() {
        View view;
        switch (this.$r8$classId) {
            case 0:
                CustomPhoneKeyboardView customPhoneKeyboardView = this.f$0;
                if (customPhoneKeyboardView.editText == null && (view = customPhoneKeyboardView.viewToFindFocus) != null) {
                    View viewFindFocus = view.findFocus();
                    if (viewFindFocus instanceof EditText) {
                        customPhoneKeyboardView.editText = (EditText) viewFindFocus;
                    }
                }
                EditText editText = customPhoneKeyboardView.editText;
                if (editText != null) {
                    if (editText.length() != 0 || customPhoneKeyboardView.dispatchBackWhenEmpty) {
                        try {
                            customPhoneKeyboardView.performHapticFeedback(3, 2);
                            customPhoneKeyboardView.playSoundEffect(0);
                            break;
                        } catch (Exception unused) {
                        }
                        customPhoneKeyboardView.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                        customPhoneKeyboardView.editText.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (customPhoneKeyboardView.runningLongClick) {
                            customPhoneKeyboardView.postDelayed(customPhoneKeyboardView.onBackButton, 50L);
                        }
                    }
                }
                break;
            default:
                CustomPhoneKeyboardView customPhoneKeyboardView2 = this.f$0;
                customPhoneKeyboardView2.postedLongClick = false;
                customPhoneKeyboardView2.runningLongClick = true;
                customPhoneKeyboardView2.onBackButton.run();
                break;
        }
    }
}
