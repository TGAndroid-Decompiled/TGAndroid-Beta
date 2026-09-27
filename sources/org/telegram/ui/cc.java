package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f32651c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32652f;
    public final int f32653g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f32651c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32652f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f32652f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.e) != null) {
            if (prepaidGiveaway2.f18563id == prepaidGiveaway.f18563id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18559id.hashCode() == boost.f18559id.hashCode() && z10 == z11 && this.f32653g == ccVar.f32653g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32651c, this.d, this.e, Boolean.valueOf(this.f32652f), Integer.valueOf(this.f32653g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32652f = z10;
        this.f32653g = i10;
    }
}
