package org.telegram.tgnet;

import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i10, boolean z10) {
        TLDataSourceType tLDataSourceType;
        if (inputSerializedData != null) {
            tLDataSourceType = inputSerializedData.getDataSourceType();
        } else {
            tLDataSourceType = null;
        }
        boolean z11 = false;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i10), str, tLDataSourceType));
        if (i10 != -847714938) {
            z11 = true;
        }
        f8.g(tLParseException, z11);
        if (i10 != -847714938 && i10 != -779361553 && i10 != -212046591) {
            i0.g3(new lg.s(tLParseException, 14));
        }
        if (!z10) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        zs.e().k(zs.M5, tLParseException);
    }
}
