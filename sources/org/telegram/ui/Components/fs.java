package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class fs implements Runnable {
    public final int f24807a;
    public final is f24808b;

    public fs(is isVar, int i10) {
        this.f24807a = i10;
        this.f24808b = isVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f24807a) {
            case 0:
                is isVar = this.f24808b;
                if (isVar.f25776b == null && (view = isVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        isVar.f25776b = (EditText) findFocus;
                    }
                }
                EditText editText = isVar.f25776b;
                if (editText != null) {
                    if (editText.length() != 0 || isVar.e) {
                        try {
                            isVar.performHapticFeedback(3, 2);
                            isVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        isVar.f25776b.dispatchKeyEvent(new KeyEvent(0, 67));
                        isVar.f25776b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (isVar.f25778f) {
                            isVar.postDelayed(isVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                is isVar2 = this.f24808b;
                isVar2.f25779n = false;
                isVar2.f25778f = true;
                isVar2.h.run();
                return;
        }
    }
}
