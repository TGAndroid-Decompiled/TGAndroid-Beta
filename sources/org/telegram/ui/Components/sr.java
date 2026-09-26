package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class sr implements Runnable {
    public final int f28311a;
    public final vr f28312b;

    public sr(vr vrVar, int i10) {
        this.f28311a = i10;
        this.f28312b = vrVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28311a) {
            case 0:
                vr vrVar = this.f28312b;
                if (vrVar.f29798b == null && (view = vrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.f29798b = (EditText) findFocus;
                    }
                }
                EditText editText = vrVar.f29798b;
                if (editText != null) {
                    if (editText.length() != 0 || vrVar.e) {
                        try {
                            vrVar.performHapticFeedback(3, 2);
                            vrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        vrVar.f29798b.dispatchKeyEvent(new KeyEvent(0, 67));
                        vrVar.f29798b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (vrVar.f29800f) {
                            vrVar.postDelayed(vrVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f28312b;
                vrVar2.f29801n = false;
                vrVar2.f29800f = true;
                vrVar2.h.run();
                return;
        }
    }
}
