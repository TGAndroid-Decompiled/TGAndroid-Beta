package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ml implements hq0 {
    public final TL_iv.RichMessage f47695a;
    public final ArrayList f47696b;
    public final org.telegram.messenger.zi f47697c;

    public ml(TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.messenger.zi ziVar) {
        this.f47695a = richMessage;
        this.f47696b = arrayList;
        this.f47697c = ziVar;
    }

    @Override
    public final boolean a(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f47696b;
            if (i3 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = e4.b(this.f47695a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b10 != null) {
                        return org.telegram.messenger.zi.L4(b10);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final File b(int i3) {
        TLRPC.Document b10;
        TLRPC.PhotoSize w10;
        if (i3 >= 0) {
            ArrayList arrayList = this.f47696b;
            if (i3 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f47695a;
                if (z10) {
                    TLRPC.Photo f10 = e4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (w10 = org.telegram.messenger.w7.w(f10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                        return e4.c(w10);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = e4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return e4.c(b10);
                }
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
        if (i3 >= 0) {
            ArrayList arrayList = this.f47696b;
            if (i3 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f47695a;
                if (z10) {
                    return e4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return e4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e(int i3) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 != null) {
                int i3 = w10.size;
                iArr[0] = i3;
                if (i3 == 0) {
                    iArr[0] = -1;
                }
                return w10;
            }
            iArr[0] = -1;
            return null;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 320, false, null, true);
            if (w11 == null) {
                w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            }
            if (w11 != null) {
                int i10 = w11.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w11;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override
    public final Object g() {
        org.telegram.messenger.zi ziVar = this.f47697c;
        if (ziVar != null) {
            return ziVar;
        }
        return this.f47695a;
    }

    @Override
    public final TL_iv.PageBlock get(int i3) {
        return (TL_iv.PageBlock) this.f47696b.get(i3);
    }

    @Override
    public final List getAll() {
        return this.f47696b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.cv cvVar;
        org.telegram.messenger.zi ziVar = this.f47697c;
        if (ziVar != null && (cvVar = ziVar.f26915w2) != null) {
            ArrayList arrayList = cvVar.f22070g;
            if (pageBlock != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList.get(i3);
                    if (xtVar instanceof org.telegram.messenger.ou) {
                        org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) xtVar;
                        ArrayList arrayList2 = ouVar.Y;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (((org.telegram.messenger.qt) arrayList2.get(i10)).f24951b == pageBlock) {
                                int max = Math.max(0, Math.min(i10, arrayList2.size() - 1));
                                ValueAnimator valueAnimator = ouVar.f24612l0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    ouVar.f24612l0 = null;
                                }
                                if (ouVar.f24602b0 != max || ouVar.f24603c0 != 0.0f) {
                                    ouVar.f24602b0 = max;
                                    ouVar.f24603c0 = 0.0f;
                                    ouVar.f24604d0 = false;
                                    ouVar.f24605e0 = false;
                                    View view = ouVar.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence i(int i3) {
        return null;
    }

    @Override
    public final int j() {
        return this.f47696b.size();
    }
}
