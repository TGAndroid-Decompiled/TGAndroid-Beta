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
public final class mv0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.uw0 {
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
    public org.telegram.ui.Components.tz0 Q;
    public org.telegram.ui.Components.sz R;
    public fi.z3 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.w0 f41675a;
    public boolean f41676a0;
    public kv0 f41677b;
    public org.telegram.ui.Cells.h6 f41678b0;
    public za1 f41679c;
    public final boolean f41680c0;
    public s4.c0 d;
    public final boolean f41681d0;
    public jd e;
    public lv0 f41682e0;
    public final un f41683f;
    public boolean f41684f0;
    public int f41685g0;
    public org.telegram.ui.Components.t40 h;
    public int f41686h0;
    public int f41687i0;
    public int f41688j0;
    public int f41689k0;
    public int f41690l0;
    public int m0;
    public final int f41691n;
    public int f41692n0;
    public int f41693o0;
    public int f41694p0;
    public int f41695q0;
    public int[] f41696r;
    public int f41697r0;
    public int f41698s;
    public int f41699s0;
    public int f41700t0;
    public int f41701u0;
    public final CharSequence[] v;
    public int f41702v0;
    public final boolean[] f41703w;
    public int f41704w0;
    public int f41705x;
    public int f41706x0;
    public int f41707y;
    public final y5 f41708y0;
    public TLRPC.MessageMedia f41709z0;

