package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;

public final class nu extends org.telegram.ui.Components.zk0 {

    public static final int f40929l3 = 0;
    public boolean T2;
    public int U2;
    public final f2.k0 V2;
    public final lu W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final float[] Z2;
    public final int[] a3;

    public final ArrayList f40930b3;

    public mu[] f40931c3;

    public mu[] f40932d3;

    public final boolean[] f40933e3;

    public long f40934f3;

    public long f40935g3;

    public long f40936h3;

    public boolean f40937i3;

    public ku f40938j3;

    public final ru f40939k3;

    public nu(ru ruVar, Activity activity) {
        super(activity, null);
        this.f40939k3 = ruVar;
        this.T2 = false;
        this.U2 = 0;
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new float[7];
        this.a3 = new int[7];
        this.f40930b3 = new ArrayList();
        this.f40933e3 = new boolean[7];
        f2.k0 k0Var = new f2.k0();
        this.V2 = k0Var;
        setLayoutManager(k0Var);
        lu luVar = new lu(this, 0);
        this.W2 = luVar;
        setAdapter(luVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        f2.l lVar = new f2.l();
        lVar.n(220L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        setItemAnimator(lVar);
    }

    public final void A1(boolean z10) {
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        String str;
        ArrayList arrayList = this.X2;
        arrayList.clear();
        ArrayList arrayList2 = this.Y2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new iu(0, false));
        int i13 = 1;
        long j10 = 0;
        String string2 = this.f40934f3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        arrayList2.add(new iu(1, string2));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            mu[] muVarArr = this.f40931c3;
            if (i14 >= muVarArr.length) {
                break;
            }
            mu muVar = muVarArr[i14];
            long j11 = j10;
            long j12 = muVar.f32127c;
            int i15 = muVar.d;
            boolean z11 = this.f40937i3 || this.f40930b3.contains(Integer.valueOf(i15));
            if (j12 > j11 || z11) {
                int i16 = this.a3[i15];
                if (i16 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[i12] = Integer.valueOf(i13);
                    str = String.format("<%d%%", objArr);
                } else {
                    Integer numValueOf = Integer.valueOf(i16);
                    Object[] objArr2 = new Object[i13];
                    objArr2[i12] = numValueOf;
                    str = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(str);
                spannableString3.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                hu huVar = new hu();
                huVar.f38891a = 0.1d;
                spannableString3.setSpan(huVar, 0, spannableString3.length(), 33);
                int i17 = ru.f42336f[i15];
                int[] iArr = ru.d[i15];
                arrayList3.add(new iu(i14, i17, iArr[0], iArr[1], j12 == j11 ? LocaleController.getString(ru.h[i15]) : TextUtils.concat(LocaleController.getString(ru.h[i15]), "  ", spannableString3), AndroidUtilities.formatFileSize(j12)));
            }
            i14++;
            j10 = j11;
            i13 = 1;
            i12 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i18 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i18, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, mode));
            drawableMutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(drawableMutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i18, c6Var), mode));
            drawableMutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(drawableMutate2, 2), 0, 1, 33);
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                int i20 = ((iu) arrayList3.get(i19)).h;
                if (i20 < 0 || this.f40933e3[i20]) {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                } else {
                    mu muVar2 = this.f40931c3[i20];
                    int[] iArr2 = ru.f42337n;
                    int i21 = muVar2.d;
                    int i22 = muVar2.f40598g;
                    int i23 = muVar2.h;
                    long j14 = muVar2.f40596e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = muVar2.f40597f;
                    int i24 = iArr2[i21];
                    if (i24 == 0) {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i23), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i22), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i24 != 1) {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i23))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i22))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, iu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
                        }
                        i19++;
                        spannableString4 = spannableString;
                        spannableString5 = spannableString2;
                    }
                }
                i19++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.f40937i3) {
                arrayList2.add(new iu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f40937i3) {
            arrayList2.add(new iu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new iu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f40936h3)));
            arrayList2.add(new iu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f40935g3)));
        }
        if (arrayList3.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList2.add(new iu(3, string2));
        }
        if (this.U2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new iu(i10, false));
            }
            arrayList2.add(new iu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i25 = this.U2;
            if (i25 != 1) {
                i11 = 3;
                string = i25 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new iu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new iu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new iu(3, false));
        lu luVar = this.W2;
        if (luVar != null) {
            if (z10) {
                luVar.E(arrayList, arrayList2);
            } else {
                luVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long w1(int i10) {
        int i11 = this.U2;
        ru ruVar = this.f40939k3;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getReceivedBytesCount(this.U2 - 1, i10);
        }
        return StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getReceivedBytesCount(2, i10) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getReceivedBytesCount(1, i10) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getReceivedBytesCount(0, i10);
    }

    public final long x1() {
        int i10 = this.U2;
        ru ruVar = this.f40939k3;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getResetStatsDate(this.U2 - 1);
        }
        long[] jArr = {StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getResetStatsDate(0), StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getResetStatsDate(1), StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < 3; i11++) {
            long j11 = jArr[i11];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long y1(int i10) {
        int i11 = this.U2;
        ru ruVar = this.f40939k3;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentBytesCount(this.U2 - 1, i10);
        }
        return StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentBytesCount(2, i10) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentBytesCount(1, i10) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentBytesCount(0, i10);
    }

    public final void z1() {
        int i10;
        int recivedItemsCount;
        boolean z10;
        int sentItemsCount;
        this.f40934f3 = w1(6) + y1(6);
        this.f40935g3 = w1(6);
        this.f40936h3 = y1(6);
        if (this.f40931c3 == null) {
            this.f40931c3 = new mu[7];
        }
        if (this.f40932d3 == null) {
            this.f40932d3 = new mu[7];
        }
        int i11 = 0;
        while (true) {
            int[] iArr = ru.f42337n;
            int length = iArr.length;
            float[] fArr = this.Z2;
            if (i11 >= length) {
                Arrays.sort(this.f40931c3, new org.telegram.ui.Components.lp0(4));
                AndroidUtilities.roundPercents(fArr, this.a3);
                Arrays.fill(this.f40933e3, true);
                return;
            }
            int i12 = iArr[i11];
            long jW1 = w1(i12) + y1(i12);
            mu[] muVarArr = this.f40932d3;
            mu[] muVarArr2 = this.f40931c3;
            long jW2 = w1(iArr[i11]);
            long jY1 = y1(iArr[i11]);
            int i13 = iArr[i11];
            int i14 = this.U2;
            ru ruVar = this.f40939k3;
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                i10 = 1;
                recivedItemsCount = StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getRecivedItemsCount(this.U2 - 1, i13);
            } else {
                recivedItemsCount = StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getRecivedItemsCount(2, i13) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getRecivedItemsCount(1, i13) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getRecivedItemsCount(0, i13);
                i10 = 1;
            }
            int i15 = iArr[i11];
            int i16 = this.U2;
            if (i16 == i10 || i16 == 2 || i16 == 3) {
                z10 = true;
                sentItemsCount = StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentItemsCount(this.U2 - 1, i15);
            } else {
                sentItemsCount = StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentItemsCount(2, i15) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentItemsCount(1, i15) + StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).getSentItemsCount(0, i15);
                z10 = true;
            }
            mu muVar = new mu();
            muVar.d = i11;
            muVar.f32127c = jW1;
            muVar.f32126b = z10;
            muVar.f40596e = jW2;
            muVar.f40598g = recivedItemsCount;
            muVar.f40597f = jY1;
            muVar.h = sentItemsCount;
            muVarArr2[i11] = muVar;
            muVarArr[i11] = muVar;
            fArr[i11] = jW1 / this.f40934f3;
            i11++;
        }
    }
}
