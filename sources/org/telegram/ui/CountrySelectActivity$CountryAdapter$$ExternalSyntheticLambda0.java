package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final Comparator f$0;

    public CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0(Comparator comparator, int i) {
        this.$r8$classId = i;
        this.f$0 = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.compare(((CountrySelectActivity.Country) obj).name, ((CountrySelectActivity.Country) obj2).name);
            case 1:
                return this.f$0.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
            default:
                return this.f$0.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
        }
    }
}
