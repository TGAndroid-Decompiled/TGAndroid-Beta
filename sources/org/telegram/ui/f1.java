package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class f1 extends s4.n0 {
    public final l1 f32663a;

    public f1(l1 l1Var) {
        this.f32663a = l1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof e2;
        l1 l1Var = this.f32663a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) l1Var.v.f34187b.get(((e2) view).N);
        } else if (view instanceof y2) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) l1Var.v.f34187b.get(((y2) view).L);
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
            int size = l1Var.v.f34186a.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) l1Var.v.f34186a.get(i10);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.a2.z(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f14642ph), dp2);
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
