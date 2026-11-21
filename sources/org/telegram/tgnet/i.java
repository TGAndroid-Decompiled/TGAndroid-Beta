package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements Comparator {
    public final int f28622a;

    public i(int i7) {
        this.f28622a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f28622a) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.b(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.a(str, str2);
        }
    }
}
