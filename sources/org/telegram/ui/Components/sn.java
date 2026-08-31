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
import org.telegram.ui.kb1;
public final class sn extends ei implements pv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f31093j1 = 0;
    public int A0;
    public mz B;
    public int B0;
    public final qh.i3 C;
    public int C0;
    public boolean D;
    public int D0;
    public boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final int G;
    public int G0;
    public final CharSequence[] H;
    public int H0;
    public final boolean[] I;
    public int I0;
    public int J;
    public final b7.l0 J0;
    public Editable K;
    public final b7.l0 K0;
    public Editable L;
    public final b7.l0[] L0;
    public Editable M;
    public final ArrayList M0;
    public final eh.x N;
    public int N0;
    public boolean O;
    public int O0;
    public boolean P;
    public final int P0;
    public boolean Q;
    public final int[] Q0;
    public int R;
    public final m2.b R0;
    public int S;
    public boolean S0;
    public boolean T;
    public int T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public int V0;
    public boolean W;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public boolean f31094a0;
    public int f31095a1;
    public final boolean f31096b0;
    public boolean f31097b1;
    public boolean f31098c0;
    public boolean f31099c1;
    public boolean f31100d0;
    public org.telegram.ui.Cells.c6 f31101d1;
    public boolean f31102e0;
    public boolean f31103e1;
    public boolean f31104f0;
    public boolean f31105f1;
    public rn f31106g0;
    public bn f31107g1;
    public int f31108h0;
    public int f31109h1;
    public int f31110i0;
    public final eh.i f31111i1;
    public int f31112j0;
    public int f31113k0;
    public int f31114l0;
    public int m0;
    public final boolean f31115n;
    public int f31116n0;
    public int f31117o0;
    public int f31118p0;
    public int f31119q0;
    public final qn f31120r;
    public int f31121r0;
    public final kb1 f31122s;
    public int f31123s0;
    public int f31124t0;
    public int f31125u0;
    public final gn v;
    public int f31126v0;
    public final gj f31127w;
    public int f31128w0;
    public final in f31129x;
    public int f31130x0;
    public final m40 f31131y;
    public int f31132y0;
    public int f31133z0;

    public sn(mi miVar, Context context, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, Boolean bool) {
        super(context, g6Var, miVar);
        this.J = 1;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.V = true;
        this.f31098c0 = true;
        this.f31100d0 = true;
        this.f31108h0 = -1;
        b7.l0 l0Var = new b7.l0(this);
        this.J0 = l0Var;
        b7.l0 l0Var2 = new b7.l0(this);
        this.K0 = l0Var2;
        this.L0 = new b7.l0[]{l0Var, l0Var2};
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        this.Q0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.R0 = new m2.b(this, 17);
        this.S0 = false;
        this.T0 = -1;
        this.f31103e1 = false;
        this.f31105f1 = false;
        Paint paint = new Paint(1);
        this.f31111i1 = new eh.i();
        this.f31115n = z4;
        int answersMaxCount = getAnswersMaxCount();
        this.G = answersMaxCount;
        this.H = new CharSequence[answersMaxCount];
        this.I = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f26546b.G1).getUserConfig().isPremium();
        this.F = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.W = booleanValue;
            this.f31096b0 = booleanValue;
            boolean z10 = !booleanValue;
            this.Q = z10;
            this.O = z10;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.hl, this.f26545a));
        this.f26546b.f29078o1.setDelegate(this);
        qn qnVar = new qn(this, context);
        this.f31120r = qnVar;
        kb1 kb1Var = new kb1(context, 4, null);
        this.f31122s = kb1Var;
        this.f26547c = kb1Var;
        this.d = kb1Var;
        this.h = true;
        this.f26549f = true;
        gn gnVar = new gn(this);
        this.v = gnVar;
        kb1Var.setItemAnimator(gnVar);
        arrayList.clear();
        gnVar.f5910m = false;
        gnVar.C = false;
        gnVar.o(pr.h);
        gnVar.n(350L);
        kb1Var.setClipToPadding(false);
        kb1Var.setVerticalScrollBarEnabled(false);
        kb1Var.setSections(true);
        gj gjVar = new gj(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, kb1Var, 3);
        this.f31127w = gjVar;
        kb1Var.setLayoutManager(gjVar);
        gjVar.O = true;
        new f2.f0(new org.telegram.ui.cp(this, 1)).d(kb1Var);
        addView(kb1Var, k7.c6.e(-1, -1, 51));
        kb1Var.setPreserveFocusAfterLayout(true);
        kb1Var.setAdapter(qnVar);
        kb1Var.setOnItemClickListener(new vm(this, g6Var, miVar, context));
        kb1Var.setOnScrollListener(new fg.e2(this, 23));
        m40 m40Var = new m40(context, 4);
        this.f31131y = m40Var;
        m40Var.setAlpha(0.0f);
        m40Var.setVisibility(4);
        addView(m40Var, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.P0 = MessagesController.getInstance(this.f26546b.G1).config.pollCaptionLengthMax.get();
        this.N = new eh.x(this.f26546b.G1);
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? ry0Var = new ry0(context, this.f26546b.G1, null, g6Var);
            this.f31129x = ry0Var;
            ry0Var.f30908y = true;
            ry0Var.B = true;
            ry0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) ry0Var, k7.c6.e(-2, 160, 51));
        }
        this.C = new qh.i3(this.f26546b.f29078o1, false, null);
        T();
    }

    public static void J(sn snVar, int i10) {
        m40 m40Var = snVar.f31131y;
        f2.m1 K = snVar.f31122s.K(snVar.f31119q0 + i10);
        if (K != null) {
            View view = K.f5875a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    in inVar = snVar.f31129x;
                    if (inVar != null) {
                        inVar.f();
                    }
                    m40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    m40Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = m40Var.f28924c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    m40Var.setTranslationY(m40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void K(org.telegram.ui.Components.sn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.K(org.telegram.ui.Components.sn, android.view.View, int):void");
    }

    public static void M(sn snVar, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        if (snVar.F && z4) {
            if (snVar.f31101d1 == c6Var && snVar.X0 && snVar.f31103e1) {
                snVar.W();
                snVar.X0 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = snVar.f31101d1;
            snVar.f31101d1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            qg emojiButton = c6Var.getEmojiButton();
            og ogVar = og.f29750e;
            emojiButton.j(ogVar, false);
            kb1 kb1Var = snVar.f31122s;
            View F = kb1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = kb1Var.T(F);
            }
            in inVar = snVar.f31129x;
            if (inVar != null) {
                inVar.f();
                if (T != null) {
                    View view = T.f5875a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && inVar.getDelegate() != view) {
                        inVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (snVar.X0) {
                    snVar.W();
                    snVar.Z(false);
                    snVar.c0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void N(sn snVar, org.telegram.ui.Cells.c6 c6Var) {
        snVar.f31101d1 = c6Var;
        if (snVar.X0) {
            snVar.W();
            snVar.c0();
            return;
        }
        snVar.f0(1);
    }

    public static void O(sn snVar, int i10) {
        mi miVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i11;
        eh.i iVar = snVar.f31111i1;
        if (iVar.b(i10) != null) {
            eh.h b10 = iVar.b(i10);
            if (b10 != null && (miVar = snVar.f26546b) != null && (p2Var = miVar.f29040c0) != null) {
                Activity parentActivity = p2Var.getParentActivity();
                if (b10 instanceof fh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((fh.d) b10).f6657b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new ym(snVar, i10), null);
                    return;
                } else if (b10 instanceof fh.i) {
                    fh.i iVar2 = (fh.i) b10;
                    org.telegram.ui.qt.q().w(parentActivity);
                    org.telegram.ui.qt.q().v(new an(snVar, i10));
                    org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                    TLRPC.Document document = iVar2.f6671b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q10.t(document, null, "", null, null, i11, false, iVar2.f6672c, snVar.f26545a, 200);
                    return;
                } else if (b10 instanceof fh.c) {
                    fh.c cVar = (fh.c) b10;
                    String str = cVar.d;
                    snVar.g0(i10, new org.telegram.ui.pf(1, str, AndroidUtilities.formatFileSize(cVar.f6654e, true, true) + " " + cVar.f6655f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof fh.h) {
                    fh.h hVar = (fh.h) b10;
                    TLRPC.Document document2 = hVar.f6669b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    snVar.g0(i10, new i(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 1), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof fh.g) {
                    snVar.g0(i10, new oi((fh.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof fh.e) {
                    fh.e eVar = (fh.e) b10;
                    z4.g0(snVar.getContext(), snVar.f26545a, eVar.f6659b, eVar.f6663n, new rm(snVar, i10, 1), new sm(snVar, i10, 0));
                    return;
                } else {
                    snVar.b0(i10);
                    return;
                }
            }
            return;
        }
        snVar.b0(i10);
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

    public static bn d0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback, fg fgVar) {
        if (p2Var == null) {
            return null;
        }
        bn bnVar = new bn(p2Var.getContext(), p2Var, p2Var.getResourceProvider(), fgVar);
        bnVar.W1 = new dn(callback, p2Var, bnVar);
        bnVar.X1 = new en(callback, bnVar);
        bnVar.f29054g0.f0();
        bnVar.J1(1, true);
        bnVar.h1(i10);
        bnVar.f29085q2 = new tm(callback);
        bnVar.U = new fn(callback, p2Var, bnVar);
        bnVar.V = new o1(16, callback, bnVar);
        bnVar.r1();
        bnVar.setFocusable(true);
        bnVar.show();
        return bnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f31115n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        mi miVar = this.f26546b;
        if (miVar != null) {
            return miVar.G1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(ei eiVar) {
        mi miVar = this.f26546b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f31115n) {
            miVar.U0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f31096b0) {
            miVar.U0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            miVar.U0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        miVar.W1();
        this.f31127w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f31122s.x0(1);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        int dp;
        if (this.F) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f31097b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.f31095a1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f31095a1).commit();
                } else {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z0).commit();
                }
            }
            boolean z12 = this.X0;
            mi miVar = this.f26546b;
            qh.i3 i3Var = this.C;
            if (z12) {
                if (z4) {
                    i11 = this.f31095a1;
                } else {
                    i11 = this.Z0;
                }
                if (this.f31103e1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f31105f1 != this.f31103e1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.B.setLayoutParams(layoutParams);
                    this.Y0 = layoutParams.height;
                    i3Var.a();
                    miVar.f29078o1.requestLayout();
                    boolean z13 = this.f31105f1;
                    if (z13 != this.f31103e1) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f31105f1 = this.f31103e1;
                }
            }
            if (this.V0 != i10 || this.W0 != z4) {
                this.V0 = i10;
                this.W0 = z4;
                boolean z14 = this.f31097b1;
                org.telegram.ui.Cells.c6 c6Var = this.f31101d1;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && i3Var.c() && i10 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f31097b1 = z11;
                } else {
                    this.f31097b1 = false;
                }
                if (this.f31097b1 && this.X0) {
                    f0(0);
                }
                if (this.Y0 != 0 && !(z10 = this.f31097b1) && z10 != z14 && !this.X0) {
                    this.Y0 = 0;
                    i3Var.a();
                    miVar.f29078o1.requestLayout();
                }
                if (this.f31097b1 && this.D) {
                    this.D = false;
                    AndroidUtilities.cancelRunOnUIThread(this.R0);
                }
            }
        }
    }

    public final void P() {
        in inVar = this.f31129x;
        if (inVar != null) {
            inVar.setDelegate(null);
            inVar.f();
        }
        this.f31122s.setItemAnimator(this.v);
        int i10 = this.J;
        this.I[i10] = false;
        int i11 = i10 + 1;
        this.J = i11;
        int length = this.H.length;
        qn qnVar = this.f31120r;
        if (i11 == length) {
            qnVar.u(this.f31121r0);
        }
        qnVar.o(this.f31121r0);
        h0();
        this.f31108h0 = (this.f31119q0 + this.J) - 1;
        qnVar.m(this.f31123s0);
        qnVar.m(this.f31130x0);
    }

    public final void Q(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.gg(this, f10, 2));
        ofFloat.addListener(new xm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
        ofFloat.start();
    }

    public final void R() {
        boolean z4;
        if (!this.W && !this.U) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.Q = false;
        }
        int i10 = this.f31133z0;
        if (i10 < 0) {
            return;
        }
        f2.m1 K = this.f31122s.K(i10);
        if (K == null) {
            this.f31120r.m(this.f31133z0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f5875a;
        if (!z4) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f25041a.a(!z4, true);
    }

    public final boolean S() {
        boolean z4;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && TextUtils.isEmpty(Y(this.M)) && this.f31111i1.f5638a.size() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            for (int i12 = 0; i12 < this.J && (z4 = TextUtils.isEmpty(Y(this.H[i12]))); i12++) {
            }
        }
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f26546b.f29040c0.getParentActivity());
            boolean z10 = this.f31115n;
            if (z10) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f21166a.O = LocaleController.getString(i10);
            if (z10) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            l.d.u(R.string.Cancel, alertDialog$Builder, null);
        }
        return z4;
    }

    public final void T() {
        int i10;
        int i11;
        int i12;
        boolean z4;
        boolean z10 = this.W;
        CharSequence[] charSequenceArr = this.H;
        if (z10) {
            int i13 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.I;
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
        boolean z11 = this.f31115n;
        if (z11) {
            i11 = getMessagesController().todoTitleLengthMax;
        } else {
            i11 = 255;
        }
        if (z11) {
            i12 = getMessagesController().todoItemLengthMax;
        } else {
            i12 = 100;
        }
        if ((!TextUtils.isEmpty(Y(this.L)) && this.L.length() > this.P0) || ((!TextUtils.isEmpty(Y(this.M)) && this.M.length() > 200) || TextUtils.isEmpty(Y(this.K)) || this.K.length() > i11)) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(Y(charSequenceArr[i14]))) {
                if (charSequenceArr[i14].length() > i12) {
                    i15 = 0;
                    z12 = true;
                    break;
                }
                i15++;
                z12 = true;
            }
            i14++;
        }
        if (i15 < 1 || (this.W && i10 < 1)) {
            z4 = false;
        }
        if (TextUtils.isEmpty(this.M) && TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L) && !z12 && this.f31111i1.f5638a.size() <= 0) {
            this.f31102e0 = true;
        } else {
            this.f31102e0 = false;
        }
        boolean z13 = this.f31102e0;
        mi miVar = this.f26546b;
        miVar.setAllowNestedScroll(z13);
        this.U0 = z4;
        miVar.W1();
    }

    public final void U(org.telegram.ui.Cells.o8 o8Var, boolean z4) {
        if (this.S != 0) {
            o8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.S), z4, false);
        } else if (this.R != 0) {
            o8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.R / 3600, new Object[0]), z4, false);
        } else {
            o8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z4, false);
        }
    }

    public final void V(fh.e eVar, boolean z4) {
        boolean z10;
        TLRPC.Photo photo;
        String str = eVar.f6659b;
        eh.x xVar = this.N;
        boolean containsKey = xVar.f5687c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) xVar.f5686b.get(eVar.f6659b);
        xd.a aVar = eVar.f6665s;
        ImageReceiver imageReceiver = eVar.f5637a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = false;
        } else {
            z10 = true;
        }
        eVar.f6664r.a(z10, z4);
        eVar.f6663n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z4);
            return;
        }
        aVar.a(false, z4);
        imageReceiver.clearImage();
    }

    public final void W() {
        if (this.f31103e1) {
            this.B.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.B.setLayoutParams(layoutParams);
            this.Y0 = layoutParams.height;
            this.f31105f1 = this.f31103e1;
            this.f31103e1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.c6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.X(android.view.View, org.telegram.ui.Cells.c6, boolean):void");
    }

    public final void Z(boolean z4) {
        if (this.F) {
            if (this.X0) {
                mz mzVar = this.B;
                mzVar.M.B0();
                mzVar.F.scrollTo(0, 0);
                mzVar.G(1);
                mzVar.N.h1(0, 0);
                this.B.t(false);
                if (z4) {
                    this.B.B();
                }
                this.f31103e1 = false;
                f0(0);
            }
            if (z4) {
                mz mzVar2 = this.B;
                if (mzVar2 != null && mzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.B.getMeasuredHeight());
                    ofFloat.addUpdateListener(new um(this, 0));
                    this.f31099c1 = true;
                    ofFloat.addListener(new xm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        mz mzVar;
        qg emojiButton;
        if (!this.X0 && (mzVar = this.B) != null && mzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f31101d1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(og.f29750e, false);
            }
            this.B.setVisibility(8);
        }
        int i10 = this.Y0;
        this.Y0 = 0;
        if (i10 != 0) {
            this.C.a();
        }
    }

    public final void b0(int i10) {
        int i11;
        this.f31109h1 = i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26546b.f29040c0;
        this.f31111i1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f31107g1 = d0(p2Var, i11, new rm(this, i10, 0), new fg(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.c6 c6Var = this.f31101d1;
        if (c6Var != null) {
            this.C.f45412e = true;
            EditTextBoldCursor editField = c6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        f0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f31097b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.D = true;
            m2.b bVar = this.R0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 100L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.N.f5686b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f20996id)) != null) {
                    entry.setValue(webPage);
                }
            }
            eh.i iVar = this.f31111i1;
            int size = iVar.f5638a.size();
            for (int i12 = 0; i12 < size; i12++) {
                eh.h hVar2 = (eh.h) iVar.f5638a.get(i12);
                if (hVar2 instanceof fh.e) {
                    V((fh.e) hVar2, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            mz mzVar = this.B;
            if (mzVar != null) {
                mzVar.M.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f31101d1;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f31101d1.getEditField().setTextColor(-1);
                this.f31101d1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, eh.h hVar) {
        int i11;
        eh.i iVar = this.f31111i1;
        if (hVar != null) {
            iVar.f5638a.put(i10, hVar);
        } else {
            iVar.f5638a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f31113k0;
        } else if (i10 == -3) {
            i11 = this.m0;
        } else {
            int i12 = this.f31119q0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.J) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            f2.m1 K = this.f31122s.K(i11);
            if (K != null) {
                View view = K.f5875a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).f22650e.a(hVar, true);
                }
            }
            this.f31120r.m(i11);
        }
        if (hVar instanceof fh.e) {
            fh.e eVar = (fh.e) hVar;
            String str = eVar.f6659b;
            eh.w wVar = new eh.w(15, this, hVar);
            eh.x xVar = this.N;
            HashMap hashMap = xVar.f5687c;
            HashMap hashMap2 = xVar.f5686b;
            if (hashMap2.containsKey(str)) {
                wVar.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(wVar);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(xVar.f5685a).sendRequestTyped(getwebpagepreview, new Object(), new eh.w(0, xVar, str));
                }
            }
            V(eVar, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.F) {
            qh.i3 i3Var = this.C;
            qg qgVar = null;
            mi miVar = this.f26546b;
            if (i10 == 1) {
                mz mzVar = this.B;
                if (mzVar != null && mzVar.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mz mzVar2 = this.B;
                if (mzVar2 != null && mzVar2.Z0 != UserConfig.selectedAccount) {
                    miVar.f29078o1.removeView(mzVar2);
                    this.B = null;
                }
                if (this.B == null) {
                    mz mzVar3 = new mz(null, true, false, false, getContext(), true, null, null, true, this.f26545a, false, false);
                    this.B = mzVar3;
                    mzVar3.f29270c = 3;
                    mzVar3.f29325t0 = false;
                    mzVar3.f29330u2 = false;
                    mzVar3.setShouldDrawBackground(false);
                    mz mzVar4 = this.B;
                    mzVar4.R0 = false;
                    mzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.B.setForseMultiwindowLayout(true);
                    }
                    this.B.setDelegate(new wm(this));
                    miVar.f29078o1.addView(this.B);
                    this.B.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.B.setVisibility(0);
                this.X0 = true;
                mz mzVar5 = this.B;
                if (this.Z0 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.Z0 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.Z0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f31095a1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f31095a1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f31095a1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f31095a1;
                } else {
                    i11 = this.Z0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                mzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f31101d1) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.Y0 = i11;
                i3Var.a();
                miVar.f29078o1.requestLayout();
                org.telegram.ui.Cells.c6 c6Var2 = this.f31101d1;
                if (c6Var2 != null) {
                    qgVar = c6Var2.getEmojiButton();
                }
                if (qgVar != null) {
                    qgVar.j(og.d, true);
                }
                if (!z4 && !this.f31097b1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y0, 0.0f);
                    ofFloat.addUpdateListener(new um(this, 1));
                    ofFloat.addListener(new xm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c6 c6Var3 = this.f31101d1;
            if (c6Var3 != null) {
                qgVar = c6Var3.getEmojiButton();
            }
            if (qgVar != null) {
                qgVar.j(og.f29750e, true);
            }
            mz mzVar6 = this.B;
            if (mzVar6 != null) {
                this.X0 = false;
                this.f31103e1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    mzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.Y0 = 0;
            }
            i3Var.a();
            miVar.f29078o1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.U0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        q70 F = q70.F(this, null, new View(getContext()));
        F.f30329s = 0;
        F.f30330t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new sm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new sm(this, i10, 2), true);
        jm0 jm0Var = new jm0(getContext(), this.f26545a);
        F.f30324p = new org.telegram.ui.pe(jm0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        jm0Var.e(F);
        qg.b c3 = jm0Var.f28161n.c(null, null, false);
        c3.n(sg.b.j(jm0Var.f28157b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.f44839e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        jm0Var.C = c3;
        jm0Var.B = (Drawable) callbackReturn.run(jm0Var.f28163s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        jm0Var.B.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) jm0Var.f28165x.getLayoutParams()).gravity = 1;
        jm0Var.I = true;
        jm0Var.show();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        f2.m1 T;
        int i10;
        kb1 kb1Var = this.f31122s;
        if (kb1Var.getChildCount() <= 1 || (childAt = kb1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = kb1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        fl0 fl0Var = (fl0) T;
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y10 > 0 && fl0Var != null && fl0Var.b() == 1) {
            i10 = y10;
        } else {
            i10 = 0;
        }
        if (y10 < 0 || fl0Var == null || fl0Var.b() != 1) {
            y10 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.Y0;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.O0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        kb1 kb1Var = this.f31122s;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21605a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 16, new Class[]{jn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i13 = org.telegram.ui.ActionBar.k6.f21876p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        int i15 = org.telegram.ui.ActionBar.k6.f21821m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.f21786k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        int i17 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.il));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(kb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z4;
        this.f31114l0 = -1;
        this.m0 = -1;
        this.f31116n0 = -1;
        this.C0 = -1;
        this.f31132y0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.f31133z0 = -1;
        this.B0 = -1;
        this.A0 = -1;
        this.D0 = -1;
        b7.l0 l0Var = this.J0;
        l0Var.f1839b = -1;
        b7.l0 l0Var2 = this.K0;
        l0Var2.f1839b = -1;
        this.I0 = -1;
        this.f31126v0 = -1;
        this.f31128w0 = -1;
        this.f31121r0 = -1;
        this.f31119q0 = -1;
        this.f31125u0 = -1;
        this.f31113k0 = -1;
        this.f31110i0 = 1;
        this.N0 = 3;
        this.f31112j0 = 2;
        boolean z10 = this.f31115n;
        if (!z10) {
            this.N0 = 4;
            this.f31113k0 = 3;
        }
        int i10 = this.N0;
        int i11 = i10 + 1;
        this.f31117o0 = i10;
        int i12 = i10 + 2;
        this.N0 = i12;
        this.f31118p0 = i11;
        int i13 = this.J;
        if (i13 != 0) {
            this.f31119q0 = i12;
            this.N0 = i12 + i13;
        }
        if (i13 != this.H.length) {
            int i14 = this.N0;
            this.N0 = i14 + 1;
            this.f31121r0 = i14;
        }
        int i15 = this.N0;
        this.f31123s0 = i15;
        int i16 = i15 + 2;
        this.N0 = i16;
        this.f31124t0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.N0 = i17;
            this.f31128w0 = i16;
            if (this.f31100d0) {
                this.N0 = i15 + 4;
                this.f31126v0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.xn) this.f26546b.f29040c0).f43165e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                int i18 = this.N0;
                this.N0 = i18 + 1;
                this.f31132y0 = i18;
            } else {
                this.U = true;
            }
            int i19 = this.N0;
            int i20 = i19 + 1;
            this.N0 = i20;
            this.C0 = i19;
            if (!z4) {
                this.N0 = i19 + 2;
                this.f31133z0 = i20;
            } else {
                this.Q = false;
            }
            int i21 = this.N0;
            this.A0 = i21;
            this.B0 = i21 + 1;
            int i22 = i21 + 3;
            this.N0 = i22;
            this.D0 = i21 + 2;
            if (z4) {
                l0Var.f1839b = i22;
                int i23 = i21 + 5;
                this.N0 = i23;
                l0Var2.f1839b = i21 + 4;
                if (l0Var2.f1838a) {
                    this.N0 = i21 + 6;
                    this.I0 = i23;
                }
            }
            int i24 = this.N0;
            int i25 = i24 + 1;
            this.N0 = i25;
            this.E0 = i24;
            if (this.R != 0 || this.S != 0) {
                this.F0 = i25;
                this.G0 = i24 + 2;
                this.N0 = i24 + 4;
                this.H0 = i24 + 3;
            }
            int i26 = this.N0;
            int i27 = i26 + 1;
            this.N0 = i27;
            this.f31125u0 = i26;
            if (this.W) {
                this.f31114l0 = i27;
                this.m0 = i26 + 2;
                this.N0 = i26 + 4;
                this.f31116n0 = i26 + 3;
            }
        }
        int i28 = this.N0;
        this.N0 = i28 + 1;
        this.f31130x0 = i28;
    }

    @Override
    public final boolean i() {
        if (this.X0) {
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
        this.E = true;
        mi miVar = this.f26546b;
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.F) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            mz mzVar = this.B;
            if (mzVar != null) {
                miVar.f29078o1.removeView(mzVar);
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
        this.f26546b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f31104f0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        this.f26546b.W1();
    }

    public void setDelegate(rn rnVar) {
        this.f31106g0 = rnVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z4;
        if (i10 == 40) {
            boolean z10 = this.f31115n;
            int i11 = 0;
            int i12 = 1;
            mi miVar = this.f26546b;
            CharSequence[] charSequenceArr = this.H;
            if (z10) {
                CharSequence[] charSequenceArr2 = {Y(this.K)};
                int i13 = miVar.G1;
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
                boolean z11 = this.f31100d0;
                if (z11 && this.f31098c0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                todoList.others_can_append = z4;
                todoList.others_can_complete = z11;
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
                        todoItem.f20988id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                z4.a0(i13, miVar.j1() + 1, miVar.n1(), new lh.h(this, (org.telegram.ui.xn) miVar.f29040c0, tL_messageMediaToDo, 8));
                return;
            }
            boolean z12 = this.W;
            kb1 kb1Var = this.f31122s;
            boolean[] zArr = this.I;
            if (z12 && !this.U0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f31119q0; i18 < this.f31119q0 + this.J; i18++) {
                        f2.m1 K = kb1Var.K(i18);
                        if (K != null) {
                            View view = K.f5875a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    in inVar = this.f31129x;
                                    if (inVar != null) {
                                        inVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    m40 m40Var = this.f31131y;
                                    m40Var.setText(string);
                                    m40Var.f(c6Var.getCheckBox(), true);
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
                eh.i iVar = this.f31111i1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                        this.S0 = true;
                        this.T0 = i19;
                        kb1Var.x0(this.f31119q0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.K)};
                    int i20 = miVar.G1;
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
                    tL_poll.multiple_choice = this.V;
                    tL_poll.quiz = this.W;
                    tL_poll.public_voters = !this.U;
                    tL_poll.open_answers = this.Q;
                    tL_poll.revoting_disabled = !this.O;
                    tL_poll.shuffle_answers = this.P;
                    tL_poll.subscribers_only = this.J0.f1838a;
                    if (this.K0.f1838a) {
                        ArrayList arrayList = this.M0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.R;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.T;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.S;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.T;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = entities3;
                    ArrayList arrayList2 = new ArrayList(this.G);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(Y(charSequenceArr[i24]))) {
                            iVar.h(tL_messageMediaPoll.poll.answers.size());
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
                            if ((this.V || this.W) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = 0;
                        i12 = 1;
                    }
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence Y = Y(this.M);
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
                    z4.a0(i20, miVar.j1() + 1, miVar.n1(), new hg.c1(this, (org.telegram.ui.xn) miVar.f29040c0, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        qn qnVar = this.f31120r;
        if (qnVar != null) {
            qnVar.l();
        }
        if (this.F) {
            Z(false);
            in inVar = this.f31129x;
            if (inVar != null) {
                inVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f31101d1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f31101d1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f31101d1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.y(int, int):void");
    }
}
