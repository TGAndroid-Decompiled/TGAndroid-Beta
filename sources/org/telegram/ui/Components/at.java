package org.telegram.ui.Components;

import java.util.ArrayList;
public final class at implements Runnable {
    public final int f31893a;
    public final EditTextBoldCursor f31894b;

    public at(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f31893a = i7;
        this.f31894b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f31893a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f31894b;
                int i7 = 0;
                editTextBoldCursor.f32655y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f32645a;
                if (!arrayList.isEmpty()) {
                    ((xh.f) arrayList.get(0)).f58714q = new at(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((xh.f) obj).j(editTextBoldCursor.f32653w, editTextBoldCursor.f32654x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f31894b;
                editTextBoldCursor2.post(new at(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f31894b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f31894b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f31894b);
                return;
            case 5:
                org.telegram.messenger.g0.K3(this.f31894b);
                return;
            case 6:
                org.telegram.messenger.g0.K3(this.f31894b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f31894b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f31894b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.K3(editTextBoldCursor4);
                return;
        }
    }
}
