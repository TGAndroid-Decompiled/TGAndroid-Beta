package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mm implements as0 {
    public final TL_iv.RichMessage f39570a;
    public final ArrayList f39571b;
    public final org.telegram.messenger.kj f39572c;

    public mm(TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.messenger.kj kjVar) {
        this.f39570a = richMessage;
        this.f39571b = arrayList;
        this.f39572c = kjVar;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f39571b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = e4.b(this.f39570a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b10 != null) {
                        return org.telegram.messenger.kj.K4(b10);
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
    public final File b(int i10) {
        TLRPC.Document b10;
        TLRPC.PhotoSize w9;
        if (i10 >= 0) {
            ArrayList arrayList = this.f39571b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f39570a;
                if (z10) {
                    TLRPC.Photo f7 = e4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f7 != null && (w9 = org.telegram.messenger.b8.w(f7.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                        return e4.c(w9);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = e4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return e4.c(b10);
                }
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
        if (i10 >= 0) {
            ArrayList arrayList = this.f39571b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f39570a;
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
    public final boolean e(int i10) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            if (w9 != null) {
                int i10 = w9.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w9;
            }
            iArr[0] = -1;
            return null;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 320, false, null, true);
            if (w10 == null) {
                w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            }
            if (w10 != null) {
                int i11 = w10.size;
                iArr[0] = i11;
                if (i11 == 0) {
                    iArr[0] = -1;
                }
                return w10;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override
    public final Object g() {
        org.telegram.messenger.kj kjVar = this.f39572c;
        if (kjVar != null) {
            return kjVar;
        }
        return this.f39570a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f39571b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f39571b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.wv wvVar;
        org.telegram.messenger.kj kjVar = this.f39572c;
        if (kjVar != null && (wvVar = kjVar.f16738w2) != null) {
            ArrayList arrayList = wvVar.f19333g;
            if (pageBlock != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.ru ruVar = (org.telegram.messenger.ru) arrayList.get(i10);
                    if (ruVar instanceof org.telegram.messenger.iv) {
                        org.telegram.messenger.iv ivVar = (org.telegram.messenger.iv) ruVar;
                        ArrayList arrayList2 = ivVar.X;
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (((org.telegram.messenger.ku) arrayList2.get(i11)).f16789b == pageBlock) {
                                int max = Math.max(0, Math.min(i11, arrayList2.size() - 1));
                                ValueAnimator valueAnimator = ivVar.f16360k0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    ivVar.f16360k0 = null;
                                }
                                if (ivVar.f16350a0 != max || ivVar.f16351b0 != 0.0f) {
                                    ivVar.f16350a0 = max;
                                    ivVar.f16351b0 = 0.0f;
                                    ivVar.f16352c0 = false;
                                    ivVar.f16353d0 = false;
                                    View view = ivVar.V;
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
    public final CharSequence i(int i10) {
        return null;
    }

    @Override
    public final int j() {
        return this.f39571b.size();
    }
}
