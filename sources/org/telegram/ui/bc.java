package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f35562c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f35563f;
    public final int f35564g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f35562c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f35563f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f35563f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.e) != null) {
            if (prepaidGiveaway2.f20506id == prepaidGiveaway.f20506id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20502id.hashCode() == boost.f20502id.hashCode() && z10 == z11 && this.f35564g == bcVar.f35564g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35562c, this.d, this.e, Boolean.valueOf(this.f35563f), Integer.valueOf(this.f35564g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f35563f = z10;
        this.f35564g = i10;
    }
}
