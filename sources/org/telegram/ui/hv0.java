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
public final class hv0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.pv0 {
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
    public org.telegram.ui.Components.ry0 N;
    public org.telegram.ui.Components.mz O;
    public qh.i3 P;
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
    public org.telegram.ui.ActionBar.w0 f37640a;
    public final boolean f37641a0;
    public fv0 f37642b;
    public gv0 f37643b0;
    public kb1 f37644c;
    public boolean f37645c0;
    public f2.j0 d;
    public int f37646d0;
    public jd f37647e;
    public int f37648e0;
    public final xn f37649f;
    public int f37650f0;
    public int f37651g0;
    public org.telegram.ui.Components.m40 h;
    public int f37652h0;
    public int f37653i0;
    public int f37654j0;
    public int f37655k0;
    public int f37656l0;
    public int m0;
    public final int f37657n;
    public int f37658n0;
    public int f37659o0;
    public int f37660p0;
    public int f37661q0;
    public int[] f37662r;
    public int f37663r0;
    public int f37664s;
    public int f37665s0;
    public int f37666t0;
    public int f37667u0;
    public final CharSequence[] v;
    public final z5 f37668v0;
    public final boolean[] f37669w;
    public TLRPC.MessageMedia f37670w0;
    public int f37671x;
    public boolean f37672x0;
    public int f37673y;
    public boolean f37674y0;

    public hv0(xn xnVar) {
        super(null);
        this.f37673y = 1;
        this.D = true;
        this.E = false;
        this.G = true;
        this.L = AndroidUtilities.dp(3.0f);
        this.f37646d0 = -1;
        this.f37668v0 = new z5(this, 12);
        this.f37641a0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f37657n = i10;
        this.v = new CharSequence[i10];
        this.f37669w = new boolean[i10];
        this.f37649f = xnVar;
        this.Z = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.I = false;
        this.K = 2;
    }

