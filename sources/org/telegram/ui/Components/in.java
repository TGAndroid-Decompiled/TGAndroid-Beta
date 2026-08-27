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
import android.widget.TextView;
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
import org.telegram.ui.ta1;

public final class in extends yh implements yu0, NotificationCenter.NotificationCenterDelegate {

    public static final int f29409i1 = 0;
    public yy A;
    public int A0;
    public final lh.a4 B;
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
    public final zg.s M;
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

    public final boolean f29410a0;

    public boolean f29411a1;

    public boolean f29412b0;

    public boolean f29413b1;

    public boolean f29414c0;

    public org.telegram.ui.Cells.z5 f29415c1;

    public boolean f29416d0;

    public boolean f29417d1;

    public boolean f29418e0;

    public boolean f29419e1;

    public hn f29420f0;

    public qm f29421f1;

    public int f29422g0;

    public int f29423g1;

    public int f29424h0;

    public final zg.f f29425h1;

    public int f29426i0;

    public int f29427j0;

    public int f29428k0;

    public int f29429l0;
    public int m0;

    public final boolean f29430n;

    public int f29431n0;

    public int f29432o0;

    public int f29433p0;

    public int f29434q0;

    public final gn f29435r;

    public int f29436r0;

    public final ta1 f29437s;

    public int f29438s0;

    public int f29439t0;

    public int f29440u0;
    public final vm v;

    public int f29441v0;

    public final zi f29442w;

    public int f29443w0;

    public final ym f29444x;

    public int f29445x0;

    public final x30 f29446y;

    public int f29447y0;

    public int f29448z0;

