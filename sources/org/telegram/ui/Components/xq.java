package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class xq implements Runnable {
    public final int f40388a;
    public final ar f40389b;

    public xq(ar arVar, int i7) {
        this.f40388a = i7;
        this.f40389b = arVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40388a) {
            case 0:
                ar arVar = this.f40389b;
                if (arVar.f31970b == null && (view = arVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        arVar.f31970b = (EditText) findFocus;
                    }
                }
                EditText editText = arVar.f31970b;
                if (editText != null) {
                    if (editText.length() != 0 || arVar.f31972e) {
                        try {
                            arVar.performHapticFeedback(3, 2);
                            arVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        arVar.f31970b.dispatchKeyEvent(new KeyEvent(0, 67));
                        arVar.f31970b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (arVar.f31973f) {
                            arVar.postDelayed(arVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ar arVar2 = this.f40389b;
                arVar2.f31974n = false;
                arVar2.f31973f = true;
                arVar2.h.run();
                return;
        }
    }
}
