package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f36055a;
    public final EditTextBoldCursor f36056b;

    public i(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f36055a = i7;
        this.f36056b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36055a) {
            case 0:
                this.f36056b.setText("");
                return;
            default:
                this.f36056b.setText("");
                return;
        }
    }
}
