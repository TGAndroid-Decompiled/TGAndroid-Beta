package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40706a;
    public final br f40707b;

    public yq(br brVar, int i7) {
        this.f40706a = i7;
        this.f40707b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40706a) {
            case 0:
                br brVar = this.f40707b;
                if (brVar.f32310b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32310b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32310b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32312e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32310b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32310b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32313f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40707b;
                brVar2.f32314n = false;
                brVar2.f32313f = true;
                brVar2.h.run();
                return;
        }
    }
}
