package org.telegram.ui.Stories.recorder;

import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.BuildVars;

public class CollageLayout {
    private static ArrayList layouts;
    public final int[] columns;
    public final int h;
    public final ArrayList parts = new ArrayList();
    private final String src;
    public final int w;

    public static ArrayList getLayouts() {
        if (layouts == null) {
            ArrayList arrayList = new ArrayList();
            layouts = arrayList;
            arrayList.add(new CollageLayout("./."));
            layouts.add(new CollageLayout(".."));
            layouts.add(new CollageLayout("../."));
            layouts.add(new CollageLayout("./.."));
            layouts.add(new CollageLayout("././."));
            layouts.add(new CollageLayout("..."));
            layouts.add(new CollageLayout("../.."));
            layouts.add(new CollageLayout("./../.."));
            layouts.add(new CollageLayout("../../."));
            layouts.add(new CollageLayout("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                layouts.add(new CollageLayout("../../../.."));
                layouts.add(new CollageLayout(".../.../..."));
                layouts.add(new CollageLayout("..../..../...."));
                layouts.add(new CollageLayout(".../.../.../..."));
            }
        }
        return layouts;
    }

    public static CollageLayout of(int i) {
        Iterator it = getLayouts().iterator();
        while (it.hasNext()) {
            CollageLayout collageLayout = (CollageLayout) it.next();
            if (collageLayout.parts.size() >= i) {
                return collageLayout;
            }
        }
        return null;
    }

    public static int getMaxCount() {
        Iterator it = getLayouts().iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((CollageLayout) it.next()).parts.size());
        }
        return iMax;
    }

    public CollageLayout(String str) {
        str = str == null ? "." : str;
        this.src = str;
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        this.h = length;
        this.columns = new int[length];
        int iMax = 0;
        for (int i = 0; i < strArrSplit.length; i++) {
            this.columns[i] = strArrSplit[i].length();
            iMax = Math.max(iMax, strArrSplit[i].length());
        }
        this.w = iMax;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            for (int i3 = 0; i3 < strArrSplit[i2].length(); i3++) {
                this.parts.add(new Part(i3, i2));
            }
        }
    }

    public CollageLayout delete(int i) {
        if (i < 0 || i >= this.parts.size()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.parts);
        arrayList.remove(i);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Part part = (Part) arrayList.get(i3);
            if (part.y != i2) {
                sb.append("/");
                i2 = part.y;
            }
            sb.append(".");
        }
        return new CollageLayout(sb.toString());
    }

    public static class Part {
        public final CollageLayout layout;
        public final int x;
        public final int y;

        private Part(CollageLayout collageLayout, int i, int i2) {
            this.layout = collageLayout;
            this.x = i;
            this.y = i2;
        }

        public final float l(float f) {
            return (f / this.layout.columns[this.y]) * this.x;
        }

        public final float t(float f) {
            return (f / this.layout.h) * this.y;
        }

        public final float r(float f) {
            return (f / this.layout.columns[this.y]) * (this.x + 1);
        }

        public final float b(float f) {
            return (f / this.layout.h) * (this.y + 1);
        }

        public final float w(float f) {
            return f / this.layout.columns[this.y];
        }

        public final float h(float f) {
            return f / this.layout.h;
        }

        public final void bounds(RectF rectF, float f, float f2) {
            rectF.set(l(f), t(f2), r(f), b(f2));
        }
    }

    public String toString() {
        return this.src;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CollageLayout) {
            return TextUtils.equals(this.src, ((CollageLayout) obj).src);
        }
        return false;
    }
}
