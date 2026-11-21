package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f36062a;
    public final EditTextBoldCursor f36063b;

    public i(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f36062a = i7;
        this.f36063b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36062a) {
            case 0:
                this.f36063b.setText("");
                return;
            default:
                this.f36063b.setText("");
                return;
        }
    }
}
