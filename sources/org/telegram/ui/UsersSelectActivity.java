package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, View.OnClickListener {
    public int E;
    public org.telegram.ui.Components.v4 F;
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
    public org.telegram.ui.Components.y10 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.k1 f42105a;
    public db1 f42106b;
    public bh.g f42107c;
    public org.telegram.ui.Components.tj0 d;
    public org.telegram.ui.Components.iz f42108e;
    public org.telegram.ui.Components.m50 f42109f;
    public cb1 h;
    public ab1 f42110n;
    public org.telegram.ui.Components.l00 f42111r;
    public FrameLayout.LayoutParams f42112s;
    public boolean f42113w;
    public int f42114x;
    public int f42115y;

    public UsersSelectActivity(int i3, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i3;
        this.M = arrayList;
        this.f42115y = 0;
        this.H = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.b0():void");
    }

    public final void c0() {
        a0.h hVar = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < hVar.m(); i3++) {
            if (hVar.j(i3) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i3)));
            }
        }
        ab1 ab1Var = this.f42110n;
        if (ab1Var != null) {
            ab1Var.e(this.L, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        Object M0;
        int i11;
        float f10;
        float f11;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        this.R = null;
        if (this.f42115y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f38988a = true;
            frameLayout.f38989b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            frameLayout.f38990c = h6Var;
            int i12 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.r6.Z(h6Var, i12, null);
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            h6Var.setGravity(3);
            h6Var.setTypeface(org.telegram.messenger.g0.o());
            h6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(h6Var);
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            frameLayout.d = h6Var2;
            h6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
            org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, null);
            h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var2.setGravity(3);
            h6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(h6Var2);
            h6Var.getDrawable().J = true;
            h6Var2.getDrawable().J = true;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            h6Var.b(1.0f, 150L, xqVar);
            h6Var2.b(1.0f, 150L, xqVar);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.bd.f21784a0;
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
            kVar.addView((View) frameLayout, b8.mf.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.f42115y;
        boolean z11 = this.K;
        if (i13 != 0 && i13 != 2) {
            if (i13 == 1) {
                d0();
            }
        } else if (z11) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750806, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750730, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 20));
        e eVar = new e(4, context, this);
        this.fragmentView = eVar;
        int i14 = 5;
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this, context, 5);
        this.f42105a = k1Var;
        k1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.f42105a, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        eVar.addView(this.f42105a);
        db1 db1Var = new db1(this, context);
        this.f42106b = db1Var;
        this.f42105a.addView(db1Var, b8.mf.c(-2.0f, -1));
        this.f42106b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f52597b;

            {
                this.f52597b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f52597b;
                        usersSelectActivity.f42107c.clearFocus();
                        usersSelectActivity.f42107c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42107c);
                        return;
                    default:
                        this.f52597b.c0();
                        return;
                }
            }
        });
        bh.g gVar = new bh.g(10, context, this);
        this.f42107c = gVar;
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.B(this.f42107c, org.telegram.ui.ActionBar.k6.Li, null);
        org.telegram.ui.ActionBar.r6.V(this.f42107c, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.w(this.f42107c, org.telegram.ui.ActionBar.k6.Mi, null);
        this.f42107c.setCursorWidth(1.5f);
        bh.g gVar2 = this.f42107c;
        gVar2.setInputType(gVar2.getInputType() | 176);
        this.f42107c.setSingleLine(true);
        this.f42107c.setBackgroundDrawable(null);
        this.f42107c.setVerticalScrollBarEnabled(false);
        this.f42107c.setHorizontalScrollBarEnabled(false);
        this.f42107c.setTextIsSelectable(false);
        this.f42107c.setPadding(0, 0, 0, 0);
        this.f42107c.setImeOptions(268435462);
        bh.g gVar3 = this.f42107c;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        gVar3.setGravity(i3 | 16);
        this.f42106b.addView(this.f42107c);
        this.f42107c.setHintText(org.telegram.messenger.bd.M0(2131745778, null));
        this.f42107c.setCustomSelectionActionModeCallback(new mi.b1(4));
        this.f42107c.setOnKeyListener(new k40(1, this));
        this.f42107c.addTextChangedListener(new n0(this, 19));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.f42108e = izVar;
        izVar.setViewType(10);
        org.telegram.ui.Components.iz izVar2 = this.f42108e;
        izVar2.f34869x = false;
        izVar2.setItemsCount(3);
        org.telegram.ui.Components.iz izVar3 = this.f42108e;
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
        izVar3.e(i15, i16, i16);
        eVar.addView(this.f42108e);
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(context, this.f42108e, 1, null, 2);
        this.f42109f = m50Var;
        m50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f42109f.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
        eVar.addView(this.f42109f);
        u4.b0 b0Var = new u4.b0(1, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f42109f);
        org.telegram.ui.Components.tj0 tj0Var2 = this.d;
        cb1 cb1Var = new cb1(this, context);
        this.h = cb1Var;
        tj0Var2.setAdapter(cb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tj0 tj0Var3 = this.d;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        tj0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new ei.l(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new ei.q4(22, this, context));
        this.d.setOnScrollListener(new r11(this, 6));
        this.f42112s = org.telegram.ui.Components.l00.b();
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.f42111r = l00Var;
        l00Var.setImageResource(2131231195);
        eVar.addView(this.f42111r, this.f42112s);
        this.f42111r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f52597b;

            {
                this.f52597b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f52597b;
                        usersSelectActivity.f42107c.clearFocus();
                        usersSelectActivity.f42107c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.f42107c);
                        return;
                    default:
                        this.f52597b.c0();
                        return;
                }
            }
        });
        this.f42111r.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        if (!z11) {
            i14 = 3;
        }
        for (int i17 = 1; i17 <= i14; i17++) {
            String str = "non_contacts";
            if (this.f42115y == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i11 = 1;
                } else if (i17 == 2 && !this.J) {
                    str = "new_chats";
                    i11 = 2;
                } else {
                    if (i17 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i11 = 4;
                    }
                    i11 = 8;
                }
            } else if (z11) {
                if (i17 == 1) {
                    int i18 = org.telegram.messenger.hp.C8;
                    i11 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.hp.C8;
                    i11 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.hp.C8;
                    str = "groups";
                    i11 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.hp.C8;
                    str = "channels";
                    i11 = 8;
                } else {
                    int i22 = org.telegram.messenger.hp.C8;
                    str = "bots";
                    i11 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.hp.C8;
                str = "muted";
                i11 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.hp.C8;
                str = "read";
                i11 = 64;
            } else {
                int i25 = org.telegram.messenger.hp.C8;
                str = "archived";
                i11 = 128;
            }
            if ((i11 & this.L) != 0) {
                org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(this.f42107c.getContext(), str);
                this.f42106b.a(y10Var, false);
                y10Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
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
                    org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(this.f42107c.getContext(), M0);
                    this.f42106b.a(y10Var2, false);
                    y10Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i3;
        int i10 = this.f42115y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i3 = getMessagesController().O4;
            } else {
                i3 = getMessagesController().N4;
            }
            int i11 = this.f42114x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.bd.a0("MembersCountZero", null, 2131748627, org.telegram.messenger.bd.G(i3, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.bd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f42114x), Integer.valueOf(i3)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f42114x == 0) {
                this.F.getTitle().c(org.telegram.messenger.bd.M0(2131745678, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.bd.M0(2131745677, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.bd.M0(2131745675, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.h6 title = this.F.getTitle();
            int i12 = this.f42114x;
            title.setText(org.telegram.messenger.bd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.bd.M0(2131745676, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.bd.M0(2131745674, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O) {
            org.telegram.ui.Components.m50 m50Var = this.f42109f;
            if (m50Var != null) {
                m50Var.e(false, true);
            }
            cb1 cb1Var = this.h;
            if (cb1Var != null) {
                cb1Var.f();
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i11 = org.telegram.messenger.hp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42105a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42109f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42109f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42107c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27973i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27990j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42106b, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42106b, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        if (y10Var.E) {
            this.R = null;
            this.f42106b.b(y10Var);
            if (this.f42115y == 2) {
                if (y10Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (y10Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (y10Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (y10Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (y10Var.getUid() == Long.MIN_VALUE) {
                int i3 = this.L;
                int i10 = org.telegram.messenger.hp.C8;
                this.L = i3 & (-2);
            } else if (y10Var.getUid() == -9223372036854775807L) {
                int i11 = this.L;
                int i12 = org.telegram.messenger.hp.C8;
                this.L = i11 & (-3);
            } else if (y10Var.getUid() == -9223372036854775806L) {
                int i13 = this.L;
                int i14 = org.telegram.messenger.hp.C8;
                this.L = i13 & (-5);
            } else if (y10Var.getUid() == -9223372036854775805L) {
                int i15 = this.L;
                int i16 = org.telegram.messenger.hp.C8;
                this.L = i15 & (-9);
            } else if (y10Var.getUid() == -9223372036854775804L) {
                int i17 = this.L;
                int i18 = org.telegram.messenger.hp.C8;
                this.L = i17 & (-17);
            } else if (y10Var.getUid() == -9223372036854775803L) {
                int i19 = this.L;
                int i20 = org.telegram.messenger.hp.C8;
                this.L = i19 & (-33);
            } else if (y10Var.getUid() == -9223372036854775802L) {
                int i21 = this.L;
                int i22 = org.telegram.messenger.hp.C8;
                this.L = i21 & (-65);
            } else if (y10Var.getUid() == -9223372036854775801L) {
                int i23 = this.L;
                int i24 = org.telegram.messenger.hp.C8;
                this.L = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.y10 y10Var2 = this.R;
        if (y10Var2 != null) {
            y10Var2.a();
        }
        this.R = y10Var;
        y10Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        bh.g gVar = this.f42107c;
        if (gVar != null) {
            gVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            bh.g gVar = this.f42107c;
            if (gVar != null) {
                org.telegram.ui.ActionBar.r6.m(gVar, 34, org.telegram.ui.ActionBar.k6.Li, null);
                org.telegram.ui.ActionBar.r6.w(this.f42107c, org.telegram.ui.ActionBar.k6.Mi, null);
            }
            org.telegram.ui.Components.tj0 tj0Var = this.d;
            if (tj0Var != null) {
                tj0Var.x1();
            }
            org.telegram.ui.ActionBar.k1 k1Var = this.f42105a;
            if (k1Var != null) {
                org.telegram.messenger.g0.z3(k1Var, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
            }
            if (this.f42106b != null) {
                for (int i3 = 0; i3 < this.f42106b.getChildCount(); i3++) {
                    View childAt = this.f42106b.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Components.y10) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i3) {
        this.E = i3;
        db1 db1Var = this.f42106b;
        if (db1Var != null) {
            db1Var.requestLayout();
        }
    }
}
