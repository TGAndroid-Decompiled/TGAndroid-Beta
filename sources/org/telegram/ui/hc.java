package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class hc extends pg.a {
    public final String f36721c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f36722f;
    public final int f36723g;

    public hc(int i10, String str) {
        super(i10, false);
        this.f36721c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36722f;
        if (this == obj) {
            return true;
        }
        if (obj == null || hc.class != obj.getClass()) {
            return false;
        }
        hc hcVar = (hc) obj;
        TL_stories.Boost boost = hcVar.d;
        boolean z11 = hcVar.f36722f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = hcVar.e) != null) {
            if (prepaidGiveaway2.f19450id == prepaidGiveaway.f19450id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19446id.hashCode() == boost.f19446id.hashCode() && z10 == z11 && this.f36723g == hcVar.f36723g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36721c, this.d, this.e, Boolean.valueOf(this.f36722f), Integer.valueOf(this.f36723g));
    }

    public hc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36722f = z10;
        this.f36723g = i10;
    }
}
