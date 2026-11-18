package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class mr implements Runnable {
    public final int f37618a;
    public final pr f37619b;

    public mr(pr prVar, int i7) {
        this.f37618a = i7;
        this.f37619b = prVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f37618a) {
            case 0:
                pr prVar = this.f37619b;
                if (prVar.f38530b == null && (view = prVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        prVar.f38530b = (EditText) findFocus;
                    }
                }
                EditText editText = prVar.f38530b;
                if (editText != null) {
                    if (editText.length() != 0 || prVar.f38532e) {
                        try {
                            prVar.performHapticFeedback(3, 2);
                            prVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        prVar.f38530b.dispatchKeyEvent(new KeyEvent(0, 67));
                        prVar.f38530b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (prVar.f38533f) {
                            prVar.postDelayed(prVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                pr prVar2 = this.f37619b;
                prVar2.f38534n = false;
                prVar2.f38533f = true;
                prVar2.h.run();
                return;
        }
    }
}
