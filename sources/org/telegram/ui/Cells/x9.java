package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class x9 extends Path {
    public static ArrayList d;
    public float f23574a;
    public ArrayList f23575b;
    public int f23576c;

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f7, f10, f11, f12);
        this.f23575b.add(rectF);
        this.f23576c++;
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f23574a) {
            this.f23574a = f12;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f23575b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f23576c = 0;
        this.f23574a = 0.0f;
    }
}
