package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public abstract class g10 implements Application.ActivityLifecycleCallbacks {
    private static g10 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<f10> listeners = new CopyOnWriteArrayList<>();

    public g10(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static g10 getInstance() {
        return Instance;
    }

    public void addListener(f10 f10Var) {
        this.listeners.add(f10Var);
    }

    public boolean isBackground() {
        if (this.refs == 0) {
            return true;
        }
        return false;
    }

    public boolean isForeground() {
        if (this.refs > 0) {
            return true;
        }
        return false;
    }

    public boolean isWasInBackground(boolean z10) {
        if (z10 && SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
            this.wasInBackground = false;
        }
        return this.wasInBackground;
    }

    @Override
    public void onActivityStarted(Activity activity) {
        int i10 = this.refs + 1;
        this.refs = i10;
        if (i10 == 1) {
            if (SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
                this.wasInBackground = false;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to foreground");
            }
            Iterator<f10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameForeground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public void onActivityStopped(Activity activity) {
        int i10 = this.refs - 1;
        this.refs = i10;
        if (i10 == 0) {
            this.enterBackgroundTime = SystemClock.elapsedRealtime();
            this.wasInBackground = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to background");
            }
            Iterator<f10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public void removeListener(f10 f10Var) {
        this.listeners.remove(f10Var);
    }

    public void resetBackgroundVar() {
        this.wasInBackground = false;
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
