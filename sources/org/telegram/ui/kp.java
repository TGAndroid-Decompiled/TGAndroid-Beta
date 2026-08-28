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
public final class kp implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final ImageReceiver B;
    public TLRPC.Chat C;
    public TLRPC.TL_forumTopic D;
    public long E;
    public AnimatorSet F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public float K;
    public long L;
    public float M;
    public boolean N;
    public float O;
    public final View P;
    public long Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public ri U;
    public long V;
    public View W;
    public boolean X;
    public final org.telegram.ui.Components.lq Y;
    public final int[] Z;
    public int f39885a;
    public final int f39886a0;
    public int f39887b;
    public final int f39888b0;
    public int f39889c;
    public final int f39890c0;
    public float d;
    public final long f39891d0;
    public final Paint f39892e;
    public final long f39893e0;
    public final TextPaint f39894f;
    public final org.telegram.ui.ActionBar.b6 f39895f0;
    public org.telegram.ui.Components.k5 f39896g0;
    public final TextPaint h;
    public final Paint f39897n;
    public final Path f39898r;
    public StaticLayout f39899s;
    public StaticLayout v;
    public StaticLayout f39900w;
    public int f39901x;
    public int f39902y;

    public kp(int i9, View view, long j10, int i10, int i11, long j11, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f39892e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f39894f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f39897n = paint2;
        this.f39898r = new Path();
        this.E = 0L;
        this.X = true;
        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(null, true, null);
        this.Y = lqVar;
        this.Z = new int[3];
        this.P = view;
        this.f39886a0 = i9;
        this.f39893e0 = j10;
        this.f39888b0 = i10;
        this.f39890c0 = i11;
        this.f39891d0 = j11;
        this.T = MessagesController.getInstance(i9).isForum(j10);
        this.f39895f0 = b6Var;
        this.B = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        lqVar.f30536z = 3;
        lqVar.I = 1;
        lqVar.f30519g = true;
        lqVar.d = d("paintChatActionBackground");
        lqVar.f30517e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i9, int i10, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j11;
        int i11;
        int[] iArr2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i9;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i10);
            if (dialogFilter != null) {
                dialogs = dialogFilter.dialogs;
            } else {
                return null;
            }
        } else {
            dialogs = messagesController.getDialogs(i9);
        }
        if (dialogs != null) {
            for (int i12 = 0; i12 < dialogs.size(); i12++) {
                TLRPC.Dialog dialog = dialogs.get(i12);
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f22384id));
                if (chat != null && dialog.f22384id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f22384id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i10 != 0) {
                    int i13 = 0;
                    while (i13 < messagesController.dialogFilters.size()) {
                        int i14 = messagesController.dialogFilters.get(i13).f19649id;
                        if (i10 != i14) {
                            long j12 = j10;
                            int i15 = i9;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j12, i15, i14, false, iArr3);
                            j11 = j12;
                            i11 = i15;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j11 = j10;
                            i11 = i9;
                            iArr2 = iArr;
                        }
                        i13++;
                        i9 = i11;
                        j10 = j11;
                        iArr = iArr2;
                    }
                }
                long j13 = j10;
                int i16 = i9;
                int[] iArr4 = iArr;
                for (int i17 = 0; i17 < messagesController.dialogsByFolder.size(); i17++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i17);
                    if (i16 != keyAt && (c10 = c(j13, keyAt, 0, false, iArr4)) != null) {
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

    public final void a(Canvas canvas, ij ijVar, float f10, float f11) {
        float f12;
        int i9;
        int i10;
        RectF rectF;
        int i11;
        float f13;
        float f14;
        float f15;
        float f16;
        org.telegram.ui.Components.lq lqVar;
        float f17;
        float f18;
        TextPaint textPaint;
        boolean a12;
        float f19;
        int i12;
        float f20;
        float f21;
        int i13;
        int i14;
        Paint paint;
        float f22;
        float f23;
        boolean a13;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f24;
        float f25;
        float z10;
        int i15;
        boolean a14;
        Canvas canvas2 = canvas;
        if (this.W != ijVar) {
            this.W = ijVar;
            org.telegram.ui.Components.k5 k5Var = this.f39896g0;
            if (k5Var != null) {
                k5Var.a(ijVar);
            }
        }
        org.telegram.ui.Components.lq lqVar2 = this.Y;
        lqVar2.H = ijVar;
        RectF rectF3 = lqVar2.f30518f;
        float dp = AndroidUtilities.dp(110.0f) * f10;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f10 < 0.2f) {
            f12 = 5.0f * f10 * f11;
        } else {
            f12 = f11;
        }
        org.telegram.ui.ActionBar.f6.q(0.0f, ijVar.getMeasuredHeight() - dp, this.f39889c, ijVar.getMeasuredHeight());
        int i16 = org.telegram.ui.ActionBar.f6.f23097ic;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39895f0;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var);
        TextPaint textPaint3 = this.f39894f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var);
        Paint paint2 = this.f39892e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vd, b6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.f6.f23069h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.f6.f23069h2.setAlpha((int) (alpha2 * f12));
        int i17 = (int) (alpha * f12);
        d("paintChatActionBackground").setAlpha(i17);
        int i18 = (int) (alpha3 * f12);
        textPaint3.setAlpha(i18);
        int i19 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if ((i19 >= 0 && this.M < 1.0f) || (f10 < 1.0f && this.M == 1.0f)) {
            i9 = i18;
            i10 = i17;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i11 = alpha2;
            if (currentTimeMillis - this.L > 100) {
                try {
                    ijVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.L = currentTimeMillis;
            }
            this.M = f10;
        } else {
            i9 = i18;
            i10 = i17;
            rectF = rectF3;
            i11 = alpha2;
        }
        if (i19 == 0 && !this.I) {
            this.I = true;
            this.J = true;
            g(ijVar, true);
            this.Q = System.currentTimeMillis();
        } else if (i19 != 0 && this.I) {
            this.I = false;
            g(ijVar, false);
        }
        float f26 = this.f39889c / 2.0f;
        float f27 = this.H * (-AndroidUtilities.dp(4.0f));
        if (this.N) {
            f13 = dp - f27;
        } else {
            f13 = dp;
        }
        float f28 = f13 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f28 - (AndroidUtilities.dp(16.0f) * f10)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.G) * ((Math.max(0.0f, Math.min(this.d * f10, f28 - (AndroidUtilities.dp(8.0f) * f10))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float f29 = this.G;
        float dp2 = (AndroidUtilities.dp(56.0f) * f29) + max2;
        if (f29 >= 1.0f && !this.N) {
            paint = paint2;
            lqVar = lqVar2;
            f17 = dp2;
            f18 = f12;
            textPaint = textPaint3;
            i12 = i9;
            f20 = f27;
            f14 = 36.0f;
            f19 = f26;
            i14 = alpha;
            i13 = i10;
            f21 = f13;
        } else {
            f14 = 36.0f;
            float f30 = -f13;
            float f31 = f13;
            float dp3 = (this.G * (AndroidUtilities.dp(56.0f) + f30)) + ((1.0f - this.G) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i20 = i10;
            rectF4.set(f26 - max, f30, f26 + max, dp3);
            if (this.G > 0.0f && !this.N) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.G;
                rectF4.inset(dp4, dp4);
                f15 = 1.0f - this.G;
            } else {
                f15 = 1.0f;
            }
            if (this.S) {
                Path path = this.f39898r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f16 = f30;
                float f32 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                lqVar = lqVar2;
                f17 = dp2;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f33 = -width;
                path.rQuadTo(0.0f, f33, f33, f33);
                float f34 = width * 2.0f;
                float f35 = f32 * 2.0f;
                f18 = f12;
                path.rLineTo((((-(rectF4.width() - f34)) / 2.0f) + f35) - width3, 0.0f);
                float f36 = -f32;
                float f37 = f36 / 2.0f;
                float f38 = f36 * 2.0f;
                textPaint = textPaint3;
                float f39 = (-width2) / 2.0f;
                path.rQuadTo(f37, 0.0f, f38, f39);
                path.rQuadTo(f37, f39, f38, f39);
                path.rLineTo(((-(rectF4.width() - f34)) / 2.0f) + f35 + width3, 0.0f);
                path.rQuadTo(f33, 0.0f, f33, width);
                path.rLineTo(0.0f, (height + width2) - f34);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f34, 0.0f);
                path.rQuadTo(width, 0.0f, width, f33);
                path.rLineTo(0.0f, -(height - f34));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (b6Var != null) {
                    a13 = b6Var.t0();
                } else {
                    a13 = org.telegram.ui.ActionBar.f6.a1();
                }
                if (a13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.f6.f23069h2);
                }
            } else {
                f16 = f30;
                lqVar = lqVar2;
                f17 = dp2;
                f18 = f12;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f15));
                float f40 = this.d;
                canvas2.drawRoundRect(rectF4, f40, f40, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (b6Var != null) {
                    a12 = b6Var.t0();
                } else {
                    a12 = org.telegram.ui.ActionBar.f6.a1();
                }
                if (a12) {
                    int alpha6 = org.telegram.ui.ActionBar.f6.f23069h2.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23069h2.setAlpha((int) (alpha6 * f15));
                    float f41 = this.d;
                    canvas2.drawRoundRect(rectF4, f41, f41, org.telegram.ui.ActionBar.f6.f23069h2);
                    org.telegram.ui.ActionBar.f6.f23069h2.setAlpha(alpha6);
                }
            }
            float z11 = e2.c.z(1.0f, f10, AndroidUtilities.dp(8.0f), f16 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.G);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f42 = this.G;
            if (f42 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f42) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f10) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f26, z11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f26 - AndroidUtilities.dp2(12.0f), z11 - AndroidUtilities.dp(12.0f));
            f19 = f26;
            i12 = i9;
            f20 = f27;
            f21 = f31;
            i13 = i20;
            i14 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.N) {
                float w8 = aa.d.w(f16 - AndroidUtilities.dp(2.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f17), f20);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f10, f10, f19, AndroidUtilities.dp(28.0f) + w8);
                float dp6 = w8 + AndroidUtilities.dp(28.0f);
                if (!this.J) {
                    paint = paint2;
                } else {
                    float f43 = this.K;
                    if (f43 < 1.0f) {
                        float f44 = f43 + 0.07272727f;
                        this.K = f44;
                        if (f44 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                    float f45 = this.K;
                    if (f45 > 0.5f) {
                        f22 = 1.0f;
                    } else {
                        f22 = f45 / 0.5f;
                    }
                    if (f45 < 0.5f) {
                        f23 = 0.0f;
                    } else {
                        f23 = (f45 - 0.5f) / 0.5f;
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
                    float f46 = 1.0f - f22;
                    canvas.drawLine(dp7, dp8, (dp9 * f22) + (dp7 * f46), (f22 * dp10) + (f46 * dp8), paint2);
                    if (f23 > 0.0f) {
                        float f47 = 1.0f - f23;
                        float f48 = (dp11 * f23) + (dp9 * f47);
                        float f49 = (dp12 * f23) + (f47 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f48, f49, paint2);
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
        if (this.f39899s != null && this.G > 0.0f) {
            d("paintChatActionBackground").setAlpha(i13);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i12);
            float dp13 = (((1.0f - this.G) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f14) * this.G)) + f20;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f50 = (i15 - this.f39901x) / 2.0f;
            rectF5.set(f50, dp13, this.f39889c - f50, this.f39899s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (b6Var != null) {
                a14 = b6Var.t0();
            } else {
                a14 = org.telegram.ui.ActionBar.f6.a1();
            }
            if (a14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.f6.f23069h2);
            }
            canvas2.save();
            canvas2.translate((this.f39889c - this.f39901x) / 2.0f, dp13);
            this.f39899s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.N && f17 > 0.0f) {
            float w10 = aa.d.w((-f21) + AndroidUtilities.dp(4.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f17), f20);
            org.telegram.ui.Components.k5 k5Var2 = this.f39896g0;
            if (k5Var2 == null || (imageReceiver = k5Var2.f29951k) == null) {
                imageReceiver = this.B;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f18);
            float f51 = f17 / 2.0f;
            imageReceiver2.setRoundRadius((int) f51);
            float f52 = f17;
            imageReceiver2.setImageCoords(f19 - f51, w10, f52, f52);
            if (this.T && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.fq) && (((org.telegram.ui.Components.fq) imageReceiver2.getDrawable()).f28543b instanceof org.telegram.ui.Components.u70)) {
                ((org.telegram.ui.Components.u70) ((org.telegram.ui.Components.fq) imageReceiver2.getDrawable()).f28543b).f32947i = f10;
            }
            if (this.G > 0.0f && this.X) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f53 = this.G;
                org.telegram.ui.Components.lq lqVar3 = lqVar;
                lqVar3.e(lqVar3.f30530s);
                canvas2.scale(f53, f53, (lqVar3.f30530s / 2.0f) + lqVar3.A + AndroidUtilities.dp(12.0f) + f19, (w10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, w10 - AndroidUtilities.dp(6.0f));
                float f54 = lqVar3.C;
                float f55 = lqVar3.f30523l;
                if (f55 != 1.0f) {
                    f24 = 6.0f;
                    int i21 = lqVar3.f30516c;
                    if (i21 == 0 || i21 == 1) {
                        rectF2 = rectF;
                        f25 = 14.0f;
                        lqVar3.e(lqVar3.f30530s);
                        float dp14 = (lqVar3.f30534x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        float f56 = lqVar3.B;
                        rectF2.set(f56, dp14, lqVar3.f30530s + f56 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f57 = f55 * 2.0f;
                        if (f57 > 1.0f) {
                            f57 = 1.0f;
                        }
                        float dp15 = (lqVar3.f30534x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        int i22 = lqVar3.f30530s;
                        int i23 = lqVar3.f30529r;
                        if (i22 == i23) {
                            z10 = i22;
                            f25 = 14.0f;
                        } else {
                            f25 = 14.0f;
                            z10 = e2.c.z(1.0f, f57, i23, i22 * f57);
                        }
                        lqVar3.e(z10);
                        float f58 = lqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f58, dp15, z10 + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f24 = 6.0f;
                    f25 = 14.0f;
                    lqVar3.e(lqVar3.f30530s);
                    float dp16 = (lqVar3.f30534x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                    float f59 = lqVar3.B;
                    rectF2.set(f59, dp16, lqVar3.f30530s + f59 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f39897n);
                canvas2.restore();
                canvas2.save();
                float f60 = this.G;
                lqVar3.e(lqVar3.f30530s);
                canvas2.scale(f60, f60, (lqVar3.f30530s / 2.0f) + lqVar3.A + AndroidUtilities.dp(12.0f) + f19, (w10 - AndroidUtilities.dp(f24)) + AndroidUtilities.dp(f25));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, w10 - AndroidUtilities.dp(f24));
                lqVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i14);
        org.telegram.ui.ActionBar.f6.f23069h2.setAlpha(i11);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i9, int i10) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xk, this.f39895f0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.O));
        if (this.v != null) {
            float f10 = this.G;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.O));
                float height = ((((i10 - i9) - this.v.getHeight()) / 2.0f) + i9) - (AndroidUtilities.dp(10.0f) * this.G);
                canvas.save();
                canvas.translate((this.f39889c - this.f39902y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f39900w != null) {
            float f11 = this.G;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.O));
                float dp = ((1.0f - this.G) * AndroidUtilities.dp(10.0f)) + (((i10 - i9) - this.f39900w.getHeight()) / 2.0f) + i9;
                canvas.save();
                canvas.translate((this.f39889c - this.A) / 2.0f, dp);
                this.f39900w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39895f0;
        if (b6Var != null) {
            paint = b6Var.O(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.V != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f39886a0).dialogs_dict.f(this.V)) != null) {
            int i11 = dialog.unread_count;
            boolean z10 = true;
            this.Y.c(i11, true);
            if (i11 <= 0) {
                z10 = false;
            }
            this.X = z10;
            View view = this.W;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final boolean e() {
        if (this.O > 0.0f && !this.N) {
            return true;
        }
        return false;
    }

    public final void f() {
        View view;
        this.B.onAttachedToWindow();
        org.telegram.ui.Components.k5 k5Var = this.f39896g0;
        if (k5Var != null && (view = this.W) != null) {
            k5Var.a(view);
        }
        NotificationCenter.getInstance(this.f39886a0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.F.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kp f39237b;

                {
                    this.f39237b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            kp kpVar = this.f39237b;
                            kpVar.getClass();
                            kpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            kpVar.P.invalidate();
                            return;
                        case 1:
                            kp kpVar2 = this.f39237b;
                            kpVar2.getClass();
                            kpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            kp kpVar3 = this.f39237b;
                            kpVar3.getClass();
                            kpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            kp kpVar4 = this.f39237b;
                            kpVar4.getClass();
                            kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            kp kpVar5 = this.f39237b;
                            kpVar5.getClass();
                            kpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kpVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
            ofFloat.setDuration(250L);
            this.H = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kp f39237b;

                {
                    this.f39237b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            kp kpVar = this.f39237b;
                            kpVar.getClass();
                            kpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            kpVar.P.invalidate();
                            return;
                        case 1:
                            kp kpVar2 = this.f39237b;
                            kpVar2.getClass();
                            kpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            kp kpVar3 = this.f39237b;
                            kpVar3.getClass();
                            kpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            kp kpVar4 = this.f39237b;
                            kpVar4.getClass();
                            kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            kp kpVar5 = this.f39237b;
                            kpVar5.getClass();
                            kpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kpVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28847j;
            ofFloat2.setInterpolator(grVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kp f39237b;

                {
                    this.f39237b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            kp kpVar = this.f39237b;
                            kpVar.getClass();
                            kpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            kpVar.P.invalidate();
                            return;
                        case 1:
                            kp kpVar2 = this.f39237b;
                            kpVar2.getClass();
                            kpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            kp kpVar3 = this.f39237b;
                            kpVar3.getClass();
                            kpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            kp kpVar4 = this.f39237b;
                            kpVar4.getClass();
                            kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            kp kpVar5 = this.f39237b;
                            kpVar5.getClass();
                            kpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kpVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(grVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kp f39237b;

                {
                    this.f39237b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            kp kpVar = this.f39237b;
                            kpVar.getClass();
                            kpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            kpVar.P.invalidate();
                            return;
                        case 1:
                            kp kpVar2 = this.f39237b;
                            kpVar2.getClass();
                            kpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            kp kpVar3 = this.f39237b;
                            kpVar3.getClass();
                            kpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            kp kpVar4 = this.f39237b;
                            kpVar4.getClass();
                            kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            kp kpVar5 = this.f39237b;
                            kpVar5.getClass();
                            kpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kpVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(grVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.addListener(new fg.j(13, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.F.playTogether(ofFloat, animatorSet3);
            this.F.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.G, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final kp f39237b;

            {
                this.f39237b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        kp kpVar = this.f39237b;
                        kpVar.getClass();
                        kpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        kpVar.P.invalidate();
                        return;
                    case 1:
                        kp kpVar2 = this.f39237b;
                        kpVar2.getClass();
                        kpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        kp kpVar3 = this.f39237b;
                        kpVar3.getClass();
                        kpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        kp kpVar4 = this.f39237b;
                        kpVar4.getClass();
                        kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        kp kpVar5 = this.f39237b;
                        kpVar5.getClass();
                        kpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kpVar5.P.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.F = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.F.start();
    }

    public final void h() {
        boolean z10;
        boolean z11 = false;
        this.R = false;
        this.D = null;
        TLRPC.Dialog c10 = c(this.f39893e0, this.f39888b0, this.f39890c0, true, this.Z);
        if (c10 != null) {
            this.V = c10.f22384id;
            int[] iArr = this.Z;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.S = z10;
            this.f39885a = iArr[1];
            this.f39887b = iArr[2];
            this.N = false;
            int i9 = this.f39886a0;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-c10.f22384id));
            this.C = chat;
            if (chat == null) {
                this.C = MessagesController.getInstance(i9).getChat(Long.valueOf(c10.f22384id));
            }
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.k(i9, this.C);
            this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", z8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i9).ensureMessagesLoaded(c10.f22384id, 0, null);
            int i10 = c10.unread_count;
            this.Y.c(i10, false);
            if (i10 > 0) {
                z11 = true;
            }
            this.X = z11;
            return;
        }
        this.C = null;
        this.S = false;
        this.N = true;
    }

    public final void i(TLRPC.Chat chat) {
        boolean z10;
        int i9;
        if (chat == null) {
            h();
            return;
        }
        this.V = -chat.f22380id;
        int[] iArr = this.Z;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = z10;
        this.f39885a = iArr[1];
        this.f39887b = iArr[2];
        this.N = false;
        this.C = chat;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        TLRPC.Chat chat2 = this.C;
        int i10 = this.f39886a0;
        z8Var.k(i10, chat2);
        this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", z8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i10).ensureMessagesLoaded(-chat.f22380id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i10).getDialog(-chat.f22380id);
        if (dialog == null) {
            i9 = 0;
        } else {
            i9 = dialog.unread_count;
        }
        this.Y.c(i9, false);
        if (i9 > 0) {
            z11 = true;
        }
        this.X = z11;
        this.R = true;
        this.D = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.k5 k5Var;
        View view;
        View view2;
        org.telegram.ui.Components.k5 k5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.R = false;
        this.S = false;
        this.C = null;
        this.V = 0L;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.clearImage();
        int i9 = this.f39886a0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i9).getTopicsController().getTopics(-this.f39893e0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                if (tL_forumTopic2.f22432id != this.f39891d0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.N = false;
            this.D = tL_forumTopic;
            int i11 = tL_forumTopic.f22432id;
            org.telegram.ui.ActionBar.b6 b6Var = this.f39895f0;
            if (i11 == 1) {
                View view3 = this.W;
                if (view3 != null && (k5Var2 = this.f39896g0) != null) {
                    k5Var2.o(view3);
                }
                this.f39896g0 = null;
                imageReceiver.setImageBitmap(vf.c.c(this.P.getContext(), 1.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ac, b6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.k5 k5Var3 = this.f39896g0;
                if (k5Var3 == null || k5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.k5 k5Var4 = this.f39896g0;
                    if (k5Var4 != null && (view = this.W) != null) {
                        k5Var4.o(view);
                    }
                    org.telegram.ui.Components.k5 k5Var5 = new org.telegram.ui.Components.k5(22, i9, tL_forumTopic.icon_emoji_id);
                    this.f39896g0 = k5Var5;
                    k5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.k5 k5Var6 = this.f39896g0;
                if (k5Var6 != null && (view2 = this.W) != null) {
                    k5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.W;
                if (view4 != null && (k5Var = this.f39896g0) != null) {
                    k5Var.o(view4);
                }
                this.f39896g0 = null;
                imageReceiver.setImageBitmap(vf.c.e(tL_forumTopic));
            }
            int i12 = tL_forumTopic.unread_count;
            this.Y.c(i12, false);
            if (i12 > 0) {
                z10 = true;
            }
            this.X = z10;
            return;
        }
        this.D = null;
        this.N = true;
    }
}
