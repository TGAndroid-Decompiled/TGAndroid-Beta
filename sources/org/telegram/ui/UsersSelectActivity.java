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
    public org.telegram.ui.Components.w4 E;
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
    public org.telegram.ui.ActionBar.m1 f42072a;
    public ob1 f42073b;
    public ah.i f42074c;
    public org.telegram.ui.Components.pj0 d;
    public org.telegram.ui.Components.lz f42075e;
    public org.telegram.ui.Components.p50 f42076f;
    public nb1 h;
    public lb1 f42077n;
    public org.telegram.ui.Components.p00 f42078r;
    public FrameLayout.LayoutParams f42079s;
    public boolean f42080w;
    public int f42081x;
    public int f42082y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z9) {
        super(null);
        this.O = new a0.h();
        this.P = new ArrayList();
        this.J = z9;
        this.K = i7;
        this.L = arrayList;
        this.f42082y = 0;
        this.G = true;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28072n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
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
        lb1 lb1Var = this.f42077n;
        if (lb1Var != null) {
            lb1Var.c(this.K, arrayList);
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
        if (this.f42082y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f39871a = true;
            frameLayout.f39872b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(parentActivity, true, true, true);
            frameLayout.f39873c = i6Var;
            int i13 = org.telegram.ui.ActionBar.m6.A8;
            org.telegram.ui.ActionBar.t6.Y(i6Var, i13, null);
            i6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            i6Var.setGravity(3);
            i6Var.setTypeface(org.telegram.messenger.g0.o());
            i6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(i6Var);
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(parentActivity, true, true, true);
            frameLayout.d = i6Var2;
            i6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
            org.telegram.ui.ActionBar.t6.Y(i6Var2, i13, null);
            i6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            i6Var2.setGravity(3);
            i6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(i6Var2);
            i6Var.getDrawable().J = true;
            i6Var2.getDrawable().J = true;
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
            i6Var.b(1.0f, 150L, wqVar);
            i6Var2.b(1.0f, 150L, wqVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            boolean z9 = org.telegram.messenger.id.f23161a0;
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
            lVar.addView((View) frameLayout, c8.ha.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f42082y;
        boolean z10 = this.J;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                d0();
            }
        } else if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750805, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750729, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new qt0(this, 19));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 5);
        this.f42072a = m1Var;
        m1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.f42072a, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
        eVar.addView(this.f42072a);
        ob1 ob1Var = new ob1(this, context);
        this.f42073b = ob1Var;
        this.f42072a.addView(ob1Var, c8.ha.c(-2.0f, -1));
        this.f42073b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f47250b;

            {
                this.f47250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f47250b;
                        usersSelectActivity.f42074c.clearFocus();
                        usersSelectActivity.f42074c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42074c);
                        return;
                    default:
                        this.f47250b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f42074c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.A(this.f42074c, org.telegram.ui.ActionBar.m6.Li, null);
        org.telegram.ui.ActionBar.t6.U(this.f42074c, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.v(this.f42074c, org.telegram.ui.ActionBar.m6.Mi, null);
        this.f42074c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f42074c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f42074c.setSingleLine(true);
        this.f42074c.setBackgroundDrawable(null);
        this.f42074c.setVerticalScrollBarEnabled(false);
        this.f42074c.setHorizontalScrollBarEnabled(false);
        this.f42074c.setTextIsSelectable(false);
        this.f42074c.setPadding(0, 0, 0, 0);
        this.f42074c.setImeOptions(268435462);
        ah.i iVar3 = this.f42074c;
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f42073b.addView(this.f42074c);
        this.f42074c.setHintText(org.telegram.messenger.id.M0(2131745768, null));
        this.f42074c.setCustomSelectionActionModeCallback(new li.a1(4));
        this.f42074c.setOnKeyListener(new s40(1, this));
        this.f42074c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.f42075e = lzVar;
        lzVar.setViewType(10);
        org.telegram.ui.Components.lz lzVar2 = this.f42075e;
        lzVar2.f35774x = false;
        lzVar2.setItemsCount(3);
        org.telegram.ui.Components.lz lzVar3 = this.f42075e;
        int i15 = org.telegram.ui.ActionBar.m6.G8;
        int i16 = org.telegram.ui.ActionBar.m6.f27982i6;
        lzVar3.e(i15, i16, i16);
        eVar.addView(this.f42075e);
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, this.f42075e, 1, null, 2);
        this.f42076f = p50Var;
        p50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f42076f.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        eVar.addView(this.f42076f);
        v4.b0 b0Var = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f42076f);
        org.telegram.ui.Components.pj0 pj0Var2 = this.d;
        nb1 nb1Var = new nb1(this, context);
        this.h = nb1Var;
        pj0Var2.setAdapter(nb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.d;
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new di.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.q4(22, this, context));
        this.d.setOnScrollListener(new e21(this, 6));
        this.f42079s = org.telegram.ui.Components.p00.b();
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.f42078r = p00Var;
        p00Var.setImageResource(2131231195);
        eVar.addView(this.f42078r, this.f42079s);
        this.f42078r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f47250b;

            {
                this.f47250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f47250b;
                        usersSelectActivity.f42074c.clearFocus();
                        usersSelectActivity.f42074c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42074c);
                        return;
                    default:
                        this.f47250b.c0();
                        return;
                }
            }
        });
        this.f42078r.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        for (int i17 = 1; i17 <= i11; i17++) {
            String str = "non_contacts";
            if (this.f42082y == 2) {
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
                org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(this.f42074c.getContext(), str);
                this.f42073b.a(c20Var, false);
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
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(this.f42074c.getContext(), M0);
                    this.f42073b.a(c20Var2, false);
                    c20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f42082y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().O4;
            } else {
                i7 = getMessagesController().N4;
            }
            int i11 = this.f42081x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.id.a0("MembersCountZero", null, 2131748619, org.telegram.messenger.id.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.id.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f42081x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f42081x == 0) {
                this.E.getTitle().c(org.telegram.messenger.id.M0(2131745668, null), true, true);
                if (this.S > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745667, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745665, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.i6 title = this.E.getTitle();
            int i12 = this.f42081x;
            title.setText(org.telegram.messenger.id.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.S > 0) {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.id.M0(2131745666, null));
            } else {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.id.M0(2131745664, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            org.telegram.ui.Components.p50 p50Var = this.f42076f;
            if (p50Var != null) {
                p50Var.e(false, true);
            }
            nb1 nb1Var = this.h;
            if (nb1Var != null) {
                nb1Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25067r) {
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
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42072a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28038l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28056m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28073n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42076f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42076f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42074c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28000j7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28020k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42073b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f42073b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.Q = null;
            this.f42073b.b(c20Var);
            if (this.f42082y == 2) {
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
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f42074c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f42074c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.t6.l(iVar, 34, org.telegram.ui.ActionBar.m6.Li, null);
                org.telegram.ui.ActionBar.t6.v(this.f42074c, org.telegram.ui.ActionBar.m6.Mi, null);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.d;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            org.telegram.ui.ActionBar.m1 m1Var = this.f42072a;
            if (m1Var != null) {
                org.telegram.messenger.g0.z3(m1Var, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
            }
            if (this.f42073b != null) {
                for (int i7 = 0; i7 < this.f42073b.getChildCount(); i7++) {
                    View childAt = this.f42073b.getChildAt(i7);
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
        ob1 ob1Var = this.f42073b;
        if (ob1Var != null) {
            ob1Var.requestLayout();
        }
    }
}
