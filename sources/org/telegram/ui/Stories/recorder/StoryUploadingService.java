package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public class StoryUploadingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    public NotificationCompat$Builder builder;
    public int currentAccount = -1;
    public float currentProgress;
    public String path;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != NotificationCenter.uploadStoryProgress) {
            if (i == NotificationCenter.uploadStoryEnd && (str = this.path) != null && str.equals((String) objArr[0])) {
                stopSelf();
                return;
            }
            return;
        }
        String str2 = this.path;
        if (str2 == null || !str2.equals((String) objArr[0])) {
            return;
        }
        float fFloatValue = ((Float) objArr[1]).floatValue();
        this.currentProgress = fFloatValue;
        NotificationCompat$Builder notificationCompat$Builder = this.builder;
        int iRound = Math.round(fFloatValue * 100.0f);
        boolean z = this.currentProgress <= 0.0f;
        notificationCompat$Builder.mProgressMax = 100;
        notificationCompat$Builder.mProgress = iRound;
        notificationCompat$Builder.mProgressIndeterminate = z;
        try {
            new NotificationManagerCompat(ApplicationLoader.applicationContext).notify(33, this.builder.build());
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
        new NotificationManagerCompat(ApplicationLoader.applicationContext).cancel(33);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.path = intent.getStringExtra("path");
        int i3 = this.currentAccount;
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.currentAccount = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i3 != this.currentAccount) {
            if (i3 != -1) {
                NotificationCenter.getInstance(i3).removeObserver(this, NotificationCenter.uploadStoryProgress);
            }
            int i4 = this.currentAccount;
            if (i4 != -1) {
                NotificationCenter.getInstance(i4).addObserver(this, NotificationCenter.uploadStoryProgress);
            }
        }
        if (this.path == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(ApplicationLoader.applicationContext, null);
            this.builder = notificationCompat$Builder;
            notificationCompat$Builder.mNotification.icon = 17301640;
            notificationCompat$Builder.mNotification.when = System.currentTimeMillis();
            NotificationCompat$Builder notificationCompat$Builder2 = this.builder;
            notificationCompat$Builder2.mChannelId = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            notificationCompat$Builder2.setContentTitle(LocaleController.getString(R.string.AppName));
            NotificationCompat$Builder notificationCompat$Builder3 = this.builder;
            int i5 = R.string.StoryUploading;
            notificationCompat$Builder3.setTicker(LocaleController.getString(i5));
            this.builder.setContentText(LocaleController.getString(i5));
        }
        this.currentProgress = 0.0f;
        NotificationCompat$Builder notificationCompat$Builder4 = this.builder;
        int iRound = Math.round(0.0f);
        notificationCompat$Builder4.mProgressMax = 100;
        notificationCompat$Builder4.mProgress = iRound;
        notificationCompat$Builder4.mProgressIndeterminate = false;
        startForeground(33, this.builder.build());
        try {
            new NotificationManagerCompat(ApplicationLoader.applicationContext).notify(33, this.builder.build());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
