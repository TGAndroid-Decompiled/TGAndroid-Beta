package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class dq implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final ImageReceiver F;
    public TLRPC.Chat G;
    public TLRPC.TL_forumTopic H;
    public long I;
    public AnimatorSet J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public float S;
    public final View T;
    public long U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public gj Y;
    public long Z;
    public int f35345a;
    public View f35346a0;
    public int f35347b;
    public boolean f35348b0;
    public int f35349c;
    public final org.telegram.ui.Components.ir f35350c0;
    public float d;
    public final int[] f35351d0;
    public final Paint e;
    public final int f35352e0;
    public final TextPaint f35353f;
    public final int f35354f0;
    public final int f35355g0;
    public final TextPaint h;
    public final long f35356h0;
    public final long f35357i0;
    public final org.telegram.ui.ActionBar.c6 f35358j0;
    public org.telegram.ui.Components.s5 f35359k0;
    public final Paint f35360n;
    public final Path f35361r;
    public StaticLayout f35362s;
    public StaticLayout v;
    public StaticLayout f35363w;
    public int f35364x;
    public int f35365y;

    public dq(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f35353f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f35360n = paint2;
        this.f35361r = new Path();
        this.I = 0L;
        this.f35348b0 = true;
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(null, true, null);
        this.f35350c0 = irVar;
        this.f35351d0 = new int[3];
        this.T = view;
        this.f35352e0 = i10;
        this.f35357i0 = j10;
        this.f35354f0 = i11;
        this.f35355g0 = i12;
        this.f35356h0 = j11;
        this.X = MessagesController.getInstance(i10).isForum(j10);
        this.f35358j0 = c6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        irVar.f26075z = 3;
        irVar.I = 1;
        irVar.f26058g = true;
        irVar.d = d("paintChatActionBackground");
        irVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j11;
        int i12;
        int[] iArr2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i11);
            if (dialogFilter != null) {
                dialogs = dialogFilter.dialogs;
            } else {
                return null;
            }
        } else {
            dialogs = messagesController.getDialogs(i10);
        }
        if (dialogs != null) {
            for (int i13 = 0; i13 < dialogs.size(); i13++) {
                TLRPC.Dialog dialog = dialogs.get(i13);
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f19220id));
                if (chat != null && dialog.f19220id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f19220id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f16708id;
                        if (i11 != i15) {
                            long j12 = j10;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j12, i16, i15, false, iArr3);
                            j11 = j12;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j11 = j10;
                            i12 = i10;
                            iArr2 = iArr;
                        }
                        i14++;
                        i10 = i12;
                        j10 = j11;
                        iArr = iArr2;
                    }
                }
                long j13 = j10;
                int i17 = i10;
                int[] iArr4 = iArr;
                for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i18);
                    if (i17 != keyAt && (c10 = c(j13, keyAt, 0, false, iArr4)) != null) {
                        if (iArr4 != null) {
                            iArr4[0] = 1;
                        }
                        return c10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(Canvas canvas, ak akVar, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.Components.ir irVar;
        float f16;
        float f17;
        TextPaint textPaint;
        boolean b12;
        int i13;
        int i14;
        float f18;
        int i15;
        float f19;
        float f20;
        Paint paint;
        float f21;
        float f22;
        boolean b13;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        float f23;
        float f24;
        RectF rectF2;
        float y3;
        int i16;
        boolean b14;
        Canvas canvas2 = canvas;
        if (this.f35346a0 != akVar) {
            this.f35346a0 = akVar;
            org.telegram.ui.Components.s5 s5Var = this.f35359k0;
            if (s5Var != null) {
                s5Var.a(akVar);
            }
        }
        org.telegram.ui.Components.ir irVar2 = this.f35350c0;
        irVar2.H = akVar;
        RectF rectF3 = irVar2.f26057f;
        float dp = AndroidUtilities.dp(110.0f) * f7;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f7 < 0.2f) {
            f11 = 5.0f * f7 * f10;
        } else {
            f11 = f10;
        }
        org.telegram.ui.ActionBar.g6.q(0.0f, akVar.getMeasuredHeight() - dp, this.f35349c, akVar.getMeasuredHeight());
        int i17 = org.telegram.ui.ActionBar.g6.f19995ic;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35358j0;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i17, c6Var);
        TextPaint textPaint3 = this.f35353f;
        textPaint3.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.g6.w0(i17, c6Var);
        Paint paint2 = this.e;
        paint2.setColor(w03);
        this.h.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vd, c6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.g6.f19969h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.g6.f19969h2.setAlpha((int) (alpha2 * f11));
        int i18 = (int) (alpha * f11);
        d("paintChatActionBackground").setAlpha(i18);
        int i19 = (int) (alpha3 * f11);
        textPaint3.setAlpha(i19);
        int i20 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if ((i20 >= 0 && this.Q < 1.0f) || (f7 < 1.0f && this.Q == 1.0f)) {
            i10 = i19;
            i11 = i18;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.P > 100) {
                try {
                    akVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.P = currentTimeMillis;
            }
            this.Q = f7;
        } else {
            i10 = i19;
            i11 = i18;
            rectF = rectF3;
            i12 = alpha2;
        }
        if (i20 == 0 && !this.M) {
            this.M = true;
            this.N = true;
            g(akVar, true);
            this.U = System.currentTimeMillis();
        } else if (i20 != 0 && this.M) {
            this.M = false;
            g(akVar, false);
        }
        float f25 = this.f35349c / 2.0f;
        float f26 = this.L * (-AndroidUtilities.dp(4.0f));
        if (this.R) {
            f12 = dp - f26;
        } else {
            f12 = dp;
        }
        float f27 = f12 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f27 - (AndroidUtilities.dp(16.0f) * f7)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f27 - (AndroidUtilities.dp(8.0f) * f7))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float f28 = this.K;
        float dp2 = (AndroidUtilities.dp(56.0f) * f28) + max2;
        if (f28 >= 1.0f && !this.R) {
            paint = paint2;
            irVar = irVar2;
            f16 = dp2;
            f17 = f11;
            textPaint = textPaint3;
            i13 = i10;
            f18 = f26;
            f13 = 36.0f;
            f19 = f25;
            i15 = alpha;
            i14 = i11;
            f20 = f12;
        } else {
            f13 = 36.0f;
            float f29 = -f12;
            float f30 = f12;
            float dp3 = (this.K * (AndroidUtilities.dp(56.0f) + f29)) + ((1.0f - this.K) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i21 = i11;
            rectF4.set(f25 - max, f29, f25 + max, dp3);
            if (this.K > 0.0f && !this.R) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.K;
                rectF4.inset(dp4, dp4);
                f14 = 1.0f - this.K;
            } else {
                f14 = 1.0f;
            }
            if (this.W) {
                Path path = this.f35361r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f15 = f29;
                float f31 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                irVar = irVar2;
                f16 = dp2;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f32 = -width;
                path.rQuadTo(0.0f, f32, f32, f32);
                float f33 = width * 2.0f;
                float f34 = f31 * 2.0f;
                f17 = f11;
                path.rLineTo((((-(rectF4.width() - f33)) / 2.0f) + f34) - width3, 0.0f);
                float f35 = -f31;
                float f36 = f35 / 2.0f;
                float f37 = f35 * 2.0f;
                textPaint = textPaint3;
                float f38 = (-width2) / 2.0f;
                path.rQuadTo(f36, 0.0f, f37, f38);
                path.rQuadTo(f36, f38, f37, f38);
                path.rLineTo(((-(rectF4.width() - f33)) / 2.0f) + f34 + width3, 0.0f);
                path.rQuadTo(f32, 0.0f, f32, width);
                path.rLineTo(0.0f, (height + width2) - f33);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f33, 0.0f);
                path.rQuadTo(width, 0.0f, width, f32);
                path.rLineTo(0.0f, -(height - f33));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (c6Var != null) {
                    b13 = c6Var.m0();
                } else {
                    b13 = org.telegram.ui.ActionBar.g6.b1();
                }
                if (b13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f19969h2);
                }
            } else {
                f15 = f29;
                irVar = irVar2;
                f16 = dp2;
                f17 = f11;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f14));
                float f39 = this.d;
                canvas2.drawRoundRect(rectF4, f39, f39, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (c6Var != null) {
                    b12 = c6Var.m0();
                } else {
                    b12 = org.telegram.ui.ActionBar.g6.b1();
                }
                if (b12) {
                    int alpha6 = org.telegram.ui.ActionBar.g6.f19969h2.getAlpha();
                    org.telegram.ui.ActionBar.g6.f19969h2.setAlpha((int) (alpha6 * f14));
                    float f40 = this.d;
                    canvas2.drawRoundRect(rectF4, f40, f40, org.telegram.ui.ActionBar.g6.f19969h2);
                    org.telegram.ui.ActionBar.g6.f19969h2.setAlpha(alpha6);
                }
            }
            float y10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f41 = this.K;
            if (f41 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f41) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f25, y10 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f25 - AndroidUtilities.dp2(12.0f), y10 - AndroidUtilities.dp(12.0f));
            i13 = i10;
            i14 = i21;
            f18 = f26;
            i15 = alpha;
            f19 = f25;
            f20 = f30;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.R) {
                float c10 = t8.b.c(f15 - AndroidUtilities.dp(2.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f18);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f7, f7, f19, AndroidUtilities.dp(28.0f) + c10);
                float dp6 = c10 + AndroidUtilities.dp(28.0f);
                if (!this.N) {
                    paint = paint2;
                } else {
                    float f42 = this.O;
                    if (f42 < 1.0f) {
                        float f43 = f42 + 0.07272727f;
                        this.O = f43;
                        if (f43 > 1.0f) {
                            this.O = 1.0f;
                        }
                    }
                    float f44 = this.O;
                    if (f44 > 0.5f) {
                        f21 = 1.0f;
                    } else {
                        f21 = f44 / 0.5f;
                    }
                    if (f44 < 0.5f) {
                        f22 = 0.0f;
                    } else {
                        f22 = (f44 - 0.5f) / 0.5f;
                    }
                    canvas2.save();
                    canvas2.clipRect(rectF4);
                    canvas2.translate(f19 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
                    float dp7 = AndroidUtilities.dp(16.0f);
                    float dp8 = AndroidUtilities.dp(26.0f);
                    float dp9 = AndroidUtilities.dp(22.0f);
                    float dp10 = AndroidUtilities.dp(32.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(20.0f);
                    float f45 = 1.0f - f21;
                    canvas.drawLine(dp7, dp8, (dp9 * f21) + (dp7 * f45), (f21 * dp10) + (f45 * dp8), paint2);
                    if (f22 > 0.0f) {
                        float f46 = 1.0f - f22;
                        float f47 = (dp11 * f22) + (dp9 * f46);
                        float f48 = (dp12 * f22) + (f46 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f47, f48, paint2);
                    } else {
                        canvas2 = canvas;
                    }
                    paint = paint2;
                    canvas2.restore();
                }
                canvas2.restore();
            } else {
                paint = paint2;
            }
            canvas2.restore();
        }
        if (this.f35362s != null && this.K > 0.0f) {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f13) * this.K)) + f18;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f49 = (i16 - this.f35364x) / 2.0f;
            rectF5.set(f49, dp13, this.f35349c - f49, this.f35362s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (c6Var != null) {
                b14 = c6Var.m0();
            } else {
                b14 = org.telegram.ui.ActionBar.g6.b1();
            }
            if (b14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.g6.f19969h2);
            }
            canvas2.save();
            canvas2.translate((this.f35349c - this.f35364x) / 2.0f, dp13);
            this.f35362s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.R && f16 > 0.0f) {
            float c11 = t8.b.c((-f20) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f18);
            org.telegram.ui.Components.s5 s5Var2 = this.f35359k0;
            if (s5Var2 == null || (imageReceiver = s5Var2.f29031k) == null) {
                imageReceiver = this.F;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f17);
            float f50 = f16 / 2.0f;
            imageReceiver2.setRoundRadius((int) f50);
            float f51 = f16;
            imageReceiver2.setImageCoords(f19 - f50, c11, f51, f51);
            if (this.X && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.cr) && (((org.telegram.ui.Components.cr) imageReceiver2.getDrawable()).f24192b instanceof org.telegram.ui.Components.m90)) {
                ((org.telegram.ui.Components.m90) ((org.telegram.ui.Components.cr) imageReceiver2.getDrawable()).f24192b).f27337i = f7;
            }
            if (this.K > 0.0f && this.f35348b0) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f52 = this.K;
                org.telegram.ui.Components.ir irVar3 = irVar;
                irVar3.e(irVar3.f26069s);
                canvas2.scale(f52, f52, (irVar3.f26069s / 2.0f) + irVar3.A + AndroidUtilities.dp(12.0f) + f19, (c11 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, c11 - AndroidUtilities.dp(6.0f));
                float f53 = irVar3.C;
                float f54 = irVar3.f26062l;
                if (f54 != 1.0f) {
                    int i22 = irVar3.f26056c;
                    f23 = 6.0f;
                    if (i22 == 0 || i22 == 1) {
                        f24 = 14.0f;
                        rectF2 = rectF;
                        irVar3.e(irVar3.f26069s);
                        float dp14 = (irVar3.f26073x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        float f55 = irVar3.B;
                        rectF2.set(f55, dp14, irVar3.f26069s + f55 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f56 = f54 * 2.0f;
                        if (f56 > 1.0f) {
                            f56 = 1.0f;
                        }
                        float dp15 = (irVar3.f26073x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        int i23 = irVar3.f26069s;
                        int i24 = irVar3.f26068r;
                        if (i23 == i24) {
                            y3 = i23;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f56, i24, i23 * f56);
                        }
                        irVar3.e(y3);
                        float f57 = irVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f57, dp15, y3 + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    f23 = 6.0f;
                    f24 = 14.0f;
                    rectF2 = rectF;
                    irVar3.e(irVar3.f26069s);
                    float dp16 = (irVar3.f26073x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                    float f58 = irVar3.B;
                    rectF2.set(f58, dp16, irVar3.f26069s + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f35360n);
                canvas2.restore();
                canvas2.save();
                float f59 = this.K;
                irVar3.e(irVar3.f26069s);
                canvas2.scale(f59, f59, (irVar3.f26069s / 2.0f) + irVar3.A + AndroidUtilities.dp(12.0f) + f19, (c11 - AndroidUtilities.dp(f23)) + AndroidUtilities.dp(f24));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, c11 - AndroidUtilities.dp(f23));
                irVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.g6.f19969h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xk, this.f35358j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.v != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f35349c - this.f35365y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f35363w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f35363w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f35349c - this.E) / 2.0f, dp);
                this.f35363w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35358j0;
        if (c6Var != null) {
            paint = c6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f35352e0).dialogs_dict.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f35350c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f35348b0 = z10;
            View view = this.f35346a0;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final boolean e() {
        if (this.S > 0.0f && !this.R) {
            return true;
        }
        return false;
    }

    public final void f() {
        View view;
        this.F.onAttachedToWindow();
        org.telegram.ui.Components.s5 s5Var = this.f35359k0;
        if (s5Var != null && (view = this.f35346a0) != null) {
            s5Var.a(view);
        }
        NotificationCenter.getInstance(this.f35352e0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dq f34608b;

                {
                    this.f34608b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            dq dqVar = this.f34608b;
                            dqVar.getClass();
                            dqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            dqVar.T.invalidate();
                            return;
                        case 1:
                            dq dqVar2 = this.f34608b;
                            dqVar2.getClass();
                            dqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            dq dqVar3 = this.f34608b;
                            dqVar3.getClass();
                            dqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            dq dqVar4 = this.f34608b;
                            dqVar4.getClass();
                            dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            dq dqVar5 = this.f34608b;
                            dqVar5.getClass();
                            dqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dq f34608b;

                {
                    this.f34608b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            dq dqVar = this.f34608b;
                            dqVar.getClass();
                            dqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            dqVar.T.invalidate();
                            return;
                        case 1:
                            dq dqVar2 = this.f34608b;
                            dqVar2.getClass();
                            dqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            dq dqVar3 = this.f34608b;
                            dqVar3.getClass();
                            dqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            dq dqVar4 = this.f34608b;
                            dqVar4.getClass();
                            dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            dq dqVar5 = this.f34608b;
                            dqVar5.getClass();
                            dqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24774j;
            ofFloat2.setInterpolator(esVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dq f34608b;

                {
                    this.f34608b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            dq dqVar = this.f34608b;
                            dqVar.getClass();
                            dqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            dqVar.T.invalidate();
                            return;
                        case 1:
                            dq dqVar2 = this.f34608b;
                            dqVar2.getClass();
                            dqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            dq dqVar3 = this.f34608b;
                            dqVar3.getClass();
                            dqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            dq dqVar4 = this.f34608b;
                            dqVar4.getClass();
                            dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            dq dqVar5 = this.f34608b;
                            dqVar5.getClass();
                            dqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(esVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dq f34608b;

                {
                    this.f34608b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            dq dqVar = this.f34608b;
                            dqVar.getClass();
                            dqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            dqVar.T.invalidate();
                            return;
                        case 1:
                            dq dqVar2 = this.f34608b;
                            dqVar2.getClass();
                            dqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            dq dqVar3 = this.f34608b;
                            dqVar3.getClass();
                            dqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            dq dqVar4 = this.f34608b;
                            dqVar4.getClass();
                            dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            dq dqVar5 = this.f34608b;
                            dqVar5.getClass();
                            dqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(esVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new bi.t(15, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final dq f34608b;

            {
                this.f34608b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        dq dqVar = this.f34608b;
                        dqVar.getClass();
                        dqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        dqVar.T.invalidate();
                        return;
                    case 1:
                        dq dqVar2 = this.f34608b;
                        dqVar2.getClass();
                        dqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        dq dqVar3 = this.f34608b;
                        dqVar3.getClass();
                        dqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        dq dqVar4 = this.f34608b;
                        dqVar4.getClass();
                        dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        dq dqVar5 = this.f34608b;
                        dqVar5.getClass();
                        dqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        dqVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.es.f24771f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.J = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.J.start();
    }

    public final void h() {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.f35357i0, this.f35354f0, this.f35355g0, true, this.f35351d0);
        if (c10 != null) {
            this.Z = c10.f19220id;
            int[] iArr = this.f35351d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f35345a = iArr[1];
            this.f35347b = iArr[2];
            this.R = false;
            int i10 = this.f35352e0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.f19220id));
            this.G = chat;
            if (chat == null) {
                this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.f19220id));
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.k(i10, this.G);
            this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", k9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c10.f19220id, 0, null);
            int i11 = c10.unread_count;
            this.f35350c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f35348b0 = z11;
            return;
        }
        this.G = null;
        this.W = false;
        this.R = true;
    }

    public final void i(TLRPC.Chat chat) {
        boolean z10;
        int i10;
        if (chat == null) {
            h();
            return;
        }
        this.Z = -chat.f19216id;
        int[] iArr = this.f35351d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f35345a = iArr[1];
        this.f35347b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat2 = this.G;
        int i11 = this.f35352e0;
        k9Var.k(i11, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", k9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f19216id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f19216id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.f35350c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f35348b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.s5 s5Var;
        View view;
        View view2;
        org.telegram.ui.Components.s5 s5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        int i10 = this.f35352e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f35357i0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f19268id != this.f35356h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f19268id;
            org.telegram.ui.ActionBar.c6 c6Var = this.f35358j0;
            if (i12 == 1) {
                View view3 = this.f35346a0;
                if (view3 != null && (s5Var2 = this.f35359k0) != null) {
                    s5Var2.o(view3);
                }
                this.f35359k0 = null;
                imageReceiver.setImageBitmap(og.d.c(this.T.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ac, c6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.s5 s5Var3 = this.f35359k0;
                if (s5Var3 == null || s5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.s5 s5Var4 = this.f35359k0;
                    if (s5Var4 != null && (view = this.f35346a0) != null) {
                        s5Var4.o(view);
                    }
                    org.telegram.ui.Components.s5 s5Var5 = new org.telegram.ui.Components.s5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f35359k0 = s5Var5;
                    s5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19995ic, c6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.s5 s5Var6 = this.f35359k0;
                if (s5Var6 != null && (view2 = this.f35346a0) != null) {
                    s5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.f35346a0;
                if (view4 != null && (s5Var = this.f35359k0) != null) {
                    s5Var.o(view4);
                }
                this.f35359k0 = null;
                imageReceiver.setImageBitmap(og.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f35350c0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f35348b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
