package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, View.OnClickListener {
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
    public org.telegram.ui.Components.n20 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.l1 f44020a;
    public lb1 f44021b;
    public ah.i f44022c;
    public org.telegram.ui.Components.ek0 d;
    public org.telegram.ui.Components.vz f44023e;
    public org.telegram.ui.Components.a60 f44024f;
    public kb1 h;
    public ib1 f44025n;
    public org.telegram.ui.Components.a10 f44026r;
    public FrameLayout.LayoutParams f44027s;
    public boolean f44028w;
    public int f44029x;
    public int f44030y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i7;
        this.M = arrayList;
        this.f44030y = 0;
        this.H = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.r4 a0(UsersSelectActivity usersSelectActivity) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29633n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29471e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
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
        ib1 ib1Var = this.f44025n;
        if (ib1Var != null) {
            ib1Var.a(this.L, arrayList);
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
        if (this.f44030y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f34210a = true;
            frameLayout.f34211b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, true, true, true);
            frameLayout.f34212c = n6Var;
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
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            n6Var.b(1.0f, 150L, krVar);
            n6Var2.b(1.0f, 150L, krVar);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.gd.f24314a0;
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
            kVar.addView((View) frameLayout, c8.na.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f44030y;
        boolean z11 = this.K;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                d0();
            }
        } else if (z11) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750793, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750717, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 22));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this, context, 5);
        this.f44020a = l1Var;
        l1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.x3(this.f44020a, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
        eVar.addView(this.f44020a);
        lb1 lb1Var = new lb1(this, context);
        this.f44021b = lb1Var;
        this.f44020a.addView(lb1Var, c8.na.c(-2.0f, -1));
        this.f44021b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f48527b;

            {
                this.f48527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f48527b;
                        usersSelectActivity.f44022c.clearFocus();
                        usersSelectActivity.f44022c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.f44022c);
                        return;
                    default:
                        this.f48527b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f44022c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.A(this.f44022c, org.telegram.ui.ActionBar.n6.Oi, null);
        org.telegram.ui.ActionBar.u6.U(this.f44022c, org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.ui.ActionBar.u6.v(this.f44022c, org.telegram.ui.ActionBar.n6.Pi, null);
        this.f44022c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f44022c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f44022c.setSingleLine(true);
        this.f44022c.setBackgroundDrawable(null);
        this.f44022c.setVerticalScrollBarEnabled(false);
        this.f44022c.setHorizontalScrollBarEnabled(false);
        this.f44022c.setTextIsSelectable(false);
        this.f44022c.setPadding(0, 0, 0, 0);
        this.f44022c.setImeOptions(268435462);
        ah.i iVar3 = this.f44022c;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f44021b.addView(this.f44022c);
        this.f44022c.setHintText(org.telegram.messenger.gd.N0(2131745572, null));
        this.f44022c.setCustomSelectionActionModeCallback(new oi.z0(4));
        this.f44022c.setOnKeyListener(new r40(1, this));
        this.f44022c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f44023e = vzVar;
        vzVar.setViewType(10);
        org.telegram.ui.Components.vz vzVar2 = this.f44023e;
        vzVar2.f41457x = false;
        vzVar2.setItemsCount(3);
        org.telegram.ui.Components.vz vzVar3 = this.f44023e;
        int i15 = org.telegram.ui.ActionBar.n6.G8;
        int i16 = org.telegram.ui.ActionBar.n6.f29543i6;
        vzVar3.e(i15, i16, i16);
        eVar.addView(this.f44023e);
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, this.f44023e, 1, null, 2);
        this.f44024f = a60Var;
        a60Var.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f44024f.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
        eVar.addView(this.f44024f);
        v4.c0 c0Var = new v4.c0(1, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.d = ek0Var;
        ek0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f44024f);
        org.telegram.ui.Components.ek0 ek0Var2 = this.d;
        kb1 kb1Var = new kb1(this, context);
        this.h = kb1Var;
        ek0Var2.setAdapter(kb1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.d;
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new fi.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new fi.g4(22, this, context));
        this.d.setOnScrollListener(new b21(this, 6));
        this.f44027s = org.telegram.ui.Components.a10.b();
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f44026r = a10Var;
        a10Var.setImageResource(2131231198);
        eVar.addView(this.f44026r, this.f44027s);
        this.f44026r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f48527b;

            {
                this.f48527b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f48527b;
                        usersSelectActivity.f44022c.clearFocus();
                        usersSelectActivity.f44022c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.f44022c);
                        return;
                    default:
                        this.f48527b.c0();
                        return;
                }
            }
        });
        this.f44026r.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        for (int i17 = 1; i17 <= i11; i17++) {
            String str = "non_contacts";
            if (this.f44030y == 2) {
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
                org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20(this.f44022c.getContext(), str);
                this.f44021b.a(n20Var, false);
                n20Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.n20 n20Var2 = new org.telegram.ui.Components.n20(this.f44022c.getContext(), O0);
                    this.f44021b.a(n20Var2, false);
                    n20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f44030y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().R4;
            } else {
                i7 = getMessagesController().Q4;
            }
            int i11 = this.f44029x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.gd.a0("MembersCountZero", null, 2131748426, org.telegram.messenger.gd.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.gd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f44029x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f44029x == 0) {
                this.F.getTitle().c(org.telegram.messenger.gd.N0(2131745472, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.gd.N0(2131745471, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.gd.N0(2131745469, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.n6 title = this.F.getTitle();
            int i12 = this.f44029x;
            title.setText(org.telegram.messenger.gd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.gd.N0(2131745470, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.gd.N0(2131745468, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O) {
            org.telegram.ui.Components.a60 a60Var = this.f44024f;
            if (a60Var != null) {
                a60Var.e(false, true);
            }
            kb1 kb1Var = this.h;
            if (kb1Var != null) {
                kb1Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
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
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44020a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29599l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29617m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29634n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44024f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44024f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44022c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29561j7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29581k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44021b, 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44021b, 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ui));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
        if (n20Var.E) {
            this.R = null;
            this.f44021b.b(n20Var);
            if (this.f44030y == 2) {
                if (n20Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (n20Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (n20Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (n20Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (n20Var.getUid() == Long.MIN_VALUE) {
                int i7 = this.L;
                int i10 = org.telegram.messenger.mp.I8;
                this.L = i7 & (-2);
            } else if (n20Var.getUid() == -9223372036854775807L) {
                int i11 = this.L;
                int i12 = org.telegram.messenger.mp.I8;
                this.L = i11 & (-3);
            } else if (n20Var.getUid() == -9223372036854775806L) {
                int i13 = this.L;
                int i14 = org.telegram.messenger.mp.I8;
                this.L = i13 & (-5);
            } else if (n20Var.getUid() == -9223372036854775805L) {
                int i15 = this.L;
                int i16 = org.telegram.messenger.mp.I8;
                this.L = i15 & (-9);
            } else if (n20Var.getUid() == -9223372036854775804L) {
                int i17 = this.L;
                int i18 = org.telegram.messenger.mp.I8;
                this.L = i17 & (-17);
            } else if (n20Var.getUid() == -9223372036854775803L) {
                int i19 = this.L;
                int i20 = org.telegram.messenger.mp.I8;
                this.L = i19 & (-33);
            } else if (n20Var.getUid() == -9223372036854775802L) {
                int i21 = this.L;
                int i22 = org.telegram.messenger.mp.I8;
                this.L = i21 & (-65);
            } else if (n20Var.getUid() == -9223372036854775801L) {
                int i23 = this.L;
                int i24 = org.telegram.messenger.mp.I8;
                this.L = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.n20 n20Var2 = this.R;
        if (n20Var2 != null) {
            n20Var2.a();
        }
        this.R = n20Var;
        n20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25276r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25276r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f44022c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f44022c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.u6.l(iVar, 34, org.telegram.ui.ActionBar.n6.Oi, null);
                org.telegram.ui.ActionBar.u6.v(this.f44022c, org.telegram.ui.ActionBar.n6.Pi, null);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.d;
            if (ek0Var != null) {
                ek0Var.x1();
            }
            org.telegram.ui.ActionBar.l1 l1Var = this.f44020a;
            if (l1Var != null) {
                org.telegram.messenger.g0.x3(l1Var, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
            }
            if (this.f44021b != null) {
                for (int i7 = 0; i7 < this.f44021b.getChildCount(); i7++) {
                    View childAt = this.f44021b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.n20) {
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
        lb1 lb1Var = this.f44021b;
        if (lb1Var != null) {
            lb1Var.requestLayout();
        }
    }
}
