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
public class qi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public final bi0 E;
    public final ii0 F;
    public final bi0 G;
    public long H;
    public org.telegram.ui.Components.p5 I;
    public final ji0 J;
    public final ai0 K;
    public final mi0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.t1 P;
    public int Q;
    public org.telegram.ui.Components.pf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.be U;
    public org.telegram.ui.Components.vg V;
    public di0 W;
    public int X;
    public ViewGroup Y;
    public final ci0 Z;
    public final Context f40818a;
    public boolean f40819a0;
    public final org.telegram.ui.ActionBar.g6 f40820b;
    public float f40821b0;
    public final int f40822c;
    public FrameLayout f40823c0;
    public i0.b d;
    public ei0 f40824d0;
    public Bitmap e;
    public boolean f40825e0;
    public BitmapShader f40826f;
    public boolean f40827f0;
    public boolean f40828g0;
    public Paint h;
    public final wh.f f40829h0;
    public final gh.b f40830i0;
    public final bh.b f40831j0;
    public RectF f40832k0;
    public boolean f40833l0;
    public boolean m0;
    public Matrix f40834n;
    public final int[] f40835n0;
    public boolean f40836o0;
    public boolean f40837p0;
    public org.telegram.ui.Cells.t1 f40838q0;
    public boolean f40839r;
    public float f40840r0;
    public boolean f40841s;
    public float f40842s0;
    public final Rect f40843t0;
    public ValueAnimator f40844u0;
    public boolean v;
    public boolean f40845v0;
    public boolean f40846w;
    public org.telegram.ui.Cells.t1 f40847w0;
    public boolean f40848x;
    public org.telegram.ui.Components.i11 f40849x0;
    public float f40850y;
    public Paint f40851y0;

    public qi0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.f40822c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f40835n0 = new int[2];
        this.f40837p0 = false;
        this.f40843t0 = new Rect();
        this.f40818a = context;
        this.f40820b = g6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        bi0 bi0Var = new bi0(this, context, 1);
        this.E = bi0Var;
        this.f40829h0 = wh.f.d(1, bi0Var, bi0Var);
        bi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final qi0 f43869b;

            {
                this.f43869b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43869b.onBackPressed();
                        return;
                    default:
                        this.f43869b.onBackPressed();
                        return;
                }
            }
        });
        bi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                qi0 qi0Var = qi0.this;
                if (!qi0Var.f40836o0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(qi0Var.R);
                    AndroidUtilities.runOnUIThread(new wh0(qi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f40830i0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f40831j0 = bVar2;
        bVar2.f4365f = new ih.k(bi0Var);
        bVar2.f4366g = bi0Var;
        ii0 ii0Var = new ii0(this, context, g6Var);
        this.F = ii0Var;
        ii0Var.setClipToPadding(false);
        bi0Var.addView(ii0Var, w7.z5.e(-1, -1, 119));
        f fVar = new f(this, 26);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(bi0Var, fVar);
        ji0 ji0Var = new ji0(this, context, g6Var);
        this.J = ji0Var;
        ji0Var.setOnClickListener(new View.OnClickListener(this) {
            public final qi0 f43869b;

            {
                this.f43869b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43869b.onBackPressed();
                        return;
                    default:
                        this.f43869b.onBackPressed();
                        return;
                }
            }
        });
        ji0Var.setOnItemClickListener(new h(this, 18));
        ji0Var.setOnScrollListener(new j3(this, 19));
        ji0Var.setItemAnimator(new li.m(null, ji0Var, g6Var));
        mi0 mi0Var = new mi0(this);
        this.L = mi0Var;
        mi0Var.O = new ni0(this);
        ji0Var.setLayoutManager(mi0Var);
        ji0Var.i(new Object());
        ai0 ai0Var = new ai0(this, context, g6Var);
        this.K = ai0Var;
        ji0Var.setAdapter(ai0Var);
        ji0Var.setVerticalScrollBarEnabled(false);
        ji0Var.setOverScrollMode(2);
        ii0Var.addView(ji0Var, w7.z5.c(-2.0f, -1));
        bi0 bi0Var2 = new bi0(this, context, 0);
        this.G = bi0Var2;
        bi0Var.addView(bi0Var2, w7.z5.c(-1.0f, -1));
        this.Z = new ci0(this, bi0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        ah.n0 n0Var;
        if (this.f40824d0 == null && o2Var != null) {
            int i10 = this.f40822c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f40818a);
            this.f40823c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f40823c0.setClipToPadding(false);
            this.f40823c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? gl0Var = new org.telegram.ui.Components.gl0(5, this.f40822c, getContext(), null, this.f40820b);
            this.f40824d0 = gl0Var;
            gl0Var.setClipChildren(false);
            this.f40824d0.setClipToPadding(false);
            this.f40824d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f40824d0.setDelegate(new gi0(this, o2Var));
            this.f40824d0.setTop(false);
            this.f40824d0.setClipChildren(false);
            this.f40824d0.setClipToPadding(false);
            this.f40824d0.setVisibility(0);
            this.f40824d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f40824d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f40824d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.F.addView(this.f40823c0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40823c0.addView(this.f40824d0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40824d0.setScaleY(0.4f);
            this.f40824d0.setScaleX(0.4f);
            this.f40824d0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                s();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ei0 ei0Var = this.f40824d0;
            if (ei0Var != null && !ei0Var.f26645g1) {
                ei0Var.f26645g1 = true;
                ei0Var.f26647h1 = true;
                ah.t0 t0Var = ei0Var.f26670x0;
                if (t0Var != null && (n0Var = t0Var.f878m) != null && !n0Var.L1) {
                    n0Var.L1 = true;
                    n0Var.M1 = true;
                    y41 y41Var = n0Var.f35905h0;
                    if (y41Var != null) {
                        y41Var.invalidate();
                    }
                    o41 o41Var = n0Var.f35907i0;
                    if (o41Var != null) {
                        o41Var.invalidate();
                    }
                }
            }
            new ei.b4(this.E, false, new u3(this, 11));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        ei0 ei0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f40844u0;
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
        if (!z10 && (ei0Var = this.f40824d0) != null && this.f40825e0) {
            ei0Var.e();
            if (this.f40824d0.getReactionsWindow() != null && this.f40824d0.getReactionsWindow().f869a != null) {
                this.f40824d0.getReactionsWindow().f869a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f40824d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.f40841s = !z10;
        this.J.invalidate();
        this.f40846w = true;
        this.f40848x = true;
        float f10 = this.f40850y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40844u0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f40844u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f40844u0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f40844u0.setDuration(350L);
        this.f40844u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f40822c).hasAvailableEffects()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f40837p0) {
            return;
        }
        this.f40837p0 = true;
        di0 di0Var = this.W;
        if (di0Var != null) {
            di0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        d(new vh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.f40822c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
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
        ji0 ji0Var = this.J;
        if (ji0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ji0Var.getChildCount()) {
                View childAt = ji0Var.getChildAt(i11);
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
            ji0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.W3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.l3(), t1Var2.m3(), t1Var2.g3(), false);
        ji0Var.getAdapter().m(i12);
    }

    public final void g(boolean z10) {
        this.f40839r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f40837p0) {
            return;
        }
        this.f40837p0 = true;
        wh.f.f(false);
        wh.f fVar = this.f40829h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.f40822c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f40849x0 != null && this.f40851y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f40849x0.f27164c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f40851y0);
            this.f40849x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f40837p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (!this.m0 && this.f40824d0 != null) {
            if (this.f40832k0 != null) {
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
        mi0 mi0Var;
        int i10;
        ji0 ji0Var = this.J;
        if (ji0Var != null && ji0Var.getAdapter() != null && (mi0Var = this.L) != null) {
            int h = ji0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            mi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f40845v0 = z10;
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
        if (this.f40824d0 != null && (effect = MessagesController.getInstance(this.f40822c).getEffect(j10)) != null) {
            this.f40824d0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    public final void o(org.telegram.ui.Components.j80 j80Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40820b;
        j80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        j80Var.Q(this.f40831j0, fh.c.k(g6Var), false);
        ViewGroup viewGroup = j80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f40819a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f40819a0 = false;
            return;
        }
        ei0 ei0Var = this.f40824d0;
        if (ei0Var != null && ei0Var.getReactionsWindow() != null) {
            if (!this.f40824d0.getReactionsWindow().C) {
                this.f40824d0.getReactionsWindow().d();
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
        bi0 bi0Var = this.E;
        setContentView(bi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        bi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(bi0Var, !org.telegram.ui.ActionBar.k6.I.q());
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
                if (this.f40847w0 == null) {
                    this.f40847w0 = new org.telegram.ui.Cells.t1(getContext(), this.f40822c, true, null, this.f40820b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f40847w0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.f3 f3Var = t1Var.S0;
                f3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f23485m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f23556r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f23651xe = 0;
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
        ji0 ji0Var = this.J;
        ji0Var.getAdapter().l();
        int h = ji0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.L.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg q(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = vgVar;
        int[] iArr = this.f40835n0;
        vgVar.getLocationOnScreen(iArr);
        di0 di0Var = new di0(this, getContext(), vgVar.f31449b, this.f40820b, vgVar, z10);
        this.W = di0Var;
        di0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.V;
        di0 di0Var2 = this.W;
        di0Var2.E = vgVar2.E;
        di0Var2.f31458h0 = vgVar2.f31458h0;
        di0Var2.f31452c0.t(vgVar2.f31452c0.f29442i, false, true);
        di0Var2.f31453d0 = vgVar2.f31453d0;
        di0Var2.setEmoji(vgVar2.f31455f.f29416f[0]);
        di0Var2.i(vgVar2.f31465s, vgVar2.f31464r, true);
        di0Var2.P.d(vgVar2.P.f26180c, true);
        di0Var2.f31467x.d(vgVar2.f31467x.f26180c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        di0Var2.I = i10;
        di0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        di0Var2.M = f7;
        di0Var2.N = f10;
        this.W.P.d(vgVar.P.f26180c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.V;
        vgVar.getHeight();
        this.X = vgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.V;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.sl.D(6.0f, width - vgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.i11 i11Var = null;
        if (i10 > 0) {
            i11Var = new org.telegram.ui.Components.i11(ai.nd.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f40849x0 = i11Var;
        if (this.f40851y0 == null) {
            Paint paint = new Paint(1);
            this.f40851y0 = paint;
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
        if (this.f40825e0) {
            return;
        }
        this.f40827f0 = false;
        this.f40825e0 = true;
        this.f40824d0.p(null, null, true);
        this.f40824d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.f40824d0.r(false);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        wh.f.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.cn0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                qi0 qi0Var = qi0.this;
                gh.b bVar = qi0Var.f40830i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = qi0Var.V;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                qi0Var.e = bitmap;
                Paint paint = new Paint(1);
                qi0Var.h = paint;
                Bitmap bitmap3 = qi0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                qi0Var.f40826f = bitmapShader;
                paint.setShader(bitmapShader);
                qi0Var.f40834n = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, qi0Var.E);
                ViewGroup viewGroup = qi0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        bi0 bi0Var = this.G;
        if (bi0Var != null) {
            bi0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}
