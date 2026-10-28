package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
public final class ju extends org.telegram.ui.Components.nm0 {
    public static final int f40595x3 = 0;
    public boolean f40596f3;
    public int f40597g3;
    public final s4.c0 f40598h3;
    public final hu f40599i3;
    public final ArrayList f40600j3;
    public final ArrayList f40601k3;
    public final float[] f40602l3;
    public final int[] f40603m3;
    public final ArrayList f40604n3;
    public iu[] f40605o3;
    public iu[] f40606p3;
    public final boolean[] f40607q3;
    public long f40608r3;
    public long f40609s3;
    public long f40610t3;
    public boolean f40611u3;
    public gu f40612v3;
    public final nu f40613w3;

    public ju(nu nuVar, Activity activity) {
        super(activity, null);
        oi.q qVar;
        this.f40613w3 = nuVar;
        this.f40596f3 = false;
        this.f40597g3 = 0;
        this.f40600j3 = new ArrayList();
        this.f40601k3 = new ArrayList();
        this.f40602l3 = new float[7];
        this.f40603m3 = new int[7];
        this.f40604n3 = new ArrayList();
        this.f40607q3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.r2) nuVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.c0 c0Var = new s4.c0();
        this.f40598h3 = c0Var;
        setLayoutManager(c0Var);
        hu huVar = new hu(this, 0);
        this.f40599i3 = huVar;
        setAdapter(huVar);
        u1();
        setOnItemClickListener(new h(this, 8));
        s4.l lVar = new s4.l();
        lVar.n(220L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        setItemAnimator(lVar);
        oi.a.d(this, nuVar.h, nuVar.f41894n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long C1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f40597g3;
        nu nuVar = this.f40613w3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.f40597g3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long D1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f40597g3;
        nu nuVar = this.f40613w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.f40597g3 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j11 = jArr[i15];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long E1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f40597g3;
        nu nuVar = this.f40613w3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.f40597g3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void F1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z10;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.f40608r3 = C1(6) + E1(6);
        this.f40609s3 = C1(6);
        this.f40610t3 = E1(6);
        if (this.f40605o3 == null) {
            this.f40605o3 = new iu[7];
        }
        if (this.f40606p3 == null) {
            this.f40606p3 = new iu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = nu.f41889x;
            int length = iArr.length;
            float[] fArr = this.f40602l3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long C1 = C1(i20) + E1(i20);
                iu[] iuVarArr = this.f40606p3;
                iu[] iuVarArr2 = this.f40605o3;
                long C12 = C1(iArr[i19]);
                long E1 = E1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.f40597g3;
                nu nuVar = this.f40613w3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.f40597g3 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.f40597g3;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.f40597g3 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f26810c = C1;
                obj.f26809b = z10;
                obj.e = C12;
                obj.f40272g = recivedItemsCount;
                obj.f40271f = E1;
                obj.h = sentItemsCount;
                iuVarArr2[i19] = obj;
                iuVarArr[i19] = obj;
                fArr[i19] = ((float) C1) / ((float) this.f40608r3);
                i19++;
            } else {
                Arrays.sort(this.f40605o3, new org.telegram.ui.ActionBar.n4(29));
                AndroidUtilities.roundPercents(fArr, this.f40603m3);
                Arrays.fill(this.f40607q3, true);
                return;
            }
        }
    }

