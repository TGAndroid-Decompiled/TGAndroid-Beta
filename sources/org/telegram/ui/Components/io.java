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
import org.telegram.ui.kc1;
public final class io extends ni implements nw0, NotificationCenter.NotificationCenterDelegate {
    public static final int f26000m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public wz E;
    public int E0;
    public final di.h4 F;
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
    public final c5.f M0;
    public Editable N;
    public final c5.f N0;
    public Editable O;
    public final c5.f[] O0;
    public Editable P;
    public final ArrayList P0;
    public final rh.t Q;
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
    public boolean f26001a0;
    public boolean f26002a1;
    public boolean f26003b0;
    public int f26004b1;
    public boolean f26005c0;
    public int f26006c1;
    public boolean f26007d0;
    public int f26008d1;
    public final boolean f26009e0;
    public boolean f26010e1;
    public boolean f26011f0;
    public boolean f26012f1;
    public boolean f26013g0;
    public org.telegram.ui.Cells.d6 f26014g1;
    public boolean f26015h0;
    public boolean f26016h1;
    public boolean f26017i0;
    public boolean f26018i1;
    public ho f26019j0;
    public pn f26020j1;
    public int f26021k0;
    public int f26022k1;
    public int f26023l0;
    public final rh.f l1;
    public int m0;
    public final boolean f26024n;
    public int f26025n0;
    public int f26026o0;
    public int f26027p0;
    public int f26028q0;
    public final go f26029r;
    public int f26030r0;
    public final kc1 f26031s;
    public int f26032s0;
    public int f26033t0;
    public int f26034u0;
    public final un v;
    public int f26035v0;
    public final ig.e0 f26036w;
    public int f26037w0;
    public final wn f26038x;
    public int f26039x0;
    public final v40 f26040y;
    public int f26041y0;
    public int f26042z0;

