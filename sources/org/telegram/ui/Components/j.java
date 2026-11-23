package org.telegram.ui.Components;

import java.util.ArrayList;
public final class j implements Runnable {
    public final int f36336a;
    public final EditTextBoldCursor f36337b;

    public j(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f36336a = i7;
        this.f36337b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36336a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f36337b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36337b;
                int i7 = 0;
                editTextBoldCursor.f39347y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f39337a;
                if (!arrayList.isEmpty()) {
                    ((xh.f) arrayList.get(0)).f60606q = new j(editTextBoldCursor, 2);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((xh.f) obj).j(editTextBoldCursor.f39345w, editTextBoldCursor.f39346x, sqrt, true);
                    }
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36337b;
                editTextBoldCursor2.post(new j(editTextBoldCursor2, 3));
                return;
            case 3:
                this.f36337b.j(false, true);
                return;
            case 4:
                org.telegram.messenger.g0.I3(this.f36337b);
                return;
            case 5:
                org.telegram.messenger.g0.I3(this.f36337b);
                return;
            case 6:
                org.telegram.messenger.g0.I3(this.f36337b);
                return;
            case 7:
                org.telegram.messenger.g0.I3(this.f36337b);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor3 = this.f36337b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f36337b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.I3(editTextBoldCursor4);
                return;
        }
    }
}
