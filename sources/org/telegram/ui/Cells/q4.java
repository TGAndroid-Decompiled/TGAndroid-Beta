package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q4 extends FrameLayout {
    public TextView f22490a;

    public void setCellHeight(int i10) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i10));
    }

    public void setLetter(String str) {
        this.f22490a.setText(str.toUpperCase());
    }
}
