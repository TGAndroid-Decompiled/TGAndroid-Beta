package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f35392c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f35393e;
    public boolean f35394f;
    public final int f35395g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f35392c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f35394f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f35394f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f35393e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.f35393e) != null) {
            if (prepaidGiveaway2.f20283id == prepaidGiveaway.f20283id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20279id.hashCode() == boost.f20279id.hashCode() && z10 == z11 && this.f35395g == ccVar.f35395g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35392c, this.d, this.f35393e, Boolean.valueOf(this.f35394f), Integer.valueOf(this.f35395g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f35394f = z10;
        this.f35395g = i10;
    }
}
