package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class qr implements Runnable {
    public final int f30503a;
    public final ur f30504b;

    public qr(ur urVar, int i10) {
        this.f30503a = i10;
        this.f30504b = urVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f30503a) {
            case 0:
                ur urVar = this.f30504b;
                if (urVar.f31676b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f31676b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.f31676b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.f31678e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.f31676b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.f31676b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f31679f) {
                            urVar.postDelayed(urVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ur urVar2 = this.f30504b;
                urVar2.f31680n = false;
                urVar2.f31679f = true;
                urVar2.h.run();
                return;
        }
    }
}
