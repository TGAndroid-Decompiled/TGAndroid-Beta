package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class kr implements Runnable {
    public final int f30132a;
    public final or f30133b;

    public kr(or orVar, int i10) {
        this.f30132a = i10;
        this.f30133b = orVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f30132a) {
            case 0:
                or orVar = this.f30133b;
                if (orVar.f31458b == null && (view = orVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.f31458b = (EditText) findFocus;
                    }
                }
                EditText editText = orVar.f31458b;
                if (editText != null) {
                    if (editText.length() != 0 || orVar.f31460e) {
                        try {
                            orVar.performHapticFeedback(3, 2);
                            orVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        orVar.f31458b.dispatchKeyEvent(new KeyEvent(0, 67));
                        orVar.f31458b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (orVar.f31461f) {
                            orVar.postDelayed(orVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                or orVar2 = this.f30133b;
                orVar2.f31462n = false;
                orVar2.f31461f = true;
                orVar2.h.run();
                return;
        }
    }
}
