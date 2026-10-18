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
public class oi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final zh0 F;
    public final gi0 G;
    public final zh0 H;
    public long I;
    public org.telegram.ui.Components.p5 J;
    public final hi0 K;
    public final yh0 L;
    public final ki0 M;
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
    public bi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f39808a;
    public final ai0 f39809a0;
    public final org.telegram.ui.ActionBar.d6 f39810b;
    public boolean f39811b0;
    public final int f39812c;
    public float f39813c0;
    public pa0 d;
    public FrameLayout f39814d0;
    public i0.b e;
    public ci0 f39815e0;
    public Bitmap f39816f;
    public boolean f39817f0;
    public boolean f39818g0;
    public BitmapShader h;
    public boolean f39819h0;
    public final wh.f f39820i0;
    public final gh.b f39821j0;
    public final bh.b f39822k0;
    public RectF f39823l0;
    public boolean m0;
    public Paint f39824n;
    public boolean f39825n0;
    public final int[] f39826o0;
    public boolean f39827p0;
    public boolean f39828q0;
    public Matrix f39829r;
    public org.telegram.ui.Cells.u1 f39830r0;
    public boolean f39831s;
    public float f39832s0;
    public float f39833t0;
    public final Rect f39834u0;
    public boolean v;
    public ValueAnimator f39835v0;
    public boolean f39836w;
    public boolean f39837w0;
    public boolean f39838x;
    public org.telegram.ui.Cells.u1 f39839x0;
    public boolean f39840y;
    public org.telegram.ui.Components.d11 f39841y0;
    public Paint f39842z0;

    public oi0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        pa0 pa0Var;
        int i10 = UserConfig.selectedAccount;
        this.f39812c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f39826o0 = new int[2];
        this.f39828q0 = false;
        this.f39834u0 = new Rect();
        this.f39808a = context;
        this.f39810b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            pa0Var = new pa0(launchActivity, true);
        } else {
            pa0Var = null;
        }
        this.d = pa0Var;
        zh0 zh0Var = new zh0(this, context, 1);
        this.F = zh0Var;
        this.f39820i0 = wh.f.d(1, zh0Var, zh0Var);
        zh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final oi0 f42883b;

            {
                this.f42883b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42883b.onBackPressed();
                        return;
                    default:
                        this.f42883b.onBackPressed();
                        return;
                }
            }
        });
        zh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                oi0 oi0Var = oi0.this;
                if (!oi0Var.f39827p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(oi0Var.S);
                    AndroidUtilities.runOnUIThread(new uh0(oi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f39821j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f39822k0 = bVar2;
        bVar2.f4362f = new ih.j(zh0Var);
        bVar2.f4363g = zh0Var;
        gi0 gi0Var = new gi0(this, context, d6Var);
        this.G = gi0Var;
        gi0Var.setClipToPadding(false);
        zh0Var.addView(gi0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f44864a;
        r0.a0.i(zh0Var, gVar);
        hi0 hi0Var = new hi0(this, context, d6Var);
        this.K = hi0Var;
        hi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final oi0 f42883b;

            {
                this.f42883b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42883b.onBackPressed();
                        return;
                    default:
                        this.f42883b.onBackPressed();
                        return;
                }
            }
        });
        hi0Var.setOnItemClickListener(new i(this, 18));
        hi0Var.setOnScrollListener(new k3(this, 19));
        hi0Var.setItemAnimator(new li.m(null, hi0Var, d6Var));
        ki0 ki0Var = new ki0(this);
        this.M = ki0Var;
        ki0Var.O = new li0(this);
        hi0Var.setLayoutManager(ki0Var);
        hi0Var.i(new Object());
        yh0 yh0Var = new yh0(this, context, d6Var);
        this.L = yh0Var;
        hi0Var.setAdapter(yh0Var);
        hi0Var.setVerticalScrollBarEnabled(false);
        hi0Var.setOverScrollMode(2);
        gi0Var.addView(hi0Var, w7.z5.d(-2.0f, -1));
        zh0 zh0Var2 = new zh0(this, context, 0);
        this.H = zh0Var2;
        zh0Var.addView(zh0Var2, w7.z5.d(-1.0f, -1));
        this.f39809a0 = new ai0(this, zh0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f39812c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        pa0 pa0Var = this.d;
        if (pa0Var != null) {
            pa0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        ah.n0 n0Var;
        if (this.f39815e0 == null && n2Var != null) {
            int i10 = this.f39812c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f39808a);
            this.f39814d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f39814d0.setClipToPadding(false);
            this.f39814d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? cl0Var = new org.telegram.ui.Components.cl0(5, this.f39812c, getContext(), null, this.f39810b);
            this.f39815e0 = cl0Var;
            cl0Var.setClipChildren(false);
            this.f39815e0.setClipToPadding(false);
            this.f39815e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f39815e0.setDelegate(new ei0(this, n2Var));
            this.f39815e0.setTop(false);
            this.f39815e0.setClipChildren(false);
            this.f39815e0.setClipToPadding(false);
            this.f39815e0.setVisibility(0);
            this.f39815e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f39815e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f39815e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f39814d0, w7.z5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
            this.f39814d0.addView(this.f39815e0, w7.z5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            this.f39815e0.setScaleY(0.4f);
            this.f39815e0.setScaleX(0.4f);
            this.f39815e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ci0 ci0Var = this.f39815e0;
            if (ci0Var != null && !ci0Var.f25279f1) {
                ci0Var.f25279f1 = true;
                ci0Var.f25281g1 = true;
                ah.t0 t0Var = ci0Var.f25305x0;
                if (t0Var != null && (n0Var = t0Var.f879m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    w41 w41Var = n0Var.f43622h0;
                    if (w41Var != null) {
                        w41Var.invalidate();
                    }
                    m41 m41Var = n0Var.f43624i0;
                    if (m41Var != null) {
                        m41Var.invalidate();
                    }
                }
            }
            new ei.b4(this.F, false, new v3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f39812c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f39828q0) {
            return;
        }
        this.f39828q0 = true;
        bi0 bi0Var = this.X;
        if (bi0Var != null) {
            bi0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new th0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ci0 ci0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f39835v0;
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
        if (!z10 && (ci0Var = this.f39815e0) != null && this.f39817f0) {
            ci0Var.e();
            if (this.f39815e0.getReactionsWindow() != null && this.f39815e0.getReactionsWindow().f870a != null) {
                this.f39815e0.getReactionsWindow().f870a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f39815e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f39836w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f39838x = true;
        this.f39840y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39835v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f39835v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f39835v0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f39835v0.setDuration(350L);
        this.f39835v0.start();
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
        hi0 hi0Var = this.K;
        if (hi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < hi0Var.getChildCount()) {
                View childAt = hi0Var.getChildAt(i11);
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
            hi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        hi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f39831s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f39828q0) {
            return;
        }
        this.f39828q0 = true;
        wh.f.f(false);
        wh.f fVar = this.f39820i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f39828q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f39841y0 != null && this.f39842z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f39841y0.f25444c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f39842z0);
            this.f39841y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f39825n0 && this.f39815e0 != null) {
            if (this.f39823l0 != null) {
                this.f39825n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f39825n0 = true;
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
        ki0 ki0Var;
        int i10;
        hi0 hi0Var = this.K;
        if (hi0Var != null && hi0Var.getAdapter() != null && (ki0Var = this.M) != null) {
            int h = hi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            ki0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f39837w0 = z10;
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
        if (this.f39815e0 != null && (effect = MessagesController.getInstance(this.f39812c).getEffect(j10)) != null) {
            this.f39815e0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f39811b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f39811b0 = false;
            return;
        }
        ci0 ci0Var = this.f39815e0;
        if (ci0Var != null && ci0Var.getReactionsWindow() != null) {
            if (!this.f39815e0.getReactionsWindow().C) {
                this.f39815e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f39825n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        zh0 zh0Var = this.F;
        setContentView(zh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        zh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(zh0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.i80 i80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39810b;
        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        i80Var.Q(this.f39822k0, fh.c.k(d6Var), false);
        ViewGroup viewGroup = i80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.z5.d(-2.0f, -2));
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
                if (this.f39839x0 == null) {
                    this.f39839x0 = new org.telegram.ui.Cells.u1(getContext(), this.f39812c, true, null, this.f39810b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f39839x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.g3 g3Var = u1Var.S0;
                g3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23397m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23468r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23563xe = 0;
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
        hi0 hi0Var = this.K;
        hi0Var.getAdapter().l();
        int h = hi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f39826o0;
        vgVar.getLocationOnScreen(iArr);
        bi0 bi0Var = new bi0(this, getContext(), vgVar.f31263b, this.f39810b, vgVar, z10);
        this.X = bi0Var;
        bi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        bi0 bi0Var2 = this.X;
        bi0Var2.E = vgVar2.E;
        bi0Var2.f31272h0 = vgVar2.f31272h0;
        bi0Var2.f31266c0.t(vgVar2.f31266c0.f29205i, false, true);
        bi0Var2.f31267d0 = vgVar2.f31267d0;
        bi0Var2.setEmoji(vgVar2.f31269f.f29185f[0]);
        bi0Var2.i(vgVar2.f31278s, vgVar2.f31277r, true);
        bi0Var2.P.d(vgVar2.P.f26100c, true);
        bi0Var2.f31280x.d(vgVar2.f31280x.f26100c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        bi0Var2.I = i10;
        bi0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        bi0Var2.M = f7;
        bi0Var2.N = f10;
        this.X.P.d(vgVar.P.f26100c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.kk.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.d11 d11Var = null;
        if (i10 > 0) {
            d11Var = new org.telegram.ui.Components.d11(ai.md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f39841y0 = d11Var;
        if (this.f39842z0 == null) {
            Paint paint = new Paint(1);
            this.f39842z0 = paint;
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
                oi0 oi0Var = oi0.this;
                gh.b bVar = oi0Var.f39821j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = oi0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                oi0Var.f39816f = bitmap;
                Paint paint = new Paint(1);
                oi0Var.f39824n = paint;
                Bitmap bitmap3 = oi0Var.f39816f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                oi0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                oi0Var.f39829r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, oi0Var.F);
                ViewGroup viewGroup = oi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        zh0 zh0Var = this.H;
        if (zh0Var != null) {
            zh0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f39817f0) {
            return;
        }
        this.f39818g0 = false;
        this.f39817f0 = true;
        this.f39815e0.p(null, null, true);
        this.f39815e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.f39815e0.r(false);
    }

    public void m(long j10) {
    }
}
