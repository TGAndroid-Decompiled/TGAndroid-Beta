package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Comparator {
    public final int f19986a;

    public j(int i10) {
        this.f19986a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f19986a) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
        }
    }
}
