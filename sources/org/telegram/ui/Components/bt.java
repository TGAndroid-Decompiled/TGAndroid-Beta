package org.telegram.ui.Components;

import java.util.ArrayList;
public final class bt implements Runnable {
    public final int f32344a;
    public final EditTextBoldCursor f32345b;

    public bt(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f32344a = i7;
        this.f32345b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f32344a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f32345b;
                int i7 = 0;
                editTextBoldCursor.f33090y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f33080a;
                if (!arrayList.isEmpty()) {
                    ((xh.f) arrayList.get(0)).f58803q = new bt(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((xh.f) obj).j(editTextBoldCursor.f33088w, editTextBoldCursor.f33089x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f32345b;
                editTextBoldCursor2.post(new bt(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f32345b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f32345b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f32345b);
                return;
            case 5:
                org.telegram.messenger.g0.K3(this.f32345b);
                return;
            case 6:
                org.telegram.messenger.g0.K3(this.f32345b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f32345b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f32345b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.K3(editTextBoldCursor4);
                return;
        }
    }
}
