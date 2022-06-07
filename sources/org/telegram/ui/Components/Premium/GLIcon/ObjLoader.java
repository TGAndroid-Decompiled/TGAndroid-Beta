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
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            DataInputStream dataInputStream = new DataInputStream(context.getAssets().open(str));
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt2 = dataInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt3 = dataInputStream.readInt();
            for (int i3 = 0; i3 < readInt3; i3++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt4 = dataInputStream.readInt();
            this.numFaces = readInt4;
            this.normals = new float[readInt4 * 3];
            this.textureCoordinates = new float[readInt4 * 2];
            this.positions = new float[readInt4 * 3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < readInt4; i7++) {
                int readInt5 = dataInputStream.readInt() * 3;
                int i8 = i4 + 1;
                int i9 = readInt5 + 1;
                this.positions[i4] = ((Float) arrayList.get(readInt5)).floatValue();
                int i10 = i8 + 1;
                this.positions[i8] = ((Float) arrayList.get(i9)).floatValue();
                i4 = i10 + 1;
                this.positions[i10] = ((Float) arrayList.get(i9 + 1)).floatValue();
                int readInt6 = dataInputStream.readInt() * 2;
                int i11 = i5 + 1;
                this.textureCoordinates[i5] = ((Float) arrayList3.get(readInt6)).floatValue();
                i5 = i11 + 1;
                this.textureCoordinates[i11] = 1.0f - ((Float) arrayList3.get(readInt6 + 1)).floatValue();
                int readInt7 = dataInputStream.readInt() * 3;
                int i12 = i6 + 1;
                int i13 = readInt7 + 1;
                this.normals[i6] = ((Float) arrayList2.get(readInt7)).floatValue();
                int i14 = i12 + 1;
                this.normals[i12] = ((Float) arrayList2.get(i13)).floatValue();
                i6 = i14 + 1;
                this.normals[i14] = ((Float) arrayList2.get(i13 + 1)).floatValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
