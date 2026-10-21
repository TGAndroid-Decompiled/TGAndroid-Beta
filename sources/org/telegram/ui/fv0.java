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
public final class fv0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.kw0 {
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
    public org.telegram.ui.Components.iz0 Q;
    public org.telegram.ui.Components.tz R;
    public ei.b4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.u0 f37098a;
    public boolean f37099a0;
    public dv0 f37100b;
    public org.telegram.ui.Cells.c6 f37101b0;
    public sa1 f37102c;
    public final boolean f37103c0;
    public s4.b0 d;
    public final boolean f37104d0;
    public id e;
    public ev0 f37105e0;
    public final qn f37106f;
    public boolean f37107f0;
    public int f37108g0;
    public org.telegram.ui.Components.r40 h;
    public int f37109h0;
    public int f37110i0;
    public int f37111j0;
    public int f37112k0;
    public int f37113l0;
    public int m0;
    public final int f37114n;
    public int f37115n0;
    public int f37116o0;
    public int f37117p0;
    public int f37118q0;
    public int[] f37119r;
    public int f37120r0;
    public int f37121s;
    public int f37122s0;
    public int f37123t0;
    public int f37124u0;
    public final CharSequence[] v;
    public int f37125v0;
    public final boolean[] f37126w;
    public int f37127w0;
    public int f37128x;
    public int f37129x0;
    public int f37130y;
    public final a6 f37131y0;
    public TLRPC.MessageMedia f37132z0;

