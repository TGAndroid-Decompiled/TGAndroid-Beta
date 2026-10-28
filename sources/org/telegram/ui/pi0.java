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
public class pi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public final ai0 E;
    public final hi0 F;
    public final ai0 G;
    public long H;
    public org.telegram.ui.Components.r5 I;
    public final ii0 J;
    public final zh0 K;
    public final li0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.s1 P;
    public int Q;
    public org.telegram.ui.Components.pf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.ce U;
    public org.telegram.ui.Components.vg V;
    public ci0 W;
    public int X;
    public ViewGroup Y;
    public final bi0 Z;
    public final Context f42407a;
    public boolean f42408a0;
    public final org.telegram.ui.ActionBar.u6 f42409b;
    public float f42410b0;
    public final int f42411c;
    public FrameLayout f42412c0;
    public i0.b d;
    public di0 f42413d0;
    public Bitmap e;
    public boolean f42414e0;
    public BitmapShader f42415f;
    public boolean f42416f0;
    public boolean f42417g0;
    public Paint h;
    public final xh.f f42418h0;
    public final hh.b f42419i0;
    public final ch.b f42420j0;
    public RectF f42421k0;
    public boolean f42422l0;
    public boolean m0;
    public Matrix f42423n;
    public final int[] f42424n0;
    public boolean f42425o0;
    public boolean f42426p0;
    public org.telegram.ui.Cells.s1 f42427q0;
    public boolean f42428r;
    public float f42429r0;
    public boolean f42430s;
    public float f42431s0;
    public final Rect f42432t0;
    public ValueAnimator f42433u0;
    public boolean v;
    public boolean f42434v0;
    public boolean f42435w;
    public org.telegram.ui.Cells.s1 f42436w0;
    public boolean f42437x;
    public org.telegram.ui.Components.r11 f42438x0;
    public float f42439y;
    public Paint f42440y0;

    public pi0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.f42411c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f42424n0 = new int[2];
        this.f42426p0 = false;
        this.f42432t0 = new Rect();
        this.f42407a = context;
        this.f42409b = u6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        ai0 ai0Var = new ai0(this, context, 1);
        this.E = ai0Var;
        this.f42418h0 = xh.f.d(1, ai0Var, ai0Var);
        ai0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pi0 f45690b;

            {
                this.f45690b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45690b.onBackPressed();
                        return;
                    default:
                        this.f45690b.onBackPressed();
                        return;
                }
            }
        });
        ai0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                pi0 pi0Var = pi0.this;
                if (!pi0Var.f42425o0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(pi0Var.R);
                    AndroidUtilities.runOnUIThread(new vh0(pi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        hh.b bVar = new hh.b();
        this.f42419i0 = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.f42420j0 = bVar2;
        bVar2.f6301f = new jh.k(ai0Var);
        bVar2.f6302g = ai0Var;
        hi0 hi0Var = new hi0(this, context, u6Var);
        this.F = hi0Var;
        hi0Var.setClipToPadding(false);
        ai0Var.addView(hi0Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        f fVar = new f(this, 26);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(ai0Var, fVar);
        ii0 ii0Var = new ii0(this, context, u6Var);
        this.J = ii0Var;
        ii0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pi0 f45690b;

            {
                this.f45690b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45690b.onBackPressed();
                        return;
                    default:
                        this.f45690b.onBackPressed();
                        return;
                }
            }
        });
        ii0Var.setOnItemClickListener(new h(this, 18));
        ii0Var.setOnScrollListener(new i3(this, 20));
        ii0Var.setItemAnimator(new mi.m(null, ii0Var, u6Var));
        li0 li0Var = new li0(this);
        this.L = li0Var;
        li0Var.O = new mi0(this);
        ii0Var.setLayoutManager(li0Var);
        ii0Var.i(new Object());
        zh0 zh0Var = new zh0(this, context, u6Var);
        this.K = zh0Var;
        ii0Var.setAdapter(zh0Var);
        ii0Var.setVerticalScrollBarEnabled(false);
        ii0Var.setOverScrollMode(2);
        hi0Var.addView(ii0Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        ai0 ai0Var2 = new ai0(this, context, 0);
        this.G = ai0Var2;
        ai0Var.addView(ai0Var2, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.Z = new bi0(this, ai0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        bh.d0 d0Var;
        if (this.f42413d0 == null && r2Var != null) {
            int i10 = this.f42411c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f42407a);
            this.f42412c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f42412c0.setClipToPadding(false);
            this.f42412c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? gl0Var = new org.telegram.ui.Components.gl0(5, this.f42411c, getContext(), null, this.f42409b);
            this.f42413d0 = gl0Var;
            gl0Var.setClipChildren(false);
            this.f42413d0.setClipToPadding(false);
            this.f42413d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f42413d0.setDelegate(new fi0(this, r2Var));
            this.f42413d0.setTop(false);
            this.f42413d0.setClipChildren(false);
            this.f42413d0.setClipToPadding(false);
            this.f42413d0.setVisibility(0);
            this.f42413d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f42413d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f42413d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.F.addView(this.f42412c0, org.telegram.ui.Components.kb1.h(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f42412c0.addView(this.f42413d0, org.telegram.ui.Components.kb1.h(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f42413d0.setScaleY(0.4f);
            this.f42413d0.setScaleX(0.4f);
            this.f42413d0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                s();
            } else {
                NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            di0 di0Var = this.f42413d0;
            if (di0Var != null && !di0Var.f28623g1) {
                di0Var.f28623g1 = true;
                di0Var.f28625h1 = true;
                bh.i0 i0Var = di0Var.f28648x0;
                if (i0Var != null && (d0Var = i0Var.f4056m) != null && !d0Var.L1) {
                    d0Var.L1 = true;
                    d0Var.M1 = true;
                    c51 c51Var = d0Var.f39202h0;
                    if (c51Var != null) {
                        c51Var.invalidate();
                    }
                    s41 s41Var = d0Var.f39204i0;
                    if (s41Var != null) {
                        s41Var.invalidate();
                    }
                }
            }
            new fi.z3(this.E, false, new t3(this, 11));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        di0 di0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f42433u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        float f7 = 0.0f;
        if (!z10 && (di0Var = this.f42413d0) != null && this.f42414e0) {
            di0Var.e();
            if (this.f42413d0.getReactionsWindow() != null && this.f42413d0.getReactionsWindow().f4047a != null) {
                this.f42413d0.getReactionsWindow().f4047a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f42413d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.f42430s = !z10;
        this.J.invalidate();
        this.f42435w = true;
        this.f42437x = true;
        float f10 = this.f42439y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42433u0 = ofFloat;
        ofFloat.addUpdateListener(new bh.a0(10, this, z11));
        this.f42433u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f42433u0.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f42433u0.setDuration(350L);
        this.f42433u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f42411c).hasAvailableEffects()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f42426p0) {
            return;
        }
        this.f42426p0 = true;
        ci0 ci0Var = this.W;
        if (ci0Var != null) {
            ci0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        d(new uh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.f42411c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void e(MessageObject messageObject) {
        MessageObject.GroupedMessages k10 = k(messageObject);
        if (k10 != null) {
            k10.calculate();
            ArrayList<MessageObject> arrayList = k10.messages;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                f(messageObject2);
            }
            return;
        }
        f(messageObject);
    }

    public final void f(MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var;
        ii0 ii0Var = this.J;
        if (ii0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ii0Var.getChildCount()) {
                View childAt = ii0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                s1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (s1Var2 == null) {
            ii0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        s1Var2.Z3(messageObject, s1Var2.getCurrentMessagesGroup(), s1Var2.m3(), s1Var2.n3(), s1Var2.h3(), false);
        ii0Var.getAdapter().m(i12);
    }

    public final void g(boolean z10) {
        this.f42428r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f42426p0) {
            return;
        }
        this.f42426p0 = true;
        xh.f.f(false);
        xh.f fVar = this.f42418h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.f42411c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f42438x0 != null && this.f42440y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f42438x0.f32090c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f42440y0);
            this.f42438x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f42426p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (!this.m0 && this.f42413d0 != null) {
            if (this.f42421k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.s1 s1Var = this.P;
            if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.m0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final MessageObject.GroupedMessages k(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.O.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void m(boolean z10) {
        li0 li0Var;
        int i10;
        ii0 ii0Var = this.J;
        if (ii0Var != null && ii0Var.getAdapter() != null && (li0Var = this.L) != null) {
            int h = ii0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            li0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f42434v0 = z10;
        }
    }

    public final void n(long j10) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.H = j10;
        boolean i11 = this.O.i();
        ArrayList arrayList = this.M;
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
        if (this.f42413d0 != null && (effect = MessagesController.getInstance(this.f42411c).getEffect(j10)) != null) {
            this.f42413d0.setSelectedReactionAnimated(bh.x0.e(effect));
        }
    }

    public final void o(org.telegram.ui.Components.l80 l80Var) {
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f42409b;
        l80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        l80Var.Q(this.f42420j0, gh.c.k(u6Var), false);
        ViewGroup viewGroup = l80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, org.telegram.ui.Components.kb1.g(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f42408a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f42408a0 = false;
            return;
        }
        di0 di0Var = this.f42413d0;
        if (di0Var != null && di0Var.getReactionsWindow() != null) {
            if (!this.f42413d0.getReactionsWindow().C) {
                this.f42413d0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.m0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ai0 ai0Var = this.E;
        setContentView(ai0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ai0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ai0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
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
        ArrayList arrayList2 = this.M;
        arrayList2.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            int i17 = this.N;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f42436w0 == null) {
                    this.f42436w0 = new org.telegram.ui.Cells.s1(getContext(), this.f42411c, true, null, this.f42409b);
                }
                org.telegram.ui.Cells.s1 s1Var = this.f42436w0;
                s1Var.N7 = false;
                s1Var.P7 = false;
                s1Var.Q7 = false;
                s1Var.R7 = false;
                s1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                di.f3 f3Var = s1Var.S0;
                f3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = s1Var.f25193m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = s1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = s1Var.f25264r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    s1Var.f25374ye = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            s1Var.X3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += s1Var.J8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    s1Var.X3(messageObject2, groupedMessages2, false, false, false, false);
                    f3Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    s1Var.p4();
                    i11 = s1Var.J8;
                }
            }
            this.N = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        ii0 ii0Var = this.J;
        ii0Var.getAdapter().l();
        int h = ii0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.L.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg q(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = vgVar;
        int[] iArr = this.f42424n0;
        vgVar.getLocationOnScreen(iArr);
        ci0 ci0Var = new ci0(this, getContext(), vgVar.f33718b, this.f42409b, vgVar, z10);
        this.W = ci0Var;
        ci0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.V;
        ci0 ci0Var2 = this.W;
        ci0Var2.E = vgVar2.E;
        ci0Var2.f33727h0 = vgVar2.f33727h0;
        ci0Var2.f33721c0.t(vgVar2.f33721c0.f32147i, false, true);
        ci0Var2.f33722d0 = vgVar2.f33722d0;
        ci0Var2.setEmoji(vgVar2.f33724f.f32123f[0]);
        ci0Var2.i(vgVar2.f33734s, vgVar2.f33733r, true);
        ci0Var2.P.d(vgVar2.P.f28864c, true);
        ci0Var2.f33736x.d(vgVar2.f33736x.f28864c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        ci0Var2.I = i10;
        ci0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        ci0Var2.M = f7;
        ci0Var2.N = f10;
        this.W.P.d(vgVar.P.f28864c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.V;
        vgVar.getHeight();
        this.X = vgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.V;
        vgVar.getHeight();
        iArr[0] = d3.w(6.0f, width - vgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.r11 r11Var = null;
        if (i10 > 0) {
            r11Var = new org.telegram.ui.Components.r11(bi.dd.W0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f42438x0 = r11Var;
        if (this.f42440y0 == null) {
            Paint paint = new Paint(1);
            this.f42440y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.M;
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
                this.K.l();
                return;
            }
        }
    }

    public final void s() {
        if (this.f42414e0) {
            return;
        }
        this.f42416f0 = false;
        this.f42414e0 = true;
        this.f42413d0.p(null, null, true);
        this.f42413d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
        this.f42413d0.r(false);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        xh.f.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.in0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                pi0 pi0Var = pi0.this;
                hh.b bVar = pi0Var.f42419i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = pi0Var.V;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                pi0Var.e = bitmap;
                Paint paint = new Paint(1);
                pi0Var.h = paint;
                Bitmap bitmap3 = pi0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                pi0Var.f42415f = bitmapShader;
                paint.setShader(bitmapShader);
                pi0Var.f42423n = new Matrix();
                bVar.a(bitmap2);
                ih.d.c(bVar, pi0Var.E);
                ViewGroup viewGroup = pi0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ai0 ai0Var = this.G;
        if (ai0Var != null) {
            ai0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}
