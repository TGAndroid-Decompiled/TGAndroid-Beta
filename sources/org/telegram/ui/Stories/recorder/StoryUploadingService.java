package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.j0;
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
    public q f36284a;
    public String f36285b;
    public float f36286c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i10 == NotificationCenter.uploadStoryProgress) {
            String str2 = this.f36285b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f36286c = floatValue;
                q qVar = this.f36284a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f36286c <= 0.0f) {
                    z10 = true;
                }
                qVar.f9585n = 100;
                qVar.f9586o = round;
                qVar.f9587p = z10;
                try {
                    new j0(ApplicationLoader.applicationContext).e(null, 33, this.f36284a.b());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        } else if (i10 == NotificationCenter.uploadStoryEnd && (str = this.f36285b) != null && str.equals((String) objArr[0])) {
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
        new j0(ApplicationLoader.applicationContext).b(33, null);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f36285b = intent.getStringExtra("path");
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
        if (this.f36285b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f36284a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            q qVar = new q(ApplicationLoader.applicationContext, null);
            this.f36284a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f36284a;
            qVar2.f9595y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            qVar2.g(LocaleController.getString(R.string.AppName));
            this.f36284a.p(LocaleController.getString(R.string.StoryUploading));
            this.f36284a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f36286c = 0.0f;
        q qVar3 = this.f36284a;
        int round = Math.round(0.0f);
        qVar3.f9585n = 100;
        qVar3.f9586o = round;
        qVar3.f9587p = false;
        try {
            startForeground(33, this.f36284a.b());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        try {
            new j0(ApplicationLoader.applicationContext).e(null, 33, this.f36284a.b());
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        FileLog.d("StoryUploadingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
