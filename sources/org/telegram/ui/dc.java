package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class dc extends pg.a {
    public final String f36153c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f36154f;
    public final int f36155g;

    public dc(int i10, String str) {
        super(i10, false);
        this.f36153c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f36154f;
        if (this == obj) {
            return true;
        }
        if (obj == null || dc.class != obj.getClass()) {
            return false;
        }
        dc dcVar = (dc) obj;
        TL_stories.Boost boost = dcVar.d;
        boolean z11 = dcVar.f36154f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = dcVar.e) != null) {
            if (prepaidGiveaway2.f20512id == prepaidGiveaway.f20512id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20508id.hashCode() == boost.f20508id.hashCode() && z10 == z11 && this.f36155g == dcVar.f36155g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36153c, this.d, this.e, Boolean.valueOf(this.f36154f), Integer.valueOf(this.f36155g));
    }

    public dc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f36154f = z10;
        this.f36155g = i10;
    }
}
