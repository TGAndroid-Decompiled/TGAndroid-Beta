package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40694a;
    public final br f40695b;

    public yq(br brVar, int i7) {
        this.f40694a = i7;
        this.f40695b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40694a) {
            case 0:
                br brVar = this.f40695b;
                if (brVar.f32276b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32276b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32276b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32278e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32276b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32276b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32279f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40695b;
                brVar2.f32280n = false;
                brVar2.f32279f = true;
                brVar2.h.run();
                return;
        }
    }
}
