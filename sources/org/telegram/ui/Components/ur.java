package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ur implements Runnable {
    public final int f31504a;
    public final xr f31505b;

    public ur(xr xrVar, int i10) {
        this.f31504a = i10;
        this.f31505b = xrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f31504a) {
            case 0:
                xr xrVar = this.f31505b;
                if (xrVar.f33073b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f33073b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.f33073b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.f33075e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.f33073b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.f33073b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f33076f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xr xrVar2 = this.f31505b;
                xrVar2.f33077n = false;
                xrVar2.f33076f = true;
                xrVar2.h.run();
                return;
        }
    }
}
