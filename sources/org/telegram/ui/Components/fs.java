package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class fs implements Runnable {
    public final int f25117a;
    public final is f25118b;

    public fs(is isVar, int i10) {
        this.f25117a = i10;
        this.f25118b = isVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25117a) {
            case 0:
                is isVar = this.f25118b;
                if (isVar.f26083b == null && (view = isVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        isVar.f26083b = (EditText) findFocus;
                    }
                }
                EditText editText = isVar.f26083b;
                if (editText != null) {
                    if (editText.length() != 0 || isVar.e) {
                        try {
                            isVar.performHapticFeedback(3, 2);
                            isVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        isVar.f26083b.dispatchKeyEvent(new KeyEvent(0, 67));
                        isVar.f26083b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (isVar.f26085f) {
                            isVar.postDelayed(isVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                is isVar2 = this.f25118b;
                isVar2.f26086n = false;
                isVar2.f26085f = true;
                isVar2.h.run();
                return;
        }
    }
}
