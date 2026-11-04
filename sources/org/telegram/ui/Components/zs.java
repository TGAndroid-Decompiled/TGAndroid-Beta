package org.telegram.ui.Components;

import java.util.ArrayList;
public final class zs implements Runnable {
    public final int f41095a;
    public final EditTextBoldCursor f41096b;

    public zs(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f41095a = i3;
        this.f41096b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f41095a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f41096b;
                int i3 = 0;
                editTextBoldCursor.f32392y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f32382a;
                if (!arrayList.isEmpty()) {
                    ((yh.f) arrayList.get(0)).f59521q = new zs(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((yh.f) obj).j(editTextBoldCursor.f32390w, editTextBoldCursor.f32391x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f41096b;
                editTextBoldCursor2.post(new zs(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f41096b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f41096b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f41096b);
                return;
            case 5:
                org.telegram.messenger.g0.K3(this.f41096b);
                return;
            case 6:
                org.telegram.messenger.g0.K3(this.f41096b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f41096b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f41096b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.K3(editTextBoldCursor4);
                return;
        }
    }
}
