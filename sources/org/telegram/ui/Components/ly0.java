package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

public interface ly0 extends org.telegram.ui.Cells.u9 {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i10);

    void setX(int i10);

    void setY(int i10);
}
