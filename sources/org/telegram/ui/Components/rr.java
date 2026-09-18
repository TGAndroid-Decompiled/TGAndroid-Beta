package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class rr implements Runnable {
    public final int f27953a;
    public final ur f27954b;

    public rr(ur urVar, int i10) {
        this.f27953a = i10;
        this.f27954b = urVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27953a) {
            case 0:
                ur urVar = this.f27954b;
                if (urVar.f28807b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28807b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.f28807b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.f28807b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.f28807b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f28809f) {
                            urVar.postDelayed(urVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ur urVar2 = this.f27954b;
                urVar2.f28810n = false;
                urVar2.f28809f = true;
                urVar2.h.run();
                return;
        }
    }
}
