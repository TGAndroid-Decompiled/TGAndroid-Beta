package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.l0;
import e0.r;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public class StoryUploadingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    public r f32539a;
    public String f32540b;
    public float f32541c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i10 == NotificationCenter.uploadStoryProgress) {
            String str2 = this.f32540b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f32541c = floatValue;
                r rVar = this.f32539a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f32541c <= 0.0f) {
                    z10 = true;
                }
                rVar.f8276n = 100;
                rVar.f8277o = round;
                rVar.f8278p = z10;
                try {
                    new l0(ApplicationLoader.applicationContext).e(null, 33, this.f32539a.b());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        } else if (i10 == NotificationCenter.uploadStoryEnd && (str = this.f32540b) != null && str.equals((String) objArr[0])) {
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
        new l0(ApplicationLoader.applicationContext).b(33, null);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f32540b = intent.getStringExtra("path");
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
        if (this.f32540b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f32539a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            r rVar = new r(ApplicationLoader.applicationContext, null);
            this.f32539a = rVar;
            rVar.E.icon = 17301640;
            rVar.E.when = System.currentTimeMillis();
            r rVar2 = this.f32539a;
            rVar2.f8286y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            rVar2.g(LocaleController.getString(R.string.AppName));
            this.f32539a.p(LocaleController.getString(R.string.StoryUploading));
            this.f32539a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f32541c = 0.0f;
        r rVar3 = this.f32539a;
        int round = Math.round(0.0f);
        rVar3.f8276n = 100;
        rVar3.f8277o = round;
        rVar3.f8278p = false;
        startForeground(33, this.f32539a.b());
        try {
            new l0(ApplicationLoader.applicationContext).e(null, 33, this.f32539a.b());
            return 2;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return 2;
        }
    }
}
