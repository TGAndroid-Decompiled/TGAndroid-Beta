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
    public org.telegram.ui.Cells.t1 Q;
    public int R;
    public org.telegram.ui.Components.qf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ce V;
    public org.telegram.ui.Components.vg W;
    public pi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f35154a;
    public final oi0 f35155a0;
    public final org.telegram.ui.ActionBar.f6 f35156b;
    public boolean f35157b0;
    public final int f35158c;
    public float f35159c0;
    public kb0 d;
    public FrameLayout f35160d0;
    public i0.c f35161e;
    public qi0 f35162e0;
    public Bitmap f35163f;
    public boolean f35164f0;
    public boolean f35165g0;
    public BitmapShader h;
    public boolean f35166h0;
    public final wh.g f35167i0;
    public final gh.b f35168j0;
    public final bh.b f35169k0;
    public RectF f35170l0;
    public boolean m0;
    public Paint f35171n;
    public boolean f35172n0;
    public final int[] f35173o0;
    public boolean f35174p0;
    public boolean f35175q0;
    public Matrix f35176r;
    public org.telegram.ui.Cells.t1 f35177r0;
    public boolean f35178s;
    public float f35179s0;
    public float f35180t0;
    public final Rect f35181u0;
    public boolean v;
    public ValueAnimator f35182v0;
    public boolean f35183w;
    public boolean f35184w0;
    public boolean f35185x;
    public org.telegram.ui.Cells.t1 f35186x0;
    public boolean f35187y;
    public org.telegram.ui.Components.f01 f35188y0;
    public Paint f35189z0;

    public cj0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        kb0 kb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f35158c = i10;
        this.f35161e = i0.c.f11450e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f35173o0 = new int[2];
        this.f35175q0 = false;
        this.f35181u0 = new Rect();
        this.f35154a = context;
        this.f35156b = f6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            kb0Var = new kb0(launchActivity, true);
        } else {
            kb0Var = null;
        }
        this.d = kb0Var;
        ni0 ni0Var = new ni0(this, context, 1);
        this.F = ni0Var;
        this.f35167i0 = wh.g.d(1, ni0Var, ni0Var);
        ni0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f38101b;

            {
                this.f38101b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38101b.onBackPressed();
                        return;
                    default:
                        this.f38101b.onBackPressed();
                        return;
                }
            }
        });
        ni0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                cj0 cj0Var = cj0.this;
                if (!cj0Var.f35174p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(cj0Var.S);
                    AndroidUtilities.runOnUIThread(new ii0(cj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f35168j0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f35169k0 = bVar2;
        bVar2.d = new ih.k(ni0Var);
        bVar2.f2680e = ni0Var;
        ui0 ui0Var = new ui0(this, context, f6Var);
        this.G = ui0Var;
        ui0Var.setClipToPadding(false);
        ni0Var.addView(ui0Var, w7.x5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.a0.j(ni0Var, gVar);
        vi0 vi0Var = new vi0(this, context, f6Var);
        this.K = vi0Var;
        vi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f38101b;

            {
                this.f38101b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38101b.onBackPressed();
                        return;
                    default:
                        this.f38101b.onBackPressed();
                        return;
                }
            }
        });
        vi0Var.setOnItemClickListener(new i(this, 17));
        vi0Var.setOnScrollListener(new i3(this, 19));
        vi0Var.setItemAnimator(new ki.o(null, vi0Var, f6Var));
        yi0 yi0Var = new yi0(this);
        this.M = yi0Var;
        yi0Var.O = new zi0(this);
        vi0Var.setLayoutManager(yi0Var);
        vi0Var.i(new Object());
        mi0 mi0Var = new mi0(this, context, f6Var);
        this.L = mi0Var;
        vi0Var.setAdapter(mi0Var);
        vi0Var.setVerticalScrollBarEnabled(false);
        vi0Var.setOverScrollMode(2);
        ui0Var.addView(vi0Var, w7.x5.c(-2.0f, -1));
        ni0 ni0Var2 = new ni0(this, context, 0);
        this.H = ni0Var2;
        ni0Var.addView(ni0Var2, w7.x5.c(-1.0f, -1));
        this.f35155a0 = new oi0(this, ni0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f35158c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        kb0 kb0Var = this.d;
        if (kb0Var != null) {
            kb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        ah.o0 o0Var;
        if (this.f35162e0 == null && n2Var != null) {
            int i10 = this.f35158c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f35154a);
            this.f35160d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f35160d0.setClipToPadding(false);
            this.f35160d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? fk0Var = new org.telegram.ui.Components.fk0(5, this.f35158c, getContext(), null, this.f35156b);
            this.f35162e0 = fk0Var;
            fk0Var.setClipChildren(false);
            this.f35162e0.setClipToPadding(false);
            this.f35162e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f35162e0.setDelegate(new si0(this, n2Var));
            this.f35162e0.setTop(false);
            this.f35162e0.setClipChildren(false);
            this.f35162e0.setClipToPadding(false);
            this.f35162e0.setVisibility(0);
            this.f35162e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f35162e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f35162e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f35160d0, w7.x5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f35160d0.addView(this.f35162e0, w7.x5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f35162e0.setScaleY(0.4f);
            this.f35162e0.setScaleX(0.4f);
            this.f35162e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            qi0 qi0Var = this.f35162e0;
            if (qi0Var != null && !qi0Var.f26120f1) {
                qi0Var.f26120f1 = true;
                qi0Var.f26122g1 = true;
                ah.u0 u0Var = qi0Var.f26146x0;
                if (u0Var != null && (o0Var = u0Var.f707m) != null && !o0Var.K1) {
                    o0Var.K1 = true;
                    o0Var.L1 = true;
                    g61 g61Var = o0Var.f37673h0;
                    if (g61Var != null) {
                        g61Var.invalidate();
                    }
                    w51 w51Var = o0Var.f37675i0;
                    if (w51Var != null) {
                        w51Var.invalidate();
                    }
                }
            }
            new di.j4(this.F, false, new t3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f35158c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f35175q0) {
            return;
        }
        this.f35175q0 = true;
        pi0 pi0Var = this.X;
        if (pi0Var != null) {
            pi0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new hi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        qi0 qi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f35182v0;
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
        if (!z10 && (qi0Var = this.f35162e0) != null && this.f35164f0) {
            qi0Var.e();
            if (this.f35162e0.getReactionsWindow() != null && this.f35162e0.getReactionsWindow().f697a != null) {
                this.f35162e0.getReactionsWindow().f697a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f35162e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f35183w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f35185x = true;
        this.f35187y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35182v0 = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(10, this, z11));
        this.f35182v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f35182v0.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f35182v0.setDuration(350L);
        this.f35182v0.start();
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
        vi0 vi0Var = this.K;
        if (vi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < vi0Var.getChildCount()) {
                View childAt = vi0Var.getChildAt(i11);
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
            vi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        vi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f35178s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f35175q0) {
            return;
        }
        this.f35175q0 = true;
        wh.g.f(false);
        wh.g gVar = this.f35167i0;
        if (gVar != null) {
            gVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f35175q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f35188y0 != null && this.f35189z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f35188y0.f25874c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f35189z0);
            this.f35188y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f35172n0 && this.f35162e0 != null) {
            if (this.f35170l0 != null) {
                this.f35172n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.t1 t1Var = this.Q;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f35172n0 = true;
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
            this.f35184w0 = z10;
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
        if (this.f35162e0 != null && (effect = MessagesController.getInstance(this.f35158c).getEffect(j3)) != null) {
            this.f35162e0.setSelectedReactionAnimated(ah.j1.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f35157b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f35157b0 = false;
            return;
        }
        qi0 qi0Var = this.f35162e0;
        if (qi0Var != null && qi0Var.getReactionsWindow() != null) {
            if (!this.f35162e0.getReactionsWindow().C) {
                this.f35162e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f35172n0 = true;
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

    public final void p(org.telegram.ui.Components.n70 n70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f35156b;
        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        n70Var.Q(this.f35169k0, fh.b.k(f6Var), false);
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
                if (this.f35186x0 == null) {
                    this.f35186x0 = new org.telegram.ui.Cells.t1(getContext(), this.f35158c, true, null, this.f35156b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f35186x0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                bi.y3 y3Var = t1Var.S0;
                y3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f23059m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f23130r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f23209we = 0;
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
                    y3Var.setIgnoreImageSet(false);
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
        vi0 vi0Var = this.K;
        vi0Var.getAdapter().l();
        int h = vi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f35173o0;
        vgVar.getLocationOnScreen(iArr);
        pi0 pi0Var = new pi0(this, getContext(), vgVar.f31251b, this.f35156b, vgVar, z10);
        this.X = pi0Var;
        pi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        pi0 pi0Var2 = this.X;
        pi0Var2.E = vgVar2.E;
        pi0Var2.f31261h0 = vgVar2.f31261h0;
        pi0Var2.f31254c0.q(vgVar2.f31254c0.f29316g, false, true);
        pi0Var2.f31255d0 = vgVar2.f31255d0;
        pi0Var2.setEmoji(vgVar2.f31258f.f28988f[0]);
        pi0Var2.i(vgVar2.f31267s, vgVar2.f31266r, true);
        pi0Var2.P.d(vgVar2.P.f25592c, true);
        pi0Var2.f31269x.d(vgVar2.f31269x.f25592c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        pi0Var2.I = i10;
        pi0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        pi0Var2.M = f7;
        pi0Var2.N = f10;
        this.X.P.d(vgVar.P.f25592c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.wl.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.f01 f01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            f01Var = new org.telegram.ui.Components.f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f35188y0 = f01Var;
        if (this.f35189z0 == null) {
            Paint paint = new Paint(1);
            this.f35189z0 = paint;
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
        wh.g.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.am0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                cj0 cj0Var = cj0.this;
                gh.b bVar = cj0Var.f35168j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = cj0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                cj0Var.f35163f = bitmap;
                Paint paint = new Paint(1);
                cj0Var.f35171n = paint;
                Bitmap bitmap3 = cj0Var.f35163f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                cj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                cj0Var.f35176r = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, cj0Var.F);
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
        if (this.f35164f0) {
            return;
        }
        this.f35165g0 = false;
        this.f35164f0 = true;
        this.f35162e0.p(null, null, true);
        this.f35162e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
        this.f35162e0.r(false);
    }

    public void m(long j3) {
    }
}
