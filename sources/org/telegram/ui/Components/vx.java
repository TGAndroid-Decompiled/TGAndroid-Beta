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
public final class vx extends sj0 {
    public final Context f39811c;
    public int d;
    public final SparseArray f39812e = new SparseArray();
    public final HashMap f39813f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39814n = new SparseArray();
    public final SparseIntArray f39815r = new SparseIntArray();
    public int f39816s;
    public final ey f39817w;

    public vx(ey eyVar, Context context) {
        this.f39817w = eyVar;
        this.f39811c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f55540a instanceof tj0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f39813f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i3) {
        int indexOf;
        int i10;
        ey eyVar = this.f39817w;
        ArrayList arrayList = eyVar.f33533e1;
        Object obj = this.h.get(i3);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i3 == 0) {
                i3 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = eyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f22608q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f39815r.get(i3, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = eyVar.F1;
            } else {
                Object obj2 = this.f39812e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return eyVar.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return eyVar.G1;
                    }
                    return eyVar.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = eyVar.F1;
            }
            return indexOf + i10;
        }
        int i12 = eyVar.H1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = eyVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx.G():void");
    }

    @Override
    public final int b() {
        int i3 = this.f39816s;
        if (i3 != 0) {
            return i3 + 1;
        }
        return 0;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 4;
        }
        Object obj = this.h.get(i3);
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
    public final void p(int i3, int i10) {
        G();
        super.p(i3, i10);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        TLRPC.Chat chat;
        String str;
        int i11;
        ey eyVar = this.f39817w;
        int i12 = eyVar.f33529d1;
        int i13 = d1Var.f55544f;
        View view = d1Var.f55540a;
        SparseArray sparseArray = this.h;
        if (i13 != 0) {
            int i14 = 1;
            boolean z10 = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 5) {
                            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                            if (org.telegram.messenger.li.b0(i12).f24049s0) {
                                i11 = 2131750833;
                            } else {
                                i11 = 2131750834;
                            }
                            i8Var.b(org.telegram.messenger.bd.M0(i11, null), 2131232096, org.telegram.messenger.bd.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
                    if (i3 != this.f39816s - 1) {
                        z10 = false;
                    }
                    g8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.i8 i8Var2 = (org.telegram.ui.Cells.i8) view;
                i8Var2.setHeaderOnClick(null);
                if (i3 == eyVar.f33540g1) {
                    if (eyVar.f33543h1 && eyVar.f33546i1 == null) {
                        i10 = 0;
                    } else if (eyVar.f33546i1 != null) {
                        i10 = 2131232237;
                    } else {
                        i10 = 2131232096;
                    }
                    if (eyVar.K1 != null) {
                        chat = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(eyVar.K1.f27002id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    i8Var2.a(i10, org.telegram.messenger.bd.a0("CurrentGroupStickers", null, 2131751695, str));
                    return;
                }
                Object obj = sparseArray.get(i3);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        i8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !eyVar.T2) {
                            i8Var2.setEdit(new View.OnClickListener(this) {
                                public final vx f38904b;

                                {
                                    this.f38904b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f38904b.f39817w.f33582u1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f38904b.f39817w.f33582u1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        i8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final vx f38904b;

                            {
                                this.f38904b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f38904b.f39817w.f33582u1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f38904b.f39817w.f33582u1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == eyVar.k1) {
                    i8Var2.b(org.telegram.messenger.bd.M0(2131746372, null), 2131232096, org.telegram.messenger.bd.M0(2131752063, null), 0, 0);
                    return;
                } else if (obj == eyVar.f33554l1) {
                    i8Var2.a(0, org.telegram.messenger.bd.M0(2131750842, null));
                    return;
                } else if (obj == eyVar.m1) {
                    i8Var2.a(0, org.telegram.messenger.bd.M0(2131746955, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i3 == this.f39816s) {
                int i15 = this.f39815r.get(i3 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f39812e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = eyVar.k1;
                    } else {
                        arrayList = eyVar.f33554l1;
                    }
                }
                if (arrayList == null) {
                    m3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), eyVar.h.getHeight());
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
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i3);
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        y7Var.d(document, null, this.f39814n.get(i3), null, false, false);
        y7Var.setRecent(eyVar.k1.contains(document));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ey eyVar = this.f39817w;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        Context context = this.f39811c;
        FrameLayout frameLayout = null;
        switch (i3) {
            case 0:
                frameLayout = new kg.x1(1, context, e6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.f39811c, false, false, eyVar.f33520a2, eyVar.f33550j2);
                i8Var.setOnIconClickListener(new q2(16, this, i8Var));
                frameLayout = i8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Lf, null);
                k2.p1.u(textView, 1, 14.0f, null, 2131749404);
                linearLayout.addView(textView, b8.mf.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f29275a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131752116, null).toUpperCase());
                linearLayout.addView(textView2, b8.mf.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final vx f38570b;

                    {
                        this.f38570b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                ey eyVar2 = this.f38570b.f39817w;
                                fx fxVar = eyVar2.f33582u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.f27002id);
                                    return;
                                }
                                return;
                            case 1:
                                ey eyVar3 = this.f38570b.f39817w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.f33529d1).f24051t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.f33529d1).f23009f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f27028id).commit();
                                    vx vxVar = eyVar3.f33599z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.f38570b.f39817w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new u4.p0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new u4.p0(-1, eyVar.f33527c1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.f39811c, false, false, eyVar.f33520a2, eyVar.f33550j2);
                i8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final vx f38570b;

                    {
                        this.f38570b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ey eyVar2 = this.f38570b.f39817w;
                                fx fxVar = eyVar2.f33582u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.f27002id);
                                    return;
                                }
                                return;
                            case 1:
                                ey eyVar3 = this.f38570b.f39817w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.f33529d1).f24051t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.f33529d1).f23009f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f27028id).commit();
                                    vx vxVar = eyVar3.f33599z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.f38570b.f39817w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = i8Var2;
                break;
            case 6:
                cy cyVar = new cy(eyVar, false);
                eyVar.G0 = cyVar;
                ci.j1 j1Var = new ci.j1(eyVar, context, cyVar);
                j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                j1Var.setClipToPadding(false);
                j1Var.i(new ei.l(7));
                j1Var.setOnItemClickListener(new k(this, 6));
                j1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(52.0f)));
                frameLayout = j1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i10 = org.telegram.ui.ActionBar.k6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, eyVar.z(i10)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(linearLayout2, d02, L2, null, e6Var);
                b8.pf.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final vx f38570b;

                    {
                        this.f38570b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ey eyVar2 = this.f38570b.f39817w;
                                fx fxVar = eyVar2.f33582u1;
                                if (fxVar != null) {
                                    fxVar.y(eyVar2.K1.f27002id);
                                    return;
                                }
                                return;
                            case 1:
                                ey eyVar3 = this.f38570b.f39817w;
                                ArrayList arrayList = org.telegram.messenger.li.b0(eyVar3.f33529d1).f24051t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.hp.s1(eyVar3.f33529d1).f23009f7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f27028id).commit();
                                    vx vxVar = eyVar3.f33599z0;
                                    if (vxVar != null) {
                                        vxVar.p(1, 2);
                                    }
                                    eyVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.d2 d2Var = this.f38570b.f39817w.Z1;
                                if (d2Var instanceof org.telegram.ui.wm) {
                                    ((org.telegram.ui.wm) d2Var).ya();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231892);
                org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, b8.mf.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, i10, e6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.bd.M0(2131751753, null));
                linearLayout2.addView(textView3, b8.mf.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, b8.mf.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new u4.d1(frameLayout);
    }
}
