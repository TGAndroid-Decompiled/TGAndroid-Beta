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
public class dj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final oi0 F;
    public final vi0 G;
    public final oi0 H;
    public long I;
    public org.telegram.ui.Components.n5 J;
    public final wi0 K;
    public final ni0 L;
    public final zi0 M;
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
    public qi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f33078a;
    public final pi0 f33079a0;
    public final org.telegram.ui.ActionBar.f6 f33080b;
    public boolean f33081b0;
    public final int f33082c;
    public float f33083c0;
    public mb0 d;
    public FrameLayout f33084d0;
    public i0.b e;
    public ri0 f33085e0;
    public Bitmap f33086f;
    public boolean f33087f0;
    public boolean f33088g0;
    public BitmapShader h;
    public boolean f33089h0;
    public final vh.f f33090i0;
    public final fh.b f33091j0;
    public final ah.c f33092k0;
    public RectF f33093l0;
    public boolean m0;
    public Paint f33094n;
    public boolean f33095n0;
    public final int[] f33096o0;
    public boolean f33097p0;
    public boolean f33098q0;
    public Matrix f33099r;
    public org.telegram.ui.Cells.u1 f33100r0;
    public boolean f33101s;
    public float f33102s0;
    public float f33103t0;
    public final Rect f33104u0;
    public boolean v;
    public ValueAnimator f33105v0;
    public boolean f33106w;
    public boolean f33107w0;
    public boolean f33108x;
    public org.telegram.ui.Cells.u1 f33109x0;
    public boolean f33110y;
    public org.telegram.ui.Components.w01 f33111y0;
    public Paint f33112z0;

    public dj0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        mb0 mb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f33082c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f33096o0 = new int[2];
        this.f33098q0 = false;
        this.f33104u0 = new Rect();
        this.f33078a = context;
        this.f33080b = f6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            mb0Var = new mb0(launchActivity, true);
        } else {
            mb0Var = null;
        }
        this.d = mb0Var;
        oi0 oi0Var = new oi0(this, context, 1);
        this.F = oi0Var;
        this.f33090i0 = vh.f.d(1, oi0Var, oi0Var);
        oi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dj0 f35476b;

            {
                this.f35476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35476b.onBackPressed();
                        return;
                    default:
                        this.f35476b.onBackPressed();
                        return;
                }
            }
        });
        oi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                dj0 dj0Var = dj0.this;
                if (!dj0Var.f33097p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(dj0Var.S);
                    AndroidUtilities.runOnUIThread(new ji0(dj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f33091j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f33092k0 = cVar;
        cVar.f422f = new hh.k(oi0Var);
        cVar.f423g = oi0Var;
        vi0 vi0Var = new vi0(this, context, f6Var);
        this.G = vi0Var;
        vi0Var.setClipToPadding(false);
        oi0Var.addView(vi0Var, w7.y5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f42163a;
        r0.a0.j(oi0Var, gVar);
        wi0 wi0Var = new wi0(this, context, f6Var);
        this.K = wi0Var;
        wi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dj0 f35476b;

            {
                this.f35476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35476b.onBackPressed();
                        return;
                    default:
                        this.f35476b.onBackPressed();
                        return;
                }
            }
        });
        wi0Var.setOnItemClickListener(new i(this, 17));
        wi0Var.setOnScrollListener(new h3(this, 19));
        wi0Var.setItemAnimator(new ji.n(null, wi0Var, f6Var));
        zi0 zi0Var = new zi0(this);
        this.M = zi0Var;
        zi0Var.O = new aj0(this);
        wi0Var.setLayoutManager(zi0Var);
        wi0Var.i(new Object());
        ni0 ni0Var = new ni0(this, context, f6Var);
        this.L = ni0Var;
        wi0Var.setAdapter(ni0Var);
        wi0Var.setVerticalScrollBarEnabled(false);
        wi0Var.setOverScrollMode(2);
        vi0Var.addView(wi0Var, w7.y5.c(-2.0f, -1));
        oi0 oi0Var2 = new oi0(this, context, 0);
        this.H = oi0Var2;
        oi0Var.addView(oi0Var2, w7.y5.c(-1.0f, -1));
        this.f33079a0 = new pi0(this, oi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f33082c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        mb0 mb0Var = this.d;
        if (mb0Var != null) {
            mb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        zg.y yVar;
        if (this.f33085e0 == null && n2Var != null) {
            int i10 = this.f33082c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f33078a);
            this.f33084d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f33084d0.setClipToPadding(false);
            this.f33084d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? sk0Var = new org.telegram.ui.Components.sk0(5, this.f33082c, getContext(), null, this.f33080b);
            this.f33085e0 = sk0Var;
            sk0Var.setClipChildren(false);
            this.f33085e0.setClipToPadding(false);
            this.f33085e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f33085e0.setDelegate(new ti0(this, n2Var));
            this.f33085e0.setTop(false);
            this.f33085e0.setClipChildren(false);
            this.f33085e0.setClipToPadding(false);
            this.f33085e0.setVisibility(0);
            this.f33085e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f33085e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f33085e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f33084d0, w7.y5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33084d0.addView(this.f33085e0, w7.y5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33085e0.setScaleY(0.4f);
            this.f33085e0.setScaleX(0.4f);
            this.f33085e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ri0 ri0Var = this.f33085e0;
            if (ri0Var != null && !ri0Var.f28241f1) {
                ri0Var.f28241f1 = true;
                ri0Var.f28243g1 = true;
                zg.c0 c0Var = ri0Var.f28267x0;
                if (c0Var != null && (yVar = c0Var.f49312m) != null && !yVar.K1) {
                    yVar.K1 = true;
                    yVar.L1 = true;
                    g61 g61Var = yVar.f34817h0;
                    if (g61Var != null) {
                        g61Var.invalidate();
                    }
                    w51 w51Var = yVar.f34819i0;
                    if (w51Var != null) {
                        w51Var.invalidate();
                    }
                }
            }
            new ci.j4(this.F, false, new s3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f33082c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f33098q0) {
            return;
        }
        this.f33098q0 = true;
        qi0 qi0Var = this.X;
        if (qi0Var != null) {
            qi0Var.invalidate();
        }
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.invalidate();
        }
        e(new ii0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ri0 ri0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f33105v0;
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
        if (!z10 && (ri0Var = this.f33085e0) != null && this.f33087f0) {
            ri0Var.e();
            if (this.f33085e0.getReactionsWindow() != null && this.f33085e0.getReactionsWindow().f49303a != null) {
                this.f33085e0.getReactionsWindow().f49303a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f33085e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f33106w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f33108x = true;
        this.f33110y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f33105v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f33105v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f33105v0.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f33105v0.setDuration(350L);
        this.f33105v0.start();
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
        wi0 wi0Var = this.K;
        if (wi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < wi0Var.getChildCount()) {
                View childAt = wi0Var.getChildAt(i11);
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
            wi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        wi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f33101s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f33098q0) {
            return;
        }
        this.f33098q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f33090i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f33098q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f33111y0 != null && this.f33112z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f33111y0.f29862c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f33112z0);
            this.f33111y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f33095n0 && this.f33085e0 != null) {
            if (this.f33093l0 != null) {
                this.f33095n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f33095n0 = true;
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
        zi0 zi0Var;
        int i10;
        wi0 wi0Var = this.K;
        if (wi0Var != null && wi0Var.getAdapter() != null && (zi0Var = this.M) != null) {
            int h = wi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            zi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f33107w0 = z10;
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
        if (this.f33085e0 != null && (effect = MessagesController.getInstance(this.f33082c).getEffect(j3)) != null) {
            this.f33085e0.setSelectedReactionAnimated(zg.p0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f33081b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f33081b0 = false;
            return;
        }
        ri0 ri0Var = this.f33085e0;
        if (ri0Var != null && ri0Var.getReactionsWindow() != null) {
            if (!this.f33085e0.getReactionsWindow().C) {
                this.f33085e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f33095n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        oi0 oi0Var = this.F;
        setContentView(oi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        oi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(oi0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.y70 y70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33080b;
        y70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        y70Var.Q(this.f33092k0, eh.b.k(f6Var), false);
        ViewGroup viewGroup = y70Var.A;
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
                if (this.f33109x0 == null) {
                    this.f33109x0 = new org.telegram.ui.Cells.u1(getContext(), this.f33082c, true, null, this.f33080b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f33109x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f21417m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f21488r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f21582xe = 0;
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
        wi0 wi0Var = this.K;
        wi0Var.getAdapter().l();
        int h = wi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.ug r(org.telegram.ui.Components.ug ugVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = ugVar;
        int[] iArr = this.f33096o0;
        ugVar.getLocationOnScreen(iArr);
        qi0 qi0Var = new qi0(this, getContext(), ugVar.f28760b, this.f33080b, ugVar, z10);
        this.X = qi0Var;
        qi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.ug ugVar2 = this.W;
        qi0 qi0Var2 = this.X;
        qi0Var2.E = ugVar2.E;
        qi0Var2.f28769h0 = ugVar2.f28769h0;
        qi0Var2.f28763c0.q(ugVar2.f28763c0.f26646g, false, true);
        qi0Var2.f28764d0 = ugVar2.f28764d0;
        qi0Var2.setEmoji(ugVar2.f28766f.f26634f[0]);
        qi0Var2.i(ugVar2.f28775s, ugVar2.f28774r, true);
        qi0Var2.P.d(ugVar2.P.f23570c, true);
        qi0Var2.f28777x.d(ugVar2.f28777x.f23570c, true);
        int i10 = ugVar2.I;
        int i11 = ugVar2.J;
        qi0Var2.I = i10;
        qi0Var2.J = i11;
        float f7 = ugVar2.M;
        float f10 = ugVar2.N;
        qi0Var2.M = f7;
        qi0Var2.N = f10;
        this.X.P.d(ugVar.P.f23570c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(ugVar.getWidth(), ugVar.getHeight()));
        org.telegram.ui.Components.ug ugVar3 = this.W;
        ugVar.getHeight();
        this.Y = ugVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.ug ugVar4 = this.W;
        ugVar.getHeight();
        iArr[0] = org.telegram.messenger.rk.D(6.0f, width - ugVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.w01 w01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            w01Var = new org.telegram.ui.Components.w01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f33111y0 = w01Var;
        if (this.f33112z0 == null) {
            Paint paint = new Paint(1);
            this.f33112z0 = paint;
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
        vh.f.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.om0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                dj0 dj0Var = dj0.this;
                fh.b bVar = dj0Var.f33091j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.ug ugVar2 = dj0Var.W;
                if (ugVar2 != null) {
                    ugVar2.setAlpha(alpha);
                }
                dj0Var.f33086f = bitmap;
                Paint paint = new Paint(1);
                dj0Var.f33094n = paint;
                Bitmap bitmap3 = dj0Var.f33086f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                dj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                dj0Var.f33099r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, dj0Var.F);
                ViewGroup viewGroup = dj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        oi0 oi0Var = this.H;
        if (oi0Var != null) {
            oi0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f33087f0) {
            return;
        }
        this.f33088g0 = false;
        this.f33087f0 = true;
        this.f33085e0.p(null, null, true);
        this.f33085e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        this.f33085e0.r(false);
    }

    public void m(long j3) {
    }
}
