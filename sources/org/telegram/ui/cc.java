package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends qg.a {
    public final String f38423c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f38424f;
    public final int f38425g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f38423c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f38424f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f38424f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.e) != null) {
            if (prepaidGiveaway2.f22265id == prepaidGiveaway.f22265id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22261id.hashCode() == boost.f22261id.hashCode() && z10 == z11 && this.f38425g == ccVar.f38425g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38423c, this.d, this.e, Boolean.valueOf(this.f38424f), Integer.valueOf(this.f38425g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f38424f = z10;
        this.f38425g = i10;
    }
}
