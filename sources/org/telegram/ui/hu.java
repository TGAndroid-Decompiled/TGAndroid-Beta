package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class hu extends org.telegram.ui.Components.jm0 {
    public static final int f37789n3 = 0;
    public boolean V2;
    public int W2;
    public final s4.b0 X2;
    public final fu Y2;
    public final ArrayList Z2;
    public final ArrayList f37790a3;
    public final float[] f37791b3;
    public final int[] f37792c3;
    public final ArrayList f37793d3;
    public gu[] f37794e3;
    public gu[] f37795f3;
    public final boolean[] f37796g3;
    public long f37797h3;
    public long f37798i3;
    public long f37799j3;
    public boolean f37800k3;
    public eu f37801l3;
    public final lu f37802m3;

    public hu(lu luVar, Activity activity) {
        super(activity, null);
        this.f37802m3 = luVar;
        this.V2 = false;
        this.W2 = 0;
        this.Z2 = new ArrayList();
        this.f37790a3 = new ArrayList();
        this.f37791b3 = new float[7];
        this.f37792c3 = new int[7];
        this.f37793d3 = new ArrayList();
        this.f37796g3 = new boolean[7];
        s4.b0 b0Var = new s4.b0();
        this.X2 = b0Var;
        setLayoutManager(b0Var);
        fu fuVar = new fu(this, 0);
        this.Y2 = fuVar;
        setAdapter(fuVar);
        p1();
        setOnItemClickListener(new i(this, 8));
        s4.k kVar = new s4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45951m = false;
        setItemAnimator(kVar);
    }

    public final void A1() {
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
        this.f37797h3 = x1(6) + z1(6);
        this.f37798i3 = x1(6);
        this.f37799j3 = z1(6);
        if (this.f37794e3 == null) {
            this.f37794e3 = new gu[7];
        }
        if (this.f37795f3 == null) {
            this.f37795f3 = new gu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = lu.f39021n;
            int length = iArr.length;
            float[] fArr = this.f37791b3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long x12 = x1(i20) + z1(i20);
                gu[] guVarArr = this.f37795f3;
                gu[] guVarArr2 = this.f37794e3;
                long x13 = x1(iArr[i19]);
                long z12 = z1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.W2;
                lu luVar = this.f37802m3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.W2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.W2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.W2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f25175c = x12;
                obj.f25174b = z10;
                obj.e = x13;
                obj.f37416g = recivedItemsCount;
                obj.f37415f = z12;
                obj.h = sentItemsCount;
                guVarArr2[i19] = obj;
                guVarArr[i19] = obj;
                fArr[i19] = ((float) x12) / ((float) this.f37797h3);
                i19++;
            } else {
                Arrays.sort(this.f37794e3, new org.telegram.ui.ActionBar.i4(27));
                AndroidUtilities.roundPercents(fArr, this.f37792c3);
                Arrays.fill(this.f37796g3, true);
                return;
            }
        }
    }

    public final void B1(boolean z10) {
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
        ArrayList arrayList4 = this.Z2;
        arrayList4.clear();
        ArrayList arrayList5 = this.f37790a3;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        boolean z13 = false;
        arrayList5.add(new pg.a(0, false));
        long j10 = 0;
        int i14 = 1;
        if (this.f37797h3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        }
        arrayList5.add(new cu(1, formatString));
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        while (true) {
            gu[] guVarArr = this.f37794e3;
            if (i15 >= guVarArr.length) {
                break;
            }
            gu guVar = guVarArr[i15];
            long j11 = j10;
            long j12 = guVar.f25175c;
            int i16 = guVar.d;
            if (!this.f37800k3 && !this.f37793d3.contains(Integer.valueOf(i16))) {
                i12 = 0;
            } else {
                i12 = i14;
            }
            int i17 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
            if (i17 <= 0 && i12 == 0) {
                i13 = i14;
                arrayList3 = arrayList6;
            } else {
                int i18 = this.f37792c3[i16];
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
                spannableString.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                i13 = i14;
                ArrayList arrayList7 = arrayList6;
                metricAffectingSpan.f35744a = 0.1d;
                spannableString.setSpan(metricAffectingSpan, 0, spannableString.length(), 33);
                int i19 = lu.f39020f[i16];
                int[] iArr = lu.d[i16];
                int i20 = iArr[0];
                int i21 = iArr[i13];
                if (i17 == 0) {
                    concat = LocaleController.getString(lu.h[i16]);
                } else {
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = LocaleController.getString(lu.h[i16]);
                    charSequenceArr[i13] = "  ";
                    charSequenceArr[2] = spannableString;
                    concat = TextUtils.concat(charSequenceArr);
                }
                cu cuVar = new cu(i15, i19, i20, i21, concat, AndroidUtilities.formatFileSize(j12));
                arrayList3 = arrayList7;
                arrayList3.add(cuVar);
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
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.f27579n2;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i23, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString2.setSpan(new ImageSpan(mutate, 2), 0, i22, 33);
            SpannableString spannableString3 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i23, d6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i24 = 0;
            while (i24 < arrayList8.size()) {
                int i25 = ((cu) arrayList8.get(i24)).h;
                if (i25 >= 0 && !this.f37796g3[i25]) {
                    gu guVar2 = this.f37794e3[i25];
                    int[] iArr2 = lu.f39021n;
                    int i26 = guVar2.d;
                    int i27 = guVar2.f37416g;
                    int i28 = guVar2.h;
                    long j14 = guVar2.e;
                    z12 = z13;
                    ArrayList arrayList9 = arrayList8;
                    long j15 = guVar2.f37415f;
                    int i29 = iArr2[i26];
                    if (i29 == 0) {
                        if (j15 <= j13 && i28 <= 0) {
                            arrayList2 = arrayList9;
                        } else {
                            i24++;
                            arrayList2 = arrayList9;
                            arrayList2.add(i24, cu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i28), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i27 > 0) {
                            i24++;
                            arrayList2.add(i24, cu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i27), AndroidUtilities.formatFileSize(j14)));
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
                                arrayList2.add(i24, cu.b(TextUtils.concat(charSequenceArr2), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i27 > 0) {
                                i24++;
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i27));
                                CharSequence[] charSequenceArr3 = new CharSequence[3];
                                charSequenceArr3[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr3[1] = " ";
                                charSequenceArr3[2] = replaceTags2;
                                arrayList2.add(i24, cu.b(TextUtils.concat(charSequenceArr3), AndroidUtilities.formatFileSize(j14)));
                            }
                        } else {
                            if (j15 > j13 || i28 > 0) {
                                i24++;
                                String string2 = LocaleController.getString(R.string.BytesSent);
                                CharSequence[] charSequenceArr4 = new CharSequence[3];
                                charSequenceArr4[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr4[1] = " ";
                                charSequenceArr4[2] = string2;
                                arrayList2.add(i24, cu.b(TextUtils.concat(charSequenceArr4), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i27 > 0) {
                                i24++;
                                String string3 = LocaleController.getString(R.string.BytesReceived);
                                CharSequence[] charSequenceArr5 = new CharSequence[3];
                                charSequenceArr5[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr5[1] = " ";
                                charSequenceArr5[2] = string3;
                                arrayList2.add(i24, cu.b(TextUtils.concat(charSequenceArr5), AndroidUtilities.formatFileSize(j14)));
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
            if (!this.f37800k3) {
                arrayList5.add(new cu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        } else {
            z11 = false;
            arrayList = arrayList8;
        }
        if (!this.f37800k3) {
            arrayList5.add(new cu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList5.add(new cu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f37799j3)));
            arrayList5.add(new cu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f37798i3)));
        }
        if (!arrayList.isEmpty()) {
            i10 = 3;
            arrayList5.add(new cu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.W2 != 0) {
            if (arrayList.isEmpty()) {
                arrayList5.add(new pg.a(i10, z11));
            }
            arrayList5.add(new cu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i30 = this.W2;
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
            arrayList5.add(new cu(i11, string));
        }
        if (!arrayList.isEmpty()) {
            arrayList5.add(new cu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList5.add(new pg.a(3, false));
        fu fuVar = this.Y2;
        if (fuVar != null) {
            if (z10) {
                fuVar.E(arrayList4, arrayList5);
            } else {
                fuVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.W2;
        lu luVar = this.f37802m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long y1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.W2;
        lu luVar = this.f37802m3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.W2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
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

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.W2;
        lu luVar = this.f37802m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }
}
