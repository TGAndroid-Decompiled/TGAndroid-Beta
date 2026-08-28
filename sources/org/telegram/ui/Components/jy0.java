package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public interface jy0 extends org.telegram.ui.Cells.y9 {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i9);

    void setX(int i9);

    void setY(int i9);
}
