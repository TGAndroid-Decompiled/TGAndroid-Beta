package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class gc extends pg.a {
    public final String f36131c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f36132f;
    public final int f36133g;

    public gc(int i10, String str) {
        super(i10, false);
        this.f36131c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36132f;
        if (this == obj) {
            return true;
        }
        if (obj == null || gc.class != obj.getClass()) {
            return false;
        }
        gc gcVar = (gc) obj;
        TL_stories.Boost boost = gcVar.d;
        boolean z11 = gcVar.f36132f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = gcVar.e) != null) {
            if (prepaidGiveaway2.f19150id == prepaidGiveaway.f19150id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19146id.hashCode() == boost.f19146id.hashCode() && z10 == z11 && this.f36133g == gcVar.f36133g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36131c, this.d, this.e, Boolean.valueOf(this.f36132f), Integer.valueOf(this.f36133g));
    }

    public gc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36132f = z10;
        this.f36133g = i10;
    }
}
