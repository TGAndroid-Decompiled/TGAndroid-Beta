package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g61 extends org.telegram.ui.Components.rl0 {
    public int f36994c;
    public int d;
    public int h;
    public final w61 f36999s;
    public int f36995e = -1;
    public int f36996f = -1;
    public int f36997n = 1;
    public final ArrayList f36998r = new ArrayList();

    public g61(w61 w61Var) {
        this.f36999s = w61Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z4) {
        w61 w61Var = this.f36999s;
        int i10 = w61Var.T;
        boolean z10 = w61Var.F;
        ArrayList arrayList = this.f36998r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f36994c = -1;
        boolean z11 = false;
        this.f36997n = 0;
        arrayList.clear();
        ArrayList arrayList2 = w61Var.f42357x1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f36997n;
                this.f36997n = i11 + 1;
                this.f36995e = i11;
                arrayList.add(1);
            }
            this.d = this.f36997n;
            for (int i12 = 0; i12 < w61Var.f42357x1.size(); i12++) {
                this.f36997n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, w61Var.f42357x1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = w61Var.f42360y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f36997n;
                this.f36997n = i13 + 1;
                this.f36996f = i13;
                arrayList.add(2);
                this.f36994c = this.f36997n;
                for (int i14 = 0; i14 < w61Var.f42360y1.size(); i14++) {
                    this.f36997n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, w61Var.f42360y1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = w61Var.f42362z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f36997n;
                    this.f36997n = i15 + 1;
                    this.f36996f = i15;
                    arrayList.add(2);
                }
                this.f36994c = this.f36997n;
                for (int i16 = 0; i16 < w61Var.f42362z1.size(); i16++) {
                    this.f36997n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, w61Var.f42362z1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = w61Var.A1;
        if (arrayList5 != null) {
            int i17 = this.f36997n;
            this.h = i17;
            this.f36997n = arrayList5.size() + i17;
        }
        l();
        if (w61Var.f42351v1 && this.f36997n == 0) {
            z11 = true;
        }
        if (w61Var.D1 != z11) {
            w61Var.D1 = z11;
            ValueAnimator valueAnimator = w61Var.E1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            w61Var.E1 = ofFloat;
            ofFloat.addUpdateListener(new b51(w61Var, z11, 1));
            w61Var.E1.addListener(new p51(w61Var, z11, 1));
            w61Var.E1.setInterpolator(org.telegram.ui.Components.pr.h);
            w61Var.E1.setDuration(100L);
            w61Var.E1.start();
            if (z11) {
                w61.D(w61Var.S, w61Var.f42323i0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f36997n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f36995e || i10 == this.f36996f) {
            return 6;
        }
        w61 w61Var = this.f36999s;
        if (w61Var.T == 14) {
            ArrayList arrayList = w61Var.f42360y1;
            if (arrayList != null && i10 >= (i11 = this.f36994c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f36994c;
            if (i10 > i12 && (i10 - i12) - 1 < w61Var.f42362z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = w61Var.f42357x1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (w61Var.T == 13 || ((ng.q0) w61Var.f42357x1.get((i10 - this.d) - 1)).f16181g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= w61Var.A1.size()) {
            return 4;
        }
        if (w61Var.A1.get(i10 - this.h) instanceof t61) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ng.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        w61 w61Var = this.f36999s;
        HashSet hashSet = w61Var.H;
        int i14 = w61Var.T;
        int i15 = w61Var.S;
        i51 i51Var = w61Var.f42317f0;
        int i16 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i16 == 6) {
            b61 b61Var = (b61) view;
            ArrayList arrayList = w61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) w61Var.A1.get(i10 - this.h);
                if (document2 instanceof t61) {
                    CharSequence charSequence = ((t61) document2).f41448a;
                    String str = w61Var.f42354w1;
                    b61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ue, b61Var.f35368f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    b61Var.f35364a.setText(charSequence);
                    b61Var.b(false);
                }
            } else if (i10 == this.f36995e) {
                b61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                b61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                b61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            b61Var.f35366c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) w61Var.f42362z1.get((i10 - this.f36994c) - 1);
            f61 f61Var = (f61) view;
            f61Var.a(i51Var);
            f61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f), 0L, "tgs", document3, 0);
            f61Var.N = true;
            f61Var.d = document3;
            f61Var.f36680e = null;
        } else if (i16 == 4) {
            f61 f61Var2 = (f61) view;
            f61Var2.f36679c = i10;
            ImageReceiver imageReceiver = f61Var2.f36682n;
            ArrayList arrayList2 = w61Var.f42357x1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                q0Var = (ng.q0) w61Var.f42357x1.get(i10);
            } else {
                ArrayList arrayList3 = w61Var.f42360y1;
                if (arrayList3 != null && i10 >= (i12 = this.f36994c) && i10 - i12 < arrayList3.size()) {
                    q0Var = (ng.q0) w61Var.f42360y1.get(i10 - this.f36994c);
                } else {
                    return;
                }
            }
            if (f61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(f61Var2);
                f61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                f61Var2.h.onAttachedToWindow();
            }
            f61Var2.h.setParentView(i51Var);
            f61Var2.f36686x = q0Var;
            f61Var2.f36687y = false;
            f61Var2.d(w61Var.G.contains(q0Var), false);
            f61Var2.f36678b = false;
            f61Var2.invalidate();
            if (i14 == 13) {
                f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f16180f));
            } else if (!q0Var.f16177b && q0Var.f16180f != null) {
                f61Var2.f36684s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f16180f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    } else {
                        ng.q0 q0Var2 = q0Var;
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
                } else {
                    f61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                f61Var2.f36680e = null;
                f61Var2.d = null;
                f61Var2.setDrawable(null);
                e61 e61Var = f61Var2.G;
                if (e61Var != null) {
                    e61Var.setVisibility(8);
                    f61Var2.G.setImageReceiver(null);
                }
                if (tL_availableReaction == null && q0Var.f16177b) {
                    f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f16180f));
                }
            } else {
                f61Var2.f36684s = false;
                f61Var2.f36680e = new org.telegram.ui.Components.u5(q0Var.f16181g, (Paint.FontMetricsInt) null);
                f61Var2.d = null;
                f61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) i51Var.f43556a3.get(f61Var2.f36680e.getDocumentId());
                if (l5Var == null) {
                    cacheType2 = w61Var.getCacheType();
                    l5Var = org.telegram.ui.Components.l5.n(i15, f61Var2.f36680e.getDocumentId(), null, cacheType2);
                    i51Var.f43556a3.put(f61Var2.f36680e.getDocumentId(), l5Var);
                }
                f61Var2.setDrawable(l5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f16177b && q0Var.d) {
                f61Var2.b();
                f61Var2.G.setVisibility(0);
                f61Var2.setEmojicon(null);
                return;
            }
            if (q0Var.f16179e) {
                f61Var2.setEmojicon(q0Var.f16180f);
            } else {
                f61Var2.setEmojicon(null);
            }
            e61 e61Var2 = f61Var2.G;
            if (e61Var2 != null) {
                e61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            f61 f61Var3 = (f61) view;
            f61Var3.f36677a = false;
            f61Var3.f36679c = i10;
            f61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            f61Var3.setDrawable(null);
            ArrayList arrayList4 = w61Var.f42357x1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ng.q0 q0Var3 = (ng.q0) w61Var.f42357x1.get(i10);
                f61Var3.f36686x = q0Var3;
                long j10 = q0Var3.f16181g;
                if (j10 == 0) {
                    boolean contains2 = w61Var.G.contains(q0Var3);
                    f61Var3.f36687y = true;
                    f61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var3.f16180f));
                    f61Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var3.f16177b && q0Var3.d) {
                    f61Var3.b();
                    f61Var3.G.setVisibility(0);
                } else {
                    e61 e61Var3 = f61Var3.G;
                    if (e61Var3 != null) {
                        e61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = w61Var.A1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) w61Var.A1.get(i10 - this.h);
                    if (!(document instanceof t61)) {
                        l10 = null;
                    }
                }
                document = null;
                l10 = null;
            }
            if (l10 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    f61Var3.f36680e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                    f61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20851id));
                } else {
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                    f61Var3.f36680e = u5Var;
                    f61Var3.d = u5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) i51Var.f43556a3.get(f61Var3.f36680e.getDocumentId());
                if (l5Var2 == null) {
                    cacheType = w61Var.getCacheType();
                    l5Var2 = org.telegram.ui.Components.l5.n(i15, f61Var3.f36680e.getDocumentId(), null, cacheType);
                    i51Var.f43556a3.put(f61Var3.f36680e.getDocumentId(), l5Var2);
                }
                f61Var3.setDrawable(l5Var2);
            }
            f61Var3.d(contains, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View f61Var;
        boolean z4;
        w61 w61Var = this.f36999s;
        if (i10 == 6) {
            Context context = w61Var.getContext();
            if (w61Var.T == 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            f61Var = new b61(w61Var, context, z4);
        } else if (i10 == 7) {
            f61Var = new org.telegram.ui.Components.in(w61Var.getContext(), 22);
            f61Var.setTag("searchbox");
        } else {
            f61Var = new f61(w61Var, w61Var.getContext());
        }
        if (w61.c(w61Var)) {
            f61Var.setScaleX(0.0f);
            f61Var.setScaleY(0.0f);
        }
        return new f2.m1(f61Var);
    }
}
