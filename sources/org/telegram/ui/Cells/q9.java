package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class q9 extends Path {
    public static ArrayList d;
    public float f31299a;
    public ArrayList f31300b;
    public int f31301c;

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
        this.f31300b.add(rectF);
        this.f31301c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f31299a) {
            this.f31299a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f31300b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f31301c = 0;
        this.f31299a = 0.0f;
    }
}
