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
public final class p91 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final a6 B0;
    public final bh.f C0;
    public final gh.d D0;
    public b91 E;
    public final gh.d E0;
    public b91 F;
    public final bh.b F0;
    public l91 G;
    public m81 G0;
    public b91 H;
    public final ArrayList H0;
    public b91 I;
    public final RectF I0;
    public b91 J;
    public final RectF J0;
    public b91 K;
    public b91 L;
    public b91 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.oo R;
    public q81 S;
    public bh.l T;
    public s4.b0 U;
    public final LruCache V;
    public org.telegram.ui.Components.yj0 W;
    public u81 X;
    public n81 Y;
    public o91 Z;
    public TLRPC.ChatFull f40127a;
    public jg.f f40128a0;
    public final long f40129b;
    public LinearLayout f40130b0;
    public boolean f40131c;
    public final boolean f40132c0;
    public b91 d;
    public final boolean f40133d0;
    public b91 e;
    public final boolean f40134e0;
    public k91 f40135f;
    public long f40136f0;
    public long f40137g0;
    public b91 h;
    public final org.telegram.ui.ActionBar.b2[] f40138h0;
    public ei.h1 f40139i0;
    public cc f40140j0;
    public ie f40141k0;
    public final boolean f40142l0;
    public pg0 m0;
    public b91 f40143n;
    public ph.b[] f40144n0;
    public int f40145o0;
    public final SparseIntArray f40146p0;
    public final SparseIntArray f40147q0;
    public b91 f40148r;
    public final ArrayList f40149r0;
    public b91 f40150s;
    public final ArrayList f40151s0;
    public final ArrayList f40152t0;
    public final ArrayList f40153u0;
    public b91 v;
    public final ArrayList f40154v0;
    public b91 f40155w;
    public boolean f40156w0;
    public b91 f40157x;
    public boolean f40158x0;
    public b91 f40159y;
    public c91 f40160y0;
    public ci.a7 f40161z0;

    public p91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f40138h0 = new org.telegram.ui.ActionBar.b2[1];
        this.f40145o0 = -1;
        this.f40146p0 = new SparseIntArray();
        this.f40147q0 = new SparseIntArray();
        this.f40149r0 = new ArrayList();
        this.f40151s0 = new ArrayList();
        this.f40152t0 = new ArrayList();
        this.f40153u0 = new ArrayList();
        this.f40154v0 = new ArrayList();
        this.f40158x0 = true;
        this.B0 = new a6(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f40129b = j10;
        this.f40132c0 = bundle.getBoolean("is_megagroup", false);
        this.f40133d0 = bundle.getBoolean("start_from_boosts", false);
        this.f40134e0 = bundle.getBoolean("start_from_monetization", false);
        this.f40142l0 = bundle.getBoolean("only_boosts", false);
        this.f40127a = getMessagesController().getChatFull(j10);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new bh.f(false);
            this.D0 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.E0 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.F0 = bVar;
            bVar.f4360i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new bh.b(cVar);
    }

    public static void U(p91 p91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(p91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            p91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new j81(p91Var, arrayList, 0));
    }

    public static void V(p91 p91Var, TLObject tLObject) {
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
        ArrayList arrayList5 = p91Var.N;
        ArrayList arrayList6 = p91Var.O;
        ArrayList arrayList7 = p91Var.f40149r0;
        String str16 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final b91[] b91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            b91 b91Var = b91VarArr[2];
            if (b91Var != null) {
                b91Var.f35551n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.r a2 = k91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f38486o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f38487p = (String) a2.f7660b;
            obj.f38488q = (String) a2.e;
            obj.f38489r = ((Boolean) a2.f7661c).booleanValue();
            obj.f38490s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.r a10 = k91.a(tL_broadcastStats.reactions_per_story);
            obj.f38491t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f38492u = (String) a10.f7660b;
            obj.v = (String) a10.e;
            obj.f38493w = ((Boolean) a10.f7661c).booleanValue();
            obj.f38494x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.r a11 = k91.a(tL_broadcastStats.views_per_story);
            obj.f38495y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f38496z = (String) a11.f7660b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7661c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.r a12 = k91.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7660b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7661c).booleanValue();
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
            obj.f38475a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f38476b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs5 == 0.0f) {
                i10 = i13;
                obj.f38477c = "";
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
                    obj.f38477c = sb2.toString() + " (" + i14 + "%)";
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
                    obj.f38477c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f38480i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f38481j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f38482k = sb4.toString() + " (" + i16 + "%)";
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
                    obj.f38482k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f38482k = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f38483l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i17 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f38478f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f38479g = sb6.toString() + " (" + i18 + "%)";
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
                    obj.f38479g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f38479g = "";
            }
            if (i17 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f38484m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                obj.f38485n = a1.g.m(i19, "%");
            } else {
                obj.f38485n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            p91Var.f40135f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            p91Var.f40136f0 = tL_statsDateRangeDays.max_date * 1000;
            p91Var.f40137g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f39161a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i23;
                    p91Var.f40146p0.put(obj2.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    p91Var.f40152t0.add(obj2);
                    p91Var.f40147q0.put(obj2.b(), i21);
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
            AndroidUtilities.runOnUIThread(new j81(p91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                p91Var.getMessagesStorage().getMessages(-p91Var.f40129b, 0L, false, arrayList12.size(), ((m91) arrayList12.get(0)).b(), 0, 0, p91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(p91Var) {
                public final p91 f37887b;

                {
                    this.f37887b = p91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p91 p91Var2 = this.f37887b;
                            p91Var2.getClass();
                            b91[] b91VarArr2 = b91VarArr;
                            p91Var2.d = b91VarArr2[0];
                            p91Var2.H = b91VarArr2[1];
                            p91Var2.I = b91VarArr2[2];
                            p91Var2.J = b91VarArr2[3];
                            p91Var2.K = b91VarArr2[4];
                            p91Var2.L = b91VarArr2[5];
                            p91Var2.e = b91VarArr2[6];
                            p91Var2.M = b91VarArr2[7];
                            p91Var2.g0(b91VarArr2);
                            return;
                        default:
                            p91 p91Var3 = this.f37887b;
                            p91Var3.getClass();
                            b91[] b91VarArr3 = b91VarArr;
                            p91Var3.f40148r = b91VarArr3[0];
                            p91Var3.h = b91VarArr3[1];
                            p91Var3.e = b91VarArr3[2];
                            p91Var3.f40143n = b91VarArr3[3];
                            p91Var3.d = b91VarArr3[4];
                            p91Var3.f40150s = b91VarArr3[5];
                            p91Var3.v = b91VarArr3[6];
                            p91Var3.f40155w = b91VarArr3[7];
                            p91Var3.f40157x = b91VarArr3[8];
                            p91Var3.f40159y = b91VarArr3[9];
                            p91Var3.E = b91VarArr3[10];
                            p91Var3.F = b91VarArr3[11];
                            p91Var3.g0(b91VarArr3);
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
            final b91[] b91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            b91 b91Var2 = b91VarArr2[6];
            if (b91Var2 != null) {
                b91Var2.f35551n = true;
            }
            b91 b91Var3 = b91VarArr2[7];
            if (b91Var3 != null) {
                b91Var3.f35552o = true;
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
            obj3.f38859a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f38860b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f38861c = sb8.toString() + " (" + i26 + "%)";
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
                    obj3.f38861c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f38861c = "";
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
            obj3.f38864i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f38865j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f38866k = sb10.toString();
            } else {
                obj3.f38866k = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f38867l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i28 / ((float) d20)) * 100.0f);
            }
            obj3.f38868m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f38869n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f38870o = sb11.toString();
            } else {
                obj3.f38870o = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f38871p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i29 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f38862f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f38863g = sb12.toString();
            } else {
                obj3.f38863g = "";
            }
            if (i29 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            p91Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            p91Var.f40136f0 = tL_statsDateRangeDays2.max_date * 1000;
            p91Var.f40137g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f37900a = i91.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    obj4.f37901b = sb13.toString();
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
                    ArrayList arrayList19 = p91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f37900a = i91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    obj5.f37901b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = p91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f37900a = i91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        obj6.f37901b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        obj6.f37901b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(p91Var) {
                public final p91 f37887b;

                {
                    this.f37887b = p91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            p91 p91Var2 = this.f37887b;
                            p91Var2.getClass();
                            b91[] b91VarArr22 = b91VarArr2;
                            p91Var2.d = b91VarArr22[0];
                            p91Var2.H = b91VarArr22[1];
                            p91Var2.I = b91VarArr22[2];
                            p91Var2.J = b91VarArr22[3];
                            p91Var2.K = b91VarArr22[4];
                            p91Var2.L = b91VarArr22[5];
                            p91Var2.e = b91VarArr22[6];
                            p91Var2.M = b91VarArr22[7];
                            p91Var2.g0(b91VarArr22);
                            return;
                        default:
                            p91 p91Var3 = this.f37887b;
                            p91Var3.getClass();
                            b91[] b91VarArr3 = b91VarArr2;
                            p91Var3.f40148r = b91VarArr3[0];
                            p91Var3.h = b91VarArr3[1];
                            p91Var3.e = b91VarArr3[2];
                            p91Var3.f40143n = b91VarArr3[3];
                            p91Var3.d = b91VarArr3[4];
                            p91Var3.f40150s = b91VarArr3[5];
                            p91Var3.v = b91VarArr3[6];
                            p91Var3.f40155w = b91VarArr3[7];
                            p91Var3.f40157x = b91VarArr3[8];
                            p91Var3.f40159y = b91VarArr3[9];
                            p91Var3.E = b91VarArr3[10];
                            p91Var3.F = b91VarArr3[11];
                            p91Var3.g0(b91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(p91 p91Var) {
        float f7;
        RectF rectF = p91Var.J0;
        bh.f fVar = p91Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null && p91Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (p91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            p91Var.I0.set(0.0f, -dp, p91Var.fragmentView.getMeasuredWidth(), p91Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), p91Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(2, p91Var.H0);
            fVar.e(p91Var.G0, p91Var.fragmentView.getMeasuredWidth(), p91Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(p91 p91Var) {
        View currentView = p91Var.f40139i0.getCurrentView();
        cc ccVar = p91Var.f40140j0;
        if (currentView == ccVar) {
            p91Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        ie ieVar = p91Var.f40141k0;
        if (currentView == ieVar) {
            p91Var.actionBar.setAdaptiveBackground(ieVar.f37930a1);
        } else {
            p91Var.actionBar.setAdaptiveBackground(p91Var.S);
        }
    }

    public static void Z(p91 p91Var) {
        o91 o91Var = p91Var.Z;
        if (o91Var != null) {
            o91Var.f39804b = true;
        }
        int childCount = p91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = p91Var.S.getChildAt(i10);
            if (childAt instanceof a91) {
                ((a91) childAt).f43671b.f14480t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f20276id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20276id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new p91(bundle);
        }
        return new z5(-chat.f20276id);
    }

    public static kg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new kg.b(jSONObject);
        }
        if (i10 == 1) {
            return new kg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new kg.b(jSONObject);
            int length = ((kg.a) bVar.d.get(0)).f15046a.length;
            int size = bVar.d.size();
            bVar.f15061l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f15061l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f15061l;
                    jArr[i11] = jArr[i11] + ((kg.a) bVar.d.get(i12)).f15046a[i11];
                }
            }
            bVar.f15062m = new SegmentTree(bVar.f15061l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new kg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f15052a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((kg.a) bVar2.d.get(i13)).f15046a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f15052a.length / 2.0f) {
                        arrayList.add((kg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((kg.a) obj);
                }
            }
            int length3 = ((kg.a) bVar2.d.get(0)).f15046a.length;
            int size3 = bVar2.d.size();
            bVar2.f15063l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f15063l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f15063l;
                    jArr3[i17] = jArr3[i17] + ((kg.a) bVar2.d.get(i18)).f15046a[i17];
                }
            }
            new SegmentTree(bVar2.f15063l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static b91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        b91 b91Var = new b91(str, i10);
        b91Var.f35550m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                kg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                b91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                b91Var.f35545g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f15052a) == null || jArr2.length < 2) {
                    b91Var.f35549l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f15052a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    b91Var.e = new kg.e(e02, j10);
                    b91Var.f35543c = j10;
                    return b91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            b91Var.f35544f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return b91Var;
    }

    public static void k0(b91 b91Var, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        kg.b bVar;
        int i10;
        if (b91Var != null && (bVar = b91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                kg.a aVar = (kg.a) obj;
                int i12 = aVar.f15050g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.h6.d1(i12)) {
                        int i13 = aVar.f15050g;
                        if (org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J) {
                            i10 = aVar.f15051i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.h6.v1(i13, i10, false);
                        org.telegram.ui.ActionBar.h6.ql[aVar.f15050g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, aVar.f15050g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof a91) {
            ((a91) view).d();
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false)), org.telegram.ui.ActionBar.h6.W0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20952b7), 0, 0);
            zqVar.f33023w = true;
            view.setBackground(zqVar);
        } else if (view instanceof lg.c) {
            ((lg.c) view).a();
        } else if (view instanceof j91) {
            int i10 = j91.d;
            ((j91) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        pg0 pg0Var = this.m0;
        if (pg0Var != null) {
            pg0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f40131c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        q81 q81Var = this.S;
        if (q81Var != null) {
            q81Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        cc ccVar = this.f40140j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ie ieVar = this.f40141k0;
        if (ieVar != null) {
            ieVar.f37930a1.setPadding(0, currentActionBarHeight, 0, i13);
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
        boolean z13;
        float f7;
        String str;
        org.telegram.ui.ActionBar.d5 d5Var;
        boolean z14;
        p91 p91Var = this;
        p91Var.f40128a0 = new jg.f(null);
        MessagesController messagesController = MessagesController.getInstance(p91Var.currentAccount);
        long j10 = p91Var.f40129b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(p91Var.currentAccount).getChatFull(j10);
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
            arrayList.add(ph.b.b(context, p91Var.resourceProvider, ph.a.I, R.string.Statistics));
        }
        arrayList.add(ph.b.b(context, p91Var.resourceProvider, ph.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(ph.b.b(context, p91Var.resourceProvider, ph.a.MONETIZATION, R.string.Monetization));
        }
        p91Var.f40144n0 = (ph.b[]) arrayList.toArray(new ph.b[0]);
        pg0 pg0Var = new pg0(context, p91Var.resourceProvider);
        p91Var.m0 = pg0Var;
        pg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = p91Var.f40144n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            ph.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ai.n1(p91Var, i11, 27));
            p91Var.m0.addView(p91Var.f40144n0[i11]);
            p91Var.m0.i(bVar, true, false);
            i11++;
        }
        p91Var.f40139i0 = new ei.h1(p91Var, p91Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            p91Var.f40140j0 = new cc(p91Var, -j10, p91Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = p91Var.getParentActivity();
            int i12 = p91Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z14 = true;
            } else {
                z14 = false;
            }
            frameLayout = frameLayout2;
            ie ieVar = new ie(parentActivity, this, i12, j11, resourceProvider, z14, chatFull.can_view_stars_revenue);
            p91Var = this;
            p91Var.f40141k0 = ieVar;
            ieVar.setActionBar(p91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z15 = z10;
        FrameLayout frameLayout3 = frameLayout;
        p91Var.f40139i0.setAdapter(new p81(p91Var, z15, isBoostSupported, z11, frameLayout3));
        boolean z16 = p91Var.f40142l0;
        if (isBoostSupported && !z16) {
            z12 = true;
        } else {
            z12 = false;
        }
        p91Var.f40131c = z12;
        if (z12 && p91Var.f40133d0) {
            p91Var.f40139i0.setPosition(z15 ? 1 : 0);
        } else if (z12 && p91Var.f40134e0) {
            ei.h1 h1Var = p91Var.f40139i0;
            if (!z16 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            h1Var.setPosition((z15 ? 1 : 0) + i10);
        }
        p91Var.m0(p91Var.f40139i0.getCurrentPosition(), false);
        y8 y8Var = new y8(p91Var, p91Var.getParentActivity(), 8);
        p91Var.actionBar.setDrawBlurBackground(y8Var);
        y8Var.setBackgroundColor(p91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7));
        ih.j jVar = new ih.j(y8Var);
        bh.b bVar2 = p91Var.F0;
        bVar2.f4358f = jVar;
        bVar2.f4359g = y8Var;
        y8Var.addView(p91Var.f40139i0, w7.z5.g());
        y8Var.addView(p91Var.actionBar);
        if (p91Var.f40131c) {
            y8Var.addView(p91Var.m0, w7.z5.e(344, 72, 81));
            p91Var.setBulletinDelegate(new ei.o8(12));
        }
        p91Var.fragmentView = y8Var;
        q81 q81Var = new q81(p91Var, context);
        p91Var.S = q81Var;
        q81Var.setSections(true);
        p91Var.S.setClipToPadding(false);
        q81 q81Var2 = p91Var.S;
        Objects.requireNonNull(q81Var2);
        p91Var.T = new bh.l(q81Var2, y8Var, new ks(q81Var2, 1));
        cc ccVar = p91Var.f40140j0;
        if (ccVar != null) {
            org.telegram.ui.Components.jm0 jm0Var = ccVar.F;
            Objects.requireNonNull(jm0Var);
            ccVar.G = new bh.l(jm0Var, y8Var, new ks(jm0Var, 0));
            p91Var.f40140j0.F.j(new o81(p91Var, 1));
        }
        ie ieVar2 = p91Var.f40141k0;
        if (ieVar2 != null) {
            org.telegram.ui.Components.c71 c71Var = ieVar2.f37930a1;
            Objects.requireNonNull(c71Var);
            ieVar2.f37931b1 = new bh.l(c71Var, y8Var, new x8(c71Var, 0));
            p91Var.f40141k0.f37930a1.j(new o81(p91Var, 2));
        }
        p91Var.G0 = new m81(p91Var, y8Var);
        p91Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        p91Var.f40130b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        p91Var.W = imageView;
        imageView.setAutoRepeat(true);
        p91Var.W.f(R.raw.statistic_preload, 120, 120, null);
        p91Var.W.d();
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
        org.telegram.messenger.mk.m(R.string.LoadingStatsDescription, textView2, 1);
        p91Var.f40130b0.addView(p91Var.W, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        p91Var.f40130b0.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        p91Var.f40130b0.addView(textView2, w7.z5.q(-2, -2, 1));
        frameLayout3.addView(p91Var.f40130b0, w7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (p91Var.X == null) {
            p91Var.X = new u81(p91Var);
        }
        p91Var.S.setAdapter(p91Var.X);
        s4.b0 b0Var = new s4.b0();
        p91Var.U = b0Var;
        p91Var.S.setLayoutManager(b0Var);
        p91Var.Y = new s4.k();
        p91Var.S.setItemAnimator(null);
        p91Var.S.j(new o81(p91Var, 0));
        p91Var.S.setOnItemClickListener(new f11(p91Var, 7));
        p91Var.S.setOnItemLongClickListener(new pp0(p91Var, 17));
        frameLayout3.addView(p91Var.S);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        p91Var.R = ooVar;
        if (AndroidUtilities.isTablet() && ((d5Var = p91Var.parentLayout) == null || !((ActionBarLayout) d5Var).f20549b)) {
            z13 = false;
        } else {
            z13 = true;
        }
        ooVar.setOccupyStatusBar(z13);
        p91Var.R.getAvatarImageView().setScaleX(0.9f);
        p91Var.R.getAvatarImageView().setScaleY(0.9f);
        p91Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = p91Var.actionBar;
        org.telegram.ui.Components.oo ooVar2 = p91Var.R;
        if (!p91Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(ooVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = p91Var.getMessagesController().getChat(Long.valueOf(j10));
        p91Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.oo ooVar3 = p91Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        ooVar3.setTitle(str);
        org.telegram.ui.Components.oo ooVar4 = p91Var.R;
        if (ooVar4.getSubtitleTextView() != null) {
            ooVar4.getSubtitleTextView().setVisibility(8);
        }
        i2.e.y(false, p91Var.actionBar);
        p91Var.actionBar.setActionBarMenuOnItemClick(new y21(p91Var, 5));
        p91Var.R.i(org.telegram.ui.ActionBar.h6.x0(null, i13, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        p91Var.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i13, false), false);
        p91Var.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i13, false), true);
        p91Var.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21397z8, false), false);
        p91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        boolean z17 = p91Var.f40158x0;
        a6 a6Var = p91Var.B0;
        if (z17) {
            p91Var.f40130b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(a6Var, 500L);
            p91Var.f40130b0.setVisibility(0);
            p91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            p91Var.f40130b0.setVisibility(8);
            p91Var.S.setVisibility(0);
        }
        dh.d c10 = bVar2.c(p91Var.m0, fh.c.f(p91Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        p91Var.m0.setBackground(c10);
        p91Var.c0();
        p91Var.f40160y0 = new c91(p91Var.X, p91Var.U);
        return p91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        org.telegram.ui.ActionBar.n2 n2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ci.a7) objArr[0]) == this.f40161z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f40160y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (n2Var instanceof io) {
                    ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    n2Var2 = (org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack2);
                } else {
                    n2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        n2Var3 = (org.telegram.ui.ActionBar.n2) r4.c.f(3, fragmentStack2);
                    }
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
                    }
                    finishFragment();
                    if (n2Var3 instanceof qn) {
                        ug.i.f(n2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    ug.i.f(n2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f40149r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f40146p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((m91) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((m91) arrayList.get(i14));
                        } else {
                            ((m91) arrayList.get(i14)).f39162b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f40151s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    m91 m91Var = (m91) arrayList.get(i12);
                    if (m91Var.f39162b == null) {
                        this.f40145o0 = m91Var.b();
                        break;
                    } else {
                        arrayList4.add(m91Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f40160y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20277id == this.f40129b && this.f40127a == null) {
                this.f40127a = chatFull;
                i0();
            }
        }
    }

    public final void g0(b91[] b91VarArr) {
        u81 u81Var = this.X;
        if (u81Var != null) {
            u81Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f40158x0 = false;
        LinearLayout linearLayout = this.f40130b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f40130b0.animate().alpha(0.0f).setDuration(230L).setListener(new zb0(this, 26));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (b91 b91Var : b91VarArr) {
                if (b91Var != null && b91Var.d == null && b91Var.f35544f != null) {
                    b91Var.a(this.currentAccount, this.classGuid, this.f40127a.stats_dc, new oh(2, this, b91Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.j5 j5Var;
        b91 b91Var;
        b91 b91Var2;
        zx0 zx0Var = new zx0(4, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20932a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.b8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{lg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.f21061h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.f20990d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.f21395z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.f21397z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.f20952b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.f21360x6));
        int i13 = org.telegram.ui.ActionBar.h6.f21211p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, i13));
        org.telegram.ui.Components.oo ooVar = this.R;
        if (ooVar != null) {
            j5Var = ooVar.getTitleTextView();
        } else {
            j5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(j5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        org.telegram.ui.Components.oo ooVar2 = this.R;
        if (ooVar2 != null) {
            view2 = ooVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21153m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21306u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21323v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f40132c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    b91Var2 = this.d;
                } else if (i14 == 1) {
                    b91Var2 = this.H;
                } else if (i14 == 2) {
                    b91Var2 = this.I;
                } else if (i14 == 3) {
                    b91Var2 = this.J;
                } else if (i14 == 4) {
                    b91Var2 = this.K;
                } else {
                    b91Var2 = this.L;
                }
                k0(b91Var2, arrayList, zx0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    b91Var = this.d;
                } else if (i15 == 1) {
                    b91Var = this.h;
                } else if (i15 == 2) {
                    b91Var = this.f40143n;
                } else if (i15 == 3) {
                    b91Var = this.f40148r;
                } else if (i15 == 4) {
                    b91Var = this.f40150s;
                } else if (i15 == 5) {
                    b91Var = this.v;
                } else if (i15 == 6) {
                    b91Var = this.f40157x;
                } else if (i15 == 7) {
                    b91Var = this.e;
                } else if (i15 == 8) {
                    b91Var = this.f40155w;
                } else if (i15 == 9) {
                    b91Var = this.f40159y;
                } else if (i15 == 10) {
                    b91Var = this.E;
                } else {
                    b91Var = this.F;
                }
                k0(b91Var, arrayList, zx0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f20314id = new ArrayList<>();
        ArrayList arrayList = this.f40149r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f40146p0.get(this.f40145o0); i11 < size; i11++) {
            if (((m91) arrayList.get(i11)).f39162b == null) {
                tL_channels_getMessages.f20314id.add(Integer.valueOf(((m91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f40129b);
        this.f40156w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new l81(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f40142l0) {
            return;
        }
        boolean z10 = this.f40132c0;
        long j10 = this.f40129b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new l81(this, 1), null, null, 0, this.f40127a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false)) <= 0.699999988079071d) {
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
        ei.h1 h1Var = this.f40139i0;
        if (h1Var != null && (h1Var.f25862b != 0 || h1Var.f25863c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f40153u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f40152t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            m91 m91Var = (m91) obj;
            MessageObject f7 = this.f40161z0.f(m91Var.b());
            if (f7 != null) {
                m91Var.f39162b = f7;
                arrayList.add(m91Var);
            }
        }
        this.f40147q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.f40144n0;
            if (i11 < bVarArr.length) {
                ph.b bVar = bVarArr[i11];
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
        for (int i10 = 0; i10 < this.f40144n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            ph.b bVar = this.f40144n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f40154v0;
        arrayList.clear();
        arrayList.addAll(this.f40151s0);
        arrayList.addAll(this.f40153u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ci.i7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f40129b;
        ci.a7 A = storiesController.A(-j10, 2, -1, true);
        this.f40161z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f40127a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.f40138h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ci.a7 a7Var = this.f40161z0;
        if (a7Var != null) {
            a7Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
