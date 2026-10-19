package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class g1 extends s4.m0 {
    public final m1 f37161a;

    public g1(m1 m1Var) {
        this.f37161a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        float[] fArr;
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof f2;
        m1 m1Var = this.f37161a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.f38712b.get(((f2) view).N);
        } else if (view instanceof z2) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.f38712b.get(((z2) view).L);
        } else {
            groupedMessagePosition = null;
        }
        if (groupedMessagePosition != null && groupedMessagePosition.siblingHeights != null) {
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= groupedMessagePosition.siblingHeights.length) {
                    break;
                }
                i12 += (int) Math.ceil(fArr[i11] * max);
                i11++;
            }
            int dp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + i12;
            int size = m1Var.v.f38711a.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) m1Var.v.f38711a.get(i10);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.g0.A(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f17796ph), dp2);
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
