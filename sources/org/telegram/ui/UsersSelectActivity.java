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
public class UsersSelectActivity extends org.telegram.ui.ActionBar.e implements fn7, View.OnClickListener {
    public int E;
    public jl F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public zh6 P;
    public ArrayList Q;
    public zc5 R;
    public int S;
    public int T;
    public yc a;
    public ccc b;
    public m7 c;
    public d79 d;
    public tk4 e;
    public oc5 f;
    public bcc h;
    public zbc n;
    public zp4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new zh6();
        this.Q = new ArrayList();
        this.K = z;
        this.L = i;
        this.M = arrayList;
        this.y = (byte) 0;
        this.H = true;
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
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.Si));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void b0() {
        zh6 zh6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zh6Var.m(); i++) {
            if (zh6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(zh6Var.j(i)));
            }
        }
        zbc zbcVar = this.n;
        if (zbcVar != null) {
            zbcVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    public final void c0() {
        ds2 ds2Var;
        byte b = this.y;
        if (b == 0) {
            if (getUserConfig().p()) {
                ds2Var = getMessagesController().k4.k1;
            } else {
                ds2Var = getMessagesController().k4.j1;
            }
            int f = ds2Var.f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(ob6.a0("MembersCountZero", null, 2131748373, ob6.G(f, "Chats", new Object[0])));
            } else {
                aVar.setSubtitle(String.format(ob6.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
            }
        } else if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            jl jlVar = this.F;
            if (i2 == 0) {
                jlVar.getTitle().c(ob6.M0(2131745396, null), true, true);
                int i3 = this.T;
                jl jlVar2 = this.F;
                if (i3 > 0) {
                    jlVar2.getSubtitleTextView().c(ob6.M0(2131745395, null), true, true);
                    return;
                } else {
                    jlVar2.getSubtitleTextView().c(ob6.M0(2131745393, null), true, true);
                    return;
                }
            }
            in title = jlVar.getTitle();
            int i4 = this.x;
            title.setText(ob6.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            jl jlVar3 = this.F;
            if (i5 > 0) {
                jlVar3.getSubtitleTextView().setText(ob6.M0(2131745394, null));
            } else {
                jlVar3.getSubtitleTextView().setText(ob6.M0(2131745392, null));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        Object M0;
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
            frameLayout.b = hl.L(8.0f);
            in inVar = new in(parentActivity, true, true, true);
            frameLayout.c = inVar;
            int i4 = aob.A8;
            yob.U(inVar, i4, null);
            inVar.setTextSize(hl.L(18.0f));
            inVar.setGravity(3);
            inVar.setTypeface(hl.o());
            inVar.setPadding(0, hl.L(6.0f), 0, hl.L(12.0f));
            frameLayout.addView(inVar);
            in inVar2 = new in(parentActivity, true, true, true);
            frameLayout.d = inVar2;
            inVar2.setTag(Integer.valueOf(aob.B8));
            yob.U(inVar2, i4, null);
            inVar2.setTextSize(hl.L(14.0f));
            inVar2.setGravity(3);
            inVar2.setPadding(0, 0, hl.L(10.0f), 0);
            frameLayout.addView(inVar2);
            inVar.getDrawable().K = true;
            inVar2.getDrawable().K = true;
            k43 k43Var = k43.f;
            inVar.b(1.0f, 150L, k43Var);
            inVar2.b(1.0f, 150L, k43Var);
            frameLayout.setClipChildren(false);
            this.F = frameLayout;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = ob6.a0;
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
            aVar.addView((View) frameLayout, tre.d(-1, -1.0f, 0, f, 0.0f, f2, 0.0f));
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
                aVar2.setTitle(ob6.M0(2131750770, null));
            } else {
                aVar2.setTitle(ob6.M0(2131750694, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 27));
        t8 t8Var = new t8(this, context, (byte) 2);
        this.fragmentView = t8Var;
        yc ycVar = new yc(this, context, (byte) 6);
        this.a = ycVar;
        ycVar.setVerticalScrollBarEnabled(false);
        hl.u3(this.a, aob.w0(null, aob.d6, false));
        t8Var.addView(this.a);
        ccc cccVar = new ccc(this, context);
        this.b = cccVar;
        this.a.addView(cccVar, tre.c(-2.0f, -1));
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
                        hl.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.b0();
                        return;
                }
            }
        });
        m7 m7Var = new m7((byte) 9, context, this);
        this.c = m7Var;
        m7Var.setTextSize(1, 16.0f);
        yob.A(this.c, aob.Oi, null);
        yob.X(this.c, aob.G6, null);
        yob.v(this.c, aob.Pi, null);
        this.c.setCursorWidth(1.5f);
        m7 m7Var2 = this.c;
        m7Var2.setInputType(m7Var2.getInputType() | 176);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        m7 m7Var3 = this.c;
        int i5 = 5;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        m7Var3.setGravity(i | 16);
        this.b.addView(this.c);
        this.c.setHintText(ob6.M0(2131745496, null));
        this.c.setCustomSelectionActionModeCallback(new ry7((byte) 4));
        this.c.setOnKeyListener(new jc5(this, (byte) 1));
        this.c.addTextChangedListener(new nh6(this, (byte) 23));
        tk4 tk4Var = new tk4(context, null);
        this.e = tk4Var;
        tk4Var.setViewType(10);
        tk4 tk4Var2 = this.e;
        tk4Var2.x = false;
        tk4Var2.setItemsCount(3);
        tk4 tk4Var3 = this.e;
        int i6 = aob.G8;
        int i7 = aob.i6;
        tk4Var3.e(i6, i7, i7);
        t8Var.addView(this.e);
        oc5 oc5Var = new oc5(context, this.e, 1, null, (byte) 2);
        this.f = oc5Var;
        oc5Var.e(lv2.r(this.currentAccount).y(), true);
        this.f.d.setText(ob6.M0(2131747954, null));
        t8Var.addView(this.f);
        x46 x46Var = new x46(1, false);
        d79 d79Var = new d79(context, null);
        this.d = d79Var;
        d79Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        d79 d79Var2 = this.d;
        bcc bccVar = new bcc(this, context);
        this.h = bccVar;
        d79Var2.setAdapter(bccVar);
        this.d.setLayoutManager(x46Var);
        this.d.setVerticalScrollBarEnabled(false);
        d79 d79Var3 = this.d;
        if (ob6.a0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        d79Var3.setVerticalScrollbarPosition(i2);
        this.d.i(new br1((byte) 16));
        t8Var.addView(this.d);
        this.d.setOnItemClickListener(new l0(this, context, (byte) 24));
        this.d.setOnScrollListener(new qhb(this, (byte) 7));
        this.s = zp4.b();
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.r = zp4Var;
        zp4Var.setImageResource(2131231198);
        t8Var.addView(this.r, this.s);
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
                        hl.E3(usersSelectActivity.c);
                        return;
                    default:
                        usersSelectActivity.b0();
                        return;
                }
            }
        });
        this.r.setContentDescription(ob6.M0(2131747981, null));
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
                    int i9 = uc7.r5;
                    i3 = 1;
                    str = "contacts";
                } else if (i8 == 2) {
                    int i10 = uc7.r5;
                    i3 = 2;
                } else if (i8 == 3) {
                    int i11 = uc7.r5;
                    str = "groups";
                    i3 = 4;
                } else if (i8 == 4) {
                    int i12 = uc7.r5;
                    str = "channels";
                    i3 = 8;
                } else {
                    int i13 = uc7.r5;
                    str = "bots";
                    i3 = 16;
                }
            } else if (i8 == 1) {
                int i14 = uc7.r5;
                str = "muted";
                i3 = 32;
            } else if (i8 == 2) {
                int i15 = uc7.r5;
                str = "read";
                i3 = 64;
            } else {
                int i16 = uc7.r5;
                str = "archived";
                i3 = 128;
            }
            if ((this.L & i3) != 0) {
                zc5 zc5Var = new zc5(this.c.getContext(), str);
                this.b.a(zc5Var, false);
                zc5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                Long l = (Long) arrayList.get(i17);
                if (l.longValue() > 0) {
                    M0 = getMessagesController().X1(l);
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-l.longValue()));
                }
                if (M0 != null) {
                    zc5 zc5Var2 = new zc5(this.c.getContext(), M0);
                    this.b.a(zc5Var2, false);
                    zc5Var2.setOnClickListener(this);
                }
            }
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.N) {
            oc5 oc5Var = this.f;
            if (oc5Var != null) {
                oc5Var.e(false, true);
            }
            bcc bccVar = this.h;
            if (bccVar != null) {
                bccVar.f();
            }
        } else if (i == 2) {
            if (this.d != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.d.getChildCount();
                int i3 = uc7.r5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.d.getChildAt(i4);
                        if (childAt instanceof bd5) {
                            ((bd5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == jn7.R) {
            removeSelfFromStack();
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oi));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.j7));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(this.b, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ti));
        arrayList.add(new apb(this.b, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ui));
        return arrayList;
    }

    @Override
    public final void onClick(View view) {
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            this.R = null;
            this.b.b(zc5Var);
            if (this.y == 2) {
                if (zc5Var.getUid() == -9223372036854775800L) {
                    this.L &= -2;
                } else if (zc5Var.getUid() == -9223372036854775799L) {
                    this.L &= -3;
                } else if (zc5Var.getUid() == Long.MIN_VALUE) {
                    this.L &= -5;
                } else if (zc5Var.getUid() == -9223372036854775807L) {
                    this.L &= -9;
                }
            } else if (zc5Var.getUid() == Long.MIN_VALUE) {
                int i = this.L;
                int i2 = uc7.r5;
                this.L = i & (-2);
            } else if (zc5Var.getUid() == -9223372036854775807L) {
                int i3 = this.L;
                int i4 = uc7.r5;
                this.L = i3 & (-3);
            } else if (zc5Var.getUid() == -9223372036854775806L) {
                int i5 = this.L;
                int i6 = uc7.r5;
                this.L = i5 & (-5);
            } else if (zc5Var.getUid() == -9223372036854775805L) {
                int i7 = this.L;
                int i8 = uc7.r5;
                this.L = i7 & (-9);
            } else if (zc5Var.getUid() == -9223372036854775804L) {
                int i9 = this.L;
                int i10 = uc7.r5;
                this.L = i9 & (-17);
            } else if (zc5Var.getUid() == -9223372036854775803L) {
                int i11 = this.L;
                int i12 = uc7.r5;
                this.L = i11 & (-33);
            } else if (zc5Var.getUid() == -9223372036854775802L) {
                int i13 = this.L;
                int i14 = uc7.r5;
                this.L = i13 & (-65);
            } else if (zc5Var.getUid() == -9223372036854775801L) {
                int i15 = this.L;
                int i16 = uc7.r5;
                this.L = i15 & (-129);
            }
            c0();
            Z();
            return;
        }
        zc5 zc5Var2 = this.R;
        if (zc5Var2 != null) {
            zc5Var2.a();
        }
        this.R = zc5Var;
        zc5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.N);
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.R);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.N);
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.requestFocus();
        }
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            m7 m7Var = this.c;
            if (m7Var != null) {
                yob.l(m7Var, 34, aob.Oi, null);
                yob.v(this.c, aob.Pi, null);
            }
            d79 d79Var = this.d;
            if (d79Var != null) {
                d79Var.y1();
            }
            yc ycVar = this.a;
            if (ycVar != null) {
                hl.u3(ycVar, aob.w0(null, aob.d6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof zc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        ccc cccVar = this.b;
        if (cccVar != null) {
            cccVar.requestLayout();
        }
    }
}
