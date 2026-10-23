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
public final class iv0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.nw0 {
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
    public org.telegram.ui.Components.lz0 Q;
    public org.telegram.ui.Components.tz R;
    public ei.b4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.u0 f38373a;
    public boolean f38374a0;
    public gv0 f38375b;
    public org.telegram.ui.Cells.d6 f38376b0;
    public xa1 f38377c;
    public final boolean f38378c0;
    public s4.b0 d;
    public final boolean f38379d0;
    public id e;
    public hv0 f38380e0;
    public final sn f38381f;
    public boolean f38382f0;
    public int f38383g0;
    public org.telegram.ui.Components.r40 h;
    public int f38384h0;
    public int f38385i0;
    public int f38386j0;
    public int f38387k0;
    public int f38388l0;
    public int m0;
    public final int f38389n;
    public int f38390n0;
    public int f38391o0;
    public int f38392p0;
    public int f38393q0;
    public int[] f38394r;
    public int f38395r0;
    public int f38396s;
    public int f38397s0;
    public int f38398t0;
    public int f38399u0;
    public final CharSequence[] v;
    public int f38400v0;
    public final boolean[] f38401w;
    public int f38402w0;
    public int f38403x;
    public int f38404x0;
    public int f38405y;
    public final z5 f38406y0;
    public TLRPC.MessageMedia f38407z0;