    public static void c0(hv0 hv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4 = hv0Var.f37641a0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == hv0Var.f37650f0) {
                if (z4) {
                    i14 = hv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = hv0Var.B;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == hv0Var.f37651g0) {
                Editable editable = hv0Var.C;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = hv0Var.f37655k0;
                if (i10 >= i18 && i10 < hv0Var.f37673y + i18) {
                    int i19 = i10 - i18;
                    if (z4) {
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
            float f10 = i14;
            if (i13 <= f10 - (0.7f * f10)) {
                c6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.l5 textView2 = c6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.k6.f21876p7;
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

    public static void d0(hv0 hv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        if (hv0Var.Z && z4) {
            if (hv0Var.Y == c6Var && hv0Var.M && hv0Var.f37674y0) {
                hv0Var.j0();
                hv0Var.M = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = hv0Var.Y;
            hv0Var.Y = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.f29750e;
            emojiButton.j(ogVar, false);
            kb1 kb1Var = hv0Var.f37644c;
            View F = kb1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = kb1Var.T(F);
            }
            org.telegram.ui.Components.ry0 ry0Var = hv0Var.N;
            if (ry0Var != null) {
                ry0Var.f();
                org.telegram.ui.Components.ry0 ry0Var2 = hv0Var.N;
                if (ry0Var2 != null && T != null) {
                    View view = T.f5875a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && ry0Var2.getDelegate() != view) {
                        hv0Var.N.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (hv0Var.M) {
                    hv0Var.j0();
                    hv0Var.k0(false);
                    hv0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void e0(hv0 hv0Var, org.telegram.ui.Cells.c6 c6Var) {
        hv0Var.Y = c6Var;
        if (hv0Var.M) {
            hv0Var.j0();
            hv0Var.m0();
            return;
        }
        hv0Var.q0(1);
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
                if (this.f37674y0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f37672x0 != this.f37674y0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.O.setLayoutParams(layoutParams);
                    this.S = layoutParams.height;
                    this.P.a();
                    this.f37647e.requestLayout();
                    boolean z12 = this.f37672x0;
                    if (z12 != this.f37674y0) {
                        if (z12) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.f37672x0 = this.f37674y0;
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
                    this.f37647e.requestLayout();
                }
                if (this.V && this.Q) {
                    this.Q = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f37668v0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = this.f37641a0;
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
        this.actionBar.setActionBarMenuOnItemClick(new zu0(this));
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
        this.f37640a = n10.e(1, upperCase);
        this.f37642b = new fv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.f37647e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.f37647e;
        this.fragmentView = jdVar2;
        jdVar2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f37644c = new kb1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.f37644c.setItemAnimator(lVar);
        this.f37644c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f37644c.getItemAnimator()).C = false;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        this.f37644c.setLayoutManager(j0Var);
        new f2.f0(new cp(this, 5)).d(this.f37644c);
        frameLayout.addView(this.f37644c, k7.c6.e(-1, -1, 51));
        this.f37644c.setAdapter(this.f37642b);
        this.f37644c.setOnItemClickListener(new j(this, 22));
        this.f37644c.setOnScrollListener(new l3(this, 24));
        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(context, 4);
        this.h = m40Var;
        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(context, this.currentAccount, null, this.resourceProvider);
            this.N = ry0Var;
            ry0Var.f30908y = true;
            ry0Var.B = true;
            ry0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.N, k7.c6.e(-2, 160, 51));
        }
        this.P = new qh.i3(this.f37647e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.mz mzVar = this.O;
            if (mzVar != null) {
                mzVar.M.f1();
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
        org.telegram.ui.Components.ry0 ry0Var = this.N;
        if (ry0Var != null) {
            ry0Var.setDelegate(null);
            this.N.f();
        }
        int i11 = this.f37673y;
        this.f37669w[i11] = false;
        int i12 = i11 + 1;
        this.f37673y = i12;
        if (this.f37662r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f37662r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f37664s + 1;
                    this.f37664s = i10;
                }
                iArr[i13] = i10;
            }
            this.f37662r = iArr;
        }
        if (this.f37673y == this.v.length) {
            this.f37642b.u(this.f37656l0);
        }
        this.f37642b.o(this.f37656l0);
        r0();
        this.f37645c0 = false;
        this.f37646d0 = (this.f37655k0 + this.f37673y) - 1;
        this.f37642b.m(this.m0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg(this, f10, 3));
        ofFloat.addListener(new av0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.f21876p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        int i13 = org.telegram.ui.ActionBar.k6.f21821m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.f21786k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        int i15 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21894q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37644c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f37670w0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f37673y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.F && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.sn.Y(this.B))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(this.B));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f37673y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z12 = isEmpty;
        }
        if (z4 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f37641a0;
            if (z13) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f21166a.O = LocaleController.getString(i10);
            if (z13) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f21166a);
        }
        return z12;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f37646d0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22000w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f37674y0) {
            this.O.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.O.setLayoutParams(layoutParams);
            this.S = layoutParams.height;
            this.f37672x0 = this.f37674y0;
            this.f37674y0 = false;
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
                this.f37674y0 = false;
                q0(0);
            }
            if (z4) {
                org.telegram.ui.Components.mz mzVar2 = this.O;
                if (mzVar2 != null && mzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O.getMeasuredHeight());
                    ofFloat.addUpdateListener(new yu0(this, 1));
                    ofFloat.addListener(new av0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
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
                emojiButton.j(org.telegram.ui.Components.og.f29750e, false);
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
        this.P.f45412e = true;
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
            z5 z5Var = this.f37668v0;
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        }
    }

    public final void n0(rg rgVar) {
        this.f37643b0 = rgVar;
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
        if (this.f37645c0 && this.f37646d0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f37644c.getChildCount()) {
                    view = this.f37644c.getChildAt(i10);
                    this.f37644c.getClass();
                    if (RecyclerView.R(view) == this.f37646d0) {
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
                this.f37646d0 = -1;
            }
            this.f37645c0 = false;
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
                this.f37647e.removeView(mzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.Z) {
            k0(false);
            org.telegram.ui.Components.ry0 ry0Var = this.N;
            if (ry0Var != null) {
                ry0Var.f();
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
        fv0 fv0Var = this.f37642b;
        if (fv0Var != null) {
            fv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z4, int i10) {
        int i11;
        this.f37670w0 = messageMedia;
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
            this.f37673y = size;
            this.f37671x = size;
            this.f37664s = 0;
            this.f37662r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f37673y;
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
                this.f37662r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20988id;
                this.f37664s = Math.max(this.f37664s, this.f37662r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.G = todoList.others_can_complete;
            this.E = todoList.others_can_append;
            if (this.F) {
                this.f37673y = i11 + 1;
                r0();
                this.f37645c0 = true;
                int i13 = this.f37655k0;
                if (i10 < 0) {
                    i10 = this.f37673y - 1;
                }
                this.f37646d0 = i13 + i10;
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
                    this.f37647e.removeView(mzVar2);
                    this.O = null;
                }
                if (this.O == null) {
                    org.telegram.ui.Components.mz mzVar3 = new org.telegram.ui.Components.mz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.O = mzVar3;
                    mzVar3.f29330u2 = false;
                    mzVar3.R0 = false;
                    mzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.O.setForseMultiwindowLayout(true);
                    }
                    this.O.setDelegate(new bv0(this));
                    this.f37647e.addView(this.O);
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
                this.f37647e.requestLayout();
                org.telegram.ui.Components.qg emojiButton = this.Y.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.d, true);
                }
                if (!z4 && !this.V) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, 0.0f);
                    ofFloat.addUpdateListener(new yu0(this, 0));
                    ofFloat.addListener(new av0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.qg emojiButton2 = this.Y.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.f29750e, true);
            }
            org.telegram.ui.Components.mz mzVar5 = this.O;
            if (mzVar5 != null) {
                this.M = false;
                this.f37674y0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    mzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.S = 0;
            }
            this.P.a();
            this.f37647e.requestLayout();
        }
    }

    public final void r0() {
        this.f37648e0 = -1;
        this.f37650f0 = -1;
        this.f37653i0 = -1;
        this.f37654j0 = -1;
        this.f37651g0 = -1;
        this.f37652h0 = -1;
        this.f37655k0 = -1;
        this.f37656l0 = -1;
        this.f37659o0 = -1;
        this.f37660p0 = -1;
        this.f37663r0 = -1;
        this.f37665s0 = -1;
        this.f37661q0 = -1;
        this.f37666t0 = -1;
        this.f37658n0 = -1;
        this.f37667u0 = 0;
        boolean z4 = this.f37641a0;
        if (!z4 || !this.F) {
            this.f37648e0 = 0;
            this.f37650f0 = 1;
            this.f37653i0 = 2;
            this.f37667u0 = 4;
            this.f37654j0 = 3;
        }
        int i10 = this.f37673y;
        if (i10 != 0) {
            int i11 = this.f37667u0;
            this.f37655k0 = i11;
            this.f37667u0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f37667u0;
            this.f37667u0 = i12 + 1;
            this.f37656l0 = i12;
        }
        int i13 = this.f37667u0;
        int i14 = i13 + 1;
        this.f37667u0 = i14;
        this.m0 = i13;
        if (!z4 || !this.F) {
            int i15 = i13 + 2;
            this.f37667u0 = i15;
            this.f37658n0 = i14;
            if (z4) {
                int i16 = i13 + 3;
                this.f37667u0 = i16;
                this.f37665s0 = i15;
                if (this.G) {
                    this.f37667u0 = i13 + 4;
                    this.f37663r0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f37649f.f43165e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f37667u0;
                this.f37667u0 = i17 + 1;
                this.f37659o0 = i17;
            }
            int i18 = this.K;
            if (i18 != 1) {
                int i19 = this.f37667u0;
                this.f37667u0 = i19 + 1;
                this.f37660p0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f37667u0;
                this.f37667u0 = i20 + 1;
                this.f37661q0 = i20;
            }
            int i21 = this.f37667u0;
            int i22 = i21 + 1;
            this.f37667u0 = i22;
            this.f37666t0 = i21;
            if (this.I) {
                this.f37651g0 = i22;
                this.f37667u0 = i21 + 3;
                this.f37652h0 = i21 + 2;
            }
        }
    }
}
