package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class ks implements Runnable {
    public final int f27919a;
    public final ns f27920b;

    public ks(ns nsVar, int i10) {
        this.f27919a = i10;
        this.f27920b = nsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27919a) {
            case 0:
                ns nsVar = this.f27920b;
                if (nsVar.f28955b == null && (view = nsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        nsVar.f28955b = (EditText) findFocus;
                    }
                }
                EditText editText = nsVar.f28955b;
                if (editText != null) {
                    if (editText.length() != 0 || nsVar.f28957e) {
                        try {
                            nsVar.performHapticFeedback(3, 2);
                            nsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        nsVar.f28955b.dispatchKeyEvent(new KeyEvent(0, 67));
                        nsVar.f28955b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (nsVar.f28958f) {
                            nsVar.postDelayed(nsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ns nsVar2 = this.f27920b;
                nsVar2.f28959n = false;
                nsVar2.f28958f = true;
                nsVar2.h.run();
                return;
        }
    }
}
