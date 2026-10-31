package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px0 implements Runnable {
    public final int f40801a;
    public final Object f40802b;
    public final Object f40803c;
    public final Object d;
    public final Object e;

    public px0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40801a = i10;
        this.f40803c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40802b = obj4;
    }

    private final void a() {
        vh.k4 k4Var = (vh.k4) this.f40803c;
        Bitmap[] bitmapArr = (Bitmap[]) this.d;
        vh.n5 n5Var = (vh.n5) this.e;
        boolean[] zArr = (boolean[]) this.f40802b;
        org.telegram.ui.Components.s9 s9Var = k4Var.G;
        Bitmap bitmap = k4Var.f51401a;
        if (bitmap != null && !bitmap.isRecycled()) {
            k4Var.f51401a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        k4Var.f51401a = bitmap2;
        if (n5Var != null && !n5Var.f51520c && n5Var.K && bitmap2 != null) {
            n5Var.f51537k0 = bitmap2.getWidth();
            n5Var.f51539l0 = k4Var.f51401a.getHeight();
            n5Var.A();
        }
        if (zArr[0] && n5Var != null && s9Var != null && k4Var.f51401a != null) {
            s9Var.e();
            s9Var.f(n5Var.b(0.2f, k4Var.f51401a), false);
            vh.y6 y6Var = k4Var.f51429w;
            if (y6Var != null) {
                y6Var.run();
            }
        }
        k4Var.r();
        k4Var.invalidate();
    }

    private final void b() {
        String path;
        String path2;
        String path3;
        String path4;
        int i10;
        long j10;
        float f7;
        float f10;
        int i11;
        long j11;
        long j12;
        int[] iArr;
        int i12;
        String path5;
        ArrayList arrayList;
        vh.n5 n5Var = (vh.n5) this.f40803c;
        String str = (String) this.d;
        int[][] iArr2 = (int[][]) this.e;
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f40802b;
        n5Var.getClass();
        org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
        char c10 = 1;
        x20Var.J = true;
        x20Var.f19184a0 = n5Var.f51522c1;
        x20Var.h = n5Var.f51537k0;
        x20Var.f19190i = n5Var.f51539l0;
        x20Var.f19192k = n5Var.f51533i0;
        x20Var.f19193l = n5Var.f51535j0;
        File file = n5Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        x20Var.B = path;
        File file2 = n5Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        x20Var.D = path2;
        File file3 = n5Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        x20Var.E = path3;
        File file4 = n5Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        x20Var.F = path4;
        int v = MediaController.v(x20Var.f19192k, x20Var.f19193l, x20Var.f19194m, true);
        if (n5Var.K && str != null && !n5Var.v()) {
            x20Var.f19196o = str;
            x20Var.I = false;
            x20Var.f19195n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            x20Var.f19191j = E;
            if (E < 1000000 && (arrayList = n5Var.T0) != null && !arrayList.isEmpty()) {
                x20Var.f19194m = 2000000;
                x20Var.f19191j = -1;
            } else {
                int i13 = x20Var.f19191j;
                if (i13 < 500000) {
                    x20Var.f19194m = 2500000;
                    x20Var.f19191j = -1;
                } else {
                    x20Var.f19194m = Utilities.j(i13, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(x20Var.f19191j);
            sb2.append(" => ");
            i0.a.p(x20Var.f19194m, sb2);
            long j13 = iArr2[0][4];
            n5Var.f51531h0 = j13;
            x20Var.v = j13 * 1000;
            float f11 = (float) j13;
            long j14 = n5Var.Z * f11 * 1000;
            x20Var.f19183a = j14;
            long j15 = n5Var.f51515a0 * f11 * 1000;
            x20Var.f19185b = j15;
            x20Var.f19199r = j15 - j14;
            x20Var.f19202u = n5Var.P;
            x20Var.f19201t = n5Var.Y;
            x20Var.f19198q = a1.g.A(i12 / 1000.0f, v, 8.0f, iArr[5]);
            x20Var.f19198q = Math.max(n5Var.L.length(), x20Var.f19198q);
            x20Var.A = n5Var.f51516a1;
            File file5 = n5Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            x20Var.C = path5;
            j10 = 0;
        } else {
            File file6 = n5Var.Z0;
            if (file6 != null) {
                x20Var.f19196o = file6.getAbsolutePath();
            } else {
                x20Var.f19196o = str;
            }
            x20Var.I = true;
            x20Var.L = n5Var.S;
            if (n5Var.v()) {
                int i14 = 0;
                boolean z10 = false;
                while (i14 < n5Var.T.size()) {
                    vh.n5 n5Var2 = (vh.n5) n5Var.T.get(i14);
                    if (n5Var2.K) {
                        n5Var2.f51537k0 = Math.max(n5Var2.f51537k0, iArr2[i14][c10]);
                        n5Var2.f51539l0 = Math.max(n5Var2.f51539l0, iArr2[i14][2]);
                        i11 = v;
                        n5Var2.f51531h0 = Math.max(n5Var2.f51531h0, iArr2[i14][4]);
                        z10 = true;
                    } else {
                        i11 = v;
                    }
                    i14++;
                    v = i11;
                    c10 = 1;
                }
                i10 = v;
                ArrayList a2 = org.telegram.messenger.w20.a(n5Var);
                x20Var.M = a2;
                if (!z10) {
                    long j16 = n5Var.S0;
                    n5Var.f51531h0 = j16;
                    x20Var.v = j16;
                    x20Var.f19199r = j16;
                } else {
                    int size = a2.size();
                    long j17 = 0;
                    org.telegram.messenger.w20 w20Var = null;
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = a2.get(i15);
                        i15++;
                        org.telegram.messenger.w20 w20Var2 = (org.telegram.messenger.w20) obj;
                        if (w20Var2.f19046b) {
                            long j18 = w20Var2.f19054o;
                            if (j18 > j17) {
                                w20Var = w20Var2;
                                j17 = j18;
                            }
                        }
                    }
                    if (w20Var != null) {
                        long j19 = (w20Var.f19051k - w20Var.f19050j) * ((float) w20Var.f19054o);
                        n5Var.f51531h0 = j19;
                        x20Var.v = j19;
                        x20Var.f19199r = j19;
                        j10 = -(w20Var.f19048f + (f10 * f7));
                        w20Var.f19048f = j10;
                        ArrayList arrayList2 = x20Var.M;
                        int size2 = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj2 = arrayList2.get(i16);
                            i16++;
                            org.telegram.messenger.w20 w20Var3 = (org.telegram.messenger.w20) obj2;
                            if (w20Var3.f19046b && w20Var3 != w20Var) {
                                w20Var3.f19048f += j10;
                            }
                        }
                        x20Var.f19183a = -1L;
                        x20Var.f19185b = -1L;
                        x20Var.f19201t = true;
                        x20Var.f19191j = -1;
                        x20Var.f19202u = 1.0f;
                        x20Var.f19194m = -1;
                        x20Var.f19195n = 30;
                        x20Var.f19198q = ((((float) n5Var.f51531h0) / 1000.0f) * i10) / 8.0f;
                        x20Var.A = null;
                    }
                }
            } else {
                i10 = v;
                if (n5Var.f51544o0 != null) {
                    long j20 = (n5Var.f51554t0 - n5Var.f51552s0) * ((float) n5Var.f51548q0);
                    n5Var.f51531h0 = j20;
                    x20Var.v = j20;
                    x20Var.f19199r = j20;
                } else if (n5Var.f51562y != null) {
                    long j21 = (n5Var.F - n5Var.E) * ((float) n5Var.C);
                    n5Var.f51531h0 = j21;
                    x20Var.v = j21;
                    x20Var.f19199r = j21;
                } else {
                    long j22 = n5Var.S0;
                    n5Var.f51531h0 = j22;
                    x20Var.v = j22;
                    x20Var.f19199r = j22;
                }
            }
            j10 = 0;
            x20Var.f19183a = -1L;
            x20Var.f19185b = -1L;
            x20Var.f19201t = true;
            x20Var.f19191j = -1;
            x20Var.f19202u = 1.0f;
            x20Var.f19194m = -1;
            x20Var.f19195n = 30;
            x20Var.f19198q = ((((float) n5Var.f51531h0) / 1000.0f) * i10) / 8.0f;
            x20Var.A = null;
        }
        x20Var.S = n5Var.f51514a;
        x20Var.U = n5Var.f51565z0;
        x20Var.T = n5Var.f51563y0;
        x20Var.f19187c = -1L;
        org.telegram.messenger.ye yeVar = n5Var.m0;
        if (yeVar != null) {
            x20Var.H = yeVar.clone();
        } else {
            x20Var.H = new org.telegram.messenger.ye();
        }
        x20Var.H.B = new Matrix();
        x20Var.H.B.set(n5Var.f51542n0);
        x20Var.G = n5Var.T0;
        x20Var.Q = Integer.valueOf(n5Var.A0);
        x20Var.R = Integer.valueOf(n5Var.B0);
        x20Var.V = true;
        x20Var.K = n5Var.f51524d1;
        x20Var.f19186b0.clear();
        if (n5Var.v() && !n5Var.Y) {
            ArrayList arrayList3 = x20Var.M;
            int size3 = arrayList3.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                org.telegram.messenger.w20 w20Var4 = (org.telegram.messenger.w20) obj3;
                if (w20Var4.f19046b && w20Var4.e > 0.0f && !w20Var4.f19047c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(w20Var4.d);
                    mixedSoundInfo.volume = w20Var4.e;
                    float f12 = w20Var4.f19050j;
                    float f13 = (float) w20Var4.f19054o;
                    mixedSoundInfo.audioOffset = f12 * f13 * 1000;
                    mixedSoundInfo.startTime = w20Var4.f19048f * 1000;
                    mixedSoundInfo.duration = (w20Var4.f19051k - f12) * f13 * 1000;
                    x20Var.f19186b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = n5Var.f51544o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = n5Var.f51556u0;
            float f14 = n5Var.f51552s0;
            float f15 = (float) n5Var.f51548q0;
            long j23 = f14 * f15 * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (n5Var.K) {
                mixedSoundInfo2.startTime = (((float) n5Var.f51550r0) - (n5Var.Z * ((float) n5Var.f51531h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = (n5Var.f51554t0 - f14) * f15 * 1000;
            x20Var.f19186b0.add(mixedSoundInfo2);
        }
        String str2 = n5Var.f51562y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = n5Var.G;
            float f16 = n5Var.E;
            float f17 = (float) n5Var.C;
            long j25 = f16 * f17 * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (n5Var.K) {
                mixedSoundInfo3.startTime = (((float) n5Var.D) - (n5Var.Z * ((float) n5Var.f51531h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = (n5Var.F - f16) * f17 * 1000;
            x20Var.f19186b0.add(mixedSoundInfo3);
        }
        q20Var.a(x20Var);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.px0.run():void");
    }

    public px0(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, int i10) {
        this.f40801a = i10;
        this.f40803c = obj;
        this.d = obj2;
        this.f40802b = tL_error;
        this.e = obj3;
    }

    public px0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, int i10) {
        this.f40801a = i10;
        this.f40803c = obj;
        this.f40802b = tL_error;
        this.d = obj2;
        this.e = obj3;
    }

    public px0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        this.f40801a = 8;
        this.f40803c = twoStepVerificationActivity;
        this.e = bArr;
        this.d = tLObject;
        this.f40802b = bArr2;
    }
}
