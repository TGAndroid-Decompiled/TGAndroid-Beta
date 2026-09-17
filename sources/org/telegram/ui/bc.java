package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f34727c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f34728e;
    public boolean f34729f;
    public final int f34730g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f34727c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f34729f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f34729f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f34728e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f34728e) != null) {
            if (prepaidGiveaway2.f20105id == prepaidGiveaway.f20105id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20101id.hashCode() == boost.f20101id.hashCode() && z10 == z11 && this.f34730g == bcVar.f34730g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34727c, this.d, this.f34728e, Boolean.valueOf(this.f34729f), Integer.valueOf(this.f34730g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f34729f = z10;
        this.f34730g = i10;
    }
}
