package org.telegram.tgnet;

import kg.j1;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i7, boolean z10) {
        TLDataSourceType tLDataSourceType;
        if (inputSerializedData != null) {
            tLDataSourceType = inputSerializedData.getDataSourceType();
        } else {
            tLDataSourceType = null;
        }
        boolean z11 = false;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i7), str, tLDataSourceType));
        if (i7 != -847714938) {
            z11 = true;
        }
        a8.g(tLParseException, z11);
        if (i7 != -847714938 && i7 != -779361553 && i7 != -212046591) {
            g0.h3(new j1(tLParseException, 27));
        }
        if (!z10) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        ns.e().k(ns.M5, tLParseException);
    }
}
