package org.telegram.ui.Components;

import java.util.ArrayList;
public final class bt implements Runnable {
    public final int f32406a;
    public final EditTextBoldCursor f32407b;

    public bt(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f32406a = i7;
        this.f32407b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f32406a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f32407b;
                int i7 = 0;
                editTextBoldCursor.f33161y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f33151a;
                if (!arrayList.isEmpty()) {
                    ((xh.f) arrayList.get(0)).f58813q = new bt(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((xh.f) obj).j(editTextBoldCursor.f33159w, editTextBoldCursor.f33160x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f32407b;
                editTextBoldCursor2.post(new bt(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f32407b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f32407b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f32407b);
                return;
            case 5:
                org.telegram.messenger.g0.K3(this.f32407b);
                return;
            case 6:
                org.telegram.messenger.g0.K3(this.f32407b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f32407b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f32407b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.K3(editTextBoldCursor4);
                return;
        }
    }
}
