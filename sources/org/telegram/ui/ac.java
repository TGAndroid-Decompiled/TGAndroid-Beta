package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class ac extends og.a {
    public final String f32095c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32096f;
    public final int f32097g;

    public ac(int i10, String str) {
        super(i10, false);
        this.f32095c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32096f;
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        TL_stories.Boost boost = acVar.d;
        boolean z11 = acVar.f32096f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = acVar.e) != null) {
            if (prepaidGiveaway2.f18570id == prepaidGiveaway.f18570id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18566id.hashCode() == boost.f18566id.hashCode() && z10 == z11 && this.f32097g == acVar.f32097g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32095c, this.d, this.e, Boolean.valueOf(this.f32096f), Integer.valueOf(this.f32097g));
    }

    public ac(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32096f = z10;
        this.f32097g = i10;
    }
}
