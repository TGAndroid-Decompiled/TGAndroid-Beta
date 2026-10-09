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
public final class py extends org.telegram.ui.Components.la implements ai.t9 {
    public static final int f40913t3 = 0;
    public boolean f40914b3;
    public boolean f40915c3;
    public boolean f40916d3;
    public final sy f40917e3;
    public int f40918f3;
    public float f40919g3;
    public final Paint f40920h3;
    public final RectF f40921i3;
    public org.telegram.ui.Components.qm0 j3;
    public LongSparseArray f40922k3;
    public Paint f40923l3;
    public float f40924m3;
    public float f40925n3;
    public float f40926o3;
    public boolean f40927p3;
    public ai.sc f40928q3;
    public int f40929r3;
    public final ty f40930s3;

    public py(ty tyVar, Context context, sy syVar) {
        super(context, null);
        this.f40930s3 = tyVar;
        this.f40915c3 = true;
        this.f40920h3 = new Paint();
        this.f40921i3 = new RectF();
        this.f40925n3 = 1.0f;
        this.f40917e3 = syVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        ty tyVar = this.f40930s3;
        UndoView V3 = tyVar.V3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                tyVar.f42176e2 = true;
                tyVar.f42158b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (tyVar.K && !tyVar.E0.g()) {
                    tyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.hs.f27119g);
                if (z10) {
                    tyVar.f42169d1 = true;
                } else {
                    B1();
                }
            }
            V3.l(0L, 6, null, null);
            return;
        }
        V3.l(0L, 7, null, null);
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
        sy syVar = this.f40917e3;
        syVar.v = i10;
        zw zwVar = syVar.f41795n;
        if (zwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            zwVar.X = z10;
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
        int paddingTop = (int) (getPaddingTop() + this.f40930s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ty.f42150z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f40930s3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f22848r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return ty.f42150z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sy syVar = this.f40917e3;
        if (syVar.f41795n != null && ty.f42150z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            syVar.f41795n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.V1) {
            ty tyVar = this.f40930s3;
            if (!tyVar.f42158b1 && !this.f40917e3.f41799x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                    tyVar.f42164c1 = !kVar.t();
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
        this.f40918f3 = getPaddingTop();
        this.f40930s3.f42273x3 = 0.0f;
        this.f40917e3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        sy[] syVarArr;
        AnimatorSet animatorSet;
        sy syVar = this.f40917e3;
        int L0 = syVar.f41792c.L0();
        ty tyVar = this.f40930s3;
        if (L0 != -1 && syVar.f41793e.f47826y == 0 && syVar.f41792c.f47655y < 0 && syVar.f41790a.getScrollState() != 1) {
            s4.d1 K = syVar.f41790a.K(L0);
            if (K != null) {
                int top = K.f47658a.getTop();
                if (syVar.f41797s == 0 && tyVar.W3() && syVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f40916d3 = true;
                syVar.f41792c.h1(L0, (int) ((top - this.f40918f3) + tyVar.f42273x3 + 0));
                this.f40916d3 = false;
            }
        } else if (L0 == -1 && this.f40915c3) {
            ww wwVar = syVar.f41792c;
            if (syVar.f41797s == 0 && tyVar.W3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            wwVar.h1(i12, (int) tyVar.N);
        }
        this.f40916d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
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
        this.f40929r3 = 0;
        float P3 = tyVar.P3(false);
        org.telegram.ui.Components.at atVar = tyVar.J1;
        if (atVar != null) {
            f7 = atVar.getMetadata().f16355c.f16365a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * P3));
        this.f40929r3 += (int) (AndroidUtilities.dp(50.0f) * P3);
        org.telegram.ui.Components.at atVar2 = tyVar.J1;
        if (atVar2 != null) {
            int c10 = (int) atVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), P3));
            dp += c10;
            this.f40929r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        this.f40929r3 -= AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        int k32 = tyVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (tyVar.K) {
                syVar.f41798w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                syVar.f41798w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f40916d3 = false;
        if (this.f40915c3 && tyVar.getMessagesController().dialogsLoaded) {
            if (syVar.f41797s == 0 && tyVar.W3()) {
                this.f40916d3 = true;
                ((s4.d0) getLayoutManager()).h1(1, (int) tyVar.N);
                this.f40916d3 = false;
            }
            this.f40915c3 = false;
        }
        super.onMeasure(i10, i11);
        if (!tyVar.f42210l2 && dp2 != 0 && (syVarArr = tyVar.f42174e0) != null && syVarArr.length > 1 && !tyVar.f42211l3 && (animatorSet = tyVar.f42183f3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.d1 d1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        char c10;
        if (!this.V1) {
            ty tyVar = this.f40930s3;
            if (!tyVar.f42158b1 && !tyVar.f42274y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                sy syVar = this.f40917e3;
                if (action == 1 || action == 3) {
                    s4.z zVar = syVar.f41793e;
                    if (zVar.f47826y != 0) {
                        ry ryVar = syVar.f41794f;
                        if (ryVar.f41539e) {
                            ryVar.f41540f = true;
                            if (zVar.g(null, 4) != 0 && (d1Var = syVar.f41794f.d) != null) {
                                View view = d1Var.f47658a;
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
                                                tyVar.o4(arrayList, 111, true, false, null);
                                            } else {
                                                tyVar = tyVar;
                                                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                tyVar.o4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            tyVar.N2 = !tyVar.d4(dialog);
                                                            tyVar.o4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!tyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.ad.a(tyVar)) {
                                                            org.telegram.ui.Components.ad.z(tyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                        tyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (tyVar.O2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        tyVar.P2 = i15;
                                                        tyVar.o4(arrayList4, 104, true, false, null);
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
                                                    tyVar.o4(arrayList5, 101, true, false, null);
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
                if (syVar.f41797s == 0 && ((action == 1 || action == 3) && syVar.v == 2 && tyVar.W3() && ((s4.d0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.s2 N3 = ty.N3(syVar);
                    if (N3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = N3.getMeasuredHeight() + (N3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - tyVar.f42166c3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (syVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    tyVar.f42176e2 = true;
                                    v0(0, N3.getTop() - paddingTop, org.telegram.ui.Components.hs.h);
                                }
                                if (!tyVar.f42177e3) {
                                    tyVar.f42177e3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    zw zwVar = syVar.f41795n;
                                    if (zwVar != null) {
                                        zwVar.a(true);
                                    }
                                }
                                N3.a0();
                                syVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            tyVar.f42176e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.hs.h);
                            syVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new c3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.bi.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.i91(this, 20));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
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
        if (this.f40916d3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f40915c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f40919g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ty.f42150z4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.B1.setBounds(rect);
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

    public final void z1(org.telegram.ui.lx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.z1(org.telegram.ui.lx, float, boolean):void");
    }
}
