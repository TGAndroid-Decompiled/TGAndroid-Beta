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
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt2 = dataInputStream.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt3 = dataInputStream.readInt();
            for (int i4 = 0; i4 < readInt3; i4++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt4 = dataInputStream.readInt();
            this.numFaces = readInt4;
            int i5 = readInt4 * 3;
            this.normals = new float[i5];
            this.textureCoordinates = new float[readInt4 * 2];
            this.positions = new float[i5];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < readInt4; i9++) {
                int readInt5 = dataInputStream.readInt() * 3;
                this.positions[i6] = ((Float) arrayList.get(readInt5)).floatValue();
                float[] fArr = this.positions;
                int i10 = i6 + 2;
                fArr[i6 + 1] = ((Float) arrayList.get(readInt5 + 1)).floatValue();
                i6 += 3;
                this.positions[i10] = ((Float) arrayList.get(readInt5 + 2)).floatValue();
                int readInt6 = dataInputStream.readInt() * 2;
                float[] fArr2 = this.textureCoordinates;
                int i11 = i7 + 1;
                float f2 = 0.0f;
                if (readInt6 >= 0 && readInt6 < arrayList3.size()) {
                    f = ((Float) arrayList3.get(readInt6)).floatValue();
                    fArr2[i7] = f;
                    i = readInt6 + 1;
                    float[] fArr3 = this.textureCoordinates;
                    i7 += 2;
                    if (i >= 0 && i < arrayList3.size()) {
                        f2 = 1.0f - ((Float) arrayList3.get(i)).floatValue();
                    }
                    fArr3[i11] = f2;
                    int readInt7 = dataInputStream.readInt() * 3;
                    this.normals[i8] = ((Float) arrayList2.get(readInt7)).floatValue();
                    float[] fArr4 = this.normals;
                    int i12 = i8 + 2;
                    fArr4[i8 + 1] = ((Float) arrayList2.get(readInt7 + 1)).floatValue();
                    i8 += 3;
                    this.normals[i12] = ((Float) arrayList2.get(readInt7 + 2)).floatValue();
                }
                f = 0.0f;
                fArr2[i7] = f;
                i = readInt6 + 1;
                float[] fArr32 = this.textureCoordinates;
                i7 += 2;
                if (i >= 0) {
                    f2 = 1.0f - ((Float) arrayList3.get(i)).floatValue();
                }
                fArr32[i11] = f2;
                int readInt72 = dataInputStream.readInt() * 3;
                this.normals[i8] = ((Float) arrayList2.get(readInt72)).floatValue();
                float[] fArr42 = this.normals;
                int i122 = i8 + 2;
                fArr42[i8 + 1] = ((Float) arrayList2.get(readInt72 + 1)).floatValue();
                i8 += 3;
                this.normals[i122] = ((Float) arrayList2.get(readInt72 + 2)).floatValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
