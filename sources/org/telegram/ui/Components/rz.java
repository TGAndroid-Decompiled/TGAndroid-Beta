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
public final class rz extends rm0 {
    public final Context f30564c;
    public int d;
    public final SparseArray f30565e = new SparseArray();
    public final HashMap f30566f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f30567n = new SparseArray();
    public final SparseIntArray f30568r = new SparseIntArray();
    public int f30569s;
    public final b00 v;

    public rz(b00 b00Var, Context context) {
        this.v = b00Var;
        this.f30564c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f47748a instanceof sm0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f30566f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        b00 b00Var = this.v;
        ArrayList arrayList = b00Var.f24665d1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = b00Var.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f30568r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = b00Var.E1;
            } else {
                Object obj2 = this.f30565e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return b00Var.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return b00Var.F1;
                    }
                    return b00Var.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = b00Var.E1;
            }
            return indexOf + i11;
        }
        int i13 = b00Var.G1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = b00Var.F1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rz.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f30569s;
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String str;
        int i12;
        b00 b00Var = this.v;
        int i13 = b00Var.f24662c1;
        int i14 = d1Var.f47752f;
        View view = d1Var.f47748a;
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
                            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            o8Var.c(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i10 != this.f30569s - 1) {
                        z10 = false;
                    }
                    n8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                o8Var2.setHeaderOnClick(null);
                if (i10 == b00Var.f24673f1) {
                    if (b00Var.f24676g1 && b00Var.f24679h1 == null) {
                        i11 = 0;
                    } else if (b00Var.f24679h1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (b00Var.J1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(b00Var.J1.f20033id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    o8Var2.b(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        o8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !b00Var.M2) {
                            o8Var2.setEdit(new View.OnClickListener(this) {
                                public final rz f30266b;

                                {
                                    this.f30266b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f30266b.v.f24716t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f30266b.v.f24716t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        o8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final rz f30266b;

                            {
                                this.f30266b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f30266b.v.f24716t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f30266b.v.f24716t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == b00Var.f24685j1) {
                    o8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == b00Var.f24688k1) {
                    o8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == b00Var.l1) {
                    o8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i10 == this.f30569s) {
                int i17 = this.f30568r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    l3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f30565e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = b00Var.f24685j1;
                    } else {
                        arrayList = b00Var.f24688k1;
                    }
                }
                if (arrayList == null) {
                    l3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    l3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.ai.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), b00Var.h.getHeight());
                    if (B > 0) {
                        i15 = B;
                    }
                    l3Var.setHeight(i15);
                    return;
                }
            }
            l3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        f8Var.d(document, null, this.f30567n.get(i10), null, false, false);
        f8Var.setRecent(b00Var.f24685j1.contains(document));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        b00 b00Var = this.v;
        Context context = this.f30564c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new gg.e2(1, context, b00Var.Z1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(this.f30564c, false, false, b00Var.Z1, b00Var.f24683i2);
                o8Var.setOnIconClickListener(new vt(2, this, o8Var));
                frameLayout = o8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, w7.x5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f22539a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.q.m(14.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 1, textView2);
                textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, w7.x5.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final rz f29871b;

                    {
                        this.f29871b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                b00 b00Var2 = this.f29871b.v;
                                bz bzVar = b00Var2.f24716t1;
                                if (bzVar != null) {
                                    bzVar.y(b00Var2.J1.f20033id);
                                    return;
                                }
                                return;
                            case 1:
                                b00 b00Var3 = this.f29871b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(b00Var3.f24662c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(b00Var3.f24662c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20059id).commit();
                                    rz rzVar = b00Var3.f24733y0;
                                    if (rzVar != null) {
                                        rzVar.t(1, 2);
                                    }
                                    b00Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f29871b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.zn) {
                                    ((org.telegram.ui.zn) m2Var).da();
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
                view.setLayoutParams(new s4.q0(-1, b00Var.f24658b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f30564c, false, false, b00Var.Z1, b00Var.f24683i2);
                o8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final rz f29871b;

                    {
                        this.f29871b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                b00 b00Var2 = this.f29871b.v;
                                bz bzVar = b00Var2.f24716t1;
                                if (bzVar != null) {
                                    bzVar.y(b00Var2.J1.f20033id);
                                    return;
                                }
                                return;
                            case 1:
                                b00 b00Var3 = this.f29871b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(b00Var3.f24662c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(b00Var3.f24662c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20059id).commit();
                                    rz rzVar = b00Var3.f24733y0;
                                    if (rzVar != null) {
                                        rzVar.t(1, 2);
                                    }
                                    b00Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f29871b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.zn) {
                                    ((org.telegram.ui.zn) m2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = o8Var2;
                break;
            case 6:
                zz zzVar = new zz(b00Var, false);
                b00Var.F0 = zzVar;
                ai.w0 w0Var = new ai.w0(b00Var, context, zzVar);
                w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                w0Var.setClipToPadding(false);
                w0Var.i(new ai.t(4));
                w0Var.setOnItemClickListener(new j(this, 6));
                w0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = w0Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.h6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.12f, b00Var.B(i11))));
                w7.z5.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final rz f29871b;

                    {
                        this.f29871b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                b00 b00Var2 = this.f29871b.v;
                                bz bzVar = b00Var2.f24716t1;
                                if (bzVar != null) {
                                    bzVar.y(b00Var2.J1.f20033id);
                                    return;
                                }
                                return;
                            case 1:
                                b00 b00Var3 = this.f29871b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(b00Var3.f24662c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(b00Var3.f24662c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20059id).commit();
                                    rz rzVar = b00Var3.f24733y0;
                                    if (rzVar != null) {
                                        rzVar.t(1, 2);
                                    }
                                    b00Var3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f29871b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.zn) {
                                    ((org.telegram.ui.zn) m2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(b00Var.B(i11), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, w7.x5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(b00Var.B(i11));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, w7.x5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, w7.x5.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 119));
                frameLayout = frameLayout2;
                break;
        }
        return new s4.d1(frameLayout);
    }
}
