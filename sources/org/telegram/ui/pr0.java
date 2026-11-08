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
public final class pr0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.qt0 {
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
    public org.telegram.ui.Components.ow0 Q;
    public org.telegram.ui.Components.hy R;
    public fi.q3 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.r0 f48915a;
    public boolean f48916a0;
    public nr0 f48917b;
    public org.telegram.ui.Cells.a6 f48918b0;
    public e61 f48919c;
    public final boolean f48920c0;
    public v4.b0 d;
    public final boolean f48921d0;
    public xc f48922e;
    public or0 f48923e0;
    public final an f48924f;
    public boolean f48925f0;
    public int f48926g0;
    public org.telegram.ui.Components.y20 h;
    public int f48927h0;
    public int f48928i0;
    public int f48929j0;
    public int f48930k0;
    public int f48931l0;
    public int m0;
    public final int f48932n;
    public int f48933n0;
    public int f48934o0;
    public int f48935p0;
    public int f48936q0;
    public int[] f48937r;
    public int f48938r0;
    public int f48939s;
    public int f48940s0;
    public int f48941t0;
    public int f48942u0;
    public int f48943v0;
    public final CharSequence[] f48944w;
    public int f48945w0;
    public final boolean[] f48946x;
    public int f48947x0;
    public int f48948y;
    public final m4 f48949y0;
    public TLRPC.MessageMedia f48950z0;

