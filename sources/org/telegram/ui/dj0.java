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
    public org.telegram.ui.Components.m5 J;
    public final wi0 K;
    public final ni0 L;
    public final zi0 M;
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
    public qi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f33135a;
    public final pi0 f33136a0;
    public final org.telegram.ui.ActionBar.f6 f33137b;
    public boolean f33138b0;
    public final int f33139c;
    public float f33140c0;
    public mb0 d;
    public FrameLayout f33141d0;
    public i0.b e;
    public ri0 f33142e0;
    public Bitmap f33143f;
    public boolean f33144f0;
    public boolean f33145g0;
    public BitmapShader h;
    public boolean f33146h0;
    public final vh.g f33147i0;
    public final fh.b f33148j0;
    public final ah.c f33149k0;
    public RectF f33150l0;
    public boolean m0;
    public Paint f33151n;
    public boolean f33152n0;
    public final int[] f33153o0;
    public boolean f33154p0;
    public boolean f33155q0;
    public Matrix f33156r;
    public org.telegram.ui.Cells.t1 f33157r0;
    public boolean f33158s;
    public float f33159s0;
    public float f33160t0;
    public final Rect f33161u0;
    public boolean v;
    public ValueAnimator f33162v0;
    public boolean f33163w;
    public boolean f33164w0;
    public boolean f33165x;
    public org.telegram.ui.Cells.t1 f33166x0;
    public boolean f33167y;
    public org.telegram.ui.Components.h01 f33168y0;
    public Paint f33169z0;

    public dj0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        mb0 mb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f33139c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f33153o0 = new int[2];
        this.f33155q0 = false;
        this.f33161u0 = new Rect();
        this.f33135a = context;
        this.f33137b = f6Var;
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
        this.f33147i0 = vh.g.d(1, oi0Var, oi0Var);
        oi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dj0 f35556b;

            {
                this.f35556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35556b.onBackPressed();
                        return;
                    default:
                        this.f35556b.onBackPressed();
                        return;
                }
            }
        });
        oi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                dj0 dj0Var = dj0.this;
                if (!dj0Var.f33154p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(dj0Var.S);
                    AndroidUtilities.runOnUIThread(new ji0(dj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f33148j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f33149k0 = cVar;
        cVar.f425f = new hh.k(oi0Var);
        cVar.f426g = oi0Var;
        vi0 vi0Var = new vi0(this, context, f6Var);
        this.G = vi0Var;
        vi0Var.setClipToPadding(false);
        oi0Var.addView(vi0Var, w7.x5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f41865a;
        r0.a0.j(oi0Var, gVar);
        wi0 wi0Var = new wi0(this, context, f6Var);
        this.K = wi0Var;
        wi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dj0 f35556b;

            {
                this.f35556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35556b.onBackPressed();
                        return;
                    default:
                        this.f35556b.onBackPressed();
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
        vi0Var.addView(wi0Var, w7.x5.c(-2.0f, -1));
        oi0 oi0Var2 = new oi0(this, context, 0);
        this.H = oi0Var2;
        oi0Var.addView(oi0Var2, w7.x5.c(-1.0f, -1));
        this.f33136a0 = new pi0(this, oi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f33139c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        mb0 mb0Var = this.d;
        if (mb0Var != null) {
            mb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var) {
        zg.y yVar;
        if (this.f33142e0 == null && o2Var != null) {
            int i10 = this.f33139c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f33135a);
            this.f33141d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f33141d0.setClipToPadding(false);
            this.f33141d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? gk0Var = new org.telegram.ui.Components.gk0(5, this.f33139c, getContext(), null, this.f33137b);
            this.f33142e0 = gk0Var;
            gk0Var.setClipChildren(false);
            this.f33142e0.setClipToPadding(false);
            this.f33142e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f33142e0.setDelegate(new ti0(this, o2Var));
            this.f33142e0.setTop(false);
            this.f33142e0.setClipChildren(false);
            this.f33142e0.setClipToPadding(false);
            this.f33142e0.setVisibility(0);
            this.f33142e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f33142e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f33142e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f33141d0, w7.x5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33141d0.addView(this.f33142e0, w7.x5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33142e0.setScaleY(0.4f);
            this.f33142e0.setScaleX(0.4f);
            this.f33142e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ri0 ri0Var = this.f33142e0;
            if (ri0Var != null && !ri0Var.f24280f1) {
                ri0Var.f24280f1 = true;
                ri0Var.f24282g1 = true;
                zg.c0 c0Var = ri0Var.f24306x0;
                if (c0Var != null && (yVar = c0Var.f49015m) != null && !yVar.K1) {
                    yVar.K1 = true;
                    yVar.L1 = true;
                    f61 f61Var = yVar.f34461h0;
                    if (f61Var != null) {
                        f61Var.invalidate();
                    }
                    v51 v51Var = yVar.f34463i0;
                    if (v51Var != null) {
                        v51Var.invalidate();
                    }
                }
            }
            new ci.j4(this.F, false, new s3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f33139c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f33155q0) {
            return;
        }
        this.f33155q0 = true;
        qi0 qi0Var = this.X;
        if (qi0Var != null) {
            qi0Var.invalidate();
        }
        org.telegram.ui.Components.tg tgVar = this.W;
        if (tgVar != null) {
            tgVar.invalidate();
        }
        e(new ii0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ri0 ri0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f33162v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (ri0Var = this.f33142e0) != null && this.f33144f0) {
            ri0Var.e();
            if (this.f33142e0.getReactionsWindow() != null && this.f33142e0.getReactionsWindow().f49006a != null) {
                this.f33142e0.getReactionsWindow().f49006a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f33142e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f33163w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f33165x = true;
        this.f33167y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f33162v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f33162v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f33162v0.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f33162v0.setDuration(350L);
        this.f33162v0.start();
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
        wi0 wi0Var = this.K;
        if (wi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < wi0Var.getChildCount()) {
                View childAt = wi0Var.getChildAt(i11);
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
            wi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        wi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f33158s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f33155q0) {
            return;
        }
        this.f33155q0 = true;
        vh.g.f(false);
        vh.g gVar = this.f33147i0;
        if (gVar != null) {
            gVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f33155q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f33168y0 != null && this.f33169z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f33168y0.f24439c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f33169z0);
            this.f33168y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f33152n0 && this.f33142e0 != null) {
            if (this.f33150l0 != null) {
                this.f33152n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.t1 t1Var = this.Q;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f33152n0 = true;
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
            this.f33164w0 = z10;
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
        if (this.f33142e0 != null && (effect = MessagesController.getInstance(this.f33139c).getEffect(j3)) != null) {
            this.f33142e0.setSelectedReactionAnimated(zg.p0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f33138b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f33138b0 = false;
            return;
        }
        ri0 ri0Var = this.f33142e0;
        if (ri0Var != null && ri0Var.getReactionsWindow() != null) {
            if (!this.f33142e0.getReactionsWindow().C) {
                this.f33142e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f33152n0 = true;
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

    public final void p(org.telegram.ui.Components.n70 n70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33137b;
        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        n70Var.Q(this.f33149k0, eh.b.k(f6Var), false);
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
                if (this.f33166x0 == null) {
                    this.f33166x0 = new org.telegram.ui.Cells.t1(getContext(), this.f33139c, true, null, this.f33137b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f33166x0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = t1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f21159m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f21230r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.f21309we = 0;
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
        wi0 wi0Var = this.K;
        wi0Var.getAdapter().l();
        int h = wi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.tg r(org.telegram.ui.Components.tg tgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = tgVar;
        int[] iArr = this.f33153o0;
        tgVar.getLocationOnScreen(iArr);
        qi0 qi0Var = new qi0(this, getContext(), tgVar.f28077b, this.f33137b, tgVar, z10);
        this.X = qi0Var;
        qi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.tg tgVar2 = this.W;
        qi0 qi0Var2 = this.X;
        qi0Var2.E = tgVar2.E;
        qi0Var2.f28086h0 = tgVar2.f28086h0;
        qi0Var2.f28080c0.q(tgVar2.f28080c0.f26070g, false, true);
        qi0Var2.f28081d0 = tgVar2.f28081d0;
        qi0Var2.setEmoji(tgVar2.f28083f.f26054f[0]);
        qi0Var2.i(tgVar2.f28092s, tgVar2.f28091r, true);
        qi0Var2.P.d(tgVar2.P.f22937c, true);
        qi0Var2.f28094x.d(tgVar2.f28094x.f22937c, true);
        int i10 = tgVar2.I;
        int i11 = tgVar2.J;
        qi0Var2.I = i10;
        qi0Var2.J = i11;
        float f7 = tgVar2.M;
        float f10 = tgVar2.N;
        qi0Var2.M = f7;
        qi0Var2.N = f10;
        this.X.P.d(tgVar.P.f22937c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(tgVar.getWidth(), tgVar.getHeight()));
        org.telegram.ui.Components.tg tgVar3 = this.W;
        tgVar.getHeight();
        this.Y = tgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.tg tgVar4 = this.W;
        tgVar.getHeight();
        iArr[0] = org.telegram.messenger.wl.D(6.0f, width - tgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.h01 h01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            h01Var = new org.telegram.ui.Components.h01(yh.y7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f33168y0 = h01Var;
        if (this.f33169z0 == null) {
            Paint paint = new Paint(1);
            this.f33169z0 = paint;
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
        org.telegram.ui.Components.bm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                dj0 dj0Var = dj0.this;
                fh.b bVar = dj0Var.f33148j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.tg tgVar2 = dj0Var.W;
                if (tgVar2 != null) {
                    tgVar2.setAlpha(alpha);
                }
                dj0Var.f33143f = bitmap;
                Paint paint = new Paint(1);
                dj0Var.f33151n = paint;
                Bitmap bitmap3 = dj0Var.f33143f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                dj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                dj0Var.f33156r = new Matrix();
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
        if (this.f33144f0) {
            return;
        }
        this.f33145g0 = false;
        this.f33144f0 = true;
        this.f33142e0.p(null, null, true);
        this.f33142e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        this.f33142e0.r(false);
    }

    public void m(long j3) {
    }
}
