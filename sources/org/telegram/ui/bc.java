package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f34753c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f34754e;
    public boolean f34755f;
    public final int f34756g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f34753c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f34755f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f34755f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f34754e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f34754e) != null) {
            if (prepaidGiveaway2.f20133id == prepaidGiveaway.f20133id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20129id.hashCode() == boost.f20129id.hashCode() && z10 == z11 && this.f34756g == bcVar.f34756g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34753c, this.d, this.f34754e, Boolean.valueOf(this.f34755f), Integer.valueOf(this.f34756g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f34755f = z10;
        this.f34756g = i10;
    }
}
