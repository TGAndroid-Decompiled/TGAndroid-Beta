package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
public final class co extends ji implements org.telegram.ui.ActionBar.b6, mw0, NotificationCenter.NotificationCenterDelegate {
    public static final int f25356r1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public rz E;
    public int E0;
    public final ei.b4 F;
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
    public final rh.r Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.u5 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f25357a0;
    public boolean f25358a1;
    public boolean f25359b0;
    public int f25360b1;
    public boolean f25361c0;
    public int f25362c1;
    public boolean f25363d0;
    public int f25364d1;
    public final boolean f25365e0;
    public boolean f25366e1;
    public boolean f25367f0;
    public boolean f25368f1;
    public boolean f25369g0;
    public org.telegram.ui.Cells.d6 f25370g1;
    public boolean f25371h0;
    public boolean f25372h1;
    public boolean f25373i0;
    public boolean f25374i1;
    public bo f25375j0;
    public final Paint f25376j1;
    public int f25377k0;
    public kn f25378k1;
    public int f25379l0;
    public int l1;
    public int m0;
    public final rh.f f25380m1;
    public final boolean f25381n;
    public int f25382n0;
    public Drawable f25383n1;
    public int f25384o0;
    public Drawable f25385o1;
    public int f25386p0;
    public int f25387p1;
    public int f25388q0;
    public int f25389q1;
    public final ao f25390r;
    public int f25391r0;
    public final wa1 f25392s;
    public int f25393s0;
    public int f25394t0;
    public int f25395u0;
    public final pn v;
    public int f25396v0;
    public final ig.d0 f25397w;
    public int f25398w0;
    public final rn f25399x;
    public int f25400x0;
    public final p40 f25401y;
    public int f25402y0;
    public int f25403z0;