    public fv0(qn qnVar) {
        super(null);
        this.f37130y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f37108g0 = -1;
        this.f37131y0 = new a6(this, 12);
        this.f37104d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f37114n = i10;
        this.v = new CharSequence[i10];
        this.f37126w = new boolean[i10];
        this.f37106f = qnVar;
        this.f37103c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(fv0 fv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = fv0Var.f37104d0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == fv0Var.f37110i0) {
                if (z10) {
                    i14 = fv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = fv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == fv0Var.f37111j0) {
                Editable editable = fv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = fv0Var.f37115n0;
                if (i10 >= i18 && i10 < fv0Var.f37130y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
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
            float f7 = i14;
            if (i13 <= f7 - (0.7f * f7)) {
                c6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.j5 textView2 = c6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.h6.f21211p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.h6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void d0(fv0 fv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.b1 T;
        if (fv0Var.f37103c0 && z10) {
            if (fv0Var.f37101b0 == c6Var && fv0Var.P && fv0Var.B0) {
                fv0Var.j0();
                fv0Var.P = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = fv0Var.f37101b0;
            fv0Var.f37101b0 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ah emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.yg ygVar = org.telegram.ui.Components.yg.e;
            emojiButton.j(ygVar, false);
            sa1 sa1Var = fv0Var.f37102c;
            View F = sa1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = sa1Var.T(F);
            }
            org.telegram.ui.Components.iz0 iz0Var = fv0Var.Q;
            if (iz0Var != null) {
                iz0Var.f();
                org.telegram.ui.Components.iz0 iz0Var2 = fv0Var.Q;
                if (iz0Var2 != null && T != null) {
                    View view = T.f45917a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && iz0Var2.getDelegate() != view) {
                        fv0Var.Q.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (fv0Var.P) {
                    fv0Var.j0();
                    fv0Var.k0(false);
                    fv0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void e0(fv0 fv0Var, org.telegram.ui.Cells.c6 c6Var) {
        fv0Var.f37101b0 = c6Var;
        if (fv0Var.P) {
            fv0Var.j0();
            fv0Var.m0();
            return;
        }
        fv0Var.q0(1);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f37103c0) {
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
            if (this.Z != i10 || this.f37099a0 != z10) {
                this.Z = i10;
                this.f37099a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.c6 c6Var = this.f37101b0;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
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
                    AndroidUtilities.cancelRunOnUIThread(this.f37131y0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.h6.f21397z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f37104d0;
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
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new xu0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
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
        this.f37098a = n10.e(1, upperCase);
        this.f37100b = new dv0(this, context);
        id idVar = new id(3, context, this);
        this.e = idVar;
        idVar.setDelegate(this);
        id idVar2 = this.e;
        this.fragmentView = idVar2;
        idVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f37102c = new sa1(context, 11, null);
        s4.k kVar3 = new s4.k();
        kVar3.f45951m = false;
        kVar3.C = false;
        kVar3.o(org.telegram.ui.Components.bs.h);
        kVar3.n(350L);
        this.f37102c.setItemAnimator(kVar3);
        this.f37102c.setVerticalScrollBarEnabled(false);
        ((s4.k) this.f37102c.getItemAnimator()).C = false;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        this.f37102c.setLayoutManager(b0Var);
        new s4.y(new di.f(this, 6)).d(this.f37102c);
        frameLayout.addView(this.f37102c, w7.z5.e(-1, -1, 51));
        this.f37102c.setAdapter(this.f37100b);
        this.f37102c.setOnItemClickListener(new i(this, 24));
        this.f37102c.setOnScrollListener(new k3(this, 23));
        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(context, 4);
        this.h = r40Var;
        r40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f37103c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.iz0 iz0Var = new org.telegram.ui.Components.iz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = iz0Var;
            iz0Var.f27366y = true;
            iz0Var.E = true;
            iz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
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
                tzVar.P.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f37101b0;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f37101b0.getEditField().setTextColor(-1);
                this.f37101b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.iz0 iz0Var = this.Q;
        if (iz0Var != null) {
            iz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f37130y;
        this.f37126w[i11] = false;
        int i12 = i11 + 1;
        this.f37130y = i12;
        if (this.f37119r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f37119r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f37121s + 1;
                    this.f37121s = i10;
                }
                iArr[i13] = i10;
            }
            this.f37119r = iArr;
        }
        if (this.f37130y == this.v.length) {
            this.f37100b.u(this.f37116o0);
        }
        this.f37100b.o(this.f37116o0);
        r0();
        this.f37107f0 = false;
        this.f37108g0 = (this.f37115n0 + this.f37130y) - 1;
        this.f37100b.m(this.f37117p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new dg(this, f7, 3));
        ofFloat.addListener(new yu0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21632w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.v8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21269s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f21211p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        int i13 = org.telegram.ui.ActionBar.h6.f21153m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f21118k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21395z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        int i15 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 32, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37102c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f37132z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f37130y, charSequenceArr.length); i13++) {
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
                for (int i15 = 0; i15 < this.f37130y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f37104d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20605a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20605a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new pp0(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f20605a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f37108g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false);
            if (this.actionBar.t()) {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21344w8, false);
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
        if (this.f37103c0) {
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
                    ofFloat.addUpdateListener(new wu0(this, 1));
                    ofFloat.addListener(new yu0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21632w);
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
            org.telegram.ui.Cells.c6 c6Var = this.f37101b0;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
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
        EditTextBoldCursor editField = this.f37101b0.getEditField();
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
            a6 a6Var = this.f37131y0;
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            AndroidUtilities.runOnUIThread(a6Var, 100L);
        }
    }

    public final void n0(og ogVar) {
        this.f37105e0 = ogVar;
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
        if (this.f37107f0 && this.f37108g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f37102c.getChildCount()) {
                    view = this.f37102c.getChildAt(i10);
                    this.f37102c.getClass();
                    if (RecyclerView.R(view) == this.f37108g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.c6) {
                AndroidUtilities.runOnUIThread(new ah(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
                this.f37108g0 = -1;
            }
            this.f37107f0 = false;
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
        if (this.f37103c0) {
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
        if (this.f37103c0) {
            k0(false);
            org.telegram.ui.Components.iz0 iz0Var = this.Q;
            if (iz0Var != null) {
                iz0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f37101b0;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f37101b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f37101b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dv0 dv0Var = this.f37100b;
        if (dv0Var != null) {
            dv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f37132z0 = messageMedia;
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
            this.f37130y = size;
            this.f37128x = size;
            this.f37121s = 0;
            this.f37119r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f37130y;
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
                this.f37119r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20421id;
                this.f37121s = Math.max(this.f37121s, this.f37119r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f37130y = i11 + 1;
                r0();
                this.f37107f0 = true;
                int i13 = this.f37115n0;
                if (i10 < 0) {
                    i10 = this.f37130y - 1;
                }
                this.f37108g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.f37103c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.tz tzVar = this.R;
                if (tzVar != null && tzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.tz tzVar2 = this.R;
                if (tzVar2 != null && tzVar2.f30723c1 != UserConfig.selectedAccount) {
                    this.e.removeView(tzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.tz tzVar3 = new org.telegram.ui.Components.tz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = tzVar3;
                    tzVar3.f30787w2 = false;
                    tzVar3.U0 = false;
                    tzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new zu0(this));
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
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f37101b0) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.ah emojiButton = this.f37101b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.yg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new wu0(this, 0));
                    ofFloat.addListener(new yu0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21632w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ah emojiButton2 = this.f37101b0.getEmojiButton();
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
        this.f37109h0 = -1;
        this.f37110i0 = -1;
        this.f37113l0 = -1;
        this.m0 = -1;
        this.f37111j0 = -1;
        this.f37112k0 = -1;
        this.f37115n0 = -1;
        this.f37116o0 = -1;
        this.f37120r0 = -1;
        this.f37122s0 = -1;
        this.f37124u0 = -1;
        this.f37125v0 = -1;
        this.f37123t0 = -1;
        this.f37127w0 = -1;
        this.f37118q0 = -1;
        this.f37129x0 = 0;
        boolean z10 = this.f37104d0;
        if (!z10 || !this.I) {
            this.f37109h0 = 0;
            this.f37110i0 = 1;
            this.f37113l0 = 2;
            this.f37129x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f37130y;
        if (i10 != 0) {
            int i11 = this.f37129x0;
            this.f37115n0 = i11;
            this.f37129x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f37129x0;
            this.f37129x0 = i12 + 1;
            this.f37116o0 = i12;
        }
        int i13 = this.f37129x0;
        int i14 = i13 + 1;
        this.f37129x0 = i14;
        this.f37117p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f37129x0 = i15;
            this.f37118q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f37129x0 = i16;
                this.f37125v0 = i15;
                if (this.J) {
                    this.f37129x0 = i13 + 4;
                    this.f37124u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f37106f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f37129x0;
                this.f37129x0 = i17 + 1;
                this.f37120r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f37129x0;
                this.f37129x0 = i19 + 1;
                this.f37122s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f37129x0;
                this.f37129x0 = i20 + 1;
                this.f37123t0 = i20;
            }
            int i21 = this.f37129x0;
            int i22 = i21 + 1;
            this.f37129x0 = i22;
            this.f37127w0 = i21;
            if (this.L) {
                this.f37111j0 = i22;
                this.f37129x0 = i21 + 3;
                this.f37112k0 = i21 + 2;
            }
        }
    }
}
