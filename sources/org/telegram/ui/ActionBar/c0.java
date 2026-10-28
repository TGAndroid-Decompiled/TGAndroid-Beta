package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.widget.PopupWindow;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.md;
public final class c0 implements PopupWindow.OnDismissListener {
    public final int f22492a;
    public final Object f22493b;
    public final Object f22494c;

    public c0(int i10, Object obj, Object obj2) {
        this.f22492a = i10;
        this.f22493b = obj;
        this.f22494c = obj2;
    }

    @Override
    public final void onDismiss() {
        switch (this.f22492a) {
            case 0:
                w0 w0Var = (w0) this.f22493b;
                Utilities.Callback callback = (Utilities.Callback) this.f22494c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(w0Var.T));
                    return;
                }
                return;
            default:
                md mdVar = (md) this.f22493b;
                lh.e eVar = (lh.e) this.f22494c;
                ValueAnimator valueAnimator = mdVar.e;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mdVar.e.cancel();
                    mdVar.e = null;
                }
                mdVar.f30503b.removeOnAttachStateChangeListener(mdVar.f30507i);
                eVar.setCenterMenuVisible(false);
                Bitmap bitmap = mdVar.f30505f;
                if (bitmap != null) {
                    bitmap.recycle();
                    mdVar.f30505f = null;
                    return;
                }
                return;
        }
    }
}
