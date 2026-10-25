package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
public interface da {
    Layout getLayout();

    CharSequence getPrefix();

    int getRow();

    Rect getSelectionBounds();

    CharSequence getText();

    int getX();

    int getY();
}
