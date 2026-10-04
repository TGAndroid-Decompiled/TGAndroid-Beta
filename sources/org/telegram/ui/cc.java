package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f35405c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f35406e;
    public boolean f35407f;
    public final int f35408g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f35405c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f35407f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f35407f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f35406e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.f35406e) != null) {
            if (prepaidGiveaway2.f20278id == prepaidGiveaway.f20278id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20274id.hashCode() == boost.f20274id.hashCode() && z10 == z11 && this.f35408g == ccVar.f35408g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35405c, this.d, this.f35406e, Boolean.valueOf(this.f35407f), Integer.valueOf(this.f35408g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f35407f = z10;
        this.f35408g = i10;
    }
}
