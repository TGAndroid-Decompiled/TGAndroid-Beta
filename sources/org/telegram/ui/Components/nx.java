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
public final class nx extends il0 {
    public int A;
    public final fz B;
    public ArrayList h;
    public int f31166y;
    public int f31158c = -1;
    public int d = -1;
    public int f31159e = -1;
    public int f31160f = -1;
    public final ArrayList f31161n = new ArrayList();
    public final SparseIntArray f31162r = new SparseIntArray();
    public final SparseIntArray f31163s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f31164w = new SparseIntArray();
    public final ArrayList f31165x = new ArrayList();

    public nx(fz fzVar) {
        this.B = fzVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
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
        float f9;
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.f28613m1;
        int i11 = this.f31164w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            rx rxVar = (rx) arrayList.get(i11);
            if (!rxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f31165x.get(i11)).intValue();
                fzVar.f28609k1.add(Long.valueOf(rxVar.f32402b.f22419id));
                if (!UserConfig.getInstance(fzVar.Y0).isPremium() && !fzVar.Q0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = fzVar.M.J * 3;
                if ((rxVar.f32405f && !rxVar.f32406g && (rxVar.f32404e || z11)) || rxVar.h) {
                    min = rxVar.f32403c.size();
                } else {
                    min = Math.min(i12, rxVar.f32403c.size());
                }
                Integer num2 = null;
                if (rxVar.f32403c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                rxVar.h = true;
                int size = rxVar.f32403c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    fzVar.f28621o2 = view;
                    fzVar.f28624p2 = num.intValue();
                    fzVar.f28627q2 = num2.intValue() + num.intValue();
                    fzVar.f28631r2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f9 = 1.5f;
                        } else {
                            f9 = 4.0f;
                        }
                        fzVar.post(new lx(this, f9, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.f28606j1;
        if (fzVar.J2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f31161n);
        MediaDataController mediaDataController = MediaDataController.getInstance(fzVar.Y0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22419id) || fzVar.l1.contains(Long.valueOf(stickerSetCovered.set.f22419id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        dz dzVar = fzVar.P;
        if (dzVar != null) {
            dzVar.l();
        }
        f2.q.c(new mx(this, arrayList2, 0), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        fz fzVar = this.B;
        ArrayList arrayList = fzVar.f28606j1;
        ArrayList arrayList2 = fzVar.f28609k1;
        int i11 = fzVar.Y0;
        ArrayList arrayList3 = fzVar.f28613m1;
        arrayList3.clear();
        if (fzVar.Y1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !fzVar.Q0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = fzVar.F1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                rx rxVar = new rx();
                rxVar.f32402b = fzVar.F1.emojiset;
                rxVar.f32403c = new ArrayList(groupStickerSetById.documents);
                rxVar.f32404e = true;
                rxVar.f32405f = true;
                rxVar.f32406g = false;
                rxVar.h = true;
                rxVar.f32407i = true;
                arrayList3.add(rxVar);
                TLRPC.StickerSet stickerSet2 = rxVar.f32402b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f22419id == stickerSet2.f22419id) {
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
                        rx rxVar2 = new rx();
                        rxVar2.f32402b = tL_messages_stickerSet2.set;
                        rxVar2.f32403c = new ArrayList(tL_messages_stickerSet2.documents);
                        rxVar2.f32404e = true;
                        rxVar2.f32405f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id);
                        rxVar2.f32406g = false;
                        rxVar2.h = true;
                        arrayList3.add(rxVar2);
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
                    rx rxVar3 = new rx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    rxVar3.f32402b = stickerSet3;
                    rxVar3.f32403c = tL_messages_stickerSet3.documents;
                    rxVar3.f32404e = false;
                    rxVar3.f32405f = mediaDataController.isStickerPackInstalled(stickerSet3.f22419id);
                    rxVar3.f32406g = false;
                    rxVar3.h = z13;
                    arrayList3.add(rxVar3);
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
                        rx rxVar4 = new rx();
                        rxVar4.f32402b = tL_messages_stickerSet3.set;
                        rxVar4.f32403c = new ArrayList(arrayList5);
                        rxVar4.f32404e = z13;
                        i10 = i14;
                        rxVar4.f32405f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22419id);
                        rxVar4.f32406g = false;
                        rxVar4.h = true;
                        arrayList3.add(rxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        rx rxVar5 = new rx();
                        rxVar5.f32402b = tL_messages_stickerSet3.set;
                        rxVar5.f32403c = new ArrayList(arrayList6);
                        rxVar5.f32404e = false;
                        rxVar5.f32405f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22419id);
                        rxVar5.f32406g = false;
                        rxVar5.h = arrayList2.contains(Long.valueOf(rxVar5.f32402b.f22419id));
                        arrayList3.add(rxVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                rx rxVar6 = new rx();
                rxVar6.f32405f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22419id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                rxVar6.f32402b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    rxVar6.f32403c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        rxVar6.f32403c = stickerSet5.documents;
                    } else {
                        rxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    rxVar6.f32403c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = rxVar6.f32403c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < rxVar6.f32403c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) rxVar6.f32403c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    rxVar6.f32404e = !z12;
                    rxVar6.h = arrayList2.contains(Long.valueOf(rxVar6.f32402b.f22419id));
                    rxVar6.f32406g = true;
                    arrayList3.add(rxVar6);
                }
            }
            bw bwVar = fzVar.E;
            if (bwVar != null) {
                bwVar.p(fzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nx.H():void");
    }

    @Override
    public final int h() {
        return this.f31166y;
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
        if (i10 == this.f31158c || i10 == this.f31160f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f31162r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.B.W && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f31164w.indexOfKey(i10) >= 0) {
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
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        rx rxVar;
        int i12;
        int i13 = i10;
        fz fzVar = this.B;
        String[] strArr = fzVar.W0;
        ex exVar = fzVar.M;
        int i14 = fzVar.Y0;
        ArrayList arrayList = fzVar.f28613m1;
        int i15 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        rx rxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f31162r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        tx txVar = (tx) view;
                        int i16 = this.f31164w.get(i13);
                        int i17 = exVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            rxVar2 = (rx) arrayList.get(i16);
                        }
                        if (rxVar2 != null) {
                            txVar.f33057a.setText("+" + ((rxVar2.f32403c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                vx vxVar = (vx) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                rx rxVar3 = (rx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    rxVar = (rx) arrayList.get(i18);
                } else {
                    rxVar = null;
                }
                if (rxVar3 == null || !rxVar3.f32406g || (rxVar != null && !rxVar.f32404e && rxVar.f32405f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (rxVar3 != null && rxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(rxVar3.d, false);
                    rxVar3.d = null;
                }
                cg.d1 d1Var = vxVar.h;
                if (rxVar3 != null) {
                    vxVar.f34212s = rxVar3;
                    vxVar.v = z10;
                    vxVar.f34206b.l(rxVar3.f32402b.title, false);
                    TextView textView = vxVar.f34207c;
                    if (rxVar3.f32407i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (rxVar3.f32405f && !rxVar3.f32402b.official) {
                        d1Var.a(LocaleController.getString(R.string.Restore), new ux(vxVar, 5), false);
                    } else {
                        d1Var.a(LocaleController.getString(R.string.Unlock), new ux(vxVar, 6), false);
                    }
                    vxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            k8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f31158c) {
                k8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f31160f) {
                k8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    k8Var.b(0, ((rx) arrayList.get(i19 - strArr.length)).f32402b.title);
                    return;
                } catch (Exception unused) {
                    k8Var.b(0, "");
                    return;
                }
            } else {
                k8Var.b(0, strArr[i19]);
                return;
            }
        }
        ny nyVar = (ny) view;
        nyVar.f31193a = i13;
        nyVar.f31196e = null;
        if (fzVar.W) {
            i13--;
        }
        if (this.f31160f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = fzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = fzVar.getRecentEmoji().get(i13);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l10 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l10 = null;
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
                            str = fz.g(str4, str5);
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
                int i22 = exVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f31165x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    rx rxVar4 = (rx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((rxVar4.f32405f && !rxVar4.f32406g && (rxVar4.f32404e || isPremium)) || rxVar4.h) {
                        min = rxVar4.f32403c.size();
                    } else {
                        min = Math.min(i22, rxVar4.f32403c.size());
                    }
                    int i24 = nyVar.f31193a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        nyVar.f31196e = rxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) rxVar4.f32403c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f22398id);
                        }
                        Long l11 = valueOf;
                        document = document2;
                        l10 = l11;
                    } else {
                        i23++;
                    }
                }
            }
            l10 = null;
            document = null;
            z10 = false;
        }
        if (l10 != null) {
            nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            nyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            nyVar.a(null, z10);
            if (nyVar.getSpan() == null || nyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    nyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    nyVar.setSpan(new y5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            nyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            nyVar.setSpan(null);
        }
        nyVar.setTag(str2);
        nyVar.setContentDescription(str);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        jh.e1 e1Var;
        fz fzVar = this.B;
        org.telegram.ui.ActionBar.c6 c6Var = fzVar.V1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(fzVar.getContext());
                                view.setLayoutParams(new f2.x0(-1, fzVar.X0));
                                e1Var = view;
                            } else {
                                Context context = fzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f33057a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, i7.f6.e(-2, -2, 17));
                                e1Var = frameLayout;
                            }
                        } else {
                            e1Var = new vx(fzVar, fzVar.getContext());
                        }
                    } else {
                        Context context2 = fzVar.getContext();
                        dz dzVar = new dz(fzVar, true);
                        fzVar.P = dzVar;
                        jh.e1 e1Var2 = new jh.e1(fzVar, context2, dzVar);
                        e1Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        e1Var2.setClipToPadding(false);
                        e1Var2.i(new lh.j(1));
                        e1Var2.setOnItemClickListener(new k(this, 5));
                        e1Var = e1Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(fzVar.getContext());
                    o6 o6Var = new o6(frameLayout2.getContext(), false, false, false);
                    o6Var.b(0.3f, 250L, jr.h);
                    o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    o6Var.setTypeface(AndroidUtilities.bold());
                    o6Var.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.Sh));
                    o6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, fzVar.A(org.telegram.ui.ActionBar.g6.Oh)));
                    frameLayout3.addView(o6Var, i7.f6.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, i7.f6.c(-1.0f, -1));
                    cg.d1 d1Var = new cg.d1(frameLayout2.getContext(), c6Var, false);
                    d1Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(d1Var, i7.f6.c(-1.0f, -1));
                    e1Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(fzVar.getContext(), true, false, fzVar.V1, fzVar.f28591e2);
                k8Var.setOnIconClickListener(new h0(this, 14));
                e1Var = k8Var;
            }
        } else {
            e1Var = new ny(fzVar.getContext());
        }
        return new f2.n1(e1Var);
    }
}
