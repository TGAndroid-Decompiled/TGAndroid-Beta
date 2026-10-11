package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class d1 extends s4.o0 {
    public final j1 f36866a;

    public d1(j1 j1Var) {
        this.f36866a = j1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        float[] fArr;
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof c2;
        j1 j1Var = this.f36866a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) j1Var.v.f38551b.get(((c2) view).N);
        } else if (view instanceof w2) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) j1Var.v.f38551b.get(((w2) view).L);
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
            int size = j1Var.v.f38550a.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) j1Var.v.f38550a.get(i10);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.q.A(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f17248ph), dp2);
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
