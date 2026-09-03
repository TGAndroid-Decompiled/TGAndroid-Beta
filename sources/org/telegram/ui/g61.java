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
public final class g61 extends org.telegram.ui.Components.ql0 {
    public int f34332c;
    public int d;
    public int h;
    public final x61 f34336s;
    public int e = -1;
    public int f34333f = -1;
    public int f34334n = 1;
    public final ArrayList f34335r = new ArrayList();

    public g61(x61 x61Var) {
        this.f34336s = x61Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z4) {
        x61 x61Var = this.f34336s;
        int i10 = x61Var.T;
        boolean z10 = x61Var.F;
        ArrayList arrayList = this.f34335r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f34332c = -1;
        boolean z11 = false;
        this.f34334n = 0;
        arrayList.clear();
        ArrayList arrayList2 = x61Var.f39905x1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f34334n;
                this.f34334n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f34334n;
            for (int i12 = 0; i12 < x61Var.f39905x1.size(); i12++) {
                this.f34334n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, x61Var.f39905x1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = x61Var.f39908y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f34334n;
                this.f34334n = i13 + 1;
                this.f34333f = i13;
                arrayList.add(2);
                this.f34332c = this.f34334n;
                for (int i14 = 0; i14 < x61Var.f39908y1.size(); i14++) {
                    this.f34334n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, x61Var.f39908y1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = x61Var.f39910z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f34334n;
                    this.f34334n = i15 + 1;
                    this.f34333f = i15;
                    arrayList.add(2);
                }
                this.f34332c = this.f34334n;
                for (int i16 = 0; i16 < x61Var.f39910z1.size(); i16++) {
                    this.f34334n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, x61Var.f39910z1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = x61Var.A1;
        if (arrayList5 != null) {
            int i17 = this.f34334n;
            this.h = i17;
            this.f34334n = arrayList5.size() + i17;
        }
        l();
        if (x61Var.f39899v1 && this.f34334n == 0) {
            z11 = true;
        }
        if (x61Var.D1 != z11) {
            x61Var.D1 = z11;
            ValueAnimator valueAnimator = x61Var.E1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            x61Var.E1 = ofFloat;
            ofFloat.addUpdateListener(new b51(x61Var, z11, 1));
            x61Var.E1.addListener(new p51(x61Var, z11, 1));
            x61Var.E1.setInterpolator(org.telegram.ui.Components.mr.h);
            x61Var.E1.setDuration(100L);
            x61Var.E1.start();
            if (z11) {
                x61.D(x61Var.S, x61Var.f39871i0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f34334n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f34333f) {
            return 6;
        }
        x61 x61Var = this.f34336s;
        if (x61Var.T == 14) {
            ArrayList arrayList = x61Var.f39908y1;
            if (arrayList != null && i10 >= (i11 = this.f34332c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f34332c;
            if (i10 > i12 && (i10 - i12) - 1 < x61Var.f39910z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = x61Var.f39905x1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (x61Var.T == 13 || ((mg.q0) x61Var.f39905x1.get((i10 - this.d) - 1)).f14096g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= x61Var.A1.size()) {
            return 4;
        }
        if (x61Var.A1.get(i10 - this.h) instanceof u61) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        mg.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        x61 x61Var = this.f34336s;
        HashSet hashSet = x61Var.H;
        int i14 = x61Var.T;
        int i15 = x61Var.S;
        i51 i51Var = x61Var.f39865f0;
        int i16 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i16 == 6) {
            b61 b61Var = (b61) view;
            ArrayList arrayList = x61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) x61Var.A1.get(i10 - this.h);
                if (document2 instanceof u61) {
                    CharSequence charSequence = ((u61) document2).f38697a;
                    String str = x61Var.f39902w1;
                    b61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, b61Var.f32759f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    b61Var.f32756a.setText(charSequence);
                    b61Var.b(false);
                }
            } else if (i10 == this.e) {
                b61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                b61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                b61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            b61Var.f32758c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) x61Var.f39910z1.get((i10 - this.f34332c) - 1);
            f61 f61Var = (f61) view;
            f61Var.a(i51Var);
            f61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f), 0L, "tgs", document3, 0);
            f61Var.N = true;
            f61Var.d = document3;
            f61Var.e = null;
        } else if (i16 == 4) {
            f61 f61Var2 = (f61) view;
            f61Var2.f33965c = i10;
            ImageReceiver imageReceiver = f61Var2.f33967n;
            ArrayList arrayList2 = x61Var.f39905x1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                q0Var = (mg.q0) x61Var.f39905x1.get(i10);
            } else {
                ArrayList arrayList3 = x61Var.f39908y1;
                if (arrayList3 != null && i10 >= (i12 = this.f34332c) && i10 - i12 < arrayList3.size()) {
                    q0Var = (mg.q0) x61Var.f39908y1.get(i10 - this.f34332c);
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
            f61Var2.f33971x = q0Var;
            f61Var2.f33972y = false;
            f61Var2.d(x61Var.G.contains(q0Var), false);
            f61Var2.f33964b = false;
            f61Var2.invalidate();
            if (i14 == 13) {
                f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f14095f));
            } else if (!q0Var.f14093b && q0Var.f14095f != null) {
                f61Var2.f33969s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f14095f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    } else {
                        mg.q0 q0Var2 = q0Var;
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
                } else {
                    f61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                f61Var2.e = null;
                f61Var2.d = null;
                f61Var2.setDrawable(null);
                e61 e61Var = f61Var2.G;
                if (e61Var != null) {
                    e61Var.setVisibility(8);
                    f61Var2.G.setImageReceiver(null);
                }
                if (tL_availableReaction == null && q0Var.f14093b) {
                    f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f14095f));
                }
            } else {
                f61Var2.f33969s = false;
                f61Var2.e = new org.telegram.ui.Components.u5(q0Var.f14096g, (Paint.FontMetricsInt) null);
                f61Var2.d = null;
                f61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) i51Var.f40150a3.get(f61Var2.e.getDocumentId());
                if (l5Var == null) {
                    cacheType2 = x61Var.getCacheType();
                    l5Var = org.telegram.ui.Components.l5.n(i15, f61Var2.e.getDocumentId(), null, cacheType2);
                    i51Var.f40150a3.put(f61Var2.e.getDocumentId(), l5Var);
                }
                f61Var2.setDrawable(l5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f14093b && q0Var.d) {
                f61Var2.b();
                f61Var2.G.setVisibility(0);
                f61Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                f61Var2.setEmojicon(q0Var.f14095f);
            } else {
                f61Var2.setEmojicon(null);
            }
            e61 e61Var2 = f61Var2.G;
            if (e61Var2 != null) {
                e61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            f61 f61Var3 = (f61) view;
            f61Var3.f33963a = false;
            f61Var3.f33965c = i10;
            f61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            f61Var3.setDrawable(null);
            ArrayList arrayList4 = x61Var.f39905x1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                mg.q0 q0Var3 = (mg.q0) x61Var.f39905x1.get(i10);
                f61Var3.f33971x = q0Var3;
                long j10 = q0Var3.f14096g;
                if (j10 == 0) {
                    boolean contains2 = x61Var.G.contains(q0Var3);
                    f61Var3.f33972y = true;
                    f61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var3.f14095f));
                    f61Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var3.f14093b && q0Var3.d) {
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
                ArrayList arrayList5 = x61Var.A1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) x61Var.A1.get(i10 - this.h);
                    if (!(document instanceof u61)) {
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
                    f61Var3.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                    f61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f19165id));
                } else {
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                    f61Var3.e = u5Var;
                    f61Var3.d = u5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) i51Var.f40150a3.get(f61Var3.e.getDocumentId());
                if (l5Var2 == null) {
                    cacheType = x61Var.getCacheType();
                    l5Var2 = org.telegram.ui.Components.l5.n(i15, f61Var3.e.getDocumentId(), null, cacheType);
                    i51Var.f40150a3.put(f61Var3.e.getDocumentId(), l5Var2);
                }
                f61Var3.setDrawable(l5Var2);
            }
            f61Var3.d(contains, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View f61Var;
        boolean z4;
        x61 x61Var = this.f34336s;
        if (i10 == 6) {
            Context context = x61Var.getContext();
            if (x61Var.T == 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            f61Var = new b61(x61Var, context, z4);
        } else if (i10 == 7) {
            f61Var = new org.telegram.ui.Components.gn(x61Var.getContext(), 22);
            f61Var.setTag("searchbox");
        } else {
            f61Var = new f61(x61Var, x61Var.getContext());
        }
        if (x61.c(x61Var)) {
            f61Var.setScaleX(0.0f);
            f61Var.setScaleY(0.0f);
        }
        return new f2.l1(f61Var);
    }
}
