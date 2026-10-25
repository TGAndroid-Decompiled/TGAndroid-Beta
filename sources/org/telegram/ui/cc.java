package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends qg.a {
    public final String f38420c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f38421f;
    public final int f38422g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f38420c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f38421f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f38421f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.e) != null) {
            if (prepaidGiveaway2.f22263id == prepaidGiveaway.f22263id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22259id.hashCode() == boost.f22259id.hashCode() && z10 == z11 && this.f38422g == ccVar.f38422g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38420c, this.d, this.e, Boolean.valueOf(this.f38421f), Integer.valueOf(this.f38422g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f38421f = z10;
        this.f38422g = i10;
    }
}
