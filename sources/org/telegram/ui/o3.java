package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 implements wu0 {
    public final TLRPC.WebPage f39120a;
    public final List f39121b;
    public final i4 f39122c;

    public o3(i4 i4Var, TLRPC.WebPage webPage, List list) {
        this.f39122c = i4Var;
        this.f39120a = webPage;
        this.f39121b = list;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 < this.f39121b.size() && i10 >= 0 && f4.g(this.f39120a, get(i10))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.f39121b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f39120a;
            if (z10) {
                TLRPC.Photo e7 = f4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e7 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e7.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return f4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = f4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return f4.c(a2);
            }
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 < this.f39121b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f39120a;
            if (z10) {
                return f4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return f4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        if (i10 < this.f39121b.size() && i10 >= 0 && !f4.g(this.f39120a, get(i10))) {
            g4 g4Var = this.f39122c.f37259u0[0].f38579c;
            TL_iv.PageBlock pageBlock = get(i10);
            g4Var.getClass();
            if (g4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize2 != null) {
                int i10 = closestPhotoSizeWithSize2.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
            iArr[0] = -1;
            return null;
        } else if ((tLObject instanceof TLRPC.Document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) != null) {
            int i11 = closestPhotoSizeWithSize.size;
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        } else {
            return null;
        }
    }

    @Override
    public final Object g() {
        return this.f39120a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f39121b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f39121b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        i4 i4Var = this.f39122c;
        int childCount = i4Var.f37259u0[0].f38578b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = i4Var.f37259u0[0].f38578b.getChildAt(i10);
            if (childAt instanceof q2) {
                q2 q2Var = (q2) childAt;
                int indexOf = q2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    q2Var.f39698a.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o3.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.f39121b.size();
    }
}
