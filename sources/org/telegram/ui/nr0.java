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
public final class nr0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.rt0 {
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
    public org.telegram.ui.Components.rw0 R;
    public org.telegram.ui.Components.ly S;
    public hi.p3 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.q0 f49604a;
    public int f49605a0;
    public lr0 f49606b;
    public boolean f49607b0;
    public b61 f49608c;
    public org.telegram.ui.Cells.z5 f49609c0;
    public v4.b0 d;
    public final boolean f49610d0;
    public wc f49611e;
    public final boolean f49612e0;
    public final an f49613f;
    public mr0 f49614f0;
    public boolean f49615g0;
    public org.telegram.ui.Components.b30 h;
    public int f49616h0;
    public int f49617i0;
    public int f49618j0;
    public int f49619k0;
    public int f49620l0;
    public int m0;
    public final int f49621n;
    public int f49622n0;
    public int f49623o0;
    public int f49624p0;
    public int f49625q0;
    public int[] f49626r;
    public int f49627r0;
    public int f49628s;
    public int f49629s0;
    public int f49630t0;
    public int f49631u0;
    public int f49632v0;
    public final CharSequence[] f49633w;
    public int f49634w0;
    public final boolean[] f49635x;
    public int f49636x0;
    public int f49637y;
    public int f49638y0;
    public final m4 f49639z0;

