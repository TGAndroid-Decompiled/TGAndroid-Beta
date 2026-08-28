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
public final class ku extends org.telegram.ui.Components.wk0 {
    public static final int f39920l3 = 0;
    public boolean T2;
    public int U2;
    public final f2.m0 V2;
    public final iu W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final float[] Z2;
    public final int[] a3;
    public final ArrayList f39921b3;
    public ju[] f39922c3;
    public ju[] f39923d3;
    public final boolean[] f39924e3;
    public long f39925f3;
    public long f39926g3;
    public long f39927h3;
    public boolean f39928i3;
    public hu f39929j3;
    public final ou f39930k3;

    public ku(ou ouVar, Activity activity) {
        super(activity, null);
        this.f39930k3 = ouVar;
        this.T2 = false;
        this.U2 = 0;
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new float[7];
        this.a3 = new int[7];
        this.f39921b3 = new ArrayList();
        this.f39924e3 = new boolean[7];
        f2.m0 m0Var = new f2.m0();
        this.V2 = m0Var;
        setLayoutManager(m0Var);
        iu iuVar = new iu(this, 0);
        this.W2 = iuVar;
        setAdapter(iuVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        f2.n nVar = new f2.n();
        nVar.n(220L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        setItemAnimator(nVar);
    }

    public final void A1(boolean z10) {
        String formatString;
        int i9;
        int i10;
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
        int i11 = 0;
        arrayList2.add(new wf.a(0, false));
        int i12 = 1;
        long j10 = 0;
        if (this.f39925f3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        }
        arrayList2.add(new fu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        while (true) {
            ju[] juVarArr = this.f39922c3;
            if (i13 >= juVarArr.length) {
                break;
            }
            ju juVar = juVarArr[i13];
            long j11 = j10;
            long j12 = juVar.f32679c;
            int i14 = juVar.d;
            if (!this.f39928i3 && !this.f39921b3.contains(Integer.valueOf(i14))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i15 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
            if (i15 > 0 || z11) {
                int i16 = this.a3[i14];
                if (i16 <= 0) {
                    Object[] objArr = new Object[i12];
                    objArr[i11] = Integer.valueOf(i12);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i16);
                    Object[] objArr2 = new Object[i12];
                    objArr2[i11] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(format);
                spannableString3.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), i11, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i11, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f38025a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i17 = ou.f41241f[i14];
                int[] iArr = ou.d[i14];
                int i18 = iArr[0];
                int i19 = iArr[1];
                if (i15 == 0) {
                    concat = LocaleController.getString(ou.h[i14]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(ou.h[i14]), "  ", spannableString3);
                }
                arrayList3.add(new fu(i13, i17, i18, i19, concat, AndroidUtilities.formatFileSize(j12)));
            }
            i13++;
            j10 = j11;
            i12 = 1;
            i11 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i20 = org.telegram.ui.ActionBar.f6.G6;
            org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i20, b6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i20, b6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i21 = 0;
            while (i21 < arrayList3.size()) {
                int i22 = ((fu) arrayList3.get(i21)).h;
                if (i22 >= 0 && !this.f39924e3[i22]) {
                    ju juVar2 = this.f39922c3[i22];
                    int[] iArr2 = ou.f41242n;
                    int i23 = juVar2.d;
                    int i24 = juVar2.f39632g;
                    int i25 = juVar2.h;
                    long j14 = juVar2.f39630e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = juVar2.f39631f;
                    int i26 = iArr2[i23];
                    if (i26 == 0) {
                        if (j15 > j13 || i25 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i25), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i24 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i24), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i26 != 1) {
                        if (j15 > j13 || i25 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i25))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i24 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i24))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i25 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i24 > 0) {
                            i21++;
                            arrayList3.add(i21, fu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
                            i21++;
                            spannableString4 = spannableString;
                            spannableString5 = spannableString2;
                        }
                    }
                } else {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                }
                i21++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.f39928i3) {
                arrayList2.add(new fu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f39928i3) {
            arrayList2.add(new fu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f39927h3)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f39926g3)));
        }
        if (!arrayList3.isEmpty()) {
            i9 = 3;
            arrayList2.add(new fu(3, formatString));
        } else {
            i9 = 3;
        }
        if (this.U2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new wf.a(i9, false));
            }
            arrayList2.add(new fu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i27 = this.U2;
            if (i27 != 1) {
                i10 = 3;
                if (i27 != 3) {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi);
                } else {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                }
            } else {
                i10 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new fu(i10, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new fu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new wf.a(3, false));
        iu iuVar = this.W2;
        if (iuVar != null) {
            if (z10) {
                iuVar.E(arrayList, arrayList2);
            } else {
                iuVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public final long w1(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.U2;
        ou ouVar = this.f39930k3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i10).getReceivedBytesCount(this.U2 - 1, i9);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i11).getReceivedBytesCount(0, i9);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i13).getReceivedBytesCount(2, i9) + StatsController.getInstance(i12).getReceivedBytesCount(1, i9) + receivedBytesCount;
    }

    public final long x1() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.U2;
        ou ouVar = this.f39930k3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i9 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i9).getResetStatsDate(this.U2 - 1);
        }
        i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i10).getResetStatsDate(0);
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i11).getResetStatsDate(1);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i12).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j11 = jArr[i14];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long y1(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.U2;
        ou ouVar = this.f39930k3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i10).getSentBytesCount(this.U2 - 1, i9);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i11).getSentBytesCount(0, i9);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i13).getSentBytesCount(2, i9) + StatsController.getInstance(i12).getSentBytesCount(1, i9) + sentBytesCount;
    }

    public final void z1() {
        int i9;
        int i10;
        int recivedItemsCount;
        int i11;
        boolean z10;
        int sentItemsCount;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f39925f3 = w1(6) + y1(6);
        this.f39926g3 = w1(6);
        this.f39927h3 = y1(6);
        if (this.f39922c3 == null) {
            this.f39922c3 = new ju[7];
        }
        if (this.f39923d3 == null) {
            this.f39923d3 = new ju[7];
        }
        int i18 = 0;
        while (true) {
            int[] iArr = ou.f41242n;
            int length = iArr.length;
            float[] fArr = this.Z2;
            if (i18 < length) {
                int i19 = iArr[i18];
                long w12 = w1(i19) + y1(i19);
                ju[] juVarArr = this.f39923d3;
                ju[] juVarArr2 = this.f39922c3;
                long w13 = w1(iArr[i18]);
                long y12 = y1(iArr[i18]);
                int i20 = iArr[i18];
                int i21 = this.U2;
                ou ouVar = this.f39930k3;
                if (i21 == 1 || i21 == 2 || i21 == 3) {
                    i9 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    i10 = 1;
                    recivedItemsCount = StatsController.getInstance(i9).getRecivedItemsCount(this.U2 - 1, i20);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i15).getRecivedItemsCount(0, i20);
                    i16 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i16).getRecivedItemsCount(1, i20) + recivedItemsCount2;
                    i17 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i17).getRecivedItemsCount(2, i20) + recivedItemsCount3;
                    i10 = 1;
                }
                int i22 = iArr[i18];
                int i23 = this.U2;
                if (i23 == i10 || i23 == 2 || i23 == 3) {
                    i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i11).getSentItemsCount(this.U2 - 1, i22);
                } else {
                    i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i12).getSentItemsCount(0, i22);
                    i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i13).getSentItemsCount(1, i22) + sentItemsCount2;
                    i14 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i14).getSentItemsCount(2, i22) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i18;
                obj.f32679c = w12;
                obj.f32678b = z10;
                obj.f39630e = w13;
                obj.f39632g = recivedItemsCount;
                obj.f39631f = y12;
                obj.h = sentItemsCount;
                juVarArr2[i18] = obj;
                juVarArr[i18] = obj;
                fArr[i18] = ((float) w12) / ((float) this.f39925f3);
                i18++;
            } else {
                Arrays.sort(this.f39922c3, new org.telegram.ui.Components.jn0(6));
                AndroidUtilities.roundPercents(fArr, this.a3);
                Arrays.fill(this.f39924e3, true);
                return;
            }
        }
    }
}
