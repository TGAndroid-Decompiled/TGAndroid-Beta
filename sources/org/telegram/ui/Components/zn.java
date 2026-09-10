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
import org.telegram.ui.ic1;
public final class zn extends qi implements zv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f29731m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public rz E;
    public int E0;
    public final bi.b5 F;
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
    public final ph.r Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.l9 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f29732a0;
    public boolean f29733a1;
    public boolean f29734b0;
    public int f29735b1;
    public boolean f29736c0;
    public int f29737c1;
    public boolean f29738d0;
    public int f29739d1;
    public final boolean f29740e0;
    public boolean f29741e1;
    public boolean f29742f0;
    public boolean f29743f1;
    public boolean f29744g0;
    public org.telegram.ui.Cells.e6 f29745g1;
    public boolean f29746h0;
    public boolean f29747h1;
    public boolean f29748i0;
    public boolean f29749i1;
    public yn f29750j0;
    public in f29751j1;
    public int f29752k0;
    public int f29753k1;
    public int f29754l0;
    public final ph.f l1;
    public int m0;
    public final boolean f29755n;
    public int f29756n0;
    public int f29757o0;
    public int f29758p0;
    public int f29759q0;
    public final xn f29760r;
    public int f29761r0;
    public final ic1 f29762s;
    public int f29763s0;
    public int f29764t0;
    public int f29765u0;
    public final nn v;
    public int f29766v0;
    public final gg.j0 f29767w;
    public int f29768w0;
    public final pn f29769x;
    public int f29770x0;
    public final s40 f29771y;
    public int f29772y0;
    public int f29773z0;

    public zn(yi yiVar, Context context, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, yiVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f29734b0 = true;
        this.f29742f0 = true;
        this.f29744g0 = true;
        this.f29752k0 = -1;
        c2.a aVar = new c2.a(this);
        this.M0 = aVar;
        c2.a aVar2 = new c2.a(this);
        this.N0 = aVar2;
        this.O0 = new c2.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.l9(this, 6);
        this.V0 = false;
        this.W0 = -1;
        this.f29747h1 = false;
        this.f29749i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new ph.f();
        this.f29755n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f26422b.J1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f29736c0 = booleanValue;
            this.f29740e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.f26421a));
        this.f26422b.f29403r1.setDelegate(this);
        xn xnVar = new xn(this, context);
        this.f29760r = xnVar;
        ic1 ic1Var = new ic1(context, 4, null);
        this.f29762s = ic1Var;
        this.f26423c = ic1Var;
        this.d = ic1Var;
        this.h = true;
        this.f26424f = true;
        nn nnVar = new nn(this);
        this.v = nnVar;
        ic1Var.setItemAnimator(nnVar);
        arrayList.clear();
        nnVar.f41645m = false;
        nnVar.C = false;
        nnVar.o(wr.h);
        nnVar.n(350L);
        ic1Var.setClipToPadding(false);
        ic1Var.setVerticalScrollBarEnabled(false);
        ic1Var.setSections(true);
        gg.j0 j0Var = new gg.j0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, ic1Var, 4);
        this.f29767w = j0Var;
        ic1Var.setLayoutManager(j0Var);
        j0Var.O = true;
        new s4.y(new ai.k(this, 2)).d(ic1Var);
        addView(ic1Var, w7.a6.e(-1, -1, 51));
        ic1Var.setPreserveFocusAfterLayout(true);
        ic1Var.setAdapter(xnVar);
        ic1Var.setOnItemClickListener(new cn(this, f6Var, yiVar, context));
        ic1Var.setOnScrollListener(new bi.a2(this, 20));
        s40 s40Var = new s40(context, 4);
        this.f29771y = s40Var;
        s40Var.setAlpha(0.0f);
        s40Var.setVisibility(4);
        addView(s40Var, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f26422b.J1).config.pollCaptionLengthMax.get();
        this.Q = new ph.r(this.f26422b.J1);
        NotificationCenter.getInstance(this.f26422b.J1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? zy0Var = new zy0(context, this.f26422b.J1, null, f6Var);
            this.f29769x = zy0Var;
            zy0Var.f29841y = true;
            zy0Var.E = true;
            zy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) zy0Var, w7.a6.e(-2, 160, 51));
        }
        this.F = new bi.b5(this.f26422b.f29403r1, false, null);
        T();
    }

    public static void K(zn znVar, int i10) {
        s40 s40Var = znVar.f29771y;
        s4.c1 K = znVar.f29762s.K(znVar.f29764t0 + i10);
        if (K != null) {
            View view = K.f41610a;
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                if (e6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    pn pnVar = znVar.f29769x;
                    if (pnVar != null) {
                        pnVar.f();
                    }
                    s40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    s40Var.f(e6Var.getCheckBox(), true);
                    ImageView imageView = s40Var.f26937c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    s40Var.setTranslationY(s40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void L(org.telegram.ui.Components.zn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zn.L(org.telegram.ui.Components.zn, android.view.View, int):void");
    }

    public static void M(zn znVar, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        if (znVar.I && z10) {
            if (znVar.f29745g1 == e6Var && znVar.f29733a1 && znVar.f29747h1) {
                znVar.W();
                znVar.f29733a1 = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = znVar.f29745g1;
            znVar.f29745g1 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            dh emojiButton = e6Var.getEmojiButton();
            bh bhVar = bh.e;
            emojiButton.j(bhVar, false);
            ic1 ic1Var = znVar.f29762s;
            View F = ic1Var.F(e6Var);
            if (F == null) {
                T = null;
            } else {
                T = ic1Var.T(F);
            }
            pn pnVar = znVar.f29769x;
            if (pnVar != null) {
                pnVar.f();
                if (T != null) {
                    View view = T.f41610a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && pnVar.getDelegate() != view) {
                        pnVar.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 != null && e6Var2 != e6Var) {
                if (znVar.f29733a1) {
                    znVar.W();
                    znVar.Z(false);
                    znVar.c0();
                }
                e6Var2.setEmojiButtonVisibility(false);
                e6Var2.getEmojiButton().j(bhVar, false);
            }
        }
    }

    public static void N(zn znVar, org.telegram.ui.Cells.e6 e6Var) {
        znVar.f29745g1 = e6Var;
        if (znVar.f29733a1) {
            znVar.W();
            znVar.c0();
            return;
        }
        znVar.f0(1);
    }

    public static void O(zn znVar, int i10) {
        yi yiVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i11;
        ph.f fVar = znVar.l1;
        if (fVar.b(i10) != null) {
            ph.e b10 = fVar.b(i10);
            if (b10 != null && (yiVar = znVar.f26422b) != null && (p2Var = yiVar.f29366f0) != null) {
                Activity parentActivity = p2Var.getParentActivity();
                if (b10 instanceof qh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((qh.d) b10).f41015b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new fn(znVar, i10), null);
                    return;
                } else if (b10 instanceof qh.h) {
                    qh.h hVar = (qh.h) b10;
                    org.telegram.ui.tt.q().w(parentActivity);
                    org.telegram.ui.tt.q().v(new hn(znVar, i10));
                    org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                    TLRPC.Document document = hVar.f41026b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f41027c, znVar.f26421a, 200);
                    return;
                } else if (b10 instanceof qh.c) {
                    qh.c cVar = (qh.c) b10;
                    String str = cVar.d;
                    znVar.g0(i10, new org.telegram.ui.wf(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f41013f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof qh.g) {
                    qh.g gVar = (qh.g) b10;
                    TLRPC.Document document2 = gVar.f41024b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    znVar.g0(i10, new bi.n6(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof qh.f) {
                    znVar.g0(i10, new aj((qh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof qh.e) {
                    qh.e eVar = (qh.e) b10;
                    d5.g0(znVar.getContext(), znVar.f26421a, eVar.f41017b, eVar.f41020n, new ym(znVar, i10, 1), new zm(znVar, i10, 0));
                    return;
                } else {
                    znVar.b0(i10);
                    return;
                }
            }
            return;
        }
        znVar.b0(i10);
    }

    public static CharSequence Y(CharSequence charSequence) {
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

    public static in d0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback, rg rgVar) {
        if (p2Var == null) {
            return null;
        }
        in inVar = new in(p2Var.getContext(), p2Var, p2Var.getResourceProvider(), rgVar);
        inVar.Z1 = new kn(callback, p2Var, inVar);
        inVar.a2 = new ln(callback, inVar);
        inVar.f29378j0.f0();
        inVar.J1(1, true);
        inVar.h1(i10);
        inVar.f29411t2 = new an(callback);
        inVar.X = new mn(callback, p2Var, inVar);
        inVar.Y = new km(3, callback, inVar);
        inVar.r1();
        inVar.setFocusable(true);
        inVar.show();
        return inVar;
    }

    private int getAnswersMaxCount() {
        if (this.f29755n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        yi yiVar = this.f26422b;
        if (yiVar != null) {
            return yiVar.J1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(qi qiVar) {
        yi yiVar = this.f26422b;
        try {
            yiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f29755n) {
            yiVar.X0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f29740e0) {
            yiVar.X0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            yiVar.X0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        yiVar.W1();
        this.f29767w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f29762s.x0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f29741e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f29739d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f29739d1).commit();
                } else {
                    this.f29737c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f29737c1).commit();
                }
            }
            boolean z13 = this.f29733a1;
            yi yiVar = this.f26422b;
            bi.b5 b5Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f29739d1;
                } else {
                    i11 = this.f29737c1;
                }
                if (this.f29747h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f29749i1 != this.f29747h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f29735b1 = layoutParams.height;
                    b5Var.a();
                    yiVar.f29403r1.requestLayout();
                    boolean z14 = this.f29749i1;
                    if (z14 != this.f29747h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f29749i1 = this.f29747h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f29741e1;
                org.telegram.ui.Cells.e6 e6Var = this.f29745g1;
                if (e6Var != null) {
                    if (e6Var.getEditField().isFocused() && b5Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f29741e1 = z12;
                } else {
                    this.f29741e1 = false;
                }
                if (this.f29741e1 && this.f29733a1) {
                    f0(0);
                }
                if (this.f29735b1 != 0 && !(z11 = this.f29741e1) && z11 != z15 && !this.f29733a1) {
                    this.f29735b1 = 0;
                    b5Var.a();
                    yiVar.f29403r1.requestLayout();
                }
                if (this.f29741e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    public final void P() {
        pn pnVar = this.f29769x;
        if (pnVar != null) {
            pnVar.setDelegate(null);
            pnVar.f();
        }
        this.f29762s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        xn xnVar = this.f29760r;
        if (i11 == length) {
            xnVar.u(this.f29765u0);
        }
        xnVar.o(this.f29765u0);
        h0();
        this.f29752k0 = (this.f29764t0 + this.M) - 1;
        xnVar.m(this.f29766v0);
        xnVar.m(this.A0);
    }

    public final void Q(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.og(this, f7, 2));
        ofFloat.addListener(new en(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10;
        if (!this.f29736c0 && !this.f29732a0) {
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
        s4.c1 K = this.f29762s.K(i10);
        if (K == null) {
            this.f29760r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) K.f41610a;
        if (!z10) {
            b6Var.setChecked(false);
        }
        b6Var.getCheckBox().f21282a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.N)) && TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && this.l1.f40409a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(Y(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f26422b.f29366f0.getParentActivity());
            boolean z11 = this.f29755n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f17528a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            hc.b.s(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f29736c0;
        CharSequence[] charSequenceArr = this.K;
        if (z11) {
            int i13 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.L;
                if (i13 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(Y(charSequenceArr[i13])) && zArr[i13]) {
                    i10++;
                }
                i13++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.f29755n;
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
        if ((!TextUtils.isEmpty(Y(this.O)) && this.O.length() > this.S0) || ((!TextUtils.isEmpty(Y(this.P)) && this.P.length() > 200) || TextUtils.isEmpty(Y(this.N)) || this.N.length() > i11)) {
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
            if (!TextUtils.isEmpty(Y(charSequenceArr[i14]))) {
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
        if (i15 < 1 || (this.f29736c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f40409a.size() <= 0) {
            this.f29746h0 = true;
        } else {
            this.f29746h0 = false;
        }
        boolean z14 = this.f29746h0;
        yi yiVar = this.f26422b;
        yiVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        yiVar.W1();
    }

    public final void U(org.telegram.ui.Cells.s8 s8Var, boolean z10) {
        if (this.V != 0) {
            s8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            s8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            s8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(qh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f41017b;
        ph.r rVar = this.Q;
        boolean containsKey = rVar.f40451c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f40450b.get(eVar.f41017b);
        le.b bVar = eVar.f41022s;
        ImageReceiver imageReceiver = eVar.f40408a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f41021r.a(z11, z10);
        eVar.f41020n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            bVar.a(true, z10);
            return;
        }
        bVar.a(false, z10);
        imageReceiver.clearImage();
    }

    public final void W() {
        if (this.f29747h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f29735b1 = layoutParams.height;
            this.f29749i1 = this.f29747h1;
            this.f29747h1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.e6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zn.X(android.view.View, org.telegram.ui.Cells.e6, boolean):void");
    }

    public final void Z(boolean z10) {
        if (this.I) {
            if (this.f29733a1) {
                rz rzVar = this.E;
                rzVar.P.B0();
                rzVar.I.scrollTo(0, 0);
                rzVar.H(1);
                rzVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.A();
                }
                this.f29747h1 = false;
                f0(0);
            }
            if (z10) {
                rz rzVar2 = this.E;
                if (rzVar2 != null && rzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new bn(this, 0));
                    this.f29743f1 = true;
                    ofFloat.addListener(new en(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        rz rzVar;
        dh emojiButton;
        if (!this.f29733a1 && (rzVar = this.E) != null && rzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.f29745g1;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(bh.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f29735b1;
        this.f29735b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    public final void b0(int i10) {
        int i11;
        this.f29753k1 = i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26422b.f29366f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f29751j1 = d0(p2Var, i11, new ym(this, i10, 0), new rg(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.e6 e6Var = this.f29745g1;
        if (e6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = e6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        f0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f29741e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            org.telegram.ui.Cells.l9 l9Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            AndroidUtilities.runOnUIThread(l9Var, 100L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.i iVar = (a0.i) objArr[0];
            for (Map.Entry entry : this.Q.f40450b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) iVar.f(((TLRPC.WebPage) entry.getValue()).f17348id)) != null) {
                    entry.setValue(webPage);
                }
            }
            ph.f fVar = this.l1;
            int size = fVar.f40409a.size();
            for (int i12 = 0; i12 < size; i12++) {
                ph.e eVar = (ph.e) fVar.f40409a.get(i12);
                if (eVar instanceof qh.e) {
                    V((qh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            rz rzVar = this.E;
            if (rzVar != null) {
                rzVar.P.e1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f29745g1;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.f29745g1.getEditField().setTextColor(-1);
                this.f29745g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, ph.e eVar) {
        int i11;
        ph.f fVar = this.l1;
        if (eVar != null) {
            fVar.f40409a.put(i10, eVar);
        } else {
            fVar.f40409a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f29756n0;
        } else if (i10 == -3) {
            i11 = this.f29758p0;
        } else {
            int i12 = this.f29764t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.c1 K = this.f29762s.K(i11);
            if (K != null) {
                View view = K.f41610a;
                if (view instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view).e.a(eVar, true);
                }
            }
            this.f29760r.m(i11);
        }
        if (eVar instanceof qh.e) {
            qh.e eVar2 = (qh.e) eVar;
            String str = eVar2.f41017b;
            bi.k6 k6Var = new bi.k6(8, this, eVar);
            ph.r rVar = this.Q;
            HashMap hashMap = rVar.f40451c;
            HashMap hashMap2 = rVar.f40450b;
            if (hashMap2.containsKey(str)) {
                k6Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(k6Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.f40449a).sendRequestTyped(getwebpagepreview, new Object(), new bi.k6(18, rVar, str));
                }
            }
            V(eVar2, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.e6 e6Var;
        if (this.I) {
            bi.b5 b5Var = this.F;
            dh dhVar = null;
            yi yiVar = this.f26422b;
            if (i10 == 1) {
                rz rzVar = this.E;
                if (rzVar != null && rzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rz rzVar2 = this.E;
                if (rzVar2 != null && rzVar2.f26805c1 != UserConfig.selectedAccount) {
                    yiVar.f29403r1.removeView(rzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    rz rzVar3 = new rz(null, true, false, false, getContext(), true, null, null, true, this.f26421a, false, false);
                    this.E = rzVar3;
                    rzVar3.f26803c = 3;
                    rzVar3.f26867w0 = false;
                    rzVar3.f26873x2 = false;
                    rzVar3.setShouldDrawBackground(false);
                    rz rzVar4 = this.E;
                    rzVar4.U0 = false;
                    rzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new dn(this));
                    yiVar.f29403r1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f29733a1 = true;
                rz rzVar5 = this.E;
                if (this.f29737c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f29737c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f29737c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f29739d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f29739d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f29739d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f29739d1;
                } else {
                    i11 = this.f29737c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                rzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (e6Var = this.f29745g1) != null) {
                    AndroidUtilities.hideKeyboard(e6Var.getEditField());
                }
                this.f29735b1 = i11;
                b5Var.a();
                yiVar.f29403r1.requestLayout();
                org.telegram.ui.Cells.e6 e6Var2 = this.f29745g1;
                if (e6Var2 != null) {
                    dhVar = e6Var2.getEmojiButton();
                }
                if (dhVar != null) {
                    dhVar.j(bh.d, true);
                }
                if (!z10 && !this.f29741e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29735b1, 0.0f);
                    ofFloat.addUpdateListener(new bn(this, 1));
                    ofFloat.addListener(new en(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e6 e6Var3 = this.f29745g1;
            if (e6Var3 != null) {
                dhVar = e6Var3.getEmojiButton();
            }
            if (dhVar != null) {
                dhVar.j(bh.e, true);
            }
            rz rzVar6 = this.E;
            if (rzVar6 != null) {
                this.f29733a1 = false;
                this.f29747h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    rzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f29735b1 = 0;
            }
            b5Var.a();
            yiVar.f29403r1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.X0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        w70 F = w70.F(this, null, new View(getContext()));
        F.f28701s = 0;
        F.f28702t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new zm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new zm(this, i10, 2), true);
        km0 km0Var = new km0(getContext(), this.f26421a);
        F.f28696p = new org.telegram.ui.se(km0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        km0Var.e(F);
        bh.d c10 = km0Var.f24755n.c(null, null, false);
        c10.n(dh.c.k(km0Var.f24752b));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.e = true;
        c10.p(AndroidUtilities.dp(16.0f));
        km0Var.F = c10;
        km0Var.E = (Drawable) callbackReturn.run(km0Var.f24757s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        km0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) km0Var.f24759x.getLayoutParams()).gravity = 1;
        km0Var.L = true;
        km0Var.show();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        s4.c1 T;
        int i10;
        ic1 ic1Var = this.f29762s;
        if (ic1Var.getChildCount() <= 1 || (childAt = ic1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = ic1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        fl0 fl0Var = (fl0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && fl0Var != null && fl0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || fl0Var == null || fl0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f29735b1;
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        ic1 ic1Var = this.f29762s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f17872a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 16, new Class[]{qn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 48, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 4, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 8388608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.f18091m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 8388608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 8388608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 196608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 262144, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f18056k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 32, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ic1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z10;
        this.f29757o0 = -1;
        this.f29758p0 = -1;
        this.f29759q0 = -1;
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
        aVar.f4071b = -1;
        c2.a aVar2 = this.N0;
        aVar2.f4071b = -1;
        this.L0 = -1;
        this.f29772y0 = -1;
        this.f29773z0 = -1;
        this.f29765u0 = -1;
        this.f29764t0 = -1;
        this.f29770x0 = -1;
        this.f29756n0 = -1;
        this.f29754l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f29755n;
        if (!z11) {
            this.Q0 = 4;
            this.f29756n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f29761r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f29763s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f29764t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f29765u0 = i14;
        }
        int i15 = this.Q0;
        this.f29766v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f29768w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f29773z0 = i16;
            if (this.f29744g0) {
                this.Q0 = i15 + 4;
                this.f29772y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.eo) this.f26422b.f29366f0).e;
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
                this.f29732a0 = true;
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
                aVar.f4071b = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                aVar2.f4071b = i21 + 4;
                if (aVar2.f4070a) {
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
            this.f29770x0 = i26;
            if (this.f29736c0) {
                this.f29757o0 = i27;
                this.f29758p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f29759q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final boolean i() {
        if (this.f29733a1) {
            Z(true);
            return true;
        } else if (!S()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void m() {
        this.H = true;
        yi yiVar = this.f26422b;
        NotificationCenter.getInstance(yiVar.J1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            rz rzVar = this.E;
            if (rzVar != null) {
                yiVar.f29403r1.removeView(rzVar);
            }
        }
    }

    @Override
    public final boolean p() {
        if (!S()) {
            return false;
        }
        return true;
    }

    @Override
    public final void q() {
        this.f26422b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f29748i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f7) {
        this.f26422b.W1();
    }

    public void setDelegate(yn ynVar) {
        this.f29750j0 = ynVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f29755n;
            int i11 = 0;
            int i12 = 1;
            yi yiVar = this.f26422b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {Y(this.N)};
                int i13 = yiVar.J1;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (entities != null) {
                    int size = entities.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.MessageEntity messageEntity = entities.get(i14);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f29744g0;
                if (z12 && this.f29742f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i15]))) {
                        CharSequence[] charSequenceArr3 = {Y(charSequenceArr[i15])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (entities2 != null) {
                            int size2 = entities2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i16);
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
                        todoItem.f17340id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                d5.a0(i13, yiVar.j1() + 1, yiVar.n1(), new h7(this, (org.telegram.ui.eo) yiVar.f29366f0, tL_messageMediaToDo, 1));
                return;
            }
            boolean z13 = this.f29736c0;
            ic1 ic1Var = this.f29762s;
            boolean[] zArr = this.L;
            if (z13 && !this.X0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f29764t0; i18 < this.f29764t0 + this.M; i18++) {
                        s4.c1 K = ic1Var.K(i18);
                        if (K != null) {
                            View view = K.f41610a;
                            if (view instanceof org.telegram.ui.Cells.e6) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                                if (e6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    pn pnVar = this.f29769x;
                                    if (pnVar != null) {
                                        pnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    s40 s40Var = this.f29771y;
                                    s40Var.setText(string);
                                    s40Var.f(e6Var.getCheckBox(), true);
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
            int i19 = 0;
            while (true) {
                int length = charSequenceArr.length;
                ph.f fVar = this.l1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && fVar.b(i19) != null) {
                        this.V0 = true;
                        this.W0 = i19;
                        ic1Var.x0(this.f29764t0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.N)};
                    int i20 = yiVar.J1;
                    ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i20).getEntities(charSequenceArr4, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (entities3 != null) {
                        int size3 = entities3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.MessageEntity messageEntity3 = entities3.get(i21);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f29734b0;
                    tL_poll.quiz = this.f29736c0;
                    tL_poll.public_voters = !this.f29732a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f4070a;
                    if (this.N0.f4070a) {
                        ArrayList arrayList = this.P0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.U;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.V;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.W;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = entities3;
                    ArrayList arrayList2 = new ArrayList(this.J);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(Y(charSequenceArr[i24]))) {
                            fVar.h(tL_messageMediaPoll.poll.answers.size());
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i12];
                            charSequenceArr5[i11] = Y(charSequenceArr[i24]);
                            ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i20).getEntities(charSequenceArr5, i12);
                            CharSequence charSequence4 = charSequenceArr5[i11];
                            if (entities4 != null) {
                                int size4 = entities4.size();
                                for (int i25 = 0; i25 < size4; i25++) {
                                    TLRPC.MessageEntity messageEntity4 = entities4.get(i25);
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                }
                            }
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = entities4;
                            tL_pollAnswer.option = r11;
                            byte[] bArr = {(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                            if ((this.f29734b0 || this.f29736c0) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = 0;
                        i12 = 1;
                    }
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence Y = Y(this.P);
                    if (Y != null) {
                        tL_messageMediaPoll.results.solution = Y.toString();
                        ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i20).getEntities(new CharSequence[]{Y}, true);
                        if (entities5 != null && !entities5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = entities5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    d5.a0(i20, yiVar.j1() + 1, yiVar.n1(), new gg.u1(this, (org.telegram.ui.eo) yiVar.f29366f0, tL_messageMediaPoll, arrayList2, 5));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        xn xnVar = this.f29760r;
        if (xnVar != null) {
            xnVar.l();
        }
        if (this.I) {
            Z(false);
            pn pnVar = this.f29769x;
            if (pnVar != null) {
                pnVar.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f29745g1;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.f29745g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f29745g1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zn.y(int, int):void");
    }
}
