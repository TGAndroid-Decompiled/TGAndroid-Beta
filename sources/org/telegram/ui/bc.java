package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends pg.a {
    public final String f34754c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f34755e;
    public boolean f34756f;
    public final int f34757g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f34754c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f34756f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f34756f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f34755e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.f34755e) != null) {
            if (prepaidGiveaway2.f20132id == prepaidGiveaway.f20132id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20128id.hashCode() == boost.f20128id.hashCode() && z10 == z11 && this.f34757g == bcVar.f34757g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34754c, this.d, this.f34755e, Boolean.valueOf(this.f34756f), Integer.valueOf(this.f34757g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f34756f = z10;
        this.f34757g = i10;
    }
}
