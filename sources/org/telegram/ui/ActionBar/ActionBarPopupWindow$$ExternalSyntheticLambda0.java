package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.EmojiColorPickerWindow;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public final class ActionBarPopupWindow$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnScrollChangedListener {
    public final int $r8$classId;

    @Override
    public final void onScrollChanged() {
        switch (this.$r8$classId) {
            case 0:
                Method method = ActionBarPopupWindow.layoutInScreenMethod;
                break;
            case 1:
                Field field = EmojiColorPickerWindow.superListenerField;
                break;
            default:
                Field field2 = SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow.superListenerField;
                break;
        }
    }
}
