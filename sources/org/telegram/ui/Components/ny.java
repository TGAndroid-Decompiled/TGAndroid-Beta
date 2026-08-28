package org.telegram.ui.Components;

import android.content.Context;
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
public final class ny extends vk0 {
    public final Context f31212c;
    public int d;
    public final SparseArray f31213e = new SparseArray();
    public final HashMap f31214f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f31215n = new SparseArray();
    public final SparseIntArray f31216r = new SparseIntArray();
    public int f31217s;
    public final wy v;

    public ny(wy wyVar, Context context) {
        this.v = wyVar;
        this.f31212c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f5501a instanceof wk0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f31214f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i9) {
        int indexOf;
        int i10;
        wy wyVar = this.v;
        ArrayList arrayList = wyVar.Z0;
        Object obj = this.h.get(i9);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i9 == 0) {
                i9 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = wyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i11 = this.f31216r.get(i9, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = wyVar.A1;
            } else {
                Object obj2 = this.f31213e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return wyVar.E1;
                    }
                    if ("recent".equals(obj2)) {
                        return wyVar.B1;
                    }
                    return wyVar.C1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = wyVar.A1;
            }
            return indexOf + i10;
        }
        int i12 = wyVar.C1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = wyVar.B1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ny.G():void");
    }

    @Override
    public final int h() {
        int i9 = this.f31217s;
        if (i9 != 0) {
            return i9 + 1;
        }
        return 0;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 4;
        }
        Object obj = this.h.get(i9);
        if (obj != null) {
            if (obj instanceof TLRPC.Document) {
                if (obj instanceof TLRPC.TL_documentEmpty) {
                    return 7;
                }
                return 0;
            } else if (obj instanceof String) {
                if ("trend1".equals(obj)) {
                    return 5;
                }
                if ("trend2".equals(obj)) {
                    return 6;
                }
                return 3;
            } else {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void l() {
        G();
        super.l();
    }

    @Override
    public final void t(int i9, int i10) {
        G();
        super.t(i9, i10);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String str;
        int i11;
        wy wyVar = this.v;
        int i12 = wyVar.Y0;
        int i13 = q1Var.f5505f;
        View view = q1Var.f5501a;
        SparseArray sparseArray = this.h;
        if (i13 != 0) {
            ArrayList<TLRPC.Document> arrayList = null;
            TLRPC.Chat chat = null;
            int i14 = 1;
            boolean z10 = true;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 5) {
                            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                            if (MediaDataController.getInstance(i12).loadFeaturedPremium) {
                                i11 = R.string.FeaturedStickersPremium;
                            } else {
                                i11 = R.string.FeaturedStickers;
                            }
                            m8Var.c(LocaleController.getString(i11), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i9 != this.f31217s - 1) {
                        z10 = false;
                    }
                    l8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.setHeaderOnClick(null);
                if (i9 == wyVar.f34388b1) {
                    if (wyVar.f34392c1 && wyVar.f34395d1 == null) {
                        i10 = 0;
                    } else if (wyVar.f34395d1 != null) {
                        i10 = R.drawable.msg_mini_customize;
                    } else {
                        i10 = R.drawable.msg_close;
                    }
                    if (wyVar.F1 != null) {
                        chat = MessagesController.getInstance(i12).getChat(Long.valueOf(wyVar.F1.f22381id));
                    }
                    int i15 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    m8Var2.b(i10, LocaleController.formatString("CurrentGroupStickers", i15, str));
                    return;
                }
                Object obj = sparseArray.get(i9);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        m8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !wyVar.I2) {
                            m8Var2.setEdit(new View.OnClickListener(this) {
                                public final ny f30945b;

                                {
                                    this.f30945b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f30945b.v.f34432p1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f30945b.v.f34432p1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        m8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final ny f30945b;

                            {
                                this.f30945b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f30945b.v.f34432p1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f30945b.v.f34432p1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == wyVar.f34403f1) {
                    m8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == wyVar.f34406g1) {
                    m8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == wyVar.f34409h1) {
                    m8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i9 == this.f31217s) {
                int i16 = this.f31216r.get(i9 - 1, Integer.MIN_VALUE);
                if (i16 == Integer.MIN_VALUE) {
                    l3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f31213e.get(i16);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = wyVar.f34403f1;
                    } else {
                        arrayList = wyVar.f34406g1;
                    }
                }
                if (arrayList == null) {
                    l3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    l3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.ll.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), wyVar.h.getHeight());
                    if (A > 0) {
                        i14 = A;
                    }
                    l3Var.setHeight(i14);
                    return;
                }
            }
            l3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i9);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f31215n.get(i9), null, false, false);
        d8Var.setRecent(wyVar.f34403f1.contains(document));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        wy wyVar = this.v;
        Context context = this.f31212c;
        FrameLayout frameLayout = null;
        switch (i9) {
            case 0:
                frameLayout = new of.x1(1, context, wyVar.V1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.f31212c, false, false, wyVar.V1, wyVar.f34400e2);
                m8Var.setOnIconClickListener(new s2(19, this, m8Var));
                frameLayout = m8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, g7.e6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f24672a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, g7.e6.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final ny f30583b;

                    {
                        this.f30583b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                wy wyVar2 = this.f30583b.v;
                                wx wxVar = wyVar2.f34432p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.f22381id);
                                    return;
                                }
                                return;
                            case 1:
                                wy wyVar3 = this.f30583b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    ny nyVar = wyVar3.f34448u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f30583b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new f2.a1(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new f2.a1(-1, wyVar.X0));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.f31212c, false, false, wyVar.V1, wyVar.f34400e2);
                m8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final ny f30583b;

                    {
                        this.f30583b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wy wyVar2 = this.f30583b.v;
                                wx wxVar = wyVar2.f34432p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.f22381id);
                                    return;
                                }
                                return;
                            case 1:
                                wy wyVar3 = this.f30583b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    ny nyVar = wyVar3.f34448u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f30583b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = m8Var2;
                break;
            case 6:
                uy uyVar = new uy(wyVar, false);
                wyVar.B0 = uyVar;
                gh.f1 f1Var = new gh.f1(wyVar, context, uyVar);
                f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                f1Var.setClipToPadding(false);
                f1Var.i(new ih.l(3));
                f1Var.setOnItemClickListener(new j(this, 6));
                f1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = f1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i10 = org.telegram.ui.ActionBar.f6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, wyVar.z(i10))));
                g7.g6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final ny f30583b;

                    {
                        this.f30583b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wy wyVar2 = this.f30583b.v;
                                wx wxVar = wyVar2.f34432p1;
                                if (wxVar != null) {
                                    wxVar.y(wyVar2.F1.f22381id);
                                    return;
                                }
                                return;
                            case 1:
                                wy wyVar3 = this.f30583b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wyVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wyVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22407id).commit();
                                    ny nyVar = wyVar3.f34448u0;
                                    if (nyVar != null) {
                                        nyVar.t(1, 2);
                                    }
                                    wyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f30583b.v.U1;
                                if (o2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i10), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, g7.e6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(wyVar.z(i10));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, g7.e6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, g7.e6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new f2.q1(frameLayout);
    }
}
