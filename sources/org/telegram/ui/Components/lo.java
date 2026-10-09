package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fc1;
public final class lo extends qi implements rw0, NotificationCenter.NotificationCenterDelegate {
    public static final int f28494m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public a00 E;
    public int E0;
    public final ci.h4 F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final int J;
    public int J0;
    public final CharSequence[] K;
    public int K0;
    public final boolean[] L;
    public int L0;
    public int M;
    public final c2.a M0;
    public Editable N;
    public final c2.a N0;
    public Editable O;
    public final c2.a[] O0;
    public Editable P;
    public final ArrayList P0;
    public final qh.s Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.t6 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f28495a0;
    public boolean f28496a1;
    public boolean f28497b0;
    public int f28498b1;
    public boolean f28499c0;
    public int f28500c1;
    public boolean f28501d0;
    public int f28502d1;
    public final boolean f28503e0;
    public boolean f28504e1;
    public boolean f28505f0;
    public boolean f28506f1;
    public boolean f28507g0;
    public org.telegram.ui.Cells.d6 f28508g1;
    public boolean f28509h0;
    public boolean f28510h1;
    public boolean f28511i0;
    public boolean f28512i1;
    public ko f28513j0;
    public sn f28514j1;
    public int f28515k0;
    public int f28516k1;
    public int f28517l0;
    public final qh.f l1;
    public int m0;
    public final boolean f28518n;
    public int f28519n0;
    public int f28520o0;
    public int f28521p0;
    public int f28522q0;
    public final jo f28523r;
    public int f28524r0;
    public final fc1 f28525s;
    public int f28526s0;
    public int f28527t0;
    public int f28528u0;
    public final xn v;
    public int f28529v0;
    public final hg.f0 f28530w;
    public int f28531w0;
    public final zn f28532x;
    public int f28533x0;
    public final z40 f28534y;
    public int f28535y0;
    public int f28536z0;

