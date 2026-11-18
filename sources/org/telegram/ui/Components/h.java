package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f35670a;
    public final EditTextBoldCursor f35671b;

    public h(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f35670a = i7;
        this.f35671b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35670a) {
            case 0:
                this.f35671b.setText("");
                return;
            default:
                this.f35671b.setText("");
                return;
        }
    }
}
