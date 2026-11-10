package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements Comparator {
    public final int f27151a;

    public i(int i7) {
        this.f27151a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f27151a) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
        }
    }
}
