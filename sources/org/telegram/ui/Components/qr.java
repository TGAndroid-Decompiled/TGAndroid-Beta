package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class qr implements Runnable {
    public final int f29801a;
    public final tr f29802b;

    public qr(tr trVar, int i10) {
        this.f29801a = i10;
        this.f29802b = trVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f29801a) {
            case 0:
                tr trVar = this.f29802b;
                if (trVar.f30687b == null && (view = trVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        trVar.f30687b = (EditText) findFocus;
                    }
                }
                EditText editText = trVar.f30687b;
                if (editText != null) {
                    if (editText.length() != 0 || trVar.f30689e) {
                        try {
                            trVar.performHapticFeedback(3, 2);
                            trVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        trVar.f30687b.dispatchKeyEvent(new KeyEvent(0, 67));
                        trVar.f30687b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (trVar.f30690f) {
                            trVar.postDelayed(trVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tr trVar2 = this.f29802b;
                trVar2.f30691n = false;
                trVar2.f30690f = true;
                trVar2.h.run();
                return;
        }
    }
}
