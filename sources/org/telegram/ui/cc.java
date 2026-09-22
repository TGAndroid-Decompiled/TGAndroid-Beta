package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class cc extends og.a {
    public final String f32724c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32725f;
    public final int f32726g;

    public cc(int i10, String str) {
        super(i10, false);
        this.f32724c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32725f;
        if (this == obj) {
            return true;
        }
        if (obj == null || cc.class != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        TL_stories.Boost boost = ccVar.d;
        boolean z11 = ccVar.f32725f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ccVar.e) != null) {
            if (prepaidGiveaway2.f18577id == prepaidGiveaway.f18577id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18573id.hashCode() == boost.f18573id.hashCode() && z10 == z11 && this.f32726g == ccVar.f32726g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32724c, this.d, this.e, Boolean.valueOf(this.f32725f), Integer.valueOf(this.f32726g));
    }

    public cc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32725f = z10;
        this.f32726g = i10;
    }
}
