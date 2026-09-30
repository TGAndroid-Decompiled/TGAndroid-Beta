package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends og.a {
    public final String f32096c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32097f;
    public final int f32098g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f32096c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32097f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z11 = acVar.f32097f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.e) != null) {
            if (prepaidGiveaway2.f18571id == prepaidGiveaway.f18571id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18567id.hashCode() == boost.f18567id.hashCode() && z10 == z11 && this.f32098g == acVar.f32098g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32096c, this.d, this.e, Boolean.valueOf(this.f32097f), Integer.valueOf(this.f32098g));
    }

    public ac(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32097f = z10;
        this.f32098g = i10;
    }
}