    public io(vi viVar, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Boolean bool) {
        super(context, c6Var, viVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f26003b0 = true;
        this.f26011f0 = true;
        this.f26013g0 = true;
        this.f26021k0 = -1;
        c5.f fVar = new c5.f(this);
        this.M0 = fVar;
        c5.f fVar2 = new c5.f(this);
        this.N0 = fVar2;
        this.O0 = new c5.f[]{fVar, fVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.t6(this, 8);
        this.V0 = false;
        this.W0 = -1;
        this.f26016h1 = false;
        this.f26018i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new rh.f();
        this.f26024n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f27671b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f26005c0 = booleanValue;
            this.f26009e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        k0();
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.hl, this.f27670a));
        this.f27671b.f30048u1.setDelegate(this);
        go goVar = new go(this, context);
        this.f26029r = goVar;
        kc1 kc1Var = new kc1(context, 5, null);
        this.f26031s = kc1Var;
        this.f27672c = kc1Var;
        this.d = kc1Var;
        this.h = true;
        this.f27673f = true;
        un unVar = new un(this);
        this.v = unVar;
        kc1Var.setItemAnimator(unVar);
        arrayList.clear();
        unVar.f44872m = false;
        unVar.C = false;
        unVar.o(es.h);
        unVar.n(350L);
        kc1Var.setClipToPadding(false);
        kc1Var.setVerticalScrollBarEnabled(false);
        kc1Var.setSections(true);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, kc1Var, 4);
        this.f26036w = e0Var;
        kc1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.y(new ci.f(this, 2)).d(kc1Var);
        addView(kc1Var, w7.a6.e(-1, -1, 51));
        kc1Var.setPreserveFocusAfterLayout(true);
        kc1Var.setAdapter(goVar);
        kc1Var.setOnItemClickListener(new jn(this, c6Var, viVar, context));
        kc1Var.setOnScrollListener(new ah.d0(this, 23));
        v40 v40Var = new v40(context, 4);
        this.f26040y = v40Var;
        v40Var.setAlpha(0.0f);
        v40Var.setVisibility(4);
        addView(v40Var, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
        this.S0 = MessagesController.getInstance(this.f27671b.M1).config.pollCaptionLengthMax.get();
        this.Q = new rh.t(this.f27671b.M1);
        NotificationCenter.getInstance(this.f27671b.M1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? kz0Var = new kz0(context, this.f27671b.M1, null, c6Var);
            this.f26038x = kz0Var;
            kz0Var.f26840y = true;
            kz0Var.E = true;
            kz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) kz0Var, w7.a6.e(-2, 160, 51));
        }
        this.F = new di.h4(this.f27671b.f30048u1, false, null);
        W();
    }

    public static void N(io ioVar, int i10) {
        v40 v40Var = ioVar.f26040y;
        s4.b1 K = ioVar.f26031s.K(ioVar.f26033t0 + i10);
        if (K != null) {
            View view = K.f44838a;
            if (view instanceof org.telegram.ui.Cells.d6) {
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    wn wnVar = ioVar.f26038x;
                    if (wnVar != null) {
                        wnVar.f();
                    }
                    v40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    v40Var.f(d6Var.getCheckBox(), true);
                    ImageView imageView = v40Var.f29879c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    v40Var.setTranslationY(v40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.io r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.io.O(org.telegram.ui.Components.io, android.view.View, int):void");
    }

    public static void P(io ioVar, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        if (ioVar.I && z10) {
            if (ioVar.f26014g1 == d6Var && ioVar.f26002a1 && ioVar.f26016h1) {
                ioVar.Z();
                ioVar.f26002a1 = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = ioVar.f26014g1;
            ioVar.f26014g1 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            bh emojiButton = d6Var.getEmojiButton();
            zg zgVar = zg.e;
            emojiButton.j(zgVar, false);
            kc1 kc1Var = ioVar.f26031s;
            View F = kc1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = kc1Var.T(F);
            }
            wn wnVar = ioVar.f26038x;
            if (wnVar != null) {
                wnVar.f();
                if (T != null) {
                    View view = T.f44838a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && wnVar.getDelegate() != view) {
                        wnVar.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (ioVar.f26002a1) {
                    ioVar.Z();
                    ioVar.c0(false);
                    ioVar.f0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(zgVar, false);
            }
        }
    }

    public static void Q(io ioVar, org.telegram.ui.Cells.d6 d6Var) {
        ioVar.f26014g1 = d6Var;
        if (ioVar.f26002a1) {
            ioVar.Z();
            ioVar.f0();
            return;
        }
        ioVar.i0(1);
    }

    public static void R(io ioVar, int i10) {
        vi viVar;
        org.telegram.ui.ActionBar.m2 m2Var;
        int i11;
        rh.f fVar = ioVar.l1;
        if (fVar.b(i10) != null) {
            rh.e b10 = fVar.b(i10);
            if (b10 != null && (viVar = ioVar.f27671b) != null && (m2Var = viVar.f30001f0) != null) {
                Activity parentActivity = m2Var.getParentActivity();
                if (b10 instanceof sh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((sh.d) b10).f45462b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().g2(arrayList, 0, 14, false, new mn(ioVar, i10), null);
                    return;
                } else if (b10 instanceof sh.h) {
                    sh.h hVar = (sh.h) b10;
                    org.telegram.ui.xt.q().w(parentActivity);
                    org.telegram.ui.xt.q().v(new on(ioVar, i10));
                    org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                    TLRPC.Document document = hVar.f45473b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f45474c, ioVar.f27670a, 200);
                    return;
                } else if (b10 instanceof sh.c) {
                    sh.c cVar = (sh.c) b10;
                    String str = cVar.d;
                    ioVar.j0(i10, new org.telegram.ui.bg(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f45460f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.g) {
                    sh.g gVar = (sh.g) b10;
                    TLRPC.Document document2 = gVar.f45471b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    ioVar.j0(i10, new di.n5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.f) {
                    ioVar.j0(i10, new xi((sh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof sh.e) {
                    sh.e eVar = (sh.e) b10;
                    g5.f0(ioVar.getContext(), ioVar.f27670a, eVar.f45464b, eVar.f45467n, new fn(ioVar, i10, 1), new gn(ioVar, i10, 0));
                    return;
                } else {
                    ioVar.e0(i10);
                    return;
                }
            }
            return;
        }
        ioVar.e0(i10);
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

    public static pn g0(org.telegram.ui.ActionBar.m2 m2Var, int i10, Utilities.Callback callback, qg qgVar) {
        if (m2Var == null) {
            return null;
        }
        pn pnVar = new pn(m2Var.getContext(), m2Var, m2Var.getResourceProvider(), qgVar);
        pnVar.f29993c2 = new rn(callback, m2Var, pnVar);
        pnVar.f29996d2 = new sn(callback, pnVar);
        pnVar.f30013j0.f0();
        pnVar.N1(1, true);
        pnVar.j1(i10);
        pnVar.f30056w2 = new hn(callback);
        pnVar.X = new tn(callback, m2Var, pnVar);
        pnVar.Y = new t2(12, callback, pnVar);
        pnVar.t1();
        pnVar.setFocusable(true);
        pnVar.show();
        return pnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f26024n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        vi viVar = this.f27671b;
        if (viVar != null) {
            return viVar.M1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void A() {
        go goVar = this.f26029r;
        if (goVar != null) {
            goVar.l();
        }
        if (this.I) {
            c0(false);
            wn wnVar = this.f26038x;
            if (wnVar != null) {
                wnVar.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f26014g1;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f26014g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f26014g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.io.B(int, int):void");
    }

    @Override
    public final void G(ni niVar) {
        vi viVar = this.f27671b;
        try {
            viVar.f29985a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f26024n) {
            viVar.f29985a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f26009e0) {
            viVar.f29985a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            viVar.f29985a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        viVar.a2();
        this.f26036w.h1(0, 0);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f26010e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f26008d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26008d1).commit();
                } else {
                    this.f26006c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26006c1).commit();
                }
            }
            boolean z13 = this.f26002a1;
            vi viVar = this.f27671b;
            di.h4 h4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f26008d1;
                } else {
                    i11 = this.f26006c1;
                }
                if (this.f26016h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f26018i1 != this.f26016h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f26004b1 = layoutParams.height;
                    h4Var.a();
                    viVar.f30048u1.requestLayout();
                    boolean z14 = this.f26018i1;
                    if (z14 != this.f26016h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        T(dp);
                    }
                    this.f26018i1 = this.f26016h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f26010e1;
                org.telegram.ui.Cells.d6 d6Var = this.f26014g1;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && h4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f26010e1 = z12;
                } else {
                    this.f26010e1 = false;
                }
                if (this.f26010e1 && this.f26002a1) {
                    i0(0);
                }
                if (this.f26004b1 != 0 && !(z11 = this.f26010e1) && z11 != z15 && !this.f26002a1) {
                    this.f26004b1 = 0;
                    h4Var.a();
                    viVar.f30048u1.requestLayout();
                }
                if (this.f26010e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    @Override
    public final void J() {
        this.f26031s.x0(1);
    }

    public final void S() {
        wn wnVar = this.f26038x;
        if (wnVar != null) {
            wnVar.setDelegate(null);
            wnVar.f();
        }
        this.f26031s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        go goVar = this.f26029r;
        if (i11 == length) {
            goVar.u(this.f26034u0);
        }
        goVar.o(this.f26034u0);
        k0();
        this.f26021k0 = (this.f26033t0 + this.M) - 1;
        goVar.m(this.f26035v0);
        goVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.qg(this, f7, 2));
        ofFloat.addListener(new ln(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f26005c0 && !this.f26001a0) {
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
        s4.b1 K = this.f26031s.K(i10);
        if (K == null) {
            this.f26029r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f44838a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f23317a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.l1.f44666a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f27671b.f30001f0.getParentActivity());
            boolean z11 = this.f26024n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f19548a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f19548a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f26005c0;
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
        boolean z12 = this.f26024n;
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
        if (i15 < 1 || (this.f26005c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f44666a.size() <= 0) {
            this.f26015h0 = true;
        } else {
            this.f26015h0 = false;
        }
        boolean z14 = this.f26015h0;
        vi viVar = this.f27671b;
        viVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        viVar.a2();
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

    public final void Y(sh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f45464b;
        rh.t tVar = this.Q;
        boolean containsKey = tVar.f44713c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) tVar.f44712b.get(eVar.f45464b);
        ne.b bVar = eVar.f45469s;
        ImageReceiver imageReceiver = eVar.f44665a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f45468r.a(z11, z10);
        eVar.f45467n = webPage;
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
        if (this.f26016h1) {
            this.E.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f26004b1 = layoutParams.height;
            this.f26018i1 = this.f26016h1;
            this.f26016h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.d6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.io.a0(android.view.View, org.telegram.ui.Cells.d6, boolean):void");
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f26002a1) {
                wz wzVar = this.E;
                wzVar.P.B0();
                wzVar.I.scrollTo(0, 0);
                wzVar.F(1);
                wzVar.Q.h1(0, 0);
                this.E.u(false);
                if (z10) {
                    this.E.B();
                }
                this.f26016h1 = false;
                i0(0);
            }
            if (z10) {
                wz wzVar2 = this.E;
                if (wzVar2 != null && wzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new in(this, 0));
                    this.f26012f1 = true;
                    ofFloat.addListener(new ln(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        wz wzVar;
        bh emojiButton;
        if (!this.f26002a1 && (wzVar = this.E) != null && wzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f26014g1;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(zg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f26004b1;
        this.f26004b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f44712b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f19369id)) != null) {
                    entry.setValue(webPage);
                }
            }
            rh.f fVar = this.l1;
            int size = fVar.f44666a.size();
            for (int i12 = 0; i12 < size; i12++) {
                rh.e eVar = (rh.e) fVar.f44666a.get(i12);
                if (eVar instanceof sh.e) {
                    Y((sh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            wz wzVar = this.E;
            if (wzVar != null) {
                wzVar.P.f1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f26014g1;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f26014g1.getEditField().setTextColor(-1);
                this.f26014g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.f26022k1 = i10;
        org.telegram.ui.ActionBar.m2 m2Var = this.f27671b.f30001f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f26020j1 = g0(m2Var, i11, new fn(this, i10, 0), new qg(this, 26));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.d6 d6Var = this.f26014g1;
        if (d6Var != null) {
            this.F.e = true;
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
        if (!AndroidUtilities.usingHardwareInput && !this.f26010e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
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
        s4.b1 T;
        int i10;
        kc1 kc1Var = this.f26031s;
        if (kc1Var.getChildCount() <= 1 || (childAt = kc1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = kc1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        wl0 wl0Var = (wl0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && wl0Var != null && wl0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || wl0Var == null || wl0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f26004b1;
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        kc1 kc1Var = this.f26031s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f19863b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f19843a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 16, new Class[]{xn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.f20122p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i15 = org.telegram.ui.ActionBar.g6.f20064m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f20029k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i17 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, rh.e eVar) {
        int i11;
        rh.f fVar = this.l1;
        if (eVar != null) {
            fVar.f44666a.put(i10, eVar);
        } else {
            fVar.f44666a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f26025n0;
        } else if (i10 == -3) {
            i11 = this.f26027p0;
        } else {
            int i12 = this.f26033t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.b1 K = this.f26031s.K(i11);
            if (K != null) {
                View view = K.f44838a;
                if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).e.a(eVar, true);
                }
            }
            this.f26029r.m(i11);
        }
        if (eVar instanceof sh.e) {
            sh.e eVar2 = (sh.e) eVar;
            String str = eVar2.f45464b;
            bi.f0 f0Var = new bi.f0(10, this, eVar);
            rh.t tVar = this.Q;
            HashMap hashMap = tVar.f44713c;
            HashMap hashMap2 = tVar.f44712b;
            if (hashMap2.containsKey(str)) {
                f0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(f0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(tVar.f44711a).sendRequestTyped(getwebpagepreview, new Object(), new rh.s(0, tVar, str));
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
            di.h4 h4Var = this.F;
            bh bhVar = null;
            vi viVar = this.f27671b;
            if (i10 == 1) {
                wz wzVar = this.E;
                if (wzVar != null && wzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wz wzVar2 = this.E;
                if (wzVar2 != null && wzVar2.f31014c1 != UserConfig.selectedAccount) {
                    viVar.f30048u1.removeView(wzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    wz wzVar3 = new wz(null, true, false, false, getContext(), true, null, null, true, this.f27670a, false, false);
                    this.E = wzVar3;
                    wzVar3.f31012c = 3;
                    wzVar3.f31076w0 = false;
                    wzVar3.f31078w2 = false;
                    wzVar3.setShouldDrawBackground(false);
                    wz wzVar4 = this.E;
                    wzVar4.U0 = false;
                    wzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new kn(this));
                    viVar.f30048u1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f26002a1 = true;
                wz wzVar5 = this.E;
                if (this.f26006c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f26006c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f26006c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f26008d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f26008d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f26008d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f26008d1;
                } else {
                    i11 = this.f26006c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                wzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f26014g1) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.f26004b1 = i11;
                h4Var.a();
                viVar.f30048u1.requestLayout();
                org.telegram.ui.Cells.d6 d6Var2 = this.f26014g1;
                if (d6Var2 != null) {
                    bhVar = d6Var2.getEmojiButton();
                }
                if (bhVar != null) {
                    bhVar.j(zg.d, true);
                }
                if (!z10 && !this.f26010e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26004b1, 0.0f);
                    ofFloat.addUpdateListener(new in(this, 1));
                    ofFloat.addListener(new ln(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d6 d6Var3 = this.f26014g1;
            if (d6Var3 != null) {
                bhVar = d6Var3.getEmojiButton();
            }
            if (bhVar != null) {
                bhVar.j(zg.e, true);
            }
            wz wzVar6 = this.E;
            if (wzVar6 != null) {
                this.f26002a1 = false;
                this.f26016h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f26004b1 = 0;
            }
            h4Var.a();
            viVar.f30048u1.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f26002a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        m80 F = m80.F(this, null, new View(getContext()));
        F.f27298s = 0;
        F.f27299t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new gn(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new gn(this, i10, 2), true);
        cn0 cn0Var = new cn0(getContext(), this.f27670a);
        F.f27293p = new org.telegram.ui.ye(cn0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        cn0Var.e(F);
        dh.d c10 = cn0Var.f24144n.c(null, null, false);
        c10.o(fh.b.k(cn0Var.f24141b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f6558j.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        cn0Var.F = c10;
        cn0Var.E = (Drawable) callbackReturn.run(cn0Var.f24146s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        cn0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) cn0Var.f24148x.getLayoutParams()).gravity = 1;
        cn0Var.L = true;
        cn0Var.show();
    }

    public final void k0() {
        boolean z10;
        this.f26026o0 = -1;
        this.f26027p0 = -1;
        this.f26028q0 = -1;
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
        c5.f fVar = this.M0;
        fVar.f4357a = -1;
        c5.f fVar2 = this.N0;
        fVar2.f4357a = -1;
        this.L0 = -1;
        this.f26041y0 = -1;
        this.f26042z0 = -1;
        this.f26034u0 = -1;
        this.f26033t0 = -1;
        this.f26039x0 = -1;
        this.f26025n0 = -1;
        this.f26023l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f26024n;
        if (!z11) {
            this.Q0 = 4;
            this.f26025n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f26030r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f26032s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f26033t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f26034u0 = i14;
        }
        int i15 = this.Q0;
        this.f26035v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f26037w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f26042z0 = i16;
            if (this.f26013g0) {
                this.Q0 = i15 + 4;
                this.f26041y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.fo) this.f27671b.f30001f0).e;
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
                this.f26001a0 = true;
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
                fVar.f4357a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                fVar2.f4357a = i21 + 4;
                if (fVar2.f4358b) {
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
            this.f26039x0 = i26;
            if (this.f26005c0) {
                this.f26026o0 = i27;
                this.f26027p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f26028q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void o() {
        this.H = true;
        vi viVar = this.f27671b;
        NotificationCenter.getInstance(viVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            wz wzVar = this.E;
            if (wzVar != null) {
                viVar.f30048u1.removeView(wzVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f26017i0) {
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

    public void setDelegate(ho hoVar) {
        this.f26019j0 = hoVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        this.f27671b.a2();
    }

    @Override
    public final void v(float f7) {
        this.f27671b.a2();
    }

    @Override
    public final void w(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f26024n;
            int i12 = 0;
            int i13 = 1;
            vi viVar = this.f27671b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {b0(this.N)};
                int i14 = viVar.M1;
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
                boolean z12 = this.f26013g0;
                if (z12 && this.f26011f0) {
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
                        todoItem.f19361id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                g5.Z(i14, viVar.l1() + 1, viVar.p1(), new bi.q4(this, (org.telegram.ui.fo) viVar.f30001f0, tL_messageMediaToDo, 6));
                return;
            }
            boolean z13 = this.f26005c0;
            kc1 kc1Var = this.f26031s;
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
                    for (int i19 = this.f26033t0; i19 < this.f26033t0 + this.M; i19++) {
                        s4.b1 K = kc1Var.K(i19);
                        if (K != null) {
                            View view = K.f44838a;
                            if (view instanceof org.telegram.ui.Cells.d6) {
                                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    wn wnVar = this.f26038x;
                                    if (wnVar != null) {
                                        wnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    v40 v40Var = this.f26040y;
                                    v40Var.setText(string);
                                    v40Var.f(d6Var.getCheckBox(), true);
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
                rh.f fVar = this.l1;
                if (i20 < length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && fVar.b(i20) != null) {
                        this.V0 = true;
                        this.W0 = i20;
                        kc1Var.x0(this.f26033t0 + i20);
                        return;
                    }
                    i20++;
                } else {
                    CharSequence[] charSequenceArr4 = {b0(this.N)};
                    int i21 = viVar.M1;
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
                    tL_poll.multiple_choice = this.f26003b0;
                    tL_poll.quiz = this.f26005c0;
                    tL_poll.public_voters = !this.f26001a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f4358b;
                    if (this.N0.f4358b) {
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
                            if ((this.f26003b0 || this.f26005c0) && zArr[i25]) {
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
                    g5.Z(i21, viVar.l1() + 1, viVar.p1(), new bi.u3(this, (org.telegram.ui.fo) viVar.f30001f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
