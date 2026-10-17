package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
public final class ff0 implements Runnable {
    public final int f36896a;

    public ff0(int i10) {
        this.f36896a = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10 = 0;
        switch (this.f36896a) {
            case 0:
                CallReceiver.checkLastReceivedCall();
                return;
            case 1:
                org.telegram.ui.Components.xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 2:
                org.telegram.ui.Components.xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 3:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 4:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.xc.a0(U)) != null) {
                    org.telegram.ui.Components.qc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.f29639j = 5000;
                    M.j();
                    return;
                }
                return;
            case 5:
                int i11 = j81.f38084d0;
                return;
            case 6:
                org.telegram.ui.ActionBar.h6.N = false;
                org.telegram.ui.ActionBar.h6.E(false);
                return;
            case 7:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(U2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                    M2.f29639j = 5000;
                    M2.j();
                    return;
                }
                return;
            case 9:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.q0.f34757i;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        runnable.run();
                    }
                }
                return;
            case 10:
                int[][] iArr = WallpapersListActivity.f35223k0;
                PhotoViewer.t1().G0(false, false);
                return;
            case 11:
                Utilities.globalQueue.postRunnable(new ff0(13));
                return;
            case 12:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList.add(tLObject);
                            longSparseArray.put(tLObject.f42558a, tLObject);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t3(23, arrayList, longSparseArray));
                return;
            case 13:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.c1.f42567c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.c1.f42567c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.b1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.c1.f42567c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.b1) obj2).serializeToStream(serializedData3);
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
            case 14:
                return;
            case 15:
                qg.l0.b();
                return;
            case 16:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.f6274a;
                return;
            case 17:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 18:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 19:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
            case 20:
                float[] fArr = sg.z1.U;
                return;
            case 21:
                ug.l1.f0(0, null);
                return;
            case 22:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj3 = new Object();
                    obj3.f21552a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj3);
                    return;
                }
                return;
            case 23:
                a5.a aVar = zf.e.B;
                if (aVar != null) {
                    ArrayList arrayList4 = null;
                    while (i10 < zf.e.f51556y) {
                        if (((Bitmap[]) aVar.d)[i10] != null) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(((Bitmap[]) aVar.d)[i10]);
                        }
                        ((Bitmap[]) aVar.d)[i10] = null;
                        ((zf.z[]) aVar.f281c)[i10] = null;
                        i10++;
                    }
                    if (!arrayList4.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new qg.f0(arrayList4, 1));
                    }
                    zf.e.B = null;
                    return;
                }
                return;
            case 24:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ArrayList arrayList5 = zh.e.f51976a;
                synchronized (arrayList5) {
                    try {
                        for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                            ArrayList arrayList6 = zh.e.f51976a;
                            if (elapsedRealtime - ((zh.d) arrayList6.get(size4)).f51944b >= 10000) {
                                ((zh.d) arrayList6.remove(size4)).f51943a.recycle();
                            }
                        }
                        if (!zh.e.f51976a.isEmpty()) {
                            AndroidUtilities.runOnUIThread(zh.e.f51977b, 10000L);
                        }
                    } finally {
                    }
                }
                return;
            default:
                org.telegram.ui.Components.xc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }

    public ff0(n0 n0Var) {
        this.f36896a = 14;
    }

    private final void a() {
    }
}
