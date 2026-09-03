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
public final class mv0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.pv0 {
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
    public org.telegram.ui.Cells.b6 Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 f36229a;
    public final boolean f36230a0;
    public kv0 f36231b;
    public lv0 f36232b0;
    public rb1 f36233c;
    public boolean f36234c0;
    public f2.i0 d;
    public int f36235d0;
    public ld e;
    public int f36236e0;
    public final zn f36237f;
    public int f36238f0;
    public int f36239g0;
    public org.telegram.ui.Components.l40 h;
    public int f36240h0;
    public int f36241i0;
    public int f36242j0;
    public int f36243k0;
    public int f36244l0;
    public int m0;
    public final int f36245n;
    public int f36246n0;
    public int f36247o0;
    public int f36248p0;
    public int f36249q0;
    public int[] f36250r;
    public int f36251r0;
    public int f36252s;
    public int f36253s0;
    public int f36254t0;
    public int f36255u0;
    public final CharSequence[] v;
    public final b6 f36256v0;
    public final boolean[] f36257w;
    public TLRPC.MessageMedia f36258w0;
    public int f36259x;
    public boolean f36260x0;
    public int f36261y;
    public boolean f36262y0;

    public mv0(zn znVar) {
        super(null);
        this.f36261y = 1;
        this.D = true;
        this.E = false;
        this.G = true;
        this.L = AndroidUtilities.dp(3.0f);
        this.f36235d0 = -1;
        this.f36256v0 = new b6(this, 12);
        this.f36230a0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f36245n = i10;
        this.v = new CharSequence[i10];
        this.f36257w = new boolean[i10];
        this.f36237f = znVar;
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
        boolean z4 = mv0Var.f36230a0;
        if (view instanceof org.telegram.ui.Cells.b6) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            if (i10 == mv0Var.f36238f0) {
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
            } else if (i10 == mv0Var.f36239g0) {
                Editable editable = mv0Var.C;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = mv0Var.f36243k0;
                if (i10 >= i18 && i10 < mv0Var.f36261y + i18) {
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
                b6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.k5 textView2 = b6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.j6.f20097p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.j6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            b6Var.setText2("");
        }
    }

    public static void d0(mv0 mv0Var, org.telegram.ui.Cells.b6 b6Var, boolean z4) {
        f2.l1 T;
        if (mv0Var.Z && z4) {
            if (mv0Var.Y == b6Var && mv0Var.M && mv0Var.f36262y0) {
                mv0Var.j0();
                mv0Var.M = false;
            }
            org.telegram.ui.Cells.b6 b6Var2 = mv0Var.Y;
            mv0Var.Y = b6Var;
            b6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = b6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.e;
            emojiButton.j(ogVar, false);
            rb1 rb1Var = mv0Var.f36233c;
            View F = rb1Var.F(b6Var);
            if (F == null) {
                T = null;
            } else {
                T = rb1Var.T(F);
            }
            org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
                org.telegram.ui.Components.qy0 qy0Var2 = mv0Var.N;
                if (qy0Var2 != null && T != null) {
                    View view = T.f5774a;
                    if ((view instanceof org.telegram.ui.Cells.b6) && qy0Var2.getDelegate() != view) {
                        mv0Var.N.setDelegate((org.telegram.ui.Cells.b6) view);
                    }
                }
            }
            if (b6Var2 != null && b6Var2 != b6Var) {
                if (mv0Var.M) {
                    mv0Var.j0();
                    mv0Var.k0(false);
                    mv0Var.m0();
                }
                b6Var2.setEmojiButtonVisibility(false);
                b6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void e0(mv0 mv0Var, org.telegram.ui.Cells.b6 b6Var) {
        mv0Var.Y = b6Var;
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
                if (this.f36262y0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f36260x0 != this.f36262y0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.O.setLayoutParams(layoutParams);
                    this.S = layoutParams.height;
                    this.P.a();
                    this.e.requestLayout();
                    boolean z12 = this.f36260x0;
                    if (z12 != this.f36262y0) {
                        if (z12) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.f36260x0 = this.f36262y0;
                }
            }
            if (this.W != i10 || this.X != z4) {
                this.W = i10;
                this.X = z4;
                boolean z13 = this.V;
                org.telegram.ui.Cells.b6 b6Var = this.Y;
                if (b6Var != null) {
                    if (b6Var.getEditField().isFocused() && this.P.c() && i10 > 0) {
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
                    AndroidUtilities.cancelRunOnUIThread(this.f36256v0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20275z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = this.f36230a0;
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
        this.f36229a = n10.e(1, upperCase);
        this.f36231b = new kv0(this, context);
        ld ldVar = new ld(3, context, this);
        this.e = ldVar;
        ldVar.setDelegate(this);
        ld ldVar2 = this.e;
        this.fragmentView = ldVar2;
        ldVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f36233c = new rb1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.n(350L);
        this.f36233c.setItemAnimator(lVar);
        this.f36233c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f36233c.getItemAnimator()).C = false;
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        this.f36233c.setLayoutManager(i0Var);
        new f2.e0(new oh.f(this, 6)).d(this.f36233c);
        frameLayout.addView(this.f36233c, k7.b6.e(-1, -1, 51));
        this.f36233c.setAdapter(this.f36231b);
        this.f36233c.setOnItemClickListener(new j(this, 23));
        this.f36233c.setOnScrollListener(new n3(this, 23));
        org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(context, 4);
        this.h = l40Var;
        l40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(context, this.currentAccount, null, this.resourceProvider);
            this.N = qy0Var;
            qy0Var.f28327y = true;
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
                kzVar.M.e1();
            }
            org.telegram.ui.Cells.b6 b6Var = this.Y;
            if (b6Var != null) {
                int currentTextColor = b6Var.getEditField().getCurrentTextColor();
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
        int i11 = this.f36261y;
        this.f36257w[i11] = false;
        int i12 = i11 + 1;
        this.f36261y = i12;
        if (this.f36250r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f36250r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f36252s + 1;
                    this.f36252s = i10;
                }
                iArr[i13] = i10;
            }
            this.f36250r = iArr;
        }
        if (this.f36261y == this.v.length) {
            this.f36231b.u(this.f36244l0);
        }
        this.f36231b.o(this.f36244l0);
        r0();
        this.f36234c0 = false;
        this.f36235d0 = (this.f36243k0 + this.f36261y) - 1;
        this.f36231b.m(this.m0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ig(this, f10, 3));
        ofFloat.addListener(new fv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.b6.class, org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f20097p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 4, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i13 = org.telegram.ui.ActionBar.j6.f20042m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 196608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 262144, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f20007k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20115q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 32, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36233c, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f36258w0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f36261y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.F && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.pn.Y(this.B))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.pn.Y(this.B));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f36261y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.pn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z12 = isEmpty;
        }
        if (z4 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f36230a0;
            if (z13) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f19478a.O = LocaleController.getString(i10);
            if (z13) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f19478a);
        }
        return z12;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f36235d0 < 0) {
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
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20221w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f36262y0) {
            this.O.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.O.setLayoutParams(layoutParams);
            this.S = layoutParams.height;
            this.f36260x0 = this.f36262y0;
            this.f36262y0 = false;
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
                this.f36262y0 = false;
                q0(0);
            }
            if (z4) {
                org.telegram.ui.Components.kz kzVar2 = this.O;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O.getMeasuredHeight());
                    ofFloat.addUpdateListener(new dv0(this, 1));
                    ofFloat.addListener(new fv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
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
            org.telegram.ui.Cells.b6 b6Var = this.Y;
            if (b6Var != null && (emojiButton = b6Var.getEmojiButton()) != null) {
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
            b6 b6Var = this.f36256v0;
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            AndroidUtilities.runOnUIThread(b6Var, 100L);
        }
    }

    public final void n0(tg tgVar) {
        this.f36232b0 = tgVar;
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
        if (this.f36234c0 && this.f36235d0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f36233c.getChildCount()) {
                    view = this.f36233c.getChildAt(i10);
                    this.f36233c.getClass();
                    if (RecyclerView.R(view) == this.f36235d0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.b6) {
                AndroidUtilities.runOnUIThread(new eh(5, ((org.telegram.ui.Cells.b6) view).getTextView()), 300L);
                this.f36235d0 = -1;
            }
            this.f36234c0 = false;
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
            org.telegram.ui.Cells.b6 b6Var = this.Y;
            if (b6Var != null) {
                b6Var.setEmojiButtonVisibility(false);
                this.Y.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.Y.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        kv0 kv0Var = this.f36231b;
        if (kv0Var != null) {
            kv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z4, int i10) {
        int i11;
        this.f36258w0 = messageMedia;
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
            this.f36261y = size;
            this.f36259x = size;
            this.f36252s = 0;
            this.f36250r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f36261y;
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
                this.f36250r[i12] = tL_messageMediaToDo.todo.list.get(i12).f19304id;
                this.f36252s = Math.max(this.f36252s, this.f36250r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.G = todoList.others_can_complete;
            this.E = todoList.others_can_append;
            if (this.F) {
                this.f36261y = i11 + 1;
                r0();
                this.f36234c0 = true;
                int i13 = this.f36243k0;
                if (i10 < 0) {
                    i10 = this.f36261y - 1;
                }
                this.f36235d0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.Cells.b6 b6Var;
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
                    kzVar3.f26487u2 = false;
                    kzVar3.R0 = false;
                    kzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.O.setForseMultiwindowLayout(true);
                    }
                    this.O.setDelegate(new gv0(this));
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
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (b6Var = this.Y) != null) {
                    AndroidUtilities.hideKeyboard(b6Var.getEditField());
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
                    ofFloat.addUpdateListener(new dv0(this, 0));
                    ofFloat.addListener(new fv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
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
                this.f36262y0 = false;
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
        this.f36236e0 = -1;
        this.f36238f0 = -1;
        this.f36241i0 = -1;
        this.f36242j0 = -1;
        this.f36239g0 = -1;
        this.f36240h0 = -1;
        this.f36243k0 = -1;
        this.f36244l0 = -1;
        this.f36247o0 = -1;
        this.f36248p0 = -1;
        this.f36251r0 = -1;
        this.f36253s0 = -1;
        this.f36249q0 = -1;
        this.f36254t0 = -1;
        this.f36246n0 = -1;
        this.f36255u0 = 0;
        boolean z4 = this.f36230a0;
        if (!z4 || !this.F) {
            this.f36236e0 = 0;
            this.f36238f0 = 1;
            this.f36241i0 = 2;
            this.f36255u0 = 4;
            this.f36242j0 = 3;
        }
        int i10 = this.f36261y;
        if (i10 != 0) {
            int i11 = this.f36255u0;
            this.f36243k0 = i11;
            this.f36255u0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f36255u0;
            this.f36255u0 = i12 + 1;
            this.f36244l0 = i12;
        }
        int i13 = this.f36255u0;
        int i14 = i13 + 1;
        this.f36255u0 = i14;
        this.m0 = i13;
        if (!z4 || !this.F) {
            int i15 = i13 + 2;
            this.f36255u0 = i15;
            this.f36246n0 = i14;
            if (z4) {
                int i16 = i13 + 3;
                this.f36255u0 = i16;
                this.f36253s0 = i15;
                if (this.G) {
                    this.f36255u0 = i13 + 4;
                    this.f36251r0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f36237f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f36255u0;
                this.f36255u0 = i17 + 1;
                this.f36247o0 = i17;
            }
            int i18 = this.K;
            if (i18 != 1) {
                int i19 = this.f36255u0;
                this.f36255u0 = i19 + 1;
                this.f36248p0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f36255u0;
                this.f36255u0 = i20 + 1;
                this.f36249q0 = i20;
            }
            int i21 = this.f36255u0;
            int i22 = i21 + 1;
            this.f36255u0 = i22;
            this.f36254t0 = i21;
            if (this.I) {
                this.f36239g0 = i22;
                this.f36255u0 = i21 + 3;
                this.f36240h0 = i21 + 2;
            }
        }
    }
}
