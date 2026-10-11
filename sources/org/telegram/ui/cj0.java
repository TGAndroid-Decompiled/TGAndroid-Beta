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
    public org.telegram.ui.Components.q5 J;
    public final vi0 K;
    public final mi0 L;
    public final yi0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.sf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.fe V;
    public org.telegram.ui.Components.xg W;
    public pi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f36757a;
    public final oi0 f36758a0;
    public final org.telegram.ui.ActionBar.d6 f36759b;
    public boolean f36760b0;
    public final int f36761c;
    public float f36762c0;
    public hb0 d;
    public FrameLayout f36763d0;
    public i0.b f36764e;
    public qi0 f36765e0;
    public Bitmap f36766f;
    public boolean f36767f0;
    public boolean f36768g0;
    public BitmapShader h;
    public boolean f36769h0;
    public final vh.f f36770i0;
    public final fh.b f36771j0;
    public final ah.c f36772k0;
    public RectF f36773l0;
    public boolean m0;
    public Paint f36774n;
    public boolean f36775n0;
    public final int[] f36776o0;
    public boolean f36777p0;
    public boolean f36778q0;
    public Matrix f36779r;
    public org.telegram.ui.Cells.u1 f36780r0;
    public boolean f36781s;
    public float f36782s0;
    public float f36783t0;
    public final Rect f36784u0;
    public boolean v;
    public ValueAnimator f36785v0;
    public boolean f36786w;
    public boolean f36787w0;
    public boolean f36788x;
    public org.telegram.ui.Cells.u1 f36789x0;
    public boolean f36790y;
    public org.telegram.ui.Components.m11 f36791y0;
    public Paint f36792z0;

    public cj0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        hb0 hb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f36761c = i10;
        this.f36764e = i0.b.f11574e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f36776o0 = new int[2];
        this.f36778q0 = false;
        this.f36784u0 = new Rect();
        this.f36757a = context;
        this.f36759b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            hb0Var = new hb0(launchActivity, true);
        } else {
            hb0Var = null;
        }
        this.d = hb0Var;
        ni0 ni0Var = new ni0(this, context, 1);
        this.F = ni0Var;
        this.f36770i0 = vh.f.d(1, ni0Var, ni0Var);
        ni0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f39379b;

            {
                this.f39379b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39379b.onBackPressed();
                        return;
                    default:
                        this.f39379b.onBackPressed();
                        return;
                }
            }
        });
        ni0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                cj0 cj0Var = cj0.this;
                if (!cj0Var.f36777p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(cj0Var.S);
                    AndroidUtilities.runOnUIThread(new ii0(cj0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f36771j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f36772k0 = cVar;
        cVar.f545f = new hh.j(ni0Var);
        cVar.f546g = ni0Var;
        ui0 ui0Var = new ui0(this, context, d6Var);
        this.G = ui0Var;
        ui0Var.setClipToPadding(false);
        ni0Var.addView(ui0Var, w7.x5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f46890a;
        r0.a0.i(ni0Var, gVar);
        vi0 vi0Var = new vi0(this, context, d6Var);
        this.K = vi0Var;
        vi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cj0 f39379b;

            {
                this.f39379b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39379b.onBackPressed();
                        return;
                    default:
                        this.f39379b.onBackPressed();
                        return;
                }
            }
        });
        vi0Var.setOnItemClickListener(new i(this, 17));
        vi0Var.setOnScrollListener(new h3(this, 19));
        vi0Var.setItemAnimator(new ji.n(null, vi0Var, d6Var));
        yi0 yi0Var = new yi0(this);
        this.M = yi0Var;
        yi0Var.O = new zi0(this);
        vi0Var.setLayoutManager(yi0Var);
        vi0Var.i(new Object());
        mi0 mi0Var = new mi0(this, context, d6Var);
        this.L = mi0Var;
        vi0Var.setAdapter(mi0Var);
        vi0Var.setVerticalScrollBarEnabled(false);
        vi0Var.setOverScrollMode(2);
        ui0Var.addView(vi0Var, w7.x5.d(-2.0f, -1));
        ni0 ni0Var2 = new ni0(this, context, 0);
        this.H = ni0Var2;
        ni0Var.addView(ni0Var2, w7.x5.d(-1.0f, -1));
        this.f36758a0 = new oi0(this, ni0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f36761c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        hb0 hb0Var = this.d;
        if (hb0Var != null) {
            hb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.m2 m2Var) {
        zg.w wVar;
        if (this.f36765e0 == null && m2Var != null) {
            int i10 = this.f36761c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f36757a);
            this.f36763d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f36763d0.setClipToPadding(false);
            this.f36763d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? ll0Var = new org.telegram.ui.Components.ll0(5, this.f36761c, getContext(), null, this.f36759b);
            this.f36765e0 = ll0Var;
            ll0Var.setClipChildren(false);
            this.f36765e0.setClipToPadding(false);
            this.f36765e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f36765e0.setDelegate(new si0(this, m2Var));
            this.f36765e0.setTop(false);
            this.f36765e0.setClipChildren(false);
            this.f36765e0.setClipToPadding(false);
            this.f36765e0.setVisibility(0);
            this.f36765e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f36765e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f36765e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f36763d0, w7.x5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
            this.f36763d0.addView(this.f36765e0, w7.x5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            this.f36765e0.setScaleY(0.4f);
            this.f36765e0.setScaleX(0.4f);
            this.f36765e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            qi0 qi0Var = this.f36765e0;
            if (qi0Var != null && !qi0Var.f28471f1) {
                qi0Var.f28471f1 = true;
                qi0Var.f28473g1 = true;
                zg.a0 a0Var = qi0Var.f28497x0;
                if (a0Var != null && (wVar = a0Var.f54580m) != null && !wVar.K1) {
                    wVar.K1 = true;
                    wVar.L1 = true;
                    g61 g61Var = wVar.f38928h0;
                    if (g61Var != null) {
                        g61Var.invalidate();
                    }
                    w51 w51Var = wVar.f38930i0;
                    if (w51Var != null) {
                        w51Var.invalidate();
                    }
                }
            }
            new ci.h4(this.F, false, new s3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f36761c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f36778q0) {
            return;
        }
        this.f36778q0 = true;
        pi0 pi0Var = this.X;
        if (pi0Var != null) {
            pi0Var.invalidate();
        }
        org.telegram.ui.Components.xg xgVar = this.W;
        if (xgVar != null) {
            xgVar.invalidate();
        }
        e(new hi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        qi0 qi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f36785v0;
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
        if (!z10 && (qi0Var = this.f36765e0) != null && this.f36767f0) {
            qi0Var.e();
            if (this.f36765e0.getReactionsWindow() != null && this.f36765e0.getReactionsWindow().f54570a != null) {
                this.f36765e0.getReactionsWindow().f54570a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f36765e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f36786w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f36788x = true;
        this.f36790y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36785v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.cb(9, this, z11));
        this.f36785v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f36785v0.setInterpolator(org.telegram.ui.Components.is.h);
        this.f36785v0.setDuration(350L);
        this.f36785v0.start();
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
        this.f36781s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f36778q0) {
            return;
        }
        this.f36778q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f36770i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f36778q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f36791y0 != null && this.f36792z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f36791y0.f28678c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f36792z0);
            this.f36791y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f36775n0 && this.f36765e0 != null) {
            if (this.f36773l0 != null) {
                this.f36775n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f36775n0 = true;
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
            this.f36787w0 = z10;
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
        if (this.f36765e0 != null && (effect = MessagesController.getInstance(this.f36761c).getEffect(j3)) != null) {
            this.f36765e0.setSelectedReactionAnimated(zg.n0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f36760b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f36760b0 = false;
            return;
        }
        qi0 qi0Var = this.f36765e0;
        if (qi0Var != null && qi0Var.getReactionsWindow() != null) {
            if (!this.f36765e0.getReactionsWindow().C) {
                this.f36765e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f36775n0 = true;
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
        AndroidUtilities.setLightNavigationBar(ni0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.p80 p80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f36759b;
        p80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        p80Var.Q(this.f36772k0, eh.b.k(d6Var), false);
        ViewGroup viewGroup = p80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.x5.d(-2.0f, -2));
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
                if (this.f36789x0 == null) {
                    this.f36789x0 = new org.telegram.ui.Cells.u1(getContext(), this.f36761c, true, null, this.f36759b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f36789x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.m4 m4Var = u1Var.S0;
                m4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23313m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23384r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23478xe = 0;
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
                    m4Var.setIgnoreImageSet(false);
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

    public final org.telegram.ui.Components.xg r(org.telegram.ui.Components.xg xgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = xgVar;
        int[] iArr = this.f36776o0;
        xgVar.getLocationOnScreen(iArr);
        pi0 pi0Var = new pi0(this, getContext(), xgVar.f32958b, this.f36759b, xgVar, z10);
        this.X = pi0Var;
        pi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.xg xgVar2 = this.W;
        pi0 pi0Var2 = this.X;
        pi0Var2.E = xgVar2.E;
        pi0Var2.f32968h0 = xgVar2.f32968h0;
        pi0Var2.f32961c0.t(xgVar2.f32961c0.f30140i, false, true);
        pi0Var2.f32962d0 = xgVar2.f32962d0;
        pi0Var2.setEmoji(xgVar2.f32965f.f30114f[0]);
        pi0Var2.i(xgVar2.f32974s, xgVar2.f32973r, true);
        pi0Var2.P.d(xgVar2.P.f26665c, true);
        pi0Var2.f32976x.d(xgVar2.f32976x.f26665c, true);
        int i10 = xgVar2.I;
        int i11 = xgVar2.J;
        pi0Var2.I = i10;
        pi0Var2.J = i11;
        float f7 = xgVar2.M;
        float f10 = xgVar2.N;
        pi0Var2.M = f7;
        pi0Var2.N = f10;
        this.X.P.d(xgVar.P.f26665c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(xgVar.getWidth(), xgVar.getHeight()));
        org.telegram.ui.Components.xg xgVar3 = this.W;
        xgVar.getHeight();
        this.Y = xgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.xg xgVar4 = this.W;
        xgVar.getHeight();
        iArr[0] = org.telegram.messenger.ai.D(6.0f, width - xgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.m11 m11Var = null;
        if (i10 > 0) {
            m11Var = new org.telegram.ui.Components.m11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f36791y0 = m11Var;
        if (this.f36792z0 == null) {
            Paint paint = new Paint(1);
            this.f36792z0 = paint;
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
        org.telegram.ui.Components.xg xgVar = this.W;
        if (xgVar != null) {
            xgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.hn0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                cj0 cj0Var = cj0.this;
                fh.b bVar = cj0Var.f36771j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.xg xgVar2 = cj0Var.W;
                if (xgVar2 != null) {
                    xgVar2.setAlpha(alpha);
                }
                cj0Var.f36766f = bitmap;
                Paint paint = new Paint(1);
                cj0Var.f36774n = paint;
                Bitmap bitmap3 = cj0Var.f36766f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                cj0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                cj0Var.f36779r = new Matrix();
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
        if (this.f36767f0) {
            return;
        }
        this.f36768g0 = false;
        this.f36767f0 = true;
        this.f36765e0.p(null, null, true);
        this.f36765e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.is.h).start();
        this.f36765e0.r(false);
    }

    public void m(long j3) {
    }
}
