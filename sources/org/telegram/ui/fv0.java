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
public final class fv0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.pv0 {
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
    public org.telegram.ui.Components.kz O;
    public ph.i3 P;
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
    public org.telegram.ui.ActionBar.w0 f34372a;
    public final boolean f34373a0;
    public dv0 f34374b;
    public ev0 f34375b0;
    public jb1 f34376c;
    public boolean f34377c0;
    public f2.i0 d;
    public int f34378d0;
    public jd e;
    public int f34379e0;
    public final xn f34380f;
    public int f34381f0;
    public int f34382g0;
    public org.telegram.ui.Components.k40 h;
    public int f34383h0;
    public int f34384i0;
    public int f34385j0;
    public int f34386k0;
    public int f34387l0;
    public int m0;
    public final int f34388n;
    public int f34389n0;
    public int f34390o0;
    public int f34391p0;
    public int f34392q0;
    public int[] f34393r;
    public int f34394r0;
    public int f34395s;
    public int f34396s0;
    public int f34397t0;
    public int f34398u0;
    public final CharSequence[] v;
    public final z5 f34399v0;
    public final boolean[] f34400w;
    public TLRPC.MessageMedia f34401w0;
    public int f34402x;
    public boolean f34403x0;
    public int f34404y;
    public boolean f34405y0;

    public fv0(xn xnVar) {
        super(null);
        this.f34404y = 1;
        this.D = true;
        this.E = false;
        this.G = true;
        this.L = AndroidUtilities.dp(3.0f);
        this.f34378d0 = -1;
        this.f34399v0 = new z5(this, 12);
        this.f34373a0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f34388n = i10;
        this.v = new CharSequence[i10];
        this.f34400w = new boolean[i10];
        this.f34380f = xnVar;
        this.Z = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.I = false;
        this.K = 2;
    }

