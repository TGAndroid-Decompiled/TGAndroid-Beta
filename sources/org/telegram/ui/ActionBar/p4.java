package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
public final class p4 {
    public int f20652a;
    public int f20653b;
    public Object f20654c;
    public Object d;
    public Object e;

    public static String c(l9.h hVar) {
        hVar.a();
        l9.j jVar = hVar.f11710c;
        String str = jVar.e;
        if (str != null) {
            return str;
        }
        hVar.a();
        String str2 = jVar.f11719b;
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
            if (((String) this.f20654c) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f20654c;
    }

    public synchronized String b() {
        try {
            if (((String) this.e) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.e;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.d).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean e() {
        int i10;
        synchronized (this) {
            i10 = this.f20653b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.d).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!u6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f20653b = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f20653b = 2;
                        i10 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (u6.b.d()) {
                            this.f20653b = 2;
                        } else {
                            this.f20653b = 1;
                        }
                        i10 = this.f20653b;
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.d).getPackageName());
        if (d != null) {
            this.f20654c = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }
}
