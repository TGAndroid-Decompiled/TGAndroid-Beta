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
public final class db1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final z5 B0;
    public final ah.h C0;
    public final fh.d D0;
    public pa1 E;
    public final fh.d E0;
    public pa1 F;
    public final ah.c F0;
    public za1 G;
    public aa1 G0;
    public pa1 H;
    public final ArrayList H0;
    public pa1 I;
    public final RectF I0;
    public pa1 J;
    public final RectF J0;
    public pa1 K;
    public pa1 L;
    public pa1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.wo R;
    public ea1 S;
    public ah.n T;
    public s4.d0 U;
    public final LruCache V;
    public org.telegram.ui.Components.ik0 W;
    public ia1 X;
    public ba1 Y;
    public cb1 Z;
    public TLRPC.ChatFull f36722a;
    public ig.f f36723a0;
    public final long f36724b;
    public LinearLayout f36725b0;
    public boolean f36726c;
    public final boolean f36727c0;
    public pa1 d;
    public final boolean f36728d0;
    public pa1 f36729e;
    public final boolean f36730e0;
    public ya1 f36731f;
    public long f36732f0;
    public long f36733g0;
    public pa1 h;
    public final org.telegram.ui.ActionBar.a2[] f36734h0;
    public ci.h1 f36735i0;
    public fc f36736j0;
    public oe f36737k0;
    public final boolean f36738l0;
    public ih0 m0;
    public pa1 f36739n;
    public oh.b[] f36740n0;
    public int f36741o0;
    public final SparseIntArray f36742p0;
    public final SparseIntArray f36743q0;
    public pa1 f36744r;
    public final ArrayList f36745r0;
    public pa1 f36746s;
    public final ArrayList f36747s0;
    public final ArrayList f36748t0;
    public final ArrayList f36749u0;
    public pa1 v;
    public final ArrayList f36750v0;
    public pa1 f36751w;
    public boolean f36752w0;
    public pa1 f36753x;
    public boolean f36754x0;
    public pa1 f36755y;
    public qa1 f36756y0;
    public ai.e9 f36757z0;

    public db1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f36734h0 = new org.telegram.ui.ActionBar.a2[1];
        this.f36741o0 = -1;
        this.f36742p0 = new SparseIntArray();
        this.f36743q0 = new SparseIntArray();
        this.f36745r0 = new ArrayList();
        this.f36747s0 = new ArrayList();
        this.f36748t0 = new ArrayList();
        this.f36749u0 = new ArrayList();
        this.f36750v0 = new ArrayList();
        this.f36754x0 = true;
        this.B0 = new z5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.f36724b = j3;
        this.f36727c0 = bundle.getBoolean("is_megagroup", false);
        this.f36728d0 = bundle.getBoolean("start_from_boosts", false);
        this.f36730e0 = bundle.getBoolean("start_from_monetization", false);
        this.f36738l0 = bundle.getBoolean("only_boosts", false);
        this.f36722a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new ah.h(false);
            this.D0 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.E0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.F0 = cVar2;
            cVar2.f549i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new ah.c(cVar);
    }

    public static void U(db1 db1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(db1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            db1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new x91(db1Var, arrayList, 0));
    }

    public static void V(db1 db1Var, TLObject tLObject) {
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
        ArrayList arrayList5 = db1Var.N;
        ArrayList arrayList6 = db1Var.O;
        ArrayList arrayList7 = db1Var.f36745r0;
        String str16 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final pa1[] pa1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            pa1 pa1Var = pa1VarArr[2];
            if (pa1Var != null) {
                pa1Var.f40901n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.s a2 = ya1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f44394o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f44395p = (String) a2.f7967b;
            obj.f44396q = (String) a2.f7969e;
            obj.f44397r = ((Boolean) a2.f7968c).booleanValue();
            obj.f44398s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = ya1.a(tL_broadcastStats.reactions_per_story);
            obj.f44399t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f44400u = (String) a10.f7967b;
            obj.v = (String) a10.f7969e;
            obj.f44401w = ((Boolean) a10.f7968c).booleanValue();
            obj.f44402x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = ya1.a(tL_broadcastStats.views_per_story);
            obj.f44403y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f44404z = (String) a11.f7967b;
            obj.A = (String) a11.f7969e;
            obj.B = ((Boolean) a11.f7968c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = ya1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7967b;
            obj.F = (String) a12.f7969e;
            obj.G = ((Boolean) a12.f7968c).booleanValue();
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
            obj.f44382a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f44383b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs5 == 0.0f) {
                i10 = i13;
                obj.f44384c = "";
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
                    obj.f44384c = sb2.toString() + " (" + i14 + "%)";
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
                    obj.f44384c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f44388i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f44389j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f44390k = sb4.toString() + " (" + i16 + "%)";
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
                    obj.f44390k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f44390k = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f44391l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i17 / ((float) d14)) * 100.0f);
            }
            obj.f44385e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f44386f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f44387g = sb6.toString() + " (" + i18 + "%)";
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
                    obj.f44387g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f44387g = "";
            }
            if (i17 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f44392m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                obj.f44393n = a1.g.n(i19, "%");
            } else {
                obj.f44393n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            db1Var.f36731f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            db1Var.f36732f0 = tL_statsDateRangeDays.max_date * 1000;
            db1Var.f36733g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f35752a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i23;
                    db1Var.f36742p0.put(obj2.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    db1Var.f36748t0.add(obj2);
                    db1Var.f36743q0.put(obj2.b(), i21);
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
            AndroidUtilities.runOnUIThread(new x91(db1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                db1Var.getMessagesStorage().getMessages(-db1Var.f36724b, 0L, false, arrayList12.size(), ((ab1) arrayList12.get(0)).b(), 0, 0, db1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(db1Var) {
                public final db1 f43107b;

                {
                    this.f43107b = db1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            db1 db1Var2 = this.f43107b;
                            db1Var2.getClass();
                            pa1[] pa1VarArr2 = pa1VarArr;
                            db1Var2.d = pa1VarArr2[0];
                            db1Var2.H = pa1VarArr2[1];
                            db1Var2.I = pa1VarArr2[2];
                            db1Var2.J = pa1VarArr2[3];
                            db1Var2.K = pa1VarArr2[4];
                            db1Var2.L = pa1VarArr2[5];
                            db1Var2.f36729e = pa1VarArr2[6];
                            db1Var2.M = pa1VarArr2[7];
                            db1Var2.g0(pa1VarArr2);
                            return;
                        default:
                            db1 db1Var3 = this.f43107b;
                            db1Var3.getClass();
                            pa1[] pa1VarArr3 = pa1VarArr;
                            db1Var3.f36744r = pa1VarArr3[0];
                            db1Var3.h = pa1VarArr3[1];
                            db1Var3.f36729e = pa1VarArr3[2];
                            db1Var3.f36739n = pa1VarArr3[3];
                            db1Var3.d = pa1VarArr3[4];
                            db1Var3.f36746s = pa1VarArr3[5];
                            db1Var3.v = pa1VarArr3[6];
                            db1Var3.f36751w = pa1VarArr3[7];
                            db1Var3.f36753x = pa1VarArr3[8];
                            db1Var3.f36755y = pa1VarArr3[9];
                            db1Var3.E = pa1VarArr3[10];
                            db1Var3.F = pa1VarArr3[11];
                            db1Var3.g0(pa1VarArr3);
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
            final pa1[] pa1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            pa1 pa1Var2 = pa1VarArr2[6];
            if (pa1Var2 != null) {
                pa1Var2.f40901n = true;
            }
            pa1 pa1Var3 = pa1VarArr2[7];
            if (pa1Var3 != null) {
                pa1Var3.f40902o = true;
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
            obj3.f44687a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f44688b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f44689c = sb8.toString() + " (" + i26 + "%)";
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
                    obj3.f44689c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f44689c = "";
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
            obj3.f44693i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f44694j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f44695k = sb10.toString();
            } else {
                obj3.f44695k = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f44696l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i28 / ((float) d20)) * 100.0f);
            }
            obj3.f44697m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f44698n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f44699o = sb11.toString();
            } else {
                obj3.f44699o = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f44700p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i29 / ((float) d22)) * 100.0f);
            }
            obj3.f44690e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f44691f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f44692g = sb12.toString();
            } else {
                obj3.f44692g = "";
            }
            if (i29 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            db1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            db1Var.f36732f0 = tL_statsDateRangeDays2.max_date * 1000;
            db1Var.f36733g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f43115a = wa1.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    obj4.f43116b = sb13.toString();
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
                    ArrayList arrayList19 = db1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f43115a = wa1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    obj5.f43116b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = db1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f43115a = wa1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        obj6.f43116b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        obj6.f43116b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(db1Var) {
                public final db1 f43107b;

                {
                    this.f43107b = db1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            db1 db1Var2 = this.f43107b;
                            db1Var2.getClass();
                            pa1[] pa1VarArr22 = pa1VarArr2;
                            db1Var2.d = pa1VarArr22[0];
                            db1Var2.H = pa1VarArr22[1];
                            db1Var2.I = pa1VarArr22[2];
                            db1Var2.J = pa1VarArr22[3];
                            db1Var2.K = pa1VarArr22[4];
                            db1Var2.L = pa1VarArr22[5];
                            db1Var2.f36729e = pa1VarArr22[6];
                            db1Var2.M = pa1VarArr22[7];
                            db1Var2.g0(pa1VarArr22);
                            return;
                        default:
                            db1 db1Var3 = this.f43107b;
                            db1Var3.getClass();
                            pa1[] pa1VarArr3 = pa1VarArr2;
                            db1Var3.f36744r = pa1VarArr3[0];
                            db1Var3.h = pa1VarArr3[1];
                            db1Var3.f36729e = pa1VarArr3[2];
                            db1Var3.f36739n = pa1VarArr3[3];
                            db1Var3.d = pa1VarArr3[4];
                            db1Var3.f36746s = pa1VarArr3[5];
                            db1Var3.v = pa1VarArr3[6];
                            db1Var3.f36751w = pa1VarArr3[7];
                            db1Var3.f36753x = pa1VarArr3[8];
                            db1Var3.f36755y = pa1VarArr3[9];
                            db1Var3.E = pa1VarArr3[10];
                            db1Var3.F = pa1VarArr3[11];
                            db1Var3.g0(pa1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(db1 db1Var) {
        float f7;
        RectF rectF = db1Var.J0;
        ah.h hVar = db1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null && db1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (db1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            db1Var.I0.set(0.0f, -dp, db1Var.fragmentView.getMeasuredWidth(), db1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), db1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(2, db1Var.H0);
            hVar.e(db1Var.G0, db1Var.fragmentView.getMeasuredWidth(), db1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(db1 db1Var) {
        View currentView = db1Var.f36735i0.getCurrentView();
        fc fcVar = db1Var.f36736j0;
        if (currentView == fcVar) {
            db1Var.actionBar.setAdaptiveBackground(fcVar.F);
            return;
        }
        oe oeVar = db1Var.f36737k0;
        if (currentView == oeVar) {
            db1Var.actionBar.setAdaptiveBackground(oeVar.f40655a1);
        } else {
            db1Var.actionBar.setAdaptiveBackground(db1Var.S);
        }
    }

    public static void Z(db1 db1Var) {
        cb1 cb1Var = db1Var.Z;
        if (cb1Var != null) {
            cb1Var.f36389b = true;
        }
        int childCount = db1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = db1Var.S.getChildAt(i10);
            if (childAt instanceof oa1) {
                ((oa1) childAt).f40337b.f12190t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.m2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f19802id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19802id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new db1(bundle);
        }
        return new y5(-chat.f19802id);
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
            int length = ((jg.a) bVar.d.get(0)).f14148a.length;
            int size = bVar.d.size();
            bVar.f14165l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f14165l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f14165l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f14148a[i11];
                }
            }
            bVar.f14166m = new SegmentTree(bVar.f14165l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f14155a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f14148a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f14155a.length / 2.0f) {
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
            int length3 = ((jg.a) bVar2.d.get(0)).f14148a.length;
            int size3 = bVar2.d.size();
            bVar2.f14167l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f14167l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f14167l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f14148a[i17];
                }
            }
            new SegmentTree(bVar2.f14167l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static pa1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        pa1 pa1Var = new pa1(str, i10);
        pa1Var.f40900m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                pa1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                pa1Var.f40895g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f14155a) == null || jArr2.length < 2) {
                    pa1Var.f40899l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f14155a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    pa1Var.f40893e = new jg.e(e02, j3);
                    pa1Var.f40892c = j3;
                    return pa1Var;
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            pa1Var.f40894f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return pa1Var;
    }

    public static void k0(pa1 pa1Var, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        jg.b bVar;
        int i10;
        if (pa1Var != null && (bVar = pa1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f14153g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.h6.d1(i12)) {
                        int i13 = aVar.f14153g;
                        if (org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J) {
                            i10 = aVar.f14154i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.h6.v1(i13, i10, false);
                        org.telegram.ui.ActionBar.h6.ql[aVar.f14153g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, aVar.f14153g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof oa1) {
            ((oa1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false)), org.telegram.ui.ActionBar.h6.W0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20523b7), 0, 0);
            hrVar.f26897w = true;
            view.setBackground(hrVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof xa1) {
            int i10 = xa1.d;
            ((xa1) view).b();
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
        if (this.f36726c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        ea1 ea1Var = this.S;
        if (ea1Var != null) {
            ea1Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        fc fcVar = this.f36736j0;
        if (fcVar != null) {
            fcVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        oe oeVar = this.f36737k0;
        if (oeVar != null) {
            oeVar.f40655a1.setPadding(0, currentActionBarHeight, 0, i13);
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
        db1 db1Var = this;
        db1Var.f36723a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(db1Var.currentAccount);
        long j3 = db1Var.f36724b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(db1Var.currentAccount).getChatFull(j3);
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
            arrayList.add(oh.b.b(context, db1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, db1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, db1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        db1Var.f36740n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        ih0 ih0Var = new ih0(context, db1Var.resourceProvider);
        db1Var.m0 = ih0Var;
        ih0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = db1Var.f36740n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.m4(db1Var, i11, 25));
            db1Var.m0.addView(db1Var.f36740n0[i11]);
            db1Var.m0.i(bVar, true, false);
            i11++;
        }
        db1Var.f36735i0 = new ci.h1(db1Var, db1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            db1Var.f36736j0 = new fc(db1Var, -j3, db1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = db1Var.getParentActivity();
            int i12 = db1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            oe oeVar = new oe(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            db1Var = this;
            db1Var.f36737k0 = oeVar;
            oeVar.setActionBar(db1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        db1Var.f36735i0.setAdapter(new da1(db1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = db1Var.f36738l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        db1Var.f36726c = z12;
        if (z12 && db1Var.f36728d0) {
            db1Var.f36735i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && db1Var.f36730e0) {
            ci.h1 h1Var = db1Var.f36735i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            h1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        db1Var.m0(db1Var.f36735i0.getCurrentPosition(), false);
        y8 y8Var = new y8(db1Var, db1Var.getParentActivity(), 8);
        db1Var.actionBar.setDrawBlurBackground(y8Var);
        y8Var.setBackgroundColor(db1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7));
        hh.j jVar = new hh.j(y8Var);
        ah.c cVar = db1Var.F0;
        cVar.f547f = jVar;
        cVar.f548g = y8Var;
        y8Var.addView(db1Var.f36735i0, w7.w5.g());
        y8Var.addView(db1Var.actionBar);
        if (db1Var.f36726c) {
            y8Var.addView(db1Var.m0, w7.w5.e(344, 72, 81));
            db1Var.setBulletinDelegate(new ci.a9(12));
        }
        db1Var.fragmentView = y8Var;
        ea1 ea1Var = new ea1(db1Var, context);
        db1Var.S = ea1Var;
        ea1Var.setSections(true);
        db1Var.S.setClipToPadding(false);
        ea1 ea1Var2 = db1Var.S;
        Objects.requireNonNull(ea1Var2);
        db1Var.T = new ah.n(ea1Var2, y8Var, new ys(ea1Var2, 1));
        fc fcVar = db1Var.f36736j0;
        if (fcVar != null) {
            org.telegram.ui.Components.wm0 wm0Var = fcVar.F;
            Objects.requireNonNull(wm0Var);
            fcVar.G = new ah.n(wm0Var, y8Var, new ys(wm0Var, 0));
            db1Var.f36736j0.F.j(new ca1(db1Var, 1));
        }
        oe oeVar2 = db1Var.f36737k0;
        if (oeVar2 != null) {
            org.telegram.ui.Components.p71 p71Var = oeVar2.f40655a1;
            Objects.requireNonNull(p71Var);
            oeVar2.f40656b1 = new ah.n(p71Var, y8Var, new x8(p71Var, 0));
            db1Var.f36737k0.f40655a1.j(new ca1(db1Var, 2));
        }
        db1Var.G0 = new aa1(db1Var, y8Var);
        db1Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        db1Var.f36725b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        db1Var.W = imageView;
        imageView.setAutoRepeat(true);
        db1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        db1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.am.m(R.string.LoadingStatsDescription, textView2, 1);
        db1Var.f36725b0.addView(db1Var.W, w7.w5.t(120, 120, 1, 0, 0, 0, 20));
        db1Var.f36725b0.addView(textView, w7.w5.t(-2, -2, 1, 0, 0, 0, 10));
        db1Var.f36725b0.addView(textView2, w7.w5.q(-2, -2, 1));
        frameLayout3.addView(db1Var.f36725b0, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, 240, 17));
        if (db1Var.X == null) {
            db1Var.X = new ia1(db1Var);
        }
        db1Var.S.setAdapter(db1Var.X);
        s4.d0 d0Var = new s4.d0();
        db1Var.U = d0Var;
        db1Var.S.setLayoutManager(d0Var);
        db1Var.Y = new s4.j();
        db1Var.S.setItemAnimator(null);
        db1Var.S.j(new ca1(db1Var, 0));
        db1Var.S.setOnItemClickListener(new d21(db1Var, 8));
        db1Var.S.setOnItemLongClickListener(new jq0(db1Var, 17));
        frameLayout3.addView(db1Var.S);
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(context, null, false, null);
        db1Var.R = woVar;
        woVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        db1Var.R.getAvatarImageView().setScaleX(0.9f);
        db1Var.R.getAvatarImageView().setScaleY(0.9f);
        db1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = db1Var.actionBar;
        org.telegram.ui.Components.wo woVar2 = db1Var.R;
        if (!db1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(woVar2, 0, w7.w5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        TLRPC.Chat chat2 = db1Var.getMessagesController().getChat(Long.valueOf(j3));
        db1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.wo woVar3 = db1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        woVar3.setTitle(str);
        org.telegram.ui.Components.wo woVar4 = db1Var.R;
        if (woVar4.getSubtitleTextView() != null) {
            woVar4.getSubtitleTextView().setVisibility(8);
        }
        hg.c.y(false, db1Var.actionBar);
        db1Var.actionBar.setActionBarMenuOnItemClick(new f51(db1Var, 3));
        db1Var.R.i(org.telegram.ui.ActionBar.h6.x0(null, i13, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        db1Var.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i13, false), false);
        db1Var.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i13, false), true);
        db1Var.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20965z8, false), false);
        db1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        boolean z16 = db1Var.f36754x0;
        z5 z5Var = db1Var.B0;
        if (z16) {
            db1Var.f36725b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(z5Var, 500L);
            db1Var.f36725b0.setVisibility(0);
            db1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            db1Var.f36725b0.setVisibility(8);
            db1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(db1Var.m0, eh.b.f(db1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        db1Var.m0.setBackground(c10);
        db1Var.c0();
        db1Var.f36756y0 = new qa1(db1Var.X, db1Var.U);
        return db1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.m2 m2Var2;
        org.telegram.ui.ActionBar.m2 m2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.e9) objArr[0]) == this.f36757z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36756y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    m2Var = (org.telegram.ui.ActionBar.m2) sc.v.h(2, fragmentStack);
                } else {
                    m2Var = null;
                }
                if (m2Var instanceof xo) {
                    ((ActionBarLayout) getParentLayout()).a0(m2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    m2Var2 = (org.telegram.ui.ActionBar.m2) sc.v.h(2, fragmentStack2);
                } else {
                    m2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        m2Var3 = (org.telegram.ui.ActionBar.m2) sc.v.h(3, fragmentStack2);
                    }
                    if (m2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(m2Var2, false);
                    }
                    finishFragment();
                    if (m2Var3 instanceof eo) {
                        tg.i.f(m2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (m2Var2 instanceof ProfileActivity) {
                    tg.i.f(m2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f36745r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f36742p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((ab1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((ab1) arrayList.get(i14));
                        } else {
                            ((ab1) arrayList.get(i14)).f35753b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f36747s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    ab1 ab1Var = (ab1) arrayList.get(i12);
                    if (ab1Var.f35753b == null) {
                        this.f36741o0 = ab1Var.b();
                        break;
                    } else {
                        arrayList4.add(ab1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36756y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19803id == this.f36724b && this.f36722a == null) {
                this.f36722a = chatFull;
                i0();
            }
        }
    }

    public final void g0(pa1[] pa1VarArr) {
        ia1 ia1Var = this.X;
        if (ia1Var != null) {
            ia1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f36754x0 = false;
        LinearLayout linearLayout = this.f36725b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f36725b0.animate().alpha(0.0f).setDuration(230L).setListener(new gp0(this, 22));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (pa1 pa1Var : pa1VarArr) {
                if (pa1Var != null && pa1Var.d == null && pa1Var.f40894f != null) {
                    pa1Var.a(this.currentAccount, this.classGuid, this.f36722a.stats_dc, new bi(2, this, pa1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        pa1 pa1Var;
        pa1 pa1Var2;
        yy0 yy0Var = new yy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20503a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f20667j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20630h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20559d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20963z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20965z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.f20523b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.f20929x6));
        int i13 = org.telegram.ui.ActionBar.h6.f20780p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, i13));
        org.telegram.ui.Components.wo woVar = this.R;
        if (woVar != null) {
            h5Var = woVar.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        org.telegram.ui.Components.wo woVar2 = this.R;
        if (woVar2 != null) {
            view2 = woVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20724m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20874u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20892v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f36727c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    pa1Var2 = this.d;
                } else if (i14 == 1) {
                    pa1Var2 = this.H;
                } else if (i14 == 2) {
                    pa1Var2 = this.I;
                } else if (i14 == 3) {
                    pa1Var2 = this.J;
                } else if (i14 == 4) {
                    pa1Var2 = this.K;
                } else {
                    pa1Var2 = this.L;
                }
                k0(pa1Var2, arrayList, yy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    pa1Var = this.d;
                } else if (i15 == 1) {
                    pa1Var = this.h;
                } else if (i15 == 2) {
                    pa1Var = this.f36739n;
                } else if (i15 == 3) {
                    pa1Var = this.f36744r;
                } else if (i15 == 4) {
                    pa1Var = this.f36746s;
                } else if (i15 == 5) {
                    pa1Var = this.v;
                } else if (i15 == 6) {
                    pa1Var = this.f36753x;
                } else if (i15 == 7) {
                    pa1Var = this.f36729e;
                } else if (i15 == 8) {
                    pa1Var = this.f36751w;
                } else if (i15 == 9) {
                    pa1Var = this.f36755y;
                } else if (i15 == 10) {
                    pa1Var = this.E;
                } else {
                    pa1Var = this.F;
                }
                k0(pa1Var, arrayList, yy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f19840id = new ArrayList<>();
        ArrayList arrayList = this.f36745r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f36742p0.get(this.f36741o0); i11 < size; i11++) {
            if (((ab1) arrayList.get(i11)).f35753b == null) {
                tL_channels_getMessages.f19840id.add(Integer.valueOf(((ab1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f36724b);
        this.f36752w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new z91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f36738l0) {
            return;
        }
        boolean z10 = this.f36727c0;
        long j3 = this.f36724b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new z91(this, 1), null, null, 0, this.f36722a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false)) <= 0.699999988079071d) {
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
        ci.h1 h1Var = this.f36735i0;
        if (h1Var != null && (h1Var.f31112b != 0 || h1Var.f31113c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f36749u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f36748t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ab1 ab1Var = (ab1) obj;
            MessageObject f7 = this.f36757z0.f(ab1Var.b());
            if (f7 != null) {
                ab1Var.f35753b = f7;
                arrayList.add(ab1Var);
            }
        }
        this.f36743q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f36740n0;
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
        for (int i10 = 0; i10 < this.f36740n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f36740n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f36750v0;
        arrayList.clear();
        arrayList.addAll(this.f36747s0);
        arrayList.addAll(this.f36749u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ai.m9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f36724b;
        ai.e9 A = storiesController.A(-j3, 2, -1, true);
        this.f36757z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f36722a != null) {
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
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.f36734h0;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
            a2VarArr[0] = null;
        }
        ai.e9 e9Var = this.f36757z0;
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