    public iv0(sn snVar) {
        super(null);
        this.f38405y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f38383g0 = -1;
        this.f38406y0 = new z5(this, 13);
        this.f38377c.getChildCount();
        this.f38379d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f38389n = i10;
        this.v = new CharSequence[i10];
        this.f38401w = new boolean[i10];
        this.f38381f = snVar;
        this.f38378c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(iv0 iv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = iv0Var.f38379d0;
        if (view instanceof org.telegram.ui.Cells.d6) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            if (i10 == iv0Var.f38385i0) {
                if (z10) {
                    i14 = iv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = iv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == iv0Var.f38386j0) {
                Editable editable = iv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = iv0Var.f38390n0;
                if (i10 >= i18 && i10 < iv0Var.f38405y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = iv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = iv0Var.v[i19];
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
                    i16 = org.telegram.ui.ActionBar.k6.f21404p7;
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

    public static void d0(iv0 iv0Var, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        if (iv0Var.f38378c0 && z10) {
            if (iv0Var.f38376b0 == d6Var && iv0Var.P && iv0Var.B0) {
                iv0Var.j0();
                iv0Var.P = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = iv0Var.f38376b0;
            iv0Var.f38376b0 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ah emojiButton = d6Var.getEmojiButton();
            org.telegram.ui.Components.yg ygVar = org.telegram.ui.Components.yg.e;
            emojiButton.j(ygVar, false);
            xa1 xa1Var = iv0Var.f38377c;
            View F = xa1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = xa1Var.T(F);
            }
            org.telegram.ui.Components.lz0 lz0Var = iv0Var.Q;
            if (lz0Var != null) {
                lz0Var.f();
                org.telegram.ui.Components.lz0 lz0Var2 = iv0Var.Q;
                if (lz0Var2 != null && T != null) {
                    View view = T.f46343a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && lz0Var2.getDelegate() != view) {
                        iv0Var.Q.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (iv0Var.P) {
                    iv0Var.j0();
                    iv0Var.k0(false);
                    iv0Var.m0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void e0(iv0 iv0Var, org.telegram.ui.Cells.d6 d6Var) {
        iv0Var.f38376b0 = d6Var;
        if (iv0Var.P) {
            iv0Var.j0();
            iv0Var.m0();
            return;
        }
        iv0Var.q0(1);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f38378c0) {
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
            if (this.Z != i10 || this.f38374a0 != z10) {
                this.Z = i10;
                this.f38374a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.d6 d6Var = this.f38376b0;
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
                    AndroidUtilities.cancelRunOnUIThread(this.f38406y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i12, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i12, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21590z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i12, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f38379d0;
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
        this.actionBar.setActionBarMenuOnItemClick(new av0(this));
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
        this.f38373a = m10.e(1, upperCase);
        this.f38375b = new gv0(this, context);
        id idVar = new id(3, context, this);
        this.e = idVar;
        idVar.setDelegate(this);
        id idVar2 = this.e;
        this.fragmentView = idVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, idVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f38377c = new xa1(context, 11, null);
        s4.k kVar3 = new s4.k();
        kVar3.f46377m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.bs.h);
        kVar3.n(350L);
        this.f38377c.setItemAnimator(kVar3);
        this.f38377c.setVerticalScrollBarEnabled(false);
        ((s4.k) this.f38377c.getItemAnimator()).C = false;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        this.f38377c.setLayoutManager(b0Var);
        new s4.y(new di.f(this, 6)).d(this.f38377c);
        frameLayout.addView(this.f38377c, w7.z5.e(-1, -1, 51));
        this.f38377c.setAdapter(this.f38375b);
        this.f38377c.setOnItemClickListener(new h(this, 24));
        this.f38377c.setOnScrollListener(new j3(this, 23));
        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(context, 4);
        this.h = r40Var;
        r40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f38378c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.lz0 lz0Var = new org.telegram.ui.Components.lz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = lz0Var;
            lz0Var.f28454y = true;
            lz0Var.E = true;
            lz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.z5.e(-2, 160, 51));
        }
        this.S = new ei.b4(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.tz tzVar = this.R;
            if (tzVar != null) {
                tzVar.P.g1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f38376b0;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f38376b0.getEditField().setTextColor(-1);
                this.f38376b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.lz0 lz0Var = this.Q;
        if (lz0Var != null) {
            lz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f38405y;
        this.f38401w[i11] = false;
        int i12 = i11 + 1;
        this.f38405y = i12;
        if (this.f38394r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f38394r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f38396s + 1;
                    this.f38396s = i10;
                }
                iArr[i13] = i10;
            }
            this.f38394r = iArr;
        }
        if (this.f38405y == this.v.length) {
            this.f38375b.u(this.f38391o0);
        }
        this.f38375b.o(this.f38391o0);
        r0();
        this.f38382f0 = false;
        this.f38383g0 = (this.f38390n0 + this.f38405y) - 1;
        this.f38375b.m(this.f38392p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fg(this, f7, 3));
        ofFloat.addListener(new bv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
        ofFloat.start();
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f38407z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f38405y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.fo.b0(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f38405y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f38379d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20678a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20678a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new sp0(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f20678a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f38383g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false);
            if (this.actionBar.s()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21537w8, false);
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
        if (this.f38378c0) {
            if (this.P) {
                org.telegram.ui.Components.tz tzVar = this.R;
                tzVar.P.B0();
                tzVar.I.scrollTo(0, 0);
                tzVar.E(1);
                tzVar.Q.h1(0, 0);
                this.R.u(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.tz tzVar2 = this.R;
                if (tzVar2 != null && tzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new zu0(this, 1));
                    ofFloat.addListener(new bv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.tz tzVar;
        org.telegram.ui.Components.ah emojiButton;
        if (!this.P && (tzVar = this.R) != null && tzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f38376b0;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.yg.e, false);
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
        EditTextBoldCursor editField = this.f38376b0.getEditField();
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
            z5 z5Var = this.f38406y0;
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        }
    }

    public final void n0(og ogVar) {
        this.f38380e0 = ogVar;
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
        if (this.f38382f0 && this.f38383g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f38377c.getChildCount()) {
                    view = this.f38377c.getChildAt(i10);
                    this.f38377c.getClass();
                    if (RecyclerView.R(view) == this.f38383g0) {
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
                this.f38383g0 = -1;
            }
            this.f38382f0 = false;
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
        if (this.f38378c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.tz tzVar = this.R;
            if (tzVar != null) {
                this.e.removeView(tzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f38378c0) {
            k0(false);
            org.telegram.ui.Components.lz0 lz0Var = this.Q;
            if (lz0Var != null) {
                lz0Var.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f38376b0;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f38376b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f38376b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gv0 gv0Var = this.f38375b;
        if (gv0Var != null) {
            gv0Var.l();
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
            xa1 xa1Var = this.f38377c;
            if (xa1Var != null) {
                for (int i11 = 0; i11 < xa1Var.getChildCount(); i11++) {
                    View childAt = xa1Var.getChildAt(i11);
                    s4.b1 T = xa1Var.T(childAt);
                    if (T != null && (((i10 = T.f46346f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.d6) && (c6Var = ((org.telegram.ui.Cells.d6) childAt).d) != null)) {
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
        this.f38407z0 = messageMedia;
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
            this.f38405y = size;
            this.f38403x = size;
            this.f38396s = 0;
            this.f38394r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f38405y;
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
                this.f38394r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20488id;
                this.f38396s = Math.max(this.f38396s, this.f38394r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f38405y = i11 + 1;
                r0();
                this.f38382f0 = true;
                int i13 = this.f38390n0;
                if (i10 < 0) {
                    i10 = this.f38405y - 1;
                }
                this.f38383g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.f38378c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.tz tzVar = this.R;
                if (tzVar != null && tzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.tz tzVar2 = this.R;
                if (tzVar2 != null && tzVar2.f30966c1 != UserConfig.selectedAccount) {
                    this.e.removeView(tzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.tz tzVar3 = new org.telegram.ui.Components.tz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = tzVar3;
                    tzVar3.f31034x2 = false;
                    tzVar3.U0 = false;
                    tzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new cv0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.tz tzVar4 = this.R;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar4.getLayoutParams();
                layoutParams.height = i11;
                tzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f38376b0) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.ah emojiButton = this.f38376b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.yg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new zu0(this, 0));
                    ofFloat.addListener(new bv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ah emojiButton2 = this.f38376b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.yg.e, true);
            }
            org.telegram.ui.Components.tz tzVar5 = this.R;
            if (tzVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    tzVar5.setVisibility(8);
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
        this.f38384h0 = -1;
        this.f38385i0 = -1;
        this.f38388l0 = -1;
        this.m0 = -1;
        this.f38386j0 = -1;
        this.f38387k0 = -1;
        this.f38390n0 = -1;
        this.f38391o0 = -1;
        this.f38395r0 = -1;
        this.f38397s0 = -1;
        this.f38399u0 = -1;
        this.f38400v0 = -1;
        this.f38398t0 = -1;
        this.f38402w0 = -1;
        this.f38393q0 = -1;
        this.f38404x0 = 0;
        boolean z10 = this.f38379d0;
        if (!z10 || !this.I) {
            this.f38384h0 = 0;
            this.f38385i0 = 1;
            this.f38388l0 = 2;
            this.f38404x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f38405y;
        if (i10 != 0) {
            int i11 = this.f38404x0;
            this.f38390n0 = i11;
            this.f38404x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f38404x0;
            this.f38404x0 = i12 + 1;
            this.f38391o0 = i12;
        }
        int i13 = this.f38404x0;
        int i14 = i13 + 1;
        this.f38404x0 = i14;
        this.f38392p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f38404x0 = i15;
            this.f38393q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f38404x0 = i16;
                this.f38400v0 = i15;
                if (this.J) {
                    this.f38404x0 = i13 + 4;
                    this.f38399u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f38381f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f38404x0;
                this.f38404x0 = i17 + 1;
                this.f38395r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f38404x0;
                this.f38404x0 = i19 + 1;
                this.f38397s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f38404x0;
                this.f38404x0 = i20 + 1;
                this.f38398t0 = i20;
            }
            int i21 = this.f38404x0;
            int i22 = i21 + 1;
            this.f38404x0 = i22;
            this.f38402w0 = i21;
            if (this.L) {
                this.f38386j0 = i22;
                this.f38404x0 = i21 + 3;
                this.f38387k0 = i21 + 2;
            }
        }
    }
}
