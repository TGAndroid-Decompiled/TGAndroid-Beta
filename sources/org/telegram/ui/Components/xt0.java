package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public abstract class xt0 extends ys0 {

    public final HashSet f34700b3;

    public final ArrayList f34701c3;

    public final ArrayList f34702d3;

    public final ArrayList f34703e3;

    public TextPaint f34704f3;

    public StaticLayout f34705g3;

    public float f34706h3;

    public float f34707i3;

    public jh.q9 f34708j3;

    public int f34709k3;

    public final ArrayList f34710l3;

    public xt0(Context context) {
        super(context, null);
        this.f34700b3 = new HashSet();
        this.f34701c3 = new ArrayList();
        this.f34702d3 = new ArrayList();
        this.f34703e3 = new ArrayList();
        this.f34710l3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float fFloatValue;
        float y10;
        int i10;
        int i11;
        int i12;
        int pinchCenterPosition;
        float f10;
        float fFloatValue2;
        boolean zZ1;
        boolean z10;
        int iA;
        int animateToColumnsCount;
        Float fValueOf = Float.valueOf(1.0f);
        jk0 movingAdapter = getMovingAdapter();
        jk0 supportingAdapter = getSupportingAdapter();
        if (!B1() || getAdapter() != movingAdapter) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                int iP = hu0.p(childAt);
                if (iP != 0 && getMessageAlphaEnter() != null) {
                    fFloatValue = getMessageAlphaEnter().get(iP, null) != null ? getMessageAlphaEnter().get(iP, fValueOf).floatValue() : 1.0f;
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) childAt).setEnterAnimationAlpha(fFloatValue);
                    } else if (childAt instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) childAt).setEnterAnimationAlpha(fFloatValue);
                    }
                }
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).setEnterAnimationAlpha(fFloatValue);
                } else if (childAt instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) childAt).setEnterAnimationAlpha(fFloatValue);
                }
            }
            super.dispatchDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        boolean zZ2 = z1();
        HashSet hashSet = this.f34700b3;
        ArrayList arrayList = this.f34702d3;
        ArrayList arrayList2 = this.f34703e3;
        ArrayList arrayList3 = this.f34701c3;
        ArrayList arrayList4 = this.f34710l3;
        if (zZ2) {
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                int iR = RecyclerView.R(getChildAt(i17));
                if (iR >= 0 && (iR > i16 || i16 == -1)) {
                    i16 = iR;
                }
                if (iR >= 0 && (iR < i15 || i15 == -1)) {
                    i15 = iR;
                }
            }
            int i18 = 0;
            i11 = -1;
            while (true) {
                y10 = measuredHeight;
                if (i18 >= getSupportingListView().getChildCount()) {
                    break;
                }
                ys0 supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i18);
                supportingListView.getClass();
                int iR2 = RecyclerView.R(childAt2);
                int i19 = i15;
                if (iR2 >= 0 && (iR2 > i14 || i14 == -1)) {
                    i14 = iR2;
                }
                if (iR2 >= 0 && (iR2 < i11 || i11 == -1)) {
                    i11 = iR2;
                }
                i18++;
                i15 = i19;
                measuredHeight = y10;
            }
            i12 = i15;
            if (i12 < 0 || i11 < 0 || getPinchCenterPosition() < 0) {
                animateToColumnsCount = 0;
                pinchCenterPosition = 0;
            } else {
                int i20 = i14;
                int iCeil = (int) Math.ceil(movingAdapter.h() / getColumnsCount());
                int i21 = i16;
                int iCeil2 = (int) Math.ceil(movingAdapter.h() / getAnimateToColumnsCount());
                pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i11 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i12 / getColumnsCount()));
                if ((i12 / getColumnsCount()) - pinchCenterPosition < 0 && getAnimateToColumnsCount() < getColumnsCount()) {
                    pinchCenterPosition = 0;
                } else if ((i11 / getAnimateToColumnsCount()) + pinchCenterPosition < 0 && getAnimateToColumnsCount() > getColumnsCount()) {
                    pinchCenterPosition = 0;
                }
                if (((i20 / getColumnsCount()) + pinchCenterPosition >= iCeil && getAnimateToColumnsCount() > getColumnsCount()) || ((i21 / getAnimateToColumnsCount()) - pinchCenterPosition >= iCeil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                    pinchCenterPosition = 0;
                }
                animateToColumnsCount = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
            }
            arrayList4.clear();
            hashSet.clear();
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            this.f34709k3 = 0;
            for (int i22 = 0; i22 < getSupportingListView().getChildCount(); i22++) {
                View childAt3 = getSupportingListView().getChildAt(i22);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof org.telegram.ui.Cells.o7) {
                        arrayList4.add((org.telegram.ui.Cells.o7) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.f34709k3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            ik0 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float fH = movingAdapter.H(this);
                float fH2 = supportingAdapter.H(getSupportingListView());
                float f11 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f12 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * fH2) + ((1.0f - getChangeColumnsProgress()) * fH));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f12) + ((1.0f - getChangeColumnsProgress()) * f11));
            }
            i10 = animateToColumnsCount;
        } else {
            y10 = measuredHeight;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            pinchCenterPosition = 0;
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt4 = getChildAt(i23);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) getChildAt(i23);
                    o7Var.v = null;
                    o7Var.O = 0.0f;
                    o7Var.P = 0;
                    o7Var.setTranslationX(0.0f);
                    o7Var.setTranslationY(0.0f);
                    o7Var.j(1.0f, !z1());
                }
            } else if (childAt4 instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) getChildAt(i23);
                y1(o7Var2);
                MessageObject messageObject = o7Var2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f10 = 2.0f;
                } else {
                    f10 = 2.0f;
                    fFloatValue2 = getMessageAlphaEnter().get(messageObject.getId(), null) != null ? getMessageAlphaEnter().get(messageObject.getId(), fValueOf).floatValue() : 1.0f;
                    zZ1 = z1();
                    if (o7Var2.f24811w != fFloatValue2) {
                        o7Var2.f24811w = fFloatValue2;
                        if (!zZ1) {
                            o7Var2.invalidate();
                        }
                    }
                    if (z1()) {
                        iA = (((f2.v) o7Var2.getLayoutParams()).a() % getColumnsCount()) + i10;
                        int animateToColumnsCount2 = (getAnimateToColumnsCount() * (((((f2.v) o7Var2.getLayoutParams()).a() - i12) / getColumnsCount()) + pinchCenterPosition)) + iA + this.f34709k3;
                        if (iA >= 0 || iA >= getAnimateToColumnsCount() || animateToColumnsCount2 < 0 || animateToColumnsCount2 >= arrayList4.size()) {
                            z10 = false;
                        } else {
                            float fLerp = AndroidUtilities.lerp(1.0f, (((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount2)).getMeasuredWidth() - AndroidUtilities.dpf2(f10)) / (o7Var2.getMeasuredWidth() - AndroidUtilities.dpf2(f10)), getChangeColumnsProgress());
                            float left = o7Var2.getLeft();
                            float top = o7Var2.getTop();
                            float left2 = ((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount2)).getLeft();
                            float top2 = ((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount2)).getTop();
                            o7Var2.setPivotX(0.0f);
                            o7Var2.setPivotY(0.0f);
                            o7Var2.j(fLerp, !z1());
                            o7Var2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                            o7Var2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                            org.telegram.ui.Cells.o7 o7Var3 = (org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount2);
                            float changeColumnsProgress = getChangeColumnsProgress();
                            int animateToColumnsCount3 = getAnimateToColumnsCount();
                            o7Var2.v = o7Var3;
                            o7Var2.O = changeColumnsProgress;
                            o7Var2.P = animateToColumnsCount3;
                            hashSet.add((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount2));
                            arrayList2.add(o7Var2);
                            canvas.save();
                            canvas.translate(o7Var2.getX(), o7Var2.getY());
                            o7Var2.draw(canvas);
                            canvas.restore();
                            if (o7Var2.getY() < y10) {
                                y10 = o7Var2.getY();
                            }
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (z1()) {
                            arrayList.add(o7Var2);
                        }
                        o7Var2.v = null;
                        o7Var2.O = 0.0f;
                        o7Var2.P = 0;
                        o7Var2.setTranslationX(0.0f);
                        o7Var2.setTranslationY(0.0f);
                        o7Var2.j(1.0f, !z1());
                    }
                }
                zZ1 = z1();
                if (o7Var2.f24811w != fFloatValue2) {
                    o7Var2.f24811w = fFloatValue2;
                    if (!zZ1) {
                        o7Var2.invalidate();
                    }
                }
                if (z1()) {
                    iA = (((f2.v) o7Var2.getLayoutParams()).a() % getColumnsCount()) + i10;
                    int animateToColumnsCount4 = (getAnimateToColumnsCount() * (((((f2.v) o7Var2.getLayoutParams()).a() - i12) / getColumnsCount()) + pinchCenterPosition)) + iA + this.f34709k3;
                    if (iA >= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (z1()) {
                        arrayList.add(o7Var2);
                    }
                    o7Var2.v = null;
                    o7Var2.O = 0.0f;
                    o7Var2.P = 0;
                    o7Var2.setTranslationX(0.0f);
                    o7Var2.setTranslationY(0.0f);
                    o7Var2.j(1.0f, !z1());
                }
            }
        }
        float f13 = 255.0f;
        if (z1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float fCeil = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress3)) + ((double) AndroidUtilities.dpf2(2.0f)));
            if (A1()) {
                fCeil *= 1.25f;
            }
            float f14 = fCeil;
            int i24 = 0;
            while (i24 < arrayList3.size()) {
                org.telegram.ui.Cells.o7 o7Var4 = (org.telegram.ui.Cells.o7) arrayList3.get(i24);
                if (hashSet.contains(o7Var4)) {
                    changeColumnsProgress3 = changeColumnsProgress3;
                    i24 = i24;
                } else {
                    o7Var4.v = null;
                    o7Var4.O = 0.0f;
                    o7Var4.P = 0;
                    int iA2 = ((f2.v) o7Var4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i25 = iA2 - i10;
                    int iA3 = ((((f2.v) o7Var4.getLayoutParams()).a() - i11) / getAnimateToColumnsCount()) - pinchCenterPosition;
                    canvas.save();
                    canvas.translate((getChangeColumnsProgress() * iA2 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i25 * measuredWidth), (iA3 * f14) + y10);
                    o7Var4.j(changeColumnsProgress3, !z1());
                    if (i25 < getColumnsCount()) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, o7Var4.getMeasuredWidth() * changeColumnsProgress2, o7Var4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        o7Var4.draw(canvas);
                        canvas.restore();
                    } else {
                        o7Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                i24++;
                changeColumnsProgress3 = changeColumnsProgress3;
            }
        }
        super.dispatchDraw(canvas);
        if (z1()) {
            float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
            float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float fCeil2 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress5)) + ((double) AndroidUtilities.dpf2(2.0f)));
            if (A1()) {
                fCeil2 *= 1.25f;
            }
            float f15 = fCeil2;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i26 = 0;
            while (i26 < arrayList.size()) {
                org.telegram.ui.Cells.o7 o7Var5 = (org.telegram.ui.Cells.o7) arrayList.get(i26);
                int iA4 = ((f2.v) o7Var5.getLayoutParams()).a() % getColumnsCount();
                int iA5 = ((((f2.v) o7Var5.getLayoutParams()).a() - i12) / getColumnsCount()) + pinchCenterPosition;
                int i27 = iA4 + i10;
                canvas.save();
                o7Var5.j(changeColumnsProgress5, !z1());
                canvas.translate((getChangeColumnsProgress() * i27 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * iA4 * measuredWidth3), (iA5 * f15) + y10);
                if (i27 < getAnimateToColumnsCount()) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, o7Var5.getMeasuredWidth() * changeColumnsProgress4, o7Var5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f13), 31);
                    o7Var5.draw(canvas);
                    canvas.restore();
                } else {
                    o7Var5.draw(canvas);
                }
                canvas.restore();
                i26++;
                f13 = 255.0f;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
            for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                org.telegram.ui.Cells.o7 o7Var6 = (org.telegram.ui.Cells.o7) arrayList2.get(i28);
                if (o7Var6.v != null) {
                    canvas.save();
                    canvas.translate(o7Var6.getX(), o7Var6.getY());
                    o7Var6.v.j(((o7Var6.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * o7Var6.f24813x) / (o7Var6.v.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
                    o7Var6.v.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        jk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.o7)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getAnimateToColumnsCount() {
        return 3;
    }

    public float getChangeColumnsProgress() {
        return 0.0f;
    }

    public int getColumnsCount() {
        return 3;
    }

    public SparseArray<Float> getMessageAlphaEnter() {
        return null;
    }

    public jk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public jk0 getSupportingAdapter() {
        return null;
    }

    public ys0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
