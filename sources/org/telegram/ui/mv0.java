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
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
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
public final class mv0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ov0 {
    public CharSequence B;
    public Editable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final int K;
    public int L;
    public boolean M;
    public org.telegram.ui.Components.qy0 N;
    public org.telegram.ui.Components.mz O;
    public qh.h3 P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public boolean X;
    public org.telegram.ui.Cells.c6 Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 f39089a;
    public final boolean f39090a0;
    public kv0 f39091b;
    public lv0 f39092b0;
    public qb1 f39093c;
    public boolean f39094c0;
    public f2.j0 d;
    public int f39095d0;
    public jd f39096e;
    public int f39097e0;
    public final xn f39098f;
    public int f39099f0;
    public int f39100g0;
    public org.telegram.ui.Components.m40 h;
    public int f39101h0;
    public int f39102i0;
    public int f39103j0;
    public int f39104k0;
    public int f39105l0;
    public int m0;
    public final int f39106n;
    public int f39107n0;
    public int f39108o0;
    public int f39109p0;
    public int f39110q0;
    public int[] f39111r;
    public int f39112r0;
    public int f39113s;
    public int f39114s0;
    public int f39115t0;
    public int f39116u0;
    public final CharSequence[] v;
    public final z5 f39117v0;
    public final boolean[] f39118w;
    public TLRPC.MessageMedia f39119w0;
    public int f39120x;
    public boolean f39121x0;
    public int f39122y;
    public boolean f39123y0;

    public mv0(xn xnVar) {
        super(null);
        this.f39122y = 1;
        this.D = true;
        this.E = false;
        this.G = true;
        this.L = AndroidUtilities.dp(3.0f);
        this.f39095d0 = -1;
        this.f39117v0 = new z5(this, 12);
        this.f39090a0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f39106n = i10;
        this.v = new CharSequence[i10];
        this.f39118w = new boolean[i10];
        this.f39098f = xnVar;
        this.Z = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.I = false;
        this.K = 2;
    }

