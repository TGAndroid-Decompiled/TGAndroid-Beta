package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class s9 extends Path {
    public static ArrayList d;
    public float f22312a;
    public ArrayList f22313b;
    public int f22314c;

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
        this.f22313b.add(rectF);
        this.f22314c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f22312a) {
            this.f22312a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f22313b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f22314c = 0;
        this.f22312a = 0.0f;
    }
}
