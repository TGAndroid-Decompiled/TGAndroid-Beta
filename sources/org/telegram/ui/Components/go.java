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
public final class go extends li implements org.telegram.ui.ActionBar.p6, vw0, NotificationCenter.NotificationCenterDelegate {
    public static final int f28660r1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public sz E;
    public int E0;
    public final fi.z3 F;
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
    public final d5.f M0;
    public Editable N;
    public final d5.f N0;
    public Editable O;
    public final d5.f[] O0;
    public Editable P;
    public final ArrayList P0;
    public final sh.r Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final m.g3 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f28661a0;
    public boolean f28662a1;
    public boolean f28663b0;
    public int f28664b1;
    public boolean f28665c0;
    public int f28666c1;
    public boolean f28667d0;
    public int f28668d1;
    public final boolean f28669e0;
    public boolean f28670e1;
    public boolean f28671f0;
    public boolean f28672f1;
    public boolean f28673g0;
    public org.telegram.ui.Cells.h6 f28674g1;
    public boolean f28675h0;
    public boolean f28676h1;
    public boolean f28677i0;
    public boolean f28678i1;
    public fo f28679j0;
    public final Paint f28680j1;
    public int f28681k0;
    public nn f28682k1;
    public int f28683l0;
    public int l1;
    public int m0;
    public final sh.f f28684m1;
    public final boolean f28685n;
    public int f28686n0;
    public Drawable f28687n1;
    public int f28688o0;
    public Drawable f28689o1;
    public int f28690p0;
    public int f28691p1;
    public int f28692q0;
    public int f28693q1;
    public final eo f28694r;
    public int f28695r0;
    public final org.telegram.ui.bb1 f28696s;
    public int f28697s0;
    public int f28698t0;
    public int f28699u0;
    public final sn v;
    public int f28700v0;
    public final jg.e0 f28701w;
    public int f28702w0;
    public final un f28703x;
    public int f28704x0;
    public final t40 f28705y;
    public int f28706y0;
    public int f28707z0;

