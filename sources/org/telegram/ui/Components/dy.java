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
public final class dy extends tj0 {
    public final Context f34099c;
    public int d;
    public final SparseArray f34100e = new SparseArray();
    public final HashMap f34101f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f34102n = new SparseArray();
    public final SparseIntArray f34103r = new SparseIntArray();
    public int f34104s;
    public final ly f34105w;

    public dy(ly lyVar, Context context) {
        this.f34105w = lyVar;
        this.f34099c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f58535a instanceof uj0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f34101f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        ly lyVar = this.f34105w;
        ArrayList arrayList = lyVar.f36944e1;
        Object obj = this.h.get(i7);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i7 == 0) {
                i7 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = lyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f23609q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f34103r.get(i7, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = lyVar.F1;
            } else {
                Object obj2 = this.f34100e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return lyVar.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return lyVar.G1;
                    }
                    return lyVar.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = lyVar.F1;
            }
            return indexOf + i10;
        }
        int i12 = lyVar.H1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = lyVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dy.G():void");
    }

    @Override
    public final int b() {
        int i7 = this.f34104s;
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        TLRPC.Chat chat;
        String str;
        int i11;
        ly lyVar = this.f34105w;
        int i12 = lyVar.f36941d1;
        int i13 = e1Var.f58539f;
        View view = e1Var.f58535a;
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
                            if (org.telegram.messenger.si.b0(i12).f26499s0) {
                                i11 = 2131750832;
                            } else {
                                i11 = 2131750833;
                            }
                            i8Var.b(org.telegram.messenger.hd.M0(i11, null), 2131232097, org.telegram.messenger.hd.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
                    if (i7 != this.f34104s - 1) {
                        z10 = false;
                    }
                    g8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.i8 i8Var2 = (org.telegram.ui.Cells.i8) view;
                i8Var2.setHeaderOnClick(null);
                if (i7 == lyVar.f36951g1) {
                    if (lyVar.f36954h1 && lyVar.f36957i1 == null) {
                        i10 = 0;
                    } else if (lyVar.f36957i1 != null) {
                        i10 = 2131232238;
                    } else {
                        i10 = 2131232097;
                    }
                    if (lyVar.K1 != null) {
                        chat = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(lyVar.K1.f28052id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    i8Var2.a(i10, org.telegram.messenger.hd.a0("CurrentGroupStickers", null, 2131751694, str));
                    return;
                }
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        i8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !lyVar.T2) {
                            i8Var2.setEdit(new View.OnClickListener(this) {
                                public final dy f33720b;

                                {
                                    this.f33720b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f33720b.f34105w.f36993u1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f33720b.f34105w.f36993u1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        i8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final dy f33720b;

                            {
                                this.f33720b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f33720b.f34105w.f36993u1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f33720b.f34105w.f36993u1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == lyVar.f36963k1) {
                    i8Var2.b(org.telegram.messenger.hd.M0(2131746364, null), 2131232097, org.telegram.messenger.hd.M0(2131752063, null), 0, 0);
                    return;
                } else if (obj == lyVar.l1) {
                    i8Var2.a(0, org.telegram.messenger.hd.M0(2131750841, null));
                    return;
                } else if (obj == lyVar.f36967m1) {
                    i8Var2.a(0, org.telegram.messenger.hd.M0(2131746947, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 == this.f34104s) {
                int i15 = this.f34103r.get(i7 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f34100e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = lyVar.f36963k1;
                    } else {
                        arrayList = lyVar.l1;
                    }
                }
                if (arrayList == null) {
                    m3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.i20.A(82.0f, (int) Math.ceil(arrayList.size() / this.d), lyVar.h.getHeight());
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
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        y7Var.d(document, null, this.f34102n.get(i7), null, false, false);
        y7Var.setRecent(lyVar.f36963k1.contains(document));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ly lyVar = this.f34105w;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        Context context = this.f34099c;
        FrameLayout frameLayout = null;
        switch (i7) {
            case 0:
                frameLayout = new jg.b2(1, context, e6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.f34099c, false, false, lyVar.f36931a2, lyVar.f36961j2);
                i8Var.setOnIconClickListener(new n2(17, this, i8Var));
                frameLayout = i8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Of, null);
                i5.c.w(textView, 1, 14.0f, null, 2131749396);
                linearLayout.addView(textView, c8.ja.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f30334a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.hd.M0(2131752116, null).toUpperCase());
                linearLayout.addView(textView2, c8.ja.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final dy f33107b;

                    {
                        this.f33107b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                ly lyVar2 = this.f33107b.f34105w;
                                mx mxVar = lyVar2.f36993u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.f28052id);
                                    return;
                                }
                                return;
                            case 1:
                                ly lyVar3 = this.f33107b.f34105w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.f36941d1).f26501t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.f36941d1).f25289g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28078id).commit();
                                    dy dyVar = lyVar3.f37010z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.f33107b.f34105w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new v4.p0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new v4.p0(-1, lyVar.f36938c1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.f34099c, false, false, lyVar.f36931a2, lyVar.f36961j2);
                i8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final dy f33107b;

                    {
                        this.f33107b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ly lyVar2 = this.f33107b.f34105w;
                                mx mxVar = lyVar2.f36993u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.f28052id);
                                    return;
                                }
                                return;
                            case 1:
                                ly lyVar3 = this.f33107b.f34105w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.f36941d1).f26501t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.f36941d1).f25289g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28078id).commit();
                                    dy dyVar = lyVar3.f37010z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.f33107b.f34105w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = i8Var2;
                break;
            case 6:
                jy jyVar = new jy(lyVar, false);
                lyVar.G0 = jyVar;
                di.c1 c1Var = new di.c1(lyVar, context, jyVar);
                c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                c1Var.setClipToPadding(false);
                c1Var.i(new fi.k(7));
                c1Var.setOnItemClickListener(new j(this, 6));
                c1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(52.0f)));
                frameLayout = c1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i10 = org.telegram.ui.ActionBar.j6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.12f, lyVar.z(i10)));
                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(linearLayout2, d02, K, null, e6Var);
                c8.na.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final dy f33107b;

                    {
                        this.f33107b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ly lyVar2 = this.f33107b.f34105w;
                                mx mxVar = lyVar2.f36993u1;
                                if (mxVar != null) {
                                    mxVar.y(lyVar2.K1.f28052id);
                                    return;
                                }
                                return;
                            case 1:
                                ly lyVar3 = this.f33107b.f34105w;
                                ArrayList arrayList = org.telegram.messenger.si.b0(lyVar3.f36941d1).f26501t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.s1(lyVar3.f36941d1).f25289g7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28078id).commit();
                                    dy dyVar = lyVar3.f37010z0;
                                    if (dyVar != null) {
                                        dyVar.p(1, 2);
                                    }
                                    lyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.e2 e2Var = this.f33107b.f34105w.Z1;
                                if (e2Var instanceof org.telegram.ui.an) {
                                    ((org.telegram.ui.an) e2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231892);
                org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, c8.ja.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.k5.m(textView3, i10, e6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.hd.M0(2131751753, null));
                linearLayout2.addView(textView3, c8.ja.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, c8.ja.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new v4.e1(frameLayout);
    }
}
