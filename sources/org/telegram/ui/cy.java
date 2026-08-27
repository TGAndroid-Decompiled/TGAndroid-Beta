package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

public final class cy extends org.telegram.ui.Components.y9 implements jh.z6 {

    public static final int f37191r3 = 0;
    public boolean Z2;
    public boolean a3;

    public boolean f37192b3;

    public final fy f37193c3;

    public int f37194d3;

    public float f37195e3;

    public final Paint f37196f3;

    public final RectF f37197g3;

    public org.telegram.ui.Components.zk0 f37198h3;

    public LongSparseArray f37199i3;

    public Paint f37200j3;

    public float f37201k3;

    public float f37202l3;

    public float f37203m3;

    public boolean f37204n3;

    public jh.q9 f37205o3;

    public int f37206p3;

    public final gy f37207q3;

    public cy(gy gyVar, Context context, fy fyVar) {
        super(context, null);
        this.f37207q3 = gyVar;
        this.a3 = true;
        this.f37196f3 = new Paint();
        this.f37197g3 = new RectF();
        this.f37202l3 = 1.0f;
        this.f37193c3 = fyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        fy fyVar = this.f37193c3;
        fyVar.v = i10;
        nw nwVar = fyVar.f38230n;
        if (nwVar != null) {
            nwVar.X = i10 != 0;
        }
    }

