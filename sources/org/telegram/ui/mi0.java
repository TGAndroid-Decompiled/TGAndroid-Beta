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
    public final xh0 E;
    public final ei0 F;
    public final xh0 G;
    public long H;
    public org.telegram.ui.Components.p5 I;
    public final fi0 J;
    public final wh0 K;
    public final ii0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.u1 P;
    public int Q;
    public org.telegram.ui.Components.pf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.be U;
    public org.telegram.ui.Components.vg V;
    public zh0 W;
    public int X;
    public ViewGroup Y;
    public final yh0 Z;
    public final Context f39259a;
    public boolean f39260a0;
    public final org.telegram.ui.ActionBar.d6 f39261b;
    public float f39262b0;
    public final int f39263c;
    public FrameLayout f39264c0;
    public i0.b d;
    public ai0 f39265d0;
    public Bitmap e;
    public boolean f39266e0;
    public BitmapShader f39267f;
    public boolean f39268f0;
    public boolean f39269g0;
    public Paint h;
    public final wh.f f39270h0;
    public final gh.b f39271i0;
    public final bh.b f39272j0;
    public RectF f39273k0;
    public boolean f39274l0;
    public boolean m0;
    public Matrix f39275n;
    public final int[] f39276n0;
    public boolean f39277o0;
    public boolean f39278p0;
    public org.telegram.ui.Cells.u1 f39279q0;
    public boolean f39280r;
    public float f39281r0;
    public boolean f39282s;
    public float f39283s0;
    public final Rect f39284t0;
    public ValueAnimator f39285u0;
    public boolean v;
    public boolean f39286v0;
    public boolean f39287w;
    public org.telegram.ui.Cells.u1 f39288w0;
    public boolean f39289x;
    public org.telegram.ui.Components.f11 f39290x0;
    public float f39291y;
    public Paint f39292y0;

    public mi0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.f39263c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f39276n0 = new int[2];
        this.f39278p0 = false;
        this.f39284t0 = new Rect();
        this.f39259a = context;
        this.f39261b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        xh0 xh0Var = new xh0(this, context, 1);
        this.E = xh0Var;
        this.f39270h0 = wh.f.d(1, xh0Var, xh0Var);
        xh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mi0 f41985b;

            {
                this.f41985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41985b.onBackPressed();
                        return;
                    default:
                        this.f41985b.onBackPressed();
                        return;
                }
            }
        });
        xh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                mi0 mi0Var = mi0.this;
                if (!mi0Var.f39277o0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(mi0Var.R);
                    AndroidUtilities.runOnUIThread(new sh0(mi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        gh.b bVar = new gh.b();
        this.f39271i0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f39272j0 = bVar2;
        bVar2.f4358f = new ih.j(xh0Var);
        bVar2.f4359g = xh0Var;
        ei0 ei0Var = new ei0(this, context, d6Var);
        this.F = ei0Var;
        ei0Var.setClipToPadding(false);
        xh0Var.addView(ei0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f44830a;
        r0.a0.i(xh0Var, gVar);
        fi0 fi0Var = new fi0(this, context, d6Var);
        this.J = fi0Var;
        fi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mi0 f41985b;

            {
                this.f41985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41985b.onBackPressed();
                        return;
                    default:
                        this.f41985b.onBackPressed();
                        return;
                }
            }
        });
        fi0Var.setOnItemClickListener(new i(this, 18));
        fi0Var.setOnScrollListener(new k3(this, 19));
        fi0Var.setItemAnimator(new li.m(null, fi0Var, d6Var));
        ii0 ii0Var = new ii0(this);
        this.L = ii0Var;
        ii0Var.O = new ji0(this);
        fi0Var.setLayoutManager(ii0Var);
        fi0Var.i(new Object());
        wh0 wh0Var = new wh0(this, context, d6Var);
        this.K = wh0Var;
        fi0Var.setAdapter(wh0Var);
        fi0Var.setVerticalScrollBarEnabled(false);
        fi0Var.setOverScrollMode(2);
        ei0Var.addView(fi0Var, w7.z5.c(-2.0f, -1));
        xh0 xh0Var2 = new xh0(this, context, 0);
        this.G = xh0Var2;
        xh0Var.addView(xh0Var2, w7.z5.c(-1.0f, -1));
        this.Z = new yh0(this, xh0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        ah.n0 n0Var;
        if (this.f39265d0 == null && n2Var != null) {
            int i10 = this.f39263c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f39259a);
            this.f39264c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f39264c0.setClipToPadding(false);
            this.f39264c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? dl0Var = new org.telegram.ui.Components.dl0(5, this.f39263c, getContext(), null, this.f39261b);
            this.f39265d0 = dl0Var;
            dl0Var.setClipChildren(false);
            this.f39265d0.setClipToPadding(false);
            this.f39265d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f39265d0.setDelegate(new ci0(this, n2Var));
            this.f39265d0.setTop(false);
            this.f39265d0.setClipChildren(false);
            this.f39265d0.setClipToPadding(false);
            this.f39265d0.setVisibility(0);
            this.f39265d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f39265d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f39265d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.F.addView(this.f39264c0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f39264c0.addView(this.f39265d0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f39265d0.setScaleY(0.4f);
            this.f39265d0.setScaleX(0.4f);
            this.f39265d0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                s();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ai0 ai0Var = this.f39265d0;
            if (ai0Var != null && !ai0Var.f25541f1) {
                ai0Var.f25541f1 = true;
                ai0Var.f25543g1 = true;
                ah.t0 t0Var = ai0Var.f25567x0;
                if (t0Var != null && (n0Var = t0Var.f877m) != null && !n0Var.K1) {
                    n0Var.K1 = true;
                    n0Var.L1 = true;
                    u41 u41Var = n0Var.f43065h0;
                    if (u41Var != null) {
                        u41Var.invalidate();
                    }
                    k41 k41Var = n0Var.f43067i0;
                    if (k41Var != null) {
                        k41Var.invalidate();
                    }
                }
            }
            new ei.b4(this.E, false, new v3(this, 11));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        ai0 ai0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f39285u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.m1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        float f7 = 0.0f;
        if (!z10 && (ai0Var = this.f39265d0) != null && this.f39266e0) {
            ai0Var.e();
            if (this.f39265d0.getReactionsWindow() != null && this.f39265d0.getReactionsWindow().f868a != null) {
                this.f39265d0.getReactionsWindow().f868a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f39265d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.f39282s = !z10;
        this.J.invalidate();
        this.f39287w = true;
        this.f39289x = true;
        float f10 = this.f39291y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39285u0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.f39285u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f39285u0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f39285u0.setDuration(350L);
        this.f39285u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f39263c).hasAvailableEffects()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f39278p0) {
            return;
        }
        this.f39278p0 = true;
        zh0 zh0Var = this.W;
        if (zh0Var != null) {
            zh0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        d(new rh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.f39263c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void e(MessageObject messageObject) {
        MessageObject.GroupedMessages k10 = k(messageObject);
        if (k10 != null) {
            k10.calculate();
            ArrayList<MessageObject> arrayList = k10.messages;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                f(messageObject2);
            }
            return;
        }
        f(messageObject);
    }

    public final void f(MessageObject messageObject) {
        org.telegram.ui.Cells.u1 u1Var;
        fi0 fi0Var = this.J;
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
            ArrayList arrayList = this.M;
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

    public final void g(boolean z10) {
        this.f39280r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f39278p0) {
            return;
        }
        this.f39278p0 = true;
        wh.f.f(false);
        wh.f fVar = this.f39270h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.f39263c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f39290x0 != null && this.f39292y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f39290x0.f26025c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f39292y0);
            this.f39290x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f39278p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (!this.m0 && this.f39265d0 != null) {
            if (this.f39273k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.u1 u1Var = this.P;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.m0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final MessageObject.GroupedMessages k(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.O.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void m(boolean z10) {
        ii0 ii0Var;
        int i10;
        fi0 fi0Var = this.J;
        if (fi0Var != null && fi0Var.getAdapter() != null && (ii0Var = this.L) != null) {
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
            this.f39286v0 = z10;
        }
    }

    public final void n(long j10) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.H = j10;
        boolean i11 = this.O.i();
        ArrayList arrayList = this.M;
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
        if (this.f39265d0 != null && (effect = MessagesController.getInstance(this.f39263c).getEffect(j10)) != null) {
            this.f39265d0.setSelectedReactionAnimated(ah.i1.e(effect));
        }
    }

    public final void o(org.telegram.ui.Components.i80 i80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39261b;
        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        i80Var.Q(this.f39272j0, fh.c.k(d6Var), false);
        ViewGroup viewGroup = i80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f39260a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f39260a0 = false;
            return;
        }
        ai0 ai0Var = this.f39265d0;
        if (ai0Var != null && ai0Var.getReactionsWindow() != null) {
            if (!this.f39265d0.getReactionsWindow().C) {
                this.f39265d0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.m0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        xh0 xh0Var = this.E;
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

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
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
        ArrayList arrayList2 = this.M;
        arrayList2.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            int i17 = this.N;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f39288w0 == null) {
                    this.f39288w0 = new org.telegram.ui.Cells.u1(getContext(), this.f39263c, true, null, this.f39261b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f39288w0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.g3 g3Var = u1Var.S0;
                g3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23398m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23469r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23564xe = 0;
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
            this.N = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        fi0 fi0Var = this.J;
        fi0Var.getAdapter().l();
        int h = fi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.L.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg q(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = vgVar;
        int[] iArr = this.f39276n0;
        vgVar.getLocationOnScreen(iArr);
        zh0 zh0Var = new zh0(this, getContext(), vgVar.f31237b, this.f39261b, vgVar, z10);
        this.W = zh0Var;
        zh0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.V;
        zh0 zh0Var2 = this.W;
        zh0Var2.E = vgVar2.E;
        zh0Var2.f31246h0 = vgVar2.f31246h0;
        zh0Var2.f31240c0.t(vgVar2.f31240c0.f29235i, false, true);
        zh0Var2.f31241d0 = vgVar2.f31241d0;
        zh0Var2.setEmoji(vgVar2.f31243f.f29215f[0]);
        zh0Var2.i(vgVar2.f31252s, vgVar2.f31251r, true);
        zh0Var2.P.d(vgVar2.P.f26090c, true);
        zh0Var2.f31254x.d(vgVar2.f31254x.f26090c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        zh0Var2.I = i10;
        zh0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        zh0Var2.M = f7;
        zh0Var2.N = f10;
        this.W.P.d(vgVar.P.f26090c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.V;
        vgVar.getHeight();
        this.X = vgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.V;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.nk.D(6.0f, width - vgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.f11 f11Var = null;
        if (i10 > 0) {
            f11Var = new org.telegram.ui.Components.f11(ai.md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f39290x0 = f11Var;
        if (this.f39292y0 == null) {
            Paint paint = new Paint(1);
            this.f39292y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.M;
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
                this.K.l();
                return;
            }
        }
    }

    public final void s() {
        if (this.f39266e0) {
            return;
        }
        this.f39268f0 = false;
        this.f39266e0 = true;
        this.f39265d0.p(null, null, true);
        this.f39265d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.f39265d0.r(false);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        wh.f.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.zm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                mi0 mi0Var = mi0.this;
                gh.b bVar = mi0Var.f39271i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = mi0Var.V;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                mi0Var.e = bitmap;
                Paint paint = new Paint(1);
                mi0Var.h = paint;
                Bitmap bitmap3 = mi0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                mi0Var.f39267f = bitmapShader;
                paint.setShader(bitmapShader);
                mi0Var.f39275n = new Matrix();
                bVar.a(bitmap2);
                hh.d.c(bVar, mi0Var.E);
                ViewGroup viewGroup = mi0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        xh0 xh0Var = this.G;
        if (xh0Var != null) {
            xh0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}
