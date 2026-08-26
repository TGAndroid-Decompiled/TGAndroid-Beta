package org.telegram.tgnet;

import java.util.Comparator;

public final class ConnectionsManager$GoogleDnsLoadTask$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;

    public ConnectionsManager$GoogleDnsLoadTask$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
            default:
                return ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
        }
    }
}
