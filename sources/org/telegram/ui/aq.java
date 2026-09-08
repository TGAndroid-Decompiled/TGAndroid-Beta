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
public final class aq implements NotificationCenter.NotificationCenterDelegate {
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
    public dj Y;
    public long Z;
    public int f34531a;
    public View f34532a0;
    public int f34533b;
    public boolean f34534b0;
    public int f34535c;
    public final org.telegram.ui.Components.uq f34536c0;
    public float d;
    public final int[] f34537d0;
    public final Paint f34538e;
    public final int f34539e0;
    public final TextPaint f34540f;
    public final int f34541f0;
    public final int f34542g0;
    public final TextPaint h;
    public final long f34543h0;
    public final long f34544i0;
    public final org.telegram.ui.ActionBar.f6 f34545j0;
    public org.telegram.ui.Components.q5 f34546k0;
    public final Paint f34547n;
    public final Path f34548r;
    public StaticLayout f34549s;
    public StaticLayout v;
    public StaticLayout f34550w;
    public int f34551x;
    public int f34552y;

    public aq(int i10, View view, long j3, int i11, int i12, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f34538e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f34540f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f34547n = paint2;
        this.f34548r = new Path();
        this.I = 0L;
        this.f34534b0 = true;
        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(null, true, null);
        this.f34536c0 = uqVar;
        this.f34537d0 = new int[3];
        this.T = view;
        this.f34539e0 = i10;
        this.f34544i0 = j3;
        this.f34541f0 = i11;
        this.f34542g0 = i12;
        this.f34543h0 = j10;
        this.X = MessagesController.getInstance(i10).isForum(j3);
        this.f34545j0 = f6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        uqVar.f30984z = 3;
        uqVar.I = 1;
        uqVar.f30967g = true;
        uqVar.d = d("paintChatActionBackground");
        uqVar.f30965e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j10;
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
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f19900id));
                if (chat != null && dialog.f19900id != j3 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f19900id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f17107id;
                        if (i11 != i15) {
                            long j11 = j3;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j11, i16, i15, false, iArr3);
                            j10 = j11;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j10 = j3;
                            i12 = i10;
                            iArr2 = iArr;
                        }
                        i14++;
                        i10 = i12;
                        j3 = j10;
                        iArr = iArr2;
                    }
                }
                long j12 = j3;
                int i17 = i10;
                int[] iArr4 = iArr;
                for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i18);
                    if (i17 != keyAt && (c10 = c(j12, keyAt, 0, false, iArr4)) != null) {
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

    public final void a(Canvas canvas, uj ujVar, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.Components.uq uqVar;
        float f16;
        float f17;
        TextPaint textPaint;
        boolean a12;
        float f18;
        int i13;
        float f19;
        float f20;
        int i14;
        int i15;
        Paint paint;
        float f21;
        float f22;
        boolean a13;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f23;
        float f24;
        float z10;
        int i16;
        boolean a14;
        Canvas canvas2 = canvas;
        if (this.f34532a0 != ujVar) {
            this.f34532a0 = ujVar;
            org.telegram.ui.Components.q5 q5Var = this.f34546k0;
            if (q5Var != null) {
                q5Var.a(ujVar);
            }
        }
        org.telegram.ui.Components.uq uqVar2 = this.f34536c0;
        uqVar2.H = ujVar;
        RectF rectF3 = uqVar2.f30966f;
        float dp = AndroidUtilities.dp(110.0f) * f7;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f7 < 0.2f) {
            f11 = 5.0f * f7 * f10;
        } else {
            f11 = f10;
        }
        org.telegram.ui.ActionBar.j6.q(0.0f, ujVar.getMeasuredHeight() - dp, this.f34535c, ujVar.getMeasuredHeight());
        int i17 = org.telegram.ui.ActionBar.j6.f20786ic;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34545j0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        TextPaint textPaint3 = this.f34540f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        Paint paint2 = this.f34538e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, f6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.j6.f20758h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.j6.f20758h2.setAlpha((int) (alpha2 * f11));
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
                    ujVar.performHapticFeedback(3, 2);
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
            g(ujVar, true);
            this.U = System.currentTimeMillis();
        } else if (i20 != 0 && this.M) {
            this.M = false;
            g(ujVar, false);
        }
        float f25 = this.f34535c / 2.0f;
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
            uqVar = uqVar2;
            f16 = dp2;
            f17 = f11;
            textPaint = textPaint3;
            i13 = i10;
            f19 = f26;
            f13 = 36.0f;
            f18 = f25;
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
                Path path = this.f34548r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f15 = f29;
                float f31 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                uqVar = uqVar2;
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
                if (f6Var != null) {
                    a13 = f6Var.o0();
                } else {
                    a13 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.f20758h2);
                }
            } else {
                f15 = f29;
                uqVar = uqVar2;
                f16 = dp2;
                f17 = f11;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f14));
                float f39 = this.d;
                canvas2.drawRoundRect(rectF4, f39, f39, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (f6Var != null) {
                    a12 = f6Var.o0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.f20758h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20758h2.setAlpha((int) (alpha6 * f14));
                    float f40 = this.d;
                    canvas2.drawRoundRect(rectF4, f40, f40, org.telegram.ui.ActionBar.j6.f20758h2);
                    org.telegram.ui.ActionBar.j6.f20758h2.setAlpha(alpha6);
                }
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f7, AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f41 = this.K;
            if (f41 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f41) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f25, z11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f25 - AndroidUtilities.dp2(12.0f), z11 - AndroidUtilities.dp(12.0f));
            f18 = f25;
            i13 = i10;
            f19 = f26;
            f20 = f30;
            i14 = i21;
            i15 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.R) {
                float a2 = org.telegram.ui.Cells.p6.a(f15 - AndroidUtilities.dp(2.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f19);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f7, f7, f18, AndroidUtilities.dp(28.0f) + a2);
                float dp6 = a2 + AndroidUtilities.dp(28.0f);
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
                    canvas2.translate(f18 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
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
        if (this.f34549s != null && this.K > 0.0f) {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f13) * this.K)) + f19;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f49 = (i16 - this.f34551x) / 2.0f;
            rectF5.set(f49, dp13, this.f34535c - f49, this.f34549s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (f6Var != null) {
                a14 = f6Var.o0();
            } else {
                a14 = org.telegram.ui.ActionBar.j6.a1();
            }
            if (a14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.j6.f20758h2);
            }
            canvas2.save();
            canvas2.translate((this.f34535c - this.f34551x) / 2.0f, dp13);
            this.f34549s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.R && f16 > 0.0f) {
            float a10 = org.telegram.ui.Cells.p6.a((-f20) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f19);
            org.telegram.ui.Components.q5 q5Var2 = this.f34546k0;
            if (q5Var2 == null || (imageReceiver = q5Var2.f29611k) == null) {
                imageReceiver = this.F;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f17);
            float f50 = f16 / 2.0f;
            imageReceiver2.setRoundRadius((int) f50);
            float f51 = f16;
            imageReceiver2.setImageCoords(f18 - f50, a10, f51, f51);
            if (this.X && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.oq) && (((org.telegram.ui.Components.oq) imageReceiver2.getDrawable()).f29187b instanceof org.telegram.ui.Components.l80)) {
                ((org.telegram.ui.Components.l80) ((org.telegram.ui.Components.oq) imageReceiver2.getDrawable()).f29187b).f28140i = f7;
            }
            if (this.K > 0.0f && this.f34534b0) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f52 = this.K;
                org.telegram.ui.Components.uq uqVar3 = uqVar;
                uqVar3.e(uqVar3.f30978s);
                canvas2.scale(f52, f52, (uqVar3.f30978s / 2.0f) + uqVar3.A + AndroidUtilities.dp(12.0f) + f18, (a10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, a10 - AndroidUtilities.dp(6.0f));
                float f53 = uqVar3.C;
                float f54 = uqVar3.f30971l;
                if (f54 != 1.0f) {
                    f23 = 6.0f;
                    int i22 = uqVar3.f30964c;
                    if (i22 == 0 || i22 == 1) {
                        rectF2 = rectF;
                        f24 = 14.0f;
                        uqVar3.e(uqVar3.f30978s);
                        float dp14 = (uqVar3.f30982x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        float f55 = uqVar3.B;
                        rectF2.set(f55, dp14, uqVar3.f30978s + f55 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f56 = f54 * 2.0f;
                        if (f56 > 1.0f) {
                            f56 = 1.0f;
                        }
                        float dp15 = (uqVar3.f30982x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        int i23 = uqVar3.f30978s;
                        int i24 = uqVar3.f30977r;
                        if (i23 == i24) {
                            z10 = i23;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f56, i24, i23 * f56);
                        }
                        uqVar3.e(z10);
                        float f57 = uqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f57, dp15, z10 + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f23 = 6.0f;
                    f24 = 14.0f;
                    uqVar3.e(uqVar3.f30978s);
                    float dp16 = (uqVar3.f30982x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                    float f58 = uqVar3.B;
                    rectF2.set(f58, dp16, uqVar3.f30978s + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f34547n);
                canvas2.restore();
                canvas2.save();
                float f59 = this.K;
                uqVar3.e(uqVar3.f30978s);
                canvas2.scale(f59, f59, (uqVar3.f30978s / 2.0f) + uqVar3.A + AndroidUtilities.dp(12.0f) + f18, (a10 - AndroidUtilities.dp(f23)) + AndroidUtilities.dp(f24));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, a10 - AndroidUtilities.dp(f23));
                uqVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.j6.f20758h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xk, this.f34545j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
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
                canvas.translate((this.f34535c - this.f34552y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f34550w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f34550w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f34535c - this.E) / 2.0f, dp);
                this.f34550w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34545j0;
        if (f6Var != null) {
            paint = f6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f34539e0).dialogs_dict.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f34536c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f34534b0 = z10;
            View view = this.f34532a0;
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
        org.telegram.ui.Components.q5 q5Var = this.f34546k0;
        if (q5Var != null && (view = this.f34532a0) != null) {
            q5Var.a(view);
        }
        NotificationCenter.getInstance(this.f34539e0).addObserver(this, NotificationCenter.updateInterfaces);
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
                public final aq f43204b;

                {
                    this.f43204b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            aq aqVar = this.f43204b;
                            aqVar.getClass();
                            aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            aqVar.T.invalidate();
                            return;
                        case 1:
                            aq aqVar2 = this.f43204b;
                            aqVar2.getClass();
                            aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            aq aqVar3 = this.f43204b;
                            aqVar3.getClass();
                            aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            aq aqVar4 = this.f43204b;
                            aqVar4.getClass();
                            aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            aq aqVar5 = this.f43204b;
                            aqVar5.getClass();
                            aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            aqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final aq f43204b;

                {
                    this.f43204b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            aq aqVar = this.f43204b;
                            aqVar.getClass();
                            aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            aqVar.T.invalidate();
                            return;
                        case 1:
                            aq aqVar2 = this.f43204b;
                            aqVar2.getClass();
                            aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            aq aqVar3 = this.f43204b;
                            aqVar3.getClass();
                            aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            aq aqVar4 = this.f43204b;
                            aqVar4.getClass();
                            aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            aq aqVar5 = this.f43204b;
                            aqVar5.getClass();
                            aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            aqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29496j;
            ofFloat2.setInterpolator(prVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final aq f43204b;

                {
                    this.f43204b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            aq aqVar = this.f43204b;
                            aqVar.getClass();
                            aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            aqVar.T.invalidate();
                            return;
                        case 1:
                            aq aqVar2 = this.f43204b;
                            aqVar2.getClass();
                            aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            aq aqVar3 = this.f43204b;
                            aqVar3.getClass();
                            aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            aq aqVar4 = this.f43204b;
                            aqVar4.getClass();
                            aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            aq aqVar5 = this.f43204b;
                            aqVar5.getClass();
                            aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            aqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(prVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final aq f43204b;

                {
                    this.f43204b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            aq aqVar = this.f43204b;
                            aqVar.getClass();
                            aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            aqVar.T.invalidate();
                            return;
                        case 1:
                            aq aqVar2 = this.f43204b;
                            aqVar2.getClass();
                            aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            aq aqVar3 = this.f43204b;
                            aqVar3.getClass();
                            aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            aq aqVar4 = this.f43204b;
                            aqVar4.getClass();
                            aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            aq aqVar5 = this.f43204b;
                            aqVar5.getClass();
                            aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            aqVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(prVar);
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
            public final aq f43204b;

            {
                this.f43204b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        aq aqVar = this.f43204b;
                        aqVar.getClass();
                        aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        aqVar.T.invalidate();
                        return;
                    case 1:
                        aq aqVar2 = this.f43204b;
                        aqVar2.getClass();
                        aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        aq aqVar3 = this.f43204b;
                        aqVar3.getClass();
                        aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        aq aqVar4 = this.f43204b;
                        aqVar4.getClass();
                        aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        aq aqVar5 = this.f43204b;
                        aqVar5.getClass();
                        aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aqVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.pr.f29493f);
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
        TLRPC.Dialog c10 = c(this.f34544i0, this.f34541f0, this.f34542g0, true, this.f34537d0);
        if (c10 != null) {
            this.Z = c10.f19900id;
            int[] iArr = this.f34537d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f34531a = iArr[1];
            this.f34533b = iArr[2];
            this.R = false;
            int i10 = this.f34539e0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.f19900id));
            this.G = chat;
            if (chat == null) {
                this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.f19900id));
            }
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            i9Var.k(i10, this.G);
            this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", i9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c10.f19900id, 0, null);
            int i11 = c10.unread_count;
            this.f34536c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f34534b0 = z11;
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
        this.Z = -chat.f19896id;
        int[] iArr = this.f34537d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f34531a = iArr[1];
        this.f34533b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat2 = this.G;
        int i11 = this.f34539e0;
        i9Var.k(i11, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", i9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f19896id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f19896id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.f34536c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f34534b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.q5 q5Var;
        View view;
        View view2;
        org.telegram.ui.Components.q5 q5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        int i10 = this.f34539e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f34544i0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f19948id != this.f34543h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f19948id;
            org.telegram.ui.ActionBar.f6 f6Var = this.f34545j0;
            if (i12 == 1) {
                View view3 = this.f34532a0;
                if (view3 != null && (q5Var2 = this.f34546k0) != null) {
                    q5Var2.o(view3);
                }
                this.f34546k0 = null;
                imageReceiver.setImageBitmap(og.d.c(this.T.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ac, f6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.q5 q5Var3 = this.f34546k0;
                if (q5Var3 == null || q5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.q5 q5Var4 = this.f34546k0;
                    if (q5Var4 != null && (view = this.f34532a0) != null) {
                        q5Var4.o(view);
                    }
                    org.telegram.ui.Components.q5 q5Var5 = new org.telegram.ui.Components.q5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f34546k0 = q5Var5;
                    q5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20786ic, f6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.q5 q5Var6 = this.f34546k0;
                if (q5Var6 != null && (view2 = this.f34532a0) != null) {
                    q5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.f34532a0;
                if (view4 != null && (q5Var = this.f34546k0) != null) {
                    q5Var.o(view4);
                }
                this.f34546k0 = null;
                imageReceiver.setImageBitmap(og.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f34536c0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f34534b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
