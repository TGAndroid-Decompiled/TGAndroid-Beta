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
    public t f36222a;
    public String f36223b;
    public float f36224c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i9 == NotificationCenter.uploadStoryProgress) {
            String str2 = this.f36223b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f36224c = floatValue;
                t tVar = this.f36222a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f36224c <= 0.0f) {
                    z10 = true;
                }
                tVar.f4772n = 100;
                tVar.f4773o = round;
                tVar.f4774p = z10;
                try {
                    new n0(ApplicationLoader.applicationContext).d(33, this.f36222a.b());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        } else if (i9 == NotificationCenter.uploadStoryEnd && (str = this.f36223b) != null && str.equals((String) objArr[0])) {
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
        new n0(ApplicationLoader.applicationContext).b(33);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i9, int i10) {
        this.f36223b = intent.getStringExtra("path");
        int i11 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.d = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i11 != this.d) {
            if (i11 != -1) {
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.uploadStoryProgress);
            }
            int i12 = this.d;
            if (i12 != -1) {
                NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.uploadStoryProgress);
            }
        }
        if (this.f36223b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.f36222a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            t tVar = new t(ApplicationLoader.applicationContext, null);
            this.f36222a = tVar;
            tVar.E.icon = 17301640;
            tVar.E.when = System.currentTimeMillis();
            t tVar2 = this.f36222a;
            tVar2.f4782y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
            this.f36222a.p(LocaleController.getString(R.string.StoryUploading));
            this.f36222a.f(LocaleController.getString(R.string.StoryUploading));
        }
        this.f36224c = 0.0f;
        t tVar3 = this.f36222a;
        int round = Math.round(0.0f);
        tVar3.f4772n = 100;
        tVar3.f4773o = round;
        tVar3.f4774p = false;
        startForeground(33, this.f36222a.b());
        try {
            new n0(ApplicationLoader.applicationContext).d(33, this.f36222a.b());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
