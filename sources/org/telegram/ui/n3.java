package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 implements hq0 {
    public final TLRPC.WebPage f47858a;
    public final List f47859b;
    public final i4 f47860c;

    public n3(i4 i4Var, TLRPC.WebPage webPage, List list) {
        this.f47860c = i4Var;
        this.f47858a = webPage;
        this.f47859b = list;
    }

    @Override
    public final boolean a(int i3) {
        if (i3 < this.f47859b.size() && i3 >= 0 && e4.g(this.f47858a, get(i3))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i3) {
        TLRPC.Document a10;
        TLRPC.PhotoSize w10;
        if (i3 < this.f47859b.size() && i3 >= 0) {
            TL_iv.PageBlock pageBlock = get(i3);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f47858a;
            if (z10) {
                TLRPC.Photo e10 = e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    return e4.c(w10);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return e4.c(a10);
            }
        }
        return null;
    }

    @Override
    public final String c(int i3) {
        TLObject d = d(i3);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override
    public final TLObject d(int i3) {
        if (i3 < this.f47859b.size() && i3 >= 0) {
            TL_iv.PageBlock pageBlock = get(i3);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f47858a;
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
    public final boolean e(int i3) {
        if (i3 < this.f47859b.size() && i3 >= 0 && !e4.g(this.f47858a, get(i3))) {
            g4 g4Var = this.f47860c.f46100v0[0].f47084c;
            TL_iv.PageBlock pageBlock = get(i3);
            g4Var.getClass();
            if (g4.I(pageBlock) == 5) {
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
                int i3 = w11.size;
                iArr[0] = i3;
                if (i3 == 0) {
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
        return this.f47858a;
    }

    @Override
    public final TL_iv.PageBlock get(int i3) {
        return (TL_iv.PageBlock) this.f47859b.get(i3);
    }

    @Override
    public final List getAll() {
        return this.f47859b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        i4 i4Var = this.f47860c;
        int childCount = i4Var.f46100v0[0].f47083b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = i4Var.f46100v0[0].f47083b.getChildAt(i3);
            if (childAt instanceof p2) {
                p2 p2Var = (p2) childAt;
                int indexOf = p2Var.f48414e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    p2Var.f48412b.x(indexOf, false);
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
        return this.f47859b.size();
    }
}
