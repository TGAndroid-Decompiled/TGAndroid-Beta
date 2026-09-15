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
public final class aw0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ov0 {
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
    public org.telegram.ui.Components.ny0 Q;
    public org.telegram.ui.Components.kz R;
    public ci.j4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.v0 f31967a;
    public boolean f31968a0;
    public yv0 f31969b;
    public org.telegram.ui.Cells.c6 f31970b0;
    public dc1 f31971c;
    public final boolean f31972c0;
    public s4.c0 d;
    public final boolean f31973d0;
    public hd e;
    public zv0 f31974e0;
    public final bo f31975f;
    public boolean f31976f0;
    public int f31977g0;
    public org.telegram.ui.Components.i40 h;
    public int f31978h0;
    public int f31979i0;
    public int f31980j0;
    public int f31981k0;
    public int f31982l0;
    public int m0;
    public final int f31983n;
    public int f31984n0;
    public int f31985o0;
    public int f31986p0;
    public int f31987q0;
    public int[] f31988r;
    public int f31989r0;
    public int f31990s;
    public int f31991s0;
    public int f31992t0;
    public int f31993u0;
    public final CharSequence[] v;
    public int f31994v0;
    public final boolean[] f31995w;
    public int f31996w0;
    public int f31997x;
    public int f31998x0;
    public int f31999y;
    public final w5 f32000y0;
    public TLRPC.MessageMedia f32001z0;

