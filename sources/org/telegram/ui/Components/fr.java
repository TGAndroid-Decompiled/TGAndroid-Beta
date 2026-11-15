package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class fr implements Runnable {
    public final int f34685a;
    public final ir f34686b;

    public fr(ir irVar, int i7) {
        this.f34685a = i7;
        this.f34686b = irVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f34685a) {
            case 0:
                ir irVar = this.f34686b;
                if (irVar.f35689b == null && (view = irVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        irVar.f35689b = (EditText) findFocus;
                    }
                }
                EditText editText = irVar.f35689b;
                if (editText != null) {
                    if (editText.length() != 0 || irVar.f35691e) {
                        try {
                            irVar.performHapticFeedback(3, 2);
                            irVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        irVar.f35689b.dispatchKeyEvent(new KeyEvent(0, 67));
                        irVar.f35689b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (irVar.f35692f) {
                            irVar.postDelayed(irVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ir irVar2 = this.f34686b;
                irVar2.f35693n = false;
                irVar2.f35692f = true;
                irVar2.h.run();
                return;
        }
    }
}
