package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class sr implements Runnable {
    public final int f27972a;
    public final vr f27973b;

    public sr(vr vrVar, int i10) {
        this.f27972a = i10;
        this.f27973b = vrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f27972a) {
            case 0:
                vr vrVar = this.f27973b;
                if (vrVar.f29378b == null && (view = vrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.f29378b = (EditText) findFocus;
                    }
                }
                EditText editText = vrVar.f29378b;
                if (editText != null) {
                    if (editText.length() != 0 || vrVar.e) {
                        try {
                            vrVar.performHapticFeedback(3, 2);
                            vrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        vrVar.f29378b.dispatchKeyEvent(new KeyEvent(0, 67));
                        vrVar.f29378b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (vrVar.f29380f) {
                            vrVar.postDelayed(vrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f27973b;
                vrVar2.f29381n = false;
                vrVar2.f29380f = true;
                vrVar2.h.run();
                return;
        }
    }
}
