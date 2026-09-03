package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class my extends org.telegram.ui.Components.aa implements nh.a7 {
    public static final int f36270s3 = 0;
    public boolean f36271a3;
    public boolean f36272b3;
    public boolean c3;
    public final py f36273d3;
    public int f36274e3;
    public float f36275f3;
    public final Paint f36276g3;
    public final RectF f36277h3;
    public org.telegram.ui.Components.rl0 f36278i3;
    public LongSparseArray f36279j3;
    public Paint f36280k3;
    public float f36281l3;
    public float f36282m3;
    public float f36283n3;
    public boolean f36284o3;
    public nh.q9 f36285p3;
    public int f36286q3;
    public final qy f36287r3;

    public my(qy qyVar, Context context, py pyVar) {
        super(context, null);
        this.f36287r3 = qyVar;
        this.f36272b3 = true;
        this.f36276g3 = new Paint();
        this.f36277h3 = new RectF();
        this.f36282m3 = 1.0f;
        this.f36273d3 = pyVar;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f36287r3.K);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(qy.f37520x4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f36287r3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.q2) && ((org.telegram.ui.Cells.q2) view).f21636r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return qy.f37520x4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        py pyVar = this.f36273d3;
        if (pyVar.f37250n != null && qy.f37520x4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            pyVar.f37250n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.U1) {
            qy qyVar = this.f36287r3;
            if (!qyVar.Y0 && !this.f36273d3.f37254x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                    qyVar.Z0 = !kVar.s();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f36274e3 = getPaddingTop();
        this.f36287r3.f37627u3 = 0.0f;
        this.f36273d3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f10;
        py[] pyVarArr;
        AnimatorSet animatorSet;
        py pyVar = this.f36273d3;
        int L0 = pyVar.f37248c.L0();
        qy qyVar = this.f36287r3;
        if (L0 != -1 && pyVar.e.f5679y == 0 && pyVar.f37248c.f5729y < 0 && pyVar.f37246a.getScrollState() != 1) {
            f2.l1 K = pyVar.f37246a.K(L0);
            if (K != null) {
                int top = K.f5774a.getTop();
                if (pyVar.f37252s == 0 && qyVar.Z3() && pyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.c3 = true;
                pyVar.f37248c.h1(L0, (int) ((top - this.f36274e3) + qyVar.f37627u3 + 0));
                this.c3 = false;
            }
        } else if (L0 == -1 && this.f36272b3) {
            uw uwVar = pyVar.f37248c;
            if (pyVar.f37252s == 0 && qyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            uwVar.h1(i12, (int) qyVar.K);
        }
        this.c3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (qyVar.H && !qyVar.L) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!qyVar.L) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f36286q3 = 0;
        float S3 = qyVar.S3(false);
        org.telegram.ui.Components.is isVar = qyVar.G1;
        if (isVar != null) {
            f10 = isVar.getMetadata().f46973c.f46981a;
        } else {
            f10 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f36286q3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.is isVar2 = qyVar.G1;
        if (isVar2 != null) {
            int c3 = (int) isVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.f36286q3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.f36286q3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = qyVar.n3();
        if (dp2 != this.V2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (qyVar.H) {
                pyVar.f37253w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                pyVar.f37253w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof tf.j) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.c3 = false;
        if (this.f36272b3 && qyVar.getMessagesController().dialogsLoaded) {
            if (pyVar.f37252s == 0 && qyVar.Z3()) {
                this.c3 = true;
                ((f2.i0) getLayoutManager()).h1(1, (int) qyVar.K);
                this.c3 = false;
            }
            this.f36272b3 = false;
        }
        super.onMeasure(i10, i11);
        if (!qyVar.f37565i2 && dp2 != 0 && (pyVarArr = qyVar.f37527b0) != null && pyVarArr.length > 1 && !qyVar.f37566i3 && (animatorSet = qyVar.c3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.l1 l1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        char c3;
        if (!this.U1) {
            qy qyVar = this.f36287r3;
            if (qyVar.Y0 || qyVar.f37642y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            py pyVar = this.f36273d3;
            if (action == 1 || action == 3) {
                f2.e0 e0Var = pyVar.e;
                if (e0Var.f5679y != 0) {
                    oy oyVar = pyVar.f37249f;
                    if (oyVar.e) {
                        oyVar.f36900f = true;
                        if (e0Var.f(null, 4) != 0 && (l1Var = pyVar.f37249f.d) != null) {
                            View view = l1Var.f5774a;
                            if (view instanceof org.telegram.ui.Cells.q2) {
                                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                                long dialogId = q2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    y1(false, q2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(qyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            qyVar = qyVar;
                                            qyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            qyVar = qyVar;
                                            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            qyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        qyVar.K2 = !qyVar.g4(dialog);
                                                        qyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!qyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.qc.a(qyVar)) {
                                                        org.telegram.ui.Components.qc.z(qyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                    qyVar.L2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (qyVar.L2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    qyVar.M2 = i15;
                                                    qyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                qyVar.J2 = i16;
                                                qyVar.r4(arrayList5, 101, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (pyVar.f37252s == 0 && ((action == 1 || action == 3) && pyVar.v == 2 && qyVar.Z3() && ((f2.i0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.q2 Q3 = qy.Q3(pyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 76.0f;
                    } else {
                        f10 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - qyVar.Z2;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (pyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                qyVar.f37529b2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.mr.h);
                            }
                            if (!qyVar.f37530b3) {
                                qyVar.f37530b3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                xw xwVar = pyVar.f37250n;
                                if (xwVar != null) {
                                    xwVar.a(true);
                                }
                            }
                            Q3.a0();
                            pyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c3 = 0;
                    } else {
                        qyVar.f37529b2 = true;
                        c3 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.mr.h);
                        pyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c3] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new g3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.y3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.f91(this, 18));
                        ofFloat.start();
                    }
                }
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(f2.o0 o0Var) {
        super.setAdapter(o0Var);
        this.f36272b3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f36275f3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m9;
        qy.f37520x4 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.B1 != -1 && (m9 = getLayoutManager().m(this.B1)) != null) {
            int right = m9.getRight();
            int bottom = (int) (m9.getBottom() + f10);
            Rect rect = this.D1;
            rect.set(m9.getLeft(), (int) (m9.getTop() + f10), right, bottom);
            this.A1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean t1() {
        return true;
    }

    @Override
    public final int v1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void x1(org.telegram.ui.jx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.x1(org.telegram.ui.jx, float, boolean):void");
    }

    public final void y1(boolean z4, org.telegram.ui.Cells.q2 q2Var) {
        SharedConfig.toggleArchiveHidden();
        qy qyVar = this.f36287r3;
        UndoView Y3 = qyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (q2Var != null) {
                qyVar.f37529b2 = true;
                qyVar.Y0 = true;
                int top = (q2Var.getTop() - getPaddingTop()) + q2Var.getMeasuredHeight();
                if (qyVar.H && !qyVar.B0.g()) {
                    qyVar.O = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.mr.f27123g);
                if (z4) {
                    qyVar.f37523a1 = true;
                } else {
                    z1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        z1();
        if (z4 && q2Var != null) {
            q2Var.U();
            q2Var.invalidate();
        }
    }

    public final void z1() {
        int i10;
        boolean z4 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        py pyVar = this.f36273d3;
        pyVar.v = i10;
        xw xwVar = pyVar.f37250n;
        if (xwVar != null) {
            if (i10 != 0) {
                z4 = true;
            }
            xwVar.X = z4;
        }
    }
}
