package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends og.a {
    public final String f36284c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f36285e;
    public boolean f36286f;
    public final int f36287g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f36284c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36286f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f36286f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f36285e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f36285e) != null) {
            if (prepaidGiveaway2.f20278id == prepaidGiveaway.f20278id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20274id.hashCode() == boost.f20274id.hashCode() && z10 == z11 && this.f36287g == bcVar.f36287g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36284c, this.d, this.f36285e, Boolean.valueOf(this.f36286f), Integer.valueOf(this.f36287g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36286f = z10;
        this.f36287g = i10;
    }
}
