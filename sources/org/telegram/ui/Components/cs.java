package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class cs implements Runnable {
    public final int f25367a;
    public final fs f25368b;

    public cs(fs fsVar, int i10) {
        this.f25367a = i10;
        this.f25368b = fsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25367a) {
            case 0:
                fs fsVar = this.f25368b;
                if (fsVar.f26387b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26387b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.f26387b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.f26387b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.f26387b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f26389f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fs fsVar2 = this.f25368b;
                fsVar2.f26390n = false;
                fsVar2.f26389f = true;
                fsVar2.h.run();
                return;
        }
    }
}
