package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class py extends yk0 {

    public final Context f31686c;
    public int d;

    public final SparseArray f31687e = new SparseArray();

    public final HashMap f31688f = new HashMap();
    public final SparseArray h = new SparseArray();

    public final SparseArray f31689n = new SparseArray();

    public final SparseIntArray f31690r = new SparseIntArray();

    public int f31691s;
    public final yy v;

    public py(yy yyVar, Context context) {
        this.v = yyVar;
        this.f31686c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5789a instanceof zk0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f31688f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int iIndexOf;
        int i11;
        yy yyVar = this.v;
        ArrayList arrayList = yyVar.Z0;
        Object obj = this.h.get(i10);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i12 = yyVar.C1;
            if (i12 >= 0) {
                return i12;
            }
            int i13 = yyVar.B1;
            if (i13 >= 0) {
                return i13;
            }
            return 0;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (this.d == 0) {
            int measuredWidth = yyVar.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d = measuredWidth / AndroidUtilities.dp(72.0f);
        }
        int i14 = this.f31690r.get(i10, Integer.MIN_VALUE);
        if (i14 == Integer.MIN_VALUE) {
            iIndexOf = arrayList.size() - 1;
            i11 = yyVar.A1;
        } else {
            Object obj2 = this.f31687e.get(i14);
            if (obj2 instanceof String) {
                if ("premium".equals(obj2)) {
                    return yyVar.E1;
                }
                return "recent".equals(obj2) ? yyVar.B1 : yyVar.C1;
            }
            iIndexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i11 = yyVar.A1;
        }
        return iIndexOf + i11;
    }

    public final void G() {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i11;
        int iCeil;
        int i12;
        HashMap map;
        int i13;
        int i14;
        int i15;
        SparseArray sparseArray;
        yy yyVar = this.v;
        int i16 = yyVar.Y0;
        if (yyVar.J2) {
            return;
        }
        int measuredWidth = yyVar.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = AndroidUtilities.displaySize.x;
        }
        int iDp = measuredWidth / AndroidUtilities.dp(72.0f);
        this.d = iDp;
        yyVar.A0.y1(iDp);
        SparseArray sparseArray2 = this.f31687e;
        sparseArray2.clear();
        HashMap map2 = this.f31688f;
        map2.clear();
        SparseIntArray sparseIntArray = this.f31690r;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.h;
        sparseArray3.clear();
        int i17 = 0;
        this.f31691s = 0;
        ArrayList arrayList2 = yyVar.Z0;
        int i18 = -5;
        int i19 = -5;
        int i20 = 0;
        boolean z10 = false;
        while (i19 < arrayList2.size()) {
            if (i19 == i18) {
                int i21 = this.f31691s;
                this.f31691s = i21 + 1;
                sparseArray3.put(i21, "search");
                i20++;
                yyVar = yyVar;
                i11 = i16;
                map = map2;
                i10 = i19;
            } else if (i19 == -4) {
                MediaDataController mediaDataController = MediaDataController.getInstance(i16);
                SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i16);
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                if (yyVar.f35005i1.isEmpty()) {
                    i10 = i19;
                } else {
                    int i22 = i19;
                    if (emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i17).set.f22407id) {
                        int i23 = this.f31691s;
                        this.f31691s = i23 + 1;
                        sparseArray3.put(i23, "trend1");
                        int i24 = this.f31691s;
                        this.f31691s = i24 + 1;
                        sparseArray3.put(i24, "trend2");
                        i20 += 2;
                        yyVar = yyVar;
                        i11 = i16;
                        map = map2;
                        i10 = i22;
                    } else {
                        i10 = i22;
                    }
                }
                i11 = i16;
                map = map2;
            } else {
                i10 = i19;
                if (i10 == -3) {
                    arrayList = yyVar.f34999g1;
                    map2.put("fav", Integer.valueOf(this.f31691s));
                    obj = "fav";
                } else {
                    if (i10 == -2) {
                        arrayList = yyVar.f34996f1;
                        if (!arrayList.isEmpty() && !yyVar.I2) {
                            z10 = true;
                        }
                        map2.put("recent", Integer.valueOf(this.f31691s));
                        obj = "recent";
                    } else {
                        if (i10 == -1) {
                            i11 = i16;
                        } else {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i10);
                            ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                            if (!z10 && !yyVar.I2) {
                                ArrayList<TLRPC.Document> arrayList4 = new ArrayList<>(arrayList3);
                                arrayList4.add(0, new TLRPC.TL_documentEmpty());
                                arrayList3 = arrayList4;
                                z10 = true;
                            }
                            map2.put(tL_messages_stickerSet2, Integer.valueOf(this.f31691s));
                            ArrayList<TLRPC.Document> arrayList5 = arrayList3;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList5;
                            obj = null;
                        }
                        map = map2;
                    }
                    i11 = i16;
                    if (i10 == yyVar.f34978a1) {
                        yyVar.f34981b1 = this.f31691s;
                        if (arrayList.isEmpty()) {
                            sparseArray2.put(i20, tL_messages_stickerSet);
                            int i25 = i20 + 1;
                            sparseIntArray.put(this.f31691s, i20);
                            sparseArray2.put(i25, tL_messages_stickerSet);
                            i20 += 2;
                            sparseIntArray.put(this.f31691s + 1, i25);
                            int i26 = this.f31691s;
                            this.f31691s = i26 + 1;
                            sparseArray3.put(i26, tL_messages_stickerSet);
                            int i27 = this.f31691s;
                            this.f31691s = i27 + 1;
                            sparseArray3.put(i27, "group");
                        } else if (!arrayList.isEmpty()) {
                            yyVar = yyVar;
                            iCeil = (int) Math.ceil(arrayList.size() / this.d);
                            if (tL_messages_stickerSet != null) {
                                sparseArray3.put(this.f31691s, tL_messages_stickerSet);
                            } else {
                                sparseArray3.put(this.f31691s, arrayList);
                            }
                            sparseIntArray.put(this.f31691s, i20);
                            i12 = 0;
                            while (i12 < arrayList.size()) {
                                int i28 = i12 + 1;
                                i15 = i28 + this.f31691s;
                                HashMap map3 = map2;
                                sparseArray3.put(i15, arrayList.get(i12));
                                sparseArray = this.f31689n;
                                if (tL_messages_stickerSet != null) {
                                    sparseArray.put(i15, tL_messages_stickerSet);
                                } else {
                                    sparseArray.put(i15, obj);
                                }
                                sparseIntArray.put(i28 + this.f31691s, (i12 / this.d) + i20 + 1);
                                i12 = i28;
                                map2 = map3;
                            }
                            map = map2;
                            i13 = 0;
                            while (true) {
                                i14 = iCeil + 1;
                                if (i13 < i14) {
                                    break;
                                }
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(i20 + i13, tL_messages_stickerSet);
                                } else if (i10 == -1) {
                                    sparseArray2.put(i20 + i13, "premium");
                                } else if (i10 == -2) {
                                    sparseArray2.put(i20 + i13, "recent");
                                } else {
                                    sparseArray2.put(i20 + i13, "fav");
                                }
                                i13++;
                            }
                            this.f31691s = (this.d * iCeil) + 1 + this.f31691s;
                            i20 += i14;
                        }
                        map = map2;
                    } else if (!arrayList.isEmpty()) {
                        yyVar = yyVar;
                        iCeil = (int) Math.ceil(arrayList.size() / this.d);
                        if (tL_messages_stickerSet != null) {
                            sparseArray3.put(this.f31691s, tL_messages_stickerSet);
                        } else {
                            sparseArray3.put(this.f31691s, arrayList);
                        }
                        sparseIntArray.put(this.f31691s, i20);
                        i12 = 0;
                        while (i12 < arrayList.size()) {
                            int i29 = i12 + 1;
                            i15 = i29 + this.f31691s;
                            HashMap map4 = map2;
                            sparseArray3.put(i15, arrayList.get(i12));
                            sparseArray = this.f31689n;
                            if (tL_messages_stickerSet != null) {
                                sparseArray.put(i15, tL_messages_stickerSet);
                            } else {
                                sparseArray.put(i15, obj);
                            }
                            sparseIntArray.put(i29 + this.f31691s, (i12 / this.d) + i20 + 1);
                            i12 = i29;
                            map2 = map4;
                        }
                        map = map2;
                        i13 = 0;
                        while (true) {
                            i14 = iCeil + 1;
                            if (i13 < i14) {
                                break;
                                break;
                            }
                            if (tL_messages_stickerSet != null) {
                                sparseArray2.put(i20 + i13, tL_messages_stickerSet);
                            } else if (i10 == -1) {
                                sparseArray2.put(i20 + i13, "premium");
                            } else if (i10 == -2) {
                                sparseArray2.put(i20 + i13, "recent");
                            } else {
                                sparseArray2.put(i20 + i13, "fav");
                            }
                            i13++;
                        }
                        this.f31691s = (this.d * iCeil) + 1 + this.f31691s;
                        i20 += i14;
                    } else {
                        map = map2;
                    }
                }
                tL_messages_stickerSet = null;
                i11 = i16;
                if (i10 == yyVar.f34978a1) {
                    yyVar.f34981b1 = this.f31691s;
                    if (arrayList.isEmpty()) {
                        sparseArray2.put(i20, tL_messages_stickerSet);
                        int i210 = i20 + 1;
                        sparseIntArray.put(this.f31691s, i20);
                        sparseArray2.put(i210, tL_messages_stickerSet);
                        i20 += 2;
                        sparseIntArray.put(this.f31691s + 1, i210);
                        int i211 = this.f31691s;
                        this.f31691s = i211 + 1;
                        sparseArray3.put(i211, tL_messages_stickerSet);
                        int i212 = this.f31691s;
                        this.f31691s = i212 + 1;
                        sparseArray3.put(i212, "group");
                    } else if (!arrayList.isEmpty()) {
                        yyVar = yyVar;
                        iCeil = (int) Math.ceil(arrayList.size() / this.d);
                        if (tL_messages_stickerSet != null) {
                            sparseArray3.put(this.f31691s, tL_messages_stickerSet);
                        } else {
                            sparseArray3.put(this.f31691s, arrayList);
                        }
                        sparseIntArray.put(this.f31691s, i20);
                        i12 = 0;
                        while (i12 < arrayList.size()) {
                            int i213 = i12 + 1;
                            i15 = i213 + this.f31691s;
                            HashMap map5 = map2;
                            sparseArray3.put(i15, arrayList.get(i12));
                            sparseArray = this.f31689n;
                            if (tL_messages_stickerSet != null) {
                                sparseArray.put(i15, tL_messages_stickerSet);
                            } else {
                                sparseArray.put(i15, obj);
                            }
                            sparseIntArray.put(i213 + this.f31691s, (i12 / this.d) + i20 + 1);
                            i12 = i213;
                            map2 = map5;
                        }
                        map = map2;
                        i13 = 0;
                        while (true) {
                            i14 = iCeil + 1;
                            if (i13 < i14) {
                                break;
                                break;
                            }
                            if (tL_messages_stickerSet != null) {
                                sparseArray2.put(i20 + i13, tL_messages_stickerSet);
                            } else if (i10 == -1) {
                                sparseArray2.put(i20 + i13, "premium");
                            } else if (i10 == -2) {
                                sparseArray2.put(i20 + i13, "recent");
                            } else {
                                sparseArray2.put(i20 + i13, "fav");
                            }
                            i13++;
                        }
                        this.f31691s = (this.d * iCeil) + 1 + this.f31691s;
                        i20 += i14;
                    }
                    map = map2;
                } else if (!arrayList.isEmpty()) {
                    map = map2;
                } else {
                    yyVar = yyVar;
                    iCeil = (int) Math.ceil(arrayList.size() / this.d);
                    if (tL_messages_stickerSet != null) {
                        sparseArray3.put(this.f31691s, tL_messages_stickerSet);
                    } else {
                        sparseArray3.put(this.f31691s, arrayList);
                    }
                    sparseIntArray.put(this.f31691s, i20);
                    i12 = 0;
                    while (i12 < arrayList.size()) {
                        int i214 = i12 + 1;
                        i15 = i214 + this.f31691s;
                        HashMap map6 = map2;
                        sparseArray3.put(i15, arrayList.get(i12));
                        sparseArray = this.f31689n;
                        if (tL_messages_stickerSet != null) {
                            sparseArray.put(i15, tL_messages_stickerSet);
                        } else {
                            sparseArray.put(i15, obj);
                        }
                        sparseIntArray.put(i214 + this.f31691s, (i12 / this.d) + i20 + 1);
                        i12 = i214;
                        map2 = map6;
                    }
                    map = map2;
                    i13 = 0;
                    while (true) {
                        i14 = iCeil + 1;
                        if (i13 < i14) {
                            break;
                            break;
                        }
                        if (tL_messages_stickerSet != null) {
                            sparseArray2.put(i20 + i13, tL_messages_stickerSet);
                        } else if (i10 == -1) {
                            sparseArray2.put(i20 + i13, "premium");
                        } else if (i10 == -2) {
                            sparseArray2.put(i20 + i13, "recent");
                        } else {
                            sparseArray2.put(i20 + i13, "fav");
                        }
                        i13++;
                    }
                    this.f31691s = (this.d * iCeil) + 1 + this.f31691s;
                    i20 += i14;
                }
            }
            i19 = i10 + 1;
            i16 = i11;
            yyVar = yyVar;
            map2 = map;
            i17 = 0;
            i18 = -5;
        }
    }

    @Override
    public final int h() {
        int i10 = this.f31691s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 4;
        }
        Object obj = this.h.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return obj instanceof TLRPC.TL_documentEmpty ? 7 : 0;
        }
        if (!(obj instanceof String)) {
            return 2;
        }
        if ("trend1".equals(obj)) {
            return 5;
        }
        return "trend2".equals(obj) ? 6 : 3;
    }

    @Override
    public final void l() {
        G();
        super.l();
    }

    @Override
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        yy yyVar = this.v;
        int i12 = yyVar.Y0;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        SparseArray sparseArray = this.h;
        if (i13 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
            org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
            a8Var.d(document, null, this.f31689n.get(i10), null, false, false);
            a8Var.setRecent(yyVar.f34996f1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        final int i14 = 1;
        if (i13 == 1) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 != this.f31691s) {
                i3Var.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i15 = this.f31690r.get(i10 - 1, Integer.MIN_VALUE);
            if (i15 == Integer.MIN_VALUE) {
                i3Var.setHeight(1);
                return;
            }
            Object obj = this.f31687e.get(i15);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? yyVar.f34996f1 : yyVar.f34999g1;
            }
            if (arrayList == null) {
                i3Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                i3Var.setHeight(AndroidUtilities.dp(8.0f));
                return;
            } else {
                int iZ = org.telegram.messenger.rl.z(82.0f, (int) Math.ceil(arrayList.size() / this.d), yyVar.h.getHeight());
                i3Var.setHeight(iZ > 0 ? iZ : 1);
                return;
            }
        }
        final int i16 = 0;
        if (i13 != 2) {
            if (i13 == 3) {
                ((org.telegram.ui.Cells.i8) view).setIsLast(i10 == this.f31691s - 1);
                return;
            } else {
                if (i13 != 5) {
                    return;
                }
                ((org.telegram.ui.Cells.j8) view).c(LocaleController.getString(MediaDataController.getInstance(i12).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                return;
            }
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
        j8Var.setHeaderOnClick(null);
        if (i10 == yyVar.f34981b1) {
            if (yyVar.f34985c1 && yyVar.f34988d1 == null) {
                i11 = 0;
            } else {
                i11 = yyVar.f34988d1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            }
            TLRPC.Chat chat = yyVar.F1 != null ? MessagesController.getInstance(i12).getChat(Long.valueOf(yyVar.F1.f22381id)) : null;
            j8Var.b(i11, LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i10);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                j8Var.b(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !yyVar.I2) {
                    j8Var.setEdit(new View.OnClickListener(this) {

                        public final py f31059b;

                        {
                            this.f31059b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i16) {
                                case 0:
                                    this.f31059b.v.f35025p1.d(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    this.f31059b.v.f35025p1.d(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                j8Var.setHeaderOnClick(new View.OnClickListener(this) {

                    public final py f31059b;

                    {
                        this.f31059b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.f31059b.v.f35025p1.d(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                this.f31059b.v.f35025p1.d(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == yyVar.f34996f1) {
            j8Var.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
        } else if (obj2 == yyVar.f34999g1) {
            j8Var.b(0, LocaleController.getString(R.string.FavoriteStickers));
        } else if (obj2 == yyVar.f35002h1) {
            j8Var.b(0, LocaleController.getString(R.string.PremiumStickers));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        final int i11 = 2;
        final int i12 = 0;
        final int i13 = 1;
        boolean z10 = true;
        yy yyVar = this.v;
        Context context = this.f31686c;
        ?? oyVar = 0;
        switch (i10) {
            case 0:
                oyVar = new oy(i12, context, yyVar.V1, z10 ? 1 : 0);
                break;
            case 1:
                oyVar = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.f31686c, false, false, yyVar.V1, yyVar.f34993e2);
                j8Var.setOnIconClickListener(new q2(20, this, j8Var));
                oyVar = j8Var;
                break;
            case 3:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(context);
                i8Var.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                i8Var.addView(textView, h7.z5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                i8Var.f24498a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                i8Var.addView(textView2, h7.z5.t(-2, 28, 51, 17, 10, 14, 8));
                i8Var.setAddOnClickListener(new View.OnClickListener(this) {

                    public final py f30777b;

                    {
                        this.f30777b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                yy yyVar2 = this.f30777b.v;
                                xx xxVar = yyVar2.f35025p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.f22381id);
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.f30777b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    py pyVar = yyVar3.f35041u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f30777b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                }
                                break;
                        }
                    }
                });
                i8Var.setLayoutParams(new f2.y0(-1, -2));
                oyVar = i8Var;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new f2.y0(-1, yyVar.X0));
                oyVar = view;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f31686c, false, false, yyVar.V1, yyVar.f34993e2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) {

                    public final py f30777b;

                    {
                        this.f30777b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                yy yyVar2 = this.f30777b.v;
                                xx xxVar = yyVar2.f35025p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.f22381id);
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.f30777b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    py pyVar = yyVar3.f35041u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f30777b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                }
                                break;
                        }
                    }
                });
                oyVar = j8Var2;
                break;
            case 6:
                wy wyVar = new wy(yyVar, false);
                yyVar.B0 = wyVar;
                hh.f1 f1Var = new hh.f1(yyVar, context, wyVar);
                f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                f1Var.setClipToPadding(false);
                f1Var.i(new jh.j(i11));
                f1Var.setOnItemClickListener(new j(this, 6));
                f1Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(52.0f)));
                oyVar = f1Var;
                break;
            case 7:
                ?? frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int iDp = AndroidUtilities.dp(13.0f);
                int i14 = org.telegram.ui.ActionBar.g6.Me;
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.l1(0.12f, yyVar.B(i14))));
                h7.b6.b(linearLayout, 0.1f, 1.5f);
                linearLayout.setOnClickListener(new View.OnClickListener(this) {

                    public final py f30777b;

                    {
                        this.f30777b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                yy yyVar2 = this.f30777b.v;
                                xx xxVar = yyVar2.f35025p1;
                                if (xxVar != null) {
                                    xxVar.y(yyVar2.F1.f22381id);
                                }
                                break;
                            case 1:
                                yy yyVar3 = this.f30777b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(yyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(yyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    py pyVar = yyVar3.f35041u0;
                                    if (pyVar != null) {
                                        pyVar.t(1, 2);
                                    }
                                    yyVar3.Z(false);
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f30777b.v.U1;
                                if (n2Var instanceof org.telegram.ui.rn) {
                                    ((org.telegram.ui.rn) n2Var).Y9();
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(yyVar.B(i14), PorterDuff.Mode.SRC_IN));
                linearLayout.addView(imageView, h7.z5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(yyVar.B(i14));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout.addView(textView3, h7.z5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, h7.z5.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                oyVar = frameLayout;
                break;
        }
        return new lk0(oyVar);
    }
}
