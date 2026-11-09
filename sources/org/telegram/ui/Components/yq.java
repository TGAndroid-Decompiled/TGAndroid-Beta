package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40793a;
    public final br f40794b;

    public yq(br brVar, int i7) {
        this.f40793a = i7;
        this.f40794b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40793a) {
            case 0:
                br brVar = this.f40794b;
                if (brVar.f32387b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32387b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32387b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32389e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32387b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32387b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32390f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40794b;
                brVar2.f32391n = false;
                brVar2.f32390f = true;
                brVar2.h.run();
                return;
        }
    }
}
