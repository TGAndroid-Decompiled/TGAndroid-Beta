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
import org.telegram.ui.sa1;
public final class fo extends li implements jw0, NotificationCenter.NotificationCenterDelegate {
    public static final int f26264m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public tz E;
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
    public final org.telegram.ui.Cells.k7 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f26265a0;
    public boolean f26266a1;
    public boolean f26267b0;
    public int f26268b1;
    public boolean f26269c0;
    public int f26270c1;
    public boolean f26271d0;
    public int f26272d1;
    public final boolean f26273e0;
    public boolean f26274e1;
    public boolean f26275f0;
    public boolean f26276f1;
    public boolean f26277g0;
    public org.telegram.ui.Cells.c6 f26278g1;
    public boolean f26279h0;
    public boolean f26280h1;
    public boolean f26281i0;
    public boolean f26282i1;
    public eo f26283j0;
    public mn f26284j1;
    public int f26285k0;
    public int f26286k1;
    public int f26287l0;
    public final rh.f l1;
    public int m0;
    public final boolean f26288n;
    public int f26289n0;
    public int f26290o0;
    public int f26291p0;
    public int f26292q0;
    public final co f26293r;
    public int f26294r0;
    public final sa1 f26295s;
    public int f26296s0;
    public int f26297t0;
    public int f26298u0;
    public final rn v;
    public int f26299v0;
    public final ig.e0 f26300w;
    public int f26301w0;
    public final tn f26302x;
    public int f26303x0;
    public final r40 f26304y;
    public int f26305y0;
    public int f26306z0;

