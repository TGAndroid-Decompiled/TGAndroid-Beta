package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fb1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final x5 B0;
    public final zg.e C0;
    public final eh.d D0;
    public ra1 E;
    public final eh.d E0;
    public ra1 F;
    public final zg.a F0;
    public bb1 G;
    public ca1 G0;
    public ra1 H;
    public final ArrayList H0;
    public ra1 I;
    public final RectF I0;
    public ra1 J;
    public final RectF J0;
    public ra1 K;
    public ra1 L;
    public ra1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.jo R;
    public ga1 S;
    public zg.k T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.kj0 W;
    public ka1 X;
    public da1 Y;
    public eb1 Z;
    public TLRPC.ChatFull f32740a;
    public hg.f f32741a0;
    public final long f32742b;
    public LinearLayout f32743b0;
    public boolean f32744c;
    public final boolean f32745c0;
    public ra1 d;
    public final boolean f32746d0;
    public ra1 e;
    public final boolean f32747e0;
    public ab1 f32748f;
    public long f32749f0;
    public long f32750g0;
    public ra1 h;
    public final org.telegram.ui.ActionBar.d2[] f32751h0;
    public bi.p1 f32752i0;
    public ec f32753j0;
    public le f32754k0;
    public final boolean f32755l0;
    public hh0 m0;
    public ra1 f32756n;
    public nh.b[] f32757n0;
    public int f32758o0;
    public final SparseIntArray f32759p0;
    public final SparseIntArray f32760q0;
    public ra1 f32761r;
    public final ArrayList f32762r0;
    public ra1 f32763s;
    public final ArrayList f32764s0;
    public final ArrayList f32765t0;
    public final ArrayList f32766u0;
    public ra1 v;
    public final ArrayList f32767v0;
    public ra1 f32768w;
    public boolean f32769w0;
    public ra1 f32770x;
    public boolean f32771x0;
    public ra1 f32772y;
    public sa1 f32773y0;
    public zh.a5 f32774z0;

    public fb1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f32751h0 = new org.telegram.ui.ActionBar.d2[1];
        this.f32758o0 = -1;
        this.f32759p0 = new SparseIntArray();
        this.f32760q0 = new SparseIntArray();
        this.f32762r0 = new ArrayList();
        this.f32764s0 = new ArrayList();
        this.f32765t0 = new ArrayList();
        this.f32766u0 = new ArrayList();
        this.f32767v0 = new ArrayList();
        this.f32771x0 = true;
        this.B0 = new x5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.f32742b = j3;
        this.f32745c0 = bundle.getBoolean("is_megagroup", false);
        this.f32746d0 = bundle.getBoolean("start_from_boosts", false);
        this.f32747e0 = bundle.getBoolean("start_from_monetization", false);
        this.f32755l0 = bundle.getBoolean("only_boosts", false);
        this.f32740a = getMessagesController().getChatFull(j3);
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new zg.e(false);
            this.D0 = new eh.d(null);
            eh.d dVar = new eh.d(null);
            this.E0 = dVar;
            zg.a aVar = new zg.a(dVar);
            this.F0 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new zg.a(cVar);
    }

    public static void U(fb1 fb1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(fb1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            fb1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new z91(fb1Var, arrayList, 0));
    }

    public static void V(fb1 fb1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = fb1Var.N;
        ArrayList arrayList6 = fb1Var.O;
        ArrayList arrayList7 = fb1Var.f32762r0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final ra1[] ra1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            ra1 ra1Var = ra1VarArr[2];
            if (ra1Var != null) {
                ra1Var.f36322n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.s a2 = ab1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f30871o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f30872p = (String) a2.f6118b;
            obj.f30873q = (String) a2.e;
            obj.f30874r = ((Boolean) a2.f6119c).booleanValue();
            obj.f30875s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = ab1.a(tL_broadcastStats.reactions_per_story);
            obj.f30876t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f30877u = (String) a10.f6118b;
            obj.v = (String) a10.e;
            obj.f30878w = ((Boolean) a10.f6119c).booleanValue();
            obj.f30879x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = ab1.a(tL_broadcastStats.views_per_story);
            obj.f30880y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f30881z = (String) a11.f6118b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f6119c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = ab1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f6118b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f6119c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f30860a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f30861b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f30862c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb3 = sb2.toString();
                    obj.f30862c = sb3 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f30862c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f30865i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f30866j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb6 = sb5.toString();
                    obj.f30867k = sb6 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f30867k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f30867k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f30868l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f30863f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb9 = sb8.toString();
                    obj.f30864g = sb9 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f30864g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f30864g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f30869m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f30870n = a4.a.m(i18, "%");
            } else {
                obj.f30870n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            fb1Var.f32748f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            fb1Var.f32749f0 = tL_statsDateRangeDays.max_date * 1000;
            fb1Var.f32750g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f31602a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    fb1Var.f32759p0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    fb1Var.f32765t0.add(obj2);
                    fb1Var.f32760q0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new z91(fb1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                fb1Var.getMessagesStorage().getMessages(-fb1Var.f32742b, 0L, false, arrayList12.size(), ((cb1) arrayList12.get(0)).b(), 0, 0, fb1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(fb1Var) {
                public final fb1 f38950b;

                {
                    this.f38950b = fb1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            fb1 fb1Var2 = this.f38950b;
                            fb1Var2.getClass();
                            ra1[] ra1VarArr2 = ra1VarArr;
                            fb1Var2.d = ra1VarArr2[0];
                            fb1Var2.H = ra1VarArr2[1];
                            fb1Var2.I = ra1VarArr2[2];
                            fb1Var2.J = ra1VarArr2[3];
                            fb1Var2.K = ra1VarArr2[4];
                            fb1Var2.L = ra1VarArr2[5];
                            fb1Var2.e = ra1VarArr2[6];
                            fb1Var2.M = ra1VarArr2[7];
                            fb1Var2.g0(ra1VarArr2);
                            return;
                        default:
                            fb1 fb1Var3 = this.f38950b;
                            fb1Var3.getClass();
                            ra1[] ra1VarArr3 = ra1VarArr;
                            fb1Var3.f32761r = ra1VarArr3[0];
                            fb1Var3.h = ra1VarArr3[1];
                            fb1Var3.e = ra1VarArr3[2];
                            fb1Var3.f32756n = ra1VarArr3[3];
                            fb1Var3.d = ra1VarArr3[4];
                            fb1Var3.f32763s = ra1VarArr3[5];
                            fb1Var3.v = ra1VarArr3[6];
                            fb1Var3.f32768w = ra1VarArr3[7];
                            fb1Var3.f32770x = ra1VarArr3[8];
                            fb1Var3.f32772y = ra1VarArr3[9];
                            fb1Var3.E = ra1VarArr3[10];
                            fb1Var3.F = ra1VarArr3[11];
                            fb1Var3.g0(ra1VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final ra1[] ra1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            ra1 ra1Var2 = ra1VarArr2[6];
            if (ra1Var2 != null) {
                ra1Var2.f36322n = true;
            }
            ra1 ra1Var3 = ra1VarArr2[7];
            if (ra1Var3 != null) {
                ra1Var3.f36323o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f31216a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f31217b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb12 = sb11.toString();
                    obj3.f31218c = sb12 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f31218c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f31218c = "";
            }
            if (i24 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f31221i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f31222j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb15 = sb14.toString();
                obj3.f31223k = sb15;
            } else {
                obj3.f31223k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f31224l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f31225m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f31226n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb17 = sb16.toString();
                obj3.f31227o = sb17;
            } else {
                obj3.f31227o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f31228p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f31219f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb19 = sb18.toString();
                obj3.f31220g = sb19;
            } else {
                obj3.f31220g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            fb1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            fb1Var.f32749f0 = tL_statsDateRangeDays2.max_date * 1000;
            fb1Var.f32750g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f38957a = ya1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f38958b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = fb1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f38957a = ya1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f38958b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = fb1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f38957a = ya1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f38958b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f38958b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(fb1Var) {
                public final fb1 f38950b;

                {
                    this.f38950b = fb1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            fb1 fb1Var2 = this.f38950b;
                            fb1Var2.getClass();
                            ra1[] ra1VarArr22 = ra1VarArr2;
                            fb1Var2.d = ra1VarArr22[0];
                            fb1Var2.H = ra1VarArr22[1];
                            fb1Var2.I = ra1VarArr22[2];
                            fb1Var2.J = ra1VarArr22[3];
                            fb1Var2.K = ra1VarArr22[4];
                            fb1Var2.L = ra1VarArr22[5];
                            fb1Var2.e = ra1VarArr22[6];
                            fb1Var2.M = ra1VarArr22[7];
                            fb1Var2.g0(ra1VarArr22);
                            return;
                        default:
                            fb1 fb1Var3 = this.f38950b;
                            fb1Var3.getClass();
                            ra1[] ra1VarArr3 = ra1VarArr2;
                            fb1Var3.f32761r = ra1VarArr3[0];
                            fb1Var3.h = ra1VarArr3[1];
                            fb1Var3.e = ra1VarArr3[2];
                            fb1Var3.f32756n = ra1VarArr3[3];
                            fb1Var3.d = ra1VarArr3[4];
                            fb1Var3.f32763s = ra1VarArr3[5];
                            fb1Var3.v = ra1VarArr3[6];
                            fb1Var3.f32768w = ra1VarArr3[7];
                            fb1Var3.f32770x = ra1VarArr3[8];
                            fb1Var3.f32772y = ra1VarArr3[9];
                            fb1Var3.E = ra1VarArr3[10];
                            fb1Var3.F = ra1VarArr3[11];
                            fb1Var3.g0(ra1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(fb1 fb1Var) {
        float f7;
        RectF rectF = fb1Var.J0;
        zg.e eVar = fb1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null && fb1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (fb1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            fb1Var.I0.set(0.0f, -dp, fb1Var.fragmentView.getMeasuredWidth(), fb1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), fb1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            eVar.g(2, fb1Var.H0);
            eVar.e(fb1Var.G0, fb1Var.fragmentView.getMeasuredWidth(), fb1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(fb1 fb1Var) {
        View currentView = fb1Var.f32752i0.getCurrentView();
        ec ecVar = fb1Var.f32753j0;
        if (currentView == ecVar) {
            fb1Var.actionBar.setAdaptiveBackground(ecVar.F);
            return;
        }
        le leVar = fb1Var.f32754k0;
        if (currentView == leVar) {
            fb1Var.actionBar.setAdaptiveBackground(leVar.f34662a1);
        } else {
            fb1Var.actionBar.setAdaptiveBackground(fb1Var.S);
        }
    }

    public static void Z(fb1 fb1Var) {
        eb1 eb1Var = fb1Var.Z;
        if (eb1Var != null) {
            eb1Var.f32144b = true;
        }
        int childCount = fb1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fb1Var.S.getChildAt(i10);
            if (childAt instanceof qa1) {
                ((qa1) childAt).f35753b.f9382t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f17195id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f17195id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new fb1(bundle);
        }
        return new w5(-chat.f17195id);
    }

    public static ig.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new ig.b(jSONObject);
        }
        if (i10 == 1) {
            return new ig.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new ig.b(jSONObject);
            int length = ((ig.a) bVar.d.get(0)).f10584a.length;
            int size = bVar.d.size();
            bVar.f10599l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f10599l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f10599l;
                    jArr[i11] = jArr[i11] + ((ig.a) bVar.d.get(i12)).f10584a[i11];
                }
            }
            bVar.f10600m = new SegmentTree(bVar.f10599l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new ig.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f10590a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((ig.a) bVar2.d.get(i13)).f10584a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f10590a.length / 2.0f) {
                        arrayList.add((ig.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((ig.a) obj);
                }
            }
            int length3 = ((ig.a) bVar2.d.get(0)).f10584a.length;
            int size3 = bVar2.d.size();
            bVar2.f10601l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f10601l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f10601l;
                    jArr3[i17] = jArr3[i17] + ((ig.a) bVar2.d.get(i18)).f10584a[i17];
                }
            }
            new SegmentTree(bVar2.f10601l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static ra1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        ra1 ra1Var = new ra1(str, i10);
        ra1Var.f36321m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                ig.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                ra1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                ra1Var.f36316g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f10590a) == null || jArr2.length < 2) {
                    ra1Var.f36320l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f10590a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    ra1Var.e = new ig.e(e02, j3);
                    ra1Var.f36314c = j3;
                    return ra1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            ra1Var.f36315f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return ra1Var;
    }

    public static void k0(ra1 ra1Var, ArrayList arrayList, org.telegram.ui.ActionBar.k6 k6Var) {
        ig.b bVar;
        int i10;
        if (ra1Var != null && (bVar = ra1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                ig.a aVar = (ig.a) obj;
                int i12 = aVar.f10588g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.j6.c1(i12)) {
                        int i13 = aVar.f10588g;
                        if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                            i10 = aVar.f10589i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.j6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.j6.nl[aVar.f10588g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, aVar.f10588g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof qa1) {
            ((qa1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.c7) {
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false)), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7), 0, 0);
            vqVar.f28580w = true;
            view.setBackground(vqVar);
        } else if (view instanceof jg.c) {
            ((jg.c) view).a();
        } else if (view instanceof za1) {
            int i10 = za1.d;
            ((za1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        hh0 hh0Var = this.m0;
        if (hh0Var != null) {
            hh0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12;
        if (this.f32744c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        ga1 ga1Var = this.S;
        if (ga1Var != null) {
            ga1Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ec ecVar = this.f32753j0;
        if (ecVar != null) {
            ecVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        le leVar = this.f32754k0;
        if (leVar != null) {
            leVar.f34662a1.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        float f7;
        String str;
        boolean z13;
        fb1 fb1Var = this;
        fb1Var.f32741a0 = new hg.f(null);
        MessagesController messagesController = MessagesController.getInstance(fb1Var.currentAccount);
        long j3 = fb1Var.f32742b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(fb1Var.currentAccount).getChatFull(j3);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(nh.b.b(context, fb1Var.resourceProvider, nh.a.I, R.string.Statistics));
        }
        arrayList.add(nh.b.b(context, fb1Var.resourceProvider, nh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(nh.b.b(context, fb1Var.resourceProvider, nh.a.MONETIZATION, R.string.Monetization));
        }
        fb1Var.f32757n0 = (nh.b[]) arrayList.toArray(new nh.b[0]);
        hh0 hh0Var = new hh0(context, fb1Var.resourceProvider);
        fb1Var.m0 = hh0Var;
        hh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            nh.b[] bVarArr = fb1Var.f32757n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            nh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new bi.j5(fb1Var, i11, 25));
            fb1Var.m0.addView(fb1Var.f32757n0[i11]);
            fb1Var.m0.i(bVar, true, false);
            i11++;
        }
        fb1Var.f32752i0 = new bi.p1(fb1Var, fb1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            fb1Var.f32753j0 = new ec(fb1Var, -j3, fb1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = fb1Var.getParentActivity();
            int i12 = fb1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            le leVar = new le(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            fb1Var = this;
            fb1Var.f32754k0 = leVar;
            leVar.setActionBar(fb1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        fb1Var.f32752i0.setAdapter(new fa1(fb1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = fb1Var.f32755l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        fb1Var.f32744c = z12;
        if (z12 && fb1Var.f32746d0) {
            fb1Var.f32752i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && fb1Var.f32747e0) {
            bi.p1 p1Var = fb1Var.f32752i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            p1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        fb1Var.m0(fb1Var.f32752i0.getCurrentPosition(), false);
        w8 w8Var = new w8(fb1Var, fb1Var.getParentActivity(), 8);
        fb1Var.actionBar.setDrawBlurBackground(w8Var);
        w8Var.setBackgroundColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        gh.k kVar = new gh.k(w8Var);
        zg.a aVar = fb1Var.F0;
        aVar.d = kVar;
        aVar.e = w8Var;
        w8Var.addView(fb1Var.f32752i0, w7.a6.g());
        w8Var.addView(fb1Var.actionBar);
        if (fb1Var.f32744c) {
            w8Var.addView(fb1Var.m0, w7.a6.e(344, 72, 81));
            fb1Var.setBulletinDelegate(new bi.fa(12));
        }
        fb1Var.fragmentView = w8Var;
        ga1 ga1Var = new ga1(fb1Var, context);
        fb1Var.S = ga1Var;
        ga1Var.setSections(true);
        fb1Var.S.setClipToPadding(false);
        ga1 ga1Var2 = fb1Var.S;
        Objects.requireNonNull(ga1Var2);
        fb1Var.T = new zg.k(ga1Var2, w8Var, new ys(ga1Var2, 1));
        ec ecVar = fb1Var.f32753j0;
        if (ecVar != null) {
            org.telegram.ui.Components.vl0 vl0Var = ecVar.F;
            Objects.requireNonNull(vl0Var);
            ecVar.G = new zg.k(vl0Var, w8Var, new ys(vl0Var, 0));
            fb1Var.f32753j0.F.j(new ea1(fb1Var, 1));
        }
        le leVar2 = fb1Var.f32754k0;
        if (leVar2 != null) {
            org.telegram.ui.Components.r61 r61Var = leVar2.f34662a1;
            Objects.requireNonNull(r61Var);
            leVar2.f34663b1 = new zg.k(r61Var, w8Var, new v8(r61Var, 0));
            fb1Var.f32754k0.f34662a1.j(new ea1(fb1Var, 2));
        }
        fb1Var.G0 = new ca1(fb1Var, w8Var);
        fb1Var.S.o1();
        LinearLayout linearLayout = new LinearLayout(context);
        fb1Var.f32743b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        fb1Var.W = imageView;
        imageView.setAutoRepeat(true);
        fb1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        fb1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.em.k(R.string.LoadingStatsDescription, textView2, 1);
        fb1Var.f32743b0.addView(fb1Var.W, w7.a6.t(120, 120, 1, 0, 0, 0, 20));
        fb1Var.f32743b0.addView(textView, w7.a6.t(-2, -2, 1, 0, 0, 0, 10));
        fb1Var.f32743b0.addView(textView2, w7.a6.q(-2, -2, 1));
        frameLayout3.addView(fb1Var.f32743b0, w7.a6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (fb1Var.X == null) {
            fb1Var.X = new ka1(fb1Var);
        }
        fb1Var.S.setAdapter(fb1Var.X);
        s4.c0 c0Var = new s4.c0();
        fb1Var.U = c0Var;
        fb1Var.S.setLayoutManager(c0Var);
        fb1Var.Y = new s4.j();
        fb1Var.S.setItemAnimator(null);
        fb1Var.S.j(new ea1(fb1Var, 0));
        fb1Var.S.setOnItemClickListener(new f31(fb1Var, 6));
        fb1Var.S.setOnItemLongClickListener(new ul0(fb1Var, 18));
        frameLayout3.addView(fb1Var.S);
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(context, null, false, null);
        fb1Var.R = joVar;
        joVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        fb1Var.R.getAvatarImageView().setScaleX(0.9f);
        fb1Var.R.getAvatarImageView().setScaleY(0.9f);
        fb1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.l lVar = fb1Var.actionBar;
        org.telegram.ui.Components.jo joVar2 = fb1Var.R;
        if (!fb1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        lVar.addView(joVar2, 0, w7.a6.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = fb1Var.getMessagesController().getChat(Long.valueOf(j3));
        fb1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.jo joVar3 = fb1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        joVar3.setTitle(str);
        org.telegram.ui.Components.jo joVar4 = fb1Var.R;
        if (joVar4.getSubtitleTextView() != null) {
            joVar4.getSubtitleTextView().setVisibility(8);
        }
        com.google.android.gms.internal.vision.e2.t(false, fb1Var.actionBar);
        fb1Var.actionBar.setActionBarMenuOnItemClick(new b91(fb1Var, 1));
        fb1Var.R.i(org.telegram.ui.ActionBar.j6.w0(null, i13, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        fb1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i13, false), false);
        fb1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i13, false), true);
        fb1Var.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18327z8, false), false);
        fb1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        boolean z16 = fb1Var.f32771x0;
        x5 x5Var = fb1Var.B0;
        if (z16) {
            fb1Var.f32743b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(x5Var, 500L);
            fb1Var.f32743b0.setVisibility(0);
            fb1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            fb1Var.f32743b0.setVisibility(8);
            fb1Var.S.setVisibility(0);
        }
        bh.d c10 = aVar.c(fb1Var.m0, dh.c.f(fb1Var.resourceProvider), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.666f));
        fb1Var.m0.setBackground(c10);
        fb1Var.c0();
        fb1Var.f32773y0 = new sa1(fb1Var.X, fb1Var.U);
        return fb1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.p2 p2Var2;
        org.telegram.ui.ActionBar.p2 p2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((zh.a5) objArr[0]) == this.f32774z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f32773y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    p2Var = (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(2, fragmentStack);
                } else {
                    p2Var = null;
                }
                if (p2Var instanceof yo) {
                    ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    p2Var2 = (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(2, fragmentStack2);
                } else {
                    p2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        p2Var3 = (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(3, fragmentStack2);
                    }
                    if (p2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
                    }
                    finishFragment();
                    if (p2Var3 instanceof eo) {
                        sg.i.f(p2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (p2Var2 instanceof ProfileActivity) {
                    sg.i.f(p2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f32762r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f32759p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((cb1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((cb1) arrayList.get(i14));
                        } else {
                            ((cb1) arrayList.get(i14)).f31603b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f32764s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    cb1 cb1Var = (cb1) arrayList.get(i12);
                    if (cb1Var.f31603b == null) {
                        this.f32758o0 = cb1Var.b();
                        break;
                    } else {
                        arrayList4.add(cb1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f32773y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f17196id == this.f32742b && this.f32740a == null) {
                this.f32740a = chatFull;
                i0();
            }
        }
    }

    public final void g0(ra1[] ra1VarArr) {
        ka1 ka1Var = this.X;
        if (ka1Var != null) {
            ka1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f32771x0 = false;
        LinearLayout linearLayout = this.f32743b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f32743b0.animate().alpha(0.0f).setDuration(230L).setListener(new mv0(this, 11));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (ra1 ra1Var : ra1VarArr) {
                if (ra1Var != null && ra1Var.d == null && ra1Var.f36315f != null) {
                    ra1Var.a(this.currentAccount, this.classGuid, this.f32740a.stats_dc, new org.telegram.ui.Components.f61(1, this, ra1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        ra1 ra1Var;
        ra1 ra1Var2;
        zy0 zy0Var = new zy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{jg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f17998h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18327z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f18289x6));
        int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i13));
        org.telegram.ui.Components.jo joVar = this.R;
        if (joVar != null) {
            l5Var = joVar.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        org.telegram.ui.Components.jo joVar2 = this.R;
        if (joVar2 != null) {
            view2 = joVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f32745c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    ra1Var2 = this.d;
                } else if (i14 == 1) {
                    ra1Var2 = this.H;
                } else if (i14 == 2) {
                    ra1Var2 = this.I;
                } else if (i14 == 3) {
                    ra1Var2 = this.J;
                } else if (i14 == 4) {
                    ra1Var2 = this.K;
                } else {
                    ra1Var2 = this.L;
                }
                k0(ra1Var2, arrayList, zy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    ra1Var = this.d;
                } else if (i15 == 1) {
                    ra1Var = this.h;
                } else if (i15 == 2) {
                    ra1Var = this.f32756n;
                } else if (i15 == 3) {
                    ra1Var = this.f32761r;
                } else if (i15 == 4) {
                    ra1Var = this.f32763s;
                } else if (i15 == 5) {
                    ra1Var = this.v;
                } else if (i15 == 6) {
                    ra1Var = this.f32770x;
                } else if (i15 == 7) {
                    ra1Var = this.e;
                } else if (i15 == 8) {
                    ra1Var = this.f32768w;
                } else if (i15 == 9) {
                    ra1Var = this.f32772y;
                } else if (i15 == 10) {
                    ra1Var = this.E;
                } else {
                    ra1Var = this.F;
                }
                k0(ra1Var, arrayList, zy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f17233id = new ArrayList<>();
        ArrayList arrayList = this.f32762r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f32759p0.get(this.f32758o0); i11 < size; i11++) {
            if (((cb1) arrayList.get(i11)).f31603b == null) {
                tL_channels_getMessages.f17233id.add(Integer.valueOf(((cb1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f32742b);
        this.f32769w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new ba1(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f32755l0) {
            return;
        }
        boolean z10 = this.f32745c0;
        long j3 = this.f32742b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new ba1(this, 1), null, null, 0, this.f32740a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        bi.p1 p1Var = this.f32752i0;
        if (p1Var != null && (p1Var.f27886b != 0 || p1Var.f27887c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f32766u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f32765t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            cb1 cb1Var = (cb1) obj;
            MessageObject f7 = this.f32774z0.f(cb1Var.b());
            if (f7 != null) {
                cb1Var.f31603b = f7;
                arrayList.add(cb1Var);
            }
        }
        this.f32760q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            nh.b[] bVarArr = this.f32757n0;
            if (i11 < bVarArr.length) {
                nh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f32757n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            nh.b bVar = this.f32757n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f32767v0;
        arrayList.clear();
        arrayList.addAll(this.f32764s0);
        arrayList.addAll(this.f32766u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.z0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        zh.i5 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f32742b;
        zh.a5 A = storiesController.A(-j3, 2, -1, true);
        this.f32774z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f32740a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.f32751h0;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
            d2VarArr[0] = null;
        }
        zh.a5 a5Var = this.f32774z0;
        if (a5Var != null) {
            a5Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
