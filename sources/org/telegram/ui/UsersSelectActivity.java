package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener {
    public int D;
    public org.telegram.ui.Components.x4 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final boolean J;
    public int K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public a0.h O;
    public ArrayList P;
    public org.telegram.ui.Components.c20 Q;
    public int R;
    public int S;
    public org.telegram.ui.ActionBar.m1 f42046a;
    public kb1 f42047b;
    public ah.i f42048c;
    public org.telegram.ui.Components.pj0 d;
    public org.telegram.ui.Components.lz f42049e;
    public org.telegram.ui.Components.p50 f42050f;
    public jb1 h;
    public hb1 f42051n;
    public org.telegram.ui.Components.p00 f42052r;
    public FrameLayout.LayoutParams f42053s;
    public boolean f42054w;
    public int f42055x;
    public int f42056y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z9) {
        super(null);
        this.O = new a0.h();
        this.P = new ArrayList();
        this.J = z9;
        this.K = i7;
        this.L = arrayList;
        this.f42056y = 0;
        this.G = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.q4 a0(UsersSelectActivity usersSelectActivity) {
        return usersSelectActivity.parentLayout;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28030n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27868e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27887f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.b0():void");
    }

    public final void c0() {
        a0.h hVar = this.O;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            if (hVar.j(i7) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i7)));
            }
        }
        hb1 hb1Var = this.f42051n;
        if (hb1Var != null) {
            hb1Var.c(this.K, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Object M0;
        int i12;
        float f10;
        float f11;
        this.N = false;
        this.M = false;
        this.P.clear();
        this.O.b();
        this.Q = null;
        if (this.f42056y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f40144a = true;
            frameLayout.f40145b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.f40146c = j6Var;
            int i13 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.r6.Z(j6Var, i13, null);
            j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(org.telegram.messenger.g0.o());
            j6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
            org.telegram.ui.ActionBar.r6.Z(j6Var2, i13, null);
            j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(j6Var2);
            j6Var.getDrawable().J = true;
            j6Var2.getDrawable().J = true;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40310f;
            j6Var.b(1.0f, 150L, xqVar);
            j6Var2.b(1.0f, 150L, xqVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z9 = org.telegram.messenger.hd.f22871a0;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            if (z9) {
                f11 = 64.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.addView((View) frameLayout, c8.ha.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f42056y;
        boolean z10 = this.J;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                d0();
            }
        } else if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750806, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750730, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new mt0(this, 19));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 5);
        this.f42046a = m1Var;
        m1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.f42046a, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
        eVar.addView(this.f42046a);
        kb1 kb1Var = new kb1(this, context);
        this.f42047b = kb1Var;
        this.f42046a.addView(kb1Var, c8.ha.c(-2.0f, -1));
        this.f42047b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f45915b;

            {
                this.f45915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f45915b;
                        usersSelectActivity.f42048c.clearFocus();
                        usersSelectActivity.f42048c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42048c);
                        return;
                    default:
                        this.f45915b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f42048c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.B(this.f42048c, org.telegram.ui.ActionBar.k6.Li, null);
        org.telegram.ui.ActionBar.r6.V(this.f42048c, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.w(this.f42048c, org.telegram.ui.ActionBar.k6.Mi, null);
        this.f42048c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f42048c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f42048c.setSingleLine(true);
        this.f42048c.setBackgroundDrawable(null);
        this.f42048c.setVerticalScrollBarEnabled(false);
        this.f42048c.setHorizontalScrollBarEnabled(false);
        this.f42048c.setTextIsSelectable(false);
        this.f42048c.setPadding(0, 0, 0, 0);
        this.f42048c.setImeOptions(268435462);
        ah.i iVar3 = this.f42048c;
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f42047b.addView(this.f42048c);
        this.f42048c.setHintText(org.telegram.messenger.hd.M0(2131745769, null));
        this.f42048c.setCustomSelectionActionModeCallback(new li.a1(4));
        this.f42048c.setOnKeyListener(new p40(1, this));
        this.f42048c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.f42049e = lzVar;
        lzVar.setViewType(10);
        org.telegram.ui.Components.lz lzVar2 = this.f42049e;
        lzVar2.f35802x = false;
        lzVar2.setItemsCount(3);
        org.telegram.ui.Components.lz lzVar3 = this.f42049e;
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        int i16 = org.telegram.ui.ActionBar.k6.f27940i6;
        lzVar3.e(i15, i16, i16);
        eVar.addView(this.f42049e);
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, this.f42049e, 1, null, 2);
        this.f42050f = p50Var;
        p50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f42050f.d.setText(org.telegram.messenger.hd.M0(2131748222, null));
        eVar.addView(this.f42050f);
        v4.b0 b0Var = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f42050f);
        org.telegram.ui.Components.pj0 pj0Var2 = this.d;
        jb1 jb1Var = new jb1(this, context);
        this.h = jb1Var;
        pj0Var2.setAdapter(jb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.d;
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new di.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.p4(22, this, context));
        this.d.setOnScrollListener(new b21(this, 6));
        this.f42053s = org.telegram.ui.Components.p00.b();
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.f42052r = p00Var;
        p00Var.setImageResource(2131231195);
        eVar.addView(this.f42052r, this.f42053s);
        this.f42052r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f45915b;

            {
                this.f45915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f45915b;
                        usersSelectActivity.f42048c.clearFocus();
                        usersSelectActivity.f42048c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42048c);
                        return;
                    default:
                        this.f45915b.c0();
                        return;
                }
            }
        });
        this.f42052r.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        for (int i17 = 1; i17 <= i11; i17++) {
            String str = "non_contacts";
            if (this.f42056y == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i17 == 2 && !this.I) {
                    str = "new_chats";
                    i12 = 2;
                } else {
                    if (i17 == (!this.I ? 1 : 0) + 2) {
                        str = "contacts";
                        i12 = 4;
                    }
                    i12 = 8;
                }
            } else if (z10) {
                if (i17 == 1) {
                    int i18 = org.telegram.messenger.qp.C8;
                    i12 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.qp.C8;
                    i12 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.qp.C8;
                    str = "groups";
                    i12 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.qp.C8;
                    str = "channels";
                    i12 = 8;
                } else {
                    int i22 = org.telegram.messenger.qp.C8;
                    str = "bots";
                    i12 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.qp.C8;
                str = "muted";
                i12 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.qp.C8;
                str = "read";
                i12 = 64;
            } else {
                int i25 = org.telegram.messenger.qp.C8;
                str = "archived";
                i12 = 128;
            }
            if ((i12 & this.K) != 0) {
                org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(this.f42048c.getContext(), str);
                this.f42047b.a(c20Var, false);
                c20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.L;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                Long l10 = (Long) arrayList.get(i26);
                if (l10.longValue() > 0) {
                    M0 = getMessagesController().a2(l10);
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-l10.longValue()));
                }
                if (M0 != null) {
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(this.f42048c.getContext(), M0);
                    this.f42047b.a(c20Var2, false);
                    c20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f42056y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().O4;
            } else {
                i7 = getMessagesController().N4;
            }
            int i11 = this.f42055x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.a0("MembersCountZero", null, 2131748618, org.telegram.messenger.hd.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f42055x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f42055x == 0) {
                this.E.getTitle().c(org.telegram.messenger.hd.M0(2131745669, null), true, true);
                if (this.S > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.hd.M0(2131745668, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.hd.M0(2131745666, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.j6 title = this.E.getTitle();
            int i12 = this.f42055x;
            title.setText(org.telegram.messenger.hd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.S > 0) {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.hd.M0(2131745667, null));
            } else {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.hd.M0(2131745665, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            org.telegram.ui.Components.p50 p50Var = this.f42050f;
            if (p50Var != null) {
                p50Var.e(false, true);
            }
            jb1 jb1Var = this.h;
            if (jb1Var != null) {
                jb1Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25046r) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i11 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.D;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42046a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27996l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28014m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28031n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42050f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27831c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42050f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42048c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27958j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42047b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42047b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.Q = null;
            this.f42047b.b(c20Var);
            if (this.f42056y == 2) {
                if (c20Var.getUid() == -9223372036854775800L) {
                    this.K &= -2;
                } else if (c20Var.getUid() == -9223372036854775799L) {
                    this.K &= -3;
                } else if (c20Var.getUid() == Long.MIN_VALUE) {
                    this.K &= -5;
                } else if (c20Var.getUid() == -9223372036854775807L) {
                    this.K &= -9;
                }
            } else if (c20Var.getUid() == Long.MIN_VALUE) {
                int i7 = this.K;
                int i10 = org.telegram.messenger.qp.C8;
                this.K = i7 & (-2);
            } else if (c20Var.getUid() == -9223372036854775807L) {
                int i11 = this.K;
                int i12 = org.telegram.messenger.qp.C8;
                this.K = i11 & (-3);
            } else if (c20Var.getUid() == -9223372036854775806L) {
                int i13 = this.K;
                int i14 = org.telegram.messenger.qp.C8;
                this.K = i13 & (-5);
            } else if (c20Var.getUid() == -9223372036854775805L) {
                int i15 = this.K;
                int i16 = org.telegram.messenger.qp.C8;
                this.K = i15 & (-9);
            } else if (c20Var.getUid() == -9223372036854775804L) {
                int i17 = this.K;
                int i18 = org.telegram.messenger.qp.C8;
                this.K = i17 & (-17);
            } else if (c20Var.getUid() == -9223372036854775803L) {
                int i19 = this.K;
                int i20 = org.telegram.messenger.qp.C8;
                this.K = i19 & (-33);
            } else if (c20Var.getUid() == -9223372036854775802L) {
                int i21 = this.K;
                int i22 = org.telegram.messenger.qp.C8;
                this.K = i21 & (-65);
            } else if (c20Var.getUid() == -9223372036854775801L) {
                int i23 = this.K;
                int i24 = org.telegram.messenger.qp.C8;
                this.K = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.Q;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.Q = c20Var;
        c20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f42048c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f42048c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.r6.m(iVar, 34, org.telegram.ui.ActionBar.k6.Li, null);
                org.telegram.ui.ActionBar.r6.w(this.f42048c, org.telegram.ui.ActionBar.k6.Mi, null);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.d;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            org.telegram.ui.ActionBar.m1 m1Var = this.f42046a;
            if (m1Var != null) {
                org.telegram.messenger.g0.z3(m1Var, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
            }
            if (this.f42047b != null) {
                for (int i7 = 0; i7 < this.f42047b.getChildCount(); i7++) {
                    View childAt = this.f42047b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i7) {
        this.D = i7;
        kb1 kb1Var = this.f42047b;
        if (kb1Var != null) {
            kb1Var.requestLayout();
        }
    }
}
