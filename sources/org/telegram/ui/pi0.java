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
    public org.telegram.ui.Components.n5 I;
    public final ii0 J;
    public final zh0 K;
    public final li0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.t1 P;
    public int Q;
    public org.telegram.ui.Components.nf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.zd U;
    public org.telegram.ui.Components.tg V;
    public ci0 W;
    public int X;
    public ViewGroup Y;
    public final bi0 Z;
    public final Context f40549a;
    public boolean f40550a0;
    public final org.telegram.ui.ActionBar.g6 f40551b;
    public float f40552b0;
    public final int f40553c;
    public FrameLayout f40554c0;
    public i0.b d;
    public di0 f40555d0;
    public Bitmap e;
    public boolean f40556e0;
    public BitmapShader f40557f;
    public boolean f40558f0;
    public boolean f40559g0;
    public Paint h;
    public final wh.f f40560h0;
    public final gh.b f40561i0;
    public final bh.b f40562j0;
    public RectF f40563k0;
    public boolean f40564l0;
    public boolean m0;
    public Matrix f40565n;
    public final int[] f40566n0;
    public boolean f40567o0;
    public boolean f40568p0;
    public org.telegram.ui.Cells.t1 f40569q0;
    public boolean f40570r;
    public float f40571r0;
    public boolean f40572s;
    public float f40573s0;
    public final Rect f40574t0;
    public ValueAnimator f40575u0;
    public boolean v;
    public boolean f40576v0;
    public boolean f40577w;
    public org.telegram.ui.Cells.t1 f40578w0;
    public boolean f40579x;
    public org.telegram.ui.Components.h11 f40580x0;
    public float f40581y;
    public Paint f40582y0;

    public pi0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.f40553c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f40566n0 = new int[2];
        this.f40568p0 = false;
        this.f40574t0 = new Rect();
        this.f40549a = context;
        this.f40551b = g6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        ai0 ai0Var = new ai0(this, context, 1);
        this.E = ai0Var;
        this.f40560h0 = wh.f.d(1, ai0Var, ai0Var);
        ai0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pi0 f43611b;

            {
                this.f43611b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43611b.onBackPressed();
                        return;
                    default:
                        this.f43611b.onBackPressed();
                        return;
                }
            }
        });
        ai0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                pi0 pi0Var = pi0.this;
                if (!pi0Var.f40567o0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(pi0Var.R);
                    AndroidUtilities.runOnUIThread(new vh0(pi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f40561i0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f40562j0 = bVar2;
        bVar2.f4365f = new ih.k(ai0Var);
        bVar2.f4366g = ai0Var;
        hi0 hi0Var = new hi0(this, context, g6Var);
        this.F = hi0Var;
        hi0Var.setClipToPadding(false);
        ai0Var.addView(hi0Var, w7.z5.e(-1, -1, 119));
        f fVar = new f(this, 26);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(ai0Var, fVar);
        ii0 ii0Var = new ii0(this, context, g6Var);
        this.J = ii0Var;
        ii0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pi0 f43611b;

            {
                this.f43611b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43611b.onBackPressed();
                        return;
                    default:
                        this.f43611b.onBackPressed();
                        return;
                }
            }
        });
        ii0Var.setOnItemClickListener(new h(this, 18));
        ii0Var.setOnScrollListener(new j3(this, 19));
        ii0Var.setItemAnimator(new li.m(null, ii0Var, g6Var));
        li0 li0Var = new li0(this);
        this.L = li0Var;
        li0Var.O = new mi0(this);
        ii0Var.setLayoutManager(li0Var);
        ii0Var.i(new Object());
        zh0 zh0Var = new zh0(this, context, g6Var);
        this.K = zh0Var;
        ii0Var.setAdapter(zh0Var);
        ii0Var.setVerticalScrollBarEnabled(false);
        ii0Var.setOverScrollMode(2);
        hi0Var.addView(ii0Var, w7.z5.c(-2.0f, -1));
        ai0 ai0Var2 = new ai0(this, context, 0);
        this.G = ai0Var2;
        ai0Var.addView(ai0Var2, w7.z5.c(-1.0f, -1));
        this.Z = new bi0(this, ai0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        ah.n0 n0Var;
        if (this.f40555d0 == null && o2Var != null) {
            int i10 = this.f40553c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f40549a);
            this.f40554c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f40554c0.setClipToPadding(false);
            this.f40554c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? fl0Var = new org.telegram.ui.Components.fl0(5, this.f40553c, getContext(), null, this.f40551b);
            this.f40555d0 = fl0Var;
            fl0Var.setClipChildren(false);
            this.f40555d0.setClipToPadding(false);
            this.f40555d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f40555d0.setDelegate(new fi0(this, o2Var));
            this.f40555d0.setTop(false);
            this.f40555d0.setClipChildren(false);
            this.f40555d0.setClipToPadding(false);
            this.f40555d0.setVisibility(0);
            this.f40555d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f40555d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f40555d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.F.addView(this.f40554c0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40554c0.addView(this.f40555d0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40555d0.setScaleY(0.4f);
            this.f40555d0.setScaleX(0.4f);
            this.f40555d0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                s();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            di0 di0Var = this.f40555d0;
            if (di0Var != null && !di0Var.f26363g1) {
                di0Var.f26363g1 = true;
                di0Var.f26365h1 = true;
                ah.t0 t0Var = di0Var.f26388x0;
                if (t0Var != null && (n0Var = t0Var.f878m) != null && !n0Var.L1) {
                    n0Var.L1 = true;
                    n0Var.M1 = true;
                    x41 x41Var = n0Var.f35622h0;
                    if (x41Var != null) {
                        x41Var.invalidate();
                    }
                    n41 n41Var = n0Var.f35624i0;
                    if (n41Var != null) {
                        n41Var.invalidate();
                    }
                }
            }
            new ei.b4(this.E, false, new u3(this, 11));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        di0 di0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f40575u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.m1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        float f7 = 0.0f;
        if (!z10 && (di0Var = this.f40555d0) != null && this.f40556e0) {
            di0Var.e();
            if (this.f40555d0.getReactionsWindow() != null && this.f40555d0.getReactionsWindow().f869a != null) {
                this.f40555d0.getReactionsWindow().f869a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f40555d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.f40572s = !z10;
        this.J.invalidate();
        this.f40577w = true;
        this.f40579x = true;
        float f10 = this.f40581y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40575u0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f40575u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f40575u0.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f40575u0.setDuration(350L);
        this.f40575u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f40553c).hasAvailableEffects()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f40568p0) {
            return;
        }
        this.f40568p0 = true;
        ci0 ci0Var = this.W;
        if (ci0Var != null) {
            ci0Var.invalidate();
        }
        org.telegram.ui.Components.tg tgVar = this.V;
        if (tgVar != null) {
            tgVar.invalidate();
        }
        d(new uh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.f40553c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
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
        org.telegram.ui.Cells.t1 t1Var;
        ii0 ii0Var = this.J;
        if (ii0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ii0Var.getChildCount()) {
                View childAt = ii0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                t1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
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
        if (t1Var2 == null) {
            ii0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.W3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.l3(), t1Var2.m3(), t1Var2.g3(), false);
        ii0Var.getAdapter().m(i12);
    }

    public final void g(boolean z10) {
        this.f40570r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f40568p0) {
            return;
        }
        this.f40568p0 = true;
        wh.f.f(false);
        wh.f fVar = this.f40560h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.f40553c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f40580x0 != null && this.f40582y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f40580x0.f26843c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f40582y0);
            this.f40580x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f40568p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (!this.m0 && this.f40555d0 != null) {
            if (this.f40563k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.t1 t1Var = this.P;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
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
            this.f40576v0 = z10;
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
        if (this.f40555d0 != null && (effect = MessagesController.getInstance(this.f40553c).getEffect(j10)) != null) {
            this.f40555d0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    public final void o(org.telegram.ui.Components.h80 h80Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40551b;
        h80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        h80Var.Q(this.f40562j0, fh.c.k(g6Var), false);
        ViewGroup viewGroup = h80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f40550a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f40550a0 = false;
            return;
        }
        di0 di0Var = this.f40555d0;
        if (di0Var != null && di0Var.getReactionsWindow() != null) {
            if (!this.f40555d0.getReactionsWindow().C) {
                this.f40555d0.getReactionsWindow().d();
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
        AndroidUtilities.setLightNavigationBar(ai0Var, !org.telegram.ui.ActionBar.k6.I.q());
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
                if (this.f40578w0 == null) {
                    this.f40578w0 = new org.telegram.ui.Cells.t1(getContext(), this.f40553c, true, null, this.f40551b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f40578w0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.f3 f3Var = t1Var.S0;
                f3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f23486m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f23557r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f23652xe = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.U3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += t1Var.J8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    t1Var.U3(messageObject2, groupedMessages2, false, false, false, false);
                    f3Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.m4();
                    i11 = t1Var.J8;
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

    public final org.telegram.ui.Components.tg q(org.telegram.ui.Components.tg tgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = tgVar;
        int[] iArr = this.f40566n0;
        tgVar.getLocationOnScreen(iArr);
        ci0 ci0Var = new ci0(this, getContext(), tgVar.f30813b, this.f40551b, tgVar, z10);
        this.W = ci0Var;
        ci0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.tg tgVar2 = this.V;
        ci0 ci0Var2 = this.W;
        ci0Var2.E = tgVar2.E;
        ci0Var2.f30822h0 = tgVar2.f30822h0;
        ci0Var2.f30816c0.t(tgVar2.f30816c0.f28802i, false, true);
        ci0Var2.f30817d0 = tgVar2.f30817d0;
        ci0Var2.setEmoji(tgVar2.f30819f.f28782f[0]);
        ci0Var2.i(tgVar2.f30829s, tgVar2.f30828r, true);
        ci0Var2.P.d(tgVar2.P.f25568c, true);
        ci0Var2.f30831x.d(tgVar2.f30831x.f25568c, true);
        int i10 = tgVar2.I;
        int i11 = tgVar2.J;
        ci0Var2.I = i10;
        ci0Var2.J = i11;
        float f7 = tgVar2.M;
        float f10 = tgVar2.N;
        ci0Var2.M = f7;
        ci0Var2.N = f10;
        this.W.P.d(tgVar.P.f25568c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(tgVar.getWidth(), tgVar.getHeight()));
        org.telegram.ui.Components.tg tgVar3 = this.V;
        tgVar.getHeight();
        this.X = tgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.tg tgVar4 = this.V;
        tgVar.getHeight();
        iArr[0] = org.telegram.messenger.tl.D(6.0f, width - tgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.h11 h11Var = null;
        if (i10 > 0) {
            h11Var = new org.telegram.ui.Components.h11(ai.nd.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f40580x0 = h11Var;
        if (this.f40582y0 == null) {
            Paint paint = new Paint(1);
            this.f40582y0 = paint;
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
        if (this.f40556e0) {
            return;
        }
        this.f40558f0 = false;
        this.f40556e0 = true;
        this.f40555d0.p(null, null, true);
        this.f40555d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.zr.h).start();
        this.f40555d0.r(false);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        wh.f.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.tg tgVar = this.V;
        if (tgVar != null) {
            tgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.bn0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                pi0 pi0Var = pi0.this;
                gh.b bVar = pi0Var.f40561i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.tg tgVar2 = pi0Var.V;
                if (tgVar2 != null) {
                    tgVar2.setAlpha(alpha);
                }
                pi0Var.e = bitmap;
                Paint paint = new Paint(1);
                pi0Var.h = paint;
                Bitmap bitmap3 = pi0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                pi0Var.f40557f = bitmapShader;
                paint.setShader(bitmapShader);
                pi0Var.f40565n = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, pi0Var.E);
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
