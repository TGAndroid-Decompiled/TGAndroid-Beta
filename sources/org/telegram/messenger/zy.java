package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class zy {
    public ui.a f26993a;
    public long f26994b;
    public boolean f26995c;
    public boolean d;
    public long f26996e;

    public zy(ui.a aVar) {
        this.f26993a = aVar;
    }

    public static zy a(int i3, SerializedData serializedData) {
        long j10;
        long j11;
        m2.p0 a10 = ui.a.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a10.f18961c = readString;
        a10.f18960b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.f18962e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a10.f18963f = str;
        int i10 = 2;
        if (i3 >= 2) {
            j10 = serializedData.readInt64(false);
            j11 = serializedData.readInt64(false);
        } else {
            j10 = 0;
            j11 = 0;
        }
        if (i3 >= 3) {
            a10.p(ui.a.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i10 = 1;
            }
            a10.p(i10);
        }
        zy zyVar = new zy(a10.d());
        zyVar.f26996e = j11;
        zyVar.f26994b = j10;
        if (j10 > 0) {
            z10 = true;
        }
        zyVar.d = z10;
        return zyVar;
    }
}
