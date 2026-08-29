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
public final class ay extends org.telegram.ui.Components.fa implements lh.z6 {
    public static final int f36618r3 = 0;
    public boolean Z2;
    public boolean f36619a3;
    public boolean f36620b3;
    public final ey c3;
    public int f36621d3;
    public float f36622e3;
    public final Paint f36623f3;
    public final RectF f36624g3;
    public org.telegram.ui.Components.jl0 f36625h3;
    public LongSparseArray f36626i3;
    public Paint f36627j3;
    public float f36628k3;
    public float f36629l3;
    public float f36630m3;
    public boolean f36631n3;
    public lh.q9 f36632o3;
    public int f36633p3;
    public final fy f36634q3;

    public ay(fy fyVar, Context context, ey eyVar) {
        super(context, null);
        this.f36634q3 = fyVar;
        this.f36619a3 = true;
        this.f36623f3 = new Paint();
        this.f36624g3 = new RectF();
        this.f36629l3 = 1.0f;
        this.c3 = eyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ey eyVar = this.c3;
        eyVar.v = i10;
        mw mwVar = eyVar.f37926n;
        if (mwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            mwVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.k4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f36634q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(fy.f38254w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f36634q3.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).f24911r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return fy.f38254w4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ey eyVar = this.c3;
        if (eyVar.f37926n != null && fy.f38254w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            eyVar.f37926n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.T1) {
            fy fyVar = this.f36634q3;
            if (!fyVar.X0 && !this.c3.f37930x.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    fyVar.Y0 = !lVar.s();
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
        this.f36621d3 = getPaddingTop();
        this.f36634q3.f38357t3 = 0.0f;
        this.c3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        float f9;
        ey[] eyVarArr;
        AnimatorSet animatorSet;
        ey eyVar = this.c3;
        int L0 = eyVar.f37923c.L0();
        fy fyVar = this.f36634q3;
        if (L0 != -1 && eyVar.f37924e.f6309y == 0 && eyVar.f37923c.f6371y < 0 && eyVar.f37921a.getScrollState() != 1) {
            f2.n1 K = eyVar.f37921a.K(L0);
            if (K != null) {
                int top = K.f6432a.getTop();
                if (eyVar.f37928s == 0 && fyVar.Z3() && eyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f36620b3 = true;
                eyVar.f37923c.h1(L0, (int) ((top - this.f36621d3) + fyVar.f38357t3 + 0));
                this.f36620b3 = false;
            }
        } else if (L0 == -1 && this.f36619a3) {
            jw jwVar = eyVar.f37923c;
            if (eyVar.f37928s == 0 && fyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            jwVar.h1(i12, (int) fyVar.J);
        }
        this.f36620b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (fyVar.G && !fyVar.K) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!fyVar.K) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f36633p3 = 0;
        float S3 = fyVar.S3(false);
        org.telegram.ui.Components.fs fsVar = fyVar.F1;
        if (fsVar != null) {
            f9 = fsVar.getMetadata().f49521c.f49531a;
        } else {
            f9 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f36633p3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.fs fsVar2 = fyVar.F1;
        if (fsVar2 != null) {
            int c3 = (int) fsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.f36633p3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f9) * 5.0f);
        this.f36633p3 -= AndroidUtilities.dp(Math.max(S3, f9) * 5.0f);
        int n32 = fyVar.n3();
        if (dp2 != this.U2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (fyVar.G) {
                eyVar.f37929w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                eyVar.f37929w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof rf.k) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f36620b3 = false;
        if (this.f36619a3 && fyVar.getMessagesController().dialogsLoaded) {
            if (eyVar.f37928s == 0 && fyVar.Z3()) {
                this.f36620b3 = true;
                ((f2.j0) getLayoutManager()).h1(1, (int) fyVar.J);
                this.f36620b3 = false;
            }
            this.f36619a3 = false;
        }
        super.onMeasure(i10, i11);
        if (!fyVar.f38295h2 && dp2 != 0 && (eyVarArr = fyVar.f38256a0) != null && eyVarArr.length > 1 && !fyVar.f38296h3 && (animatorSet = fyVar.f38264b3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.n1 n1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f9;
        char c3;
        if (!this.T1) {
            fy fyVar = this.f36634q3;
            if (fyVar.X0 || fyVar.f38376y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            ey eyVar = this.c3;
            if (action == 1 || action == 3) {
                f2.e0 e0Var = eyVar.f37924e;
                if (e0Var.f6309y != 0) {
                    dy dyVar = eyVar.f37925f;
                    if (dyVar.f37649e) {
                        dyVar.f37650f = true;
                        if (e0Var.f(null, 4) != 0 && (n1Var = eyVar.f37925f.d) != null) {
                            View view = n1Var.f6432a;
                            if (view instanceof org.telegram.ui.Cells.p2) {
                                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                long dialogId = p2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    z1(false, p2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(fyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            fyVar = fyVar;
                                            fyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            fyVar = fyVar;
                                            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            fyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        fyVar.J2 = !fyVar.g4(dialog);
                                                        fyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!fyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.tc.a(fyVar)) {
                                                        org.telegram.ui.Components.tc.z(fyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    fyVar.K2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (fyVar.K2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    fyVar.L2 = i15;
                                                    fyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                fyVar.I2 = i16;
                                                fyVar.r4(arrayList5, 101, true, false, null);
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
            if (eyVar.f37928s == 0 && ((action == 1 || action == 3) && eyVar.v == 2 && fyVar.Z3() && ((f2.j0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.p2 Q3 = fy.Q3(eyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f9 = 76.0f;
                    } else {
                        f9 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f9) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - fyVar.Y2;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (eyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                fyVar.a2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.jr.h);
                            }
                            if (!fyVar.f38258a3) {
                                fyVar.f38258a3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                mw mwVar = eyVar.f37926n;
                                if (mwVar != null) {
                                    mwVar.a(true);
                                }
                            }
                            Q3.a0();
                            eyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c3 = 0;
                    } else {
                        fyVar.a2 = true;
                        c3 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.jr.h);
                        eyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c3] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new g3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.x3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.p11(this, 27));
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
        if (this.f36620b3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.f36619a3 = true;
    }

    public void setOpenRightFragmentProgress(float f9) {
        this.f36622e3 = f9;
        invalidate();
    }

    public void setViewsOffset(float f9) {
        View m10;
        fy.f38254w4 = f9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f9);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f9);
            Rect rect = this.C1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f9), right, bottom);
            this.f29736z1.setBounds(rect);
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

    public final void y1(org.telegram.ui.yw r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.y1(org.telegram.ui.yw, float, boolean):void");
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        fy fyVar = this.f36634q3;
        UndoView Y3 = fyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (p2Var != null) {
                fyVar.a2 = true;
                fyVar.X0 = true;
                int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
                if (fyVar.G && !fyVar.A0.g()) {
                    fyVar.N = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.jr.f29801g);
                if (z10) {
                    fyVar.Z0 = true;
                } else {
                    A1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        A1();
        if (z10 && p2Var != null) {
            p2Var.U();
            p2Var.invalidate();
        }
    }
}
