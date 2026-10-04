package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ur implements Runnable {
    public final int f31421a;
    public final xr f31422b;

    public ur(xr xrVar, int i10) {
        this.f31421a = i10;
        this.f31422b = xrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f31421a) {
            case 0:
                xr xrVar = this.f31422b;
                if (xrVar.f32968b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f32968b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.f32968b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.f32970e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.f32968b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.f32968b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f32971f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xr xrVar2 = this.f31422b;
                xrVar2.f32972n = false;
                xrVar2.f32971f = true;
                xrVar2.h.run();
                return;
        }
    }
}
