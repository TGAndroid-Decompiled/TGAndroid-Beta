package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class xr implements Runnable {
    public final int f29136a;
    public final as f29137b;

    public xr(as asVar, int i10) {
        this.f29136a = i10;
        this.f29137b = asVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f29136a) {
            case 0:
                as asVar = this.f29137b;
                if (asVar.f21574b == null && (view = asVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        asVar.f21574b = (EditText) findFocus;
                    }
                }
                EditText editText = asVar.f21574b;
                if (editText != null) {
                    if (editText.length() != 0 || asVar.e) {
                        try {
                            asVar.performHapticFeedback(3, 2);
                            asVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        asVar.f21574b.dispatchKeyEvent(new KeyEvent(0, 67));
                        asVar.f21574b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (asVar.f21576f) {
                            asVar.postDelayed(asVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                as asVar2 = this.f29137b;
                asVar2.f21577n = false;
                asVar2.f21576f = true;
                asVar2.h.run();
                return;
        }
    }
}
