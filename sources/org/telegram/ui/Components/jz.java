package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
public final class jz extends lm0 {
    public final Context f29746c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f29747f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f29748n = new SparseArray();
    public final SparseIntArray f29749r = new SparseIntArray();
    public int f29750s;
    public final sz v;

    public jz(sz szVar, Context context) {
        this.v = szVar;
        this.f29746c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f47738a instanceof mm0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f29747f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        sz szVar = this.v;
        ArrayList arrayList = szVar.f32722d1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = szVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f29749r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = szVar.E1;
            } else {
                Object obj2 = this.e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return szVar.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return szVar.F1;
                    }
                    return szVar.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = szVar.E1;
            }
            return indexOf + i11;
        }
        int i13 = szVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = szVar.F1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jz.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f29750s;
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
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        String str;
        int i12;
        sz szVar = this.v;
        int i13 = szVar.f32719c1;
        int i14 = e1Var.f47741f;
        View view = e1Var.f47738a;
        SparseArray sparseArray = this.h;
        if (i14 != 0) {
            ArrayList<TLRPC.Document> arrayList = null;
            TLRPC.Chat chat = null;
            int i15 = 1;
            boolean z10 = true;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 5) {
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            s8Var.b(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i10 != this.f29750s - 1) {
                        z10 = false;
                    }
                    q8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                s8Var2.setHeaderOnClick(null);
                if (i10 == szVar.f32729f1) {
                    if (szVar.f32732g1 && szVar.f32735h1 == null) {
                        i11 = 0;
                    } else if (szVar.f32735h1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (szVar.J1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(szVar.J1.f22028id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    s8Var2.a(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        s8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !szVar.Q2) {
                            s8Var2.setEdit(new View.OnClickListener(this) {
                                public final jz f29408b;

                                {
                                    this.f29408b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f29408b.v.f32772t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f29408b.v.f32772t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        s8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final jz f29408b;

                            {
                                this.f29408b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f29408b.v.f32772t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f29408b.v.f32772t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == szVar.f32741j1) {
                    s8Var2.b(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == szVar.f32744k1) {
                    s8Var2.a(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == szVar.l1) {
                    s8Var2.a(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 == this.f29750s) {
                int i17 = this.f29749r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    i3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = szVar.f32741j1;
                    } else {
                        arrayList = szVar.f32744k1;
                    }
                }
                if (arrayList == null) {
                    i3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    i3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int C = org.telegram.messenger.vh.C(82.0f, (int) Math.ceil(arrayList.size() / this.d), szVar.h.getHeight());
                    if (C > 0) {
                        i15 = C;
                    }
                    i3Var.setHeight(i15);
                    return;
                }
            }
            i3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        i8Var.d(document, null, this.f29748n.get(i10), null, false, false);
        i8Var.setRecent(szVar.f32741j1.contains(document));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        sz szVar = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        Context context = this.f29746c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new ig.c2(1, context, u6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(this.f29746c, false, false, szVar.Z1, szVar.f32739i2);
                s8Var.setOnIconClickListener(new ga(14, this, s8Var));
                frameLayout = s8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.We, null);
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, gb1.x(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f24835a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.Sh, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, gb1.x(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final jz f29075b;

                    {
                        this.f29075b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                sz szVar2 = this.f29075b.v;
                                ty tyVar = szVar2.f32772t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.f22028id);
                                    return;
                                }
                                return;
                            case 1:
                                sz szVar3 = this.f29075b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.f32719c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.f32719c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22054id).commit();
                                    jz jzVar = szVar3.f32789y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.f29075b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new s4.q0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new s4.q0(-1, szVar.f32715b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(this.f29746c, false, false, szVar.Z1, szVar.f32739i2);
                s8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final jz f29075b;

                    {
                        this.f29075b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                sz szVar2 = this.f29075b.v;
                                ty tyVar = szVar2.f32772t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.f22028id);
                                    return;
                                }
                                return;
                            case 1:
                                sz szVar3 = this.f29075b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.f32719c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.f32719c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22054id).commit();
                                    jz jzVar = szVar3.f32789y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.f29075b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = s8Var2;
                break;
            case 6:
                qz qzVar = new qz(szVar, false);
                szVar.F0 = qzVar;
                bi.r1 r1Var = new bi.r1(szVar, context, qzVar);
                r1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                r1Var.setClipToPadding(false);
                r1Var.i(new di.l(4));
                r1Var.setOnItemClickListener(new j(this, 6));
                r1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = r1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.y6.Me;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.12f, szVar.A(i11)));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i11);
                linearLayout2.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(linearLayout2, c02, L, null, u6Var);
                gb1.c(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final jz f29075b;

                    {
                        this.f29075b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                sz szVar2 = this.f29075b.v;
                                ty tyVar = szVar2.f32772t1;
                                if (tyVar != null) {
                                    tyVar.y(szVar2.J1.f22028id);
                                    return;
                                }
                                return;
                            case 1:
                                sz szVar3 = this.f29075b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(szVar3.f32719c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(szVar3.f32719c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22054id).commit();
                                    jz jzVar = szVar3.f32789y0;
                                    if (jzVar != null) {
                                        jzVar.t(1, 2);
                                    }
                                    szVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.r2 r2Var = this.f29075b.v.Y1;
                                if (r2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) r2Var).ia();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, gb1.x(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.t.r(textView3, i11, u6Var, 1, 11.0f);
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, gb1.x(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, gb1.h(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new s4.e1(frameLayout);
    }
}
