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
    public org.telegram.ui.Components.d20 Q;
    public int R;
    public int S;
    public org.telegram.ui.ActionBar.m1 f42081a;
    public nb1 f42082b;
    public ah.i f42083c;
    public org.telegram.ui.Components.qj0 d;
    public org.telegram.ui.Components.mz f42084e;
    public org.telegram.ui.Components.q50 f42085f;
    public mb1 h;
    public kb1 f42086n;
    public org.telegram.ui.Components.q00 f42087r;
    public FrameLayout.LayoutParams f42088s;
    public boolean f42089w;
    public int f42090x;
    public int f42091y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z9) {
        super(null);
        this.O = new a0.h();
        this.P = new ArrayList();
        this.J = z9;
        this.K = i7;
        this.L = arrayList;
        this.f42091y = 0;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28047n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27885e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27904f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
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
        kb1 kb1Var = this.f42086n;
        if (kb1Var != null) {
            kb1Var.c(this.K, arrayList);
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
        if (this.f42091y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f40287a = true;
            frameLayout.f40288b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.f40289c = j6Var;
            int i13 = org.telegram.ui.ActionBar.l6.A8;
            org.telegram.ui.ActionBar.s6.Y(j6Var, i13, null);
            j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(org.telegram.messenger.g0.o());
            j6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            frameLayout.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.l6.B8));
            org.telegram.ui.ActionBar.s6.Y(j6Var2, i13, null);
            j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(j6Var2);
            j6Var.getDrawable().J = true;
            j6Var2.getDrawable().J = true;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
            j6Var.b(1.0f, 150L, xqVar);
            j6Var2.b(1.0f, 150L, xqVar);
            frameLayout.setClipChildren(false);
            this.E = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z9 = org.telegram.messenger.id.f23157a0;
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
        int i14 = this.f42091y;
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
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 19));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 5);
        this.f42081a = m1Var;
        m1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.f42081a, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
        eVar.addView(this.f42081a);
        nb1 nb1Var = new nb1(this, context);
        this.f42082b = nb1Var;
        this.f42081a.addView(nb1Var, c8.ha.c(-2.0f, -1));
        this.f42082b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f46915b;

            {
                this.f46915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f46915b;
                        usersSelectActivity.f42083c.clearFocus();
                        usersSelectActivity.f42083c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42083c);
                        return;
                    default:
                        this.f46915b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f42083c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.A(this.f42083c, org.telegram.ui.ActionBar.l6.Li, null);
        org.telegram.ui.ActionBar.s6.U(this.f42083c, org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.ui.ActionBar.s6.v(this.f42083c, org.telegram.ui.ActionBar.l6.Mi, null);
        this.f42083c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f42083c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f42083c.setSingleLine(true);
        this.f42083c.setBackgroundDrawable(null);
        this.f42083c.setVerticalScrollBarEnabled(false);
        this.f42083c.setHorizontalScrollBarEnabled(false);
        this.f42083c.setTextIsSelectable(false);
        this.f42083c.setPadding(0, 0, 0, 0);
        this.f42083c.setImeOptions(268435462);
        ah.i iVar3 = this.f42083c;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f42082b.addView(this.f42083c);
        this.f42083c.setHintText(org.telegram.messenger.id.M0(2131745768, null));
        this.f42083c.setCustomSelectionActionModeCallback(new li.a1(4));
        this.f42083c.setOnKeyListener(new r40(1, this));
        this.f42083c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f42084e = mzVar;
        mzVar.setViewType(10);
        org.telegram.ui.Components.mz mzVar2 = this.f42084e;
        mzVar2.f36181x = false;
        mzVar2.setItemsCount(3);
        org.telegram.ui.Components.mz mzVar3 = this.f42084e;
        int i15 = org.telegram.ui.ActionBar.l6.G8;
        int i16 = org.telegram.ui.ActionBar.l6.f27957i6;
        mzVar3.e(i15, i16, i16);
        eVar.addView(this.f42084e);
        org.telegram.ui.Components.q50 q50Var = new org.telegram.ui.Components.q50(context, this.f42084e, 1, null, 2);
        this.f42085f = q50Var;
        q50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f42085f.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        eVar.addView(this.f42085f);
        v4.b0 b0Var = new v4.b0(1, false);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.d = qj0Var;
        qj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f42085f);
        org.telegram.ui.Components.qj0 qj0Var2 = this.d;
        mb1 mb1Var = new mb1(this, context);
        this.h = mb1Var;
        qj0Var2.setAdapter(mb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.qj0 qj0Var3 = this.d;
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        qj0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new di.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.q4(22, this, context));
        this.d.setOnScrollListener(new d21(this, 6));
        this.f42088s = org.telegram.ui.Components.q00.b();
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.f42087r = q00Var;
        q00Var.setImageResource(2131231195);
        eVar.addView(this.f42087r, this.f42088s);
        this.f42087r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f46915b;

            {
                this.f46915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f46915b;
                        usersSelectActivity.f42083c.clearFocus();
                        usersSelectActivity.f42083c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42083c);
                        return;
                    default:
                        this.f46915b.c0();
                        return;
                }
            }
        });
        this.f42087r.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        for (int i17 = 1; i17 <= i11; i17++) {
            String str = "non_contacts";
            if (this.f42091y == 2) {
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
                org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(this.f42083c.getContext(), str);
                this.f42082b.a(d20Var, false);
                d20Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.d20 d20Var2 = new org.telegram.ui.Components.d20(this.f42083c.getContext(), M0);
                    this.f42082b.a(d20Var2, false);
                    d20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f42091y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().O4;
            } else {
                i7 = getMessagesController().N4;
            }
            int i11 = this.f42090x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.id.a0("MembersCountZero", null, 2131748619, org.telegram.messenger.id.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.id.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f42090x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f42090x == 0) {
                this.E.getTitle().c(org.telegram.messenger.id.M0(2131745668, null), true, true);
                if (this.S > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745667, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745665, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.j6 title = this.E.getTitle();
            int i12 = this.f42090x;
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
            org.telegram.ui.Components.q50 q50Var = this.f42085f;
            if (q50Var != null) {
                q50Var.e(false, true);
            }
            mb1 mb1Var = this.h;
            if (mb1Var != null) {
                mb1Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
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
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42081a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28013l7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28031m7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28048n7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42085f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42085f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27939h6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42083c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27975j7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27995k7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42082b, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42082b, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ri));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) view;
        if (d20Var.D) {
            this.Q = null;
            this.f42082b.b(d20Var);
            if (this.f42091y == 2) {
                if (d20Var.getUid() == -9223372036854775800L) {
                    this.K &= -2;
                } else if (d20Var.getUid() == -9223372036854775799L) {
                    this.K &= -3;
                } else if (d20Var.getUid() == Long.MIN_VALUE) {
                    this.K &= -5;
                } else if (d20Var.getUid() == -9223372036854775807L) {
                    this.K &= -9;
                }
            } else if (d20Var.getUid() == Long.MIN_VALUE) {
                int i7 = this.K;
                int i10 = org.telegram.messenger.qp.C8;
                this.K = i7 & (-2);
            } else if (d20Var.getUid() == -9223372036854775807L) {
                int i11 = this.K;
                int i12 = org.telegram.messenger.qp.C8;
                this.K = i11 & (-3);
            } else if (d20Var.getUid() == -9223372036854775806L) {
                int i13 = this.K;
                int i14 = org.telegram.messenger.qp.C8;
                this.K = i13 & (-5);
            } else if (d20Var.getUid() == -9223372036854775805L) {
                int i15 = this.K;
                int i16 = org.telegram.messenger.qp.C8;
                this.K = i15 & (-9);
            } else if (d20Var.getUid() == -9223372036854775804L) {
                int i17 = this.K;
                int i18 = org.telegram.messenger.qp.C8;
                this.K = i17 & (-17);
            } else if (d20Var.getUid() == -9223372036854775803L) {
                int i19 = this.K;
                int i20 = org.telegram.messenger.qp.C8;
                this.K = i19 & (-33);
            } else if (d20Var.getUid() == -9223372036854775802L) {
                int i21 = this.K;
                int i22 = org.telegram.messenger.qp.C8;
                this.K = i21 & (-65);
            } else if (d20Var.getUid() == -9223372036854775801L) {
                int i23 = this.K;
                int i24 = org.telegram.messenger.qp.C8;
                this.K = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.d20 d20Var2 = this.Q;
        if (d20Var2 != null) {
            d20Var2.a();
        }
        this.Q = d20Var;
        d20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f42083c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f42083c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.s6.l(iVar, 34, org.telegram.ui.ActionBar.l6.Li, null);
                org.telegram.ui.ActionBar.s6.v(this.f42083c, org.telegram.ui.ActionBar.l6.Mi, null);
            }
            org.telegram.ui.Components.qj0 qj0Var = this.d;
            if (qj0Var != null) {
                qj0Var.x1();
            }
            org.telegram.ui.ActionBar.m1 m1Var = this.f42081a;
            if (m1Var != null) {
                org.telegram.messenger.g0.z3(m1Var, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
            }
            if (this.f42082b != null) {
                for (int i7 = 0; i7 < this.f42082b.getChildCount(); i7++) {
                    View childAt = this.f42082b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.d20) {
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
        nb1 nb1Var = this.f42082b;
        if (nb1Var != null) {
            nb1Var.requestLayout();
        }
    }
}
