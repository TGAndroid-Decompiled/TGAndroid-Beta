package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class dc extends og.a {
    public final String f33087c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f33088f;
    public final int f33089g;

    public dc(int i10, String str) {
        super(i10, false);
        this.f33087c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f33088f;
        if (this == obj) {
            return true;
        }
        if (obj == null || dc.class != obj.getClass()) {
            return false;
        }
        dc dcVar = (dc) obj;
        TL_stories.Boost boost = dcVar.d;
        boolean z11 = dcVar.f33088f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = dcVar.e) != null) {
            if (prepaidGiveaway2.f18356id == prepaidGiveaway.f18356id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18352id.hashCode() == boost.f18352id.hashCode() && z10 == z11 && this.f33089g == dcVar.f33089g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f33087c, this.d, this.e, Boolean.valueOf(this.f33088f), Integer.valueOf(this.f33089g));
    }

    public dc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f33088f = z10;
        this.f33089g = i10;
    }
}
