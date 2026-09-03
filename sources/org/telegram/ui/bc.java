package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class bc extends bg.b {
    public final String f32833c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f32834f;
    public final int f32835g;

    public bc(int i10, String str) {
        super(i10, false);
        this.f32833c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f32834f;
        if (this == obj) {
            return true;
        }
        if (obj == null || bc.class != obj.getClass()) {
            return false;
        }
        bc bcVar = (bc) obj;
        TL_stories.Boost boost = bcVar.d;
        boolean z10 = bcVar.f32834f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = bcVar.e) != null) {
            if (prepaidGiveaway2.f19393id == prepaidGiveaway.f19393id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19389id.hashCode() == boost.f19389id.hashCode() && z4 == z10 && this.f32835g == bcVar.f32835g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f32833c, this.d, this.e, Boolean.valueOf(this.f32834f), Integer.valueOf(this.f32835g));
    }

    public bc(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f32834f = z4;
        this.f32835g = i10;
    }
}
