package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ac0;
import org.telegram.ui.l71;
public final class l1 extends AnimatorListenerAdapter {
    public final int f18415a;
    public final Object f18416b;
    public final Object f18417c;
    public final Object d;

    public l1(Object obj, Object obj2, Object obj3, int i10) {
        this.f18415a = i10;
        this.d = obj;
        this.f18416b = obj2;
        this.f18417c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18415a) {
            case 4:
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    rzVar.M0 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18415a) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f17526x.remove((AnimatorSet) this.f18416b);
                View view = (View) this.f18417c;
                if (view instanceof g1) {
                    kj0 kj0Var = ((g1) view).f17725c;
                    if (kj0Var.getAnimatedDrawable() != null) {
                        kj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f18416b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.f20844e1);
                    viewGroup.addView(chatActivityEnterView.f20844e1, (ViewGroup.LayoutParams) this.f18417c);
                }
                chatActivityEnterView.f20844e1.setAlpha(1.0f);
                chatActivityEnterView.f20863h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f20893n = 0.0f;
                chatActivityEnterView.F1();
                di.f0 f0Var = chatActivityEnterView.f20885l0;
                if (f0Var != null) {
                    f0Var.setAlpha(0.0f);
                    chatActivityEnterView.f20885l0.setScaleX(0.0f);
                    chatActivityEnterView.f20885l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
                    return;
                }
                return;
            case 2:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f18417c).setVisibility(4);
                ((ImageView) this.f18416b).sendAccessibilityEvent(8);
                return;
            case 3:
                if (((com.google.firebase.messaging.m) this.d).f6100a) {
                    ((View) this.f18417c).postDelayed((l9) this.f18416b, 300L);
                    return;
                }
                return;
            case 4:
                vl0 vl0Var = (vl0) this.f18417c;
                s4.s sVar = (s4.s) this.f18416b;
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    int L0 = sVar.L0();
                    vl0Var.setTranslationY(0.0f);
                    if (vl0Var == rzVar.D0) {
                        vl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + rzVar.f26848q2);
                    } else if (vl0Var == rzVar.f26820h0) {
                        vl0Var.setPadding(0, rzVar.f26801b1, 0, AndroidUtilities.dp(44.0f) + rzVar.f26848q2);
                    } else if (vl0Var == rzVar.P) {
                        vl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + rzVar.f26848q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    rzVar.M0 = null;
                    return;
                }
                return;
            case 5:
                f60 f60Var = (f60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr = (boolean[]) this.f18416b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((n50) this.f18417c).run();
                }
                f60Var.f22876b.setRotationY(0.0f);
                f60Var.m0.setRotationY(0.0f);
                f60Var.E0 = false;
                f60Var.invalidate();
                return;
            case 6:
                u70 u70Var = (u70) this.f18416b;
                u70Var.setProgress(0.0f);
                u70Var.invalidate();
                AndroidUtilities.removeFromParent(u70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f18417c).getViewTreeObserver();
                w70 w70Var = (w70) this.d;
                View view2 = w70Var.f28678f;
                viewTreeObserver.removeOnPreDrawListener(w70Var.f28706y);
                if (w70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof wh.h1) {
                        wh.h1 h1Var = (wh.h1) view2;
                        FrameLayout frameLayout = h1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(h1Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                l71 l71Var = (l71) this.d;
                l71Var.f34591r1 = null;
                l71Var.invalidate();
                boolean[] zArr2 = (boolean[]) this.f18416b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((ac0) this.f18417c).run();
                    return;
                }
                return;
            default:
                zh.o5 o5Var = (zh.o5) this.f18417c;
                zh.g2 g2Var = (zh.g2) this.d;
                zh.a3 a3Var = g2Var.f48429a;
                a3Var.f48216u3 = false;
                a3Var.f48219v3 = 1.0f;
                a3Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f18416b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    zh.a3 a3Var2 = g2Var.f48429a;
                    a3Var2.f48204q3 = true;
                    try {
                        a3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                o5Var.setAllowDrawReaction(true);
                o5Var.f48749r = true;
                ImageReceiver imageReceiver = o5Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                zh.a3 a3Var3 = g2Var.f48429a;
                org.telegram.ui.Components.p5 p5Var = a3Var3.f48198o3;
                if (p5Var != null) {
                    p5Var.o(a3Var3);
                    g2Var.f48429a.f48198o3 = null;
                    return;
                }
                return;
        }
    }

    public l1(com.google.firebase.messaging.m mVar, View view) {
        this.f18415a = 3;
        this.d = mVar;
        this.f18417c = view;
        this.f18416b = new l9(this, 8);
    }

    public l1(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.f18415a = 2;
        this.d = chatAttachAlertPhotoLayout;
        this.f18417c = view;
        this.f18416b = imageView;
    }
}
