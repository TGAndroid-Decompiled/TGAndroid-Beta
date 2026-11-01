package org.telegram.ui.Components.voip;

import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.a50;
import org.telegram.ui.k51;
import th.h4;
import w7.m6;
public final class n0 implements Runnable {
    public final int f31625a;

    public n0(int i10) {
        this.f31625a = i10;
    }

    @Override
    public final void run() {
        cc a02;
        int i10 = 0;
        switch (this.f31625a) {
            case 0:
                at.e().k(175, new Object[0]);
                return;
            case 1:
                u1.a();
                return;
            case 2:
                h4.I0();
                return;
            case 3:
                a50 a50Var = a50.f35573u5;
                if (a50Var != null) {
                    a50Var.show();
                    return;
                }
                return;
            case 4:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 5:
                Pattern pattern = LaunchActivity.D1;
                return;
            case 6:
                Pattern pattern2 = LaunchActivity.D1;
                return;
            case 7:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.w0.E = false;
                org.telegram.messenger.w0.G = System.currentTimeMillis();
                return;
            case 8:
                return;
            case 9:
                CallReceiver.a();
                return;
            case 10:
                CallReceiver.a();
                return;
            case 11:
                cc.X().N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                return;
            case 12:
                cc.X().N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                return;
            case 13:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 14:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && (a02 = cc.a0(T)) != null) {
                    wb I = a02.I(2131624089, dd.L0(2131746239, null), dd.L0(2131746202, null));
                    I.f32201j = 5000;
                    I.j();
                    return;
                }
                return;
            case 15:
                int i11 = k51.V1;
                return;
            case 16:
                t6.N = false;
                t6.F(false);
                return;
            case 17:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
                return;
            case 19:
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    wb I2 = cc.a0(T2).I(2131623989, dd.L0(2131743217, null), dd.L0(2131743215, null));
                    I2.f32201j = 5000;
                    I2.j();
                    return;
                }
                return;
            case 20:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.p0.f35005i;
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
            case 21:
                boolean z10 = c6.f34320j0;
                return;
            case 22:
                PhotoViewer.v1().H0(false, false);
                return;
            case 23:
                Utilities.e.c(new n0(25));
                return;
            case 24:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(b8.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList.add(tLObject);
                            longSparseArray.put(tLObject.f42784a, tLObject);
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.m2(25, arrayList, longSparseArray));
                return;
            case 25:
                try {
                    File file2 = new File(b8.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = m6.f52666c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = m6.f52666c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.a1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = m6.f52666c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.a1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 26:
                return;
            case 27:
                org.telegram.utils.twidget.p.j();
                return;
            case 28:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f20390a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj3);
                    return;
                }
                return;
            default:
                cc.X().N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                return;
        }
    }

    public n0(Object obj, int i10) {
        this.f31625a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
