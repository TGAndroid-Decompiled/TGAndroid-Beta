package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Comparator {
    public final int f20060a;

    public j(int i10) {
        this.f20060a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$doInBackground$0;
        int lambda$doInBackground$02;
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f20060a) {
            case 0:
                lambda$doInBackground$0 = ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
                return lambda$doInBackground$0;
            default:
                lambda$doInBackground$02 = ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
                return lambda$doInBackground$02;
        }
    }
}
