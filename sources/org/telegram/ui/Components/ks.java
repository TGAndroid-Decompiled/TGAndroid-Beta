package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ks implements Runnable {
    public final int f27933a;
    public final ns f27934b;

    public ks(ns nsVar, int i10) {
        this.f27933a = i10;
        this.f27934b = nsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27933a) {
            case 0:
                ns nsVar = this.f27934b;
                if (nsVar.f28951b == null && (view = nsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        nsVar.f28951b = (EditText) findFocus;
                    }
                }
                EditText editText = nsVar.f28951b;
                if (editText != null) {
                    if (editText.length() != 0 || nsVar.f28953e) {
                        try {
                            nsVar.performHapticFeedback(3, 2);
                            nsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        nsVar.f28951b.dispatchKeyEvent(new KeyEvent(0, 67));
                        nsVar.f28951b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (nsVar.f28954f) {
                            nsVar.postDelayed(nsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ns nsVar2 = this.f27934b;
                nsVar2.f28955n = false;
                nsVar2.f28954f = true;
                nsVar2.h.run();
                return;
        }
    }
}
