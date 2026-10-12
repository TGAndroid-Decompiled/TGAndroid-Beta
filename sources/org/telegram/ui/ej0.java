package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class ej0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final pi0 F;
    public final wi0 G;
    public final pi0 H;
    public long I;
    public org.telegram.ui.Components.q5 J;
    public final xi0 K;
    public final oi0 L;
    public final aj0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.uf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ge V;
    public org.telegram.ui.Components.zg W;
    public ri0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f37130a;
    public final qi0 f37131a0;
    public final org.telegram.ui.ActionBar.c6 f37132b;
    public boolean f37133b0;
    public final int f37134c;
    public float f37135c0;
    public jb0 d;
    public FrameLayout f37136d0;
    public i0.b f37137e;
    public si0 f37138e0;
    public Bitmap f37139f;
    public boolean f37140f0;
    public boolean f37141g0;
    public BitmapShader h;
    public boolean f37142h0;
    public final vh.f f37143i0;
    public final fh.b f37144j0;
    public final ah.c f37145k0;
    public RectF f37146l0;
    public boolean m0;
    public Paint f37147n;
    public boolean f37148n0;
    public final int[] f37149o0;
    public boolean f37150p0;
    public boolean f37151q0;
    public Matrix f37152r;
    public org.telegram.ui.Cells.u1 f37153r0;
    public boolean f37154s;
    public float f37155s0;
    public float f37156t0;
    public final Rect f37157u0;
    public boolean v;
    public ValueAnimator f37158v0;
    public boolean f37159w;
    public boolean f37160w0;
    public boolean f37161x;
    public org.telegram.ui.Cells.u1 f37162x0;
    public boolean f37163y;
    public org.telegram.ui.Components.r11 f37164y0;
    public Paint f37165z0;

    public ej0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        jb0 jb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f37134c = i10;
        this.f37137e = i0.b.f11573e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f37149o0 = new int[2];
        this.f37151q0 = false;
        this.f37157u0 = new Rect();
        this.f37130a = context;
        this.f37132b = c6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            jb0Var = new jb0(launchActivity, true);
        } else {
            jb0Var = null;
        }
        this.d = jb0Var;
        pi0 pi0Var = new pi0(this, context, 1);
        this.F = pi0Var;
        this.f37143i0 = vh.f.d(1, pi0Var, pi0Var);
        pi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ej0 f40058b;

            {
                this.f40058b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40058b.onBackPressed();
                        return;
                    default:
                        this.f40058b.onBackPressed();
                        return;
                }
            }
        });
        pi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                ej0 ej0Var = ej0.this;
                if (!ej0Var.f37150p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(ej0Var.S);
                    AndroidUtilities.runOnUIThread(new ki0(ej0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f37144j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f37145k0 = cVar;
        cVar.f547f = new hh.j(pi0Var);
        cVar.f548g = pi0Var;
        wi0 wi0Var = new wi0(this, context, c6Var);
        this.G = wi0Var;
        wi0Var.setClipToPadding(false);
        pi0Var.addView(wi0Var, w7.w5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(pi0Var, gVar);
        xi0 xi0Var = new xi0(this, context, c6Var);
        this.K = xi0Var;
        xi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ej0 f40058b;

            {
                this.f40058b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40058b.onBackPressed();
                        return;
                    default:
                        this.f40058b.onBackPressed();
                        return;
                }
            }
        });
        xi0Var.setOnItemClickListener(new i(this, 18));
        xi0Var.setOnScrollListener(new i3(this, 19));
        xi0Var.setItemAnimator(new ji.n(null, xi0Var, c6Var));
        aj0 aj0Var = new aj0(this);
        this.M = aj0Var;
        aj0Var.O = new bj0(this);
        xi0Var.setLayoutManager(aj0Var);
        xi0Var.i(new Object());
        oi0 oi0Var = new oi0(this, context, c6Var);
        this.L = oi0Var;
        xi0Var.setAdapter(oi0Var);
        xi0Var.setVerticalScrollBarEnabled(false);
        xi0Var.setOverScrollMode(2);
        wi0Var.addView(xi0Var, w7.w5.d(-2.0f, -1));
        pi0 pi0Var2 = new pi0(this, context, 0);
        this.H = pi0Var2;
        pi0Var.addView(pi0Var2, w7.w5.d(-1.0f, -1));
        this.f37131a0 = new qi0(this, pi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f37134c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        jb0 jb0Var = this.d;
        if (jb0Var != null) {
            jb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.m2 m2Var) {
        zg.w wVar;
        if (this.f37138e0 == null && m2Var != null) {
            int i10 = this.f37134c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f37130a);
            this.f37136d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f37136d0.setClipToPadding(false);
            this.f37136d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? nl0Var = new org.telegram.ui.Components.nl0(5, this.f37134c, getContext(), null, this.f37132b);
            this.f37138e0 = nl0Var;
            nl0Var.setClipChildren(false);
            this.f37138e0.setClipToPadding(false);
            this.f37138e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f37138e0.setDelegate(new ui0(this, m2Var));
            this.f37138e0.setTop(false);
            this.f37138e0.setClipChildren(false);
            this.f37138e0.setClipToPadding(false);
            this.f37138e0.setVisibility(0);
            this.f37138e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f37138e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f37138e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f37136d0, w7.w5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
            this.f37136d0.addView(this.f37138e0, w7.w5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            this.f37138e0.setScaleY(0.4f);
            this.f37138e0.setScaleX(0.4f);
            this.f37138e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            si0 si0Var = this.f37138e0;
            if (si0Var != null && !si0Var.f28840f1) {
                si0Var.f28840f1 = true;
                si0Var.f28842g1 = true;
                zg.a0 a0Var = si0Var.f28866x0;
                if (a0Var != null && (wVar = a0Var.f54691m) != null && !wVar.K1) {
                    wVar.K1 = true;
                    wVar.L1 = true;
                    k61 k61Var = wVar.f40275h0;
                    if (k61Var != null) {
                        k61Var.invalidate();
                    }
                    a61 a61Var = wVar.f40277i0;
                    if (a61Var != null) {
                        a61Var.invalidate();
                    }
                }
            }
            new ci.h4(this.F, false, new t3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f37134c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f37151q0) {
            return;
        }
        this.f37151q0 = true;
        ri0 ri0Var = this.X;
        if (ri0Var != null) {
            ri0Var.invalidate();
        }
        org.telegram.ui.Components.zg zgVar = this.W;
        if (zgVar != null) {
            zgVar.invalidate();
        }
        e(new ji0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        si0 si0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f37158v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.m1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (si0Var = this.f37138e0) != null && this.f37140f0) {
            si0Var.e();
            if (this.f37138e0.getReactionsWindow() != null && this.f37138e0.getReactionsWindow().f54681a != null) {
                this.f37138e0.getReactionsWindow().f54681a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f37138e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f37159w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f37161x = true;
        this.f37163y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37158v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.cb(9, this, z11));
        this.f37158v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f37158v0.setInterpolator(org.telegram.ui.Components.js.h);
        this.f37158v0.setDuration(350L);
        this.f37158v0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l4 = l(messageObject);
        if (l4 != null) {
            l4.calculate();
            ArrayList<MessageObject> arrayList = l4.messages;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                g(messageObject2);
            }
            return;
        }
        g(messageObject);
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.u1 u1Var;
        xi0 xi0Var = this.K;
        if (xi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < xi0Var.getChildCount()) {
                View childAt = xi0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                u1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (u1Var2 == null) {
            xi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        xi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f37154s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f37151q0) {
            return;
        }
        this.f37151q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f37143i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f37151q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f37164y0 != null && this.f37165z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f37164y0.f29989c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f37165z0);
            this.f37164y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f37148n0 && this.f37138e0 != null) {
            if (this.f37146l0 != null) {
                this.f37148n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f37148n0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.P.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void n(boolean z10) {
        aj0 aj0Var;
        int i10;
        xi0 xi0Var = this.K;
        if (xi0Var != null && xi0Var.getAdapter() != null && (aj0Var = this.M) != null) {
            int h = xi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            aj0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f37160w0 = z10;
        }
    }

    public final void o(long j3) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.I = j3;
        boolean i11 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i11 && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        } else {
            i10 = 0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            messageObject = (MessageObject) arrayList.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f37138e0 != null && (effect = MessagesController.getInstance(this.f37134c).getEffect(j3)) != null) {
            this.f37138e0.setSelectedReactionAnimated(zg.n0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f37133b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f37133b0 = false;
            return;
        }
        si0 si0Var = this.f37138e0;
        if (si0Var != null && si0Var.getReactionsWindow() != null) {
            if (!this.f37138e0.getReactionsWindow().C) {
                this.f37138e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f37148n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pi0 pi0Var = this.F;
        setContentView(pi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        pi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(pi0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.s80 s80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37132b;
        s80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)));
        s80Var.Q(this.f37145k0, eh.b.k(c6Var), false);
        ViewGroup viewGroup = s80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.w5.d(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.i iVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            iVar = this.P;
            if (i13 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i13);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    iVar.k(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < groupedMessages.messages.size()) {
                            if (groupedMessages.messages.get(i14).getId() == messageObject.getId()) {
                                break;
                            }
                            i14++;
                        } else {
                            groupedMessages.messages.add(messageObject);
                            break;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i13++;
        }
        for (int i15 = 0; i15 < iVar.m(); i15++) {
            ((MessageObject.GroupedMessages) iVar.n(i15)).calculate();
        }
        ArrayList arrayList2 = this.N;
        arrayList2.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            int i17 = this.O;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f37162x0 == null) {
                    this.f37162x0 = new org.telegram.ui.Cells.u1(getContext(), this.f37134c, true, null, this.f37132b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f37162x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.m4 m4Var = u1Var.S0;
                m4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23058m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23129r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23223xe = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            u1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += u1Var.J8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    u1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    m4Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    u1Var.n4();
                    i11 = u1Var.J8;
                }
            }
            this.O = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        xi0 xi0Var = this.K;
        xi0Var.getAdapter().l();
        int h = xi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.zg r(org.telegram.ui.Components.zg zgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = zgVar;
        int[] iArr = this.f37149o0;
        zgVar.getLocationOnScreen(iArr);
        ri0 ri0Var = new ri0(this, getContext(), zgVar.f33362b, this.f37132b, zgVar, z10);
        this.X = ri0Var;
        ri0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.zg zgVar2 = this.W;
        ri0 ri0Var2 = this.X;
        ri0Var2.E = zgVar2.E;
        ri0Var2.f33372h0 = zgVar2.f33372h0;
        ri0Var2.f33365c0.t(zgVar2.f33365c0.f29696i, false, true);
        ri0Var2.f33366d0 = zgVar2.f33366d0;
        ri0Var2.setEmoji(zgVar2.f33369f.f29669f[0]);
        ri0Var2.i(zgVar2.f33378s, zgVar2.f33377r, true);
        ri0Var2.P.d(zgVar2.P.f26301c, true);
        ri0Var2.f33380x.d(zgVar2.f33380x.f26301c, true);
        int i10 = zgVar2.I;
        int i11 = zgVar2.J;
        ri0Var2.I = i10;
        ri0Var2.J = i11;
        float f7 = zgVar2.M;
        float f10 = zgVar2.N;
        ri0Var2.M = f7;
        ri0Var2.N = f10;
        this.X.P.d(zgVar.P.f26301c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(zgVar.getWidth(), zgVar.getHeight()));
        org.telegram.ui.Components.zg zgVar3 = this.W;
        zgVar.getHeight();
        this.Y = zgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.zg zgVar4 = this.W;
        zgVar.getHeight();
        iArr[0] = org.telegram.messenger.am.D(6.0f, width - zgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.r11 r11Var = null;
        if (i10 > 0) {
            r11Var = new org.telegram.ui.Components.r11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f37164y0 = r11Var;
        if (this.f37165z0 == null) {
            Paint paint = new Paint(1);
            this.f37165z0 = paint;
            paint.setColor(1073741824);
        }
        this.K.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i11++;
            } else {
                this.L.l();
                return;
            }
        }
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        vh.f.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.zg zgVar = this.W;
        if (zgVar != null) {
            zgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.mn0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ej0 ej0Var = ej0.this;
                fh.b bVar = ej0Var.f37144j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.zg zgVar2 = ej0Var.W;
                if (zgVar2 != null) {
                    zgVar2.setAlpha(alpha);
                }
                ej0Var.f37139f = bitmap;
                Paint paint = new Paint(1);
                ej0Var.f37147n = paint;
                Bitmap bitmap3 = ej0Var.f37139f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                ej0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ej0Var.f37152r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, ej0Var.F);
                ViewGroup viewGroup = ej0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        pi0 pi0Var = this.H;
        if (pi0Var != null) {
            pi0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f37140f0) {
            return;
        }
        this.f37141g0 = false;
        this.f37140f0 = true;
        this.f37138e0.p(null, null, true);
        this.f37138e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.js.h).start();
        this.f37138e0.r(false);
    }

    public void m(long j3) {
    }
}
