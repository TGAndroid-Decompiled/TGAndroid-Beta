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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hv0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.mw0 {
    public boolean A0;
    public boolean B0;
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
    public org.telegram.ui.Components.kz0 Q;
    public org.telegram.ui.Components.rz R;
    public ei.b4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.u0 f38030a;
    public boolean f38031a0;
    public fv0 f38032b;
    public org.telegram.ui.Cells.d6 f38033b0;
    public wa1 f38034c;
    public final boolean f38035c0;
    public s4.b0 d;
    public final boolean f38036d0;
    public id e;
    public gv0 f38037e0;
    public final sn f38038f;
    public boolean f38039f0;
    public int f38040g0;
    public org.telegram.ui.Components.p40 h;
    public int f38041h0;
    public int f38042i0;
    public int f38043j0;
    public int f38044k0;
    public int f38045l0;
    public int m0;
    public final int f38046n;
    public int f38047n0;
    public int f38048o0;
    public int f38049p0;
    public int f38050q0;
    public int[] f38051r;
    public int f38052r0;
    public int f38053s;
    public int f38054s0;
    public int f38055t0;
    public int f38056u0;
    public final CharSequence[] v;
    public int f38057v0;
    public final boolean[] f38058w;
    public int f38059w0;
    public int f38060x;
    public int f38061x0;
    public int f38062y;
    public final z5 f38063y0;
    public TLRPC.MessageMedia f38064z0;

    public hv0(sn snVar) {
        super(null);
        this.f38062y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f38040g0 = -1;
        this.f38063y0 = new z5(this, 13);
        this.f38034c.getChildCount();
        this.f38036d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f38046n = i10;
        this.v = new CharSequence[i10];
        this.f38058w = new boolean[i10];
        this.f38038f = snVar;
        this.f38035c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(hv0 hv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = hv0Var.f38036d0;
        if (view instanceof org.telegram.ui.Cells.d6) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            if (i10 == hv0Var.f38042i0) {
                if (z10) {
                    i14 = hv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = hv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == hv0Var.f38043j0) {
                Editable editable = hv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = hv0Var.f38047n0;
                if (i10 >= i18 && i10 < hv0Var.f38062y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = hv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = hv0Var.v[i19];
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
                d6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.n5 textView2 = d6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.k6.f21405p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.k6.A6;
                }
                org.telegram.ui.ActionBar.r6.Z(textView2, i16, null);
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            d6Var.setText2("");
        }
    }

    public static void d0(hv0 hv0Var, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        if (hv0Var.f38035c0 && z10) {
            if (hv0Var.f38033b0 == d6Var && hv0Var.P && hv0Var.B0) {
                hv0Var.j0();
                hv0Var.P = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = hv0Var.f38033b0;
            hv0Var.f38033b0 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.yg emojiButton = d6Var.getEmojiButton();
            org.telegram.ui.Components.wg wgVar = org.telegram.ui.Components.wg.e;
            emojiButton.j(wgVar, false);
            wa1 wa1Var = hv0Var.f38034c;
            View F = wa1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = wa1Var.T(F);
            }
            org.telegram.ui.Components.kz0 kz0Var = hv0Var.Q;
            if (kz0Var != null) {
                kz0Var.f();
                org.telegram.ui.Components.kz0 kz0Var2 = hv0Var.Q;
                if (kz0Var2 != null && T != null) {
                    View view = T.f46342a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && kz0Var2.getDelegate() != view) {
                        hv0Var.Q.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (hv0Var.P) {
                    hv0Var.j0();
                    hv0Var.k0(false);
                    hv0Var.m0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(wgVar, false);
            }
        }
    }

    public static void e0(hv0 hv0Var, org.telegram.ui.Cells.d6 d6Var) {
        hv0Var.f38033b0 = d6Var;
        if (hv0Var.P) {
            hv0Var.j0();
            hv0Var.m0();
            return;
        }
        hv0Var.q0(1);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f38035c0) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.X = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z10) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                if (this.B0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
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
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i10 || this.f38031a0 != z10) {
                this.Z = i10;
                this.f38031a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.d6 d6Var = this.f38033b0;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Y = z12;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    q0(0);
                }
                if (this.V != 0 && !(z11 = this.Y) && z11 != z14 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f38063y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i12, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i12, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21591z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i12, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f38036d0;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.I) {
                i11 = R.string.TodoAddTasksTitle;
            } else {
                i11 = R.string.TodoEditTitle;
            }
            kVar2.setTitle(LocaleController.getString(i11));
        } else if (this.N == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new zu0(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        if (z10) {
            if (this.I) {
                i10 = R.string.TodoAddTasksButton;
            } else {
                i10 = R.string.TodoEditTasksButton;
            }
            upperCase = LocaleController.getString(i10);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f38030a = m10.e(1, upperCase);
        this.f38032b = new fv0(this, context);
        id idVar = new id(3, context, this);
        this.e = idVar;
        idVar.setDelegate(this);
        id idVar2 = this.e;
        this.fragmentView = idVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, idVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f38034c = new wa1(context, 11, null);
        s4.k kVar3 = new s4.k();
        kVar3.f46376m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.zr.h);
        kVar3.n(350L);
        this.f38034c.setItemAnimator(kVar3);
        this.f38034c.setVerticalScrollBarEnabled(false);
        ((s4.k) this.f38034c.getItemAnimator()).C = false;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        this.f38034c.setLayoutManager(b0Var);
        new s4.y(new di.f(this, 6)).d(this.f38034c);
        frameLayout.addView(this.f38034c, w7.z5.e(-1, -1, 51));
        this.f38034c.setAdapter(this.f38032b);
        this.f38034c.setOnItemClickListener(new h(this, 24));
        this.f38034c.setOnScrollListener(new j3(this, 23));
        org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(context, 4);
        this.h = p40Var;
        p40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f38035c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.kz0 kz0Var = new org.telegram.ui.Components.kz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = kz0Var;
            kz0Var.f28120y = true;
            kz0Var.E = true;
            kz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.z5.e(-2, 160, 51));
        }
        this.S = new ei.b4(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.rz rzVar = this.R;
            if (rzVar != null) {
                rzVar.P.g1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f38033b0;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f38033b0.getEditField().setTextColor(-1);
                this.f38033b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.kz0 kz0Var = this.Q;
        if (kz0Var != null) {
            kz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f38062y;
        this.f38058w[i11] = false;
        int i12 = i11 + 1;
        this.f38062y = i12;
        if (this.f38051r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f38051r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f38053s + 1;
                    this.f38053s = i10;
                }
                iArr[i13] = i10;
            }
            this.f38051r = iArr;
        }
        if (this.f38062y == this.v.length) {
            this.f38032b.u(this.f38048o0);
        }
        this.f38032b.o(this.f38048o0);
        r0();
        this.f38039f0 = false;
        this.f38040g0 = (this.f38047n0 + this.f38062y) - 1;
        this.f38032b.m(this.f38049p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fg(this, f7, 3));
        ofFloat.addListener(new av0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
        ofFloat.start();
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f38064z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f38062y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.co.b0(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.co.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f38062y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.co.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f38036d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new rp0(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f20679a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f38040g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false);
            if (this.actionBar.s()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21538w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.B0) {
            this.R.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.f38035c0) {
            if (this.P) {
                org.telegram.ui.Components.rz rzVar = this.R;
                rzVar.P.B0();
                rzVar.I.scrollTo(0, 0);
                rzVar.E(1);
                rzVar.Q.h1(0, 0);
                this.R.u(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.rz rzVar2 = this.R;
                if (rzVar2 != null && rzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new yu0(this, 1));
                    ofFloat.addListener(new av0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.rz rzVar;
        org.telegram.ui.Components.yg emojiButton;
        if (!this.P && (rzVar = this.R) != null && rzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f38033b0;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.wg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void m0() {
        int i10;
        this.S.e = true;
        EditTextBoldCursor editField = this.f38033b0.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        q0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.T = true;
            z5 z5Var = this.f38063y0;
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        }
    }

    public final void n0(og ogVar) {
        this.f38037e0 = ogVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                k0(true);
                return false;
            }
            return false;
        }
        return h0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f38039f0 && this.f38040g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f38034c.getChildCount()) {
                    view = this.f38034c.getChildAt(i10);
                    this.f38034c.getClass();
                    if (RecyclerView.R(view) == this.f38040g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.d6) {
                AndroidUtilities.runOnUIThread(new ah(((org.telegram.ui.Cells.d6) view).getTextView(), 5), 300L);
                this.f38040g0 = -1;
            }
            this.f38039f0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.f38035c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.rz rzVar = this.R;
            if (rzVar != null) {
                this.e.removeView(rzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f38035c0) {
            k0(false);
            org.telegram.ui.Components.kz0 kz0Var = this.Q;
            if (kz0Var != null) {
                kz0Var.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f38033b0;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f38033b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f38033b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fv0 fv0Var = this.f38032b;
        if (fv0Var != null) {
            fv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        org.telegram.ui.Cells.c6 c6Var;
        float f7;
        super.onThemeColorsChanged();
        try {
            wa1 wa1Var = this.f38034c;
            if (wa1Var != null) {
                for (int i11 = 0; i11 < wa1Var.getChildCount(); i11++) {
                    View childAt = wa1Var.getChildAt(i11);
                    s4.b1 T = wa1Var.T(childAt);
                    if (T != null && (((i10 = T.f46345f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.d6) && (c6Var = ((org.telegram.ui.Cells.d6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                        if (c6Var.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.6f;
                        }
                        c6Var.setTextColor(org.telegram.ui.ActionBar.k6.o1(f7, themedColor));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f38064z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.E = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.E = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.f38062y = size;
            this.f38060x = size;
            this.f38053s = 0;
            this.f38051r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f38062y;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = Emoji.replaceEmoji(charSequenceArr[i12], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i12] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false);
                this.f38051r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20489id;
                this.f38053s = Math.max(this.f38053s, this.f38051r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f38062y = i11 + 1;
                r0();
                this.f38039f0 = true;
                int i13 = this.f38047n0;
                if (i10 < 0) {
                    i10 = this.f38062y - 1;
                }
                this.f38040g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.f38035c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.rz rzVar = this.R;
                if (rzVar != null && rzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.rz rzVar2 = this.R;
                if (rzVar2 != null && rzVar2.f30310c1 != UserConfig.selectedAccount) {
                    this.e.removeView(rzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.rz rzVar3 = new org.telegram.ui.Components.rz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = rzVar3;
                    rzVar3.f30378x2 = false;
                    rzVar3.U0 = false;
                    rzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new bv0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.rz rzVar4 = this.R;
                if (this.W <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.W = AndroidUtilities.dp(150.0f);
                    } else {
                        this.W = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.X = AndroidUtilities.dp(150.0f);
                    } else {
                        this.X = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar4.getLayoutParams();
                layoutParams.height = i11;
                rzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f38033b0) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.yg emojiButton = this.f38033b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.wg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new yu0(this, 0));
                    ofFloat.addListener(new av0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.yg emojiButton2 = this.f38033b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.wg.e, true);
            }
            org.telegram.ui.Components.rz rzVar5 = this.R;
            if (rzVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    rzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.e.requestLayout();
        }
    }

    public final void r0() {
        this.f38041h0 = -1;
        this.f38042i0 = -1;
        this.f38045l0 = -1;
        this.m0 = -1;
        this.f38043j0 = -1;
        this.f38044k0 = -1;
        this.f38047n0 = -1;
        this.f38048o0 = -1;
        this.f38052r0 = -1;
        this.f38054s0 = -1;
        this.f38056u0 = -1;
        this.f38057v0 = -1;
        this.f38055t0 = -1;
        this.f38059w0 = -1;
        this.f38050q0 = -1;
        this.f38061x0 = 0;
        boolean z10 = this.f38036d0;
        if (!z10 || !this.I) {
            this.f38041h0 = 0;
            this.f38042i0 = 1;
            this.f38045l0 = 2;
            this.f38061x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f38062y;
        if (i10 != 0) {
            int i11 = this.f38061x0;
            this.f38047n0 = i11;
            this.f38061x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f38061x0;
            this.f38061x0 = i12 + 1;
            this.f38048o0 = i12;
        }
        int i13 = this.f38061x0;
        int i14 = i13 + 1;
        this.f38061x0 = i14;
        this.f38049p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f38061x0 = i15;
            this.f38050q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f38061x0 = i16;
                this.f38057v0 = i15;
                if (this.J) {
                    this.f38061x0 = i13 + 4;
                    this.f38056u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f38038f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f38061x0;
                this.f38061x0 = i17 + 1;
                this.f38052r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f38061x0;
                this.f38061x0 = i19 + 1;
                this.f38054s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f38061x0;
                this.f38061x0 = i20 + 1;
                this.f38055t0 = i20;
            }
            int i21 = this.f38061x0;
            int i22 = i21 + 1;
            this.f38061x0 = i22;
            this.f38059w0 = i21;
            if (this.L) {
                this.f38043j0 = i22;
                this.f38061x0 = i21 + 3;
                this.f38044k0 = i21 + 2;
            }
        }
    }
}
