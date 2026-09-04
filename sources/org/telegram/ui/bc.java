package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f34726c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f34727e;
    public boolean f34728f;
    public final int f34729g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f34726c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f34728f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f34728f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f34727e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f34727e) != null) {
            if (prepaidGiveaway2.f20106id == prepaidGiveaway.f20106id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20102id.hashCode() == boost.f20102id.hashCode() && z10 == z11 && this.f34729g == bcVar.f34729g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34726c, this.d, this.f34727e, Boolean.valueOf(this.f34728f), Integer.valueOf(this.f34729g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f34728f = z10;
        this.f34729g = i10;
    }
}
