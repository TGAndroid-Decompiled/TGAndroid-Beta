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
import org.telegram.ui.wb1;
public final class vn extends oi implements ov0, NotificationCenter.NotificationCenterDelegate {
    public static final int f28774m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public lz E;
    public int E0;
    public final ci.i4 F;
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
    public final qh.r Q;
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
    public boolean f28775a0;
    public boolean f28776a1;
    public boolean f28777b0;
    public int f28778b1;
    public boolean f28779c0;
    public int f28780c1;
    public boolean f28781d0;
    public int f28782d1;
    public final boolean f28783e0;
    public boolean f28784e1;
    public boolean f28785f0;
    public boolean f28786f1;
    public boolean f28787g0;
    public org.telegram.ui.Cells.d6 f28788g1;
    public boolean f28789h0;
    public boolean f28790h1;
    public boolean f28791i0;
    public boolean f28792i1;
    public un f28793j0;
    public dn f28794j1;
    public int f28795k0;
    public int f28796k1;
    public int f28797l0;
    public final qh.f l1;
    public int m0;
    public final boolean f28798n;
    public int f28799n0;
    public int f28800o0;
    public int f28801p0;
    public int f28802q0;
    public final tn f28803r;
    public int f28804r0;
    public final wb1 f28805s;
    public int f28806s0;
    public int f28807t0;
    public int f28808u0;
    public final in v;
    public int f28809v0;
    public final hg.g0 f28810w;
    public int f28811w0;
    public final kn f28812x;
    public int f28813x0;
    public final j40 f28814y;
    public int f28815y0;
    public int f28816z0;

