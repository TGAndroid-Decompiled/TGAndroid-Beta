package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class qb extends sg.a {
    public final String f48831c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f48832e;
    public boolean f48833f;
    public final int f48834g;

    public qb(int i3, String str) {
        super(i3, false);
        this.f48831c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f48833f;
        if (this == obj) {
            return true;
        }
        if (obj == null || qb.class != obj.getClass()) {
            return false;
        }
        qb qbVar = (qb) obj;
        TL_stories.Boost boost = qbVar.d;
        boolean z11 = qbVar.f48833f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f48832e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = qbVar.f48832e) != null) {
            if (prepaidGiveaway2.f27239id == prepaidGiveaway.f27239id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27235id.hashCode() == boost.f27235id.hashCode() && z10 == z11 && this.f48834g == qbVar.f48834g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48831c, this.d, this.f48832e, Boolean.valueOf(this.f48833f), Integer.valueOf(this.f48834g));
    }

    public qb(TL_stories.Boost boost, boolean z10, int i3) {
        super(5, true);
        this.d = boost;
        this.f48833f = z10;
        this.f48834g = i3;
    }
}
