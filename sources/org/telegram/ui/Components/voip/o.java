package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.f11;
import org.telegram.ui.s50;

public final class o extends r2 {

    public float f33765c0;

    public final ChatObject.Call f33766d0;

    public final k0 f33767e0;

    public final TextPaint f33768f0;

    public final StaticLayout f33769g0;

    public final TextPaint f33770h0;

    public final String f33771i0;

    public final float f33772j0;

    public final StaticLayout f33773k0;

    public final s50 f33774l0;
    public final String m0;

    public final float f33775n0;

    public final t f33776o0;

    public o(t tVar, Context context, ChatObject.Call call, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, s50 s50Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f33776o0 = tVar;
        this.f33766d0 = call;
        this.f33767e0 = k0Var;
        this.f33768f0 = textPaint;
        this.f33769g0 = staticLayout;
        this.f33770h0 = textPaint2;
        this.f33771i0 = str;
        this.f33772j0 = f10;
        this.f33773k0 = staticLayout2;
        this.f33774l0 = s50Var;
        this.m0 = str2;
        this.f33775n0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f33765c0 = this.f33776o0.f33896s0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33776o0;
        TextView textView = tVar.K;
        o oVar = tVar.f33871a;
        invalidate();
        ChatObject.Call call = this.f33766d0;
        if (call != null && call.call.rtmp_stream && tVar.f33899v0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.f33901w0);
            tVar.f33899v0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f33890o0;
        q2 q2Var = this.d;
        if (!z10 && q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f33827e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f33897t0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f33897t0.getAlpha() == 1.0f) {
                tVar.f33897t0.animate().alpha(0.0f).setDuration(300L).setListener(new f11(this, 11)).start();
            } else if (tVar.f33897t0.getParent() != null) {
                oVar.removeView(tVar.f33897t0);
            }
        }
        int i11 = q2Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = q2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.f33900w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i10, i11, call);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        br brVar;
        float f11;
        int iD;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        t tVar = this.f33776o0;
        br brVar2 = tVar.f33892q0;
        Drawable drawable = tVar.f33894r0;
        o oVar = tVar.f33871a;
        ImageReceiver imageReceiver = tVar.f33883h0;
        TextView textView = tVar.K;
        q qVar = tVar.J;
        q2 q2Var = this.d;
        boolean zIsFirstFrameRendered = q2Var.isFirstFrameRendered();
        TextPaint textPaint = this.f33768f0;
        ChatObject.Call call = this.f33766d0;
        k0 k0Var = this.f33767e0;
        if (!zIsFirstFrameRendered || (!(q2Var.getAlpha() == 1.0f || this.f33827e.getAlpha() == 1.0f) || tVar.f33890o0)) {
            float f17 = tVar.f33882g0;
            if (f17 != 1.0f) {
                float f18 = f17 + 0.10666667f;
                tVar.f33882g0 = f18;
                if (f18 > 1.0f) {
                    tVar.f33882g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (tVar.m0 != null) {
                canvas.save();
                float f19 = this.S;
                canvas.scale(f19, f19, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (tVar.f33889n0 == null) {
                    Paint paint = new Paint(1);
                    tVar.f33889n0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(tVar.m0, (getMeasuredWidth() - tVar.m0.getWidth()) / 2.0f, (getMeasuredHeight() - tVar.m0.getHeight()) / 2.0f, tVar.f33889n0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.setImageCoords(this.K, this.J, getMeasuredWidth() - (this.K * 2.0f), getMeasuredHeight() - (this.J * 2.0f));
                imageReceiver.setAlpha(tVar.f33882g0);
                imageReceiver.draw(canvas);
            }
            ChatObject.VideoParticipant videoParticipant = tVar.f33900w;
            if (videoParticipant == call.videoNotAvailableParticipant) {
                if (tVar.f33873b || !k0Var.f33648b) {
                    float fDp = AndroidUtilities.dp(48.0f);
                    float measuredWidth = (getMeasuredWidth() - fDp) / 2.0f;
                    float measuredHeight = (getMeasuredHeight() / 2) - fDp;
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((fDp / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), measuredHeight + fDp + AndroidUtilities.dp(10.0f));
                    this.f33769g0.draw(canvas);
                    canvas.restore();
                }
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                brVar = brVar2;
            } else if (videoParticipant.presentation && videoParticipant.participant.self) {
                if (qVar.getVisibility() != 0) {
                    qVar.setVisibility(0);
                    qVar.setScaleX(1.0f);
                    qVar.setScaleY(1.0f);
                }
                float f20 = tVar.f33898u0 ? 0.0f : k0Var.f33650c;
                int iDp = AndroidUtilities.dp(33.0f);
                if (tVar.f33893r || tVar.f33873b) {
                    f11 = 10.0f;
                    iD = (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(39.0f), k0Var.f33650c, AndroidUtilities.dp(10.0f), iDp);
                } else {
                    f11 = 10.0f;
                    iD = (int) ((Math.max(1.0f - k0Var.f33650c, (tVar.h || tVar.f33880f) ? k0Var.f33663n : 0.0f) * AndroidUtilities.dp(10.0f)) + iDp);
                }
                int measuredWidth2 = (getMeasuredWidth() - iD) / 2;
                boolean z10 = tVar.h;
                float f21 = (z10 || tVar.f33880f) ? k0Var.f33663n : 0.0f;
                float f22 = f20;
                if (tVar.f33873b) {
                    f12 = f22;
                } else {
                    f12 = tVar.f33893r ? k0Var.f33650c : f21;
                    f22 = (z10 || tVar.f33880f) ? k0Var.f33663n : k0Var.f33650c;
                }
                float f23 = f12;
                int iDp2 = (int) ((AndroidUtilities.dp(17.0f) * f22) + ((((getMeasuredHeight() - iD) / 2) - AndroidUtilities.dp(28.0f)) - (((((tVar.f33873b || tVar.f33893r) ? k0Var.f33650c : 0.0f) * AndroidUtilities.dp(74.0f)) + AndroidUtilities.dp(17.0f)) * f23)));
                brVar = brVar2;
                int i10 = iDp2 + iD;
                drawable.setBounds(measuredWidth2, iDp2, measuredWidth2 + iD, i10);
                drawable.draw(canvas);
                float f24 = k0Var.f33650c;
                if (f24 > f10 || f21 > f10) {
                    float fMax = Math.max(f24, f21) * f23;
                    TextPaint textPaint2 = this.f33770h0;
                    textPaint2.setAlpha((int) (fMax * 255.0f));
                    if (tVar.f33893r || tVar.f33873b) {
                        qVar.setAlpha((1.0f - f21) * fMax);
                    } else {
                        qVar.setAlpha(0.0f);
                    }
                    canvas.drawText(this.f33771i0, (iD / 2.0f) + (measuredWidth2 - (this.f33772j0 / 2.0f)), AndroidUtilities.dp(32.0f) + i10, textPaint2);
                } else {
                    qVar.setAlpha(0.0f);
                }
                qVar.setTranslationY(((AndroidUtilities.dp(72.0f) + i10) + tVar.f33887l0) - this.J);
                qVar.setTranslationX(((getMeasuredWidth() - qVar.getMeasuredWidth()) / 2.0f) - this.K);
                float f25 = k0Var.f33650c;
                if (f25 < 1.0f && f21 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - ((double) Math.max(f25, f21))) * 255.0d));
                    canvas.save();
                    canvas.translate((iD / 2.0f) + (measuredWidth2 - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(f11) + i10);
                    this.f33773k0.draw(canvas);
                    canvas.restore();
                }
            } else {
                brVar = brVar2;
                if (qVar.getVisibility() != 4) {
                    qVar.setVisibility(4);
                }
                h hVar = this.f33774l0.f42465n2;
                Paint paint2 = hVar.f33589c;
                Matrix matrix = hVar.f33593i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = hVar.h;
                if (j10 != 0) {
                    long j11 = jCurrentTimeMillis - j10;
                    if (j11 > 10) {
                        float f26 = (j11 / 500.0f) + hVar.f33592g;
                        hVar.f33592g = f26;
                        if (f26 > 4.0f) {
                            hVar.f33592g = 0.0f;
                            af.e eVar = hVar.f33600p;
                            if (eVar != null) {
                                eVar.run();
                            }
                        }
                        hVar.h = jCurrentTimeMillis;
                    }
                } else {
                    hVar.h = jCurrentTimeMillis;
                }
                float f27 = hVar.f33592g;
                if (f27 <= 1.0f) {
                    int i11 = hVar.f33591f;
                    int i12 = hVar.f33590e;
                    matrix.setTranslate(((((i12 * 2) + i11) * f27) - i12) - tVar.getX(), 0.0f);
                    hVar.f33588b.setLocalMatrix(matrix);
                    hVar.d.setLocalMatrix(matrix);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(oVar.K, oVar.J, oVar.getMeasuredWidth() - oVar.K, oVar.getMeasuredHeight() - oVar.J);
                    canvas.drawRect(rectF, hVar.f33587a);
                    if (hVar.f33595k) {
                        if (hVar.f33596l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f28 = oVar.f33824b;
                        canvas.drawRoundRect(rectF, f28, f28, paint2);
                    }
                }
            }
            invalidate();
        } else {
            brVar = brVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + tVar.f33887l0) - this.J);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.K);
        ImageView imageView = tVar.f33897t0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f33897t0.setScaleX(oVar.d.getScaleX());
            tVar.f33897t0.setScaleY(oVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight2 = (getMeasuredHeight() - this.J) - AndroidUtilities.dp(80.0f);
        if (tVar.f33900w != call.videoNotAvailableParticipant) {
            canvas.save();
            if ((tVar.f33873b || tVar.f33893r) && !s50.B3 && !s50.C3) {
                measuredHeight2 = pa.b(1.0f, k0Var.S, AndroidUtilities.dp(90.0f) * k0Var.f33650c, measuredHeight2);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight2);
            canvas.drawPaint(tVar.f33904y);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z11 = tVar.f33890o0;
        if (z11 || tVar.f33891p0 != f13) {
            if (z11) {
                float f29 = tVar.f33891p0;
                if (f29 != 1.0f) {
                    float f30 = f29 + 0.064f;
                    tVar.f33891p0 = f30;
                    if (f30 > 1.0f) {
                        tVar.f33891p0 = 1.0f;
                    } else {
                        invalidate();
                    }
                } else if (!z11) {
                    f14 = tVar.f33891p0;
                    if (f14 != 0.0f) {
                        f15 = f14 - 0.064f;
                        tVar.f33891p0 = f15;
                        if (f15 < 0.0f) {
                            tVar.f33891p0 = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            } else if (!z11) {
                f14 = tVar.f33891p0;
                if (f14 != 0.0f) {
                    f15 = f14 - 0.064f;
                    tVar.f33891p0 = f15;
                    if (f15 < 0.0f) {
                        tVar.f33891p0 = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            float f31 = tVar.f33891p0;
            if (this.U != null) {
                float f32 = this.f33765c0;
                float f33 = this.W;
                f16 = (tVar.f33896s0 * f33) + ((1.0f - f33) * f32);
            } else {
                f16 = tVar.f33896s0;
            }
            float f34 = f31 * f16;
            if (f34 > 0.0f) {
                float fDp2 = AndroidUtilities.dp(48.0f);
                float measuredWidth3 = (getMeasuredWidth() - fDp2) / 2.0f;
                float measuredHeight3 = (getMeasuredHeight() - fDp2) / 2.0f;
                if (tVar.f33900w == call.videoNotAvailableParticipant) {
                    measuredHeight3 -= fDp2 / 2.5f;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f35 = measuredHeight3 + fDp2;
                rectF2.set((int) measuredWidth3, (int) measuredHeight3, (int) (measuredWidth3 + fDp2), (int) f35);
                if (f34 != 1.0f) {
                    canvas.saveLayerAlpha(rectF2, (int) (f34 * 255.0f), 31);
                } else {
                    canvas.save();
                }
                br brVar3 = brVar;
                brVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                brVar3.draw(canvas);
                canvas.restore();
                float f36 = f34 * k0Var.f33650c;
                if (f36 <= 0.0f || tVar.f33900w == call.videoNotAvailableParticipant) {
                    return;
                }
                textPaint.setAlpha((int) (f36 * 255.0f));
                canvas.drawText(this.m0, (fDp2 / 2.0f) + (measuredWidth3 - (this.f33775n0 / 2.0f)), f35 + AndroidUtilities.dp(16.0f), textPaint);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f33776o0;
        if (!tVar.f33881f0 || view != tVar.f33871a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = tVar.f33872a0;
        canvas.scale(f10, f10, tVar.f33874b0, tVar.f33876c0);
        canvas.translate(tVar.f33877d0, tVar.f33879e0);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f33776o0;
        o oVar = tVar.f33871a;
        ImageView imageView = tVar.f33897t0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        tVar.f33897t0.getLayoutParams().width = oVar.d.getMeasuredWidth();
        tVar.f33897t0.getLayoutParams().height = oVar.d.getMeasuredHeight();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f33776o0;
        tVar.M = true;
        tVar.invalidate();
        tVar.M = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33776o0;
        o oVar = tVar.f33871a;
        boolean z11 = tVar.v;
        q2 q2Var = this.d;
        if (z11 && tVar.N && q2Var.rotatedFrameHeight != 0 && q2Var.rotatedFrameWidth != 0) {
            if (tVar.h || tVar.f33873b) {
                oVar.T = 1;
            } else if (this.f33767e0.f33648b) {
                oVar.T = 0;
            } else if (tVar.f33900w.presentation) {
                oVar.T = 1;
            } else {
                oVar.T = 2;
            }
            tVar.N = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = q2Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = q2Var.rotatedFrameWidth) == 0 || (videoParticipant = tVar.f33900w) == null) {
            return;
        }
        videoParticipant.setAspectRatio(i14, i15, this.f33766d0);
    }

    @Override
    public final void requestLayout() {
        this.f33776o0.requestLayout();
        super.requestLayout();
    }
}
