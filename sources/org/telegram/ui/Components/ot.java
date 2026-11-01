package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ot implements Runnable {
    public final int f29227a;
    public final EditTextBoldCursor f29228b;

    public ot(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f29227a = i10;
        this.f29228b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f29227a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f29228b;
                int i10 = 0;
                editTextBoldCursor.f29795y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f29786a;
                if (!arrayList.isEmpty()) {
                    ((nh.i) arrayList.get(0)).f13853q = new ot(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((nh.i) obj).j(editTextBoldCursor.f29793w, editTextBoldCursor.f29794x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f29228b;
                editTextBoldCursor2.post(new ot(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f29228b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.i0.J3(this.f29228b);
                return;
            case 4:
                org.telegram.messenger.i0.J3(this.f29228b);
                return;
            case 5:
                org.telegram.messenger.i0.J3(this.f29228b);
                return;
            case 6:
                org.telegram.messenger.i0.J3(this.f29228b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f29228b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f29228b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.i0.J3(editTextBoldCursor4);
                return;
        }
    }
}
