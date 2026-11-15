package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, View.OnClickListener {
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
    public org.telegram.ui.Components.f20 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.l1 f43448a;
    public jb1 f43449b;
    public ah.i f43450c;
    public org.telegram.ui.Components.uj0 d;
    public org.telegram.ui.Components.pz f43451e;
    public org.telegram.ui.Components.s50 f43452f;
    public ib1 h;
    public gb1 f43453n;
    public org.telegram.ui.Components.t00 f43454r;
    public FrameLayout.LayoutParams f43455s;
    public boolean f43456w;
    public int f43457x;
    public int f43458y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i7;
        this.M = arrayList;
        this.f43458y = 0;
        this.H = true;
    }

    public static void Z(org.telegram.ui.UsersSelectActivity r16, android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z(org.telegram.ui.UsersSelectActivity, android.content.Context, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.o4 a0(UsersSelectActivity usersSelectActivity) {
        return usersSelectActivity.parentLayout;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
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
        gb1 gb1Var = this.f43453n;
        if (gb1Var != null) {
            gb1Var.a(this.L, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i7;
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
        if (this.f43458y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.f40252a = true;
            frameLayout.f40253b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            frameLayout.f40254c = h6Var;
            int i12 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.q6.Y(h6Var, i12, null);
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            h6Var.setGravity(3);
            h6Var.setTypeface(org.telegram.messenger.g0.o());
            h6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            frameLayout.addView(h6Var);
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            frameLayout.d = h6Var2;
            h6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
            org.telegram.ui.ActionBar.q6.Y(h6Var2, i12, null);
            h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var2.setGravity(3);
            h6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(h6Var2);
            h6Var.getDrawable().K = true;
            h6Var2.getDrawable().K = true;
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
            h6Var.b(1.0f, 150L, erVar);
            h6Var2.b(1.0f, 150L, erVar);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.hd.f24101a0;
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
            kVar.addView((View) frameLayout, c8.ja.d(-1, -1.0f, 0, f10, 0.0f, f11, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.f43458y;
        boolean z11 = this.K;
        if (i13 != 0 && i13 != 2) {
            if (i13 == 1) {
                d0();
            }
        } else if (z11) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750805, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750729, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 20));
        e eVar = new e(2, context, this);
        this.fragmentView = eVar;
        int i14 = 5;
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this, context, 5);
        this.f43448a = l1Var;
        l1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.y3(this.f43448a, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        eVar.addView(this.f43448a);
        jb1 jb1Var = new jb1(this, context);
        this.f43449b = jb1Var;
        this.f43448a.addView(jb1Var, c8.ja.c(-2.0f, -1));
        this.f43449b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f47108b;

            {
                this.f47108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f47108b;
                        usersSelectActivity.f43450c.clearFocus();
                        usersSelectActivity.f43450c.requestFocus();
                        org.telegram.messenger.g0.J3(usersSelectActivity.f43450c);
                        return;
                    default:
                        this.f47108b.c0();
                        return;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.f43450c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.A(this.f43450c, org.telegram.ui.ActionBar.j6.Oi, null);
        org.telegram.ui.ActionBar.q6.U(this.f43450c, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.v(this.f43450c, org.telegram.ui.ActionBar.j6.Pi, null);
        this.f43450c.setCursorWidth(1.5f);
        ah.i iVar2 = this.f43450c;
        iVar2.setInputType(iVar2.getInputType() | 176);
        this.f43450c.setSingleLine(true);
        this.f43450c.setBackgroundDrawable(null);
        this.f43450c.setVerticalScrollBarEnabled(false);
        this.f43450c.setHorizontalScrollBarEnabled(false);
        this.f43450c.setTextIsSelectable(false);
        this.f43450c.setPadding(0, 0, 0, 0);
        this.f43450c.setImeOptions(268435462);
        ah.i iVar3 = this.f43450c;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar3.setGravity(i7 | 16);
        this.f43449b.addView(this.f43450c);
        this.f43450c.setHintText(org.telegram.messenger.hd.M0(2131745768, null));
        this.f43450c.setCustomSelectionActionModeCallback(new oi.y0(4));
        this.f43450c.setOnKeyListener(new p40(1, this));
        this.f43450c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f43451e = pzVar;
        pzVar.setViewType(10);
        org.telegram.ui.Components.pz pzVar2 = this.f43451e;
        pzVar2.f38448x = false;
        pzVar2.setItemsCount(3);
        org.telegram.ui.Components.pz pzVar3 = this.f43451e;
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        int i16 = org.telegram.ui.ActionBar.j6.f28941i6;
        pzVar3.e(i15, i16, i16);
        eVar.addView(this.f43451e);
        org.telegram.ui.Components.s50 s50Var = new org.telegram.ui.Components.s50(context, this.f43451e, 1, null, 2);
        this.f43452f = s50Var;
        s50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f43452f.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
        eVar.addView(this.f43452f);
        v4.b0 b0Var = new v4.b0(1, false);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.d = uj0Var;
        uj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f43452f);
        org.telegram.ui.Components.uj0 uj0Var2 = this.d;
        ib1 ib1Var = new ib1(this, context);
        this.h = ib1Var;
        uj0Var2.setAdapter(ib1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.d;
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        uj0Var3.setVerticalScrollbarPosition(i10);
        this.d.i(new fi.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new fi.i4(22, this, context));
        this.d.setOnScrollListener(new y11(this, 6));
        this.f43455s = org.telegram.ui.Components.t00.b();
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.f43454r = t00Var;
        t00Var.setImageResource(2131231195);
        eVar.addView(this.f43454r, this.f43455s);
        this.f43454r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f47108b;

            {
                this.f47108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f47108b;
                        usersSelectActivity.f43450c.clearFocus();
                        usersSelectActivity.f43450c.requestFocus();
                        org.telegram.messenger.g0.J3(usersSelectActivity.f43450c);
                        return;
                    default:
                        this.f47108b.c0();
                        return;
                }
            }
        });
        this.f43454r.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        if (!z11) {
            i14 = 3;
        }
        for (int i17 = 1; i17 <= i14; i17++) {
            String str = "non_contacts";
            if (this.f43458y == 2) {
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
                    int i18 = org.telegram.messenger.np.D8;
                    i11 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.np.D8;
                    i11 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.np.D8;
                    str = "groups";
                    i11 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.np.D8;
                    str = "channels";
                    i11 = 8;
                } else {
                    int i22 = org.telegram.messenger.np.D8;
                    str = "bots";
                    i11 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.np.D8;
                str = "muted";
                i11 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.np.D8;
                str = "read";
                i11 = 64;
            } else {
                int i25 = org.telegram.messenger.np.D8;
                str = "archived";
                i11 = 128;
            }
            if ((i11 & this.L) != 0) {
                org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(this.f43450c.getContext(), str);
                this.f43449b.a(f20Var, false);
                f20Var.setOnClickListener(this);
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
                    org.telegram.ui.Components.f20 f20Var2 = new org.telegram.ui.Components.f20(this.f43450c.getContext(), M0);
                    this.f43449b.a(f20Var2, false);
                    f20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        int i10 = this.f43458y;
        if (i10 == 0) {
            if (getUserConfig().q()) {
                i7 = getMessagesController().P4;
            } else {
                i7 = getMessagesController().O4;
            }
            int i11 = this.f43457x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.a0("MembersCountZero", null, 2131748619, org.telegram.messenger.hd.G(i7, "Chats", new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.f43457x), Integer.valueOf(i7)));
            }
        } else if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.f43457x == 0) {
                this.F.getTitle().c(org.telegram.messenger.hd.M0(2131745668, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.hd.M0(2131745667, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.hd.M0(2131745665, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.h6 title = this.F.getTitle();
            int i12 = this.f43457x;
            title.setText(org.telegram.messenger.hd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.hd.M0(2131745666, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.hd.M0(2131745664, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.O) {
            org.telegram.ui.Components.s50 s50Var = this.f43452f;
            if (s50Var != null) {
                s50Var.e(false, true);
            }
            ib1 ib1Var = this.h;
            if (ib1Var != null) {
                ib1Var.f();
            }
        } else if (i7 == org.telegram.messenger.ns.f25559r) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i11 = org.telegram.messenger.np.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.d.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43448a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43452f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43452f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43450c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28959j7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43449b, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43449b, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ui));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) view;
        if (f20Var.E) {
            this.R = null;
            this.f43449b.b(f20Var);
            if (this.f43458y == 2) {
                if (f20Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (f20Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (f20Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (f20Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (f20Var.getUid() == Long.MIN_VALUE) {
                int i7 = this.L;
                int i10 = org.telegram.messenger.np.D8;
                this.L = i7 & (-2);
            } else if (f20Var.getUid() == -9223372036854775807L) {
                int i11 = this.L;
                int i12 = org.telegram.messenger.np.D8;
                this.L = i11 & (-3);
            } else if (f20Var.getUid() == -9223372036854775806L) {
                int i13 = this.L;
                int i14 = org.telegram.messenger.np.D8;
                this.L = i13 & (-5);
            } else if (f20Var.getUid() == -9223372036854775805L) {
                int i15 = this.L;
                int i16 = org.telegram.messenger.np.D8;
                this.L = i15 & (-9);
            } else if (f20Var.getUid() == -9223372036854775804L) {
                int i17 = this.L;
                int i18 = org.telegram.messenger.np.D8;
                this.L = i17 & (-17);
            } else if (f20Var.getUid() == -9223372036854775803L) {
                int i19 = this.L;
                int i20 = org.telegram.messenger.np.D8;
                this.L = i19 & (-33);
            } else if (f20Var.getUid() == -9223372036854775802L) {
                int i21 = this.L;
                int i22 = org.telegram.messenger.np.D8;
                this.L = i21 & (-65);
            } else if (f20Var.getUid() == -9223372036854775801L) {
                int i23 = this.L;
                int i24 = org.telegram.messenger.np.D8;
                this.L = i23 & (-129);
            }
            d0();
            b0();
            return;
        }
        org.telegram.ui.Components.f20 f20Var2 = this.R;
        if (f20Var2 != null) {
            f20Var2.a();
        }
        this.R = f20Var;
        f20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.O);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.O);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.f43450c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.f43450c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.q6.l(iVar, 34, org.telegram.ui.ActionBar.j6.Oi, null);
                org.telegram.ui.ActionBar.q6.v(this.f43450c, org.telegram.ui.ActionBar.j6.Pi, null);
            }
            org.telegram.ui.Components.uj0 uj0Var = this.d;
            if (uj0Var != null) {
                uj0Var.x1();
            }
            org.telegram.ui.ActionBar.l1 l1Var = this.f43448a;
            if (l1Var != null) {
                org.telegram.messenger.g0.y3(l1Var, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
            }
            if (this.f43449b != null) {
                for (int i7 = 0; i7 < this.f43449b.getChildCount(); i7++) {
                    View childAt = this.f43449b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.f20) {
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
        jb1 jb1Var = this.f43449b;
        if (jb1Var != null) {
            jb1Var.requestLayout();
        }
    }
}
