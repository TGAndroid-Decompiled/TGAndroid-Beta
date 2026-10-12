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
public class hj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final si0 F;
    public final zi0 G;
    public final si0 H;
    public long I;
    public org.telegram.ui.Components.q5 J;
    public final aj0 K;
    public final ri0 L;
    public final dj0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.rf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.de V;
    public org.telegram.ui.Components.wg W;
    public ui0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f36834a;
    public final ti0 f36835a0;
    public final org.telegram.ui.ActionBar.c6 f36836b;
    public boolean f36837b0;
    public final int f36838c;
    public float f36839c0;
    public nb0 d;
    public FrameLayout f36840d0;
    public i0.b e;
    public vi0 f36841e0;
    public Bitmap f36842f;
    public boolean f36843f0;
    public boolean f36844g0;
    public BitmapShader h;
    public boolean f36845h0;
    public final wh.f f36846i0;
    public final gh.b f36847j0;
    public final bh.b f36848k0;
    public RectF f36849l0;
    public boolean m0;
    public Paint f36850n;
    public boolean f36851n0;
    public final int[] f36852o0;
    public boolean f36853p0;
    public boolean f36854q0;
    public Matrix f36855r;
    public org.telegram.ui.Cells.u1 f36856r0;
    public boolean f36857s;
    public float f36858s0;
    public float f36859t0;
    public final Rect f36860u0;
    public boolean v;
    public ValueAnimator f36861v0;
    public boolean f36862w;
    public boolean f36863w0;
    public boolean f36864x;
    public org.telegram.ui.Cells.u1 f36865x0;
    public boolean f36866y;
    public org.telegram.ui.Components.h11 f36867y0;
    public Paint f36868z0;

    public hj0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        nb0 nb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f36838c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f36852o0 = new int[2];
        this.f36854q0 = false;
        this.f36860u0 = new Rect();
        this.f36834a = context;
        this.f36836b = c6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            nb0Var = new nb0(launchActivity, true);
        } else {
            nb0Var = null;
        }
        this.d = nb0Var;
        si0 si0Var = new si0(this, context, 1);
        this.F = si0Var;
        this.f36846i0 = wh.f.d(1, si0Var, si0Var);
        si0Var.setOnClickListener(new View.OnClickListener(this) {
            public final hj0 f39237b;

            {
                this.f39237b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39237b.onBackPressed();
                        return;
                    default:
                        this.f39237b.onBackPressed();
                        return;
                }
            }
        });
        si0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                hj0 hj0Var = hj0.this;
                if (!hj0Var.f36853p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(hj0Var.S);
                    AndroidUtilities.runOnUIThread(new ni0(hj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f36847j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f36848k0 = bVar2;
        bVar2.f2745f = new ih.j(si0Var);
        bVar2.f2746g = si0Var;
        zi0 zi0Var = new zi0(this, context, c6Var);
        this.G = zi0Var;
        zi0Var.setClipToPadding(false);
        si0Var.addView(zi0Var, w7.a6.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(si0Var, gVar);
        aj0 aj0Var = new aj0(this, context, c6Var);
        this.K = aj0Var;
        aj0Var.setOnClickListener(new View.OnClickListener(this) {
            public final hj0 f39237b;

            {
                this.f39237b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39237b.onBackPressed();
                        return;
                    default:
                        this.f39237b.onBackPressed();
                        return;
                }
            }
        });
        aj0Var.setOnItemClickListener(new i(this, 18));
        aj0Var.setOnScrollListener(new k3(this, 19));
        aj0Var.setItemAnimator(new ki.n(null, aj0Var, c6Var));
        dj0 dj0Var = new dj0(this);
        this.M = dj0Var;
        dj0Var.O = new ej0(this);
        aj0Var.setLayoutManager(dj0Var);
        aj0Var.i(new Object());
        ri0 ri0Var = new ri0(this, context, c6Var);
        this.L = ri0Var;
        aj0Var.setAdapter(ri0Var);
        aj0Var.setVerticalScrollBarEnabled(false);
        aj0Var.setOverScrollMode(2);
        zi0Var.addView(aj0Var, w7.a6.d(-2.0f, -1));
        si0 si0Var2 = new si0(this, context, 0);
        this.H = si0Var2;
        si0Var.addView(si0Var2, w7.a6.d(-1.0f, -1));
        this.f36835a0 = new ti0(this, si0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f36838c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        nb0 nb0Var = this.d;
        if (nb0Var != null) {
            nb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.m2 m2Var) {
        ah.n0 n0Var;
        if (this.f36841e0 == null && m2Var != null) {
            int i10 = this.f36838c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f36834a);
            this.f36840d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f36840d0.setClipToPadding(false);
            this.f36840d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? gl0Var = new org.telegram.ui.Components.gl0(5, this.f36838c, getContext(), null, this.f36836b);
            this.f36841e0 = gl0Var;
            gl0Var.setClipChildren(false);
            this.f36841e0.setClipToPadding(false);
            this.f36841e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f36841e0.setDelegate(new xi0(this, m2Var));
            this.f36841e0.setTop(false);
            this.f36841e0.setClipChildren(false);
            this.f36841e0.setClipToPadding(false);
            this.f36841e0.setVisibility(0);
            this.f36841e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f36841e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f36841e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f36840d0, w7.a6.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
            this.f36840d0.addView(this.f36841e0, w7.a6.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            this.f36841e0.setScaleY(0.4f);
            this.f36841e0.setScaleX(0.4f);
            this.f36841e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            vi0 vi0Var = this.f36841e0;
            if (vi0Var != null && !vi0Var.f25332f1) {
                vi0Var.f25332f1 = true;
                vi0Var.f25334g1 = true;
                ah.t0 t0Var = vi0Var.f25358x0;
                if (t0Var != null && (n0Var = t0Var.f873m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    o61 o61Var = n0Var.f39637h0;
                    if (o61Var != null) {
                        o61Var.invalidate();
                    }
                    e61 e61Var = n0Var.f39639i0;
                    if (e61Var != null) {
                        e61Var.invalidate();
                    }
                }
            }
            new di.h4(this.F, false, new v3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f36838c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f36854q0) {
            return;
        }
        this.f36854q0 = true;
        ui0 ui0Var = this.X;
        if (ui0Var != null) {
            ui0Var.invalidate();
        }
        org.telegram.ui.Components.wg wgVar = this.W;
        if (wgVar != null) {
            wgVar.invalidate();
        }
        e(new mi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        vi0 vi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f36861v0;
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
        if (!z10 && (vi0Var = this.f36841e0) != null && this.f36843f0) {
            vi0Var.e();
            if (this.f36841e0.getReactionsWindow() != null && this.f36841e0.getReactionsWindow().f864a != null) {
                this.f36841e0.getReactionsWindow().f864a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f36841e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f36862w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f36864x = true;
        this.f36866y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36861v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f36861v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f36861v0.setInterpolator(org.telegram.ui.Components.es.h);
        this.f36861v0.setDuration(350L);
        this.f36861v0.start();
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
        aj0 aj0Var = this.K;
        if (aj0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < aj0Var.getChildCount()) {
                View childAt = aj0Var.getChildAt(i11);
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
            aj0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        aj0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f36857s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f36854q0) {
            return;
        }
        this.f36854q0 = true;
        wh.f.f(false);
        wh.f fVar = this.f36846i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f36854q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f36867y0 != null && this.f36868z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f36867y0.f25473c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f36868z0);
            this.f36867y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f36851n0 && this.f36841e0 != null) {
            if (this.f36849l0 != null) {
                this.f36851n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f36851n0 = true;
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
        dj0 dj0Var;
        int i10;
        aj0 aj0Var = this.K;
        if (aj0Var != null && aj0Var.getAdapter() != null && (dj0Var = this.M) != null) {
            int h = aj0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            dj0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f36863w0 = z10;
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
        if (this.f36841e0 != null && (effect = MessagesController.getInstance(this.f36838c).getEffect(j10)) != null) {
            this.f36841e0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f36837b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f36837b0 = false;
            return;
        }
        vi0 vi0Var = this.f36841e0;
        if (vi0Var != null && vi0Var.getReactionsWindow() != null) {
            if (!this.f36841e0.getReactionsWindow().C) {
                this.f36841e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f36851n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        si0 si0Var = this.F;
        setContentView(si0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        si0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(si0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    public final void p(org.telegram.ui.Components.m80 m80Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f36836b;
        m80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
        m80Var.Q(this.f36848k0, fh.b.k(c6Var), false);
        ViewGroup viewGroup = m80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.a6.d(-2.0f, -2));
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
                if (this.f36865x0 == null) {
                    this.f36865x0 = new org.telegram.ui.Cells.u1(getContext(), this.f36838c, true, null, this.f36836b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f36865x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                bi.b4 b4Var = u1Var.S0;
                b4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f22314m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f22385r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f22480xe = 0;
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
                    b4Var.setIgnoreImageSet(false);
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
        aj0 aj0Var = this.K;
        aj0Var.getAdapter().l();
        int h = aj0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.wg r(org.telegram.ui.Components.wg wgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = wgVar;
        int[] iArr = this.f36852o0;
        wgVar.getLocationOnScreen(iArr);
        ui0 ui0Var = new ui0(this, getContext(), wgVar.f30867b, this.f36836b, wgVar, z10);
        this.X = ui0Var;
        ui0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.wg wgVar2 = this.W;
        ui0 ui0Var2 = this.X;
        ui0Var2.E = wgVar2.E;
        ui0Var2.f30876h0 = wgVar2.f30876h0;
        ui0Var2.f30870c0.t(wgVar2.f30870c0.f28753i, false, true);
        ui0Var2.f30871d0 = wgVar2.f30871d0;
        ui0Var2.setEmoji(wgVar2.f30873f.f28516f[0]);
        ui0Var2.i(wgVar2.f30882s, wgVar2.f30881r, true);
        ui0Var2.P.d(wgVar2.P.f25190c, true);
        ui0Var2.f30884x.d(wgVar2.f30884x.f25190c, true);
        int i10 = wgVar2.I;
        int i11 = wgVar2.J;
        ui0Var2.I = i10;
        ui0Var2.J = i11;
        float f7 = wgVar2.M;
        float f10 = wgVar2.N;
        ui0Var2.M = f7;
        ui0Var2.N = f10;
        this.X.P.d(wgVar.P.f25190c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(wgVar.getWidth(), wgVar.getHeight()));
        org.telegram.ui.Components.wg wgVar3 = this.W;
        wgVar.getHeight();
        this.Y = wgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.wg wgVar4 = this.W;
        wgVar.getHeight();
        iArr[0] = org.telegram.ui.Cells.d0.b(6.0f, width - wgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.h11 h11Var = null;
        if (i10 > 0) {
            h11Var = new org.telegram.ui.Components.h11(zh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f36867y0 = h11Var;
        if (this.f36868z0 == null) {
            Paint paint = new Paint(1);
            this.f36868z0 = paint;
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
        org.telegram.ui.Components.wg wgVar = this.W;
        if (wgVar != null) {
            wgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.cn0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                hj0 hj0Var = hj0.this;
                gh.b bVar = hj0Var.f36847j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.wg wgVar2 = hj0Var.W;
                if (wgVar2 != null) {
                    wgVar2.setAlpha(alpha);
                }
                hj0Var.f36842f = bitmap;
                Paint paint = new Paint(1);
                hj0Var.f36850n = paint;
                Bitmap bitmap3 = hj0Var.f36842f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                hj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                hj0Var.f36855r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, hj0Var.F);
                ViewGroup viewGroup = hj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        si0 si0Var = this.H;
        if (si0Var != null) {
            si0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f36843f0) {
            return;
        }
        this.f36844g0 = false;
        this.f36843f0 = true;
        this.f36841e0.p(null, null, true);
        this.f36841e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.es.h).start();
        this.f36841e0.r(false);
    }

    public void m(long j10) {
    }
}
