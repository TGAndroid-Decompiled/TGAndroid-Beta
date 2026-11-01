package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, View.OnClickListener {
    public int D;
    public org.telegram.ui.Components.u4 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public int J;
    public final ArrayList K;
    public boolean L;
    public boolean M;
    public a0.h N;
    public ArrayList O;
    public org.telegram.ui.Components.s20 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.p1 f34153a;
    public ed1 f34154b;
    public org.telegram.ui.ActionBar.n0 f34155c;
    public org.telegram.ui.Components.uk0 d;
    public org.telegram.ui.Components.zz e;
    public org.telegram.ui.Components.f60 f34156f;
    public dd1 h;
    public bd1 f34157n;
    public org.telegram.ui.Components.f10 f34158r;
    public FrameLayout.LayoutParams f34159s;
    public boolean f34160w;
    public int f34161x;
    public int f34162y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.f34162y = 0;
        this.G = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.b0():void");
    }

    public final void c0() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        bd1 bd1Var = this.f34157n;
        if (bd1Var != null) {
            bd1Var.e(this.J, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        Object L0;
        int i12;
        float f7;
        float f10;
        this.M = false;
        this.L = false;
        this.O.clear();
        this.N.b();
        this.P = null;
        if (this.f34162y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f30853a = true;
            frameLayout.f30854b = org.telegram.messenger.i0.L(8.0f);
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(parentActivity, true, true, true);
            frameLayout.f30855c = f6Var;
            int i13 = org.telegram.ui.ActionBar.t6.A8;
            org.telegram.ui.ActionBar.a7.Z(f6Var, i13, null);
            f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
            f6Var.setGravity(3);
            f6Var.setTypeface(org.telegram.messenger.i0.o());
            f6Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(12.0f));
            frameLayout.addView(f6Var);
            org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(parentActivity, true, true, true);
            frameLayout.d = f6Var2;
            f6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
            org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, null);
            f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
            f6Var2.setGravity(3);
            f6Var2.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
            frameLayout.addView(f6Var2);
            f6Var.getDrawable().J = true;
            f6Var2.getDrawable().J = true;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
            f6Var.b(1.0f, 150L, grVar);
            f6Var2.b(1.0f, 150L, grVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            boolean z10 = org.telegram.messenger.dd.X;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            if (z10) {
                f10 = 64.0f;
            } else {
                f10 = 0.0f;
            }
            lVar.addView((View) frameLayout, w7.b6.d(-1, -1.0f, 0, f7, 0.0f, f10, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = this.f34162y;
        boolean z11 = this.I;
        if (i14 != 0 && i14 != 2) {
            if (i14 == 1) {
                d0();
            }
        } else if (z11) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750806, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750730, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 10));
        int i15 = 5;
        jf.g gVar = new jf.g(this, context, 5);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(this, context, 5);
        this.f34153a = p1Var;
        p1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.i0.y3(this.f34153a, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        gVar.addView(this.f34153a);
        ed1 ed1Var = new ed1(this, context);
        this.f34154b = ed1Var;
        this.f34153a.addView(ed1Var, w7.b6.c(-2.0f, -1));
        this.f34154b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f35764b;

            {
                this.f35764b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f35764b;
                        usersSelectActivity.f34155c.clearFocus();
                        usersSelectActivity.f34155c.requestFocus();
                        org.telegram.messenger.i0.J3(usersSelectActivity.f34155c);
                        return;
                    default:
                        this.f35764b.c0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 7);
        this.f34155c = n0Var;
        n0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.B(this.f34155c, org.telegram.ui.ActionBar.t6.Li, null);
        org.telegram.ui.ActionBar.a7.V(this.f34155c, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.w(this.f34155c, org.telegram.ui.ActionBar.t6.Mi, null);
        this.f34155c.setCursorWidth(1.5f);
        org.telegram.ui.ActionBar.n0 n0Var2 = this.f34155c;
        n0Var2.setInputType(n0Var2.getInputType() | 176);
        this.f34155c.setSingleLine(true);
        this.f34155c.setBackgroundDrawable(null);
        this.f34155c.setVerticalScrollBarEnabled(false);
        this.f34155c.setHorizontalScrollBarEnabled(false);
        this.f34155c.setTextIsSelectable(false);
        this.f34155c.setPadding(0, 0, 0, 0);
        this.f34155c.setImeOptions(268435462);
        org.telegram.ui.ActionBar.n0 n0Var3 = this.f34155c;
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n0Var3.setGravity(i10 | 16);
        this.f34154b.addView(this.f34155c);
        this.f34155c.setHintText(org.telegram.messenger.dd.L0(2131745785, null));
        this.f34155c.setCustomSelectionActionModeCallback(new bi.i1(4));
        this.f34155c.setOnKeyListener(new n50(1, this));
        this.f34155c.addTextChangedListener(new n0(this, 19));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.e = zzVar;
        zzVar.setViewType(10);
        org.telegram.ui.Components.zz zzVar2 = this.e;
        zzVar2.f33280x = false;
        zzVar2.setItemsCount(3);
        org.telegram.ui.Components.zz zzVar3 = this.e;
        int i16 = org.telegram.ui.ActionBar.t6.G8;
        int i17 = org.telegram.ui.ActionBar.t6.f21021i6;
        zzVar3.e(i16, i17, i17);
        gVar.addView(this.e);
        org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(context, this.e, 1, null, 2);
        this.f34156f = f60Var;
        f60Var.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f34156f.d.setText(org.telegram.messenger.dd.L0(2131748240, null));
        gVar.addView(this.f34156f);
        s4.a0 a0Var = new s4.a0(1, false);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.d = uk0Var;
        uk0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f34156f);
        org.telegram.ui.Components.uk0 uk0Var2 = this.d;
        dd1 dd1Var = new dd1(this, context);
        this.h = dd1Var;
        uk0Var2.setAdapter(dd1Var);
        this.d.setLayoutManager(a0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uk0 uk0Var3 = this.d;
        if (org.telegram.messenger.dd.X) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        uk0Var3.setVerticalScrollbarPosition(i11);
        this.d.i(new dh.g(12));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new mg.q0(21, this, context));
        this.d.setOnScrollListener(new u41(this, 5));
        this.f34159s = org.telegram.ui.Components.f10.b();
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.f34158r = f10Var;
        f10Var.setImageResource(2131231195);
        gVar.addView(this.f34158r, this.f34159s);
        this.f34158r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f35764b;

            {
                this.f35764b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f35764b;
                        usersSelectActivity.f34155c.clearFocus();
                        usersSelectActivity.f34155c.requestFocus();
                        org.telegram.messenger.i0.J3(usersSelectActivity.f34155c);
                        return;
                    default:
                        this.f35764b.c0();
                        return;
                }
            }
        });
        this.f34158r.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        if (!z11) {
            i15 = 3;
        }
        for (int i18 = 1; i18 <= i15; i18++) {
            String str = "non_contacts";
            if (this.f34162y == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i12 = 1;
                } else if (i18 == 2 && !this.H) {
                    str = "new_chats";
                    i12 = 2;
                } else {
                    if (i18 == (!this.H ? 1 : 0) + 2) {
                        str = "contacts";
                        i12 = 4;
                    }
                    i12 = 8;
                }
            } else if (z11) {
                if (i18 == 1) {
                    int i19 = org.telegram.messenger.wp.D8;
                    i12 = 1;
                    str = "contacts";
                } else if (i18 == 2) {
                    int i20 = org.telegram.messenger.wp.D8;
                    i12 = 2;
                } else if (i18 == 3) {
                    int i21 = org.telegram.messenger.wp.D8;
                    str = "groups";
                    i12 = 4;
                } else if (i18 == 4) {
                    int i22 = org.telegram.messenger.wp.D8;
                    str = "channels";
                    i12 = 8;
                } else {
                    int i23 = org.telegram.messenger.wp.D8;
                    str = "bots";
                    i12 = 16;
                }
            } else if (i18 == 1) {
                int i24 = org.telegram.messenger.wp.D8;
                str = "muted";
                i12 = 32;
            } else if (i18 == 2) {
                int i25 = org.telegram.messenger.wp.D8;
                str = "read";
                i12 = 64;
            } else {
                int i26 = org.telegram.messenger.wp.D8;
                str = "archived";
                i12 = 128;
            }
            if ((i12 & this.J) != 0) {
                org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(this.f34155c.getContext(), str);
                this.f34154b.a(s20Var, false);
                s20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                Long l4 = (Long) arrayList.get(i27);
                if (l4.longValue() > 0) {
                    L0 = getMessagesController().Z1(l4);
                } else {
                    L0 = getMessagesController().L0(Long.valueOf(-l4.longValue()));
                }
                if (L0 != null) {
                    org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(this.f34155c.getContext(), L0);
                    this.f34154b.a(s20Var2, false);
                    s20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i10;
        int i11 = this.f34162y;
        if (i11 == 0) {
            if (getUserConfig().q()) {
                i10 = getMessagesController().P4;
            } else {
                i10 = getMessagesController().O4;
            }
            int i12 = this.f34161x;
            if (i12 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.dd.a0("MembersCountZero", null, 2131748634, org.telegram.messenger.dd.G(i10, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.dd.J0(i12, "MembersCountSelected"), Integer.valueOf(this.f34161x), Integer.valueOf(i10)));
            }
        } else if (i11 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f34161x == 0) {
                this.E.getTitle().c(org.telegram.messenger.dd.L0(2131745685, null), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.dd.L0(2131745684, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.dd.L0(2131745682, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.f6 title = this.E.getTitle();
            int i13 = this.f34161x;
            title.setText(org.telegram.messenger.dd.G(i13, "Chats", Integer.valueOf(i13)));
            if (this.R > 0) {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.dd.L0(2131745683, null));
            } else {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.dd.L0(2131745681, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.O) {
            org.telegram.ui.Components.f60 f60Var = this.f34156f;
            if (f60Var != null) {
                f60Var.e(false, true);
            }
            dd1 dd1Var = this.h;
            if (dd1Var != null) {
                dd1Var.f();
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i12 = org.telegram.messenger.wp.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = this.d.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.j4) {
                            ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.D;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34153a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21078l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21097m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21117n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34156f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34156f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34155c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21022i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21040j7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21060k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34154b, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34154b, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (s20Var.D) {
            this.P = null;
            this.f34154b.b(s20Var);
            if (this.f34162y == 2) {
                if (s20Var.getUid() == -9223372036854775800L) {
                    this.J &= -2;
                } else if (s20Var.getUid() == -9223372036854775799L) {
                    this.J &= -3;
                } else if (s20Var.getUid() == Long.MIN_VALUE) {
                    this.J &= -5;
                } else if (s20Var.getUid() == -9223372036854775807L) {
                    this.J &= -9;
                }
            } else if (s20Var.getUid() == Long.MIN_VALUE) {
                int i10 = this.J;
                int i11 = org.telegram.messenger.wp.D8;
                this.J = i10 & (-2);
            } else if (s20Var.getUid() == -9223372036854775807L) {
                int i12 = this.J;
                int i13 = org.telegram.messenger.wp.D8;
                this.J = i12 & (-3);
            } else if (s20Var.getUid() == -9223372036854775806L) {
                int i14 = this.J;
                int i15 = org.telegram.messenger.wp.D8;
                this.J = i14 & (-5);
            } else if (s20Var.getUid() == -9223372036854775805L) {
                int i16 = this.J;
                int i17 = org.telegram.messenger.wp.D8;
                this.J = i16 & (-9);
            } else if (s20Var.getUid() == -9223372036854775804L) {
                int i18 = this.J;
                int i19 = org.telegram.messenger.wp.D8;
                this.J = i18 & (-17);
            } else if (s20Var.getUid() == -9223372036854775803L) {
                int i20 = this.J;
                int i21 = org.telegram.messenger.wp.D8;
                this.J = i20 & (-33);
            } else if (s20Var.getUid() == -9223372036854775802L) {
                int i22 = this.J;
                int i23 = org.telegram.messenger.wp.D8;
                this.J = i22 & (-65);
            } else if (s20Var.getUid() == -9223372036854775801L) {
                int i24 = this.J;
                int i25 = org.telegram.messenger.wp.D8;
                this.J = i24 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.s20 s20Var2 = this.P;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.P = s20Var;
        s20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.O);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.O);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.n0 n0Var = this.f34155c;
        if (n0Var != null) {
            n0Var.requestFocus();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.n0 n0Var = this.f34155c;
            if (n0Var != null) {
                org.telegram.ui.ActionBar.a7.m(n0Var, 34, org.telegram.ui.ActionBar.t6.Li, null);
                org.telegram.ui.ActionBar.a7.w(this.f34155c, org.telegram.ui.ActionBar.t6.Mi, null);
            }
            org.telegram.ui.Components.uk0 uk0Var = this.d;
            if (uk0Var != null) {
                uk0Var.x1();
            }
            org.telegram.ui.ActionBar.p1 p1Var = this.f34153a;
            if (p1Var != null) {
                org.telegram.messenger.i0.y3(p1Var, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
            }
            if (this.f34154b != null) {
                for (int i10 = 0; i10 < this.f34154b.getChildCount(); i10++) {
                    View childAt = this.f34154b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.s20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void setContainerHeight(int i10) {
        this.D = i10;
        ed1 ed1Var = this.f34154b;
        if (ed1Var != null) {
            ed1Var.requestLayout();
        }
    }
}
