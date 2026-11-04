package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l40 implements Comparator {
    public static String a(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            return org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
        } else if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        } else {
            return "";
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return a((TLObject) obj).compareTo(a((TLObject) obj2));
    }
}
