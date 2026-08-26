package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ShareAlert$$ExternalSyntheticLambda3 implements OnApplyWindowInsetsListener, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda3(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSendLongClick$24(keyEvent);
                break;
            default:
                this.f$0.lambda$onSendLongClick$27(keyEvent);
                break;
        }
    }
}
