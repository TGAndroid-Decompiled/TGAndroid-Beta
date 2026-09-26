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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.LaunchActivity;
public final class la implements nl0, yf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, qp, Utilities.Callback2Return {
    public final int f20617a;
    public final Object f20618b;

    public la(Object obj, int i10) {
        this.f20617a = i10;
        this.f20618b = obj;
    }

    @Override
    public void a() {
        switch (this.f20617a) {
            case 4:
                n4 n4Var = (n4) this.f20618b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var = n4Var.f20686a;
                w9Var.setScaleX(progress);
                w9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                g7 g7Var = (g7) this.f20618b;
                float progress2 = 1.0f - (g7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = g7Var.f20354a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                g7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        pa paVar = (pa) this.f20618b;
        paVar.getClass();
        paVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f19990b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        jj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f20617a) {
            case 2:
                w0 w0Var = (w0) this.f20618b;
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
                                ((LaunchActivity) w0Var.getContext()).f31143x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.A1;
                            if (videoSize != null && (t0Var = w0Var.X0) != null) {
                                t0Var.g1(w0Var, w0Var.f21783z1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f25422a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var = (t7) this.f20618b;
                ImageReceiver imageReceiver2 = t7Var.d;
                ImageReceiver imageReceiver3 = t7Var.f21214c;
                if (z10 && !z11 && (messageObject = t7Var.f21226n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && t7Var.f21239w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    t7Var.f21210a = dominantColor;
                    CheckBoxBase checkBoxBase = t7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f22200x != (v = org.telegram.ui.ActionBar.h6.v(dominantColor, org.telegram.ui.ActionBar.h6.l1(0.25f, -1)))) {
                        checkBoxBase.f22200x = v;
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
        int i11 = this.f20617a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j3) {
        ((l) this.f20618b).b(j3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f20617a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((ei.c) this.f20618b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        u1 u1Var = (u1) this.f20618b;
        MessageObject messageObject = u1Var.f21607y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = u1Var.F7) != null && k4Var.f20563i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.f21607y7.isVoiceOnce() || u1Var.f21607y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
