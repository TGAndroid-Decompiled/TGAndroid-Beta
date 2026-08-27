package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

public final class jm extends org.telegram.ui.Components.zu0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final rn F0;

    public int f39390s0;

    public int f39391t0;

    public int f39392u0;

    public final ArrayList f39393v0;

    public final ArrayList f39394w0;

    public final ArrayList f39395x0;

    public final ArrayList f39396y0;

    public Paint f39397z0;

    public jm(rn rnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = rnVar;
        this.f39390s0 = 0;
        this.f39393v0 = new ArrayList();
        this.f39394w0 = new ArrayList();
        this.f39395x0 = new ArrayList();
        this.f39396y0 = new ArrayList();
        this.D = new im(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        rn rnVar = this.F0;
        rnVar.T0.setTranslationY(f10);
        ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.setTranslationY(0.0f);
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            ok okVar = rnVar.f42104k1;
            tkVar.setTranslationY(okVar != null ? okVar.getCurrentHeight() : 0);
        }
        lh.w3 w3Var = rnVar.f42201s1;
        if (w3Var != null) {
            w3Var.setTranslationY(0.0f);
        }
        lh.w3 w3Var2 = rnVar.f42187r1;
        if (w3Var2 != null) {
            w3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.d21 d21Var = rnVar.N1;
        if (d21Var != null) {
            d21Var.setTranslationY(0.0f);
        }
        rnVar.M0.setTranslationY(0.0f);
        rnVar.L.setTranslationY(0.0f);
        rnVar.f42209s9 = 0.0f;
        rnVar.f42222t9 = 0.0f;
        rnVar.T0.setBackgroundTranslation(0);
        wk wkVar = rnVar.X2;
        if (wkVar != null) {
            wkVar.f29987p0 = 0.0f;
            wkVar.s();
        }
        ag.t0 t0Var = rnVar.f42228u2;
        if (t0Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) t0Var.f661b;
            v9Var.f33332u = 0.0f;
            v9Var.d.invalidate();
        }
        rnVar.setFragmentPanTranslationOffset(0);
        rnVar.o9();
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.nb0) {
            ((org.telegram.ui.Components.nb0) drawable).p();
        }
        rn rnVar = this.F0;
        og.a aVarC = rnVar.S.c(drawable);
        float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(rnVar.S.b(aVarC));
        float fComputePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(rnVar.S.a(aVarC));
        rnVar.f42301zb = fComputePerceivedBrightness <= 0.721f;
        rnVar.Ab = fComputePerceivedBrightness2 <= 0.9f;
        rnVar.H.f19458a = aVarC;
        sg.f fVar = rnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        qg.g gVar = rnVar.O;
        if (gVar != null) {
            gVar.invalidate();
        }
        rnVar.n9();
        rnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.s1 s1Var, int i10) {
        int iSave = canvas.save();
        rn rnVar = this.F0;
        float x8 = s1Var.getX() + rnVar.f42213t0.getLeft();
        float y10 = s1Var.getY() + rnVar.f42213t0.getY() + s1Var.getPaddingTop();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.clipRect(rnVar.f42213t0.getLeft(), f10, rnVar.f42213t0.getRight(), ((((rnVar.f42213t0.getY() + rnVar.f42213t0.getMeasuredHeight()) - rnVar.wa) - rnVar.v.d()) - rnVar.f42163oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x8, y10);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.l2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.V1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.H1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0;
            s1Var.M1(canvas, alpha);
            if (!z10) {
                s1Var.c2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && rnVar.I8 != null)) {
            float f11 = (rnVar.D8 * rnVar.G8) / 0.2f;
            canvas.save();
            s1Var.g2(canvas, rnVar.I8, f11, rnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x8, y10);
            s1Var.h2(this, canvas, rnVar.J8, rnVar.I8, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.eg egVar;
        rn rnVar = this.F0;
        jg.a aVar = rnVar.F;
        ck ckVar = rnVar.U;
        if (ckVar == null || view != ckVar.f26122i0) {
            super.addView(view, i10, layoutParams);
        } else {
            sg.f fVar = rnVar.T;
            int iIndexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (iIndexOfChild >= 0) {
                i10 = iIndexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        ck ckVar2 = rnVar.U;
        if (ckVar2 != null && view == ckVar2.f26122i0) {
            nh.w wVar = (nh.w) view;
            wVar.setBackgroundDrawable(aVar.c(wVar.f19010c, rnVar.f42263x, false));
        }
        ck ckVar3 = rnVar.U;
        if (ckVar3 == null || view != (egVar = ckVar3.J1)) {
            return;
        }
        egVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.H) {
            return true;
        }
        rn rnVar = this.F0;
        return view == rnVar.f42228u2 || view == rnVar.f42126m1 || view == rnVar.f42086i9 || view == rnVar.T || view == rnVar.G3;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Canvas canvas3;
        jm jmVar;
        float f10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f11;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessagePosition currentPosition;
        ArrayList arrayList5;
        org.telegram.ui.Cells.s1 s1Var2;
        ArrayList arrayList6;
        Integer num;
        float f12;
        float f13;
        boolean z10;
        float f14;
        float fMax;
        Canvas canvas4;
        View view;
        float f15;
        org.telegram.ui.Cells.v0 v0Var2;
        float f16;
        jm jmVar2;
        Canvas canvas5;
        float f17;
        float f18;
        org.telegram.ui.Components.ze zeVar;
        org.telegram.ui.Cells.s1 s1Var3;
        float translationY;
        boolean z11;
        int currentHeight;
        org.telegram.ui.Components.x30 x30Var;
        View view2;
        yi yiVar;
        View view3;
        mj mjVar;
        jm jmVar3 = this;
        rn rnVar = jmVar3.F0;
        yg.i iVar = rnVar.v;
        ArrayList arrayList7 = rnVar.f42096j6;
        rnVar.U.S1();
        rnVar.jc();
        if (rnVar.f42149na || ((mjVar = rnVar.f42226u0) != null && mjVar.k())) {
            rnVar.f42149na = false;
            rnVar.uc();
        }
        rnVar.Mc(false, false);
        rnVar.wc();
        yi yiVar2 = rnVar.f42003c2;
        if (yiVar2 != null && yiVar2.getTag() != null && (view3 = (yiVar = rnVar.f42003c2).f34454e) != null) {
            yiVar.g(view3);
        }
        org.telegram.ui.Components.x30 x30Var2 = rnVar.f42029e2;
        if (x30Var2 != null && x30Var2.getTag() != null && (view2 = (x30Var = rnVar.f42029e2).f34454e) != null) {
            x30Var.g(view2);
        }
        if (rnVar.f42062ga) {
            canvas2 = canvas;
            int iSaveLayerAlpha = canvas2.saveLayerAlpha(0.0f, ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getBottom(), jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), (int) (rnVar.f42074ha * 255.0f), 31);
            float f19 = (rnVar.f42074ha * 0.2f) + 0.8f;
            canvas2.scale(f19, f19, jmVar3.getMeasuredWidth() / 2.0f, jmVar3.getMeasuredHeight() / 2.0f);
            i10 = iSaveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList7.get(i11);
            MessageObject.SendAnimationData sendAnimationData = s1Var4.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0) {
                    int measuredHeight = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getTranslationY());
                    ok okVar = rnVar.f42104k1;
                    int currentHeight2 = measuredHeight + (okVar != null ? okVar.getCurrentHeight() : 0);
                    ak akVar = rnVar.l1;
                    currentHeight = currentHeight2 + (akVar != null ? akVar.getCurrentHeight() : 0) + (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    currentHeight = 0;
                }
                canvas2.clipRect(0.0f, currentHeight + rnVar.p9, jmVar3.getWidth(), jmVar3.getHeight());
                ImageReceiver photoImage = s1Var4.getPhotoImage();
                int[] iArr = AndroidUtilities.pointTmp2;
                s1Var4.getLocationInWindow(iArr);
                int topViewEnterProgress = (int) ((rnVar.U.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) org.telegram.ui.Cells.pa.b(1.0f, sendAnimationData.progress, s1Var4.getTranslationY(), iArr[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.f19621y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.f19621y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f20 = sendAnimationData.currentScale;
                canvas2.scale(f20, f20);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                s1Var4.setTimeAlpha(sendAnimationData.timeAlpha);
                s1Var4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (rnVar.I8 == null || rnVar.F8 == null) {
            if (rnVar.f42298z8 != null) {
                rnVar.A8.reset();
                float measuredWidth = jmVar3.getMeasuredWidth() / rnVar.x8.getWidth();
                rnVar.A8.postScale(measuredWidth, measuredWidth);
                rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                if (rnVar.f42298z8.getAlpha() > 0) {
                    canvas2.drawRect(0.0f, 0.0f, jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), rnVar.f42298z8);
                }
            } else {
                rnVar.B8.setAlpha((int) (rnVar.D8 * 255.0f * (rnVar.F8 != null ? rnVar.G8 : 1.0f)));
                if (rnVar.B8.getAlpha() > 0) {
                    canvas.drawRect(0.0f, 0.0f, jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), rnVar.B8);
                }
            }
        }
        if (rnVar.I8 != null && rnVar.K8) {
            jmVar3.invalidate();
        }
        if (rnVar.F8 != null) {
            if (rnVar.F8 != rnVar.f42041f1) {
                if (rnVar.F8 instanceof ImageView) {
                    int iSave = canvas.save();
                    if (rnVar.G8 < 1.0f) {
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(rnVar.F8.getLeft(), rnVar.F8.getTop(), rnVar.F8.getRight(), rnVar.F8.getBottom(), (int) (rnVar.G8 * 255.0f), 31);
                    } else {
                        canvas3 = canvas;
                    }
                    canvas3.translate(rnVar.F8.getLeft(), rnVar.F8.getTop());
                    if (rnVar.F8 == ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getBackButton()) {
                        canvas3.translate(rnVar.F8.getX() - rnVar.F8.getLeft(), 0.0f);
                        float measuredWidth2 = rnVar.F8.getMeasuredWidth() / 2.0f;
                        float measuredHeight2 = rnVar.F8.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth2, measuredHeight2, Math.max(measuredWidth2, measuredHeight2) * 0.7f, rnVar.C8);
                    }
                    rnVar.F8.draw(canvas3);
                    canvas3.restoreToCount(iSave);
                    if (rnVar.G8 < 1.0f) {
                        rnVar.B8.setAlpha((int) ((1.0f - rnVar.G8) * rnVar.D8 * 255.0f));
                        canvas3.drawRect(0.0f, 0.0f, jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), rnVar.B8);
                    }
                } else {
                    canvas3 = canvas;
                    float y10 = ((rnVar.f42213t0.getY() + rnVar.f42160o9) - rnVar.q9) - AndroidUtilities.dp(4.0f);
                    MessageObject.GroupedMessages currentMessagesGroup2 = rnVar.F8 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) rnVar.F8).getCurrentMessagesGroup() : null;
                    int childCount = rnVar.f42213t0.getChildCount();
                    int i12 = 0;
                    boolean z12 = false;
                    while (true) {
                        arrayList = jmVar3.f39395x0;
                        f10 = 20.0f;
                        arrayList2 = jmVar3.f39394w0;
                        arrayList3 = jmVar3.f39393v0;
                        arrayList4 = jmVar3.f39396y0;
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = rnVar.f42213t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            s1Var = (org.telegram.ui.Cells.s1) childAt;
                            currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                            currentPosition = s1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            currentMessagesGroup = null;
                            s1Var = null;
                            currentPosition = null;
                        }
                        float f21 = y10;
                        if ((childAt == rnVar.F8 || (currentMessagesGroup2 != null && currentMessagesGroup2 == currentMessagesGroup)) && childAt.getAlpha() != 0.0f) {
                            if (z12 || s1Var == null || currentMessagesGroup2 == null || (s1Var3 = currentMessagesGroup2.transitionParams.cell) == null) {
                                arrayList5 = arrayList;
                                s1Var2 = s1Var;
                                arrayList6 = arrayList4;
                                num = null;
                                f12 = 9.0f;
                                f13 = 1.0f;
                                z10 = z12;
                            } else {
                                f12 = 9.0f;
                                float fD2 = s1Var3.D2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup2.transitionParams;
                                float f22 = transitionParams.left + fD2 + transitionParams.offsetLeft;
                                float f23 = transitionParams.top + transitionParams.offsetTop;
                                float f24 = transitionParams.right + fD2 + transitionParams.offsetRight;
                                float fDp = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    translationY = f23;
                                } else {
                                    translationY = transitionParams.cell.getTranslationY() + f23;
                                    fDp += currentMessagesGroup2.transitionParams.cell.getTranslationY();
                                }
                                float f25 = translationY;
                                float fDp2 = f25 < (rnVar.f42160o9 - ((float) rnVar.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (rnVar.f42160o9 - rnVar.q9) - AndroidUtilities.dp(20.0f) : f25;
                                if (fDp > AndroidUtilities.dp(20.0f) + rnVar.f42213t0.getMeasuredHeight()) {
                                    fDp = AndroidUtilities.dp(20.0f) + rnVar.f42213t0.getMeasuredHeight();
                                }
                                int size2 = currentMessagesGroup2.messages.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        arrayList5 = arrayList;
                                        z11 = true;
                                        break;
                                    }
                                    int i14 = size2;
                                    MessageObject messageObject = currentMessagesGroup2.messages.get(i13);
                                    arrayList5 = arrayList;
                                    if (rnVar.S5[messageObject.getDialogId() == rnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        z11 = false;
                                        break;
                                    } else {
                                        i13++;
                                        size2 = i14;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                canvas3.clipRect(0.0f, f21 + (rnVar.E1 != null ? rnVar.E1.e() : 0.0f), getMeasuredWidth(), (((getMeasuredHeight() - iVar.d()) - rnVar.f42163oc) - AndroidUtilities.dp(9.0f)) - (rnVar.E1 != null ? rnVar.E1.d() : 0.0f));
                                canvas3.translate(0.0f, rnVar.f42213t0.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                                arrayList6 = arrayList4;
                                num = null;
                                s1Var2 = s1Var;
                                f13 = 1.0f;
                                transitionParams2.cell.A1(canvas, (int) f22, (int) fDp2, (int) f24, (int) fDp, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (s1Var2 != null && s1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            float left = rnVar.f42213t0.getLeft();
                            float right = rnVar.f42213t0.getRight();
                            float measuredHeight3 = (((getMeasuredHeight() - iVar.d()) - rnVar.f42163oc) - rnVar.W8(org.telegram.ui.Components.z11.f35132c)) - AndroidUtilities.dp(f12);
                            if (rnVar.E1 != null) {
                                float fMax2 = Math.max(0.0f, rnVar.E1.e());
                                fMax = Math.max(0.0f, rnVar.E1.d());
                                f14 = fMax2;
                            } else {
                                f14 = 0.0f;
                                fMax = 0.0f;
                            }
                            ck ckVar = rnVar.U;
                            if (ckVar != null && (zeVar = ckVar.f26122i0) != null) {
                                fMax = Math.max(fMax, zeVar.f19012f ? 0.0f : Math.max(0.0f, zeVar.getMeasuredHeight() - (zeVar.f19010c.getTranslationY() + zeVar.f19011e)));
                            }
                            float fMax3 = f21 + f14;
                            float fMin = measuredHeight3 - fMax;
                            if (s1Var2 == null || !s1Var2.getTransitionParams().f25186w0) {
                                left = Math.max(left, childAt.getX() + rnVar.f42213t0.getLeft());
                                fMax3 = Math.max(fMax3, childAt.getY() + rnVar.f42213t0.getY());
                                right = Math.min(right, childAt.getX() + rnVar.f42213t0.getLeft() + childAt.getMeasuredWidth());
                                fMin = Math.min(fMin, childAt.getY() + rnVar.f42213t0.getY() + childAt.getMeasuredHeight());
                            }
                            float f26 = fMin;
                            float f27 = fMax3;
                            float f28 = right;
                            float fMax4 = Math.max(left, rnVar.R8());
                            if (f27 < f26) {
                                if (childAt.getAlpha() != f13) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(fMax4, f27, f28, f26, (int) (childAt.getAlpha() * 255.0f), 31);
                                } else {
                                    canvas4 = canvas;
                                    canvas4.save();
                                }
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(true);
                                    s1Var2.setScrimReaction(rnVar.I8);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    v0Var.setScrimReaction(rnVar.I8);
                                }
                                canvas4.clipRect(fMax4, f27, f28, f26);
                                canvas4.translate(childAt.getX() + rnVar.f42213t0.getLeft(), childAt.getY() + rnVar.f42213t0.getY());
                                if (s1Var2 != null && currentMessagesGroup2 == null && s1Var2.B1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.C1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view = childAt;
                                view.draw(canvas4);
                                if (s1Var2 != null && s1Var2.T2()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.W1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.B(canvas4);
                                }
                                canvas4.restore();
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(false);
                                    s1Var2.setScrimReaction(num);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(false);
                                    v0Var.setScrimReaction(num);
                                }
                            } else {
                                canvas4 = canvas;
                                f27 = f27;
                                f26 = f26;
                                view = childAt;
                                fMax4 = fMax4;
                                f28 = f28;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition = currentPosition;
                            if (groupedMessagePosition != null || (s1Var2 != null && s1Var2.getTransitionParams().f25186w0)) {
                                if (groupedMessagePosition == null || groupedMessagePosition.last || (groupedMessagePosition.minX == 0 && groupedMessagePosition.minY == 0)) {
                                    if (groupedMessagePosition == null || groupedMessagePosition.last) {
                                        arrayList3.add(s1Var2);
                                    }
                                    if (groupedMessagePosition == null || (groupedMessagePosition.minX == 0 && groupedMessagePosition.minY == 0 && s1Var2.S2())) {
                                        arrayList2.add(s1Var2);
                                    }
                                }
                                if (groupedMessagePosition == null || (groupedMessagePosition.flags & s1Var2.s0()) != 0) {
                                    arrayList5.add(s1Var2);
                                }
                                if (groupedMessagePosition != null) {
                                    int i15 = groupedMessagePosition.flags;
                                    if ((i15 & 8) != 0 && (i15 & 1) != 0) {
                                        arrayList6.add(s1Var2);
                                    }
                                } else {
                                    arrayList6.add(s1Var2);
                                }
                            }
                            if (rnVar.I8 == null || s1Var2 == null || currentMessagesGroup2 != 0) {
                                float f29 = f28;
                                float f30 = fMax4;
                                View view4 = view;
                                float f31 = f26;
                                float f32 = f27;
                                f15 = f21;
                                if (rnVar.I8 != null && v0Var != null) {
                                    if (rnVar.f42298z8 != null) {
                                        rnVar.A8.reset();
                                        float measuredWidth3 = getMeasuredWidth() / rnVar.x8.getWidth();
                                        rnVar.A8.postScale(measuredWidth3, measuredWidth3);
                                        rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                                        rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), rnVar.f42298z8);
                                    } else {
                                        v0Var2 = v0Var;
                                        rnVar.B8.setAlpha((int) (rnVar.G8 * rnVar.D8 * 255.0f));
                                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), rnVar.B8);
                                    }
                                    if (f27 < f26) {
                                        float f33 = (rnVar.G8 * rnVar.D8) / 0.2f;
                                        float alpha = rnVar.G8 * view4.getAlpha();
                                        if (alpha < f13) {
                                            canvas.saveLayerAlpha(f30, f32, f29, f31, (int) (alpha * 255.0f), 31);
                                            f31 = f31;
                                            f16 = f32;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f16 = f32;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f30, f16, f29, f31);
                                        canvas3.translate(view4.getX() + rnVar.f42213t0.getLeft(), view4.getY() + rnVar.f42213t0.getY() + view4.getPaddingTop());
                                        Integer num2 = rnVar.I8;
                                        boolean z13 = rnVar.E8;
                                        ig.r0 r0Var = v0Var2.f25785y0;
                                        if (!r0Var.f11419b) {
                                            org.telegram.ui.ActionBar.c6 c6Var = v0Var2.U0;
                                            if (c6Var != null) {
                                                c6Var.m(v0Var2.f25764q0, v0Var2.f25762p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.f25767r0);
                                            } else {
                                                org.telegram.ui.ActionBar.g6.q(v0Var2.f25764q0, v0Var2.f25762p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.f25767r0);
                                            }
                                            r0Var.D = f33;
                                            r0Var.E = z13;
                                            r0Var.d(canvas3, v0Var2.f25741e2.f25691c, num2);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        canvas3.translate(view4.getX() + rnVar.f42213t0.getLeft(), view4.getY() + rnVar.f42213t0.getY() + view4.getPaddingTop());
                                        v0Var2.E(this, canvas3, rnVar.J8, rnVar.I8, f33);
                                        jmVar2 = this;
                                        canvas3.restore();
                                    }
                                }
                                z12 = z10;
                            } else {
                                if (rnVar.f42298z8 != null) {
                                    rnVar.A8.reset();
                                    float measuredWidth4 = getMeasuredWidth() / rnVar.x8.getWidth();
                                    rnVar.A8.postScale(measuredWidth4, measuredWidth4);
                                    rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                                    rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                                    canvas4.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), rnVar.f42298z8);
                                } else {
                                    rnVar.B8.setAlpha((int) (rnVar.G8 * rnVar.D8 * 255.0f));
                                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), rnVar.B8);
                                }
                                if (f27 < f26) {
                                    float f34 = (rnVar.G8 * rnVar.D8) / 0.2f;
                                    float alpha2 = rnVar.G8 * view.getAlpha();
                                    if (alpha2 < f13) {
                                        int i16 = (int) (alpha2 * 255.0f);
                                        canvas5 = canvas;
                                        f17 = f26;
                                        float f35 = f28;
                                        float f36 = fMax4;
                                        float f37 = f27;
                                        canvas5.saveLayerAlpha(f36, f37, f35, f17, i16, 31);
                                        f18 = f37;
                                    } else {
                                        canvas5 = canvas;
                                        f17 = f26;
                                        f18 = f27;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(fMax4, f18, f28, f17);
                                    canvas5.translate(view.getX() + rnVar.f42213t0.getLeft(), view.getY() + rnVar.f42213t0.getY() + view.getPaddingTop());
                                    s1Var2.g2(canvas5, rnVar.I8, f34, rnVar.E8);
                                    canvas5.restore();
                                    canvas5.save();
                                    canvas5.translate(view.getX() + rnVar.f42213t0.getLeft(), view.getY() + rnVar.f42213t0.getY() + view.getPaddingTop());
                                    f15 = f21;
                                    s1Var2.h2(this, canvas5, rnVar.J8, rnVar.I8, f34);
                                    canvas.restore();
                                } else {
                                    f15 = f21;
                                }
                            }
                            jmVar2 = this;
                            canvas3 = canvas;
                            z12 = z10;
                        } else {
                            currentMessagesGroup2 = currentMessagesGroup2;
                            childCount = childCount;
                            i12 = i12;
                            iVar = iVar;
                            f15 = f21;
                            jmVar2 = this;
                        }
                        i12++;
                        jmVar3 = jmVar2;
                        y10 = f15;
                        currentMessagesGroup2 = currentMessagesGroup2;
                        iVar = iVar;
                        childCount = childCount;
                    }
                    jmVar = jmVar3;
                    MessageObject.GroupedMessages groupedMessages = currentMessagesGroup2;
                    f11 = 1.0f;
                    float f38 = y10;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i17 = 0; i17 < size3; i17++) {
                            jmVar.a0(canvas3, f38, (org.telegram.ui.Cells.s1) arrayList3.get(i17), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i18 = 0; i18 < size4; i18++) {
                            jmVar.a0(canvas3, f38, (org.telegram.ui.Cells.s1) arrayList2.get(i18), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i19 = 0; i19 < size5; i19++) {
                            org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList.get(i19);
                            if (s1Var5.getCurrentPosition() != null || s1Var5.getTransitionParams().f25186w0) {
                                jmVar.a0(canvas3, f38, s1Var5, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i20 = 0; i20 < size6; i20++) {
                            org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) arrayList4.get(i20);
                            if (s1Var6.getCurrentPosition() != null || s1Var6.getTransitionParams().f25186w0) {
                                jmVar.a0(canvas3, f38, s1Var6, 3);
                            }
                        }
                    }
                    if (rnVar.I8 != null && groupedMessages != null) {
                        if (rnVar.f42298z8 != null) {
                            rnVar.A8.reset();
                            float measuredWidth5 = jmVar.getMeasuredWidth() / rnVar.x8.getWidth();
                            rnVar.A8.postScale(measuredWidth5, measuredWidth5);
                            rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                            rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                            canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.f42298z8);
                            canvas3 = canvas;
                        } else {
                            rnVar.B8.setAlpha((int) (rnVar.G8 * rnVar.D8 * 255.0f));
                            canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.B8);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i21 = 0; i21 < size7; i21++) {
                            org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList4.get(i21);
                            if (s1Var7.getCurrentPosition() != null || s1Var7.getTransitionParams().f25186w0) {
                                jmVar.a0(canvas3, f38, s1Var7, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                }
                if (rnVar.I8 == null && rnVar.G8 < f11) {
                    if (rnVar.f42298z8 != null) {
                        rnVar.A8.reset();
                        float measuredWidth6 = jmVar.getMeasuredWidth() / rnVar.x8.getWidth();
                        rnVar.A8.postScale(measuredWidth6, measuredWidth6);
                        rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                        rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.f42298z8);
                        canvas3 = canvas;
                    } else {
                        rnVar.B8.setAlpha((int) ((f11 - rnVar.G8) * rnVar.D8 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.B8);
                        canvas3 = canvas;
                    }
                }
            } else if (rnVar.G8 < 1.0f) {
                rnVar.B8.setAlpha((int) ((1.0f - rnVar.G8) * rnVar.D8 * 255.0f));
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), rnVar.B8);
            } else {
                canvas3 = canvas;
            }
            jmVar = jmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            if (rnVar.I8 == null) {
                if (rnVar.f42298z8 != null) {
                    rnVar.A8.reset();
                    float measuredWidth7 = jmVar.getMeasuredWidth() / rnVar.x8.getWidth();
                    rnVar.A8.postScale(measuredWidth7, measuredWidth7);
                    rnVar.f42285y8.setLocalMatrix(rnVar.A8);
                    rnVar.f42298z8.setAlpha((int) (rnVar.H8 * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.f42298z8);
                    canvas3 = canvas;
                } else {
                    rnVar.B8.setAlpha((int) ((f11 - rnVar.G8) * rnVar.D8 * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), rnVar.B8);
                    canvas3 = canvas;
                }
            }
        } else {
            canvas3 = canvas;
            jmVar = jmVar3;
            f10 = 20.0f;
        }
        if (rnVar.F8 != null || ((ArrayList) rnVar.I9.f28391c).size() > 0) {
            if (rnVar.E1 == null || rnVar.E1.getVisibility() != 0) {
                super.drawChild(canvas3, rnVar.f42041f1, SystemClock.uptimeMillis());
            }
            tj tjVar = rnVar.T2;
            if (tjVar != null && tjVar.getTag() != null) {
                super.drawChild(canvas3, rnVar.T2, SystemClock.uptimeMillis());
            }
            sj sjVar = rnVar.U2;
            if (sjVar != null && sjVar.getTag() != null) {
                super.drawChild(canvas3, rnVar.U2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.f00 f00Var = rnVar.f42086i9;
            if (f00Var != null) {
                super.drawChild(canvas3, f00Var, SystemClock.uptimeMillis());
            }
            dh.k kVar = rnVar.T9;
            if (kVar != null) {
                super.drawChild(canvas3, kVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.x30 x30Var3 = rnVar.a2;
            if (x30Var3 != null) {
                super.drawChild(canvas3, x30Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = rnVar.f42229u3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.f42229u3, SystemClock.uptimeMillis());
            }
            zk zkVar = rnVar.f42242v3;
            if (zkVar != null && zkVar.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.f42242v3, SystemClock.uptimeMillis());
            }
            lh.w3 w3Var = rnVar.f42214t1;
            if (w3Var != null && w3Var.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.f42214t1, SystemClock.uptimeMillis());
            }
            ol olVar = rnVar.f42265x1;
            if (olVar != null && olVar.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.f42265x1, SystemClock.uptimeMillis());
            }
            lh.w3 w3Var2 = rnVar.f42240v1;
            if (w3Var2 != null && w3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.f42240v1, SystemClock.uptimeMillis());
            }
            ck ckVar2 = rnVar.U;
            if (ckVar2 != null && ckVar2.H != null) {
                canvas3.save();
                canvas3.translate(rnVar.U.H.getX() + rnVar.U.getX(), rnVar.U.H.getY() + rnVar.U.getY());
                rnVar.U.H.draw(canvas3);
                canvas3.restore();
            }
        }
        if (rnVar.la > 0 && jmVar.f35375f < AndroidUtilities.dp(f10)) {
            int themedColor = rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
            if (jmVar.f39397z0 == null) {
                jmVar.f39397z0 = new Paint();
            }
            if (jmVar.A0 != themedColor) {
                Paint paint = jmVar.f39397z0;
                jmVar.A0 = themedColor;
                paint.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, jmVar.getMeasuredHeight() - rnVar.la, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), jmVar.f39397z0);
            canvas3 = canvas6;
        }
        mp mpVar = rnVar.L9;
        if (mpVar != null && mpVar.e()) {
            int inputBubbleTop = (int) rnVar.O.getInputBubbleTop();
            int inputBubbleBottom = (int) rnVar.O.getInputBubbleBottom();
            rn rnVar2 = rnVar.P9;
            int i22 = inputBubbleTop - ((int) (rnVar.Q9 * (rnVar2 == null ? 0.0f : rnVar2.K9)));
            mp mpVar2 = rnVar.L9;
            jmVar.getMeasuredWidth();
            mpVar2.b(canvas3, i22, inputBubbleBottom);
        }
        if (rnVar.P9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), (int) (rnVar.Q9 * 255.0f), 31);
            canvas3 = canvas;
            rnVar.P9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        rnVar.f42223ta.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (rnVar.f42062ga) {
            canvas3.save();
            canvas3.translate(((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getX(), ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getWidth(), ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getHeight(), (int) (rnVar.f42074ha * 255.0f), 31);
            ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        yk ykVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (ykVar = this.F0.Aa) == null || !ykVar.f28587s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ykVar.a(true);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10;
        ck ckVar;
        boolean zA;
        boolean z10;
        boolean z11;
        char c10;
        rn rnVar = this.F0;
        qg.d dVar = rnVar.J3;
        if (dVar != null) {
            dVar.f46529n = SystemClock.uptimeMillis();
        }
        if (AndroidUtilities.isInMultiwindow || rnVar.isInBubbleMode()) {
            y10 = (rnVar.U.getEmojiView() != null ? rnVar.U.getEmojiView() : rnVar.U).getY();
        } else {
            y10 = rnVar.U.getY();
        }
        View view = rnVar.F8;
        if ((view == null || view == ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getBackButton()) && ((ckVar = rnVar.U) == null || !ckVar.f26186u3 || motionEvent.getY() >= y10)) {
            rnVar.f42049f9 = motionEvent.getY();
            org.telegram.ui.Cells.v9 v9VarO = rnVar.Y8.o(getContext());
            motionEvent.offsetLocation(-v9VarO.getX(), -v9VarO.getY());
            if (!rnVar.Y8.y() || !rnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(v9VarO.getX(), v9VarO.getY());
                int i10 = 3;
                if (v9VarO.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                lh.h1 h1Var = rnVar.f42126m1;
                if (h1Var == null) {
                    zA = false;
                } else if (rnVar.f42177q3 != null) {
                    zA = h1Var.A(motionEvent);
                    if (rnVar.f42126m1.D) {
                        motionEvent.setAction(3);
                    }
                } else {
                    View[] viewArr = h1Var.f31545e;
                    if (h1Var.D) {
                        h1Var.E = true;
                        h1Var.D = false;
                        viewArr[0].setTranslationX(0.0f);
                        View view2 = viewArr[1];
                        if (view2 != null) {
                            view2.setTranslationX(h1Var.f31552y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                        }
                        h1Var.d = 0;
                        h1Var.f31544c = 1.0f;
                        org.telegram.ui.Components.e71 e71Var = h1Var.I;
                        if (e71Var != null) {
                            e71Var.e(1.0f, 0, h1Var.f31543b);
                        }
                        h1Var.w(false);
                    }
                    zA = false;
                }
                if (motionEvent.getAction() == 0 && rnVar.Y8.y() && (motionEvent.getY() < rnVar.f42213t0.getTop() || motionEvent.getY() > rnVar.f42213t0.getBottom())) {
                    motionEvent.offsetLocation(-v9VarO.getX(), -v9VarO.getY());
                    if (rnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                        motionEvent.offsetLocation(v9VarO.getX(), v9VarO.getY());
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else {
                    lk lkVar = rnVar.f42210sa;
                    if (lkVar.f41180n) {
                        return lkVar.g(motionEvent);
                    }
                    com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.f4598e;
                    if (lVar == null || !lVar.f4599a) {
                        if (rnVar.isInPreviewMode() && rnVar.F9) {
                            if (motionEvent.getAction() == 0) {
                                int[] iArr = new int[2];
                                getLocationInWindow(iArr);
                                int[] iArr2 = new int[2];
                                if (rnVar.f42041f1 == null) {
                                    z10 = false;
                                    break;
                                }
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= i10) {
                                        z10 = false;
                                        break;
                                    }
                                    if (i11 == 0) {
                                        c10 = 1;
                                    } else {
                                        c10 = i11 == 1 ? (char) 2 : (char) 3;
                                    }
                                    j9.a aVar = rnVar.f42041f1.f47920e[c10];
                                    if (aVar != null) {
                                        ((rg.b) aVar.f12863b).getLocationInWindow(iArr2);
                                        Rect rect = AndroidUtilities.rectTmp2;
                                        int i12 = iArr2[0] - iArr[0];
                                        rect.set(i12, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i12, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    i11++;
                                    i10 = 3;
                                }
                                fj fjVar = rnVar.W0;
                                if (fjVar != null) {
                                    fjVar.getLocationInWindow(iArr2);
                                    Rect rect2 = AndroidUtilities.rectTmp2;
                                    int i13 = iArr2[0] - iArr[0];
                                    rect2.set(i13, iArr2[1] - iArr[1], rnVar.W0.getMeasuredWidth() + i13, rnVar.W0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                    if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                if (z10) {
                                    this.D0 = -1L;
                                } else {
                                    this.B0 = motionEvent.getX();
                                    this.C0 = motionEvent.getY();
                                    this.D0 = SystemClock.elapsedRealtime();
                                    this.E0 = z11;
                                    fj fjVar2 = rnVar.W0;
                                    if (fjVar2 != null) {
                                        fjVar2.f32216d0.c(z11);
                                    }
                                    zA = true;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                fj fjVar3 = rnVar.W0;
                                if (fjVar3 != null) {
                                    fjVar3.f32216d0.c(false);
                                }
                                if (this.E0 || (h7.y.a(this.B0, this.C0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.D0 <= ViewConfiguration.getTapTimeout())) {
                                    if (this.E0) {
                                        org.telegram.ui.ActionBar.b5 b5Var = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                                        rnVar.removeSelfFromStack(false);
                                        ((ActionBarLayout) b5Var).P(ProfileActivity.m4(rnVar.P5));
                                    } else {
                                        ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout).r();
                                    }
                                    motionEvent.setAction(3);
                                }
                                this.D0 = -1L;
                            } else if (motionEvent.getAction() == 3) {
                                this.D0 = -1L;
                            }
                        }
                        if (super.dispatchTouchEvent(motionEvent) || zA) {
                        }
                    } else {
                        s4 s4Var = (s4) com.google.firebase.messaging.l.i().d;
                        if (s4Var != null) {
                            s4Var.onTouchEvent(motionEvent);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ag.t0 t0Var;
        boolean zIsRoundVideo;
        boolean z10;
        gk gkVar;
        float measuredHeight;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        wk wkVar;
        float measuredHeight2;
        rn rnVar = this.F0;
        boolean zDrawChild = false;
        if ((rnVar.F8 == null && ((ArrayList) rnVar.I9.f28391c).size() <= 0) || (view != rnVar.f42041f1 && view != rnVar.T2 && view != rnVar.U2 && view != rnVar.f42086i9 && view != rnVar.T9 && view != rnVar.a2 && view != null && view != rnVar.f42229u3 && view != rnVar.f42242v3)) {
            if ((view == rnVar.f42229u3 && PhotoViewer.t1().Q1()) || ((rnVar.O9 && view == rnVar.f42213t0) || ((rnVar.f42062ga && view == ((org.telegram.ui.ActionBar.n2) rnVar).actionBar) || view == rnVar.X2))) {
                return true;
            }
            if (getTag(67108867) == null ? getTag(67108867) != null || (t0Var = rnVar.f42228u2) == null || !t0Var.a() || rnVar.f42228u2.getTag() == null || (view != ((org.telegram.ui.ActionBar.n2) rnVar).actionBar && view != rnVar.f42213t0) : ((Integer) getTag(67108867)).intValue() != 0 ? view == rnVar.f42213t0 || view == rnVar.O || view == rnVar.K0 : view == ((org.telegram.ui.ActionBar.n2) rnVar).actionBar) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || playingMessageObject.eventId != 0) {
                    zIsRoundVideo = false;
                } else {
                    zIsRoundVideo = playingMessageObject.isRoundVideo();
                    z10 = zIsRoundVideo || playingMessageObject.isVideo();
                    if (view == rnVar.f42171p8) {
                        canvas.save();
                        if (rnVar.Q9 != 0.0f) {
                            measuredHeight2 = (rnVar.f42213t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9;
                        } else {
                            measuredHeight2 = 0.0f;
                        }
                        canvas.translate(0.0f, (-rnVar.J9) - measuredHeight2);
                        if (playingMessageObject == null && playingMessageObject.type == 5) {
                            if (org.telegram.ui.ActionBar.g6.f23178k3 != null && rnVar.f42194r8.d) {
                                int x8 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                int y10 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                canvas.save();
                                canvas.scale(rnVar.f42171p8.getScaleX(), rnVar.f42171p8.getScaleY(), view.getX(), view.getY());
                                org.telegram.ui.ActionBar.g6.f23178k3.setAlpha(255);
                                org.telegram.ui.ActionBar.g6.f23178k3.setBounds(x8, y10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(rnVar.C9()) + x8, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(rnVar.C9()) + y10);
                                org.telegram.ui.ActionBar.g6.f23178k3.draw(canvas);
                                canvas.restore();
                            }
                            zDrawChild = super.drawChild(canvas, view, j10);
                        } else if (view.getTag() == null) {
                            float translationY = view.getTranslationY();
                            view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                            zDrawChild = super.drawChild(canvas, view, j10);
                            view.setTranslationY(translationY);
                        }
                        canvas.restore();
                        return zDrawChild;
                    }
                    if (view == rnVar.O && (wkVar = rnVar.X2) != null && wkVar.getVisibility() == 0) {
                        super.drawChild(canvas, rnVar.X2, j10);
                    }
                    zDrawChild = super.drawChild(canvas, view, j10);
                    if (z10 && view == rnVar.f42213t0 && playingMessageObject.type != 5 && (gkVar = rnVar.f42171p8) != null && gkVar.getTag() != null) {
                        canvas.save();
                        if (rnVar.Q9 != 0.0f) {
                            measuredHeight = (rnVar.f42213t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9;
                        } else {
                            measuredHeight = 0.0f;
                        }
                        canvas.translate(0.0f, ((-rnVar.J9) - measuredHeight) + rnVar.K9);
                        super.drawChild(canvas, rnVar.f42171p8, j10);
                        if (rnVar.f42181q8 != null) {
                            canvas.save();
                            canvas.translate(rnVar.f42181q8.getX(), rnVar.f42213t0.getY() + rnVar.f42181q8.getTop());
                            if (zIsRoundVideo) {
                                rnVar.f42181q8.f2(canvas);
                                invalidate();
                                rnVar.f42181q8.invalidate();
                            } else {
                                rnVar.f42181q8.X1(canvas);
                                s1Var = rnVar.f42181q8;
                                if (!s1Var.f25504rb && ((messageObject = s1Var.f25546u7) == null || messageObject.type != 27)) {
                                    s1Var.l2(s1Var.getAlpha(), canvas, true);
                                }
                            }
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                }
                if (view == rnVar.f42171p8) {
                    canvas.save();
                    if (rnVar.Q9 != 0.0f) {
                        measuredHeight2 = (rnVar.f42213t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9;
                    } else {
                        measuredHeight2 = 0.0f;
                    }
                    canvas.translate(0.0f, (-rnVar.J9) - measuredHeight2);
                    if (playingMessageObject == null) {
                        if (view.getTag() == null) {
                            float translationY2 = view.getTranslationY();
                            view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                            zDrawChild = super.drawChild(canvas, view, j10);
                            view.setTranslationY(translationY2);
                        }
                    } else if (view.getTag() == null) {
                        float translationY3 = view.getTranslationY();
                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                        zDrawChild = super.drawChild(canvas, view, j10);
                        view.setTranslationY(translationY3);
                    }
                    canvas.restore();
                    return zDrawChild;
                }
                if (view == rnVar.O) {
                    super.drawChild(canvas, rnVar.X2, j10);
                }
                zDrawChild = super.drawChild(canvas, view, j10);
                if (z10) {
                    canvas.save();
                    if (rnVar.Q9 != 0.0f) {
                        measuredHeight = (rnVar.f42213t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9;
                    } else {
                        measuredHeight = 0.0f;
                    }
                    canvas.translate(0.0f, ((-rnVar.J9) - measuredHeight) + rnVar.K9);
                    super.drawChild(canvas, rnVar.f42171p8, j10);
                    if (rnVar.f42181q8 != null) {
                        canvas.save();
                        canvas.translate(rnVar.f42181q8.getX(), rnVar.f42213t0.getY() + rnVar.f42181q8.getTop());
                        if (zIsRoundVideo) {
                            rnVar.f42181q8.f2(canvas);
                            invalidate();
                            rnVar.f42181q8.invalidate();
                        } else {
                            rnVar.f42181q8.X1(canvas);
                            s1Var = rnVar.f42181q8;
                            if (!s1Var.f25504rb) {
                                s1Var.l2(s1Var.getAlpha(), canvas, true);
                            }
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
        return zDrawChild;
    }

    @Override
    public float getBottomOffset() {
        return this.F0.f42213t0.getBottom();
    }

    public rn getChatActivity() {
        return this.F0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.F0.Ka) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.F0.f42213t0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable drawableD = this.F0.f41983aa.d();
        return drawableD != null ? drawableD : super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.f41983aa.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override
    public int getScrollOffset() {
        return this.F0.f42213t0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn rnVar = this.F0;
        if (rnVar.Ka) {
            this.D.f23708b = rnVar.T0;
        } else if (((org.telegram.ui.ActionBar.n2) rnVar).parentLayout != null && ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout).f22647b) {
            this.D.f23708b = (FrameLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout.getView().getParent().getParent().getParent().getParent();
        }
        this.D.c();
        rnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == rnVar.P5)) {
            MediaController.getInstance().setTextureView(rnVar.N7(false), rnVar.f42194r8, rnVar.f42171p8, true);
        }
        mp mpVar = rnVar.L9;
        if (mpVar != null) {
            mpVar.f();
        }
        rnVar.f42223ta.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        rn rnVar = this.F0;
        mp mpVar = rnVar.L9;
        if (mpVar != null) {
            NotificationCenter.getInstance(mpVar.f40558a0).removeObserver(mpVar, NotificationCenter.updateInterfaces);
            mpVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.k5 k5Var = mpVar.f40568g0;
            if (k5Var != null && (view = mpVar.W) != null) {
                k5Var.o(view);
            }
            mpVar.M = 0.0f;
            mpVar.L = 0L;
            rnVar.L9 = null;
        }
        rnVar.f42223ta.k();
        AndroidUtilities.runOnUIThread(new ag.l3(23));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rn rnVar;
        ag.t0 t0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (t0Var = (rnVar = this.F0).f42228u2) == null || !t0Var.a() || rnVar.f42228u2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iB;
        int i14;
        int iDp;
        int i15;
        int i16;
        int measuredHeight;
        int iDp2;
        int i17;
        int iDp3;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        rn rnVar = this.F0;
        yg.i iVar = rnVar.v;
        int i18 = (measuredWidth - rnVar.Qa) - rnVar.Ra;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        iDp = rnVar.Qa + layoutParams.leftMargin;
                    } else {
                        iB = (measuredWidth - rnVar.Ra) - measuredWidth2;
                        i14 = layoutParams.rightMargin;
                    }
                    if (i21 != 16) {
                        if (i21 != 48) {
                            measuredHeight = layoutParams.topMargin + getPaddingTop();
                            if (childAt != ((org.telegram.ui.ActionBar.n2) rnVar).actionBar && ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0) {
                                measuredHeight += ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight();
                            }
                        } else if (i21 != 80) {
                            measuredHeight = layoutParams.topMargin;
                        } else {
                            i15 = (i13 - i11) - measuredHeight2;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (b0(childAt)) {
                            measuredHeight = 0;
                            iDp = 0;
                        } else if (childAt != rnVar.I9 || childAt == rnVar.T9 || childAt == rnVar.O || (childAt instanceof org.telegram.ui.Components.x30) || (childAt instanceof org.telegram.ui.Components.ep)) {
                            measuredHeight = 0;
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.v9) {
                                i17 = rnVar.f42248va;
                            } else if (childAt == rnVar.M0) {
                                measuredHeight += ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0 ? ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight() / 2 : 0;
                            } else if (!rnVar.U.u0(childAt)) {
                                ck ckVar = rnVar.U;
                                if (ckVar != null && (childAt == ckVar.J1 || childAt == ckVar.I1)) {
                                    measuredHeight = org.telegram.messenger.rl.u(7.0f, iVar.d(), measuredHeight);
                                    iDp -= AndroidUtilities.dp(3.0f);
                                } else if (childAt == rnVar.f42202s2) {
                                    measuredHeight = org.telegram.messenger.rl.u(7.0f, iVar.d(), measuredHeight);
                                } else if (ckVar == null || childAt != ckVar.f26073a1) {
                                    if (childAt == rnVar.a2 || childAt == rnVar.f42153o2 || childAt == rnVar.f41989b2) {
                                        iDp2 = this.f39390s0;
                                    } else if (childAt == rnVar.f42213t0 || childAt == rnVar.f42186r0 || childAt == rnVar.T2 || childAt == rnVar.U2 || childAt == rnVar.V2) {
                                        i17 = rnVar.f42248va;
                                    } else if (childAt == rnVar.L) {
                                        if (ckVar.z0()) {
                                            iDp2 = AndroidUtilities.dp(48.0f);
                                        }
                                    } else if (childAt == ((org.telegram.ui.ActionBar.n2) rnVar).actionBar) {
                                        measuredHeight -= getPaddingTop();
                                        if (rnVar.isInPreviewMode()) {
                                            iDp3 = AndroidUtilities.dp(1.0f);
                                            measuredHeight += iDp3;
                                        }
                                    } else if (childAt == rnVar.f42171p8) {
                                        measuredHeight = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight();
                                    } else if (childAt == rnVar.X2 || childAt == rnVar.Y2 || childAt == rnVar.f42174q0) {
                                        measuredHeight = 0;
                                    } else if (childAt instanceof org.telegram.ui.Components.gb0) {
                                        measuredHeight = AndroidUtilities.statusBarHeight;
                                    } else if (childAt == rnVar.P || childAt == rnVar.J3 || childAt == rnVar.f42289yc) {
                                        measuredHeight = 0;
                                    }
                                    measuredHeight -= iDp2;
                                } else {
                                    measuredHeight = org.telegram.messenger.rl.u(9.0f, iVar.d(), measuredHeight);
                                }
                            } else if (AndroidUtilities.isInMultiwindow || ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode) {
                                measuredHeight = rnVar.U.getTop() - childAt.getMeasuredHeight();
                                iDp3 = AndroidUtilities.dp(1.0f);
                                measuredHeight += iDp3;
                            } else {
                                measuredHeight = rnVar.U.getBottom();
                            }
                            measuredHeight = -i17;
                        }
                        childAt.layout(iDp, measuredHeight, measuredWidth2 + iDp, measuredHeight2 + measuredHeight);
                    } else {
                        i15 = (((i13 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    measuredHeight = i15 - i16;
                    if (b0(childAt)) {
                        measuredHeight = 0;
                        iDp = 0;
                    } else if (childAt != rnVar.I9) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = 0;
                    }
                    childAt.layout(iDp, measuredHeight, measuredWidth2 + iDp, measuredHeight2 + measuredHeight);
                } else {
                    iB = i0.a.B(i18, measuredWidth2, 2, rnVar.Qa) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                }
                iDp = iB - i14;
                if (i21 != 16) {
                    if (i21 != 48) {
                        measuredHeight = layoutParams.topMargin + getPaddingTop();
                        if (childAt != ((org.telegram.ui.ActionBar.n2) rnVar).actionBar) {
                            measuredHeight += ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight();
                        }
                    } else if (i21 != 80) {
                        measuredHeight = layoutParams.topMargin;
                    } else {
                        i15 = (i13 - i11) - measuredHeight2;
                        i16 = layoutParams.bottomMargin;
                    }
                    if (b0(childAt)) {
                        measuredHeight = 0;
                        iDp = 0;
                    } else if (childAt != rnVar.I9) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = 0;
                    }
                    childAt.layout(iDp, measuredHeight, measuredWidth2 + iDp, measuredHeight2 + measuredHeight);
                } else {
                    i15 = (((i13 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                measuredHeight = i15 - i16;
                if (b0(childAt)) {
                    measuredHeight = 0;
                    iDp = 0;
                } else if (childAt != rnVar.I9) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = 0;
                }
                childAt.layout(iDp, measuredHeight, measuredWidth2 + iDp, measuredHeight2 + measuredHeight);
            }
        }
        sj sjVar = rnVar.U2;
        if (sjVar != null) {
            sjVar.setBackgroundHeight(getMeasuredHeight());
        }
        rnVar.o9();
        rnVar.r9();
        rnVar.Mc(false, false);
        S();
        rnVar.t7();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.v0 v0Var;
        TLRPC.User user;
        rn rnVar = this.F0;
        yg.i iVar = rnVar.v;
        rnVar.zc.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = (size - rnVar.Qa) - rnVar.Ra;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        og.a aVar = rnVar.H.f19458a;
        if (aVar instanceof og.b) {
            ((og.b) aVar).b(i12, size2);
        }
        if (this.f39392u0 != i12) {
            rnVar.B4 = false;
            this.f39392u0 = iMakeMeasureSpec;
            if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || (user = rnVar.f42039f) == null || !user.self) {
                rnVar.G9 = false;
            } else {
                org.telegram.ui.ActionBar.h5 titleTextView = rnVar.W0.getTitleTextView();
                if (i12 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    rnVar.G9 = !rnVar.H9;
                } else {
                    rnVar.G9 = false;
                }
            }
            if (rnVar.G9 || rnVar.H9 || UserObject.isBotForumWithEditableTopics(rnVar.f42039f)) {
                fj fjVar = rnVar.W0;
                if (fjVar != null && fjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) rnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(rnVar.N3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                fj fjVar2 = rnVar.W0;
                if (fjVar2 != null && fjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) rnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (rnVar.G9) {
                if (!((org.telegram.ui.ActionBar.n2) rnVar).actionBar.f23578j0 && (v0Var = rnVar.f42077i0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.f42013d0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.f42013d0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = rnVar.f42077i0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            if (!((org.telegram.ui.ActionBar.n2) rnVar).actionBar.f23578j0 && (yVar = rnVar.f42090j0) != null) {
                yVar.f((!rnVar.H9 || rnVar.G9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = rnVar.f42013d0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = rnVar.W7;
                if (rnVar.H9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            rnVar.B4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(((org.telegram.ui.ActionBar.n2) rnVar).actionBar, iMakeMeasureSpec, 0, i11, 0);
        int measuredHeight = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight();
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int i13 = this.f35375f + rnVar.f42113ka;
        boolean z10 = i13 >= AndroidUtilities.dp(20.0f);
        if (this.f39391t0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (rnVar.la > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            rnVar.f42113ka = rnVar.la;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            rnVar.f42113ka = rnVar.U.t0() ? rnVar.U.getEmojiPadding() : 0;
        } else {
            rnVar.f42113ka = 0;
        }
        setEmojiKeyboardHeight(rnVar.f42113ka);
        boolean z11 = this.f35375f + rnVar.f42113ka >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() == null || !MediaController.getInstance().getPlayingMessageObject().isRoundVideo() || z10 == z11) {
            org.telegram.ui.Components.ne neVar = rnVar.U.T3;
            AndroidUtilities.cancelRunOnUIThread(neVar);
            neVar.run();
            break;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= rnVar.f42213t0.getChildCount()) {
                org.telegram.ui.Components.ne neVar2 = rnVar.U.T3;
                AndroidUtilities.cancelRunOnUIThread(neVar2);
                neVar2.run();
                break;
            }
            View childAt = rnVar.f42213t0.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    rnVar.f42213t0.getClass();
                    int iR = RecyclerView.R(childAt);
                    if (iR >= 0) {
                        rnVar.f42239v0.i1(iR, (int) (((((rnVar.f42213t0.getMeasuredHeight() - rnVar.f42160o9) - rnVar.wa) + ((this.f35375f + rnVar.f42113ka) - i13)) - (z11 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(rnVar.C9()))) / 2.0f), false);
                        rnVar.f42252w0.m(iR);
                        this.D.f23712g = true;
                        break;
                    }
                }
            }
            i14++;
        }
        int childCount = getChildCount();
        int i15 = paddingTop;
        measureChildWithMargins(rnVar.U, iMakeMeasureSpec, 0, i11, 0);
        if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || rnVar.Ka) {
            this.f39390s0 = 0;
        } else {
            this.f39390s0 = rnVar.U.getMeasuredHeight();
        }
        rnVar.f42248va = 0;
        rnVar.wa = 0;
        if (SharedConfig.chatBlurEnabled() && !rnVar.Ka && rnVar.B != null && Build.VERSION.SDK_INT >= 31) {
            int i16 = rnVar.C;
            rnVar.f42248va = i16;
            rnVar.wa = i16;
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            int iMax = -1;
            View childAt2 = getChildAt(i17);
            if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != rnVar.U && childAt2 != ((org.telegram.ui.ActionBar.n2) rnVar).actionBar) {
                if (b0(childAt2)) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else if (childAt2 == rnVar.f42213t0 || childAt2 == rnVar.f42186r0 || (childAt2 instanceof org.telegram.ui.Cells.v9)) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), rnVar.f42248va + size2 + rnVar.wa), 1073741824));
                } else if (childAt2 == rnVar.L) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp((rnVar.U.z0() ? 48 : 0) + 2) + ((i15 - this.f39390s0) - (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0))), 1073741824));
                } else if (childAt2 == rnVar.X2) {
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                    rnVar.X2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) rnVar.f42173pc));
                    childAt2.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                } else if (childAt2 == rnVar.Y2) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) rnVar.f42173pc)) - AndroidUtilities.dp(12.0f), 1073741824));
                } else if (childAt2 == rnVar.M0) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                } else if (rnVar.U.u0(childAt2)) {
                    org.telegram.ui.Components.nf nfVar = rnVar.U.C1;
                    if (childAt2 == nfVar && nfVar != null) {
                        iMax = nfVar.getKeyboardHeight();
                    }
                    if (((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode) {
                        int paddingTop2 = getPaddingTop() + (i15 - this.f39390s0) + measuredHeight;
                        if (iMax < 0) {
                            iMax = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                        }
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
                    } else if (AndroidUtilities.isInMultiwindow) {
                        int paddingTop3 = getPaddingTop() + (((i15 - this.f39390s0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                        if (iMax < 0) {
                            iMax = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                        }
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
                    } else {
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                    }
                } else {
                    vj vjVar = rnVar.E1;
                    if (childAt2 == vjVar) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vjVar.getLayoutParams();
                        pf.u0 adapter = rnVar.E1.getAdapter();
                        if (adapter.f45944s0 == null || adapter.f45925d0) {
                            rnVar.E1.setIgnoreLayout(true);
                            layoutParams.height = i15;
                            layoutParams.topMargin = 0;
                            rnVar.E1.setIgnoreLayout(false);
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                        } else {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE));
                        }
                    } else if (childAt2 == rnVar.Y8.o(getContext())) {
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                        int i18 = i15 + rnVar.f42248va;
                        if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || rnVar.Ka) {
                            km kmVar = rnVar.Y8;
                            kmVar.f25866e0 = 0;
                            kmVar.x();
                        } else {
                            i18 += keyboardHeight;
                            km kmVar2 = rnVar.Y8;
                            kmVar2.f25866e0 = keyboardHeight;
                            kmVar2.x();
                        }
                        childAt2.measure(iMakeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    } else if (childAt2 instanceof org.telegram.ui.Components.gb0) {
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, 1073741824));
                    } else if (childAt2 == rnVar.N1) {
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0 ? size2 - ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight() : size2, 1073741824));
                    } else {
                        measureChildWithMargins(childAt2, iMakeMeasureSpec, 0, i11, 0);
                    }
                }
            }
        }
        if (rnVar.A4) {
            rnVar.B4 = true;
            rnVar.o9();
            rnVar.r9();
            rnVar.A4 = false;
            kj kjVar = rnVar.f42213t0;
            kjVar.measure(View.MeasureSpec.makeMeasureSpec(kjVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(rnVar.f42213t0.getMeasuredHeight(), 1073741824));
            rnVar.B4 = false;
        }
        int i19 = rnVar.f42217t4;
        if (i19 != -1) {
            AndroidUtilities.runOnUIThread(new cg.w1(this, i19, 23));
            rnVar.f42217t4 = -1;
        }
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar != null && rnVar.Vb != null) {
            ecVar.l();
        }
        rnVar.S6();
        this.f39391t0 = size2;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        rn rnVar = this.F0;
        pg.c.c(rnVar.f42246v8, rnVar.fragmentView);
        rnVar.f42260w8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.F0.B4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        rn rnVar = this.F0;
        rnVar.f42195r9 = i11;
        rnVar.o9();
        rnVar.r9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
