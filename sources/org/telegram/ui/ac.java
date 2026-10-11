package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends og.a {
    public final String f36031c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f36032e;
    public boolean f36033f;
    public final int f36034g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f36031c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36033f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z11 = acVar.f36033f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f36032e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.f36032e) != null) {
            if (prepaidGiveaway2.f20304id == prepaidGiveaway.f20304id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20300id.hashCode() == boost.f20300id.hashCode() && z10 == z11 && this.f36034g == acVar.f36034g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36031c, this.d, this.f36032e, Boolean.valueOf(this.f36033f), Integer.valueOf(this.f36034g));
    }

    public ac(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36033f = z10;
        this.f36034g = i10;
    }
}
