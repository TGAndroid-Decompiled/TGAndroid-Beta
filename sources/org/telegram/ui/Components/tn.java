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
import org.telegram.ui.ec1;
public final class tn extends ni implements nv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f30623m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public kz E;
    public int E0;
    public final di.j4 F;
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
    public final rh.r Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.l7 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f30624a0;
    public boolean f30625a1;
    public boolean f30626b0;
    public int f30627b1;
    public boolean f30628c0;
    public int f30629c1;
    public boolean f30630d0;
    public int f30631d1;
    public final boolean f30632e0;
    public boolean f30633e1;
    public boolean f30634f0;
    public boolean f30635f1;
    public boolean f30636g0;
    public org.telegram.ui.Cells.c6 f30637g1;
    public boolean f30638h0;
    public boolean f30639h1;
    public boolean f30640i0;
    public boolean f30641i1;
    public sn f30642j0;
    public bn f30643j1;
    public int f30644k0;
    public int f30645k1;
    public int f30646l0;
    public final rh.f l1;
    public int m0;
    public final boolean f30647n;
    public int f30648n0;
    public int f30649o0;
    public int f30650p0;
    public int f30651q0;
    public final rn f30652r;
    public int f30653r0;
    public final ec1 f30654s;
    public int f30655s0;
    public int f30656t0;
    public int f30657u0;
    public final gn v;
    public int f30658v0;
    public final ig.e0 f30659w;
    public int f30660w0;
    public final in f30661x;
    public int f30662x0;
    public final i40 f30663y;
    public int f30664y0;
    public int f30665z0;

    public tn(vi viVar, Context context, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, viVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f30626b0 = true;
        this.f30634f0 = true;
        this.f30636g0 = true;
        this.f30644k0 = -1;
        c2.a aVar = new c2.a(this);
        this.M0 = aVar;
        c2.a aVar2 = new c2.a(this);
        this.N0 = aVar2;
        this.O0 = new c2.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.l7(this, 8);
        this.V0 = false;
        this.W0 = -1;
        this.f30639h1 = false;
        this.f30641i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new rh.f();
        this.f30647n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f28753b.J1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f30628c0 = booleanValue;
            this.f30632e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.f28752a));
        this.f28753b.f31316r1.setDelegate(this);
        rn rnVar = new rn(this, context);
        this.f30652r = rnVar;
        ec1 ec1Var = new ec1(context, 5, null);
        this.f30654s = ec1Var;
        this.f28754c = ec1Var;
        this.d = ec1Var;
        this.h = true;
        this.f28756f = true;
        gn gnVar = new gn(this);
        this.v = gnVar;
        ec1Var.setItemAnimator(gnVar);
        arrayList.clear();
        gnVar.f45777m = false;
        gnVar.C = false;
        gnVar.o(pr.h);
        gnVar.n(350L);
        ec1Var.setClipToPadding(false);
        ec1Var.setVerticalScrollBarEnabled(false);
        ec1Var.setSections(true);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, ec1Var, 4);
        this.f30659w = e0Var;
        ec1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.y(new ci.f(this, 2)).d(ec1Var);
        addView(ec1Var, w7.x5.e(-1, -1, 51));
        ec1Var.setPreserveFocusAfterLayout(true);
        ec1Var.setAdapter(rnVar);
        ec1Var.setOnItemClickListener(new vm(this, f6Var, viVar, context));
        ec1Var.setOnScrollListener(new ah.e0(this, 23));
        i40 i40Var = new i40(context, 4);
        this.f30663y = i40Var;
        i40Var.setAlpha(0.0f);
        i40Var.setVisibility(4);
        addView(i40Var, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f28753b.J1).config.pollCaptionLengthMax.get();
        this.Q = new rh.r(this.f28753b.J1);
        NotificationCenter.getInstance(this.f28753b.J1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? my0Var = new my0(context, this.f28753b.J1, null, f6Var);
            this.f30661x = my0Var;
            my0Var.f28569y = true;
            my0Var.E = true;
            my0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) my0Var, w7.x5.e(-2, 160, 51));
        }
        this.F = new di.j4(this.f28753b.f31316r1, false, null);
        T();
    }

    public static void K(tn tnVar, int i10) {
        i40 i40Var = tnVar.f30663y;
        s4.c1 K = tnVar.f30654s.K(tnVar.f30656t0 + i10);
        if (K != null) {
            View view = K.f45738a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    in inVar = tnVar.f30661x;
                    if (inVar != null) {
                        inVar.f();
                    }
                    i40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    i40Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = i40Var.f26958c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    i40Var.setTranslationY(i40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void L(org.telegram.ui.Components.tn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.L(org.telegram.ui.Components.tn, android.view.View, int):void");
    }

    public static void M(tn tnVar, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        if (tnVar.I && z10) {
            if (tnVar.f30637g1 == c6Var && tnVar.f30625a1 && tnVar.f30639h1) {
                tnVar.W();
                tnVar.f30625a1 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = tnVar.f30637g1;
            tnVar.f30637g1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            bh emojiButton = c6Var.getEmojiButton();
            zg zgVar = zg.f33152e;
            emojiButton.j(zgVar, false);
            ec1 ec1Var = tnVar.f30654s;
            View F = ec1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = ec1Var.T(F);
            }
            in inVar = tnVar.f30661x;
            if (inVar != null) {
                inVar.f();
                if (T != null) {
                    View view = T.f45738a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && inVar.getDelegate() != view) {
                        inVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (tnVar.f30625a1) {
                    tnVar.W();
                    tnVar.Z(false);
                    tnVar.c0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(zgVar, false);
            }
        }
    }

    public static void N(tn tnVar, org.telegram.ui.Cells.c6 c6Var) {
        tnVar.f30637g1 = c6Var;
        if (tnVar.f30625a1) {
            tnVar.W();
            tnVar.c0();
            return;
        }
        tnVar.f0(1);
    }

    public static void O(tn tnVar, int i10) {
        vi viVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i11;
        rh.f fVar = tnVar.l1;
        if (fVar.b(i10) != null) {
            rh.e b10 = fVar.b(i10);
            if (b10 != null && (viVar = tnVar.f28753b) != null && (n2Var = viVar.f31279f0) != null) {
                Activity parentActivity = n2Var.getParentActivity();
                if (b10 instanceof sh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((sh.d) b10).f46397b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new ym(tnVar, i10), null);
                    return;
                } else if (b10 instanceof sh.h) {
                    sh.h hVar = (sh.h) b10;
                    org.telegram.ui.st.q().w(parentActivity);
                    org.telegram.ui.st.q().v(new an(tnVar, i10));
                    org.telegram.ui.st q6 = org.telegram.ui.st.q();
                    TLRPC.Document document = hVar.f46409b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f46410c, tnVar.f28752a, 200);
                    return;
                } else if (b10 instanceof sh.c) {
                    sh.c cVar = (sh.c) b10;
                    String str = cVar.d;
                    tnVar.g0(i10, new org.telegram.ui.vf(1, str, AndroidUtilities.formatFileSize(cVar.f46394e, true, true) + " " + cVar.f46395f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.g) {
                    sh.g gVar = (sh.g) b10;
                    TLRPC.Document document2 = gVar.f46407b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    tnVar.g0(i10, new di.p5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.f) {
                    tnVar.g0(i10, new xi((sh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof sh.e) {
                    sh.e eVar = (sh.e) b10;
                    e5.g0(tnVar.getContext(), tnVar.f28752a, eVar.f46399b, eVar.f46403n, new rm(tnVar, i10, 1), new sm(tnVar, i10, 0));
                    return;
                } else {
                    tnVar.b0(i10);
                    return;
                }
            }
            return;
        }
        tnVar.b0(i10);
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

    public static bn d0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, pg pgVar) {
        if (n2Var == null) {
            return null;
        }
        bn bnVar = new bn(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), pgVar);
        bnVar.Z1 = new dn(callback, n2Var, bnVar);
        bnVar.a2 = new en(callback, bnVar);
        bnVar.f31291j0.f0();
        bnVar.J1(1, true);
        bnVar.h1(i10);
        bnVar.f31324t2 = new tm(callback);
        bnVar.X = new fn(callback, n2Var, bnVar);
        bnVar.Y = new b3(8, callback, bnVar);
        bnVar.r1();
        bnVar.setFocusable(true);
        bnVar.show();
        return bnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f30647n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        vi viVar = this.f28753b;
        if (viVar != null) {
            return viVar.J1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(ni niVar) {
        vi viVar = this.f28753b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f30647n) {
            viVar.X0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f30632e0) {
            viVar.X0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            viVar.X0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        viVar.W1();
        this.f30659w.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f30654s.x0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f30633e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f30631d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f30631d1).commit();
                } else {
                    this.f30629c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f30629c1).commit();
                }
            }
            boolean z13 = this.f30625a1;
            vi viVar = this.f28753b;
            di.j4 j4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f30631d1;
                } else {
                    i11 = this.f30629c1;
                }
                if (this.f30639h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f30641i1 != this.f30639h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f30627b1 = layoutParams.height;
                    j4Var.a();
                    viVar.f31316r1.requestLayout();
                    boolean z14 = this.f30641i1;
                    if (z14 != this.f30639h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f30641i1 = this.f30639h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f30633e1;
                org.telegram.ui.Cells.c6 c6Var = this.f30637g1;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && j4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f30633e1 = z12;
                } else {
                    this.f30633e1 = false;
                }
                if (this.f30633e1 && this.f30625a1) {
                    f0(0);
                }
                if (this.f30627b1 != 0 && !(z11 = this.f30633e1) && z11 != z15 && !this.f30625a1) {
                    this.f30627b1 = 0;
                    j4Var.a();
                    viVar.f31316r1.requestLayout();
                }
                if (this.f30633e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    public final void P() {
        in inVar = this.f30661x;
        if (inVar != null) {
            inVar.setDelegate(null);
            inVar.f();
        }
        this.f30654s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        rn rnVar = this.f30652r;
        if (i11 == length) {
            rnVar.u(this.f30657u0);
        }
        rnVar.o(this.f30657u0);
        h0();
        this.f30644k0 = (this.f30656t0 + this.M) - 1;
        rnVar.m(this.f30658v0);
        rnVar.m(this.A0);
    }

    public final void Q(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.ng(this, f7, 2));
        ofFloat.addListener(new xm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10;
        if (!this.f30628c0 && !this.f30624a0) {
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
        s4.c1 K = this.f30654s.K(i10);
        if (K == null) {
            this.f30652r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) K.f45738a;
        if (!z10) {
            z5Var.setChecked(false);
        }
        z5Var.getCheckBox().f24147a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.N)) && TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && this.l1.f45618a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(Y(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f28753b.f31279f0.getParentActivity());
            boolean z11 = this.f30647n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20198a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20198a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            i2.g.r(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f30628c0;
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
        boolean z12 = this.f30647n;
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
        if (i15 < 1 || (this.f30628c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f45618a.size() <= 0) {
            this.f30638h0 = true;
        } else {
            this.f30638h0 = false;
        }
        boolean z14 = this.f30638h0;
        vi viVar = this.f28753b;
        viVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        viVar.W1();
    }

    public final void U(org.telegram.ui.Cells.r8 r8Var, boolean z10) {
        if (this.V != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(sh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f46399b;
        rh.r rVar = this.Q;
        boolean containsKey = rVar.f45663c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f45662b.get(eVar.f46399b);
        le.b bVar = eVar.f46405s;
        ImageReceiver imageReceiver = eVar.f45617a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f46404r.a(z11, z10);
        eVar.f46403n = webPage;
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
        if (this.f30639h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f30627b1 = layoutParams.height;
            this.f30641i1 = this.f30639h1;
            this.f30639h1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.c6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.X(android.view.View, org.telegram.ui.Cells.c6, boolean):void");
    }

    public final void Z(boolean z10) {
        if (this.I) {
            if (this.f30625a1) {
                kz kzVar = this.E;
                kzVar.P.B0();
                kzVar.I.scrollTo(0, 0);
                kzVar.H(1);
                kzVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.B();
                }
                this.f30639h1 = false;
                f0(0);
            }
            if (z10) {
                kz kzVar2 = this.E;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new um(this, 0));
                    this.f30635f1 = true;
                    ofFloat.addListener(new xm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        kz kzVar;
        bh emojiButton;
        if (!this.f30625a1 && (kzVar = this.E) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f30637g1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(zg.f33152e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f30627b1;
        this.f30627b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    public final void b0(int i10) {
        int i11;
        this.f30645k1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28753b.f31279f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f30643j1 = d0(n2Var, i11, new rm(this, i10, 0), new pg(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.c6 c6Var = this.f30637g1;
        if (c6Var != null) {
            this.F.f7429e = true;
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
        if (!AndroidUtilities.usingHardwareInput && !this.f30633e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            org.telegram.ui.Cells.l7 l7Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 100L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.i iVar = (a0.i) objArr[0];
            for (Map.Entry entry : this.Q.f45662b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) iVar.f(((TLRPC.WebPage) entry.getValue()).f20022id)) != null) {
                    entry.setValue(webPage);
                }
            }
            rh.f fVar = this.l1;
            int size = fVar.f45618a.size();
            for (int i12 = 0; i12 < size; i12++) {
                rh.e eVar = (rh.e) fVar.f45618a.get(i12);
                if (eVar instanceof sh.e) {
                    V((sh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            kz kzVar = this.E;
            if (kzVar != null) {
                kzVar.P.e1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f30637g1;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f30637g1.getEditField().setTextColor(-1);
                this.f30637g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, rh.e eVar) {
        int i11;
        rh.f fVar = this.l1;
        if (eVar != null) {
            fVar.f45618a.put(i10, eVar);
        } else {
            fVar.f45618a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f30648n0;
        } else if (i10 == -3) {
            i11 = this.f30650p0;
        } else {
            int i12 = this.f30656t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.c1 K = this.f30654s.K(i11);
            if (K != null) {
                View view = K.f45738a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).f21685e.a(eVar, true);
                }
            }
            this.f30652r.m(i11);
        }
        if (eVar instanceof sh.e) {
            sh.e eVar2 = (sh.e) eVar;
            String str = eVar2.f46399b;
            bi.f0 f0Var = new bi.f0(10, this, eVar);
            rh.r rVar = this.Q;
            HashMap hashMap = rVar.f45663c;
            HashMap hashMap2 = rVar.f45662b;
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
                    ConnectionsManager.getInstance(rVar.f45661a).sendRequestTyped(getwebpagepreview, new Object(), new bi.f0(20, rVar, str));
                }
            }
            V(eVar2, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.I) {
            di.j4 j4Var = this.F;
            bh bhVar = null;
            vi viVar = this.f28753b;
            if (i10 == 1) {
                kz kzVar = this.E;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kz kzVar2 = this.E;
                if (kzVar2 != null && kzVar2.f27932c1 != UserConfig.selectedAccount) {
                    viVar.f31316r1.removeView(kzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    kz kzVar3 = new kz(null, true, false, false, getContext(), true, null, null, true, this.f28752a, false, false);
                    this.E = kzVar3;
                    kzVar3.f27930c = 3;
                    kzVar3.f27995w0 = false;
                    kzVar3.f28001x2 = false;
                    kzVar3.setShouldDrawBackground(false);
                    kz kzVar4 = this.E;
                    kzVar4.U0 = false;
                    kzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new wm(this));
                    viVar.f31316r1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f30625a1 = true;
                kz kzVar5 = this.E;
                if (this.f30629c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f30629c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f30629c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f30631d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f30631d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f30631d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f30631d1;
                } else {
                    i11 = this.f30629c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                kzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f30637g1) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.f30627b1 = i11;
                j4Var.a();
                viVar.f31316r1.requestLayout();
                org.telegram.ui.Cells.c6 c6Var2 = this.f30637g1;
                if (c6Var2 != null) {
                    bhVar = c6Var2.getEmojiButton();
                }
                if (bhVar != null) {
                    bhVar.j(zg.d, true);
                }
                if (!z10 && !this.f30633e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30627b1, 0.0f);
                    ofFloat.addUpdateListener(new um(this, 1));
                    ofFloat.addListener(new xm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c6 c6Var3 = this.f30637g1;
            if (c6Var3 != null) {
                bhVar = c6Var3.getEmojiButton();
            }
            if (bhVar != null) {
                bhVar.j(zg.f33152e, true);
            }
            kz kzVar6 = this.E;
            if (kzVar6 != null) {
                this.f30625a1 = false;
                this.f30639h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f30627b1 = 0;
            }
            j4Var.a();
            viVar.f31316r1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.X0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        n70 F = n70.F(this, null, new View(getContext()));
        F.f28660s = 0;
        F.f28661t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new sm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new sm(this, i10, 2), true);
        am0 am0Var = new am0(getContext(), this.f28752a);
        F.f28655p = new org.telegram.ui.qe(am0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        am0Var.e(F);
        dh.d c10 = am0Var.f24422n.c(null, null, false);
        c10.n(fh.b.k(am0Var.f24418b));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.f6821e = true;
        c10.p(AndroidUtilities.dp(16.0f));
        am0Var.F = c10;
        am0Var.E = (Drawable) callbackReturn.run(am0Var.f24424s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        am0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) am0Var.f24426x.getLayoutParams()).gravity = 1;
        am0Var.L = true;
        am0Var.show();
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
        ec1 ec1Var = this.f30654s;
        if (ec1Var.getChildCount() <= 1 || (childAt = ec1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = ec1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        vk0 vk0Var = (vk0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && vk0Var != null && vk0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || vk0Var == null || vk0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f30627b1;
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
        ec1 ec1Var = this.f30654s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f20627b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20607a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 16, new Class[]{jn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.f20880p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.f20827m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f20792k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ec1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z10;
        this.f30649o0 = -1;
        this.f30650p0 = -1;
        this.f30651q0 = -1;
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
        aVar.f4139b = -1;
        c2.a aVar2 = this.N0;
        aVar2.f4139b = -1;
        this.L0 = -1;
        this.f30664y0 = -1;
        this.f30665z0 = -1;
        this.f30657u0 = -1;
        this.f30656t0 = -1;
        this.f30662x0 = -1;
        this.f30648n0 = -1;
        this.f30646l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f30647n;
        if (!z11) {
            this.Q0 = 4;
            this.f30648n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f30653r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f30655s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f30656t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f30657u0 = i14;
        }
        int i15 = this.Q0;
        this.f30658v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f30660w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f30665z0 = i16;
            if (this.f30636g0) {
                this.Q0 = i15 + 4;
                this.f30664y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.co) this.f28753b.f31279f0).f35237e;
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
                this.f30624a0 = true;
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
                aVar.f4139b = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                aVar2.f4139b = i21 + 4;
                if (aVar2.f4138a) {
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
            this.f30662x0 = i26;
            if (this.f30628c0) {
                this.f30649o0 = i27;
                this.f30650p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f30651q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final boolean i() {
        if (this.f30625a1) {
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
        vi viVar = this.f28753b;
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            kz kzVar = this.E;
            if (kzVar != null) {
                viVar.f31316r1.removeView(kzVar);
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
        this.f28753b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f30640i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f7) {
        this.f28753b.W1();
    }

    public void setDelegate(sn snVar) {
        this.f30642j0 = snVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28753b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f30647n;
            int i11 = 0;
            int i12 = 1;
            vi viVar = this.f28753b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {Y(this.N)};
                int i13 = viVar.J1;
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
                boolean z12 = this.f30636g0;
                if (z12 && this.f30634f0) {
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
                        todoItem.f20014id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                e5.a0(i13, viVar.j1() + 1, viVar.n1(), new bi.o4(this, (org.telegram.ui.co) viVar.f31279f0, tL_messageMediaToDo, 4));
                return;
            }
            boolean z13 = this.f30628c0;
            ec1 ec1Var = this.f30654s;
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
                    for (int i18 = this.f30656t0; i18 < this.f30656t0 + this.M; i18++) {
                        s4.c1 K = ec1Var.K(i18);
                        if (K != null) {
                            View view = K.f45738a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    in inVar = this.f30661x;
                                    if (inVar != null) {
                                        inVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    i40 i40Var = this.f30663y;
                                    i40Var.setText(string);
                                    i40Var.f(c6Var.getCheckBox(), true);
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
                rh.f fVar = this.l1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && fVar.b(i19) != null) {
                        this.V0 = true;
                        this.W0 = i19;
                        ec1Var.x0(this.f30656t0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.N)};
                    int i20 = viVar.J1;
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
                    tL_poll.multiple_choice = this.f30626b0;
                    tL_poll.quiz = this.f30628c0;
                    tL_poll.public_voters = !this.f30624a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f4138a;
                    if (this.N0.f4138a) {
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
                            if ((this.f30626b0 || this.f30628c0) && zArr[i24]) {
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
                    e5.a0(i20, viVar.j1() + 1, viVar.n1(), new bi.r3(this, (org.telegram.ui.co) viVar.f31279f0, tL_messageMediaPoll, arrayList2, 7));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        rn rnVar = this.f30652r;
        if (rnVar != null) {
            rnVar.l();
        }
        if (this.I) {
            Z(false);
            in inVar = this.f30661x;
            if (inVar != null) {
                inVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f30637g1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f30637g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f30637g1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.y(int, int):void");
    }
}
