package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class u9 extends Path {
    public static ArrayList d;
    public float f25766a;
    public ArrayList f25767b;
    public int f25768c;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f10, f11, f12, f13);
        this.f25767b.add(rectF);
        this.f25768c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f25766a) {
            this.f25766a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f25767b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f25768c = 0;
        this.f25766a = 0.0f;
    }
}
