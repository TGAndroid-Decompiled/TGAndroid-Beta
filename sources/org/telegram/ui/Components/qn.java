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
import org.telegram.ui.jb1;
public final class qn extends di implements pv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f28159j1 = 0;
    public int A0;
    public kz B;
    public int B0;
    public final ph.i3 C;
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
    public final dh.w N;
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
    public boolean f28160a0;
    public int f28161a1;
    public final boolean f28162b0;
    public boolean f28163b1;
    public boolean f28164c0;
    public boolean f28165c1;
    public boolean f28166d0;
    public org.telegram.ui.Cells.c6 f28167d1;
    public boolean f28168e0;
    public boolean f28169e1;
    public boolean f28170f0;
    public boolean f28171f1;
    public pn f28172g0;
    public zm f28173g1;
    public int f28174h0;
    public int f28175h1;
    public int f28176i0;
    public final dh.i f28177i1;
    public int f28178j0;
    public int f28179k0;
    public int f28180l0;
    public int m0;
    public final boolean f28181n;
    public int f28182n0;
    public int f28183o0;
    public int f28184p0;
    public int f28185q0;
    public final on f28186r;
    public int f28187r0;
    public final jb1 f28188s;
    public int f28189s0;
    public int f28190t0;
    public int f28191u0;
    public final en v;
    public int f28192v0;
    public final ej f28193w;
    public int f28194w0;
    public final gn f28195x;
    public int f28196x0;
    public final k40 f28197y;
    public int f28198y0;
    public int f28199z0;

    public qn(li liVar, Context context, boolean z4, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, liVar);
        this.J = 1;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.V = true;
        this.f28164c0 = true;
        this.f28166d0 = true;
        this.f28174h0 = -1;
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
        this.f28169e1 = false;
        this.f28171f1 = false;
        Paint paint = new Paint(1);
        this.f28177i1 = new dh.i();
        this.f28181n = z4;
        int answersMaxCount = getAnswersMaxCount();
        this.G = answersMaxCount;
        this.H = new CharSequence[answersMaxCount];
        this.I = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f24278b.G1).getUserConfig().isPremium();
        this.F = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.W = booleanValue;
            this.f28162b0 = booleanValue;
            boolean z10 = !booleanValue;
            this.Q = z10;
            this.O = z10;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.f24277a));
        this.f24278b.f26726o1.setDelegate(this);
        on onVar = new on(this, context);
        this.f28186r = onVar;
        jb1 jb1Var = new jb1(context, 4, null);
        this.f28188s = jb1Var;
        this.f24279c = jb1Var;
        this.d = jb1Var;
        this.h = true;
        this.f24280f = true;
        en enVar = new en(this);
        this.v = enVar;
        jb1Var.setItemAnimator(enVar);
        arrayList.clear();
        enVar.f5818m = false;
        enVar.C = false;
        enVar.o(nr.h);
        enVar.n(350L);
        jb1Var.setClipToPadding(false);
        jb1Var.setVerticalScrollBarEnabled(false);
        jb1Var.setSections(true);
        ej ejVar = new ej(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, jb1Var, 3);
        this.f28193w = ejVar;
        jb1Var.setLayoutManager(ejVar);
        ejVar.O = true;
        new f2.e0(new oh.f(this, 2)).d(jb1Var);
        addView(jb1Var, k7.b6.e(-1, -1, 51));
        jb1Var.setPreserveFocusAfterLayout(true);
        jb1Var.setAdapter(onVar);
        jb1Var.setOnItemClickListener(new tm(this, f6Var, liVar, context));
        jb1Var.setOnScrollListener(new eg.f2(this, 23));
        k40 k40Var = new k40(context, 4);
        this.f28197y = k40Var;
        k40Var.setAlpha(0.0f);
        k40Var.setVisibility(4);
        addView(k40Var, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.P0 = MessagesController.getInstance(this.f24278b.G1).config.pollCaptionLengthMax.get();
        this.N = new dh.w(this.f24278b.G1);
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? qy0Var = new qy0(context, this.f24278b.G1, null, f6Var);
            this.f28195x = qy0Var;
            qy0Var.f28313y = true;
            qy0Var.B = true;
            qy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) qy0Var, k7.b6.e(-2, 160, 51));
        }
        this.C = new ph.i3(this.f24278b.f26726o1, false, null);
        T();
    }

    public static void J(qn qnVar, int i10) {
        k40 k40Var = qnVar.f28197y;
        f2.l1 K = qnVar.f28188s.K(qnVar.f28185q0 + i10);
        if (K != null) {
            View view = K.f5785a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    gn gnVar = qnVar.f28195x;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                    k40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    k40Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = k40Var.f26147c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    k40Var.setTranslationY(k40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void K(org.telegram.ui.Components.qn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.K(org.telegram.ui.Components.qn, android.view.View, int):void");
    }

    public static void M(qn qnVar, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.l1 T;
        if (qnVar.F && z4) {
            if (qnVar.f28167d1 == c6Var && qnVar.X0 && qnVar.f28169e1) {
                qnVar.W();
                qnVar.X0 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = qnVar.f28167d1;
            qnVar.f28167d1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            qg emojiButton = c6Var.getEmojiButton();
            og ogVar = og.e;
            emojiButton.j(ogVar, false);
            jb1 jb1Var = qnVar.f28188s;
            View F = jb1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = jb1Var.T(F);
            }
            gn gnVar = qnVar.f28195x;
            if (gnVar != null) {
                gnVar.f();
                if (T != null) {
                    View view = T.f5785a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && gnVar.getDelegate() != view) {
                        gnVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (qnVar.X0) {
                    qnVar.W();
                    qnVar.Z(false);
                    qnVar.c0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void N(qn qnVar, org.telegram.ui.Cells.c6 c6Var) {
        qnVar.f28167d1 = c6Var;
        if (qnVar.X0) {
            qnVar.W();
            qnVar.c0();
            return;
        }
        qnVar.f0(1);
    }

    public static void O(qn qnVar, int i10) {
        li liVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i11;
        dh.i iVar = qnVar.f28177i1;
        if (iVar.b(i10) != null) {
            dh.h b10 = iVar.b(i10);
            if (b10 != null && (liVar = qnVar.f24278b) != null && (p2Var = liVar.f26689c0) != null) {
                Activity parentActivity = p2Var.getParentActivity();
                if (b10 instanceof eh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((eh.d) b10).f5604b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new wm(qnVar, i10), null);
                    return;
                } else if (b10 instanceof eh.i) {
                    eh.i iVar2 = (eh.i) b10;
                    org.telegram.ui.pt.q().w(parentActivity);
                    org.telegram.ui.pt.q().v(new ym(qnVar, i10));
                    org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
                    TLRPC.Document document = iVar2.f5617b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q10.t(document, null, "", null, null, i11, false, iVar2.f5618c, qnVar.f24277a, 200);
                    return;
                } else if (b10 instanceof eh.c) {
                    eh.c cVar = (eh.c) b10;
                    String str = cVar.d;
                    qnVar.g0(i10, new org.telegram.ui.pf(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f5602f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof eh.h) {
                    eh.h hVar = (eh.h) b10;
                    TLRPC.Document document2 = hVar.f5615b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    qnVar.g0(i10, new i(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 1), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof eh.g) {
                    qnVar.g0(i10, new ni((eh.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof eh.e) {
                    eh.e eVar = (eh.e) b10;
                    z4.g0(qnVar.getContext(), qnVar.f24277a, eVar.f5606b, eVar.f5609n, new pm(qnVar, i10, 1), new qm(qnVar, i10, 0));
                    return;
                } else {
                    qnVar.b0(i10);
                    return;
                }
            }
            return;
        }
        qnVar.b0(i10);
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

    public static zm d0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback, fg fgVar) {
        if (p2Var == null) {
            return null;
        }
        zm zmVar = new zm(p2Var.getContext(), p2Var, p2Var.getResourceProvider(), fgVar);
        zmVar.W1 = new bn(callback, p2Var, zmVar);
        zmVar.X1 = new cn(callback, zmVar);
        zmVar.f26702g0.f0();
        zmVar.J1(1, true);
        zmVar.h1(i10);
        zmVar.f26733q2 = new rm(callback);
        zmVar.U = new dn(callback, p2Var, zmVar);
        zmVar.V = new o1(16, callback, zmVar);
        zmVar.r1();
        zmVar.setFocusable(true);
        zmVar.show();
        return zmVar;
    }

    private int getAnswersMaxCount() {
        if (this.f28181n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        li liVar = this.f24278b;
        if (liVar != null) {
            return liVar.G1;
        }
        return UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void D(di diVar) {
        li liVar = this.f24278b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f28181n) {
            liVar.U0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f28162b0) {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        liVar.W1();
        this.f28193w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28188s.x0(1);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        int dp;
        if (this.F) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f28163b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.f28161a1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f28161a1).commit();
                } else {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z0).commit();
                }
            }
            boolean z12 = this.X0;
            li liVar = this.f24278b;
            ph.i3 i3Var = this.C;
            if (z12) {
                if (z4) {
                    i11 = this.f28161a1;
                } else {
                    i11 = this.Z0;
                }
                if (this.f28169e1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f28171f1 != this.f28169e1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.B.setLayoutParams(layoutParams);
                    this.Y0 = layoutParams.height;
                    i3Var.a();
                    liVar.f26726o1.requestLayout();
                    boolean z13 = this.f28171f1;
                    if (z13 != this.f28169e1) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f28171f1 = this.f28169e1;
                }
            }
            if (this.V0 != i10 || this.W0 != z4) {
                this.V0 = i10;
                this.W0 = z4;
                boolean z14 = this.f28163b1;
                org.telegram.ui.Cells.c6 c6Var = this.f28167d1;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && i3Var.c() && i10 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f28163b1 = z11;
                } else {
                    this.f28163b1 = false;
                }
                if (this.f28163b1 && this.X0) {
                    f0(0);
                }
                if (this.Y0 != 0 && !(z10 = this.f28163b1) && z10 != z14 && !this.X0) {
                    this.Y0 = 0;
                    i3Var.a();
                    liVar.f26726o1.requestLayout();
                }
                if (this.f28163b1 && this.D) {
                    this.D = false;
                    AndroidUtilities.cancelRunOnUIThread(this.R0);
                }
            }
        }
    }

    public final void P() {
        gn gnVar = this.f28195x;
        if (gnVar != null) {
            gnVar.setDelegate(null);
            gnVar.f();
        }
        this.f28188s.setItemAnimator(this.v);
        int i10 = this.J;
        this.I[i10] = false;
        int i11 = i10 + 1;
        this.J = i11;
        int length = this.H.length;
        on onVar = this.f28186r;
        if (i11 == length) {
            onVar.u(this.f28187r0);
        }
        onVar.o(this.f28187r0);
        h0();
        this.f28174h0 = (this.f28185q0 + this.J) - 1;
        onVar.m(this.f28189s0);
        onVar.m(this.f28196x0);
    }

    public final void Q(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.gg(this, f10, 2));
        ofFloat.addListener(new vm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
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
        int i10 = this.f28199z0;
        if (i10 < 0) {
            return;
        }
        f2.l1 K = this.f28188s.K(i10);
        if (K == null) {
            this.f28186r.m(this.f28199z0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.f5785a;
        if (!z4) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().f23182a.a(!z4, true);
    }

    public final boolean S() {
        boolean z4;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && TextUtils.isEmpty(Y(this.M)) && this.f28177i1.f4905a.size() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            for (int i12 = 0; i12 < this.J && (z4 = TextUtils.isEmpty(Y(this.H[i12]))); i12++) {
            }
        }
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f24278b.f26689c0.getParentActivity());
            boolean z10 = this.f28181n;
            if (z10) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f19503a.O = LocaleController.getString(i10);
            if (z10) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
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
        boolean z11 = this.f28181n;
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
        if (TextUtils.isEmpty(this.M) && TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L) && !z12 && this.f28177i1.f4905a.size() <= 0) {
            this.f28168e0 = true;
        } else {
            this.f28168e0 = false;
        }
        boolean z13 = this.f28168e0;
        li liVar = this.f24278b;
        liVar.setAllowNestedScroll(z13);
        this.U0 = z4;
        liVar.W1();
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

    public final void V(eh.e eVar, boolean z4) {
        boolean z10;
        TLRPC.Photo photo;
        String str = eVar.f5606b;
        dh.w wVar = this.N;
        boolean containsKey = wVar.f4949c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) wVar.f4948b.get(eVar.f5606b);
        xd.a aVar = eVar.f5611s;
        ImageReceiver imageReceiver = eVar.f4904a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = false;
        } else {
            z10 = true;
        }
        eVar.f5610r.a(z10, z4);
        eVar.f5609n = webPage;
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
        if (this.f28169e1) {
            this.B.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.B.setLayoutParams(layoutParams);
            this.Y0 = layoutParams.height;
            this.f28171f1 = this.f28169e1;
            this.f28169e1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.c6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.X(android.view.View, org.telegram.ui.Cells.c6, boolean):void");
    }

    public final void Z(boolean z4) {
        if (this.F) {
            if (this.X0) {
                kz kzVar = this.B;
                kzVar.M.B0();
                kzVar.F.scrollTo(0, 0);
                kzVar.G(1);
                kzVar.N.h1(0, 0);
                this.B.t(false);
                if (z4) {
                    this.B.B();
                }
                this.f28169e1 = false;
                f0(0);
            }
            if (z4) {
                kz kzVar2 = this.B;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.B.getMeasuredHeight());
                    ofFloat.addUpdateListener(new sm(this, 0));
                    this.f28165c1 = true;
                    ofFloat.addListener(new vm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        kz kzVar;
        qg emojiButton;
        if (!this.X0 && (kzVar = this.B) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f28167d1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(og.e, false);
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
        this.f28175h1 = i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f24278b.f26689c0;
        this.f28177i1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f28173g1 = d0(p2Var, i11, new pm(this, i10, 0), new fg(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.c6 c6Var = this.f28167d1;
        if (c6Var != null) {
            this.C.e = true;
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
        if (!AndroidUtilities.usingHardwareInput && !this.f28163b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
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
            for (Map.Entry entry : this.N.f4948b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f19337id)) != null) {
                    entry.setValue(webPage);
                }
            }
            dh.i iVar = this.f28177i1;
            int size = iVar.f4905a.size();
            for (int i12 = 0; i12 < size; i12++) {
                dh.h hVar2 = (dh.h) iVar.f4905a.get(i12);
                if (hVar2 instanceof eh.e) {
                    V((eh.e) hVar2, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            kz kzVar = this.B;
            if (kzVar != null) {
                kzVar.M.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f28167d1;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f28167d1.getEditField().setTextColor(-1);
                this.f28167d1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, dh.h hVar) {
        int i11;
        dh.i iVar = this.f28177i1;
        if (hVar != null) {
            iVar.f4905a.put(i10, hVar);
        } else {
            iVar.f4905a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f28179k0;
        } else if (i10 == -3) {
            i11 = this.m0;
        } else {
            int i12 = this.f28185q0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.J) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            f2.l1 K = this.f28188s.K(i11);
            if (K != null) {
                View view = K.f5785a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).e.a(hVar, true);
                }
            }
            this.f28186r.m(i11);
        }
        if (hVar instanceof eh.e) {
            eh.e eVar = (eh.e) hVar;
            String str = eVar.f5606b;
            dh.v vVar = new dh.v(15, this, hVar);
            dh.w wVar = this.N;
            HashMap hashMap = wVar.f4949c;
            HashMap hashMap2 = wVar.f4948b;
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
                    ConnectionsManager.getInstance(wVar.f4947a).sendRequestTyped(getwebpagepreview, new Object(), new dh.v(0, wVar, str));
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
            ph.i3 i3Var = this.C;
            qg qgVar = null;
            li liVar = this.f24278b;
            if (i10 == 1) {
                kz kzVar = this.B;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kz kzVar2 = this.B;
                if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                    liVar.f26726o1.removeView(kzVar2);
                    this.B = null;
                }
                if (this.B == null) {
                    kz kzVar3 = new kz(null, true, false, false, getContext(), true, null, null, true, this.f24277a, false, false);
                    this.B = kzVar3;
                    kzVar3.f26416c = 3;
                    kzVar3.f26470t0 = false;
                    kzVar3.f26475u2 = false;
                    kzVar3.setShouldDrawBackground(false);
                    kz kzVar4 = this.B;
                    kzVar4.R0 = false;
                    kzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.B.setForseMultiwindowLayout(true);
                    }
                    this.B.setDelegate(new um(this));
                    liVar.f26726o1.addView(this.B);
                    this.B.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
                this.B.setVisibility(0);
                this.X0 = true;
                kz kzVar5 = this.B;
                if (this.Z0 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.Z0 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.Z0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.f28161a1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f28161a1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f28161a1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f28161a1;
                } else {
                    i11 = this.Z0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                kzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f28167d1) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.Y0 = i11;
                i3Var.a();
                liVar.f26726o1.requestLayout();
                org.telegram.ui.Cells.c6 c6Var2 = this.f28167d1;
                if (c6Var2 != null) {
                    qgVar = c6Var2.getEmojiButton();
                }
                if (qgVar != null) {
                    qgVar.j(og.d, true);
                }
                if (!z4 && !this.f28163b1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y0, 0.0f);
                    ofFloat.addUpdateListener(new sm(this, 1));
                    ofFloat.addListener(new vm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.c6 c6Var3 = this.f28167d1;
            if (c6Var3 != null) {
                qgVar = c6Var3.getEmojiButton();
            }
            if (qgVar != null) {
                qgVar.j(og.e, true);
            }
            kz kzVar6 = this.B;
            if (kzVar6 != null) {
                this.X0 = false;
                this.f28169e1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.Y0 = 0;
            }
            i3Var.a();
            liVar.f26726o1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.U0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        o70 F = o70.F(this, null, new View(getContext()));
        F.f27489s = 0;
        F.f27490t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new qm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new qm(this, i10, 2), true);
        im0 im0Var = new im0(getContext(), this.f24277a);
        F.f27484p = new org.telegram.ui.pe(im0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        im0Var.e(F);
        pg.b c3 = im0Var.f25750n.c(null, null, false);
        c3.n(rg.b.j(im0Var.f25747b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        im0Var.C = c3;
        im0Var.B = (Drawable) callbackReturn.run(im0Var.f25752s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        im0Var.B.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) im0Var.f25754x.getLayoutParams()).gravity = 1;
        im0Var.I = true;
        im0Var.show();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        f2.l1 T;
        int i10;
        jb1 jb1Var = this.f28188s;
        if (jb1Var.getChildCount() <= 1 || (childAt = jb1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = jb1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        el0 el0Var = (el0) T;
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y10 > 0 && el0Var != null && el0Var.b() == 1) {
            i10 = y10;
        } else {
            i10 = 0;
        }
        if (y10 < 0 || el0Var == null || el0Var.b() != 1) {
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        jb1 jb1Var = this.f28188s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19852a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 16, new Class[]{hn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.f20122p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.f20067m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f20032k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z4;
        this.f28180l0 = -1;
        this.m0 = -1;
        this.f28182n0 = -1;
        this.C0 = -1;
        this.f28198y0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.f28199z0 = -1;
        this.B0 = -1;
        this.A0 = -1;
        this.D0 = -1;
        b7.l0 l0Var = this.J0;
        l0Var.f1700b = -1;
        b7.l0 l0Var2 = this.K0;
        l0Var2.f1700b = -1;
        this.I0 = -1;
        this.f28192v0 = -1;
        this.f28194w0 = -1;
        this.f28187r0 = -1;
        this.f28185q0 = -1;
        this.f28191u0 = -1;
        this.f28179k0 = -1;
        this.f28176i0 = 1;
        this.N0 = 3;
        this.f28178j0 = 2;
        boolean z10 = this.f28181n;
        if (!z10) {
            this.N0 = 4;
            this.f28179k0 = 3;
        }
        int i10 = this.N0;
        int i11 = i10 + 1;
        this.f28183o0 = i10;
        int i12 = i10 + 2;
        this.N0 = i12;
        this.f28184p0 = i11;
        int i13 = this.J;
        if (i13 != 0) {
            this.f28185q0 = i12;
            this.N0 = i12 + i13;
        }
        if (i13 != this.H.length) {
            int i14 = this.N0;
            this.N0 = i14 + 1;
            this.f28187r0 = i14;
        }
        int i15 = this.N0;
        this.f28189s0 = i15;
        int i16 = i15 + 2;
        this.N0 = i16;
        this.f28190t0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.N0 = i17;
            this.f28194w0 = i16;
            if (this.f28166d0) {
                this.N0 = i15 + 4;
                this.f28192v0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.xn) this.f24278b.f26689c0).e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                int i18 = this.N0;
                this.N0 = i18 + 1;
                this.f28198y0 = i18;
            } else {
                this.U = true;
            }
            int i19 = this.N0;
            int i20 = i19 + 1;
            this.N0 = i20;
            this.C0 = i19;
            if (!z4) {
                this.N0 = i19 + 2;
                this.f28199z0 = i20;
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
                l0Var.f1700b = i22;
                int i23 = i21 + 5;
                this.N0 = i23;
                l0Var2.f1700b = i21 + 4;
                if (l0Var2.f1699a) {
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
            this.f28191u0 = i26;
            if (this.W) {
                this.f28180l0 = i27;
                this.m0 = i26 + 2;
                this.N0 = i26 + 4;
                this.f28182n0 = i26 + 3;
            }
        }
        int i28 = this.N0;
        this.N0 = i28 + 1;
        this.f28196x0 = i28;
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
        li liVar = this.f24278b;
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.F) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            kz kzVar = this.B;
            if (kzVar != null) {
                liVar.f26726o1.removeView(kzVar);
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
        this.f24278b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f28170f0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        this.f24278b.W1();
    }

    public void setDelegate(pn pnVar) {
        this.f28172g0 = pnVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z4;
        if (i10 == 40) {
            boolean z10 = this.f28181n;
            int i11 = 0;
            int i12 = 1;
            li liVar = this.f24278b;
            CharSequence[] charSequenceArr = this.H;
            if (z10) {
                CharSequence[] charSequenceArr2 = {Y(this.K)};
                int i13 = liVar.G1;
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
                boolean z11 = this.f28166d0;
                if (z11 && this.f28164c0) {
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
                        todoItem.f19329id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                z4.a0(i13, liVar.j1() + 1, liVar.n1(), new kh.h(this, (org.telegram.ui.xn) liVar.f26689c0, tL_messageMediaToDo, 8));
                return;
            }
            boolean z12 = this.W;
            jb1 jb1Var = this.f28188s;
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
                    for (int i18 = this.f28185q0; i18 < this.f28185q0 + this.J; i18++) {
                        f2.l1 K = jb1Var.K(i18);
                        if (K != null) {
                            View view = K.f5785a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    gn gnVar = this.f28195x;
                                    if (gnVar != null) {
                                        gnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    k40 k40Var = this.f28197y;
                                    k40Var.setText(string);
                                    k40Var.f(c6Var.getCheckBox(), true);
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
                dh.i iVar = this.f28177i1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                        this.S0 = true;
                        this.T0 = i19;
                        jb1Var.x0(this.f28185q0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.K)};
                    int i20 = liVar.G1;
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
                    tL_poll.subscribers_only = this.J0.f1699a;
                    if (this.K0.f1699a) {
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
                    z4.a0(i20, liVar.j1() + 1, liVar.n1(), new gg.c1(this, (org.telegram.ui.xn) liVar.f26689c0, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        on onVar = this.f28186r;
        if (onVar != null) {
            onVar.l();
        }
        if (this.F) {
            Z(false);
            gn gnVar = this.f28195x;
            if (gnVar != null) {
                gnVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f28167d1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f28167d1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f28167d1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.y(int, int):void");
    }
}
