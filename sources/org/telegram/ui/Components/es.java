package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class es implements Runnable {
    public final int f27917a;
    public final hs f27918b;

    public es(hs hsVar, int i10) {
        this.f27917a = i10;
        this.f27918b = hsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27917a) {
            case 0:
                hs hsVar = this.f27918b;
                if (hsVar.f29063b == null && (view = hsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        hsVar.f29063b = (EditText) findFocus;
                    }
                }
                EditText editText = hsVar.f29063b;
                if (editText != null) {
                    if (editText.length() != 0 || hsVar.e) {
                        try {
                            hsVar.performHapticFeedback(3, 2);
                            hsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        hsVar.f29063b.dispatchKeyEvent(new KeyEvent(0, 67));
                        hsVar.f29063b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (hsVar.f29065f) {
                            hsVar.postDelayed(hsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f27918b;
                hsVar2.f29066n = false;
                hsVar2.f29065f = true;
                hsVar2.h.run();
                return;
        }
    }
}
