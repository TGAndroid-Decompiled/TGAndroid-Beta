package org.telegram.ui.Stories.recorder;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;

public final class CollageLayout {
    public static ArrayList layouts;
    public final int[] columns;
    public final int h;
    public final ArrayList parts = new ArrayList();
    public final String src;
    public final int w;

    public final class Part {
        public final CollageLayout layout;
        public final int x;
        public final int y;

        public Part(CollageLayout collageLayout, int i, int i2) {
            this.layout = collageLayout;
            this.x = i;
            this.y = i2;
        }
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
                this.parts.add(new Part(this, i3, i2));
            }
        }
    }

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

    public static int getMaxCount() {
        ArrayList layouts2 = getLayouts();
        int size = layouts2.size();
        int i = 0;
        int iMax = 0;
        while (i < size) {
            Object obj = layouts2.get(i);
            i++;
            iMax = Math.max(iMax, ((CollageLayout) obj).parts.size());
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CollageLayout)) {
            return false;
        }
        return TextUtils.equals(this.src, ((CollageLayout) obj).src);
    }

    public final String toString() {
        return this.src;
    }
}
