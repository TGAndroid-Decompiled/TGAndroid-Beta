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
public final class jy extends pm0 {
    public int E;
    public final a00 F;
    public ArrayList h;
    public int f27801y;
    public int f27793c = -1;
    public int d = -1;
    public int f27794e = -1;
    public int f27795f = -1;
    public final ArrayList f27796n = new ArrayList();
    public final SparseIntArray f27797r = new SparseIntArray();
    public final SparseIntArray f27798s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f27799w = new SparseIntArray();
    public final ArrayList f27800x = new ArrayList();

    public jy(a00 a00Var) {
        this.F = a00Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47662f;
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
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.f24444q1;
        int i11 = this.f27799w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            ny nyVar = (ny) arrayList.get(i11);
            if (!nyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f27800x.get(i11)).intValue();
                a00Var.f24438o1.add(Long.valueOf(nyVar.f29301b.f20065id));
                if (!UserConfig.getInstance(a00Var.f24401c1).isPremium() && !a00Var.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = a00Var.Q.J * 3;
                if ((nyVar.f29304f && !nyVar.f29305g && (nyVar.f29303e || z11)) || nyVar.h) {
                    min = nyVar.f29302c.size();
                } else {
                    min = Math.min(i12, nyVar.f29302c.size());
                }
                Integer num2 = null;
                if (nyVar.f29302c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                nyVar.h = true;
                int size = nyVar.f29302c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    a00Var.f24449r2 = view;
                    a00Var.f24453s2 = num.intValue();
                    a00Var.f24456t2 = num2.intValue() + num.intValue();
                    a00Var.f24459u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        a00Var.post(new iy(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.f24435n1;
        if (a00Var.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f27796n);
        MediaDataController mediaDataController = MediaDataController.getInstance(a00Var.f24401c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20065id) || a00Var.f24441p1.contains(Long.valueOf(stickerSetCovered.set.f20065id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        yz yzVar = a00Var.T;
        if (yzVar != null) {
            yzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        a00 a00Var = this.F;
        ArrayList arrayList = a00Var.f24435n1;
        ArrayList arrayList2 = a00Var.f24438o1;
        int i11 = a00Var.f24401c1;
        ArrayList arrayList3 = a00Var.f24444q1;
        arrayList3.clear();
        if (a00Var.f24402c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !a00Var.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = a00Var.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                ny nyVar = new ny();
                nyVar.f29301b = a00Var.J1.emojiset;
                nyVar.f29302c = new ArrayList(groupStickerSetById.documents);
                nyVar.f29303e = true;
                nyVar.f29304f = true;
                nyVar.f29305g = false;
                nyVar.h = true;
                nyVar.f29306i = true;
                arrayList3.add(nyVar);
                TLRPC.StickerSet stickerSet2 = nyVar.f29301b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f20065id == stickerSet2.f20065id) {
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
                        ny nyVar2 = new ny();
                        nyVar2.f29301b = tL_messages_stickerSet2.set;
                        nyVar2.f29302c = new ArrayList(tL_messages_stickerSet2.documents);
                        nyVar2.f29303e = true;
                        nyVar2.f29304f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f20065id);
                        nyVar2.f29305g = false;
                        nyVar2.h = true;
                        arrayList3.add(nyVar2);
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
                    ny nyVar3 = new ny();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    nyVar3.f29301b = stickerSet3;
                    nyVar3.f29302c = tL_messages_stickerSet3.documents;
                    nyVar3.f29303e = false;
                    nyVar3.f29304f = mediaDataController.isStickerPackInstalled(stickerSet3.f20065id);
                    nyVar3.f29305g = false;
                    nyVar3.h = z13;
                    arrayList3.add(nyVar3);
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
                        ny nyVar4 = new ny();
                        nyVar4.f29301b = tL_messages_stickerSet3.set;
                        nyVar4.f29302c = new ArrayList(arrayList5);
                        nyVar4.f29303e = z13;
                        i10 = i14;
                        nyVar4.f29304f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20065id);
                        nyVar4.f29305g = false;
                        nyVar4.h = true;
                        arrayList3.add(nyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        ny nyVar5 = new ny();
                        nyVar5.f29301b = tL_messages_stickerSet3.set;
                        nyVar5.f29302c = new ArrayList(arrayList6);
                        nyVar5.f29303e = false;
                        nyVar5.f29304f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20065id);
                        nyVar5.f29305g = false;
                        nyVar5.h = arrayList2.contains(Long.valueOf(nyVar5.f29301b.f20065id));
                        arrayList3.add(nyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ny nyVar6 = new ny();
                nyVar6.f29304f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20065id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                nyVar6.f29301b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    nyVar6.f29302c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        nyVar6.f29302c = stickerSet5.documents;
                    } else {
                        nyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    nyVar6.f29302c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = nyVar6.f29302c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < nyVar6.f29302c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) nyVar6.f29302c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    nyVar6.f29303e = !z12;
                    nyVar6.h = arrayList2.contains(Long.valueOf(nyVar6.f29301b.f20065id));
                    nyVar6.f29305g = true;
                    arrayList3.add(nyVar6);
                }
            }
            ey eyVar = a00Var.I;
            if (eyVar != null) {
                eyVar.p(a00Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy.H():void");
    }

    @Override
    public final int h() {
        return this.f27801y;
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
        if (i10 == this.f27793c || i10 == this.f27795f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f27797r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f24403d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f27799w.indexOfKey(i10) >= 0) {
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
        ny nyVar;
        int i12;
        int i13 = i10;
        a00 a00Var = this.F;
        String[] strArr = a00Var.f24394a1;
        zx zxVar = a00Var.Q;
        int i14 = a00Var.f24401c1;
        ArrayList arrayList = a00Var.f24444q1;
        int i15 = d1Var.f47662f;
        View view = d1Var.f47658a;
        boolean z10 = true;
        ny nyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f27797r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        py pyVar = (py) view;
                        int i16 = this.f27799w.get(i13);
                        int i17 = zxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            nyVar2 = (ny) arrayList.get(i16);
                        }
                        if (nyVar2 != null) {
                            pyVar.f29960a.setText("+" + ((nyVar2.f29302c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ry ryVar = (ry) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                ny nyVar3 = (ny) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    nyVar = (ny) arrayList.get(i18);
                } else {
                    nyVar = null;
                }
                if (nyVar3 == null || !nyVar3.f29305g || (nyVar != null && !nyVar.f29303e && nyVar.f29304f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (nyVar3 != null && nyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(nyVar3.d, false);
                    nyVar3.d = null;
                }
                rg.p0 p0Var = ryVar.h;
                if (nyVar3 != null) {
                    ryVar.f30541s = nyVar3;
                    ryVar.v = z10;
                    ryVar.f30535b.l(nyVar3.f29301b.title, false);
                    TextView textView = ryVar.f30536c;
                    if (nyVar3.f29306i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (nyVar3.f29304f && !nyVar3.f29301b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new qy(ryVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new qy(ryVar, 6), false);
                    }
                    ryVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f27793c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f27795f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((ny) arrayList.get(i19 - strArr.length)).f29301b.title);
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
        iz izVar = (iz) view;
        izVar.f27517a = i13;
        izVar.f27520e = null;
        if (a00Var.f24403d0) {
            i13--;
        }
        if (this.f27795f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = a00Var.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = a00Var.getRecentEmoji().get(i13);
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
                            str = a00.g(str4, str5);
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
                int i22 = zxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27800x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ny nyVar4 = (ny) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((nyVar4.f29304f && !nyVar4.f29305g && (nyVar4.f29303e || isPremium)) || nyVar4.h) {
                        min = nyVar4.f29302c.size();
                    } else {
                        min = Math.min(i22, nyVar4.f29302c.size());
                    }
                    int i24 = izVar.f27517a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        izVar.f27520e = nyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) nyVar4.f29302c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f20044id);
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
            izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            izVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            izVar.a(null, z10);
            if (izVar.getSpan() == null || izVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    izVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    izVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            izVar.a(Emoji.getEmojiBigDrawable(str), z10);
            izVar.setSpan(null);
        }
        izVar.setTag(str2);
        izVar.setContentDescription(str);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        a00 a00Var = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = a00Var.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(a00Var.getContext());
                                view.setLayoutParams(new s4.q0(-1, a00Var.f24397b1));
                                w0Var = view;
                            } else {
                                Context context = a00Var.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f29960a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new ry(a00Var, a00Var.getContext());
                        }
                    } else {
                        Context context2 = a00Var.getContext();
                        yz yzVar = new yz(a00Var, true);
                        a00Var.T = yzVar;
                        ai.w0 w0Var2 = new ai.w0(a00Var, context2, yzVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(a00Var.getContext());
                    r6 r6Var = new r6(frameLayout2.getContext(), false, false, false);
                    r6Var.b(0.3f, 250L, hs.h);
                    r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    r6Var.setTypeface(AndroidUtilities.bold());
                    r6Var.setTextColor(a00Var.B(org.telegram.ui.ActionBar.i6.Sh));
                    r6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, a00Var.B(org.telegram.ui.ActionBar.i6.Oh)));
                    frameLayout3.addView(r6Var, w7.x5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.x5.d(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.x5.d(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(a00Var.getContext(), true, false, a00Var.Z1, a00Var.f24422i2);
                o8Var.setOnIconClickListener(new f0(this, 13));
                w0Var = o8Var;
            }
        } else {
            w0Var = new iz(a00Var.getContext());
        }
        return new s4.d1(w0Var);
    }
}
