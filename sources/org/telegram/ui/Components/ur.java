package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ur implements Runnable {
    public final int f28912a;
    public final xr f28913b;

    public ur(xr xrVar, int i10) {
        this.f28912a = i10;
        this.f28913b = xrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28912a) {
            case 0:
                xr xrVar = this.f28913b;
                if (xrVar.f30490b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f30490b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.f30490b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.f30490b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.f30490b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f30492f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xr xrVar2 = this.f28913b;
                xrVar2.f30493n = false;
                xrVar2.f30492f = true;
                xrVar2.h.run();
                return;
        }
    }
}
