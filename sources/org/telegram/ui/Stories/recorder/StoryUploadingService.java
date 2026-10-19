package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.k0;
import e0.q;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public class StoryUploadingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    public q f33887a;
    public String f33888b;
    public float f33889c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i10 == NotificationCenter.uploadStoryProgress) {
            String str2 = this.f33888b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f33889c = floatValue;
                q qVar = this.f33887a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f33889c <= 0.0f) {
                    z10 = true;
                }
                qVar.f8151n = 100;
                qVar.f8152o = round;
                qVar.f8153p = z10;
                try {
                    new k0(ApplicationLoader.applicationContext).e(null, 33, this.f33887a.b());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        } else if (i10 == NotificationCenter.uploadStoryEnd && (str = this.f33888b) != null && str.equals((String) objArr[0])) {
            stopSelf();
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
        new k0(ApplicationLoader.applicationContext).b(33, null);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f33888b = intent.getStringExtra("path");
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
        if (this.f33888b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f33887a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            q qVar = new q(ApplicationLoader.applicationContext, null);
            this.f33887a = qVar;
            qVar.E.icon = 17301640;
            qVar.E.when = System.currentTimeMillis();
            q qVar2 = this.f33887a;
            qVar2.f8161y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            qVar2.g(LocaleController.getString(R.string.AppName));
            this.f33887a.p(LocaleController.getString(R.string.StoryUploading));
            this.f33887a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f33889c = 0.0f;
        q qVar3 = this.f33887a;
        int round = Math.round(0.0f);
        qVar3.f8151n = 100;
        qVar3.f8152o = round;
        qVar3.f8153p = false;
        startForeground(33, this.f33887a.b());
        try {
            new k0(ApplicationLoader.applicationContext).e(null, 33, this.f33887a.b());
            return 2;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return 2;
        }
    }
}
