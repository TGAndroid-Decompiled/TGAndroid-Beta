package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class dc extends ng.a {
    public final String f31879c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f31880f;
    public final int f31881g;

    public dc(int i10, String str) {
        super(i10, false);
        this.f31879c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f31880f;
        if (this == obj) {
            return true;
        }
        if (obj == null || dc.class != obj.getClass()) {
            return false;
        }
        dc dcVar = (dc) obj;
        TL_stories.Boost boost = dcVar.d;
        boolean z11 = dcVar.f31880f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = dcVar.e) != null) {
            if (prepaidGiveaway2.f17434id == prepaidGiveaway.f17434id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f17430id.hashCode() == boost.f17430id.hashCode() && z10 == z11 && this.f31881g == dcVar.f31881g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f31879c, this.d, this.e, Boolean.valueOf(this.f31880f), Integer.valueOf(this.f31881g));
    }

    public dc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f31880f = z10;
        this.f31881g = i10;
    }
}
