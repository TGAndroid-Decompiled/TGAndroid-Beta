package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f36010a;
    public final EditTextBoldCursor f36011b;

    public i(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f36010a = i7;
        this.f36011b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36010a) {
            case 0:
                this.f36011b.setText("");
                return;
            default:
                this.f36011b.setText("");
                return;
        }
    }
}
