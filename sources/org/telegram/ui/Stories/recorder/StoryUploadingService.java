package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.n0;
import e0.t;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public class StoryUploadingService extends Service implements NotificationCenter.NotificationCenterDelegate {

    public t f36225a;

    public String f36226b;

    public float f36227c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 != NotificationCenter.uploadStoryProgress) {
            if (i10 == NotificationCenter.uploadStoryEnd && (str = this.f36226b) != null && str.equals((String) objArr[0])) {
                stopSelf();
                return;
            }
            return;
        }
        String str2 = this.f36226b;
        if (str2 == null || !str2.equals((String) objArr[0])) {
            return;
        }
        float fFloatValue = ((Float) objArr[1]).floatValue();
        this.f36227c = fFloatValue;
        t tVar = this.f36225a;
        int iRound = Math.round(fFloatValue * 100.0f);
        boolean z10 = this.f36227c <= 0.0f;
        tVar.f5129n = 100;
        tVar.f5130o = iRound;
        tVar.f5131p = z10;
        try {
            new n0(ApplicationLoader.applicationContext).d(33, this.f36225a.b());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Exception unused) {
        }
        new n0(ApplicationLoader.applicationContext).b(33);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f36226b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.d = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.uploadStoryProgress);
            }
            int i13 = this.d;
            if (i13 != -1) {
                NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.uploadStoryProgress);
            }
        }
        if (this.f36226b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f36225a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            t tVar = new t(ApplicationLoader.applicationContext, null);
            this.f36225a = tVar;
            tVar.E.icon = 17301640;
            tVar.E.when = System.currentTimeMillis();
            t tVar2 = this.f36225a;
            tVar2.f5139y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
            this.f36225a.p(LocaleController.getString(R.string.StoryUploading));
            this.f36225a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f36227c = 0.0f;
        t tVar3 = this.f36225a;
        int iRound = Math.round(0.0f);
        tVar3.f5129n = 100;
        tVar3.f5130o = iRound;
        tVar3.f5131p = false;
        startForeground(33, this.f36225a.b());
        try {
            new n0(ApplicationLoader.applicationContext).d(33, this.f36225a.b());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
