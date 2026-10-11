package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class js implements Runnable {
    public final int f27831a;
    public final ms f27832b;

    public js(ms msVar, int i10) {
        this.f27831a = i10;
        this.f27832b = msVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27831a) {
            case 0:
                ms msVar = this.f27832b;
                if (msVar.f28925b == null && (view = msVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        msVar.f28925b = (EditText) findFocus;
                    }
                }
                EditText editText = msVar.f28925b;
                if (editText != null) {
                    if (editText.length() != 0 || msVar.f28927e) {
                        try {
                            msVar.performHapticFeedback(3, 2);
                            msVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        msVar.f28925b.dispatchKeyEvent(new KeyEvent(0, 67));
                        msVar.f28925b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (msVar.f28928f) {
                            msVar.postDelayed(msVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ms msVar2 = this.f27832b;
                msVar2.f28929n = false;
                msVar2.f28928f = true;
                msVar2.h.run();
                return;
        }
    }
}
