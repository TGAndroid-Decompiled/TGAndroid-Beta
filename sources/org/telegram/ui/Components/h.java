package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f35580a;
    public final EditTextBoldCursor f35581b;

    public h(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f35580a = i7;
        this.f35581b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35580a) {
            case 0:
                this.f35581b.setText("");
                return;
            default:
                this.f35581b.setText("");
                return;
        }
    }
}
