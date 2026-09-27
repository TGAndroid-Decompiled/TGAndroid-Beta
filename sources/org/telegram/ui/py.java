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
public final class py extends org.telegram.ui.Components.ia implements ai.s9 {
    public static final int f36563v3 = 0;
    public boolean f36564d3;
    public boolean f36565e3;
    public boolean f36566f3;
    public final sy f36567g3;
    public int f36568h3;
    public float f36569i3;
    public final Paint j3;
    public final RectF f36570k3;
    public org.telegram.ui.Components.yl0 f36571l3;
    public LongSparseArray f36572m3;
    public Paint f36573n3;
    public float f36574o3;
    public float f36575p3;
    public float f36576q3;
    public boolean f36577r3;
    public ai.rc f36578s3;
    public int f36579t3;
    public final ty f36580u3;

    public py(ty tyVar, Context context, sy syVar) {
        super(context, null);
        this.f36580u3 = tyVar;
        this.f36565e3 = true;
        this.j3 = new Paint();
        this.f36570k3 = new RectF();
        this.f36575p3 = 1.0f;
        this.f36567g3 = syVar;
        this.f25068b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        ty tyVar = this.f36580u3;
        UndoView h42 = tyVar.h4();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                tyVar.f37978e2 = true;
                tyVar.f37961b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (tyVar.K && !tyVar.E0.g()) {
                    tyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.sr.f28360g);
                if (z10) {
                    tyVar.f37972d1 = true;
                } else {
                    B1();
                }
            }
            h42.l(0L, 6, null, null);
            return;
        }
        h42.l(0L, 7, null, null);
        B1();
        if (z10 && s2Var != null) {
            s2Var.U();
            s2Var.invalidate();
        }
    }

    public final void B1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        sy syVar = this.f36567g3;
        syVar.v = i10;
        ww wwVar = syVar.f37597n;
        if (wwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            wwVar.X = z10;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f36580u3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ty.f37953y4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f36580u3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f21005r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return ty.f37953y4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sy syVar = this.f36567g3;
        if (syVar.f37597n != null && ty.f37953y4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            syVar.f37597n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.X1) {
            ty tyVar = this.f36580u3;
            if (!tyVar.f37961b1 && !this.f36567g3.f37601x.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                    tyVar.f37967c1 = !lVar.t();
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
        this.f36568h3 = getPaddingTop();
        this.f36580u3.f38074x3 = 0.0f;
        this.f36567g3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        float f7;
        sy[] syVarArr;
        AnimatorSet animatorSet;
        sy syVar = this.f36567g3;
        int L0 = syVar.f37595c.L0();
        ty tyVar = this.f36580u3;
        if (L0 != -1 && syVar.e.f43154y == 0 && syVar.f37595c.f43002y < 0 && syVar.f37593a.getScrollState() != 1) {
            s4.c1 L = syVar.f37593a.L(L0);
            if (L != null) {
                int top = L.f43005a.getTop();
                if (syVar.f37599s == 0 && tyVar.i4() && syVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f36566f3 = true;
                syVar.f37595c.h1(L0, (int) ((top - this.f36568h3) + tyVar.f38074x3 + 0));
                this.f36566f3 = false;
            }
        } else if (L0 == -1 && this.f36565e3) {
            tw twVar = syVar.f37595c;
            if (syVar.f37599s == 0 && tyVar.i4()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            twVar.h1(i12, (int) tyVar.N);
        }
        this.f36566f3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (tyVar.K && !tyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!tyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f36579t3 = 0;
        float b42 = tyVar.b4(false);
        org.telegram.ui.Components.ms msVar = tyVar.J1;
        if (msVar != null) {
            f7 = msVar.getMetadata().f14218c.f14226a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * b42));
        this.f36579t3 += (int) (AndroidUtilities.dp(50.0f) * b42);
        org.telegram.ui.Components.ms msVar2 = tyVar.J1;
        if (msVar2 != null) {
            int c10 = (int) msVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), b42));
            dp += c10;
            this.f36579t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(b42, f7) * 5.0f);
        this.f36579t3 -= AndroidUtilities.dp(Math.max(b42, f7) * 5.0f);
        int w32 = tyVar.w3();
        if (dp2 != this.Y2 || w32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, w32);
            if (tyVar.K) {
                syVar.f37600w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                syVar.f37600w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f36566f3 = false;
        if (this.f36565e3 && tyVar.getMessagesController().dialogsLoaded) {
            if (syVar.f37599s == 0 && tyVar.i4()) {
                this.f36566f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) tyVar.N);
                this.f36566f3 = false;
            }
            this.f36565e3 = false;
        }
        super.onMeasure(i10, i11);
        if (!tyVar.f38012l2 && dp2 != 0 && (syVarArr = tyVar.f37976e0) != null && syVarArr.length > 1 && !tyVar.f38013l3 && (animatorSet = tyVar.f37985f3) != null) {
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
            ty tyVar = this.f36580u3;
            if (tyVar.f37961b1 || tyVar.f38075y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            sy syVar = this.f36567g3;
            if (action == 1 || action == 3) {
                s4.y yVar = syVar.e;
                if (yVar.f43154y != 0) {
                    ry ryVar = syVar.f37596f;
                    if (ryVar.e) {
                        ryVar.f37246f = true;
                        if (yVar.g(null, 4) != 0 && (c1Var = syVar.f37596f.d) != null) {
                            View view = c1Var.f43005a;
                            if (view instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                long dialogId = s2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    A1(false, s2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(tyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            tyVar = tyVar;
                                            tyVar.A4(arrayList, 111, true, false, null);
                                        } else {
                                            tyVar = tyVar;
                                            i10 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            tyVar.A4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        tyVar.N2 = !tyVar.p4(dialog);
                                                        tyVar.A4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!tyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.xc.a(tyVar)) {
                                                        org.telegram.ui.Components.xc.z(tyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                                                    tyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (tyVar.O2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    tyVar.P2 = i15;
                                                    tyVar.A4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                tyVar.M2 = i16;
                                                tyVar.A4(arrayList5, 101, true, false, null);
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
            if (syVar.f37599s == 0 && ((action == 1 || action == 3) && syVar.v == 2 && tyVar.i4() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.s2 Z3 = ty.Z3(syVar);
                if (Z3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 76.0f;
                    } else {
                        f7 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = Z3.getMeasuredHeight() + (Z3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - tyVar.f37969c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (syVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                tyVar.f37978e2 = true;
                                w0(0, Z3.getTop() - paddingTop, org.telegram.ui.Components.sr.h);
                            }
                            if (!tyVar.f37979e3) {
                                tyVar.f37979e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ww wwVar = syVar.f37597n;
                                if (wwVar != null) {
                                    wwVar.a(true);
                                }
                            }
                            Z3.a0();
                            syVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        tyVar.f37978e2 = true;
                        c10 = 0;
                        w0(0, measuredHeight, org.telegram.ui.Components.sr.h);
                        syVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new d3(this, 9));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.qk.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.s81(this, 20));
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
        if (this.f36566f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f36565e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f36569i3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ty.f37953y4 = f7;
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
    public final boolean v1() {
        return true;
    }

    @Override
    public final int x1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void z1(org.telegram.ui.ix r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.z1(org.telegram.ui.ix, float, boolean):void");
    }
}
