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
import org.telegram.ui.rb1;
public final class pn extends di implements pv0, NotificationCenter.NotificationCenterDelegate {
    public static final int f27931j1 = 0;
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
    public boolean f27932a0;
    public int f27933a1;
    public final boolean f27934b0;
    public boolean f27935b1;
    public boolean f27936c0;
    public boolean f27937c1;
    public boolean f27938d0;
    public org.telegram.ui.Cells.b6 f27939d1;
    public boolean f27940e0;
    public boolean f27941e1;
    public boolean f27942f0;
    public boolean f27943f1;
    public on f27944g0;
    public ym f27945g1;
    public int f27946h0;
    public int f27947h1;
    public int f27948i0;
    public final dh.i f27949i1;
    public int f27950j0;
    public int f27951k0;
    public int f27952l0;
    public int m0;
    public final boolean f27953n;
    public int f27954n0;
    public int f27955o0;
    public int f27956p0;
    public int f27957q0;
    public final nn f27958r;
    public int f27959r0;
    public final rb1 f27960s;
    public int f27961s0;
    public int f27962t0;
    public int f27963u0;
    public final dn v;
    public int f27964v0;
    public final ej f27965w;
    public int f27966w0;
    public final fn f27967x;
    public int f27968x0;
    public final l40 f27969y;
    public int f27970y0;
    public int f27971z0;

