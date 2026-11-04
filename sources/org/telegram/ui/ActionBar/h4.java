package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
public final class h4 {
    public int f27573a;
    public int f27574b;
    public Object f27575c;
    public Object d;
    public Object f27576e;

    public static String b(n9.h hVar) {
        hVar.a();
        n9.k kVar = hVar.f20298c;
        String str = kVar.f20312e;
        if (str != null) {
            return str;
        }
        hVar.a();
        String str2 = kVar.f20310b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f27575c) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f27575c;
    }

    public synchronized int c() {
        PackageInfo d;
        try {
            if (this.f27573a == 0 && (d = d("com.google.android.gms")) != null) {
                this.f27573a = d.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f27573a;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.d).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i3;
        synchronized (this) {
            i3 = this.f27574b;
            if (i3 == 0) {
                PackageManager packageManager = ((Context) this.d).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i3 = 0;
                } else {
                    if (!w6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f27574b = 1;
                            i3 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f27574b = 2;
                        i3 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (w6.b.d()) {
                            this.f27574b = 2;
                        } else {
                            this.f27574b = 1;
                        }
                        i3 = this.f27574b;
                    }
                }
            }
        }
        if (i3 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.d).getPackageName());
        if (d != null) {
            this.f27575c = Integer.toString(d.versionCode);
            this.f27576e = d.versionName;
        }
    }
}
