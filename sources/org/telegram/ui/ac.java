package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends og.a {
    public final String f32093c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32094f;
    public final int f32095g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f32093c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32094f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z11 = acVar.f32094f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.e) != null) {
            if (prepaidGiveaway2.f18569id == prepaidGiveaway.f18569id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18565id.hashCode() == boost.f18565id.hashCode() && z10 == z11 && this.f32095g == acVar.f32095g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32093c, this.d, this.e, Boolean.valueOf(this.f32094f), Integer.valueOf(this.f32095g));
    }

    public ac(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32094f = z10;
        this.f32095g = i10;
    }
}
