package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class or implements Runnable {
    public final int f38311a;
    public final rr f38312b;

    public or(rr rrVar, int i7) {
        this.f38311a = i7;
        this.f38312b = rrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f38311a) {
            case 0:
                rr rrVar = this.f38312b;
                if (rrVar.f39278b == null && (view = rrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.f39278b = (EditText) findFocus;
                    }
                }
                EditText editText = rrVar.f39278b;
                if (editText != null) {
                    if (editText.length() != 0 || rrVar.f39280e) {
                        try {
                            rrVar.performHapticFeedback(3, 2);
                            rrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        rrVar.f39278b.dispatchKeyEvent(new KeyEvent(0, 67));
                        rrVar.f39278b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (rrVar.f39281f) {
                            rrVar.postDelayed(rrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f38312b;
                rrVar2.f39282n = false;
                rrVar2.f39281f = true;
                rrVar2.h.run();
                return;
        }
    }
}
