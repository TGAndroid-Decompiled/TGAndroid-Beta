package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40675a;
    public final br f40676b;

    public yq(br brVar, int i7) {
        this.f40675a = i7;
        this.f40676b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40675a) {
            case 0:
                br brVar = this.f40676b;
                if (brVar.f32282b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32282b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32282b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32284e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32282b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32282b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32285f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40676b;
                brVar2.f32286n = false;
                brVar2.f32285f = true;
                brVar2.h.run();
                return;
        }
    }
}
