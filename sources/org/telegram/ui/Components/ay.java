package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ay extends lm0 {
    public int E;
    public final tz F;
    public ArrayList h;
    public int f24873y;
    public int f24866c = -1;
    public int d = -1;
    public int e = -1;
    public int f24867f = -1;
    public final ArrayList f24868n = new ArrayList();
    public final SparseIntArray f24869r = new SparseIntArray();
    public final SparseIntArray f24870s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f24871w = new SparseIntArray();
    public final ArrayList f24872x = new ArrayList();

    public ay(tz tzVar) {
        this.F = tzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 0 && i10 != 4 && i10 != 3 && i10 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i10, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f7;
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f31008q1;
        int i11 = this.f24871w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            fy fyVar = (fy) arrayList.get(i11);
            if (!fyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f24872x.get(i11)).intValue();
                tzVar.f31002o1.add(Long.valueOf(fyVar.f26469b.f20370id));
                if (!UserConfig.getInstance(tzVar.f30966c1).isPremium() && !tzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = tzVar.Q.J * 3;
                if ((fyVar.f26471f && !fyVar.f26472g && (fyVar.e || z11)) || fyVar.h) {
                    min = fyVar.f26470c.size();
                } else {
                    min = Math.min(i12, fyVar.f26470c.size());
                }
                Integer num2 = null;
                if (fyVar.f26470c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                fyVar.h = true;
                int size = fyVar.f26470c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    tzVar.f31017s2 = view;
                    tzVar.f31020t2 = num.intValue();
                    tzVar.f31023u2 = num2.intValue() + num.intValue();
                    tzVar.f31026v2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        tzVar.post(new zx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f30999n1;
        if (tzVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f24868n);
        MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.f30966c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20370id) || tzVar.f31005p1.contains(Long.valueOf(stickerSetCovered.set.f20370id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        rz rzVar = tzVar.T;
        if (rzVar != null) {
            rzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f30999n1;
        ArrayList arrayList2 = tzVar.f31002o1;
        int i11 = tzVar.f30966c1;
        ArrayList arrayList3 = tzVar.f31008q1;
        arrayList3.clear();
        if (tzVar.f30967c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !tzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = tzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                fy fyVar = new fy();
                fyVar.f26469b = tzVar.J1.emojiset;
                fyVar.f26470c = new ArrayList(groupStickerSetById.documents);
                fyVar.e = true;
                fyVar.f26471f = true;
                fyVar.f26472g = false;
                fyVar.h = true;
                fyVar.f26473i = true;
                arrayList3.add(fyVar);
                TLRPC.StickerSet stickerSet2 = fyVar.f26469b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f20370id == stickerSet2.f20370id) {
                        arrayList4.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (!z11) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        fy fyVar2 = new fy();
                        fyVar2.f26469b = tL_messages_stickerSet2.set;
                        fyVar2.f26470c = new ArrayList(tL_messages_stickerSet2.documents);
                        fyVar2.e = true;
                        fyVar2.f26471f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f20370id);
                        fyVar2.f26472g = false;
                        fyVar2.h = true;
                        arrayList3.add(fyVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z11) {
                    fy fyVar3 = new fy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    fyVar3.f26469b = stickerSet3;
                    fyVar3.f26470c = tL_messages_stickerSet3.documents;
                    fyVar3.e = false;
                    fyVar3.f26471f = mediaDataController.isStickerPackInstalled(stickerSet3.f20370id);
                    fyVar3.f26472g = false;
                    fyVar3.h = z13;
                    arrayList3.add(fyVar3);
                    i10 = i14;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        fy fyVar4 = new fy();
                        fyVar4.f26469b = tL_messages_stickerSet3.set;
                        fyVar4.f26470c = new ArrayList(arrayList5);
                        fyVar4.e = z13;
                        i10 = i14;
                        fyVar4.f26471f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20370id);
                        fyVar4.f26472g = false;
                        fyVar4.h = true;
                        arrayList3.add(fyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        fy fyVar5 = new fy();
                        fyVar5.f26469b = tL_messages_stickerSet3.set;
                        fyVar5.f26470c = new ArrayList(arrayList6);
                        fyVar5.e = false;
                        fyVar5.f26471f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20370id);
                        fyVar5.f26472g = false;
                        fyVar5.h = arrayList2.contains(Long.valueOf(fyVar5.f26469b.f20370id));
                        arrayList3.add(fyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                fy fyVar6 = new fy();
                fyVar6.f26471f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20370id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                fyVar6.f26469b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    fyVar6.f26470c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        fyVar6.f26470c = stickerSet5.documents;
                    } else {
                        fyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    fyVar6.f26470c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = fyVar6.f26470c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < fyVar6.f26470c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) fyVar6.f26470c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    fyVar6.e = !z12;
                    fyVar6.h = arrayList2.contains(Long.valueOf(fyVar6.f26469b.f20370id));
                    fyVar6.f26472g = true;
                    arrayList3.add(fyVar6);
                }
            }
            vx vxVar = tzVar.I;
            if (vxVar != null) {
                vxVar.p(tzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ay.H():void");
    }

    @Override
    public final int h() {
        return this.f24873y;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.f24866c || i10 == this.f24867f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f24869r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f30968d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f24871w.indexOfKey(i10) >= 0) {
                return 6;
            }
            return 0;
        }
    }

    @Override
    public final void l() {
        F(false);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        fy fyVar;
        int i12;
        int i13 = i10;
        tz tzVar = this.F;
        String[] strArr = tzVar.f30959a1;
        rx rxVar = tzVar.Q;
        int i14 = tzVar.f30966c1;
        ArrayList arrayList = tzVar.f31008q1;
        int i15 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z10 = true;
        fy fyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f24869r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        hy hyVar = (hy) view;
                        int i16 = this.f24871w.get(i13);
                        int i17 = rxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            fyVar2 = (fy) arrayList.get(i16);
                        }
                        if (fyVar2 != null) {
                            hyVar.f27072a.setText("+" + ((fyVar2.f26470c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jy jyVar = (jy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                fy fyVar3 = (fy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    fyVar = (fy) arrayList.get(i18);
                } else {
                    fyVar = null;
                }
                if (fyVar3 == null || !fyVar3.f26472g || (fyVar != null && !fyVar.e && fyVar.f26471f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (fyVar3 != null && fyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(fyVar3.d, false);
                    fyVar3.d = null;
                }
                sg.p0 p0Var = jyVar.f27782r;
                if (fyVar3 != null) {
                    jyVar.f27784w = fyVar3;
                    jyVar.f27785x = z10;
                    jyVar.d.l(fyVar3.f26469b.title, false);
                    TextView textView = jyVar.e;
                    if (fyVar3.f26473i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (fyVar3.f26471f && !fyVar3.f26469b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new iy(jyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new iy(jyVar, 6), false);
                    }
                    jyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f24866c) {
                o8Var.b(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f24867f) {
                o8Var.a(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.a(0, ((fy) arrayList.get(i19 - strArr.length)).f26469b.title);
                    return;
                } catch (Exception unused) {
                    o8Var.a(0, "");
                    return;
                }
            } else {
                o8Var.a(0, strArr[i19]);
                return;
            }
        }
        cz czVar = (cz) view;
        czVar.f25452a = i13;
        czVar.e = null;
        if (tzVar.f30968d0) {
            i13--;
        }
        if (this.f24867f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = tzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = tzVar.getRecentEmoji().get(i13);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l4 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l4 = null;
            str2 = str;
            document = null;
        } else {
            int i20 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i20 < strArr2.length) {
                    String[] strArr3 = strArr2[i20];
                    int length2 = strArr3.length + 1;
                    int i21 = (i13 - size) - 1;
                    if (i21 >= 0 && i13 < size + length2) {
                        String str4 = strArr3[i21];
                        String str5 = Emoji.emojiColor.get(str4);
                        if (str5 != null) {
                            str = tz.g(str4, str5);
                            str2 = str4;
                        } else {
                            str = str4;
                        }
                    } else {
                        size += length2;
                        i20++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i14).isPremium();
                int i22 = rxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f24872x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    fy fyVar4 = (fy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((fyVar4.f26471f && !fyVar4.f26472g && (fyVar4.e || isPremium)) || fyVar4.h) {
                        min = fyVar4.f26470c.size();
                    } else {
                        min = Math.min(i22, fyVar4.f26470c.size());
                    }
                    int i24 = czVar.f25452a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        czVar.e = fyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) fyVar4.f26470c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f20349id);
                        }
                        Long l10 = valueOf;
                        document = document2;
                        l4 = l10;
                    } else {
                        i23++;
                    }
                }
            }
            l4 = null;
            document = null;
            z10 = false;
        }
        if (l4 != null) {
            czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            czVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            czVar.a(null, z10);
            if (czVar.getSpan() == null || czVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    czVar.setSpan(new a6(document, (Paint.FontMetricsInt) null));
                } else {
                    czVar.setSpan(new a6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            czVar.a(Emoji.getEmojiBigDrawable(str), z10);
            czVar.setSpan(null);
        }
        czVar.setTag(str2);
        czVar.setContentDescription(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        tz tzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(tzVar.getContext());
                                view.setLayoutParams(new s4.o0(-1, tzVar.f30962b1));
                                o8Var = view;
                            } else {
                                Context context = tzVar.getContext();
                                org.telegram.ui.ActionBar.g6 g6Var = tzVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f27072a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21183d6, g6Var);
                                int dp = AndroidUtilities.dp(11.0f);
                                int i11 = org.telegram.ui.ActionBar.k6.Te;
                                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 99));
                                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 99);
                                textView.setBackground(c02);
                                org.telegram.ui.ActionBar.r6.k(textView, c02, h, null, g6Var);
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                                o8Var = frameLayout;
                            }
                        } else {
                            o8Var = new jy(tzVar, tzVar.getContext());
                        }
                    } else {
                        Context context2 = tzVar.getContext();
                        rz rzVar = new rz(tzVar, true);
                        tzVar.T = rzVar;
                        ai.u1 u1Var = new ai.u1(tzVar, context2, rzVar);
                        u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        u1Var.setClipToPadding(false);
                        u1Var.i(new ci.l(3));
                        u1Var.setOnItemClickListener(new j(this, 5));
                        o8Var = u1Var;
                    }
                } else {
                    o8Var = new gy(tzVar, tzVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(tzVar.getContext(), true, false, tzVar.Z1, tzVar.f30986i2);
                o8Var2.setOnIconClickListener(new f0(this, 13));
                o8Var = o8Var2;
            }
        } else {
            o8Var = new cz(tzVar.getContext());
        }
        return new s4.b1(o8Var);
    }
}
