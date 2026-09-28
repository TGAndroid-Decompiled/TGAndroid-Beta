package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class tr implements Runnable {
    public final int f28612a;
    public final wr f28613b;

    public tr(wr wrVar, int i10) {
        this.f28612a = i10;
        this.f28613b = wrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28612a) {
            case 0:
                wr wrVar = this.f28613b;
                if (wrVar.f30163b == null && (view = wrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.f30163b = (EditText) findFocus;
                    }
                }
                EditText editText = wrVar.f30163b;
                if (editText != null) {
                    if (editText.length() != 0 || wrVar.e) {
                        try {
                            wrVar.performHapticFeedback(3, 2);
                            wrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        wrVar.f30163b.dispatchKeyEvent(new KeyEvent(0, 67));
                        wrVar.f30163b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (wrVar.f30165f) {
                            wrVar.postDelayed(wrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                wr wrVar2 = this.f28613b;
                wrVar2.f30166n = false;
                wrVar2.f30165f = true;
                wrVar2.h.run();
                return;
        }
    }
}
