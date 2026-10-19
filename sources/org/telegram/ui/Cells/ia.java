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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.LaunchActivity;
public final class ia implements yl0, zf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, yp, Utilities.Callback2Return {
    public final int f22440a;
    public final Object f22441b;

    public ia(Object obj, int i10) {
        this.f22440a = i10;
        this.f22441b = obj;
    }

    @Override
    public boolean a(int i10, View view) {
        ma maVar = (ma) this.f22441b;
        maVar.getClass();
        maVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f21939b);
        return true;
    }

    @Override
    public void b() {
        switch (this.f22440a) {
            case 4:
                m4 m4Var = (m4) this.f22441b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var = m4Var.f22571a;
                w9Var.setScaleX(progress);
                w9Var.setScaleY(progress);
                m4Var.invalidate();
                return;
            default:
                e7 e7Var = (e7) this.f22441b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = e7Var.f22184a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                e7Var.invalidate();
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f22440a) {
            case 2:
                w0 w0Var = (w0) this.f22441b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new r0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.L1) {
                            messageObject2.wasUnread = false;
                            w0Var.L1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).f33193x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.I1;
                            if (videoSize != null && (t0Var = w0Var.f23694f1) != null) {
                                t0Var.c1(w0Var, w0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f30974a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                s7 s7Var = (s7) this.f22441b;
                ImageReceiver imageReceiver2 = s7Var.d;
                ImageReceiver imageReceiver3 = s7Var.f23024c;
                if (z10 && !z11 && (messageObject = s7Var.f23036n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && s7Var.f23049w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    s7Var.f23020a = dominantColor;
                    CheckBoxBase checkBoxBase = s7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f24154x != (v = org.telegram.ui.ActionBar.h6.v(dominantColor, org.telegram.ui.ActionBar.h6.m1(0.25f, -1)))) {
                        checkBoxBase.f24154x = v;
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
        int i11 = this.f22440a;
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void i(long j10) {
        ((l) this.f22441b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f22440a;
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((gi.c) this.f22441b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        u1 u1Var = (u1) this.f22441b;
        MessageObject messageObject = u1Var.f23565y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = u1Var.F7) != null && j4Var.f22464i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.f23565y7.isVoiceOnce() || u1Var.f23565y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
