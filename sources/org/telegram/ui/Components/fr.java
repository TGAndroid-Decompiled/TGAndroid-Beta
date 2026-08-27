package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public final class fr implements Runnable {

    public final int f28438a;

    public final ir f28439b;

    public fr(ir irVar, int i10) {
        this.f28438a = i10;
        this.f28439b = irVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28438a) {
            case 0:
                ir irVar = this.f28439b;
                if (irVar.f29470b == null && (view = irVar.d) != null) {
                    View viewFindFocus = view.findFocus();
                    if (viewFindFocus instanceof EditText) {
                        irVar.f29470b = (EditText) viewFindFocus;
                    }
                }
                EditText editText = irVar.f29470b;
                if (editText != null) {
                    if (editText.length() != 0 || irVar.f29472e) {
                        try {
                            irVar.performHapticFeedback(3, 2);
                            irVar.playSoundEffect(0);
                            break;
                        } catch (Exception unused) {
                        }
                        irVar.f29470b.dispatchKeyEvent(new KeyEvent(0, 67));
                        irVar.f29470b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (irVar.f29473f) {
                            irVar.postDelayed(irVar.h, 50L);
                        }
                    }
                }
                break;
            default:
                ir irVar2 = this.f28439b;
                irVar2.f29474n = false;
                irVar2.f29473f = true;
                irVar2.h.run();
                break;
        }
    }
}
