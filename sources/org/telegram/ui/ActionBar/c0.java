package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.widget.PopupWindow;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.md;
public final class c0 implements PopupWindow.OnDismissListener {
    public final int f22489a;
    public final Object f22490b;
    public final Object f22491c;

    public c0(int i10, Object obj, Object obj2) {
        this.f22489a = i10;
        this.f22490b = obj;
        this.f22491c = obj2;
    }

    @Override
    public final void onDismiss() {
        switch (this.f22489a) {
            case 0:
                w0 w0Var = (w0) this.f22490b;
                Utilities.Callback callback = (Utilities.Callback) this.f22491c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(w0Var.T));
                    return;
                }
                return;
            default:
                md mdVar = (md) this.f22490b;
                lh.e eVar = (lh.e) this.f22491c;
                ValueAnimator valueAnimator = mdVar.e;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mdVar.e.cancel();
                    mdVar.e = null;
                }
                mdVar.f30526b.removeOnAttachStateChangeListener(mdVar.f30530i);
                eVar.setCenterMenuVisible(false);
                Bitmap bitmap = mdVar.f30528f;
                if (bitmap != null) {
                    bitmap.recycle();
                    mdVar.f30528f = null;
                    return;
                }
                return;
        }
    }
}