    public pn(li liVar, Context context, boolean z4, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, liVar);
        this.J = 1;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.V = true;
        this.f27936c0 = true;
        this.f27938d0 = true;
        this.f27946h0 = -1;
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
        this.f27941e1 = false;
        this.f27943f1 = false;
        Paint paint = new Paint(1);
        this.f27949i1 = new dh.i();
        this.f27953n = z4;
        int answersMaxCount = getAnswersMaxCount();
        this.G = answersMaxCount;
        this.H = new CharSequence[answersMaxCount];
        this.I = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.f24282b.G1).getUserConfig().isPremium();
        this.F = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.W = booleanValue;
            this.f27934b0 = booleanValue;
            boolean z10 = !booleanValue;
            this.Q = z10;
            this.O = z10;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.f24281a));
        this.f24282b.f26722o1.setDelegate(this);
        nn nnVar = new nn(this, context);
        this.f27958r = nnVar;
        rb1 rb1Var = new rb1(context, 4, null);
        this.f27960s = rb1Var;
        this.f24283c = rb1Var;
        this.d = rb1Var;
        this.h = true;
        this.f24284f = true;
        dn dnVar = new dn(this);
        this.v = dnVar;
        rb1Var.setItemAnimator(dnVar);
        arrayList.clear();
        dnVar.f5807m = false;
        dnVar.C = false;
        dnVar.o(mr.h);
        dnVar.n(350L);
        rb1Var.setClipToPadding(false);
        rb1Var.setVerticalScrollBarEnabled(false);
        rb1Var.setSections(true);
        ej ejVar = new ej(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, rb1Var, 3);
        this.f27965w = ejVar;
        rb1Var.setLayoutManager(ejVar);
        ejVar.O = true;
        new f2.e0(new oh.f(this, 2)).d(rb1Var);
        addView(rb1Var, k7.b6.e(-1, -1, 51));
        rb1Var.setPreserveFocusAfterLayout(true);
        rb1Var.setAdapter(nnVar);
        rb1Var.setOnItemClickListener(new sm(this, f6Var, liVar, context));
        rb1Var.setOnScrollListener(new eg.f2(this, 23));
        l40 l40Var = new l40(context, 4);
        this.f27969y = l40Var;
        l40Var.setAlpha(0.0f);
        l40Var.setVisibility(4);
        addView(l40Var, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.P0 = MessagesController.getInstance(this.f24282b.G1).config.pollCaptionLengthMax.get();
        this.N = new dh.w(this.f24282b.G1);
        NotificationCenter.getInstance(this.f24282b.G1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ?? qy0Var = new qy0(context, this.f24282b.G1, null, f6Var);
            this.f27967x = qy0Var;
            qy0Var.f28327y = true;
            qy0Var.B = true;
            qy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView((View) qy0Var, k7.b6.e(-2, 160, 51));
        }
        this.C = new ph.i3(this.f24282b.f26722o1, false, null);
        T();
    }

    public static void J(pn pnVar, int i10) {
        l40 l40Var = pnVar.f27969y;
        f2.l1 K = pnVar.f27960s.K(pnVar.f27957q0 + i10);
        if (K != null) {
            View view = K.f5774a;
            if (view instanceof org.telegram.ui.Cells.b6) {
                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                if (b6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    fn fnVar = pnVar.f27967x;
                    if (fnVar != null) {
                        fnVar.f();
                    }
                    l40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    l40Var.f(b6Var.getCheckBox(), true);
                    ImageView imageView = l40Var.f26563c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    l40Var.setTranslationY(l40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void K(org.telegram.ui.Components.pn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn.K(org.telegram.ui.Components.pn, android.view.View, int):void");
    }

    public static void M(pn pnVar, org.telegram.ui.Cells.b6 b6Var, boolean z4) {
        f2.l1 T;
        if (pnVar.F && z4) {
            if (pnVar.f27939d1 == b6Var && pnVar.X0 && pnVar.f27941e1) {
                pnVar.W();
                pnVar.X0 = false;
            }
            org.telegram.ui.Cells.b6 b6Var2 = pnVar.f27939d1;
            pnVar.f27939d1 = b6Var;
            b6Var.setEmojiButtonVisibility(true);
            qg emojiButton = b6Var.getEmojiButton();
            og ogVar = og.e;
            emojiButton.j(ogVar, false);
            rb1 rb1Var = pnVar.f27960s;
            View F = rb1Var.F(b6Var);
            if (F == null) {
                T = null;
            } else {
                T = rb1Var.T(F);
            }
            fn fnVar = pnVar.f27967x;
            if (fnVar != null) {
                fnVar.f();
                if (T != null) {
                    View view = T.f5774a;
                    if ((view instanceof org.telegram.ui.Cells.b6) && fnVar.getDelegate() != view) {
                        fnVar.setDelegate((org.telegram.ui.Cells.b6) view);
                    }
                }
            }
            if (b6Var2 != null && b6Var2 != b6Var) {
                if (pnVar.X0) {
                    pnVar.W();
                    pnVar.Z(false);
                    pnVar.c0();
                }
                b6Var2.setEmojiButtonVisibility(false);
                b6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void N(pn pnVar, org.telegram.ui.Cells.b6 b6Var) {
        pnVar.f27939d1 = b6Var;
        if (pnVar.X0) {
            pnVar.W();
            pnVar.c0();
            return;
        }
        pnVar.f0(1);
    }

    public static void O(pn pnVar, int i10) {
        li liVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i11;
        dh.i iVar = pnVar.f27949i1;
        if (iVar.b(i10) != null) {
            dh.h b10 = iVar.b(i10);
            if (b10 != null && (liVar = pnVar.f24282b) != null && (p2Var = liVar.f26685c0) != null) {
                Activity parentActivity = p2Var.getParentActivity();
                if (b10 instanceof eh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((eh.d) b10).f5593b);
                    PhotoViewer.t1().K2(parentActivity, null, null);
                    PhotoViewer.t1().f2(arrayList, 0, 14, false, new vm(pnVar, i10), null);
                    return;
                } else if (b10 instanceof eh.i) {
                    eh.i iVar2 = (eh.i) b10;
                    org.telegram.ui.rt.q().w(parentActivity);
                    org.telegram.ui.rt.q().v(new xm(pnVar, i10));
                    org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                    TLRPC.Document document = iVar2.f5606b;
                    if (MessageObject.isAnimatedEmoji(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    q10.t(document, null, "", null, null, i11, false, iVar2.f5607c, pnVar.f24281a, 200);
                    return;
                } else if (b10 instanceof eh.c) {
                    eh.c cVar = (eh.c) b10;
                    String str = cVar.d;
                    pnVar.g0(i10, new org.telegram.ui.rf(1, str, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f5591f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof eh.h) {
                    eh.h hVar = (eh.h) b10;
                    TLRPC.Document document2 = hVar.f5604b.getDocument();
                    String musicTitle = MessageObject.getMusicTitle(document2, true);
                    pnVar.g0(i10, new i(musicTitle, MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 1), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
                    return;
                } else if (b10 instanceof eh.g) {
                    pnVar.g0(i10, new ni((eh.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof eh.e) {
                    eh.e eVar = (eh.e) b10;
                    z4.g0(pnVar.getContext(), pnVar.f24281a, eVar.f5595b, eVar.f5598n, new om(pnVar, i10, 1), new pm(pnVar, i10, 0));
                    return;
                } else {
                    pnVar.b0(i10);
                    return;
                }
            }
            return;
        }
        pnVar.b0(i10);
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

    public static ym d0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback, fg fgVar) {
        if (p2Var == null) {
            return null;
        }
        ym ymVar = new ym(p2Var.getContext(), p2Var, p2Var.getResourceProvider(), fgVar);
        ymVar.W1 = new an(callback, p2Var, ymVar);
        ymVar.X1 = new bn(callback, ymVar);
        ymVar.f26698g0.f0();
        ymVar.J1(1, true);
        ymVar.h1(i10);
        ymVar.f26729q2 = new qm(callback);
        ymVar.U = new cn(callback, p2Var, ymVar);
        ymVar.V = new o1(16, callback, ymVar);
        ymVar.r1();
        ymVar.setFocusable(true);
        ymVar.show();
        return ymVar;
    }

    private int getAnswersMaxCount() {
        if (this.f27953n) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        li liVar = this.f24282b;
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
        li liVar = this.f24282b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f27953n) {
            liVar.U0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f27934b0) {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        liVar.W1();
        this.f27965w.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27960s.x0(1);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        int dp;
        if (this.F) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f27935b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.f27933a1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f27933a1).commit();
                } else {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z0).commit();
                }
            }
            boolean z12 = this.X0;
            li liVar = this.f24282b;
            ph.i3 i3Var = this.C;
            if (z12) {
                if (z4) {
                    i11 = this.f27933a1;
                } else {
                    i11 = this.Z0;
                }
                if (this.f27941e1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f27943f1 != this.f27941e1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.B.setLayoutParams(layoutParams);
                    this.Y0 = layoutParams.height;
                    i3Var.a();
                    liVar.f26722o1.requestLayout();
                    boolean z13 = this.f27943f1;
                    if (z13 != this.f27941e1) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        Q(dp);
                    }
                    this.f27943f1 = this.f27941e1;
                }
            }
            if (this.V0 != i10 || this.W0 != z4) {
                this.V0 = i10;
                this.W0 = z4;
                boolean z14 = this.f27935b1;
                org.telegram.ui.Cells.b6 b6Var = this.f27939d1;
                if (b6Var != null) {
                    if (b6Var.getEditField().isFocused() && i3Var.c() && i10 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f27935b1 = z11;
                } else {
                    this.f27935b1 = false;
                }
                if (this.f27935b1 && this.X0) {
                    f0(0);
                }
                if (this.Y0 != 0 && !(z10 = this.f27935b1) && z10 != z14 && !this.X0) {
                    this.Y0 = 0;
                    i3Var.a();
                    liVar.f26722o1.requestLayout();
                }
                if (this.f27935b1 && this.D) {
                    this.D = false;
                    AndroidUtilities.cancelRunOnUIThread(this.R0);
                }
            }
        }
    }

    public final void P() {
        fn fnVar = this.f27967x;
        if (fnVar != null) {
            fnVar.setDelegate(null);
            fnVar.f();
        }
        this.f27960s.setItemAnimator(this.v);
        int i10 = this.J;
        this.I[i10] = false;
        int i11 = i10 + 1;
        this.J = i11;
        int length = this.H.length;
        nn nnVar = this.f27958r;
        if (i11 == length) {
            nnVar.u(this.f27959r0);
        }
        nnVar.o(this.f27959r0);
        h0();
        this.f27946h0 = (this.f27957q0 + this.J) - 1;
        nnVar.m(this.f27961s0);
        nnVar.m(this.f27968x0);
    }

    public final void Q(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.ig(this, f10, 2));
        ofFloat.addListener(new um(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
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
        int i10 = this.f27971z0;
        if (i10 < 0) {
            return;
        }
        f2.l1 K = this.f27960s.K(i10);
        if (K == null) {
            this.f27958r.m(this.f27971z0);
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) K.f5774a;
        if (!z4) {
            z5Var.setChecked(false);
        }
        z5Var.getCheckBox().f23155a.a(!z4, true);
    }

    public final boolean S() {
        boolean z4;
        int i10;
        int i11;
        if (TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && TextUtils.isEmpty(Y(this.M)) && this.f27949i1.f4911a.size() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            for (int i12 = 0; i12 < this.J && (z4 = TextUtils.isEmpty(Y(this.H[i12]))); i12++) {
            }
        }
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f24282b.f26685c0.getParentActivity());
            boolean z10 = this.f27953n;
            if (z10) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f19478a.O = LocaleController.getString(i10);
            if (z10) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
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
        boolean z11 = this.f27953n;
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
        if (TextUtils.isEmpty(this.M) && TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L) && !z12 && this.f27949i1.f4911a.size() <= 0) {
            this.f27940e0 = true;
        } else {
            this.f27940e0 = false;
        }
        boolean z13 = this.f27940e0;
        li liVar = this.f24282b;
        liVar.setAllowNestedScroll(z13);
        this.U0 = z4;
        liVar.W1();
    }

    public final void U(org.telegram.ui.Cells.n8 n8Var, boolean z4) {
        if (this.S != 0) {
            n8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.S), z4, false);
        } else if (this.R != 0) {
            n8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.R / 3600, new Object[0]), z4, false);
        } else {
            n8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z4, false);
        }
    }

    public final void V(eh.e eVar, boolean z4) {
        boolean z10;
        TLRPC.Photo photo;
        String str = eVar.f5595b;
        dh.w wVar = this.N;
        boolean containsKey = wVar.f4955c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) wVar.f4954b.get(eVar.f5595b);
        xd.a aVar = eVar.f5600s;
        ImageReceiver imageReceiver = eVar.f4910a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = false;
        } else {
            z10 = true;
        }
        eVar.f5599r.a(z10, z4);
        eVar.f5598n = webPage;
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
        if (this.f27941e1) {
            this.B.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.B.setLayoutParams(layoutParams);
            this.Y0 = layoutParams.height;
            this.f27943f1 = this.f27941e1;
            this.f27941e1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(android.view.View r10, org.telegram.ui.Cells.b6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn.X(android.view.View, org.telegram.ui.Cells.b6, boolean):void");
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
                this.f27941e1 = false;
                f0(0);
            }
            if (z4) {
                kz kzVar2 = this.B;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.B.getMeasuredHeight());
                    ofFloat.addUpdateListener(new rm(this, 0));
                    this.f27937c1 = true;
                    ofFloat.addListener(new um(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
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
            org.telegram.ui.Cells.b6 b6Var = this.f27939d1;
            if (b6Var != null && (emojiButton = b6Var.getEmojiButton()) != null) {
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
        this.f27947h1 = i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f24282b.f26685c0;
        this.f27949i1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f27945g1 = d0(p2Var, i11, new om(this, i10, 0), new fg(this, 26));
    }

    public final void c0() {
        int i10;
        org.telegram.ui.Cells.b6 b6Var = this.f27939d1;
        if (b6Var != null) {
            this.C.e = true;
            EditTextBoldCursor editField = b6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        f0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.f27935b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
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
            for (Map.Entry entry : this.N.f4954b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f19312id)) != null) {
                    entry.setValue(webPage);
                }
            }
            dh.i iVar = this.f27949i1;
            int size = iVar.f4911a.size();
            for (int i12 = 0; i12 < size; i12++) {
                dh.h hVar2 = (dh.h) iVar.f4911a.get(i12);
                if (hVar2 instanceof eh.e) {
                    V((eh.e) hVar2, true);
                }
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            kz kzVar = this.B;
            if (kzVar != null) {
                kzVar.M.e1();
            }
            org.telegram.ui.Cells.b6 b6Var = this.f27939d1;
            if (b6Var != null) {
                int currentTextColor = b6Var.getEditField().getCurrentTextColor();
                this.f27939d1.getEditField().setTextColor(-1);
                this.f27939d1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10, dh.h hVar) {
        int i11;
        dh.i iVar = this.f27949i1;
        if (hVar != null) {
            iVar.f4911a.put(i10, hVar);
        } else {
            iVar.f4911a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f27951k0;
        } else if (i10 == -3) {
            i11 = this.m0;
        } else {
            int i12 = this.f27957q0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.J) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            f2.l1 K = this.f27960s.K(i11);
            if (K != null) {
                View view = K.f5774a;
                if (view instanceof org.telegram.ui.Cells.b6) {
                    ((org.telegram.ui.Cells.b6) view).e.a(hVar, true);
                }
            }
            this.f27958r.m(i11);
        }
        if (hVar instanceof eh.e) {
            eh.e eVar = (eh.e) hVar;
            String str = eVar.f5595b;
            dh.v vVar = new dh.v(15, this, hVar);
            dh.w wVar = this.N;
            HashMap hashMap = wVar.f4955c;
            HashMap hashMap2 = wVar.f4954b;
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
                    ConnectionsManager.getInstance(wVar.f4953a).sendRequestTyped(getwebpagepreview, new Object(), new dh.v(0, wVar, str));
                }
            }
            V(eVar, false);
        }
        T();
    }

    public final void f0(int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.Cells.b6 b6Var;
        if (this.F) {
            ph.i3 i3Var = this.C;
            qg qgVar = null;
            li liVar = this.f24282b;
            if (i10 == 1) {
                kz kzVar = this.B;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kz kzVar2 = this.B;
                if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                    liVar.f26722o1.removeView(kzVar2);
                    this.B = null;
                }
                if (this.B == null) {
                    kz kzVar3 = new kz(null, true, false, false, getContext(), true, null, null, true, this.f24281a, false, false);
                    this.B = kzVar3;
                    kzVar3.f26428c = 3;
                    kzVar3.f26482t0 = false;
                    kzVar3.f26487u2 = false;
                    kzVar3.setShouldDrawBackground(false);
                    kz kzVar4 = this.B;
                    kzVar4.R0 = false;
                    kzVar4.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.B.setForseMultiwindowLayout(true);
                    }
                    this.B.setDelegate(new tm(this));
                    liVar.f26722o1.addView(this.B);
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
                if (this.f27933a1 <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.f27933a1 = AndroidUtilities.dp(150.0f);
                    } else {
                        this.f27933a1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.f27933a1;
                } else {
                    i11 = this.Z0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar5.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
                kzVar5.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (b6Var = this.f27939d1) != null) {
                    AndroidUtilities.hideKeyboard(b6Var.getEditField());
                }
                this.Y0 = i11;
                i3Var.a();
                liVar.f26722o1.requestLayout();
                org.telegram.ui.Cells.b6 b6Var2 = this.f27939d1;
                if (b6Var2 != null) {
                    qgVar = b6Var2.getEmojiButton();
                }
                if (qgVar != null) {
                    qgVar.j(og.d, true);
                }
                if (!z4 && !this.f27935b1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y0, 0.0f);
                    ofFloat.addUpdateListener(new rm(this, 1));
                    ofFloat.addListener(new um(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b6 b6Var3 = this.f27939d1;
            if (b6Var3 != null) {
                qgVar = b6Var3.getEmojiButton();
            }
            if (qgVar != null) {
                qgVar.j(og.e, true);
            }
            kz kzVar6 = this.B;
            if (kzVar6 != null) {
                this.X0 = false;
                this.f27941e1 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.Y0 = 0;
            }
            i3Var.a();
            liVar.f26722o1.requestLayout();
        }
    }

    @Override
    public final boolean g() {
        return this.U0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        p70 F = p70.F(this, null, new View(getContext()));
        F.f27777s = 0;
        F.f27778t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new pm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new pm(this, i10, 2), true);
        hm0 hm0Var = new hm0(getContext(), this.f24281a);
        F.f27772p = new org.telegram.ui.re(hm0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        hm0Var.e(F);
        pg.b c3 = hm0Var.f25452n.c(null, null, false);
        c3.n(rg.b.k(hm0Var.f25449b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        hm0Var.C = c3;
        hm0Var.B = (Drawable) callbackReturn.run(hm0Var.f25454s);
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        hm0Var.B.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) hm0Var.f25456x.getLayoutParams()).gravity = 1;
        hm0Var.I = true;
        hm0Var.show();
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
        rb1 rb1Var = this.f27960s;
        if (rb1Var.getChildCount() <= 1 || (childAt = rb1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = rb1Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = rb1Var.T(F);
        }
        dl0 dl0Var = (dl0) T;
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        if (y10 > 0 && dl0Var != null && dl0Var.b() == 1) {
            i10 = y10;
        } else {
            i10 = 0;
        }
        if (y10 < 0 || dl0Var == null || dl0Var.b() != 1) {
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
        rb1 rb1Var = this.f27960s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19827a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 48, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 16, new Class[]{gn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 48, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.f20097p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 4, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.f20042m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 196608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 262144, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f20007k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 32, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rb1Var, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        boolean z4;
        this.f27952l0 = -1;
        this.m0 = -1;
        this.f27954n0 = -1;
        this.C0 = -1;
        this.f27970y0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.f27971z0 = -1;
        this.B0 = -1;
        this.A0 = -1;
        this.D0 = -1;
        b7.l0 l0Var = this.J0;
        l0Var.f1711b = -1;
        b7.l0 l0Var2 = this.K0;
        l0Var2.f1711b = -1;
        this.I0 = -1;
        this.f27964v0 = -1;
        this.f27966w0 = -1;
        this.f27959r0 = -1;
        this.f27957q0 = -1;
        this.f27963u0 = -1;
        this.f27951k0 = -1;
        this.f27948i0 = 1;
        this.N0 = 3;
        this.f27950j0 = 2;
        boolean z10 = this.f27953n;
        if (!z10) {
            this.N0 = 4;
            this.f27951k0 = 3;
        }
        int i10 = this.N0;
        int i11 = i10 + 1;
        this.f27955o0 = i10;
        int i12 = i10 + 2;
        this.N0 = i12;
        this.f27956p0 = i11;
        int i13 = this.J;
        if (i13 != 0) {
            this.f27957q0 = i12;
            this.N0 = i12 + i13;
        }
        if (i13 != this.H.length) {
            int i14 = this.N0;
            this.N0 = i14 + 1;
            this.f27959r0 = i14;
        }
        int i15 = this.N0;
        this.f27961s0 = i15;
        int i16 = i15 + 2;
        this.N0 = i16;
        this.f27962t0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.N0 = i17;
            this.f27966w0 = i16;
            if (this.f27938d0) {
                this.N0 = i15 + 4;
                this.f27964v0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.zn) this.f24282b.f26685c0).e;
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                int i18 = this.N0;
                this.N0 = i18 + 1;
                this.f27970y0 = i18;
            } else {
                this.U = true;
            }
            int i19 = this.N0;
            int i20 = i19 + 1;
            this.N0 = i20;
            this.C0 = i19;
            if (!z4) {
                this.N0 = i19 + 2;
                this.f27971z0 = i20;
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
                l0Var.f1711b = i22;
                int i23 = i21 + 5;
                this.N0 = i23;
                l0Var2.f1711b = i21 + 4;
                if (l0Var2.f1710a) {
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
            this.f27963u0 = i26;
            if (this.W) {
                this.f27952l0 = i27;
                this.m0 = i26 + 2;
                this.N0 = i26 + 4;
                this.f27954n0 = i26 + 3;
            }
        }
        int i28 = this.N0;
        this.N0 = i28 + 1;
        this.f27968x0 = i28;
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
        li liVar = this.f24282b;
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.F) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            kz kzVar = this.B;
            if (kzVar != null) {
                liVar.f26722o1.removeView(kzVar);
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
        this.f24282b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f27942f0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        this.f24282b.W1();
    }

    public void setDelegate(on onVar) {
        this.f27944g0 = onVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24282b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        boolean z4;
        if (i10 == 40) {
            boolean z10 = this.f27953n;
            int i11 = 0;
            int i12 = 1;
            li liVar = this.f24282b;
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
                boolean z11 = this.f27938d0;
                if (z11 && this.f27936c0) {
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
                        todoItem.f19304id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                z4.a0(i13, liVar.j1() + 1, liVar.n1(), new kh.h(this, (org.telegram.ui.zn) liVar.f26685c0, tL_messageMediaToDo, 8));
                return;
            }
            boolean z12 = this.W;
            rb1 rb1Var = this.f27960s;
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
                    for (int i18 = this.f27957q0; i18 < this.f27957q0 + this.J; i18++) {
                        f2.l1 K = rb1Var.K(i18);
                        if (K != null) {
                            View view = K.f5774a;
                            if (view instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                                if (b6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    fn fnVar = this.f27967x;
                                    if (fnVar != null) {
                                        fnVar.f();
                                    }
                                    String string = LocaleController.getString(R.string.PollTapToSelect);
                                    l40 l40Var = this.f27969y;
                                    l40Var.setText(string);
                                    l40Var.f(b6Var.getCheckBox(), true);
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
                dh.i iVar = this.f27949i1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                        this.S0 = true;
                        this.T0 = i19;
                        rb1Var.x0(this.f27957q0 + i19);
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
                    tL_poll.subscribers_only = this.J0.f1710a;
                    if (this.K0.f1710a) {
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
                    z4.a0(i20, liVar.j1() + 1, liVar.n1(), new gg.c1(this, (org.telegram.ui.zn) liVar.f26685c0, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }

    @Override
    public final void x() {
        nn nnVar = this.f27958r;
        if (nnVar != null) {
            nnVar.l();
        }
        if (this.F) {
            Z(false);
            fn fnVar = this.f27967x;
            if (fnVar != null) {
                fnVar.f();
            }
            org.telegram.ui.Cells.b6 b6Var = this.f27939d1;
            if (b6Var != null) {
                b6Var.setEmojiButtonVisibility(false);
                this.f27939d1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f27939d1.getEditField());
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn.y(int, int):void");
    }
}