    public vn(wi wiVar, Context context, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, Boolean bool) {
        super(context, d6Var, wiVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f28777b0 = true;
        this.f28785f0 = true;
        this.f28787g0 = true;
        this.f28795k0 = -1;
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
        this.f28790h1 = false;
        this.f28792i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new qh.f();
        this.f28798n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f26744b.J1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f28779c0 = booleanValue;
            this.f28783e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.hl, this.f26743a));
        this.f26744b.f29702r1.setDelegate(this);
        tn tnVar = new tn(this, context);
        this.f28803r = tnVar;
        wb1 wb1Var = new wb1(context, 5, null);
        this.f28805s = wb1Var;
        this.f26745c = wb1Var;
        this.d = wb1Var;
        this.h = true;
        this.f26746f = true;
        in inVar = new in(this);
        this.v = inVar;
        wb1Var.setItemAnimator(inVar);
        arrayList.clear();
        inVar.f42662m = false;
        inVar.C = false;
        inVar.o(rr.h);
        inVar.n(350L);
        wb1Var.setClipToPadding(false);
        wb1Var.setVerticalScrollBarEnabled(false);
        wb1Var.setSections(true);
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, wb1Var, 4);
        this.f28810w = g0Var;
        wb1Var.setLayoutManager(g0Var);
        g0Var.O = true;
        new s4.y(new bi.g(this, 2)).e(wb1Var);
        addView(wb1Var, w7.x5.e(-1, -1, 51));
        wb1Var.setPreserveFocusAfterLayout(true);
        wb1Var.setAdapter(tnVar);
        wb1Var.setOnItemClickListener(new wm(this, d6Var, wiVar, context));
        wb1Var.setOnScrollListener(new ai.r(this, 22));
        j40 j40Var = new j40(context, 4);
        this.f28814y = j40Var;
        j40Var.setAlpha(0.0f);
        j40Var.setVisibility(4);
        addView(j40Var, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f26744b.J1).config.pollCaptionLengthMax.get();
        this.Q = new qh.r(this.f26744b.J1);
        NotificationCenter.getInstance(this.f26744b.J1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? my0Var = new my0(context, this.f26744b.J1, null, d6Var);
            this.f28812x = my0Var;
            my0Var.f26301y = true;
            my0Var.E = true;
            my0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) my0Var, w7.x5.e(-2, 160, 51));
        }
        this.F = new ci.i4(this.f26744b.f29702r1, false, null);
        T();
    }

    public static void K(vn vnVar, int i10) {
        j40 j40Var = vnVar.f28814y;
        s4.c1 K = vnVar.f28805s.K(vnVar.f28807t0 + i10);
        if (K != null) {
            View view = K.f42627a;
            if (view instanceof org.telegram.ui.Cells.d6) {
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    kn knVar = vnVar.f28812x;
                    if (knVar != null) {
                        knVar.f();
                    }
                    j40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    j40Var.f(d6Var.getCheckBox(), true);
                    ImageView imageView = j40Var.f25130c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    j40Var.setTranslationY(j40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void L(org.telegram.ui.Components.vn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.L(org.telegram.ui.Components.vn, android.view.View, int):void");
    }

    public static void M(vn vnVar, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        if (vnVar.I && z10) {
            if (vnVar.f28788g1 == d6Var && vnVar.f28776a1 && vnVar.f28790h1) {
                vnVar.W();
                vnVar.f28776a1 = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = vnVar.f28788g1;
            vnVar.f28788g1 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            ah emojiButton = d6Var.getEmojiButton();
            yg ygVar = yg.e;
            emojiButton.j(ygVar, false);
            wb1 wb1Var = vnVar.f28805s;
            View F = wb1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = wb1Var.T(F);
            }
            kn knVar = vnVar.f28812x;
            if (knVar != null) {
                knVar.f();
                if (T != null) {
                    View view = T.f42627a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && knVar.getDelegate() != view) {
                        knVar.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (vnVar.f28776a1) {
                    vnVar.W();
                    vnVar.Z(false);
                    vnVar.c0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void N(vn vnVar, org.telegram.ui.Cells.d6 d6Var) {
        vnVar.f28788g1 = d6Var;
        if (vnVar.f28776a1) {
            vnVar.W();
            vnVar.c0();
            return;
        }
        vnVar.f0(1);
    }

    public static void O(vn vnVar, int i10) {
        wi wiVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i11;
        qh.f fVar = vnVar.l1;
        if (fVar.b(i10) != null) {
            qh.e b10 = fVar.b(i10);
            if (b10 != null && (wiVar = vnVar.f26744b) != null && (n2Var = wiVar.f29665f0) != null) {
                Activity parentActivity = n2Var.getParentActivity();
                if (b10 instanceof rh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((rh.d) b10).f42542b);
                    PhotoViewer.t1().J2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new an(vnVar, i10), null);
                    return;
                } else if (b10 instanceof rh.h) {
                    rh.h hVar = (rh.h) b10;
                    org.telegram.ui.pt.q().w(parentActivity);
                    org.telegram.ui.pt.q().v(new cn(vnVar, i10));
                    org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
                    TLRPC.Document document = hVar.f42553b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f42554c, vnVar.f26743a, 200);
                    return;
                } else if (b10 instanceof rh.c) {
                    rh.c cVar = (rh.c) b10;
                    String str = cVar.d;
                    vnVar.g0(i10, new org.telegram.ui.uf(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f42540f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof rh.g) {
                    rh.g gVar = (rh.g) b10;
                    TLRPC.Document document2 = gVar.f42551b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    vnVar.g0(i10, new ci.o5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof rh.f) {
                    vnVar.g0(i10, new yi((rh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof rh.e) {
                    rh.e eVar = (rh.e) b10;
                    e5.g0(vnVar.getContext(), vnVar.f26743a, eVar.f42544b, eVar.f42547n, new sm(vnVar, i10, 1), new tm(vnVar, i10, 0));
                    return;
                } else {
                    vnVar.b0(i10);
                    return;
                }
            }
            return;
        }
        vnVar.b0(i10);
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

    public static dn d0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, og ogVar) {
        if (n2Var == null) {
            return null;
        }
        dn dnVar = new dn(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), ogVar);
        dnVar.Z1 = new fn(callback, n2Var, dnVar);
        dnVar.a2 = new gn(callback, dnVar);
        dnVar.f29677j0.f0();
        dnVar.J1(1, true);
        dnVar.h1(i10);
        dnVar.f29710t2 = new um(callback);
        dnVar.X = new hn(callback, n2Var, dnVar);
        dnVar.Y = new b3(8, callback, dnVar);
        dnVar.r1();
        dnVar.setFocusable(true);
        dnVar.show();
        return dnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f28798n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        wi wiVar = this.f26744b;
        if (wiVar != null) {
            return wiVar.J1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void E(oi oiVar) {
        wi wiVar = this.f26744b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f28798n) {
            wiVar.X0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f28783e0) {
            wiVar.X0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            wiVar.X0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        wiVar.W1();
        this.f28810w.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f28805s.x0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f28784e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f28782d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f28782d1).commit();
                } else {
                    this.f28780c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f28780c1).commit();
                }
            }
            boolean z13 = this.f28776a1;
            wi wiVar = this.f26744b;
            ci.i4 i4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f28782d1;
                } else {
                    i11 = this.f28780c1;
                }
                if (this.f28790h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f28792i1 != this.f28790h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f28778b1 = layoutParams.height;
                    i4Var.a();
                    wiVar.f29702r1.requestLayout();
                    boolean z14 = this.f28792i1;
                    if (z14 != this.f28790h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f28792i1 = this.f28790h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f28784e1;
                org.telegram.ui.Cells.d6 d6Var = this.f28788g1;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && i4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f28784e1 = z12;
                } else {
                    this.f28784e1 = false;
                }
                if (this.f28784e1 && this.f28776a1) {
                    f0(0);
                }
                if (this.f28778b1 != 0 && !(z11 = this.f28784e1) && z11 != z15 && !this.f28776a1) {
                    this.f28778b1 = 0;
                    i4Var.a();
                    wiVar.f29702r1.requestLayout();
                }
                if (this.f28784e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    public final void P() {
        kn knVar = this.f28812x;
        if (knVar != null) {
            knVar.setDelegate(null);
            knVar.f();
        }
        this.f28805s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        tn tnVar = this.f28803r;
        if (i11 == length) {
            tnVar.u(this.f28808u0);
        }
        tnVar.o(this.f28808u0);
        h0();
        this.f28795k0 = (this.f28807t0 + this.M) - 1;
        tnVar.m(this.f28809v0);
        tnVar.m(this.A0);
    }

    public final void Q(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.lg(this, f7, 2));
        ofFloat.addListener(new zm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10;
        if (!this.f28779c0 && !this.f28775a0) {
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
        s4.c1 K = this.f28805s.K(i10);
        if (K == null) {
            this.f28803r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f42627a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f22168a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.N)) && TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && this.l1.f41718a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(Y(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f26744b.f29665f0.getParentActivity());
            boolean z11 = this.f28798n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f18409a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f18409a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            hg.c.r(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f28779c0;
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
        boolean z12 = this.f28798n;
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
        if (i15 < 1 || (this.f28779c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f41718a.size() <= 0) {
            this.f28789h0 = true;
        } else {
            this.f28789h0 = false;
        }
        boolean z14 = this.f28789h0;
        wi wiVar = this.f26744b;
        wiVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        wiVar.W1();
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

    public final void V(rh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f42544b;
        qh.r rVar = this.Q;
        boolean containsKey = rVar.f41760c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f41759b.get(eVar.f42544b);
        le.c cVar = eVar.f42549s;
        ImageReceiver imageReceiver = eVar.f41717a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f42548r.a(z11, z10);
        eVar.f42547n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            cVar.a(true, z10);
            return;
        }
        cVar.a(false, z10);
        imageReceiver.clearImage();
    }

    public final void W() {
        if (this.f28790h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f28778b1 = layoutParams.height;
            this.f28792i1 = this.f28790h1;
            this.f28790h1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.d6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.X(android.view.View, org.telegram.ui.Cells.d6, boolean):void");
    }

    public final void Z(boolean z10) {
        if (this.I) {
            if (this.f28776a1) {
                lz lzVar = this.E;
                lzVar.P.B0();
                lzVar.I.scrollTo(0, 0);
                lzVar.F(1);
                lzVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.A();
                }
                this.f28790h1 = false;
                f0(0);
            }
            if (z10) {
                lz lzVar2 = this.E;
                if (lzVar2 != null && lzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new vm(this, 0));
                    this.f28786f1 = true;
                    ofFloat.addListener(new zm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        lz lzVar;
        ah emojiButton;
        if (!this.f28776a1 && (lzVar = this.E) != null && lzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f28788g1;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(yg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f28778b1;
        this.f28778b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    public final void b0(int i10) {
        int i11;
        this.f28796k1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f26744b.f29665f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f28794j1 = d0(n2Var, i11, new sm(this, i10, 0), new og(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.d6 d6Var = this.f28788g1;
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
        f0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f28784e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
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
            for (Map.Entry entry : this.Q.f41759b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) iVar.f(((TLRPC.WebPage) entry.getValue()).f18236id)) != null) {
                    entry.setValue(webPage);
                }
            }
            qh.f fVar = this.l1;
            int size = fVar.f41718a.size();
            for (int i12 = 0; i12 < size; i12++) {
                qh.e eVar = (qh.e) fVar.f41718a.get(i12);
                if (eVar instanceof rh.e) {
                    V((rh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            lz lzVar = this.E;
            if (lzVar != null) {
                lzVar.P.f1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f28788g1;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f28788g1.getEditField().setTextColor(-1);
                this.f28788g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, qh.e eVar) {
        int i11;
        qh.f fVar = this.l1;
        if (eVar != null) {
            fVar.f41718a.put(i10, eVar);
        } else {
            fVar.f41718a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f28799n0;
        } else if (i10 == -3) {
            i11 = this.f28801p0;
        } else {
            int i12 = this.f28807t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.c1 K = this.f28805s.K(i11);
            if (K != null) {
                View view = K.f42627a;
                if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).e.a(eVar, true);
                }
            }
            this.f28803r.m(i11);
        }
        if (eVar instanceof rh.e) {
            rh.e eVar2 = (rh.e) eVar;
            String str = eVar2.f42544b;
            ai.m0 m0Var = new ai.m0(10, this, eVar);
            qh.r rVar = this.Q;
            HashMap hashMap = rVar.f41760c;
            HashMap hashMap2 = rVar.f41759b;
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
                    ConnectionsManager.getInstance(rVar.f41758a).sendRequestTyped(getwebpagepreview, new Object(), new ai.m0(20, rVar, str));
                }
            }
            V(eVar2, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.I) {
            ci.i4 i4Var = this.F;
            ah ahVar = null;
            wi wiVar = this.f26744b;
            if (i10 == 1) {
                lz lzVar = this.E;
                if (lzVar != null && lzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lz lzVar2 = this.E;
                if (lzVar2 != null && lzVar2.f25968c1 != UserConfig.selectedAccount) {
                    wiVar.f29702r1.removeView(lzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    lz lzVar3 = new lz(null, true, false, false, getContext(), true, null, null, true, this.f26743a, false, false);
                    this.E = lzVar3;
                    lzVar3.f25966c = 3;
                    lzVar3.f26030w0 = false;
                    lzVar3.f26032w2 = false;
                    lzVar3.setShouldDrawBackground(false);
                    lz lzVar4 = this.E;
                    lzVar4.U0 = false;
                    lzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new ym(this));
                    wiVar.f29702r1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f28776a1 = true;
                lz lzVar5 = this.E;
                if (this.f28780c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28780c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28780c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f28782d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28782d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28782d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f28782d1;
                } else {
                    i11 = this.f28780c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                lzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f28788g1) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.f28778b1 = i11;
                i4Var.a();
                wiVar.f29702r1.requestLayout();
                org.telegram.ui.Cells.d6 d6Var2 = this.f28788g1;
                if (d6Var2 != null) {
                    ahVar = d6Var2.getEmojiButton();
                }
                if (ahVar != null) {
                    ahVar.j(yg.d, true);
                }
                if (!z10 && !this.f28784e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28778b1, 0.0f);
                    ofFloat.addUpdateListener(new vm(this, 1));
                    ofFloat.addListener(new zm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d6 d6Var3 = this.f28788g1;
            if (d6Var3 != null) {
                ahVar = d6Var3.getEmojiButton();
            }
            if (ahVar != null) {
                ahVar.j(yg.e, true);
            }
            lz lzVar6 = this.E;
            if (lzVar6 != null) {
                this.f28776a1 = false;
                this.f28790h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    lzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f28778b1 = 0;
            }
            i4Var.a();
            wiVar.f29702r1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.X0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        o70 F = o70.F(this, null, new View(getContext()));
        F.f26669s = 0;
        F.f26670t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new tm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new tm(this, i10, 2), true);
        bm0 bm0Var = new bm0(getContext(), this.f26743a);
        F.f26664p = new org.telegram.ui.pe(bm0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        bm0Var.e(F);
        ch.d c10 = bm0Var.f22784n.c(null, null, false);
        c10.o(eh.b.k(bm0Var.f22781b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f4280j.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        bm0Var.F = c10;
        bm0Var.E = (Drawable) callbackReturn.run(bm0Var.f22786s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        bm0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) bm0Var.f22788x.getLayoutParams()).gravity = 1;
        bm0Var.L = true;
        bm0Var.show();
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
        wb1 wb1Var = this.f28805s;
        if (wb1Var.getChildCount() <= 1 || (childAt = wb1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = wb1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        wk0 wk0Var = (wk0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && wk0Var != null && wk0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || wk0Var == null || wk0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f28778b1;
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
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        wb1 wb1Var = this.f28805s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f18753b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f18733a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 16, new Class[]{ln.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 48, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i13 = org.telegram.ui.ActionBar.h6.f19008p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        int i15 = org.telegram.ui.ActionBar.h6.f18953m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.f18917k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        int i17 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.il));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 32, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z10;
        this.f28800o0 = -1;
        this.f28801p0 = -1;
        this.f28802q0 = -1;
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
        aVar.f3649b = -1;
        c2.a aVar2 = this.N0;
        aVar2.f3649b = -1;
        this.L0 = -1;
        this.f28815y0 = -1;
        this.f28816z0 = -1;
        this.f28808u0 = -1;
        this.f28807t0 = -1;
        this.f28813x0 = -1;
        this.f28799n0 = -1;
        this.f28797l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f28798n;
        if (!z11) {
            this.Q0 = 4;
            this.f28799n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f28804r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f28806s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f28807t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f28808u0 = i14;
        }
        int i15 = this.Q0;
        this.f28809v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f28811w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f28816z0 = i16;
            if (this.f28787g0) {
                this.Q0 = i15 + 4;
                this.f28815y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.xn) this.f26744b.f29665f0).e;
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
                this.f28775a0 = true;
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
                aVar.f3649b = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                aVar2.f3649b = i21 + 4;
                if (aVar2.f3648a) {
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
            this.f28813x0 = i26;
            if (this.f28779c0) {
                this.f28800o0 = i27;
                this.f28801p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f28802q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final boolean i() {
        if (this.f28776a1) {
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
        wi wiVar = this.f26744b;
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            lz lzVar = this.E;
            if (lzVar != null) {
                wiVar.f29702r1.removeView(lzVar);
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
        this.f26744b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f28791i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f7) {
        this.f26744b.W1();
    }

    public void setDelegate(un unVar) {
        this.f28793j0 = unVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26744b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f28798n;
            int i11 = 0;
            int i12 = 1;
            wi wiVar = this.f26744b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {Y(this.N)};
                int i13 = wiVar.J1;
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
                boolean z12 = this.f28787g0;
                if (z12 && this.f28785f0) {
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
                        todoItem.f18228id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                e5.a0(i13, wiVar.j1() + 1, wiVar.n1(), new ai.c5(this, (org.telegram.ui.xn) wiVar.f29665f0, tL_messageMediaToDo, 6));
                return;
            }
            boolean z13 = this.f28779c0;
            wb1 wb1Var = this.f28805s;
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
                    for (int i18 = this.f28807t0; i18 < this.f28807t0 + this.M; i18++) {
                        s4.c1 K = wb1Var.K(i18);
                        if (K != null) {
                            View view = K.f42627a;
                            if (view instanceof org.telegram.ui.Cells.d6) {
                                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    kn knVar = this.f28812x;
                                    if (knVar != null) {
                                        knVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    j40 j40Var = this.f28814y;
                                    j40Var.setText(string);
                                    j40Var.f(d6Var.getCheckBox(), true);
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
                qh.f fVar = this.l1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && fVar.b(i19) != null) {
                        this.V0 = true;
                        this.W0 = i19;
                        wb1Var.x0(this.f28807t0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.N)};
                    int i20 = wiVar.J1;
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
                    tL_poll.multiple_choice = this.f28777b0;
                    tL_poll.quiz = this.f28779c0;
                    tL_poll.public_voters = !this.f28775a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f3648a;
                    if (this.N0.f3648a) {
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
                            if ((this.f28777b0 || this.f28779c0) && zArr[i24]) {
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
                    e5.a0(i20, wiVar.j1() + 1, wiVar.n1(), new ai.e4(this, (org.telegram.ui.xn) wiVar.f29665f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        tn tnVar = this.f28803r;
        if (tnVar != null) {
            tnVar.l();
        }
        if (this.I) {
            Z(false);
            kn knVar = this.f28812x;
            if (knVar != null) {
                knVar.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f28788g1;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f28788g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f28788g1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.y(int, int):void");
    }
}
