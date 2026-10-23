package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class cs implements Runnable {
    public final int f25413a;
    public final fs f25414b;

    public cs(fs fsVar, int i10) {
        this.f25413a = i10;
        this.f25414b = fsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25413a) {
            case 0:
                fs fsVar = this.f25414b;
                if (fsVar.f26445b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26445b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.f26445b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.f26445b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.f26445b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f26447f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fs fsVar2 = this.f25414b;
                fsVar2.f26448n = false;
                fsVar2.f26447f = true;
                fsVar2.h.run();
                return;
        }
    }
}
