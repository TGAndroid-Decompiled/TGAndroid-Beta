package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class hr implements Runnable {
    public final int f26801a;
    public final lr f26802b;

    public hr(lr lrVar, int i10) {
        this.f26801a = i10;
        this.f26802b = lrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f26801a) {
            case 0:
                lr lrVar = this.f26802b;
                if (lrVar.f28169b == null && (view = lrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        lrVar.f28169b = (EditText) findFocus;
                    }
                }
                EditText editText = lrVar.f28169b;
                if (editText != null) {
                    if (editText.length() != 0 || lrVar.e) {
                        try {
                            lrVar.performHapticFeedback(3, 2);
                            lrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        lrVar.f28169b.dispatchKeyEvent(new KeyEvent(0, 67));
                        lrVar.f28169b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (lrVar.f28171f) {
                            lrVar.postDelayed(lrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f26802b;
                lrVar2.f28172n = false;
                lrVar2.f28171f = true;
                lrVar2.h.run();
                return;
        }
    }
}