    public pr0(an anVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.g0.L(3.0f);
        this.f48926g0 = -1;
        this.f48949y0 = new m4(this, 14);
        this.f48921d0 = true;
        int i7 = getMessagesController().R6;
        this.f48932n = i7;
        this.f48944w = new CharSequence[i7];
        this.f48946x = new boolean[i7];
        this.f48924f = anVar;
        this.f48920c0 = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(this.currentAccount).f21765a).q();
        this.L = false;
        this.N = 2;
    }

    public static void h0(pr0 pr0Var, View view, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9 = pr0Var.f48921d0;
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            if (i7 == pr0Var.f48928i0) {
                if (z9) {
                    i13 = pr0Var.getMessagesController().S6;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = pr0Var.E;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i7 == pr0Var.f48929j0) {
                Editable editable = pr0Var.F;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = pr0Var.f48933n0;
                if (i7 >= i17 && i7 < pr0Var.D + i17) {
                    int i18 = i7 - i17;
                    if (z9) {
                        i10 = pr0Var.getMessagesController().T6;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = pr0Var.f48944w[i18];
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
                a6Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.k5 textView2 = a6Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.k6.f28073p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.k6.A6;
                }
                org.telegram.ui.ActionBar.r6.Y(textView2, i15, null);
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            a6Var.setText2("");
        }
    }

    public static void i0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        if (pr0Var.f48920c0 && z9) {
            if (pr0Var.f48918b0 == a6Var && pr0Var.P && pr0Var.B0) {
                pr0Var.o0();
                pr0Var.P = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = pr0Var.f48918b0;
            pr0Var.f48918b0 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.jg emojiButton = a6Var.getEmojiButton();
            org.telegram.ui.Components.hg hgVar = org.telegram.ui.Components.hg.f34251e;
            emojiButton.j(hgVar, false);
            e61 e61Var = pr0Var.f48919c;
            View F = e61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = e61Var.T(F);
            }
            org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
            if (ow0Var != null) {
                ow0Var.f();
                org.telegram.ui.Components.ow0 ow0Var2 = pr0Var.Q;
                if (ow0Var2 != null && T != null) {
                    View view = T.f57044a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && ow0Var2.getDelegate() != view) {
                        pr0Var.Q.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (pr0Var.P) {
                    pr0Var.o0();
                    pr0Var.p0(false);
                    pr0Var.r0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(hgVar, false);
            }
        }
    }

    public static void j0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var) {
        pr0Var.f48918b0 = a6Var;
        if (pr0Var.P) {
            pr0Var.o0();
            pr0Var.r0();
            return;
        }
        pr0Var.v0(1);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        int L;
        if (this.f48920c0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Y && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z9) {
                    this.X = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z9) {
                    i10 = this.X;
                } else {
                    i10 = this.W;
                }
                if (this.B0) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = org.telegram.messenger.g0.f22563q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.A0 != this.B0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.f48922e.requestLayout();
                    boolean z12 = this.A0;
                    if (z12 != this.B0) {
                        if (z12) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        l0(L);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i7 || this.f48916a0 != z9) {
                this.Z = i7;
                this.f48916a0 = z9;
                boolean z13 = this.Y;
                org.telegram.ui.Cells.a6 a6Var = this.f48918b0;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && this.S.c() && i7 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.Y = z11;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    v0(0);
                }
                if (this.V != 0 && !(z10 = this.Y) && z10 != z13 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.f48922e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    org.telegram.messenger.g0.r(this.f48949y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i11, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28264z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231240);
        boolean z9 = this.f48921d0;
        if (z9) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.I) {
                i10 = 2131744109;
            } else {
                i10 = 2131744077;
            }
            kVar2.setTitle(org.telegram.messenger.id.M0(i10, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748265, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748266, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hr0(this));
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        if (z9) {
            if (this.I) {
                i7 = 2131744110;
            } else {
                i7 = 2131744078;
            }
            upperCase = org.telegram.messenger.id.M0(i7, null);
        } else {
            upperCase = org.telegram.messenger.id.M0(2131751753, null).toUpperCase();
        }
        this.f48915a = q10.e(1, upperCase);
        this.f48917b = new nr0(this, context);
        xc xcVar = new xc(3, context, this);
        this.f48922e = xcVar;
        xcVar.setDelegate(this);
        xc xcVar2 = this.f48922e;
        this.fragmentView = xcVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, xcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f48919c = new e61(12, context, null);
        v4.k kVar3 = new v4.k();
        kVar3.f57071m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.xq.h);
        kVar3.n(350L);
        this.f48919c.setItemAnimator(kVar3);
        this.f48919c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f48919c.getItemAnimator()).C = false;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        this.f48919c.setLayoutManager(b0Var);
        new v4.y(new ei.d(this, 9)).h(this.f48919c);
        frameLayout.addView(this.f48919c, c8.ha.e(-1, -1, 51));
        this.f48919c.setAdapter(this.f48917b);
        this.f48919c.setOnItemClickListener(new h(this, 23));
        this.f48919c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(context, 4);
        this.h = y20Var;
        y20Var.setText(org.telegram.messenger.id.M0(2131747156, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f48920c0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
            org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = ow0Var;
            ow0Var.D = true;
            ow0Var.E = true;
            ow0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.Q, c8.ha.e(-2, 160, 51));
        }
        this.S = new fi.q3(this.f48922e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            org.telegram.ui.Components.hy hyVar = this.R;
            if (hyVar != null) {
                hyVar.P.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f48918b0;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f48918b0.getEditField().setTextColor(-1);
                this.f48918b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f48926g0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false);
            if (this.actionBar.v()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28208w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.ow0 ow0Var = this.Q;
        if (ow0Var != null) {
            ow0Var.setDelegate(null);
            this.Q.f();
        }
        int i10 = this.D;
        this.f48946x[i10] = false;
        int i11 = i10 + 1;
        this.D = i11;
        if (this.f48937r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f48937r;
                if (i12 < iArr2.length) {
                    i7 = iArr2[i12];
                } else {
                    i7 = this.f48939s + 1;
                    this.f48939s = i7;
                }
                iArr[i12] = i7;
            }
            this.f48937r = iArr;
        }
        if (this.D == this.f48944w.length) {
            this.f48917b.s(this.f48934o0);
        }
        this.f48917b.i(this.f48934o0);
        w0();
        this.f48925f0 = false;
        this.f48926g0 = (this.f48933n0 + this.D) - 1;
        this.f48917b.g(this.f48935p0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new sf(this, f10, 3));
        ofFloat.addListener(new ir0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
        ofFloat.start();
    }

    public final boolean m0(boolean z9) {
        int i7;
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f48950z0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f48944w;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.D, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.bn.d0(this.E))) || i11 != todoList.list.size()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (!TextUtils.equals(charSequenceArr[i13].toString(), todoList.list.get(i13).title.text)) {
                        break;
                    }
                }
            }
            z12 = z10;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(this.E));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i14]))); i14++) {
                }
            }
            z12 = isEmpty;
        }
        if (z9 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f48921d0;
            if (z13) {
                i7 = 2131752567;
            } else {
                i7 = 2131752573;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            if (z13) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            u1Var.T = org.telegram.messenger.id.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747581, null), new li0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            showDialog(u1Var);
        }
        return z12;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr0.n0():void");
    }

    public final void o0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            l0(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.P) {
            if (z9) {
                p0(true);
                return false;
            }
            return false;
        }
        return m0(z9);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f48925f0 && this.f48926g0 >= 0) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f48919c.getChildCount()) {
                    view = this.f48919c.getChildAt(i7);
                    this.f48919c.getClass();
                    if (RecyclerView.R(view) == this.f48926g0) {
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.messenger.g0.i3(new sg(((org.telegram.ui.Cells.a6) view).getTextView(), 5), 300L);
                this.f48926g0 = -1;
            }
            this.f48925f0 = false;
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
        this.U = true;
        if (this.f48920c0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
            org.telegram.ui.Components.hy hyVar = this.R;
            if (hyVar != null) {
                this.f48922e.removeView(hyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f48920c0) {
            p0(false);
            org.telegram.ui.Components.ow0 ow0Var = this.Q;
            if (ow0Var != null) {
                ow0Var.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f48918b0;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f48918b0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f48918b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        nr0 nr0Var = this.f48917b;
        if (nr0Var != null) {
            nr0Var.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        org.telegram.ui.Cells.z5 z5Var;
        float f10;
        super.onThemeColorsChanged();
        try {
            e61 e61Var = this.f48919c;
            if (e61Var != null) {
                for (int i10 = 0; i10 < e61Var.getChildCount(); i10++) {
                    View childAt = e61Var.getChildAt(i10);
                    v4.d1 T = e61Var.T(childAt);
                    if (T != null && (((i7 = T.f57048f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.a6) && (z5Var = ((org.telegram.ui.Cells.a6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                        if (z5Var.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.6f;
                        }
                        z5Var.setTextColor(org.telegram.ui.ActionBar.k6.r1(f10, themedColor));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.f48920c0) {
            if (this.P) {
                org.telegram.ui.Components.hy hyVar = this.R;
                hyVar.P.C0();
                hyVar.I.scrollTo(0, 0);
                hyVar.E(1);
                hyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z9) {
                    this.R.A();
                }
                this.B0 = false;
                v0(0);
            }
            if (z9) {
                org.telegram.ui.Components.hy hyVar2 = this.R;
                if (hyVar2 != null && hyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new gr0(this, 1));
                    ofFloat.addListener(new ir0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.hy hyVar;
        org.telegram.ui.Components.jg emojiButton;
        if (!this.P && (hyVar = this.R) != null && hyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f48918b0;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.hg.f34251e, false);
            }
            this.R.setVisibility(8);
        }
        int i7 = this.V;
        this.V = 0;
        if (i7 != 0) {
            this.S.a();
        }
    }

    public final void r0() {
        int i7;
        this.S.f12652e = true;
        EditTextBoldCursor editField = this.f48918b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        v0(i7);
        if (!org.telegram.messenger.g0.D && !this.Y && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.T = true;
            m4 m4Var = this.f48949y0;
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.i3(m4Var, 100L);
        }
    }

    public final void s0(dg dgVar) {
        this.f48923e0 = dgVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z9) {
        u0(messageMedia, z9, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z9, int i7) {
        int i10;
        int i11;
        this.f48950z0 = messageMedia;
        this.I = z9;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable C5 = org.telegram.messenger.ij.C5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = C5;
            org.telegram.messenger.ij.b(C5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.f48948y = size;
            this.f48939s = 0;
            this.f48937r = new int[size];
            int i12 = 0;
            while (true) {
                i10 = this.D;
                if (i12 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f48944w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.i6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.ij.C5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.ij.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f48937r[i12] = tL_messageMediaToDo.todo.list.get(i12).f27103id;
                this.f48939s = Math.max(this.f48939s, this.f48937r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i10 + 1;
                w0();
                this.f48925f0 = true;
                int i13 = this.f48933n0;
                if (i7 < 0) {
                    i11 = this.D - 1;
                } else {
                    i11 = i7;
                }
                this.f48926g0 = i13 + i11;
            }
        }
    }

    public final void v0(int i7) {
        boolean z9;
        int i10;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.f48920c0) {
            if (i7 == 1) {
                org.telegram.ui.Components.hy hyVar = this.R;
                if (hyVar != null && hyVar.getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.hy hyVar2 = this.R;
                if (hyVar2 != null && hyVar2.f34400c1 != org.telegram.messenger.p10.f24470s0) {
                    this.f48922e.removeView(hyVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.hy hyVar3 = new org.telegram.ui.Components.hy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = hyVar3;
                    hyVar3.f34467x2 = false;
                    hyVar3.U0 = false;
                    hyVar3.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new jr0(this));
                    this.f48922e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.hy hyVar4 = this.R;
                if (this.W <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.W = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.W = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.X = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i10 = this.X;
                } else {
                    i10 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hyVar4.getLayoutParams();
                layoutParams.height = i10;
                hyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f48918b0) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.V = i10;
                this.S.a();
                this.f48922e.requestLayout();
                org.telegram.ui.Components.jg emojiButton = this.f48918b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.hg.d, true);
                }
                if (!z9 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new gr0(this, 0));
                    ofFloat.addListener(new ir0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.jg emojiButton2 = this.f48918b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.hg.f34251e, true);
            }
            org.telegram.ui.Components.hy hyVar5 = this.R;
            if (hyVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    hyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.f48922e.requestLayout();
        }
    }

    public final void w0() {
        this.f48927h0 = -1;
        this.f48928i0 = -1;
        this.f48931l0 = -1;
        this.m0 = -1;
        this.f48929j0 = -1;
        this.f48930k0 = -1;
        this.f48933n0 = -1;
        this.f48934o0 = -1;
        this.f48938r0 = -1;
        this.f48940s0 = -1;
        this.f48942u0 = -1;
        this.f48943v0 = -1;
        this.f48941t0 = -1;
        this.f48945w0 = -1;
        this.f48936q0 = -1;
        this.f48947x0 = 0;
        boolean z9 = this.f48921d0;
        if (!z9 || !this.I) {
            this.f48927h0 = 0;
            this.f48928i0 = 1;
            this.f48931l0 = 2;
            this.f48947x0 = 4;
            this.m0 = 3;
        }
        int i7 = this.D;
        if (i7 != 0) {
            int i10 = this.f48947x0;
            this.f48933n0 = i10;
            this.f48947x0 = i10 + i7;
        }
        if (i7 != this.f48944w.length) {
            int i11 = this.f48947x0;
            this.f48947x0 = i11 + 1;
            this.f48934o0 = i11;
        }
        int i12 = this.f48947x0;
        int i13 = i12 + 1;
        this.f48947x0 = i13;
        this.f48935p0 = i12;
        if (!z9 || !this.I) {
            int i14 = i12 + 2;
            this.f48947x0 = i14;
            this.f48936q0 = i13;
            if (z9) {
                int i15 = i12 + 3;
                this.f48947x0 = i15;
                this.f48943v0 = i14;
                if (this.J) {
                    this.f48947x0 = i12 + 4;
                    this.f48942u0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f48924f.f43777e;
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i16 = this.f48947x0;
                this.f48947x0 = i16 + 1;
                this.f48938r0 = i16;
            }
            int i17 = this.N;
            if (i17 != 1) {
                int i18 = this.f48947x0;
                this.f48947x0 = i18 + 1;
                this.f48940s0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f48947x0;
                this.f48947x0 = i19 + 1;
                this.f48941t0 = i19;
            }
            int i20 = this.f48947x0;
            int i21 = i20 + 1;
            this.f48947x0 = i21;
            this.f48945w0 = i20;
            if (this.L) {
                this.f48929j0 = i21;
                this.f48947x0 = i20 + 3;
                this.f48930k0 = i20 + 2;
            }
        }
    }
}
