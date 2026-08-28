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
import org.telegram.ui.va1;
public final class jn extends ci implements wu0, NotificationCenter.NotificationCenterDelegate {
    public static final int f29763i1 = 0;
    public wy A;
    public int A0;
    public final kh.b4 B;
    public int B0;
    public boolean C;
    public int C0;
    public boolean D;
    public int D0;
    public final boolean E;
    public int E0;
    public final int F;
    public int F0;
    public final CharSequence[] G;
    public int G0;
    public final boolean[] H;
    public int H0;
    public int I;
    public final m.a I0;
    public Editable J;
    public final m.a J0;
    public Editable K;
    public final m.a[] K0;
    public Editable L;
    public final ArrayList L0;
    public final yg.r M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public final int O0;
    public boolean P;
    public final int[] P0;
    public int Q;
    public final m.i3 Q0;
    public int R;
    public boolean R0;
    public boolean S;
    public int S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final boolean f29764a0;
    public boolean f29765a1;
    public boolean f29766b0;
    public boolean f29767b1;
    public boolean f29768c0;
    public org.telegram.ui.Cells.c6 f29769c1;
    public boolean f29770d0;
    public boolean f29771d1;
    public boolean f29772e0;
    public boolean f29773e1;
    public in f29774f0;
    public sm f29775f1;
    public int f29776g0;
    public int f29777g1;
    public int f29778h0;
    public final yg.f f29779h1;
    public int f29780i0;
    public int f29781j0;
    public int f29782k0;
    public int f29783l0;
    public int m0;
    public final boolean f29784n;
    public int f29785n0;
    public int f29786o0;
    public int f29787p0;
    public int f29788q0;
    public final hn f29789r;
    public int f29790r0;
    public final va1 f29791s;
    public int f29792s0;
    public int f29793t0;
    public int f29794u0;
    public final xm v;
    public int f29795v0;
    public final dj f29796w;
    public int f29797w0;
    public final zm f29798x;
    public int f29799x0;
    public final s30 f29800y;
    public int f29801y0;
    public int f29802z0;