    public go(ti tiVar, Context context, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, Boolean bool) {
        super(context, u6Var, tiVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f28663b0 = true;
        this.f28671f0 = true;
        this.f28673g0 = true;
        this.f28681k0 = -1;
        d5.f fVar = new d5.f(this);
        this.M0 = fVar;
        d5.f fVar2 = new d5.f(this);
        this.N0 = fVar2;
        this.O0 = new d5.f[]{fVar, fVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new m.g3(this, 13);
        this.V0 = false;
        this.W0 = -1;
        this.f28676h1 = false;
        this.f28678i1 = false;
        Paint paint = new Paint(1);
        this.f28680j1 = paint;
        this.f28684m1 = new sh.f();
        this.f28685n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f30254b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f28665c0 = booleanValue;
            this.f28669e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        l0();
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.hl, this.f30253a));
        this.f30254b.f33037u1.setDelegate(this);
        eo eoVar = new eo(this, context);
        this.f28694r = eoVar;
        org.telegram.ui.bb1 bb1Var = new org.telegram.ui.bb1(context, 5, null);
        this.f28696s = bb1Var;
        setBlur3Capture(bb1Var);
        this.d = bb1Var;
        this.h = true;
        this.f30256f = true;
        sn snVar = new sn(this);
        this.v = snVar;
        bb1Var.setItemAnimator(snVar);
        arrayList.clear();
        snVar.f47798m = false;
        snVar.C = false;
        snVar.o(ds.h);
        snVar.n(350L);
        bb1Var.setClipToPadding(false);
        bb1Var.setVerticalScrollBarEnabled(false);
        bb1Var.setSections(true);
        jg.e0 e0Var = new jg.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, bb1Var, 4);
        this.f28701w = e0Var;
        bb1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.z(new ei.f(this, 2)).h(bb1Var);
        addView(bb1Var, kb1.i(-1, -1, 51));
        bb1Var.setPreserveFocusAfterLayout(true);
        bb1Var.setAdapter(eoVar);
        bb1Var.setOnItemClickListener(new hn(this, u6Var, tiVar, context));
        bb1Var.setOnScrollListener(new ml(this, 1));
        t40 t40Var = new t40(context, 4);
        this.f28705y = t40Var;
        t40Var.setAlpha(0.0f);
        t40Var.setVisibility(4);
        addView(t40Var, kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.f30254b.M1).config.pollCaptionLengthMax.get();
        this.Q = new sh.r(this.f30254b.M1);
        NotificationCenter.getInstance(this.f30254b.M1).addWeakObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
            ?? uz0Var = new uz0(context, this.f30254b.M1, null, u6Var);
            this.f28703x = uz0Var;
            uz0Var.f33500y = true;
            uz0Var.E = true;
            uz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) uz0Var, kb1.i(-2, 160, 51));
        }
        this.F = new fi.z3(this.f30254b.f33037u1, false, null);
        W();
    }

    public static void N(go goVar, int i10) {
        t40 t40Var = goVar.f28705y;
        s4.e1 K = goVar.f28696s.K(goVar.f28698t0 + i10);
        if (K != null) {
            View view = K.f47773a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    un unVar = goVar.f28703x;
                    if (unVar != null) {
                        unVar.f();
                    }
                    t40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    t40Var.f(h6Var.getCheckBox(), true);
                    ImageView imageView = t40Var.f32836c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    t40Var.setTranslationY(t40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.go r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.go.O(org.telegram.ui.Components.go, android.view.View, int):void");
    }

    public static void P(go goVar, org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        s4.e1 T;
        if (goVar.I && z10) {
            if (goVar.f28674g1 == h6Var && goVar.f28662a1 && goVar.f28676h1) {
                goVar.Z();
                goVar.f28662a1 = false;
            }
            org.telegram.ui.Cells.h6 h6Var2 = goVar.f28674g1;
            goVar.f28674g1 = h6Var;
            h6Var.setEmojiButtonVisibility(true);
            ah emojiButton = h6Var.getEmojiButton();
            yg ygVar = yg.e;
            emojiButton.j(ygVar, false);
            org.telegram.ui.bb1 bb1Var = goVar.f28696s;
            View F = bb1Var.F(h6Var);
            if (F == null) {
                T = null;
            } else {
                T = bb1Var.T(F);
            }
            un unVar = goVar.f28703x;
            if (unVar != null) {
                unVar.f();
                if (T != null) {
                    View view = T.f47773a;
                    if ((view instanceof org.telegram.ui.Cells.h6) && unVar.getDelegate() != view) {
                        unVar.setDelegate((org.telegram.ui.Cells.h6) view);
                    }
                }
            }
            if (h6Var2 != null && h6Var2 != h6Var) {
                if (goVar.f28662a1) {
                    goVar.Z();
                    goVar.c0(false);
                    goVar.f0();
                }
                h6Var2.setEmojiButtonVisibility(false);
                h6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void Q(go goVar, org.telegram.ui.Cells.h6 h6Var) {
        goVar.f28674g1 = h6Var;
        if (goVar.f28662a1) {
            goVar.Z();
            goVar.f0();
            return;
        }
        goVar.i0(1);
    }

    public static void R(go goVar, int i10) {
        ti tiVar;
        org.telegram.ui.ActionBar.r2 r2Var;
        int i11;
        sh.f fVar = goVar.f28684m1;
        if (fVar.b(i10) != null) {
            sh.e b10 = fVar.b(i10);
            if (b10 != null && (tiVar = goVar.f30254b) != null && (r2Var = tiVar.f32990f0) != null) {
                Activity parentActivity = r2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f49190b);
                    PhotoViewer.v1().N2(parentActivity, null, null);
                    PhotoViewer.v1().j2(arrayList, 0, 14, false, new kn(goVar, i10), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ht.o().u(parentActivity);
                    org.telegram.ui.ht.o().t(new mn(goVar, i10));
                    org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                    TLRPC.Document document = hVar.f49201b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    o10.r(document, null, "", null, null, i11, false, hVar.f49202c, goVar.f30253a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    goVar.j0(i10, new org.telegram.ui.nf(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f49188f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document document2 = gVar.f49199b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    goVar.j0(i10, new fi.d5(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    goVar.j0(i10, new vi((th.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar = (th.e) b10;
                    g5.f0(goVar.getContext(), goVar.f30253a, eVar.f49192b, eVar.f49195n, new dn(goVar, i10, 1), new en(goVar, i10, 0));
                    return;
                } else {
                    goVar.e0(i10);
                    return;
                }
            }
            return;
        }
        goVar.e0(i10);
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

    public static nn g0(org.telegram.ui.ActionBar.r2 r2Var, int i10, Utilities.Callback callback, pg pgVar) {
        if (r2Var == null) {
            return null;
        }
        nn nnVar = new nn(r2Var.getContext(), r2Var, r2Var.getResourceProvider(), pgVar);
        nnVar.f32982c2 = new pn(callback, r2Var, nnVar);
        nnVar.f32985d2 = new qn(callback, nnVar);
        nnVar.f33002j0.g0();
        nnVar.R1(1, true);
        nnVar.n1(i10);
        nnVar.f33056z2 = new fn(callback);
        nnVar.X = new rn(callback, r2Var, nnVar);
        nnVar.Y = new p1(17, callback, nnVar);
        nnVar.w1();
        nnVar.setFocusable(true);
        nnVar.show();
        return nnVar;
    }

    private int getAnswersMaxCount() {
        if (this.f28685n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ti tiVar = this.f30254b;
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
        eo eoVar = this.f28694r;
        if (eoVar != null) {
            eoVar.l();
        }
        if (this.I) {
            c0(false);
            un unVar = this.f28703x;
            if (unVar != null) {
                unVar.f();
            }
            org.telegram.ui.Cells.h6 h6Var = this.f28674g1;
            if (h6Var != null) {
                h6Var.setEmojiButtonVisibility(false);
                this.f28674g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f28674g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.go.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        ti tiVar = this.f30254b;
        try {
            tiVar.f32974a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f28685n) {
            tiVar.f32974a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f28669e0) {
            tiVar.f32974a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            tiVar.f32974a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        tiVar.e2();
        this.f28701w.h1(0, 0);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f28670e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.f28668d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f28668d1).commit();
                } else {
                    this.f28666c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f28666c1).commit();
                }
            }
            boolean z13 = this.f28662a1;
            ti tiVar = this.f30254b;
            fi.z3 z3Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f28668d1;
                } else {
                    i11 = this.f28666c1;
                }
                if (this.f28676h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f28678i1 != this.f28676h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f28664b1 = layoutParams.height;
                    z3Var.a();
                    tiVar.f33037u1.requestLayout();
                    boolean z14 = this.f28678i1;
                    if (z14 != this.f28676h1) {
                        if (z14) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        T(dp);
                    }
                    this.f28678i1 = this.f28676h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f28670e1;
                org.telegram.ui.Cells.h6 h6Var = this.f28674g1;
                if (h6Var != null) {
                    if (h6Var.getEditField().isFocused() && z3Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f28670e1 = z12;
                } else {
                    this.f28670e1 = false;
                }
                if (this.f28670e1 && this.f28662a1) {
                    i0(0);
                }
                if (this.f28664b1 != 0 && !(z11 = this.f28670e1) && z11 != z15 && !this.f28662a1) {
                    this.f28664b1 = 0;
                    z3Var.a();
                    tiVar.f33037u1.requestLayout();
                }
                if (this.f28670e1 && this.G) {
                    this.G = false;
                    AndroidUtilities.cancelRunOnUIThread(this.U0);
                }
            }
        }
    }

    @Override
    public final void J() {
        this.f28696s.y0(1);
    }

    public final void S() {
        un unVar = this.f28703x;
        if (unVar != null) {
            unVar.setDelegate(null);
            unVar.f();
        }
        this.f28696s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        eo eoVar = this.f28694r;
        if (i11 == length) {
            eoVar.u(this.f28699u0);
        }
        eoVar.o(this.f28699u0);
        l0();
        this.f28681k0 = (this.f28698t0 + this.M) - 1;
        eoVar.m(this.f28700v0);
        eoVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.eg(this, f7, 2));
        ofFloat.addListener(new jn(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f28665c0 && !this.f28661a0) {
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
        s4.e1 K = this.f28696s.K(i10);
        if (K == null) {
            this.f28694r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) K.f47773a;
        if (!z10) {
            e6Var.setChecked(false);
        }
        e6Var.getCheckBox().f26317a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.f28684m1.f48667a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f30254b.f32990f0.getParentActivity());
            boolean z11 = this.f28685n;
            if (z11) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22369a.R = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22369a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f28665c0;
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
        boolean z12 = this.f28685n;
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
        if (i15 < 1 || (this.f28665c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.f28684m1.f48667a.size() <= 0) {
            this.f28675h0 = true;
        } else {
            this.f28675h0 = false;
        }
        boolean z14 = this.f28675h0;
        ti tiVar = this.f30254b;
        tiVar.setAllowNestedScroll(z14);
        this.X0 = z10;
        tiVar.e2();
    }

    public final void X(org.telegram.ui.Cells.v8 v8Var, boolean z10) {
        if (this.V != 0) {
            v8Var.q(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            v8Var.q(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            v8Var.q(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void Y(th.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f49192b;
        sh.r rVar = this.Q;
        boolean containsKey = rVar.f48709c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.f48708b.get(eVar.f49192b);
        oe.b bVar = eVar.f49197s;
        ImageReceiver imageReceiver = eVar.f48666a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f49196r.a(z11, z10);
        eVar.f49195n = webPage;
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
        if (this.f28676h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f28664b1 = layoutParams.height;
            this.f28678i1 = this.f28676h1;
            this.f28676h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.h6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.go.a0(android.view.View, org.telegram.ui.Cells.h6, boolean):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f28662a1) {
                sz szVar = this.E;
                szVar.P.C0();
                szVar.I.scrollTo(0, 0);
                szVar.G(1);
                szVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.B();
                }
                this.f28676h1 = false;
                i0(0);
            }
            if (z10) {
                sz szVar2 = this.E;
                if (szVar2 != null && szVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new gn(this, 0));
                    this.f28672f1 = true;
                    ofFloat.addListener(new jn(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        sz szVar;
        ah emojiButton;
        if (!this.f28662a1 && (szVar = this.E) != null && szVar.getVisibility() != 8) {
            org.telegram.ui.Cells.h6 h6Var = this.f28674g1;
            if (h6Var != null && (emojiButton = h6Var.getEmojiButton()) != null) {
                emojiButton.j(yg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f28664b1;
        this.f28664b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f48708b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f22183id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.f fVar = this.f28684m1;
            int size = fVar.f48667a.size();
            for (int i12 = 0; i12 < size; i12++) {
                sh.e eVar = (sh.e) fVar.f48667a.get(i12);
                if (eVar instanceof th.e) {
                    Y((th.e) eVar, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            sz szVar = this.E;
            if (szVar != null) {
                szVar.P.g1();
            }
            org.telegram.ui.Cells.h6 h6Var = this.f28674g1;
            if (h6Var != null) {
                int currentTextColor = h6Var.getEditField().getCurrentTextColor();
                this.f28674g1.getEditField().setTextColor(-1);
                this.f28674g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.l1 = i10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f30254b.f32990f0;
        this.f28684m1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f28682k1 = g0(r2Var, i11, new dn(this, i10, 0), new pg(this, 28));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.h6 h6Var = this.f28674g1;
        if (h6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = h6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        i0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f28670e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.G = true;
            m.g3 g3Var = this.U0;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var, 100L);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        s4.e1 T;
        int i10;
        org.telegram.ui.bb1 bb1Var = this.f28696s;
        if (bb1Var.getChildCount() <= 1 || (childAt = bb1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = bb1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = bb1Var.T(F);
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
        return this.f28664b1;
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
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.y6.A5;
        org.telegram.ui.bb1 bb1Var = this.f28696s;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 16, new Class[]{vn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        int i11 = org.telegram.ui.ActionBar.y6.f23582p7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 262144, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.f23521m6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 8388608, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 8388608, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 262144, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.f23486k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        int i14 = org.telegram.ui.ActionBar.y6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 32, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bb1Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        return arrayList;
    }

    @Override
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, sh.e eVar) {
        int i11;
        sh.f fVar = this.f28684m1;
        if (eVar != null) {
            fVar.f48667a.put(i10, eVar);
        } else {
            fVar.f48667a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f28686n0;
        } else if (i10 == -3) {
            i11 = this.f28690p0;
        } else {
            int i12 = this.f28698t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.e1 K = this.f28696s.K(i11);
            if (K != null) {
                View view = K.f47773a;
                if (view instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view).e.a(eVar, true);
                }
            }
            this.f28694r.m(i11);
        }
        if (eVar instanceof th.e) {
            th.e eVar2 = (th.e) eVar;
            String str = eVar2.f49192b;
            bi.m5 m5Var = new bi.m5(14, this, eVar);
            sh.r rVar = this.Q;
            HashMap hashMap = rVar.f48709c;
            HashMap hashMap2 = rVar.f48708b;
            if (hashMap2.containsKey(str)) {
                m5Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(m5Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.f48707a).sendRequestTyped(getwebpagepreview, new Object(), new org.telegram.ui.Wallet.r1(5, rVar, str));
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
        org.telegram.ui.Cells.h6 h6Var;
        if (this.I) {
            fi.z3 z3Var = this.F;
            ah ahVar = null;
            ti tiVar = this.f30254b;
            if (i10 == 1) {
                sz szVar = this.E;
                if (szVar != null && szVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sz szVar2 = this.E;
                if (szVar2 != null && szVar2.f32713c1 != UserConfig.selectedAccount) {
                    tiVar.f33037u1.removeView(szVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    sz szVar3 = new sz(null, true, false, false, getContext(), true, null, null, true, this.f30253a, false, false);
                    this.E = szVar3;
                    szVar3.f32711c = 3;
                    szVar3.f32775w0 = false;
                    szVar3.f32781x2 = false;
                    szVar3.setShouldDrawBackground(false);
                    sz szVar4 = this.E;
                    szVar4.U0 = false;
                    szVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new in(this));
                    tiVar.f33037u1.addView(this.E);
                    this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.E.setVisibility(0);
                this.f28662a1 = true;
                sz szVar5 = this.E;
                if (this.f28666c1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28666c1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28666c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f28668d1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28668d1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28668d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f28668d1;
                } else {
                    i11 = this.f28666c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                szVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (h6Var = this.f28674g1) != null) {
                    AndroidUtilities.hideKeyboard(h6Var.getEditField());
                }
                this.f28664b1 = i11;
                z3Var.a();
                tiVar.f33037u1.requestLayout();
                org.telegram.ui.Cells.h6 h6Var2 = this.f28674g1;
                if (h6Var2 != null) {
                    ahVar = h6Var2.getEmojiButton();
                }
                if (ahVar != null) {
                    ahVar.j(yg.d, true);
                }
                if (!z10 && !this.f28670e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28664b1, 0.0f);
                    ofFloat.addUpdateListener(new gn(this, 1));
                    ofFloat.addListener(new jn(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.h6 h6Var3 = this.f28674g1;
            if (h6Var3 != null) {
                ahVar = h6Var3.getEmojiButton();
            }
            if (ahVar != null) {
                ahVar.j(yg.e, true);
            }
            sz szVar6 = this.E;
            if (szVar6 != null) {
                this.f28662a1 = false;
                this.f28676h1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    szVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f28664b1 = 0;
            }
            z3Var.a();
            tiVar.f33037u1.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f28662a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        l80 F = l80.F(this, null, new View(getContext()));
        F.f30168s = 0;
        F.f30169t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new en(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new en(this, i10, 2), true);
        in0 in0Var = new in0(getContext(), this.f30253a);
        F.f30163p = new org.telegram.ui.re(in0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        in0Var.e(F);
        eh.d c10 = in0Var.f29393n.c(null, null, false);
        c10.v(gh.c.k(in0Var.f29390b));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.f9965x.e = true;
        c10.x(AndroidUtilities.dp(16.0f));
        in0Var.F = c10;
        in0Var.E = (Drawable) callbackReturn.run(in0Var.f29395s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        in0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) in0Var.f29397x.getLayoutParams()).gravity = 1;
        in0Var.L = true;
        in0Var.show();
    }

    public final void k0() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f30253a;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23486k7, u6Var);
            if (w02 != this.f28691p1 || w03 != this.f28693q1) {
                this.f28691p1 = w02;
                this.f28693q1 = w03;
                Drawable drawable = this.f28687n1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f28689o1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.bb1 bb1Var = this.f28696s;
                if (bb1Var != null) {
                    for (int i10 = 0; i10 < bb1Var.getChildCount(); i10++) {
                        View childAt = bb1Var.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.v8) {
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
        this.f28688o0 = -1;
        this.f28690p0 = -1;
        this.f28692q0 = -1;
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
        d5.f fVar = this.M0;
        fVar.f7970a = -1;
        d5.f fVar2 = this.N0;
        fVar2.f7970a = -1;
        this.L0 = -1;
        this.f28706y0 = -1;
        this.f28707z0 = -1;
        this.f28699u0 = -1;
        this.f28698t0 = -1;
        this.f28704x0 = -1;
        this.f28686n0 = -1;
        this.f28683l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f28685n;
        if (!z11) {
            this.Q0 = 4;
            this.f28686n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f28695r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f28697s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f28698t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f28699u0 = i14;
        }
        int i15 = this.Q0;
        this.f28700v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f28702w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f28707z0 = i16;
            if (this.f28673g0) {
                this.Q0 = i15 + 4;
                this.f28706y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.wn) this.f30254b.f32990f0).e;
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
                this.f28661a0 = true;
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
                fVar.f7970a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                fVar2.f7970a = i21 + 4;
                if (fVar2.f7971b) {
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
            this.f28704x0 = i26;
            if (this.f28665c0) {
                this.f28688o0 = i27;
                this.f28690p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f28692q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void o() {
        this.H = true;
        ti tiVar = this.f30254b;
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            sz szVar = this.E;
            if (szVar != null) {
                tiVar.f33037u1.removeView(szVar);
            }
        }
    }

    @Override
    public final boolean r() {
        if (!V()) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f28677i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        this.f30254b.e2();
    }

    public void setDelegate(fo foVar) {
        this.f28679j0 = foVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30254b.getSheetContainer().invalidate();
    }

    @Override
    public final void u(float f7) {
        this.f30254b.e2();
    }

    @Override
    public final void updateColors() {
        try {
            this.f28680j1.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.hl, this.f30253a));
            k0();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void v(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f28685n;
            int i12 = 0;
            int i13 = 1;
            ti tiVar = this.f30254b;
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
                boolean z12 = this.f28673g0;
                if (z12 && this.f28671f0) {
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
                        todoItem.f22175id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                g5.Z(i14, tiVar.p1() + 1, tiVar.t1(), new bi.v3(this, (org.telegram.ui.wn) tiVar.f32990f0, tL_messageMediaToDo, 7));
                return;
            }
            boolean z13 = this.f28665c0;
            org.telegram.ui.bb1 bb1Var = this.f28696s;
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
                    for (int i19 = this.f28698t0; i19 < this.f28698t0 + this.M; i19++) {
                        s4.e1 K = bb1Var.K(i19);
                        if (K != null) {
                            View view = K.f47773a;
                            if (view instanceof org.telegram.ui.Cells.h6) {
                                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                                if (h6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    un unVar = this.f28703x;
                                    if (unVar != null) {
                                        unVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    t40 t40Var = this.f28705y;
                                    t40Var.setText(string);
                                    t40Var.f(h6Var.getCheckBox(), true);
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
                sh.f fVar = this.f28684m1;
                if (i20 < length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && fVar.b(i20) != null) {
                        this.V0 = true;
                        this.W0 = i20;
                        bb1Var.y0(this.f28698t0 + i20);
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
                    tL_poll.multiple_choice = this.f28663b0;
                    tL_poll.quiz = this.f28665c0;
                    tL_poll.public_voters = !this.f28661a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f7971b;
                    if (this.N0.f7971b) {
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
                            if ((this.f28663b0 || this.f28665c0) && zArr[i25]) {
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
                    g5.Z(i21, tiVar.p1() + 1, tiVar.t1(), new di.y2(this, (org.telegram.ui.wn) tiVar.f32990f0, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
