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
public final class pr0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.bu0 {
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
    public org.telegram.ui.Components.zw0 R;
    public org.telegram.ui.Components.qy S;
    public hi.x3 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.q0 f51099a;
    public int f51100a0;
    public nr0 f51101b;
    public boolean f51102b0;
    public d61 f51103c;
    public org.telegram.ui.Cells.a6 f51104c0;
    public v4.c0 d;
    public final boolean f51105d0;
    public wc f51106e;
    public final boolean f51107e0;
    public final bn f51108f;
    public or0 f51109f0;
    public boolean f51110g0;
    public org.telegram.ui.Components.j30 h;
    public int f51111h0;
    public int f51112i0;
    public int f51113j0;
    public int f51114k0;
    public int f51115l0;
    public int m0;
    public final int f51116n;
    public int f51117n0;
    public int f51118o0;
    public int f51119p0;
    public int f51120q0;
    public int[] f51121r;
    public int f51122r0;
    public int f51123s;
    public int f51124s0;
    public int f51125t0;
    public int f51126u0;
    public int f51127v0;
    public final CharSequence[] f51128w;
    public int f51129w0;
    public final boolean[] f51130x;
    public int f51131x0;
    public int f51132y;
    public int f51133y0;
    public final m4 f51134z0;

    public pr0(bn bnVar) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = org.telegram.messenger.g0.L(3.0f);
        this.f51111h0 = -1;
        this.f51134z0 = new m4(this, 14);
        this.f51107e0 = true;
        int i7 = getMessagesController().U6;
        this.f51116n = i7;
        this.f51128w = new CharSequence[i7];
        this.f51130x = new boolean[i7];
        this.f51108f = bnVar;
        this.f51105d0 = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(this.currentAccount).f23343a).q();
        this.M = false;
        this.O = 2;
    }

    public static void h0(pr0 pr0Var, View view, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = pr0Var.f51107e0;
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            if (i7 == pr0Var.f51113j0) {
                if (z10) {
                    i13 = pr0Var.getMessagesController().V6;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = pr0Var.F;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i7 == pr0Var.f51114k0) {
                Editable editable = pr0Var.G;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = pr0Var.f51118o0;
                if (i7 >= i17 && i7 < pr0Var.E + i17) {
                    int i18 = i7 - i17;
                    if (z10) {
                        i10 = pr0Var.getMessagesController().W6;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = pr0Var.f51128w[i18];
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
                org.telegram.ui.ActionBar.n5 textView2 = a6Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.n6.f29672p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.n6.A6;
                }
                org.telegram.ui.ActionBar.u6.X(textView2, i15, null);
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            a6Var.setText2("");
        }
    }

    public static void i0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        if (pr0Var.f51105d0 && z10) {
            if (pr0Var.f51104c0 == a6Var && pr0Var.Q && pr0Var.C0) {
                pr0Var.o0();
                pr0Var.Q = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = pr0Var.f51104c0;
            pr0Var.f51104c0 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.zg emojiButton = a6Var.getEmojiButton();
            org.telegram.ui.Components.xg xgVar = org.telegram.ui.Components.xg.f41996e;
            emojiButton.j(xgVar, false);
            d61 d61Var = pr0Var.f51103c;
            View F = d61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = d61Var.T(F);
            }
            org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
            if (zw0Var != null) {
                zw0Var.f();
                org.telegram.ui.Components.zw0 zw0Var2 = pr0Var.R;
                if (zw0Var2 != null && T != null) {
                    View view = T.f59245a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && zw0Var2.getDelegate() != view) {
                        pr0Var.R.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (pr0Var.Q) {
                    pr0Var.o0();
                    pr0Var.p0(false);
                    pr0Var.r0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(xgVar, false);
            }
        }
    }

    public static void j0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var) {
        pr0Var.f51104c0 = a6Var;
        if (pr0Var.Q) {
            pr0Var.o0();
            pr0Var.r0();
            return;
        }
        pr0Var.v0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.f51105d0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.Y = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.X).commit();
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
                int i12 = org.telegram.messenger.g0.f24226q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.B0 != this.C0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.f51106e.requestLayout();
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
            if (this.f51100a0 != i7 || this.f51102b0 != z10) {
                this.f51100a0 = i7;
                this.f51102b0 = z10;
                boolean z14 = this.Z;
                org.telegram.ui.Cells.a6 a6Var = this.f51104c0;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && this.T.c() && i7 > 0) {
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
                    this.f51106e.requestLayout();
                }
                if (this.Z && this.U) {
                    this.U = false;
                    org.telegram.messenger.g0.r(this.f51134z0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(kVar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.u6.b(this.actionBar, i11, getResourceProvider(), true);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29864z8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231243);
        boolean z10 = this.f51107e0;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.J) {
                i10 = 2131743861;
            } else {
                i10 = 2131743829;
            }
            kVar2.setTitle(org.telegram.messenger.gd.N0(i10, null));
        } else if (this.O == 1) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748071, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748072, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hr0(this));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (z10) {
            if (this.J) {
                i7 = 2131743862;
            } else {
                i7 = 2131743830;
            }
            upperCase = org.telegram.messenger.gd.N0(i7, null);
        } else {
            upperCase = org.telegram.messenger.gd.N0(2131751741, null).toUpperCase();
        }
        this.f51099a = s5.e(1, upperCase);
        this.f51101b = new nr0(this, context);
        wc wcVar = new wc(3, context, this);
        this.f51106e = wcVar;
        wcVar.setDelegate(this);
        wc wcVar2 = this.f51106e;
        this.fragmentView = wcVar2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, wcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f51103c = new d61(12, context, null);
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.n(350L);
        this.f51103c.setItemAnimator(lVar);
        this.f51103c.setVerticalScrollBarEnabled(false);
        ((v4.l) this.f51103c.getItemAnimator()).C = false;
        v4.c0 c0Var = new v4.c0(1, false);
        this.d = c0Var;
        this.f51103c.setLayoutManager(c0Var);
        new v4.z(new gi.c(this, 9)).h(this.f51103c);
        frameLayout.addView(this.f51103c, c8.na.e(-1, -1, 51));
        this.f51103c.setAdapter(this.f51101b);
        this.f51103c.setOnItemClickListener(new h(this, 23));
        this.f51103c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(context, 4);
        this.h = j30Var;
        j30Var.setText(org.telegram.messenger.gd.N0(2131746961, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f51105d0) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.currentAccount, null, this.resourceProvider);
            this.R = zw0Var;
            zw0Var.E = true;
            zw0Var.F = true;
            zw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.R, c8.na.e(-2, 160, 51));
        }
        this.T = new hi.x3(this.f51106e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            org.telegram.ui.Components.qy qyVar = this.S;
            if (qyVar != null) {
                qyVar.Q.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f51104c0;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f51104c0.getEditField().setTextColor(-1);
                this.f51104c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f51111h0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
            if (this.actionBar.x()) {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29807w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.zw0 zw0Var = this.R;
        if (zw0Var != null) {
            zw0Var.setDelegate(null);
            this.R.f();
        }
        int i10 = this.E;
        this.f51130x[i10] = false;
        int i11 = i10 + 1;
        this.E = i11;
        if (this.f51121r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f51121r;
                if (i12 < iArr2.length) {
                    i7 = iArr2[i12];
                } else {
                    i7 = this.f51123s + 1;
                    this.f51123s = i7;
                }
                iArr[i12] = i7;
            }
            this.f51121r = iArr;
        }
        if (this.E == this.f51128w.length) {
            this.f51101b.s(this.f51119p0);
        }
        this.f51101b.i(this.f51119p0);
        w0();
        this.f51110g0 = false;
        this.f51111h0 = (this.f51118o0 + this.E) - 1;
        this.f51101b.g(this.f51120q0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new rf(this, f10, 5));
        ofFloat.addListener(new ir0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
        ofFloat.start();
    }

    public final boolean m0(boolean z10) {
        int i7;
        int i10;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f51128w;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.E, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.J && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.qn.d0(this.F))) || i11 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.qn.d0(this.F));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.E && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.qn.d0(charSequenceArr[i14]))); i14++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f51107e0;
            if (z14) {
                i7 = 2131752555;
            } else {
                i7 = 2131752561;
            }
            String N0 = org.telegram.messenger.gd.N0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (z14) {
                i10 = 2131752556;
            } else {
                i10 = 2131752562;
            }
            t1Var.U = org.telegram.messenger.gd.N0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747386, null), new oi0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            showDialog(t1Var);
        }
        return z13;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr0.n0():void");
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
        if (this.f51110g0 && this.f51111h0 >= 0) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f51103c.getChildCount()) {
                    view = this.f51103c.getChildAt(i7);
                    this.f51103c.getClass();
                    if (RecyclerView.R(view) == this.f51111h0) {
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.messenger.g0.h3(new qg(((org.telegram.ui.Cells.a6) view).getTextView(), 5), 300L);
                this.f51111h0 = -1;
            }
            this.f51110g0 = false;
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
        if (this.f51105d0) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
            org.telegram.ui.Components.qy qyVar = this.S;
            if (qyVar != null) {
                this.f51106e.removeView(qyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f51105d0) {
            p0(false);
            org.telegram.ui.Components.zw0 zw0Var = this.R;
            if (zw0Var != null) {
                zw0Var.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f51104c0;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f51104c0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f51104c0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        nr0 nr0Var = this.f51101b;
        if (nr0Var != null) {
            nr0Var.f();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        bi.u uVar;
        float f10;
        super.onThemeColorsChanged();
        try {
            d61 d61Var = this.f51103c;
            if (d61Var != null) {
                for (int i10 = 0; i10 < d61Var.getChildCount(); i10++) {
                    View childAt = d61Var.getChildAt(i10);
                    v4.f1 T = d61Var.T(childAt);
                    if (T != null && (((i7 = T.f59249f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.a6) && (uVar = ((org.telegram.ui.Cells.a6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.G6);
                        if (uVar.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.6f;
                        }
                        uVar.setTextColor(org.telegram.ui.ActionBar.n6.r1(f10, themedColor));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.f51105d0) {
            if (this.Q) {
                org.telegram.ui.Components.qy qyVar = this.S;
                qyVar.Q.C0();
                qyVar.J.scrollTo(0, 0);
                qyVar.E(1);
                qyVar.R.h1(0, 0);
                this.S.t(false);
                if (z10) {
                    this.S.A();
                }
                this.C0 = false;
                v0(0);
            }
            if (z10) {
                org.telegram.ui.Components.qy qyVar2 = this.S;
                if (qyVar2 != null && qyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                    ofFloat.addUpdateListener(new gr0(this, 1));
                    ofFloat.addListener(new ir0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.qy qyVar;
        org.telegram.ui.Components.zg emojiButton;
        if (!this.Q && (qyVar = this.S) != null && qyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f51104c0;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.xg.f41996e, false);
            }
            this.S.setVisibility(8);
        }
        int i7 = this.W;
        this.W = 0;
        if (i7 != 0) {
            this.T.a();
        }
    }

    public final void r0() {
        int i7;
        this.T.f15711e = true;
        EditTextBoldCursor editField = this.f51104c0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.I3(editField);
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        v0(i7);
        if (!org.telegram.messenger.g0.D && !this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.U = true;
            m4 m4Var = this.f51134z0;
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.h3(m4Var, 100L);
        }
    }

    public final void s0(ag agVar) {
        this.f51109f0 = agVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10) {
        u0(messageMedia, z10, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z10, int i7) {
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
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m10;
            Spannable B5 = org.telegram.messenger.fj.B5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = B5;
            org.telegram.messenger.fj.b(B5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.f51132y = size;
            this.f51123s = 0;
            this.f51121r = new int[size];
            int i12 = 0;
            while (true) {
                i10 = this.E;
                if (i12 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f51128w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.j6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.fj.B5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.fj.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f51121r[i12] = tL_messageMediaToDo.todo.list.get(i12).f28639id;
                this.f51123s = Math.max(this.f51123s, this.f51121r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i10 + 1;
                w0();
                this.f51110g0 = true;
                int i13 = this.f51118o0;
                if (i7 < 0) {
                    i11 = this.E - 1;
                } else {
                    i11 = i7;
                }
                this.f51111h0 = i13 + i11;
            }
        }
    }

    public final void v0(int i7) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.f51105d0) {
            if (i7 == 1) {
                org.telegram.ui.Components.qy qyVar = this.S;
                if (qyVar != null && qyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.qy qyVar2 = this.S;
                if (qyVar2 != null && qyVar2.f39047d1 != org.telegram.messenger.i10.f24637t0) {
                    this.f51106e.removeView(qyVar2);
                    this.S = null;
                }
                if (this.S == null) {
                    org.telegram.ui.Components.qy qyVar3 = new org.telegram.ui.Components.qy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.S = qyVar3;
                    qyVar3.f39115y2 = false;
                    qyVar3.V0 = false;
                    qyVar3.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.S.setForseMultiwindowLayout(true);
                    }
                    this.S.setDelegate(new jr0(this));
                    this.f51106e.addView(this.S);
                }
                this.S.setVisibility(0);
                this.Q = true;
                org.telegram.ui.Components.qy qyVar4 = this.S;
                if (this.X <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.X = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.Y <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.Y = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.Y = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i10 = this.Y;
                } else {
                    i10 = this.X;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar4.getLayoutParams();
                layoutParams.height = i10;
                qyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f51104c0) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.W = i10;
                this.T.a();
                this.f51106e.requestLayout();
                org.telegram.ui.Components.zg emojiButton = this.f51104c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.xg.d, true);
                }
                if (!z10 && !this.Z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
                    ofFloat.addUpdateListener(new gr0(this, 0));
                    ofFloat.addListener(new ir0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.zg emojiButton2 = this.f51104c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.xg.f41996e, true);
            }
            org.telegram.ui.Components.qy qyVar5 = this.S;
            if (qyVar5 != null) {
                this.Q = false;
                this.C0 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    qyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.W = 0;
            }
            this.T.a();
            this.f51106e.requestLayout();
        }
    }

    public final void w0() {
        this.f51112i0 = -1;
        this.f51113j0 = -1;
        this.m0 = -1;
        this.f51117n0 = -1;
        this.f51114k0 = -1;
        this.f51115l0 = -1;
        this.f51118o0 = -1;
        this.f51119p0 = -1;
        this.f51124s0 = -1;
        this.f51125t0 = -1;
        this.f51127v0 = -1;
        this.f51129w0 = -1;
        this.f51126u0 = -1;
        this.f51131x0 = -1;
        this.f51122r0 = -1;
        this.f51133y0 = 0;
        boolean z10 = this.f51107e0;
        if (!z10 || !this.J) {
            this.f51112i0 = 0;
            this.f51113j0 = 1;
            this.m0 = 2;
            this.f51133y0 = 4;
            this.f51117n0 = 3;
        }
        int i7 = this.E;
        if (i7 != 0) {
            int i10 = this.f51133y0;
            this.f51118o0 = i10;
            this.f51133y0 = i10 + i7;
        }
        if (i7 != this.f51128w.length) {
            int i11 = this.f51133y0;
            this.f51133y0 = i11 + 1;
            this.f51119p0 = i11;
        }
        int i12 = this.f51133y0;
        int i13 = i12 + 1;
        this.f51133y0 = i13;
        this.f51120q0 = i12;
        if (!z10 || !this.J) {
            int i14 = i12 + 2;
            this.f51133y0 = i14;
            this.f51122r0 = i13;
            if (z10) {
                int i15 = i12 + 3;
                this.f51133y0 = i15;
                this.f51129w0 = i14;
                if (this.K) {
                    this.f51133y0 = i12 + 4;
                    this.f51127v0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f51108f.f46173e;
            if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                int i16 = this.f51133y0;
                this.f51133y0 = i16 + 1;
                this.f51124s0 = i16;
            }
            int i17 = this.O;
            if (i17 != 1) {
                int i18 = this.f51133y0;
                this.f51133y0 = i18 + 1;
                this.f51125t0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f51133y0;
                this.f51133y0 = i19 + 1;
                this.f51126u0 = i19;
            }
            int i20 = this.f51133y0;
            int i21 = i20 + 1;
            this.f51133y0 = i21;
            this.f51131x0 = i20;
            if (this.M) {
                this.f51114k0 = i21;
                this.f51133y0 = i20 + 3;
                this.f51115l0 = i20 + 2;
            }
        }
    }
}