    public static void c0(fv0 fv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4 = fv0Var.f34373a0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == fv0Var.f34381f0) {
                if (z4) {
                    i14 = fv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = fv0Var.B;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == fv0Var.f34382g0) {
                Editable editable = fv0Var.C;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = fv0Var.f34386k0;
                if (i10 >= i18 && i10 < fv0Var.f34404y + i18) {
                    int i19 = i10 - i18;
                    if (z4) {
                        i11 = fv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = fv0Var.v[i19];
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
                org.telegram.ui.ActionBar.k5 textView2 = c6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.j6.f20122p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.j6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void d0(fv0 fv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.l1 T;
        if (fv0Var.Z && z4) {
            if (fv0Var.Y == c6Var && fv0Var.M && fv0Var.f34405y0) {
                fv0Var.j0();
                fv0Var.M = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = fv0Var.Y;
            fv0Var.Y = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.e;
            emojiButton.j(ogVar, false);
            jb1 jb1Var = fv0Var.f34376c;
            View F = jb1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = jb1Var.T(F);
            }
            org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
                org.telegram.ui.Components.qy0 qy0Var2 = fv0Var.N;
                if (qy0Var2 != null && T != null) {
                    View view = T.f5785a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && qy0Var2.getDelegate() != view) {
                        fv0Var.N.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (fv0Var.M) {
                    fv0Var.j0();
                    fv0Var.k0(false);
                    fv0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void e0(fv0 fv0Var, org.telegram.ui.Cells.c6 c6Var) {
        fv0Var.Y = c6Var;
        if (fv0Var.M) {
            fv0Var.j0();
            fv0Var.m0();
            return;
        }
        fv0Var.q0(1);
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
                if (this.f34405y0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f34403x0 != this.f34405y0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.O.setLayoutParams(layoutParams);
                    this.S = layoutParams.height;
                    this.P.a();
                    this.e.requestLayout();
                    boolean z12 = this.f34403x0;
                    if (z12 != this.f34405y0) {
                        if (z12) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.f34403x0 = this.f34405y0;
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
                    this.e.requestLayout();
                }
                if (this.V && this.Q) {
                    this.Q = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f34399v0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = this.f34373a0;
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
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new xu0(this));
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
        this.f34372a = n10.e(1, upperCase);
        this.f34374b = new dv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.e;
        this.fragmentView = jdVar2;
        jdVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f34376c = new jb1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.n(350L);
        this.f34376c.setItemAnimator(lVar);
        this.f34376c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f34376c.getItemAnimator()).C = false;
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        this.f34376c.setLayoutManager(i0Var);
        new f2.e0(new oh.f(this, 6)).d(this.f34376c);
        frameLayout.addView(this.f34376c, k7.b6.e(-1, -1, 51));
        this.f34376c.setAdapter(this.f34374b);
        this.f34376c.setOnItemClickListener(new j(this, 22));
        this.f34376c.setOnScrollListener(new l3(this, 24));
        org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(context, 4);
        this.h = k40Var;
        k40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(context, this.currentAccount, null, this.resourceProvider);
            this.N = qy0Var;
            qy0Var.f28313y = true;
            qy0Var.B = true;
            qy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.N, k7.b6.e(-2, 160, 51));
        }
        this.P = new ph.i3(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.kz kzVar = this.O;
            if (kzVar != null) {
                kzVar.M.f1();
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
        int i11 = this.f34404y;
        this.f34400w[i11] = false;
        int i12 = i11 + 1;
        this.f34404y = i12;
        if (this.f34393r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f34393r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f34395s + 1;
                    this.f34395s = i10;
                }
                iArr[i13] = i10;
            }
            this.f34393r = iArr;
        }
        if (this.f34404y == this.v.length) {
            this.f34374b.u(this.f34387l0);
        }
        this.f34374b.o(this.f34387l0);
        r0();
        this.f34377c0 = false;
        this.f34378d0 = (this.f34386k0 + this.f34404y) - 1;
        this.f34374b.m(this.m0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg(this, f10, 3));
        ofFloat.addListener(new yu0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f20122p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i13 = org.telegram.ui.ActionBar.j6.f20067m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f20032k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20140q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34376c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f34401w0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f34404y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.F && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.qn.Y(this.B))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.qn.Y(this.B));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f34404y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.qn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z12 = isEmpty;
        }
        if (z4 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f34373a0;
            if (z13) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f19503a.O = LocaleController.getString(i10);
            if (z13) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new il0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f19503a);
        }
        return z12;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f34378d0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20246w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f34405y0) {
            this.O.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.O.setLayoutParams(layoutParams);
            this.S = layoutParams.height;
            this.f34403x0 = this.f34405y0;
            this.f34405y0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z4) {
        if (this.Z) {
            if (this.M) {
                org.telegram.ui.Components.kz kzVar = this.O;
                kzVar.M.B0();
                kzVar.F.scrollTo(0, 0);
                kzVar.G(1);
                kzVar.N.h1(0, 0);
                this.O.t(false);
                if (z4) {
                    this.O.B();
                }
                this.f34405y0 = false;
                q0(0);
            }
            if (z4) {
                org.telegram.ui.Components.kz kzVar2 = this.O;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O.getMeasuredHeight());
                    ofFloat.addUpdateListener(new wu0(this, 1));
                    ofFloat.addListener(new yu0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.kz kzVar;
        org.telegram.ui.Components.qg emojiButton;
        if (!this.M && (kzVar = this.O) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.og.e, false);
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
        this.P.e = true;
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
            z5 z5Var = this.f34399v0;
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        }
    }

    public final void n0(rg rgVar) {
        this.f34375b0 = rgVar;
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
        if (this.f34377c0 && this.f34378d0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f34376c.getChildCount()) {
                    view = this.f34376c.getChildAt(i10);
                    this.f34376c.getClass();
                    if (RecyclerView.R(view) == this.f34378d0) {
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
                this.f34378d0 = -1;
            }
            this.f34377c0 = false;
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
            org.telegram.ui.Components.kz kzVar = this.O;
            if (kzVar != null) {
                this.e.removeView(kzVar);
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
        dv0 dv0Var = this.f34374b;
        if (dv0Var != null) {
            dv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z4, int i10) {
        int i11;
        this.f34401w0 = messageMedia;
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
            this.f34404y = size;
            this.f34402x = size;
            this.f34395s = 0;
            this.f34393r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f34404y;
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
                this.f34393r[i12] = tL_messageMediaToDo.todo.list.get(i12).f19329id;
                this.f34395s = Math.max(this.f34395s, this.f34393r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.G = todoList.others_can_complete;
            this.E = todoList.others_can_append;
            if (this.F) {
                this.f34404y = i11 + 1;
                r0();
                this.f34377c0 = true;
                int i13 = this.f34386k0;
                if (i10 < 0) {
                    i10 = this.f34404y - 1;
                }
                this.f34378d0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.Z) {
            if (i10 == 1) {
                org.telegram.ui.Components.kz kzVar = this.O;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.kz kzVar2 = this.O;
                if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                    this.e.removeView(kzVar2);
                    this.O = null;
                }
                if (this.O == null) {
                    org.telegram.ui.Components.kz kzVar3 = new org.telegram.ui.Components.kz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.O = kzVar3;
                    kzVar3.f26475u2 = false;
                    kzVar3.R0 = false;
                    kzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.O.setForseMultiwindowLayout(true);
                    }
                    this.O.setDelegate(new zu0(this));
                    this.e.addView(this.O);
                }
                this.O.setVisibility(0);
                this.M = true;
                org.telegram.ui.Components.kz kzVar4 = this.O;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
                layoutParams.height = i11;
                kzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.Y) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.S = i11;
                this.P.a();
                this.e.requestLayout();
                org.telegram.ui.Components.qg emojiButton = this.Y.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.d, true);
                }
                if (!z4 && !this.V) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, 0.0f);
                    ofFloat.addUpdateListener(new wu0(this, 0));
                    ofFloat.addListener(new yu0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.qg emojiButton2 = this.Y.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.e, true);
            }
            org.telegram.ui.Components.kz kzVar5 = this.O;
            if (kzVar5 != null) {
                this.M = false;
                this.f34405y0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.S = 0;
            }
            this.P.a();
            this.e.requestLayout();
        }
    }

    public final void r0() {
        this.f34379e0 = -1;
        this.f34381f0 = -1;
        this.f34384i0 = -1;
        this.f34385j0 = -1;
        this.f34382g0 = -1;
        this.f34383h0 = -1;
        this.f34386k0 = -1;
        this.f34387l0 = -1;
        this.f34390o0 = -1;
        this.f34391p0 = -1;
        this.f34394r0 = -1;
        this.f34396s0 = -1;
        this.f34392q0 = -1;
        this.f34397t0 = -1;
        this.f34389n0 = -1;
        this.f34398u0 = 0;
        boolean z4 = this.f34373a0;
        if (!z4 || !this.F) {
            this.f34379e0 = 0;
            this.f34381f0 = 1;
            this.f34384i0 = 2;
            this.f34398u0 = 4;
            this.f34385j0 = 3;
        }
        int i10 = this.f34404y;
        if (i10 != 0) {
            int i11 = this.f34398u0;
            this.f34386k0 = i11;
            this.f34398u0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f34398u0;
            this.f34398u0 = i12 + 1;
            this.f34387l0 = i12;
        }
        int i13 = this.f34398u0;
        int i14 = i13 + 1;
        this.f34398u0 = i14;
        this.m0 = i13;
        if (!z4 || !this.F) {
            int i15 = i13 + 2;
            this.f34398u0 = i15;
            this.f34389n0 = i14;
            if (z4) {
                int i16 = i13 + 3;
                this.f34398u0 = i16;
                this.f34396s0 = i15;
                if (this.G) {
                    this.f34398u0 = i13 + 4;
                    this.f34394r0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f34380f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f34398u0;
                this.f34398u0 = i17 + 1;
                this.f34390o0 = i17;
            }
            int i18 = this.K;
            if (i18 != 1) {
                int i19 = this.f34398u0;
                this.f34398u0 = i19 + 1;
                this.f34391p0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f34398u0;
                this.f34398u0 = i20 + 1;
                this.f34392q0 = i20;
            }
            int i21 = this.f34398u0;
            int i22 = i21 + 1;
            this.f34398u0 = i22;
            this.f34397t0 = i21;
            if (this.I) {
                this.f34382g0 = i22;
                this.f34398u0 = i21 + 3;
                this.f34383h0 = i21 + 2;
            }
        }
    }
}
