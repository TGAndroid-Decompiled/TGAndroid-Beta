package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class pj extends f2.w0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessagePosition currentPosition;
        rect.bottom = 0;
        if (!(view instanceof org.telegram.ui.Cells.s1) || (currentMessagesGroup = (s1Var = (org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup()) == null || (currentPosition = s1Var.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float fMax = Math.max(point.x, point.y) * 0.5f;
        int extraInsetHeight = s1Var.getExtraInsetHeight();
        int i10 = 0;
        while (true) {
            float[] fArr = currentPosition.siblingHeights;
            if (i10 >= fArr.length) {
                break;
            }
            extraInsetHeight += (int) Math.ceil(fArr[i10] * fMax);
            i10++;
        }
        int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
        int size = currentMessagesGroup.posArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i11);
            byte b10 = groupedMessagePosition.minY;
            byte b11 = currentPosition.minY;
            if (b10 == b11 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b10 != b11 || groupedMessagePosition.maxY != currentPosition.maxY) && b10 == b11)) {
                iRound = org.telegram.messenger.y1.A(4.0f, (int) Math.ceil(fMax * groupedMessagePosition.f19619ph), iRound);
                break;
            }
        }
        rect.bottom = -iRound;
    }
}
