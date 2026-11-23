package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class or implements Runnable {
    public final int f38341a;
    public final rr f38342b;

    public or(rr rrVar, int i7) {
        this.f38341a = i7;
        this.f38342b = rrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f38341a) {
            case 0:
                rr rrVar = this.f38342b;
                if (rrVar.f39323b == null && (view = rrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.f39323b = (EditText) findFocus;
                    }
                }
                EditText editText = rrVar.f39323b;
                if (editText != null) {
                    if (editText.length() != 0 || rrVar.f39325e) {
                        try {
                            rrVar.performHapticFeedback(3, 2);
                            rrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        rrVar.f39323b.dispatchKeyEvent(new KeyEvent(0, 67));
                        rrVar.f39323b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (rrVar.f39326f) {
                            rrVar.postDelayed(rrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f38342b;
                rrVar2.f39327n = false;
                rrVar2.f39326f = true;
                rrVar2.h.run();
                return;
        }
    }
}
