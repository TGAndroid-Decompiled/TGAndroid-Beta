package org.telegram.ui.Stories;

import java.util.List;
import org.telegram.messenger.Utilities;

public final class StoriesController$StoriesList$$ExternalSyntheticLambda5 implements Utilities.CallbackReturn {
    public final StoriesController.StoriesList f$0;
    public final boolean f$1;
    public final int f$2;
    public final List f$3;

    public StoriesController$StoriesList$$ExternalSyntheticLambda5(StoriesController.StoriesList storiesList, boolean z, int i, List list) {
        this.f$0 = storiesList;
        this.f$1 = z;
        this.f$2 = i;
        this.f$3 = list;
    }

    @Override
    public final Object run(Object obj) {
        return Boolean.valueOf(this.f$0.load(this.f$2, this.f$3, this.f$1));
    }
}
