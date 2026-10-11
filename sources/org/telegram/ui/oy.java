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
public final class oy extends org.telegram.ui.Components.ka implements ai.t9 {
    public static final int f40677t3 = 0;
    public boolean f40678b3;
    public boolean f40679c3;
    public boolean f40680d3;
    public final ry f40681e3;
    public int f40682f3;
    public float f40683g3;
    public final Paint f40684h3;
    public final RectF f40685i3;
    public org.telegram.ui.Components.rm0 j3;
    public LongSparseArray f40686k3;
    public Paint f40687l3;
    public float f40688m3;
    public float f40689n3;
    public float f40690o3;
    public boolean f40691p3;
    public ai.sc f40692q3;
    public int f40693r3;
    public final sy f40694s3;

    public oy(sy syVar, Context context, ry ryVar) {
        super(context, null);
        this.f40694s3 = syVar;
        this.f40679c3 = true;
        this.f40684h3 = new Paint();
        this.f40685i3 = new RectF();
        this.f40689n3 = 1.0f;
        this.f40681e3 = ryVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        sy syVar = this.f40694s3;
        UndoView V3 = syVar.V3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                syVar.f41943e2 = true;
                syVar.f41925b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (syVar.K && !syVar.E0.g()) {
                    syVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.is.f27501g);
                if (z10) {
                    syVar.f41936d1 = true;
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
        ry ryVar = this.f40681e3;
        ryVar.v = i10;
        yw ywVar = ryVar.f41569n;
        if (ywVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            ywVar.X = z10;
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
        int paddingTop = (int) (getPaddingTop() + this.f40694s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(sy.f41917z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f40694s3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f22876r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return sy.f41917z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ry ryVar = this.f40681e3;
        if (ryVar.f41569n != null && sy.f41917z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ryVar.f41569n.c(canvas, true);
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
            sy syVar = this.f40694s3;
            if (!syVar.f41925b1 && !this.f40681e3.f41573x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                    syVar.f41931c1 = !kVar.t();
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
        this.f40682f3 = getPaddingTop();
        this.f40694s3.f42040x3 = 0.0f;
        this.f40681e3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        ry[] ryVarArr;
        AnimatorSet animatorSet;
        ry ryVar = this.f40681e3;
        int L0 = ryVar.f41566c.L0();
        sy syVar = this.f40694s3;
        if (L0 != -1 && ryVar.f41567e.f47950y == 0 && ryVar.f41566c.f47779y < 0 && ryVar.f41564a.getScrollState() != 1) {
            s4.d1 K = ryVar.f41564a.K(L0);
            if (K != null) {
                int top = K.f47782a.getTop();
                if (ryVar.f41571s == 0 && syVar.W3() && ryVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f40680d3 = true;
                ryVar.f41566c.h1(L0, (int) ((top - this.f40682f3) + syVar.f42040x3 + 0));
                this.f40680d3 = false;
            }
        } else if (L0 == -1 && this.f40679c3) {
            vw vwVar = ryVar.f41566c;
            if (ryVar.f41571s == 0 && syVar.W3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            vwVar.h1(i12, (int) syVar.N);
        }
        this.f40680d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (syVar.K && !syVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!syVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f40693r3 = 0;
        float P3 = syVar.P3(false);
        org.telegram.ui.Components.bt btVar = syVar.J1;
        if (btVar != null) {
            f7 = btVar.getMetadata().f16419c.f16429a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * P3));
        this.f40693r3 += (int) (AndroidUtilities.dp(50.0f) * P3);
        org.telegram.ui.Components.bt btVar2 = syVar.J1;
        if (btVar2 != null) {
            int c10 = (int) btVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), P3));
            dp += c10;
            this.f40693r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        this.f40693r3 -= AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        int k32 = syVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (syVar.K) {
                ryVar.f41572w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                ryVar.f41572w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f40680d3 = false;
        if (this.f40679c3 && syVar.getMessagesController().dialogsLoaded) {
            if (ryVar.f41571s == 0 && syVar.W3()) {
                this.f40680d3 = true;
                ((s4.d0) getLayoutManager()).h1(1, (int) syVar.N);
                this.f40680d3 = false;
            }
            this.f40679c3 = false;
        }
        super.onMeasure(i10, i11);
        if (!syVar.f41977l2 && dp2 != 0 && (ryVarArr = syVar.f41941e0) != null && ryVarArr.length > 1 && !syVar.f41978l3 && (animatorSet = syVar.f41950f3) != null) {
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
            sy syVar = this.f40694s3;
            if (!syVar.f41925b1 && !syVar.f42041y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ry ryVar = this.f40681e3;
                if (action == 1 || action == 3) {
                    s4.z zVar = ryVar.f41567e;
                    if (zVar.f47950y != 0) {
                        qy qyVar = ryVar.f41568f;
                        if (qyVar.f41314e) {
                            qyVar.f41315f = true;
                            if (zVar.g(null, 4) != 0 && (d1Var = ryVar.f41568f.d) != null) {
                                View view = d1Var.f47782a;
                                if (view instanceof org.telegram.ui.Cells.s2) {
                                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                    long dialogId = s2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        A1(false, s2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) syVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(syVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                syVar = syVar;
                                                syVar.o4(arrayList, 111, true, false, null);
                                            } else {
                                                syVar = syVar;
                                                i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                syVar.o4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            syVar.N2 = !syVar.d4(dialog);
                                                            syVar.o4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!syVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.ad.a(syVar)) {
                                                            org.telegram.ui.Components.ad.z(syVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                                                        syVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (syVar.O2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        syVar.P2 = i15;
                                                        syVar.o4(arrayList4, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    arrayList5.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    syVar.M2 = i16;
                                                    syVar.o4(arrayList5, 101, true, false, null);
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
                if (ryVar.f41571s == 0 && ((action == 1 || action == 3) && ryVar.v == 2 && syVar.W3() && ((s4.d0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.s2 N3 = sy.N3(ryVar);
                    if (N3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = N3.getMeasuredHeight() + (N3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - syVar.f41933c3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (ryVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    syVar.f41943e2 = true;
                                    v0(0, N3.getTop() - paddingTop, org.telegram.ui.Components.is.h);
                                }
                                if (!syVar.f41944e3) {
                                    syVar.f41944e3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    yw ywVar = ryVar.f41569n;
                                    if (ywVar != null) {
                                        ywVar.a(true);
                                    }
                                }
                                N3.a0();
                                ryVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            syVar.f41943e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.is.h);
                            ryVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new b3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ai.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.is.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.j91(this, 20));
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
        if (this.f40680d3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f40679c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f40683g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        sy.f41917z4 = f7;
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

    public final void z1(org.telegram.ui.kx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.z1(org.telegram.ui.kx, float, boolean):void");
    }
}
