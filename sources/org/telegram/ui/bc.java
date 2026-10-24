package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f36008c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f36009f;
    public final int f36010g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f36008c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36009f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f36009f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.e) != null) {
            if (prepaidGiveaway2.f20577id == prepaidGiveaway.f20577id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20573id.hashCode() == boost.f20573id.hashCode() && z10 == z11 && this.f36010g == bcVar.f36010g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36008c, this.d, this.e, Boolean.valueOf(this.f36009f), Integer.valueOf(this.f36010g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36009f = z10;
        this.f36010g = i10;
    }
}
