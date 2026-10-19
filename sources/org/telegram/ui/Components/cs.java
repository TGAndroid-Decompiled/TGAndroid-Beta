package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class cs implements Runnable {
    public final int f25335a;
    public final fs f25336b;

    public cs(fs fsVar, int i10) {
        this.f25335a = i10;
        this.f25336b = fsVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f25335a) {
            case 0:
                fs fsVar = this.f25336b;
                if (fsVar.f26371b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26371b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.f26371b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.f26371b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.f26371b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f26373f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                fs fsVar2 = this.f25336b;
                fsVar2.f26374n = false;
                fsVar2.f26373f = true;
                fsVar2.h.run();
                return;
        }
    }
}
