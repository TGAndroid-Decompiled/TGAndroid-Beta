package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, View.OnClickListener {
    public int E;
    public org.telegram.ui.Components.d5 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public a0.h P;
    public ArrayList Q;
    public org.telegram.ui.Components.m20 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.m1 f43894a;
    public nb1 f43895b;
    public ah.i f43896c;
    public org.telegram.ui.Components.ck0 d;
    public org.telegram.ui.Components.wz f43897e;
    public org.telegram.ui.Components.a60 f43898f;
    public mb1 h;
    public kb1 f43899n;
    public org.telegram.ui.Components.a10 f43900r;
    public FrameLayout.LayoutParams f43901s;
    public boolean f43902w;
    public int f43903x;
    public int f43904y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i7;
        this.M = arrayList;
        this.f43904y = 0;
        this.H = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.s4 a0(UsersSelectActivity usersSelectActivity) {
        return usersSelectActivity.parentLayout;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29576n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29414e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29433f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.b0():void");
    }

    public final void c0() {
        a0.h hVar = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            if (hVar.j(i7) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i7)));
            }
        }
        kb1 kb1Var = this.f43899n;
        if (kb1Var != null) {
            kb1Var.c(this.L, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Object O0;
        int i12;
        float f10;
        float f11;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        this.R = null;
        if (this.f43904y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f34278a = true;
            frameLayout.f34279b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, true, true, true);
            frameLayout.f34280c = n6Var;
            int i13 = org.telegram.ui.ActionBar.n6.A8;
            org.telegram.ui.ActionBar.u6.Y(n6Var, i13, null);
            n6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            n6Var.setGravity(3);
            n6Var.setTypeface(org.telegram.messenger.g0.o());
            n6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(n6Var);
            org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(parentActivity, true, true, true);
            frameLayout.d = n6Var2;
            n6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
            org.telegram.ui.ActionBar.u6.Y(n6Var2, i13, null);
            n6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            n6Var2.setGravity(3);
            n6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(n6Var2);
            n6Var.getDrawable().K = true;
            n6Var2.getDrawable().K = true;
            org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f37208f;
            n6Var.b(1.0f, 150L, lrVar);
            n6Var2.b(1.0f, 150L, lrVar);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.gd.f24213a0;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            if (z10) {
                f11 = 64.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.addView((View) frameLayout, c8.ma.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f43904y;
        boolean z11 = this.K;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                d0();
            }
        } else if (z11) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750794, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750718, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 22));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 5);
        this.f43894a = m1Var;
        m1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.x3(this.f43894a, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false));
        eVar.addView(this.f43894a);
        nb1 nb1Var = new nb1(this, context);
        this.f43895b = nb1Var;
        this.f43894a.addView(nb1Var, c8.ma.c(-2.0f, -1));
        this.f43895b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f48932b;

            {
                this.f48932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f48932b;
                        usersSelectActivity.f43896c.clearFocus();
                        usersSelectActivity.f43896c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.f43896c);
                        return;
                    default:
                        this.f48932b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f43896c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.A(this.f43896c, org.telegram.ui.ActionBar.n6.Oi, null);
        org.telegram.ui.ActionBar.u6.U(this.f43896c, org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.v(this.f43896c, org.telegram.ui.ActionBar.n6.Pi, null);
        this.f43896c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f43896c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f43896c.setSingleLine(true);
        this.f43896c.setBackgroundDrawable(null);
        this.f43896c.setVerticalScrollBarEnabled(false);
        this.f43896c.setHorizontalScrollBarEnabled(false);
        this.f43896c.setTextIsSelectable(false);
        this.f43896c.setPadding(0, 0, 0, 0);
        this.f43896c.setImeOptions(268435462);
        ah.i iVar3 = this.f43896c;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f43895b.addView(this.f43896c);
        this.f43896c.setHintText(org.telegram.messenger.gd.M0(2131745573, null));
        this.f43896c.setCustomSelectionActionModeCallback(new oi.y0(4));
        this.f43896c.setOnKeyListener(new s40(1, this));
        this.f43896c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        this.f43897e = wzVar;
        wzVar.setViewType(10);
        org.telegram.ui.Components.wz wzVar2 = this.f43897e;
        wzVar2.f41829x = false;
        wzVar2.setItemsCount(3);
        org.telegram.ui.Components.wz wzVar3 = this.f43897e;
        int i15 = org.telegram.ui.ActionBar.n6.G8;
        int i16 = org.telegram.ui.ActionBar.n6.f29486i6;
        wzVar3.e(i15, i16, i16);
        eVar.addView(this.f43897e);
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, this.f43897e, 1, null, 2);
        this.f43898f = a60Var;
        a60Var.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f43898f.d.setText(org.telegram.messenger.gd.M0(2131748031, null));
        eVar.addView(this.f43898f);
        v4.c0 c0Var = new v4.c0(1, false);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.d = ck0Var;
        ck0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f43898f);
        org.telegram.ui.Components.ck0 ck0Var2 = this.d;
        mb1 mb1Var = new mb1(this, context);
        this.h = mb1Var;
        ck0Var2.setAdapter(mb1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ck0 ck0Var3 = this.d;
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ck0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new fi.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new fi.g4(22, this, context));
        this.d.setOnScrollListener(new c21(this, 6));
        this.f43901s = org.telegram.ui.Components.a10.b();
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f43900r = a10Var;
        a10Var.setImageResource(2131231195);
        eVar.addView(this.f43900r, this.f43901s);
        this.f43900r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f48932b;

            {
                this.f48932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f48932b;
                        usersSelectActivity.f43896c.clearFocus();
                        usersSelectActivity.f43896c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.f43896c);
                        return;
                    default:
                        this.f48932b.c0();
                        return;
                }
            }
        });
        this.f43900r.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        for (int i17 = 1; i17 <= i11; i17++) {
            String str = "non_contacts";
            if (this.f43904y == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i17 == 2 && !this.J) {
                    str = "new_chats";
                    i12 = 2;
                } else {
                    if (i17 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i12 = 4;
                    }
                    i12 = 8;
                }
            } else if (z11) {
                if (i17 == 1) {
                    int i18 = org.telegram.messenger.mp.I8;
                    i12 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.mp.I8;
                    i12 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.mp.I8;
                    str = "groups";
                    i12 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.mp.I8;
                    str = "channels";
                    i12 = 8;
                } else {
                    int i22 = org.telegram.messenger.mp.I8;
                    str = "bots";
                    i12 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.mp.I8;
                str = "muted";
                i12 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.mp.I8;
                str = "read";
                i12 = 64;
            } else {
                int i25 = org.telegram.messenger.mp.I8;
                str = "archived";
                i12 = 128;
            }
            if ((i12 & this.L) != 0) {
                org.telegram.ui.Components.m20 m20Var = new org.telegram.ui.Components.m20(this.f43896c.getContext(), str);
                this.f43895b.a(m20Var, false);
                m20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                Long l10 = (Long) arrayList.get(i26);
                if (l10.longValue() > 0) {
                    O0 = getMessagesController().c2(l10);
                } else {
                    O0 = getMessagesController().O0(Long.valueOf(-l10.longValue()));
                }
                if (O0 != null) {
                    org.telegram.ui.Components.m20 m20Var2 = new org.telegram.ui.Components.m20(this.f43896c.getContext(), O0);
                    this.f43895b.a(m20Var2, false);
                    m20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f43904y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().R4;
            } else {
                i7 = getMessagesController().Q4;
            }
            int i11 = this.f43903x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.gd.a0("MembersCountZero", null, 2131748427, org.telegram.messenger.gd.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.gd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f43903x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f43903x == 0) {
                this.F.getTitle().c(org.telegram.messenger.gd.M0(2131745473, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.gd.M0(2131745472, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.gd.M0(2131745470, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.n6 title = this.F.getTitle();
            int i12 = this.f43903x;
            title.setText(org.telegram.messenger.gd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.gd.M0(2131745471, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.gd.M0(2131745469, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O) {
            org.telegram.ui.Components.a60 a60Var = this.f43898f;
            if (a60Var != null) {
                a60Var.e(false, true);
            }
            mb1 mb1Var = this.h;
            if (mb1Var != null) {
                mb1Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.f25177r) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i11 = org.telegram.messenger.mp.I8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.i4) {
                            ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43894a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29542l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29560m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29577n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43898f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29377c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43898f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43896c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29504j7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43895b, 0, new Class[]{org.telegram.ui.Components.m20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43895b, 0, new Class[]{org.telegram.ui.Components.m20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ui));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) view;
        if (m20Var.E) {
            this.R = null;
            this.f43895b.b(m20Var);
            if (this.f43904y == 2) {
                if (m20Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (m20Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (m20Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (m20Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (m20Var.getUid() == Long.MIN_VALUE) {
                int i7 = this.L;
                int i10 = org.telegram.messenger.mp.I8;
                this.L = i7 & (-2);
            } else if (m20Var.getUid() == -9223372036854775807L) {
                int i11 = this.L;
                int i12 = org.telegram.messenger.mp.I8;
                this.L = i11 & (-3);
            } else if (m20Var.getUid() == -9223372036854775806L) {
                int i13 = this.L;
                int i14 = org.telegram.messenger.mp.I8;
                this.L = i13 & (-5);
            } else if (m20Var.getUid() == -9223372036854775805L) {
                int i15 = this.L;
                int i16 = org.telegram.messenger.mp.I8;
                this.L = i15 & (-9);
            } else if (m20Var.getUid() == -9223372036854775804L) {
                int i17 = this.L;
                int i18 = org.telegram.messenger.mp.I8;
                this.L = i17 & (-17);
            } else if (m20Var.getUid() == -9223372036854775803L) {
                int i19 = this.L;
                int i20 = org.telegram.messenger.mp.I8;
                this.L = i19 & (-33);
            } else if (m20Var.getUid() == -9223372036854775802L) {
                int i21 = this.L;
                int i22 = org.telegram.messenger.mp.I8;
                this.L = i21 & (-65);
            } else if (m20Var.getUid() == -9223372036854775801L) {
                int i23 = this.L;
                int i24 = org.telegram.messenger.mp.I8;
                this.L = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.m20 m20Var2 = this.R;
        if (m20Var2 != null) {
            m20Var2.a();
        }
        this.R = m20Var;
        m20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25177r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25177r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f43896c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f43896c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.u6.l(iVar, 34, org.telegram.ui.ActionBar.n6.Oi, null);
                org.telegram.ui.ActionBar.u6.v(this.f43896c, org.telegram.ui.ActionBar.n6.Pi, null);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                ck0Var.x1();
            }
            org.telegram.ui.ActionBar.m1 m1Var = this.f43894a;
            if (m1Var != null) {
                org.telegram.messenger.g0.x3(m1Var, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false));
            }
            if (this.f43895b != null) {
                for (int i7 = 0; i7 < this.f43895b.getChildCount(); i7++) {
                    View childAt = this.f43895b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.m20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i7) {
        this.E = i7;
        nb1 nb1Var = this.f43895b;
        if (nb1Var != null) {
            nb1Var.requestLayout();
        }
    }
}