    public static void c0(mv0 mv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4 = mv0Var.f39090a0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == mv0Var.f39099f0) {
                if (z4) {
                    i14 = mv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = mv0Var.B;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == mv0Var.f39100g0) {
                Editable editable = mv0Var.C;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = mv0Var.f39104k0;
                if (i10 >= i18 && i10 < mv0Var.f39122y + i18) {
                    int i19 = i10 - i18;
                    if (z4) {
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
            float f10 = i14;
            if (i13 <= f10 - (0.7f * f10)) {
                c6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.l5 textView2 = c6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.k6.f21878p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.k6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void d0(mv0 mv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        if (mv0Var.Z && z4) {
            if (mv0Var.Y == c6Var && mv0Var.M && mv0Var.f39123y0) {
                mv0Var.j0();
                mv0Var.M = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = mv0Var.Y;
            mv0Var.Y = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.f29751e;
            emojiButton.j(ogVar, false);
            qb1 qb1Var = mv0Var.f39093c;
            View F = qb1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = qb1Var.T(F);
            }
            org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
                org.telegram.ui.Components.qy0 qy0Var2 = mv0Var.N;
                if (qy0Var2 != null && T != null) {
                    View view = T.f5875a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && qy0Var2.getDelegate() != view) {
                        mv0Var.N.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (mv0Var.M) {
                    mv0Var.j0();
                    mv0Var.k0(false);
                    mv0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void e0(mv0 mv0Var, org.telegram.ui.Cells.c6 c6Var) {
        mv0Var.Y = c6Var;
        if (mv0Var.M) {
            mv0Var.j0();
            mv0Var.m0();
            return;
        }
        mv0Var.q0(1);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        int dp;
        if (this.Z) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.V && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.U = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.U).commit();
                } else {
                    this.T = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.T).commit();
                }
            }
            if (this.M) {
                if (z4) {
                    i11 = this.U;
                } else {
                    i11 = this.T;
                }
                if (this.f39123y0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f39121x0 != this.f39123y0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.O.setLayoutParams(layoutParams);
                    this.S = layoutParams.height;
                    this.P.a();
                    this.f39096e.requestLayout();
                    boolean z12 = this.f39121x0;
                    if (z12 != this.f39123y0) {
                        if (z12) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.f39121x0 = this.f39123y0;
                }
            }
            if (this.W != i10 || this.X != z4) {
                this.W = i10;
                this.X = z4;
                boolean z13 = this.V;
                org.telegram.ui.Cells.c6 c6Var = this.Y;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && this.P.c() && i10 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.V = z11;
                } else {
                    this.V = false;
                }
                if (this.V && this.M) {
                    q0(0);
                }
                if (this.S != 0 && !(z10 = this.V) && z10 != z13 && !this.M) {
                    this.S = 0;
                    this.P.a();
                    this.f39096e.requestLayout();
                }
                if (this.V && this.Q) {
                    this.Q = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f39117v0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = this.f39090a0;
        if (z4) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.F) {
                i11 = R.string.TodoAddTasksTitle;
            } else {
                i11 = R.string.TodoEditTitle;
            }
            kVar2.setTitle(LocaleController.getString(i11));
        } else if (this.K == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ev0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z4) {
            if (this.F) {
                i10 = R.string.TodoAddTasksButton;
            } else {
                i10 = R.string.TodoEditTasksButton;
            }
            upperCase = LocaleController.getString(i10);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f39089a = n10.e(1, upperCase);
        this.f39091b = new kv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.f39096e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.f39096e;
        this.fragmentView = jdVar2;
        jdVar2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f39093c = new qb1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.f39093c.setItemAnimator(lVar);
        this.f39093c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f39093c.getItemAnimator()).C = false;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        this.f39093c.setLayoutManager(j0Var);
        new f2.f0(new cp(this, 5)).d(this.f39093c);
        frameLayout.addView(this.f39093c, k7.c6.e(-1, -1, 51));
        this.f39093c.setAdapter(this.f39091b);
        this.f39093c.setOnItemClickListener(new j(this, 23));
        this.f39093c.setOnScrollListener(new l3(this, 23));
        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(context, 4);
        this.h = m40Var;
        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(context, this.currentAccount, null, this.resourceProvider);
            this.N = qy0Var;
            qy0Var.f30569y = true;
            qy0Var.B = true;
            qy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.N, k7.c6.e(-2, 160, 51));
        }
        this.P = new qh.h3(this.f39096e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.mz mzVar = this.O;
            if (mzVar != null) {
                mzVar.M.e1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.Y.getEditField().setTextColor(-1);
                this.Y.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.qy0 qy0Var = this.N;
        if (qy0Var != null) {
            qy0Var.setDelegate(null);
            this.N.f();
        }
        int i11 = this.f39122y;
        this.f39118w[i11] = false;
        int i12 = i11 + 1;
        this.f39122y = i12;
        if (this.f39111r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f39111r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f39113s + 1;
                    this.f39113s = i10;
                }
                iArr[i13] = i10;
            }
            this.f39111r = iArr;
        }
        if (this.f39122y == this.v.length) {
            this.f39091b.u(this.f39105l0);
        }
        this.f39091b.o(this.f39105l0);
        r0();
        this.f39094c0 = false;
        this.f39095d0 = (this.f39104k0 + this.f39122y) - 1;
        this.f39091b.m(this.m0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg(this, f10, 3));
        ofFloat.addListener(new fv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.f21878p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        int i13 = org.telegram.ui.ActionBar.k6.f21823m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.f21788k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        int i15 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21896q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39093c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f39119w0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f39122y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.F && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.rn.Y(this.B))) || i12 != todoList.list.size()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (!TextUtils.equals(charSequenceArr[i14].toString(), todoList.list.get(i14).title.text)) {
                        break;
                    }
                }
            }
            z12 = z10;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.rn.Y(this.B));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f39122y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.rn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z12 = isEmpty;
        }
        if (z4 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f39090a0;
            if (z13) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f21168a.O = LocaleController.getString(i10);
            if (z13) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f21168a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f21168a);
        }
        return z12;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f39095d0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22002w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f39123y0) {
            this.O.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.O.setLayoutParams(layoutParams);
            this.S = layoutParams.height;
            this.f39121x0 = this.f39123y0;
            this.f39123y0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z4) {
        if (this.Z) {
            if (this.M) {
                org.telegram.ui.Components.mz mzVar = this.O;
                mzVar.M.B0();
                mzVar.F.scrollTo(0, 0);
                mzVar.G(1);
                mzVar.N.h1(0, 0);
                this.O.t(false);
                if (z4) {
                    this.O.B();
                }
                this.f39123y0 = false;
                q0(0);
            }
            if (z4) {
                org.telegram.ui.Components.mz mzVar2 = this.O;
                if (mzVar2 != null && mzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O.getMeasuredHeight());
                    ofFloat.addUpdateListener(new dv0(this, 1));
                    ofFloat.addListener(new fv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.mz mzVar;
        org.telegram.ui.Components.qg emojiButton;
        if (!this.M && (mzVar = this.O) != null && mzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.og.f29751e, false);
            }
            this.O.setVisibility(8);
        }
        int i10 = this.S;
        this.S = 0;
        if (i10 != 0) {
            this.P.a();
        }
    }

    public final void m0() {
        int i10;
        this.P.f45394e = true;
        EditTextBoldCursor editField = this.Y.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        q0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.V && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.Q = true;
            z5 z5Var = this.f39117v0;
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        }
    }

    public final void n0(rg rgVar) {
        this.f39092b0 = rgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z4) {
        p0(messageMedia, z4, -1);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.M) {
            if (z4) {
                k0(true);
                return false;
            }
            return false;
        }
        return h0(z4);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f39094c0 && this.f39095d0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f39093c.getChildCount()) {
                    view = this.f39093c.getChildAt(i10);
                    this.f39093c.getClass();
                    if (RecyclerView.R(view) == this.f39095d0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.c6) {
                AndroidUtilities.runOnUIThread(new ch(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
                this.f39095d0 = -1;
            }
            this.f39094c0 = false;
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
        this.R = true;
        if (this.Z) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.mz mzVar = this.O;
            if (mzVar != null) {
                this.f39096e.removeView(mzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.Z) {
            k0(false);
            org.telegram.ui.Components.qy0 qy0Var = this.N;
            if (qy0Var != null) {
                qy0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.Y.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.Y.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        kv0 kv0Var = this.f39091b;
        if (kv0Var != null) {
            kv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z4, int i10) {
        int i11;
        this.f39119w0 = messageMedia;
        this.F = z4;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.B = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.B = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.B = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.f39122y = size;
            this.f39120x = size;
            this.f39113s = 0;
            this.f39111r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f39122y;
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
                this.f39111r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20990id;
                this.f39113s = Math.max(this.f39113s, this.f39111r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.G = todoList.others_can_complete;
            this.E = todoList.others_can_append;
            if (this.F) {
                this.f39122y = i11 + 1;
                r0();
                this.f39094c0 = true;
                int i13 = this.f39104k0;
                if (i10 < 0) {
                    i10 = this.f39122y - 1;
                }
                this.f39095d0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.Z) {
            if (i10 == 1) {
                org.telegram.ui.Components.mz mzVar = this.O;
                if (mzVar != null && mzVar.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.mz mzVar2 = this.O;
                if (mzVar2 != null && mzVar2.Z0 != UserConfig.selectedAccount) {
                    this.f39096e.removeView(mzVar2);
                    this.O = null;
                }
                if (this.O == null) {
                    org.telegram.ui.Components.mz mzVar3 = new org.telegram.ui.Components.mz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.O = mzVar3;
                    mzVar3.f29332u2 = false;
                    mzVar3.R0 = false;
                    mzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.O.setForseMultiwindowLayout(true);
                    }
                    this.O.setDelegate(new gv0(this));
                    this.f39096e.addView(this.O);
                }
                this.O.setVisibility(0);
                this.M = true;
                org.telegram.ui.Components.mz mzVar4 = this.O;
                if (this.T <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.T = AndroidUtilities.dp(150.0f);
                    } else {
                        this.T = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.U <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.U = AndroidUtilities.dp(150.0f);
                    } else {
                        this.U = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.U;
                } else {
                    i11 = this.T;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar4.getLayoutParams();
                layoutParams.height = i11;
                mzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.Y) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.S = i11;
                this.P.a();
                this.f39096e.requestLayout();
                org.telegram.ui.Components.qg emojiButton = this.Y.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.d, true);
                }
                if (!z4 && !this.V) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, 0.0f);
                    ofFloat.addUpdateListener(new dv0(this, 0));
                    ofFloat.addListener(new fv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.qg emojiButton2 = this.Y.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.f29751e, true);
            }
            org.telegram.ui.Components.mz mzVar5 = this.O;
            if (mzVar5 != null) {
                this.M = false;
                this.f39123y0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    mzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.S = 0;
            }
            this.P.a();
            this.f39096e.requestLayout();
        }
    }

    public final void r0() {
        this.f39097e0 = -1;
        this.f39099f0 = -1;
        this.f39102i0 = -1;
        this.f39103j0 = -1;
        this.f39100g0 = -1;
        this.f39101h0 = -1;
        this.f39104k0 = -1;
        this.f39105l0 = -1;
        this.f39108o0 = -1;
        this.f39109p0 = -1;
        this.f39112r0 = -1;
        this.f39114s0 = -1;
        this.f39110q0 = -1;
        this.f39115t0 = -1;
        this.f39107n0 = -1;
        this.f39116u0 = 0;
        boolean z4 = this.f39090a0;
        if (!z4 || !this.F) {
            this.f39097e0 = 0;
            this.f39099f0 = 1;
            this.f39102i0 = 2;
            this.f39116u0 = 4;
            this.f39103j0 = 3;
        }
        int i10 = this.f39122y;
        if (i10 != 0) {
            int i11 = this.f39116u0;
            this.f39104k0 = i11;
            this.f39116u0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f39116u0;
            this.f39116u0 = i12 + 1;
            this.f39105l0 = i12;
        }
        int i13 = this.f39116u0;
        int i14 = i13 + 1;
        this.f39116u0 = i14;
        this.m0 = i13;
        if (!z4 || !this.F) {
            int i15 = i13 + 2;
            this.f39116u0 = i15;
            this.f39107n0 = i14;
            if (z4) {
                int i16 = i13 + 3;
                this.f39116u0 = i16;
                this.f39114s0 = i15;
                if (this.G) {
                    this.f39116u0 = i13 + 4;
                    this.f39112r0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f39098f.f43143e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f39116u0;
                this.f39116u0 = i17 + 1;
                this.f39108o0 = i17;
            }
            int i18 = this.K;
            if (i18 != 1) {
                int i19 = this.f39116u0;
                this.f39116u0 = i19 + 1;
                this.f39109p0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f39116u0;
                this.f39116u0 = i20 + 1;
                this.f39110q0 = i20;
            }
            int i21 = this.f39116u0;
            int i22 = i21 + 1;
            this.f39116u0 = i22;
            this.f39115t0 = i21;
            if (this.I) {
                this.f39100g0 = i22;
                this.f39116u0 = i21 + 3;
                this.f39101h0 = i21 + 2;
            }
        }
    }
}
