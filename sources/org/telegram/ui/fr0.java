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
public final class fr0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.pt0 {
    public TLRPC.MessageMedia A0;
    public boolean B0;
    public boolean C0;
    public int E;
    public CharSequence F;
    public Editable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public boolean Q;
    public org.telegram.ui.Components.ow0 R;
    public org.telegram.ui.Components.ey S;
    public gi.p3 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.q0 f45327a;
    public int f45328a0;
    public dr0 f45329b;
    public boolean f45330b0;
    public u51 f45331c;
    public org.telegram.ui.Cells.z5 f45332c0;
    public u4.b0 d;
    public final boolean f45333d0;
    public wc f45334e;
    public final boolean f45335e0;
    public final wm f45336f;
    public er0 f45337f0;
    public boolean f45338g0;
    public org.telegram.ui.Components.u20 h;
    public int f45339h0;
    public int f45340i0;
    public int f45341j0;
    public int f45342k0;
    public int f45343l0;
    public int m0;
    public final int f45344n;
    public int f45345n0;
    public int f45346o0;
    public int f45347p0;
    public int f45348q0;
    public int[] f45349r;
    public int f45350r0;
    public int f45351s;
    public int f45352s0;
    public int f45353t0;
    public int f45354u0;
    public int f45355v0;
    public final CharSequence[] f45356w;
    public int f45357w0;
    public final boolean[] f45358x;
    public int f45359x0;
    public int f45360y;
    public int f45361y0;
    public final o4 f45362z0;

