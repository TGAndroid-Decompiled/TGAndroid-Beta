package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class h1 extends f2.v0 {
    public final n1 f38716a;

    public h1(n1 n1Var) {
        this.f38716a = n1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof g2;
        n1 n1Var = this.f38716a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) n1Var.v.f40338b.get(((g2) view).J);
        } else if (view instanceof b3) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) n1Var.v.f40338b.get(((b3) view).H);
        } else {
            groupedMessagePosition = null;
        }
        if (groupedMessagePosition != null && groupedMessagePosition.siblingHeights != null) {
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                float[] fArr = groupedMessagePosition.siblingHeights;
                if (i11 >= fArr.length) {
                    break;
                }
                i12 += (int) Math.ceil(fArr[i11] * max);
                i11++;
            }
            int dp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + i12;
            int size = n1Var.v.f40337a.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) n1Var.v.f40337a.get(i10);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.x3.z(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f19617ph), dp2);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            rect.bottom = -dp2;
        }
    }
}
