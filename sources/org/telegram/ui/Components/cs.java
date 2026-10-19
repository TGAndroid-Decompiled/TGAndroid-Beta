package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class cs implements Runnable {
    public final int f25333a;
    public final fs f25334b;

    public cs(fs fsVar, int i10) {
        this.f25333a = i10;
        this.f25334b = fsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25333a) {
            case 0:
                fs fsVar = this.f25334b;
                if (fsVar.f26369b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26369b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.f26369b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.f26369b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.f26369b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f26371f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fs fsVar2 = this.f25334b;
                fsVar2.f26372n = false;
                fsVar2.f26371f = true;
                fsVar2.h.run();
                return;
        }
    }
}
