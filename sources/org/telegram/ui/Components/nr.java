package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class nr implements Runnable {
    public final int f27355a;
    public final rr f27356b;

    public nr(rr rrVar, int i10) {
        this.f27355a = i10;
        this.f27356b = rrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27355a) {
            case 0:
                rr rrVar = this.f27356b;
                if (rrVar.f28569b == null && (view = rrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.f28569b = (EditText) findFocus;
                    }
                }
                EditText editText = rrVar.f28569b;
                if (editText != null) {
                    if (editText.length() != 0 || rrVar.e) {
                        try {
                            rrVar.performHapticFeedback(3, 2);
                            rrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        rrVar.f28569b.dispatchKeyEvent(new KeyEvent(0, 67));
                        rrVar.f28569b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (rrVar.f28571f) {
                            rrVar.postDelayed(rrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f27356b;
                rrVar2.f28572n = false;
                rrVar2.f28571f = true;
                rrVar2.h.run();
                return;
        }
    }
}
