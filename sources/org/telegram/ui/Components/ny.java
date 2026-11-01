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
public final class ny extends tk0 {
    public final Context f28980c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f28981f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f28982n = new SparseArray();
    public final SparseIntArray f28983r = new SparseIntArray();
    public int f28984s;
    public final vy f28985w;

    public ny(vy vyVar, Context context) {
        this.f28985w = vyVar;
        this.f28980c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f47909a instanceof uk0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f28981f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        vy vyVar = this.f28985w;
        ArrayList arrayList = vyVar.f31946d1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = vyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.i0.f16172q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.i0.L(72.0f);
            }
            int i12 = this.f28983r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = vyVar.E1;
            } else {
                Object obj2 = this.e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return vyVar.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return vyVar.F1;
                    }
                    return vyVar.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = vyVar.E1;
            }
            return indexOf + i11;
        }
        int i13 = vyVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = vyVar.F1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ny.G():void");
    }

    @Override
    public final int b() {
        int i10 = this.f28984s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override
    public final int d(int i10) {
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
    public final void f() {
        G();
        super.f();
    }

    @Override
    public final void p(int i10, int i11) {
        G();
        super.p(i10, i11);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        String str;
        int i12;
        vy vyVar = this.f28985w;
        int i13 = vyVar.f31943c1;
        int i14 = c1Var.f47912f;
        View view = c1Var.f47909a;
        SparseArray sparseArray = this.h;
        if (i14 != 0) {
            int i15 = 1;
            boolean z10 = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 5) {
                            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                            if (org.telegram.messenger.vi.b0(i13).f18671r0) {
                                i12 = 2131750833;
                            } else {
                                i12 = 2131750834;
                            }
                            n8Var.b(org.telegram.messenger.dd.L0(i12, null), 2131232095, org.telegram.messenger.dd.L0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i10 != this.f28984s - 1) {
                        z10 = false;
                    }
                    l8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                n8Var2.setHeaderOnClick(null);
                if (i10 == vyVar.f31953f1) {
                    if (vyVar.f31956g1 && vyVar.f31959h1 == null) {
                        i11 = 0;
                    } else if (vyVar.f31959h1 != null) {
                        i11 = 2131232236;
                    } else {
                        i11 = 2131232095;
                    }
                    if (vyVar.J1 != null) {
                        chat = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(vyVar.J1.f19795id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    n8Var2.a(i11, org.telegram.messenger.dd.a0("CurrentGroupStickers", null, 2131751695, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        n8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !vyVar.S2) {
                            n8Var2.setEdit(new View.OnClickListener(this) {
                                public final ny f28304b;

                                {
                                    this.f28304b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f28304b.f28985w.f31996t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f28304b.f28985w.f31996t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        n8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final ny f28304b;

                            {
                                this.f28304b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f28304b.f28985w.f31996t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f28304b.f28985w.f31996t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == vyVar.f31965j1) {
                    n8Var2.b(org.telegram.messenger.dd.L0(2131746379, null), 2131232095, org.telegram.messenger.dd.L0(2131752063, null), 0, 0);
                    return;
                } else if (obj == vyVar.f31968k1) {
                    n8Var2.a(0, org.telegram.messenger.dd.L0(2131750842, null));
                    return;
                } else if (obj == vyVar.l1) {
                    n8Var2.a(0, org.telegram.messenger.dd.L0(2131746962, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view;
            if (i10 == this.f28984s) {
                int i16 = this.f28983r.get(i10 - 1, Integer.MIN_VALUE);
                if (i16 == Integer.MIN_VALUE) {
                    o3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i16);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = vyVar.f31965j1;
                    } else {
                        arrayList = vyVar.f31968k1;
                    }
                }
                if (arrayList == null) {
                    o3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    o3Var.setHeight(org.telegram.messenger.i0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.a30.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), vyVar.h.getHeight());
                    if (A > 0) {
                        i15 = A;
                    }
                    o3Var.setHeight(i15);
                    return;
                }
            }
            o3Var.setHeight(org.telegram.messenger.i0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f28982n.get(i10), null, false, false);
        d8Var.setRecent(vyVar.f31965j1.contains(document));
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        vy vyVar = this.f28985w;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        Context context = this.f28980c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new my(0, context, p6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.o3(context);
                break;
            case 2:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(this.f28980c, false, false, vyVar.Z1, vyVar.f31963i2);
                n8Var.setOnIconClickListener(new sr(3, this, n8Var));
                frameLayout = n8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Lf, null);
                sc.e.u(textView, 1, 14.0f, null, 2131749405);
                linearLayout.addView(textView, w7.b6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f22258a = textView2;
                textView2.setPadding(org.telegram.messenger.i0.L(17.0f), 0, org.telegram.messenger.i0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.dd.L0(2131752116, null).toUpperCase());
                linearLayout.addView(textView2, w7.b6.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final ny f27986b;

                    {
                        this.f27986b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                vy vyVar2 = this.f27986b.f28985w;
                                vx vxVar = vyVar2.f31996t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.f19795id);
                                    return;
                                }
                                return;
                            case 1:
                                vy vyVar3 = this.f27986b.f28985w;
                                ArrayList arrayList = org.telegram.messenger.vi.b0(vyVar3.f31943c1).f18674s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.wp.r1(vyVar3.f31943c1).f19138g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19821id).commit();
                                    ny nyVar = vyVar3.f32013y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.f27986b.f28985w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).ta();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new s4.o0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new s4.o0(-1, vyVar.f31939b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(this.f28980c, false, false, vyVar.Z1, vyVar.f31963i2);
                n8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final ny f27986b;

                    {
                        this.f27986b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vy vyVar2 = this.f27986b.f28985w;
                                vx vxVar = vyVar2.f31996t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.f19795id);
                                    return;
                                }
                                return;
                            case 1:
                                vy vyVar3 = this.f27986b.f28985w;
                                ArrayList arrayList = org.telegram.messenger.vi.b0(vyVar3.f31943c1).f18674s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.wp.r1(vyVar3.f31943c1).f19138g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19821id).commit();
                                    ny nyVar = vyVar3.f32013y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.f27986b.f28985w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).ta();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = n8Var2;
                break;
            case 6:
                ty tyVar = new ty(vyVar, false);
                vyVar.F0 = tyVar;
                ag.b1 b1Var = new ag.b1(vyVar, context, tyVar);
                b1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
                b1Var.setClipToPadding(false);
                b1Var.i(new dh.g(4));
                b1Var.setOnItemClickListener(new k(this, 6));
                b1Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(52.0f)));
                frameLayout = b1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.i0.L(13.0f);
                int i11 = org.telegram.ui.ActionBar.t6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, vyVar.A(i11)));
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i11);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(linearLayout2, d02, L2, null, p6Var);
                w7.e6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final ny f27986b;

                    {
                        this.f27986b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vy vyVar2 = this.f27986b.f28985w;
                                vx vxVar = vyVar2.f31996t1;
                                if (vxVar != null) {
                                    vxVar.y(vyVar2.J1.f19795id);
                                    return;
                                }
                                return;
                            case 1:
                                vy vyVar3 = this.f27986b.f28985w;
                                ArrayList arrayList = org.telegram.messenger.vi.b0(vyVar3.f31943c1).f18674s0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.wp.r1(vyVar3.f31943c1).f19138g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19821id).commit();
                                    ny nyVar = vyVar3.f32013y0;
                                    if (nyVar != null) {
                                        nyVar.p(1, 2);
                                    }
                                    vyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.k2 k2Var = this.f27986b.f28985w.Y1;
                                if (k2Var instanceof org.telegram.ui.un) {
                                    ((org.telegram.ui.un) k2Var).ta();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231891);
                org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, w7.b6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.m5.m(textView3, i11, p6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.dd.L0(2131751753, null));
                linearLayout2.addView(textView3, w7.b6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, w7.b6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new s4.c1(frameLayout);
    }
}
