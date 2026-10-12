package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ec extends og.a {
    public final String f37057c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f37058e;
    public boolean f37059f;
    public final int f37060g;

    public ec(int i10, String str) {
        super(i10, false);
        this.f37057c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f37059f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ec.class != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        TL_stories.Boost boost = ecVar.d;
        boolean z11 = ecVar.f37059f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f37058e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ecVar.f37058e) != null) {
            if (prepaidGiveaway2.f20040id == prepaidGiveaway.f20040id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20036id.hashCode() == boost.f20036id.hashCode() && z10 == z11 && this.f37060g == ecVar.f37060g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37057c, this.d, this.f37058e, Boolean.valueOf(this.f37059f), Integer.valueOf(this.f37060g));
    }

    public ec(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f37059f = z10;
        this.f37060g = i10;
    }
}
