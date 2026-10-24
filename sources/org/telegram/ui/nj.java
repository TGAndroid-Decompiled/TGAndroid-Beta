package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nj extends ci.p5 {
    public final sn A3;
    public int f39880a3;
    public final ArrayList f39881b3;
    public final ArrayList f39882c3;
    public final ArrayList f39883d3;
    public final ArrayList f39884e3;
    public final ArrayList f39885f3;
    public int f39886g3;
    public int f39887h3;
    public int f39888i3;
    public long f39889j3;
    public float f39890k3;
    public float f39891l3;
    public boolean f39892m3;
    public final float f39893n3;
    public final Paint f39894o3;
    public final Paint f39895p3;
    public final o1.j f39896q3;
    public final o1.k f39897r3;
    public final o1.j f39898s3;
    public final o1.k f39899t3;
    public final o1.j f39900u3;
    public final o1.k f39901v3;
    public boolean f39902w3;
    public final Path f39903x3;
    public boolean y3;
    public int f39904z3;

    public nj(sn snVar, Context context, qn qnVar) {
        super(snVar, context, qnVar, 1);
        this.A3 = snVar;
        this.f39881b3 = new ArrayList();
        this.f39882c3 = new ArrayList();
        this.f39883d3 = new ArrayList();
        this.f39884e3 = new ArrayList();
        this.f39885f3 = new ArrayList(10);
        this.f39893n3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f39894o3 = paint;
        Paint paint2 = new Paint(1);
        this.f39895p3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f39896q3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f17616g = 2000.0f;
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final nj f39604b;

            {
                this.f39604b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39604b.invalidate();
                        return;
                    case 1:
                        this.f39604b.invalidate();
                        return;
                    default:
                        this.f39604b.invalidate();
                        return;
                }
            }
        });
        this.f39897r3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f39898s3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final nj f39604b;

            {
                this.f39604b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39604b.invalidate();
                        return;
                    case 1:
                        this.f39604b.invalidate();
                        return;
                    default:
                        this.f39604b.invalidate();
                        return;
                }
            }
        });
        this.f39899t3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f39900u3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final nj f39604b;

            {
                this.f39604b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39604b.invalidate();
                        return;
                    case 1:
                        this.f39604b.invalidate();
                        return;
                    default:
                        this.f39604b.invalidate();
                        return;
                }
            }
        });
        this.f39901v3 = kVar3;
        this.f39903x3 = new Path();
        this.f39904z3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void C1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nj.C1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void D1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.f39881b3;
        int size = arrayList2.size();
        sn snVar = this.A3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!sn.e2(snVar, t1Var, rectF)) {
                    canvas.save();
                    canvas.translate(t1Var.D2(false) + t1Var.getLeft(), t1Var.getY() + t1Var.getPaddingTop());
                    if (t1Var.c()) {
                        f13 = t1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    t1Var.l2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f39882c3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!sn.e2(snVar, t1Var2, rectF)) {
                    float D2 = t1Var2.D2(false) + t1Var2.getLeft();
                    float y3 = t1Var2.getY() + t1Var2.getPaddingTop();
                    if (t1Var2.c()) {
                        f12 = t1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(D2, y3);
                    t1Var2.setInvalidatesParent(true);
                    t1Var2.V1(canvas, f12);
                    t1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f39883d3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (sn.e2(snVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (t1Var3.c()) {
                        f11 = t1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float D22 = t1Var3.D2(z13) + t1Var3.getLeft();
                    float y10 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float D23 = t1Var3.D2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + D23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + D23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += t1Var3.getTranslationY();
                                f17 += t1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (t1Var3.getTransitionParams().f23220v0) {
                        canvas.translate(D22, y10);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.H1(f11, canvas, z11);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.f39884e3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!sn.e2(snVar, t1Var4, rectF)) {
                    if (t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (t1Var4.c()) {
                        f10 = t1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float D24 = t1Var4.D2(false) + t1Var4.getLeft();
                    float y11 = t1Var4.getY() + t1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float D25 = t1Var4.D2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + D25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + D25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += t1Var4.getTranslationY();
                            f21 += t1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f7), f19 + AndroidUtilities.dp(f7), f20 - AndroidUtilities.dp(f7), f21 - AndroidUtilities.dp(f7));
                    }
                    if (!z10 && t1Var4.getTransitionParams().f23220v0) {
                        canvas.translate(D24, y11);
                        t1Var4.setInvalidatesParent(true);
                        t1Var4.c2(canvas, f10, null);
                        t1Var4.M1(canvas, f10);
                        t1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void E1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages D8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        sn snVar = this.A3;
        if (motionEvent != null) {
            snVar.P4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !snVar.f41664r9 && !snVar.f41650q9 && snVar.p9 == null) {
            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.t1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) pressedChildView;
                        float x10 = motionEvent.getX() - pressedChildView.getX();
                        float y3 = motionEvent.getY() - pressedChildView.getY();
                        if (v0Var.L()) {
                            org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                            float f11 = (x10 - v0Var.K0) - (v0Var.f23783j0 / 2.0f);
                            float paddingTop = (y3 - v0Var.L0) - v0Var.getPaddingTop();
                            org.telegram.ui.Wallet.l3 l3Var = m3Var.f34827m;
                            if (l3Var != null && l3Var.f47626n && m3Var.f34845w.contains((int) f11, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (snVar.p9 != null) {
                    sn.W1(snVar, 0.0f);
                }
                snVar.p9 = pressedChildView;
                MessageObject T1 = sn.T1(snVar);
                boolean I6 = snVar.I6(T1);
                int i10 = snVar.f41489d4;
                if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && snVar.f41635p4 == snVar.getUserConfig().getClientUserId())) && (((arrayList = snVar.f41597m4) == null || !arrayList.contains(T1)) && ((snVar.J8(T1) != 1 || (T1.getDialogId() != snVar.X6 && !T1.needDrawBluredPreview())) && ((snVar.h != null || T1.getId() >= 0) && (((chat2 = snVar.e) == null || !ChatObject.isForum(chat2) || I6) && !snVar.g9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                    this.f39888i3 = motionEvent.getPointerId(0);
                    snVar.f41650q9 = true;
                    this.f39886g3 = (int) motionEvent.getX();
                    this.f39887h3 = (int) motionEvent.getY();
                    return;
                }
                sn.W1(snVar, 0.0f);
                snVar.p9 = null;
                return;
            }
        }
        if (snVar.p9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39888i3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f39886g3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f39887h3);
            if (getScrollState() == 0 && snVar.f41650q9 && !snVar.f41664r9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                snVar.p9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                snVar.f41759z0.R = false;
                snVar.f41650q9 = false;
                snVar.f41664r9 = true;
                this.f39886g3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (snVar.f41664r9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f39892m3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f39892m3 = true;
                    }
                } else {
                    this.f39892m3 = false;
                }
                float f12 = max;
                sn.W1(snVar, f12);
                MessageObject T12 = sn.T1(snVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    snVar.Tc(false, false);
                }
                View view = snVar.p9;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    F1((org.telegram.ui.Cells.t1) view, f12);
                }
                invalidate();
            }
        } else if (snVar.p9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f39888i3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = snVar.p9;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    f10 = ((org.telegram.ui.Cells.t1) view2).D2(false);
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    f10 = ((org.telegram.ui.Cells.v0) view2).getWalletSlidingOffset();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = sn.T1(snVar);
                    boolean I62 = snVar.I6(T13);
                    kk kkVar = snVar.f41446a1;
                    if ((kkVar != null && kkVar.getVisibility() == 0 && ((!snVar.U0 || !I62) && !T13.wasJustSent)) || ((chat = snVar.e) != null && ((ChatObject.isNotInChat(chat) && !snVar.K9()) || ((ChatObject.isChannel(snVar.e) && !ChatObject.canPost(snVar.e) && !snVar.e.megagroup) || !ChatObject.canSendMessages(snVar.e))))) {
                        if (T13.getGroupId() != 0 && (D8 = snVar.D8(T13.getGroupId())) != null && (messageObject = D8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        snVar.f41764z5 = T13;
                        Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
                        e.putBoolean("quote", true);
                        e.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != snVar.a() && peerDialogId != snVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e.putLong("reply_to_author", peerDialogId);
                        }
                        e.putInt("messagesCount", 1);
                        e.putBoolean("canSelectTopics", true);
                        ey eyVar = new ey(e);
                        eyVar.C2 = snVar;
                        snVar.presentFragment(eyVar);
                    } else {
                        snVar.Hb(sn.T1(snVar));
                    }
                }
            }
            View view3 = snVar.p9;
            if (view3 instanceof org.telegram.ui.Cells.t1) {
                f7 = ((org.telegram.ui.Cells.t1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                f7 = ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset();
            } else {
                f7 = 0.0f;
            }
            this.f39891l3 = f7;
            if (f7 == 0.0f) {
                snVar.p9 = null;
            }
            this.f39889j3 = System.currentTimeMillis();
            this.f39890k3 = 0.0f;
            invalidate();
            snVar.f41650q9 = false;
            snVar.f41664r9 = false;
            snVar.f41759z0.R = true;
        }
    }

    @Override
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void F1(org.telegram.ui.Cells.t1 t1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != t1Var && (childAt instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    t1Var2.setSlidingOffset(f7);
                    t1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.A3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        sn snVar = this.A3;
        snVar.G8 = null;
        canvas.save();
        if (snVar.ha != null && snVar.f41495da) {
            boolean z10 = snVar.f41506ea;
        }
        this.E1.setEmpty();
        if (snVar.Z9 != 0.0f) {
            int save = canvas.save();
            if (snVar.f41531ga != 0.0f) {
                f7 = (snVar.f41734x0.getMeasuredHeight() - snVar.Z9) * snVar.f41531ga;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-snVar.Z9) - f7;
            snVar.La = f10;
            canvas.translate(0.0f, f10);
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.j1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.t1)) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            t1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.A3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.A3;
        lm lmVar = snVar.f41629o9;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.f22163f0);
            lmVar.f22189z = false;
        }
        if (this.V1 || ((iVar = snVar.f41567ja) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (!kVar.s() && !snVar.F9()) {
            E1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.f39880a3;
        int i15 = i12 - i10;
        sn snVar = this.A3;
        if (i14 != i15) {
            if (i14 != 0) {
                snVar.m9(false);
            }
            this.f39880a3 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f39904z3 != measuredHeight) {
            this.y3 = true;
            pj pjVar = snVar.f41748y0;
            if (pjVar != null) {
                pjVar.g();
            }
            snVar.f41554i9.a();
            this.y3 = false;
            this.f39904z3 = measuredHeight;
        }
        snVar.f41491d6 = false;
        lm lmVar = snVar.f41629o9;
        if (lmVar != null && lmVar.x()) {
            snVar.f41629o9.w();
        }
        snVar.u9();
        snVar.I9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        np npVar;
        sn snVar = this.A3;
        ne.b bVar = snVar.Ic;
        lm lmVar = snVar.f41629o9;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.f22163f0);
            lmVar.f22189z = false;
        }
        if (motionEvent.getAction() == 0) {
            snVar.Ea = true;
        }
        if (snVar.Z9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, snVar.Z9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (npVar = snVar.f41468ba) != null && !npVar.R) {
                if (npVar.K != 1.0f) {
                    float f7 = snVar.Z9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    snVar.f41482ca = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final nj f39303b;

                        {
                            this.f39303b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    sn snVar2 = this.f39303b.A3;
                                    snVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    snVar2.f41734x0.invalidate();
                                    return;
                                case 1:
                                    sn snVar3 = this.f39303b.A3;
                                    snVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    snVar3.f41734x0.invalidate();
                                    return;
                                case 2:
                                    sn snVar4 = this.f39303b.A3;
                                    snVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    snVar4.f41734x0.invalidate();
                                    return;
                                default:
                                    sn snVar5 = this.f39303b.A3;
                                    snVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    snVar5.f41734x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
                    ofFloat.setInterpolator(zrVar);
                    ofFloat.start();
                    final np npVar2 = snVar.f41468ba;
                    ti tiVar = new ti(this, 2);
                    AnimatorSet animatorSet = npVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        npVar2.J.cancel();
                    }
                    npVar2.Y = tiVar;
                    npVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(npVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    np npVar3 = npVar2;
                                    npVar3.getClass();
                                    npVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    npVar3.T.invalidate();
                                    View view = npVar3.f39928a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    np npVar4 = npVar2;
                                    npVar4.getClass();
                                    npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = npVar4.f39928a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(npVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    np npVar3 = npVar2;
                                    npVar3.getClass();
                                    npVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    npVar3.T.invalidate();
                                    View view = npVar3.f39928a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    np npVar4 = npVar2;
                                    npVar4.getClass();
                                    npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = npVar4.f39928a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    npVar2.J.addListener(new m.a(npVar2, 28));
                    npVar2.J.playTogether(ofFloat2, ofFloat3);
                    npVar2.J.setDuration(120L);
                    npVar2.J.setInterpolator(zrVar);
                    npVar2.J.start();
                } else {
                    sn.X1(snVar);
                }
            } else {
                np npVar3 = snVar.f41468ba;
                if (npVar3 != null && npVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    np npVar4 = snVar.f41468ba;
                    if (currentTimeMillis - npVar4.U < 500 && npVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        snVar.f41482ca = animatorSet2;
                        if (snVar.f41468ba != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(snVar.Z9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final nj f39303b;

                            {
                                this.f39303b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        sn snVar2 = this.f39303b.A3;
                                        snVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar2.f41734x0.invalidate();
                                        return;
                                    case 1:
                                        sn snVar3 = this.f39303b.A3;
                                        snVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar3.f41734x0.invalidate();
                                        return;
                                    case 2:
                                        sn snVar4 = this.f39303b.A3;
                                        snVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar4.f41734x0.invalidate();
                                        return;
                                    default:
                                        sn snVar5 = this.f39303b.A3;
                                        snVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar5.f41734x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final nj f39303b;

                            {
                                this.f39303b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        sn snVar2 = this.f39303b.A3;
                                        snVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar2.f41734x0.invalidate();
                                        return;
                                    case 1:
                                        sn snVar3 = this.f39303b.A3;
                                        snVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar3.f41734x0.invalidate();
                                        return;
                                    case 2:
                                        sn snVar4 = this.f39303b.A3;
                                        snVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar4.f41734x0.invalidate();
                                        return;
                                    default:
                                        sn snVar5 = this.f39303b.A3;
                                        snVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        snVar5.f41734x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(li.m.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(snVar.Z9, 0.0f);
                snVar.f41482ca = ofFloat6;
                if (snVar.f41468ba != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final nj f39303b;

                    {
                        this.f39303b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                sn snVar2 = this.f39303b.A3;
                                snVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                snVar2.f41734x0.invalidate();
                                return;
                            case 1:
                                sn snVar3 = this.f39303b.A3;
                                snVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                snVar3.f41734x0.invalidate();
                                return;
                            case 2:
                                sn snVar4 = this.f39303b.A3;
                                snVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                snVar4.f41734x0.invalidate();
                                return;
                            default:
                                sn snVar5 = this.f39303b.A3;
                                snVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                snVar5.f41734x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(li.m.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
                E1(motionEvent);
                if (snVar.f41664r9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.A3.f41481c9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.A3.p9 != null) {
            E1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.y3) {
            return;
        }
        ih.a aVar = this.A3.f41496dc;
        if (aVar.f13143b != 0) {
            int childCount = aVar.f13142a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f13142a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.l0 l0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(l0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            sn snVar = this.A3;
            snVar.t9();
            snVar.w9();
        }
    }
}
