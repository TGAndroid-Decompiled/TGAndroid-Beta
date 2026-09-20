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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.op;
import org.telegram.ui.LaunchActivity;
public final class ma implements ll0, yf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, op, Utilities.Callback2Return {
    public final int f20657a;
    public final Object f20658b;

    public ma(Object obj, int i10) {
        this.f20657a = i10;
        this.f20658b = obj;
    }

    @Override
    public void a() {
        switch (this.f20657a) {
            case 4:
                o4 o4Var = (o4) this.f20658b;
                float progress = 1.0f - (o4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.v9 v9Var = o4Var.f20743a;
                v9Var.setScaleX(progress);
                v9Var.setScaleY(progress);
                o4Var.invalidate();
                return;
            default:
                h7 h7Var = (h7) this.f20658b;
                float progress2 = 1.0f - (h7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.v9 v9Var2 = h7Var.f20397a;
                v9Var2.setScaleX(progress2);
                v9Var2.setScaleY(progress2);
                h7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        qa qaVar = (qa) this.f20658b;
        qaVar.getClass();
        qaVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f19986b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f20657a) {
            case 2:
                w0 w0Var = (w0) this.f20658b;
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
                                ((LaunchActivity) w0Var.getContext()).f31142x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.A1;
                            if (videoSize != null && (t0Var = w0Var.X0) != null) {
                                t0Var.h1(w0Var, w0Var.f21780z1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f24678a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                u7 u7Var = (u7) this.f20658b;
                ImageReceiver imageReceiver2 = u7Var.d;
                ImageReceiver imageReceiver3 = u7Var.f21623c;
                if (z10 && !z11 && (messageObject = u7Var.f21635n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && u7Var.f21648w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    u7Var.f21619a = dominantColor;
                    CheckBoxBase checkBoxBase = u7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f22199x != (v = org.telegram.ui.ActionBar.j6.v(dominantColor, org.telegram.ui.ActionBar.j6.l1(0.25f, -1)))) {
                        checkBoxBase.f22199x = v;
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
        int i11 = this.f20657a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j3) {
        ((l) this.f20658b).b(j3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f20657a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((ei.c) this.f20658b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        u1 u1Var = (u1) this.f20658b;
        MessageObject messageObject = u1Var.f21575y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((l4Var = u1Var.F7) != null && l4Var.f20598i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.f21575y7.isVoiceOnce() || u1Var.f21575y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
