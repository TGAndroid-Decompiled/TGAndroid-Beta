package org.telegram.ui.Components.spoilers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.billingclient.api.zzbv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipActivityHandler$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;

public final class SpoilerEffectBitmapFactory {
    public static SpoilerEffectBitmapFactory factory;
    public Bitmap backgroundBitmap;
    public Canvas backgroundCanvas;
    public boolean invalidated;
    public boolean isDrawnWithClipRegion;
    public boolean isRunning;
    public long lastUpdateTime;
    public Paint shaderPaint;
    public ArrayList shaderSpoilerEffects;
    public final int size;
    public final DispatchQueue dispatchQueue = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final zzbv[] buffers = new zzbv[SpoilerEffect.ALPHAS.length];
    public final PhotoViewer.AnonymousClass14[] bitmapBuffers = new PhotoViewer.AnonymousClass14[2];
    public int currentBitmapBuffer = 0;
    public final Rect clipRegion = new Rect();
    public final PipActivityHandler$$ExternalSyntheticLambda3 postFrameCallback = new PipActivityHandler$$ExternalSyntheticLambda3(this, 3);
    public final Rect clipRegionDump = new Rect();

    public SpoilerEffectBitmapFactory() {
        int iDp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) Math.min(Math.min(point.x, point.y) * 0.5f, iDp);
        this.size = iMin < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : iMin;
        int i = 0;
        while (true) {
            zzbv[] zzbvVarArr = this.buffers;
            if (i >= zzbvVarArr.length) {
                return;
            }
            zzbv zzbvVar = new zzbv((char) 0, 14);
            zzbvVar.zza = new float[Math.max(64, 2)];
            zzbvVar.zzb = 0;
            zzbvVarArr[i] = zzbvVar;
            i++;
        }
    }

    public final void doDraw(Canvas canvas, Rect rect) {
        int[] iArr;
        int i;
        int[] iArr2;
        float f;
        int i2;
        int i3;
        int i4;
        float[] fArr;
        zzbv[] zzbvVarArr = this.buffers;
        for (zzbv zzbvVar : zzbvVarArr) {
            zzbvVar.zzb = 0;
        }
        for (int i5 = 0; i5 < 100; i5++) {
            SpoilerEffect spoilerEffect = (SpoilerEffect) this.shaderSpoilerEffects.get(i5);
            if (Rect.intersects(spoilerEffect.getBounds(), rect) && zzbvVarArr != null) {
                int length = zzbvVarArr.length;
                float[] fArr2 = SpoilerEffect.ALPHAS;
                if (length == fArr2.length) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iMin = (int) Math.min(jCurrentTimeMillis - spoilerEffect.lastDrawTime, 34L);
                    spoilerEffect.lastDrawTime = jCurrentTimeMillis;
                    ArrayList arrayList = spoilerEffect.particles;
                    Stack stack = spoilerEffect.particlesPool;
                    int i6 = spoilerEffect.maxParticles;
                    int length2 = fArr2.length;
                    Rect bounds = spoilerEffect.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float fWidth = bounds.width();
                    float fHeight = bounds.height();
                    RectF rectF = spoilerEffect.boundsFWithInset;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float fDpf2 = AndroidUtilities.dpf2(1.0f);
                    float f8 = rect.left - fDpf2;
                    float f9 = rect.top - fDpf2;
                    float f10 = rect.right + fDpf2;
                    float f11 = rect.bottom + fDpf2;
                    float f12 = iMin;
                    float f13 = f12 / 500.0f;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = size;
                        SpoilerEffect.Particle particle = (SpoilerEffect.Particle) arrayList.get(i7);
                        float f14 = f4;
                        float f15 = f12;
                        float fMin = Math.min(particle.currentTime + f12, particle.lifeTime);
                        particle.currentTime = fMin;
                        float f16 = particle.x;
                        float f17 = particle.y;
                        boolean z = f16 < f14 || f16 > f6 || f17 < f5 || f17 > f7;
                        if (fMin >= particle.lifeTime || z) {
                            if (stack.size() < i6) {
                                stack.push(particle);
                            }
                            int i9 = i8 - 1;
                            if (i7 != i9) {
                                arrayList.set(i7, (SpoilerEffect.Particle) arrayList.get(i9));
                            }
                            arrayList.remove(i9);
                            size = i8 - 1;
                            i7--;
                        } else {
                            float f18 = particle.velocity * f13;
                            particle.x = (particle.vecX * f18) + f16;
                            particle.y = (particle.vecY * f18) + f17;
                            size = i8;
                        }
                        i7++;
                        f4 = f14;
                        f12 = f15;
                    }
                    float f19 = f4;
                    int size2 = arrayList.size();
                    if (size2 < i6) {
                        int i10 = i6 - size2;
                        int iMin2 = Math.min(i10, 14);
                        float[] fArr3 = spoilerEffect.particleRands;
                        float f20 = -1.0f;
                        Arrays.fill(fArr3, 0, iMin2, -1.0f);
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i10) {
                            float fNextFloat = fArr3[i12];
                            if (fNextFloat == f20) {
                                fNextFloat = Utilities.fastRandom.nextFloat();
                                fArr3[i12] = fNextFloat;
                            }
                            float f21 = fNextFloat;
                            int i13 = i12 + 1;
                            int i14 = i11;
                            if (i13 == 14) {
                                i13 = 0;
                            }
                            SpoilerEffect.Particle particle2 = !stack.isEmpty() ? (SpoilerEffect.Particle) stack.pop() : new SpoilerEffect.Particle();
                            int i15 = 0;
                            while (true) {
                                i4 = i13;
                                particle2.x = (Utilities.fastRandom.nextFloat() * fWidth) + f2;
                                float fNextFloat2 = (Utilities.fastRandom.nextFloat() * fHeight) + f3;
                                particle2.y = fNextFloat2;
                                int i16 = i15 + 1;
                                fArr = fArr3;
                                float f22 = particle2.x;
                                if ((f22 >= f19 && f22 <= f6 && fNextFloat2 >= f5 && fNextFloat2 <= f7) || i16 >= 4) {
                                    break;
                                }
                                fArr3 = fArr;
                                i15 = i16;
                                i13 = i4;
                            }
                            double d = ((((double) f21) * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            particle2.vecX = (float) Math.cos(d);
                            particle2.vecY = (float) Math.sin(d);
                            particle2.currentTime = 0.0f;
                            particle2.lifeTime = Utilities.fastRandom.nextInt(2000) + 1000;
                            particle2.velocity = (f21 * 6.0f) + 4.0f;
                            particle2.alpha = Utilities.fastRandom.nextInt(length2);
                            arrayList.add(particle2);
                            i11 = i14 + 1;
                            fArr3 = fArr;
                            i12 = i4;
                            f20 = -1.0f;
                        }
                        size2 = arrayList.size();
                    }
                    int i17 = 0;
                    while (true) {
                        iArr = spoilerEffect.renderCount;
                        if (i17 >= length2) {
                            break;
                        }
                        iArr[i17] = 0;
                        i17++;
                    }
                    int i18 = spoilerEffect.bitmapSize;
                    int i19 = 0;
                    while (i19 < size2) {
                        SpoilerEffect.Particle particle3 = (SpoilerEffect.Particle) arrayList.get(i19);
                        float f23 = particle3.x;
                        float f24 = particle3.y;
                        if (f23 < f8 || f23 > f10 || f24 < f9 || f24 > f11) {
                            i = size2;
                            iArr2 = iArr;
                        } else {
                            int i20 = particle3.alpha;
                            float[] fArr4 = SpoilerEffect.particlePoints[i20];
                            int i21 = iArr[i20];
                            int i22 = i21 + 1;
                            if (i22 >= fArr4.length) {
                                i = size2;
                                iArr2 = iArr;
                            } else {
                                fArr4[i21] = f23;
                                fArr4[i22] = f24;
                                int i23 = i21 + 2;
                                float f25 = spoilerEffect.halfStrokeWidths[i20];
                                if (f23 < f25) {
                                    i = size2;
                                    int i24 = i21 + 3;
                                    iArr2 = iArr;
                                    if (i24 < fArr4.length) {
                                        fArr4[i23] = i18 + f23;
                                        fArr4[i24] = f24;
                                        i23 = i21 + 4;
                                    }
                                } else {
                                    i = size2;
                                    iArr2 = iArr;
                                }
                                float f26 = i18;
                                float f27 = f26 - f25;
                                if (f23 > f27) {
                                    int i25 = i23 + 1;
                                    f = f26;
                                    if (i25 < fArr4.length) {
                                        fArr4[i23] = f23 - f;
                                        fArr4[i25] = f24;
                                        i23 += 2;
                                    }
                                } else {
                                    f = f26;
                                }
                                if (f24 < f25 && (i3 = i23 + 1) < fArr4.length) {
                                    fArr4[i23] = f23;
                                    fArr4[i3] = f24 + f;
                                    i23 += 2;
                                }
                                if (f24 > f27 && (i2 = i23 + 1) < fArr4.length) {
                                    fArr4[i23] = f23;
                                    fArr4[i2] = f24 - f;
                                    i23 += 2;
                                }
                                iArr2[i20] = i23;
                            }
                        }
                        i19++;
                        size2 = i;
                        iArr = iArr2;
                    }
                    int[] iArr3 = iArr;
                    for (int i26 = 0; i26 < length2; i26++) {
                        zzbv zzbvVar2 = zzbvVarArr[i26];
                        float[] fArr5 = SpoilerEffect.particlePoints[i26];
                        int i27 = iArr3[i26];
                        int i28 = zzbvVar2.zzb + i27;
                        float[] fArr6 = (float[]) zzbvVar2.zza;
                        if (i28 > fArr6.length) {
                            zzbvVar2.zza = Arrays.copyOf((float[]) zzbvVar2.zza, Math.max(i28, fArr6.length * 2));
                        }
                        System.arraycopy(fArr5, 0, (float[]) zzbvVar2.zza, zzbvVar2.zzb, i27);
                        zzbvVar2.zzb += i27;
                    }
                }
            }
        }
        SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.shaderSpoilerEffects.get(0);
        spoilerEffect2.getClass();
        if (zzbvVarArr == null || zzbvVarArr.length != SpoilerEffect.ALPHAS.length) {
            return;
        }
        for (int i29 = 0; i29 < SpoilerEffect.ALPHAS.length; i29++) {
            zzbv zzbvVar3 = zzbvVarArr[i29];
            Paint paint = spoilerEffect2.particlePaints[i29];
            int i30 = zzbvVar3.zzb;
            if (i30 > 0) {
                canvas.drawPoints((float[]) zzbvVar3.zza, 0, i30, paint);
            }
        }
    }
}
