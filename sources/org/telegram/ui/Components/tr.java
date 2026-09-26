package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class tr implements Runnable {
    public final int f28597a;
    public final wr f28598b;

    public tr(wr wrVar, int i10) {
        this.f28597a = i10;
        this.f28598b = wrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28597a) {
            case 0:
                wr wrVar = this.f28598b;
                if (wrVar.f30191b == null && (view = wrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.f30191b = (EditText) findFocus;
                    }
                }
                EditText editText = wrVar.f30191b;
                if (editText != null) {
                    if (editText.length() != 0 || wrVar.e) {
                        try {
                            wrVar.performHapticFeedback(3, 2);
                            wrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        wrVar.f30191b.dispatchKeyEvent(new KeyEvent(0, 67));
                        wrVar.f30191b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (wrVar.f30193f) {
                            wrVar.postDelayed(wrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                wr wrVar2 = this.f28598b;
                wrVar2.f30194n = false;
                wrVar2.f30193f = true;
                wrVar2.h.run();
                return;
        }
    }
}
