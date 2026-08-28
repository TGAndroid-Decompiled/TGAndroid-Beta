package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r4 extends FrameLayout {
    public TextView f25087a;

    public void setCellHeight(int i9) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i9));
    }

    public void setLetter(String str) {
        this.f25087a.setText(str.toUpperCase());
    }
}
