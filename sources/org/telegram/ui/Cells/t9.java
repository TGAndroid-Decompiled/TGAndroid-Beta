package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class t9 extends Path {
    public static ArrayList d;
    public float f22375a;
    public ArrayList f22376b;
    public int f22377c;

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
        this.f22376b.add(rectF);
        this.f22377c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f22375a) {
            this.f22375a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f22376b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f22377c = 0;
        this.f22375a = 0.0f;
    }
}
