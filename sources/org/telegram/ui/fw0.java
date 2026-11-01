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
public final class fw0 implements org.telegram.ui.Components.jk0 {
    public int f37244a = 0;
    public final Context f37245b;
    public final ProfileActivity f37246c;

    public fw0(ProfileActivity profileActivity, Context context) {
        this.f37246c = profileActivity;
        this.f37245b = context;
    }

    public static void a(fw0 fw0Var, Context context, int i10) {
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l4;
        Long l10;
        int i14;
        long j10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = org.telegram.messenger.at.f14781s1;
        if (i10 == 0) {
            fw0Var.f37246c.getUserConfig().U = true;
            fw0Var.f37246c.getUserConfig().v(false);
            ProfileActivity profileActivity = fw0Var.f37246c;
            RectF rectF = ProfileActivity.S6;
            profileActivity.getContactsController().l();
        } else if (i10 == 1) {
            ProfileActivity profileActivity2 = fw0Var.f37246c;
            RectF rectF2 = ProfileActivity.S6;
            profileActivity2.getContactsController().A(0L, false);
        } else if (i10 == 2) {
            ProfileActivity profileActivity3 = fw0Var.f37246c;
            RectF rectF3 = ProfileActivity.S6;
            profileActivity3.getContactsController().K();
        } else if (i10 == 3) {
            fw0Var.f37246c.getMessagesController().A0();
        } else if (i10 == 4) {
            org.telegram.messenger.v2.f18578a = !org.telegram.messenger.v2.f18578a;
            org.telegram.messenger.w0.f18945b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.f18578a).commit();
            ProfileActivity profileActivity4 = fw0Var.f37246c;
            RectF rectF4 = ProfileActivity.S6;
            profileActivity4.J5();
            fw0Var.f37246c.d.f();
            if (org.telegram.messenger.v2.f18578a) {
                i0.a.q(org.telegram.messenger.w0.f18950s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.f8.b("buildVersion = " + org.telegram.messenger.w0.f18945b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f18945b.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == 5) {
            org.telegram.messenger.uz.f18567y0 = !org.telegram.messenger.uz.f18567y0;
            SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.uz.f18567y0);
            edit.apply();
        } else if (i10 == 6) {
            org.telegram.messenger.is messagesStorage = fw0Var.f37246c.getMessagesStorage();
            messagesStorage.f16331a.c(new org.telegram.messenger.cr(messagesStorage, 11));
            org.telegram.messenger.uz.D(false);
            org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.wp.d1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            w7.a6.a();
            i16 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
            org.telegram.messenger.wp.r1(i16).f19138g7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.uz.J = 0;
            org.telegram.messenger.uz.O = 0;
            org.telegram.messenger.uz.R = false;
            org.telegram.messenger.uz.P = false;
            org.telegram.messenger.uz.Q = false;
            org.telegram.messenger.uz.f18508c1 = 3;
            org.telegram.messenger.uz.f18510d1 = 3;
            org.telegram.messenger.uz.f18512e1 = 3;
            org.telegram.messenger.uz.f18559v1 = 3;
            org.telegram.messenger.uz.f18511e0 = 2;
            org.telegram.messenger.uz.T(2);
            org.telegram.messenger.uz.H(false);
            org.telegram.messenger.uz.G(false);
            org.telegram.messenger.uz.C(false);
            i17 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
            org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i17);
            f7.f15857c = 0L;
            f7.d = 0L;
            f7.h().edit().clear().apply();
            fw0Var.f37246c.getNotificationCenter().k(i21, new Object[0]);
            e01.b0();
            i18 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
            ig.s0.e(i18).a();
            SharedPreferences sharedPreferences = fw0Var.f37246c.getMessagesController().f7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.m5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : sharedPreferences.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit2.remove(str6);
                }
            }
            edit2.apply();
            i19 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.wp.r1(i19).e7.edit();
            i20 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
            for (String str7 : org.telegram.messenger.wp.r1(i20).e7.getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit3.remove(str7);
                }
            }
            edit3.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.n1.i(fw0Var.f37246c.getParentActivity());
        } else if (i10 == 8) {
            org.telegram.messenger.uz.f18570z0 = !org.telegram.messenger.uz.f18570z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.wp.d1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.uz.f18570z0);
            edit4.apply();
        } else if (i10 == 9) {
            ((LaunchActivity) fw0Var.f37246c.getParentActivity()).y(true);
        } else if (i10 == 10) {
            org.telegram.messenger.is messagesStorage2 = fw0Var.f37246c.getMessagesStorage();
            messagesStorage2.f16331a.c(new org.telegram.messenger.zp(messagesStorage2, -1, 3));
        } else if (i10 == 11) {
            org.telegram.messenger.uz.V = !org.telegram.messenger.uz.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.wp.d1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.uz.V);
            edit5.apply();
        } else if (i10 == 12) {
            org.telegram.messenger.uz.f18526j1 = null;
            org.telegram.messenger.uz.y();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.Q4, new Object[0]);
        } else if (i10 == 13) {
            Set set = fw0Var.f37246c.getMessagesController().U3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            fw0Var.f37246c.getNotificationCenter().k(i21, new Object[0]);
        } else {
            try {
                if (i10 == 14) {
                    org.telegram.messenger.w0.f18945b.deleteDatabase("webview.db");
                    org.telegram.messenger.w0.f18945b.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(org.telegram.messenger.w0.f18945b);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i10 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i10 == 16) {
                    org.telegram.messenger.uz.K();
                    Activity parentActivity = fw0Var.f37246c.getParentActivity();
                    if (org.telegram.messenger.uz.J0) {
                        i15 = 2131751619;
                    } else {
                        i15 = 2131751620;
                    }
                    Toast.makeText(parentActivity, org.telegram.messenger.dd.L0(i15, null), 0).show();
                } else if (i10 == 17) {
                    org.telegram.messenger.uz.W = !org.telegram.messenger.uz.W;
                    SharedPreferences.Editor edit6 = org.telegram.messenger.wp.d1().edit();
                    edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.uz.W);
                    edit6.apply();
                    Activity W = org.telegram.messenger.i0.W(context);
                    Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                    W.finishAffinity();
                    W.startActivity(launchIntentForPackage);
                    System.exit(0);
                } else if (i10 == 18) {
                    v7.h7.a((LaunchActivity) fw0Var.f37246c.getParentActivity(), !org.telegram.messenger.uz.f18565x1, true);
                } else if (i10 == 19) {
                    fw0Var.f37246c.getMessagesController().P2(true);
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    fw0Var.f37246c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new dw0(fw0Var, 0));
                } else if (i10 == 20) {
                    int i22 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) org.telegram.messenger.w0.f18945b.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    int i23 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    while (i23 < i22) {
                        Long i110 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i23 + "/cpufreq/cpuinfo_min_freq");
                        Long i111 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i23 + "/cpufreq/cpuinfo_cur_freq");
                        Long i112 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i23 + "/cpufreq/cpuinfo_max_freq");
                        Long i113 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i23 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i23);
                        sb2.append(" ");
                        if (i110 != null) {
                            sb2.append("min=");
                            long longValue = i110.longValue();
                            i14 = i23;
                            sb2.append(longValue / 1000);
                            sb2.append(" ");
                            j12++;
                            j11 = (i110.longValue() / 1000) + j11;
                        } else {
                            i14 = i23;
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
                        i23 = i14 + 1;
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
                    int i24 = Build.VERSION.SDK_INT;
                    sb3.append(i24);
                    sb3.append(")\n");
                    if (i24 >= 31) {
                        sb3.append("SoC: ");
                        sb3.append(Build.SOC_MANUFACTURER);
                        sb3.append(", ");
                        sb3.append(Build.SOC_MODEL);
                        sb3.append("\n");
                    }
                    String j110 = org.telegram.messenger.i0.j1("/sys/kernel/gpu/gpu_model");
                    if (j110 != null) {
                        sb3.append("GPU: ");
                        sb3.append(j110);
                        Long i114 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_min_clock");
                        Long i115 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long i116 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_max_clock");
                        if (i114 != null) {
                            sb3.append(", min=");
                            long longValue2 = i114.longValue();
                            l4 = i115;
                            l10 = i116;
                            sb3.append(longValue2 / 1000);
                        } else {
                            l4 = i115;
                            l10 = i116;
                        }
                        if (l4 != null) {
                            sb3.append(", mmin=");
                            sb3.append(l4.longValue() / 1000);
                        }
                        if (l10 != null) {
                            sb3.append(", max=");
                            sb3.append(l10.longValue() / 1000);
                        }
                        sb3.append("\n");
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.w0.f18945b.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb3.append("GLES Version: ");
                    sb3.append(deviceConfigurationInfo.getGlEsVersion());
                    sb3.append("\nMemory: class=");
                    sb3.append(org.telegram.messenger.i0.i0(memoryClass * 1048576, false, false));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) org.telegram.messenger.w0.f18945b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb3.append(", total=");
                    sb3.append(org.telegram.messenger.i0.i0(memoryInfo.totalMem, false, false));
                    sb3.append(", avail=");
                    sb3.append(org.telegram.messenger.i0.i0(memoryInfo.availMem, false, false));
                    sb3.append(", low?=");
                    sb3.append(memoryInfo.lowMemory);
                    sb3.append(" (threshold=");
                    sb3.append(org.telegram.messenger.i0.i0(memoryInfo.threshold, false, false));
                    sb3.append(")\nCurrent class: ");
                    sb3.append(org.telegram.messenger.uz.x(org.telegram.messenger.uz.o()));
                    sb3.append(", measured: ");
                    sb3.append(org.telegram.messenger.uz.x(org.telegram.messenger.uz.v()));
                    if (i24 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i22);
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
                    ProfileActivity.a1(fw0Var.f37246c, "video/avc", sb3);
                    ProfileActivity.a1(fw0Var.f37246c, "video/hevc", sb3);
                    ProfileActivity.a1(fw0Var.f37246c, "video/x-vnd.on2.vp8", sb3);
                    ProfileActivity.a1(fw0Var.f37246c, "video/x-vnd.on2.vp9", sb3);
                    fw0Var.f37246c.showDialog(new ew0(fw0Var, fw0Var.f37246c.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, fw0Var.f37246c.getParentActivity(), fw0Var.f37246c.f33957z0);
                    alertDialog$Builder.f20135a.R = "Force performance class";
                    int o10 = org.telegram.messenger.uz.o();
                    int v = org.telegram.messenger.uz.v();
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
                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(str.concat(str2));
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
                    SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(str3.concat(str4));
                    if (o10 == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (v == 0) {
                        str8 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{W2, W22, org.telegram.messenger.i0.W2(str5.concat(str8))}, new pu(v, 1));
                    i0.a.s("Cancel", 2131752589, alertDialog$Builder, null);
                } else if (i10 == 22) {
                    org.telegram.messenger.uz.N();
                } else if (i10 == 23) {
                    boolean q6 = vh.v0.q(fw0Var.f37246c.getParentActivity());
                    org.telegram.messenger.wp.d1().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity2 = fw0Var.f37246c.getParentActivity();
                    if (!q6) {
                        i13 = 2131751634;
                    } else {
                        i13 = 2131751636;
                    }
                    Toast.makeText(parentActivity2, org.telegram.messenger.dd.L0(i13, null), 0).show();
                } else if (i10 == 24) {
                    org.telegram.messenger.uz.O();
                    for (int i25 = 0; i25 < fw0Var.f37246c.getParentLayout().getFragmentStack().size(); i25++) {
                        ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c.getParentLayout().getFragmentStack().get(i25)).clearSheets();
                    }
                } else if (i10 == 25) {
                    org.telegram.messenger.uz.M();
                } else if (i10 == 26) {
                    org.telegram.messenger.uz.L();
                } else if (i10 == 27) {
                    fw0Var.f37246c.getMediaDataController().E0(false, true, null);
                } else if (i10 == 28) {
                    i12 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
                    org.telegram.messenger.uz.Q(i12);
                } else if (i10 == 29) {
                    xh.n.b();
                    xh.o0.c();
                    xh.f0.a();
                    xh.r3.c();
                } else if (i10 == 30) {
                    org.telegram.messenger.y0.a();
                } else if (i10 == 31) {
                    org.telegram.messenger.uz.R();
                } else if (i10 == 32) {
                    org.telegram.messenger.uz.J();
                } else if (i10 == 33) {
                    org.telegram.messenger.uz.R0 = !org.telegram.messenger.uz.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.wp.d1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.uz.R0);
                    edit7.apply();
                } else if (i10 == 34) {
                    org.telegram.messenger.uz.V0 = !org.telegram.messenger.uz.V0;
                    org.telegram.messenger.i0.f16145a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.wp.d1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.uz.V0);
                    edit8.apply();
                } else if (i10 == 35) {
                    i11 = ((org.telegram.ui.ActionBar.k2) fw0Var.f37246c).currentAccount;
                    org.telegram.messenger.wp.r1(i11).P2(true);
                } else if (i10 == 36) {
                    org.telegram.messenger.uz.f18534n = !org.telegram.messenger.uz.f18534n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.wp.d1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.uz.f18534n);
                    edit9.apply();
                } else if (i10 == 37) {
                    org.telegram.messenger.f8.j();
                    org.telegram.messenger.f8.c(true);
                } else if (i10 == 38) {
                    org.telegram.messenger.uz.f18537o = !org.telegram.messenger.uz.f18537o;
                    SharedPreferences.Editor edit10 = org.telegram.messenger.wp.d1().edit();
                    edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.uz.f18537o);
                    edit10.apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean f(int i10, View view) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        String str4;
        int i13;
        String str5;
        String str6;
        String str7;
        String str8;
        char c10;
        String str9;
        String str10;
        int i14;
        ProfileActivity profileActivity = this.f37246c;
        ArrayList arrayList = profileActivity.Q4;
        if (i10 == profileActivity.y3) {
            int i15 = this.f37244a + 1;
            this.f37244a = i15;
            if (i15 < 2) {
                boolean z10 = org.telegram.messenger.v2.f18578a;
                try {
                    Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131751626, "DebugMenuLongPress"), 0).show();
                    return true;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return true;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33957z0);
            String L0 = org.telegram.messenger.dd.L0(2131751647, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            String L02 = org.telegram.messenger.dd.L0(2131751630, null);
            String L03 = org.telegram.messenger.dd.L0(2131751624, null);
            String L04 = org.telegram.messenger.dd.L0(2131751623, null);
            String L05 = org.telegram.messenger.dd.L0(2131751622, null);
            boolean z11 = org.telegram.messenger.v2.f18578a;
            if (org.telegram.messenger.uz.f18567y0) {
                str = "DebugMenuDisableCamera";
                i11 = 2131751641;
            } else {
                str = "DebugMenuEnableCamera";
                i11 = 2131751633;
            }
            String L06 = org.telegram.messenger.dd.L0(i11, str);
            String L07 = org.telegram.messenger.dd.L0(2131751644, "DebugMenuClearMediaCache");
            String L08 = org.telegram.messenger.dd.L0(2131751646, null);
            org.telegram.messenger.w0.u();
            org.telegram.messenger.w0.n();
            String L09 = org.telegram.messenger.dd.L0(2131751645, "DebugMenuCheckAppUpdate");
            String L010 = org.telegram.messenger.dd.L0(2131751625, "DebugMenuReadAllDialogs");
            String L011 = org.telegram.messenger.dd.L0(2131751642, null);
            if (org.telegram.messenger.uz.J0) {
                i12 = 2131751639;
            } else {
                i12 = 2131751631;
            }
            String L012 = org.telegram.messenger.dd.L0(i12, null);
            org.telegram.messenger.i0.R1();
            if (vh.v0.q(profileActivity.getParentActivity())) {
                str2 = "DebugMenuDualOff";
            } else {
                str2 = "DebugMenuDualOn";
            }
            String M0 = org.telegram.messenger.dd.M0(str2);
            if (org.telegram.messenger.uz.f18504b0) {
                str3 = "back to TextureView in stories";
            } else {
                str3 = "use SurfaceView in stories";
            }
            if (!org.telegram.messenger.uz.f18509d0) {
                str4 = "Enable Invoice Payment";
            } else {
                str4 = "Disable Invoice Payment";
            }
            i13 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
            if (!org.telegram.messenger.uz.s(i13)) {
                str5 = "Use Camera 2 API";
            } else {
                str5 = "Use old Camera 1 API";
            }
            if (org.telegram.messenger.uz.e() && Build.VERSION.SDK_INT >= 31) {
                if (org.telegram.messenger.uz.f18501a0) {
                    str6 = "back to cpu blur";
                } else {
                    str6 = "use new gpu blur";
                }
            } else {
                str6 = null;
            }
            if (org.telegram.messenger.uz.f18558v0) {
                str7 = "Disabled adaptive browser colors";
            } else {
                str7 = "Enable adaptive browser colors";
            }
            if (org.telegram.messenger.uz.R0) {
                str8 = "Disable video qualities debug";
            } else {
                str8 = "Enable video qualities debug";
            }
            String str11 = str6;
            if (Build.VERSION.SDK_INT >= 28) {
                if (org.telegram.messenger.uz.V0) {
                    i14 = 2131751638;
                } else {
                    i14 = 2131751621;
                }
                c10 = 28;
                str9 = org.telegram.messenger.dd.L0(i14, null);
            } else {
                c10 = 28;
                str9 = null;
            }
            if (!org.telegram.messenger.uz.f18534n) {
                str10 = "Force Forum Tabs";
            } else {
                str10 = "Do Not Force Forum Tabs";
            }
            String str12 = str10;
            CharSequence[] charSequenceArr = new CharSequence[39];
            charSequenceArr[0] = L02;
            charSequenceArr[1] = L03;
            charSequenceArr[2] = L04;
            charSequenceArr[3] = L05;
            charSequenceArr[4] = null;
            charSequenceArr[5] = L06;
            charSequenceArr[6] = L07;
            charSequenceArr[7] = L08;
            charSequenceArr[8] = null;
            charSequenceArr[9] = L09;
            charSequenceArr[10] = L010;
            charSequenceArr[11] = null;
            charSequenceArr[12] = null;
            charSequenceArr[13] = null;
            charSequenceArr[14] = null;
            charSequenceArr[15] = L011;
            charSequenceArr[16] = L012;
            charSequenceArr[17] = null;
            charSequenceArr[18] = null;
            charSequenceArr[19] = null;
            charSequenceArr[20] = null;
            charSequenceArr[21] = null;
            charSequenceArr[22] = null;
            charSequenceArr[23] = M0;
            charSequenceArr[24] = str3;
            charSequenceArr[25] = null;
            charSequenceArr[26] = str4;
            charSequenceArr[27] = null;
            charSequenceArr[c10] = str5;
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
            alertDialog$Builder.f(charSequenceArr, new eg.j(11, this, this.f37245b));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
            profileActivity.showDialog(x1Var);
            return true;
        } else if (i10 >= profileActivity.f33917t4 && i10 < profileActivity.f33924u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.B2.get(i10 - profileActivity.f33917t4)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.f33917t4);
            }
            return profileActivity.h(chatParticipant, true, false, view);
        } else if (i10 == profileActivity.T2) {
            if (profileActivity.Z3(i10, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.f33922u2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.i0.g(UserInfoActivity.e0(userFull.birthday));
                org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.dd.L0(2131753716, null)).j();
                return true;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return true;
            }
        } else if (i10 == profileActivity.G3) {
            profileActivity.Y3(i10, view);
            return true;
        } else if (profileActivity.Z3(i10, view)) {
            return true;
        } else {
            return profileActivity.Q4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i10, view);
        }
    }
}