    public mv0(un unVar) {
        super(null);
        this.f41707y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f41685g0 = -1;
        this.f41708y0 = new y5(this, 13);
        this.f41679c.getChildCount();
        this.f41681d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f41691n = i10;
        this.v = new CharSequence[i10];
        this.f41703w = new boolean[i10];
        this.f41683f = unVar;
        this.f41680c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static org.telegram.ui.ActionBar.k a0(mv0 mv0Var) {
        return mv0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(mv0 mv0Var) {
        return mv0Var.actionBar;
    }

    public static void d0(mv0 mv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = mv0Var.f41681d0;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (i10 == mv0Var.f41687i0) {
                if (z10) {
                    i14 = mv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = mv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == mv0Var.f41688j0) {
                Editable editable = mv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = mv0Var.f41692n0;
                if (i10 >= i18 && i10 < mv0Var.f41707y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = mv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = mv0Var.v[i19];
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
                h6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.b6 textView2 = h6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.y6.f23581p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.y6.A6;
                }
                org.telegram.ui.ActionBar.f7.Y(textView2, i16, null);
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            h6Var.setText2("");
        }
    }

    public static void e0(mv0 mv0Var, org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        s4.e1 T;
        if (mv0Var.f41680c0 && z10) {
            if (mv0Var.f41678b0 == h6Var && mv0Var.P && mv0Var.B0) {
                mv0Var.k0();
                mv0Var.P = false;
            }
            org.telegram.ui.Cells.h6 h6Var2 = mv0Var.f41678b0;
            mv0Var.f41678b0 = h6Var;
            h6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ah emojiButton = h6Var.getEmojiButton();
            org.telegram.ui.Components.yg ygVar = org.telegram.ui.Components.yg.e;
            emojiButton.j(ygVar, false);
            za1 za1Var = mv0Var.f41679c;
            View F = za1Var.F(h6Var);
            if (F == null) {
                T = null;
            } else {
                T = za1Var.T(F);
            }
            org.telegram.ui.Components.tz0 tz0Var = mv0Var.Q;
            if (tz0Var != null) {
                tz0Var.f();
                org.telegram.ui.Components.tz0 tz0Var2 = mv0Var.Q;
                if (tz0Var2 != null && T != null) {
                    View view = T.f47738a;
                    if ((view instanceof org.telegram.ui.Cells.h6) && tz0Var2.getDelegate() != view) {
                        mv0Var.Q.setDelegate((org.telegram.ui.Cells.h6) view);
                    }
                }
            }
            if (h6Var2 != null && h6Var2 != h6Var) {
                if (mv0Var.P) {
                    mv0Var.k0();
                    mv0Var.l0(false);
                    mv0Var.n0();
                }
                h6Var2.setEmojiButtonVisibility(false);
                h6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void f0(mv0 mv0Var, org.telegram.ui.Cells.h6 h6Var) {
        mv0Var.f41678b0 = h6Var;
        if (mv0Var.P) {
            mv0Var.k0();
            mv0Var.n0();
            return;
        }
        mv0Var.r0(1);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f41680c0) {
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
                        h0(dp);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i10 || this.f41676a0 != z10) {
                this.Z = i10;
                this.f41676a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.h6 h6Var = this.f41678b0;
                if (h6Var != null) {
                    if (h6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Y = z12;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    r0(0);
                }
                if (this.V != 0 && !(z11 = this.Y) && z11 != z14 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f41708y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(kVar, 1, i12, getResourceProvider());
        org.telegram.ui.ActionBar.f7.b(this.actionBar, i12, getResourceProvider(), true);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23769z8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, i12, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f41681d0;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ev0(this));
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
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
        this.f41675a = l4.e(1, upperCase);
        this.f41677b = new kv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.e;
        this.fragmentView = jdVar2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23299a7, jdVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f41679c = new za1(context, 11, null);
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.f41679c.setItemAnimator(lVar);
        this.f41679c.setVerticalScrollBarEnabled(false);
        ((s4.l) this.f41679c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.f41679c.setLayoutManager(c0Var);
        new s4.z(new ei.f(this, 6)).h(this.f41679c);
        frameLayout.addView(this.f41679c, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f41679c.setAdapter(this.f41677b);
        this.f41679c.setOnItemClickListener(new h(this, 24));
        this.f41679c.setOnScrollListener(new i3(this, 24));
        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(context, 4);
        this.h = t40Var;
        t40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f41680c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.tz0 tz0Var = new org.telegram.ui.Components.tz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = tz0Var;
            tz0Var.f33187y = true;
            tz0Var.E = true;
            tz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, org.telegram.ui.Components.gb1.i(-2, 160, 51));
        }
        this.S = new fi.z3(this.e, false, null);
        j0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.sz szVar = this.R;
            if (szVar != null) {
                szVar.P.g1();
            }
            org.telegram.ui.Cells.h6 h6Var = this.f41678b0;
            if (h6Var != null) {
                int currentTextColor = h6Var.getEditField().getCurrentTextColor();
                this.f41678b0.getEditField().setTextColor(-1);
                this.f41678b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void g0() {
        int i10;
        org.telegram.ui.Components.tz0 tz0Var = this.Q;
        if (tz0Var != null) {
            tz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f41707y;
        this.f41703w[i11] = false;
        int i12 = i11 + 1;
        this.f41707y = i12;
        if (this.f41696r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f41696r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f41698s + 1;
                    this.f41698s = i10;
                }
                iArr[i13] = i10;
            }
            this.f41696r = iArr;
        }
        if (this.f41707y == this.v.length) {
            this.f41677b.u(this.f41693o0);
        }
        this.f41677b.o(this.f41693o0);
        s0();
        this.f41684f0 = false;
        this.f41685g0 = (this.f41692n0 + this.f41707y) - 1;
        this.f41677b.m(this.f41694p0);
    }

    public final void h0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new dg(this, f7, 3));
        ofFloat.addListener(new fv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
        ofFloat.start();
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f41685g0 < 0) {
            return true;
        }
        return false;
    }

    public final boolean i0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f41709z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f41707y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.go.b0(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.go.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f41707y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f41681d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22368a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new hl0(this, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f22368a);
        }
        return z13;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false);
            if (this.actionBar.q()) {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23713w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mv0.j0():void");
    }

    public final void k0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            h0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void l0(boolean z10) {
        if (this.f41680c0) {
            if (this.P) {
                org.telegram.ui.Components.sz szVar = this.R;
                szVar.P.C0();
                szVar.I.scrollTo(0, 0);
                szVar.F(1);
                szVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                r0(0);
            }
            if (z10) {
                org.telegram.ui.Components.sz szVar2 = this.R;
                if (szVar2 != null && szVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new dv0(this, 1));
                    ofFloat.addListener(new fv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                    ofFloat.start();
                    return;
                }
                m0();
            }
        }
    }

    public final void m0() {
        org.telegram.ui.Components.sz szVar;
        org.telegram.ui.Components.ah emojiButton;
        if (!this.P && (szVar = this.R) != null && szVar.getVisibility() != 8) {
            org.telegram.ui.Cells.h6 h6Var = this.f41678b0;
            if (h6Var != null && (emojiButton = h6Var.getEmojiButton()) != null) {
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

    public final void n0() {
        int i10;
        this.S.e = true;
        EditTextBoldCursor editField = this.f41678b0.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        r0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.T = true;
            y5 y5Var = this.f41708y0;
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            AndroidUtilities.runOnUIThread(y5Var, 100L);
        }
    }

    public final void o0(rg rgVar) {
        this.f41682e0 = rgVar;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                l0(true);
                return false;
            }
            return false;
        }
        return i0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f41684f0 && this.f41685g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f41679c.getChildCount()) {
                    view = this.f41679c.getChildAt(i10);
                    this.f41679c.getClass();
                    if (RecyclerView.R(view) == this.f41685g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.h6) {
                AndroidUtilities.runOnUIThread(new hh(((org.telegram.ui.Cells.h6) view).getTextView(), 5), 300L);
                this.f41685g0 = -1;
            }
            this.f41684f0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        s0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.f41680c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.sz szVar = this.R;
            if (szVar != null) {
                this.e.removeView(szVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f41680c0) {
            l0(false);
            org.telegram.ui.Components.tz0 tz0Var = this.Q;
            if (tz0Var != null) {
                tz0Var.f();
            }
            org.telegram.ui.Cells.h6 h6Var = this.f41678b0;
            if (h6Var != null) {
                h6Var.setEmojiButtonVisibility(false);
                this.f41678b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f41678b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        kv0 kv0Var = this.f41677b;
        if (kv0Var != null) {
            kv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        org.telegram.ui.Cells.g6 g6Var;
        float f7;
        super.onThemeColorsChanged();
        try {
            za1 za1Var = this.f41679c;
            if (za1Var != null) {
                for (int i11 = 0; i11 < za1Var.getChildCount(); i11++) {
                    View childAt = za1Var.getChildAt(i11);
                    s4.e1 T = za1Var.T(childAt);
                    if (T != null && (((i10 = T.f47741f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.h6) && (g6Var = ((org.telegram.ui.Cells.h6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.G6);
                        if (g6Var.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.6f;
                        }
                        g6Var.setTextColor(org.telegram.ui.ActionBar.y6.o1(f7, themedColor));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10) {
        q0(messageMedia, z10, -1);
    }

    public final void q0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f41709z0 = messageMedia;
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
            this.f41707y = size;
            this.f41705x = size;
            this.f41698s = 0;
            this.f41696r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f41707y;
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
                this.f41696r[i12] = tL_messageMediaToDo.todo.list.get(i12).f22174id;
                this.f41698s = Math.max(this.f41698s, this.f41696r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f41707y = i11 + 1;
                s0();
                this.f41684f0 = true;
                int i13 = this.f41692n0;
                if (i10 < 0) {
                    i10 = this.f41707y - 1;
                }
                this.f41685g0 = i13 + i10;
            }
        }
    }

    public final void r0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.h6 h6Var;
        if (this.f41680c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.sz szVar = this.R;
                if (szVar != null && szVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.sz szVar2 = this.R;
                if (szVar2 != null && szVar2.f32719c1 != UserConfig.selectedAccount) {
                    this.e.removeView(szVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.sz szVar3 = new org.telegram.ui.Components.sz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = szVar3;
                    szVar3.f32787x2 = false;
                    szVar3.U0 = false;
                    szVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new gv0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.sz szVar4 = this.R;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar4.getLayoutParams();
                layoutParams.height = i11;
                szVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (h6Var = this.f41678b0) != null) {
                    AndroidUtilities.hideKeyboard(h6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.ah emojiButton = this.f41678b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.yg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new dv0(this, 0));
                    ofFloat.addListener(new fv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ah emojiButton2 = this.f41678b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.yg.e, true);
            }
            org.telegram.ui.Components.sz szVar5 = this.R;
            if (szVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    szVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.e.requestLayout();
        }
    }

    public final void s0() {
        this.f41686h0 = -1;
        this.f41687i0 = -1;
        this.f41690l0 = -1;
        this.m0 = -1;
        this.f41688j0 = -1;
        this.f41689k0 = -1;
        this.f41692n0 = -1;
        this.f41693o0 = -1;
        this.f41697r0 = -1;
        this.f41699s0 = -1;
        this.f41701u0 = -1;
        this.f41702v0 = -1;
        this.f41700t0 = -1;
        this.f41704w0 = -1;
        this.f41695q0 = -1;
        this.f41706x0 = 0;
        boolean z10 = this.f41681d0;
        if (!z10 || !this.I) {
            this.f41686h0 = 0;
            this.f41687i0 = 1;
            this.f41690l0 = 2;
            this.f41706x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f41707y;
        if (i10 != 0) {
            int i11 = this.f41706x0;
            this.f41692n0 = i11;
            this.f41706x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f41706x0;
            this.f41706x0 = i12 + 1;
            this.f41693o0 = i12;
        }
        int i13 = this.f41706x0;
        int i14 = i13 + 1;
        this.f41706x0 = i14;
        this.f41694p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f41706x0 = i15;
            this.f41695q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f41706x0 = i16;
                this.f41702v0 = i15;
                if (this.J) {
                    this.f41706x0 = i13 + 4;
                    this.f41701u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f41683f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f41706x0;
                this.f41706x0 = i17 + 1;
                this.f41697r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f41706x0;
                this.f41706x0 = i19 + 1;
                this.f41699s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f41706x0;
                this.f41706x0 = i20 + 1;
                this.f41700t0 = i20;
            }
            int i21 = this.f41706x0;
            int i22 = i21 + 1;
            this.f41706x0 = i22;
            this.f41704w0 = i21;
            if (this.L) {
                this.f41688j0 = i22;
                this.f41706x0 = i21 + 3;
                this.f41689k0 = i21 + 2;
            }
        }
    }
}
