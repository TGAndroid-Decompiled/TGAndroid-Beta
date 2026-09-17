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
public final class ab1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final w5 B0;
    public final ah.i C0;
    public final fh.d D0;
    public ma1 E;
    public final fh.d E0;
    public ma1 F;
    public final ah.c F0;
    public wa1 G;
    public x91 G0;
    public ma1 H;
    public final ArrayList H0;
    public ma1 I;
    public final RectF I0;
    public ma1 J;
    public final RectF J0;
    public ma1 K;
    public ma1 L;
    public ma1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.eo R;
    public ba1 S;
    public ah.o T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.bj0 W;
    public fa1 X;
    public y91 Y;
    public za1 Z;
    public TLRPC.ChatFull f31782a;
    public ig.f f31783a0;
    public final long f31784b;
    public LinearLayout f31785b0;
    public boolean f31786c;
    public final boolean f31787c0;
    public ma1 d;
    public final boolean f31788d0;
    public ma1 e;
    public final boolean f31789e0;
    public va1 f31790f;
    public long f31791f0;
    public long f31792g0;
    public ma1 h;
    public final org.telegram.ui.ActionBar.c2[] f31793h0;
    public ci.i1 f31794i0;
    public ec f31795j0;
    public le f31796k0;
    public final boolean f31797l0;
    public ih0 m0;
    public ma1 f31798n;
    public oh.b[] f31799n0;
    public int f31800o0;
    public final SparseIntArray f31801p0;
    public final SparseIntArray f31802q0;
    public ma1 f31803r;
    public final ArrayList f31804r0;
    public ma1 f31805s;
    public final ArrayList f31806s0;
    public final ArrayList f31807t0;
    public final ArrayList f31808u0;
    public ma1 v;
    public final ArrayList f31809v0;
    public ma1 f31810w;
    public boolean f31811w0;
    public ma1 f31812x;
    public boolean f31813x0;
    public ma1 f31814y;
    public na1 f31815y0;
    public ai.d9 f31816z0;

    public ab1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f31793h0 = new org.telegram.ui.ActionBar.c2[1];
        this.f31800o0 = -1;
        this.f31801p0 = new SparseIntArray();
        this.f31802q0 = new SparseIntArray();
        this.f31804r0 = new ArrayList();
        this.f31806s0 = new ArrayList();
        this.f31807t0 = new ArrayList();
        this.f31808u0 = new ArrayList();
        this.f31809v0 = new ArrayList();
        this.f31813x0 = true;
        this.B0 = new w5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.f31784b = j3;
        this.f31787c0 = bundle.getBoolean("is_megagroup", false);
        this.f31788d0 = bundle.getBoolean("start_from_boosts", false);
        this.f31789e0 = bundle.getBoolean("start_from_monetization", false);
        this.f31797l0 = bundle.getBoolean("only_boosts", false);
        this.f31782a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new ah.i(false);
            this.D0 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.E0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.F0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new ah.c(cVar);
    }

    public static void U(ab1 ab1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ab1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ab1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new u91(ab1Var, arrayList, 0));
    }

    public static void V(ab1 ab1Var, TLObject tLObject) {
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
        ArrayList arrayList5 = ab1Var.N;
        ArrayList arrayList6 = ab1Var.O;
        ArrayList arrayList7 = ab1Var.f31804r0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final ma1[] ma1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            ma1 ma1Var = ma1VarArr[2];
            if (ma1Var != null) {
                ma1Var.f35751n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.t a2 = va1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f38360o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f38361p = (String) a2.f7352b;
            obj.f38362q = (String) a2.e;
            obj.f38363r = ((Boolean) a2.f7353c).booleanValue();
            obj.f38364s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a10 = va1.a(tL_broadcastStats.reactions_per_story);
            obj.f38365t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f38366u = (String) a10.f7352b;
            obj.v = (String) a10.e;
            obj.f38367w = ((Boolean) a10.f7353c).booleanValue();
            obj.f38368x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = va1.a(tL_broadcastStats.views_per_story);
            obj.f38369y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f38370z = (String) a11.f7352b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7353c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.t a12 = va1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7352b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7353c).booleanValue();
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
            obj.f38349a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f38350b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f38351c = "";
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
                    obj.f38351c = sb3 + " (" + i13 + "%)";
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
                    obj.f38351c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
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
            obj.f38354i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f38355j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f38356k = sb6 + " (" + i15 + "%)";
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
                    obj.f38356k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f38356k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f38357l = z15;
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
            obj.f38352f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f38353g = sb9 + " (" + i17 + "%)";
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
                    obj.f38353g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f38353g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f38358m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f38359n = a4.a.m(i18, "%");
            } else {
                obj.f38359n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ab1Var.f31790f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ab1Var.f31791f0 = tL_statsDateRangeDays.max_date * 1000;
            ab1Var.f31792g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f39505a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    ab1Var.f31801p0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    ab1Var.f31807t0.add(obj2);
                    ab1Var.f31802q0.put(obj2.b(), i20);
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
            AndroidUtilities.runOnUIThread(new u91(ab1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ab1Var.getMessagesStorage().getMessages(-ab1Var.f31784b, 0L, false, arrayList12.size(), ((xa1) arrayList12.get(0)).b(), 0, 0, ab1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(ab1Var) {
                public final ab1 f37693b;

                {
                    this.f37693b = ab1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ab1 ab1Var2 = this.f37693b;
                            ab1Var2.getClass();
                            ma1[] ma1VarArr2 = ma1VarArr;
                            ab1Var2.d = ma1VarArr2[0];
                            ab1Var2.H = ma1VarArr2[1];
                            ab1Var2.I = ma1VarArr2[2];
                            ab1Var2.J = ma1VarArr2[3];
                            ab1Var2.K = ma1VarArr2[4];
                            ab1Var2.L = ma1VarArr2[5];
                            ab1Var2.e = ma1VarArr2[6];
                            ab1Var2.M = ma1VarArr2[7];
                            ab1Var2.g0(ma1VarArr2);
                            return;
                        default:
                            ab1 ab1Var3 = this.f37693b;
                            ab1Var3.getClass();
                            ma1[] ma1VarArr3 = ma1VarArr;
                            ab1Var3.f31803r = ma1VarArr3[0];
                            ab1Var3.h = ma1VarArr3[1];
                            ab1Var3.e = ma1VarArr3[2];
                            ab1Var3.f31798n = ma1VarArr3[3];
                            ab1Var3.d = ma1VarArr3[4];
                            ab1Var3.f31805s = ma1VarArr3[5];
                            ab1Var3.v = ma1VarArr3[6];
                            ab1Var3.f31810w = ma1VarArr3[7];
                            ab1Var3.f31812x = ma1VarArr3[8];
                            ab1Var3.f31814y = ma1VarArr3[9];
                            ab1Var3.E = ma1VarArr3[10];
                            ab1Var3.F = ma1VarArr3[11];
                            ab1Var3.g0(ma1VarArr3);
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
            final ma1[] ma1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            ma1 ma1Var2 = ma1VarArr2[6];
            if (ma1Var2 != null) {
                ma1Var2.f35751n = true;
            }
            ma1 ma1Var3 = ma1VarArr2[7];
            if (ma1Var3 != null) {
                ma1Var3.f35752o = true;
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
            obj3.f38631a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f38632b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f38633c = sb12 + " (" + i25 + "%)";
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
                    obj3.f38633c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f38633c = "";
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
            obj3.f38636i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f38637j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f38638k = sb15;
            } else {
                obj3.f38638k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f38639l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f38640m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f38641n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f38642o = sb17;
            } else {
                obj3.f38642o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f38643p = z12;
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
            obj3.f38634f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f38635g = sb19;
            } else {
                obj3.f38635g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            ab1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ab1Var.f31791f0 = tL_statsDateRangeDays2.max_date * 1000;
            ab1Var.f31792g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f37702a = ta1.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    obj4.f37703b = sb20.toString();
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
                    ArrayList arrayList19 = ab1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f37702a = ta1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    obj5.f37703b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ab1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f37702a = ta1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f37703b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f37703b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(ab1Var) {
                public final ab1 f37693b;

                {
                    this.f37693b = ab1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ab1 ab1Var2 = this.f37693b;
                            ab1Var2.getClass();
                            ma1[] ma1VarArr22 = ma1VarArr2;
                            ab1Var2.d = ma1VarArr22[0];
                            ab1Var2.H = ma1VarArr22[1];
                            ab1Var2.I = ma1VarArr22[2];
                            ab1Var2.J = ma1VarArr22[3];
                            ab1Var2.K = ma1VarArr22[4];
                            ab1Var2.L = ma1VarArr22[5];
                            ab1Var2.e = ma1VarArr22[6];
                            ab1Var2.M = ma1VarArr22[7];
                            ab1Var2.g0(ma1VarArr22);
                            return;
                        default:
                            ab1 ab1Var3 = this.f37693b;
                            ab1Var3.getClass();
                            ma1[] ma1VarArr3 = ma1VarArr2;
                            ab1Var3.f31803r = ma1VarArr3[0];
                            ab1Var3.h = ma1VarArr3[1];
                            ab1Var3.e = ma1VarArr3[2];
                            ab1Var3.f31798n = ma1VarArr3[3];
                            ab1Var3.d = ma1VarArr3[4];
                            ab1Var3.f31805s = ma1VarArr3[5];
                            ab1Var3.v = ma1VarArr3[6];
                            ab1Var3.f31810w = ma1VarArr3[7];
                            ab1Var3.f31812x = ma1VarArr3[8];
                            ab1Var3.f31814y = ma1VarArr3[9];
                            ab1Var3.E = ma1VarArr3[10];
                            ab1Var3.F = ma1VarArr3[11];
                            ab1Var3.g0(ma1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(ab1 ab1Var) {
        float f7;
        RectF rectF = ab1Var.J0;
        ah.i iVar = ab1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null && ab1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (ab1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            ab1Var.I0.set(0.0f, -dp, ab1Var.fragmentView.getMeasuredWidth(), ab1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), ab1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            iVar.g(2, ab1Var.H0);
            iVar.e(ab1Var.G0, ab1Var.fragmentView.getMeasuredWidth(), ab1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(ab1 ab1Var) {
        View currentView = ab1Var.f31794i0.getCurrentView();
        ec ecVar = ab1Var.f31795j0;
        if (currentView == ecVar) {
            ab1Var.actionBar.setAdaptiveBackground(ecVar.F);
            return;
        }
        le leVar = ab1Var.f31796k0;
        if (currentView == leVar) {
            ab1Var.actionBar.setAdaptiveBackground(leVar.f35504a1);
        } else {
            ab1Var.actionBar.setAdaptiveBackground(ab1Var.S);
        }
    }

    public static void Z(ab1 ab1Var) {
        za1 za1Var = ab1Var.Z;
        if (za1Var != null) {
            za1Var.f40196b = true;
        }
        int childCount = ab1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ab1Var.S.getChildAt(i10);
            if (childAt instanceof la1) {
                ((la1) childAt).f35174b.f11165t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f18121id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18121id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new ab1(bundle);
        }
        return new v5(-chat.f18121id);
    }

    public static jg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new jg.b(jSONObject);
        }
        if (i10 == 1) {
            return new jg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new jg.b(jSONObject);
            int length = ((jg.a) bVar.d.get(0)).f12995a.length;
            int size = bVar.d.size();
            bVar.f13010l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f13010l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f13010l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f12995a[i11];
                }
            }
            bVar.f13011m = new SegmentTree(bVar.f13010l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f13001a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f12995a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f13001a.length / 2.0f) {
                        arrayList.add((jg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((jg.a) obj);
                }
            }
            int length3 = ((jg.a) bVar2.d.get(0)).f12995a.length;
            int size3 = bVar2.d.size();
            bVar2.f13012l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f13012l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f13012l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f12995a[i17];
                }
            }
            new SegmentTree(bVar2.f13012l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static ma1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        ma1 ma1Var = new ma1(str, i10);
        ma1Var.f35750m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                ma1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                ma1Var.f35745g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f13001a) == null || jArr2.length < 2) {
                    ma1Var.f35749l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f13001a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    ma1Var.e = new jg.e(e02, j3);
                    ma1Var.f35743c = j3;
                    return ma1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            ma1Var.f35744f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return ma1Var;
    }

    public static void k0(ma1 ma1Var, ArrayList arrayList, org.telegram.ui.ActionBar.k6 k6Var) {
        jg.b bVar;
        int i10;
        if (ma1Var != null && (bVar = ma1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f12999g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.j6.c1(i12)) {
                        int i13 = aVar.f12999g;
                        if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                            i10 = aVar.f13000i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.j6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.j6.nl[aVar.f12999g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, aVar.f12999g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof la1) {
            ((la1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false)), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f18826b7), 0, 0);
            pqVar.f27113w = true;
            view.setBackground(pqVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof ua1) {
            int i10 = ua1.d;
            ((ua1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        ih0 ih0Var = this.m0;
        if (ih0Var != null) {
            ih0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f31786c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        ba1 ba1Var = this.S;
        if (ba1Var != null) {
            ba1Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ec ecVar = this.f31795j0;
        if (ecVar != null) {
            ecVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        le leVar = this.f31796k0;
        if (leVar != null) {
            leVar.f35504a1.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
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
        ab1 ab1Var = this;
        ab1Var.f31783a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ab1Var.currentAccount);
        long j3 = ab1Var.f31784b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ab1Var.currentAccount).getChatFull(j3);
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
            arrayList.add(oh.b.b(context, ab1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ab1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ab1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        ab1Var.f31799n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        ih0 ih0Var = new ih0(context, ab1Var.resourceProvider);
        ab1Var.m0 = ih0Var;
        ih0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = ab1Var.f31799n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.o4(ab1Var, i11, 25));
            ab1Var.m0.addView(ab1Var.f31799n0[i11]);
            ab1Var.m0.i(bVar, true, false);
            i11++;
        }
        ab1Var.f31794i0 = new ci.i1(ab1Var, ab1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            ab1Var.f31795j0 = new ec(ab1Var, -j3, ab1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = ab1Var.getParentActivity();
            int i12 = ab1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            le leVar = new le(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            ab1Var = this;
            ab1Var.f31796k0 = leVar;
            leVar.setActionBar(ab1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        ab1Var.f31794i0.setAdapter(new aa1(ab1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = ab1Var.f31797l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        ab1Var.f31786c = z12;
        if (z12 && ab1Var.f31788d0) {
            ab1Var.f31794i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && ab1Var.f31789e0) {
            ci.i1 i1Var = ab1Var.f31794i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        ab1Var.m0(ab1Var.f31794i0.getCurrentPosition(), false);
        y8 y8Var = new y8(ab1Var, ab1Var.getParentActivity(), 8);
        ab1Var.actionBar.setDrawBlurBackground(y8Var);
        y8Var.setBackgroundColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7));
        hh.k kVar = new hh.k(y8Var);
        ah.c cVar = ab1Var.F0;
        cVar.f425f = kVar;
        cVar.f426g = y8Var;
        y8Var.addView(ab1Var.f31794i0, w7.x5.g());
        y8Var.addView(ab1Var.actionBar);
        if (ab1Var.f31786c) {
            y8Var.addView(ab1Var.m0, w7.x5.e(344, 72, 81));
            ab1Var.setBulletinDelegate(new ci.d9(12));
        }
        ab1Var.fragmentView = y8Var;
        ba1 ba1Var = new ba1(ab1Var, context);
        ab1Var.S = ba1Var;
        ba1Var.setSections(true);
        ab1Var.S.setClipToPadding(false);
        ba1 ba1Var2 = ab1Var.S;
        Objects.requireNonNull(ba1Var2);
        ab1Var.T = new ah.o(ba1Var2, y8Var, new zs(ba1Var2, 1));
        ec ecVar = ab1Var.f31795j0;
        if (ecVar != null) {
            org.telegram.ui.Components.ml0 ml0Var = ecVar.F;
            Objects.requireNonNull(ml0Var);
            ecVar.G = new ah.o(ml0Var, y8Var, new zs(ml0Var, 0));
            ab1Var.f31795j0.F.j(new z91(ab1Var, 1));
        }
        le leVar2 = ab1Var.f31796k0;
        if (leVar2 != null) {
            org.telegram.ui.Components.f61 f61Var = leVar2.f35504a1;
            Objects.requireNonNull(f61Var);
            leVar2.f35505b1 = new ah.o(f61Var, y8Var, new x8(f61Var, 0));
            ab1Var.f31796k0.f35504a1.j(new z91(ab1Var, 2));
        }
        ab1Var.G0 = new x91(ab1Var, y8Var);
        ab1Var.S.q1();
        LinearLayout linearLayout = new LinearLayout(context);
        ab1Var.f31785b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        ab1Var.W = imageView;
        imageView.setAutoRepeat(true);
        ab1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        ab1Var.W.d();
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
        org.telegram.messenger.wl.k(R.string.LoadingStatsDescription, textView2, 1);
        ab1Var.f31785b0.addView(ab1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        ab1Var.f31785b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        ab1Var.f31785b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(ab1Var.f31785b0, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ab1Var.X == null) {
            ab1Var.X = new fa1(ab1Var);
        }
        ab1Var.S.setAdapter(ab1Var.X);
        s4.c0 c0Var = new s4.c0();
        ab1Var.U = c0Var;
        ab1Var.S.setLayoutManager(c0Var);
        ab1Var.Y = new s4.j();
        ab1Var.S.setItemAnimator(null);
        ab1Var.S.j(new z91(ab1Var, 0));
        ab1Var.S.setOnItemClickListener(new b31(ab1Var, 6));
        ab1Var.S.setOnItemLongClickListener(new nl0(ab1Var, 19));
        frameLayout3.addView(ab1Var.S);
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, null);
        ab1Var.R = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ab1Var.R.getAvatarImageView().setScaleX(0.9f);
        ab1Var.R.getAvatarImageView().setScaleY(0.9f);
        ab1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar2 = ab1Var.actionBar;
        org.telegram.ui.Components.eo eoVar2 = ab1Var.R;
        if (!ab1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(eoVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = ab1Var.getMessagesController().getChat(Long.valueOf(j3));
        ab1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.eo eoVar3 = ab1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        eoVar3.setTitle(str);
        org.telegram.ui.Components.eo eoVar4 = ab1Var.R;
        if (eoVar4.getSubtitleTextView() != null) {
            eoVar4.getSubtitleTextView().setVisibility(8);
        }
        hg.k0.x(false, ab1Var.actionBar);
        ab1Var.actionBar.setActionBarMenuOnItemClick(new x81(ab1Var, 1));
        ab1Var.R.i(org.telegram.ui.ActionBar.j6.w0(null, i13, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        ab1Var.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i13, false), false);
        ab1Var.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i13, false), true);
        ab1Var.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19265z8, false), false);
        ab1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false));
        boolean z16 = ab1Var.f31813x0;
        w5 w5Var = ab1Var.B0;
        if (z16) {
            ab1Var.f31785b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            ab1Var.f31785b0.setVisibility(0);
            ab1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            ab1Var.f31785b0.setVisibility(8);
            ab1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(ab1Var.m0, eh.b.f(ab1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        ab1Var.m0.setBackground(c10);
        ab1Var.c0();
        ab1Var.f31815y0 = new na1(ab1Var.X, ab1Var.U);
        return ab1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        org.telegram.ui.ActionBar.o2 o2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.f31816z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f31815y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.p6.g(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (o2Var instanceof wo) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.p6.g(2, fragmentStack2);
                } else {
                    o2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        o2Var3 = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.p6.g(3, fragmentStack2);
                    }
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                    }
                    finishFragment();
                    if (o2Var3 instanceof bo) {
                        tg.k.f(o2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    tg.k.f(o2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f31804r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f31801p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((xa1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((xa1) arrayList.get(i14));
                        } else {
                            ((xa1) arrayList.get(i14)).f39506b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f31806s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    xa1 xa1Var = (xa1) arrayList.get(i12);
                    if (xa1Var.f39506b == null) {
                        this.f31800o0 = xa1Var.b();
                        break;
                    } else {
                        arrayList4.add(xa1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f31815y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18122id == this.f31784b && this.f31782a == null) {
                this.f31782a = chatFull;
                i0();
            }
        }
    }

    public final void g0(ma1[] ma1VarArr) {
        fa1 fa1Var = this.X;
        if (fa1Var != null) {
            fa1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f31813x0 = false;
        LinearLayout linearLayout = this.f31785b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f31785b0.animate().alpha(0.0f).setDuration(230L).setListener(new er0(this, 21));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (ma1 ma1Var : ma1VarArr) {
                if (ma1Var != null && ma1Var.d == null && ma1Var.f35744f != null) {
                    ma1Var.a(this.currentAccount, this.classGuid, this.f31782a.stats_dc, new org.telegram.ui.Components.t51(1, this, ma1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        ma1 ma1Var;
        ma1 ma1Var2;
        yy0 yy0Var = new yy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f18806a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f18933h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f19263z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f19265z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.f18826b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.f19227x6));
        int i13 = org.telegram.ui.ActionBar.j6.f19082p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, i13));
        org.telegram.ui.Components.eo eoVar = this.R;
        if (eoVar != null) {
            k5Var = eoVar.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        org.telegram.ui.Components.eo eoVar2 = this.R;
        if (eoVar2 != null) {
            view2 = eoVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19027m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19174u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19192v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f31787c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    ma1Var2 = this.d;
                } else if (i14 == 1) {
                    ma1Var2 = this.H;
                } else if (i14 == 2) {
                    ma1Var2 = this.I;
                } else if (i14 == 3) {
                    ma1Var2 = this.J;
                } else if (i14 == 4) {
                    ma1Var2 = this.K;
                } else {
                    ma1Var2 = this.L;
                }
                k0(ma1Var2, arrayList, yy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    ma1Var = this.d;
                } else if (i15 == 1) {
                    ma1Var = this.h;
                } else if (i15 == 2) {
                    ma1Var = this.f31798n;
                } else if (i15 == 3) {
                    ma1Var = this.f31803r;
                } else if (i15 == 4) {
                    ma1Var = this.f31805s;
                } else if (i15 == 5) {
                    ma1Var = this.v;
                } else if (i15 == 6) {
                    ma1Var = this.f31812x;
                } else if (i15 == 7) {
                    ma1Var = this.e;
                } else if (i15 == 8) {
                    ma1Var = this.f31810w;
                } else if (i15 == 9) {
                    ma1Var = this.f31814y;
                } else if (i15 == 10) {
                    ma1Var = this.E;
                } else {
                    ma1Var = this.F;
                }
                k0(ma1Var, arrayList, yy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f18159id = new ArrayList<>();
        ArrayList arrayList = this.f31804r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f31801p0.get(this.f31800o0); i11 < size; i11++) {
            if (((xa1) arrayList.get(i11)).f39506b == null) {
                tL_channels_getMessages.f18159id.add(Integer.valueOf(((xa1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f31784b);
        this.f31811w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new w91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f31797l0) {
            return;
        }
        boolean z10 = this.f31787c0;
        long j3 = this.f31784b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new w91(this, 1), null, null, 0, this.f31782a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)) <= 0.699999988079071d) {
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
        ci.i1 i1Var = this.f31794i0;
        if (i1Var != null && (i1Var.f25179b != 0 || i1Var.f25180c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f31808u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f31807t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            xa1 xa1Var = (xa1) obj;
            MessageObject f7 = this.f31816z0.f(xa1Var.b());
            if (f7 != null) {
                xa1Var.f39506b = f7;
                arrayList.add(xa1Var);
            }
        }
        this.f31802q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f31799n0;
            if (i11 < bVarArr.length) {
                oh.b bVar = bVarArr[i11];
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
        for (int i10 = 0; i10 < this.f31799n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f31799n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f31809v0;
        arrayList.clear();
        arrayList.addAll(this.f31806s0);
        arrayList.addAll(this.f31808u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f31784b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.f31816z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f31782a != null) {
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
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.f31793h0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ai.d9 d9Var = this.f31816z0;
        if (d9Var != null) {
            d9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
