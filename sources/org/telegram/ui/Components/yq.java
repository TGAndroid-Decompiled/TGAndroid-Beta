package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40803a;
    public final br f40804b;

    public yq(br brVar, int i3) {
        this.f40803a = i3;
        this.f40804b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40803a) {
            case 0:
                br brVar = this.f40804b;
                if (brVar.f32368b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32368b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32368b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32370e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32368b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32368b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32371f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40804b;
                brVar2.f32372n = false;
                brVar2.f32371f = true;
                brVar2.h.run();
                return;
        }
    }
}
