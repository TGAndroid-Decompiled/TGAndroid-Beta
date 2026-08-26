package org.telegram.ui.Stars;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.car.app.HostException;
import com.google.android.gms.cast.framework.media.zzbh;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zack;
import com.google.android.gms.common.api.internal.zadc;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzaj;
import com.google.android.gms.internal.clearcut.zzal;
import com.google.android.gms.internal.clearcut.zzao;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzea;
import com.google.android.gms.internal.clearcut.zzfh;
import com.google.android.gms.internal.clearcut.zzfy;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzgw$zza;
import com.google.android.gms.internal.clearcut.zzh;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzhb;
import com.google.android.gms.internal.clearcut.zzp;
import com.google.android.gms.internal.clearcut.zzr;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

public final class BagRandomizer {
    public Object bag;
    public int currentIndex;
    public Object next;
    public Object random;
    public boolean reshuffleIfEnd;
    public Object shuffledBag;

    public BagRandomizer(ClearcutLogger clearcutLogger, byte[] bArr) {
        this.next = clearcutLogger;
        this.currentIndex = clearcutLogger.zzk;
        this.bag = clearcutLogger.zzj;
        this.shuffledBag = clearcutLogger.zzo;
        zzha zzhaVar = new zzha();
        zzhaVar.zzbjf = 0L;
        zzhaVar.zzbjg = 0L;
        zzhaVar.zzbji = 0;
        if (zzhb.zzbkd == null) {
            synchronized (zzfy.zzrr) {
                try {
                    if (zzhb.zzbkd == null) {
                        zzhb.zzbkd = new zzhb[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzhaVar.zzbjm = zzhb.zzbkd;
        byte[] bArr2 = zzfh.zzse;
        zzhaVar.zzbjn = bArr2;
        zzhaVar.zzbjp = bArr2;
        zzhaVar.zzbjq = "";
        zzhaVar.zzbjr = "";
        zzhaVar.zzbjt = "";
        zzhaVar.zzbju = 180000L;
        zzhaVar.zzbjw = bArr2;
        zzhaVar.zzbjx = "";
        zzhaVar.zzbjz = zzfh.zzrx;
        zzhaVar.zzbkc = false;
        this.random = zzhaVar;
        this.reshuffleIfEnd = false;
        zzhaVar.zzbkc = zzaa.zze(clearcutLogger.zzh);
        clearcutLogger.zzq.getClass();
        zzhaVar.zzbjf = System.currentTimeMillis();
        clearcutLogger.zzq.getClass();
        zzhaVar.zzbjg = SystemClock.elapsedRealtime();
        zzhaVar.zzbju = TimeZone.getDefault().getOffset(zzhaVar.zzbjf) / 1000;
        zzhaVar.zzbjp = bArr;
    }

    public zadc build() {
        zzah.checkArgument("Must set register function", ((RemoteCall) this.bag) != null);
        zzah.checkArgument("Must set unregister function", ((RemoteCall) this.shuffledBag) != null);
        zzah.checkArgument("Must set holder", ((ListenerHolder) this.random) != null);
        ListenerHolder.ListenerKey listenerKey = ((ListenerHolder) this.random).zac;
        zzah.checkNotNull(listenerKey, "Key must not be null");
        return new zadc(new zack(this, (ListenerHolder) this.random, (Feature[]) this.next, this.reshuffleIfEnd, this.currentIndex), new zadc(this, listenerKey));
    }

    public void log() {
        ClearcutLogger clearcutLogger;
        List<zzgw$zza.zzb> listZzfs;
        String str;
        String strSubstring;
        int i;
        zzgw$zza.zzb zzbVar;
        if (this.reshuffleIfEnd) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean zZzb = true;
        this.reshuffleIfEnd = true;
        ClearcutLogger clearcutLogger2 = (ClearcutLogger) this.next;
        zzr zzrVar = new zzr(clearcutLogger2.packageName, clearcutLogger2.zzi, this.currentIndex, (String) this.bag, (zzge$zzv$zzb) this.shuffledBag);
        zzha zzhaVar = (zzha) this.random;
        zze zzeVar = new zze(zzrVar, zzhaVar);
        zzp zzpVar = clearcutLogger2.zzs;
        zzpVar.getClass();
        boolean zZzo = false;
        int i2 = zzhaVar != null ? zzhaVar.zzbji : 0;
        boolean zBooleanValue = ((Boolean) zzp.zzaw.get()).booleanValue();
        String strValueOf = zzrVar.zzj;
        int i3 = zzrVar.zzk;
        Context context = zzpVar.zzh;
        if (zBooleanValue) {
            clearcutLogger = clearcutLogger2;
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (strValueOf != null) {
                if (context == null) {
                    listZzfs = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = zzp.zzas;
                    zzae zzaeVar = (zzae) concurrentHashMap.get(strValueOf);
                    if (zzaeVar == null) {
                        zzgw$zza zzgw_zzaZzft = zzgw$zza.zzft();
                        zzao zzaoVar = zzp.zzaq;
                        zzaoVar.getClass();
                        zzal zzalVar = new zzal(zzaoVar, strValueOf, zzgw_zzaZzft);
                        zzaeVar = (zzae) concurrentHashMap.putIfAbsent(strValueOf, zzalVar);
                        if (zzaeVar == null) {
                            zzaeVar = zzalVar;
                        }
                    }
                    listZzfs = ((zzgw$zza) zzaeVar.get()).zzfs();
                }
                for (zzgw$zza.zzb zzbVar2 : listZzfs) {
                    if (!zzbVar2.zzfv() || zzbVar2.getEventCode() == 0 || zzbVar2.getEventCode() == i2) {
                        if (!zzp.zzb(zzp.zza(zzp.zzd(context), zzbVar2.zzfw()), zzbVar2.zzfx(), zzbVar2.zzfy())) {
                            zZzb = false;
                            break;
                        }
                    }
                }
            }
        } else {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (strValueOf != null) {
                if (context == null || !zzp.zzc(context)) {
                    str = null;
                } else {
                    HashMap map = zzp.zzat;
                    zzae zzaeVar2 = (zzae) map.get(strValueOf);
                    if (zzaeVar2 == null) {
                        zzao zzaoVar2 = zzp.zzar;
                        zzaoVar2.getClass();
                        zzaj zzajVar = new zzaj(zzaoVar2, strValueOf, null, 1);
                        map.put(strValueOf, zzajVar);
                        zzaeVar2 = zzajVar;
                    }
                    str = (String) zzaeVar2.get();
                }
                if (str != null) {
                    int iIndexOf = str.indexOf(44);
                    if (iIndexOf >= 0) {
                        strSubstring = str.substring(0, iIndexOf);
                        i = iIndexOf + 1;
                    } else {
                        strSubstring = "";
                        i = 0;
                    }
                    int iIndexOf2 = str.indexOf(47, i);
                    if (iIndexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                        zzbVar = null;
                        clearcutLogger = clearcutLogger2;
                    } else {
                        try {
                            long j = Long.parseLong(str.substring(i, iIndexOf2));
                            clearcutLogger = clearcutLogger2;
                            try {
                                long j2 = Long.parseLong(str.substring(iIndexOf2 + 1));
                                if (j < 0 || j2 < 0) {
                                    StringBuilder sb = new StringBuilder(72);
                                    sb.append("negative values not supported: ");
                                    sb.append(j);
                                    sb.append("/");
                                    sb.append(j2);
                                    Log.e("LogSamplerImpl", sb.toString());
                                    zzbVar = null;
                                } else {
                                    zzgw$zza.zzb.zza zzaVarZzfz = zzgw$zza.zzb.zzfz();
                                    zzaVarZzfz.zzbf();
                                    zzgw$zza.zzb.zza((zzgw$zza.zzb) zzaVarZzfz.zzjt, strSubstring);
                                    zzaVarZzfz.zzbf();
                                    zzgw$zza.zzb.zza((zzgw$zza.zzb) zzaVarZzfz.zzjt, j);
                                    zzaVarZzfz.zzbf();
                                    zzgw$zza.zzb.zzb((zzgw$zza.zzb) zzaVarZzfz.zzjt, j2);
                                    zzcg zzcgVarZzbi = zzaVarZzfz.zzbi();
                                    byte bByteValue = ((Byte) zzcgVarZzbi.zza(1)).byteValue();
                                    if (bByteValue == 1) {
                                        zZzo = true;
                                    } else if (bByteValue != 0) {
                                        zzea zzeaVar = zzea.zznc;
                                        zzeaVar.getClass();
                                        zZzo = zzeaVar.zze(zzcgVarZzbi.getClass()).zzo(zzcgVarZzbi);
                                        zzcgVarZzbi.zza(2);
                                    }
                                    if (!zZzo) {
                                        throw new HostException();
                                    }
                                    zzbVar = (zzgw$zza.zzb) zzcgVarZzbi;
                                }
                            } catch (NumberFormatException e) {
                                e = e;
                                Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e);
                            }
                        } catch (NumberFormatException e2) {
                            e = e2;
                            clearcutLogger = clearcutLogger2;
                        }
                    }
                } else {
                    zzbVar = null;
                    clearcutLogger = clearcutLogger2;
                }
                if (zzbVar != null) {
                    zZzb = zzp.zzb(zzp.zza(zzp.zzd(context), zzbVar.zzfw()), zzbVar.zzfx(), zzbVar.zzfy());
                }
            } else {
                clearcutLogger = clearcutLogger2;
            }
        }
        if (!zZzb) {
            new zzbh(null, 1).setResult(Status.RESULT_SUCCESS);
            return;
        }
        com.google.android.gms.internal.clearcut.zze zzeVar2 = clearcutLogger.zzp;
        zzeVar2.getClass();
        zzeVar2.zad(2, new zzh(zzeVar, zzeVar2.zai));
    }

    public Object next() {
        if (((ArrayList) this.bag).isEmpty()) {
            return null;
        }
        Object obj = this.next;
        int i = this.currentIndex;
        ArrayList arrayList = (ArrayList) this.shuffledBag;
        if (i >= arrayList.size()) {
            if (this.reshuffleIfEnd) {
                Collections.shuffle(arrayList, (Random) this.random);
                this.currentIndex = 0;
            } else {
                this.currentIndex = 0;
            }
        }
        int i2 = this.currentIndex;
        this.currentIndex = i2 + 1;
        this.next = arrayList.get(i2);
        return obj;
    }

    public BagRandomizer(ArrayList arrayList) {
        this.reshuffleIfEnd = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.bag = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.shuffledBag = arrayList3;
        this.currentIndex = 0;
        Random random = new Random();
        this.random = random;
        Collections.shuffle(arrayList3, random);
        this.currentIndex = 0;
        next();
    }
}
