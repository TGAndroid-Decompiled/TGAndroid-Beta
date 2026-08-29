package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i30 extends f2.v0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        recyclerView.getClass();
        RecyclerView.R(view);
        if (!r50.B3) {
            rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        } else {
            rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        }
    }
}
