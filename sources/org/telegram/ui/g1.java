package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class g1 extends f2.y0 {
    public final m1 f38407a;

    public g1(m1 m1Var) {
        this.f38407a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i9 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof f2;
        m1 m1Var = this.f38407a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.f39966b.get(((f2) view).J);
        } else if (view instanceof a3) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.f39966b.get(((a3) view).H);
        } else {
            groupedMessagePosition = null;
        }
        if (groupedMessagePosition != null && groupedMessagePosition.siblingHeights != null) {
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                float[] fArr = groupedMessagePosition.siblingHeights;
                if (i10 >= fArr.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int dp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + i11;
            int size = m1Var.v.f39965a.size();
            while (true) {
                if (i9 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) m1Var.v.f39965a.get(i9);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.l0.A(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f19646ph), dp2);
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            rect.bottom = -dp2;
        }
    }
}
