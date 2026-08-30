package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends bg.b {
    public final String f32514c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32515f;
    public final int f32516g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f32514c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f32515f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z10 = acVar.f32515f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.e) != null) {
            if (prepaidGiveaway2.f19418id == prepaidGiveaway.f19418id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19414id.hashCode() == boost.f19414id.hashCode() && z4 == z10 && this.f32516g == acVar.f32516g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32514c, this.d, this.e, Boolean.valueOf(this.f32515f), Integer.valueOf(this.f32516g));
    }

    public ac(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f32515f = z4;
        this.f32516g = i10;
    }
}
