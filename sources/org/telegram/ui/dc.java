package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class dc extends pg.a {
    public final String f36132c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f36133f;
    public final int f36134g;

    public dc(int i10, String str) {
        super(i10, false);
        this.f36132c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36133f;
        if (this == obj) {
            return true;
        }
        if (obj == null || dc.class != obj.getClass()) {
            return false;
        }
        dc dcVar = (dc) obj;
        TL_stories.Boost boost = dcVar.d;
        boolean z11 = dcVar.f36133f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = dcVar.e) != null) {
            if (prepaidGiveaway2.f20505id == prepaidGiveaway.f20505id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20501id.hashCode() == boost.f20501id.hashCode() && z10 == z11 && this.f36134g == dcVar.f36134g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36132c, this.d, this.e, Boolean.valueOf(this.f36133f), Integer.valueOf(this.f36134g));
    }

    public dc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36133f = z10;
        this.f36134g = i10;
    }
}
