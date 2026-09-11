package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class aj0 extends s4.n0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessagePosition currentPosition;
        int i10 = 0;
        rect.bottom = 0;
        if ((view instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = (t1Var = (org.telegram.ui.Cells.t1) view).getCurrentMessagesGroup()) != null && (currentPosition = t1Var.getCurrentPosition()) != null && currentPosition.siblingHeights != null) {
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            int extraInsetHeight = t1Var.getExtraInsetHeight();
            int i11 = 0;
            while (true) {
                float[] fArr = currentPosition.siblingHeights;
                if (i11 >= fArr.length) {
                    break;
                }
                extraInsetHeight += (int) Math.ceil(fArr[i11] * max);
                i11++;
            }
            int round = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
            int size = currentMessagesGroup.posArray.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i10);
                    byte b10 = groupedMessagePosition.minY;
                    byte b11 = currentPosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b10 != b11 || groupedMessagePosition.maxY != currentPosition.maxY) && b10 == b11)) {
                        round = org.telegram.messenger.w1.z(4.0f, (int) Math.ceil(max * groupedMessagePosition.f17077ph), round);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            rect.bottom = -round;
        }
    }
}
