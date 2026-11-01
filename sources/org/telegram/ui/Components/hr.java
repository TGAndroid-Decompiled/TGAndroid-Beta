package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class hr implements Runnable {
    public final int f26907a;
    public final lr f26908b;

    public hr(lr lrVar, int i10) {
        this.f26907a = i10;
        this.f26908b = lrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f26907a) {
            case 0:
                lr lrVar = this.f26908b;
                if (lrVar.f28246b == null && (view = lrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        lrVar.f28246b = (EditText) findFocus;
                    }
                }
                EditText editText = lrVar.f28246b;
                if (editText != null) {
                    if (editText.length() != 0 || lrVar.e) {
                        try {
                            lrVar.performHapticFeedback(3, 2);
                            lrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        lrVar.f28246b.dispatchKeyEvent(new KeyEvent(0, 67));
                        lrVar.f28246b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (lrVar.f28248f) {
                            lrVar.postDelayed(lrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f26908b;
                lrVar2.f28249n = false;
                lrVar2.f28248f = true;
                lrVar2.h.run();
                return;
        }
    }
}
