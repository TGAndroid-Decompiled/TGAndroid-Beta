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
public final class fy extends lm0 {
    public int E;
    public final wz F;
    public ArrayList h;
    public int f25141y;
    public int f25134c = -1;
    public int d = -1;
    public int e = -1;
    public int f25135f = -1;
    public final ArrayList f25136n = new ArrayList();
    public final SparseIntArray f25137r = new SparseIntArray();
    public final SparseIntArray f25138s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f25139w = new SparseIntArray();
    public final ArrayList f25140x = new ArrayList();

    public fy(wz wzVar) {
        this.F = wzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
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
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.f31056q1;
        int i11 = this.f25139w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            jy jyVar = (jy) arrayList.get(i11);
            if (!jyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f25140x.get(i11)).intValue();
                wzVar.f31050o1.add(Long.valueOf(jyVar.f26514b.f19243id));
                if (!UserConfig.getInstance(wzVar.f31014c1).isPremium() && !wzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = wzVar.Q.J * 3;
                if ((jyVar.f26516f && !jyVar.f26517g && (jyVar.e || z11)) || jyVar.h) {
                    min = jyVar.f26515c.size();
                } else {
                    min = Math.min(i12, jyVar.f26515c.size());
                }
                Integer num2 = null;
                if (jyVar.f26515c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                jyVar.h = true;
                int size = jyVar.f26515c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    wzVar.f31061r2 = view;
                    wzVar.f31065s2 = num.intValue();
                    wzVar.f31068t2 = num2.intValue() + num.intValue();
                    wzVar.f31071u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        wzVar.post(new ey(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.f31047n1;
        if (wzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f25136n);
        MediaDataController mediaDataController = MediaDataController.getInstance(wzVar.f31014c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19243id) || wzVar.f31053p1.contains(Long.valueOf(stickerSetCovered.set.f19243id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        uz uzVar = wzVar.T;
        if (uzVar != null) {
            uzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        wz wzVar = this.F;
        ArrayList arrayList = wzVar.f31047n1;
        ArrayList arrayList2 = wzVar.f31050o1;
        int i11 = wzVar.f31014c1;
        ArrayList arrayList3 = wzVar.f31056q1;
        arrayList3.clear();
        if (wzVar.f31015c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !wzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = wzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                jy jyVar = new jy();
                jyVar.f26514b = wzVar.J1.emojiset;
                jyVar.f26515c = new ArrayList(groupStickerSetById.documents);
                jyVar.e = true;
                jyVar.f26516f = true;
                jyVar.f26517g = false;
                jyVar.h = true;
                jyVar.f26518i = true;
                arrayList3.add(jyVar);
                TLRPC.StickerSet stickerSet2 = jyVar.f26514b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f19243id == stickerSet2.f19243id) {
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
                        jy jyVar2 = new jy();
                        jyVar2.f26514b = tL_messages_stickerSet2.set;
                        jyVar2.f26515c = new ArrayList(tL_messages_stickerSet2.documents);
                        jyVar2.e = true;
                        jyVar2.f26516f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f19243id);
                        jyVar2.f26517g = false;
                        jyVar2.h = true;
                        arrayList3.add(jyVar2);
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
                    jy jyVar3 = new jy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    jyVar3.f26514b = stickerSet3;
                    jyVar3.f26515c = tL_messages_stickerSet3.documents;
                    jyVar3.e = false;
                    jyVar3.f26516f = mediaDataController.isStickerPackInstalled(stickerSet3.f19243id);
                    jyVar3.f26517g = false;
                    jyVar3.h = z13;
                    arrayList3.add(jyVar3);
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
                        jy jyVar4 = new jy();
                        jyVar4.f26514b = tL_messages_stickerSet3.set;
                        jyVar4.f26515c = new ArrayList(arrayList5);
                        jyVar4.e = z13;
                        i10 = i14;
                        jyVar4.f26516f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19243id);
                        jyVar4.f26517g = false;
                        jyVar4.h = true;
                        arrayList3.add(jyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        jy jyVar5 = new jy();
                        jyVar5.f26514b = tL_messages_stickerSet3.set;
                        jyVar5.f26515c = new ArrayList(arrayList6);
                        jyVar5.e = false;
                        jyVar5.f26516f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19243id);
                        jyVar5.f26517g = false;
                        jyVar5.h = arrayList2.contains(Long.valueOf(jyVar5.f26514b.f19243id));
                        arrayList3.add(jyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                jy jyVar6 = new jy();
                jyVar6.f26516f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19243id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                jyVar6.f26514b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    jyVar6.f26515c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        jyVar6.f26515c = stickerSet5.documents;
                    } else {
                        jyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    jyVar6.f26515c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = jyVar6.f26515c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < jyVar6.f26515c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) jyVar6.f26515c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    jyVar6.e = !z12;
                    jyVar6.h = arrayList2.contains(Long.valueOf(jyVar6.f26514b.f19243id));
                    jyVar6.f26517g = true;
                    arrayList3.add(jyVar6);
                }
            }
            zx zxVar = wzVar.I;
            if (zxVar != null) {
                zxVar.p(wzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fy.H():void");
    }

    @Override
    public final int h() {
        return this.f25141y;
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
        if (i10 == this.f25134c || i10 == this.f25135f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f25137r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f31016d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f25139w.indexOfKey(i10) >= 0) {
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
        jy jyVar;
        int i12;
        int i13 = i10;
        wz wzVar = this.F;
        String[] strArr = wzVar.f31007a1;
        vx vxVar = wzVar.Q;
        int i14 = wzVar.f31014c1;
        ArrayList arrayList = wzVar.f31056q1;
        int i15 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z10 = true;
        jy jyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f25137r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        ly lyVar = (ly) view;
                        int i16 = this.f25139w.get(i13);
                        int i17 = vxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            jyVar2 = (jy) arrayList.get(i16);
                        }
                        if (jyVar2 != null) {
                            lyVar.f27136a.setText("+" + ((jyVar2.f26515c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ny nyVar = (ny) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                jy jyVar3 = (jy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    jyVar = (jy) arrayList.get(i18);
                } else {
                    jyVar = null;
                }
                if (jyVar3 == null || !jyVar3.f26517g || (jyVar != null && !jyVar.e && jyVar.f26516f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (jyVar3 != null && jyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(jyVar3.d, false);
                    jyVar3.d = null;
                }
                sg.q0 q0Var = nyVar.h;
                if (jyVar3 != null) {
                    nyVar.f27744s = jyVar3;
                    nyVar.v = z10;
                    nyVar.f27739b.l(jyVar3.f26514b.title, false);
                    TextView textView = nyVar.f27740c;
                    if (jyVar3.f26518i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (jyVar3.f26516f && !jyVar3.f26514b.official) {
                        q0Var.a(LocaleController.getString(R.string.Restore), new my(nyVar, 5), false);
                    } else {
                        q0Var.a(LocaleController.getString(R.string.Unlock), new my(nyVar, 6), false);
                    }
                    nyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f25134c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f25135f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((jy) arrayList.get(i19 - strArr.length)).f26514b.title);
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
        ez ezVar = (ez) view;
        ezVar.f24822a = i13;
        ezVar.e = null;
        if (wzVar.f31016d0) {
            i13--;
        }
        if (this.f25135f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = wzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = wzVar.getRecentEmoji().get(i13);
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
                            str = wz.g(str4, str5);
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
                int i22 = vxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f25140x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    jy jyVar4 = (jy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((jyVar4.f26516f && !jyVar4.f26517g && (jyVar4.e || isPremium)) || jyVar4.h) {
                        min = jyVar4.f26515c.size();
                    } else {
                        min = Math.min(i22, jyVar4.f26515c.size());
                    }
                    int i24 = ezVar.f24822a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        ezVar.e = jyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) jyVar4.f26515c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f19222id);
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
            ezVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            ezVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            ezVar.a(null, z10);
            if (ezVar.getSpan() == null || ezVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    ezVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    ezVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            ezVar.a(Emoji.getEmojiBigDrawable(str), z10);
            ezVar.setSpan(null);
        }
        ezVar.setTag(str2);
        ezVar.setContentDescription(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        bi.o0 o0Var;
        wz wzVar = this.F;
        org.telegram.ui.ActionBar.c6 c6Var = wzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(wzVar.getContext());
                                view.setLayoutParams(new s4.o0(-1, wzVar.f31010b1));
                                o0Var = view;
                            } else {
                                Context context = wzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f27136a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.a6.e(-2, -2, 17));
                                o0Var = frameLayout;
                            }
                        } else {
                            o0Var = new ny(wzVar, wzVar.getContext());
                        }
                    } else {
                        Context context2 = wzVar.getContext();
                        uz uzVar = new uz(wzVar, true);
                        wzVar.T = uzVar;
                        bi.o0 o0Var2 = new bi.o0(wzVar, context2, uzVar);
                        o0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        o0Var2.setClipToPadding(false);
                        o0Var2.i(new bi.o(3));
                        o0Var2.setOnItemClickListener(new j(this, 5));
                        o0Var = o0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(wzVar.getContext());
                    s6 s6Var = new s6(frameLayout2.getContext(), false, false, false);
                    s6Var.b(0.3f, 250L, es.h);
                    s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    s6Var.setTypeface(AndroidUtilities.bold());
                    s6Var.setTextColor(wzVar.A(org.telegram.ui.ActionBar.g6.Sh));
                    s6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, wzVar.A(org.telegram.ui.ActionBar.g6.Oh)));
                    frameLayout3.addView(s6Var, w7.a6.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.a6.d(-1.0f, -1));
                    sg.q0 q0Var = new sg.q0(frameLayout2.getContext(), c6Var, false);
                    q0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(q0Var, w7.a6.d(-1.0f, -1));
                    o0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(wzVar.getContext(), true, false, wzVar.Z1, wzVar.f31034i2);
                o8Var.setOnIconClickListener(new f0(this, 13));
                o0Var = o8Var;
            }
        } else {
            o0Var = new ez(wzVar.getContext());
        }
        return new s4.b1(o0Var);
    }
}
