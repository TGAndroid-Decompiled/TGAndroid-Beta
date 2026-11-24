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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d implements jm7, View.OnClickListener {
    public int E;
    public im F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public vh6 P;
    public ArrayList Q;
    public wc5 R;
    public int S;
    public int T;
    public xd a;
    public dac b;
    public l7 c;
    public r59 d;
    public tk4 e;
    public lc5 f;
    public cac h;
    public aac n;
    public wp4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new vh6();
        this.Q = new ArrayList();
        this.K = z;
        this.L = i;
        this.M = arrayList;
        this.y = (byte) 0;
        this.H = true;
    }

    public static tk5 Z(UsersSelectActivity usersSelectActivity) {
        return usersSelectActivity.parentLayout;
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.Ri));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void b0(android.content.Context r17, android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.b0(android.content.Context, android.view.View, int):void");
    }

    public final void c0() {
        vh6 vh6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vh6Var.m(); i++) {
            if (vh6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(vh6Var.j(i)));
            }
        }
        aac aacVar = this.n;
        if (aacVar != null) {
            aacVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        Object L0;
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
            frameLayout.b = gm.L(8.0f);
            io ioVar = new io(parentActivity, true, true, true);
            frameLayout.c = ioVar;
            int i4 = cmb.z8;
            anb.U(ioVar, i4, null);
            ioVar.setTextSize(gm.L(18.0f));
            ioVar.setGravity(3);
            ioVar.setTypeface(gm.o());
            ioVar.setPadding(0, gm.L(6.0f), 0, gm.L(12.0f));
            frameLayout.addView(ioVar);
            io ioVar2 = new io(parentActivity, true, true, true);
            frameLayout.d = ioVar2;
            ioVar2.setTag(Integer.valueOf(cmb.A8));
            anb.U(ioVar2, i4, null);
            ioVar2.setTextSize(gm.L(14.0f));
            ioVar2.setGravity(3);
            ioVar2.setPadding(0, 0, gm.L(10.0f), 0);
            frameLayout.addView(ioVar2);
            ioVar.getDrawable().K = true;
            ioVar2.getDrawable().K = true;
            d53 d53Var = d53.f;
            ioVar.b(1.0f, 150L, d53Var);
            ioVar2.b(1.0f, 150L, d53Var);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = jb6.a0;
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
            aVar.addView((View) frameLayout, qoe.d(-1, -1.0f, 0, f, 0.0f, f2, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(true);
        byte b = this.y;
        boolean z2 = this.K;
        if (b != 0 && b != 2) {
            if (b == 1) {
                d0();
            }
        } else {
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (z2) {
                aVar2.setTitle(jb6.M0(2131750742, null));
            } else {
                aVar2.setTitle(jb6.M0(2131750666, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 26));
        s8 s8Var = new s8((byte) 3, context, this);
        this.fragmentView = s8Var;
        xd xdVar = new xd(this, context, (byte) 6);
        this.a = xdVar;
        xdVar.setVerticalScrollBarEnabled(false);
        gm.u3(this.a, cmb.w0(null, cmb.c6, false));
        s8Var.addView(this.a);
        dac dacVar = new dac(this, context);
        this.b = dacVar;
        this.a.addView(dacVar, qoe.c(-2.0f, -1));
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
                        gm.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.c0();
                        return;
                }
            }
        });
        l7 l7Var = new l7((byte) 9, context, this);
        this.c = l7Var;
        l7Var.setTextSize(1, 16.0f);
        anb.A(this.c, cmb.Ni, null);
        anb.X(this.c, cmb.F6, null);
        anb.v(this.c, cmb.Oi, null);
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
        int i5 = 5;
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l7Var3.setGravity(i | 16);
        this.b.addView(this.c);
        this.c.setHintText(jb6.M0(2131745502, null));
        this.c.setCustomSelectionActionModeCallback(new mx7((byte) 4));
        this.c.setOnKeyListener(new gc5(this, (byte) 1));
        this.c.addTextChangedListener(new og6(this, (byte) 23));
        tk4 tk4Var = new tk4(context, null);
        this.e = tk4Var;
        tk4Var.setViewType(10);
        tk4 tk4Var2 = this.e;
        tk4Var2.x = false;
        tk4Var2.setItemsCount(3);
        tk4 tk4Var3 = this.e;
        int i6 = cmb.F8;
        int i7 = cmb.h6;
        tk4Var3.e(i6, i7, i7);
        s8Var.addView(this.e);
        lc5 lc5Var = new lc5(context, this.e, 1, null, (byte) 2);
        this.f = lc5Var;
        lc5Var.e(bw2.r(this.currentAccount).y(), true);
        this.f.d.setText(jb6.M0(2131747957, null));
        s8Var.addView(this.f);
        u46 u46Var = new u46(1, false);
        r59 r59Var = new r59(context, null);
        this.d = r59Var;
        r59Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        r59 r59Var2 = this.d;
        cac cacVar = new cac(this, context);
        this.h = cacVar;
        r59Var2.setAdapter(cacVar);
        this.d.setLayoutManager(u46Var);
        this.d.setVerticalScrollBarEnabled(false);
        r59 r59Var3 = this.d;
        if (jb6.a0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r59Var3.setVerticalScrollbarPosition(i2);
        this.d.i(new as1((byte) 16));
        s8Var.addView(this.d);
        this.d.setOnItemClickListener(new k0(this, context, (byte) 24));
        this.d.setOnScrollListener(new k2b(this, (byte) 8));
        this.s = wp4.b();
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.r = wp4Var;
        wp4Var.setImageResource(2131231199);
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
                        gm.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.c0();
                        return;
                }
            }
        });
        this.r.setContentDescription(jb6.M0(2131747984, null));
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
                    int i9 = oc7.s5;
                    i3 = 1;
                    str = "contacts";
                } else if (i8 == 2) {
                    int i10 = oc7.s5;
                    i3 = 2;
                } else if (i8 == 3) {
                    int i11 = oc7.s5;
                    str = "groups";
                    i3 = 4;
                } else if (i8 == 4) {
                    int i12 = oc7.s5;
                    str = "channels";
                    i3 = 8;
                } else {
                    int i13 = oc7.s5;
                    str = "bots";
                    i3 = 16;
                }
            } else if (i8 == 1) {
                int i14 = oc7.s5;
                str = "muted";
                i3 = 32;
            } else if (i8 == 2) {
                int i15 = oc7.s5;
                str = "read";
                i3 = 64;
            } else {
                int i16 = oc7.s5;
                str = "archived";
                i3 = 128;
            }
            if ((this.L & i3) != 0) {
                wc5 wc5Var = new wc5(this.c.getContext(), str);
                this.b.a(wc5Var, false);
                wc5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                Long l = (Long) arrayList.get(i17);
                if (l.longValue() > 0) {
                    L0 = getMessagesController().W1(l);
                } else {
                    L0 = getMessagesController().L0(Long.valueOf(-l.longValue()));
                }
                if (L0 != null) {
                    wc5 wc5Var2 = new wc5(this.c.getContext(), L0);
                    this.b.a(wc5Var2, false);
                    wc5Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        vs2 vs2Var;
        byte b = this.y;
        if (b == 0) {
            if (getUserConfig().p()) {
                vs2Var = getMessagesController().l4.c1;
            } else {
                vs2Var = getMessagesController().l4.b1;
            }
            int f = vs2Var.f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(jb6.a0("MembersCountZero", null, 2131748376, jb6.G(f, "Chats", new Object[0])));
            } else {
                aVar.setSubtitle(String.format(jb6.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
            }
        } else if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            im imVar = this.F;
            if (i2 == 0) {
                imVar.getTitle().c(jb6.M0(2131745402, null), true, true);
                int i3 = this.T;
                im imVar2 = this.F;
                if (i3 > 0) {
                    imVar2.getSubtitleTextView().c(jb6.M0(2131745401, null), true, true);
                    return;
                } else {
                    imVar2.getSubtitleTextView().c(jb6.M0(2131745399, null), true, true);
                    return;
                }
            }
            io title = imVar.getTitle();
            int i4 = this.x;
            title.setText(jb6.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            im imVar3 = this.F;
            if (i5 > 0) {
                imVar3.getSubtitleTextView().setText(jb6.M0(2131745400, null));
            } else {
                imVar3.getSubtitleTextView().setText(jb6.M0(2131745398, null));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.N) {
            lc5 lc5Var = this.f;
            if (lc5Var != null) {
                lc5Var.e(false, true);
            }
            cac cacVar = this.h;
            if (cacVar != null) {
                cacVar.f();
            }
        } else if (i == 2) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i3 = oc7.s5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.d.getChildAt(i4);
                        if (childAt instanceof xc5) {
                            ((xc5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == nm7.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ni));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.i7));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(this.b, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Si));
        arrayList.add(new cnb(this.b, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ti));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        wc5 wc5Var = (wc5) view;
        if (wc5Var.E) {
            this.R = null;
            this.b.b(wc5Var);
            if (this.y == 2) {
                if (wc5Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (wc5Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (wc5Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (wc5Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (wc5Var.getUid() == Long.MIN_VALUE) {
                int i = this.L;
                int i2 = oc7.s5;
                this.L = i & (-2);
            } else if (wc5Var.getUid() == -9223372036854775807L) {
                int i3 = this.L;
                int i4 = oc7.s5;
                this.L = i3 & (-3);
            } else if (wc5Var.getUid() == -9223372036854775806L) {
                int i5 = this.L;
                int i6 = oc7.s5;
                this.L = i5 & (-5);
            } else if (wc5Var.getUid() == -9223372036854775805L) {
                int i7 = this.L;
                int i8 = oc7.s5;
                this.L = i7 & (-9);
            } else if (wc5Var.getUid() == -9223372036854775804L) {
                int i9 = this.L;
                int i10 = oc7.s5;
                this.L = i9 & (-17);
            } else if (wc5Var.getUid() == -9223372036854775803L) {
                int i11 = this.L;
                int i12 = oc7.s5;
                this.L = i11 & (-33);
            } else if (wc5Var.getUid() == -9223372036854775802L) {
                int i13 = this.L;
                int i14 = oc7.s5;
                this.L = i13 & (-65);
            } else if (wc5Var.getUid() == -9223372036854775801L) {
                int i15 = this.L;
                int i16 = oc7.s5;
                this.L = i15 & (-129);
            }
            d0();
            a0();
            return;
        }
        wc5 wc5Var2 = this.R;
        if (wc5Var2 != null) {
            wc5Var2.a();
        }
        this.R = wc5Var;
        wc5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.N);
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.N);
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l7 l7Var = this.c;
        if (l7Var != null) {
            l7Var.requestFocus();
        }
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            l7 l7Var = this.c;
            if (l7Var != null) {
                anb.l(l7Var, 34, cmb.Ni, null);
                anb.v(this.c, cmb.Oi, null);
            }
            r59 r59Var = this.d;
            if (r59Var != null) {
                r59Var.x1();
            }
            xd xdVar = this.a;
            if (xdVar != null) {
                gm.u3(xdVar, cmb.w0(null, cmb.c6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof wc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        dac dacVar = this.b;
        if (dacVar != null) {
            dacVar.requestLayout();
        }
    }
}