    @Override
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.j4) || view.isClickable();
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f37207q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(gy.f38496w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float top;
        org.telegram.ui.Components.lc0 lc0Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        gy gyVar;
        float f14;
        int i10;
        int i11;
        org.telegram.ui.Cells.p2 p2Var;
        org.telegram.ui.Cells.p2 p2Var2;
        int i12;
        View view;
        int iR;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f15 = this.f37195e3;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
        Paint paint = this.f37196f3;
        if (f15 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(g31.getRightPaddingSize()), this.f37195e3), getMeasuredHeight());
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23323s9, c6Var));
            paint.setAlpha((int) (paint.getAlpha() * this.f37195e3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(g31.getRightPaddingSize()), getMeasuredHeight(), paint);
            int alpha = org.telegram.ui.ActionBar.g6.f23175k0.getAlpha();
            org.telegram.ui.ActionBar.g6.f23175k0.setAlpha((int) (this.f37195e3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(g31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(g31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
            org.telegram.ui.ActionBar.g6.f23175k0.setAlpha(alpha);
        }
        if (this.f37198h3 != null) {
            if (this.f37199i3 == null) {
                this.f37199i3 = new LongSparseArray();
            }
            for (int i13 = 0; i13 < this.f37198h3.getChildCount(); i13++) {
                View childAt = this.f37198h3.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.p2) && childAt.getBottom() > 0) {
                    this.f37199i3.put(((org.telegram.ui.Cells.p2) childAt).getDialogId(), childAt);
                }
            }
        }
        gy gyVar2 = this.f37207q3;
        float f16 = gyVar2.A ? 0.0f : gyVar2.J;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        org.telegram.ui.Cells.p2 p2Var3 = null;
        float top2 = 2.1474836E9f;
        float f17 = -2.1474836E9f;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var4 = (org.telegram.ui.Cells.p2) childAt2;
                f14 = 1.0f;
                p2Var4.setRightFragmentOpenedProgress(this.f37195e3);
                if (AndroidUtilities.isTablet()) {
                    p2Var4.setDialogSelected(p2Var4.getDialogId() == gyVar2.f38556l2.dialogId);
                }
                LongSparseArray longSparseArray = this.f37199i3;
                if (longSparseArray == null || this.f37198h3 == null) {
                    gyVar = gyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(p2Var4.getDialogId());
                    gyVar = gyVar2;
                    this.f37199i3.delete(p2Var4.getDialogId());
                    if (view2 != null) {
                        this.f37198h3.getClass();
                        int iS = RecyclerView.S(view2);
                        if (iS > i14) {
                            i14 = iS;
                        }
                        if (iS < i15) {
                            i15 = iS;
                        }
                        p2Var4.f24959y0 = (view2.getTop() - p2Var4.getTop()) * this.f37195e3;
                        if (p2Var4.getTop() + p2Var4.f24959y0 < top2) {
                            top2 = (p2Var4.getTop() + p2Var4.f24959y0) - f16;
                        }
                        float fLerp = AndroidUtilities.lerp(p2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.f37195e3) + p2Var4.getTop() + p2Var4.f24959y0;
                        if (fLerp > f17) {
                            f17 = fLerp - f16;
                        }
                    }
                }
                if (this.Z2 && p2Var4.b0(0, true) && (iR = RecyclerView.R(p2Var4)) >= 0) {
                    getAdapter().m(iR);
                }
                if (p2Var4.getDialogId() == gyVar.B3.getCurrentFragmetDialogId()) {
                    p2Var3 = p2Var4;
                    p2Var = p2Var3;
                } else {
                    p2Var = p2Var4;
                }
                i10 = i14;
                i11 = i15;
            } else {
                paint = paint;
                gyVar = gyVar2;
                f14 = 1.0f;
                i10 = i14;
                i11 = i15;
                p2Var = null;
            }
            if (this.f37198h3 != null) {
                int iSave = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (p2Var != null) {
                    p2Var.f24899n = -f16;
                    view = childAt2;
                    p2Var2 = p2Var3;
                    i12 = iSave;
                } else {
                    i12 = iSave;
                    p2Var2 = p2Var3;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f14 - this.f37195e3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (p2Var != null && p2Var != p2Var2) {
                    p2Var.f24959y0 = 0.0f;
                    p2Var.f24899n = 0.0f;
                }
                canvas2.restoreToCount(i12);
            } else {
                i16 = i16;
                p2Var2 = p2Var3;
                i10 = i10;
                i11 = i11;
            }
            i16++;
            gyVar2 = gyVar;
            p2Var3 = p2Var2;
            i14 = i10;
            paint = paint;
            i15 = i11;
        }
        Paint paint2 = paint;
        gy gyVar3 = gyVar2;
        if (p2Var3 != null) {
            ImageReceiver imageReceiver = p2Var3.U1;
            canvas2.save();
            this.f37201k3 = imageReceiver.getImageY() + p2Var3.getY() + p2Var3.f24959y0;
            p2Var3.f24959y0 = 0.0f;
            p2Var3.f24899n = 0.0f;
            float f18 = this.f37202l3;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.08f;
                this.f37202l3 = f19;
                f12 = 1.0f;
                this.f37202l3 = Utilities.clamp(f19, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.er.f28122f.getInterpolation(this.f37202l3);
            if (interpolation != f12) {
                float f20 = this.f37203m3;
                if (f20 == -2.1474836E9f) {
                    z10 = false;
                } else if (Math.abs(f20 - this.f37201k3) < getMeasuredHeight() * 0.4f) {
                    this.f37201k3 = AndroidUtilities.lerp(this.f37203m3, this.f37201k3, interpolation);
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (this.f37204n3 && (z10 || this.f37203m3 == -2.1474836E9f)) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f;
                interpolation = this.f37195e3;
            }
            float f21 = f13 - interpolation;
            if (f21 == f13) {
                top = -2.1474836E9f;
                this.f37201k3 = -2.1474836E9f;
            } else {
                top = -2.1474836E9f;
            }
            float f22 = (-AndroidUtilities.dp(5.0f)) * f21;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((-AndroidUtilities.dp(4.0f)) + f22, this.f37201k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f22, imageReceiver.getImageHeight() + this.f37201k3 + AndroidUtilities.dp(1.0f));
            if (this.f37200j3 == null) {
                this.f37200j3 = new Paint(1);
            }
            this.f37200j3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f37200j3);
            canvas2.restore();
        } else {
            top = -2.1474836E9f;
            this.f37201k3 = -2.1474836E9f;
        }
        boolean z11 = false;
        if (this.f37199i3 != null) {
            float bottom = 2.1474836E9f;
            for (int i17 = 0; i17 < this.f37199i3.size(); i17++) {
                View view3 = (View) this.f37199i3.valueAt(i17);
                this.f37198h3.getClass();
                int iS2 = RecyclerView.S(view3);
                if (iS2 < i15 && view3.getTop() > top) {
                    top = view3.getTop();
                }
                if (iS2 > i14 && view3.getBottom() < bottom) {
                    bottom = view3.getBottom();
                }
            }
            for (int i18 = 0; i18 < this.f37199i3.size(); i18++) {
                View view4 = (View) this.f37199i3.valueAt(i18);
                if (view4 instanceof org.telegram.ui.Cells.p2) {
                    this.f37198h3.getClass();
                    int iS3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.p2 p2Var5 = (org.telegram.ui.Cells.p2) view4;
                    p2Var5.f24861f0 = false;
                    p2Var5.u();
                    p2Var5.f24861f0 = true;
                    p2Var5.setRightFragmentOpenedProgress(this.f37195e3);
                    int iSave2 = canvas2.save();
                    if (iS3 > i14) {
                        canvas2.translate(view4.getX(), (f17 + view4.getBottom()) - bottom);
                    } else {
                        canvas2.translate(view4.getX(), (f17 + view4.getTop()) - top);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(iSave2);
                }
            }
            this.f37199i3.clear();
            z11 = false;
        }
        this.Z2 = z11;
        if (this.f37198h3 != null) {
            invalidate();
        }
        if (this.f37198h3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                View childAt3 = getChildAt(i19);
                if (((childAt3 instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) childAt3).f24920r) || ((childAt3 instanceof pf.j) && ((pf.j) childAt3).f45833a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x8 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x10 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF2 = this.f37197g3;
                        rectF2.set(x8, y10, x10, y11);
                        canvas2.saveLayerAlpha(rectF2, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint2);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                }
            }
            invalidate();
        }
        org.telegram.ui.Cells.p2 p2Var6 = gyVar3.S0;
        if (p2Var6 != null && (lc0Var = gyVar3.R0) != null) {
            int measuredHeight = (gyVar3.S0.getMeasuredHeight() / 2) + p2Var6.getTop();
            Paint paint3 = lc0Var.f30351b;
            View view5 = lc0Var.f30352c;
            RectF rectF3 = lc0Var.f30354f;
            Paint paint4 = lc0Var.f30350a;
            int iDp = AndroidUtilities.dp(110.0f);
            int iDp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            int iD = org.telegram.messenger.y1.D(62.0f, 3, iDp);
            float measuredWidth = ((view5.getMeasuredWidth() + iD) * lc0Var.h) - iD;
            int i20 = iDp / 2;
            int i21 = measuredHeight - i20;
            paint4.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            int i22 = iDp2 / 2;
            float f23 = measuredHeight - i22;
            float f24 = i20 + measuredWidth;
            float f25 = i22 + measuredHeight + 1;
            canvas.drawRect(0.0f, f23, f24, f25, paint4);
            paint4.setColor(-69120);
            float f26 = iDp + measuredWidth;
            rectF3.set(measuredWidth, i21, f26, i21 + iDp);
            float f27 = lc0Var.f30355g;
            int iT = (int) (f27 < 0.5f ? org.telegram.messenger.rl.t(f27, 0.5f, 1.0f, 35.0f) : ((f27 - 0.5f) * 35.0f) / 0.5f);
            float f28 = iT;
            float f29 = 360 - (iT * 2);
            canvas.drawArc(rectF3, f28, f29, true, paint3);
            canvas.drawArc(rectF3, f28, f29, true, paint4);
            paint4.setColor(-16777216);
            canvas.drawCircle(f24 - AndroidUtilities.dp(8.0f), (iDp / 4) + i21, AndroidUtilities.dp(8.0f), paint4);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f26, measuredHeight - AndroidUtilities.dp(25.0f));
            int i23 = 0;
            for (int i24 = 3; i23 < i24; i24 = 3) {
                Path path = lc0Var.f30357j;
                if (path != null) {
                    f10 = 20.0f;
                    if (lc0Var.f30358k == lc0Var.f30359l) {
                        f11 = 35.0f;
                    }
                    canvas.drawPath(lc0Var.f30357j, paint3);
                    if (i23 == 0) {
                        paint4.setColor(-90112);
                    } else if (i23 == 1) {
                        paint4.setColor(-85326);
                    } else {
                        paint4.setColor(-16720161);
                    }
                    canvas.drawPath(lc0Var.f30357j, paint4);
                    paint4.setColor(-1);
                    rectF3.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                    canvas.drawOval(rectF3, paint4);
                    rectF3.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                    canvas.drawOval(rectF3, paint4);
                    paint4.setColor(-16777216);
                    rectF3.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawOval(rectF3, paint4);
                    rectF3.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                    canvas.drawOval(rectF3, paint4);
                    canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                    i23++;
                } else {
                    f10 = 20.0f;
                }
                if (path == null) {
                    lc0Var.f30357j = new Path();
                }
                lc0Var.f30357j.reset();
                boolean z12 = lc0Var.f30358k;
                lc0Var.f30359l = z12;
                if (z12) {
                    lc0Var.f30357j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF3.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    lc0Var.f30357j.arcTo(rectF3, 180.0f, 180.0f, false);
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = 35.0f;
                } else {
                    f11 = 35.0f;
                    lc0Var.f30357j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF3.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    lc0Var.f30357j.arcTo(rectF3, 180.0f, 180.0f, false);
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.f30357j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                lc0Var.f30357j.close();
                canvas.drawPath(lc0Var.f30357j, paint3);
                if (i23 == 0) {
                    paint4.setColor(-90112);
                } else if (i23 == 1) {
                    paint4.setColor(-85326);
                } else {
                    paint4.setColor(-16720161);
                }
                canvas.drawPath(lc0Var.f30357j, paint4);
                paint4.setColor(-1);
                rectF3.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF3, paint4);
                rectF3.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF3, paint4);
                paint4.setColor(-16777216);
                rectF3.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF3, paint4);
                rectF3.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF3, paint4);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i23++;
            }
            canvas.restore();
            if (lc0Var.h >= 1.0f) {
                lc0Var.d.run();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - lc0Var.f30353e;
            lc0Var.f30353e = jCurrentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (lc0Var.f30355g >= 1.0f) {
                lc0Var.f30355g = 0.0f;
            }
            float f30 = j10;
            float f31 = (f30 / 400.0f) + lc0Var.f30355g;
            lc0Var.f30355g = f31;
            if (f31 > 1.0f) {
                lc0Var.f30355g = 1.0f;
            }
            float f32 = (f30 / 2000.0f) + lc0Var.h;
            lc0Var.h = f32;
            if (f32 > 1.0f) {
                lc0Var.h = 1.0f;
            }
            float f33 = (f30 / 200.0f) + lc0Var.f30356i;
            lc0Var.f30356i = f33;
            if (f33 >= 1.0f) {
                lc0Var.f30358k = !lc0Var.f30358k;
                lc0Var.f30356i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.f37205o3 == null) {
            int i25 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
            jh.q9[] q9VarArr = jh.q9.f13873f;
            if (q9VarArr[i25] == null) {
                q9VarArr[i25] = new jh.q9(i25);
            }
            this.f37205o3 = q9VarArr[i25];
        }
        this.f37205o3.a(this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.f37207q3.J) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).f24920r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return gy.f38496w4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fy fyVar = this.f37193c3;
        if (fyVar.f38230n != null && gy.f38496w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            fyVar.f38230n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.T1) {
            return false;
        }
        gy gyVar = this.f37207q3;
        if (gyVar.X0 || this.f37193c3.f38234x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            gyVar.Y0 = !((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37194d3 = getPaddingTop();
        this.f37207q3.f38599t3 = 0.0f;
        this.f37193c3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fy[] fyVarArr;
        AnimatorSet animatorSet;
        fy fyVar = this.f37193c3;
        int iL0 = fyVar.f38227c.L0();
        gy gyVar = this.f37207q3;
        if (iL0 != -1 && fyVar.f38228e.f5666y == 0 && fyVar.f38227c.f5729y < 0 && fyVar.f38225a.getScrollState() != 1) {
            f2.o1 o1VarK = fyVar.f38225a.K(iL0);
            if (o1VarK != null) {
                int top = o1VarK.f5789a.getTop();
                if (fyVar.f38232s == 0 && gyVar.Z3() && fyVar.v == 2) {
                    iL0 = Math.max(1, iL0);
                }
                this.f37192b3 = true;
                fyVar.f38227c.h1(iL0, (int) ((top - this.f37194d3) + gyVar.f38599t3 + 0));
                this.f37192b3 = false;
            }
        } else if (iL0 == -1 && this.a3) {
            fyVar.f38227c.h1((fyVar.f38232s == 0 && gyVar.Z3()) ? 1 : 0, (int) gyVar.J);
        }
        this.f37192b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (gyVar.G && !gyVar.K) {
            currentActionBarHeight += AndroidUtilities.dp(81.0f);
        }
        if (!gyVar.K) {
            currentActionBarHeight += AndroidUtilities.dp(48.0f);
        }
        this.f37206p3 = 0;
        float fS3 = gyVar.S3(false);
        org.telegram.ui.Components.zr zrVar = gyVar.F1;
        float f10 = zrVar != null ? zrVar.getMetadata().f48512c.f48522a : 0.0f;
        int iDp = currentActionBarHeight + ((int) (AndroidUtilities.dp(50.0f) * fS3));
        this.f37206p3 += (int) (AndroidUtilities.dp(50.0f) * fS3);
        org.telegram.ui.Components.zr zrVar2 = gyVar.F1;
        if (zrVar2 != null) {
            int iC = (int) zrVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), fS3));
            iDp += iC;
            this.f37206p3 += iC;
        }
        int iDp2 = iDp - AndroidUtilities.dp(Math.max(fS3, f10) * 5.0f);
        this.f37206p3 -= AndroidUtilities.dp(Math.max(fS3, f10) * 5.0f);
        int iN3 = gyVar.n3();
        if (iDp2 != this.U2 || iN3 != getPaddingBottom()) {
            setTopGlowOffset(iDp2);
            setPadding(0, iDp2, 0, iN3);
            if (gyVar.G) {
                fyVar.f38233w.setPaddingTop(iDp2 - AndroidUtilities.dp(81.0f));
            } else {
                fyVar.f38233w.setPaddingTop(iDp2);
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof pf.j) {
                    getChildAt(i12).requestLayout();
                }
            }
        }
        this.f37192b3 = false;
        if (this.a3 && gyVar.getMessagesController().dialogsLoaded) {
            if (fyVar.f38232s == 0 && gyVar.Z3()) {
                this.f37192b3 = true;
                ((f2.k0) getLayoutManager()).h1(1, (int) gyVar.J);
                this.f37192b3 = false;
            }
            this.a3 = false;
        }
        super.onMeasure(i10, i11);
        if (gyVar.f38537h2 || iDp2 == 0 || (fyVarArr = gyVar.f38498a0) == null || fyVarArr.length <= 1 || gyVar.f38538h3 || (animatorSet = gyVar.f38505b3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.o1 o1Var;
        int i10;
        int i11;
        char c10;
        if (this.T1) {
            return false;
        }
        gy gyVar = this.f37207q3;
        if (gyVar.X0 || gyVar.f38618y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        fy fyVar = this.f37193c3;
        if (action == 1 || action == 3) {
            f2.f0 f0Var = fyVar.f38228e;
            if (f0Var.f5666y != 0) {
                ey eyVar = fyVar.f38229f;
                if (eyVar.f37876e) {
                    eyVar.f37877f = true;
                    if (f0Var.f(null, 4) != 0 && (o1Var = fyVar.f38229f.d) != null) {
                        View view = o1Var.f5789a;
                        if (view instanceof org.telegram.ui.Cells.p2) {
                            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                            long dialogId = p2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                z1(false, p2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(gyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        gyVar = gyVar;
                                        gyVar.r4(arrayList, 111, true, false, null);
                                    } else if (SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 1) {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(Long.valueOf(dialogId));
                                        if (dialog.unread_count > 0 || dialog.unread_mark) {
                                            gyVar = gyVar;
                                            gyVar = gyVar;
                                            i11 = 1;
                                        } else {
                                            gyVar = gyVar;
                                            i11 = 0;
                                        }
                                        gyVar.I2 = i11;
                                        gyVar.r4(arrayList2, 101, true, false, null);
                                    } else if (SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 3) {
                                        if (gyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add(Long.valueOf(dialogId));
                                            gyVar.K2 = !MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                            if (gyVar.K2 > 0) {
                                                gyVar = gyVar;
                                                i10 = 0;
                                            } else {
                                                gyVar = gyVar;
                                                i10 = 1;
                                            }
                                            gyVar.L2 = i10;
                                            gyVar.r4(arrayList3, 104, true, false, null);
                                        } else {
                                            NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                            if (org.telegram.ui.Components.mc.a(gyVar)) {
                                                gyVar = gyVar;
                                                org.telegram.ui.Components.mc.z(gyVar, 3, 0, null).j();
                                            }
                                        }
                                    } else if (SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 0) {
                                        gyVar = gyVar;
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(Long.valueOf(dialogId));
                                        gyVar.J2 = !gyVar.g4(dialog) ? 1 : 0;
                                        gyVar.r4(arrayList4, 100, true, false, null);
                                    } else if (SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 4) {
                                        gyVar = gyVar;
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(Long.valueOf(dialogId));
                                        gyVar.r4(arrayList5, 102, true, false, null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        gyVar = gyVar;
        gyVar = gyVar;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (fyVar.f38232s == 0 && ((action == 1 || action == 3) && fyVar.v == 2 && gyVar.Z3() && ((f2.k0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.p2 p2VarQ3 = gy.Q3(fyVar);
            if (p2VarQ3 != null) {
                int iDp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = p2VarQ3.getMeasuredHeight() + (p2VarQ3.getTop() - paddingTop);
                long jCurrentTimeMillis = System.currentTimeMillis() - gyVar.Y2;
                if (measuredHeight < iDp || jCurrentTimeMillis < 200) {
                    gyVar.a2 = true;
                    c10 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.er.h);
                    fyVar.v = 2;
                } else {
                    if (fyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            gyVar.a2 = true;
                            v0(0, p2VarQ3.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                        }
                        if (!gyVar.a3) {
                            gyVar.a3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            nw nwVar = fyVar.f38230n;
                            if (nwVar != null) {
                                nwVar.a(true);
                            }
                        }
                        p2VarQ3.a0();
                        fyVar.v = 1;
                        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                        }
                    }
                    c10 = 0;
                }
                if (getViewOffset() != 0.0f) {
                    float[] fArr = new float[2];
                    fArr[c10] = getViewOffset();
                    fArr[1] = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                    valueAnimatorOfFloat.addUpdateListener(new g3(this, 10));
                    valueAnimatorOfFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.rl.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.h);
                    setScrollEnabled(false);
                    valueAnimatorOfFloat.addListener(new org.telegram.ui.Components.f11(this, 27));
                    valueAnimatorOfFloat.start();
                }
            }
        }
        return zOnTouchEvent;
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
        if (this.f37192b3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(f2.q0 q0Var) {
        super.setAdapter(q0Var);
        this.a3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f37195e3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View viewM;
        gy.f38496w4 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.A1 != -1 && (viewM = getLayoutManager().m(this.A1)) != null) {
            int left = viewM.getLeft();
            int top = (int) (viewM.getTop() + f10);
            int right = viewM.getRight();
            int bottom = (int) (viewM.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.f35304z1.setBounds(rect);
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

    public final void y1(zw zwVar, float f10, boolean z10) {
        gy gyVar;
        org.telegram.ui.Components.zk0 zk0Var = zwVar == null ? this.f37198h3 : this;
        if (zk0Var == null) {
            this.f37198h3 = zwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.p2 p2Var = null;
        org.telegram.ui.Cells.p2 p2Var2 = null;
        int top = Integer.MAX_VALUE;
        int i10 = 0;
        while (true) {
            int childCount = zk0Var.getChildCount();
            gyVar = this.f37207q3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var3 = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var3.getDialogId() == gyVar.B3.getCurrentFragmetDialogId()) {
                    p2Var = p2Var3;
                }
                if (childAt.getTop() >= 0 && p2Var3.getDialogId() != 0 && childAt.getTop() < top) {
                    top = p2Var3.getTop();
                    p2Var2 = p2Var3;
                }
            }
            i10++;
        }
        if (p2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() <= getMeasuredHeight() || p2Var2.getTop() - getPaddingTop() <= (getMeasuredHeight() - getPaddingTop()) / 2.0f) {
                p2Var = p2Var2;
            }
        } else {
            p2Var = p2Var2;
        }
        this.f37198h3 = zwVar;
        if (p2Var != null) {
            if (zwVar != null) {
                zwVar.setPadding(getPaddingLeft(), this.U2, getPaddingLeft(), getPaddingBottom());
                int iF = ((pf.k) zwVar.getAdapter()).F(p2Var.getDialogId());
                int top2 = (int) ((p2Var.getTop() - zk0Var.getPaddingTop()) + f10);
                if (iF >= 0) {
                    fy fyVar = this.f37193c3;
                    if (fyVar.f38232s == 0 && fyVar.v == 2 && gyVar.Z3()) {
                        z11 = true;
                    }
                    int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top2) - (iF * iDp)) - iF;
                    if (z11) {
                        paddingTop += iDp;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top2 = (top2 + paddingTop2) - paddingTop;
                    }
                    ((f2.k0) zwVar.getLayoutManager()).h1(iF, top2);
                }
            }
            int iF2 = ((pf.k) getAdapter()).F(p2Var.getDialogId());
            int top3 = p2Var.getTop() - getPaddingTop();
            if (z10 && gyVar.G) {
                top3 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top3 += AndroidUtilities.dp(48.0f);
            }
            if (iF2 >= 0) {
                ((f2.k0) getLayoutManager()).h1(iF2, top3);
            }
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        gy gyVar = this.f37207q3;
        UndoView undoViewY3 = gyVar.Y3();
        if (!SharedConfig.archiveHidden) {
            undoViewY3.l(0L, 7, null, null);
            A1();
            if (!z10 || p2Var == null) {
                return;
            }
            p2Var.U();
            p2Var.invalidate();
            return;
        }
        if (p2Var != null) {
            gyVar.a2 = true;
            gyVar.X0 = true;
            int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
            if (gyVar.G && !gyVar.A0.g()) {
                gyVar.N = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.er.f28123g);
            if (z10) {
                gyVar.Z0 = true;
            } else {
                A1();
            }
        }
        undoViewY3.l(0L, 6, null, null);
    }
}
