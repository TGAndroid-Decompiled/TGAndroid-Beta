package org.telegram.ui.Components;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class wl {

    public final ArrayList f34280a = new ArrayList();

    public final HashMap f34281b = new HashMap();

    public int f34282c;
    public int d;

    public int f34283e;

    public float f34284f;

    public final ArrayList f34285g;
    public final em h;

    public wl(em emVar, ArrayList arrayList) {
        this.h = emVar;
        this.f34285g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return 1000.0f / f10;
    }

    public final void a() {
        float f10;
        float f11;
        boolean zBooleanValue;
        int iE;
        boolean z10;
        ArrayList arrayList = this.f34285g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f34280a;
        arrayList2.clear();
        HashMap map = this.f34281b;
        map.clear();
        if (size == 0) {
            this.f34282c = 0;
            this.f34284f = 0.0f;
            this.d = 0;
            this.f34283e = 0;
            return;
        }
        arrayList2.ensureCapacity(size);
        char[] cArr = new char[size];
        int i10 = 0;
        float f12 = 1.0f;
        boolean z11 = false;
        while (i10 < size) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePosition.last = i10 == size + (-1);
            MediaController.CropState cropState = photoEntry.cropState;
            int i11 = cropState != null ? cropState.width : photoEntry.width;
            int i12 = cropState != null ? cropState.height : photoEntry.height;
            HashMap map2 = em.Q;
            if (map2.containsKey(photoEntry)) {
                zBooleanValue = ((Boolean) map2.get(photoEntry)).booleanValue();
            } else {
                try {
                    if (photoEntry.isVideo) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(photoEntry.path);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                        if (strExtractMetadata == null || !(strExtractMetadata.equals("90") || strExtractMetadata.equals("270"))) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        r1.g gVar = new r1.g(photoEntry.path);
                        r1.c cVarC = gVar.c("Orientation");
                        if (cVarC == null) {
                            iE = 1;
                        } else {
                            try {
                                iE = cVarC.e(gVar.f46690g);
                            } catch (NumberFormatException unused) {
                                iE = 1;
                            }
                        }
                        if (iE == 6 || iE == 8) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    zBooleanValue = z10;
                } catch (Exception unused2) {
                    zBooleanValue = false;
                }
                em.Q.put(photoEntry, Boolean.valueOf(zBooleanValue));
            }
            if (zBooleanValue) {
                int i13 = i11;
                i11 = i12;
                i12 = i13;
            }
            float f13 = i11 / i12;
            groupedMessagePosition.aspectRatio = f13;
            cArr[i10] = f13 > 1.2f ? 'w' : f13 < 0.8f ? 'n' : 'q';
            f12 += f13;
            if (f13 > 2.0f) {
                z11 = true;
            }
            map.put(photoEntry, groupedMessagePosition);
            arrayList2.add(groupedMessagePosition);
            i10++;
        }
        String str = new String(cArr);
        int iDp = AndroidUtilities.dp(120.0f);
        float fDp = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) (fDp / (Math.min(point.x, point.y) / 1000.0f));
        float fDp2 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int iMin2 = (int) (fDp2 / (Math.min(point2.x, point2.y) / 1000.0f));
        float f14 = f12 / size;
        float fDp3 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (size == 1) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (this.h.f34900b.getBackgroundPaddingLeft() * 2);
            Point point3 = AndroidUtilities.displaySize;
            groupedMessagePosition2.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition2.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
        } else if (z11 || !(size == 2 || size == 3 || size == 4)) {
            int size2 = arrayList2.size();
            float[] fArr = new float[size2];
            for (int i14 = 0; i14 < size; i14++) {
                if (f14 > 1.1f) {
                    fArr[i14] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i14)).aspectRatio);
                } else {
                    fArr[i14] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i14)).aspectRatio);
                }
                fArr[i14] = Math.max(0.66667f, Math.min(1.7f, fArr[i14]));
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i15 = 1; i15 < size2; i15++) {
                int i16 = size2 - i15;
                if (i15 <= 3 && i16 <= 3) {
                    float fB = b(fArr, 0, i15);
                    float fB2 = b(fArr, i15, size2);
                    vl vlVar = new vl();
                    vlVar.f33438a = new int[]{i15, i16};
                    vlVar.f33439b = new float[]{fB, fB2};
                    arrayList3.add(vlVar);
                }
            }
            for (int i17 = 1; i17 < size2 - 1; i17++) {
                int i18 = 1;
                while (true) {
                    int i19 = size2 - i17;
                    if (i18 < i19) {
                        int i20 = i19 - i18;
                        if (i17 <= 3) {
                            if (i18 <= (f14 < 0.85f ? 4 : 3) && i20 <= 3) {
                                float fB3 = b(fArr, 0, i17);
                                int i21 = i17 + i18;
                                float fB4 = b(fArr, i17, i21);
                                float fB5 = b(fArr, i21, size2);
                                vl vlVar2 = new vl();
                                vlVar2.f33438a = new int[]{i17, i18, i20};
                                vlVar2.f33439b = new float[]{fB3, fB4, fB5};
                                arrayList3.add(vlVar2);
                            }
                        }
                        i18++;
                    }
                }
            }
            for (int i22 = 1; i22 < size2 - 2; i22++) {
                int i23 = 1;
                while (true) {
                    int i24 = size2 - i22;
                    if (i23 < i24) {
                        int i25 = 1;
                        while (true) {
                            int i26 = i24 - i23;
                            if (i25 < i26) {
                                int i27 = i26 - i25;
                                if (i22 <= 3 && i23 <= 3 && i25 <= 3 && i27 <= 3) {
                                    float fB6 = b(fArr, 0, i22);
                                    int i28 = i22 + i23;
                                    float fB7 = b(fArr, i22, i28);
                                    int i29 = i28 + i25;
                                    float fB8 = b(fArr, i28, i29);
                                    float fB9 = b(fArr, i29, size2);
                                    vl vlVar3 = new vl();
                                    vlVar3.f33438a = new int[]{i22, i23, i25, i27};
                                    vlVar3.f33439b = new float[]{fB6, fB7, fB8, fB9};
                                    arrayList3.add(vlVar3);
                                }
                                i25++;
                                size2 = size2;
                            }
                        }
                        i23++;
                    }
                }
            }
            float f15 = 0.0f;
            vl vlVar4 = null;
            for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                vl vlVar5 = (vl) arrayList3.get(i30);
                float f16 = Float.MAX_VALUE;
                float f17 = 0.0f;
                int i31 = 0;
                while (true) {
                    float[] fArr2 = vlVar5.f33439b;
                    if (i31 >= fArr2.length) {
                        break;
                    }
                    float f18 = fArr2[i31];
                    f17 += f18;
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i31++;
                }
                float fAbs = Math.abs(f17 - 1332.0f);
                int[] iArr = vlVar5.f33438a;
                if (iArr.length > 1) {
                    int i32 = iArr[0];
                    int i33 = iArr[1];
                    if (i32 <= i33) {
                        f10 = fAbs;
                        if (iArr.length <= 2 || i33 <= iArr[2]) {
                            if (iArr.length <= 3 || iArr[2] <= iArr[3]) {
                            }
                            if (f16 < iMin) {
                                f11 *= 1.5f;
                            }
                            if (vlVar4 != null || f11 < f15) {
                                f15 = f11;
                                vlVar4 = vlVar5;
                            }
                        }
                        f11 = f10 * 1.2f;
                        if (f16 < iMin) {
                            f11 *= 1.5f;
                        }
                        if (vlVar4 != null) {
                            f15 = f11;
                            vlVar4 = vlVar5;
                        } else {
                            f15 = f11;
                            vlVar4 = vlVar5;
                        }
                    } else {
                        f10 = fAbs;
                    }
                    f11 = f10 * 1.2f;
                    if (f16 < iMin) {
                        f11 *= 1.5f;
                    }
                    if (vlVar4 != null) {
                        f15 = f11;
                        vlVar4 = vlVar5;
                    } else {
                        f15 = f11;
                        vlVar4 = vlVar5;
                    }
                } else {
                    f10 = fAbs;
                }
                f11 = f10;
                if (f16 < iMin) {
                    f11 *= 1.5f;
                }
                if (vlVar4 != null) {
                    f15 = f11;
                    vlVar4 = vlVar5;
                } else {
                    f15 = f11;
                    vlVar4 = vlVar5;
                }
            }
            if (vlVar4 == null) {
                return;
            }
            int[] iArr2 = vlVar4.f33438a;
            int i34 = 0;
            int i35 = 0;
            while (i34 < iArr2.length) {
                int i36 = iArr2[i34];
                float f19 = vlVar4.f33439b[i34];
                int i37 = 0;
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                int i38 = 1000;
                while (i37 < i36) {
                    int i39 = (int) (fArr[i35] * f19);
                    i38 -= i39;
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(i35);
                    int i40 = i34 == 0 ? 4 : 0;
                    float[] fArr3 = fArr;
                    if (i34 == iArr2.length - 1) {
                        i40 |= 8;
                    }
                    if (i37 == 0) {
                        i40 |= 1;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    if (i37 == i36 - 1) {
                        i40 |= 2;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    int i41 = i37;
                    groupedMessagePosition4.set(i41, i37, i34, i34, i39, Math.max(fDp3, f19 / 814.0f), i40);
                    i35++;
                    i37 = i41 + 1;
                    fArr = fArr3;
                }
                int i42 = i34;
                float[] fArr4 = fArr;
                if (groupedMessagePosition3 != null) {
                    groupedMessagePosition3.pw += i38;
                    groupedMessagePosition3.spanSize += i38;
                }
                i34 = i42 + 1;
                fArr = fArr4;
            }
        } else if (size == 2) {
            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            if (str.equals("ww") && f14 > ((double) 1.2285012f) * 1.4d) {
                float f20 = groupedMessagePosition5.aspectRatio;
                float f21 = groupedMessagePosition6.aspectRatio;
                if (f20 - f21 < 0.2d) {
                    float fRound = Math.round(Math.min(1000.0f / f20, Math.min(1000.0f / f21, 407.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, 1000, fRound, 7);
                    groupedMessagePosition6.set(0, 0, 1, 1, 1000, fRound, 11);
                } else if (str.equals("ww")) {
                    float f22 = 500;
                    float fRound2 = Math.round(Math.min(f22 / groupedMessagePosition5.aspectRatio, Math.min(f22 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, 500, fRound2, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, 500, fRound2, 14);
                } else {
                    float f23 = 500;
                    float fRound3 = Math.round(Math.min(f23 / groupedMessagePosition5.aspectRatio, Math.min(f23 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, 500, fRound3, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, 500, fRound3, 14);
                }
            } else if (str.equals("ww") || str.equals("qq")) {
                float f24 = 500;
                float fRound4 = Math.round(Math.min(f24 / groupedMessagePosition5.aspectRatio, Math.min(f24 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                groupedMessagePosition5.set(0, 0, 0, 0, 500, fRound4, 13);
                groupedMessagePosition6.set(1, 1, 0, 0, 500, fRound4, 14);
            } else {
                float f25 = groupedMessagePosition5.aspectRatio;
                int iMax = (int) Math.max(400.0f, Math.round((1000.0f / f25) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f25))));
                int i43 = 1000 - iMax;
                if (i43 < iMin) {
                    iMax -= iMin - i43;
                } else {
                    iMin = i43;
                }
                float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition5.aspectRatio, iMax / groupedMessagePosition6.aspectRatio))) / 814.0f;
                groupedMessagePosition5.set(0, 0, 0, 0, iMin, fMin, 13);
                groupedMessagePosition6.set(1, 1, 0, 0, iMax, fMin, 14);
            }
        } else if (size == 3) {
            MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
            if (str.charAt(0) == 'n') {
                float f26 = groupedMessagePosition8.aspectRatio;
                float fMin2 = Math.min(407.0f, Math.round((f26 * 1000.0f) / (groupedMessagePosition9.aspectRatio + f26)));
                float f27 = 814.0f - fMin2;
                int iMax2 = (int) Math.max(iMin, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * fMin2, groupedMessagePosition8.aspectRatio * f27))));
                float f28 = (groupedMessagePosition7.aspectRatio * 814.0f) + iMin2;
                int i44 = 1000 - iMax2;
                groupedMessagePosition7.set(0, 0, 0, 1, Math.round(Math.min(f28, i44)), 1.0f, 13);
                float f29 = f27 / 814.0f;
                groupedMessagePosition8.set(1, 1, 0, 0, iMax2, f29, 6);
                float f30 = fMin2 / 814.0f;
                groupedMessagePosition9.set(1, 1, 1, 1, iMax2, f30, 10);
                groupedMessagePosition9.spanSize = 1000;
                groupedMessagePosition7.siblingHeights = new float[]{f30, f29};
                groupedMessagePosition7.spanSize = i44;
            } else {
                float fRound5 = Math.round(Math.min(1000.0f / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition7.set(0, 1, 0, 0, 1000, fRound5, 7);
                float f31 = 500;
                float fMin3 = Math.min(814.0f - fRound5, Math.round(Math.min(f31 / groupedMessagePosition8.aspectRatio, f31 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                float f32 = fMin3 < fDp3 ? fDp3 : fMin3;
                groupedMessagePosition8.set(0, 0, 1, 1, 500, f32, 9);
                groupedMessagePosition9.set(1, 1, 1, 1, 500, f32, 10);
            }
        } else {
            MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
            MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
            if (str.charAt(0) == 'w') {
                float fRound6 = Math.round(Math.min(1000.0f / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition10.set(0, 2, 0, 0, 1000, fRound6, 7);
                float fRound7 = Math.round(1000.0f / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                float f33 = iMin;
                int iMax3 = (int) Math.max(f33, Math.min(400.0f, groupedMessagePosition11.aspectRatio * fRound7));
                int iMax4 = (int) Math.max(Math.max(f33, 330.0f), groupedMessagePosition13.aspectRatio * fRound7);
                int iDp2 = (1000 - iMax3) - iMax4;
                if (iDp2 < AndroidUtilities.dp(58.0f)) {
                    int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                    iDp2 = AndroidUtilities.dp(58.0f);
                    int i45 = iDp3 / 2;
                    iMax3 -= i45;
                    iMax4 -= iDp3 - i45;
                }
                int i46 = iMax3;
                float fMin4 = Math.min(814.0f - fRound6, fRound7) / 814.0f;
                float f34 = fMin4 < fDp3 ? fDp3 : fMin4;
                groupedMessagePosition11.set(0, 0, 1, 1, i46, f34, 9);
                groupedMessagePosition12.set(1, 1, 1, 1, iDp2, f34, 8);
                groupedMessagePosition13.set(2, 2, 1, 1, iMax4, f34, 10);
            } else {
                int iMax5 = Math.max(iMin, Math.round(814.0f / ((1.0f / groupedMessagePosition13.aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                float f35 = iDp;
                float f36 = iMax5;
                float fMin5 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition11.aspectRatio) / 814.0f);
                float fMin6 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition12.aspectRatio) / 814.0f);
                float f37 = (1.0f - fMin5) - fMin6;
                float f38 = (groupedMessagePosition10.aspectRatio * 814.0f) + iMin2;
                int i47 = 1000 - iMax5;
                groupedMessagePosition10.set(0, 0, 0, 2, Math.round(Math.min(f38, i47)), fMin5 + fMin6 + f37, 13);
                groupedMessagePosition11.set(1, 1, 0, 0, iMax5, fMin5, 6);
                groupedMessagePosition12.set(1, 1, 1, 1, iMax5, fMin6, 2);
                groupedMessagePosition12.spanSize = 1000;
                groupedMessagePosition13.set(1, 1, 2, 2, iMax5, f37, 10);
                groupedMessagePosition13.spanSize = 1000;
                groupedMessagePosition10.spanSize = i47;
                groupedMessagePosition10.siblingHeights = new float[]{fMin5, fMin6, f37};
            }
        }
        int i48 = 0;
        while (i48 < size) {
            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i48);
            if (groupedMessagePosition14.minX == 0) {
                groupedMessagePosition14.spanSize += 200;
            }
            if ((groupedMessagePosition14.flags & 2) != 0) {
                groupedMessagePosition14.edge = true;
            }
            this.d = Math.max(this.d, (int) groupedMessagePosition14.maxX);
            this.f34283e = Math.max(this.f34283e, (int) groupedMessagePosition14.maxY);
            byte b10 = groupedMessagePosition14.minY;
            byte b11 = groupedMessagePosition14.maxY;
            byte b12 = groupedMessagePosition14.minX;
            int i49 = (b11 - b10) + 1;
            float[] fArr5 = new float[i49];
            Arrays.fill(fArr5, 0.0f);
            int size3 = arrayList2.size();
            int i50 = 0;
            while (i50 < size3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i50);
                if (groupedMessagePosition15 != groupedMessagePosition14 && groupedMessagePosition15.maxX < b12) {
                    int iMin3 = Math.min((int) groupedMessagePosition15.maxY, (int) b11) - b10;
                    int iMax6 = Math.max(groupedMessagePosition15.minY - b10, 0);
                    while (iMax6 <= iMin3) {
                        fArr5[iMax6] = fArr5[iMax6] + groupedMessagePosition15.pw;
                        iMax6++;
                        i48 = i48;
                    }
                }
                i50++;
                i48 = i48;
            }
            int i51 = i48;
            float f39 = 0.0f;
            for (int i52 = 0; i52 < i49; i52++) {
                float f40 = fArr5[i52];
                if (f39 < f40) {
                    f39 = f40;
                }
            }
            groupedMessagePosition14.left = f39;
            i48 = i51 + 1;
        }
        for (int i53 = 0; i53 < size; i53++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i53);
            byte b13 = groupedMessagePosition16.minY;
            int i54 = this.d + 1;
            float[] fArr6 = new float[i54];
            Arrays.fill(fArr6, 0.0f);
            int size4 = arrayList2.size();
            for (int i55 = 0; i55 < size4; i55++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i55);
                if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxY < b13) {
                    for (int i56 = groupedMessagePosition17.minX; i56 <= groupedMessagePosition17.maxX; i56++) {
                        fArr6[i56] = fArr6[i56] + groupedMessagePosition17.f19619ph;
                    }
                }
            }
            float f41 = 0.0f;
            for (int i57 = 0; i57 < i54; i57++) {
                float f42 = fArr6[i57];
                if (f41 < f42) {
                    f41 = f42;
                }
            }
            groupedMessagePosition16.top = f41;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i58 = 0; i58 < size5; i58++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i58);
            int i59 = groupedMessagePosition18.pw;
            for (int i60 = groupedMessagePosition18.minY; i60 <= groupedMessagePosition18.maxY; i60++) {
                iArr3[i60] = iArr3[i60] + i59;
            }
        }
        int i61 = iArr3[0];
        for (int i62 = 1; i62 < 10; i62++) {
            int i63 = iArr3[i62];
            if (i61 < i63) {
                i61 = i63;
            }
        }
        this.f34282c = i61;
        float[] fArr7 = new float[10];
        Arrays.fill(fArr7, 0.0f);
        int size6 = arrayList2.size();
        for (int i64 = 0; i64 < size6; i64++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i64);
            float f43 = groupedMessagePosition19.f19619ph;
            for (int i65 = groupedMessagePosition19.minX; i65 <= groupedMessagePosition19.maxX; i65++) {
                fArr7[i65] = fArr7[i65] + f43;
            }
        }
        float f44 = fArr7[0];
        for (int i66 = 1; i66 < 10; i66++) {
            float f45 = fArr7[i66];
            if (f44 < f45) {
                f44 = f45;
            }
        }
        this.f34284f = f44;
    }
}
