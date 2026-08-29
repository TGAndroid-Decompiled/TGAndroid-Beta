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
import org.telegram.ui.wa1;
public final class on extends fi implements gv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f31399i1 = 0;
    public fz A;
    public int A0;
    public final nh.w3 B;
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
    public final bh.w M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public final int O0;
    public boolean P;
    public final int[] P0;
    public int Q;
    public final lh.m7 Q0;
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
    public final boolean f31400a0;
    public boolean f31401a1;
    public boolean f31402b0;
    public boolean f31403b1;
    public boolean f31404c0;
    public org.telegram.ui.Cells.a6 f31405c1;
    public boolean f31406d0;
    public boolean f31407d1;
    public boolean f31408e0;
    public boolean f31409e1;
    public nn f31410f0;
    public xm f31411f1;
    public int f31412g0;
    public int f31413g1;
    public int f31414h0;
    public final bh.i f31415h1;
    public int f31416i0;
    public int f31417j0;
    public int f31418k0;
    public int f31419l0;
    public int m0;
    public final boolean f31420n;
    public int f31421n0;
    public int f31422o0;
    public int f31423p0;
    public int f31424q0;
    public final mn f31425r;
    public int f31426r0;
    public final wa1 f31427s;
    public int f31428s0;
    public int f31429t0;
    public int f31430u0;
    public final cn v;
    public int f31431v0;
    public final gj f31432w;
    public int f31433w0;
    public final en f31434x;
    public int f31435x0;
    public final g40 f31436y;
    public int f31437y0;
    public int f31438z0;

    public on(ni niVar, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Boolean bool) {
        super(context, c6Var, niVar);
        this.I = 1;
        this.N = true;
        this.O = true;
        this.P = true;
        this.U = true;
        this.f31402b0 = true;
        this.f31404c0 = true;
        this.f31412g0 = -1;
        m.a aVar = new m.a(this);
        this.I0 = aVar;
        m.a aVar2 = new m.a(this);
        this.J0 = aVar2;
        this.K0 = new m.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.L0 = arrayList;
        this.P0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.Q0 = new lh.m7(this, 18);
        this.R0 = false;
        this.S0 = -1;
        this.f31407d1 = false;
        this.f31409e1 = false;
        Paint paint = new Paint(1);
        this.f31415h1 = new bh.i();
        this.f31420n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.F = answersMaxCount;
        this.G = new CharSequence[answersMaxCount];
        this.H = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f28403b.F1).getUserConfig().isPremium();
        this.E = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.V = booleanValue;
            this.f31400a0 = booleanValue;
            boolean z11 = !booleanValue;
            this.P = z11;
            this.N = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.f28402a));
        this.f28403b.f31029n1.setDelegate(this);
        mn mnVar = new mn(this, context);
        this.f31425r = mnVar;
        wa1 wa1Var = new wa1(context, 4, null);
        this.f31427s = wa1Var;
        this.f28404c = wa1Var;
        this.d = wa1Var;
        this.h = true;
        this.f28406f = true;
        cn cnVar = new cn(this);
        this.v = cnVar;
        wa1Var.setItemAnimator(cnVar);
        arrayList.clear();
        cnVar.f6463m = false;
        cnVar.C = false;
        cnVar.o(jr.h);
        cnVar.n(350L);
        wa1Var.setClipToPadding(false);
        wa1Var.setVerticalScrollBarEnabled(false);
        wa1Var.setSections(true);
        gj gjVar = new gj(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, wa1Var, 3);
        this.f31432w = gjVar;
        wa1Var.setLayoutManager(gjVar);
        gjVar.O = true;
        new f2.e0(new mh.f(this, 2)).d(wa1Var);
        addView(wa1Var, i7.f6.e(-1, -1, 51));
        wa1Var.setPreserveFocusAfterLayout(true);
        wa1Var.setAdapter(mnVar);
        wa1Var.setOnItemClickListener(new qm(this, c6Var, niVar, context));
        wa1Var.setOnScrollListener(new cg.g2(this, 25));
        g40 g40Var = new g40(context, 4);
        this.f31436y = g40Var;
        g40Var.setAlpha(0.0f);
        g40Var.setVisibility(4);
        addView(g40Var, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.O0 = MessagesController.getInstance(this.f28403b.F1).config.pollCaptionLengthMax.get();
        this.M = new bh.w(this.f28403b.F1);
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? fy0Var = new fy0(context, this.f28403b.F1, null, c6Var);
            this.f31434x = fy0Var;
            fy0Var.f28573y = true;
            fy0Var.A = true;
            fy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) fy0Var, i7.f6.e(-2, 160, 51));
        }
        this.B = new nh.w3(this.f28403b.f31029n1, false, null);
        T();
    }

    public static void J(on onVar, int i10) {
        g40 g40Var = onVar.f31436y;
        f2.n1 K = onVar.f31427s.K(onVar.f31423p0 + i10);
        if (K != null) {
            View view = K.f6432a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    en enVar = onVar.f31434x;
                    if (enVar != null) {
                        enVar.f();
                    }
                    g40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    g40Var.f(a6Var.getCheckBox(), true);
                    ImageView imageView = g40Var.f28747c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    g40Var.setTranslationY(g40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void K(org.telegram.ui.Components.on r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.on.K(org.telegram.ui.Components.on, android.view.View, int):void");
    }

    public static void L(on onVar, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        f2.n1 T;
        if (onVar.E && z10) {
            if (onVar.f31405c1 == a6Var && onVar.W0 && onVar.f31407d1) {
                onVar.W();
                onVar.W0 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = onVar.f31405c1;
            onVar.f31405c1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            tg emojiButton = a6Var.getEmojiButton();
            rg rgVar = rg.f32296e;
            emojiButton.j(rgVar, false);
            wa1 wa1Var = onVar.f31427s;
            View F = wa1Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = wa1Var.T(F);
            }
            en enVar = onVar.f31434x;
            if (enVar != null) {
                enVar.f();
                if (T != null) {
                    View view = T.f6432a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && enVar.getDelegate() != view) {
                        enVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (onVar.W0) {
                    onVar.W();
                    onVar.Z(false);
                    onVar.c0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(rgVar, false);
            }
        }
    }

    public static void M(on onVar, org.telegram.ui.Cells.a6 a6Var) {
        onVar.f31405c1 = a6Var;
        if (onVar.W0) {
            onVar.W();
            onVar.c0();
            return;
        }
        onVar.f0(1);
    }

    public static void O(on onVar, int i10) {
        ni niVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i11;
        bh.i iVar = onVar.f31415h1;
        if (iVar.b(i10) != null) {
            bh.h b10 = iVar.b(i10);
            if (b10 != null && (niVar = onVar.f28403b) != null && (o2Var = niVar.f30990b0) != null) {
                Activity parentActivity = o2Var.getParentActivity();
                if (b10 instanceof ch.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((ch.d) b10).f3489b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new um(onVar, i10), null);
                    return;
                } else if (b10 instanceof ch.i) {
                    ch.i iVar2 = (ch.i) b10;
                    org.telegram.ui.ht.q().w(parentActivity);
                    org.telegram.ui.ht.q().v(new wm(onVar, i10));
                    org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
                    TLRPC.Document document = iVar2.f3503b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, iVar2.f3504c, onVar.f28402a, 200);
                    return;
                } else if (b10 instanceof ch.c) {
                    ch.c cVar = (ch.c) b10;
                    String str = cVar.d;
                    onVar.g0(i10, new org.telegram.ui.hf(1, str, AndroidUtilities.formatFileSize(cVar.f3486e, true, true) + " " + cVar.f3487f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof ch.h) {
                    ch.h hVar = (ch.h) b10;
                    TLRPC.Document document2 = hVar.f3501b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    onVar.g0(i10, new nh.v4(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof ch.g) {
                    onVar.g0(i10, new pi((ch.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof ch.e) {
                    ch.e eVar = (ch.e) b10;
                    c5.g0(onVar.getContext(), onVar.f28402a, eVar.f3491b, eVar.f3495n, new mm(onVar, i10, 1), new nm(onVar, i10, 0));
                    return;
                } else {
                    onVar.b0(i10);
                    return;
                }
            }
            return;
        }
        onVar.b0(i10);
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

    public static xm d0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback, ig igVar) {
        if (o2Var == null) {
            return null;
        }
        xm xmVar = new xm(o2Var.getContext(), o2Var, o2Var.getResourceProvider(), igVar);
        xmVar.V1 = new zm(callback, o2Var, xmVar);
        xmVar.W1 = new an(callback, xmVar);
        xmVar.f31005f0.f0();
        xmVar.J1(1, true);
        xmVar.h1(i10);
        xmVar.f31036p2 = new om(callback);
        xmVar.T = new bn(callback, o2Var, xmVar);
        xmVar.U = new j1(17, callback, xmVar);
        xmVar.r1();
        xmVar.setFocusable(true);
        xmVar.show();
        return xmVar;
    }

    private int getAnswersMaxCount() {
        if (this.f31420n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ni niVar = this.f28403b;
        if (niVar != null) {
            return niVar.F1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(fi fiVar) {
        ni niVar = this.f28403b;
        try {
            niVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f31420n) {
            niVar.T0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f31400a0) {
            niVar.T0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            niVar.T0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        niVar.W1();
        this.f31432w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f31427s.x0(1);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.E) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f31401a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.Z0).commit();
                } else {
                    this.Y0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Y0).commit();
                }
            }
            boolean z13 = this.W0;
            ni niVar = this.f28403b;
            nh.w3 w3Var = this.B;
            if (z13) {
                if (z10) {
                    i11 = this.Z0;
                } else {
                    i11 = this.Y0;
                }
                if (this.f31407d1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f31409e1 != this.f31407d1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.A.setLayoutParams(layoutParams);
                    this.X0 = layoutParams.height;
                    w3Var.a();
                    niVar.f31029n1.requestLayout();
                    boolean z14 = this.f31409e1;
                    if (z14 != this.f31407d1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f31409e1 = this.f31407d1;
                }
            }
            if (this.U0 != i10 || this.V0 != z10) {
                this.U0 = i10;
                this.V0 = z10;
                boolean z15 = this.f31401a1;
                org.telegram.ui.Cells.a6 a6Var = this.f31405c1;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && w3Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f31401a1 = z12;
                } else {
                    this.f31401a1 = false;
                }
                if (this.f31401a1 && this.W0) {
                    f0(0);
                }
                if (this.X0 != 0 && !(z11 = this.f31401a1) && z11 != z15 && !this.W0) {
                    this.X0 = 0;
                    w3Var.a();
                    niVar.f31029n1.requestLayout();
                }
                if (this.f31401a1 && this.C) {
                    this.C = false;
                    AndroidUtilities.cancelRunOnUIThread(this.Q0);
                }
            }
        }
    }

    public final void P() {
        en enVar = this.f31434x;
        if (enVar != null) {
            enVar.setDelegate(null);
            enVar.f();
        }
        this.f31427s.setItemAnimator(this.v);
        int i10 = this.I;
        this.H[i10] = false;
        int i11 = i10 + 1;
        this.I = i11;
        int length = this.G.length;
        mn mnVar = this.f31425r;
        if (i11 == length) {
            mnVar.u(this.f31424q0);
        }
        mnVar.o(this.f31424q0);
        h0();
        this.f31412g0 = (this.f31423p0 + this.I) - 1;
        mnVar.m(this.f31426r0);
        mnVar.m(this.f31433w0);
    }

    public final void Q(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.ag(this, f9, 2));
        ofFloat.addListener(new tm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10;
        if (!this.V && !this.T) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.P = false;
        }
        int i10 = this.f31437y0;
        if (i10 < 0) {
            return;
        }
        f2.n1 K = this.f31427s.K(i10);
        if (K == null) {
            this.f31425r.m(this.f31437y0);
            return;
        }
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) K.f6432a;
        if (!z10) {
            y5Var.setChecked(false);
        }
        y5Var.getCheckBox().f26553a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.J)) && TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && this.f31415h1.f2669a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.I && (z10 = TextUtils.isEmpty(Y(this.G[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f28403b.f30990b0.getParentActivity());
            boolean z11 = this.f31420n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new u(this, 23));
            j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.V;
        CharSequence[] charSequenceArr = this.G;
        if (z11) {
            int i13 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.H;
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
        boolean z12 = this.f31420n;
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
        if ((!TextUtils.isEmpty(Y(this.K)) && this.K.length() > this.O0) || ((!TextUtils.isEmpty(Y(this.L)) && this.L.length() > 200) || TextUtils.isEmpty(Y(this.J)) || this.J.length() > i11)) {
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
        if (i15 < 1 || (this.V && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && !z13 && this.f31415h1.f2669a.size() <= 0) {
            this.f31406d0 = true;
        } else {
            this.f31406d0 = false;
        }
        boolean z14 = this.f31406d0;
        ni niVar = this.f28403b;
        niVar.setAllowNestedScroll(z14);
        this.T0 = z10;
        niVar.W1();
    }

    public final void U(org.telegram.ui.Cells.m8 m8Var, boolean z10) {
        if (this.R != 0) {
            m8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.R), z10, false);
        } else if (this.Q != 0) {
            m8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.Q / 3600, new Object[0]), z10, false);
        } else {
            m8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(ch.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f3491b;
        bh.w wVar = this.M;
        boolean containsKey = wVar.f2716c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) wVar.f2715b.get(eVar.f3491b);
        vd.a aVar = eVar.f3497s;
        ImageReceiver imageReceiver = eVar.f2668a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f3496r.a(z11, z10);
        eVar.f3495n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.clearImage();
    }

    public final void W() {
        if (this.f31407d1) {
            this.A.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.A.setLayoutParams(layoutParams);
            this.X0 = layoutParams.height;
            this.f31409e1 = this.f31407d1;
            this.f31407d1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.a6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.on.X(android.view.View, org.telegram.ui.Cells.a6, boolean):void");
    }

    public final void Z(boolean z10) {
        if (this.E) {
            if (this.W0) {
                fz fzVar = this.A;
                fzVar.L.B0();
                fzVar.E.scrollTo(0, 0);
                fzVar.G(1);
                fzVar.M.h1(0, 0);
                this.A.t(false);
                if (z10) {
                    this.A.B();
                }
                this.f31407d1 = false;
                f0(0);
            }
            if (z10) {
                fz fzVar2 = this.A;
                if (fzVar2 != null && fzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.A.getMeasuredHeight());
                    ofFloat.addUpdateListener(new pm(this, 0));
                    this.f31403b1 = true;
                    ofFloat.addListener(new tm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        fz fzVar;
        tg emojiButton;
        if (!this.W0 && (fzVar = this.A) != null && fzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f31405c1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(rg.f32296e, false);
            }
            this.A.setVisibility(8);
        }
        int i10 = this.X0;
        this.X0 = 0;
        if (i10 != 0) {
            this.B.a();
        }
    }

    public final void b0(int i10) {
        int i11;
        this.f31413g1 = i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28403b.f30990b0;
        this.f31415h1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f31411f1 = d0(o2Var, i11, new mm(this, i10, 0), new ig(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.a6 a6Var = this.f31405c1;
        if (a6Var != null) {
            this.B.f18780e = true;
            EditTextBoldCursor editField = a6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        f0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f31401a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.C = true;
            lh.m7 m7Var = this.Q0;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 100L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.M.f2715b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f22545id)) != null) {
                    entry.setValue(webPage);
                }
            }
            bh.i iVar = this.f31415h1;
            int size = iVar.f2669a.size();
            for (int i12 = 0; i12 < size; i12++) {
                bh.h hVar2 = (bh.h) iVar.f2669a.get(i12);
                if (hVar2 instanceof ch.e) {
                    V((ch.e) hVar2, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            fz fzVar = this.A;
            if (fzVar != null) {
                fzVar.L.f1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f31405c1;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f31405c1.getEditField().setTextColor(-1);
                this.f31405c1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, bh.h hVar) {
        int i11;
        bh.i iVar = this.f31415h1;
        if (hVar != null) {
            iVar.f2669a.put(i10, hVar);
        } else {
            iVar.f2669a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f31417j0;
        } else if (i10 == -3) {
            i11 = this.f31419l0;
        } else {
            int i12 = this.f31423p0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.I) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            f2.n1 K = this.f31427s.K(i11);
            if (K != null) {
                View view = K.f6432a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).f24084e.a(hVar, true);
                }
            }
            this.f31425r.m(i11);
        }
        if (hVar instanceof ch.e) {
            ch.e eVar = (ch.e) hVar;
            String str = eVar.f3491b;
            bh.v vVar = new bh.v(16, this, hVar);
            bh.w wVar = this.M;
            HashMap hashMap = wVar.f2716c;
            HashMap hashMap2 = wVar.f2715b;
            if (hashMap2.containsKey(str)) {
                vVar.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(vVar);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(wVar.f2714a).sendRequestTyped(getwebpagepreview, new Object(), new bh.v(0, wVar, str));
                }
            }
            V(eVar, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.E) {
            nh.w3 w3Var = this.B;
            tg tgVar = null;
            ni niVar = this.f28403b;
            if (i10 == 1) {
                fz fzVar = this.A;
                if (fzVar != null && fzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fz fzVar2 = this.A;
                if (fzVar2 != null && fzVar2.Y0 != UserConfig.selectedAccount) {
                    niVar.f31029n1.removeView(fzVar2);
                    this.A = null;
                }
                if (this.A == null) {
                    fz fzVar3 = new fz(null, true, false, false, getContext(), true, null, null, true, this.f28402a, false, false);
                    this.A = fzVar3;
                    fzVar3.f28581c = 3;
                    fzVar3.f28633s0 = false;
                    fzVar3.f28638t2 = false;
                    fzVar3.setShouldDrawBackground(false);
                    fz fzVar4 = this.A;
                    fzVar4.Q0 = false;
                    fzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.A.setForseMultiwindowLayout(true);
                    }
                    this.A.setDelegate(new sm(this));
                    niVar.f31029n1.addView(this.A);
                    this.A.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.A.setVisibility(0);
                this.W0 = true;
                fz fzVar5 = this.A;
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
                    i11 = this.Z0;
                } else {
                    i11 = this.Y0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                fzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (a6Var = this.f31405c1) != null) {
                    AndroidUtilities.hideKeyboard(a6Var.getEditField());
                }
                this.X0 = i11;
                w3Var.a();
                niVar.f31029n1.requestLayout();
                org.telegram.ui.Cells.a6 a6Var2 = this.f31405c1;
                if (a6Var2 != null) {
                    tgVar = a6Var2.getEmojiButton();
                }
                if (tgVar != null) {
                    tgVar.j(rg.d, true);
                }
                if (!z10 && !this.f31401a1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X0, 0.0f);
                    ofFloat.addUpdateListener(new pm(this, 1));
                    ofFloat.addListener(new tm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a6 a6Var3 = this.f31405c1;
            if (a6Var3 != null) {
                tgVar = a6Var3.getEmojiButton();
            }
            if (tgVar != null) {
                tgVar.j(rg.f32296e, true);
            }
            fz fzVar6 = this.A;
            if (fzVar6 != null) {
                this.W0 = false;
                this.f31407d1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    fzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.X0 = 0;
            }
            w3Var.a();
            niVar.f31029n1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.T0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        j70 F = j70.F(this, null, new View(getContext()));
        F.f29600s = 0;
        F.f29601t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new nm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new nm(this, i10, 2), true);
        yl0 yl0Var = new yl0(getContext(), this.f28402a);
        F.f29595p = new org.telegram.ui.ie(yl0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        yl0Var.e(F);
        ng.d c3 = yl0Var.f35095n.c(null, null, false);
        c3.n(pg.a.j(yl0Var.f35091b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.f17329e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        yl0Var.B = c3;
        yl0Var.A = (Drawable) callbackReturn.run(yl0Var.f35097s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        yl0Var.A.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) yl0Var.f35099x.getLayoutParams()).gravity = 1;
        yl0Var.H = true;
        yl0Var.show();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        f2.n1 T;
        int i10;
        wa1 wa1Var = this.f31427s;
        if (wa1Var.getChildCount() <= 1 || (childAt = wa1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = wa1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        vk0 vk0Var = (vk0) T;
        int y8 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y8 > 0 && vk0Var != null && vk0Var.b() == 1) {
            i10 = y8;
        } else {
            i10 = 0;
        }
        if (y8 < 0 || vk0Var == null || vk0Var.b() != 1) {
            y8 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y8;
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        wa1 wa1Var = this.f31427s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 16, new Class[]{fn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 48, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 4, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i15 = org.telegram.ui.ActionBar.g6.f23223m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 196608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23190k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i17 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z10;
        this.f31418k0 = -1;
        this.f31419l0 = -1;
        this.m0 = -1;
        this.B0 = -1;
        this.f31435x0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.f31437y0 = -1;
        this.A0 = -1;
        this.f31438z0 = -1;
        this.C0 = -1;
        m.a aVar = this.I0;
        aVar.f16482b = -1;
        m.a aVar2 = this.J0;
        aVar2.f16482b = -1;
        this.H0 = -1;
        this.f31430u0 = -1;
        this.f31431v0 = -1;
        this.f31424q0 = -1;
        this.f31423p0 = -1;
        this.f31429t0 = -1;
        this.f31417j0 = -1;
        this.f31414h0 = 1;
        this.M0 = 3;
        this.f31416i0 = 2;
        boolean z11 = this.f31420n;
        if (!z11) {
            this.M0 = 4;
            this.f31417j0 = 3;
        }
        int i10 = this.M0;
        int i11 = i10 + 1;
        this.f31421n0 = i10;
        int i12 = i10 + 2;
        this.M0 = i12;
        this.f31422o0 = i11;
        int i13 = this.I;
        if (i13 != 0) {
            this.f31423p0 = i12;
            this.M0 = i12 + i13;
        }
        if (i13 != this.G.length) {
            int i14 = this.M0;
            this.M0 = i14 + 1;
            this.f31424q0 = i14;
        }
        int i15 = this.M0;
        this.f31426r0 = i15;
        int i16 = i15 + 2;
        this.M0 = i16;
        this.f31428s0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.M0 = i17;
            this.f31431v0 = i16;
            if (this.f31404c0) {
                this.M0 = i15 + 4;
                this.f31430u0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.tn) this.f28403b.f30990b0).f42787e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i18 = this.M0;
                this.M0 = i18 + 1;
                this.f31435x0 = i18;
            } else {
                this.T = true;
            }
            int i19 = this.M0;
            int i20 = i19 + 1;
            this.M0 = i20;
            this.B0 = i19;
            if (!z10) {
                this.M0 = i19 + 2;
                this.f31437y0 = i20;
            } else {
                this.P = false;
            }
            int i21 = this.M0;
            this.f31438z0 = i21;
            this.A0 = i21 + 1;
            int i22 = i21 + 3;
            this.M0 = i22;
            this.C0 = i21 + 2;
            if (z10) {
                aVar.f16482b = i22;
                int i23 = i21 + 5;
                this.M0 = i23;
                aVar2.f16482b = i21 + 4;
                if (aVar2.f16481a) {
                    this.M0 = i21 + 6;
                    this.H0 = i23;
                }
            }
            int i24 = this.M0;
            int i25 = i24 + 1;
            this.M0 = i25;
            this.D0 = i24;
            if (this.Q != 0 || this.R != 0) {
                this.E0 = i25;
                this.F0 = i24 + 2;
                this.M0 = i24 + 4;
                this.G0 = i24 + 3;
            }
            int i26 = this.M0;
            int i27 = i26 + 1;
            this.M0 = i27;
            this.f31429t0 = i26;
            if (this.V) {
                this.f31418k0 = i27;
                this.f31419l0 = i26 + 2;
                this.M0 = i26 + 4;
                this.m0 = i26 + 3;
            }
        }
        int i28 = this.M0;
        this.M0 = i28 + 1;
        this.f31433w0 = i28;
    }

    @Override
    public final boolean i() {
        if (this.W0) {
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
        this.D = true;
        ni niVar = this.f28403b;
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            fz fzVar = this.A;
            if (fzVar != null) {
                niVar.f31029n1.removeView(fzVar);
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
        this.f28403b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f31408e0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f9) {
        this.f28403b.W1();
    }

    public void setDelegate(nn nnVar) {
        this.f31410f0 = nnVar;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f31420n;
            int i11 = 0;
            int i12 = 1;
            ni niVar = this.f28403b;
            CharSequence[] charSequenceArr = this.G;
            if (z11) {
                CharSequence[] charSequenceArr2 = {Y(this.J)};
                int i13 = niVar.F1;
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
                boolean z12 = this.f31404c0;
                if (z12 && this.f31402b0) {
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
                        todoItem.f22537id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                c5.a0(i13, niVar.j1() + 1, niVar.n1(), new ih.i(this, (org.telegram.ui.tn) niVar.f30990b0, tL_messageMediaToDo, 8));
                return;
            }
            boolean z13 = this.V;
            wa1 wa1Var = this.f31427s;
            boolean[] zArr = this.H;
            if (z13 && !this.T0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f31423p0; i18 < this.f31423p0 + this.I; i18++) {
                        f2.n1 K = wa1Var.K(i18);
                        if (K != null) {
                            View view = K.f6432a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    en enVar = this.f31434x;
                                    if (enVar != null) {
                                        enVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    g40 g40Var = this.f31436y;
                                    g40Var.setText(string);
                                    g40Var.f(a6Var.getCheckBox(), true);
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
                bh.i iVar = this.f31415h1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                        this.R0 = true;
                        this.S0 = i19;
                        wa1Var.x0(this.f31423p0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.J)};
                    int i20 = niVar.F1;
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
                    tL_poll.multiple_choice = this.U;
                    tL_poll.quiz = this.V;
                    tL_poll.public_voters = !this.T;
                    tL_poll.open_answers = this.P;
                    tL_poll.revoting_disabled = !this.N;
                    tL_poll.shuffle_answers = this.O;
                    tL_poll.subscribers_only = this.I0.f16481a;
                    if (this.J0.f16481a) {
                        ArrayList arrayList = this.L0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.Q;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.S;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.R;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.S;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = entities3;
                    ArrayList arrayList2 = new ArrayList(this.F);
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
                            if ((this.U || this.V) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = 0;
                        i12 = 1;
                    }
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence Y = Y(this.L);
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
                    c5.a0(i20, niVar.j1() + 1, niVar.n1(), new eg.d1(this, (org.telegram.ui.tn) niVar.f30990b0, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        mn mnVar = this.f31425r;
        if (mnVar != null) {
            mnVar.l();
        }
        if (this.E) {
            Z(false);
            en enVar = this.f31434x;
            if (enVar != null) {
                enVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f31405c1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f31405c1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f31405c1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.on.y(int, int):void");
    }
}
