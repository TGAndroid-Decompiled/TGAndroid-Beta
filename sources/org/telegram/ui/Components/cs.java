package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class cs implements Runnable {
    public final int f25249a;
    public final fs f25250b;

    public cs(fs fsVar, int i10) {
        this.f25249a = i10;
        this.f25250b = fsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25249a) {
            case 0:
                fs fsVar = this.f25250b;
                if (fsVar.f26400b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26400b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.f26400b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.f26400b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.f26400b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f26402f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fs fsVar2 = this.f25250b;
                fsVar2.f26403n = false;
                fsVar2.f26402f = true;
                fsVar2.h.run();
                return;
        }
    }
}
