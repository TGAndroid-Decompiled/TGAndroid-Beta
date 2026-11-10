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
import org.telegram.tgnet.TLRPC;
public final class xx extends oj0 {
    public final Context f40425c;
    public int d;
    public final SparseArray f40426e = new SparseArray();
    public final HashMap f40427f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40428n = new SparseArray();
    public final SparseIntArray f40429r = new SparseIntArray();
    public int f40430s;
    public final gy f40431w;

    public xx(gy gyVar, Context context) {
        this.f40431w = gyVar;
        this.f40425c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f57052a instanceof pj0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f40427f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        gy gyVar = this.f40431w;
        ArrayList arrayList = gyVar.f34019d1;
        Object obj = this.h.get(i7);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i7 == 0) {
                i7 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = gyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f22567q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f40429r.get(i7, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = gyVar.E1;
            } else {
                Object obj2 = this.f40426e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return gyVar.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return gyVar.F1;
                    }
                    return gyVar.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = gyVar.E1;
            }
            return indexOf + i10;
        }
        int i12 = gyVar.G1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = gyVar.F1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xx.G():void");
    }

    @Override
    public final int b() {
        int i7 = this.f40430s;
        if (i7 != 0) {
            return i7 + 1;
        }
        return 0;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 4;
        }
        Object obj = this.h.get(i7);
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
    public final void f() {
        G();
        super.f();
    }

    @Override
    public final void p(int i7, int i10) {
        G();
        super.p(i7, i10);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        TLRPC.Chat chat;
        String str;
        int i11;
        gy gyVar = this.f40431w;
        int i12 = gyVar.f34016c1;
        int i13 = d1Var.f57056f;
        View view = d1Var.f57052a;
        SparseArray sparseArray = this.h;
        if (i13 != 0) {
            int i14 = 1;
            boolean z9 = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 5) {
                            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                            if (org.telegram.messenger.ui.b0(i12).f25841r0) {
                                i11 = 2131750832;
                            } else {
                                i11 = 2131750833;
                            }
                            j8Var.b(org.telegram.messenger.id.M0(i11, null), 2131232096, org.telegram.messenger.id.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view;
                    if (i7 != this.f40430s - 1) {
                        z9 = false;
                    }
                    h8Var.setIsLast(z9);
                    return;
                }
                org.telegram.ui.Cells.j8 j8Var2 = (org.telegram.ui.Cells.j8) view;
                j8Var2.setHeaderOnClick(null);
                if (i7 == gyVar.f34026f1) {
                    if (gyVar.f34029g1 && gyVar.f34032h1 == null) {
                        i10 = 0;
                    } else if (gyVar.f34032h1 != null) {
                        i10 = 2131232237;
                    } else {
                        i10 = 2131232096;
                    }
                    if (gyVar.J1 != null) {
                        chat = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(gyVar.J1.f26961id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    j8Var2.a(i10, org.telegram.messenger.id.a0("CurrentGroupStickers", null, 2131751694, str));
                    return;
                }
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        j8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !gyVar.S2) {
                            j8Var2.setEdit(new View.OnClickListener(this) {
                                public final xx f40104b;

                                {
                                    this.f40104b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f40104b.f40431w.f34068t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f40104b.f40431w.f34068t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        j8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final xx f40104b;

                            {
                                this.f40104b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f40104b.f40431w.f34068t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f40104b.f40431w.f34068t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == gyVar.f34038j1) {
                    j8Var2.b(org.telegram.messenger.id.M0(2131746364, null), 2131232096, org.telegram.messenger.id.M0(2131752063, null), 0, 0);
                    return;
                } else if (obj == gyVar.f34041k1) {
                    j8Var2.a(0, org.telegram.messenger.id.M0(2131750841, null));
                    return;
                } else if (obj == gyVar.l1) {
                    j8Var2.a(0, org.telegram.messenger.id.M0(2131746947, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 == this.f40430s) {
                int i15 = this.f40429r.get(i7 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f40426e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = gyVar.f34038j1;
                    } else {
                        arrayList = gyVar.f34041k1;
                    }
                }
                if (arrayList == null) {
                    m3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), gyVar.h.getHeight());
                    if (A > 0) {
                        i14 = A;
                    }
                    m3Var.setHeight(i14);
                    return;
                }
            }
            m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        z7Var.d(document, null, this.f40428n.get(i7), null, false, false);
        z7Var.setRecent(gyVar.f34038j1.contains(document));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        gy gyVar = this.f40431w;
        org.telegram.ui.ActionBar.h6 h6Var = gyVar.Z1;
        Context context = this.f40425c;
        FrameLayout frameLayout = null;
        switch (i7) {
            case 0:
                frameLayout = new jg.c2(1, context, h6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.f40425c, false, false, gyVar.Z1, gyVar.f34036i2);
                j8Var.setOnIconClickListener(new kk(10, this, j8Var));
                frameLayout = j8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Lf, null);
                jg.g.v(textView, 1, 14.0f, null, 2131749396);
                linearLayout.addView(textView, c8.ha.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f29310a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131752116, null).toUpperCase());
                linearLayout.addView(textView2, c8.ha.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final xx f39755b;

                    {
                        this.f39755b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                gy gyVar2 = this.f39755b.f40431w;
                                hx hxVar = gyVar2.f34068t1;
                                if (hxVar != null) {
                                    hxVar.y(gyVar2.J1.f26961id);
                                    return;
                                }
                                return;
                            case 1:
                                gy gyVar3 = this.f39755b.f40431w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(gyVar3.f34016c1).f25844s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(gyVar3.f34016c1).f24788f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26987id).commit();
                                    xx xxVar = gyVar3.f34085y0;
                                    if (xxVar != null) {
                                        xxVar.p(1, 2);
                                    }
                                    gyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.f39755b.f40431w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new v4.o0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new v4.o0(-1, gyVar.f34012b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f40425c, false, false, gyVar.Z1, gyVar.f34036i2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final xx f39755b;

                    {
                        this.f39755b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                gy gyVar2 = this.f39755b.f40431w;
                                hx hxVar = gyVar2.f34068t1;
                                if (hxVar != null) {
                                    hxVar.y(gyVar2.J1.f26961id);
                                    return;
                                }
                                return;
                            case 1:
                                gy gyVar3 = this.f39755b.f40431w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(gyVar3.f34016c1).f25844s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(gyVar3.f34016c1).f24788f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26987id).commit();
                                    xx xxVar = gyVar3.f34085y0;
                                    if (xxVar != null) {
                                        xxVar.p(1, 2);
                                    }
                                    gyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.f39755b.f40431w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = j8Var2;
                break;
            case 6:
                ey eyVar = new ey(gyVar, false);
                gyVar.F0 = eyVar;
                bi.q1 q1Var = new bi.q1(gyVar, context, eyVar);
                q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                q1Var.setClipToPadding(false);
                q1Var.i(new di.k(7));
                q1Var.setOnItemClickListener(new j(this, 6));
                q1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(52.0f)));
                frameLayout = q1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i10 = org.telegram.ui.ActionBar.m6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.12f, gyVar.z(i10)));
                org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(linearLayout2, d02, K, null, h6Var);
                c8.ka.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final xx f39755b;

                    {
                        this.f39755b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                gy gyVar2 = this.f39755b.f40431w;
                                hx hxVar = gyVar2.f34068t1;
                                if (hxVar != null) {
                                    hxVar.y(gyVar2.J1.f26961id);
                                    return;
                                }
                                return;
                            case 1:
                                gy gyVar3 = this.f39755b.f40431w;
                                ArrayList arrayList = org.telegram.messenger.ui.b0(gyVar3.f34016c1).f25844s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.qp.s1(gyVar3.f34016c1).f24788f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f26987id).commit();
                                    xx xxVar = gyVar3.f34085y0;
                                    if (xxVar != null) {
                                        xxVar.p(1, 2);
                                    }
                                    gyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.f2 f2Var = this.f39755b.f40431w.Y1;
                                if (f2Var instanceof org.telegram.ui.cn) {
                                    ((org.telegram.ui.cn) f2Var).Aa();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231892);
                org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, c8.ha.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, i10, h6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.id.M0(2131751753, null));
                linearLayout2.addView(textView3, c8.ha.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, c8.ha.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new v4.d1(frameLayout);
    }
}
