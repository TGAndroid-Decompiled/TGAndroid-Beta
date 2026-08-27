package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class h1 extends f2.w0 {

    public final n1 f38657a;

    public h1(n1 n1Var) {
        this.f38657a = n1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        rect.bottom = 0;
        boolean z10 = view instanceof g2;
        n1 n1Var = this.f38657a;
        MessageObject.GroupedMessagePosition groupedMessagePosition = z10 ? (MessageObject.GroupedMessagePosition) n1Var.v.f40283b.get(((g2) view).J) : view instanceof b3 ? (MessageObject.GroupedMessagePosition) n1Var.v.f40283b.get(((b3) view).H) : null;
        if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float fMax = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int iCeil = 0;
        while (true) {
            float[] fArr = groupedMessagePosition.siblingHeights;
            if (i10 >= fArr.length) {
                break;
            }
            iCeil += (int) Math.ceil(fArr[i10] * fMax);
            i10++;
        }
        int iDp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + iCeil;
        int size = n1Var.v.f40282a.size();
        for (int i11 = 0; i11 < size; i11++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) n1Var.v.f40282a.get(i11);
            byte b10 = groupedMessagePosition2.minY;
            byte b11 = groupedMessagePosition.minY;
            if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                iDp2 = org.telegram.messenger.y1.A(4.0f, (int) Math.ceil(fMax * groupedMessagePosition2.f19619ph), iDp2);
                break;
            }
        }
        rect.bottom = -iDp2;
    }
}
