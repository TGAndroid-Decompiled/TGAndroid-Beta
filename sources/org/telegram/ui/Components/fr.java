package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class fr implements Runnable {
    public final int f34681a;
    public final ir f34682b;

    public fr(ir irVar, int i7) {
        this.f34681a = i7;
        this.f34682b = irVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f34681a) {
            case 0:
                ir irVar = this.f34682b;
                if (irVar.f35702b == null && (view = irVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        irVar.f35702b = (EditText) findFocus;
                    }
                }
                EditText editText = irVar.f35702b;
                if (editText != null) {
                    if (editText.length() != 0 || irVar.f35704e) {
                        try {
                            irVar.performHapticFeedback(3, 2);
                            irVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        irVar.f35702b.dispatchKeyEvent(new KeyEvent(0, 67));
                        irVar.f35702b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (irVar.f35705f) {
                            irVar.postDelayed(irVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ir irVar2 = this.f34682b;
                irVar2.f35706n = false;
                irVar2.f35705f = true;
                irVar2.h.run();
                return;
        }
    }
}
