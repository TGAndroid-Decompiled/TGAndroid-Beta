package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class m3 implements pq0 {
    public final TLRPC.WebPage f47610a;
    public final List f47611b;
    public final g4 f47612c;

    public m3(g4 g4Var, TLRPC.WebPage webPage, List list) {
        this.f47612c = g4Var;
        this.f47610a = webPage;
        this.f47611b = list;
    }

    @Override
    public final boolean a(int i7) {
        if (i7 < this.f47611b.size() && i7 >= 0 && d4.g(this.f47610a, get(i7))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i7) {
        TLRPC.Document a10;
        TLRPC.PhotoSize w10;
        if (i7 < this.f47611b.size() && i7 >= 0) {
            TL_iv.PageBlock pageBlock = get(i7);
            boolean z9 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f47610a;
            if (z9) {
                TLRPC.Photo e10 = d4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    return d4.c(w10);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = d4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return d4.c(a10);
            }
        }
        return null;
    }

    @Override
    public final String c(int i7) {
        TLObject d = d(i7);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override
    public final TLObject d(int i7) {
        if (i7 < this.f47611b.size() && i7 >= 0) {
            TL_iv.PageBlock pageBlock = get(i7);
            boolean z9 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f47610a;
            if (z9) {
                return d4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return d4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i7) {
        if (i7 < this.f47611b.size() && i7 >= 0 && !d4.g(this.f47610a, get(i7))) {
            e4 e4Var = this.f47612c.f45816u0[0].f47066c;
            TL_iv.PageBlock pageBlock = get(i7);
            e4Var.getClass();
            if (e4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w10;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w11 != null) {
                int i7 = w11.size;
                iArr[0] = i7;
                if (i7 == 0) {
                    iArr[0] = -1;
                }
                return w11;
            }
            iArr[0] = -1;
            return null;
        } else if (!(tLObject instanceof TLRPC.Document) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
            return null;
        } else {
            int i10 = w10.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return w10;
        }
    }

    @Override
    public final Object g() {
        return this.f47610a;
    }

    @Override
    public final TL_iv.PageBlock get(int i7) {
        return (TL_iv.PageBlock) this.f47611b.get(i7);
    }

    @Override
    public final List getAll() {
        return this.f47611b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        g4 g4Var = this.f47612c;
        int childCount = g4Var.f45816u0[0].f47065b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = g4Var.f45816u0[0].f47065b.getChildAt(i7);
            if (childAt instanceof o2) {
                o2 o2Var = (o2) childAt;
                int indexOf = o2Var.f48184e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    o2Var.f48182b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m3.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.f47611b.size();
    }
}
