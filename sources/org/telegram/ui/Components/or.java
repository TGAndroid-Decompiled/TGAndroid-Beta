package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class or implements Runnable {
    public final int f38347a;
    public final rr f38348b;

    public or(rr rrVar, int i7) {
        this.f38347a = i7;
        this.f38348b = rrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f38347a) {
            case 0:
                rr rrVar = this.f38348b;
                if (rrVar.f39313b == null && (view = rrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.f39313b = (EditText) findFocus;
                    }
                }
                EditText editText = rrVar.f39313b;
                if (editText != null) {
                    if (editText.length() != 0 || rrVar.f39315e) {
                        try {
                            rrVar.performHapticFeedback(3, 2);
                            rrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        rrVar.f39313b.dispatchKeyEvent(new KeyEvent(0, 67));
                        rrVar.f39313b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (rrVar.f39316f) {
                            rrVar.postDelayed(rrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f38348b;
                rrVar2.f39317n = false;
                rrVar2.f39316f = true;
                rrVar2.h.run();
                return;
        }
    }
}
