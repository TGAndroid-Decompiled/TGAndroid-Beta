package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.UsersSelectActivity;
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d implements gk7, View.OnClickListener {
    public int E;
    public il F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public vf6 P;
    public ArrayList Q;
    public ya5 R;
    public int S;
    public int T;
    public xc a;
    public c8c b;
    public l7 c;
    public o39 d;
    public pi4 e;
    public na5 f;
    public b8c h;
    public z7c n;
    public un4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new vf6();
        this.Q = new ArrayList();
        this.K = z;
        this.L = i;
        this.M = arrayList;
        this.y = (byte) 0;
        this.H = true;
    }

    public static ui5 Y(UsersSelectActivity usersSelectActivity) {
        return usersSelectActivity.parentLayout;
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.Z():void");
    }

    public final void a0(android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.a0(android.content.Context, android.view.View, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.Ri));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0() {
        vf6 vf6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vf6Var.m(); i++) {
            if (vf6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(vf6Var.j(i)));
            }
        }
        z7c z7cVar = this.n;
        if (z7cVar != null) {
            z7cVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    public final void c0() {
        kr2 kr2Var;
        byte b = this.y;
        if (b == 0) {
            if (getUserConfig().p()) {
                kr2Var = getMessagesController().k4.c1;
            } else {
                kr2Var = getMessagesController().k4.b1;
            }
            int f = kr2Var.f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(k96.a0("MembersCountZero", null, 2131748427, k96.G(f, "Chats", new Object[0])));
            } else {
                aVar.setSubtitle(String.format(k96.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
            }
        } else if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            il ilVar = this.F;
            if (i2 == 0) {
                ilVar.getTitle().c(k96.M0(2131745476, null), true, true);
                int i3 = this.T;
                il ilVar2 = this.F;
                if (i3 > 0) {
                    ilVar2.getSubtitleTextView().c(k96.M0(2131745475, null), true, true);
                    return;
                } else {
                    ilVar2.getSubtitleTextView().c(k96.M0(2131745473, null), true, true);
                    return;
                }
            }
            hn title = ilVar.getTitle();
            int i4 = this.x;
            title.setText(k96.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            il ilVar3 = this.F;
            if (i5 > 0) {
                ilVar3.getSubtitleTextView().setText(k96.M0(2131745474, null));
            } else {
                ilVar3.getSubtitleTextView().setText(k96.M0(2131745472, null));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        Object K0;
        int i3;
        float f;
        float f2;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        this.R = null;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            frameLayout.a = true;
            frameLayout.b = gl.L(8.0f);
            hn hnVar = new hn(parentActivity, true, true, true);
            frameLayout.c = hnVar;
            int i4 = bkb.z8;
            zkb.U(hnVar, i4, null);
            hnVar.setTextSize(gl.L(18.0f));
            hnVar.setGravity(3);
            hnVar.setTypeface(gl.o());
            hnVar.setPadding(0, gl.L(6.0f), 0, gl.L(12.0f));
            frameLayout.addView(hnVar);
            hn hnVar2 = new hn(parentActivity, true, true, true);
            frameLayout.d = hnVar2;
            hnVar2.setTag(Integer.valueOf(bkb.A8));
            zkb.U(hnVar2, i4, null);
            hnVar2.setTextSize(gl.L(14.0f));
            hnVar2.setGravity(3);
            hnVar2.setPadding(0, 0, gl.L(10.0f), 0);
            frameLayout.addView(hnVar2);
            hnVar.getDrawable().K = true;
            hnVar2.getDrawable().K = true;
            s33 s33Var = s33.f;
            hnVar.b(1.0f, 150L, s33Var);
            hnVar2.b(1.0f, 150L, s33Var);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = k96.a0;
            if (z) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
            if (z) {
                f2 = 64.0f;
            } else {
                f2 = 0.0f;
            }
            aVar.addView((View) frameLayout, nme.d(-1, -1.0f, 0, f, 0.0f, f2, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        byte b = this.y;
        boolean z2 = this.K;
        if (b != 0 && b != 2) {
            if (b == 1) {
                c0();
            }
        } else {
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (z2) {
                aVar2.setTitle(k96.M0(2131750793, null));
            } else {
                aVar2.setTitle(k96.M0(2131750717, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 25));
        s8 s8Var = new s8((byte) 3, context, this);
        this.fragmentView = s8Var;
        int i5 = 5;
        xc xcVar = new xc(this, context, (byte) 5);
        this.a = xcVar;
        xcVar.setVerticalScrollBarEnabled(false);
        gl.u3(this.a, bkb.w0(null, bkb.c6, false));
        s8Var.addView(this.a);
        c8c c8cVar = new c8c(this, context);
        this.b = c8cVar;
        this.a.addView(c8cVar, nme.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                UsersSelectActivity usersSelectActivity = this.b;
                switch (b2) {
                    case 0:
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        gl.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.b0();
                        return;
                }
            }
        });
        l7 l7Var = new l7((byte) 9, context, this);
        this.c = l7Var;
        l7Var.setTextSize(1, 16.0f);
        zkb.A(this.c, bkb.Ni, null);
        zkb.X(this.c, bkb.F6, null);
        zkb.v(this.c, bkb.Oi, null);
        this.c.setCursorWidth(1.5f);
        l7 l7Var2 = this.c;
        l7Var2.setInputType(l7Var2.getInputType() | 176);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        l7 l7Var3 = this.c;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l7Var3.setGravity(i | 16);
        this.b.addView(this.c);
        this.c.setHintText(k96.M0(2131745576, null));
        this.c.setCustomSelectionActionModeCallback(new kv7((byte) 4));
        this.c.setOnKeyListener(new ia5(this, (byte) 1));
        this.c.addTextChangedListener(new jf6(this, (byte) 22));
        pi4 pi4Var = new pi4(context, null);
        this.e = pi4Var;
        pi4Var.setViewType(10);
        pi4 pi4Var2 = this.e;
        pi4Var2.x = false;
        pi4Var2.setItemsCount(3);
        pi4 pi4Var3 = this.e;
        int i6 = bkb.F8;
        int i7 = bkb.h6;
        pi4Var3.e(i6, i7, i7);
        s8Var.addView(this.e);
        na5 na5Var = new na5(context, this.e, 1, null, (byte) 2);
        this.f = na5Var;
        na5Var.e(qu2.r(this.currentAccount).y(), true);
        this.f.d.setText(k96.M0(2131748031, null));
        s8Var.addView(this.f);
        t26 t26Var = new t26(1, false);
        o39 o39Var = new o39(context, null);
        this.d = o39Var;
        o39Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        o39 o39Var2 = this.d;
        b8c b8cVar = new b8c(this, context);
        this.h = b8cVar;
        o39Var2.setAdapter(b8cVar);
        this.d.setLayoutManager(t26Var);
        this.d.setVerticalScrollBarEnabled(false);
        o39 o39Var3 = this.d;
        if (k96.a0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        o39Var3.setVerticalScrollbarPosition(i2);
        this.d.i(new oq1((byte) 16));
        s8Var.addView(this.d);
        this.d.setOnItemClickListener(new k0(this, context, (byte) 24));
        this.d.setOnScrollListener(new vdb(this, (byte) 7));
        this.s = un4.b();
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.r = un4Var;
        un4Var.setImageResource(2131231198);
        s8Var.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                UsersSelectActivity usersSelectActivity = this.b;
                switch (b2) {
                    case 0:
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        gl.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.b0();
                        return;
                }
            }
        });
        this.r.setContentDescription(k96.M0(2131748058, null));
        if (!z2) {
            i5 = 3;
        }
        for (int i8 = 1; i8 <= i5; i8++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i8 == 1) {
                    str = "existing_chats";
                    i3 = 1;
                } else if (i8 == 2 && !this.J) {
                    str = "new_chats";
                    i3 = 2;
                } else {
                    if (i8 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i3 = 4;
                    }
                    i3 = 8;
                }
            } else if (z2) {
                if (i8 == 1) {
                    int i9 = na7.q5;
                    i3 = 1;
                    str = "contacts";
                } else if (i8 == 2) {
                    int i10 = na7.q5;
                    i3 = 2;
                } else if (i8 == 3) {
                    int i11 = na7.q5;
                    str = "groups";
                    i3 = 4;
                } else if (i8 == 4) {
                    int i12 = na7.q5;
                    str = "channels";
                    i3 = 8;
                } else {
                    int i13 = na7.q5;
                    str = "bots";
                    i3 = 16;
                }
            } else if (i8 == 1) {
                int i14 = na7.q5;
                str = "muted";
                i3 = 32;
            } else if (i8 == 2) {
                int i15 = na7.q5;
                str = "read";
                i3 = 64;
            } else {
                int i16 = na7.q5;
                str = "archived";
                i3 = 128;
            }
            if ((this.L & i3) != 0) {
                ya5 ya5Var = new ya5(this.c.getContext(), str);
                this.b.a(ya5Var, false);
                ya5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                Long l = (Long) arrayList.get(i17);
                if (l.longValue() > 0) {
                    K0 = getMessagesController().V1(l);
                } else {
                    K0 = getMessagesController().K0(Long.valueOf(-l.longValue()));
                }
                if (K0 != null) {
                    ya5 ya5Var2 = new ya5(this.c.getContext(), K0);
                    this.b.a(ya5Var2, false);
                    ya5Var2.setOnClickListener(this);
                }
            }
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N) {
            na5 na5Var = this.f;
            if (na5Var != null) {
                na5Var.e(false, true);
            }
            b8c b8cVar = this.h;
            if (b8cVar != null) {
                b8cVar.f();
            }
        } else if (i == 2) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i3 = na7.q5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.d.getChildAt(i4);
                        if (childAt instanceof za5) {
                            ((za5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == kk7.Q) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ni));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.i7));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(this.b, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Si));
        arrayList.add(new blb(this.b, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ti));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            this.R = null;
            this.b.b(ya5Var);
            if (this.y == 2) {
                if (ya5Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (ya5Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (ya5Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (ya5Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (ya5Var.getUid() == Long.MIN_VALUE) {
                int i = this.L;
                int i2 = na7.q5;
                this.L = i & (-2);
            } else if (ya5Var.getUid() == -9223372036854775807L) {
                int i3 = this.L;
                int i4 = na7.q5;
                this.L = i3 & (-3);
            } else if (ya5Var.getUid() == -9223372036854775806L) {
                int i5 = this.L;
                int i6 = na7.q5;
                this.L = i5 & (-5);
            } else if (ya5Var.getUid() == -9223372036854775805L) {
                int i7 = this.L;
                int i8 = na7.q5;
                this.L = i7 & (-9);
            } else if (ya5Var.getUid() == -9223372036854775804L) {
                int i9 = this.L;
                int i10 = na7.q5;
                this.L = i9 & (-17);
            } else if (ya5Var.getUid() == -9223372036854775803L) {
                int i11 = this.L;
                int i12 = na7.q5;
                this.L = i11 & (-33);
            } else if (ya5Var.getUid() == -9223372036854775802L) {
                int i13 = this.L;
                int i14 = na7.q5;
                this.L = i13 & (-65);
            } else if (ya5Var.getUid() == -9223372036854775801L) {
                int i15 = this.L;
                int i16 = na7.q5;
                this.L = i15 & (-129);
            }
            c0();
            Z();
            return;
        }
        ya5 ya5Var2 = this.R;
        if (ya5Var2 != null) {
            ya5Var2.a();
        }
        this.R = ya5Var;
        ya5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.N);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Q);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Q);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l7 l7Var = this.c;
        if (l7Var != null) {
            l7Var.requestFocus();
        }
        gl.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            l7 l7Var = this.c;
            if (l7Var != null) {
                zkb.l(l7Var, 34, bkb.Ni, null);
                zkb.v(this.c, bkb.Oi, null);
            }
            o39 o39Var = this.d;
            if (o39Var != null) {
                o39Var.x1();
            }
            xc xcVar = this.a;
            if (xcVar != null) {
                gl.u3(xcVar, bkb.w0(null, bkb.c6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof ya5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        c8c c8cVar = this.b;
        if (c8cVar != null) {
            c8cVar.requestLayout();
        }
    }
}
