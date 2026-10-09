package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends og.a {
    public final String f36240c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f36241e;
    public boolean f36242f;
    public final int f36243g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f36240c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36242f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f36242f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f36241e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f36241e) != null) {
            if (prepaidGiveaway2.f20274id == prepaidGiveaway.f20274id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20270id.hashCode() == boost.f20270id.hashCode() && z10 == z11 && this.f36243g == bcVar.f36243g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36240c, this.d, this.f36241e, Boolean.valueOf(this.f36242f), Integer.valueOf(this.f36243g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36242f = z10;
        this.f36243g = i10;
    }
}