    public fr0(wm wmVar) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = org.telegram.messenger.g0.L(3.0f);
        this.f45339h0 = -1;
        this.f45362z0 = new o4(this, 14);
        this.f45331c.getChildCount();
        this.f45335e0 = true;
        int i3 = getMessagesController().R6;
        this.f45344n = i3;
        this.f45356w = new CharSequence[i3];
        this.f45358x = new boolean[i3];
        this.f45336f = wmVar;
        this.f45333d0 = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(this.currentAccount).f21919a).q();
        this.M = false;
        this.O = 2;
    }

    public static void h0(fr0 fr0Var, View view, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = fr0Var.f45335e0;
        if (view instanceof org.telegram.ui.Cells.z5) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            if (i3 == fr0Var.f45341j0) {
                if (z10) {
                    i13 = fr0Var.getMessagesController().S6;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = fr0Var.F;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i3 == fr0Var.f45342k0) {
                Editable editable = fr0Var.G;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = fr0Var.f45346o0;
                if (i3 >= i17 && i3 < fr0Var.E + i17) {
                    int i18 = i3 - i17;
                    if (z10) {
                        i10 = fr0Var.getMessagesController().T6;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = fr0Var.f45356w[i18];
                    if (charSequence2 != null) {
                        i11 = charSequence2.length();
                    } else {
                        i11 = 0;
                    }
                    i12 = i10 - i11;
                    i13 = i10;
                } else {
                    return;
                }
            }
            float f10 = i13;
            if (i12 <= f10 - (0.7f * f10)) {
                z5Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.k5 textView2 = z5Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.k6.f28102p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.k6.A6;
                }
                org.telegram.ui.ActionBar.r6.Y(textView2, i15, null);
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            z5Var.setText2("");
        }
    }

    public static void i0(fr0 fr0Var, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        u4.d1 T;
        if (fr0Var.f45333d0 && z10) {
            if (fr0Var.f45332c0 == z5Var && fr0Var.Q && fr0Var.C0) {
                fr0Var.o0();
                fr0Var.Q = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = fr0Var.f45332c0;
            fr0Var.f45332c0 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.hg emojiButton = z5Var.getEmojiButton();
            org.telegram.ui.Components.fg fgVar = org.telegram.ui.Components.fg.f33793e;
            emojiButton.j(fgVar, false);
            u51 u51Var = fr0Var.f45331c;
            View F = u51Var.F(z5Var);
            if (F == null) {
                T = null;
            } else {
                T = u51Var.T(F);
            }
            org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
            if (ow0Var != null) {
                ow0Var.f();
                org.telegram.ui.Components.ow0 ow0Var2 = fr0Var.R;
                if (ow0Var2 != null && T != null) {
                    View view = T.f55540a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && ow0Var2.getDelegate() != view) {
                        fr0Var.R.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 != null && z5Var2 != z5Var) {
                if (fr0Var.Q) {
                    fr0Var.o0();
                    fr0Var.p0(false);
                    fr0Var.r0();
                }
                z5Var2.setEmojiButtonVisibility(false);
                z5Var2.getEmojiButton().j(fgVar, false);
            }
        }
    }

    public static void j0(fr0 fr0Var, org.telegram.ui.Cells.z5 z5Var) {
        fr0Var.f45332c0 = z5Var;
        if (fr0Var.Q) {
            fr0Var.o0();
            fr0Var.r0();
            return;
        }
        fr0Var.v0(1);
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.f45333d0) {
            if (i3 > org.telegram.messenger.g0.L(50.0f) && this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.Y = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.X).commit();
                }
            }
            if (this.Q) {
                if (z10) {
                    i10 = this.Y;
                } else {
                    i10 = this.X;
                }
                if (this.C0) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = org.telegram.messenger.g0.f22608q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.B0 != this.C0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.f45334e.requestLayout();
                    boolean z13 = this.B0;
                    if (z13 != this.C0) {
                        if (z13) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        l0(L);
                    }
                    this.B0 = this.C0;
                }
            }
            if (this.f45328a0 != i3 || this.f45330b0 != z10) {
                this.f45328a0 = i3;
                this.f45330b0 = z10;
                boolean z14 = this.Z;
                org.telegram.ui.Cells.z5 z5Var = this.f45332c0;
                if (z5Var != null) {
                    if (z5Var.getEditField().isFocused() && this.T.c() && i3 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Z = z12;
                } else {
                    this.Z = false;
                }
                if (this.Z && this.Q) {
                    v0(0);
                }
                if (this.W != 0 && !(z11 = this.Z) && z11 != z14 && !this.Q) {
                    this.W = 0;
                    this.T.a();
                    this.f45334e.requestLayout();
                }
                if (this.Z && this.U) {
                    this.U = false;
                    org.telegram.messenger.g0.r(this.f45362z0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i3;
        int i10;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i11, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28292z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f45335e0;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.J) {
                i10 = 2131744116;
            } else {
                i10 = 2131744084;
            }
            kVar2.setTitle(org.telegram.messenger.bd.M0(i10, null));
        } else if (this.O == 1) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748272, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748273, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new xq0(this));
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        if (z10) {
            if (this.J) {
                i3 = 2131744117;
            } else {
                i3 = 2131744085;
            }
            upperCase = org.telegram.messenger.bd.M0(i3, null);
        } else {
            upperCase = org.telegram.messenger.bd.M0(2131751753, null).toUpperCase();
        }
        this.f45327a = q10.e(1, upperCase);
        this.f45329b = new dr0(this, context);
        wc wcVar = new wc(3, context, this);
        this.f45334e = wcVar;
        wcVar.setDelegate(this);
        wc wcVar2 = this.f45334e;
        this.fragmentView = wcVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, wcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f45331c = new u51(11, context, null);
        u4.k kVar3 = new u4.k();
        kVar3.f55567m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.xq.h);
        kVar3.n(350L);
        this.f45331c.setItemAnimator(kVar3);
        this.f45331c.setVerticalScrollBarEnabled(false);
        ((u4.k) this.f45331c.getItemAnimator()).C = false;
        u4.b0 b0Var = new u4.b0(1, false);
        this.d = b0Var;
        this.f45331c.setLayoutManager(b0Var);
        new u4.y(new fi.c(this, 9)).h(this.f45331c);
        frameLayout.addView(this.f45331c, b8.mf.e(-1, -1, 51));
        this.f45331c.setAdapter(this.f45329b);
        this.f45331c.setOnItemClickListener(new h(this, 23));
        this.f45331c.setOnScrollListener(new h3(this, 24));
        org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(context, 4);
        this.h = u20Var;
        u20Var.setText(org.telegram.messenger.bd.M0(2131747163, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f45333d0) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
            org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, this.currentAccount, null, this.resourceProvider);
            this.R = ow0Var;
            ow0Var.E = true;
            ow0Var.F = true;
            ow0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.R, b8.mf.e(-2, 160, 51));
        }
        this.T = new gi.p3(this.f45334e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.ui.Components.ey eyVar = this.S;
            if (eyVar != null) {
                eyVar.Q.g1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f45332c0;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.f45332c0.getEditField().setTextColor(-1);
                this.f45332c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f45339h0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().I0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
            if (this.actionBar.v()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28236w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i3;
        org.telegram.ui.Components.ow0 ow0Var = this.R;
        if (ow0Var != null) {
            ow0Var.setDelegate(null);
            this.R.f();
        }
        int i10 = this.E;
        this.f45358x[i10] = false;
        int i11 = i10 + 1;
        this.E = i11;
        if (this.f45349r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f45349r;
                if (i12 < iArr2.length) {
                    i3 = iArr2[i12];
                } else {
                    i3 = this.f45351s + 1;
                    this.f45351s = i3;
                }
                iArr[i12] = i3;
            }
            this.f45349r = iArr;
        }
        if (this.E == this.f45356w.length) {
            this.f45329b.s(this.f45347p0);
        }
        this.f45329b.i(this.f45347p0);
        w0();
        this.f45338g0 = false;
        this.f45339h0 = (this.f45346o0 + this.E) - 1;
        this.f45329b.g(this.f45348q0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new of(this, f10, 3));
        ofFloat.addListener(new yq0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
        ofFloat.start();
    }

    public final boolean m0(boolean z10) {
        int i3;
        int i10;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f45356w;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.E, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.J && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.an.d0(this.F))) || i11 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (!TextUtils.equals(charSequenceArr[i13].toString(), todoList.list.get(i13).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.an.d0(this.F));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.E && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.an.d0(charSequenceArr[i14]))); i14++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f45335e0;
            if (z14) {
                i3 = 2131752567;
            } else {
                i3 = 2131752573;
            }
            String M0 = org.telegram.messenger.bd.M0(i3, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (z14) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            s1Var.U = org.telegram.messenger.bd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new ci0(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            showDialog(s1Var);
        }
        return z13;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fr0.n0():void");
    }

    public final void o0() {
        if (this.C0) {
            this.S.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.S.setLayoutParams(layoutParams);
            this.W = layoutParams.height;
            this.B0 = this.C0;
            this.C0 = false;
            l0(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.Q) {
            if (z10) {
                p0(true);
                return false;
            }
            return false;
        }
        return m0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f45338g0 && this.f45339h0 >= 0) {
            int i3 = 0;
            while (true) {
                if (i3 < this.f45331c.getChildCount()) {
                    view = this.f45331c.getChildAt(i3);
                    this.f45331c.getClass();
                    if (RecyclerView.R(view) == this.f45339h0) {
                        break;
                    }
                    i3++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.messenger.g0.i3(new og(((org.telegram.ui.Cells.z5) view).getTextView(), 5), 300L);
                this.f45339h0 = -1;
            }
            this.f45338g0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.V = true;
        if (this.f45333d0) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
            org.telegram.ui.Components.ey eyVar = this.S;
            if (eyVar != null) {
                this.f45334e.removeView(eyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f45333d0) {
            p0(false);
            org.telegram.ui.Components.ow0 ow0Var = this.R;
            if (ow0Var != null) {
                ow0Var.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f45332c0;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.f45332c0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f45332c0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dr0 dr0Var = this.f45329b;
        if (dr0Var != null) {
            dr0Var.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        ai.z zVar;
        float f10;
        super.onThemeColorsChanged();
        try {
            u51 u51Var = this.f45331c;
            if (u51Var != null) {
                for (int i10 = 0; i10 < u51Var.getChildCount(); i10++) {
                    View childAt = u51Var.getChildAt(i10);
                    u4.d1 T = u51Var.T(childAt);
                    if (T != null && (((i3 = T.f55544f) == 4 || i3 == 5) && (childAt instanceof org.telegram.ui.Cells.z5) && (zVar = ((org.telegram.ui.Cells.z5) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                        if (zVar.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.6f;
                        }
                        zVar.setTextColor(org.telegram.ui.ActionBar.k6.r1(f10, themedColor));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.f45333d0) {
            if (this.Q) {
                org.telegram.ui.Components.ey eyVar = this.S;
                eyVar.Q.C0();
                eyVar.J.scrollTo(0, 0);
                eyVar.E(1);
                eyVar.R.h1(0, 0);
                this.S.t(false);
                if (z10) {
                    this.S.A();
                }
                this.C0 = false;
                v0(0);
            }
            if (z10) {
                org.telegram.ui.Components.ey eyVar2 = this.S;
                if (eyVar2 != null && eyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                    ofFloat.addUpdateListener(new wq0(this, 1));
                    ofFloat.addListener(new yq0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.ey eyVar;
        org.telegram.ui.Components.hg emojiButton;
        if (!this.Q && (eyVar = this.S) != null && eyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.f45332c0;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.fg.f33793e, false);
            }
            this.S.setVisibility(8);
        }
        int i3 = this.W;
        this.W = 0;
        if (i3 != 0) {
            this.T.a();
        }
    }

    public final void r0() {
        int i3;
        this.T.f13361e = true;
        EditTextBoldCursor editField = this.f45332c0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        if (org.telegram.messenger.g0.D) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        v0(i3);
        if (!org.telegram.messenger.g0.D && !this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.U = true;
            o4 o4Var = this.f45362z0;
            org.telegram.messenger.g0.r(o4Var);
            org.telegram.messenger.g0.i3(o4Var, 100L);
        }
    }

    public final void s0(zf zfVar) {
        this.f45337f0 = zfVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10) {
        u0(messageMedia, z10, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z10, int i3) {
        int i10;
        int i11;
        this.A0 = messageMedia;
        this.J = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.F = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m10;
            Spannable C5 = org.telegram.messenger.zi.C5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = C5;
            org.telegram.messenger.zi.b(C5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.f45360y = size;
            this.f45351s = 0;
            this.f45349r = new int[size];
            int i12 = 0;
            while (true) {
                i10 = this.E;
                if (i12 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f45356w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.i6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.zi.C5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.zi.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f45349r[i12] = tL_messageMediaToDo.todo.list.get(i12).f27148id;
                this.f45351s = Math.max(this.f45351s, this.f45349r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i10 + 1;
                w0();
                this.f45338g0 = true;
                int i13 = this.f45346o0;
                if (i3 < 0) {
                    i11 = this.E - 1;
                } else {
                    i11 = i3;
                }
                this.f45339h0 = i13 + i11;
            }
        }
    }

    public final void v0(int i3) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.z5 z5Var;
        if (this.f45333d0) {
            if (i3 == 1) {
                org.telegram.ui.Components.ey eyVar = this.S;
                if (eyVar != null && eyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.ey eyVar2 = this.S;
                if (eyVar2 != null && eyVar2.f33529d1 != org.telegram.messenger.h10.f22829t0) {
                    this.f45334e.removeView(eyVar2);
                    this.S = null;
                }
                if (this.S == null) {
                    org.telegram.ui.Components.ey eyVar3 = new org.telegram.ui.Components.ey(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.S = eyVar3;
                    eyVar3.f33598y2 = false;
                    eyVar3.V0 = false;
                    eyVar3.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.S.setForseMultiwindowLayout(true);
                    }
                    this.S.setDelegate(new zq0(this));
                    this.f45334e.addView(this.S);
                }
                this.S.setVisibility(0);
                this.Q = true;
                org.telegram.ui.Components.ey eyVar4 = this.S;
                if (this.X <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.X = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.Y <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.Y = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.Y = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i10 = this.Y;
                } else {
                    i10 = this.X;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eyVar4.getLayoutParams();
                layoutParams.height = i10;
                eyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (z5Var = this.f45332c0) != null) {
                    org.telegram.messenger.g0.v1(z5Var.getEditField());
                }
                this.W = i10;
                this.T.a();
                this.f45334e.requestLayout();
                org.telegram.ui.Components.hg emojiButton = this.f45332c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.fg.d, true);
                }
                if (!z10 && !this.Z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
                    ofFloat.addUpdateListener(new wq0(this, 0));
                    ofFloat.addListener(new yq0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.hg emojiButton2 = this.f45332c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.fg.f33793e, true);
            }
            org.telegram.ui.Components.ey eyVar5 = this.S;
            if (eyVar5 != null) {
                this.Q = false;
                this.C0 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    eyVar5.setVisibility(8);
                }
            }
            if (i3 == 0) {
                this.W = 0;
            }
            this.T.a();
            this.f45334e.requestLayout();
        }
    }

    public final void w0() {
        this.f45340i0 = -1;
        this.f45341j0 = -1;
        this.m0 = -1;
        this.f45345n0 = -1;
        this.f45342k0 = -1;
        this.f45343l0 = -1;
        this.f45346o0 = -1;
        this.f45347p0 = -1;
        this.f45352s0 = -1;
        this.f45353t0 = -1;
        this.f45355v0 = -1;
        this.f45357w0 = -1;
        this.f45354u0 = -1;
        this.f45359x0 = -1;
        this.f45350r0 = -1;
        this.f45361y0 = 0;
        boolean z10 = this.f45335e0;
        if (!z10 || !this.J) {
            this.f45340i0 = 0;
            this.f45341j0 = 1;
            this.m0 = 2;
            this.f45361y0 = 4;
            this.f45345n0 = 3;
        }
        int i3 = this.E;
        if (i3 != 0) {
            int i10 = this.f45361y0;
            this.f45346o0 = i10;
            this.f45361y0 = i10 + i3;
        }
        if (i3 != this.f45356w.length) {
            int i11 = this.f45361y0;
            this.f45361y0 = i11 + 1;
            this.f45347p0 = i11;
        }
        int i12 = this.f45361y0;
        int i13 = i12 + 1;
        this.f45361y0 = i13;
        this.f45348q0 = i12;
        if (!z10 || !this.J) {
            int i14 = i12 + 2;
            this.f45361y0 = i14;
            this.f45350r0 = i13;
            if (z10) {
                int i15 = i12 + 3;
                this.f45361y0 = i15;
                this.f45357w0 = i14;
                if (this.K) {
                    this.f45361y0 = i12 + 4;
                    this.f45355v0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f45336f.f51292e;
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i16 = this.f45361y0;
                this.f45361y0 = i16 + 1;
                this.f45352s0 = i16;
            }
            int i17 = this.O;
            if (i17 != 1) {
                int i18 = this.f45361y0;
                this.f45361y0 = i18 + 1;
                this.f45353t0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f45361y0;
                this.f45361y0 = i19 + 1;
                this.f45354u0 = i19;
            }
            int i20 = this.f45361y0;
            int i21 = i20 + 1;
            this.f45361y0 = i21;
            this.f45359x0 = i20;
            if (this.M) {
                this.f45342k0 = i21;
                this.f45361y0 = i20 + 3;
                this.f45343l0 = i20 + 2;
            }
        }
    }
}
