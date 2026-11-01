package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 implements as0 {
    public final TLRPC.WebPage f39681a;
    public final List f39682b;
    public final h4 f39683c;

    public n3(h4 h4Var, TLRPC.WebPage webPage, List list) {
        this.f39683c = h4Var;
        this.f39681a = webPage;
        this.f39682b = list;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 < this.f39682b.size() && i10 >= 0 && e4.g(this.f39681a, get(i10))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize w9;
        if (i10 < this.f39682b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f39681a;
            if (z10) {
                TLRPC.Photo e = e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w9 = org.telegram.messenger.b8.w(e.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                    return e4.c(w9);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return e4.c(a2);
            }
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.b8.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.b8.r(null, d);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 < this.f39682b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f39681a;
            if (z10) {
                return e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        if (i10 < this.f39682b.size() && i10 >= 0 && !e4.g(this.f39681a, get(i10))) {
            f4 f4Var = this.f39683c.f37691u0[0].f39062c;
            TL_iv.PageBlock pageBlock = get(i10);
            f4Var.getClass();
            if (f4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w9;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            if (w10 != null) {
                int i10 = w10.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w10;
            }
            iArr[0] = -1;
            return null;
        } else if (!(tLObject instanceof TLRPC.Document) || (w9 = org.telegram.messenger.b8.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
            return null;
        } else {
            int i11 = w9.size;
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = -1;
            }
            return w9;
        }
    }

    @Override
    public final Object g() {
        return this.f39681a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f39682b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f39682b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        h4 h4Var = this.f39683c;
        int childCount = h4Var.f37691u0[0].f39061b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h4Var.f37691u0[0].f39061b.getChildAt(i10);
            if (childAt instanceof o2) {
                o2 o2Var = (o2) childAt;
                int indexOf = o2Var.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    o2Var.f40019b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n3.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.f39682b.size();
    }
}
