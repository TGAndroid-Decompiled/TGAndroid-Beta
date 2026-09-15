package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
public final class ma implements bl0, yf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, op, Utilities.Callback2Return {
    public final int f20445a;
    public final Object f20446b;

    public ma(Object obj, int i10) {
        this.f20445a = i10;
        this.f20446b = obj;
    }

    @Override
    public void a() {
        switch (this.f20445a) {
            case 4:
                m4 m4Var = (m4) this.f20446b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.u9 u9Var = m4Var.f20420a;
                u9Var.setScaleX(progress);
                u9Var.setScaleY(progress);
                m4Var.invalidate();
                return;
            default:
                f7 f7Var = (f7) this.f20446b;
                float progress2 = 1.0f - (f7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.u9 u9Var2 = f7Var.f20090a;
                u9Var2.setScaleX(progress2);
                u9Var2.setScaleY(progress2);
                f7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        qa qaVar = (qa) this.f20446b;
        qaVar.getClass();
        qaVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f19767b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f20445a) {
            case 2:
                w0 w0Var = (w0) this.f20446b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.H0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.D1) {
                            messageObject2.wasUnread = false;
                            w0Var.D1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).f30858x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.A1;
                            if (videoSize != null && (t0Var = w0Var.X0) != null) {
                                t0Var.g1(w0Var, w0Var.f21563z1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f29948b0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var = (t7) this.f20446b;
                ImageReceiver imageReceiver2 = t7Var.d;
                ImageReceiver imageReceiver3 = t7Var.f21375c;
                if (z10 && !z11 && (messageObject = t7Var.f21387n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && t7Var.f21400w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    t7Var.f21371a = dominantColor;
                    CheckBoxBase checkBoxBase = t7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f21978x != (v = org.telegram.ui.ActionBar.i6.v(dominantColor, org.telegram.ui.ActionBar.i6.l1(0.25f, -1)))) {
                        checkBoxBase.f21978x = v;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f20445a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j3) {
        ((l) this.f20446b).b(j3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f20445a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((ei.c) this.f20446b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        t1 t1Var = (t1) this.f20446b;
        MessageObject messageObject = t1Var.f21322y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = t1Var.F7) != null && j4Var.f20303i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.f21322y7.isVoiceOnce() || t1Var.f21322y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
