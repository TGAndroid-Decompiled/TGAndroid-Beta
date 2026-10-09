package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class is implements Runnable {
    public final int f27477a;
    public final ls f27478b;

    public is(ls lsVar, int i10) {
        this.f27477a = i10;
        this.f27478b = lsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27477a) {
            case 0:
                ls lsVar = this.f27478b;
                if (lsVar.f28581b == null && (view = lsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        lsVar.f28581b = (EditText) findFocus;
                    }
                }
                EditText editText = lsVar.f28581b;
                if (editText != null) {
                    if (editText.length() != 0 || lsVar.f28583e) {
                        try {
                            lsVar.performHapticFeedback(3, 2);
                            lsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        lsVar.f28581b.dispatchKeyEvent(new KeyEvent(0, 67));
                        lsVar.f28581b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (lsVar.f28584f) {
                            lsVar.postDelayed(lsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ls lsVar2 = this.f27478b;
                lsVar2.f28585n = false;
                lsVar2.f28584f = true;
                lsVar2.h.run();
                return;
        }
    }
}
