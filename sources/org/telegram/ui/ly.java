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
public final class ly extends org.telegram.ui.Components.aa implements oh.a7 {
    public static final int f38799s3 = 0;
    public boolean f38800a3;
    public boolean f38801b3;
    public boolean c3;
    public final oy f38802d3;
    public int f38803e3;
    public float f38804f3;
    public final Paint f38805g3;
    public final RectF f38806h3;
    public org.telegram.ui.Components.sl0 f38807i3;
    public LongSparseArray f38808j3;
    public Paint f38809k3;
    public float f38810l3;
    public float f38811m3;
    public float f38812n3;
    public boolean f38813o3;
    public oh.q9 f38814p3;
    public int f38815q3;
    public final py f38816r3;

    public ly(py pyVar, Context context, oy oyVar) {
        super(context, null);
        this.f38816r3 = pyVar;
        this.f38801b3 = true;
        this.f38805g3 = new Paint();
        this.f38806h3 = new RectF();
        this.f38811m3 = 1.0f;
        this.f38802d3 = oyVar;
        this.Y2 = AndroidUtilities.dp(200.0f);
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
        int paddingTop = (int) (getPaddingTop() + this.f38816r3.K);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(py.f40148x4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f38816r3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f23496r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return py.f40148x4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        oy oyVar = this.f38802d3;
        if (oyVar.f39827n != null && py.f40148x4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            oyVar.f39827n.c(canvas, true);
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
            py pyVar = this.f38816r3;
            if (!pyVar.Y0 && !this.f38802d3.f39831x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                    pyVar.Z0 = !kVar.s();
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
        this.f38803e3 = getPaddingTop();
        this.f38816r3.f40256u3 = 0.0f;
        this.f38802d3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f10;
        oy[] oyVarArr;
        AnimatorSet animatorSet;
        oy oyVar = this.f38802d3;
        int L0 = oyVar.f39824c.L0();
        py pyVar = this.f38816r3;
        if (L0 != -1 && oyVar.f39825e.f5767y == 0 && oyVar.f39824c.f5825y < 0 && oyVar.f39822a.getScrollState() != 1) {
            f2.m1 K = oyVar.f39822a.K(L0);
            if (K != null) {
                int top = K.f5875a.getTop();
                if (oyVar.f39829s == 0 && pyVar.Z3() && oyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.c3 = true;
                oyVar.f39824c.h1(L0, (int) ((top - this.f38803e3) + pyVar.f40256u3 + 0));
                this.c3 = false;
            }
        } else if (L0 == -1 && this.f38801b3) {
            tw twVar = oyVar.f39824c;
            if (oyVar.f39829s == 0 && pyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            twVar.h1(i12, (int) pyVar.K);
        }
        this.c3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (pyVar.H && !pyVar.L) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!pyVar.L) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f38815q3 = 0;
        float S3 = pyVar.S3(false);
        org.telegram.ui.Components.ls lsVar = pyVar.G1;
        if (lsVar != null) {
            f10 = lsVar.getMetadata().f50556c.f50566a;
        } else {
            f10 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f38815q3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.ls lsVar2 = pyVar.G1;
        if (lsVar2 != null) {
            int c3 = (int) lsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.f38815q3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.f38815q3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = pyVar.n3();
        if (dp2 != this.V2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (pyVar.H) {
                oyVar.f39830w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                oyVar.f39830w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof uf.j) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.c3 = false;
        if (this.f38801b3 && pyVar.getMessagesController().dialogsLoaded) {
            if (oyVar.f39829s == 0 && pyVar.Z3()) {
                this.c3 = true;
                ((f2.j0) getLayoutManager()).h1(1, (int) pyVar.K);
                this.c3 = false;
            }
            this.f38801b3 = false;
        }
        super.onMeasure(i10, i11);
        if (!pyVar.f40194i2 && dp2 != 0 && (oyVarArr = pyVar.f40155b0) != null && oyVarArr.length > 1 && !pyVar.f40195i3 && (animatorSet = pyVar.c3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.m1 m1Var;
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
            py pyVar = this.f38816r3;
            if (pyVar.Y0 || pyVar.f40271y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            oy oyVar = this.f38802d3;
            if (action == 1 || action == 3) {
                f2.f0 f0Var = oyVar.f39825e;
                if (f0Var.f5767y != 0) {
                    ny nyVar = oyVar.f39826f;
                    if (nyVar.f39477e) {
                        nyVar.f39478f = true;
                        if (f0Var.f(null, 4) != 0 && (m1Var = oyVar.f39826f.d) != null) {
                            View view = m1Var.f5875a;
                            if (view instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                long dialogId = r2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    y1(false, r2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(pyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            pyVar = pyVar;
                                            pyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            pyVar = pyVar;
                                            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            pyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        pyVar.K2 = !pyVar.g4(dialog);
                                                        pyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!pyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.qc.a(pyVar)) {
                                                        org.telegram.ui.Components.qc.z(pyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                    pyVar.L2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (pyVar.L2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    pyVar.M2 = i15;
                                                    pyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                pyVar.J2 = i16;
                                                pyVar.r4(arrayList5, 101, true, false, null);
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
            if (oyVar.f39829s == 0 && ((action == 1 || action == 3) && oyVar.v == 2 && pyVar.Z3() && ((f2.j0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.r2 Q3 = py.Q3(oyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 76.0f;
                    } else {
                        f10 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - pyVar.Z2;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (oyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                pyVar.f40157b2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.pr.h);
                            }
                            if (!pyVar.f40158b3) {
                                pyVar.f40158b3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ww wwVar = oyVar.f39827n;
                                if (wwVar != null) {
                                    wwVar.a(true);
                                }
                            }
                            Q3.a0();
                            oyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c3 = 0;
                    } else {
                        pyVar.f40157b2 = true;
                        c3 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.pr.h);
                        oyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c3] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new e3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.y3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
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
    public void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.f38801b3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f38804f3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m9;
        py.f40148x4 = f10;
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

    public final void x1(org.telegram.ui.ix r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.x1(org.telegram.ui.ix, float, boolean):void");
    }

    public final void y1(boolean z4, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        py pyVar = this.f38816r3;
        UndoView Y3 = pyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                pyVar.f40157b2 = true;
                pyVar.Y0 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (pyVar.H && !pyVar.B0.g()) {
                    pyVar.O = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.pr.f30169g);
                if (z4) {
                    pyVar.f40151a1 = true;
                } else {
                    z1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        z1();
        if (z4 && r2Var != null) {
            r2Var.U();
            r2Var.invalidate();
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
        oy oyVar = this.f38802d3;
        oyVar.v = i10;
        ww wwVar = oyVar.f39827n;
        if (wwVar != null) {
            if (i10 != 0) {
                z4 = true;
            }
            wwVar.X = z4;
        }
    }
}
