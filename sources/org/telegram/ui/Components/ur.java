package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ur implements Runnable {
    public final int f31422a;
    public final xr f31423b;

    public ur(xr xrVar, int i10) {
        this.f31422a = i10;
        this.f31423b = xrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f31422a) {
            case 0:
                xr xrVar = this.f31423b;
                if (xrVar.f32969b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f32969b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.f32969b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.f32971e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.f32969b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.f32969b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f32972f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xr xrVar2 = this.f31423b;
                xrVar2.f32973n = false;
                xrVar2.f32972f = true;
                xrVar2.h.run();
                return;
        }
    }
}
