package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class lr implements Runnable {
    public final int f37207a;
    public final or f37208b;

    public lr(or orVar, int i7) {
        this.f37207a = i7;
        this.f37208b = orVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f37207a) {
            case 0:
                or orVar = this.f37208b;
                if (orVar.f38252b == null && (view = orVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.f38252b = (EditText) findFocus;
                    }
                }
                EditText editText = orVar.f38252b;
                if (editText != null) {
                    if (editText.length() != 0 || orVar.f38254e) {
                        try {
                            orVar.performHapticFeedback(3, 2);
                            orVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        orVar.f38252b.dispatchKeyEvent(new KeyEvent(0, 67));
                        orVar.f38252b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (orVar.f38255f) {
                            orVar.postDelayed(orVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                or orVar2 = this.f37208b;
                orVar2.f38256n = false;
                orVar2.f38255f = true;
                orVar2.h.run();
                return;
        }
    }
}
