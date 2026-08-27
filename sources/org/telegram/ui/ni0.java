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

public class ni0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public final yh0 B;
    public final fi0 C;
    public final yh0 D;
    public long E;
    public org.telegram.ui.Components.i5 F;
    public final gi0 G;
    public final xh0 H;
    public final ji0 I;
    public final ArrayList J;
    public int K;
    public final a0.h L;
    public org.telegram.ui.Cells.s1 M;
    public int N;
    public org.telegram.ui.Components.bf O;
    public final Paint P;
    public org.telegram.ui.Components.d Q;
    public org.telegram.ui.Components.od R;
    public org.telegram.ui.Components.hg S;
    public ai0 T;
    public int U;
    public ViewGroup V;
    public final zh0 W;
    public boolean X;
    public float Y;
    public FrameLayout Z;

    public final Context f40840a;

    public bi0 f40841a0;

    public final org.telegram.ui.ActionBar.c6 f40842b;

    public boolean f40843b0;

    public final int f40844c;

    public boolean f40845c0;
    public gf.t0 d;

    public boolean f40846d0;

    public i0.c f40847e;

    public final eh.j f40848e0;

    public Bitmap f40849f;

    public final og.b f40850f0;

    public final jg.a f40851g0;
    public BitmapShader h;

    public RectF f40852h0;

    public boolean f40853i0;

    public boolean f40854j0;

    public final int[] f40855k0;

    public boolean f40856l0;
    public boolean m0;

    public Paint f40857n;

    public org.telegram.ui.Cells.s1 f40858n0;

    public float f40859o0;

    public float f40860p0;

    public final Rect f40861q0;

    public Matrix f40862r;

    public ValueAnimator f40863r0;

    public boolean f40864s;

    public boolean f40865s0;

    public org.telegram.ui.Cells.s1 f40866t0;

    public org.telegram.ui.Components.pz0 f40867u0;
    public boolean v;

    public Paint f40868v0;

    public boolean f40869w;

    public boolean f40870x;

    public boolean f40871y;

    public ni0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.f40844c = i10;
        this.f40847e = i0.c.f10488e;
        this.J = new ArrayList();
        this.L = new a0.h();
        final int i11 = 1;
        this.P = new Paint(1);
        this.f40855k0 = new int[2];
        final int i12 = 0;
        this.m0 = false;
        this.f40861q0 = new Rect();
        this.f40840a = context;
        this.f40842b = c6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.d = launchActivity != null ? new gf.t0(launchActivity, true) : null;
        yh0 yh0Var = new yh0(this, context, i11);
        this.B = yh0Var;
        this.f40848e0 = eh.j.d(1, yh0Var, yh0Var);
        yh0Var.setOnClickListener(new View.OnClickListener(this) {

            public final ni0 f43463b;

            {
                this.f43463b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f43463b.onBackPressed();
                        break;
                    default:
                        this.f43463b.onBackPressed();
                        break;
                }
            }
        });
        yh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                ni0 ni0Var = this.f44119a;
                if (ni0Var.f40856l0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(ni0Var.O);
                AndroidUtilities.runOnUIThread(new th0(ni0Var, (EditText) view2, 0), 200L);
            }
        });
        og.b bVar = new og.b();
        this.f40850f0 = bVar;
        jg.a aVar = new jg.a(bVar);
        this.f40851g0 = aVar;
        aVar.d = new qg.j(yh0Var);
        aVar.f12943e = yh0Var;
        fi0 fi0Var = new fi0(this, context, c6Var);
        this.C = fi0Var;
        fi0Var.setClipToPadding(false);
        yh0Var.addView(fi0Var, h7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(yh0Var, gVar);
        gi0 gi0Var = new gi0(this, context, c6Var);
        this.G = gi0Var;
        gi0Var.setOnClickListener(new View.OnClickListener(this) {

            public final ni0 f43463b;

            {
                this.f43463b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f43463b.onBackPressed();
                        break;
                    default:
                        this.f43463b.onBackPressed();
                        break;
                }
            }
        });
        gi0Var.setOnItemClickListener(new i(this, 17));
        gi0Var.setOnScrollListener(new m3(this, 19));
        gi0Var.setItemAnimator(new ii0(null, gi0Var, c6Var));
        ji0 ji0Var = new ji0(this);
        this.I = ji0Var;
        ji0Var.O = new ki0(this);
        gi0Var.setLayoutManager(ji0Var);
        gi0Var.i(new li0());
        xh0 xh0Var = new xh0(this, context, c6Var);
        this.H = xh0Var;
        gi0Var.setAdapter(xh0Var);
        gi0Var.setVerticalScrollBarEnabled(false);
        gi0Var.setOverScrollMode(2);
        fi0Var.addView(gi0Var, h7.z5.c(-2.0f, -1));
        yh0 yh0Var2 = new yh0(this, context, i12);
        this.D = yh0Var2;
        yh0Var.addView(yh0Var2, h7.z5.c(-1.0f, -1));
        this.W = new zh0(this, yh0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f40844c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        gf.t0 t0Var = this.d;
        if (t0Var != null) {
            t0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        ig.z zVar;
        if (this.f40841a0 != null || n2Var == null) {
            return;
        }
        int i10 = this.f40844c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.f40840a);
        this.Z = frameLayout;
        frameLayout.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Z.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        bi0 bi0Var = new bi0(5, this.f40844c, getContext(), null, this.f40842b);
        this.f40841a0 = bi0Var;
        bi0Var.setClipChildren(false);
        this.f40841a0.setClipToPadding(false);
        this.f40841a0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.f40841a0.setDelegate(new di0(this, n2Var));
        this.f40841a0.setTop(false);
        this.f40841a0.setClipChildren(false);
        this.f40841a0.setClipToPadding(false);
        this.f40841a0.setVisibility(0);
        this.f40841a0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.f40841a0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.f40841a0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.C.addView(this.Z, h7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Z.addView(this.f40841a0, h7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f40841a0.setScaleY(0.4f);
        this.f40841a0.setScaleX(0.4f);
        this.f40841a0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            t();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        bi0 bi0Var2 = this.f40841a0;
        if (bi0Var2 != null && !bi0Var2.f34238b1) {
            bi0Var2.f34238b1 = true;
            bi0Var2.f34241c1 = true;
            ig.d0 d0Var = bi0Var2.f34265t0;
            if (d0Var != null && (zVar = d0Var.f11278m) != null && !zVar.G1) {
                zVar.G1 = true;
                zVar.H1 = true;
                x41 x41Var = zVar.f36392d0;
                if (x41Var != null) {
                    x41Var.invalidate();
                }
                n41 n41Var = zVar.f36395e0;
                if (n41Var != null) {
                    n41Var.invalidate();
                }
            }
        }
        new lh.a4(this.B, false, new x3(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f40844c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        ai0 ai0Var = this.T;
        if (ai0Var != null) {
            ai0Var.invalidate();
        }
        org.telegram.ui.Components.hg hgVar = this.S;
        if (hgVar != null) {
            hgVar.invalidate();
        }
        e(new sh0(this, 2), false);
        this.B.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        bi0 bi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f40863r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.V) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.n1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.V);
        }
        if (!z10 && (bi0Var = this.f40841a0) != null && this.f40843b0) {
            bi0Var.e();
            if (this.f40841a0.getReactionsWindow() != null && this.f40841a0.getReactionsWindow().f11268a != null) {
                this.f40841a0.getReactionsWindow().f11268a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f40841a0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f40869w = true;
        this.v = !z10;
        this.G.invalidate();
        this.f40870x = true;
        this.f40871y = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        this.f40863r0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(10, this, z11));
        this.f40863r0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f40863r0.setInterpolator(org.telegram.ui.Components.er.h);
        this.f40863r0.setDuration(350L);
        this.f40863r0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages groupedMessagesL = l(messageObject);
        if (groupedMessagesL == null) {
            g(messageObject);
            return;
        }
        groupedMessagesL.calculate();
        ArrayList<MessageObject> arrayList = groupedMessagesL.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            g(messageObject2);
        }
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var;
        gi0 gi0Var = this.G;
        if (gi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= gi0Var.getChildCount()) {
                s1Var = null;
                break;
            }
            View childAt = gi0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == messageObject) {
                    break;
                }
            }
            i11++;
        }
        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
        int size = -1;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                size = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (s1Var2 == null) {
            gi0Var.getAdapter().m(size);
            return;
        }
        messageObject.forceUpdate = true;
        s1Var2.W3(messageObject, s1Var2.getCurrentMessagesGroup(), s1Var2.l3(), s1Var2.m3(), s1Var2.g3(), false);
        gi0Var.getAdapter().m(size);
    }

    public final void h(boolean z10) {
        this.f40864s = z10;
        dismiss();
    }

    public final void i() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        eh.j.f(false);
        eh.j jVar = this.f40848e0;
        if (jVar != null) {
            jVar.b(this.B);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.m0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f40867u0 == null || this.f40868v0 == null) {
            return;
        }
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float fDp = AndroidUtilities.dp(28.0f) + this.f40867u0.f31697c;
        float fDp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f16 = fDp / 2.0f;
        float f17 = f14 - f16;
        float f18 = fDp2 / 2.0f;
        rectF.set(f17, f15 - f18, f14 + f16, f15 + f18);
        canvas.save();
        canvas.drawRoundRect(rectF, f18, f18, this.f40868v0);
        this.f40867u0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long k() {
        MessageObject messageObject;
        if (this.f40854j0 || this.f40841a0 == null) {
            return 0L;
        }
        if (this.f40852h0 != null) {
            this.f40854j0 = true;
            return this.E;
        }
        org.telegram.ui.Cells.s1 s1Var = this.M;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.f40854j0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.L.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void n(boolean z10) {
        ji0 ji0Var;
        int i10;
        gi0 gi0Var = this.G;
        if (gi0Var == null || gi0Var.getAdapter() == null || (ji0Var = this.I) == null) {
            return;
        }
        int iH = gi0Var.getAdapter().h();
        if (z10) {
            i10 = iH > 10 ? iH % 10 : 0;
        } else {
            i10 = iH - 1;
        }
        ji0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
        this.f40865s0 = z10;
    }

    public final void o(long j10) {
        TLRPC.TL_availableEffect effect;
        this.E = j10;
        boolean zI = this.L.i();
        ArrayList arrayList = this.J;
        int size = (zI || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f40841a0 == null || (effect = MessagesController.getInstance(this.f40844c).getEffect(j10)) == null) {
            return;
        }
        this.f40841a0.setSelectedReactionAnimated(ig.q0.e(effect));
    }

    @Override
    public final void onBackPressed() {
        if (this.X) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.X = false;
            return;
        }
        bi0 bi0Var = this.f40841a0;
        if (bi0Var == null || bi0Var.getReactionsWindow() == null) {
            this.f40854j0 = true;
            super.onBackPressed();
        } else {
            if (this.f40841a0.getReactionsWindow().C) {
                return;
            }
            this.f40841a0.getReactionsWindow().d();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        yh0 yh0Var = this.B;
        setContentView(yh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        yh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(yh0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    public final void p(org.telegram.ui.Components.b70 b70Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f40842b;
        b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        b70Var.Q(this.f40851g0, ng.c.j(c6Var), false);
        ViewGroup viewGroup = b70Var.A;
        this.V = viewGroup;
        this.C.addView(viewGroup, h7.z5.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.L;
            if (i11 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
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
                    int i12 = 0;
                    while (true) {
                        if (i12 >= groupedMessages.messages.size()) {
                            groupedMessages.messages.add(messageObject);
                            break;
                        } else if (groupedMessages.messages.get(i12).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i11++;
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            ((MessageObject.GroupedMessages) hVar.n(i13)).calculate();
        }
        ArrayList arrayList2 = this.J;
        arrayList2.addAll(arrayList);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int i15 = this.K;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i14);
            if (getContext() == null) {
                i10 = 0;
            } else {
                if (this.f40866t0 == null) {
                    this.f40866t0 = new org.telegram.ui.Cells.s1(getContext(), this.f40844c, true, null, this.f40842b);
                }
                org.telegram.ui.Cells.s1 s1Var = this.f40866t0;
                s1Var.J7 = false;
                s1Var.L7 = false;
                s1Var.M7 = false;
                s1Var.N7 = false;
                s1Var.O7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                jh.y2 y2Var = s1Var.O0;
                y2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = s1Var.f25377i9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = s1Var.B9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = s1Var.f25449n9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    s1Var.U3(messageObject2, groupedMessages2, false, false, false, false);
                    y2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    s1Var.m4();
                    i10 = s1Var.F8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    s1Var.f25523se = 0;
                    i10 = 0;
                    for (int i16 = 0; i16 < groupedMessages2.messages.size(); i16++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i16);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            s1Var.U3(messageObject3, groupedMessages2, false, false, false, false);
                            i10 += s1Var.F8;
                        }
                    }
                }
            }
            this.K = Math.max(i15, i10);
        }
        gi0 gi0Var = this.G;
        gi0Var.getAdapter().l();
        int iH = gi0Var.getAdapter().h();
        this.I.i1(iH > 10 ? iH % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.hg r(org.telegram.ui.Components.hg hgVar, boolean z10, View.OnClickListener onClickListener) {
        this.S = hgVar;
        int[] iArr = this.f40855k0;
        hgVar.getLocationOnScreen(iArr);
        ai0 ai0Var = new ai0(this, getContext(), hgVar.f28990b, this.f40842b, hgVar, z10);
        this.T = ai0Var;
        ai0Var.setScaleX(this.S.getScaleX());
        this.T.setScaleY(this.S.getScaleY());
        org.telegram.ui.Components.hg hgVar2 = this.S;
        ai0 ai0Var2 = this.T;
        ai0Var2.A = hgVar2.A;
        ai0Var2.f28994d0 = hgVar2.f28994d0;
        ai0Var2.V.q(hgVar2.V.f29243g, false, true);
        ai0Var2.W = hgVar2.W;
        ai0Var2.setEmoji(hgVar2.f28997f.f29229f[0]);
        ai0Var2.i(hgVar2.f29002s, hgVar2.f29001r, true);
        ai0Var2.L.d(hgVar2.L.f34812c, true);
        ai0Var2.f29004x.d(hgVar2.f29004x.f34812c, true);
        int i10 = hgVar2.E;
        int i11 = hgVar2.F;
        ai0Var2.E = i10;
        ai0Var2.F = i11;
        float f10 = hgVar2.I;
        float f11 = hgVar2.J;
        ai0Var2.I = f10;
        ai0Var2.J = f11;
        this.T.L.d(hgVar.L.f34812c, true);
        this.T.setOnClickListener(onClickListener);
        this.C.addView(this.T, new ViewGroup.LayoutParams(hgVar.getWidth(), hgVar.getHeight()));
        org.telegram.ui.Components.hg hgVar3 = this.S;
        hgVar.getHeight();
        this.U = hgVar3.m();
        int i12 = iArr[0];
        int width = this.S.getWidth();
        org.telegram.ui.Components.hg hgVar4 = this.S;
        hgVar.getHeight();
        iArr[0] = org.telegram.messenger.rl.C(6.0f, width - hgVar4.m(), i12);
        return this.T;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f40867u0 = j10 > 0 ? new org.telegram.ui.Components.pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.f40868v0 == null) {
            Paint paint = new Paint(1);
            this.f40868v0 = paint;
            paint.setColor(1073741824);
        }
        this.G.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 >= arrayList.size()) {
                this.H.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            eh.j.f(true);
            super.show();
            final float alpha = this.S.getAlpha();
            org.telegram.ui.Components.hg hgVar = this.S;
            if (hgVar != null) {
                hgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.ol0.d(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ni0 ni0Var = this.f43230a;
                    og.b bVar = ni0Var.f40850f0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.hg hgVar2 = ni0Var.S;
                    if (hgVar2 != null) {
                        hgVar2.setAlpha(alpha);
                    }
                    ni0Var.f40849f = bitmap;
                    Paint paint = new Paint(1);
                    ni0Var.f40857n = paint;
                    Bitmap bitmap3 = ni0Var.f40849f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    ni0Var.h = bitmapShader;
                    paint.setShader(bitmapShader);
                    ni0Var.f40862r = new Matrix();
                    bVar.a(bitmap2);
                    pg.c.c(bVar, ni0Var.B);
                    ViewGroup viewGroup = ni0Var.V;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            yh0 yh0Var = this.D;
            if (yh0Var != null) {
                yh0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t() {
        if (this.f40843b0) {
            return;
        }
        this.f40845c0 = false;
        this.f40843b0 = true;
        this.f40841a0.p(null, null, true);
        this.f40841a0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
        this.f40841a0.r(false);
    }

    public void m(long j10) {
    }
}
