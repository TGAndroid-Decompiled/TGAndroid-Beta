package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class yq implements Runnable {
    public final int f40732a;
    public final br f40733b;

    public yq(br brVar, int i7) {
        this.f40732a = i7;
        this.f40733b = brVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f40732a) {
            case 0:
                br brVar = this.f40733b;
                if (brVar.f32331b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32331b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.f32331b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.f32333e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.f32331b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.f32331b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f32334f) {
                            brVar.postDelayed(brVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                br brVar2 = this.f40733b;
                brVar2.f32335n = false;
                brVar2.f32334f = true;
                brVar2.h.run();
                return;
        }
    }
}
