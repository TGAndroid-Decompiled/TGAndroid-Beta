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
public class mi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final xh0 F;
    public final ei0 G;
    public final xh0 H;
    public long I;
    public org.telegram.ui.Components.p5 J;
    public final fi0 K;
    public final wh0 L;
    public final ii0 M;
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
    public zh0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f39254a;
    public final yh0 f39255a0;
    public final org.telegram.ui.ActionBar.d6 f39256b;
    public boolean f39257b0;
    public final int f39258c;
    public float f39259c0;
    public na0 d;
    public FrameLayout f39260d0;
    public i0.b e;
    public ai0 f39261e0;
    public Bitmap f39262f;
    public boolean f39263f0;
    public boolean f39264g0;
    public BitmapShader h;
    public boolean f39265h0;
    public final wh.f f39266i0;
    public final gh.b f39267j0;
    public final bh.b f39268k0;
    public RectF f39269l0;
    public boolean m0;
    public Paint f39270n;
    public boolean f39271n0;
    public final int[] f39272o0;
    public boolean f39273p0;
    public boolean f39274q0;
    public Matrix f39275r;
    public org.telegram.ui.Cells.u1 f39276r0;
    public boolean f39277s;
    public float f39278s0;
    public float f39279t0;
    public final Rect f39280u0;
    public boolean v;
    public ValueAnimator f39281v0;
    public boolean f39282w;
    public boolean f39283w0;
    public boolean f39284x;
    public org.telegram.ui.Cells.u1 f39285x0;
    public boolean f39286y;
    public org.telegram.ui.Components.f11 f39287y0;
    public Paint f39288z0;

    public mi0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        na0 na0Var;
        int i10 = UserConfig.selectedAccount;
        this.f39258c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f39272o0 = new int[2];
        this.f39274q0 = false;
        this.f39280u0 = new Rect();
        this.f39254a = context;
        this.f39256b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            na0Var = new na0(launchActivity, true);
        } else {
            na0Var = null;
        }
        this.d = na0Var;
        xh0 xh0Var = new xh0(this, context, 1);
        this.F = xh0Var;
        this.f39266i0 = wh.f.d(1, xh0Var, xh0Var);
        xh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mi0 f41981b;

            {
                this.f41981b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41981b.onBackPressed();
                        return;
                    default:
                        this.f41981b.onBackPressed();
                        return;
                }
            }
        });
        xh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                mi0 mi0Var = mi0.this;
                if (!mi0Var.f39273p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(mi0Var.S);
                    AndroidUtilities.runOnUIThread(new sh0(mi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f39267j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f39268k0 = bVar2;
        bVar2.f4358f = new ih.j(xh0Var);
        bVar2.f4359g = xh0Var;
        ei0 ei0Var = new ei0(this, context, d6Var);
        this.G = ei0Var;
        ei0Var.setClipToPadding(false);
        xh0Var.addView(ei0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f44826a;
        r0.a0.i(xh0Var, gVar);
        fi0 fi0Var = new fi0(this, context, d6Var);
        this.K = fi0Var;
        fi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mi0 f41981b;

            {
                this.f41981b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41981b.onBackPressed();
                        return;
                    default:
                        this.f41981b.onBackPressed();
                        return;
                }
            }
        });
        fi0Var.setOnItemClickListener(new i(this, 18));
        fi0Var.setOnScrollListener(new k3(this, 19));
        fi0Var.setItemAnimator(new li.m(null, fi0Var, d6Var));
        ii0 ii0Var = new ii0(this);
        this.M = ii0Var;
        ii0Var.O = new ji0(this);
        fi0Var.setLayoutManager(ii0Var);
        fi0Var.i(new Object());
        wh0 wh0Var = new wh0(this, context, d6Var);
        this.L = wh0Var;
        fi0Var.setAdapter(wh0Var);
        fi0Var.setVerticalScrollBarEnabled(false);
        fi0Var.setOverScrollMode(2);
        ei0Var.addView(fi0Var, w7.z5.c(-2.0f, -1));
        xh0 xh0Var2 = new xh0(this, context, 0);
        this.H = xh0Var2;
        xh0Var.addView(xh0Var2, w7.z5.c(-1.0f, -1));
        this.f39255a0 = new yh0(this, xh0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f39258c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        na0 na0Var = this.d;
        if (na0Var != null) {
            na0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        ah.n0 n0Var;
        if (this.f39261e0 == null && n2Var != null) {
            int i10 = this.f39258c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f39254a);
            this.f39260d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f39260d0.setClipToPadding(false);
            this.f39260d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? dl0Var = new org.telegram.ui.Components.dl0(5, this.f39258c, getContext(), null, this.f39256b);
            this.f39261e0 = dl0Var;
            dl0Var.setClipChildren(false);
            this.f39261e0.setClipToPadding(false);
            this.f39261e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f39261e0.setDelegate(new ci0(this, n2Var));
            this.f39261e0.setTop(false);
            this.f39261e0.setClipChildren(false);
            this.f39261e0.setClipToPadding(false);
            this.f39261e0.setVisibility(0);
            this.f39261e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f39261e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f39261e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f39260d0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f39260d0.addView(this.f39261e0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f39261e0.setScaleY(0.4f);
            this.f39261e0.setScaleX(0.4f);
            this.f39261e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ai0 ai0Var = this.f39261e0;
            if (ai0Var != null && !ai0Var.f25537f1) {
                ai0Var.f25537f1 = true;
                ai0Var.f25539g1 = true;
                ah.t0 t0Var = ai0Var.f25563x0;
                if (t0Var != null && (n0Var = t0Var.f877m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    u41 u41Var = n0Var.f43061h0;
                    if (u41Var != null) {
                        u41Var.invalidate();
                    }
                    k41 k41Var = n0Var.f43063i0;
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
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f39258c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f39274q0) {
            return;
        }
        this.f39274q0 = true;
        zh0 zh0Var = this.X;
        if (zh0Var != null) {
            zh0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new rh0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ai0 ai0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f39281v0;
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
        if (!z10 && (ai0Var = this.f39261e0) != null && this.f39263f0) {
            ai0Var.e();
            if (this.f39261e0.getReactionsWindow() != null && this.f39261e0.getReactionsWindow().f868a != null) {
                this.f39261e0.getReactionsWindow().f868a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f39261e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f39282w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f39284x = true;
        this.f39286y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39281v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f39281v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f39281v0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f39281v0.setDuration(350L);
        this.f39281v0.start();
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
        fi0 fi0Var = this.K;
        if (fi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < fi0Var.getChildCount()) {
                View childAt = fi0Var.getChildAt(i11);
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
            fi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        fi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f39277s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f39274q0) {
            return;
        }
        this.f39274q0 = true;
        wh.f.f(false);
        wh.f fVar = this.f39266i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f39274q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f39287y0 != null && this.f39288z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f39287y0.f26021c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f39288z0);
            this.f39287y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f39271n0 && this.f39261e0 != null) {
            if (this.f39269l0 != null) {
                this.f39271n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f39271n0 = true;
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
        ii0 ii0Var;
        int i10;
        fi0 fi0Var = this.K;
        if (fi0Var != null && fi0Var.getAdapter() != null && (ii0Var = this.M) != null) {
            int h = fi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            ii0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f39283w0 = z10;
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
        if (this.f39261e0 != null && (effect = MessagesController.getInstance(this.f39258c).getEffect(j10)) != null) {
            this.f39261e0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f39257b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f39257b0 = false;
            return;
        }
        ai0 ai0Var = this.f39261e0;
        if (ai0Var != null && ai0Var.getReactionsWindow() != null) {
            if (!this.f39261e0.getReactionsWindow().C) {
                this.f39261e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f39271n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        xh0 xh0Var = this.F;
        setContentView(xh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        xh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(xh0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.i80 i80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39256b;
        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        i80Var.Q(this.f39268k0, fh.c.k(d6Var), false);
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
                if (this.f39285x0 == null) {
                    this.f39285x0 = new org.telegram.ui.Cells.u1(getContext(), this.f39258c, true, null, this.f39256b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f39285x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.g3 g3Var = u1Var.S0;
                g3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23394m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23465r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23560xe = 0;
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
        fi0 fi0Var = this.K;
        fi0Var.getAdapter().l();
        int h = fi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f39272o0;
        vgVar.getLocationOnScreen(iArr);
        zh0 zh0Var = new zh0(this, getContext(), vgVar.f31232b, this.f39256b, vgVar, z10);
        this.X = zh0Var;
        zh0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        zh0 zh0Var2 = this.X;
        zh0Var2.E = vgVar2.E;
        zh0Var2.f31241h0 = vgVar2.f31241h0;
        zh0Var2.f31235c0.t(vgVar2.f31235c0.f29230i, false, true);
        zh0Var2.f31236d0 = vgVar2.f31236d0;
        zh0Var2.setEmoji(vgVar2.f31238f.f29210f[0]);
        zh0Var2.i(vgVar2.f31247s, vgVar2.f31246r, true);
        zh0Var2.P.d(vgVar2.P.f26086c, true);
        zh0Var2.f31249x.d(vgVar2.f31249x.f26086c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        zh0Var2.I = i10;
        zh0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        zh0Var2.M = f7;
        zh0Var2.N = f10;
        this.X.P.d(vgVar.P.f26086c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.mk.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.f11 f11Var = null;
        if (i10 > 0) {
            f11Var = new org.telegram.ui.Components.f11(ai.md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f39287y0 = f11Var;
        if (this.f39288z0 == null) {
            Paint paint = new Paint(1);
            this.f39288z0 = paint;
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
        org.telegram.ui.Components.zm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                mi0 mi0Var = mi0.this;
                gh.b bVar = mi0Var.f39267j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = mi0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                mi0Var.f39262f = bitmap;
                Paint paint = new Paint(1);
                mi0Var.f39270n = paint;
                Bitmap bitmap3 = mi0Var.f39262f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                mi0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                mi0Var.f39275r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, mi0Var.F);
                ViewGroup viewGroup = mi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        xh0 xh0Var = this.H;
        if (xh0Var != null) {
            xh0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f39263f0) {
            return;
        }
        this.f39264g0 = false;
        this.f39263f0 = true;
        this.f39261e0.p(null, null, true);
        this.f39261e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.f39261e0.r(false);
    }

    public void m(long j10) {
    }
}
