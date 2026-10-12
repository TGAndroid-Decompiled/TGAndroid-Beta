package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
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
public final class my extends vm0 {
    public int E;
    public final d00 F;
    public ArrayList h;
    public int f28673y;
    public int f28665c = -1;
    public int d = -1;
    public int f28666e = -1;
    public int f28667f = -1;
    public final ArrayList f28668n = new ArrayList();
    public final SparseIntArray f28669r = new SparseIntArray();
    public final SparseIntArray f28670s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28671w = new SparseIntArray();
    public final ArrayList f28672x = new ArrayList();

    public my(d00 d00Var) {
        this.F = d00Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47901f;
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
        d00 d00Var = this.F;
        ArrayList arrayList = d00Var.f25115q1;
        int i11 = this.f28671w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            qy qyVar = (qy) arrayList.get(i11);
            if (!qyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f28672x.get(i11)).intValue();
                d00Var.f25109o1.add(Long.valueOf(qyVar.f29948b.f19830id));
                if (!UserConfig.getInstance(d00Var.f25072c1).isPremium() && !d00Var.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = d00Var.Q.J * 3;
                if ((qyVar.f29951f && !qyVar.f29952g && (qyVar.f29950e || z11)) || qyVar.h) {
                    min = qyVar.f29949c.size();
                } else {
                    min = Math.min(i12, qyVar.f29949c.size());
                }
                Integer num2 = null;
                if (qyVar.f29949c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                qyVar.h = true;
                int size = qyVar.f29949c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    d00Var.f25120r2 = view;
                    d00Var.f25124s2 = num.intValue();
                    d00Var.f25127t2 = num2.intValue() + num.intValue();
                    d00Var.f25130u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        d00Var.post(new ly(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        d00 d00Var = this.F;
        ArrayList arrayList = d00Var.f25106n1;
        if (d00Var.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28668n);
        MediaDataController mediaDataController = MediaDataController.getInstance(d00Var.f25072c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19830id) || d00Var.f25112p1.contains(Long.valueOf(stickerSetCovered.set.f19830id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        b00 b00Var = d00Var.T;
        if (b00Var != null) {
            b00Var.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        d00 d00Var = this.F;
        ArrayList arrayList = d00Var.f25106n1;
        ArrayList arrayList2 = d00Var.f25109o1;
        int i11 = d00Var.f25072c1;
        ArrayList arrayList3 = d00Var.f25115q1;
        arrayList3.clear();
        if (d00Var.f25073c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !d00Var.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = d00Var.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                qy qyVar = new qy();
                qyVar.f29948b = d00Var.J1.emojiset;
                qyVar.f29949c = new ArrayList(groupStickerSetById.documents);
                qyVar.f29950e = true;
                qyVar.f29951f = true;
                qyVar.f29952g = false;
                qyVar.h = true;
                qyVar.f29953i = true;
                arrayList3.add(qyVar);
                TLRPC.StickerSet stickerSet2 = qyVar.f29948b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f19830id == stickerSet2.f19830id) {
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
                        qy qyVar2 = new qy();
                        qyVar2.f29948b = tL_messages_stickerSet2.set;
                        qyVar2.f29949c = new ArrayList(tL_messages_stickerSet2.documents);
                        qyVar2.f29950e = true;
                        qyVar2.f29951f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f19830id);
                        qyVar2.f29952g = false;
                        qyVar2.h = true;
                        arrayList3.add(qyVar2);
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
                    qy qyVar3 = new qy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    qyVar3.f29948b = stickerSet3;
                    qyVar3.f29949c = tL_messages_stickerSet3.documents;
                    qyVar3.f29950e = false;
                    qyVar3.f29951f = mediaDataController.isStickerPackInstalled(stickerSet3.f19830id);
                    qyVar3.f29952g = false;
                    qyVar3.h = z13;
                    arrayList3.add(qyVar3);
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
                        qy qyVar4 = new qy();
                        qyVar4.f29948b = tL_messages_stickerSet3.set;
                        qyVar4.f29949c = new ArrayList(arrayList5);
                        qyVar4.f29950e = z13;
                        i10 = i14;
                        qyVar4.f29951f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19830id);
                        qyVar4.f29952g = false;
                        qyVar4.h = true;
                        arrayList3.add(qyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        qy qyVar5 = new qy();
                        qyVar5.f29948b = tL_messages_stickerSet3.set;
                        qyVar5.f29949c = new ArrayList(arrayList6);
                        qyVar5.f29950e = false;
                        qyVar5.f29951f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19830id);
                        qyVar5.f29952g = false;
                        qyVar5.h = arrayList2.contains(Long.valueOf(qyVar5.f29948b.f19830id));
                        arrayList3.add(qyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                qy qyVar6 = new qy();
                qyVar6.f29951f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19830id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                qyVar6.f29948b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    qyVar6.f29949c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        qyVar6.f29949c = stickerSet5.documents;
                    } else {
                        qyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    qyVar6.f29949c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = qyVar6.f29949c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < qyVar6.f29949c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) qyVar6.f29949c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    qyVar6.f29950e = !z12;
                    qyVar6.h = arrayList2.contains(Long.valueOf(qyVar6.f29948b.f19830id));
                    qyVar6.f29952g = true;
                    arrayList3.add(qyVar6);
                }
            }
            hy hyVar = d00Var.I;
            if (hyVar != null) {
                hyVar.p(d00Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.my.H():void");
    }

    @Override
    public final int h() {
        return this.f28673y;
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
        if (i10 == this.f28665c || i10 == this.f28667f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28669r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f25074d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f28671w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        qy qyVar;
        int i12;
        int i13 = i10;
        d00 d00Var = this.F;
        String[] strArr = d00Var.f25065a1;
        dy dyVar = d00Var.Q;
        int i14 = d00Var.f25072c1;
        ArrayList arrayList = d00Var.f25115q1;
        int i15 = d1Var.f47901f;
        View view = d1Var.f47897a;
        boolean z10 = true;
        qy qyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f28669r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        sy syVar = (sy) view;
                        int i16 = this.f28671w.get(i13);
                        int i17 = dyVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            qyVar2 = (qy) arrayList.get(i16);
                        }
                        if (qyVar2 != null) {
                            syVar.f30704a.setText("+" + ((qyVar2.f29949c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                uy uyVar = (uy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                qy qyVar3 = (qy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    qyVar = (qy) arrayList.get(i18);
                } else {
                    qyVar = null;
                }
                if (qyVar3 == null || !qyVar3.f29952g || (qyVar != null && !qyVar.f29950e && qyVar.f29951f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (qyVar3 != null && qyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(qyVar3.d, false);
                    qyVar3.d = null;
                }
                rg.q0 q0Var = uyVar.h;
                if (qyVar3 != null) {
                    uyVar.f31286s = qyVar3;
                    uyVar.v = z10;
                    uyVar.f31280b.l(qyVar3.f29948b.title, false);
                    TextView textView = uyVar.f31281c;
                    if (qyVar3.f29953i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (qyVar3.f29951f && !qyVar3.f29948b.official) {
                        q0Var.a(LocaleController.getString(R.string.Restore), new ty(uyVar, 5), false);
                    } else {
                        q0Var.a(LocaleController.getString(R.string.Unlock), new ty(uyVar, 6), false);
                    }
                    uyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f28665c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f28667f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((qy) arrayList.get(i19 - strArr.length)).f29948b.title);
                    return;
                } catch (Exception unused) {
                    o8Var.b(0, "");
                    return;
                }
            } else {
                o8Var.b(0, strArr[i19]);
                return;
            }
        }
        lz lzVar = (lz) view;
        lzVar.f28317a = i13;
        lzVar.f28320e = null;
        if (d00Var.f25074d0) {
            i13--;
        }
        if (this.f28667f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = d00Var.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = d00Var.getRecentEmoji().get(i13);
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
                            str = d00.g(str4, str5);
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
                int i22 = dyVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28672x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    qy qyVar4 = (qy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((qyVar4.f29951f && !qyVar4.f29952g && (qyVar4.f29950e || isPremium)) || qyVar4.h) {
                        min = qyVar4.f29949c.size();
                    } else {
                        min = Math.min(i22, qyVar4.f29949c.size());
                    }
                    int i24 = lzVar.f28317a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        lzVar.f28320e = qyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) qyVar4.f29949c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f19809id);
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
            lzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            lzVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            lzVar.a(null, z10);
            if (lzVar.getSpan() == null || lzVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    lzVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    lzVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            lzVar.a(Emoji.getEmojiBigDrawable(str), z10);
            lzVar.setSpan(null);
        }
        lzVar.setTag(str2);
        lzVar.setContentDescription(str);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        d00 d00Var = this.F;
        org.telegram.ui.ActionBar.c6 c6Var = d00Var.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(d00Var.getContext());
                                view.setLayoutParams(new s4.q0(-1, d00Var.f25068b1));
                                w0Var = view;
                            } else {
                                Context context = d00Var.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30704a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Te, c6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.w5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new uy(d00Var, d00Var.getContext());
                        }
                    } else {
                        Context context2 = d00Var.getContext();
                        b00 b00Var = new b00(d00Var, true);
                        d00Var.T = b00Var;
                        ai.w0 w0Var2 = new ai.w0(d00Var, context2, b00Var);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(d00Var.getContext());
                    r6 r6Var = new r6(frameLayout2.getContext(), false, false, false);
                    r6Var.b(0.3f, 250L, js.h);
                    r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    r6Var.setTypeface(AndroidUtilities.bold());
                    r6Var.setTextColor(d00Var.A(org.telegram.ui.ActionBar.h6.Sh));
                    r6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, d00Var.A(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(r6Var, w7.w5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.w5.d(-1.0f, -1));
                    rg.q0 q0Var = new rg.q0(frameLayout2.getContext(), c6Var, false);
                    q0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(q0Var, w7.w5.d(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(d00Var.getContext(), true, false, d00Var.Z1, d00Var.f25093i2);
                o8Var.setOnIconClickListener(new f0(this, 13));
                w0Var = o8Var;
            }
        } else {
            w0Var = new lz(d00Var.getContext());
        }
        return new s4.d1(w0Var);
    }
}
