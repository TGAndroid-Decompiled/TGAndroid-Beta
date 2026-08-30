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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wh;
public final class ha implements kl0, lf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, mp, Utilities.Callback2Return {
    public final int f21190a;
    public final Object f21191b;

    public ha(Object obj, int i10) {
        this.f21190a = i10;
        this.f21191b = obj;
    }

    @Override
    public void a() {
        switch (this.f21190a) {
            case 4:
                n4 n4Var = (n4) this.f21191b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var = n4Var.f21430a;
                p9Var.setScaleX(progress);
                p9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                e7 e7Var = (e7) this.f21191b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var2 = e7Var.f21020a;
                p9Var2.setScaleX(progress2);
                p9Var2.setScaleY(progress2);
                e7Var.invalidate();
                return;
        }
    }

    @Override
    public void d(long j10) {
        ((l) this.f21191b).b(j10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f21190a) {
            case 2:
                v0 v0Var = (v0) this.f21191b;
                if (z4 && (lottieAnimation = v0Var.F.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.E0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.A1) {
                            messageObject2.wasUnread = false;
                            v0Var.A1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f31652u0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.f22482x1;
                            if (videoSize != null && (t0Var = v0Var.U0) != null) {
                                t0Var.i1(v0Var, v0Var.f22479w1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.Y < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.L(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                r7 r7Var = (r7) this.f21191b;
                ImageReceiver imageReceiver2 = r7Var.d;
                ImageReceiver imageReceiver3 = r7Var.f21769c;
                if (z4 && !z10 && (messageObject = r7Var.f21781n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z4 && !z10 && r7Var.f21790t0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    r7Var.f21765a = dominantColor;
                    CheckBoxBase checkBoxBase = r7Var.M;
                    if (checkBoxBase != null && checkBoxBase.f22971x != (v = org.telegram.ui.ActionBar.j6.v(dominantColor, org.telegram.ui.ActionBar.j6.l1(0.25f, -1)))) {
                        checkBoxBase.f22971x = v;
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
        int i11 = this.f21190a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f(int i10, View view) {
        la laVar = (la) this.f21191b;
        laVar.getClass();
        laVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f20800b);
        return true;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f21190a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((wh) this.f21191b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        t1 t1Var = (t1) this.f21191b;
        MessageObject messageObject = t1Var.f22273v7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = t1Var.C7) != null && k4Var.f21286i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.f22273v7.isVoiceOnce() || t1Var.f22273v7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
