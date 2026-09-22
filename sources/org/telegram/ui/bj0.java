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
public class bj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final mi0 F;
    public final ti0 G;
    public final mi0 H;
    public long I;
    public org.telegram.ui.Components.m5 J;
    public final ui0 K;
    public final li0 L;
    public final xi0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.t1 Q;
    public int R;
    public org.telegram.ui.Components.of S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ae V;
    public org.telegram.ui.Components.tg W;
    public oi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f32173a;
    public final ni0 f32174a0;
    public final org.telegram.ui.ActionBar.e6 f32175b;
    public boolean f32176b0;
    public final int f32177c;
    public float f32178c0;
    public kb0 d;
    public FrameLayout f32179d0;
    public i0.b e;
    public pi0 f32180e0;
    public Bitmap f32181f;
    public boolean f32182f0;
    public boolean f32183g0;
    public BitmapShader h;
    public boolean f32184h0;
    public final vh.g f32185i0;
    public final fh.b f32186j0;
    public final ah.c f32187k0;
    public RectF f32188l0;
    public boolean m0;
    public Paint f32189n;
    public boolean f32190n0;
    public final int[] f32191o0;
    public boolean f32192p0;
    public boolean f32193q0;
    public Matrix f32194r;
    public org.telegram.ui.Cells.t1 f32195r0;
    public boolean f32196s;
    public float f32197s0;
    public float f32198t0;
    public final Rect f32199u0;
    public boolean v;
    public ValueAnimator f32200v0;
    public boolean f32201w;
    public boolean f32202w0;
    public boolean f32203x;
    public org.telegram.ui.Cells.t1 f32204x0;
    public boolean f32205y;
    public org.telegram.ui.Components.g01 f32206y0;
    public Paint f32207z0;

    public bj0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        kb0 kb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f32177c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f32191o0 = new int[2];
        this.f32193q0 = false;
        this.f32199u0 = new Rect();
        this.f32173a = context;
        this.f32175b = e6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            kb0Var = new kb0(launchActivity, true);
        } else {
            kb0Var = null;
        }
        this.d = kb0Var;
        mi0 mi0Var = new mi0(this, context, 1);
        this.F = mi0Var;
        this.f32185i0 = vh.g.d(1, mi0Var, mi0Var);
        mi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bj0 f34918b;

            {
                this.f34918b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34918b.onBackPressed();
                        return;
                    default:
                        this.f34918b.onBackPressed();
                        return;
                }
            }
        });
        mi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                bj0 bj0Var = bj0.this;
                if (!bj0Var.f32192p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(bj0Var.S);
                    AndroidUtilities.runOnUIThread(new hi0(bj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f32186j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f32187k0 = cVar;
        cVar.f425f = new hh.k(mi0Var);
        cVar.f426g = mi0Var;
        ti0 ti0Var = new ti0(this, context, e6Var);
        this.G = ti0Var;
        ti0Var.setClipToPadding(false);
        mi0Var.addView(ti0Var, w7.x5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f41839a;
        r0.a0.j(mi0Var, gVar);
        ui0 ui0Var = new ui0(this, context, e6Var);
        this.K = ui0Var;
        ui0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bj0 f34918b;

            {
                this.f34918b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34918b.onBackPressed();
                        return;
                    default:
                        this.f34918b.onBackPressed();
                        return;
                }
            }
        });
        ui0Var.setOnItemClickListener(new i(this, 17));
        ui0Var.setOnScrollListener(new h3(this, 19));
        ui0Var.setItemAnimator(new ji.n(null, ui0Var, e6Var));
        xi0 xi0Var = new xi0(this);
        this.M = xi0Var;
        xi0Var.O = new yi0(this);
        ui0Var.setLayoutManager(xi0Var);
        ui0Var.i(new Object());
        li0 li0Var = new li0(this, context, e6Var);
        this.L = li0Var;
        ui0Var.setAdapter(li0Var);
        ui0Var.setVerticalScrollBarEnabled(false);
        ui0Var.setOverScrollMode(2);
        ti0Var.addView(ui0Var, w7.x5.c(-2.0f, -1));
        mi0 mi0Var2 = new mi0(this, context, 0);
        this.H = mi0Var2;
        mi0Var.addView(mi0Var2, w7.x5.c(-1.0f, -1));
        this.f32174a0 = new ni0(this, mi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f32177c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        kb0 kb0Var = this.d;
        if (kb0Var != null) {
            kb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        zg.y yVar;
        if (this.f32180e0 == null && n2Var != null) {
            int i10 = this.f32177c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f32173a);
            this.f32179d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f32179d0.setClipToPadding(false);
            this.f32179d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? fk0Var = new org.telegram.ui.Components.fk0(5, this.f32177c, getContext(), null, this.f32175b);
            this.f32180e0 = fk0Var;
            fk0Var.setClipChildren(false);
            this.f32180e0.setClipToPadding(false);
            this.f32180e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f32180e0.setDelegate(new ri0(this, n2Var));
            this.f32180e0.setTop(false);
            this.f32180e0.setClipChildren(false);
            this.f32180e0.setClipToPadding(false);
            this.f32180e0.setVisibility(0);
            this.f32180e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f32180e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f32180e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f32179d0, w7.x5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f32179d0.addView(this.f32180e0, w7.x5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f32180e0.setScaleY(0.4f);
            this.f32180e0.setScaleX(0.4f);
            this.f32180e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            pi0 pi0Var = this.f32180e0;
            if (pi0Var != null && !pi0Var.f23980f1) {
                pi0Var.f23980f1 = true;
                pi0Var.f23982g1 = true;
                zg.c0 c0Var = pi0Var.f24006x0;
                if (c0Var != null && (yVar = c0Var.f48985m) != null && !yVar.K1) {
                    yVar.K1 = true;
                    yVar.L1 = true;
                    e61 e61Var = yVar.f34132h0;
                    if (e61Var != null) {
                        e61Var.invalidate();
                    }
                    u51 u51Var = yVar.f34134i0;
                    if (u51Var != null) {
                        u51Var.invalidate();
                    }
                }
            }
            new ci.j4(this.F, false, new s3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f32177c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f32193q0) {
            return;
        }
        this.f32193q0 = true;
        oi0 oi0Var = this.X;
        if (oi0Var != null) {
            oi0Var.invalidate();
        }
        org.telegram.ui.Components.tg tgVar = this.W;
        if (tgVar != null) {
            tgVar.invalidate();
        }
        e(new gi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        pi0 pi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f32200v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.n1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (pi0Var = this.f32180e0) != null && this.f32182f0) {
            pi0Var.e();
            if (this.f32180e0.getReactionsWindow() != null && this.f32180e0.getReactionsWindow().f48976a != null) {
                this.f32180e0.getReactionsWindow().f48976a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f32180e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f32201w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f32203x = true;
        this.f32205y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32200v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f32200v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f32200v0.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f32200v0.setDuration(350L);
        this.f32200v0.start();
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
        org.telegram.ui.Cells.t1 t1Var;
        ui0 ui0Var = this.K;
        if (ui0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ui0Var.getChildCount()) {
                View childAt = ui0Var.getChildAt(i11);
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
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (t1Var2 == null) {
            ui0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        ui0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f32196s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f32193q0) {
            return;
        }
        this.f32193q0 = true;
        vh.g.f(false);
        vh.g gVar = this.f32185i0;
        if (gVar != null) {
            gVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f32193q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f32206y0 != null && this.f32207z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f32206y0.f24146c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f32207z0);
            this.f32206y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f32190n0 && this.f32180e0 != null) {
            if (this.f32188l0 != null) {
                this.f32190n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.t1 t1Var = this.Q;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f32190n0 = true;
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
        xi0 xi0Var;
        int i10;
        ui0 ui0Var = this.K;
        if (ui0Var != null && ui0Var.getAdapter() != null && (xi0Var = this.M) != null) {
            int h = ui0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            xi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f32202w0 = z10;
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
        if (this.f32180e0 != null && (effect = MessagesController.getInstance(this.f32177c).getEffect(j3)) != null) {
            this.f32180e0.setSelectedReactionAnimated(zg.p0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f32176b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f32176b0 = false;
            return;
        }
        pi0 pi0Var = this.f32180e0;
        if (pi0Var != null && pi0Var.getReactionsWindow() != null) {
            if (!this.f32180e0.getReactionsWindow().C) {
                this.f32180e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f32190n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        mi0 mi0Var = this.F;
        setContentView(mi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        mi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(mi0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    public final void p(org.telegram.ui.Components.n70 n70Var) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32175b;
        n70Var.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        n70Var.Q(this.f32187k0, eh.b.k(e6Var), false);
        ViewGroup viewGroup = n70Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.x5.c(-2.0f, -2));
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
                if (this.f32204x0 == null) {
                    this.f32204x0 = new org.telegram.ui.Cells.t1(getContext(), this.f32177c, true, null, this.f32175b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f32204x0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = t1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f21132m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f21203r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f21297xe = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += t1Var.J8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    t1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    l4Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.n4();
                    i11 = t1Var.J8;
                }
            }
            this.O = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        ui0 ui0Var = this.K;
        ui0Var.getAdapter().l();
        int h = ui0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.tg r(org.telegram.ui.Components.tg tgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = tgVar;
        int[] iArr = this.f32191o0;
        tgVar.getLocationOnScreen(iArr);
        oi0 oi0Var = new oi0(this, getContext(), tgVar.f28109b, this.f32175b, tgVar, z10);
        this.X = oi0Var;
        oi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.tg tgVar2 = this.W;
        oi0 oi0Var2 = this.X;
        oi0Var2.E = tgVar2.E;
        oi0Var2.f28118h0 = tgVar2.f28118h0;
        oi0Var2.f28112c0.q(tgVar2.f28112c0.f26088g, false, true);
        oi0Var2.f28113d0 = tgVar2.f28113d0;
        oi0Var2.setEmoji(tgVar2.f28115f.f26072f[0]);
        oi0Var2.i(tgVar2.f28124s, tgVar2.f28123r, true);
        oi0Var2.P.d(tgVar2.P.f22951c, true);
        oi0Var2.f28126x.d(tgVar2.f28126x.f22951c, true);
        int i10 = tgVar2.I;
        int i11 = tgVar2.J;
        oi0Var2.I = i10;
        oi0Var2.J = i11;
        float f7 = tgVar2.M;
        float f10 = tgVar2.N;
        oi0Var2.M = f7;
        oi0Var2.N = f10;
        this.X.P.d(tgVar.P.f22951c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(tgVar.getWidth(), tgVar.getHeight()));
        org.telegram.ui.Components.tg tgVar3 = this.W;
        tgVar.getHeight();
        this.Y = tgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.tg tgVar4 = this.W;
        tgVar.getHeight();
        iArr[0] = org.telegram.messenger.vl.D(6.0f, width - tgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.g01 g01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            g01Var = new org.telegram.ui.Components.g01(yh.x7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f32206y0 = g01Var;
        if (this.f32207z0 == null) {
            Paint paint = new Paint(1);
            this.f32207z0 = paint;
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
        vh.g.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.tg tgVar = this.W;
        if (tgVar != null) {
            tgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.am0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                bj0 bj0Var = bj0.this;
                fh.b bVar = bj0Var.f32186j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.tg tgVar2 = bj0Var.W;
                if (tgVar2 != null) {
                    tgVar2.setAlpha(alpha);
                }
                bj0Var.f32181f = bitmap;
                Paint paint = new Paint(1);
                bj0Var.f32189n = paint;
                Bitmap bitmap3 = bj0Var.f32181f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                bj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                bj0Var.f32194r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, bj0Var.F);
                ViewGroup viewGroup = bj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        mi0 mi0Var = this.H;
        if (mi0Var != null) {
            mi0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f32182f0) {
            return;
        }
        this.f32183g0 = false;
        this.f32182f0 = true;
        this.f32180e0.p(null, null, true);
        this.f32180e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        this.f32180e0.r(false);
    }

    public void m(long j3) {
    }
}
