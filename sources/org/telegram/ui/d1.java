package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class d1 extends s4.n0 {
    public final j1 f32922a;

    public d1(j1 j1Var) {
        this.f32922a = j1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof c2;
        j1 j1Var = this.f32922a;
        if (z10) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) j1Var.v.f34350b.get(((c2) view).N);
        } else if (view instanceof w2) {
            groupedMessagePosition = (MessageObject.GroupedMessagePosition) j1Var.v.f34350b.get(((w2) view).L);
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
            int size = j1Var.v.f34349a.size();
            while (true) {
                if (i10 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) j1Var.v.f34349a.get(i10);
                    byte b10 = groupedMessagePosition2.minY;
                    byte b11 = groupedMessagePosition.minY;
                    if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                        dp2 = org.telegram.messenger.l0.A(4.0f, (int) Math.ceil(max * groupedMessagePosition2.f15834ph), dp2);
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
