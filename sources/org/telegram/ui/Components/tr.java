package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class tr implements Runnable {
    public final int f28611a;
    public final wr f28612b;

    public tr(wr wrVar, int i10) {
        this.f28611a = i10;
        this.f28612b = wrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28611a) {
            case 0:
                wr wrVar = this.f28612b;
                if (wrVar.f30162b == null && (view = wrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.f30162b = (EditText) findFocus;
                    }
                }
                EditText editText = wrVar.f30162b;
                if (editText != null) {
                    if (editText.length() != 0 || wrVar.e) {
                        try {
                            wrVar.performHapticFeedback(3, 2);
                            wrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        wrVar.f30162b.dispatchKeyEvent(new KeyEvent(0, 67));
                        wrVar.f30162b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (wrVar.f30164f) {
                            wrVar.postDelayed(wrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                wr wrVar2 = this.f28612b;
                wrVar2.f30165n = false;
                wrVar2.f30164f = true;
                wrVar2.h.run();
                return;
        }
    }
}
