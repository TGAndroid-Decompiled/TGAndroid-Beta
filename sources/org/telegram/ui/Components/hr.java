package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class hr implements Runnable {
    public final int f29175a;
    public final kr f29176b;

    public hr(kr krVar, int i9) {
        this.f29175a = i9;
        this.f29176b = krVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f29175a) {
            case 0:
                kr krVar = this.f29176b;
                if (krVar.f30227b == null && (view = krVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        krVar.f30227b = (EditText) findFocus;
                    }
                }
                EditText editText = krVar.f30227b;
                if (editText != null) {
                    if (editText.length() != 0 || krVar.f30229e) {
                        try {
                            krVar.performHapticFeedback(3, 2);
                            krVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        krVar.f30227b.dispatchKeyEvent(new KeyEvent(0, 67));
                        krVar.f30227b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (krVar.f30230f) {
                            krVar.postDelayed(krVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                kr krVar2 = this.f29176b;
                krVar2.f30231n = false;
                krVar2.f30230f = true;
                krVar2.h.run();
                return;
        }
    }
}
