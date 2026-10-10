package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class js implements Runnable {
    public final int f27772a;
    public final ms f27773b;

    public js(ms msVar, int i10) {
        this.f27772a = i10;
        this.f27773b = msVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27772a) {
            case 0:
                ms msVar = this.f27773b;
                if (msVar.f28885b == null && (view = msVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        msVar.f28885b = (EditText) findFocus;
                    }
                }
                EditText editText = msVar.f28885b;
                if (editText != null) {
                    if (editText.length() != 0 || msVar.f28887e) {
                        try {
                            msVar.performHapticFeedback(3, 2);
                            msVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        msVar.f28885b.dispatchKeyEvent(new KeyEvent(0, 67));
                        msVar.f28885b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (msVar.f28888f) {
                            msVar.postDelayed(msVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ms msVar2 = this.f27773b;
                msVar2.f28889n = false;
                msVar2.f28888f = true;
                msVar2.h.run();
                return;
        }
    }
}
