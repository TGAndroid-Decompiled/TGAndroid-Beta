package org.telegram.ui.Components.Premium.GLIcon;

import android.content.Context;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public final class ObjLoader {
    public float[] normals;
    public int numFaces;
    public float[] positions;
    public float[] textureCoordinates;

    public ObjLoader(Context context, String str, float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            DataInputStream dataInputStream = new DataInputStream(context.getAssets().open(str));
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int i3 = dataInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int i5 = dataInputStream.readInt();
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int i7 = dataInputStream.readInt();
            this.numFaces = i7;
            int i8 = i7 * 3;
            this.normals = new float[i8];
            this.textureCoordinates = new float[i7 * 2];
            this.positions = new float[i8];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = dataInputStream.readInt() * 3;
                this.positions[i9] = ((Float) arrayList.get(i13)).floatValue() * f;
                int i14 = i9 + 2;
                this.positions[i9 + 1] = ((Float) arrayList.get(i13 + 1)).floatValue() * f;
                i9 += 3;
                this.positions[i14] = ((Float) arrayList.get(i13 + 2)).floatValue() * f;
                int i15 = dataInputStream.readInt() * 2;
                int i16 = i10 + 1;
                float fFloatValue = 0.0f;
                this.textureCoordinates[i10] = (i15 < 0 || i15 >= arrayList3.size()) ? 0.0f : ((Float) arrayList3.get(i15)).floatValue();
                int i17 = i15 + 1;
                float[] fArr = this.textureCoordinates;
                i10 += 2;
                if (i17 >= 0 && i17 < arrayList3.size()) {
                    fFloatValue = 1.0f - ((Float) arrayList3.get(i17)).floatValue();
                }
                fArr[i16] = fFloatValue;
                int i18 = dataInputStream.readInt() * 3;
                this.normals[i11] = ((Float) arrayList2.get(i18)).floatValue();
                int i19 = i11 + 2;
                this.normals[i11 + 1] = ((Float) arrayList2.get(i18 + 1)).floatValue();
                i11 += 3;
                this.normals[i19] = ((Float) arrayList2.get(i18 + 2)).floatValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
