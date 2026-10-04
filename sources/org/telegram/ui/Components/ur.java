package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ur implements Runnable {
    public final int f31428a;
    public final xr f31429b;

    public ur(xr xrVar, int i10) {
        this.f31428a = i10;
        this.f31429b = xrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f31428a) {
            case 0:
                xr xrVar = this.f31429b;
                if (xrVar.f32975b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f32975b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.f32975b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.f32977e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.f32975b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.f32975b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f32978f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xr xrVar2 = this.f31429b;
                xrVar2.f32979n = false;
                xrVar2.f32978f = true;
                xrVar2.h.run();
                return;
        }
    }
}
