package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class qr implements Runnable {
    public final int f30464a;
    public final ur f30465b;

    public qr(ur urVar, int i10) {
        this.f30464a = i10;
        this.f30465b = urVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f30464a) {
            case 0:
                ur urVar = this.f30465b;
                if (urVar.f31715b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f31715b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.f31715b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.f31717e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.f31715b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.f31715b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f31718f) {
                            urVar.postDelayed(urVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ur urVar2 = this.f30465b;
                urVar2.f31719n = false;
                urVar2.f31718f = true;
                urVar2.h.run();
                return;
        }
    }
}
