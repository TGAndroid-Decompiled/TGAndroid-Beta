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
public class cj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final ni0 F;
    public final ui0 G;
    public final ni0 H;
    public long I;
    public org.telegram.ui.Components.o5 J;
    public final vi0 K;
    public final mi0 L;
    public final yi0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.pf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ce V;
    public org.telegram.ui.Components.ug W;
    public pi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f32671a;
    public final oi0 f32672a0;
    public final org.telegram.ui.ActionBar.e6 f32673b;
    public boolean f32674b0;
    public final int f32675c;
    public float f32676c0;
    public lb0 d;
    public FrameLayout f32677d0;
    public i0.b e;
    public qi0 f32678e0;
    public Bitmap f32679f;
    public boolean f32680f0;
    public boolean f32681g0;
    public BitmapShader h;
    public boolean f32682h0;
    public final vh.g f32683i0;
    public final fh.b f32684j0;
    public final ah.c f32685k0;
    public RectF f32686l0;
    public boolean m0;
    public Paint f32687n;
    public boolean f32688n0;
    public final int[] f32689o0;
    public boolean f32690p0;
    public boolean f32691q0;
    public Matrix f32692r;
    public org.telegram.ui.Cells.u1 f32693r0;
    public boolean f32694s;
    public float f32695s0;
    public float f32696t0;
    public final Rect f32697u0;
    public boolean v;
    public ValueAnimator f32698v0;
    public boolean f32699w;
    public boolean f32700w0;
    public boolean f32701x;
    public org.telegram.ui.Cells.u1 f32702x0;
    public boolean f32703y;
    public org.telegram.ui.Components.v01 f32704y0;
    public Paint f32705z0;

    public cj0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        lb0 lb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f32675c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f32689o0 = new int[2];
        this.f32691q0 = false;
        this.f32697u0 = new Rect();
        this.f32671a = context;
        this.f32673b = e6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            lb0Var = new lb0(launchActivity, true);
        } else {
            lb0Var = null;
        }
        this.d = lb0Var;
        ni0 ni0Var = new ni0(this, context, 1);
        this.F = ni0Var;
        this.f32683i0 = vh.g.d(1, ni0Var, ni0Var);
        ni0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f35113b;

            {
                this.f35113b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35113b.onBackPressed();
                        return;
                    default:
                        this.f35113b.onBackPressed();
                        return;
                }
            }
        });
        ni0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                cj0 cj0Var = cj0.this;
                if (!cj0Var.f32690p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(cj0Var.S);
                    AndroidUtilities.runOnUIThread(new ii0(cj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f32684j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f32685k0 = cVar;
        cVar.f425f = new hh.k(ni0Var);
        cVar.f426g = ni0Var;
        ui0 ui0Var = new ui0(this, context, e6Var);
        this.G = ui0Var;
        ui0Var.setClipToPadding(false);
        ni0Var.addView(ui0Var, w7.y5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.a0.j(ni0Var, gVar);
        vi0 vi0Var = new vi0(this, context, e6Var);
        this.K = vi0Var;
        vi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f35113b;

            {
                this.f35113b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35113b.onBackPressed();
                        return;
                    default:
                        this.f35113b.onBackPressed();
                        return;
                }
            }
        });
        vi0Var.setOnItemClickListener(new i(this, 17));
        vi0Var.setOnScrollListener(new h3(this, 19));
        vi0Var.setItemAnimator(new ji.n(null, vi0Var, e6Var));
        yi0 yi0Var = new yi0(this);
        this.M = yi0Var;
        yi0Var.O = new zi0(this);
        vi0Var.setLayoutManager(yi0Var);
        vi0Var.i(new Object());
        mi0 mi0Var = new mi0(this, context, e6Var);
        this.L = mi0Var;
        vi0Var.setAdapter(mi0Var);
        vi0Var.setVerticalScrollBarEnabled(false);
        vi0Var.setOverScrollMode(2);
        ui0Var.addView(vi0Var, w7.y5.c(-2.0f, -1));
        ni0 ni0Var2 = new ni0(this, context, 0);
        this.H = ni0Var2;
        ni0Var.addView(ni0Var2, w7.y5.c(-1.0f, -1));
        this.f32672a0 = new oi0(this, ni0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f32675c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        lb0 lb0Var = this.d;
        if (lb0Var != null) {
            lb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        zg.x xVar;
        if (this.f32678e0 == null && n2Var != null) {
            int i10 = this.f32675c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f32671a);
            this.f32677d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f32677d0.setClipToPadding(false);
            this.f32677d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? qk0Var = new org.telegram.ui.Components.qk0(5, this.f32675c, getContext(), null, this.f32673b);
            this.f32678e0 = qk0Var;
            qk0Var.setClipChildren(false);
            this.f32678e0.setClipToPadding(false);
            this.f32678e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f32678e0.setDelegate(new si0(this, n2Var));
            this.f32678e0.setTop(false);
            this.f32678e0.setClipChildren(false);
            this.f32678e0.setClipToPadding(false);
            this.f32678e0.setVisibility(0);
            this.f32678e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f32678e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f32678e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f32677d0, w7.y5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f32677d0.addView(this.f32678e0, w7.y5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f32678e0.setScaleY(0.4f);
            this.f32678e0.setScaleX(0.4f);
            this.f32678e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            qi0 qi0Var = this.f32678e0;
            if (qi0Var != null && !qi0Var.f27649f1) {
                qi0Var.f27649f1 = true;
                qi0Var.f27651g1 = true;
                zg.b0 b0Var = qi0Var.f27675x0;
                if (b0Var != null && (xVar = b0Var.f49235m) != null && !xVar.K1) {
                    xVar.K1 = true;
                    xVar.L1 = true;
                    d61 d61Var = xVar.f33728h0;
                    if (d61Var != null) {
                        d61Var.invalidate();
                    }
                    t51 t51Var = xVar.f33730i0;
                    if (t51Var != null) {
                        t51Var.invalidate();
                    }
                }
            }
            new ci.j4(this.F, false, new s3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f32675c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f32691q0) {
            return;
        }
        this.f32691q0 = true;
        pi0 pi0Var = this.X;
        if (pi0Var != null) {
            pi0Var.invalidate();
        }
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.invalidate();
        }
        e(new hi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        qi0 qi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f32698v0;
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
        if (!z10 && (qi0Var = this.f32678e0) != null && this.f32680f0) {
            qi0Var.e();
            if (this.f32678e0.getReactionsWindow() != null && this.f32678e0.getReactionsWindow().f49226a != null) {
                this.f32678e0.getReactionsWindow().f49226a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f32678e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f32699w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f32701x = true;
        this.f32703y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32698v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f32698v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f32698v0.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f32698v0.setDuration(350L);
        this.f32698v0.start();
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
        vi0 vi0Var = this.K;
        if (vi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < vi0Var.getChildCount()) {
                View childAt = vi0Var.getChildAt(i11);
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
            vi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        vi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f32694s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f32691q0) {
            return;
        }
        this.f32691q0 = true;
        vh.g.f(false);
        vh.g gVar = this.f32683i0;
        if (gVar != null) {
            gVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f32691q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f32704y0 != null && this.f32705z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f32704y0.f28868c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f32705z0);
            this.f32704y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f32688n0 && this.f32678e0 != null) {
            if (this.f32686l0 != null) {
                this.f32688n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f32688n0 = true;
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
        yi0 yi0Var;
        int i10;
        vi0 vi0Var = this.K;
        if (vi0Var != null && vi0Var.getAdapter() != null && (yi0Var = this.M) != null) {
            int h = vi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            yi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f32700w0 = z10;
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
        if (this.f32678e0 != null && (effect = MessagesController.getInstance(this.f32675c).getEffect(j3)) != null) {
            this.f32678e0.setSelectedReactionAnimated(zg.o0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f32674b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f32674b0 = false;
            return;
        }
        qi0 qi0Var = this.f32678e0;
        if (qi0Var != null && qi0Var.getReactionsWindow() != null) {
            if (!this.f32678e0.getReactionsWindow().C) {
                this.f32678e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f32688n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ni0 ni0Var = this.F;
        setContentView(ni0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ni0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ni0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.w70 w70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32673b;
        w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
        w70Var.Q(this.f32685k0, eh.b.k(e6Var), false);
        ViewGroup viewGroup = w70Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.y5.c(-2.0f, -2));
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
                if (this.f32702x0 == null) {
                    this.f32702x0 = new org.telegram.ui.Cells.u1(getContext(), this.f32675c, true, null, this.f32673b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f32702x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f21399m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f21470r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f21564xe = 0;
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
                    l4Var.setIgnoreImageSet(false);
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
        vi0 vi0Var = this.K;
        vi0Var.getAdapter().l();
        int h = vi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.ug r(org.telegram.ui.Components.ug ugVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = ugVar;
        int[] iArr = this.f32689o0;
        ugVar.getLocationOnScreen(iArr);
        pi0 pi0Var = new pi0(this, getContext(), ugVar.f28689b, this.f32673b, ugVar, z10);
        this.X = pi0Var;
        pi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.ug ugVar2 = this.W;
        pi0 pi0Var2 = this.X;
        pi0Var2.E = ugVar2.E;
        pi0Var2.f28698h0 = ugVar2.f28698h0;
        pi0Var2.f28692c0.q(ugVar2.f28692c0.f26871g, false, true);
        pi0Var2.f28693d0 = ugVar2.f28693d0;
        pi0Var2.setEmoji(ugVar2.f28695f.f26855f[0]);
        pi0Var2.i(ugVar2.f28704s, ugVar2.f28703r, true);
        pi0Var2.P.d(ugVar2.P.f23794c, true);
        pi0Var2.f28706x.d(ugVar2.f28706x.f23794c, true);
        int i10 = ugVar2.I;
        int i11 = ugVar2.J;
        pi0Var2.I = i10;
        pi0Var2.J = i11;
        float f7 = ugVar2.M;
        float f10 = ugVar2.N;
        pi0Var2.M = f7;
        pi0Var2.N = f10;
        this.X.P.d(ugVar.P.f23794c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(ugVar.getWidth(), ugVar.getHeight()));
        org.telegram.ui.Components.ug ugVar3 = this.W;
        ugVar.getHeight();
        this.Y = ugVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.ug ugVar4 = this.W;
        ugVar.getHeight();
        iArr[0] = org.telegram.messenger.wh.D(6.0f, width - ugVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.v01 v01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            v01Var = new org.telegram.ui.Components.v01(yh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f32704y0 = v01Var;
        if (this.f32705z0 == null) {
            Paint paint = new Paint(1);
            this.f32705z0 = paint;
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
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.nm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                cj0 cj0Var = cj0.this;
                fh.b bVar = cj0Var.f32684j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.ug ugVar2 = cj0Var.W;
                if (ugVar2 != null) {
                    ugVar2.setAlpha(alpha);
                }
                cj0Var.f32679f = bitmap;
                Paint paint = new Paint(1);
                cj0Var.f32687n = paint;
                Bitmap bitmap3 = cj0Var.f32679f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                cj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                cj0Var.f32692r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, cj0Var.F);
                ViewGroup viewGroup = cj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ni0 ni0Var = this.H;
        if (ni0Var != null) {
            ni0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f32680f0) {
            return;
        }
        this.f32681g0 = false;
        this.f32680f0 = true;
        this.f32678e0.p(null, null, true);
        this.f32678e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        this.f32678e0.r(false);
    }

    public void m(long j3) {
    }
}
