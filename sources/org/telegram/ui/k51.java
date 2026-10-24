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
public final class k51 extends org.telegram.ui.Components.km0 {
    public int f38795c;
    public int d;
    public int h;
    public final a61 f38799s;
    public int e = -1;
    public int f38796f = -1;
    public int f38797n = 1;
    public final ArrayList f38798r = new ArrayList();

    public k51(a61 a61Var) {
        this.f38799s = a61Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        a61 a61Var = this.f38799s;
        int i10 = a61Var.W;
        boolean z11 = a61Var.I;
        ArrayList arrayList = this.f38798r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f38795c = -1;
        boolean z12 = false;
        this.f38797n = 0;
        arrayList.clear();
        ArrayList arrayList2 = a61Var.B1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f38797n;
                this.f38797n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f38797n;
            for (int i12 = 0; i12 < a61Var.B1.size(); i12++) {
                this.f38797n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, a61Var.B1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = a61Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f38797n;
                this.f38797n = i13 + 1;
                this.f38796f = i13;
                arrayList.add(2);
                this.f38795c = this.f38797n;
                for (int i14 = 0; i14 < a61Var.C1.size(); i14++) {
                    this.f38797n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a61Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = a61Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f38797n;
                    this.f38797n = i15 + 1;
                    this.f38796f = i15;
                    arrayList.add(2);
                }
                this.f38795c = this.f38797n;
                for (int i16 = 0; i16 < a61Var.D1.size(); i16++) {
                    this.f38797n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a61Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = a61Var.E1;
        if (arrayList5 != null) {
            int i17 = this.f38797n;
            this.h = i17;
            this.f38797n = arrayList5.size() + i17;
        }
        l();
        if (a61Var.f35663z1 && this.f38797n == 0) {
            z12 = true;
        }
        if (a61Var.H1 != z12) {
            a61Var.H1 = z12;
            ValueAnimator valueAnimator = a61Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a61Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new f41(a61Var, z12, 1));
            a61Var.I1.addListener(new t41(a61Var, z12, 1));
            a61Var.I1.setInterpolator(org.telegram.ui.Components.zr.h);
            a61Var.I1.setDuration(100L);
            a61Var.I1.start();
            if (z12) {
                a61.D(a61Var.V, a61Var.f35630l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f38797n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f38796f) {
            return 6;
        }
        a61 a61Var = this.f38799s;
        if (a61Var.W == 14) {
            ArrayList arrayList = a61Var.C1;
            if (arrayList != null && i10 >= (i11 = this.f38795c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f38795c;
            if (i10 > i12 && (i10 - i12) - 1 < a61Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = a61Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (a61Var.W == 13 || ((ah.i1) a61Var.B1.get((i10 - this.d) - 1)).f785g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= a61Var.E1.size()) {
            return 4;
        }
        if (a61Var.E1.get(i10 - this.h) instanceof x51) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ah.i1 i1Var;
        int cacheType2;
        int i13;
        int indexOf;
        a61 a61Var = this.f38799s;
        HashSet hashSet = a61Var.K;
        int i14 = a61Var.W;
        int i15 = a61Var.V;
        n41 n41Var = a61Var.f35624i0;
        int i16 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i16 == 6) {
            f51 f51Var = (f51) view;
            ArrayList arrayList = a61Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) a61Var.E1.get(i10 - this.h);
                if (document2 instanceof x51) {
                    CharSequence charSequence = ((x51) document2).f43475a;
                    String str = a61Var.A1;
                    f51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ue, f51Var.f37206f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    f51Var.f37203a.setText(charSequence);
                    f51Var.b(false);
                }
            } else if (i10 == this.e) {
                f51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                f51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                f51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            f51Var.f37205c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) a61Var.D1.get((i10 - this.f38795c) - 1);
            j51 j51Var = (j51) view;
            j51Var.a(n41Var);
            j51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f), 0L, "tgs", document3, 0);
            j51Var.Q = true;
            j51Var.d = document3;
            j51Var.e = null;
        } else if (i16 == 4) {
            j51 j51Var2 = (j51) view;
            j51Var2.f38464c = i10;
            ImageReceiver imageReceiver = j51Var2.f38466n;
            ArrayList arrayList2 = a61Var.B1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                i1Var = (ah.i1) a61Var.B1.get(i10);
            } else {
                ArrayList arrayList3 = a61Var.C1;
                if (arrayList3 != null && i10 >= (i12 = this.f38795c) && i10 - i12 < arrayList3.size()) {
                    i1Var = (ah.i1) a61Var.C1.get(i10 - this.f38795c);
                } else {
                    return;
                }
            }
            if (j51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(j51Var2);
                j51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                j51Var2.h.onAttachedToWindow();
            }
            j51Var2.h.setParentView(n41Var);
            j51Var2.f38470x = i1Var;
            j51Var2.f38471y = false;
            j51Var2.d(a61Var.J.contains(i1Var), false);
            j51Var2.f38463b = false;
            j51Var2.invalidate();
            if (i14 == 13) {
                j51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f784f));
            } else if (!i1Var.f782b && i1Var.f784f != null) {
                j51Var2.f38468s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f784f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    } else {
                        ah.i1 i1Var2 = i1Var;
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    j51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                j51Var2.e = null;
                j51Var2.d = null;
                j51Var2.setDrawable(null);
                i51 i51Var = j51Var2.J;
                if (i51Var != null) {
                    i51Var.setVisibility(8);
                    j51Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && i1Var.f782b) {
                    j51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f784f));
                }
            } else {
                j51Var2.f38468s = false;
                j51Var2.e = new org.telegram.ui.Components.y5(i1Var.f785g, (Paint.FontMetricsInt) null);
                j51Var2.d = null;
                j51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) n41Var.f36226e3.get(j51Var2.e.getDocumentId());
                if (p5Var == null) {
                    cacheType2 = a61Var.getCacheType();
                    p5Var = org.telegram.ui.Components.p5.n(i15, j51Var2.e.getDocumentId(), null, cacheType2);
                    n41Var.f36226e3.put(j51Var2.e.getDocumentId(), p5Var);
                }
                j51Var2.setDrawable(p5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.f782b && i1Var.d) {
                j51Var2.b();
                j51Var2.J.setVisibility(0);
                j51Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                j51Var2.setEmojicon(i1Var.f784f);
            } else {
                j51Var2.setEmojicon(null);
            }
            i51 i51Var2 = j51Var2.J;
            if (i51Var2 != null) {
                i51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            j51 j51Var3 = (j51) view;
            j51Var3.f38462a = false;
            j51Var3.f38464c = i10;
            j51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            j51Var3.setDrawable(null);
            ArrayList arrayList4 = a61Var.B1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ah.i1 i1Var3 = (ah.i1) a61Var.B1.get(i10);
                j51Var3.f38470x = i1Var3;
                long j10 = i1Var3.f785g;
                if (j10 == 0) {
                    boolean contains2 = a61Var.J.contains(i1Var3);
                    j51Var3.f38471y = true;
                    j51Var3.setDrawable(Emoji.getEmojiDrawable(i1Var3.f784f));
                    j51Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var3.f782b && i1Var3.d) {
                    j51Var3.b();
                    j51Var3.J.setVisibility(0);
                } else {
                    i51 i51Var3 = j51Var3.J;
                    if (i51Var3 != null) {
                        i51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = a61Var.E1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) a61Var.E1.get(i10 - this.h);
                    if (!(document instanceof x51)) {
                        l4 = null;
                    }
                }
                document = null;
                l4 = null;
            }
            if (l4 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    j51Var3.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                    j51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20350id));
                } else {
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l4.longValue(), (Paint.FontMetricsInt) null);
                    j51Var3.e = y5Var;
                    j51Var3.d = y5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) n41Var.f36226e3.get(j51Var3.e.getDocumentId());
                if (p5Var2 == null) {
                    cacheType = a61Var.getCacheType();
                    p5Var2 = org.telegram.ui.Components.p5.n(i15, j51Var3.e.getDocumentId(), null, cacheType);
                    n41Var.f36226e3.put(j51Var3.e.getDocumentId(), p5Var2);
                }
                j51Var3.setDrawable(p5Var2);
            }
            j51Var3.d(contains, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View j51Var;
        boolean z10;
        a61 a61Var = this.f38799s;
        if (i10 == 6) {
            Context context = a61Var.getContext();
            if (a61Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            j51Var = new f51(a61Var, context, z10);
        } else if (i10 == 7) {
            j51Var = new org.telegram.ui.Components.sn(a61Var.getContext(), 25);
            j51Var.setTag("searchbox");
        } else {
            j51Var = new j51(a61Var, a61Var.getContext());
        }
        if (a61.c(a61Var)) {
            j51Var.setScaleX(0.0f);
            j51Var.setScaleY(0.0f);
        }
        return new s4.b1(j51Var);
    }
}
