package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class r9 extends Path {
    public static ArrayList d;
    public float f25246a;
    public ArrayList f25247b;
    public int f25248c;

    @Override
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f9, f10, f11, f12);
        this.f25247b.add(rectF);
        this.f25248c++;
        super.addRect(f9, f10, f11, f12, direction);
        if (f12 > this.f25246a) {
            this.f25246a = f12;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f25247b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f25248c = 0;
        this.f25246a = 0.0f;
    }
}