    public final void G1(boolean z10) {
        String formatString;
        boolean z11;
        ArrayList arrayList;
        int i10;
        int i11;
        String string;
        boolean z12;
        ArrayList arrayList2;
        int i12;
        String format;
        int i13;
        CharSequence concat;
        ArrayList arrayList3;
        ArrayList arrayList4 = this.f40600j3;
        arrayList4.clear();
        ArrayList arrayList5 = this.f40601k3;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        boolean z13 = false;
        arrayList5.add(new qg.a(0, false));
        long j10 = 0;
        int i14 = 1;
        if (this.f40608r3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(D1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(D1()));
        }
        arrayList5.add(new eu(1, formatString));
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        while (true) {
            iu[] iuVarArr = this.f40605o3;
            if (i15 >= iuVarArr.length) {
                break;
            }
            iu iuVar = iuVarArr[i15];
            long j11 = j10;
            long j12 = iuVar.f26810c;
            int i16 = iuVar.d;
            if (!this.f40611u3 && !this.f40604n3.contains(Integer.valueOf(i16))) {
                i12 = 0;
            } else {
                i12 = i14;
            }
            int i17 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
            if (i17 <= 0 && i12 == 0) {
                i13 = i14;
                arrayList3 = arrayList6;
            } else {
                int i18 = this.f40603m3[i16];
                if (i18 <= 0) {
                    Object[] objArr = new Object[i14];
                    objArr[0] = Integer.valueOf(i14);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Object[] objArr2 = new Object[i14];
                    objArr2[0] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                i13 = i14;
                ArrayList arrayList7 = arrayList6;
                metricAffectingSpan.f38676a = 0.1d;
                spannableString.setSpan(metricAffectingSpan, 0, spannableString.length(), 33);
                int i19 = nu.v[i16];
                int[] iArr = nu.f41886r[i16];
                int i20 = iArr[0];
                int i21 = iArr[i13];
                if (i17 == 0) {
                    concat = LocaleController.getString(nu.f41888w[i16]);
                } else {
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = LocaleController.getString(nu.f41888w[i16]);
                    charSequenceArr[i13] = "  ";
                    charSequenceArr[2] = spannableString;
                    concat = TextUtils.concat(charSequenceArr);
                }
                eu euVar = new eu(i15, i19, i20, i21, concat, AndroidUtilities.formatFileSize(j12));
                arrayList3 = arrayList7;
                arrayList3.add(euVar);
            }
            i15++;
            arrayList6 = arrayList3;
            j10 = j11;
            i14 = i13;
        }
        int i22 = i14;
        ArrayList arrayList8 = arrayList6;
        long j13 = j10;
        if (!arrayList8.isEmpty()) {
            SpannableString spannableString2 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i23 = org.telegram.ui.ActionBar.y6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6 u6Var = this.f30988n2;
            org.telegram.ui.ActionBar.f7.y(this, mutate, i23, u6Var, mode);
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString2.setSpan(new ImageSpan(mutate, 2), 0, i22, 33);
            SpannableString spannableString3 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            org.telegram.ui.ActionBar.f7.y(this, mutate2, i23, u6Var, mode);
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i24 = 0;
            while (i24 < arrayList8.size()) {
                int i25 = ((eu) arrayList8.get(i24)).h;
                if (i25 >= 0 && !this.f40607q3[i25]) {
                    iu iuVar2 = this.f40605o3[i25];
                    int[] iArr2 = nu.f41889x;
                    int i26 = iuVar2.d;
                    int i27 = iuVar2.f40272g;
                    int i28 = iuVar2.h;
                    long j14 = iuVar2.e;
                    z12 = z13;
                    ArrayList arrayList9 = arrayList8;
                    long j15 = iuVar2.f40271f;
                    int i29 = iArr2[i26];
                    if (i29 == 0) {
                        if (j15 <= j13 && i28 <= 0) {
                            arrayList2 = arrayList9;
                        } else {
                            i24++;
                            arrayList2 = arrayList9;
                            arrayList2.add(i24, eu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i28), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i27 > 0) {
                            i24++;
                            arrayList2.add(i24, eu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i27), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        arrayList2 = arrayList9;
                        if (i29 != 1) {
                            if (j15 > j13 || i28 > 0) {
                                i24++;
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i28));
                                CharSequence[] charSequenceArr2 = new CharSequence[3];
                                charSequenceArr2[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr2[1] = " ";
                                charSequenceArr2[2] = replaceTags;
                                arrayList2.add(i24, eu.b(TextUtils.concat(charSequenceArr2), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i27 > 0) {
                                i24++;
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i27));
                                CharSequence[] charSequenceArr3 = new CharSequence[3];
                                charSequenceArr3[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr3[1] = " ";
                                charSequenceArr3[2] = replaceTags2;
                                arrayList2.add(i24, eu.b(TextUtils.concat(charSequenceArr3), AndroidUtilities.formatFileSize(j14)));
                            }
                        } else {
                            if (j15 > j13 || i28 > 0) {
                                i24++;
                                String string2 = LocaleController.getString(R.string.BytesSent);
                                CharSequence[] charSequenceArr4 = new CharSequence[3];
                                charSequenceArr4[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr4[1] = " ";
                                charSequenceArr4[2] = string2;
                                arrayList2.add(i24, eu.b(TextUtils.concat(charSequenceArr4), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i27 > 0) {
                                i24++;
                                String string3 = LocaleController.getString(R.string.BytesReceived);
                                CharSequence[] charSequenceArr5 = new CharSequence[3];
                                charSequenceArr5[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr5[1] = " ";
                                charSequenceArr5[2] = string3;
                                arrayList2.add(i24, eu.b(TextUtils.concat(charSequenceArr5), AndroidUtilities.formatFileSize(j14)));
                                i24++;
                                arrayList8 = arrayList2;
                                z13 = z12;
                            }
                        }
                    }
                } else {
                    z12 = z13;
                    arrayList2 = arrayList8;
                }
                i24++;
                arrayList8 = arrayList2;
                z13 = z12;
            }
            z11 = z13;
            arrayList = arrayList8;
            arrayList5.addAll(arrayList);
            if (!this.f40611u3) {
                arrayList5.add(new eu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        } else {
            z11 = false;
            arrayList = arrayList8;
        }
        if (!this.f40611u3) {
            arrayList5.add(new eu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList5.add(new eu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f40610t3)));
            arrayList5.add(new eu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f40609s3)));
        }
        if (!arrayList.isEmpty()) {
            i10 = 3;
            arrayList5.add(new eu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.f40597g3 != 0) {
            if (arrayList.isEmpty()) {
                arrayList5.add(new qg.a(i10, z11));
            }
            arrayList5.add(new eu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i30 = this.f40597g3;
            if (i30 != 1) {
                i11 = 3;
                if (i30 != 3) {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi);
                } else {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                }
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList5.add(new eu(i11, string));
        }
        if (!arrayList.isEmpty()) {
            arrayList5.add(new eu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList5.add(new qg.a(3, false));
        hu huVar = this.f40599i3;
        if (huVar != null) {
            if (z10) {
                huVar.E(arrayList4, arrayList5);
            } else {
                huVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
