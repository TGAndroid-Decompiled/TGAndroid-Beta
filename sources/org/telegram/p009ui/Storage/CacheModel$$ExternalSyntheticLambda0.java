package org.telegram.p009ui.Storage;

import java.util.Comparator;
import org.telegram.p009ui.Storage.CacheModel;

public final class CacheModel$$ExternalSyntheticLambda0 implements Comparator {
    public static final CacheModel$$ExternalSyntheticLambda0 INSTANCE = new CacheModel$$ExternalSyntheticLambda0();

    private CacheModel$$ExternalSyntheticLambda0() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sort$0;
        lambda$sort$0 = CacheModel.lambda$sort$0((CacheModel.FileInfo) obj, (CacheModel.FileInfo) obj2);
        return lambda$sort$0;
    }
}
