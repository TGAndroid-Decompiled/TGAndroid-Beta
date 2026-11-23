package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z5 {
    public final int[] f28258a;
    public final long[] f28259b;
    public boolean f28260c;
    public boolean d;
    public boolean f28261e;
    public boolean f28262f;
    public boolean f28263g;
    public int h;

    public z5(int[] iArr, long j3, long j10, long j11, boolean z10, boolean z11, boolean z12, boolean z13, int i7, boolean z14) {
        int[] iArr2 = new int[4];
        this.f28258a = iArr2;
        this.f28259b = r2;
        System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, 4));
        long[] jArr = {j3, j10, j11, 524288};
        this.f28260c = z10;
        this.d = z11;
        this.f28262f = z13;
        this.h = i7;
        this.f28263g = z12;
        this.f28261e = z14;
    }

    public final boolean a(z5 z5Var) {
        int[] iArr = this.f28258a;
        int i7 = iArr[0];
        int[] iArr2 = z5Var.f28258a;
        if (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            long[] jArr = this.f28259b;
            long j3 = jArr[0];
            long[] jArr2 = z5Var.f28259b;
            if (j3 == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.f28260c == z5Var.f28260c && this.d == z5Var.d && this.h == z5Var.h && this.f28261e == z5Var.f28261e) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int i7 = 0;
        while (true) {
            int[] iArr = this.f28258a;
            if (i7 >= iArr.length) {
                return false;
            }
            if (iArr[i7] != 0) {
                return true;
            }
            i7++;
        }
    }

    public final void c(z5 z5Var) {
        int[] iArr = z5Var.f28258a;
        int[] iArr2 = this.f28258a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        long[] jArr = z5Var.f28259b;
        long[] jArr2 = this.f28259b;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        this.f28260c = z5Var.f28260c;
        this.d = z5Var.d;
        this.f28262f = z5Var.f28262f;
        this.h = z5Var.h;
        this.f28261e = z5Var.f28261e;
    }

    public final void d(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
        this.d = tL_autoDownloadSettings.audio_preload_next;
        this.f28260c = tL_autoDownloadSettings.video_preload_large;
        this.f28262f = tL_autoDownloadSettings.phonecalls_less_data;
        this.h = tL_autoDownloadSettings.video_upload_maxbitrate;
        long[] jArr = this.f28259b;
        int i7 = 0;
        jArr[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
        jArr[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
        jArr[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
        while (true) {
            int[] iArr = this.f28258a;
            if (i7 < iArr.length) {
                if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i7] = iArr[i7] | 1;
                } else {
                    iArr[i7] = iArr[i7] & (-2);
                }
                if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i7] = iArr[i7] | 4;
                } else {
                    iArr[i7] = iArr[i7] & (-5);
                }
                if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i7] = iArr[i7] | 8;
                } else {
                    iArr[i7] = iArr[i7] & (-9);
                }
                i7++;
            } else {
                this.f28261e = true;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = this.f28258a;
        sb2.append(iArr[0]);
        sb2.append("_");
        sb2.append(iArr[1]);
        sb2.append("_");
        sb2.append(iArr[2]);
        sb2.append("_");
        sb2.append(iArr[3]);
        sb2.append("_");
        long[] jArr = this.f28259b;
        sb2.append(jArr[0]);
        sb2.append("_");
        sb2.append(jArr[1]);
        sb2.append("_");
        sb2.append(jArr[2]);
        sb2.append("_");
        sb2.append(jArr[3]);
        sb2.append("_");
        sb2.append(this.f28260c ? 1 : 0);
        sb2.append("_");
        sb2.append(this.d ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f28263g ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f28262f ? 1 : 0);
        sb2.append("_");
        sb2.append(this.h);
        sb2.append("_");
        sb2.append(this.f28261e ? 1 : 0);
        return sb2.toString();
    }

    public z5(String str, String str2) {
        String[] split;
        int[] iArr = new int[4];
        this.f28258a = iArr;
        long[] jArr = new long[4];
        this.f28259b = jArr;
        String[] split2 = str.split("_");
        if (split2.length >= 11) {
            iArr[0] = Utilities.z(split2[0]).intValue();
            iArr[1] = Utilities.z(split2[1]).intValue();
            iArr[2] = Utilities.z(split2[2]).intValue();
            iArr[3] = Utilities.z(split2[3]).intValue();
            jArr[0] = Utilities.z(split2[4]).intValue();
            jArr[1] = Utilities.z(split2[5]).intValue();
            jArr[2] = Utilities.z(split2[6]).intValue();
            jArr[3] = Utilities.z(split2[7]).intValue();
            this.f28260c = Utilities.z(split2[8]).intValue() == 1;
            this.d = Utilities.z(split2[9]).intValue() == 1;
            this.f28263g = Utilities.z(split2[10]).intValue() == 1;
            if (split2.length >= 12) {
                this.f28262f = Utilities.z(split2[11]).intValue() == 1;
                split = null;
            } else {
                split = str2.split("_");
                this.f28262f = Utilities.z(split[11]).intValue() == 1;
            }
            if (split2.length >= 13) {
                this.h = Utilities.z(split2[12]).intValue();
            } else {
                split = split == null ? str2.split("_") : split;
                this.h = Utilities.z(split[12]).intValue();
            }
            if (split2.length >= 14) {
                this.f28261e = Utilities.z(split2[13]).intValue() == 1;
            } else {
                this.f28261e = Utilities.z((split == null ? str2.split("_") : split)[13]).intValue() == 1;
            }
        }
    }
}
