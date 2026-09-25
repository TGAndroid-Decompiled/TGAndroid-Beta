package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class sr implements Runnable {
    public final int f28312a;
    public final vr f28313b;

    public sr(vr vrVar, int i10) {
        this.f28312a = i10;
        this.f28313b = vrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28312a) {
            case 0:
                vr vrVar = this.f28313b;
                if (vrVar.f29799b == null && (view = vrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.f29799b = (EditText) findFocus;
                    }
                }
                EditText editText = vrVar.f29799b;
                if (editText != null) {
                    if (editText.length() != 0 || vrVar.e) {
                        try {
                            vrVar.performHapticFeedback(3, 2);
                            vrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        vrVar.f29799b.dispatchKeyEvent(new KeyEvent(0, 67));
                        vrVar.f29799b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (vrVar.f29801f) {
                            vrVar.postDelayed(vrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f28313b;
                vrVar2.f29802n = false;
                vrVar2.f29801f = true;
                vrVar2.h.run();
                return;
        }
    }
}
