package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends og.a {
    public final String f35997c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f35998e;
    public boolean f35999f;
    public final int f36000g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f35997c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f35999f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z11 = acVar.f35999f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f35998e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.f35998e) != null) {
            if (prepaidGiveaway2.f20268id == prepaidGiveaway.f20268id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20264id.hashCode() == boost.f20264id.hashCode() && z10 == z11 && this.f36000g == acVar.f36000g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35997c, this.d, this.f35998e, Boolean.valueOf(this.f35999f), Integer.valueOf(this.f36000g));
    }

    public ac(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f35999f = z10;
        this.f36000g = i10;
    }
}
