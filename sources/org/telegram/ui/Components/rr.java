package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class rr implements Runnable {
    public final int f27942a;
    public final ur f27943b;

    public rr(ur urVar, int i10) {
        this.f27942a = i10;
        this.f27943b = urVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27942a) {
            case 0:
                ur urVar = this.f27943b;
                if (urVar.f28840b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28840b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.f28840b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.f28840b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.f28840b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f28842f) {
                            urVar.postDelayed(urVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ur urVar2 = this.f27943b;
                urVar2.f28843n = false;
                urVar2.f28842f = true;
                urVar2.h.run();
                return;
        }
    }
}
