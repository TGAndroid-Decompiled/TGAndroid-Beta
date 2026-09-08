package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class qr implements Runnable {
    public final int f29827a;
    public final tr f29828b;

    public qr(tr trVar, int i10) {
        this.f29827a = i10;
        this.f29828b = trVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f29827a) {
            case 0:
                tr trVar = this.f29828b;
                if (trVar.f30713b == null && (view = trVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        trVar.f30713b = (EditText) findFocus;
                    }
                }
                EditText editText = trVar.f30713b;
                if (editText != null) {
                    if (editText.length() != 0 || trVar.f30715e) {
                        try {
                            trVar.performHapticFeedback(3, 2);
                            trVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        trVar.f30713b.dispatchKeyEvent(new KeyEvent(0, 67));
                        trVar.f30713b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (trVar.f30716f) {
                            trVar.postDelayed(trVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tr trVar2 = this.f29828b;
                trVar2.f30717n = false;
                trVar2.f30716f = true;
                trVar2.h.run();
                return;
        }
    }
}
