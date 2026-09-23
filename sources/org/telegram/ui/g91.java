package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
public final class g91 implements Runnable {
    public final int f33493a;

    public g91(int i10) {
        this.f33493a = i10;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f33493a) {
            case 0:
                int i11 = j91.f34392d0;
                return;
            case 1:
                org.telegram.ui.ActionBar.h6.N = false;
                org.telegram.ui.ActionBar.h6.E(false);
                return;
            case 2:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 3:
                int[][] iArr = WallpapersListActivity.f31589k0;
                PhotoViewer.t1().G0(false, false);
                return;
            case 4:
                Utilities.globalQueue.postRunnable(new g91(6));
                return;
            case 5:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j3 = 0; j3 < readInt64; j3++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList.add(tLObject);
                            longSparseArray.put(tLObject.f38668a, tLObject);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new hb1(23, arrayList, longSparseArray));
                return;
            case 6:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.d1.f38679c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.d1.f38679c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.c1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.d1.f38679c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.c1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 7:
                return;
            case 8:
                pg.k0.b();
                return;
            case 9:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 10:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 11:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
            case 12:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.f5933a;
                return;
            case 13:
                float[] fArr = rg.z1.U;
                return;
            case 14:
                tg.n1.e0(0, null);
                return;
            case 15:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj3 = new Object();
                    obj3.f19352a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj3);
                    return;
                }
                return;
            case 16:
                a5.a aVar = yf.e.B;
                if (aVar != null) {
                    ArrayList arrayList4 = null;
                    while (i10 < yf.e.f46748y) {
                        if (((Bitmap[]) aVar.d)[i10] != null) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(((Bitmap[]) aVar.d)[i10]);
                        }
                        ((Bitmap[]) aVar.d)[i10] = null;
                        ((yf.z[]) aVar.f278c)[i10] = null;
                        i10++;
                    }
                    if (!arrayList4.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new pg.f0(arrayList4, 1));
                    }
                    yf.e.B = null;
                    return;
                }
                return;
            case 17:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 18:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new yh.w7());
                    return;
                }
                return;
            case 19:
                yh.t5[][] t5VarArr = yh.t5.S;
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }

    public g91(l0 l0Var) {
        this.f33493a = 7;
    }

    private final void a() {
    }
}
