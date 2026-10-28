package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class bm implements ViewTreeObserver.OnPreDrawListener {
    public final int f38062a;
    public final Object f38063b;
    public final Object f38064c;

    public bm(int i10, Object obj, Object obj2) {
        this.f38062a = i10;
        this.f38064c = obj;
        this.f38063b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f38062a;
        Object obj = this.f38064c;
        Object obj2 = this.f38063b;
        switch (i10) {
            case 0:
                wn wnVar = ((hm) obj).Q;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = wnVar.f45214n3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                s1Var.getTransitionParams().f24947x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                s1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.r60 cameraContainer = wnVar.f45214n3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = wnVar.f45214n3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(wnVar.f45214n3.getPaint(), org.telegram.ui.Components.v6.f33570b, 0), ObjectAnimator.ofFloat(wnVar.f45214n3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.ds.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.u60 u60Var = wnVar.f45214n3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bi.ce(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((lx) obj).f41273a.f38998e0[0].f38702a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((bi.r3) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr3 = wh.h.f51308d0;
                    ybVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    if (ybVar2.top) {
                        f7 = ybVar2.getTopOffset();
                    } else {
                        f7 = -ybVar2.getBottomOffset();
                    }
                    hVar.f51311a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f35027a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f35027a.getLeft();
                    hVar.Y = (hVar.W.f35027a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f35027a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
