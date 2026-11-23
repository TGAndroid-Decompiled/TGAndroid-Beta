package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f36056a;
    public final EditTextBoldCursor f36057b;

    public i(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f36056a = i7;
        this.f36057b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36056a) {
            case 0:
                this.f36057b.setText("");
                return;
            default:
                this.f36057b.setText("");
                return;
        }
    }
}
