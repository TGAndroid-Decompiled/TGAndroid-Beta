package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class at0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.tu0 {
    public boolean A0;
    public boolean B0;
    public int D;
    public CharSequence E;
    public Editable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.sx0 Q;
    public org.telegram.ui.Components.vy R;
    public vh.r2 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.t0 f35709a;
    public boolean f35710a0;
    public ys0 f35711b;
    public org.telegram.ui.Cells.e6 f35712b0;
    public w71 f35713c;
    public final boolean f35714c0;
    public s4.a0 d;
    public final boolean f35715d0;
    public gd e;
    public zs0 f35716e0;
    public final un f35717f;
    public boolean f35718f0;
    public int f35719g0;
    public org.telegram.ui.Components.q30 h;
    public int f35720h0;
    public int f35721i0;
    public int f35722j0;
    public int f35723k0;
    public int f35724l0;
    public int m0;
    public final int f35725n;
    public int f35726n0;
    public int f35727o0;
    public int f35728p0;
    public int f35729q0;
    public int[] f35730r;
    public int f35731r0;
    public int f35732s;
    public int f35733s0;
    public int f35734t0;
    public int f35735u0;
    public int f35736v0;
    public final CharSequence[] f35737w;
    public int f35738w0;
    public final boolean[] f35739x;
    public int f35740x0;
    public int f35741y;
    public final m4 f35742y0;
    public TLRPC.MessageMedia f35743z0;

    public at0(un unVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.i0.L(3.0f);
        this.f35719g0 = -1;
        this.f35742y0 = new m4(this, 14);
        this.f35713c.getChildCount();
        this.f35715d0 = true;
        int i10 = getMessagesController().S6;
        this.f35725n = i10;
        this.f35737w = new CharSequence[i10];
        this.f35739x = new boolean[i10];
        this.f35717f = unVar;
        this.f35714c0 = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(this.currentAccount).f14863a).q();
        this.L = false;
        this.N = 2;
    }

    public static void g0(at0 at0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = at0Var.f35715d0;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            if (i10 == at0Var.f35721i0) {
                if (z10) {
                    i14 = at0Var.getMessagesController().T6;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = at0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == at0Var.f35722j0) {
                Editable editable = at0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = at0Var.f35726n0;
                if (i10 >= i18 && i10 < at0Var.D + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = at0Var.getMessagesController().U6;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = at0Var.f35737w[i19];
                    if (charSequence2 != null) {
                        i12 = charSequence2.length();
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 - i12;
                    i14 = i11;
                } else {
                    return;
                }
            }
            float f7 = i14;
            if (i13 <= f7 - (0.7f * f7)) {
                e6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.u5 textView2 = e6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.t6.f21153p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.t6.A6;
                }
                org.telegram.ui.ActionBar.a7.Y(textView2, i16, null);
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            e6Var.setText2("");
        }
    }

    public static void h0(at0 at0Var, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        if (at0Var.f35714c0 && z10) {
            if (at0Var.f35712b0 == e6Var && at0Var.P && at0Var.B0) {
                at0Var.n0();
                at0Var.P = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = at0Var.f35712b0;
            at0Var.f35712b0 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.fg emojiButton = e6Var.getEmojiButton();
            org.telegram.ui.Components.dg dgVar = org.telegram.ui.Components.dg.e;
            emojiButton.j(dgVar, false);
            w71 w71Var = at0Var.f35713c;
            View F = w71Var.F(e6Var);
            if (F == null) {
                T = null;
            } else {
                T = w71Var.T(F);
            }
            org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
            if (sx0Var != null) {
                sx0Var.f();
                org.telegram.ui.Components.sx0 sx0Var2 = at0Var.Q;
                if (sx0Var2 != null && T != null) {
                    View view = T.f47898a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && sx0Var2.getDelegate() != view) {
                        at0Var.Q.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 != null && e6Var2 != e6Var) {
                if (at0Var.P) {
                    at0Var.n0();
                    at0Var.o0(false);
                    at0Var.q0();
                }
                e6Var2.setEmojiButtonVisibility(false);
                e6Var2.getEmojiButton().j(dgVar, false);
            }
        }
    }

    public static void i0(at0 at0Var, org.telegram.ui.Cells.e6 e6Var) {
        at0Var.f35712b0 = e6Var;
        if (at0Var.P) {
            at0Var.n0();
            at0Var.q0();
            return;
        }
        at0Var.u0(1);
    }

    @Override
    public final void K(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int L;
        if (this.f35714c0) {
            if (i10 > org.telegram.messenger.i0.L(50.0f) && this.Y && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                if (z10) {
                    this.X = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z10) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                if (this.B0) {
                    i11 += org.telegram.messenger.i0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.i0.f16026q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.A0 != this.B0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.e.requestLayout();
                    boolean z13 = this.A0;
                    if (z13 != this.B0) {
                        if (z13) {
                            L = -org.telegram.messenger.i0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(120.0f);
                        }
                        k0(L);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i10 || this.f35710a0 != z10) {
                this.Z = i10;
                this.f35710a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.e6 e6Var = this.f35712b0;
                if (e6Var != null) {
                    if (e6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Y = z12;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    u0(0);
                }
                if (this.V != 0 && !(z11 = this.Y) && z11 != z14 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    org.telegram.messenger.i0.r(this.f35742y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i12, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(this.actionBar, i12, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21332z8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i12, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231241);
        boolean z10 = this.f35715d0;
        if (z10) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (this.I) {
                i11 = 2131744131;
            } else {
                i11 = 2131744099;
            }
            lVar2.setTitle(org.telegram.messenger.cd.L0(i11, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748281, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748282, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ss0(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (z10) {
            if (this.I) {
                i10 = 2131744132;
            } else {
                i10 = 2131744100;
            }
            upperCase = org.telegram.messenger.cd.L0(i10, null);
        } else {
            upperCase = org.telegram.messenger.cd.L0(2131751753, null).toUpperCase();
        }
        this.f35709a = p5.e(1, upperCase);
        this.f35711b = new ys0(this, context);
        gd gdVar = new gd(3, context, this);
        this.e = gdVar;
        gdVar.setDelegate(this);
        gd gdVar2 = this.e;
        this.fragmentView = gdVar2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, gdVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f35713c = new w71(9, context, null);
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f35713c.setItemAnimator(jVar);
        this.f35713c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f35713c.getItemAnimator()).C = false;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        this.f35713c.setLayoutManager(a0Var);
        new s4.x(new ja(this, 8)).h(this.f35713c);
        frameLayout.addView(this.f35713c, w7.b6.e(-1, -1, 51));
        this.f35713c.setAdapter(this.f35711b);
        this.f35713c.setOnItemClickListener(new g(this, 23));
        this.f35713c.setOnScrollListener(new h3(this, 24));
        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(context, 4);
        this.h = q30Var;
        q30Var.setText(org.telegram.messenger.cd.L0(2131747170, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f35714c0) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
            org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = sx0Var;
            sx0Var.D = true;
            sx0Var.E = true;
            sx0Var.setHorizontalPadding(org.telegram.messenger.i0.L(24.0f));
            frameLayout.addView(this.Q, w7.b6.e(-2, 160, 51));
        }
        this.S = new vh.r2(this.e, false, null);
        m0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                vyVar.P.g1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f35712b0;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.f35712b0.getEditField().setTextColor(-1);
                this.f35712b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f35719g0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false);
            if (this.actionBar.u()) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21279w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        int i10;
        org.telegram.ui.Components.sx0 sx0Var = this.Q;
        if (sx0Var != null) {
            sx0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.D;
        this.f35739x[i11] = false;
        int i12 = i11 + 1;
        this.D = i12;
        if (this.f35730r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f35730r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f35732s + 1;
                    this.f35732s = i10;
                }
                iArr[i13] = i10;
            }
            this.f35730r = iArr;
        }
        if (this.D == this.f35737w.length) {
            this.f35711b.s(this.f35727o0);
        }
        this.f35711b.i(this.f35727o0);
        v0();
        this.f35718f0 = false;
        this.f35719g0 = (this.f35726n0 + this.D) - 1;
        this.f35711b.g(this.f35728p0);
    }

    public final void k0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new eg(this, f7, 3));
        ofFloat.addListener(new ts0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
        ofFloat.start();
    }

    public final boolean l0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f35743z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f35737w;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.D, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.b0(this.E))) || i12 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (!TextUtils.equals(charSequenceArr[i14].toString(), todoList.list.get(i14).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f35715d0;
            if (z14) {
                i10 = 2131752567;
            } else {
                i10 = 2131752573;
            }
            String L0 = org.telegram.messenger.cd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (z14) {
                i11 = 2131752568;
            } else {
                i11 = 2131752574;
            }
            x1Var.T = org.telegram.messenger.cd.L0(i11, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new tj0(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            showDialog(x1Var);
        }
        return z13;
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.at0.m0():void");
    }

    public final void n0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.i0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            k0(-org.telegram.messenger.i0.L(120.0f));
        }
    }

    public final void o0(boolean z10) {
        if (this.f35714c0) {
            if (this.P) {
                org.telegram.ui.Components.vy vyVar = this.R;
                vyVar.P.C0();
                vyVar.I.scrollTo(0, 0);
                vyVar.G(1);
                vyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                u0(0);
            }
            if (z10) {
                org.telegram.ui.Components.vy vyVar2 = this.R;
                if (vyVar2 != null && vyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new rs0(this, 1));
                    ofFloat.addListener(new ts0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                    ofFloat.start();
                    return;
                }
                p0();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                o0(true);
                return false;
            }
            return false;
        }
        return l0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f35718f0 && this.f35719g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f35713c.getChildCount()) {
                    view = this.f35713c.getChildAt(i10);
                    this.f35713c.getClass();
                    if (RecyclerView.R(view) == this.f35719g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.messenger.i0.h3(new bh(((org.telegram.ui.Cells.e6) view).getTextView(), 5), 300L);
                this.f35719g0 = -1;
            }
            this.f35718f0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.f35714c0) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                this.e.removeView(vyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f35714c0) {
            o0(false);
            org.telegram.ui.Components.sx0 sx0Var = this.Q;
            if (sx0Var != null) {
                sx0Var.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f35712b0;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.f35712b0.getTextView().clearFocus();
                org.telegram.messenger.i0.v1(this.f35712b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ys0 ys0Var = this.f35711b;
        if (ys0Var != null) {
            ys0Var.f();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        ih.b bVar;
        float f7;
        super.onThemeColorsChanged();
        try {
            w71 w71Var = this.f35713c;
            if (w71Var != null) {
                for (int i11 = 0; i11 < w71Var.getChildCount(); i11++) {
                    View childAt = w71Var.getChildAt(i11);
                    s4.c1 T = w71Var.T(childAt);
                    if (T != null && (((i10 = T.f47901f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.e6) && (bVar = ((org.telegram.ui.Cells.e6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.G6);
                        if (bVar.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.6f;
                        }
                        bVar.setTextColor(org.telegram.ui.ActionBar.t6.r1(f7, themedColor));
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0() {
        org.telegram.ui.Components.vy vyVar;
        org.telegram.ui.Components.fg emojiButton;
        if (!this.P && (vyVar = this.R) != null && vyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.f35712b0;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.dg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void q0() {
        int i10;
        this.S.e = true;
        EditTextBoldCursor editField = this.f35712b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.i0.J3(editField);
        if (org.telegram.messenger.i0.D) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        u0(i10);
        if (!org.telegram.messenger.i0.D && !this.Y && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            this.T = true;
            m4 m4Var = this.f35742y0;
            org.telegram.messenger.i0.r(m4Var);
            org.telegram.messenger.i0.h3(m4Var, 100L);
        }
    }

    public final void r0(qg qgVar) {
        this.f35716e0 = qgVar;
    }

    public final void s0(TLRPC.MessageMedia messageMedia, boolean z10) {
        t0(messageMedia, z10, -1);
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        int i12;
        this.f35743z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable A5 = org.telegram.messenger.jj.A5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = A5;
            org.telegram.messenger.jj.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.f35741y = size;
            this.f35732s = 0;
            this.f35730r = new int[size];
            int i13 = 0;
            while (true) {
                i11 = this.D;
                if (i13 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i13).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f35737w;
                charSequenceArr[i13] = spannableStringBuilder2;
                charSequenceArr[i13] = org.telegram.messenger.k6.m(charSequenceArr[i13], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i13] = org.telegram.messenger.jj.A5(charSequenceArr[i13], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.jj.b(charSequenceArr[i13], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f35730r[i13] = tL_messageMediaToDo.todo.list.get(i13).f19940id;
                this.f35732s = Math.max(this.f35732s, this.f35730r[i13]);
                i13++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i11 + 1;
                v0();
                this.f35718f0 = true;
                int i14 = this.f35726n0;
                if (i10 < 0) {
                    i12 = this.D - 1;
                } else {
                    i12 = i10;
                }
                this.f35719g0 = i14 + i12;
            }
        }
    }

    public final void u0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.e6 e6Var;
        if (this.f35714c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.vy vyVar = this.R;
                if (vyVar != null && vyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.vy vyVar2 = this.R;
                if (vyVar2 != null && vyVar2.f31865c1 != org.telegram.messenger.d20.f15147s0) {
                    this.e.removeView(vyVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.vy vyVar3 = new org.telegram.ui.Components.vy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = vyVar3;
                    vyVar3.f31933x2 = false;
                    vyVar3.U0 = false;
                    vyVar3.setVisibility(8);
                    if (org.telegram.messenger.i0.Q1()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new us0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.vy vyVar4 = this.R;
                if (this.W <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.W = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.W = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.X = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar4.getLayoutParams();
                layoutParams.height = i11;
                vyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1() && (e6Var = this.f35712b0) != null) {
                    org.telegram.messenger.i0.v1(e6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.fg emojiButton = this.f35712b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.dg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new rs0(this, 0));
                    ofFloat.addListener(new ts0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.fg emojiButton2 = this.f35712b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.dg.e, true);
            }
            org.telegram.ui.Components.vy vyVar5 = this.R;
            if (vyVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.e.requestLayout();
        }
    }

    public final void v0() {
        this.f35720h0 = -1;
        this.f35721i0 = -1;
        this.f35724l0 = -1;
        this.m0 = -1;
        this.f35722j0 = -1;
        this.f35723k0 = -1;
        this.f35726n0 = -1;
        this.f35727o0 = -1;
        this.f35731r0 = -1;
        this.f35733s0 = -1;
        this.f35735u0 = -1;
        this.f35736v0 = -1;
        this.f35734t0 = -1;
        this.f35738w0 = -1;
        this.f35729q0 = -1;
        this.f35740x0 = 0;
        boolean z10 = this.f35715d0;
        if (!z10 || !this.I) {
            this.f35720h0 = 0;
            this.f35721i0 = 1;
            this.f35724l0 = 2;
            this.f35740x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.D;
        if (i10 != 0) {
            int i11 = this.f35740x0;
            this.f35726n0 = i11;
            this.f35740x0 = i11 + i10;
        }
        if (i10 != this.f35737w.length) {
            int i12 = this.f35740x0;
            this.f35740x0 = i12 + 1;
            this.f35727o0 = i12;
        }
        int i13 = this.f35740x0;
        int i14 = i13 + 1;
        this.f35740x0 = i14;
        this.f35728p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f35740x0 = i15;
            this.f35729q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f35740x0 = i16;
                this.f35736v0 = i15;
                if (this.J) {
                    this.f35740x0 = i13 + 4;
                    this.f35735u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f35717f.e;
            if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                int i17 = this.f35740x0;
                this.f35740x0 = i17 + 1;
                this.f35731r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f35740x0;
                this.f35740x0 = i19 + 1;
                this.f35733s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f35740x0;
                this.f35740x0 = i20 + 1;
                this.f35734t0 = i20;
            }
            int i21 = this.f35740x0;
            int i22 = i21 + 1;
            this.f35740x0 = i22;
            this.f35738w0 = i21;
            if (this.L) {
                this.f35722j0 = i22;
                this.f35740x0 = i21 + 3;
                this.f35723k0 = i21 + 2;
            }
        }
    }
}