    public fo(ti tiVar, Context context, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, Boolean bool) {
        super(context, d6Var, tiVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f26267b0 = true;
        this.f26275f0 = true;
        this.f26277g0 = true;
        this.f26285k0 = -1;
        c5.f fVar = new c5.f(this);
        this.M0 = fVar;
        c5.f fVar2 = new c5.f(this);
        this.N0 = fVar2;
        this.O0 = new c5.f[]{fVar, fVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.k7(this, 7);
        this.V0 = false;
        this.W0 = -1;
        this.f26280h1 = false;
        this.f26282i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new rh.f();
        this.f26288n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f28225b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f26269c0 = booleanValue;
            this.f26273e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        k0();
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.hl, this.f28224a));
        this.f28225b.f30583u1.setDelegate(this);
        co coVar = new co(this, context);
        this.f26293r = coVar;
        sa1 sa1Var = new sa1(context, 5, null);
        this.f26295s = sa1Var;
        this.f28226c = sa1Var;
        this.d = sa1Var;
        this.h = true;
        this.f28227f = true;
        rn rnVar = new rn(this);
        this.v = rnVar;
        sa1Var.setItemAnimator(rnVar);
        arrayList.clear();
        rnVar.f45944m = false;
        rnVar.C = false;
        rnVar.o(bs.h);
        rnVar.n(350L);
        sa1Var.setClipToPadding(false);
        sa1Var.setVerticalScrollBarEnabled(false);
        sa1Var.setSections(true);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, sa1Var, 4);
        this.f26300w = e0Var;
        sa1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.y(new di.f(this, 2)).d(sa1Var);
        addView(sa1Var, w7.z5.e(-1, -1, 51));
        sa1Var.setPreserveFocusAfterLayout(true);
        sa1Var.setAdapter(coVar);
        sa1Var.setOnItemClickListener(new gn(this, d6Var, tiVar, context));
        sa1Var.setOnScrollListener(new ah.d0(this, 27));
        r40 r40Var = new r40(context, 4);
        this.f26304y = r40Var;
        r40Var.setAlpha(0.0f);
        r40Var.setVisibility(4);
        addView(r40Var, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f28225b.M1).config.pollCaptionLengthMax.get();
        this.Q = new rh.r(this.f28225b.M1);
        NotificationCenter.getInstance(this.f28225b.M1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? hz0Var = new hz0(context, this.f28225b.M1, null, d6Var);
            this.f26302x = hz0Var;
            hz0Var.f26963y = true;
            hz0Var.E = true;
            hz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) hz0Var, w7.z5.e(-2, 160, 51));
        }
        this.F = new ei.b4(this.f28225b.f30583u1, false, null);
        W();
    }

    public static void N(fo foVar, int i10) {
        r40 r40Var = foVar.f26304y;
        s4.b1 K = foVar.f26295s.K(foVar.f26297t0 + i10);
        if (K != null) {
            View view = K.f45910a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    tn tnVar = foVar.f26302x;
                    if (tnVar != null) {
                        tnVar.f();
                    }
                    r40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    r40Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = r40Var.f29831c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    r40Var.setTranslationY(r40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.fo r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fo.O(org.telegram.ui.Components.fo, android.view.View, int):void");
    }

    public static void P(fo foVar, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.b1 T;
        if (foVar.I && z10) {
            if (foVar.f26278g1 == c6Var && foVar.f26266a1 && foVar.f26280h1) {
                foVar.Z();
                foVar.f26266a1 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = foVar.f26278g1;
            foVar.f26278g1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            ah emojiButton = c6Var.getEmojiButton();
            yg ygVar = yg.e;
            emojiButton.j(ygVar, false);
            sa1 sa1Var = foVar.f26295s;
            View F = sa1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = sa1Var.T(F);
            }
            tn tnVar = foVar.f26302x;
            if (tnVar != null) {
                tnVar.f();
                if (T != null) {
                    View view = T.f45910a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && tnVar.getDelegate() != view) {
                        tnVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (foVar.f26266a1) {
                    foVar.Z();
                    foVar.c0(false);
                    foVar.f0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void Q(fo foVar, org.telegram.ui.Cells.c6 c6Var) {
        foVar.f26278g1 = c6Var;
        if (foVar.f26266a1) {
            foVar.Z();
            foVar.f0();
            return;
        }
        foVar.i0(1);
    }

    public static void R(fo foVar, int i10) {
        ti tiVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i11;
        rh.f fVar = foVar.l1;
        if (fVar.b(i10) != null) {
            rh.e b10 = fVar.b(i10);
            if (b10 != null && (tiVar = foVar.f28225b) != null && (n2Var = tiVar.f30536f0) != null) {
                Activity parentActivity = n2Var.getParentActivity();
                if (b10 instanceof sh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((sh.d) b10).f46532b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().g2(arrayList, 0, 14, false, new jn(foVar, i10), null);
                    return;
                } else if (b10 instanceof sh.h) {
                    sh.h hVar = (sh.h) b10;
                    org.telegram.ui.et.q().w(parentActivity);
                    org.telegram.ui.et.q().v(new ln(foVar, i10));
                    org.telegram.ui.et q6 = org.telegram.ui.et.q();
                    TLRPC.Document document = hVar.f46543b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q6.t(document, null, "", null, null, i11, false, hVar.f46544c, foVar.f28224a, 200);
                    return;
                } else if (b10 instanceof sh.c) {
                    sh.c cVar = (sh.c) b10;
                    String str = cVar.d;
                    foVar.j0(i10, new org.telegram.ui.of(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f46530f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.g) {
                    sh.g gVar = (sh.g) b10;
                    TLRPC.Document document2 = gVar.f46541b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    foVar.j0(i10, new ei.e5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof sh.f) {
                    foVar.j0(i10, new vi((sh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof sh.e) {
                    sh.e eVar = (sh.e) b10;
                    f5.f0(foVar.getContext(), foVar.f28224a, eVar.f46534b, eVar.f46537n, new cn(foVar, i10, 1), new dn(foVar, i10, 0));
                    return;
                } else {
                    foVar.e0(i10);
                    return;
                }
            }
            return;
        }
        foVar.e0(i10);
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

    public static mn g0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, pg pgVar) {
        if (n2Var == null) {
            return null;
        }
        mn mnVar = new mn(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), pgVar);
        mnVar.f30528c2 = new on(callback, n2Var, mnVar);
        mnVar.f30531d2 = new pn(callback, mnVar);
        mnVar.f30548j0.f0();
        mnVar.N1(1, true);
        mnVar.j1(i10);
        mnVar.f30591w2 = new en(callback);
        mnVar.X = new qn(callback, n2Var, mnVar);
        mnVar.Y = new q2(13, callback, mnVar);
        mnVar.t1();
        mnVar.setFocusable(true);
        mnVar.show();
        return mnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f26288n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ti tiVar = this.f28225b;
        if (tiVar != null) {
            return tiVar.M1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void A() {
        co coVar = this.f26293r;
        if (coVar != null) {
            coVar.l();
        }
        if (this.I) {
            c0(false);
            tn tnVar = this.f26302x;
            if (tnVar != null) {
                tnVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f26278g1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f26278g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f26278g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fo.B(int, int):void");
    }

    @Override
    public final void F(li liVar) {
        ti tiVar = this.f28225b;
        try {
            tiVar.f30520a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f26288n) {
            tiVar.f30520a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f26273e0) {
            tiVar.f30520a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            tiVar.f30520a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        tiVar.a2();
        this.f26300w.h1(0, 0);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f26274e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f26272d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26272d1).commit();
                } else {
                    this.f26270c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26270c1).commit();
                }
            }
            boolean z13 = this.f26266a1;
            ti tiVar = this.f28225b;
            ei.b4 b4Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f26272d1;
                } else {
                    i11 = this.f26270c1;
                }
                if (this.f26280h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f26282i1 != this.f26280h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f26268b1 = layoutParams.height;
                    b4Var.a();
                    tiVar.f30583u1.requestLayout();
                    boolean z14 = this.f26282i1;
                    if (z14 != this.f26280h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        T(dp);
                    }
                    this.f26282i1 = this.f26280h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f26274e1;
                org.telegram.ui.Cells.c6 c6Var = this.f26278g1;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && b4Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f26274e1 = z12;
                } else {
                    this.f26274e1 = false;
                }
                if (this.f26274e1 && this.f26266a1) {
                    i0(0);
                }
                if (this.f26268b1 != 0 && !(z11 = this.f26274e1) && z11 != z15 && !this.f26266a1) {
                    this.f26268b1 = 0;
                    b4Var.a();
                    tiVar.f30583u1.requestLayout();
                }
                if (this.f26274e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    @Override
    public final void J() {
        this.f26295s.x0(1);
    }

    public final void S() {
        tn tnVar = this.f26302x;
        if (tnVar != null) {
            tnVar.setDelegate(null);
            tnVar.f();
        }
        this.f26295s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        co coVar = this.f26293r;
        if (i11 == length) {
            coVar.u(this.f26298u0);
        }
        coVar.o(this.f26298u0);
        k0();
        this.f26285k0 = (this.f26297t0 + this.M) - 1;
        coVar.m(this.f26299v0);
        coVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.dg(this, f7, 2));
        ofFloat.addListener(new in(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f26269c0 && !this.f26265a0) {
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
        s4.b1 K = this.f26295s.K(i10);
        if (K == null) {
            this.f26293r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) K.f45910a;
        if (!z10) {
            z5Var.setChecked(false);
        }
        z5Var.getCheckBox().f24375a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.l1.f45746a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f28225b.f30536f0.getParentActivity());
            boolean z11 = this.f26288n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20604a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20604a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            i2.e.r(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f26269c0;
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
        boolean z12 = this.f26288n;
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
        if (i15 < 1 || (this.f26269c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.f45746a.size() <= 0) {
            this.f26279h0 = true;
        } else {
            this.f26279h0 = false;
        }
        boolean z14 = this.f26279h0;
        ti tiVar = this.f28225b;
        tiVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        tiVar.a2();
    }

    public final void X(org.telegram.ui.Cells.q8 q8Var, boolean z10) {
        if (this.V != 0) {
            q8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            q8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            q8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void Y(sh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f46534b;
        rh.r rVar = this.Q;
        boolean containsKey = rVar.f45788c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f45787b.get(eVar.f46534b);
        ne.b bVar = eVar.f46539s;
        ImageReceiver imageReceiver = eVar.f45745a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f46538r.a(z11, z10);
        eVar.f46537n = webPage;
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
        if (this.f26280h1) {
            this.E.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f26268b1 = layoutParams.height;
            this.f26282i1 = this.f26280h1;
            this.f26280h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.c6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fo.a0(android.view.View, org.telegram.ui.Cells.c6, boolean):void");
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f26266a1) {
                tz tzVar = this.E;
                tzVar.P.B0();
                tzVar.I.scrollTo(0, 0);
                tzVar.E(1);
                tzVar.Q.h1(0, 0);
                this.E.u(false);
                if (z10) {
                    this.E.B();
                }
                this.f26280h1 = false;
                i0(0);
            }
            if (z10) {
                tz tzVar2 = this.E;
                if (tzVar2 != null && tzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new fn(this, 0));
                    this.f26276f1 = true;
                    ofFloat.addListener(new in(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        tz tzVar;
        ah emojiButton;
        if (!this.f26266a1 && (tzVar = this.E) != null && tzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f26278g1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(yg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f26268b1;
        this.f26268b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f45787b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f20428id)) != null) {
                    entry.setValue(webPage);
                }
            }
            rh.f fVar = this.l1;
            int size = fVar.f45746a.size();
            for (int i12 = 0; i12 < size; i12++) {
                rh.e eVar = (rh.e) fVar.f45746a.get(i12);
                if (eVar instanceof sh.e) {
                    Y((sh.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            tz tzVar = this.E;
            if (tzVar != null) {
                tzVar.P.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f26278g1;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f26278g1.getEditField().setTextColor(-1);
                this.f26278g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.f26286k1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28225b.f30536f0;
        this.l1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f26284j1 = g0(n2Var, i11, new cn(this, i10, 0), new pg(this, 26));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.c6 c6Var = this.f26278g1;
        if (c6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = c6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        i0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f26274e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            org.telegram.ui.Cells.k7 k7Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(k7Var);
            AndroidUtilities.runOnUIThread(k7Var, 100L);
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
        sa1 sa1Var = this.f26295s;
        if (sa1Var.getChildCount() <= 1 || (childAt = sa1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = sa1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        sl0 sl0Var = (sl0) T;
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y3 > 0 && sl0Var != null && sl0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || sl0Var == null || sl0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f26268b1;
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
        sa1 sa1Var = this.f26295s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f20951b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20931a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 16, new Class[]{un.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 48, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i13 = org.telegram.ui.ActionBar.h6.f21210p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        int i15 = org.telegram.ui.ActionBar.h6.f21152m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.f21117k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21394z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        int i17 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21078i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21110k0, null, null, org.telegram.ui.ActionBar.h6.f20990d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.il));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 32, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
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
            fVar.f45746a.put(i10, eVar);
        } else {
            fVar.f45746a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f26289n0;
        } else if (i10 == -3) {
            i11 = this.f26291p0;
        } else {
            int i12 = this.f26297t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.b1 K = this.f26295s.K(i11);
            if (K != null) {
                View view = K.f45910a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).e.a(eVar, true);
                }
            }
            this.f26293r.m(i11);
        }
        if (eVar instanceof sh.e) {
            sh.e eVar2 = (sh.e) eVar;
            String str = eVar2.f46534b;
            ai.q5 q5Var = new ai.q5(14, this, eVar);
            rh.r rVar = this.Q;
            HashMap hashMap = rVar.f45788c;
            HashMap hashMap2 = rVar.f45787b;
            if (hashMap2.containsKey(str)) {
                q5Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(q5Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.f45786a).sendRequestTyped(getwebpagepreview, new Object(), new org.telegram.ui.Wallet.s1(5, rVar, str));
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
        org.telegram.ui.Cells.c6 c6Var;
        if (this.I) {
            ei.b4 b4Var = this.F;
            ah ahVar = null;
            ti tiVar = this.f28225b;
            if (i10 == 1) {
                tz tzVar = this.E;
                if (tzVar != null && tzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tz tzVar2 = this.E;
                if (tzVar2 != null && tzVar2.f30770c1 != UserConfig.selectedAccount) {
                    tiVar.f30583u1.removeView(tzVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    tz tzVar3 = new tz(null, true, false, false, getContext(), true, null, null, true, this.f28224a, false, false);
                    this.E = tzVar3;
                    tzVar3.f30768c = 3;
                    tzVar3.f30832w0 = false;
                    tzVar3.f30834w2 = false;
                    tzVar3.setShouldDrawBackground(false);
                    tz tzVar4 = this.E;
                    tzVar4.U0 = false;
                    tzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new hn(this));
                    tiVar.f30583u1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f26266a1 = true;
                tz tzVar5 = this.E;
                if (this.f26270c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f26270c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f26270c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f26272d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f26272d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f26272d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f26272d1;
                } else {
                    i11 = this.f26270c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                tzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f26278g1) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.f26268b1 = i11;
                b4Var.a();
                tiVar.f30583u1.requestLayout();
                org.telegram.ui.Cells.c6 c6Var2 = this.f26278g1;
                if (c6Var2 != null) {
                    ahVar = c6Var2.getEmojiButton();
                }
                if (ahVar != null) {
                    ahVar.j(yg.d, true);
                }
                if (!z10 && !this.f26274e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26268b1, 0.0f);
                    ofFloat.addUpdateListener(new fn(this, 1));
                    ofFloat.addListener(new in(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c6 c6Var3 = this.f26278g1;
            if (c6Var3 != null) {
                ahVar = c6Var3.getEmojiButton();
            }
            if (ahVar != null) {
                ahVar.j(yg.e, true);
            }
            tz tzVar6 = this.E;
            if (tzVar6 != null) {
                this.f26266a1 = false;
                this.f26280h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    tzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f26268b1 = 0;
            }
            b4Var.a();
            tiVar.f30583u1.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f26266a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        i80 F = i80.F(this, null, new View(getContext()));
        F.f27136s = 0;
        F.f27137t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new dn(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new dn(this, i10, 2), true);
        ym0 ym0Var = new ym0(getContext(), this.f28224a);
        F.f27131p = new org.telegram.ui.qe(ym0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        ym0Var.e(F);
        dh.d c10 = ym0Var.f32699n.c(null, null, false);
        c10.o(fh.c.k(ym0Var.f32696b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f8016j.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        ym0Var.F = c10;
        ym0Var.E = (Drawable) callbackReturn.run(ym0Var.f32701s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        ym0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) ym0Var.f32703x.getLayoutParams()).gravity = 1;
        ym0Var.L = true;
        ym0Var.show();
    }

    public final void k0() {
        boolean z10;
        this.f26290o0 = -1;
        this.f26291p0 = -1;
        this.f26292q0 = -1;
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
        fVar.f4730a = -1;
        c5.f fVar2 = this.N0;
        fVar2.f4730a = -1;
        this.L0 = -1;
        this.f26305y0 = -1;
        this.f26306z0 = -1;
        this.f26298u0 = -1;
        this.f26297t0 = -1;
        this.f26303x0 = -1;
        this.f26289n0 = -1;
        this.f26287l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f26288n;
        if (!z11) {
            this.Q0 = 4;
            this.f26289n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f26294r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f26296s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f26297t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f26298u0 = i14;
        }
        int i15 = this.Q0;
        this.f26299v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f26301w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f26306z0 = i16;
            if (this.f26277g0) {
                this.Q0 = i15 + 4;
                this.f26305y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.qn) this.f28225b.f30536f0).e;
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
                this.f26265a0 = true;
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
                fVar.f4730a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                fVar2.f4730a = i21 + 4;
                if (fVar2.f4731b) {
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
            this.f26303x0 = i26;
            if (this.f26269c0) {
                this.f26290o0 = i27;
                this.f26291p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f26292q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void o() {
        this.H = true;
        ti tiVar = this.f28225b;
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            tz tzVar = this.E;
            if (tzVar != null) {
                tiVar.f30583u1.removeView(tzVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f26281i0) {
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

    public void setDelegate(eo eoVar) {
        this.f26283j0 = eoVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28225b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        this.f28225b.a2();
    }

    @Override
    public final void v(float f7) {
        this.f28225b.a2();
    }

    @Override
    public final void w(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f26288n;
            int i12 = 0;
            int i13 = 1;
            ti tiVar = this.f28225b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {b0(this.N)};
                int i14 = tiVar.M1;
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
                boolean z12 = this.f26277g0;
                if (z12 && this.f26275f0) {
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
                        todoItem.f20420id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                f5.Z(i14, tiVar.l1() + 1, tiVar.p1(), new ai.v3(this, (org.telegram.ui.qn) tiVar.f30536f0, tL_messageMediaToDo, 7));
                return;
            }
            boolean z13 = this.f26269c0;
            sa1 sa1Var = this.f26295s;
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
                    for (int i19 = this.f26297t0; i19 < this.f26297t0 + this.M; i19++) {
                        s4.b1 K = sa1Var.K(i19);
                        if (K != null) {
                            View view = K.f45910a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    tn tnVar = this.f26302x;
                                    if (tnVar != null) {
                                        tnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    r40 r40Var = this.f26304y;
                                    r40Var.setText(string);
                                    r40Var.f(c6Var.getCheckBox(), true);
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
                        sa1Var.x0(this.f26297t0 + i20);
                        return;
                    }
                    i20++;
                } else {
                    CharSequence[] charSequenceArr4 = {b0(this.N)};
                    int i21 = tiVar.M1;
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
                    tL_poll.multiple_choice = this.f26267b0;
                    tL_poll.quiz = this.f26269c0;
                    tL_poll.public_voters = !this.f26265a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f4731b;
                    if (this.N0.f4731b) {
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
                            if ((this.f26267b0 || this.f26269c0) && zArr[i25]) {
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
                    f5.Z(i21, tiVar.l1() + 1, tiVar.p1(), new ci.z2(this, (org.telegram.ui.qn) tiVar.f30536f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
