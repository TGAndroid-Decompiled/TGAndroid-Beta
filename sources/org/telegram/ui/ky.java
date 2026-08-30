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
public final class ky extends org.telegram.ui.Components.aa implements nh.a7 {
    public static final int f35832s3 = 0;
    public boolean f35833a3;
    public boolean f35834b3;
    public boolean c3;
    public final ny f35835d3;
    public int f35836e3;
    public float f35837f3;
    public final Paint f35838g3;
    public final RectF f35839h3;
    public org.telegram.ui.Components.sl0 f35840i3;
    public LongSparseArray f35841j3;
    public Paint f35842k3;
    public float f35843l3;
    public float f35844m3;
    public float f35845n3;
    public boolean f35846o3;
    public nh.q9 f35847p3;
    public int f35848q3;
    public final oy f35849r3;

    public ky(oy oyVar, Context context, ny nyVar) {
        super(context, null);
        this.f35849r3 = oyVar;
        this.f35834b3 = true;
        this.f35838g3 = new Paint();
        this.f35839h3 = new RectF();
        this.f35844m3 = 1.0f;
        this.f35835d3 = nyVar;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10;
        boolean z4 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ny nyVar = this.f35835d3;
        nyVar.v = i10;
        vw vwVar = nyVar.f36745n;
        if (vwVar != null) {
            if (i10 != 0) {
                z4 = true;
            }
            vwVar.X = z4;
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
        int paddingTop = (int) (getPaddingTop() + this.f35849r3.K);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(oy.f37002x4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ky.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f35849r3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f21703r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return oy.f37002x4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ny nyVar = this.f35835d3;
        if (nyVar.f36745n != null && oy.f37002x4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            nyVar.f36745n.c(canvas, true);
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
            oy oyVar = this.f35849r3;
            if (!oyVar.Y0 && !this.f35835d3.f36749x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                    oyVar.Z0 = !kVar.s();
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
        this.f35836e3 = getPaddingTop();
        this.f35849r3.f37109u3 = 0.0f;
        this.f35835d3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f10;
        ny[] nyVarArr;
        AnimatorSet animatorSet;
        ny nyVar = this.f35835d3;
        int L0 = nyVar.f36743c.L0();
        oy oyVar = this.f35849r3;
        if (L0 != -1 && nyVar.e.f5690y == 0 && nyVar.f36743c.f5740y < 0 && nyVar.f36741a.getScrollState() != 1) {
            f2.l1 K = nyVar.f36741a.K(L0);
            if (K != null) {
                int top = K.f5785a.getTop();
                if (nyVar.f36747s == 0 && oyVar.Z3() && nyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.c3 = true;
                nyVar.f36743c.h1(L0, (int) ((top - this.f35836e3) + oyVar.f37109u3 + 0));
                this.c3 = false;
            }
        } else if (L0 == -1 && this.f35834b3) {
            sw swVar = nyVar.f36743c;
            if (nyVar.f36747s == 0 && oyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            swVar.h1(i12, (int) oyVar.K);
        }
        this.c3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (oyVar.H && !oyVar.L) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!oyVar.L) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f35848q3 = 0;
        float S3 = oyVar.S3(false);
        org.telegram.ui.Components.js jsVar = oyVar.G1;
        if (jsVar != null) {
            f10 = jsVar.getMetadata().f46905c.f46913a;
        } else {
            f10 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f35848q3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.js jsVar2 = oyVar.G1;
        if (jsVar2 != null) {
            int c3 = (int) jsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.f35848q3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.f35848q3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = oyVar.n3();
        if (dp2 != this.V2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (oyVar.H) {
                nyVar.f36748w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                nyVar.f36748w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof tf.j) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.c3 = false;
        if (this.f35834b3 && oyVar.getMessagesController().dialogsLoaded) {
            if (nyVar.f36747s == 0 && oyVar.Z3()) {
                this.c3 = true;
                ((f2.i0) getLayoutManager()).h1(1, (int) oyVar.K);
                this.c3 = false;
            }
            this.f35834b3 = false;
        }
        super.onMeasure(i10, i11);
        if (!oyVar.f37047i2 && dp2 != 0 && (nyVarArr = oyVar.f37009b0) != null && nyVarArr.length > 1 && !oyVar.f37048i3 && (animatorSet = oyVar.c3) != null) {
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
            oy oyVar = this.f35849r3;
            if (oyVar.Y0 || oyVar.f37124y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            ny nyVar = this.f35835d3;
            if (action == 1 || action == 3) {
                f2.e0 e0Var = nyVar.e;
                if (e0Var.f5690y != 0) {
                    my myVar = nyVar.f36744f;
                    if (myVar.e) {
                        myVar.f36410f = true;
                        if (e0Var.f(null, 4) != 0 && (l1Var = nyVar.f36744f.d) != null) {
                            View view = l1Var.f5785a;
                            if (view instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                long dialogId = r2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    z1(false, r2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(oyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            oyVar = oyVar;
                                            oyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            oyVar = oyVar;
                                            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            oyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        oyVar.K2 = !oyVar.g4(dialog);
                                                        oyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!oyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.qc.a(oyVar)) {
                                                        org.telegram.ui.Components.qc.z(oyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                    oyVar.L2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (oyVar.L2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    oyVar.M2 = i15;
                                                    oyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                oyVar.J2 = i16;
                                                oyVar.r4(arrayList5, 101, true, false, null);
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
            if (nyVar.f36747s == 0 && ((action == 1 || action == 3) && nyVar.v == 2 && oyVar.Z3() && ((f2.i0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.r2 Q3 = oy.Q3(nyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 76.0f;
                    } else {
                        f10 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - oyVar.Z2;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (nyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                oyVar.f37011b2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.nr.h);
                            }
                            if (!oyVar.f37012b3) {
                                oyVar.f37012b3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                vw vwVar = nyVar.f36745n;
                                if (vwVar != null) {
                                    vwVar.a(true);
                                }
                            }
                            Q3.a0();
                            nyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c3 = 0;
                    } else {
                        oyVar.f37011b2 = true;
                        c3 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.nr.h);
                        nyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c3] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new e3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.y3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
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
        this.f35834b3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f35837f3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m9;
        oy.f37002x4 = f10;
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
    public final boolean u1() {
        return true;
    }

    @Override
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void y1(org.telegram.ui.hx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ky.y1(org.telegram.ui.hx, float, boolean):void");
    }

    public final void z1(boolean z4, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        oy oyVar = this.f35849r3;
        UndoView Y3 = oyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                oyVar.f37011b2 = true;
                oyVar.Y0 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (oyVar.H && !oyVar.B0.g()) {
                    oyVar.O = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.nr.f27347g);
                if (z4) {
                    oyVar.f37005a1 = true;
                } else {
                    A1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        A1();
        if (z4 && r2Var != null) {
            r2Var.U();
            r2Var.invalidate();
        }
    }
}
