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
public final class np implements NotificationCenter.NotificationCenterDelegate {
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
    public ui U;
    public long V;
    public View W;
    public boolean X;
    public final org.telegram.ui.Components.pq Y;
    public final int[] Z;
    public int f40856a;
    public final int f40857a0;
    public int f40858b;
    public final int f40859b0;
    public int f40860c;
    public final int f40861c0;
    public float d;
    public final long f40862d0;
    public final Paint f40863e;
    public final long f40864e0;
    public final TextPaint f40865f;
    public final org.telegram.ui.ActionBar.c6 f40866f0;
    public org.telegram.ui.Components.p5 f40867g0;
    public final TextPaint h;
    public final Paint f40868n;
    public final Path f40869r;
    public StaticLayout f40870s;
    public StaticLayout v;
    public StaticLayout f40871w;
    public int f40872x;
    public int f40873y;

    public np(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f40863e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40865f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f40868n = paint2;
        this.f40869r = new Path();
        this.E = 0L;
        this.X = true;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(null, true, null);
        this.Y = pqVar;
        this.Z = new int[3];
        this.P = view;
        this.f40857a0 = i10;
        this.f40864e0 = j10;
        this.f40859b0 = i11;
        this.f40861c0 = i12;
        this.f40862d0 = j11;
        this.T = MessagesController.getInstance(i10).isForum(j10);
        this.f40866f0 = c6Var;
        this.B = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        pqVar.f31753z = 3;
        pqVar.I = 1;
        pqVar.f31736g = true;
        pqVar.d = d("paintChatActionBackground");
        pqVar.f31734e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c3;
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
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f22396id));
                if (chat != null && dialog.f22396id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f22396id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f19620id;
                        if (i11 != i15) {
                            long j12 = j10;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c6 = c(j12, i16, i15, false, iArr3);
                            j11 = j12;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c6 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c6;
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
                    if (i17 != keyAt && (c3 = c(j13, keyAt, 0, false, iArr4)) != null) {
                        if (iArr4 != null) {
                            iArr4[0] = 1;
                        }
                        return c3;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(Canvas canvas, lj ljVar, float f9, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.Components.pq pqVar;
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
        if (this.W != ljVar) {
            this.W = ljVar;
            org.telegram.ui.Components.p5 p5Var = this.f40867g0;
            if (p5Var != null) {
                p5Var.a(ljVar);
            }
        }
        org.telegram.ui.Components.pq pqVar2 = this.Y;
        pqVar2.H = ljVar;
        RectF rectF3 = pqVar2.f31735f;
        float dp = AndroidUtilities.dp(110.0f) * f9;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f9 < 0.2f) {
            f11 = 5.0f * f9 * f10;
        } else {
            f11 = f10;
        }
        org.telegram.ui.ActionBar.g6.q(0.0f, ljVar.getMeasuredHeight() - dp, this.f40860c, ljVar.getMeasuredHeight());
        int i17 = org.telegram.ui.ActionBar.g6.f23158ic;
        org.telegram.ui.ActionBar.c6 c6Var = this.f40866f0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i17, c6Var);
        TextPaint textPaint3 = this.f40865f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.g6.v0(i17, c6Var);
        Paint paint2 = this.f40863e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, c6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.g6.f23130h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.g6.f23130h2.setAlpha((int) (alpha2 * f11));
        int i18 = (int) (alpha * f11);
        d("paintChatActionBackground").setAlpha(i18);
        int i19 = (int) (alpha3 * f11);
        textPaint3.setAlpha(i19);
        int i20 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if ((i20 >= 0 && this.M < 1.0f) || (f9 < 1.0f && this.M == 1.0f)) {
            i10 = i19;
            i11 = i18;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.L > 100) {
                try {
                    ljVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.L = currentTimeMillis;
            }
            this.M = f9;
        } else {
            i10 = i19;
            i11 = i18;
            rectF = rectF3;
            i12 = alpha2;
        }
        if (i20 == 0 && !this.I) {
            this.I = true;
            this.J = true;
            g(ljVar, true);
            this.Q = System.currentTimeMillis();
        } else if (i20 != 0 && this.I) {
            this.I = false;
            g(ljVar, false);
        }
        float f25 = this.f40860c / 2.0f;
        float f26 = this.H * (-AndroidUtilities.dp(4.0f));
        if (this.N) {
            f12 = dp - f26;
        } else {
            f12 = dp;
        }
        float f27 = f12 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f27 - (AndroidUtilities.dp(16.0f) * f9)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.G) * ((Math.max(0.0f, Math.min(this.d * f9, f27 - (AndroidUtilities.dp(8.0f) * f9))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float f28 = this.G;
        float dp2 = (AndroidUtilities.dp(56.0f) * f28) + max2;
        if (f28 >= 1.0f && !this.N) {
            paint = paint2;
            pqVar = pqVar2;
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
            float dp3 = (this.G * (AndroidUtilities.dp(56.0f) + f29)) + ((1.0f - this.G) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i21 = i11;
            rectF4.set(f25 - max, f29, f25 + max, dp3);
            if (this.G > 0.0f && !this.N) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.G;
                rectF4.inset(dp4, dp4);
                f14 = 1.0f - this.G;
            } else {
                f14 = 1.0f;
            }
            if (this.S) {
                Path path = this.f40869r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f15 = f29;
                float f31 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                pqVar = pqVar2;
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
                    a13 = c6Var.l0();
                } else {
                    a13 = org.telegram.ui.ActionBar.g6.a1();
                }
                if (a13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f23130h2);
                }
            } else {
                f15 = f29;
                pqVar = pqVar2;
                f16 = dp2;
                f17 = f11;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f14));
                float f39 = this.d;
                canvas2.drawRoundRect(rectF4, f39, f39, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (c6Var != null) {
                    a12 = c6Var.l0();
                } else {
                    a12 = org.telegram.ui.ActionBar.g6.a1();
                }
                if (a12) {
                    int alpha6 = org.telegram.ui.ActionBar.g6.f23130h2.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23130h2.setAlpha((int) (alpha6 * f14));
                    float f40 = this.d;
                    canvas2.drawRoundRect(rectF4, f40, f40, org.telegram.ui.ActionBar.g6.f23130h2);
                    org.telegram.ui.ActionBar.g6.f23130h2.setAlpha(alpha6);
                }
            }
            float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f9, AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.G);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f41 = this.G;
            if (f41 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f41) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f9) / AndroidUtilities.dpf2(24.0f);
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
            if (this.N) {
                float d = com.google.android.recaptcha.internal.a.d(f15 - AndroidUtilities.dp(2.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f9)) - f16), f19);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f9, f9, f18, AndroidUtilities.dp(28.0f) + d);
                float dp6 = d + AndroidUtilities.dp(28.0f);
                if (!this.J) {
                    paint = paint2;
                } else {
                    float f42 = this.K;
                    if (f42 < 1.0f) {
                        float f43 = f42 + 0.07272727f;
                        this.K = f43;
                        if (f43 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                    float f44 = this.K;
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
        if (this.f40870s != null && this.G > 0.0f) {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.G) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f13) * this.G)) + f19;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f49 = (i16 - this.f40872x) / 2.0f;
            rectF5.set(f49, dp13, this.f40860c - f49, this.f40870s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (c6Var != null) {
                a14 = c6Var.l0();
            } else {
                a14 = org.telegram.ui.ActionBar.g6.a1();
            }
            if (a14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.g6.f23130h2);
            }
            canvas2.save();
            canvas2.translate((this.f40860c - this.f40872x) / 2.0f, dp13);
            this.f40870s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.N && f16 > 0.0f) {
            float d10 = com.google.android.recaptcha.internal.a.d((-f20) + AndroidUtilities.dp(4.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f9)) - f16), f19);
            org.telegram.ui.Components.p5 p5Var2 = this.f40867g0;
            if (p5Var2 == null || (imageReceiver = p5Var2.f31593k) == null) {
                imageReceiver = this.B;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f17);
            float f50 = f16 / 2.0f;
            imageReceiver2.setRoundRadius((int) f50);
            float f51 = f16;
            imageReceiver2.setImageCoords(f18 - f50, d10, f51, f51);
            if (this.T && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.jq) && (((org.telegram.ui.Components.jq) imageReceiver2.getDrawable()).f29785b instanceof org.telegram.ui.Components.h80)) {
                ((org.telegram.ui.Components.h80) ((org.telegram.ui.Components.jq) imageReceiver2.getDrawable()).f29785b).f29135i = f9;
            }
            if (this.G > 0.0f && this.X) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f52 = this.G;
                org.telegram.ui.Components.pq pqVar3 = pqVar;
                pqVar3.e(pqVar3.f31747s);
                canvas2.scale(f52, f52, (pqVar3.f31747s / 2.0f) + pqVar3.A + AndroidUtilities.dp(12.0f) + f18, (d10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, d10 - AndroidUtilities.dp(6.0f));
                float f53 = pqVar3.C;
                float f54 = pqVar3.f31740l;
                if (f54 != 1.0f) {
                    f23 = 6.0f;
                    int i22 = pqVar3.f31733c;
                    if (i22 == 0 || i22 == 1) {
                        rectF2 = rectF;
                        f24 = 14.0f;
                        pqVar3.e(pqVar3.f31747s);
                        float dp14 = (pqVar3.f31751x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        float f55 = pqVar3.B;
                        rectF2.set(f55, dp14, pqVar3.f31747s + f55 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f56 = f54 * 2.0f;
                        if (f56 > 1.0f) {
                            f56 = 1.0f;
                        }
                        float dp15 = (pqVar3.f31751x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        int i23 = pqVar3.f31747s;
                        int i24 = pqVar3.f31746r;
                        if (i23 == i24) {
                            z10 = i23;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f56, i24, i23 * f56);
                        }
                        pqVar3.e(z10);
                        float f57 = pqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f57, dp15, z10 + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f23 = 6.0f;
                    f24 = 14.0f;
                    pqVar3.e(pqVar3.f31747s);
                    float dp16 = (pqVar3.f31751x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                    float f58 = pqVar3.B;
                    rectF2.set(f58, dp16, pqVar3.f31747s + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f40868n);
                canvas2.restore();
                canvas2.save();
                float f59 = this.G;
                pqVar3.e(pqVar3.f31747s);
                canvas2.scale(f59, f59, (pqVar3.f31747s / 2.0f) + pqVar3.A + AndroidUtilities.dp(12.0f) + f18, (d10 - AndroidUtilities.dp(f23)) + AndroidUtilities.dp(f24));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, d10 - AndroidUtilities.dp(f23));
                pqVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.g6.f23130h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xk, this.f40866f0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.O));
        if (this.v != null) {
            float f9 = this.G;
            if (f9 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f9) * alpha2 * this.O));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.G);
                canvas.save();
                canvas.translate((this.f40860c - this.f40873y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f40871w != null) {
            float f10 = this.G;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.O));
                float dp = ((1.0f - this.G) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f40871w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f40860c - this.A) / 2.0f, dp);
                this.f40871w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var = this.f40866f0;
        if (c6Var != null) {
            paint = c6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.V != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f40857a0).dialogs_dict.f(this.V)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.Y.c(i12, true);
            if (i12 <= 0) {
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
        org.telegram.ui.Components.p5 p5Var = this.f40867g0;
        if (p5Var != null && (view = this.W) != null) {
            p5Var.a(view);
        }
        NotificationCenter.getInstance(this.f40857a0).addObserver(this, NotificationCenter.updateInterfaces);
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
                public final np f40251b;

                {
                    this.f40251b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f40251b;
                            npVar.getClass();
                            npVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.P.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f40251b;
                            npVar2.getClass();
                            npVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f40251b;
                            npVar3.getClass();
                            npVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f40251b;
                            npVar4.getClass();
                            npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f40251b;
                            npVar5.getClass();
                            npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
            ofFloat.setDuration(250L);
            this.H = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f40251b;

                {
                    this.f40251b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f40251b;
                            npVar.getClass();
                            npVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.P.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f40251b;
                            npVar2.getClass();
                            npVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f40251b;
                            npVar3.getClass();
                            npVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f40251b;
                            npVar4.getClass();
                            npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f40251b;
                            npVar5.getClass();
                            npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29803j;
            ofFloat2.setInterpolator(jrVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f40251b;

                {
                    this.f40251b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f40251b;
                            npVar.getClass();
                            npVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.P.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f40251b;
                            npVar2.getClass();
                            npVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f40251b;
                            npVar3.getClass();
                            npVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f40251b;
                            npVar4.getClass();
                            npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f40251b;
                            npVar5.getClass();
                            npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(jrVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f40251b;

                {
                    this.f40251b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f40251b;
                            npVar.getClass();
                            npVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.P.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f40251b;
                            npVar2.getClass();
                            npVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f40251b;
                            npVar3.getClass();
                            npVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f40251b;
                            npVar4.getClass();
                            npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f40251b;
                            npVar5.getClass();
                            npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.P.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(jrVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.addListener(new bg.c3(16, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.F.playTogether(ofFloat, animatorSet3);
            this.F.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.G, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final np f40251b;

            {
                this.f40251b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        np npVar = this.f40251b;
                        npVar.getClass();
                        npVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.P.invalidate();
                        return;
                    case 1:
                        np npVar2 = this.f40251b;
                        npVar2.getClass();
                        npVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        np npVar3 = this.f40251b;
                        npVar3.getClass();
                        npVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        np npVar4 = this.f40251b;
                        npVar4.getClass();
                        npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        np npVar5 = this.f40251b;
                        npVar5.getClass();
                        npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.P.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.jr.f29800f);
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
        TLRPC.Dialog c3 = c(this.f40864e0, this.f40859b0, this.f40861c0, true, this.Z);
        if (c3 != null) {
            this.V = c3.f22396id;
            int[] iArr = this.Z;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.S = z10;
            this.f40856a = iArr[1];
            this.f40858b = iArr[2];
            this.N = false;
            int i10 = this.f40857a0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c3.f22396id));
            this.C = chat;
            if (chat == null) {
                this.C = MessagesController.getInstance(i10).getChat(Long.valueOf(c3.f22396id));
            }
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.k(i10, this.C);
            this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", e9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c3.f22396id, 0, null);
            int i11 = c3.unread_count;
            this.Y.c(i11, false);
            if (i11 > 0) {
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
        int i10;
        if (chat == null) {
            h();
            return;
        }
        this.V = -chat.f22392id;
        int[] iArr = this.Z;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = z10;
        this.f40856a = iArr[1];
        this.f40858b = iArr[2];
        this.N = false;
        this.C = chat;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat2 = this.C;
        int i11 = this.f40857a0;
        e9Var.k(i11, chat2);
        this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", e9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f22392id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f22392id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.Y.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.X = z11;
        this.R = true;
        this.D = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.p5 p5Var;
        View view;
        View view2;
        org.telegram.ui.Components.p5 p5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.R = false;
        this.S = false;
        this.C = null;
        this.V = 0L;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.clearImage();
        int i10 = this.f40857a0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f40864e0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f22444id != this.f40862d0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.N = false;
            this.D = tL_forumTopic;
            int i12 = tL_forumTopic.f22444id;
            org.telegram.ui.ActionBar.c6 c6Var = this.f40866f0;
            if (i12 == 1) {
                View view3 = this.W;
                if (view3 != null && (p5Var2 = this.f40867g0) != null) {
                    p5Var2.o(view3);
                }
                this.f40867g0 = null;
                imageReceiver.setImageBitmap(yf.d.c(this.P.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ac, c6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.p5 p5Var3 = this.f40867g0;
                if (p5Var3 == null || p5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.p5 p5Var4 = this.f40867g0;
                    if (p5Var4 != null && (view = this.W) != null) {
                        p5Var4.o(view);
                    }
                    org.telegram.ui.Components.p5 p5Var5 = new org.telegram.ui.Components.p5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f40867g0 = p5Var5;
                    p5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.p5 p5Var6 = this.f40867g0;
                if (p5Var6 != null && (view2 = this.W) != null) {
                    p5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.W;
                if (view4 != null && (p5Var = this.f40867g0) != null) {
                    p5Var.o(view4);
                }
                this.f40867g0 = null;
                imageReceiver.setImageBitmap(yf.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.Y.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.X = z10;
            return;
        }
        this.D = null;
        this.N = true;
    }
}
