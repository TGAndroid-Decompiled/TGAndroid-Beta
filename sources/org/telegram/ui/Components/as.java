package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class as implements Runnable {
    public final int f24793a;
    public final ds f24794b;

    public as(ds dsVar, int i10) {
        this.f24793a = i10;
        this.f24794b = dsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f24793a) {
            case 0:
                ds dsVar = this.f24794b;
                if (dsVar.f25822b == null && (view = dsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        dsVar.f25822b = (EditText) findFocus;
                    }
                }
                EditText editText = dsVar.f25822b;
                if (editText != null) {
                    if (editText.length() != 0 || dsVar.e) {
                        try {
                            dsVar.performHapticFeedback(3, 2);
                            dsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        dsVar.f25822b.dispatchKeyEvent(new KeyEvent(0, 67));
                        dsVar.f25822b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (dsVar.f25824f) {
                            dsVar.postDelayed(dsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ds dsVar2 = this.f24794b;
                dsVar2.f25825n = false;
                dsVar2.f25824f = true;
                dsVar2.h.run();
                return;
        }
    }
}
