package org.telegram.tgnet;

import java.util.Comparator;

public final class i implements Comparator {

    public final int f22568a;

    public i(int i10) {
        this.f22568a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f22568a) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
        }
    }
}
