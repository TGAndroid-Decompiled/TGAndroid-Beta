package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Comparator {
    public final int f19985a;

    public j(int i10) {
        this.f19985a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f19985a) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.b(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.a(str, str2);
        }
    }
}
