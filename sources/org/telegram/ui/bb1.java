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
public final class bb1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final w5 B0;
    public final ah.h C0;
    public final fh.d D0;
    public na1 E;
    public final fh.d E0;
    public na1 F;
    public final ah.c F0;
    public xa1 G;
    public y91 G0;
    public na1 H;
    public final ArrayList H0;
    public na1 I;
    public final RectF I0;
    public na1 J;
    public final RectF J0;
    public na1 K;
    public na1 L;
    public na1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.uo R;
    public ca1 S;
    public ah.n T;
    public s4.d0 U;
    public final LruCache V;
    public org.telegram.ui.Components.gk0 W;
    public ga1 X;
    public z91 Y;
    public ab1 Z;
    public TLRPC.ChatFull f36248a;
    public ig.f f36249a0;
    public final long f36250b;
    public LinearLayout f36251b0;
    public boolean f36252c;
    public final boolean f36253c0;
    public na1 d;
    public final boolean f36254d0;
    public na1 f36255e;
    public final boolean f36256e0;
    public wa1 f36257f;
    public long f36258f0;
    public long f36259g0;
    public na1 h;
    public final org.telegram.ui.ActionBar.b2[] f36260h0;
    public ci.h1 f36261i0;
    public cc f36262j0;
    public ke f36263k0;
    public final boolean f36264l0;
    public hh0 m0;
    public na1 f36265n;
    public oh.b[] f36266n0;
    public int f36267o0;
    public final SparseIntArray f36268p0;
    public final SparseIntArray f36269q0;
    public na1 f36270r;
    public final ArrayList f36271r0;
    public na1 f36272s;
    public final ArrayList f36273s0;
    public final ArrayList f36274t0;
    public final ArrayList f36275u0;
    public na1 v;
    public final ArrayList f36276v0;
    public na1 f36277w;
    public boolean f36278w0;
    public na1 f36279x;
    public boolean f36280x0;
    public na1 f36281y;
    public oa1 f36282y0;
    public ai.e9 f36283z0;

    public bb1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f36260h0 = new org.telegram.ui.ActionBar.b2[1];
        this.f36267o0 = -1;
        this.f36268p0 = new SparseIntArray();
        this.f36269q0 = new SparseIntArray();
        this.f36271r0 = new ArrayList();
        this.f36273s0 = new ArrayList();
        this.f36274t0 = new ArrayList();
        this.f36275u0 = new ArrayList();
        this.f36276v0 = new ArrayList();
        this.f36280x0 = true;
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
        this.f36250b = j3;
        this.f36253c0 = bundle.getBoolean("is_megagroup", false);
        this.f36254d0 = bundle.getBoolean("start_from_boosts", false);
        this.f36256e0 = bundle.getBoolean("start_from_monetization", false);
        this.f36264l0 = bundle.getBoolean("only_boosts", false);
        this.f36248a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new ah.h(false);
            this.D0 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.E0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.F0 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new ah.c(cVar);
    }

    public static void U(bb1 bb1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(bb1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            bb1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new v91(bb1Var, arrayList, 0));
    }

    public static void V(bb1 bb1Var, TLObject tLObject) {
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
        ArrayList arrayList5 = bb1Var.N;
        ArrayList arrayList6 = bb1Var.O;
        ArrayList arrayList7 = bb1Var.f36271r0;
        String str16 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final na1[] na1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            na1 na1Var = na1VarArr[2];
            if (na1Var != null) {
                na1Var.f40203n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.s a2 = wa1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f43209o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f43210p = (String) a2.f7971b;
            obj.f43211q = (String) a2.f7973e;
            obj.f43212r = ((Boolean) a2.f7972c).booleanValue();
            obj.f43213s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = wa1.a(tL_broadcastStats.reactions_per_story);
            obj.f43214t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f43215u = (String) a10.f7971b;
            obj.v = (String) a10.f7973e;
            obj.f43216w = ((Boolean) a10.f7972c).booleanValue();
            obj.f43217x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = wa1.a(tL_broadcastStats.views_per_story);
            obj.f43218y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f43219z = (String) a11.f7971b;
            obj.A = (String) a11.f7973e;
            obj.B = ((Boolean) a11.f7972c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = wa1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7971b;
            obj.F = (String) a12.f7973e;
            obj.G = ((Boolean) a12.f7972c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i13 / ((float) d10)) * 100.0f);
            }
            obj.f43197a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f43198b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs5 == 0.0f) {
                i10 = i13;
                obj.f43199c = "";
            } else {
                int i14 = (int) abs5;
                if (abs5 == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i13 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    obj.f43199c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i13 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb3.append(str14);
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    obj.f43199c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            int i15 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i15 / ((float) d12)) * 100.0f);
            }
            obj.f43203i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f43204j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 != 0 && abs6 != 0.0f) {
                int i16 = (int) abs6;
                if (abs6 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i15 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb4.append(str13);
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f43205k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i15 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb5.append(str12);
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f43205k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f43205k = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f43206l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i17 / ((float) d14)) * 100.0f);
            }
            obj.f43200e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f43201f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 != 0 && abs7 != 0.0f) {
                int i18 = (int) abs7;
                if (abs7 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i17 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb6.append(str11);
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f43202g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i17 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb7.append(str10);
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f43202g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f43202g = "";
            }
            if (i17 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f43207m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                obj.f43208n = a1.g.n(i19, "%");
            } else {
                obj.f43208n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            bb1Var.f36257f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            bb1Var.f36258f0 = tL_statsDateRangeDays.max_date * 1000;
            bb1Var.f36259g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i22);
                int i23 = i22 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f44349a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i23;
                    bb1Var.f36268p0.put(obj2.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    bb1Var.f36274t0.add(obj2);
                    bb1Var.f36269q0.put(obj2.b(), i21);
                    i21++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i22 = i11;
                arrayList8 = arrayList4;
                size = i24;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new v91(bb1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                bb1Var.getMessagesStorage().getMessages(-bb1Var.f36250b, 0L, false, arrayList12.size(), ((ya1) arrayList12.get(0)).b(), 0, 0, bb1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(bb1Var) {
                public final bb1 f42423b;

                {
                    this.f42423b = bb1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            bb1 bb1Var2 = this.f42423b;
                            bb1Var2.getClass();
                            na1[] na1VarArr2 = na1VarArr;
                            bb1Var2.d = na1VarArr2[0];
                            bb1Var2.H = na1VarArr2[1];
                            bb1Var2.I = na1VarArr2[2];
                            bb1Var2.J = na1VarArr2[3];
                            bb1Var2.K = na1VarArr2[4];
                            bb1Var2.L = na1VarArr2[5];
                            bb1Var2.f36255e = na1VarArr2[6];
                            bb1Var2.M = na1VarArr2[7];
                            bb1Var2.g0(na1VarArr2);
                            return;
                        default:
                            bb1 bb1Var3 = this.f42423b;
                            bb1Var3.getClass();
                            na1[] na1VarArr3 = na1VarArr;
                            bb1Var3.f36270r = na1VarArr3[0];
                            bb1Var3.h = na1VarArr3[1];
                            bb1Var3.f36255e = na1VarArr3[2];
                            bb1Var3.f36265n = na1VarArr3[3];
                            bb1Var3.d = na1VarArr3[4];
                            bb1Var3.f36272s = na1VarArr3[5];
                            bb1Var3.v = na1VarArr3[6];
                            bb1Var3.f36277w = na1VarArr3[7];
                            bb1Var3.f36279x = na1VarArr3[8];
                            bb1Var3.f36281y = na1VarArr3[9];
                            bb1Var3.E = na1VarArr3[10];
                            bb1Var3.F = na1VarArr3[11];
                            bb1Var3.g0(na1VarArr3);
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
            final na1[] na1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            na1 na1Var2 = na1VarArr2[6];
            if (na1Var2 != null) {
                na1Var2.f40203n = true;
            }
            na1 na1Var3 = na1VarArr2[7];
            if (na1Var3 != null) {
                na1Var3.f40204o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i25 / ((float) d16)) * 100.0f);
            }
            obj3.f43940a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f43941b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 != 0 && abs != 0.0f) {
                int i26 = (int) abs;
                if (abs == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i25 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb8.append(str8);
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f43942c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i25 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb9.append(str7);
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f43942c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f43942c = "";
            }
            if (i25 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i27 / ((float) d18)) * 100.0f);
            }
            obj3.f43946i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f43947j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i27 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb10.append(str6);
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                obj3.f43948k = sb10.toString();
            } else {
                obj3.f43948k = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f43949l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i28 / ((float) d20)) * 100.0f);
            }
            obj3.f43950m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f43951n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i28 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb11.append(str5);
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                obj3.f43952o = sb11.toString();
            } else {
                obj3.f43952o = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f43953p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i29 / ((float) d22)) * 100.0f);
            }
            obj3.f43943e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f43944f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i29 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb12.append(str4);
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                obj3.f43945g = sb12.toString();
            } else {
                obj3.f43945g = "";
            }
            if (i29 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            bb1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            bb1Var.f36258f0 = tL_statsDateRangeDays2.max_date * 1000;
            bb1Var.f36259g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f42431a = ua1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f42432b = sb13.toString();
                    int i32 = i12;
                    if (arrayList2.size() < i32) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i30++;
                    arrayList2 = arrayList3;
                    i12 = i32;
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
                for (int i33 = 0; i33 < tL_megagroupStats.top_admins.size(); i33++) {
                    ArrayList arrayList19 = bb1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f42431a = ua1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i34 = tL_statsGroupTopAdmin.deleted;
                    if (i34 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i34, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f42432b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = bb1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f42431a = ua1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        obj6.f42432b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        obj6.f42432b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(bb1Var) {
                public final bb1 f42423b;

                {
                    this.f42423b = bb1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            bb1 bb1Var2 = this.f42423b;
                            bb1Var2.getClass();
                            na1[] na1VarArr22 = na1VarArr2;
                            bb1Var2.d = na1VarArr22[0];
                            bb1Var2.H = na1VarArr22[1];
                            bb1Var2.I = na1VarArr22[2];
                            bb1Var2.J = na1VarArr22[3];
                            bb1Var2.K = na1VarArr22[4];
                            bb1Var2.L = na1VarArr22[5];
                            bb1Var2.f36255e = na1VarArr22[6];
                            bb1Var2.M = na1VarArr22[7];
                            bb1Var2.g0(na1VarArr22);
                            return;
                        default:
                            bb1 bb1Var3 = this.f42423b;
                            bb1Var3.getClass();
                            na1[] na1VarArr3 = na1VarArr2;
                            bb1Var3.f36270r = na1VarArr3[0];
                            bb1Var3.h = na1VarArr3[1];
                            bb1Var3.f36255e = na1VarArr3[2];
                            bb1Var3.f36265n = na1VarArr3[3];
                            bb1Var3.d = na1VarArr3[4];
                            bb1Var3.f36272s = na1VarArr3[5];
                            bb1Var3.v = na1VarArr3[6];
                            bb1Var3.f36277w = na1VarArr3[7];
                            bb1Var3.f36279x = na1VarArr3[8];
                            bb1Var3.f36281y = na1VarArr3[9];
                            bb1Var3.E = na1VarArr3[10];
                            bb1Var3.F = na1VarArr3[11];
                            bb1Var3.g0(na1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(bb1 bb1Var) {
        float f7;
        RectF rectF = bb1Var.J0;
        ah.h hVar = bb1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null && bb1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (bb1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            bb1Var.I0.set(0.0f, -dp, bb1Var.fragmentView.getMeasuredWidth(), bb1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), bb1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(2, bb1Var.H0);
            hVar.e(bb1Var.G0, bb1Var.fragmentView.getMeasuredWidth(), bb1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(bb1 bb1Var) {
        View currentView = bb1Var.f36261i0.getCurrentView();
        cc ccVar = bb1Var.f36262j0;
        if (currentView == ccVar) {
            bb1Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        ke keVar = bb1Var.f36263k0;
        if (currentView == keVar) {
            bb1Var.actionBar.setAdaptiveBackground(keVar.f39277a1);
        } else {
            bb1Var.actionBar.setAdaptiveBackground(bb1Var.S);
        }
    }

    public static void Z(bb1 bb1Var) {
        ab1 ab1Var = bb1Var.Z;
        if (ab1Var != null) {
            ab1Var.f35944b = true;
        }
        int childCount = bb1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = bb1Var.S.getChildAt(i10);
            if (childAt instanceof ma1) {
                ((ma1) childAt).f39533b.f12192t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f20042id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20042id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new bb1(bundle);
        }
        return new v5(-chat.f20042id);
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
            int length = ((jg.a) bVar.d.get(0)).f14151a.length;
            int size = bVar.d.size();
            bVar.f14168l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f14168l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f14168l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f14151a[i11];
                }
            }
            bVar.f14169m = new SegmentTree(bVar.f14168l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f14158a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f14151a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f14158a.length / 2.0f) {
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
            int length3 = ((jg.a) bVar2.d.get(0)).f14151a.length;
            int size3 = bVar2.d.size();
            bVar2.f14170l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f14170l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f14170l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f14151a[i17];
                }
            }
            new SegmentTree(bVar2.f14170l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static na1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        na1 na1Var = new na1(str, i10);
        na1Var.f40202m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                na1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                na1Var.f40197g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f14158a) == null || jArr2.length < 2) {
                    na1Var.f40201l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f14158a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    na1Var.f40195e = new jg.e(e02, j3);
                    na1Var.f40194c = j3;
                    return na1Var;
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            na1Var.f40196f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return na1Var;
    }

    public static void k0(na1 na1Var, ArrayList arrayList, org.telegram.ui.ActionBar.j6 j6Var) {
        jg.b bVar;
        int i10;
        if (na1Var != null && (bVar = na1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f14156g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.i6.d1(i12)) {
                        int i13 = aVar.f14156g;
                        if (org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J) {
                            i10 = aVar.f14157i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.i6.v1(i13, i10, false);
                        org.telegram.ui.ActionBar.i6.ql[aVar.f14156g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, aVar.f14156g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof ma1) {
            ((ma1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.b7) {
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false)), org.telegram.ui.ActionBar.i6.W0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20765b7), 0, 0);
            frVar.f26503w = true;
            view.setBackground(frVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof va1) {
            int i10 = va1.d;
            ((va1) view).b();
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f36252c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        ca1 ca1Var = this.S;
        if (ca1Var != null) {
            ca1Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        cc ccVar = this.f36262j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ke keVar = this.f36263k0;
        if (keVar != null) {
            keVar.f39277a1.setPadding(0, currentActionBarHeight, 0, i13);
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
        bb1 bb1Var = this;
        bb1Var.f36249a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(bb1Var.currentAccount);
        long j3 = bb1Var.f36250b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(bb1Var.currentAccount).getChatFull(j3);
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
            arrayList.add(oh.b.b(context, bb1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, bb1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, bb1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        bb1Var.f36266n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        hh0 hh0Var = new hh0(context, bb1Var.resourceProvider);
        bb1Var.m0 = hh0Var;
        hh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = bb1Var.f36266n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.m4(bb1Var, i11, 25));
            bb1Var.m0.addView(bb1Var.f36266n0[i11]);
            bb1Var.m0.i(bVar, true, false);
            i11++;
        }
        bb1Var.f36261i0 = new ci.h1(bb1Var, bb1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            bb1Var.f36262j0 = new cc(bb1Var, -j3, bb1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = bb1Var.getParentActivity();
            int i12 = bb1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            ke keVar = new ke(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            bb1Var = this;
            bb1Var.f36263k0 = keVar;
            keVar.setActionBar(bb1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        bb1Var.f36261i0.setAdapter(new ba1(bb1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = bb1Var.f36264l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        bb1Var.f36252c = z12;
        if (z12 && bb1Var.f36254d0) {
            bb1Var.f36261i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && bb1Var.f36256e0) {
            ci.h1 h1Var = bb1Var.f36261i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            h1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        bb1Var.m0(bb1Var.f36261i0.getCurrentPosition(), false);
        v8 v8Var = new v8(bb1Var, bb1Var.getParentActivity(), 8);
        bb1Var.actionBar.setDrawBlurBackground(v8Var);
        v8Var.setBackgroundColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20745a7));
        hh.j jVar = new hh.j(v8Var);
        ah.c cVar = bb1Var.F0;
        cVar.f545f = jVar;
        cVar.f546g = v8Var;
        v8Var.addView(bb1Var.f36261i0, w7.x5.g());
        v8Var.addView(bb1Var.actionBar);
        if (bb1Var.f36252c) {
            v8Var.addView(bb1Var.m0, w7.x5.e(344, 72, 81));
            bb1Var.setBulletinDelegate(new ci.a9(12));
        }
        bb1Var.fragmentView = v8Var;
        ca1 ca1Var = new ca1(bb1Var, context);
        bb1Var.S = ca1Var;
        ca1Var.setSections(true);
        bb1Var.S.setClipToPadding(false);
        ca1 ca1Var2 = bb1Var.S;
        Objects.requireNonNull(ca1Var2);
        bb1Var.T = new ah.n(ca1Var2, v8Var, new vs(ca1Var2, 1));
        cc ccVar = bb1Var.f36262j0;
        if (ccVar != null) {
            org.telegram.ui.Components.rm0 rm0Var = ccVar.F;
            Objects.requireNonNull(rm0Var);
            ccVar.G = new ah.n(rm0Var, v8Var, new vs(rm0Var, 0));
            bb1Var.f36262j0.F.j(new aa1(bb1Var, 1));
        }
        ke keVar2 = bb1Var.f36263k0;
        if (keVar2 != null) {
            org.telegram.ui.Components.l71 l71Var = keVar2.f39277a1;
            Objects.requireNonNull(l71Var);
            keVar2.f39278b1 = new ah.n(l71Var, v8Var, new u8(l71Var, 0));
            bb1Var.f36263k0.f39277a1.j(new aa1(bb1Var, 2));
        }
        bb1Var.G0 = new y91(bb1Var, v8Var);
        bb1Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        bb1Var.f36251b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        bb1Var.W = imageView;
        imageView.setAutoRepeat(true);
        bb1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        bb1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.bi.m(R.string.LoadingStatsDescription, textView2, 1);
        bb1Var.f36251b0.addView(bb1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        bb1Var.f36251b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        bb1Var.f36251b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(bb1Var.f36251b0, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, 240, 17));
        if (bb1Var.X == null) {
            bb1Var.X = new ga1(bb1Var);
        }
        bb1Var.S.setAdapter(bb1Var.X);
        s4.d0 d0Var = new s4.d0();
        bb1Var.U = d0Var;
        bb1Var.S.setLayoutManager(d0Var);
        bb1Var.Y = new s4.j();
        bb1Var.S.setItemAnimator(null);
        bb1Var.S.j(new aa1(bb1Var, 0));
        bb1Var.S.setOnItemClickListener(new z21(bb1Var, 7));
        bb1Var.S.setOnItemLongClickListener(new hq0(bb1Var, 17));
        frameLayout3.addView(bb1Var.S);
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(context, null, false, null);
        bb1Var.R = uoVar;
        uoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        bb1Var.R.getAvatarImageView().setScaleX(0.9f);
        bb1Var.R.getAvatarImageView().setScaleY(0.9f);
        bb1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = bb1Var.actionBar;
        org.telegram.ui.Components.uo uoVar2 = bb1Var.R;
        if (!bb1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(uoVar2, 0, w7.x5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        TLRPC.Chat chat2 = bb1Var.getMessagesController().getChat(Long.valueOf(j3));
        bb1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.uo uoVar3 = bb1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        uoVar3.setTitle(str);
        org.telegram.ui.Components.uo uoVar4 = bb1Var.R;
        if (uoVar4.getSubtitleTextView() != null) {
            uoVar4.getSubtitleTextView().setVisibility(8);
        }
        hg.c.v(false, bb1Var.actionBar);
        bb1Var.actionBar.setActionBarMenuOnItemClick(new p81(bb1Var, 2));
        bb1Var.R.i(org.telegram.ui.ActionBar.i6.x0(null, i13, false), org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        bb1Var.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, i13, false), false);
        bb1Var.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, i13, false), true);
        bb1Var.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21205z8, false), false);
        bb1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
        boolean z16 = bb1Var.f36280x0;
        w5 w5Var = bb1Var.B0;
        if (z16) {
            bb1Var.f36251b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            bb1Var.f36251b0.setVisibility(0);
            bb1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            bb1Var.f36251b0.setVisibility(8);
            bb1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(bb1Var.m0, eh.b.f(bb1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        bb1Var.m0.setBackground(c10);
        bb1Var.c0();
        bb1Var.f36282y0 = new oa1(bb1Var.X, bb1Var.U);
        return bb1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        org.telegram.ui.ActionBar.n2 n2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.e9) objArr[0]) == this.f36283z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36282y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (org.telegram.ui.ActionBar.n2) sc.v.h(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (n2Var instanceof uo) {
                    ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    n2Var2 = (org.telegram.ui.ActionBar.n2) sc.v.h(2, fragmentStack2);
                } else {
                    n2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        n2Var3 = (org.telegram.ui.ActionBar.n2) sc.v.h(3, fragmentStack2);
                    }
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
                    }
                    finishFragment();
                    if (n2Var3 instanceof zn) {
                        tg.i.f(n2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    tg.i.f(n2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f36271r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f36268p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((ya1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((ya1) arrayList.get(i14));
                        } else {
                            ((ya1) arrayList.get(i14)).f44350b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f36273s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    ya1 ya1Var = (ya1) arrayList.get(i12);
                    if (ya1Var.f44350b == null) {
                        this.f36267o0 = ya1Var.b();
                        break;
                    } else {
                        arrayList4.add(ya1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36282y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20043id == this.f36250b && this.f36248a == null) {
                this.f36248a = chatFull;
                i0();
            }
        }
    }

    public final void g0(na1[] na1VarArr) {
        ga1 ga1Var = this.X;
        if (ga1Var != null) {
            ga1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f36280x0 = false;
        LinearLayout linearLayout = this.f36251b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f36251b0.animate().alpha(0.0f).setDuration(230L).setListener(new ep0(this, 22));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (na1 na1Var : na1VarArr) {
                if (na1Var != null && na1Var.d == null && na1Var.f40196f != null) {
                    na1Var.a(this.currentAccount, this.classGuid, this.f36248a.stats_dc, new xh(2, this, na1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.j5 j5Var;
        na1 na1Var;
        na1 na1Var2;
        wy0 wy0Var = new wy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20745a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f20909j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f20872h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f20801d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f21203z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f21205z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f20765b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f21169x6));
        int i13 = org.telegram.ui.ActionBar.i6.f21022p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, i13));
        org.telegram.ui.Components.uo uoVar = this.R;
        if (uoVar != null) {
            j5Var = uoVar.getTitleTextView();
        } else {
            j5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(j5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Oi));
        org.telegram.ui.Components.uo uoVar2 = this.R;
        if (uoVar2 != null) {
            view2 = uoVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.i6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20966m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21114u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21132v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f36253c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    na1Var2 = this.d;
                } else if (i14 == 1) {
                    na1Var2 = this.H;
                } else if (i14 == 2) {
                    na1Var2 = this.I;
                } else if (i14 == 3) {
                    na1Var2 = this.J;
                } else if (i14 == 4) {
                    na1Var2 = this.K;
                } else {
                    na1Var2 = this.L;
                }
                k0(na1Var2, arrayList, wy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    na1Var = this.d;
                } else if (i15 == 1) {
                    na1Var = this.h;
                } else if (i15 == 2) {
                    na1Var = this.f36265n;
                } else if (i15 == 3) {
                    na1Var = this.f36270r;
                } else if (i15 == 4) {
                    na1Var = this.f36272s;
                } else if (i15 == 5) {
                    na1Var = this.v;
                } else if (i15 == 6) {
                    na1Var = this.f36279x;
                } else if (i15 == 7) {
                    na1Var = this.f36255e;
                } else if (i15 == 8) {
                    na1Var = this.f36277w;
                } else if (i15 == 9) {
                    na1Var = this.f36281y;
                } else if (i15 == 10) {
                    na1Var = this.E;
                } else {
                    na1Var = this.F;
                }
                k0(na1Var, arrayList, wy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f20080id = new ArrayList<>();
        ArrayList arrayList = this.f36271r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f36268p0.get(this.f36267o0); i11 < size; i11++) {
            if (((ya1) arrayList.get(i11)).f44350b == null) {
                tL_channels_getMessages.f20080id.add(Integer.valueOf(((ya1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f36250b);
        this.f36278w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new x91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f36264l0) {
            return;
        }
        boolean z10 = this.f36253c0;
        long j3 = this.f36250b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new x91(this, 1), null, null, 0, this.f36248a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false)) <= 0.699999988079071d) {
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
        ci.h1 h1Var = this.f36261i0;
        if (h1Var != null && (h1Var.f29732b != 0 || h1Var.f29733c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f36275u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f36274t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ya1 ya1Var = (ya1) obj;
            MessageObject f7 = this.f36283z0.f(ya1Var.b());
            if (f7 != null) {
                ya1Var.f44350b = f7;
                arrayList.add(ya1Var);
            }
        }
        this.f36269q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f36266n0;
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
        for (int i10 = 0; i10 < this.f36266n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f36266n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f36276v0;
        arrayList.clear();
        arrayList.addAll(this.f36273s0);
        arrayList.addAll(this.f36275u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ai.m9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f36250b;
        ai.e9 A = storiesController.A(-j3, 2, -1, true);
        this.f36283z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f36248a != null) {
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
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.f36260h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ai.e9 e9Var = this.f36283z0;
        if (e9Var != null) {
            e9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