    public jn(ki kiVar, Context context, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, Boolean bool) {
        super(context, b6Var, kiVar);
        this.I = 1;
        this.N = true;
        this.O = true;
        this.P = true;
        this.U = true;
        this.f29766b0 = true;
        this.f29768c0 = true;
        this.f29776g0 = -1;
        m.a aVar = new m.a(this);
        this.I0 = aVar;
        m.a aVar2 = new m.a(this);
        this.J0 = aVar2;
        this.K0 = new m.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.L0 = arrayList;
        this.P0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.Q0 = new m.i3(this, 15);
        this.R0 = false;
        this.S0 = -1;
        this.f29771d1 = false;
        this.f29773e1 = false;
        Paint paint = new Paint(1);
        this.f29779h1 = new yg.f();
        this.f29784n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.F = answersMaxCount;
        this.G = new CharSequence[answersMaxCount];
        this.H = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f27493b.F1).getUserConfig().isPremium();
        this.E = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.V = booleanValue;
            this.f29764a0 = booleanValue;
            boolean z11 = !booleanValue;
            this.P = z11;
            this.N = z11;
        }
        g0();
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.hl, this.f27492a));
        this.f27493b.f30138n1.setDelegate(this);
        hn hnVar = new hn(this, context);
        this.f29789r = hnVar;
        va1 va1Var = new va1(context, 5, null);
        this.f29791s = va1Var;
        this.f27494c = va1Var;
        this.d = va1Var;
        this.h = true;
        this.f27496f = true;
        xm xmVar = new xm(this);
        this.v = xmVar;
        va1Var.setItemAnimator(xmVar);
        arrayList.clear();
        xmVar.f5532m = false;
        xmVar.C = false;
        xmVar.o(gr.h);
        xmVar.n(350L);
        va1Var.setClipToPadding(false);
        va1Var.setVerticalScrollBarEnabled(false);
        va1Var.setSections(true);
        dj djVar = new dj(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, va1Var, 3);
        this.f29796w = djVar;
        va1Var.setLayoutManager(djVar);
        djVar.O = true;
        new f2.h0(new jh.f(this, 2)).d(va1Var);
        addView(va1Var, g7.e6.e(-1, -1, 51));
        va1Var.setPreserveFocusAfterLayout(true);
        va1Var.setAdapter(hnVar);
        va1Var.setOnItemClickListener(new mm(this, b6Var, kiVar, context));
        va1Var.setOnScrollListener(new bg.o2(this, 29));
        s30 s30Var = new s30(context, 4);
        this.f29800y = s30Var;
        s30Var.setAlpha(0.0f);
        s30Var.setVisibility(4);
        addView(s30Var, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.O0 = MessagesController.getInstance(this.f27493b.F1).config.pollCaptionLengthMax.get();
        this.M = new yg.r(this.f27493b.F1);
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? ux0Var = new ux0(context, this.f27493b.F1, null, b6Var);
            this.f29798x = ux0Var;
            ux0Var.f33168y = true;
            ux0Var.A = true;
            ux0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) ux0Var, g7.e6.e(-2, 160, 51));
        }
        this.B = new kh.b4(this.f27493b.f30138n1, false, null);
        S();
    }

    public static void J(jn jnVar, int i9) {
        s30 s30Var = jnVar.f29800y;
        f2.q1 K = jnVar.f29791s.K(jnVar.f29787p0 + i9);
        if (K != null) {
            View view = K.f5501a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    zm zmVar = jnVar.f29798x;
                    if (zmVar != null) {
                        zmVar.f();
                    }
                    s30Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    s30Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = s30Var.f32344c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    s30Var.setTranslationY(s30Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void K(org.telegram.ui.Components.jn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.K(org.telegram.ui.Components.jn, android.view.View, int):void");
    }

    public static void L(jn jnVar, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        f2.q1 T;
        if (jnVar.E && z10) {
            if (jnVar.f29769c1 == c6Var && jnVar.W0 && jnVar.f29771d1) {
                jnVar.V();
                jnVar.W0 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = jnVar.f29769c1;
            jnVar.f29769c1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            qg emojiButton = c6Var.getEmojiButton();
            og ogVar = og.f31383e;
            emojiButton.j(ogVar, false);
            va1 va1Var = jnVar.f29791s;
            View F = va1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = va1Var.T(F);
            }
            zm zmVar = jnVar.f29798x;
            if (zmVar != null) {
                zmVar.f();
                if (T != null) {
                    View view = T.f5501a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && zmVar.getDelegate() != view) {
                        zmVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (jnVar.W0) {
                    jnVar.V();
                    jnVar.Y(false);
                    jnVar.b0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void M(jn jnVar, org.telegram.ui.Cells.c6 c6Var) {
        jnVar.f29769c1 = c6Var;
        if (jnVar.W0) {
            jnVar.V();
            jnVar.b0();
            return;
        }
        jnVar.e0(1);
    }

    public static void N(jn jnVar, int i9) {
        ki kiVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        yg.f fVar = jnVar.f29779h1;
        if (fVar.b(i9) != null) {
            yg.e b10 = fVar.b(i9);
            if (b10 != null && (kiVar = jnVar.f27493b) != null && (o2Var = kiVar.f30099b0) != null) {
                Activity parentActivity = o2Var.getParentActivity();
                if (b10 instanceof zg.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((zg.d) b10).f50830b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new pm(jnVar, i9), null);
                    return;
                } else if (b10 instanceof zg.h) {
                    zg.h hVar = (zg.h) b10;
                    org.telegram.ui.ht.q().w(parentActivity);
                    org.telegram.ui.ht.q().v(new rm(jnVar, i9));
                    org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                    TLRPC.Document document = hVar.f50842b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    q10.t(document, null, "", null, null, i10, false, hVar.f50843c, jnVar.f27492a, 200);
                    return;
                } else if (b10 instanceof zg.c) {
                    zg.c cVar = (zg.c) b10;
                    String str = cVar.d;
                    jnVar.f0(i9, new org.telegram.ui.lf(1, str, AndroidUtilities.formatFileSize(cVar.f50827e, true, true) + " " + cVar.f50828f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof zg.g) {
                    zg.g gVar = (zg.g) b10;
                    TLRPC.Document document2 = gVar.f50840b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    jnVar.f0(i9, new kh.f5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof zg.f) {
                    jnVar.f0(i9, new mi((zg.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof zg.e) {
                    zg.e eVar = (zg.e) b10;
                    y4.g0(jnVar.getContext(), jnVar.f27492a, eVar.f50832b, eVar.f50836n, new im(jnVar, i9, 1), new jm(jnVar, i9, 0));
                    return;
                } else {
                    jnVar.a0(i9);
                    return;
                }
            }
            return;
        }
        jnVar.a0(i9);
    }

    public static CharSequence X(CharSequence charSequence) {
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

    public static sm c0(org.telegram.ui.ActionBar.o2 o2Var, int i9, Utilities.Callback callback, fg fgVar) {
        if (o2Var == null) {
            return null;
        }
        sm smVar = new sm(o2Var.getContext(), o2Var, o2Var.getResourceProvider(), fgVar);
        smVar.V1 = new um(callback, o2Var, smVar);
        smVar.W1 = new vm(callback, smVar);
        smVar.f30114f0.e0();
        smVar.J1(1, true);
        smVar.h1(i9);
        smVar.f30145p2 = new km(callback);
        smVar.T = new wm(callback, o2Var, smVar);
        smVar.U = new g1(17, callback, smVar);
        smVar.r1();
        smVar.setFocusable(true);
        smVar.show();
        return smVar;
    }

    private int getAnswersMaxCount() {
        if (this.f29784n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ki kiVar = this.f27493b;
        if (kiVar != null) {
            return kiVar.F1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(ci ciVar) {
        ki kiVar = this.f27493b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f29784n) {
            kiVar.T0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f29764a0) {
            kiVar.T0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            kiVar.T0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        kiVar.W1();
        this.f29796w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f29791s.x0(1);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int dp;
        if (this.E) {
            if (i9 > AndroidUtilities.dp(50.0f) && this.f29765a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.Z0 = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.Z0).commit();
                } else {
                    this.Y0 = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Y0).commit();
                }
            }
            boolean z13 = this.W0;
            ki kiVar = this.f27493b;
            kh.b4 b4Var = this.B;
            if (z13) {
                if (z10) {
                    i10 = this.Z0;
                } else {
                    i10 = this.Y0;
                }
                if (this.f29771d1) {
                    i10 += AndroidUtilities.dp(120.0f);
                }
                int i11 = i10 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f29773e1 != this.f29771d1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.A.setLayoutParams(layoutParams);
                    this.X0 = layoutParams.height;
                    b4Var.a();
                    kiVar.f30138n1.requestLayout();
                    boolean z14 = this.f29773e1;
                    if (z14 != this.f29771d1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        P(dp);
                    }
                    this.f29773e1 = this.f29771d1;
                }
            }
            if (this.U0 != i9 || this.V0 != z10) {
                this.U0 = i9;
                this.V0 = z10;
                boolean z15 = this.f29765a1;
                org.telegram.ui.Cells.c6 c6Var = this.f29769c1;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && b4Var.c() && i9 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f29765a1 = z12;
                } else {
                    this.f29765a1 = false;
                }
                if (this.f29765a1 && this.W0) {
                    e0(0);
                }
                if (this.X0 != 0 && !(z11 = this.f29765a1) && z11 != z15 && !this.W0) {
                    this.X0 = 0;
                    b4Var.a();
                    kiVar.f30138n1.requestLayout();
                }
                if (this.f29765a1 && this.C) {
                    this.C = false;
                    AndroidUtilities.cancelRunOnUIThread(this.Q0);
                }
            }
        }
    }

    public final void O() {
        zm zmVar = this.f29798x;
        if (zmVar != null) {
            zmVar.setDelegate(null);
            zmVar.f();
        }
        this.f29791s.setItemAnimator(this.v);
        int i9 = this.I;
        this.H[i9] = false;
        int i10 = i9 + 1;
        this.I = i10;
        int length = this.G.length;
        hn hnVar = this.f29789r;
        if (i10 == length) {
            hnVar.u(this.f29788q0);
        }
        hnVar.o(this.f29788q0);
        g0();
        this.f29776g0 = (this.f29787p0 + this.I) - 1;
        hnVar.m(this.f29790r0);
        hnVar.m(this.f29797w0);
    }

    public final void P(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.cg(this, f10, 2));
        ofFloat.addListener(new om(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
        ofFloat.start();
    }

    public final void Q() {
        boolean z10;
        if (!this.V && !this.T) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.P = false;
        }
        int i9 = this.f29801y0;
        if (i9 < 0) {
            return;
        }
        f2.q1 K = this.f29791s.K(i9);
        if (K == null) {
            this.f29789r.m(this.f29801y0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f5501a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f26542a.a(!z10, true);
    }

    public final boolean R() {
        boolean z10;
        int i9;
        int i10;
        if (TextUtils.isEmpty(X(this.J)) && TextUtils.isEmpty(X(this.K)) && TextUtils.isEmpty(X(this.L)) && this.f29779h1.f50223a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.I && (z10 = TextUtils.isEmpty(X(this.G[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f27493b.f30099b0.getParentActivity());
            boolean z11 = this.f29784n;
            if (z11) {
                i9 = R.string.CancelTodoAlertTitle;
            } else {
                i9 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
            if (z11) {
                i10 = R.string.CancelTodoAlertText;
            } else {
                i10 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void S() {
        int i9;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.V;
        CharSequence[] charSequenceArr = this.G;
        if (z11) {
            int i12 = 0;
            i9 = 0;
            while (true) {
                boolean[] zArr = this.H;
                if (i12 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(X(charSequenceArr[i12])) && zArr[i12]) {
                    i9++;
                }
                i12++;
            }
        } else {
            i9 = 0;
        }
        boolean z12 = this.f29784n;
        if (z12) {
            i10 = getMessagesController().todoTitleLengthMax;
        } else {
            i10 = 255;
        }
        if (z12) {
            i11 = getMessagesController().todoItemLengthMax;
        } else {
            i11 = 100;
        }
        if ((!TextUtils.isEmpty(X(this.K)) && this.K.length() > this.O0) || ((!TextUtils.isEmpty(X(this.L)) && this.L.length() > 200) || TextUtils.isEmpty(X(this.J)) || this.J.length() > i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(X(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i11) {
                    i14 = 0;
                    z13 = true;
                    break;
                }
                i14++;
                z13 = true;
            }
            i13++;
        }
        if (i14 < 1 || (this.V && i9 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && !z13 && this.f29779h1.f50223a.size() <= 0) {
            this.f29770d0 = true;
        } else {
            this.f29770d0 = false;
        }
        boolean z14 = this.f29770d0;
        ki kiVar = this.f27493b;
        kiVar.setAllowNestedScroll(z14);
        this.T0 = z10;
        kiVar.W1();
    }

    public final void T(org.telegram.ui.Cells.p8 p8Var, boolean z10) {
        if (this.R != 0) {
            p8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.R), z10, false);
        } else if (this.Q != 0) {
            p8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.Q / 3600, new Object[0]), z10, false);
        } else {
            p8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void U(zg.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f50832b;
        yg.r rVar = this.M;
        boolean containsKey = rVar.f50264c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f50263b.get(eVar.f50832b);
        td.a aVar = eVar.f50838s;
        ImageReceiver imageReceiver = eVar.f50222a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f50837r.a(z11, z10);
        eVar.f50836n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.clearImage();
    }

    public final void V() {
        if (this.f29771d1) {
            this.A.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.A.setLayoutParams(layoutParams);
            this.X0 = layoutParams.height;
            this.f29773e1 = this.f29771d1;
            this.f29771d1 = false;
            P(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void W(android.view.View r10, org.telegram.ui.Cells.c6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.W(android.view.View, org.telegram.ui.Cells.c6, boolean):void");
    }

    public final void Y(boolean z10) {
        if (this.E) {
            if (this.W0) {
                wy wyVar = this.A;
                wyVar.L.B0();
                wyVar.E.scrollTo(0, 0);
                wyVar.G(1);
                wyVar.M.h1(0, 0);
                this.A.t(false);
                if (z10) {
                    this.A.A();
                }
                this.f29771d1 = false;
                e0(0);
            }
            if (z10) {
                wy wyVar2 = this.A;
                if (wyVar2 != null && wyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.A.getMeasuredHeight());
                    ofFloat.addUpdateListener(new lm(this, 0));
                    this.f29767b1 = true;
                    ofFloat.addListener(new om(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                    ofFloat.start();
                    return;
                }
                Z();
            }
        }
    }

    public final void Z() {
        wy wyVar;
        qg emojiButton;
        if (!this.W0 && (wyVar = this.A) != null && wyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f29769c1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(og.f31383e, false);
            }
            this.A.setVisibility(8);
        }
        int i9 = this.X0;
        this.X0 = 0;
        if (i9 != 0) {
            this.B.a();
        }
    }

    public final void a0(int i9) {
        int i10;
        this.f29777g1 = i9;
        org.telegram.ui.ActionBar.o2 o2Var = this.f27493b.f30099b0;
        this.f29779h1.b(i9);
        if (i9 != -2 && i9 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.f29775f1 = c0(o2Var, i10, new im(this, i9, 0), new fg(this, 26));
    }

    public final void b0() {
        int i9;
        org.telegram.ui.Cells.c6 c6Var = this.f29769c1;
        if (c6Var != null) {
            this.B.f14993e = true;
            EditTextBoldCursor editField = c6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        e0(i9);
        if (!AndroidUtilities.usingHardwareInput && !this.f29765a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.C = true;
            m.i3 i3Var = this.Q0;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 100L);
        }
    }

    public final void d0(int i9, yg.e eVar) {
        int i10;
        yg.f fVar = this.f29779h1;
        if (eVar != null) {
            fVar.f50223a.put(i9, eVar);
        } else {
            fVar.f50223a.remove(i9);
        }
        if (i9 == -2) {
            i10 = this.f29781j0;
        } else if (i9 == -3) {
            i10 = this.f29783l0;
        } else {
            int i11 = this.f29787p0;
            if (i11 >= 0 && i9 >= 0 && i9 < this.I) {
                i10 = i9 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            f2.q1 K = this.f29791s.K(i10);
            if (K != null) {
                View view = K.f5501a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).f24198e.a(eVar, true);
                }
            }
            this.f29789r.m(i10);
        }
        if (eVar instanceof zg.e) {
            zg.e eVar2 = (zg.e) eVar;
            String str = eVar2.f50832b;
            bg.y0 y0Var = new bg.y0(16, this, eVar);
            yg.r rVar = this.M;
            HashMap hashMap = rVar.f50264c;
            HashMap hashMap2 = rVar.f50263b;
            if (hashMap2.containsKey(str)) {
                y0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(y0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.f50262a).sendRequestTyped(getwebpagepreview, new Object(), new bg.y0(27, rVar, str));
                }
            }
            U(eVar2, false);
        }
        S();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i9 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.M.f50263b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f22533id)) != null) {
                    entry.setValue(webPage);
                }
            }
            yg.f fVar = this.f29779h1;
            int size = fVar.f50223a.size();
            for (int i11 = 0; i11 < size; i11++) {
                yg.e eVar = (yg.e) fVar.f50223a.get(i11);
                if (eVar instanceof zg.e) {
                    U((zg.e) eVar, true);
                }
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            wy wyVar = this.A;
            if (wyVar != null) {
                wyVar.L.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f29769c1;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f29769c1.getEditField().setTextColor(-1);
                this.f29769c1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i9) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.E) {
            kh.b4 b4Var = this.B;
            qg qgVar = null;
            ki kiVar = this.f27493b;
            if (i9 == 1) {
                wy wyVar = this.A;
                if (wyVar != null && wyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wy wyVar2 = this.A;
                if (wyVar2 != null && wyVar2.Y0 != UserConfig.selectedAccount) {
                    kiVar.f30138n1.removeView(wyVar2);
                    this.A = null;
                }
                if (this.A == null) {
                    wy wyVar3 = new wy(null, true, false, false, getContext(), true, null, null, true, this.f27492a, false, false);
                    this.A = wyVar3;
                    wyVar3.f34390c = 3;
                    wyVar3.f34442s0 = false;
                    wyVar3.f34447t2 = false;
                    wyVar3.setShouldDrawBackground(false);
                    wy wyVar4 = this.A;
                    wyVar4.Q0 = false;
                    wyVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.A.setForseMultiwindowLayout(true);
                    }
                    this.A.setDelegate(new nm(this));
                    kiVar.f30138n1.addView(this.A);
                    this.A.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.A.setVisibility(0);
                this.W0 = true;
                wy wyVar5 = this.A;
                if (this.Y0 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.Y0 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.Y0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.Z0 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.Z0 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.Z0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.Z0;
                } else {
                    i10 = this.Y0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i10;
                wyVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f29769c1) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.X0 = i10;
                b4Var.a();
                kiVar.f30138n1.requestLayout();
                org.telegram.ui.Cells.c6 c6Var2 = this.f29769c1;
                if (c6Var2 != null) {
                    qgVar = c6Var2.getEmojiButton();
                }
                if (qgVar != null) {
                    qgVar.j(og.d, true);
                }
                if (!z10 && !this.f29765a1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X0, 0.0f);
                    ofFloat.addUpdateListener(new lm(this, 1));
                    ofFloat.addListener(new om(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c6 c6Var3 = this.f29769c1;
            if (c6Var3 != null) {
                qgVar = c6Var3.getEmojiButton();
            }
            if (qgVar != null) {
                qgVar.j(og.f31383e, true);
            }
            wy wyVar6 = this.A;
            if (wyVar6 != null) {
                this.W0 = false;
                this.f29771d1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wyVar6.setVisibility(8);
                }
            }
            if (i9 == 0) {
                this.X0 = 0;
            }
            b4Var.a();
            kiVar.f30138n1.requestLayout();
        }
    }

    public final void f0(int i9, Utilities.CallbackReturn callbackReturn, int i10, int i11) {
        x60 F = x60.F(this, null, new View(getContext()));
        F.f34580s = 0;
        F.f34581t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new jm(this, i9, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jm(this, i9, 2), true);
        ll0 ll0Var = new ll0(getContext(), this.f27492a);
        F.f34575p = new org.telegram.ui.ke(ll0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        ll0Var.e(F);
        kg.d c10 = ll0Var.f30475n.c(null, null, false);
        c10.n(mg.c.j(ll0Var.f30471b));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.f14805e = true;
        c10.p(AndroidUtilities.dp(16.0f));
        ll0Var.B = c10;
        ll0Var.A = (Drawable) callbackReturn.run(ll0Var.f30477s);
        Point point = AndroidUtilities.displaySize;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - AndroidUtilities.dp(8.0f), i13 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
        ll0Var.A.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) ll0Var.f30479x.getLayoutParams()).gravity = 1;
        ll0Var.H = true;
        ll0Var.show();
    }

    @Override
    public final boolean g() {
        return this.T0;
    }

    public final void g0() {
        boolean z10;
        this.f29782k0 = -1;
        this.f29783l0 = -1;
        this.m0 = -1;
        this.B0 = -1;
        this.f29799x0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.f29801y0 = -1;
        this.A0 = -1;
        this.f29802z0 = -1;
        this.C0 = -1;
        m.a aVar = this.I0;
        aVar.f16883b = -1;
        m.a aVar2 = this.J0;
        aVar2.f16883b = -1;
        this.H0 = -1;
        this.f29794u0 = -1;
        this.f29795v0 = -1;
        this.f29788q0 = -1;
        this.f29787p0 = -1;
        this.f29793t0 = -1;
        this.f29781j0 = -1;
        this.f29778h0 = 1;
        this.M0 = 3;
        this.f29780i0 = 2;
        boolean z11 = this.f29784n;
        if (!z11) {
            this.M0 = 4;
            this.f29781j0 = 3;
        }
        int i9 = this.M0;
        int i10 = i9 + 1;
        this.f29785n0 = i9;
        int i11 = i9 + 2;
        this.M0 = i11;
        this.f29786o0 = i10;
        int i12 = this.I;
        if (i12 != 0) {
            this.f29787p0 = i11;
            this.M0 = i11 + i12;
        }
        if (i12 != this.G.length) {
            int i13 = this.M0;
            this.M0 = i13 + 1;
            this.f29788q0 = i13;
        }
        int i14 = this.M0;
        this.f29790r0 = i14;
        int i15 = i14 + 2;
        this.M0 = i15;
        this.f29792s0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.M0 = i16;
            this.f29795v0 = i15;
            if (this.f29768c0) {
                this.M0 = i14 + 4;
                this.f29794u0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.qn) this.f27493b.f30099b0).f41890e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i17 = this.M0;
                this.M0 = i17 + 1;
                this.f29799x0 = i17;
            } else {
                this.T = true;
            }
            int i18 = this.M0;
            int i19 = i18 + 1;
            this.M0 = i19;
            this.B0 = i18;
            if (!z10) {
                this.M0 = i18 + 2;
                this.f29801y0 = i19;
            } else {
                this.P = false;
            }
            int i20 = this.M0;
            this.f29802z0 = i20;
            this.A0 = i20 + 1;
            int i21 = i20 + 3;
            this.M0 = i21;
            this.C0 = i20 + 2;
            if (z10) {
                aVar.f16883b = i21;
                int i22 = i20 + 5;
                this.M0 = i22;
                aVar2.f16883b = i20 + 4;
                if (aVar2.f16882a) {
                    this.M0 = i20 + 6;
                    this.H0 = i22;
                }
            }
            int i23 = this.M0;
            int i24 = i23 + 1;
            this.M0 = i24;
            this.D0 = i23;
            if (this.Q != 0 || this.R != 0) {
                this.E0 = i24;
                this.F0 = i23 + 2;
                this.M0 = i23 + 4;
                this.G0 = i23 + 3;
            }
            int i25 = this.M0;
            int i26 = i25 + 1;
            this.M0 = i26;
            this.f29793t0 = i25;
            if (this.V) {
                this.f29782k0 = i26;
                this.f29783l0 = i25 + 2;
                this.M0 = i25 + 4;
                this.m0 = i25 + 3;
            }
        }
        int i27 = this.M0;
        this.M0 = i27 + 1;
        this.f29797w0 = i27;
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        f2.q1 T;
        int i9;
        va1 va1Var = this.f29791s;
        if (va1Var.getChildCount() <= 1 || (childAt = va1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = va1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        ik0 ik0Var = (ik0) T;
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y10 > 0 && ik0Var != null && ik0Var.b() == 1) {
            i9 = y10;
        } else {
            i9 = 0;
        }
        if (y10 < 0 || ik0Var == null || ik0Var.b() != 1) {
            y10 = i9;
        }
        return AndroidUtilities.dp(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.X0;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.N0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        va1 va1Var = this.f29791s;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32768, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 16, new Class[]{an.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        int i14 = org.telegram.ui.ActionBar.f6.f23162m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.f23128k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        int i16 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.il));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.W0) {
            Y(true);
            return true;
        } else if (!R()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void m() {
        this.D = true;
        ki kiVar = this.f27493b;
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            wy wyVar = this.A;
            if (wyVar != null) {
                kiVar.f30138n1.removeView(wyVar);
            }
        }
    }

    @Override
    public final boolean p() {
        if (!R()) {
            return false;
        }
        return true;
    }

    @Override
    public final void q() {
        this.f27493b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f29772e0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        this.f27493b.W1();
    }

    public void setDelegate(in inVar) {
        this.f29774f0 = inVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i9) {
        boolean z10;
        if (i9 == 40) {
            boolean z11 = this.f29784n;
            int i10 = 0;
            int i11 = 1;
            ki kiVar = this.f27493b;
            CharSequence[] charSequenceArr = this.G;
            if (z11) {
                CharSequence[] charSequenceArr2 = {X(this.J)};
                int i12 = kiVar.F1;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (entities != null) {
                    int size = entities.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        TLRPC.MessageEntity messageEntity = entities.get(i13);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f29768c0;
                if (z12 && this.f29766b0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                for (int i14 = 0; i14 < charSequenceArr.length; i14++) {
                    if (!TextUtils.isEmpty(X(charSequenceArr[i14]))) {
                        CharSequence[] charSequenceArr3 = {X(charSequenceArr[i14])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i12).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (entities2 != null) {
                            int size2 = entities2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i15);
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
                        todoItem.f22525id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                y4.a0(i12, kiVar.j1() + 1, kiVar.n1(), new fh.i(this, (org.telegram.ui.qn) kiVar.f30099b0, tL_messageMediaToDo, 8));
                return;
            }
            boolean z13 = this.V;
            va1 va1Var = this.f29791s;
            boolean[] zArr = this.H;
            if (z13 && !this.T0) {
                int i16 = 0;
                while (i10 < zArr.length) {
                    if (!TextUtils.isEmpty(X(charSequenceArr[i10])) && zArr[i10]) {
                        i16++;
                    }
                    i10++;
                }
                if (i16 <= 0) {
                    for (int i17 = this.f29787p0; i17 < this.f29787p0 + this.I; i17++) {
                        f2.q1 K = va1Var.K(i17);
                        if (K != null) {
                            View view = K.f5501a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    zm zmVar = this.f29798x;
                                    if (zmVar != null) {
                                        zmVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    s30 s30Var = this.f29800y;
                                    s30Var.setText(string);
                                    s30Var.f(c6Var.getCheckBox(), true);
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
            int i18 = 0;
            while (true) {
                int length = charSequenceArr.length;
                yg.f fVar = this.f29779h1;
                if (i18 < length) {
                    if (TextUtils.isEmpty(X(charSequenceArr[i18])) && fVar.b(i18) != null) {
                        this.R0 = true;
                        this.S0 = i18;
                        va1Var.x0(this.f29787p0 + i18);
                        return;
                    }
                    i18++;
                } else {
                    CharSequence[] charSequenceArr4 = {X(this.J)};
                    int i19 = kiVar.F1;
                    ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i19).getEntities(charSequenceArr4, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (entities3 != null) {
                        int size3 = entities3.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            TLRPC.MessageEntity messageEntity3 = entities3.get(i20);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.U;
                    tL_poll.quiz = this.V;
                    tL_poll.public_voters = !this.T;
                    tL_poll.open_answers = this.P;
                    tL_poll.revoting_disabled = !this.N;
                    tL_poll.shuffle_answers = this.O;
                    tL_poll.subscribers_only = this.I0.f16882a;
                    if (this.J0.f16882a) {
                        ArrayList arrayList = this.L0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i21 = this.Q;
                    if (i21 != 0) {
                        poll2.hide_results_until_close = this.S;
                        poll2.close_period = i21;
                        poll2.flags |= 16;
                    } else {
                        int i22 = this.R;
                        if (i22 != 0) {
                            poll2.hide_results_until_close = this.S;
                            poll2.close_date = i22;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = entities3;
                    ArrayList arrayList2 = new ArrayList(this.F);
                    int i23 = 0;
                    while (i23 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(X(charSequenceArr[i23]))) {
                            fVar.h(tL_messageMediaPoll.poll.answers.size());
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i11];
                            charSequenceArr5[i10] = X(charSequenceArr[i23]);
                            ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i19).getEntities(charSequenceArr5, i11);
                            CharSequence charSequence4 = charSequenceArr5[i10];
                            if (entities4 != null) {
                                int size4 = entities4.size();
                                for (int i24 = 0; i24 < size4; i24++) {
                                    TLRPC.MessageEntity messageEntity4 = entities4.get(i24);
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
                            if ((this.U || this.V) && zArr[i23]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i23++;
                        i10 = 0;
                        i11 = 1;
                    }
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence X = X(this.L);
                    if (X != null) {
                        tL_messageMediaPoll.results.solution = X.toString();
                        ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i19).getEntities(new CharSequence[]{X}, true);
                        if (entities5 != null && !entities5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = entities5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    y4.a0(i19, kiVar.j1() + 1, kiVar.n1(), new bg.j1(this, (org.telegram.ui.qn) kiVar.f30099b0, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        hn hnVar = this.f29789r;
        if (hnVar != null) {
            hnVar.l();
        }
        if (this.E) {
            Y(false);
            zm zmVar = this.f29798x;
            if (zmVar != null) {
                zmVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f29769c1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f29769c1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f29769c1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.y(int, int):void");
    }
}
