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
public class gj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final ri0 F;
    public final yi0 G;
    public final ri0 H;
    public long I;
    public org.telegram.ui.Components.q5 J;
    public final zi0 K;
    public final qi0 L;
    public final cj0 M;
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
    public ti0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f36232a;
    public final si0 f36233a0;
    public final org.telegram.ui.ActionBar.c6 f36234b;
    public boolean f36235b0;
    public final int f36236c;
    public float f36237c0;
    public mb0 d;
    public FrameLayout f36238d0;
    public i0.b e;
    public ui0 f36239e0;
    public Bitmap f36240f;
    public boolean f36241f0;
    public boolean f36242g0;
    public BitmapShader h;
    public boolean f36243h0;
    public final wh.f f36244i0;
    public final gh.b f36245j0;
    public final bh.b f36246k0;
    public RectF f36247l0;
    public boolean m0;
    public Paint f36248n;
    public boolean f36249n0;
    public final int[] f36250o0;
    public boolean f36251p0;
    public boolean f36252q0;
    public Matrix f36253r;
    public org.telegram.ui.Cells.u1 f36254r0;
    public boolean f36255s;
    public float f36256s0;
    public float f36257t0;
    public final Rect f36258u0;
    public boolean v;
    public ValueAnimator f36259v0;
    public boolean f36260w;
    public boolean f36261w0;
    public boolean f36262x;
    public org.telegram.ui.Cells.u1 f36263x0;
    public boolean f36264y;
    public org.telegram.ui.Components.i11 f36265y0;
    public Paint f36266z0;

    public gj0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        mb0 mb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f36236c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f36250o0 = new int[2];
        this.f36252q0 = false;
        this.f36258u0 = new Rect();
        this.f36232a = context;
        this.f36234b = c6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            mb0Var = new mb0(launchActivity, true);
        } else {
            mb0Var = null;
        }
        this.d = mb0Var;
        ri0 ri0Var = new ri0(this, context, 1);
        this.F = ri0Var;
        this.f36244i0 = wh.f.d(1, ri0Var, ri0Var);
        ri0Var.setOnClickListener(new View.OnClickListener(this) {
            public final gj0 f38678b;

            {
                this.f38678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38678b.onBackPressed();
                        return;
                    default:
                        this.f38678b.onBackPressed();
                        return;
                }
            }
        });
        ri0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                gj0 gj0Var = gj0.this;
                if (!gj0Var.f36251p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(gj0Var.S);
                    AndroidUtilities.runOnUIThread(new mi0(gj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f36245j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f36246k0 = bVar2;
        bVar2.f2749f = new ih.j(ri0Var);
        bVar2.f2750g = ri0Var;
        yi0 yi0Var = new yi0(this, context, c6Var);
        this.G = yi0Var;
        yi0Var.setClipToPadding(false);
        ri0Var.addView(yi0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(ri0Var, gVar);
        zi0 zi0Var = new zi0(this, context, c6Var);
        this.K = zi0Var;
        zi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final gj0 f38678b;

            {
                this.f38678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38678b.onBackPressed();
                        return;
                    default:
                        this.f38678b.onBackPressed();
                        return;
                }
            }
        });
        zi0Var.setOnItemClickListener(new i(this, 18));
        zi0Var.setOnScrollListener(new k3(this, 19));
        zi0Var.setItemAnimator(new ki.n(null, zi0Var, c6Var));
        cj0 cj0Var = new cj0(this);
        this.M = cj0Var;
        cj0Var.O = new dj0(this);
        zi0Var.setLayoutManager(cj0Var);
        zi0Var.i(new Object());
        qi0 qi0Var = new qi0(this, context, c6Var);
        this.L = qi0Var;
        zi0Var.setAdapter(qi0Var);
        zi0Var.setVerticalScrollBarEnabled(false);
        zi0Var.setOverScrollMode(2);
        yi0Var.addView(zi0Var, w7.z5.d(-2.0f, -1));
        ri0 ri0Var2 = new ri0(this, context, 0);
        this.H = ri0Var2;
        ri0Var.addView(ri0Var2, w7.z5.d(-1.0f, -1));
        this.f36233a0 = new si0(this, ri0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f36236c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        mb0 mb0Var = this.d;
        if (mb0Var != null) {
            mb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.m2 m2Var) {
        ah.n0 n0Var;
        if (this.f36239e0 == null && m2Var != null) {
            int i10 = this.f36236c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f36232a);
            this.f36238d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f36238d0.setClipToPadding(false);
            this.f36238d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? gl0Var = new org.telegram.ui.Components.gl0(5, this.f36236c, getContext(), null, this.f36234b);
            this.f36239e0 = gl0Var;
            gl0Var.setClipChildren(false);
            this.f36239e0.setClipToPadding(false);
            this.f36239e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f36239e0.setDelegate(new wi0(this, m2Var));
            this.f36239e0.setTop(false);
            this.f36239e0.setClipChildren(false);
            this.f36239e0.setClipToPadding(false);
            this.f36239e0.setVisibility(0);
            this.f36239e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f36239e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f36239e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f36238d0, w7.z5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
            this.f36238d0.addView(this.f36239e0, w7.z5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            this.f36239e0.setScaleY(0.4f);
            this.f36239e0.setScaleX(0.4f);
            this.f36239e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ui0 ui0Var = this.f36239e0;
            if (ui0Var != null && !ui0Var.f25021f1) {
                ui0Var.f25021f1 = true;
                ui0Var.f25023g1 = true;
                ah.t0 t0Var = ui0Var.f25047x0;
                if (t0Var != null && (n0Var = t0Var.f877m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    o61 o61Var = n0Var.f39330h0;
                    if (o61Var != null) {
                        o61Var.invalidate();
                    }
                    e61 e61Var = n0Var.f39332i0;
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
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f36236c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f36252q0) {
            return;
        }
        this.f36252q0 = true;
        ti0 ti0Var = this.X;
        if (ti0Var != null) {
            ti0Var.invalidate();
        }
        org.telegram.ui.Components.wg wgVar = this.W;
        if (wgVar != null) {
            wgVar.invalidate();
        }
        e(new li0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ui0 ui0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f36259v0;
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
        if (!z10 && (ui0Var = this.f36239e0) != null && this.f36241f0) {
            ui0Var.e();
            if (this.f36239e0.getReactionsWindow() != null && this.f36239e0.getReactionsWindow().f868a != null) {
                this.f36239e0.getReactionsWindow().f868a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f36239e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f36260w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f36262x = true;
        this.f36264y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36259v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f36259v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f36259v0.setInterpolator(org.telegram.ui.Components.es.h);
        this.f36259v0.setDuration(350L);
        this.f36259v0.start();
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
        zi0 zi0Var = this.K;
        if (zi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < zi0Var.getChildCount()) {
                View childAt = zi0Var.getChildAt(i11);
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
            zi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        zi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f36255s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f36252q0) {
            return;
        }
        this.f36252q0 = true;
        wh.f.f(false);
        wh.f fVar = this.f36244i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f36252q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f36265y0 != null && this.f36266z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f36265y0.f25455c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f36266z0);
            this.f36265y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f36249n0 && this.f36239e0 != null) {
            if (this.f36247l0 != null) {
                this.f36249n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f36249n0 = true;
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
        cj0 cj0Var;
        int i10;
        zi0 zi0Var = this.K;
        if (zi0Var != null && zi0Var.getAdapter() != null && (cj0Var = this.M) != null) {
            int h = zi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            cj0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f36261w0 = z10;
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
        if (this.f36239e0 != null && (effect = MessagesController.getInstance(this.f36236c).getEffect(j10)) != null) {
            this.f36239e0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f36235b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f36235b0 = false;
            return;
        }
        ui0 ui0Var = this.f36239e0;
        if (ui0Var != null && ui0Var.getReactionsWindow() != null) {
            if (!this.f36239e0.getReactionsWindow().C) {
                this.f36239e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f36249n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ri0 ri0Var = this.F;
        setContentView(ri0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ri0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ri0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    public final void p(org.telegram.ui.Components.l80 l80Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f36234b;
        l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
        l80Var.Q(this.f36246k0, fh.b.k(c6Var), false);
        ViewGroup viewGroup = l80Var.A;
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
                if (this.f36263x0 == null) {
                    this.f36263x0 = new org.telegram.ui.Cells.u1(getContext(), this.f36236c, true, null, this.f36234b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f36263x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                bi.b4 b4Var = u1Var.S0;
                b4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f22023m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f22094r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f22189xe = 0;
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
        zi0 zi0Var = this.K;
        zi0Var.getAdapter().l();
        int h = zi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.wg r(org.telegram.ui.Components.wg wgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = wgVar;
        int[] iArr = this.f36250o0;
        wgVar.getLocationOnScreen(iArr);
        ti0 ti0Var = new ti0(this, getContext(), wgVar.f30548b, this.f36234b, wgVar, z10);
        this.X = ti0Var;
        ti0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.wg wgVar2 = this.W;
        ti0 ti0Var2 = this.X;
        ti0Var2.E = wgVar2.E;
        ti0Var2.f30557h0 = wgVar2.f30557h0;
        ti0Var2.f30551c0.t(wgVar2.f30551c0.f28440i, false, true);
        ti0Var2.f30552d0 = wgVar2.f30552d0;
        ti0Var2.setEmoji(wgVar2.f30554f.f28197f[0]);
        ti0Var2.i(wgVar2.f30563s, wgVar2.f30562r, true);
        ti0Var2.P.d(wgVar2.P.f24885c, true);
        ti0Var2.f30565x.d(wgVar2.f30565x.f24885c, true);
        int i10 = wgVar2.I;
        int i11 = wgVar2.J;
        ti0Var2.I = i10;
        ti0Var2.J = i11;
        float f7 = wgVar2.M;
        float f10 = wgVar2.N;
        ti0Var2.M = f7;
        ti0Var2.N = f10;
        this.X.P.d(wgVar.P.f24885c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(wgVar.getWidth(), wgVar.getHeight()));
        org.telegram.ui.Components.wg wgVar3 = this.W;
        wgVar.getHeight();
        this.Y = wgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.wg wgVar4 = this.W;
        wgVar.getHeight();
        iArr[0] = org.telegram.messenger.sk.D(6.0f, width - wgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.i11 i11Var = null;
        if (i10 > 0) {
            i11Var = new org.telegram.ui.Components.i11(zh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f36265y0 = i11Var;
        if (this.f36266z0 == null) {
            Paint paint = new Paint(1);
            this.f36266z0 = paint;
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
                gj0 gj0Var = gj0.this;
                gh.b bVar = gj0Var.f36245j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.wg wgVar2 = gj0Var.W;
                if (wgVar2 != null) {
                    wgVar2.setAlpha(alpha);
                }
                gj0Var.f36240f = bitmap;
                Paint paint = new Paint(1);
                gj0Var.f36248n = paint;
                Bitmap bitmap3 = gj0Var.f36240f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                gj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                gj0Var.f36253r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, gj0Var.F);
                ViewGroup viewGroup = gj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ri0 ri0Var = this.H;
        if (ri0Var != null) {
            ri0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f36241f0) {
            return;
        }
        this.f36242g0 = false;
        this.f36241f0 = true;
        this.f36239e0.p(null, null, true);
        this.f36239e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.es.h).start();
        this.f36239e0.r(false);
    }

    public void m(long j10) {
    }
}
