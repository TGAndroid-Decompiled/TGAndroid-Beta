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
public class li0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final wh0 F;
    public final di0 G;
    public final wh0 H;
    public long I;
    public org.telegram.ui.Components.p5 J;
    public final ei0 K;
    public final vh0 L;
    public final hi0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.pf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.be V;
    public org.telegram.ui.Components.vg W;
    public yh0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f38930a;
    public final xh0 f38931a0;
    public final org.telegram.ui.ActionBar.d6 f38932b;
    public boolean f38933b0;
    public final int f38934c;
    public float f38935c0;
    public na0 d;
    public FrameLayout f38936d0;
    public i0.b e;
    public zh0 f38937e0;
    public Bitmap f38938f;
    public boolean f38939f0;
    public boolean f38940g0;
    public BitmapShader h;
    public boolean f38941h0;
    public final wh.f f38942i0;
    public final gh.b f38943j0;
    public final bh.b f38944k0;
    public RectF f38945l0;
    public boolean m0;
    public Paint f38946n;
    public boolean f38947n0;
    public final int[] f38948o0;
    public boolean f38949p0;
    public boolean f38950q0;
    public Matrix f38951r;
    public org.telegram.ui.Cells.u1 f38952r0;
    public boolean f38953s;
    public float f38954s0;
    public float f38955t0;
    public final Rect f38956u0;
    public boolean v;
    public ValueAnimator f38957v0;
    public boolean f38958w;
    public boolean f38959w0;
    public boolean f38960x;
    public org.telegram.ui.Cells.u1 f38961x0;
    public boolean f38962y;
    public org.telegram.ui.Components.e11 f38963y0;
    public Paint f38964z0;

    public li0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        na0 na0Var;
        int i10 = UserConfig.selectedAccount;
        this.f38934c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f38948o0 = new int[2];
        this.f38950q0 = false;
        this.f38956u0 = new Rect();
        this.f38930a = context;
        this.f38932b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            na0Var = new na0(launchActivity, true);
        } else {
            na0Var = null;
        }
        this.d = na0Var;
        wh0 wh0Var = new wh0(this, context, 1);
        this.F = wh0Var;
        this.f38942i0 = wh.f.d(1, wh0Var, wh0Var);
        wh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final li0 f41678b;

            {
                this.f41678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41678b.onBackPressed();
                        return;
                    default:
                        this.f41678b.onBackPressed();
                        return;
                }
            }
        });
        wh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                li0 li0Var = li0.this;
                if (!li0Var.f38949p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(li0Var.S);
                    AndroidUtilities.runOnUIThread(new rh0(li0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f38943j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f38944k0 = bVar2;
        bVar2.f4360f = new ih.j(wh0Var);
        bVar2.f4361g = wh0Var;
        di0 di0Var = new di0(this, context, d6Var);
        this.G = di0Var;
        di0Var.setClipToPadding(false);
        wh0Var.addView(di0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f44816a;
        r0.a0.i(wh0Var, gVar);
        ei0 ei0Var = new ei0(this, context, d6Var);
        this.K = ei0Var;
        ei0Var.setOnClickListener(new View.OnClickListener(this) {
            public final li0 f41678b;

            {
                this.f41678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41678b.onBackPressed();
                        return;
                    default:
                        this.f41678b.onBackPressed();
                        return;
                }
            }
        });
        ei0Var.setOnItemClickListener(new i(this, 18));
        ei0Var.setOnScrollListener(new k3(this, 19));
        ei0Var.setItemAnimator(new li.m(null, ei0Var, d6Var));
        hi0 hi0Var = new hi0(this);
        this.M = hi0Var;
        hi0Var.O = new ii0(this);
        ei0Var.setLayoutManager(hi0Var);
        ei0Var.i(new Object());
        vh0 vh0Var = new vh0(this, context, d6Var);
        this.L = vh0Var;
        ei0Var.setAdapter(vh0Var);
        ei0Var.setVerticalScrollBarEnabled(false);
        ei0Var.setOverScrollMode(2);
        di0Var.addView(ei0Var, w7.z5.c(-2.0f, -1));
        wh0 wh0Var2 = new wh0(this, context, 0);
        this.H = wh0Var2;
        wh0Var.addView(wh0Var2, w7.z5.c(-1.0f, -1));
        this.f38931a0 = new xh0(this, wh0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f38934c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        na0 na0Var = this.d;
        if (na0Var != null) {
            na0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        ah.n0 n0Var;
        if (this.f38937e0 == null && n2Var != null) {
            int i10 = this.f38934c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f38930a);
            this.f38936d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38936d0.setClipToPadding(false);
            this.f38936d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? cl0Var = new org.telegram.ui.Components.cl0(5, this.f38934c, getContext(), null, this.f38932b);
            this.f38937e0 = cl0Var;
            cl0Var.setClipChildren(false);
            this.f38937e0.setClipToPadding(false);
            this.f38937e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f38937e0.setDelegate(new bi0(this, n2Var));
            this.f38937e0.setTop(false);
            this.f38937e0.setClipChildren(false);
            this.f38937e0.setClipToPadding(false);
            this.f38937e0.setVisibility(0);
            this.f38937e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f38937e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f38937e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f38936d0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38936d0.addView(this.f38937e0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38937e0.setScaleY(0.4f);
            this.f38937e0.setScaleX(0.4f);
            this.f38937e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            zh0 zh0Var = this.f38937e0;
            if (zh0Var != null && !zh0Var.f25250f1) {
                zh0Var.f25250f1 = true;
                zh0Var.f25252g1 = true;
                ah.t0 t0Var = zh0Var.f25276x0;
                if (t0Var != null && (n0Var = t0Var.f877m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    u41 u41Var = n0Var.f43056h0;
                    if (u41Var != null) {
                        u41Var.invalidate();
                    }
                    k41 k41Var = n0Var.f43058i0;
                    if (k41Var != null) {
                        k41Var.invalidate();
                    }
                }
            }
            new ei.b4(this.F, false, new v3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f38934c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38950q0) {
            return;
        }
        this.f38950q0 = true;
        yh0 yh0Var = this.X;
        if (yh0Var != null) {
            yh0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new qh0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        zh0 zh0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38957v0;
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
        if (!z10 && (zh0Var = this.f38937e0) != null && this.f38939f0) {
            zh0Var.e();
            if (this.f38937e0.getReactionsWindow() != null && this.f38937e0.getReactionsWindow().f868a != null) {
                this.f38937e0.getReactionsWindow().f868a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38937e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38958w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f38960x = true;
        this.f38962y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38957v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f38957v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f38957v0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f38957v0.setDuration(350L);
        this.f38957v0.start();
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
        ei0 ei0Var = this.K;
        if (ei0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ei0Var.getChildCount()) {
                View childAt = ei0Var.getChildAt(i11);
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
            ei0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        ei0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f38953s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f38950q0) {
            return;
        }
        this.f38950q0 = true;
        wh.f.f(false);
        wh.f fVar = this.f38942i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f38950q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f38963y0 != null && this.f38964z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f38963y0.f25730c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f38964z0);
            this.f38963y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f38947n0 && this.f38937e0 != null) {
            if (this.f38945l0 != null) {
                this.f38947n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f38947n0 = true;
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
        hi0 hi0Var;
        int i10;
        ei0 ei0Var = this.K;
        if (ei0Var != null && ei0Var.getAdapter() != null && (hi0Var = this.M) != null) {
            int h = ei0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            hi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f38959w0 = z10;
        }
    }

    public final void o(long j10) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.I = j10;
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
            message.effect = j10;
        }
        if (this.f38937e0 != null && (effect = MessagesController.getInstance(this.f38934c).getEffect(j10)) != null) {
            this.f38937e0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f38933b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f38933b0 = false;
            return;
        }
        zh0 zh0Var = this.f38937e0;
        if (zh0Var != null && zh0Var.getReactionsWindow() != null) {
            if (!this.f38937e0.getReactionsWindow().C) {
                this.f38937e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f38947n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wh0 wh0Var = this.F;
        setContentView(wh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        wh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(wh0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.i80 i80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38932b;
        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        i80Var.Q(this.f38944k0, fh.c.k(d6Var), false);
        ViewGroup viewGroup = i80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i13 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i13);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    hVar.k(groupedMessages, groupId);
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
        for (int i15 = 0; i15 < hVar.m(); i15++) {
            ((MessageObject.GroupedMessages) hVar.n(i15)).calculate();
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
                if (this.f38961x0 == null) {
                    this.f38961x0 = new org.telegram.ui.Cells.u1(getContext(), this.f38934c, true, null, this.f38932b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f38961x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.g3 g3Var = u1Var.S0;
                g3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23393m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23464r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23559xe = 0;
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
                    g3Var.setIgnoreImageSet(false);
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
        ei0 ei0Var = this.K;
        ei0Var.getAdapter().l();
        int h = ei0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f38948o0;
        vgVar.getLocationOnScreen(iArr);
        yh0 yh0Var = new yh0(this, getContext(), vgVar.f31267b, this.f38932b, vgVar, z10);
        this.X = yh0Var;
        yh0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        yh0 yh0Var2 = this.X;
        yh0Var2.E = vgVar2.E;
        yh0Var2.f31276h0 = vgVar2.f31276h0;
        yh0Var2.f31270c0.t(vgVar2.f31270c0.f29187i, false, true);
        yh0Var2.f31271d0 = vgVar2.f31271d0;
        yh0Var2.setEmoji(vgVar2.f31273f.f29167f[0]);
        yh0Var2.i(vgVar2.f31282s, vgVar2.f31281r, true);
        yh0Var2.P.d(vgVar2.P.f26110c, true);
        yh0Var2.f31284x.d(vgVar2.f31284x.f26110c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        yh0Var2.I = i10;
        yh0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        yh0Var2.M = f7;
        yh0Var2.N = f10;
        this.X.P.d(vgVar.P.f26110c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.lk.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.e11 e11Var = null;
        if (i10 > 0) {
            e11Var = new org.telegram.ui.Components.e11(ai.md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f38963y0 = e11Var;
        if (this.f38964z0 == null) {
            Paint paint = new Paint(1);
            this.f38964z0 = paint;
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
        wh.f.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.ym0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                li0 li0Var = li0.this;
                gh.b bVar = li0Var.f38943j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = li0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                li0Var.f38938f = bitmap;
                Paint paint = new Paint(1);
                li0Var.f38946n = paint;
                Bitmap bitmap3 = li0Var.f38938f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                li0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                li0Var.f38951r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, li0Var.F);
                ViewGroup viewGroup = li0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        wh0 wh0Var = this.H;
        if (wh0Var != null) {
            wh0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f38939f0) {
            return;
        }
        this.f38940g0 = false;
        this.f38939f0 = true;
        this.f38937e0.p(null, null, true);
        this.f38937e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.f38937e0.r(false);
    }

    public void m(long j10) {
    }
}
