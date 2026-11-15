package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ht implements Runnable {
    public final int f35343a;
    public final EditTextBoldCursor f35344b;

    public ht(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f35343a = i7;
        this.f35344b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35343a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f35344b;
                int i7 = 0;
                editTextBoldCursor.f36626y = false;
                editTextBoldCursor.d = false;
                editTextBoldCursor.h();
                ArrayList arrayList = editTextBoldCursor.f36616a;
                if (!arrayList.isEmpty()) {
                    ((xh.f) arrayList.get(0)).f59995q = new ht(editTextBoldCursor, 1);
                    float sqrt = (float) Math.sqrt(Math.pow(editTextBoldCursor.getHeight(), 2.0d) + Math.pow(editTextBoldCursor.getWidth(), 2.0d));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((xh.f) obj).j(editTextBoldCursor.f36624w, editTextBoldCursor.f36625x, sqrt, true);
                    }
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f35344b;
                editTextBoldCursor2.post(new ht(editTextBoldCursor2, 2));
                return;
            case 2:
                this.f35344b.j(false, true);
                return;
            case 3:
                org.telegram.messenger.g0.J3(this.f35344b);
                return;
            case 4:
                org.telegram.messenger.g0.J3(this.f35344b);
                return;
            case 5:
                org.telegram.messenger.g0.J3(this.f35344b);
                return;
            case 6:
                org.telegram.messenger.g0.J3(this.f35344b);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor3 = this.f35344b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor3);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor4 = this.f35344b;
                editTextBoldCursor4.requestFocus();
                editTextBoldCursor4.setSelection(0, editTextBoldCursor4.length());
                org.telegram.messenger.g0.J3(editTextBoldCursor4);
                return;
        }
    }
}
