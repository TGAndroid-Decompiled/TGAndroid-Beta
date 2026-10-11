package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class js implements Runnable {
    public final int f27739a;
    public final ms f27740b;

    public js(ms msVar, int i10) {
        this.f27739a = i10;
        this.f27740b = msVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27739a) {
            case 0:
                ms msVar = this.f27740b;
                if (msVar.f28846b == null && (view = msVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        msVar.f28846b = (EditText) findFocus;
                    }
                }
                EditText editText = msVar.f28846b;
                if (editText != null) {
                    if (editText.length() != 0 || msVar.f28848e) {
                        try {
                            msVar.performHapticFeedback(3, 2);
                            msVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        msVar.f28846b.dispatchKeyEvent(new KeyEvent(0, 67));
                        msVar.f28846b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (msVar.f28849f) {
                            msVar.postDelayed(msVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ms msVar2 = this.f27740b;
                msVar2.f28850n = false;
                msVar2.f28849f = true;
                msVar2.h.run();
                return;
        }
    }
}
