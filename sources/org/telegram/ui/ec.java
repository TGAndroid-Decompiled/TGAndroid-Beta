package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ec extends og.a {
    public final String f37061c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f37062e;
    public boolean f37063f;
    public final int f37064g;

    public ec(int i10, String str) {
        super(i10, false);
        this.f37061c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f37063f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ec.class != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        TL_stories.Boost boost = ecVar.d;
        boolean z11 = ecVar.f37063f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f37062e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ecVar.f37062e) != null) {
            if (prepaidGiveaway2.f20041id == prepaidGiveaway.f20041id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20037id.hashCode() == boost.f20037id.hashCode() && z10 == z11 && this.f37064g == ecVar.f37064g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37061c, this.d, this.f37062e, Boolean.valueOf(this.f37063f), Integer.valueOf(this.f37064g));
    }

    public ec(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f37063f = z10;
        this.f37064g = i10;
    }
}
