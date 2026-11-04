package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mu0 implements org.telegram.ui.Components.hj0 {
    public int f47789a = 0;
    public final Context f47790b;
    public final ProfileActivity f47791c;

    public mu0(ProfileActivity profileActivity, Context context) {
        this.f47791c = profileActivity;
        this.f47790b = context;
    }

    public static void a(mu0 mu0Var, Context context, int i3) {
        int i10;
        int i11;
        int i12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l10;
        Long l11;
        int i13;
        long j10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = org.telegram.messenger.hs.f23300s1;
        if (i3 == 0) {
            mu0Var.f47791c.getUserConfig().V = true;
            mu0Var.f47791c.getUserConfig().v(false);
            ProfileActivity profileActivity = mu0Var.f47791c;
            RectF rectF = ProfileActivity.T6;
            profileActivity.getContactsController().l();
        } else if (i3 == 1) {
            ProfileActivity profileActivity2 = mu0Var.f47791c;
            RectF rectF2 = ProfileActivity.T6;
            profileActivity2.getContactsController().A(0L, false);
        } else if (i3 == 2) {
            ProfileActivity profileActivity3 = mu0Var.f47791c;
            RectF rectF3 = ProfileActivity.T6;
            profileActivity3.getContactsController().K();
        } else if (i3 == 3) {
            mu0Var.f47791c.getMessagesController().A0();
        } else if (i3 == 4) {
            org.telegram.messenger.r2.f25040a = !org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.t0.f25457b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25040a).commit();
            ProfileActivity profileActivity4 = mu0Var.f47791c;
            RectF rectF4 = ProfileActivity.T6;
            profileActivity4.J5();
            mu0Var.f47791c.d.f();
            if (org.telegram.messenger.r2.f25040a) {
                k2.p1.r(org.telegram.messenger.t0.f25463s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0).versionCode);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i3 == 5) {
            org.telegram.messenger.az.f21679y0 = !org.telegram.messenger.az.f21679y0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.az.f21679y0);
            edit.apply();
        } else if (i3 == 6) {
            org.telegram.messenger.qr messagesStorage = mu0Var.f47791c.getMessagesStorage();
            messagesStorage.f24934a.c(new org.telegram.messenger.hq(messagesStorage, 11));
            org.telegram.messenger.az.D(false);
            org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.hp.e1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            b8.lf.a();
            i15 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
            org.telegram.messenger.hp.s1(i15).f23009f7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.az.J = 0;
            org.telegram.messenger.az.O = 0;
            org.telegram.messenger.az.R = false;
            org.telegram.messenger.az.P = false;
            org.telegram.messenger.az.Q = false;
            org.telegram.messenger.az.f21620c1 = 3;
            org.telegram.messenger.az.f21622d1 = 3;
            org.telegram.messenger.az.f21625e1 = 3;
            org.telegram.messenger.az.f21671v1 = 3;
            org.telegram.messenger.az.f21624e0 = 2;
            org.telegram.messenger.az.T(2);
            org.telegram.messenger.az.H(false);
            org.telegram.messenger.az.G(false);
            org.telegram.messenger.az.C(false);
            i16 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i16);
            f10.f22142c = 0L;
            f10.d = 0L;
            f10.h().edit().clear().apply();
            mu0Var.f47791c.getNotificationCenter().k(i20, new Object[0]);
            gy0.b0();
            i17 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
            tg.k0.e(i17).a();
            SharedPreferences sharedPreferences = mu0Var.f47791c.getMessagesController().f22999e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.k5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : sharedPreferences.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit2.remove(str6);
                }
            }
            edit2.apply();
            i18 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.hp.s1(i18).f22989d7.edit();
            i19 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
            for (String str7 : org.telegram.messenger.hp.s1(i19).f22989d7.getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit3.remove(str7);
                }
            }
            edit3.apply();
        } else if (i3 == 7) {
            org.telegram.ui.Components.voip.n1.i(mu0Var.f47791c.getParentActivity());
        } else if (i3 == 8) {
            org.telegram.messenger.az.f21682z0 = !org.telegram.messenger.az.f21682z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.hp.e1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.az.f21682z0);
            edit4.apply();
        } else if (i3 == 9) {
            ((LaunchActivity) mu0Var.f47791c.getParentActivity()).z(true);
        } else if (i3 == 10) {
            org.telegram.messenger.qr messagesStorage2 = mu0Var.f47791c.getMessagesStorage();
            messagesStorage2.f24934a.c(new org.telegram.messenger.kp(messagesStorage2, -1, 3));
        } else if (i3 == 11) {
            org.telegram.messenger.az.V = !org.telegram.messenger.az.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.hp.e1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.az.V);
            edit5.apply();
        } else if (i3 == 12) {
            org.telegram.messenger.az.f21639j1 = null;
            org.telegram.messenger.az.y();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.Q4, new Object[0]);
        } else if (i3 == 13) {
            Set set = mu0Var.f47791c.getMessagesController().T3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            mu0Var.f47791c.getNotificationCenter().k(i20, new Object[0]);
        } else {
            try {
                if (i3 == 14) {
                    org.telegram.messenger.t0.f25457b.deleteDatabase("webview.db");
                    org.telegram.messenger.t0.f25457b.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(org.telegram.messenger.t0.f25457b);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i3 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i3 == 16) {
                    org.telegram.messenger.az.K();
                    Activity parentActivity = mu0Var.f47791c.getParentActivity();
                    if (org.telegram.messenger.az.J0) {
                        i14 = 2131751619;
                    } else {
                        i14 = 2131751620;
                    }
                    Toast.makeText(parentActivity, org.telegram.messenger.bd.M0(i14, null), 0).show();
                } else if (i3 == 17) {
                    org.telegram.messenger.az.W = !org.telegram.messenger.az.W;
                    SharedPreferences.Editor edit6 = org.telegram.messenger.hp.e1().edit();
                    edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.az.W);
                    edit6.apply();
                    Activity W = org.telegram.messenger.g0.W(context);
                    Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                    W.finishAffinity();
                    W.startActivity(launchIntentForPackage);
                    System.exit(0);
                } else if (i3 == 18) {
                    n9.b.a((LaunchActivity) mu0Var.f47791c.getParentActivity(), !org.telegram.messenger.az.f21677x1, true);
                } else if (i3 == 19) {
                    mu0Var.f47791c.getMessagesController().R2(true);
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    mu0Var.f47791c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ku0(mu0Var, 0));
                } else if (i3 == 20) {
                    int i21 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f25457b.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    int i22 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    while (i22 < i21) {
                        Long i110 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_min_freq");
                        Long i111 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_cur_freq");
                        Long i112 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_max_freq");
                        Long i113 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i22);
                        sb2.append(" ");
                        if (i110 != null) {
                            sb2.append("min=");
                            long longValue = i110.longValue();
                            i13 = i22;
                            sb2.append(longValue / 1000);
                            sb2.append(" ");
                            j12++;
                            j11 = (i110.longValue() / 1000) + j11;
                        } else {
                            i13 = i22;
                        }
                        if (i111 != null) {
                            sb2.append("cur=");
                            j10 = j11;
                            sb2.append(i111.longValue() / 1000);
                            sb2.append(" ");
                            j13 += i111.longValue() / 1000;
                            j14++;
                        } else {
                            j10 = j11;
                        }
                        if (i112 != null) {
                            sb2.append("max=");
                            sb2.append(i112.longValue() / 1000);
                            sb2.append(" ");
                            j15 = (i112.longValue() / 1000) + j15;
                            j16++;
                        }
                        if (i113 != null) {
                            sb2.append("cpc=");
                            sb2.append(i113);
                            sb2.append(" ");
                            j17 = i113.longValue() + j17;
                            j18++;
                        }
                        sb2.append("\n");
                        i22 = i13 + 1;
                        j11 = j10;
                    }
                    long j19 = j11;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Build.MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.MODEL);
                    sb3.append(" (");
                    sb3.append(Build.PRODUCT);
                    sb3.append(", ");
                    sb3.append(Build.DEVICE);
                    sb3.append(")  (android ");
                    int i23 = Build.VERSION.SDK_INT;
                    sb3.append(i23);
                    sb3.append(")\n");
                    if (i23 >= 31) {
                        sb3.append("SoC: ");
                        sb3.append(Build.SOC_MANUFACTURER);
                        sb3.append(", ");
                        sb3.append(Build.SOC_MODEL);
                        sb3.append("\n");
                    }
                    String j110 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
                    if (j110 != null) {
                        sb3.append("GPU: ");
                        sb3.append(j110);
                        Long i114 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                        Long i115 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long i116 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                        if (i114 != null) {
                            sb3.append(", min=");
                            long longValue2 = i114.longValue();
                            l10 = i115;
                            l11 = i116;
                            sb3.append(longValue2 / 1000);
                        } else {
                            l10 = i115;
                            l11 = i116;
                        }
                        if (l10 != null) {
                            sb3.append(", mmin=");
                            sb3.append(l10.longValue() / 1000);
                        }
                        if (l11 != null) {
                            sb3.append(", max=");
                            sb3.append(l11.longValue() / 1000);
                        }
                        sb3.append("\n");
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.t0.f25457b.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb3.append("GLES Version: ");
                    sb3.append(deviceConfigurationInfo.getGlEsVersion());
                    sb3.append("\nMemory: class=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryClass * 1048576, false, false));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) org.telegram.messenger.t0.f25457b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb3.append(", total=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.totalMem, false, false));
                    sb3.append(", avail=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.availMem, false, false));
                    sb3.append(", low?=");
                    sb3.append(memoryInfo.lowMemory);
                    sb3.append(" (threshold=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.threshold, false, false));
                    sb3.append(")\nCurrent class: ");
                    sb3.append(org.telegram.messenger.az.x(org.telegram.messenger.az.o()));
                    sb3.append(", measured: ");
                    sb3.append(org.telegram.messenger.az.x(org.telegram.messenger.az.v()));
                    if (i23 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i21);
                    sb3.append(" CPUs");
                    if (j12 > 0) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j19 / j12);
                    }
                    if (j14 > 0) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j13 / j14);
                    }
                    if (j16 > 0) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j15 / j16);
                    }
                    if (j18 > 0) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j17 / j18);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    ProfileActivity.a1(mu0Var.f47791c, "video/avc", sb3);
                    ProfileActivity.a1(mu0Var.f47791c, "video/hevc", sb3);
                    ProfileActivity.a1(mu0Var.f47791c, "video/x-vnd.on2.vp8", sb3);
                    ProfileActivity.a1(mu0Var.f47791c, "video/x-vnd.on2.vp9", sb3);
                    mu0Var.f47791c.showDialog(new lu0(mu0Var, mu0Var.f47791c.getParentActivity(), sb3.toString()));
                } else if (i3 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu0Var.f47791c.getParentActivity(), mu0Var.f47791c.A0);
                    alertDialog$Builder.f27343a.S = "Force performance class";
                    int o10 = org.telegram.messenger.az.o();
                    int v = org.telegram.messenger.az.v();
                    if (o10 == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    String str8 = "";
                    if (v != 2) {
                        str2 = "";
                    } else {
                        str2 = " (measured)";
                    }
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str.concat(str2));
                    if (o10 == 1) {
                        str3 = "**AVERAGE**";
                    } else {
                        str3 = "AVERAGE";
                    }
                    if (v != 1) {
                        str4 = "";
                    } else {
                        str4 = " (measured)";
                    }
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(str3.concat(str4));
                    if (o10 == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (v == 0) {
                        str8 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{X2, X22, org.telegram.messenger.g0.X2(str5.concat(str8))}, new mt(v, 1));
                    k2.p1.v("Cancel", 2131752589, alertDialog$Builder, null);
                } else if (i3 == 22) {
                    org.telegram.messenger.az.N();
                } else if (i3 == 23) {
                    boolean q10 = gi.b1.q(mu0Var.f47791c.getParentActivity());
                    org.telegram.messenger.hp.e1().edit().putBoolean("dual_available", !q10).apply();
                    Activity parentActivity2 = mu0Var.f47791c.getParentActivity();
                    if (!q10) {
                        i12 = 2131751634;
                    } else {
                        i12 = 2131751636;
                    }
                    Toast.makeText(parentActivity2, org.telegram.messenger.bd.M0(i12, null), 0).show();
                } else if (i3 == 24) {
                    org.telegram.messenger.az.O();
                    for (int i24 = 0; i24 < mu0Var.f47791c.getParentLayout().getFragmentStack().size(); i24++) {
                        ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c.getParentLayout().getFragmentStack().get(i24)).clearSheets();
                    }
                } else if (i3 == 25) {
                    org.telegram.messenger.az.M();
                } else if (i3 == 26) {
                    org.telegram.messenger.az.L();
                } else if (i3 == 27) {
                    mu0Var.f47791c.getMediaDataController().E0(false, true, null);
                } else if (i3 == 28) {
                    i11 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
                    org.telegram.messenger.az.Q(i11);
                } else if (i3 == 29) {
                    ii.r.b();
                    ii.s0.c();
                    ii.i0.a();
                    ii.o4.c();
                } else if (i3 == 30) {
                    org.telegram.messenger.v0.a();
                } else if (i3 == 31) {
                    org.telegram.messenger.az.R();
                } else if (i3 == 32) {
                    org.telegram.messenger.az.J();
                } else if (i3 == 33) {
                    org.telegram.messenger.az.R0 = !org.telegram.messenger.az.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.hp.e1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.az.R0);
                    edit7.apply();
                } else if (i3 == 34) {
                    org.telegram.messenger.az.V0 = !org.telegram.messenger.az.V0;
                    org.telegram.messenger.g0.f22580a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.az.V0);
                    edit8.apply();
                } else if (i3 == 35) {
                    i10 = ((org.telegram.ui.ActionBar.d2) mu0Var.f47791c).currentAccount;
                    org.telegram.messenger.hp.s1(i10).R2(true);
                } else if (i3 == 36) {
                    org.telegram.messenger.az.f21646n = !org.telegram.messenger.az.f21646n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.hp.e1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.az.f21646n);
                    edit9.apply();
                } else if (i3 == 37) {
                    org.telegram.messenger.a8.j();
                    org.telegram.messenger.a8.c(true);
                } else if (i3 == 38) {
                    org.telegram.messenger.az.f21649o = !org.telegram.messenger.az.f21649o;
                    SharedPreferences.Editor edit10 = org.telegram.messenger.hp.e1().edit();
                    edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.az.f21649o);
                    edit10.apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean f(int i3, View view) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        String str4;
        int i12;
        String str5;
        String str6;
        String str7;
        String str8;
        char c2;
        String str9;
        String str10;
        int i13;
        ProfileActivity profileActivity = this.f47791c;
        ArrayList arrayList = profileActivity.R4;
        if (i3 == profileActivity.f41900z3) {
            int i14 = this.f47789a + 1;
            this.f47789a = i14;
            if (i14 < 2) {
                boolean z10 = org.telegram.messenger.r2.f25040a;
                try {
                    Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751626, "DebugMenuLongPress"), 0).show();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return true;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M0 = org.telegram.messenger.bd.M0(2131751647, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            String M02 = org.telegram.messenger.bd.M0(2131751630, null);
            String M03 = org.telegram.messenger.bd.M0(2131751624, null);
            String M04 = org.telegram.messenger.bd.M0(2131751623, null);
            String M05 = org.telegram.messenger.bd.M0(2131751622, null);
            boolean z11 = org.telegram.messenger.r2.f25040a;
            if (org.telegram.messenger.az.f21679y0) {
                str = "DebugMenuDisableCamera";
                i10 = 2131751641;
            } else {
                str = "DebugMenuEnableCamera";
                i10 = 2131751633;
            }
            String M06 = org.telegram.messenger.bd.M0(i10, str);
            String M07 = org.telegram.messenger.bd.M0(2131751644, "DebugMenuClearMediaCache");
            String M08 = org.telegram.messenger.bd.M0(2131751646, null);
            org.telegram.messenger.t0.u();
            org.telegram.messenger.t0.n();
            String M09 = org.telegram.messenger.bd.M0(2131751645, "DebugMenuCheckAppUpdate");
            String M010 = org.telegram.messenger.bd.M0(2131751625, "DebugMenuReadAllDialogs");
            String M011 = org.telegram.messenger.bd.M0(2131751642, null);
            if (org.telegram.messenger.az.J0) {
                i11 = 2131751639;
            } else {
                i11 = 2131751631;
            }
            String M012 = org.telegram.messenger.bd.M0(i11, null);
            org.telegram.messenger.g0.R1();
            if (gi.b1.q(profileActivity.getParentActivity())) {
                str2 = "DebugMenuDualOff";
            } else {
                str2 = "DebugMenuDualOn";
            }
            String N0 = org.telegram.messenger.bd.N0(str2);
            if (org.telegram.messenger.az.f21616b0) {
                str3 = "back to TextureView in stories";
            } else {
                str3 = "use SurfaceView in stories";
            }
            if (!org.telegram.messenger.az.f21621d0) {
                str4 = "Enable Invoice Payment";
            } else {
                str4 = "Disable Invoice Payment";
            }
            i12 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
            if (!org.telegram.messenger.az.s(i12)) {
                str5 = "Use Camera 2 API";
            } else {
                str5 = "Use old Camera 1 API";
            }
            if (org.telegram.messenger.az.e() && Build.VERSION.SDK_INT >= 31) {
                if (org.telegram.messenger.az.f21613a0) {
                    str6 = "back to cpu blur";
                } else {
                    str6 = "use new gpu blur";
                }
            } else {
                str6 = null;
            }
            if (org.telegram.messenger.az.f21670v0) {
                str7 = "Disabled adaptive browser colors";
            } else {
                str7 = "Enable adaptive browser colors";
            }
            if (org.telegram.messenger.az.R0) {
                str8 = "Disable video qualities debug";
            } else {
                str8 = "Enable video qualities debug";
            }
            String str11 = str6;
            if (Build.VERSION.SDK_INT >= 28) {
                if (org.telegram.messenger.az.V0) {
                    i13 = 2131751638;
                } else {
                    i13 = 2131751621;
                }
                c2 = 28;
                str9 = org.telegram.messenger.bd.M0(i13, null);
            } else {
                c2 = 28;
                str9 = null;
            }
            if (!org.telegram.messenger.az.f21646n) {
                str10 = "Force Forum Tabs";
            } else {
                str10 = "Do Not Force Forum Tabs";
            }
            String str12 = str10;
            CharSequence[] charSequenceArr = new CharSequence[39];
            charSequenceArr[0] = M02;
            charSequenceArr[1] = M03;
            charSequenceArr[2] = M04;
            charSequenceArr[3] = M05;
            charSequenceArr[4] = null;
            charSequenceArr[5] = M06;
            charSequenceArr[6] = M07;
            charSequenceArr[7] = M08;
            charSequenceArr[8] = null;
            charSequenceArr[9] = M09;
            charSequenceArr[10] = M010;
            charSequenceArr[11] = null;
            charSequenceArr[12] = null;
            charSequenceArr[13] = null;
            charSequenceArr[14] = null;
            charSequenceArr[15] = M011;
            charSequenceArr[16] = M012;
            charSequenceArr[17] = null;
            charSequenceArr[18] = null;
            charSequenceArr[19] = null;
            charSequenceArr[20] = null;
            charSequenceArr[21] = null;
            charSequenceArr[22] = null;
            charSequenceArr[23] = N0;
            charSequenceArr[24] = str3;
            charSequenceArr[25] = null;
            charSequenceArr[26] = str4;
            charSequenceArr[27] = null;
            charSequenceArr[c2] = str5;
            charSequenceArr[29] = "Clear Mini Apps Permissions and Files";
            charSequenceArr[30] = null;
            charSequenceArr[31] = str11;
            charSequenceArr[32] = str7;
            charSequenceArr[33] = str8;
            charSequenceArr[34] = str9;
            charSequenceArr[35] = "Reload app config";
            charSequenceArr[36] = str12;
            charSequenceArr[37] = "Make Memory Dump";
            charSequenceArr[38] = null;
            alertDialog$Builder.f(charSequenceArr, new u(9, this, this.f47790b));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
            profileActivity.showDialog(s1Var);
            return true;
        } else if (i3 >= profileActivity.f41863u4 && i3 < profileActivity.f41870v4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.C2.get(i3 - profileActivity.f41863u4)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(i3 - profileActivity.f41863u4);
            }
            return profileActivity.h(chatParticipant, true, false, view);
        } else if (i3 == profileActivity.U2) {
            if (profileActivity.Z3(i3, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.f41868v2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.g0.g(UserInfoActivity.e0(userFull.birthday));
                org.telegram.ui.Components.fc.a0(profileActivity).i(org.telegram.messenger.bd.M0(2131753716, null)).j();
                return true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return true;
            }
        } else if (i3 == profileActivity.H3) {
            profileActivity.Y3(i3, view);
            return true;
        } else if (profileActivity.Z3(i3, view)) {
            return true;
        } else {
            return profileActivity.Q4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i3, view);
        }
    }
}
