package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f35399c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f35400e;
    public boolean f35401f;
    public final int f35402g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f35399c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f35401f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f35401f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f35400e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.f35400e) != null) {
            if (prepaidGiveaway2.f20273id == prepaidGiveaway.f20273id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20269id.hashCode() == boost.f20269id.hashCode() && z10 == z11 && this.f35402g == ccVar.f35402g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35399c, this.d, this.f35400e, Boolean.valueOf(this.f35401f), Integer.valueOf(this.f35402g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f35401f = z10;
        this.f35402g = i10;
    }
}
