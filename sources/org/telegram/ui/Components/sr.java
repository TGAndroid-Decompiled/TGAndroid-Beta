package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class sr implements Runnable {
    public final int f28304a;
    public final vr f28305b;

    public sr(vr vrVar, int i10) {
        this.f28304a = i10;
        this.f28305b = vrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28304a) {
            case 0:
                vr vrVar = this.f28305b;
                if (vrVar.f29789b == null && (view = vrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.f29789b = (EditText) findFocus;
                    }
                }
                EditText editText = vrVar.f29789b;
                if (editText != null) {
                    if (editText.length() != 0 || vrVar.e) {
                        try {
                            vrVar.performHapticFeedback(3, 2);
                            vrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        vrVar.f29789b.dispatchKeyEvent(new KeyEvent(0, 67));
                        vrVar.f29789b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (vrVar.f29791f) {
                            vrVar.postDelayed(vrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f28305b;
                vrVar2.f29792n = false;
                vrVar2.f29791f = true;
                vrVar2.h.run();
                return;
        }
    }
}
