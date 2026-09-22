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
public final class sx extends kl0 {
    public int E;
    public final kz F;
    public ArrayList h;
    public int f27990y;
    public int f27983c = -1;
    public int d = -1;
    public int e = -1;
    public int f27984f = -1;
    public final ArrayList f27985n = new ArrayList();
    public final SparseIntArray f27986r = new SparseIntArray();
    public final SparseIntArray f27987s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f27988w = new SparseIntArray();
    public final ArrayList f27989x = new ArrayList();

    public sx(kz kzVar) {
        this.F = kzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
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
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25742q1;
        int i11 = this.f27988w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            wx wxVar = (wx) arrayList.get(i11);
            if (!wxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f27989x.get(i11)).intValue();
                kzVar.f25736o1.add(Long.valueOf(wxVar.f29820b.f18136id));
                if (!UserConfig.getInstance(kzVar.f25700c1).isPremium() && !kzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = kzVar.Q.J * 3;
                if ((wxVar.f29822f && !wxVar.f29823g && (wxVar.e || z11)) || wxVar.h) {
                    min = wxVar.f29821c.size();
                } else {
                    min = Math.min(i12, wxVar.f29821c.size());
                }
                Integer num2 = null;
                if (wxVar.f29821c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                wxVar.h = true;
                int size = wxVar.f29821c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    kzVar.f25747r2 = view;
                    kzVar.f25751s2 = num.intValue();
                    kzVar.f25754t2 = num2.intValue() + num.intValue();
                    kzVar.f25757u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        kzVar.post(new rx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25733n1;
        if (kzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f27985n);
        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f25700c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18136id) || kzVar.f25739p1.contains(Long.valueOf(stickerSetCovered.set.f18136id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        iz izVar = kzVar.T;
        if (izVar != null) {
            izVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25733n1;
        ArrayList arrayList2 = kzVar.f25736o1;
        int i11 = kzVar.f25700c1;
        ArrayList arrayList3 = kzVar.f25742q1;
        arrayList3.clear();
        if (kzVar.f25701c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !kzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = kzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                wx wxVar = new wx();
                wxVar.f29820b = kzVar.J1.emojiset;
                wxVar.f29821c = new ArrayList(groupStickerSetById.documents);
                wxVar.e = true;
                wxVar.f29822f = true;
                wxVar.f29823g = false;
                wxVar.h = true;
                wxVar.f29824i = true;
                arrayList3.add(wxVar);
                TLRPC.StickerSet stickerSet2 = wxVar.f29820b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f18136id == stickerSet2.f18136id) {
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
                        wx wxVar2 = new wx();
                        wxVar2.f29820b = tL_messages_stickerSet2.set;
                        wxVar2.f29821c = new ArrayList(tL_messages_stickerSet2.documents);
                        wxVar2.e = true;
                        wxVar2.f29822f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f18136id);
                        wxVar2.f29823g = false;
                        wxVar2.h = true;
                        arrayList3.add(wxVar2);
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
                    wx wxVar3 = new wx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    wxVar3.f29820b = stickerSet3;
                    wxVar3.f29821c = tL_messages_stickerSet3.documents;
                    wxVar3.e = false;
                    wxVar3.f29822f = mediaDataController.isStickerPackInstalled(stickerSet3.f18136id);
                    wxVar3.f29823g = false;
                    wxVar3.h = z13;
                    arrayList3.add(wxVar3);
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
                        wx wxVar4 = new wx();
                        wxVar4.f29820b = tL_messages_stickerSet3.set;
                        wxVar4.f29821c = new ArrayList(arrayList5);
                        wxVar4.e = z13;
                        i10 = i14;
                        wxVar4.f29822f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18136id);
                        wxVar4.f29823g = false;
                        wxVar4.h = true;
                        arrayList3.add(wxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        wx wxVar5 = new wx();
                        wxVar5.f29820b = tL_messages_stickerSet3.set;
                        wxVar5.f29821c = new ArrayList(arrayList6);
                        wxVar5.e = false;
                        wxVar5.f29822f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18136id);
                        wxVar5.f29823g = false;
                        wxVar5.h = arrayList2.contains(Long.valueOf(wxVar5.f29820b.f18136id));
                        arrayList3.add(wxVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                wx wxVar6 = new wx();
                wxVar6.f29822f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18136id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                wxVar6.f29820b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    wxVar6.f29821c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        wxVar6.f29821c = stickerSet5.documents;
                    } else {
                        wxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    wxVar6.f29821c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = wxVar6.f29821c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < wxVar6.f29821c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) wxVar6.f29821c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    wxVar6.e = !z12;
                    wxVar6.h = arrayList2.contains(Long.valueOf(wxVar6.f29820b.f18136id));
                    wxVar6.f29823g = true;
                    arrayList3.add(wxVar6);
                }
            }
            nx nxVar = kzVar.I;
            if (nxVar != null) {
                nxVar.p(kzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx.H():void");
    }

    @Override
    public final int h() {
        return this.f27990y;
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
        if (i10 == this.f27983c || i10 == this.f27984f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f27986r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f25702d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f27988w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        wx wxVar;
        int i12;
        int i13 = i10;
        kz kzVar = this.F;
        String[] strArr = kzVar.f25693a1;
        jx jxVar = kzVar.Q;
        int i14 = kzVar.f25700c1;
        ArrayList arrayList = kzVar.f25742q1;
        int i15 = c1Var.f42674f;
        View view = c1Var.f42671a;
        boolean z10 = true;
        wx wxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f27986r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        yx yxVar = (yx) view;
                        int i16 = this.f27988w.get(i13);
                        int i17 = jxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            wxVar2 = (wx) arrayList.get(i16);
                        }
                        if (wxVar2 != null) {
                            yxVar.f30425a.setText("+" + ((wxVar2.f29821c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ay ayVar = (ay) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                wx wxVar3 = (wx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    wxVar = (wx) arrayList.get(i18);
                } else {
                    wxVar = null;
                }
                if (wxVar3 == null || !wxVar3.f29823g || (wxVar != null && !wxVar.e && wxVar.f29822f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (wxVar3 != null && wxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(wxVar3.d, false);
                    wxVar3.d = null;
                }
                rg.p0 p0Var = ayVar.h;
                if (wxVar3 != null) {
                    ayVar.f22508s = wxVar3;
                    ayVar.v = z10;
                    ayVar.f22503b.l(wxVar3.f29820b.title, false);
                    TextView textView = ayVar.f22504c;
                    if (wxVar3.f29824i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (wxVar3.f29822f && !wxVar3.f29820b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new zx(ayVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new zx(ayVar, 6), false);
                    }
                    ayVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f27983c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f27984f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((wx) arrayList.get(i19 - strArr.length)).f29820b.title);
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
        ty tyVar = (ty) view;
        tyVar.f28200a = i13;
        tyVar.e = null;
        if (kzVar.f25702d0) {
            i13--;
        }
        if (this.f27984f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = kzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = kzVar.getRecentEmoji().get(i13);
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
                            str = kz.g(str4, str5);
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
                int i22 = jxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27989x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    wx wxVar4 = (wx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((wxVar4.f29822f && !wxVar4.f29823g && (wxVar4.e || isPremium)) || wxVar4.h) {
                        min = wxVar4.f29821c.size();
                    } else {
                        min = Math.min(i22, wxVar4.f29821c.size());
                    }
                    int i24 = tyVar.f28200a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        tyVar.e = wxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) wxVar4.f29821c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f18115id);
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
            tyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            tyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            tyVar.a(null, z10);
            if (tyVar.getSpan() == null || tyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    tyVar.setSpan(new x5(document, (Paint.FontMetricsInt) null));
                } else {
                    tyVar.setSpan(new x5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            tyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            tyVar.setSpan(null);
        }
        tyVar.setTag(str2);
        tyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        kz kzVar = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = kzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(kzVar.getContext());
                                view.setLayoutParams(new s4.p0(-1, kzVar.f25696b1));
                                w0Var = view;
                            } else {
                                Context context = kzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30425a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Te, e6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new ay(kzVar, kzVar.getContext());
                        }
                    } else {
                        Context context2 = kzVar.getContext();
                        iz izVar = new iz(kzVar, true);
                        kzVar.T = izVar;
                        ai.w0 w0Var2 = new ai.w0(kzVar, context2, izVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(kzVar.getContext());
                    n6 n6Var = new n6(frameLayout2.getContext(), false, false, false);
                    n6Var.b(0.3f, 250L, qr.h);
                    n6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    n6Var.setTypeface(AndroidUtilities.bold());
                    n6Var.setTextColor(kzVar.z(org.telegram.ui.ActionBar.i6.Sh));
                    n6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, kzVar.z(org.telegram.ui.ActionBar.i6.Oh)));
                    frameLayout3.addView(n6Var, w7.x5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.x5.c(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.x5.c(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(kzVar.getContext(), true, false, kzVar.Z1, kzVar.f25720i2);
                o8Var.setOnIconClickListener(new f0(this, 14));
                w0Var = o8Var;
            }
        } else {
            w0Var = new ty(kzVar.getContext());
        }
        return new s4.c1(w0Var);
    }
}
