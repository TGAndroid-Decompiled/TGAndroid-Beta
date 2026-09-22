package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class rr implements Runnable {
    public final int f28032a;
    public final ur f28033b;

    public rr(ur urVar, int i10) {
        this.f28032a = i10;
        this.f28033b = urVar;
    }

    @Override
    public final void run() {
        View view;
        switch (this.f28032a) {
            case 0:
                ur urVar = this.f28033b;
                if (urVar.f28885b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28885b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.f28885b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.f28885b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.f28885b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f28887f) {
                            urVar.postDelayed(urVar.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ur urVar2 = this.f28033b;
                urVar2.f28888n = false;
                urVar2.f28887f = true;
                urVar2.h.run();
                return;
        }
    }
}
