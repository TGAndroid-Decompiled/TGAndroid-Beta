package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class pw extends org.telegram.ui.Components.w9 implements ei.g7 {
    public static final int C3 = 0;
    public int A3;
    public final uw B3;
    public boolean f48676k3;
    public boolean f48677l3;
    public boolean f48678m3;
    public final tw f48679n3;
    public int f48680o3;
    public float f48681p3;
    public final Paint f48682q3;
    public final RectF f48683r3;
    public org.telegram.ui.Components.tj0 f48684s3;
    public LongSparseArray f48685t3;
    public Paint f48686u3;
    public float f48687v3;
    public float f48688w3;
    public float f48689x3;
    public boolean f48690y3;
    public ei.z9 f48691z3;

    public pw(uw uwVar, Context context, tw twVar) {
        super(context, null);
        this.B3 = uwVar;
        this.f48677l3 = true;
        this.f48682q3 = new Paint();
        this.f48683r3 = new RectF();
        this.f48688w3 = 1.0f;
        this.f48679n3 = twVar;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.nv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.B1(org.telegram.ui.nv, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.az.f21657q1 = !org.telegram.messenger.az.f21657q1;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.az.f21657q1);
        edit.apply();
        uw uwVar = this.B3;
        UndoView k42 = uwVar.k4();
        if (org.telegram.messenger.az.f21657q1) {
            if (t2Var != null) {
                uwVar.f50232f2 = true;
                uwVar.f50215c1 = true;
                int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
                if (uwVar.L && !uwVar.F0.g()) {
                    uwVar.S = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.xq.f40453g);
                if (z10) {
                    uwVar.f50225e1 = true;
                } else {
                    D1();
                }
            }
            k42.l(0L, 6, null, null);
            return;
        }
        k42.l(0L, 7, null, null);
        D1();
        if (z10 && t2Var != null) {
            t2Var.b0();
            t2Var.invalidate();
        }
    }

    public final void D1() {
        int i3;
        boolean z10 = false;
        if (org.telegram.messenger.az.f21657q1) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        tw twVar = this.f48679n3;
        twVar.f49905w = i3;
        cv cvVar = twVar.f49902n;
        if (cvVar != null) {
            if (i3 != 0) {
                z10 = true;
            }
            cvVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        view.setTranslationY(uw.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.B3.O) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).f30547r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return uw.B4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tw twVar = this.f48679n3;
        if (twVar.f49902n != null && uw.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            twVar.f49902n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            uw uwVar = this.B3;
            if (!uwVar.f50215c1 && !this.f48679n3.f49907y.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    uwVar.f50219d1 = !kVar.v();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f48680o3 = getPaddingTop();
        this.B3.f50333z3 = 0.0f;
        this.f48679n3.getClass();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        tw[] twVarArr;
        AnimatorSet animatorSet;
        tw twVar = this.f48679n3;
        int L0 = twVar.f49899c.L0();
        uw uwVar = this.B3;
        if (L0 != -1 && twVar.f49900e.E == 0 && twVar.f49899c.f55518y < 0 && twVar.f49897a.getScrollState() != 1) {
            u4.d1 K = twVar.f49897a.K(L0);
            if (K != null) {
                int top = K.f55540a.getTop();
                if (twVar.f49904s == 0 && uwVar.l4() && twVar.f49905w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f48678m3 = true;
                twVar.f49899c.h1(L0, (int) ((top - this.f48680o3) + uwVar.f50333z3 + 0));
                this.f48678m3 = false;
            }
        } else if (L0 == -1 && this.f48677l3) {
            zu zuVar = twVar.f49899c;
            if (twVar.f49904s == 0 && uwVar.l4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            zuVar.h1(i11, (int) uwVar.O);
        }
        this.f48678m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f22602m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (uwVar.L && !uwVar.P) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!uwVar.P) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = uwVar.e4(false);
        org.telegram.ui.Components.pr prVar = uwVar.K1;
        if (prVar != null) {
            f10 = prVar.getMetadata().f53856c.f53866a;
        } else {
            f10 = 0.0f;
        }
        int L = i13 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.A3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.pr prVar2 = uwVar.K1;
        if (prVar2 != null) {
            int c2 = (int) prVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c2;
            this.A3 += c2;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = uwVar.w3();
        if (L2 != this.f39972g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (uwVar.L) {
                twVar.f49906x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                twVar.f49906x.setPaddingTop(L2);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if (getChildAt(i14) instanceof kg.l) {
                    getChildAt(i14).requestLayout();
                }
            }
        }
        this.f48678m3 = false;
        if (this.f48677l3 && uwVar.getMessagesController().Z1) {
            if (twVar.f49904s == 0 && uwVar.l4()) {
                this.f48678m3 = true;
                ((u4.b0) getLayoutManager()).h1(1, (int) uwVar.O);
                this.f48678m3 = false;
            }
            this.f48677l3 = false;
        }
        super.onMeasure(i3, i10);
        if (!uwVar.f50263m2 && L2 != 0 && (twVarArr = uwVar.f50230f0) != null && twVarArr.length > 1 && !uwVar.f50270n3 && (animatorSet = uwVar.f50243h3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4.d1 d1Var;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        if (!this.W1) {
            uw uwVar = this.B3;
            if (!uwVar.f50215c1 && !uwVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                tw twVar = this.f48679n3;
                if (action == 1 || action == 3) {
                    u4.y yVar = twVar.f49900e;
                    if (yVar.E != 0) {
                        sw swVar = twVar.f49901f;
                        if (swVar.f49627e) {
                            swVar.f49628f = true;
                            if (yVar.i(null, 4) != 0 && (d1Var = twVar.f49901f.d) != null) {
                                View view = d1Var.f55540a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.t3.Y(uwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                if (org.telegram.messenger.az.m(i3) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                    if (org.telegram.messenger.az.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                        if (org.telegram.messenger.az.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                            if (org.telegram.messenger.az.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                uwVar.D4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            uwVar.P2 = !uwVar.s4(dialog);
                                                            uwVar.D4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!uwVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.fc.a(uwVar)) {
                                                            org.telegram.ui.Components.fc.z(uwVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                        uwVar.Q2 = !org.telegram.messenger.hp.s1(i13).r2(dialogId, 0L, null);
                                                        if (uwVar.Q2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        uwVar.R2 = i14;
                                                        uwVar.D4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    uwVar.O2 = i15;
                                                    uwVar.D4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                uwVar.D4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (twVar.f49904s == 0 && ((action == 1 || action == 3) && twVar.f49905w == 2 && uwVar.l4() && ((u4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = uw.c4(twVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.az.f21654p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - uwVar.f50227e3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (twVar.f49905w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    uwVar.f50232f2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                                }
                                if (!uwVar.f50238g3) {
                                    uwVar.f50238g3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    cv cvVar = twVar.f49902n;
                                    if (cvVar != null) {
                                        cvVar.a(true);
                                    }
                                }
                                c42.h0();
                                twVar.f49905w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.bd.M0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            uwVar.f50232f2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                            i16 = 2;
                            twVar.f49905w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new b3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.w9(this, 27));
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
        if (this.f48678m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(u4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f48677l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f48681p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        uw.B4 = f10;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean w1() {
        return true;
    }

    @Override
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }
}
