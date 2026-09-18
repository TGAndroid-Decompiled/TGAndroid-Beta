package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f32627c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32628f;
    public final int f32629g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f32627c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32628f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f32628f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.e) != null) {
            if (prepaidGiveaway2.f18530id == prepaidGiveaway.f18530id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18526id.hashCode() == boost.f18526id.hashCode() && z10 == z11 && this.f32629g == ccVar.f32629g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32627c, this.d, this.e, Boolean.valueOf(this.f32628f), Integer.valueOf(this.f32629g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32628f = z10;
        this.f32629g = i10;
    }
}