    public lo(yi yiVar, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, Boolean bool) {
        super(context, e6Var, yiVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f28497b0 = true;
        this.f28505f0 = true;
        this.f28507g0 = true;
        this.f28515k0 = -1;
        c2.a aVar = new c2.a(this);
        this.M0 = aVar;
        c2.a aVar2 = new c2.a(this);
        this.N0 = aVar2;
        this.O0 = new c2.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.t6(this, 8);
        this.V0 = false;
        this.W0 = -1;
        this.f28510h1 = false;
        this.f28512i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new qh.f();
        this.f28518n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f30173b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f28499c0 = booleanValue;
            this.f28503e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        k0();
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.hl, this.f30172a));
        this.f30173b.f33275u1.setDelegate(this);
        jo joVar = new jo(this, context);
        this.f28523r = joVar;
        fc1 fc1Var = new fc1(context, 5, null);
        this.f28525s = fc1Var;
        this.f30174c = fc1Var;
        this.d = fc1Var;
        this.h = true;
        this.f30176f = true;
        xn xnVar = new xn(this);
        this.v = xnVar;
        fc1Var.setItemAnimator(xnVar);
        arrayList.clear();
        xnVar.f47696m = false;
        xnVar.C = false;
        xnVar.o(hs.h);
        xnVar.n(350L);
        fc1Var.setClipToPadding(false);
        fc1Var.setVerticalScrollBarEnabled(false);
        fc1Var.setSections(true);
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, fc1Var, 4);
        this.f28530w = f0Var;
        fc1Var.setLayoutManager(f0Var);
        f0Var.O = true;
        new s4.z(new bi.g(this, 2)).e(fc1Var);
        addView(fc1Var, w7.x5.e(-1, -1, 51));
        fc1Var.setPreserveFocusAfterLayout(true);
        fc1Var.setAdapter(joVar);
        fc1Var.setOnItemClickListener(new mn(this, e6Var, yiVar, context));
        fc1Var.setOnScrollListener(new ai.r(this, 22));
        z40 z40Var = new z40(context, 4);
        this.f28534y = z40Var;
        z40Var.setAlpha(0.0f);
        z40Var.setVisibility(4);
        addView(z40Var, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
        this.S0 = MessagesController.getInstance(this.f30173b.M1).config.pollCaptionLengthMax.get();
        this.Q = new qh.s(this.f30173b.M1);
        NotificationCenter.getInstance(this.f30173b.M1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? oz0Var = new oz0(context, this.f30173b.M1, null, e6Var);
            this.f28532x = oz0Var;
            oz0Var.f29615y = true;
            oz0Var.E = true;
            oz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) oz0Var, w7.x5.e(-2, 160, 51));
        }
        this.F = new ci.h4(this.f30173b.f33275u1, false, null);
        W();
    }

    public static void N(lo loVar, int i10) {
        z40 z40Var = loVar.f28534y;
        s4.d1 K = loVar.f28525s.K(loVar.f28527t0 + i10);
        if (K != null) {
            View view = K.f47656a;
            if (view instanceof org.telegram.ui.Cells.d6) {
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    zn znVar = loVar.f28532x;
                    if (znVar != null) {
                        znVar.f();
                    }
                    z40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    z40Var.f(d6Var.getCheckBox(), true);
                    ImageView imageView = z40Var.f33458c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    z40Var.setTranslationY(z40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.lo r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo.O(org.telegram.ui.Components.lo, android.view.View, int):void");
    }

    public static void P(lo loVar, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        if (loVar.I && z10) {
            if (loVar.f28508g1 == d6Var && loVar.f28496a1 && loVar.f28510h1) {
                loVar.Z();
                loVar.f28496a1 = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = loVar.f28508g1;
            loVar.f28508g1 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            dh emojiButton = d6Var.getEmojiButton();
            bh bhVar = bh.f25015e;
            emojiButton.j(bhVar, false);
            fc1 fc1Var = loVar.f28525s;
            View F = fc1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = fc1Var.T(F);
            }
            zn znVar = loVar.f28532x;
            if (znVar != null) {
                znVar.f();
                if (T != null) {
                    View view = T.f47656a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && znVar.getDelegate() != view) {
                        znVar.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (loVar.f28496a1) {
                    loVar.Z();
                    loVar.c0(false);
                    loVar.f0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(bhVar, false);
            }
        }
    }

    public static void Q(lo loVar, org.telegram.ui.Cells.d6 d6Var) {
        loVar.f28508g1 = d6Var;
        if (loVar.f28496a1) {
            loVar.Z();
            loVar.f0();
            return;
        }
        loVar.i0(1);
    }

    public static void R(lo loVar, int i10) {
        yi yiVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i11;
        qh.f fVar = loVar.l1;
        if (fVar.b(i10) != null) {
            qh.e b10 = fVar.b(i10);
            if (b10 != null && (yiVar = loVar.f30173b) != null && (n2Var = yiVar.f33228f0) != null) {
                Activity parentActivity = n2Var.getParentActivity();
                if (b10 instanceof rh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((rh.d) b10).f47549b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().g2(arrayList, 0, 14, false, new pn(loVar, i10), null);
                    return;
                } else if (b10 instanceof rh.h) {
                    rh.h hVar = (rh.h) b10;
                    org.telegram.ui.rt.q().w(parentActivity);
                    org.telegram.ui.rt.q().v(new rn(loVar, i10));
                    org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                    TLRPC.Document document = hVar.f47561b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f47562c, loVar.f30172a, 200);
                    return;
                } else if (b10 instanceof rh.c) {
                    rh.c cVar = (rh.c) b10;
                    String str = cVar.d;
                    loVar.j0(i10, new org.telegram.ui.wf(1, str, AndroidUtilities.formatFileSize(cVar.f47546e, true, true) + " " + cVar.f47547f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof rh.g) {
                    rh.g gVar = (rh.g) b10;
                    TLRPC.Document document2 = gVar.f47559b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    loVar.j0(i10, new ci.n5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof rh.f) {
                    loVar.j0(i10, new aj((rh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof rh.e) {
                    rh.e eVar = (rh.e) b10;
                    g5.f0(loVar.getContext(), loVar.f30172a, eVar.f47551b, eVar.f47555n, new in(loVar, i10, 1), new jn(loVar, i10, 0));
                    return;
                } else {
                    loVar.e0(i10);
                    return;
                }
            }
            return;
        }
        loVar.e0(i10);
    }

    public static CharSequence b0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence);
        while (TextUtils.indexOf(trimmedString, "\n\n\n") >= 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(trimmedString, "\n\n\n") == 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return trimmedString;
    }

    public static sn g0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, rg rgVar) {
        if (n2Var == null) {
            return null;
        }
        sn snVar = new sn(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), rgVar);
        snVar.f33219c2 = new un(callback, n2Var, snVar);
        snVar.f33222d2 = new vn(callback, snVar);
        snVar.f33240j0.f0();
        snVar.N1(1, true);
        snVar.j1(i10);
        snVar.f33283w2 = new kn(callback);
        snVar.X = new wn(callback, n2Var, snVar);
        snVar.Y = new y2(9, callback, snVar);
        snVar.t1();
        snVar.setFocusable(true);
        snVar.show();
        return snVar;
    }

    private int getAnswersMaxCount() {
        if (this.f28518n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        yi yiVar = this.f30173b;
        if (yiVar != null) {
            return yiVar.M1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void B() {
        jo joVar = this.f28523r;
        if (joVar != null) {
            joVar.l();
        }
        if (this.I) {
            c0(false);
            zn znVar = this.f28532x;
            if (znVar != null) {
                znVar.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f28508g1;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f28508g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f28508g1.getEditField());
            }
        }
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        yi yiVar = this.f30173b;
        try {
            yiVar.f33211a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f28518n) {
            yiVar.f33211a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f28503e0) {
            yiVar.f33211a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            yiVar.f33211a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        yiVar.a2();
        this.f28530w.h1(0, 0);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f28504e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f28502d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f28502d1).commit();
                } else {
                    this.f28500c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f28500c1).commit();
                }
            }
            boolean z13 = this.f28496a1;
            yi yiVar = this.f30173b;
            ci.h4 h4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f28502d1;
                } else {
                    i11 = this.f28500c1;
                }
                if (this.f28510h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f28512i1 != this.f28510h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f28498b1 = layoutParams.height;
                    h4Var.a();
                    yiVar.f33275u1.requestLayout();
                    boolean z14 = this.f28512i1;
                    if (z14 != this.f28510h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        T(dp);
                    }
                    this.f28512i1 = this.f28510h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f28504e1;
                org.telegram.ui.Cells.d6 d6Var = this.f28508g1;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && h4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f28504e1 = z12;
                } else {
                    this.f28504e1 = false;
                }
                if (this.f28504e1 && this.f28496a1) {
                    i0(0);
                }
                if (this.f28498b1 != 0 && !(z11 = this.f28504e1) && z11 != z15 && !this.f28496a1) {
                    this.f28498b1 = 0;
                    h4Var.a();
                    yiVar.f33275u1.requestLayout();
                }
                if (this.f28504e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    @Override
    public final void J() {
        this.f28525s.x0(1);
    }

    public final void S() {
        zn znVar = this.f28532x;
        if (znVar != null) {
            znVar.setDelegate(null);
            znVar.f();
        }
        this.f28525s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        jo joVar = this.f28523r;
        if (i11 == length) {
            joVar.u(this.f28528u0);
        }
        joVar.o(this.f28528u0);
        k0();
        this.f28515k0 = (this.f28527t0 + this.M) - 1;
        joVar.m(this.f28529v0);
        joVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.lg(this, f7, 2));
        ofFloat.addListener(new on(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f28499c0 && !this.f28495a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.T = false;
        }
        int i10 = this.C0;
        if (i10 < 0) {
            return;
        }
        s4.d1 K = this.f28525s.K(i10);
        if (K == null) {
            this.f28523r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f47656a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f24337a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.l1.f46676a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f30173b.f33228f0.getParentActivity());
            boolean z11 = this.f28518n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20374a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20374a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            hg.c.p(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f28499c0;
        CharSequence[] charSequenceArr = this.K;
        if (z11) {
            int i13 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.L;
                if (i13 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(b0(charSequenceArr[i13])) && zArr[i13]) {
                    i10++;
                }
                i13++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.f28518n;
        if (z12) {
            i11 = getMessagesController().todoTitleLengthMax;
        } else {
            i11 = 255;
        }
        if (z12) {
            i12 = getMessagesController().todoItemLengthMax;
        } else {
            i12 = 100;
        }
        if ((!TextUtils.isEmpty(b0(this.O)) && this.O.length() > this.S0) || ((!TextUtils.isEmpty(b0(this.P)) && this.P.length() > 200) || TextUtils.isEmpty(b0(this.N)) || this.N.length() > i11)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(b0(charSequenceArr[i14]))) {
                if (charSequenceArr[i14].length() > i12) {
                    i15 = 0;
                    z13 = true;
                    break;
                }
                i15++;
                z13 = true;
            }
            i14++;
        }
        if (i15 < 1 || (this.f28499c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f46676a.size() <= 0) {
            this.f28509h0 = true;
        } else {
            this.f28509h0 = false;
        }
        boolean z14 = this.f28509h0;
        yi yiVar = this.f30173b;
        yiVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        yiVar.a2();
    }

    public final void X(org.telegram.ui.Cells.r8 r8Var, boolean z10) {
        if (this.V != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void Y(rh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f47551b;
        qh.s sVar = this.Q;
        boolean containsKey = sVar.f46724c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) sVar.f46723b.get(eVar.f47551b);
        me.b bVar = eVar.f47557s;
        ImageReceiver imageReceiver = eVar.f46675a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f47556r.a(z11, z10);
        eVar.f47555n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            bVar.a(true, z10);
            return;
        }
        bVar.a(false, z10);
        imageReceiver.clearImage();
    }

    public final void Z() {
        if (this.f28510h1) {
            this.E.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f28498b1 = layoutParams.height;
            this.f28512i1 = this.f28510h1;
            this.f28510h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.d6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo.a0(android.view.View, org.telegram.ui.Cells.d6, boolean):void");
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f28496a1) {
                a00 a00Var = this.E;
                a00Var.P.B0();
                a00Var.I.scrollTo(0, 0);
                a00Var.F(1);
                a00Var.Q.h1(0, 0);
                this.E.u(false);
                if (z10) {
                    this.E.C();
                }
                this.f28510h1 = false;
                i0(0);
            }
            if (z10) {
                a00 a00Var2 = this.E;
                if (a00Var2 != null && a00Var2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new ln(this, 0));
                    this.f28506f1 = true;
                    ofFloat.addListener(new on(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        a00 a00Var;
        dh emojiButton;
        if (!this.f28496a1 && (a00Var = this.E) != null && a00Var.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f28508g1;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(bh.f25015e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f28498b1;
        this.f28498b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.i iVar = (a0.i) objArr[0];
            for (Map.Entry entry : this.Q.f46723b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) iVar.f(((TLRPC.WebPage) entry.getValue()).f20191id)) != null) {
                    entry.setValue(webPage);
                }
            }
            qh.f fVar = this.l1;
            int size = fVar.f46676a.size();
            for (int i12 = 0; i12 < size; i12++) {
                qh.e eVar = (qh.e) fVar.f46676a.get(i12);
                if (eVar instanceof rh.e) {
                    Y((rh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            a00 a00Var = this.E;
            if (a00Var != null) {
                a00Var.P.f1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f28508g1;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f28508g1.getEditField().setTextColor(-1);
                this.f28508g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.f28516k1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30173b.f33228f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f28514j1 = g0(n2Var, i11, new in(this, i10, 0), new rg(this, 26));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.d6 d6Var = this.f28508g1;
        if (d6Var != null) {
            this.F.f5161e = true;
            EditTextBoldCursor editField = d6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        i0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f28504e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            org.telegram.ui.Cells.t6 t6Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var, 100L);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        s4.d1 T;
        int i10;
        fc1 fc1Var = this.f28525s;
        if (fc1Var.getChildCount() <= 1 || (childAt = fc1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = fc1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = fc1Var.T(F);
        }
        am0 am0Var = (am0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && am0Var != null && am0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || am0Var == null || am0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f28498b1;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.R0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        fc1 fc1Var = this.f28525s;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f20761b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f20741a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 16, new Class[]{ao.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i13 = org.telegram.ui.ActionBar.i6.f21018p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.H6));
        int i15 = org.telegram.ui.ActionBar.i6.f20962m6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.i6.f20926k7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        int i17 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.il));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, qh.e eVar) {
        int i11;
        qh.f fVar = this.l1;
        if (eVar != null) {
            fVar.f46676a.put(i10, eVar);
        } else {
            fVar.f46676a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f28519n0;
        } else if (i10 == -3) {
            i11 = this.f28521p0;
        } else {
            int i12 = this.f28527t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.d1 K = this.f28525s.K(i11);
            if (K != null) {
                View view = K.f47656a;
                if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).f21974e.a(eVar, true);
                }
            }
            this.f28523r.m(i11);
        }
        if (eVar instanceof rh.e) {
            rh.e eVar2 = (rh.e) eVar;
            String str = eVar2.f47551b;
            ai.m0 m0Var = new ai.m0(10, this, eVar);
            qh.s sVar = this.Q;
            HashMap hashMap = sVar.f46724c;
            HashMap hashMap2 = sVar.f46723b;
            if (hashMap2.containsKey(str)) {
                m0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(m0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(sVar.f46722a).sendRequestTyped(getwebpagepreview, new Object(), new qh.r(0, sVar, str));
                }
            }
            Y(eVar2, false);
        }
        W();
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.I) {
            ci.h4 h4Var = this.F;
            dh dhVar = null;
            yi yiVar = this.f30173b;
            if (i10 == 1) {
                a00 a00Var = this.E;
                if (a00Var != null && a00Var.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a00 a00Var2 = this.E;
                if (a00Var2 != null && a00Var2.f24401c1 != UserConfig.selectedAccount) {
                    yiVar.f33275u1.removeView(a00Var2);
                    this.E = null;
                }
                if (this.E == null) {
                    a00 a00Var3 = new a00(null, true, false, false, getContext(), true, null, null, true, this.f30172a, false, false);
                    this.E = a00Var3;
                    a00Var3.f24399c = 3;
                    a00Var3.f24464w0 = false;
                    a00Var3.f24466w2 = false;
                    a00Var3.setShouldDrawBackground(false);
                    a00 a00Var4 = this.E;
                    a00Var4.U0 = false;
                    a00Var4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new nn(this));
                    yiVar.f33275u1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f28496a1 = true;
                a00 a00Var5 = this.E;
                if (this.f28500c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28500c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28500c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f28502d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28502d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28502d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f28502d1;
                } else {
                    i11 = this.f28500c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a00Var5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                a00Var5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f28508g1) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.f28498b1 = i11;
                h4Var.a();
                yiVar.f33275u1.requestLayout();
                org.telegram.ui.Cells.d6 d6Var2 = this.f28508g1;
                if (d6Var2 != null) {
                    dhVar = d6Var2.getEmojiButton();
                }
                if (dhVar != null) {
                    dhVar.j(bh.d, true);
                }
                if (!z10 && !this.f28504e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28498b1, 0.0f);
                    ofFloat.addUpdateListener(new ln(this, 1));
                    ofFloat.addListener(new on(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d6 d6Var3 = this.f28508g1;
            if (d6Var3 != null) {
                dhVar = d6Var3.getEmojiButton();
            }
            if (dhVar != null) {
                dhVar.j(bh.f25015e, true);
            }
            a00 a00Var6 = this.E;
            if (a00Var6 != null) {
                this.f28496a1 = false;
                this.f28510h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    a00Var6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f28498b1 = 0;
            }
            h4Var.a();
            yiVar.f33275u1.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f28496a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        p80 F = p80.F(this, null, new View(getContext()));
        F.f29789s = 0;
        F.f29790t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new jn(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jn(this, i10, 2), true);
        gn0 gn0Var = new gn0(getContext(), this.f30172a);
        F.f29784p = new org.telegram.ui.se(gn0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        gn0Var.e(F);
        ch.d c10 = gn0Var.f26820n.c(null, null, false);
        c10.o(eh.b.k(gn0Var.f26816b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f4685j.f4668e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        gn0Var.F = c10;
        gn0Var.E = (Drawable) callbackReturn.run(gn0Var.f26822s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        gn0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) gn0Var.f26824x.getLayoutParams()).gravity = 1;
        gn0Var.L = true;
        gn0Var.show();
    }

    public final void k0() {
        boolean z10;
        this.f28520o0 = -1;
        this.f28521p0 = -1;
        this.f28522q0 = -1;
        this.F0 = -1;
        this.B0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.C0 = -1;
        this.E0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        c2.a aVar = this.M0;
        aVar.f3994b = -1;
        c2.a aVar2 = this.N0;
        aVar2.f3994b = -1;
        this.L0 = -1;
        this.f28535y0 = -1;
        this.f28536z0 = -1;
        this.f28528u0 = -1;
        this.f28527t0 = -1;
        this.f28533x0 = -1;
        this.f28519n0 = -1;
        this.f28517l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f28518n;
        if (!z11) {
            this.Q0 = 4;
            this.f28519n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f28524r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f28526s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f28527t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f28528u0 = i14;
        }
        int i15 = this.Q0;
        this.f28529v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f28531w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f28536z0 = i16;
            if (this.f28507g0) {
                this.Q0 = i15 + 4;
                this.f28535y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.zn) this.f30173b.f33228f0).f44751e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i18 = this.Q0;
                this.Q0 = i18 + 1;
                this.B0 = i18;
            } else {
                this.f28495a0 = true;
            }
            int i19 = this.Q0;
            int i20 = i19 + 1;
            this.Q0 = i20;
            this.F0 = i19;
            if (!z10) {
                this.Q0 = i19 + 2;
                this.C0 = i20;
            } else {
                this.T = false;
            }
            int i21 = this.Q0;
            this.D0 = i21;
            this.E0 = i21 + 1;
            int i22 = i21 + 3;
            this.Q0 = i22;
            this.G0 = i21 + 2;
            if (z10) {
                aVar.f3994b = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                aVar2.f3994b = i21 + 4;
                if (aVar2.f3993a) {
                    this.Q0 = i21 + 6;
                    this.L0 = i23;
                }
            }
            int i24 = this.Q0;
            int i25 = i24 + 1;
            this.Q0 = i25;
            this.H0 = i24;
            if (this.U != 0 || this.V != 0) {
                this.I0 = i25;
                this.J0 = i24 + 2;
                this.Q0 = i24 + 4;
                this.K0 = i24 + 3;
            }
            int i26 = this.Q0;
            int i27 = i26 + 1;
            this.Q0 = i27;
            this.f28533x0 = i26;
            if (this.f28499c0) {
                this.f28520o0 = i27;
                this.f28521p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f28522q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void p() {
        this.H = true;
        yi yiVar = this.f30173b;
        NotificationCenter.getInstance(yiVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            a00 a00Var = this.E;
            if (a00Var != null) {
                yiVar.f33275u1.removeView(a00Var);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f28511i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!V()) {
            return false;
        }
        return true;
    }

    public void setDelegate(ko koVar) {
        this.f28513j0 = koVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        this.f30173b.a2();
    }

    @Override
    public final void v(float f7) {
        this.f30173b.a2();
    }

    @Override
    public final void w(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f28518n;
            int i12 = 0;
            int i13 = 1;
            yi yiVar = this.f30173b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {b0(this.N)};
                int i14 = yiVar.M1;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (entities != null) {
                    int size = entities.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.MessageEntity messageEntity = entities.get(i15);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f28507g0;
                if (z12 && this.f28505f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                for (int i16 = 0; i16 < charSequenceArr.length; i16++) {
                    if (!TextUtils.isEmpty(b0(charSequenceArr[i16]))) {
                        CharSequence[] charSequenceArr3 = {b0(charSequenceArr[i16])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (entities2 != null) {
                            int size2 = entities2.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i17);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        todoItem.f20183id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                g5.Z(i14, yiVar.l1() + 1, yiVar.p1(), new ai.d5(this, (org.telegram.ui.zn) yiVar.f33228f0, tL_messageMediaToDo, 6));
                return;
            }
            boolean z13 = this.f28499c0;
            fc1 fc1Var = this.f28525s;
            boolean[] zArr = this.L;
            if (z13 && !this.X0) {
                int i18 = 0;
                while (i12 < zArr.length) {
                    if (!TextUtils.isEmpty(b0(charSequenceArr[i12])) && zArr[i12]) {
                        i18++;
                    }
                    i12++;
                }
                if (i18 <= 0) {
                    for (int i19 = this.f28527t0; i19 < this.f28527t0 + this.M; i19++) {
                        s4.d1 K = fc1Var.K(i19);
                        if (K != null) {
                            View view = K.f47656a;
                            if (view instanceof org.telegram.ui.Cells.d6) {
                                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    zn znVar = this.f28532x;
                                    if (znVar != null) {
                                        znVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    z40 z40Var = this.f28534y;
                                    z40Var.setText(string);
                                    z40Var.f(d6Var.getCheckBox(), true);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int i20 = 0;
            while (true) {
                int length = charSequenceArr.length;
                qh.f fVar = this.l1;
                if (i20 < length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && fVar.b(i20) != null) {
                        this.V0 = true;
                        this.W0 = i20;
                        fc1Var.x0(this.f28527t0 + i20);
                        return;
                    }
                    i20++;
                } else {
                    CharSequence[] charSequenceArr4 = {b0(this.N)};
                    int i21 = yiVar.M1;
                    ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i21).getEntities(charSequenceArr4, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (entities3 != null) {
                        int size3 = entities3.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            TLRPC.MessageEntity messageEntity3 = entities3.get(i22);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f28497b0;
                    tL_poll.quiz = this.f28499c0;
                    tL_poll.public_voters = !this.f28495a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f3993a;
                    if (this.N0.f3993a) {
                        ArrayList arrayList = this.P0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i23 = this.U;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_period = i23;
                        poll2.flags |= 16;
                    } else {
                        int i24 = this.V;
                        if (i24 != 0) {
                            poll2.hide_results_until_close = this.W;
                            poll2.close_date = i24;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = entities3;
                    ArrayList arrayList2 = new ArrayList(this.J);
                    int i25 = 0;
                    while (i25 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(b0(charSequenceArr[i25]))) {
                            fVar.h(tL_messageMediaPoll.poll.answers.size());
                            i11 = i12;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i13];
                            charSequenceArr5[i12] = b0(charSequenceArr[i25]);
                            ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i21).getEntities(charSequenceArr5, i13);
                            CharSequence charSequence4 = charSequenceArr5[i12];
                            if (entities4 != null) {
                                int size4 = entities4.size();
                                int i26 = i12;
                                while (i26 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = entities4.get(i26);
                                    int i27 = i12;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i26++;
                                    i12 = i27;
                                }
                            }
                            i11 = i12;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = entities4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i11] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f28497b0 || this.f28499c0) && zArr[i25]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i25++;
                        i12 = i11;
                        i13 = 1;
                    }
                    int i28 = i12;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence b02 = b0(this.P);
                    if (b02 != null) {
                        tL_messageMediaPoll.results.solution = b02.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i28] = b02;
                        ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i21).getEntities(charSequenceArr6, true);
                        if (entities5 != null && !entities5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = entities5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    g5.Z(i21, yiVar.l1() + 1, yiVar.p1(), new ai.f4(this, (org.telegram.ui.zn) yiVar.f33228f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
