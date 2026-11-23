package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class zo {
    public final String f28329a;
    public final String[] f28330b;
    public final String f28331c;
    public int d;

    public zo(String str, String[] strArr, String str2) {
        this.f28329a = str;
        this.f28330b = strArr;
        this.f28331c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        return this.f28329a.equals(((zo) obj).f28329a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f28329a);
        String[] strArr = this.f28330b;
        if (strArr != null) {
            i7 = strArr.length;
        } else {
            i7 = 0;
        }
        serializedData.writeInt32(i7);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.f28331c);
        return Utilities.f(serializedData.toByteArray());
    }
}
