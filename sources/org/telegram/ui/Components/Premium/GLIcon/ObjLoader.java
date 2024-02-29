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

    public ObjLoader(Context context, String str) {
        float f;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            DataInputStream dataInputStream = new DataInputStream(context.getAssets().open(str));
            int readInt = dataInputStream.readInt();
            int i2 = 0;
            for (int i3 = 0; i3 < readInt; i3++) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt2 = dataInputStream.readInt();
            for (int i4 = 0; i4 < readInt2; i4++) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt3 = dataInputStream.readInt();
            for (int i5 = 0; i5 < readInt3; i5++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt4 = dataInputStream.readInt();
            this.numFaces = readInt4;
            this.normals = new float[readInt4 * 3];
            this.textureCoordinates = new float[readInt4 * 2];
            this.positions = new float[readInt4 * 3];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i2 < readInt4) {
                int readInt5 = dataInputStream.readInt() * 3;
                int i9 = i6 + 1;
                int i10 = readInt5 + 1;
                this.positions[i6] = ((Float) arrayList.get(readInt5)).floatValue();
                int i11 = i9 + 1;
                this.positions[i9] = ((Float) arrayList.get(i10)).floatValue();
                int i12 = i11 + 1;
                this.positions[i11] = ((Float) arrayList.get(i10 + 1)).floatValue();
                int readInt6 = dataInputStream.readInt() * 2;
                float[] fArr = this.textureCoordinates;
                int i13 = i7 + 1;
                float f2 = 0.0f;
                if (readInt6 >= 0 && readInt6 < arrayList3.size()) {
                    f = ((Float) arrayList3.get(readInt6)).floatValue();
                    fArr[i7] = f;
                    i = readInt6 + 1;
                    float[] fArr2 = this.textureCoordinates;
                    int i14 = i13 + 1;
                    if (i >= 0 && i < arrayList3.size()) {
                        f2 = 1.0f - ((Float) arrayList3.get(i)).floatValue();
                    }
                    fArr2[i13] = f2;
                    int readInt7 = dataInputStream.readInt() * 3;
                    int i15 = i8 + 1;
                    int i16 = readInt7 + 1;
                    this.normals[i8] = ((Float) arrayList2.get(readInt7)).floatValue();
                    int i17 = i15 + 1;
                    this.normals[i15] = ((Float) arrayList2.get(i16)).floatValue();
                    int i18 = i17 + 1;
                    this.normals[i17] = ((Float) arrayList2.get(i16 + 1)).floatValue();
                    i2++;
                    i7 = i14;
                    i8 = i18;
                    i6 = i12;
                }
                f = 0.0f;
                fArr[i7] = f;
                i = readInt6 + 1;
                float[] fArr22 = this.textureCoordinates;
                int i142 = i13 + 1;
                if (i >= 0) {
                    f2 = 1.0f - ((Float) arrayList3.get(i)).floatValue();
                }
                fArr22[i13] = f2;
                int readInt72 = dataInputStream.readInt() * 3;
                int i152 = i8 + 1;
                int i162 = readInt72 + 1;
                this.normals[i8] = ((Float) arrayList2.get(readInt72)).floatValue();
                int i172 = i152 + 1;
                this.normals[i152] = ((Float) arrayList2.get(i162)).floatValue();
                int i182 = i172 + 1;
                this.normals[i172] = ((Float) arrayList2.get(i162 + 1)).floatValue();
                i2++;
                i7 = i142;
                i8 = i182;
                i6 = i12;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
