package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends og.a {
    public final String f32128c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32129f;
    public final int f32130g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f32128c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f32129f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z11 = bcVar.f32129f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.e) != null) {
            if (prepaidGiveaway2.f18347id == prepaidGiveaway.f18347id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18343id.hashCode() == boost.f18343id.hashCode() && z10 == z11 && this.f32130g == bcVar.f32130g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32128c, this.d, this.e, Boolean.valueOf(this.f32129f), Integer.valueOf(this.f32130g));
    }

    public bc(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f32129f = z10;
        this.f32130g = i10;
    }
}
