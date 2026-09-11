package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ui1;
import org.telegram.ui.yh1;
public final class pk0 extends AnimatorListenerAdapter {
    public final int f29412a;
    public final Object f29413b;
    public final Object f29414c;

    public pk0(int i10, Object obj, Object obj2) {
        this.f29412a = i10;
        this.f29414c = obj;
        this.f29413b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29412a) {
            case 11:
                ((ProfileActivity) this.f29414c).C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.f29414c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f29413b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, g31Var.f36541e[0], iArr[0]), i0.a.d(floatValue, g31Var.f36541e[1], iArr[1]), i0.a.d(floatValue, g31Var.f36541e[2], iArr[2]), i0.a.d(floatValue, g31Var.f36541e[3], iArr[3])}, 0, g31Var.f36541e, 0, 4);
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
        boolean z10;
        int i10 = this.f29412a;
        Object obj = this.f29413b;
        Object obj2 = this.f29414c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.cr crVar = (org.telegram.ui.cr) obj2;
                ((qk0) crVar.d).f29758g.remove((AnimatorSet) obj);
                if (((qk0) crVar.d).f29758g.isEmpty()) {
                    ((qk0) crVar.d).f29754b.clear();
                    qk0 qk0Var = (qk0) crVar.d;
                    qk0Var.d = true;
                    qk0Var.f29753a.invalidate();
                    return;
                }
                return;
            case 1:
                vo0 vo0Var = (vo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(vo0Var.B);
                } catch (Exception unused) {
                }
                jn0 jn0Var = vo0Var.C;
                if (jn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jn0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                ov0 ov0Var = (ov0) gVar.f862c;
                ov0Var.f29207f0 = 1.0f;
                ov0Var.S.add((kv0) obj);
                ((ov0) gVar.f862c).f29198a0.setShader(null);
                ((ov0) gVar.f862c).f29202c0.setShader(null);
                ((ov0) gVar.f862c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.f25107b = 0.0f;
                cx0Var.invalidate();
                ((im0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) obj2;
                i3Var.d.setText((String) obj);
                i3Var.d.setTranslationY(0.0f);
                i3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.i3) obj2).removeView((org.telegram.ui.Components.voip.h3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.uy) obj2).R3 = null;
                return;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((m30) obj);
                k80Var.f37956e = null;
                k80Var.f37953a = null;
                k80Var.f37954b = false;
                return;
            case 8:
                tv0 tv0Var = (tv0) obj2;
                tv0Var.setVisibility(8);
                tv0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ue0 ue0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ue0Var.f30871e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ue0Var.f30872f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ue0Var.f30875s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ue0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ue0Var.h = true;
                ue0Var.f30873n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ue0Var.f30875s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ue0Var, ue0Var.E, 0.0f, 1.0f));
                ue0Var.f30875s.setDuration(250L);
                ue0Var.f30875s.setInterpolator(new OvershootInterpolator(1.01f));
                ue0Var.f30875s.addListener(new se0(ue0Var, 0));
                ue0Var.f30875s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33738z2, photoViewer.f33543d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(pr.f29467g);
                photoViewer.A2.addListener(new org.telegram.ui.gk0(this, 4));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f37864n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != jx0Var.f37862e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.C5 != null) {
                    if (profileActivity.F5) {
                        if (profileActivity.L0) {
                            profileActivity.Q0.setVisibility(8);
                        }
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        profileActivity.T0.setVisibility(8);
                    } else {
                        org.telegram.ui.m01 m01Var = profileActivity.O;
                        if (m01Var.s0(m01Var.f32702k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f32716r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33927j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.gk0(this, 16));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, g31Var.f36541e, 0, 4);
                }
                g31Var.f36543n = null;
                g31Var.f36545s = null;
                dc0 dc0Var = g31Var.h;
                dc0Var.K = 1.0f;
                dc0Var.i();
                g31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) obj2;
                if (o41Var.h != null) {
                    o41Var.h = null;
                    o41Var.f39105n.unlock();
                    ((org.telegram.ui.vx) obj).onTransitionAnimationEnd(true, false);
                    o41Var.f39103e = 1.0f;
                    o41Var.g();
                    o41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.cv0 cv0Var = (org.telegram.ui.cv0) obj;
                if (cv0Var != null) {
                    cv0Var.f35540a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34098s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.f01(this, 11));
                return;
            case 15:
                ((org.telegram.ui.z61) obj).run();
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) obj2;
                org.telegram.ui.y51 y51Var = j71Var.X0;
                if (y51Var != null) {
                    y51Var.dismiss();
                    j71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                yh1 yh1Var = (yh1) obj2;
                yh1Var.removeView((m30) obj);
                yh1Var.f43152e = null;
                yh1Var.f43149a = null;
                yh1Var.f43150b = false;
                UsersSelectActivity usersSelectActivity = yh1Var.f43153f;
                usersSelectActivity.f34239c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34239c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ui1 ui1Var = (ui1) obj2;
                ui1Var.f41119e0.setScaleX(1.15f);
                ui1Var.f41119e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ui1Var.f41119e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ui1Var.f41119e0.setVisibility(8);
                return;
            case 18:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f44738a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 19:
                rg.c2 c2Var = (rg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.f45145r0.b(c2Var.f45152y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.f45153z0 = 1.0f;
                return;
            case 20:
                ((sg.a1) obj2).f46018w = false;
                ((sg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                sg.o1 o1Var = (sg.o1) obj2;
                o1Var.H0 = false;
                o1Var.G0 = 1.0f;
                o1Var.f46211s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new zh.o8(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                di.ea eaVar = (di.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f7175b = null;
                eaVar.f7176c = false;
                ((yg.i) eaVar.f7179n).f50180b.setAllowDrawCursor(true);
                return;
            default:
                zh.q8 q8Var = (zh.q8) obj2;
                q8Var.f52486b.remove((zh.p8) obj);
                q8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29412a) {
            case 8:
                ((tv0) this.f29413b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pk0(Object obj, View view, int i10) {
        this.f29412a = i10;
        this.f29413b = obj;
        this.f29414c = view;
    }
}
