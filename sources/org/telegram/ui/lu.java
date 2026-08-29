package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
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
public final class lu extends org.telegram.ui.Components.jl0 {
    public static final int f40278l3 = 0;
    public boolean T2;
    public int U2;
    public final f2.j0 V2;
    public final ju W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final float[] Z2;
    public final int[] f40279a3;
    public final ArrayList f40280b3;
    public ku[] c3;
    public ku[] f40281d3;
    public final boolean[] f40282e3;
    public long f40283f3;
    public long f40284g3;
    public long f40285h3;
    public boolean f40286i3;
    public iu f40287j3;
    public final pu f40288k3;

    public lu(pu puVar, Activity activity) {
        super(activity, null);
        this.f40288k3 = puVar;
        this.T2 = false;
        this.U2 = 0;
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new float[7];
        this.f40279a3 = new int[7];
        this.f40280b3 = new ArrayList();
        this.f40282e3 = new boolean[7];
        f2.j0 j0Var = new f2.j0();
        this.V2 = j0Var;
        setLayoutManager(j0Var);
        ju juVar = new ju(this, 0);
        this.W2 = juVar;
        setAdapter(juVar);
        p1();
        setOnItemClickListener(new j(this, 7));
        f2.l lVar = new f2.l();
        lVar.n(220L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        setItemAnimator(lVar);
    }

    public final void A1(boolean z10) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z11;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.X2;
        arrayList.clear();
        ArrayList arrayList2 = this.Y2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new zf.a(0, false));
        int i13 = 1;
        long j10 = 0;
        if (this.f40283f3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        }
        arrayList2.add(new gu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            ku[] kuVarArr = this.c3;
            if (i14 >= kuVarArr.length) {
                break;
            }
            ku kuVar = kuVarArr[i14];
            long j11 = j10;
            long j12 = kuVar.f35043c;
            int i15 = kuVar.d;
            if (!this.f40286i3 && !this.f40280b3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f40279a3[i15];
                if (i17 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[i12] = Integer.valueOf(i13);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i17);
                    Object[] objArr2 = new Object[i13];
                    objArr2[i12] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(format);
                spannableString3.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f38236a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = pu.f41463f[i15];
                int[] iArr = pu.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(pu.h[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(pu.h[i15]), "  ", spannableString3);
                }
                arrayList3.add(new gu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j12)));
            }
            i14++;
            j10 = j11;
            i13 = 1;
            i12 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i21 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i21, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i21, c6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((gu) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f40282e3[i23]) {
                    ku kuVar2 = this.c3[i23];
                    int[] iArr2 = pu.f41464n;
                    int i24 = kuVar2.d;
                    int i25 = kuVar2.f40019g;
                    int i26 = kuVar2.h;
                    long j14 = kuVar2.f40017e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = kuVar2.f40018f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i27 != 1) {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, gu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
                            i22++;
                            spannableString4 = spannableString;
                            spannableString5 = spannableString2;
                        }
                    }
                } else {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                }
                i22++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.f40286i3) {
                arrayList2.add(new gu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f40286i3) {
            arrayList2.add(new gu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new gu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f40285h3)));
            arrayList2.add(new gu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f40284g3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new gu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.U2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new zf.a(i10, false));
            }
            arrayList2.add(new gu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i28 = this.U2;
            if (i28 != 1) {
                i11 = 3;
                if (i28 != 3) {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi);
                } else {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                }
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new gu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new gu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new zf.a(3, false));
        ju juVar = this.W2;
        if (juVar != null) {
            if (z10) {
                juVar.E(arrayList, arrayList2);
            } else {
                juVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long w1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.U2;
        pu puVar = this.f40288k3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.U2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long x1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.U2;
        pu puVar = this.f40288k3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.U2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
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

    public final long y1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.U2;
        pu puVar = this.f40288k3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.U2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void z1() {
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
        this.f40283f3 = w1(6) + y1(6);
        this.f40284g3 = w1(6);
        this.f40285h3 = y1(6);
        if (this.c3 == null) {
            this.c3 = new ku[7];
        }
        if (this.f40281d3 == null) {
            this.f40281d3 = new ku[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = pu.f41464n;
            int length = iArr.length;
            float[] fArr = this.Z2;
            if (i19 < length) {
                int i20 = iArr[i19];
                long w12 = w1(i20) + y1(i20);
                ku[] kuVarArr = this.f40281d3;
                ku[] kuVarArr2 = this.c3;
                long w13 = w1(iArr[i19]);
                long y12 = y1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.U2;
                pu puVar = this.f40288k3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.U2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.U2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.U2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f35043c = w12;
                obj.f35042b = z10;
                obj.f40017e = w13;
                obj.f40019g = recivedItemsCount;
                obj.f40018f = y12;
                obj.h = sentItemsCount;
                kuVarArr2[i19] = obj;
                kuVarArr[i19] = obj;
                fArr[i19] = ((float) w12) / ((float) this.f40283f3);
                i19++;
            } else {
                Arrays.sort(this.c3, new org.telegram.ui.Components.wp0(4));
                AndroidUtilities.roundPercents(fArr, this.f40279a3);
                Arrays.fill(this.f40282e3, true);
                return;
            }
        }
    }
}
