package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class es implements Runnable {
    public final int f27974a;
    public final hs f27975b;

    public es(hs hsVar, int i10) {
        this.f27974a = i10;
        this.f27975b = hsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27974a) {
            case 0:
                hs hsVar = this.f27975b;
                if (hsVar.f29044b == null && (view = hsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        hsVar.f29044b = (EditText) findFocus;
                    }
                }
                EditText editText = hsVar.f29044b;
                if (editText != null) {
                    if (editText.length() != 0 || hsVar.e) {
                        try {
                            hsVar.performHapticFeedback(3, 2);
                            hsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        hsVar.f29044b.dispatchKeyEvent(new KeyEvent(0, 67));
                        hsVar.f29044b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (hsVar.f29046f) {
                            hsVar.postDelayed(hsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f27975b;
                hsVar2.f29047n = false;
                hsVar2.f29046f = true;
                hsVar2.h.run();
                return;
        }
    }
}