    public in(gi giVar, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Boolean bool) {
        super(context, c6Var, giVar);
        this.I = 1;
        this.N = true;
        this.O = true;
        this.P = true;
        this.U = true;
        this.f29412b0 = true;
        this.f29414c0 = true;
        this.f29422g0 = -1;
        m.a aVar = new m.a(this);
        this.I0 = aVar;
        m.a aVar2 = new m.a(this);
        this.J0 = aVar2;
        int i10 = 2;
        int i11 = 0;
        this.K0 = new m.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.L0 = arrayList;
        this.P0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.Q0 = new m.i3(this, 15);
        this.R0 = false;
        this.S0 = -1;
        this.f29417d1 = false;
        this.f29419e1 = false;
        Paint paint = new Paint(1);
        this.f29425h1 = new zg.f();
        this.f29430n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.F = answersMaxCount;
        this.G = new CharSequence[answersMaxCount];
        this.H = new boolean[answersMaxCount];
        boolean zIsPremium = AccountInstance.getInstance(this.f34900b.F1).getUserConfig().isPremium();
        this.E = zIsPremium;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this.V = zBooleanValue;
            this.f29410a0 = zBooleanValue;
            boolean z11 = !zBooleanValue;
            this.P = z11;
            this.N = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.f34899a));
        this.f34900b.f28674n1.setDelegate(this);
        gn gnVar = new gn(this, context);
        this.f29435r = gnVar;
        ta1 ta1Var = new ta1(context, 4, null);
        this.f29437s = ta1Var;
        this.f34901c = ta1Var;
        this.d = ta1Var;
        this.h = true;
        this.f34903f = true;
        vm vmVar = new vm(this);
        this.v = vmVar;
        ta1Var.setItemAnimator(vmVar);
        arrayList.clear();
        vmVar.f5819m = false;
        vmVar.C = false;
        vmVar.o(er.h);
        vmVar.n(350L);
        ta1Var.setClipToPadding(false);
        ta1Var.setVerticalScrollBarEnabled(false);
        ta1Var.setSections(true);
        zi ziVar = new zi(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, ta1Var, 3);
        this.f29442w = ziVar;
        ta1Var.setLayoutManager(ziVar);
        ziVar.O = true;
        new f2.f0(new kh.g(this, i10)).d(ta1Var);
        addView(ta1Var, h7.z5.e(-1, -1, 51));
        ta1Var.setPreserveFocusAfterLayout(true);
        ta1Var.setAdapter(gnVar);
        ta1Var.setOnItemClickListener(new jm(this, c6Var, giVar, context));
        ta1Var.setOnScrollListener(new xm(this, i11));
        x30 x30Var = new x30(context, 4);
        this.f29446y = x30Var;
        x30Var.setAlpha(0.0f);
        x30Var.setVisibility(4);
        addView(x30Var, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.O0 = MessagesController.getInstance(this.f34900b.F1).config.pollCaptionLengthMax.get();
        this.M = new zg.s(this.f34900b.F1);
        NotificationCenter.getInstance(this.f34900b.F1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (zIsPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            ym ymVar = new ym(context, this.f34900b.F1, null, c6Var);
            this.f29444x = ymVar;
            ymVar.f34373y = true;
            ymVar.A = true;
            ymVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(ymVar, h7.z5.e(-2, 160, 51));
        }
        this.B = new lh.a4(this.f34900b.f28674n1, false, null);
        T();
    }

    public static void K(in inVar, int i10) {
        x30 x30Var = inVar.f29446y;
        f2.o1 o1VarK = inVar.f29437s.K(inVar.f29433p0 + i10);
        if (o1VarK != null) {
            View view = o1VarK.f5789a;
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                if (z5Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    ym ymVar = inVar.f29444x;
                    if (ymVar != null) {
                        ymVar.f();
                    }
                    x30Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    x30Var.f(z5Var.getCheckBox(), true);
                    ImageView imageView = x30Var.f34453c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    x30Var.setTranslationY(x30Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void L(in inVar, View view, int i10) {
        int length;
        int i11;
        int length2;
        boolean z10 = inVar.f29430n;
        if (view instanceof org.telegram.ui.Cells.z5) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            if (i10 == inVar.f29427j0) {
                i11 = inVar.O0;
                Editable editable = inVar.K;
                if (editable != null) {
                    length2 = editable.length();
                } else {
                    length2 = 0;
                }
                length = i11 - length2;
            } else if (i10 == inVar.f29426i0) {
                i11 = z10 ? inVar.getMessagesController().todoTitleLengthMax : 255;
                Editable editable2 = inVar.J;
                if (editable2 != null) {
                    length2 = editable2.length();
                } else {
                    length2 = 0;
                }
                length = i11 - length2;
            } else if (i10 == inVar.f29429l0) {
                Editable editable3 = inVar.L;
                length = 200 - (editable3 != null ? editable3.length() : 0);
                i11 = 200;
            } else {
                int i12 = inVar.f29433p0;
                if (i10 < i12 || i10 >= inVar.I + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? inVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = inVar.G[i13];
                int i15 = i14;
                length = i14 - (charSequence != null ? charSequence.length() : 0);
                i11 = i15;
            }
            float f10 = i11;
            if (length > f10 - (0.7f * f10)) {
                z5Var.setText2("");
                return;
            }
            z5Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.h5 textView2 = z5Var.getTextView2();
            int i16 = length < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, inVar.f34899a));
            textView2.setTag(Integer.valueOf(i16));
        }
    }

    public static void M(in inVar, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        if (inVar.E && z10) {
            if (inVar.f29415c1 == z5Var && inVar.W0 && inVar.f29417d1) {
                inVar.W();
                inVar.W0 = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = inVar.f29415c1;
            inVar.f29415c1 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            mg emojiButton = z5Var.getEmojiButton();
            kg kgVar = kg.f30100e;
            emojiButton.j(kgVar, false);
            ta1 ta1Var = inVar.f29437s;
            View viewF = ta1Var.F(z5Var);
            f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
            ym ymVar = inVar.f29444x;
            if (ymVar != null) {
                ymVar.f();
                if (o1VarT != null) {
                    View view = o1VarT.f5789a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && ymVar.getDelegate() != view) {
                        ymVar.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 == null || z5Var2 == z5Var) {
                return;
            }
            if (inVar.W0) {
                inVar.W();
                inVar.Z(false);
                inVar.c0();
            }
            z5Var2.setEmojiButtonVisibility(false);
            z5Var2.getEmojiButton().j(kgVar, false);
        }
    }

    public static void N(in inVar, org.telegram.ui.Cells.z5 z5Var) {
        inVar.f29415c1 = z5Var;
        if (!inVar.W0) {
            inVar.f0(1);
        } else {
            inVar.W();
            inVar.c0();
        }
    }

    public static void O(in inVar, int i10) {
        gi giVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        zg.f fVar = inVar.f29425h1;
        if (fVar.b(i10) == null) {
            inVar.b0(i10);
            return;
        }
        zg.e eVarB = fVar.b(i10);
        if (eVarB == null || (giVar = inVar.f34900b) == null || (n2Var = giVar.f28635b0) == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        if (eVarB instanceof ah.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((ah.d) eVarB).f756b);
            PhotoViewer.t1().K2(parentActivity, null, null);
            PhotoViewer.t1().f2(arrayList, 0, 14, false, new nm(inVar, i10), null);
            return;
        }
        if (eVarB instanceof ah.i) {
            ah.i iVar = (ah.i) eVarB;
            org.telegram.ui.kt.q().w(parentActivity);
            org.telegram.ui.kt.q().v(new pm(inVar, i10));
            org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
            TLRPC.Document document = iVar.f770b;
            ktVarQ.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, iVar.f771c, inVar.f34899a, 200);
            return;
        }
        if (eVarB instanceof ah.c) {
            ah.c cVar = (ah.c) eVarB;
            inVar.g0(i10, new org.telegram.ui.lf(1, cVar.d, AndroidUtilities.formatFileSize(cVar.f753e, true, true) + " " + cVar.f754f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (eVarB instanceof ah.h) {
            ah.h hVar = (ah.h) eVarB;
            TLRPC.Document document2 = hVar.f768b.getDocument();
            inVar.g0(i10, new lh.e5(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (eVarB instanceof ah.g) {
            inVar.g0(i10, new ii((ah.g) eVarB, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(eVarB instanceof ah.e)) {
            inVar.b0(i10);
        } else {
            ah.e eVar = (ah.e) eVarB;
            y4.g0(inVar.getContext(), inVar.f34899a, eVar.f758b, eVar.f762n, new fm(inVar, i10, 1), new gm(inVar, i10, 0));
        }
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

    public static qm d0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, bg bgVar) {
        if (n2Var == null) {
            return null;
        }
        qm qmVar = new qm(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), bgVar);
        qmVar.V1 = new sm(callback, n2Var, qmVar);
        qmVar.W1 = new tm(callback, qmVar);
        qmVar.f28650f0.f0();
        qmVar.J1(1, true);
        qmVar.h1(i10);
        qmVar.f28681p2 = new hm(callback);
        qmVar.T = new um(callback, n2Var, qmVar);
        qmVar.U = new g1(17, callback, qmVar);
        qmVar.r1();
        qmVar.setFocusable(true);
        qmVar.show();
        return qmVar;
    }

    private int getAnswersMaxCount() {
        return this.f29430n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        gi giVar = this.f34900b;
        return giVar != null ? giVar.F1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override
    public final void E(yh yhVar) {
        gi giVar = this.f34900b;
        try {
            giVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f29430n) {
            giVar.T0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.f29410a0) {
            giVar.T0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            giVar.T0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        giVar.W1();
        this.f29442w.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f29437s.x0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (this.E) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.f29411a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.Z0).commit();
                } else {
                    this.Y0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Y0).commit();
                }
            }
            boolean z12 = this.W0;
            gi giVar = this.f34900b;
            lh.a4 a4Var = this.B;
            if (z12) {
                int iDp = z10 ? this.Z0 : this.Y0;
                if (this.f29417d1) {
                    iDp += AndroidUtilities.dp(120.0f);
                }
                int i11 = iDp + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f29419e1 != this.f29417d1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.A.setLayoutParams(layoutParams);
                    this.X0 = layoutParams.height;
                    a4Var.a();
                    giVar.f28674n1.requestLayout();
                    boolean z13 = this.f29419e1;
                    if (z13 != this.f29417d1) {
                        Q(z13 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.f29419e1 = this.f29417d1;
                }
            }
            if (this.U0 == i10 && this.V0 == z10) {
                return;
            }
            this.U0 = i10;
            this.V0 = z10;
            boolean z14 = this.f29411a1;
            org.telegram.ui.Cells.z5 z5Var = this.f29415c1;
            if (z5Var != null) {
                this.f29411a1 = z5Var.getEditField().isFocused() && a4Var.c() && i10 > 0;
            } else {
                this.f29411a1 = false;
            }
            if (this.f29411a1 && this.W0) {
                f0(0);
            }
            if (this.X0 != 0 && !(z11 = this.f29411a1) && z11 != z14 && !this.W0) {
                this.X0 = 0;
                a4Var.a();
                giVar.f28674n1.requestLayout();
            }
            if (this.f29411a1 && this.C) {
                this.C = false;
                AndroidUtilities.cancelRunOnUIThread(this.Q0);
            }
        }
    }

    public final void P() {
        ym ymVar = this.f29444x;
        if (ymVar != null) {
            ymVar.setDelegate(null);
            ymVar.f();
        }
        this.f29437s.setItemAnimator(this.v);
        int i10 = this.I;
        this.H[i10] = false;
        int i11 = i10 + 1;
        this.I = i11;
        int length = this.G.length;
        gn gnVar = this.f29435r;
        if (i11 == length) {
            gnVar.u(this.f29434q0);
        }
        gnVar.o(this.f29434q0);
        h0();
        this.f29422g0 = (this.f29433p0 + this.I) - 1;
        gnVar.m(this.f29436r0);
        gnVar.m(this.f29443w0);
    }

    public final void Q(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new org.telegram.ui.dg(this, f10, 2));
        valueAnimatorOfFloat.addListener(new mm(this, 0));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
        valueAnimatorOfFloat.start();
    }

    public final void R() {
        boolean z10 = (this.V || this.T) ? false : true;
        if (!z10) {
            this.P = false;
        }
        int i10 = this.f29447y0;
        if (i10 < 0) {
            return;
        }
        f2.o1 o1VarK = this.f29437s.K(i10);
        if (o1VarK == null) {
            this.f29435r.m(this.f29447y0);
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) o1VarK.f5789a;
        if (!z10) {
            x5Var.setChecked(false);
        }
        x5Var.getCheckBox().f26538a.a(!z10, true);
    }

    public final boolean S() {
        boolean zIsEmpty = TextUtils.isEmpty(Y(this.J)) && TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && this.f29425h1.f50819a.size() == 0;
        if (zIsEmpty) {
            for (int i10 = 0; i10 < this.I && (zIsEmpty = TextUtils.isEmpty(Y(this.G[i10]))); i10++) {
            }
        }
        if (!zIsEmpty) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34900b.f28635b0.getParentActivity());
            boolean z10 = this.f29430n;
            alertDialog$Builder.f22702a.N = LocaleController.getString(z10 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(z10 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            i0.a.w(R.string.Cancel, alertDialog$Builder, null);
        }
        return zIsEmpty;
    }

    public final void T() {
        int i10;
        boolean z10 = this.V;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.H;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z11 = this.f29430n;
        int i12 = z11 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z11 ? getMessagesController().todoItemLengthMax : 100;
        boolean z12 = (TextUtils.isEmpty(Y(this.K)) || this.K.length() <= this.O0) && (TextUtils.isEmpty(Y(this.L)) || this.L.length() <= 200) && !TextUtils.isEmpty(Y(this.J)) && this.J.length() <= i12;
        int i14 = 0;
        boolean z13 = false;
        for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
            if (!TextUtils.isEmpty(Y(charSequenceArr[i15]))) {
                if (charSequenceArr[i15].length() > i13) {
                    i14 = 0;
                    z13 = true;
                    break;
                } else {
                    i14++;
                    z13 = true;
                }
            }
        }
        if (i14 < 1 || (this.V && i10 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && !z13 && this.f29425h1.f50819a.size() <= 0) {
            this.f29416d0 = true;
        } else {
            this.f29416d0 = false;
        }
        boolean z14 = this.f29416d0;
        gi giVar = this.f34900b;
        giVar.setAllowNestedScroll(z14);
        this.T0 = z12;
        giVar.W1();
    }

    public final void U(org.telegram.ui.Cells.l8 l8Var, boolean z10) {
        if (this.R != 0) {
            l8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.R), z10, false);
        } else if (this.Q != 0) {
            l8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.Q / 3600, new Object[0]), z10, false);
        } else {
            l8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(ah.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.f758b;
        zg.s sVar = this.M;
        boolean zContainsKey = sVar.f50862c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) sVar.f50861b.get(eVar.f758b);
        ud.a aVar = eVar.f764s;
        ImageReceiver imageReceiver = eVar.f50818a;
        eVar.f763r.a(zContainsKey || (webPage instanceof TLRPC.TL_webPagePending), z10);
        eVar.f762n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            aVar.a(false, z10);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z10);
        }
    }

    public final void W() {
        if (this.f29417d1) {
            this.A.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.A.setLayoutParams(layoutParams);
            this.X0 = layoutParams.height;
            this.f29419e1 = this.f29417d1;
            this.f29417d1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void X(View view, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int iB;
        org.telegram.ui.ActionBar.n2 n2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        ta1 ta1Var = this.f29437s;
        f2.o1 o1VarG = ta1Var.G(z5Var);
        if (o1VarG == null || (iB = o1VarG.b()) == -1) {
            return;
        }
        int i10 = iB - this.f29433p0;
        zg.f fVar = this.f29425h1;
        boolean z11 = fVar.b(i10) != null;
        if (z10 && z11 && (n2Var = this.f34900b.f28635b0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.f34899a);
            alertDialog$Builder.f22702a.N = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ag.l0(this, view, z5Var, 26));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.setOnCancelListener(new vg(view, 1));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        fVar.h(i10);
        ta1Var.setItemAnimator(this.v);
        gn gnVar = this.f29435r;
        gnVar.u(iB);
        int i11 = i10 + 1;
        CharSequence[] charSequenceArr = this.G;
        System.arraycopy(charSequenceArr, i11, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.H;
        System.arraycopy(zArr, i11, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i12 = this.I - 1;
        this.I = i12;
        if (i12 == charSequenceArr.length - 1) {
            gnVar.o((this.f29433p0 + charSequenceArr.length) - 1);
        }
        f2.o1 o1VarK = ta1Var.K(iB - 1);
        EditTextBoldCursor textView2 = z5Var.getTextView();
        if (o1VarK != null) {
            View view2 = o1VarK.f5789a;
            if (view2 instanceof org.telegram.ui.Cells.z5) {
                ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
            } else if (textView2.isFocused()) {
                AndroidUtilities.hideKeyboard(textView2);
                Z(true);
            } else if (this.f29417d1) {
                Z(true);
            }
        } else if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            Z(true);
        } else if (this.f29417d1) {
            Z(true);
        }
        textView2.clearFocus();
        T();
        h0();
        ym ymVar = this.f29444x;
        if (ymVar != null) {
            ymVar.f();
            ymVar.setDelegate(null);
        }
        gnVar.m(this.f29436r0);
        gnVar.m(this.f29443w0);
    }

    public final void Z(boolean z10) {
        if (this.E) {
            int i10 = 0;
            if (this.W0) {
                yy yyVar = this.A;
                yyVar.L.B0();
                yyVar.E.scrollTo(0, 0);
                yyVar.H(1);
                yyVar.M.h1(0, 0);
                this.A.u(false);
                if (z10) {
                    this.A.C();
                }
                this.f29417d1 = false;
                f0(0);
            }
            if (z10) {
                yy yyVar2 = this.A;
                if (yyVar2 == null || yyVar2.getVisibility() != 0) {
                    a0();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.A.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new im(this, i10));
                this.f29413b1 = true;
                valueAnimatorOfFloat.addListener(new mm(this, 2));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void a0() {
        yy yyVar;
        mg emojiButton;
        if (!this.W0 && (yyVar = this.A) != null && yyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.f29415c1;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(kg.f30100e, false);
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
        this.f29423g1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f34900b.f28635b0;
        this.f29425h1.b(i10);
        this.f29421f1 = d0(n2Var, (i10 == -2 || i10 == -3) ? 74 : 41026, new fm(this, i10, 0), new bg(this, 26));
    }

    public final void c0() {
        org.telegram.ui.Cells.z5 z5Var = this.f29415c1;
        if (z5Var != null) {
            this.B.f15636e = true;
            EditTextBoldCursor editField = z5Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        f0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.f29411a1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.C = true;
        m.i3 i3Var = this.Q0;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 100L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i10 == NotificationCenter.emojiLoaded) {
                yy yyVar = this.A;
                if (yyVar != null) {
                    yyVar.L.f1();
                }
                org.telegram.ui.Cells.z5 z5Var = this.f29415c1;
                if (z5Var != null) {
                    int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                    this.f29415c1.getEditField().setTextColor(-1);
                    this.f29415c1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (Map.Entry entry : this.M.f50861b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f22533id)) != null) {
                entry.setValue(webPage);
            }
        }
        zg.f fVar = this.f29425h1;
        int size = fVar.f50819a.size();
        for (int i12 = 0; i12 < size; i12++) {
            zg.e eVar = (zg.e) fVar.f50819a.get(i12);
            if (eVar instanceof ah.e) {
                V((ah.e) eVar, true);
            }
        }
    }

    public final void e0(int i10, zg.e eVar) {
        int i11;
        zg.f fVar = this.f29425h1;
        if (eVar != null) {
            fVar.f50819a.put(i10, eVar);
        } else {
            fVar.f50819a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f29427j0;
        } else if (i10 == -3) {
            i11 = this.f29429l0;
        } else {
            int i12 = this.f29433p0;
            i11 = (i12 < 0 || i10 < 0 || i10 >= this.I) ? -1 : i10 + i12;
        }
        if (i11 >= 0) {
            f2.o1 o1VarK = this.f29437s.K(i11);
            if (o1VarK != null) {
                View view = o1VarK.f5789a;
                if (view instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) view).f26034e.a(eVar, true);
                } else {
                    this.f29435r.m(i11);
                }
            } else {
                this.f29435r.m(i11);
            }
        }
        if (eVar instanceof ah.e) {
            ah.e eVar2 = (ah.e) eVar;
            String str = eVar2.f758b;
            cg.u0 u0Var = new cg.u0(16, this, eVar);
            zg.s sVar = this.M;
            HashMap map = sVar.f50862c;
            HashMap map2 = sVar.f50861b;
            if (map2.containsKey(str)) {
                u0Var.run((TLRPC.WebPage) map2.get(str), null);
            } else {
                boolean zContainsKey = map.containsKey(str);
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(u0Var);
                if (!zContainsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(sVar.f50860a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new cg.u0(27, sVar, str));
                }
            }
            V(eVar2, false);
        }
        T();
    }

    public final void f0(int i10) {
        mg emojiButton;
        org.telegram.ui.Cells.z5 z5Var;
        if (this.E) {
            lh.a4 a4Var = this.B;
            gi giVar = this.f34900b;
            int i11 = 1;
            if (i10 != 1) {
                org.telegram.ui.Cells.z5 z5Var2 = this.f29415c1;
                emojiButton = z5Var2 != null ? z5Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(kg.f30100e, true);
                }
                yy yyVar = this.A;
                if (yyVar != null) {
                    this.W0 = false;
                    this.f29417d1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        yyVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.X0 = 0;
                }
                a4Var.a();
                giVar.f28674n1.requestLayout();
                return;
            }
            yy yyVar2 = this.A;
            boolean z10 = yyVar2 != null && yyVar2.getVisibility() == 0;
            yy yyVar3 = this.A;
            if (yyVar3 != null && yyVar3.Y0 != UserConfig.selectedAccount) {
                giVar.f28674n1.removeView(yyVar3);
                this.A = null;
            }
            if (this.A == null) {
                yy yyVar4 = new yy(null, true, false, false, getContext(), true, null, null, true, this.f34899a, false, false);
                this.A = yyVar4;
                yyVar4.f34983c = 3;
                yyVar4.f35035s0 = false;
                yyVar4.f35040t2 = false;
                yyVar4.setShouldDrawBackground(false);
                yy yyVar5 = this.A;
                yyVar5.Q0 = false;
                yyVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.A.setForseMultiwindowLayout(true);
                }
                this.A.setDelegate(new lm(this));
                giVar.f28674n1.addView(this.A);
                this.A.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.A.setVisibility(0);
            this.W0 = true;
            yy yyVar6 = this.A;
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
            int i12 = point.x > point.y ? this.Z0 : this.Y0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i12;
            yyVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (z5Var = this.f29415c1) != null) {
                AndroidUtilities.hideKeyboard(z5Var.getEditField());
            }
            this.X0 = i12;
            a4Var.a();
            giVar.f28674n1.requestLayout();
            org.telegram.ui.Cells.z5 z5Var3 = this.f29415c1;
            emojiButton = z5Var3 != null ? z5Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(kg.d, true);
            }
            if (z10 || this.f29411a1) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.X0, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new im(this, i11));
            valueAnimatorOfFloat.addListener(new mm(this, i11));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final boolean g() {
        return this.T0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        b70 b70VarF = b70.F(this, null, new View(getContext()));
        b70VarF.f26992s = 0;
        b70VarF.f26993t = false;
        b70VarF.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new gm(this, i10, 1), false);
        b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new gm(this, i10, 2), true);
        ol0 ol0Var = new ol0(getContext(), this.f34899a);
        b70VarF.f26987p = new org.telegram.ui.ke(ol0Var, 1);
        b70VarF.S = AndroidUtilities.dp(185.0f);
        b70VarF.Y();
        ol0Var.e(b70VarF);
        Drawable drawable = (Drawable) callbackReturn.run(ol0Var.f31355s);
        lg.d dVarC = ol0Var.f31353n.c(null, null, false);
        dVarC.n(ng.c.j(ol0Var.f31349b));
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.h.f15583e = true;
        dVarC.p(AndroidUtilities.dp(16.0f));
        ol0Var.B = dVarC;
        ol0Var.A = drawable;
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        dVarC.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        ol0Var.A.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) ol0Var.f31357x.getLayoutParams()).gravity = 1;
        ol0Var.H = true;
        ol0Var.show();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        ta1 ta1Var = this.f29437s;
        if (ta1Var.getChildCount() <= 1 || (childAt = ta1Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View viewF = ta1Var.F(childAt);
        lk0 lk0Var = (lk0) (viewF == null ? null : ta1Var.T(viewF));
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i10 = (y10 <= 0 || lk0Var == null || lk0Var.b() != 1) ? 0 : y10;
        if (y10 < 0 || lk0Var == null || lk0Var.b() != 1) {
            y10 = i10;
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        ta1 ta1Var = this.f29437s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 16, new Class[]{zm.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 48, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 4, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i15 = org.telegram.ui.ActionBar.g6.f23215m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 196608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23182k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i17 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ta1Var, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        this.f29428k0 = -1;
        this.f29429l0 = -1;
        this.m0 = -1;
        this.B0 = -1;
        this.f29445x0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.f29447y0 = -1;
        this.A0 = -1;
        this.f29448z0 = -1;
        this.C0 = -1;
        m.a aVar = this.I0;
        aVar.f17258b = -1;
        m.a aVar2 = this.J0;
        aVar2.f17258b = -1;
        this.H0 = -1;
        this.f29440u0 = -1;
        this.f29441v0 = -1;
        this.f29434q0 = -1;
        this.f29433p0 = -1;
        this.f29439t0 = -1;
        this.f29427j0 = -1;
        this.f29424h0 = 1;
        this.M0 = 3;
        this.f29426i0 = 2;
        boolean z10 = this.f29430n;
        if (!z10) {
            this.M0 = 4;
            this.f29427j0 = 3;
        }
        int i10 = this.M0;
        int i11 = i10 + 1;
        this.f29431n0 = i10;
        int i12 = i10 + 2;
        this.M0 = i12;
        this.f29432o0 = i11;
        int i13 = this.I;
        if (i13 != 0) {
            this.f29433p0 = i12;
            this.M0 = i12 + i13;
        }
        if (i13 != this.G.length) {
            int i14 = this.M0;
            this.M0 = i14 + 1;
            this.f29434q0 = i14;
        }
        int i15 = this.M0;
        this.f29436r0 = i15;
        int i16 = i15 + 2;
        this.M0 = i16;
        this.f29438s0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.M0 = i17;
            this.f29441v0 = i16;
            if (this.f29414c0) {
                this.M0 = i15 + 4;
                this.f29440u0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.rn) this.f34900b.f28635b0).f42026e;
            boolean z11 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z11) {
                this.T = true;
            } else {
                int i18 = this.M0;
                this.M0 = i18 + 1;
                this.f29445x0 = i18;
            }
            int i19 = this.M0;
            int i20 = i19 + 1;
            this.M0 = i20;
            this.B0 = i19;
            if (z11) {
                this.P = false;
            } else {
                this.M0 = i19 + 2;
                this.f29447y0 = i20;
            }
            int i21 = this.M0;
            this.f29448z0 = i21;
            this.A0 = i21 + 1;
            int i22 = i21 + 3;
            this.M0 = i22;
            this.C0 = i21 + 2;
            if (z11) {
                aVar.f17258b = i22;
                int i23 = i21 + 5;
                this.M0 = i23;
                aVar2.f17258b = i21 + 4;
                if (aVar2.f17257a) {
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
            this.f29439t0 = i26;
            if (this.V) {
                this.f29428k0 = i27;
                this.f29429l0 = i26 + 2;
                this.M0 = i26 + 4;
                this.m0 = i26 + 3;
            }
        }
        int i28 = this.M0;
        this.M0 = i28 + 1;
        this.f29443w0 = i28;
    }

    @Override
    public final boolean i() {
        if (!this.W0) {
            return !S();
        }
        Z(true);
        return true;
    }

    @Override
    public final void m() {
        this.D = true;
        gi giVar = this.f34900b;
        NotificationCenter.getInstance(giVar.F1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            yy yyVar = this.A;
            if (yyVar != null) {
                giVar.f28674n1.removeView(yyVar);
            }
        }
    }

    @Override
    public final boolean q() {
        return S();
    }

    @Override
    public final void r() {
        this.f34900b.W1();
    }

    @Override
    public final void requestLayout() {
        if (this.f29418e0) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(hn hnVar) {
        this.f29420f0 = hnVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(float f10) {
        this.f34900b.W1();
    }

    @Override
    public final void u(int i10) {
        if (i10 != 40) {
            return;
        }
        boolean z10 = this.f29430n;
        int i11 = 0;
        int i12 = 1;
        gi giVar = this.f34900b;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            CharSequence[] charSequenceArr2 = {Y(this.J)};
            int i13 = giVar.F1;
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
            boolean z11 = this.f29414c0;
            todoList.others_can_append = z11 && this.f29412b0;
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
                    todoItem.f22525id = tL_messageMediaToDo.todo.list.size() + 1;
                    tL_messageMediaToDo.todo.list.add(todoItem);
                }
            }
            y4.a0(i13, giVar.j1() + 1, giVar.n1(), new gh.i(this, (org.telegram.ui.rn) giVar.f28635b0, tL_messageMediaToDo, 8));
            return;
        }
        boolean z12 = this.V;
        ta1 ta1Var = this.f29437s;
        boolean[] zArr = this.H;
        if (z12 && !this.T0) {
            int i17 = 0;
            while (i11 < zArr.length) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i17++;
                }
                i11++;
            }
            if (i17 <= 0) {
                for (int i18 = this.f29433p0; i18 < this.f29433p0 + this.I; i18++) {
                    f2.o1 o1VarK = ta1Var.K(i18);
                    if (o1VarK != null) {
                        View view = o1VarK.f5789a;
                        if (view instanceof org.telegram.ui.Cells.z5) {
                            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                            if (z5Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                ym ymVar = this.f29444x;
                                if (ymVar != null) {
                                    ymVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                x30 x30Var = this.f29446y;
                                x30Var.setText(string);
                                x30Var.f(z5Var.getCheckBox(), true);
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
            zg.f fVar = this.f29425h1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {Y(this.J)};
                int i20 = giVar.F1;
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
                tL_poll.subscribers_only = this.I0.f17257a;
                if (this.J0.f17257a) {
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
                        tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
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
                CharSequence charSequenceY = Y(this.L);
                if (charSequenceY != null) {
                    tL_messageMediaPoll.results.solution = charSequenceY.toString();
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i20).getEntities(new CharSequence[]{charSequenceY}, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                y4.a0(i20, giVar.j1() + 1, giVar.n1(), new cg.e1(this, (org.telegram.ui.rn) giVar.f28635b0, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && fVar.b(i19) != null) {
                this.R0 = true;
                this.S0 = i19;
                ta1Var.x0(this.f29433p0 + i19);
                return;
            }
            i19++;
        }
    }

    @Override
    public final void y() {
        gn gnVar = this.f29435r;
        if (gnVar != null) {
            gnVar.l();
        }
        if (this.E) {
            Z(false);
            ym ymVar = this.f29444x;
            if (ymVar != null) {
                ymVar.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f29415c1;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.f29415c1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f29415c1.getEditField());
            }
        }
    }

    @Override
    public final void z(int i10, int i11) {
        int iDp;
        int i12;
        gi giVar = this.f34900b;
        if (giVar.f28674n1.R() > AndroidUtilities.dp(20.0f) || this.W0 || this.f29413b1 || this.f29417d1) {
            iDp = AndroidUtilities.dp(52.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i12 = (i11 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                } else {
                    i12 = (i11 / 5) * 2;
                }
            }
            iDp = i12 - AndroidUtilities.dp(13.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            giVar.setAllowNestedScroll(this.f29416d0);
        }
        int i13 = iDp + AndroidUtilities.statusBarHeight;
        this.f29418e0 = true;
        int i14 = this.N0;
        ta1 ta1Var = this.f29437s;
        if (i14 != i13 || ta1Var.getPaddingBottom() != this.f34902e) {
            this.N0 = i13;
            ta1Var.o1(0, 0, 0, this.f34902e);
            ta1Var.setItemAnimator(null);
            this.f29435r.m(0);
        }
        this.f29418e0 = false;
    }
}
