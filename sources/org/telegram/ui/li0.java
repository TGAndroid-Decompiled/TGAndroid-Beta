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
public class li0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public final wh0 B;
    public final di0 C;
    public final wh0 D;
    public long E;
    public org.telegram.ui.Components.i5 F;
    public final ei0 G;
    public final vh0 H;
    public final hi0 I;
    public final ArrayList J;
    public int K;
    public final a0.h L;
    public org.telegram.ui.Cells.t1 M;
    public int N;
    public org.telegram.ui.Components.ff O;
    public final Paint P;
    public org.telegram.ui.Components.d Q;
    public org.telegram.ui.Components.sd R;
    public org.telegram.ui.Components.lg S;
    public yh0 T;
    public int U;
    public ViewGroup V;
    public final xh0 W;
    public boolean X;
    public float Y;
    public FrameLayout Z;
    public final Context f40147a;
    public zh0 f40148a0;
    public final org.telegram.ui.ActionBar.b6 f40149b;
    public boolean f40150b0;
    public final int f40151c;
    public boolean f40152c0;
    public ff.t0 d;
    public boolean f40153d0;
    public i0.b f40154e;
    public final dh.k f40155e0;
    public Bitmap f40156f;
    public final ng.b f40157f0;
    public final ig.a f40158g0;
    public BitmapShader h;
    public RectF f40159h0;
    public boolean f40160i0;
    public boolean f40161j0;
    public final int[] f40162k0;
    public boolean f40163l0;
    public boolean m0;
    public Paint f40164n;
    public org.telegram.ui.Cells.t1 f40165n0;
    public float f40166o0;
    public float f40167p0;
    public final Rect f40168q0;
    public Matrix f40169r;
    public ValueAnimator f40170r0;
    public boolean f40171s;
    public boolean f40172s0;
    public org.telegram.ui.Cells.t1 f40173t0;
    public org.telegram.ui.Components.nz0 f40174u0;
    public boolean v;
    public Paint f40175v0;
    public boolean f40176w;
    public boolean f40177x;
    public boolean f40178y;

    public li0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, R.style.TransparentDialog);
        ff.t0 t0Var;
        int i9 = UserConfig.selectedAccount;
        this.f40151c = i9;
        this.f40154e = i0.b.f10847e;
        this.J = new ArrayList();
        this.L = new a0.h();
        this.P = new Paint(1);
        this.f40162k0 = new int[2];
        this.m0 = false;
        this.f40168q0 = new Rect();
        this.f40147a = context;
        this.f40149b = b6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            t0Var = new ff.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.d = t0Var;
        wh0 wh0Var = new wh0(this, context, 1);
        this.B = wh0Var;
        this.f40155e0 = dh.k.d(1, wh0Var, wh0Var);
        wh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final li0 f43007b;

            {
                this.f43007b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43007b.onBackPressed();
                        return;
                    default:
                        this.f43007b.onBackPressed();
                        return;
                }
            }
        });
        wh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                li0 li0Var = li0.this;
                if (!li0Var.f40163l0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(li0Var.O);
                    AndroidUtilities.runOnUIThread(new rh0(li0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ng.b bVar = new ng.b();
        this.f40157f0 = bVar;
        ig.a aVar = new ig.a(bVar);
        this.f40158g0 = aVar;
        aVar.d = new pg.i(wh0Var);
        aVar.f11131e = wh0Var;
        di0 di0Var = new di0(this, context, b6Var);
        this.C = di0Var;
        di0Var.setClipToPadding(false);
        wh0Var.addView(di0Var, g7.e6.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(wh0Var, gVar);
        ei0 ei0Var = new ei0(this, context, b6Var);
        this.G = ei0Var;
        ei0Var.setOnClickListener(new View.OnClickListener(this) {
            public final li0 f43007b;

            {
                this.f43007b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43007b.onBackPressed();
                        return;
                    default:
                        this.f43007b.onBackPressed();
                        return;
                }
            }
        });
        ei0Var.setOnItemClickListener(new i(this, 17));
        ei0Var.setOnScrollListener(new l3(this, 19));
        ei0Var.setItemAnimator(new rh.m(null, ei0Var, b6Var));
        hi0 hi0Var = new hi0(this);
        this.I = hi0Var;
        hi0Var.O = new ii0(this);
        ei0Var.setLayoutManager(hi0Var);
        ei0Var.i(new Object());
        vh0 vh0Var = new vh0(this, context, b6Var);
        this.H = vh0Var;
        ei0Var.setAdapter(vh0Var);
        ei0Var.setVerticalScrollBarEnabled(false);
        ei0Var.setOverScrollMode(2);
        di0Var.addView(ei0Var, g7.e6.c(-2.0f, -1));
        wh0 wh0Var2 = new wh0(this, context, 0);
        this.D = wh0Var2;
        wh0Var.addView(wh0Var2, g7.e6.c(-1.0f, -1));
        this.W = new xh0(this, wh0Var2, i9);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f40151c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        ff.t0 t0Var = this.d;
        if (t0Var != null) {
            t0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var) {
        hg.z zVar;
        if (this.f40148a0 == null && o2Var != null) {
            int i9 = this.f40151c;
            MessagesController.getInstance(i9).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f40147a);
            this.Z = frameLayout;
            frameLayout.setClipChildren(false);
            this.Z.setClipToPadding(false);
            this.Z.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? uj0Var = new org.telegram.ui.Components.uj0(5, this.f40151c, getContext(), null, this.f40149b);
            this.f40148a0 = uj0Var;
            uj0Var.setClipChildren(false);
            this.f40148a0.setClipToPadding(false);
            this.f40148a0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f40148a0.setDelegate(new bi0(this, o2Var));
            this.f40148a0.setTop(false);
            this.f40148a0.setClipChildren(false);
            this.f40148a0.setClipToPadding(false);
            this.f40148a0.setVisibility(0);
            this.f40148a0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f40148a0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f40148a0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.C.addView(this.Z, g7.e6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Z.addView(this.f40148a0, g7.e6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40148a0.setScaleY(0.4f);
            this.f40148a0.setScaleX(0.4f);
            this.f40148a0.setAlpha(0.0f);
            if (MessagesController.getInstance(i9).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            zh0 zh0Var = this.f40148a0;
            if (zh0Var != null && !zh0Var.f33047b1) {
                zh0Var.f33047b1 = true;
                zh0Var.f33050c1 = true;
                hg.e0 e0Var = zh0Var.f33074t0;
                if (e0Var != null && (zVar = e0Var.f10584m) != null && !zVar.G1) {
                    zVar.G1 = true;
                    zVar.H1 = true;
                    y41 y41Var = zVar.f36669d0;
                    if (y41Var != null) {
                        y41Var.invalidate();
                    }
                    o41 o41Var = zVar.f36672e0;
                    if (o41Var != null) {
                        o41Var.invalidate();
                    }
                }
            }
            new kh.b4(this.B, false, new w3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f40151c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        yh0 yh0Var = this.T;
        if (yh0Var != null) {
            yh0Var.invalidate();
        }
        org.telegram.ui.Components.lg lgVar = this.S;
        if (lgVar != null) {
            lgVar.invalidate();
        }
        e(new qh0(this, 2), false);
        this.B.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        zh0 zh0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f40170r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.V) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.V);
        }
        float f10 = 0.0f;
        if (!z10 && (zh0Var = this.f40148a0) != null && this.f40150b0) {
            zh0Var.e();
            if (this.f40148a0.getReactionsWindow() != null && this.f40148a0.getReactionsWindow().f10574a != null) {
                this.f40148a0.getReactionsWindow().f10574a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f40148a0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f40176w = true;
        this.v = !z10;
        this.G.invalidate();
        this.f40177x = true;
        this.f40178y = true;
        float f11 = this.A;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f40170r0 = ofFloat;
        ofFloat.addUpdateListener(new hg.y(10, this, z11));
        this.f40170r0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f40170r0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f40170r0.setDuration(350L);
        this.f40170r0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l10 = l(messageObject);
        if (l10 != null) {
            l10.calculate();
            ArrayList<MessageObject> arrayList = l10.messages;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                MessageObject messageObject2 = arrayList.get(i9);
                i9++;
                g(messageObject2);
            }
            return;
        }
        g(messageObject);
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.t1 t1Var;
        ei0 ei0Var = this.G;
        if (ei0Var == null) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < ei0Var.getChildCount()) {
                View childAt = ei0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i10++;
            } else {
                t1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.J;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) == messageObject) {
                i11 = (arrayList.size() - 1) - i9;
            }
            i9++;
        }
        if (t1Var2 == null) {
            ei0Var.getAdapter().m(i11);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        ei0Var.getAdapter().m(i11);
    }

    public final void h(boolean z10) {
        this.f40171s = z10;
        dismiss();
    }

    public final void i() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        dh.k.f(false);
        dh.k kVar = this.f40155e0;
        if (kVar != null) {
            kVar.b(this.B);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.m0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f40174u0 != null && this.f40175v0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f40174u0.f31223c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = dp / 2.0f;
            float f17 = f14 - f16;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f17, f15 - dp2, f14 + f16, f15 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f40175v0);
            this.f40174u0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f40161j0 && this.f40148a0 != null) {
            if (this.f40159h0 != null) {
                this.f40161j0 = true;
                return this.E;
            }
            org.telegram.ui.Cells.t1 t1Var = this.M;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f40161j0 = true;
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
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.L.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void n(boolean z10) {
        hi0 hi0Var;
        int i9;
        ei0 ei0Var = this.G;
        if (ei0Var != null && ei0Var.getAdapter() != null && (hi0Var = this.I) != null) {
            int h = ei0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i9 = h % 10;
                } else {
                    i9 = 0;
                }
            } else {
                i9 = h - 1;
            }
            hi0Var.i1(i9, AndroidUtilities.dp(12.0f), z10);
            this.f40172s0 = z10;
        }
    }

    public final void o(long j10) {
        int i9;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.E = j10;
        boolean i10 = this.L.i();
        ArrayList arrayList = this.J;
        if (!i10 && arrayList.size() >= 10) {
            i9 = arrayList.size() % 10;
        } else {
            i9 = 0;
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            messageObject = (MessageObject) arrayList.get(i9);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f40148a0 != null && (effect = MessagesController.getInstance(this.f40151c).getEffect(j10)) != null) {
            this.f40148a0.setSelectedReactionAnimated(hg.r0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.X) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.X = false;
            return;
        }
        zh0 zh0Var = this.f40148a0;
        if (zh0Var != null && zh0Var.getReactionsWindow() != null) {
            if (!this.f40148a0.getReactionsWindow().C) {
                this.f40148a0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f40161j0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wh0 wh0Var = this.B;
        setContentView(wh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        wh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(wh0Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    public final void p(org.telegram.ui.Components.x60 x60Var) {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        org.telegram.ui.ActionBar.b6 b6Var = this.f40149b;
        x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        x60Var.Q(this.f40158g0, mg.c.j(b6Var), false);
        ViewGroup viewGroup = x60Var.A;
        this.V = viewGroup;
        this.C.addView(viewGroup, g7.e6.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.L;
            if (i12 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
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
                    int i13 = 0;
                    while (true) {
                        if (i13 < groupedMessages.messages.size()) {
                            if (groupedMessages.messages.get(i13).getId() == messageObject.getId()) {
                                break;
                            }
                            i13++;
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
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((MessageObject.GroupedMessages) hVar.n(i14)).calculate();
        }
        ArrayList arrayList2 = this.J;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.K;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i9 = i15;
                i10 = 0;
            } else {
                if (this.f40173t0 == null) {
                    this.f40173t0 = new org.telegram.ui.Cells.t1(getContext(), this.f40151c, true, null, this.f40149b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f40173t0;
                t1Var.J7 = false;
                t1Var.L7 = false;
                t1Var.M7 = false;
                t1Var.N7 = false;
                t1Var.O7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ih.z2 z2Var = t1Var.O0;
                z2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.i9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.B9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f25495n9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f25570se = 0;
                    i10 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i10 += t1Var.F8;
                        }
                    }
                    i9 = i15;
                } else {
                    i9 = i15;
                    t1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    z2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.n4();
                    i10 = t1Var.F8;
                }
            }
            this.K = Math.max(i16, i10);
            i15 = i9 + 1;
        }
        ei0 ei0Var = this.G;
        ei0Var.getAdapter().l();
        int h = ei0Var.getAdapter().h();
        if (h > 10) {
            i11 = h % 10;
        }
        this.I.i1(i11, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.lg r(org.telegram.ui.Components.lg lgVar, boolean z10, View.OnClickListener onClickListener) {
        this.S = lgVar;
        int[] iArr = this.f40162k0;
        lgVar.getLocationOnScreen(iArr);
        yh0 yh0Var = new yh0(this, getContext(), lgVar.f30433b, this.f40149b, lgVar, z10);
        this.T = yh0Var;
        yh0Var.setScaleX(this.S.getScaleX());
        this.T.setScaleY(this.S.getScaleY());
        org.telegram.ui.Components.lg lgVar2 = this.S;
        yh0 yh0Var2 = this.T;
        yh0Var2.A = lgVar2.A;
        yh0Var2.f30437d0 = lgVar2.f30437d0;
        yh0Var2.V.q(lgVar2.V.f29337g, false, true);
        yh0Var2.W = lgVar2.W;
        yh0Var2.setEmoji(lgVar2.f30440f.f29319f[0]);
        yh0Var2.i(lgVar2.f30445s, lgVar2.f30444r, true);
        yh0Var2.L.d(lgVar2.L.f34854c, true);
        yh0Var2.f30447x.d(lgVar2.f30447x.f34854c, true);
        int i9 = lgVar2.E;
        int i10 = lgVar2.F;
        yh0Var2.E = i9;
        yh0Var2.F = i10;
        float f10 = lgVar2.I;
        float f11 = lgVar2.J;
        yh0Var2.I = f10;
        yh0Var2.J = f11;
        this.T.L.d(lgVar.L.f34854c, true);
        this.T.setOnClickListener(onClickListener);
        this.C.addView(this.T, new ViewGroup.LayoutParams(lgVar.getWidth(), lgVar.getHeight()));
        org.telegram.ui.Components.lg lgVar3 = this.S;
        lgVar.getHeight();
        this.U = lgVar3.m();
        int i11 = iArr[0];
        int width = this.S.getWidth();
        org.telegram.ui.Components.lg lgVar4 = this.S;
        lgVar.getHeight();
        iArr[0] = org.telegram.messenger.ll.D(6.0f, width - lgVar4.m(), i11);
        return this.T;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.nz0 nz0Var = null;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 > 0) {
            nz0Var = new org.telegram.ui.Components.nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f40174u0 = nz0Var;
        if (this.f40175v0 == null) {
            Paint paint = new Paint(1);
            this.f40175v0 = paint;
            paint.setColor(1073741824);
        }
        this.G.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    if (i9 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i10++;
            } else {
                this.H.l();
                return;
            }
        }
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        dh.k.f(true);
        super.show();
        final float alpha = this.S.getAlpha();
        org.telegram.ui.Components.lg lgVar = this.S;
        if (lgVar != null) {
            lgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.ll0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                li0 li0Var = li0.this;
                ng.b bVar = li0Var.f40157f0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.lg lgVar2 = li0Var.S;
                if (lgVar2 != null) {
                    lgVar2.setAlpha(alpha);
                }
                li0Var.f40156f = bitmap;
                Paint paint = new Paint(1);
                li0Var.f40164n = paint;
                Bitmap bitmap3 = li0Var.f40156f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                li0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                li0Var.f40169r = new Matrix();
                bVar.a(bitmap2);
                og.d.c(bVar, li0Var.B);
                ViewGroup viewGroup = li0Var.V;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        wh0 wh0Var = this.D;
        if (wh0Var != null) {
            wh0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f40150b0) {
            return;
        }
        this.f40152c0 = false;
        this.f40150b0 = true;
        this.f40148a0.p(null, null, true);
        this.f40148a0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        this.f40148a0.r(false);
    }

    public void m(long j10) {
    }
}
