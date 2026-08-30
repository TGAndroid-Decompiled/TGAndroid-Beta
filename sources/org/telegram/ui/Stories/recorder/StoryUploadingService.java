package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.m0;
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
    public t f32328a;
    public String f32329b;
    public float f32330c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z4 = false;
        if (i10 == NotificationCenter.uploadStoryProgress) {
            String str2 = this.f32329b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f32330c = floatValue;
                t tVar = this.f32328a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f32330c <= 0.0f) {
                    z4 = true;
                }
                tVar.f5027n = 100;
                tVar.f5028o = round;
                tVar.f5029p = z4;
                try {
                    new m0(ApplicationLoader.applicationContext).d(33, this.f32328a.b());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        } else if (i10 == NotificationCenter.uploadStoryEnd && (str = this.f32329b) != null && str.equals((String) objArr[0])) {
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
        new m0(ApplicationLoader.applicationContext).b(33);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f32329b = intent.getStringExtra("path");
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
        if (this.f32329b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f32328a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            t tVar = new t(ApplicationLoader.applicationContext, null);
            this.f32328a = tVar;
            tVar.E.icon = 17301640;
            tVar.E.when = System.currentTimeMillis();
            t tVar2 = this.f32328a;
            tVar2.f5037y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
            this.f32328a.p(LocaleController.getString(R.string.StoryUploading));
            this.f32328a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f32330c = 0.0f;
        t tVar3 = this.f32328a;
        int round = Math.round(0.0f);
        tVar3.f5027n = 100;
        tVar3.f5028o = round;
        tVar3.f5029p = false;
        startForeground(33, this.f32328a.b());
        try {
            new m0(ApplicationLoader.applicationContext).d(33, this.f32328a.b());
            return 2;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return 2;
        }
    }
}