    public co(ri riVar, Context context, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Boolean bool) {
        super(context, g6Var, riVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f25359b0 = true;
        this.f25367f0 = true;
        this.f25369g0 = true;
        this.f25377k0 = -1;
        c5.f fVar = new c5.f(this);
        this.M0 = fVar;
        c5.f fVar2 = new c5.f(this);
        this.N0 = fVar2;
        this.O0 = new c5.f[]{fVar, fVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.u5(this, 9);
        this.V0 = false;
        this.W0 = -1;
        this.f25372h1 = false;
        this.f25374i1 = false;
        Paint paint = new Paint(1);
        this.f25376j1 = paint;
        this.f25380m1 = new rh.f();
        this.f25381n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f27704b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f25361c0 = booleanValue;
            this.f25365e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        l0();
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hl, this.f27703a));
        this.f27704b.f30193u1.setDelegate(this);
        ao aoVar = new ao(this, context);
        this.f25390r = aoVar;
        wa1 wa1Var = new wa1(context, 5, null);
        this.f25392s = wa1Var;
        this.f27705c = wa1Var;
        this.d = wa1Var;
        this.h = true;
        this.f27706f = true;
        pn pnVar = new pn(this);
        this.v = pnVar;
        wa1Var.setItemAnimator(pnVar);
        arrayList.clear();
        pnVar.f46376m = false;
        pnVar.C = false;
        pnVar.o(zr.h);
        pnVar.n(350L);
        wa1Var.setClipToPadding(false);
        wa1Var.setVerticalScrollBarEnabled(false);
        wa1Var.setSections(true);
        ig.d0 d0Var = new ig.d0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, wa1Var, 4);
        this.f25397w = d0Var;
        wa1Var.setLayoutManager(d0Var);
        d0Var.O = true;
        new s4.y(new di.f(this, 2)).d(wa1Var);
        addView(wa1Var, w7.z5.e(-1, -1, 51));
        wa1Var.setPreserveFocusAfterLayout(true);
        wa1Var.setAdapter(aoVar);
        wa1Var.setOnItemClickListener(new en(this, g6Var, riVar, context));
        wa1Var.setOnScrollListener(new ah.d0(this, 27));
        p40 p40Var = new p40(context, 4);
        this.f25401y = p40Var;
        p40Var.setAlpha(0.0f);
        p40Var.setVisibility(4);
        addView(p40Var, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f27704b.M1).config.pollCaptionLengthMax.get();
        this.Q = new rh.r(this.f27704b.M1);
        NotificationCenter.getInstance(this.f27704b.M1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? kz0Var = new kz0(context, this.f27704b.M1, null, g6Var);
            this.f25399x = kz0Var;
            kz0Var.f28120y = true;
            kz0Var.E = true;
            kz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) kz0Var, w7.z5.e(-2, 160, 51));
        }
        this.F = new ei.b4(this.f27704b.f30193u1, false, null);
        W();
    }

    public static void N(co coVar, int i10) {
        p40 p40Var = coVar.f25401y;
        s4.b1 K = coVar.f25392s.K(coVar.f25394t0 + i10);
        if (K != null) {
            View view = K.f46342a;
            if (view instanceof org.telegram.ui.Cells.d6) {
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    rn rnVar = coVar.f25399x;
                    if (rnVar != null) {
                        rnVar.f();
                    }
                    p40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    p40Var.f(d6Var.getCheckBox(), true);
                    ImageView imageView = p40Var.f29463c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    p40Var.setTranslationY(p40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.co r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.O(org.telegram.ui.Components.co, android.view.View, int):void");
    }

    public static void P(co coVar, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        if (coVar.I && z10) {
            if (coVar.f25370g1 == d6Var && coVar.f25358a1 && coVar.f25372h1) {
                coVar.Z();
                coVar.f25358a1 = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = coVar.f25370g1;
            coVar.f25370g1 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            yg emojiButton = d6Var.getEmojiButton();
            wg wgVar = wg.e;
            emojiButton.j(wgVar, false);
            wa1 wa1Var = coVar.f25392s;
            View F = wa1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = wa1Var.T(F);
            }
            rn rnVar = coVar.f25399x;
            if (rnVar != null) {
                rnVar.f();
                if (T != null) {
                    View view = T.f46342a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && rnVar.getDelegate() != view) {
                        rnVar.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (coVar.f25358a1) {
                    coVar.Z();
                    coVar.c0(false);
                    coVar.f0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(wgVar, false);
            }
        }
    }

    public static void Q(co coVar, org.telegram.ui.Cells.d6 d6Var) {
        coVar.f25370g1 = d6Var;
        if (coVar.f25358a1) {
            coVar.Z();
            coVar.f0();
            return;
        }
        coVar.i0(1);
    }

    public static void R(co coVar, int i10) {
        ri riVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i11;
        rh.f fVar = coVar.f25380m1;
        if (fVar.b(i10) != null) {
            rh.e b10 = fVar.b(i10);
            if (b10 != null && (riVar = coVar.f27704b) != null && (o2Var = riVar.f30146f0) != null) {
                Activity parentActivity = o2Var.getParentActivity();
                if (b10 instanceof sh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((sh.d) b10).f46974b);
                    PhotoViewer.u1().M2(parentActivity, null, null);
                    PhotoViewer.u1().i2(arrayList, 0, 14, false, new hn(coVar, i10), null);
                    return;
                } else if (b10 instanceof sh.h) {
                    sh.h hVar = (sh.h) b10;
                    org.telegram.ui.ht.o().u(parentActivity);
                    org.telegram.ui.ht.o().t(new jn(coVar, i10));
                    org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                    TLRPC.Document document = hVar.f46985b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    o10.r(document, null, "", null, null, i11, false, hVar.f46986c, coVar.f27703a, 200);
                    return;
                } else if (b10 instanceof sh.c) {
                    sh.c cVar = (sh.c) b10;
                    String str = cVar.d;
                    coVar.j0(i10, new org.telegram.ui.of(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f46972f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.g) {
                    sh.g gVar = (sh.g) b10;
                    TLRPC.Document document2 = gVar.f46983b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    coVar.j0(i10, new ei.e5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.f) {
                    coVar.j0(i10, new ti((sh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof sh.e) {
                    sh.e eVar = (sh.e) b10;
                    d5.f0(coVar.getContext(), coVar.f27703a, eVar.f46976b, eVar.f46979n, new an(coVar, i10, 1), new bn(coVar, i10, 0));
                    return;
                } else {
                    coVar.e0(i10);
                    return;
                }
            }
            return;
        }
        coVar.e0(i10);
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

    public static kn g0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback, ng ngVar) {
        if (o2Var == null) {
            return null;
        }
        kn knVar = new kn(o2Var.getContext(), o2Var, o2Var.getResourceProvider(), ngVar);
        knVar.f30138c2 = new mn(callback, o2Var, knVar);
        knVar.f30141d2 = new nn(callback, knVar);
        knVar.f30158j0.f0();
        knVar.R1(1, true);
        knVar.m1(i10);
        knVar.f30212z2 = new cn(callback);
        knVar.X = new on(callback, o2Var, knVar);
        knVar.Y = new o2(14, callback, knVar);
        knVar.w1();
        knVar.setFocusable(true);
        knVar.show();
        return knVar;
    }

    private int getAnswersMaxCount() {
        if (this.f25381n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ri riVar = this.f27704b;
        if (riVar != null) {
            return riVar.M1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void A() {
        ao aoVar = this.f25390r;
        if (aoVar != null) {
            aoVar.l();
        }
        if (this.I) {
            c0(false);
            rn rnVar = this.f25399x;
            if (rnVar != null) {
                rnVar.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f25370g1;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f25370g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f25370g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.B(int, int):void");
    }

    @Override
    public final void F(ji jiVar) {
        ri riVar = this.f27704b;
        try {
            riVar.f30130a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f25381n) {
            riVar.f30130a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f25365e0) {
            riVar.f30130a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            riVar.f30130a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        riVar.e2();
        this.f25397w.h1(0, 0);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f25366e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f25364d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25364d1).commit();
                } else {
                    this.f25362c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25362c1).commit();
                }
            }
            boolean z13 = this.f25358a1;
            ri riVar = this.f27704b;
            ei.b4 b4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f25364d1;
                } else {
                    i11 = this.f25362c1;
                }
                if (this.f25372h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f25374i1 != this.f25372h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f25360b1 = layoutParams.height;
                    b4Var.a();
                    riVar.f30193u1.requestLayout();
                    boolean z14 = this.f25374i1;
                    if (z14 != this.f25372h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        T(dp);
                    }
                    this.f25374i1 = this.f25372h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f25366e1;
                org.telegram.ui.Cells.d6 d6Var = this.f25370g1;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && b4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f25366e1 = z12;
                } else {
                    this.f25366e1 = false;
                }
                if (this.f25366e1 && this.f25358a1) {
                    i0(0);
                }
                if (this.f25360b1 != 0 && !(z11 = this.f25366e1) && z11 != z15 && !this.f25358a1) {
                    this.f25360b1 = 0;
                    b4Var.a();
                    riVar.f30193u1.requestLayout();
                }
                if (this.f25366e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    @Override
    public final void J() {
        this.f25392s.x0(1);
    }

    public final void S() {
        rn rnVar = this.f25399x;
        if (rnVar != null) {
            rnVar.setDelegate(null);
            rnVar.f();
        }
        this.f25392s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        ao aoVar = this.f25390r;
        if (i11 == length) {
            aoVar.u(this.f25395u0);
        }
        aoVar.o(this.f25395u0);
        l0();
        this.f25377k0 = (this.f25394t0 + this.M) - 1;
        aoVar.m(this.f25396v0);
        aoVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.fg(this, f7, 2));
        ofFloat.addListener(new gn(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f25361c0 && !this.f25357a0) {
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
        s4.b1 K = this.f25392s.K(i10);
        if (K == null) {
            this.f25390r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f46342a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f24523a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.f25380m1.f46180a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f27704b.f30146f0.getParentActivity());
            boolean z11 = this.f25381n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f25361c0;
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
        boolean z12 = this.f25381n;
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
        if (i15 < 1 || (this.f25361c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.f25380m1.f46180a.size() <= 0) {
            this.f25371h0 = true;
        } else {
            this.f25371h0 = false;
        }
        boolean z14 = this.f25371h0;
        ri riVar = this.f27704b;
        riVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        riVar.e2();
    }

    public final void X(org.telegram.ui.Cells.r8 r8Var, boolean z10) {
        if (this.V != 0) {
            r8Var.q(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            r8Var.q(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            r8Var.q(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void Y(sh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f46976b;
        rh.r rVar = this.Q;
        boolean containsKey = rVar.f46222c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f46221b.get(eVar.f46976b);
        ne.b bVar = eVar.f46981s;
        ImageReceiver imageReceiver = eVar.f46179a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f46980r.a(z11, z10);
        eVar.f46979n = webPage;
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
        if (this.f25372h1) {
            this.E.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f25360b1 = layoutParams.height;
            this.f25374i1 = this.f25372h1;
            this.f25372h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.d6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.a0(android.view.View, org.telegram.ui.Cells.d6, boolean):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21126a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f25358a1) {
                rz rzVar = this.E;
                rzVar.P.B0();
                rzVar.I.scrollTo(0, 0);
                rzVar.E(1);
                rzVar.Q.h1(0, 0);
                this.E.u(false);
                if (z10) {
                    this.E.B();
                }
                this.f25372h1 = false;
                i0(0);
            }
            if (z10) {
                rz rzVar2 = this.E;
                if (rzVar2 != null && rzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new dn(this, 0));
                    this.f25368f1 = true;
                    ofFloat.addListener(new gn(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        rz rzVar;
        yg emojiButton;
        if (!this.f25358a1 && (rzVar = this.E) != null && rzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f25370g1;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(wg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f25360b1;
        this.f25360b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f46221b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f20497id)) != null) {
                    entry.setValue(webPage);
                }
            }
            rh.f fVar = this.f25380m1;
            int size = fVar.f46180a.size();
            for (int i12 = 0; i12 < size; i12++) {
                rh.e eVar = (rh.e) fVar.f46180a.get(i12);
                if (eVar instanceof sh.e) {
                    Y((sh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            rz rzVar = this.E;
            if (rzVar != null) {
                rzVar.P.g1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f25370g1;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f25370g1.getEditField().setTextColor(-1);
                this.f25370g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.l1 = i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f27704b.f30146f0;
        this.f25380m1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f25378k1 = g0(o2Var, i11, new an(this, i10, 0), new ng(this, 27));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.d6 d6Var = this.f25370g1;
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
        if (!AndroidUtilities.usingHardwareInput && !this.f25366e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            org.telegram.ui.Cells.u5 u5Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 100L);
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
        wa1 wa1Var = this.f25392s;
        if (wa1Var.getChildCount() <= 1 || (childAt = wa1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = wa1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        vl0 vl0Var = (vl0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && vl0Var != null && vl0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || vl0Var == null || vl0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f25360b1;
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
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        wa1 wa1Var = this.f25392s;
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 16, new Class[]{sn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21126a7));
        int i11 = org.telegram.ui.ActionBar.k6.f21405p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21347m6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21312k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        int i14 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        return arrayList;
    }

    @Override
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, rh.e eVar) {
        int i11;
        rh.f fVar = this.f25380m1;
        if (eVar != null) {
            fVar.f46180a.put(i10, eVar);
        } else {
            fVar.f46180a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f25382n0;
        } else if (i10 == -3) {
            i11 = this.f25386p0;
        } else {
            int i12 = this.f25394t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.b1 K = this.f25392s.K(i11);
            if (K != null) {
                View view = K.f46342a;
                if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).e.a(eVar, true);
                }
            }
            this.f25390r.m(i11);
        }
        if (eVar instanceof sh.e) {
            sh.e eVar2 = (sh.e) eVar;
            String str = eVar2.f46976b;
            ai.r5 r5Var = new ai.r5(14, this, eVar);
            rh.r rVar = this.Q;
            HashMap hashMap = rVar.f46222c;
            HashMap hashMap2 = rVar.f46221b;
            if (hashMap2.containsKey(str)) {
                r5Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(r5Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.f46220a).sendRequestTyped(getwebpagepreview, new Object(), new org.telegram.ui.Wallet.r1(5, rVar, str));
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
            ei.b4 b4Var = this.F;
            yg ygVar = null;
            ri riVar = this.f27704b;
            if (i10 == 1) {
                rz rzVar = this.E;
                if (rzVar != null && rzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rz rzVar2 = this.E;
                if (rzVar2 != null && rzVar2.f30310c1 != UserConfig.selectedAccount) {
                    riVar.f30193u1.removeView(rzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    rz rzVar3 = new rz(null, true, false, false, getContext(), true, null, null, true, this.f27703a, false, false);
                    this.E = rzVar3;
                    rzVar3.f30308c = 3;
                    rzVar3.f30372w0 = false;
                    rzVar3.f30378x2 = false;
                    rzVar3.setShouldDrawBackground(false);
                    rz rzVar4 = this.E;
                    rzVar4.U0 = false;
                    rzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new fn(this));
                    riVar.f30193u1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f25358a1 = true;
                rz rzVar5 = this.E;
                if (this.f25362c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f25362c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f25362c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f25364d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f25364d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f25364d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f25364d1;
                } else {
                    i11 = this.f25362c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                rzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f25370g1) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.f25360b1 = i11;
                b4Var.a();
                riVar.f30193u1.requestLayout();
                org.telegram.ui.Cells.d6 d6Var2 = this.f25370g1;
                if (d6Var2 != null) {
                    ygVar = d6Var2.getEmojiButton();
                }
                if (ygVar != null) {
                    ygVar.j(wg.d, true);
                }
                if (!z10 && !this.f25366e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25360b1, 0.0f);
                    ofFloat.addUpdateListener(new dn(this, 1));
                    ofFloat.addListener(new gn(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d6 d6Var3 = this.f25370g1;
            if (d6Var3 != null) {
                ygVar = d6Var3.getEmojiButton();
            }
            if (ygVar != null) {
                ygVar.j(wg.e, true);
            }
            rz rzVar6 = this.E;
            if (rzVar6 != null) {
                this.f25358a1 = false;
                this.f25372h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    rzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f25360b1 = 0;
            }
            b4Var.a();
            riVar.f30193u1.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f25358a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        h80 F = h80.F(this, null, new View(getContext()));
        F.f26929s = 0;
        F.f26930t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new bn(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new bn(this, i10, 2), true);
        bn0 bn0Var = new bn0(getContext(), this.f27703a);
        F.f26924p = new org.telegram.ui.qe(bn0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        bn0Var.e(F);
        dh.d c10 = bn0Var.f25057n.c(null, null, false);
        c10.o(fh.c.k(bn0Var.f25054b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.v.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        bn0Var.F = c10;
        bn0Var.E = (Drawable) callbackReturn.run(bn0Var.f25059s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        bn0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) bn0Var.f25061x.getLayoutParams()).gravity = 1;
        bn0Var.L = true;
        bn0Var.show();
    }

    public final void k0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f27703a;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21312k7, g6Var);
            if (w02 != this.f25387p1 || w03 != this.f25389q1) {
                this.f25387p1 = w02;
                this.f25389q1 = w03;
                Drawable drawable = this.f25383n1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f25385o1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                wa1 wa1Var = this.f25392s;
                if (wa1Var != null) {
                    for (int i10 = 0; i10 < wa1Var.getChildCount(); i10++) {
                        View childAt = wa1Var.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.r8) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void l0() {
        boolean z10;
        this.f25384o0 = -1;
        this.f25386p0 = -1;
        this.f25388q0 = -1;
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
        fVar.f4733a = -1;
        c5.f fVar2 = this.N0;
        fVar2.f4733a = -1;
        this.L0 = -1;
        this.f25402y0 = -1;
        this.f25403z0 = -1;
        this.f25395u0 = -1;
        this.f25394t0 = -1;
        this.f25400x0 = -1;
        this.f25382n0 = -1;
        this.f25379l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f25381n;
        if (!z11) {
            this.Q0 = 4;
            this.f25382n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f25391r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f25393s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f25394t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f25395u0 = i14;
        }
        int i15 = this.Q0;
        this.f25396v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f25398w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f25403z0 = i16;
            if (this.f25369g0) {
                this.Q0 = i15 + 4;
                this.f25402y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.sn) this.f27704b.f30146f0).e;
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
                this.f25357a0 = true;
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
                fVar.f4733a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                fVar2.f4733a = i21 + 4;
                if (fVar2.f4734b) {
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
            this.f25400x0 = i26;
            if (this.f25361c0) {
                this.f25384o0 = i27;
                this.f25386p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f25388q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void p() {
        this.H = true;
        ri riVar = this.f27704b;
        NotificationCenter.getInstance(riVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            rz rzVar = this.E;
            if (rzVar != null) {
                riVar.f30193u1.removeView(rzVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f25373i0) {
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

    public void setDelegate(bo boVar) {
        this.f25375j0 = boVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        this.f27704b.e2();
    }

    @Override
    public final void updateColors() {
        try {
            this.f25376j1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hl, this.f27703a));
            k0();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void v(float f7) {
        this.f27704b.e2();
    }

    @Override
    public final void w(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f25381n;
            int i12 = 0;
            int i13 = 1;
            ri riVar = this.f27704b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {b0(this.N)};
                int i14 = riVar.M1;
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
                boolean z12 = this.f25369g0;
                if (z12 && this.f25367f0) {
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
                        todoItem.f20489id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                d5.Z(i14, riVar.o1() + 1, riVar.s1(), new ai.a4(this, (org.telegram.ui.sn) riVar.f30146f0, tL_messageMediaToDo, 7));
                return;
            }
            boolean z13 = this.f25361c0;
            wa1 wa1Var = this.f25392s;
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
                    for (int i19 = this.f25394t0; i19 < this.f25394t0 + this.M; i19++) {
                        s4.b1 K = wa1Var.K(i19);
                        if (K != null) {
                            View view = K.f46342a;
                            if (view instanceof org.telegram.ui.Cells.d6) {
                                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    rn rnVar = this.f25399x;
                                    if (rnVar != null) {
                                        rnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    p40 p40Var = this.f25401y;
                                    p40Var.setText(string);
                                    p40Var.f(d6Var.getCheckBox(), true);
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
                rh.f fVar = this.f25380m1;
                if (i20 < length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && fVar.b(i20) != null) {
                        this.V0 = true;
                        this.W0 = i20;
                        wa1Var.x0(this.f25394t0 + i20);
                        return;
                    }
                    i20++;
                } else {
                    CharSequence[] charSequenceArr4 = {b0(this.N)};
                    int i21 = riVar.M1;
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
                    tL_poll.multiple_choice = this.f25359b0;
                    tL_poll.quiz = this.f25361c0;
                    tL_poll.public_voters = !this.f25357a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f4734b;
                    if (this.N0.f4734b) {
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
                            if ((this.f25359b0 || this.f25361c0) && zArr[i25]) {
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
                    d5.Z(i21, riVar.o1() + 1, riVar.s1(), new ci.y2(this, (org.telegram.ui.sn) riVar.f30146f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