    public nr0(an anVar) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = org.telegram.messenger.g0.L(3.0f);
        this.f49616h0 = -1;
        this.f49639z0 = new m4(this, 14);
        this.f49612e0 = true;
        int i7 = getMessagesController().S6;
        this.f49621n = i7;
        this.f49633w = new CharSequence[i7];
        this.f49635x = new boolean[i7];
        this.f49613f = anVar;
        this.f49610d0 = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(this.currentAccount).f22782a).q();
        this.M = false;
        this.O = 2;
    }

    public static void h0(nr0 nr0Var, View view, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = nr0Var.f49612e0;
        if (view instanceof org.telegram.ui.Cells.z5) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            if (i7 == nr0Var.f49618j0) {
                if (z10) {
                    i13 = nr0Var.getMessagesController().T6;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = nr0Var.F;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i7 == nr0Var.f49619k0) {
                Editable editable = nr0Var.G;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = nr0Var.f49623o0;
                if (i7 >= i17 && i7 < nr0Var.E + i17) {
                    int i18 = i7 - i17;
                    if (z10) {
                        i10 = nr0Var.getMessagesController().U6;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = nr0Var.f49633w[i18];
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
                org.telegram.ui.ActionBar.j5 textView2 = z5Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.j6.f29070p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.A6;
                }
                org.telegram.ui.ActionBar.q6.X(textView2, i15, null);
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            z5Var.setText2("");
        }
    }

    public static void i0(nr0 nr0Var, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        v4.e1 T;
        if (nr0Var.f49610d0 && z10) {
            if (nr0Var.f49609c0 == z5Var && nr0Var.Q && nr0Var.C0) {
                nr0Var.o0();
                nr0Var.Q = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = nr0Var.f49609c0;
            nr0Var.f49609c0 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.pg emojiButton = z5Var.getEmojiButton();
            org.telegram.ui.Components.ng ngVar = org.telegram.ui.Components.ng.f37572e;
            emojiButton.j(ngVar, false);
            b61 b61Var = nr0Var.f49608c;
            View F = b61Var.F(z5Var);
            if (F == null) {
                T = null;
            } else {
                T = b61Var.T(F);
            }
            org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
            if (rw0Var != null) {
                rw0Var.f();
                org.telegram.ui.Components.rw0 rw0Var2 = nr0Var.R;
                if (rw0Var2 != null && T != null) {
                    View view = T.f58535a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && rw0Var2.getDelegate() != view) {
                        nr0Var.R.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 != null && z5Var2 != z5Var) {
                if (nr0Var.Q) {
                    nr0Var.o0();
                    nr0Var.p0(false);
                    nr0Var.r0();
                }
                z5Var2.setEmojiButtonVisibility(false);
                z5Var2.getEmojiButton().j(ngVar, false);
            }
        }
    }

    public static void j0(nr0 nr0Var, org.telegram.ui.Cells.z5 z5Var) {
        nr0Var.f49609c0 = z5Var;
        if (nr0Var.Q) {
            nr0Var.o0();
            nr0Var.r0();
            return;
        }
        nr0Var.v0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.f49610d0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.Y = i7;
                    org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i7;
                    org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.X).commit();
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
                int i12 = org.telegram.messenger.g0.f23611q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.B0 != this.C0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.f49611e.requestLayout();
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
            if (this.f49605a0 != i7 || this.f49607b0 != z10) {
                this.f49605a0 = i7;
                this.f49607b0 = z10;
                boolean z14 = this.Z;
                org.telegram.ui.Cells.z5 z5Var = this.f49609c0;
                if (z5Var != null) {
                    if (z5Var.getEditField().isFocused() && this.T.c() && i7 > 0) {
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
                    this.f49611e.requestLayout();
                }
                if (this.Z && this.U) {
                    this.U = false;
                    org.telegram.messenger.g0.r(this.f49639z0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.l(kVar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.q6.b(this.actionBar, i11, getResourceProvider(), true);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f29262z8, getResourceProvider());
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f49612e0;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.J) {
                i10 = 2131744106;
            } else {
                i10 = 2131744074;
            }
            kVar2.setTitle(org.telegram.messenger.hd.M0(i10, null));
        } else if (this.O == 1) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748264, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748265, null));
        }
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fr0(this));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (z10) {
            if (this.J) {
                i7 = 2131744107;
            } else {
                i7 = 2131744075;
            }
            upperCase = org.telegram.messenger.hd.M0(i7, null);
        } else {
            upperCase = org.telegram.messenger.hd.M0(2131751753, null).toUpperCase();
        }
        this.f49604a = s5.e(1, upperCase);
        this.f49606b = new lr0(this, context);
        wc wcVar = new wc(3, context, this);
        this.f49611e = wcVar;
        wcVar.setDelegate(this);
        wc wcVar2 = this.f49611e;
        this.fragmentView = wcVar2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, wcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f49608c = new b61(12, context, null);
        v4.k kVar3 = new v4.k();
        kVar3.f58564m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.er.h);
        kVar3.n(350L);
        this.f49608c.setItemAnimator(kVar3);
        this.f49608c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f49608c.getItemAnimator()).C = false;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        this.f49608c.setLayoutManager(b0Var);
        new v4.y(new gi.c(this, 9)).h(this.f49608c);
        frameLayout.addView(this.f49608c, c8.ja.e(-1, -1, 51));
        this.f49608c.setAdapter(this.f49606b);
        this.f49608c.setOnItemClickListener(new h(this, 23));
        this.f49608c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(context, 4);
        this.h = b30Var;
        b30Var.setText(org.telegram.messenger.hd.M0(2131747155, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.ja.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f49610d0) {
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
            org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(context, this.currentAccount, null, this.resourceProvider);
            this.R = rw0Var;
            rw0Var.E = true;
            rw0Var.F = true;
            rw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.R, c8.ja.e(-2, 160, 51));
        }
        this.T = new hi.p3(this.f49611e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25515i4) {
            org.telegram.ui.Components.ly lyVar = this.S;
            if (lyVar != null) {
                lyVar.Q.g1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f49609c0;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.f49609c0.getEditField().setTextColor(-1);
                this.f49609c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f49616h0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false);
            if (this.actionBar.x()) {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29205w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.rw0 rw0Var = this.R;
        if (rw0Var != null) {
            rw0Var.setDelegate(null);
            this.R.f();
        }
        int i10 = this.E;
        this.f49635x[i10] = false;
        int i11 = i10 + 1;
        this.E = i11;
        if (this.f49626r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f49626r;
                if (i12 < iArr2.length) {
                    i7 = iArr2[i12];
                } else {
                    i7 = this.f49628s + 1;
                    this.f49628s = i7;
                }
                iArr[i12] = i7;
            }
            this.f49626r = iArr;
        }
        if (this.E == this.f49633w.length) {
            this.f49606b.s(this.f49624p0);
        }
        this.f49606b.i(this.f49624p0);
        w0();
        this.f49615g0 = false;
        this.f49616h0 = (this.f49623o0 + this.E) - 1;
        this.f49606b.g(this.f49625q0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pf(this, f10, 3));
        ofFloat.addListener(new gr0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
        ofFloat.start();
    }

    public final boolean m0(boolean z10) {
        int i7;
        int i10;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f49633w;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.E, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.J && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.d0(this.F))) || i11 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.d0(this.F));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.E && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.d0(charSequenceArr[i14]))); i14++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f49612e0;
            if (z14) {
                i7 = 2131752567;
            } else {
                i7 = 2131752573;
            }
            String M0 = org.telegram.messenger.hd.M0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (z14) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            t1Var.U = org.telegram.messenger.hd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747580, null), new ni0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            showDialog(t1Var);
        }
        return z13;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nr0.n0():void");
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
        if (this.f49615g0 && this.f49616h0 >= 0) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f49608c.getChildCount()) {
                    view = this.f49608c.getChildAt(i7);
                    this.f49608c.getClass();
                    if (RecyclerView.R(view) == this.f49616h0) {
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.messenger.g0.i3(new og(((org.telegram.ui.Cells.z5) view).getTextView(), 5), 300L);
                this.f49616h0 = -1;
            }
            this.f49615g0 = false;
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
        if (this.f49610d0) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
            org.telegram.ui.Components.ly lyVar = this.S;
            if (lyVar != null) {
                this.f49611e.removeView(lyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f49610d0) {
            p0(false);
            org.telegram.ui.Components.rw0 rw0Var = this.R;
            if (rw0Var != null) {
                rw0Var.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f49609c0;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.f49609c0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f49609c0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        lr0 lr0Var = this.f49606b;
        if (lr0Var != null) {
            lr0Var.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        bi.u uVar;
        float f10;
        super.onThemeColorsChanged();
        try {
            b61 b61Var = this.f49608c;
            if (b61Var != null) {
                for (int i10 = 0; i10 < b61Var.getChildCount(); i10++) {
                    View childAt = b61Var.getChildAt(i10);
                    v4.e1 T = b61Var.T(childAt);
                    if (T != null && (((i7 = T.f58539f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.z5) && (uVar = ((org.telegram.ui.Cells.z5) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                        if (uVar.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.6f;
                        }
                        uVar.setTextColor(org.telegram.ui.ActionBar.j6.r1(f10, themedColor));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.f49610d0) {
            if (this.Q) {
                org.telegram.ui.Components.ly lyVar = this.S;
                lyVar.Q.C0();
                lyVar.J.scrollTo(0, 0);
                lyVar.F(1);
                lyVar.R.h1(0, 0);
                this.S.t(false);
                if (z10) {
                    this.S.A();
                }
                this.C0 = false;
                v0(0);
            }
            if (z10) {
                org.telegram.ui.Components.ly lyVar2 = this.S;
                if (lyVar2 != null && lyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                    ofFloat.addUpdateListener(new er0(this, 1));
                    ofFloat.addListener(new gr0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.ly lyVar;
        org.telegram.ui.Components.pg emojiButton;
        if (!this.Q && (lyVar = this.S) != null && lyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.f49609c0;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.ng.f37572e, false);
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
        this.T.f14845e = true;
        EditTextBoldCursor editField = this.f49609c0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.J3(editField);
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        v0(i7);
        if (!org.telegram.messenger.g0.D && !this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.U = true;
            m4 m4Var = this.f49639z0;
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.i3(m4Var, 100L);
        }
    }

    public final void s0(yf yfVar) {
        this.f49614f0 = yfVar;
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
            Spannable B5 = org.telegram.messenger.gj.B5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = B5;
            org.telegram.messenger.gj.b(B5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.f49637y = size;
            this.f49628s = 0;
            this.f49626r = new int[size];
            int i12 = 0;
            while (true) {
                i10 = this.E;
                if (i12 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f49633w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.j6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.gj.B5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.gj.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f49626r[i12] = tL_messageMediaToDo.todo.list.get(i12).f28198id;
                this.f49628s = Math.max(this.f49628s, this.f49626r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i10 + 1;
                w0();
                this.f49615g0 = true;
                int i13 = this.f49623o0;
                if (i7 < 0) {
                    i11 = this.E - 1;
                } else {
                    i11 = i7;
                }
                this.f49616h0 = i13 + i11;
            }
        }
    }

    public final void v0(int i7) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.z5 z5Var;
        if (this.f49610d0) {
            if (i7 == 1) {
                org.telegram.ui.Components.ly lyVar = this.S;
                if (lyVar != null && lyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.ly lyVar2 = this.S;
                if (lyVar2 != null && lyVar2.f36941d1 != org.telegram.messenger.m10.f24940t0) {
                    this.f49611e.removeView(lyVar2);
                    this.S = null;
                }
                if (this.S == null) {
                    org.telegram.ui.Components.ly lyVar3 = new org.telegram.ui.Components.ly(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.S = lyVar3;
                    lyVar3.f37009y2 = false;
                    lyVar3.V0 = false;
                    lyVar3.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.S.setForseMultiwindowLayout(true);
                    }
                    this.S.setDelegate(new hr0(this));
                    this.f49611e.addView(this.S);
                }
                this.S.setVisibility(0);
                this.Q = true;
                org.telegram.ui.Components.ly lyVar4 = this.S;
                if (this.X <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.X = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.Y <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.Y = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.Y = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i10 = this.Y;
                } else {
                    i10 = this.X;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lyVar4.getLayoutParams();
                layoutParams.height = i10;
                lyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (z5Var = this.f49609c0) != null) {
                    org.telegram.messenger.g0.v1(z5Var.getEditField());
                }
                this.W = i10;
                this.T.a();
                this.f49611e.requestLayout();
                org.telegram.ui.Components.pg emojiButton = this.f49609c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.ng.d, true);
                }
                if (!z10 && !this.Z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
                    ofFloat.addUpdateListener(new er0(this, 0));
                    ofFloat.addListener(new gr0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.pg emojiButton2 = this.f49609c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.ng.f37572e, true);
            }
            org.telegram.ui.Components.ly lyVar5 = this.S;
            if (lyVar5 != null) {
                this.Q = false;
                this.C0 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    lyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.W = 0;
            }
            this.T.a();
            this.f49611e.requestLayout();
        }
    }

    public final void w0() {
        this.f49617i0 = -1;
        this.f49618j0 = -1;
        this.m0 = -1;
        this.f49622n0 = -1;
        this.f49619k0 = -1;
        this.f49620l0 = -1;
        this.f49623o0 = -1;
        this.f49624p0 = -1;
        this.f49629s0 = -1;
        this.f49630t0 = -1;
        this.f49632v0 = -1;
        this.f49634w0 = -1;
        this.f49631u0 = -1;
        this.f49636x0 = -1;
        this.f49627r0 = -1;
        this.f49638y0 = 0;
        boolean z10 = this.f49612e0;
        if (!z10 || !this.J) {
            this.f49617i0 = 0;
            this.f49618j0 = 1;
            this.m0 = 2;
            this.f49638y0 = 4;
            this.f49622n0 = 3;
        }
        int i7 = this.E;
        if (i7 != 0) {
            int i10 = this.f49638y0;
            this.f49623o0 = i10;
            this.f49638y0 = i10 + i7;
        }
        if (i7 != this.f49633w.length) {
            int i11 = this.f49638y0;
            this.f49638y0 = i11 + 1;
            this.f49624p0 = i11;
        }
        int i12 = this.f49638y0;
        int i13 = i12 + 1;
        this.f49638y0 = i13;
        this.f49625q0 = i12;
        if (!z10 || !this.J) {
            int i14 = i12 + 2;
            this.f49638y0 = i14;
            this.f49627r0 = i13;
            if (z10) {
                int i15 = i12 + 3;
                this.f49638y0 = i15;
                this.f49634w0 = i14;
                if (this.K) {
                    this.f49638y0 = i12 + 4;
                    this.f49632v0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f49613f.f45172e;
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i16 = this.f49638y0;
                this.f49638y0 = i16 + 1;
                this.f49629s0 = i16;
            }
            int i17 = this.O;
            if (i17 != 1) {
                int i18 = this.f49638y0;
                this.f49638y0 = i18 + 1;
                this.f49630t0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f49638y0;
                this.f49638y0 = i19 + 1;
                this.f49631u0 = i19;
            }
            int i20 = this.f49638y0;
            int i21 = i20 + 1;
            this.f49638y0 = i21;
            this.f49636x0 = i20;
            if (this.M) {
                this.f49619k0 = i21;
                this.f49638y0 = i20 + 3;
                this.f49620l0 = i20 + 2;
            }
        }
    }
}