    public aw0(bo boVar) {
        super(null);
        this.f31999y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f31977g0 = -1;
        this.f32000y0 = new w5(this, 12);
        this.f31973d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f31983n = i10;
        this.v = new CharSequence[i10];
        this.f31995w = new boolean[i10];
        this.f31975f = boVar;
        this.f31972c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(aw0 aw0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = aw0Var.f31973d0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == aw0Var.f31979i0) {
                if (z10) {
                    i14 = aw0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = aw0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == aw0Var.f31980j0) {
                Editable editable = aw0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = aw0Var.f31984n0;
                if (i10 >= i18 && i10 < aw0Var.f31999y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = aw0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = aw0Var.v[i19];
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
                    i16 = org.telegram.ui.ActionBar.i6.f19056p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.i6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void d0(aw0 aw0Var, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        if (aw0Var.f31972c0 && z10) {
            if (aw0Var.f31970b0 == c6Var && aw0Var.P && aw0Var.B0) {
                aw0Var.j0();
                aw0Var.P = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = aw0Var.f31970b0;
            aw0Var.f31970b0 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.zg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.xg xgVar = org.telegram.ui.Components.xg.e;
            emojiButton.j(xgVar, false);
            dc1 dc1Var = aw0Var.f31971c;
            View F = dc1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = dc1Var.T(F);
            }
            org.telegram.ui.Components.ny0 ny0Var = aw0Var.Q;
            if (ny0Var != null) {
                ny0Var.f();
                org.telegram.ui.Components.ny0 ny0Var2 = aw0Var.Q;
                if (ny0Var2 != null && T != null) {
                    View view = T.f42675a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && ny0Var2.getDelegate() != view) {
                        aw0Var.Q.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (aw0Var.P) {
                    aw0Var.j0();
                    aw0Var.k0(false);
                    aw0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(xgVar, false);
            }
        }
    }

    public static void e0(aw0 aw0Var, org.telegram.ui.Cells.c6 c6Var) {
        aw0Var.f31970b0 = c6Var;
        if (aw0Var.P) {
            aw0Var.j0();
            aw0Var.m0();
            return;
        }
        aw0Var.q0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f31972c0) {
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
            if (this.Z != i10 || this.f31968a0 != z10) {
                this.Z = i10;
                this.f31968a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.c6 c6Var = this.f31970b0;
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
                    AndroidUtilities.cancelRunOnUIThread(this.f32000y0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        kVar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f19239z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f31973d0;
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
        this.actionBar.setActionBarMenuOnItemClick(new sv0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
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
        this.f31967a = n10.e(1, upperCase);
        this.f31969b = new yv0(this, context);
        hd hdVar = new hd(3, context, this);
        this.e = hdVar;
        hdVar.setDelegate(this);
        hd hdVar2 = this.e;
        this.fragmentView = hdVar2;
        hdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f31971c = new dc1(context, 11, null);
        s4.j jVar = new s4.j();
        jVar.f42710m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.n(350L);
        this.f31971c.setItemAnimator(jVar);
        this.f31971c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f31971c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.f31971c.setLayoutManager(c0Var);
        new s4.y(new bi.g(this, 6)).e(this.f31971c);
        frameLayout.addView(this.f31971c, w7.x5.e(-1, -1, 51));
        this.f31971c.setAdapter(this.f31969b);
        this.f31971c.setOnItemClickListener(new i(this, 23));
        this.f31971c.setOnScrollListener(new h3(this, 23));
        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(context, 4);
        this.h = i40Var;
        i40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f31972c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.ny0 ny0Var = new org.telegram.ui.Components.ny0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = ny0Var;
            ny0Var.f26627y = true;
            ny0Var.E = true;
            ny0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.x5.e(-2, 160, 51));
        }
        this.S = new ci.j4(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.kz kzVar = this.R;
            if (kzVar != null) {
                kzVar.P.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f31970b0;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f31970b0.getEditField().setTextColor(-1);
                this.f31970b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.ny0 ny0Var = this.Q;
        if (ny0Var != null) {
            ny0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f31999y;
        this.f31995w[i11] = false;
        int i12 = i11 + 1;
        this.f31999y = i12;
        if (this.f31988r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f31988r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f31990s + 1;
                    this.f31990s = i10;
                }
                iArr[i13] = i10;
            }
            this.f31988r = iArr;
        }
        if (this.f31999y == this.v.length) {
            this.f31969b.u(this.f31985o0);
        }
        this.f31969b.o(this.f31985o0);
        r0();
        this.f31976f0 = false;
        this.f31977g0 = (this.f31984n0 + this.f31999y) - 1;
        this.f31969b.m(this.f31986p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ng(this, f7, 3));
        ofFloat.addListener(new tv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19480w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18836d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f18780a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19113s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19168v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19132t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.f19056p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.H6));
        int i13 = org.telegram.ui.ActionBar.i6.f19001m6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.f18965k7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19237z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        int i15 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18926i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18958k0, null, null, org.telegram.ui.ActionBar.i6.f18837d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31971c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f32001z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f31999y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.un.Y(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.un.Y(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f31999y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.un.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f31973d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f18437a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f18437a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new tl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f18437a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f31977g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aw0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19186w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.B0) {
            this.R.t(false);
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
        if (this.f31972c0) {
            if (this.P) {
                org.telegram.ui.Components.kz kzVar = this.R;
                kzVar.P.B0();
                kzVar.I.scrollTo(0, 0);
                kzVar.G(1);
                kzVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.A();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.kz kzVar2 = this.R;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new qv0(this, 1));
                    ofFloat.addListener(new tv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19480w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.kz kzVar;
        org.telegram.ui.Components.zg emojiButton;
        if (!this.P && (kzVar = this.R) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f31970b0;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.xg.e, false);
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
        EditTextBoldCursor editField = this.f31970b0.getEditField();
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
            w5 w5Var = this.f32000y0;
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            AndroidUtilities.runOnUIThread(w5Var, 100L);
        }
    }

    public final void n0(yg ygVar) {
        this.f31974e0 = ygVar;
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
        if (this.f31976f0 && this.f31977g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f31971c.getChildCount()) {
                    view = this.f31971c.getChildAt(i10);
                    this.f31971c.getClass();
                    if (RecyclerView.R(view) == this.f31977g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.c6) {
                AndroidUtilities.runOnUIThread(new jh(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
                this.f31977g0 = -1;
            }
            this.f31976f0 = false;
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
        if (this.f31972c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.kz kzVar = this.R;
            if (kzVar != null) {
                this.e.removeView(kzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f31972c0) {
            k0(false);
            org.telegram.ui.Components.ny0 ny0Var = this.Q;
            if (ny0Var != null) {
                ny0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f31970b0;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f31970b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f31970b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yv0 yv0Var = this.f31969b;
        if (yv0Var != null) {
            yv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f32001z0 = messageMedia;
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
            this.f31999y = size;
            this.f31997x = size;
            this.f31990s = 0;
            this.f31988r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f31999y;
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
                this.f31988r[i12] = tL_messageMediaToDo.todo.list.get(i12).f18257id;
                this.f31990s = Math.max(this.f31990s, this.f31988r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f31999y = i11 + 1;
                r0();
                this.f31976f0 = true;
                int i13 = this.f31984n0;
                if (i10 < 0) {
                    i10 = this.f31999y - 1;
                }
                this.f31977g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.f31972c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.kz kzVar = this.R;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.kz kzVar2 = this.R;
                if (kzVar2 != null && kzVar2.f25703c1 != UserConfig.selectedAccount) {
                    this.e.removeView(kzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.kz kzVar3 = new org.telegram.ui.Components.kz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = kzVar3;
                    kzVar3.f25767w2 = false;
                    kzVar3.U0 = false;
                    kzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new uv0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.kz kzVar4 = this.R;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
                layoutParams.height = i11;
                kzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f31970b0) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.zg emojiButton = this.f31970b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.xg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new qv0(this, 0));
                    ofFloat.addListener(new tv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19480w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.zg emojiButton2 = this.f31970b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.xg.e, true);
            }
            org.telegram.ui.Components.kz kzVar5 = this.R;
            if (kzVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
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
        this.f31978h0 = -1;
        this.f31979i0 = -1;
        this.f31982l0 = -1;
        this.m0 = -1;
        this.f31980j0 = -1;
        this.f31981k0 = -1;
        this.f31984n0 = -1;
        this.f31985o0 = -1;
        this.f31989r0 = -1;
        this.f31991s0 = -1;
        this.f31993u0 = -1;
        this.f31994v0 = -1;
        this.f31992t0 = -1;
        this.f31996w0 = -1;
        this.f31987q0 = -1;
        this.f31998x0 = 0;
        boolean z10 = this.f31973d0;
        if (!z10 || !this.I) {
            this.f31978h0 = 0;
            this.f31979i0 = 1;
            this.f31982l0 = 2;
            this.f31998x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f31999y;
        if (i10 != 0) {
            int i11 = this.f31998x0;
            this.f31984n0 = i11;
            this.f31998x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f31998x0;
            this.f31998x0 = i12 + 1;
            this.f31985o0 = i12;
        }
        int i13 = this.f31998x0;
        int i14 = i13 + 1;
        this.f31998x0 = i14;
        this.f31986p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f31998x0 = i15;
            this.f31987q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f31998x0 = i16;
                this.f31994v0 = i15;
                if (this.J) {
                    this.f31998x0 = i13 + 4;
                    this.f31993u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f31975f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f31998x0;
                this.f31998x0 = i17 + 1;
                this.f31989r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f31998x0;
                this.f31998x0 = i19 + 1;
                this.f31991s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f31998x0;
                this.f31998x0 = i20 + 1;
                this.f31992t0 = i20;
            }
            int i21 = this.f31998x0;
            int i22 = i21 + 1;
            this.f31998x0 = i22;
            this.f31996w0 = i21;
            if (this.L) {
                this.f31980j0 = i22;
                this.f31998x0 = i21 + 3;
                this.f31981k0 = i21 + 2;
            }
        }
    }
}
