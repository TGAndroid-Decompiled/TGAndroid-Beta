package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class or implements Runnable {
    public final int f27652a;
    public final sr f27653b;

    public or(sr srVar, int i10) {
        this.f27652a = i10;
        this.f27653b = srVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27652a) {
            case 0:
                sr srVar = this.f27653b;
                if (srVar.f28803b == null && (view = srVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        srVar.f28803b = (EditText) findFocus;
                    }
                }
                EditText editText = srVar.f28803b;
                if (editText != null) {
                    if (editText.length() != 0 || srVar.e) {
                        try {
                            srVar.performHapticFeedback(3, 2);
                            srVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        srVar.f28803b.dispatchKeyEvent(new KeyEvent(0, 67));
                        srVar.f28803b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (srVar.f28805f) {
                            srVar.postDelayed(srVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                sr srVar2 = this.f27653b;
                srVar2.f28806n = false;
                srVar2.f28805f = true;
                srVar2.h.run();
                return;
        }
    }
}
