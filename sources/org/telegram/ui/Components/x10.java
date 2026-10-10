package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public abstract class x10 implements Application.ActivityLifecycleCallbacks {
    private static x10 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<w10> listeners = new CopyOnWriteArrayList<>();
    private final ArrayList<WeakReference<Activity>> resumedActivities = new ArrayList<>();

    public x10(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static x10 getInstance() {
        return Instance;
    }

    public final void a(Activity activity) {
        for (int size = this.resumedActivities.size() - 1; size >= 0; size--) {
            Activity activity2 = this.resumedActivities.get(size).get();
            if (activity2 == null || activity2 == activity) {
                this.resumedActivities.remove(size);
            }
        }
    }

    public void addListener(w10 w10Var) {
        this.listeners.add(w10Var);
    }

    public Activity getForegroundActivity() {
        Activity activity = null;
        for (int size = this.resumedActivities.size() - 1; size >= 0; size--) {
            Activity activity2 = this.resumedActivities.get(size).get();
            if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                if (activity2.hasWindowFocus()) {
                    return activity2;
                }
                if (activity == null) {
                    activity = activity2;
                }
            } else {
                this.resumedActivities.remove(size);
            }
        }
        return activity;
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
    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override
    public void onActivityResumed(Activity activity) {
        a(activity);
        this.resumedActivities.add(new WeakReference<>(activity));
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
            Iterator<w10> it = this.listeners.iterator();
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
            Iterator<w10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public void removeListener(w10 w10Var) {
        this.listeners.remove(w10Var);
    }

    public void resetBackgroundVar() {
        this.wasInBackground = false;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
