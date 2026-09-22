package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends og.a {
    public final String f32112c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32113f;
    public final int f32114g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f32112c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32113f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f32113f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.e) != null) {
            if (prepaidGiveaway2.f18343id == prepaidGiveaway.f18343id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18339id.hashCode() == boost.f18339id.hashCode() && z10 == z11 && this.f32114g == bcVar.f32114g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32112c, this.d, this.e, Boolean.valueOf(this.f32113f), Integer.valueOf(this.f32114g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32113f = z10;
        this.f32114g = i10;
    }
}
