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
public final class my extends org.telegram.ui.Components.ia implements ai.s9 {
    public static final int f35672v3 = 0;
    public boolean f35673d3;
    public boolean f35674e3;
    public boolean f35675f3;
    public final py f35676g3;
    public int f35677h3;
    public float f35678i3;
    public final Paint j3;
    public final RectF f35679k3;
    public org.telegram.ui.Components.wl0 f35680l3;
    public LongSparseArray f35681m3;
    public Paint f35682n3;
    public float f35683o3;
    public float f35684p3;
    public float f35685q3;
    public boolean f35686r3;
    public ai.rc f35687s3;
    public int f35688t3;
    public final qy f35689u3;

    public my(qy qyVar, Context context, py pyVar) {
        super(context, null);
        this.f35689u3 = qyVar;
        this.f35674e3 = true;
        this.j3 = new Paint();
        this.f35679k3 = new RectF();
        this.f35684p3 = 1.0f;
        this.f35676g3 = pyVar;
        this.f24968b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        py pyVar = this.f35676g3;
        pyVar.v = i10;
        ww wwVar = pyVar.f36683n;
        if (wwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            wwVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f35689u3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(qy.f36998z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f35689u3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f20989r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return qy.f36998z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        py pyVar = this.f35676g3;
        if (pyVar.f36683n != null && qy.f36998z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            pyVar.f36683n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            qy qyVar = this.f35689u3;
            if (!qyVar.f37006b1 && !this.f35676g3.f36687x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                    qyVar.f37012c1 = !kVar.s();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f35677h3 = getPaddingTop();
        this.f35689u3.f37120x3 = 0.0f;
        this.f35676g3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        py[] pyVarArr;
        AnimatorSet animatorSet;
        py pyVar = this.f35676g3;
        int L0 = pyVar.f36681c.L0();
        qy qyVar = this.f35689u3;
        if (L0 != -1 && pyVar.e.f43095y == 0 && pyVar.f36681c.f42943y < 0 && pyVar.f36679a.getScrollState() != 1) {
            s4.c1 K = pyVar.f36679a.K(L0);
            if (K != null) {
                int top = K.f42946a.getTop();
                if (pyVar.f36685s == 0 && qyVar.Z3() && pyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f35675f3 = true;
                pyVar.f36681c.h1(L0, (int) ((top - this.f35677h3) + qyVar.f37120x3 + 0));
                this.f35675f3 = false;
            }
        } else if (L0 == -1 && this.f35674e3) {
            tw twVar = pyVar.f36681c;
            if (pyVar.f36685s == 0 && qyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            twVar.h1(i12, (int) qyVar.N);
        }
        this.f35675f3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (qyVar.K && !qyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!qyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f35688t3 = 0;
        float S3 = qyVar.S3(false);
        org.telegram.ui.Components.ls lsVar = qyVar.J1;
        if (lsVar != null) {
            f7 = lsVar.getMetadata().f14201c.f14209a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f35688t3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.ls lsVar2 = qyVar.J1;
        if (lsVar2 != null) {
            int c10 = (int) lsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.f35688t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        this.f35688t3 -= AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        int n32 = qyVar.n3();
        if (dp2 != this.Y2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (qyVar.K) {
                pyVar.f36686w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                pyVar.f36686w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f35675f3 = false;
        if (this.f35674e3 && qyVar.getMessagesController().dialogsLoaded) {
            if (pyVar.f36685s == 0 && qyVar.Z3()) {
                this.f35675f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) qyVar.N);
                this.f35675f3 = false;
            }
            this.f35674e3 = false;
        }
        super.onMeasure(i10, i11);
        if (!qyVar.f37057l2 && dp2 != 0 && (pyVarArr = qyVar.f37021e0) != null && pyVarArr.length > 1 && !qyVar.f37058l3 && (animatorSet = qyVar.f37030f3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c1 c1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        char c10;
        if (!this.X1) {
            qy qyVar = this.f35689u3;
            if (qyVar.f37006b1 || qyVar.f37121y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            py pyVar = this.f35676g3;
            if (action == 1 || action == 3) {
                s4.y yVar = pyVar.e;
                if (yVar.f43095y != 0) {
                    oy oyVar = pyVar.f36682f;
                    if (oyVar.e) {
                        oyVar.f36351f = true;
                        if (yVar.g(null, 4) != 0 && (c1Var = pyVar.f36682f.d) != null) {
                            View view = c1Var.f42946a;
                            if (view instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                long dialogId = s2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    z1(false, s2Var);
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
                                            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            qyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        qyVar.N2 = !qyVar.g4(dialog);
                                                        qyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!qyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.yc.a(qyVar)) {
                                                        org.telegram.ui.Components.yc.z(qyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                                    qyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (qyVar.O2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    qyVar.P2 = i15;
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
                                                qyVar.M2 = i16;
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
            if (pyVar.f36685s == 0 && ((action == 1 || action == 3) && pyVar.v == 2 && qyVar.Z3() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.s2 Q3 = qy.Q3(pyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 76.0f;
                    } else {
                        f7 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - qyVar.f37014c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (pyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                qyVar.f37023e2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.rr.h);
                            }
                            if (!qyVar.f37024e3) {
                                qyVar.f37024e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ww wwVar = pyVar.f36683n;
                                if (wwVar != null) {
                                    wwVar.a(true);
                                }
                            }
                            Q3.a0();
                            pyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        qyVar.f37023e2 = true;
                        c10 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.rr.h);
                        pyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new c3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ok.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.q81(this, 20));
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
        if (this.f35675f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f35674e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f35678i3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        qy.f36998z4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean u1() {
        return true;
    }

    @Override
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void y1(org.telegram.ui.ix r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.y1(org.telegram.ui.ix, float, boolean):void");
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        qy qyVar = this.f35689u3;
        UndoView Y3 = qyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                qyVar.f37023e2 = true;
                qyVar.f37006b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (qyVar.K && !qyVar.E0.g()) {
                    qyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.rr.f28023g);
                if (z10) {
                    qyVar.f37017d1 = true;
                } else {
                    A1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        A1();
        if (z10 && s2Var != null) {
            s2Var.U();
            s2Var.invalidate();
        }
    }
}
